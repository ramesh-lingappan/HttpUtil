package com.httputil.model;

import com.httputil.enums.ContentType;
import lombok.Data;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Ramesh on 9/10/15.
 */
@Data
public class HttpRequest {

    private URL url;

    private byte[] payload;

    private HttpMethod method;

    private String contentType;

    private Map<String, String> headers;

    private int connectionTimeOut;

    /**
     * Instantiates a new Http request.
     *
     * @param url    the url
     * @param method the method
     * @throws MalformedURLException the malformed uRL exception
     */
    public HttpRequest(String url, HttpMethod method) throws MalformedURLException {
        this.setUrl(url);
        this.method = method;
    }


    /**
     * Sets url.
     *
     * @param url the url
     * @throws MalformedURLException the malformed uRL exception
     */
    public void setUrl(String url) throws MalformedURLException {
        this.url = new URL(url);
    }

    /**
     * Set url.
     *
     * @param url the url
     */
    public void setUrl(URL url){
        this.url = url;
    }


    /**
     * Set content type.
     *
     * @param type the type
     */
    public void setContentType(ContentType type){
        this.contentType = type != null ? type.toString() : null;
    }

    /**
     * Set content type.
     *
     * @param type the type
     */
    public void setContentType(String type){
        this.contentType  = type;
    }

    /**
     * Add header.
     *
     * @param key   the key
     * @param value the value
     */
    public void addHeader(String key, String value){

        if (this.headers == null)
            this.headers = new HashMap<>();

        this.headers.put(key, value);
    }

    /**
     * Get header value.
     *
     * @param key the key
     * @return the string
     */
    public String getHeaderValue(String key){

        return this.headers == null ? null : this.headers.get(key);
    }
}
