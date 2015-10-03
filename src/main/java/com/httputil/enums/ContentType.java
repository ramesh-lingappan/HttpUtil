package com.httputil.enums;

/**
 * HttpUtil
 * Created by Ramesh on 10/3/15.
 */
public enum ContentType {

    /**
     * Application json content type.
     */
    APPLICATION_JSON("application/json"), /**
     * Application form urlencoded content type.
     */
    APPLICATION_FORM_URLENCODED("application/x-www-form-urlencoded");

    /**
     * The Value.
     */
    final String value;

    /**
     * Instantiates a new Content type.
     *
     * @param value the value
     */
    ContentType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
