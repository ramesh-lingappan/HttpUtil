package com.httputil.model;

import lombok.Data;

import java.util.List;
import java.util.Map;

/**
 * Created by Ramesh on 9/10/15.
 */
@Data
public class HttpResponse {

    private int statusCode;

    private String responseContent;

    private Map<String, List<String>> headers;

}
