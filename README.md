# HttpUtil
Helpful HTTP fetcher utility service 

## How to Download ?

- currently you can manually download the jar file here [Download Jar File](https://github.com/ramesh-dev/HttpUtil/tree/master/release)
- will update to maven central repo soon!

## Examples 

##### Make GET request

```Java
HttpResponse response = UrlFetcher.makeGetRequest("https://url.com")

if (httpResponse.getStatusCode() == 200) {
    // do something with response content httpResponse.getResponseContent()
}
```

##### Make POST request

```Java
HttpRequest httpRequest = new HttpRequest("Url", HttpMethod.POST);
httpRequest.setContentType(ContentType.APPLIACTION_JSON);
httpRequest.setPayload(payload.getBytes("UTF-8"));

// add header if you want
httpRequest.addHeader("key1","value1");
httpRequest.addHeader("key2","value2");

HttpResponse httpResponse = UrlFetcher.makeRequest(httpRequest);
if (httpResponse.getStatusCode() == 200) {
    // do something with response content httpResponse.getResponseContent()
}
```
