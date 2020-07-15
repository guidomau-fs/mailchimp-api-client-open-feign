package sample.github;

import feign.Feign;
import feign.Logger.Level;
import feign.Retryer;
import feign.codec.ErrorDecoder;
import feign.http2client.Http2Client;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.micrometer.MicrometerCapability;
import feign.slf4j.Slf4jLogger;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        GitHub github = Feign.builder()
                .client(new Http2Client())                  // Under the hood http client
                .encoder(new JacksonEncoder())              // Under the hood JSON Encoder
                .decoder(new JacksonDecoder())              // Under the hood JSON Decoder
                .errorDecoder(new ErrorDecoder.Default())   // Custom JSON Decoder Error Handling
                .retryer(new Retryer.Default())             // Custom Retry logic
                .addCapability(new MicrometerCapability())  // Metrics data collection
                .logger(new Slf4jLogger())                  // Define Slf4j as a default logger
                .logLevel(Level.FULL)
                .target(GitHub.class, "https://api.github.com");

        // Fetch and print a list of the contributors to this library.
        List<Contributor> contributors = github.contributors("OpenFeign", "feign");
        for (Contributor contributor : contributors) {
            System.out.println(contributor.getLogin() + " (" + contributor.getContributions() + ")");
        }
    }
}
