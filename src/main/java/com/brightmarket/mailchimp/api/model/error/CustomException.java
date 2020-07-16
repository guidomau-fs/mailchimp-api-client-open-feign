package com.brightmarket.mailchimp.api.model.error;

public class CustomException extends RuntimeException {

    private Error error;

    public CustomException(Error error) {
        super();
        this.error = error;
    }

    public CustomException(String message, Error error) {
        super(message);
        this.error = error;
    }

    public CustomException(String message, Throwable cause, Error error) {
        super(message, cause);
        this.error = error;
    }

    public Error getError() {
        return error;
    }

    public void setError(Error error) {
        this.error = error;
    }
}
