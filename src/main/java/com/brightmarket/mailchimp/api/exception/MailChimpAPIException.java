package com.brightmarket.mailchimp.api.exception;

import com.brightmarket.mailchimp.api.model.Error;

public class MailChimpAPIException extends RuntimeException {

    private Error error;

    public MailChimpAPIException(Error error) {
        super();
        this.error = error;
    }

    public MailChimpAPIException(String message, Error error) {
        super(message);
        this.error = error;
    }

    public MailChimpAPIException(String message, Throwable cause, Error error) {
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
