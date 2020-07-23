package com.brightmarket.mailchimp.api.codec;

import com.brightmarket.mailchimp.api.exception.MailChimpAPIException;
import com.brightmarket.mailchimp.api.model.Error;
import com.fasterxml.jackson.databind.ObjectMapper;
import feign.Response;
import feign.codec.ErrorDecoder;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.stream.Collectors;

public class MailChimpAPIErrorDecoder implements ErrorDecoder {

    @Override
    public Exception decode(String methodKey, Response response) {

        try {

            String text = new BufferedReader(new InputStreamReader(response.body().asInputStream(), StandardCharsets.UTF_8))
                    .lines().collect(Collectors.joining("\n"));

            ObjectMapper objectMapper = new ObjectMapper();
            Error error = objectMapper.readValue(text, Error.class);
            return new MailChimpAPIException(error);

        } catch (IOException e) {
            return e;
        }
    }
}
