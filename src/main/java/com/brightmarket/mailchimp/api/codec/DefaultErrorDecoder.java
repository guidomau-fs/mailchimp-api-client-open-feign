package com.brightmarket.mailchimp.api.codec;

import com.brightmarket.mailchimp.api.model.error.CustomException;
import com.brightmarket.mailchimp.api.model.error.Error;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class DefaultErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {

        try {

            String text = new BufferedReader(new InputStreamReader(response.body().asInputStream(), StandardCharsets.UTF_8))
                    .lines().collect(Collectors.joining("\n"));

            ObjectMapper objectMapper = new ObjectMapper();
            Error error = objectMapper.readValue(text, Error.class);
            return new CustomException(error);

        } catch (IOException e) {
            return e;
        }
    }
}
