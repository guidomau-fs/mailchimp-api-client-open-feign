package com.brightmarket.mailchimp.api.factory;

import com.brightmarket.mailchimp.api.codec.MailChimpAPIErrorDecoder;
import com.brightmarket.mailchimp.api.stub.*;
import feign.Feign;
import feign.Logger.Level;
import feign.http2client.Http2Client;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.micrometer.MicrometerCapability;
import feign.slf4j.Slf4jLogger;

public class StubFactory {

    public static <T> T createStub(Class<T> clazz) {

        return Feign.builder()
                .client(new Http2Client())                  // Under the hood http client
                .encoder(new JacksonEncoder())              // Under the hood JSON Encoder
                .decoder(new JacksonDecoder())              // Under the hood JSON Decoder
                .errorDecoder(new MailChimpAPIErrorDecoder())    // Custom JSON Decoder Error Handling
                //.retryer(new Retryer.Default())           // Custom Retry logic
                .addCapability(new MicrometerCapability())  // Metrics data collection
                .logger(new Slf4jLogger())                  // Define Slf4j as a default logger
                .logLevel(Level.FULL)
                .target(clazz, "https://us10.api.mailchimp.com/3.0/");
    }
}
