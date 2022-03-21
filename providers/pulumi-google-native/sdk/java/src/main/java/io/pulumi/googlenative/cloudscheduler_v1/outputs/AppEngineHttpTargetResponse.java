// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudscheduler_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.cloudscheduler_v1.outputs.AppEngineRoutingResponse;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class AppEngineHttpTargetResponse {
    /**
     * App Engine Routing setting for the job.
     * 
     */
    private final AppEngineRoutingResponse appEngineRouting;
    /**
     * Body. HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It will result in invalid argument error to set a body on a job with an incompatible HttpMethod.
     * 
     */
    private final String body;
    /**
     * HTTP request headers. This map contains the header field names and values. Headers can be set when the job is created. Cloud Scheduler sets some headers to default values: * `User-Agent`: By default, this header is `"AppEngine-Google; (+http://code.google.com/appengine)"`. This header can be modified, but Cloud Scheduler will append `"AppEngine-Google; (+http://code.google.com/appengine)"` to the modified `User-Agent`. * `X-CloudScheduler`: This header will be set to true. * `X-CloudScheduler-JobName`: This header will contain the job name. * `X-CloudScheduler-ScheduleTime`: For Cloud Scheduler jobs specified in the unix-cron format, this header will contain the job schedule time in RFC3339 UTC "Zulu" format. If the job has an body, Cloud Scheduler sets the following headers: * `Content-Type`: By default, the `Content-Type` header is set to `"application/octet-stream"`. The default can be overridden by explictly setting `Content-Type` to a particular media type when the job is created. For example, `Content-Type` can be set to `"application/json"`. * `Content-Length`: This is computed by Cloud Scheduler. This value is output only. It cannot be changed. The headers below are output only. They cannot be set or overridden: * `X-Google-*`: For Google internal use only. * `X-AppEngine-*`: For Google internal use only. In addition, some App Engine headers, which contain job-specific information, are also be sent to the job handler.
     * 
     */
    private final Map<String,String> headers;
    /**
     * The HTTP method to use for the request. PATCH and OPTIONS are not permitted.
     * 
     */
    private final String httpMethod;
    /**
     * The relative URI. The relative URL must begin with "/" and must be a valid HTTP relative URL. It can contain a path, query string arguments, and `#` fragments. If the relative URL is empty, then the root path "/" will be used. No spaces are allowed, and the maximum length allowed is 2083 characters.
     * 
     */
    private final String relativeUri;

    @CustomType.Constructor
    private AppEngineHttpTargetResponse(
        @CustomType.Parameter("appEngineRouting") AppEngineRoutingResponse appEngineRouting,
        @CustomType.Parameter("body") String body,
        @CustomType.Parameter("headers") Map<String,String> headers,
        @CustomType.Parameter("httpMethod") String httpMethod,
        @CustomType.Parameter("relativeUri") String relativeUri) {
        this.appEngineRouting = appEngineRouting;
        this.body = body;
        this.headers = headers;
        this.httpMethod = httpMethod;
        this.relativeUri = relativeUri;
    }

    /**
     * App Engine Routing setting for the job.
     * 
    */
    public AppEngineRoutingResponse getAppEngineRouting() {
        return this.appEngineRouting;
    }
    /**
     * Body. HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It will result in invalid argument error to set a body on a job with an incompatible HttpMethod.
     * 
    */
    public String getBody() {
        return this.body;
    }
    /**
     * HTTP request headers. This map contains the header field names and values. Headers can be set when the job is created. Cloud Scheduler sets some headers to default values: * `User-Agent`: By default, this header is `"AppEngine-Google; (+http://code.google.com/appengine)"`. This header can be modified, but Cloud Scheduler will append `"AppEngine-Google; (+http://code.google.com/appengine)"` to the modified `User-Agent`. * `X-CloudScheduler`: This header will be set to true. * `X-CloudScheduler-JobName`: This header will contain the job name. * `X-CloudScheduler-ScheduleTime`: For Cloud Scheduler jobs specified in the unix-cron format, this header will contain the job schedule time in RFC3339 UTC "Zulu" format. If the job has an body, Cloud Scheduler sets the following headers: * `Content-Type`: By default, the `Content-Type` header is set to `"application/octet-stream"`. The default can be overridden by explictly setting `Content-Type` to a particular media type when the job is created. For example, `Content-Type` can be set to `"application/json"`. * `Content-Length`: This is computed by Cloud Scheduler. This value is output only. It cannot be changed. The headers below are output only. They cannot be set or overridden: * `X-Google-*`: For Google internal use only. * `X-AppEngine-*`: For Google internal use only. In addition, some App Engine headers, which contain job-specific information, are also be sent to the job handler.
     * 
    */
    public Map<String,String> getHeaders() {
        return this.headers;
    }
    /**
     * The HTTP method to use for the request. PATCH and OPTIONS are not permitted.
     * 
    */
    public String getHttpMethod() {
        return this.httpMethod;
    }
    /**
     * The relative URI. The relative URL must begin with "/" and must be a valid HTTP relative URL. It can contain a path, query string arguments, and `#` fragments. If the relative URL is empty, then the root path "/" will be used. No spaces are allowed, and the maximum length allowed is 2083 characters.
     * 
    */
    public String getRelativeUri() {
        return this.relativeUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEngineHttpTargetResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppEngineRoutingResponse appEngineRouting;
        private String body;
        private Map<String,String> headers;
        private String httpMethod;
        private String relativeUri;

        public Builder() {
    	      // Empty
        }

        public Builder(AppEngineHttpTargetResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineRouting = defaults.appEngineRouting;
    	      this.body = defaults.body;
    	      this.headers = defaults.headers;
    	      this.httpMethod = defaults.httpMethod;
    	      this.relativeUri = defaults.relativeUri;
        }

        public Builder appEngineRouting(AppEngineRoutingResponse appEngineRouting) {
            this.appEngineRouting = Objects.requireNonNull(appEngineRouting);
            return this;
        }
        public Builder body(String body) {
            this.body = Objects.requireNonNull(body);
            return this;
        }
        public Builder headers(Map<String,String> headers) {
            this.headers = Objects.requireNonNull(headers);
            return this;
        }
        public Builder httpMethod(String httpMethod) {
            this.httpMethod = Objects.requireNonNull(httpMethod);
            return this;
        }
        public Builder relativeUri(String relativeUri) {
            this.relativeUri = Objects.requireNonNull(relativeUri);
            return this;
        }        public AppEngineHttpTargetResponse build() {
            return new AppEngineHttpTargetResponse(appEngineRouting, body, headers, httpMethod, relativeUri);
        }
    }
}
