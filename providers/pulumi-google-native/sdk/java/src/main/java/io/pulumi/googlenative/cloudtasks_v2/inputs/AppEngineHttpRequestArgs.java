// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudtasks_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.cloudtasks_v2.enums.AppEngineHttpRequestHttpMethod;
import io.pulumi.googlenative.cloudtasks_v2.inputs.AppEngineRoutingArgs;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * App Engine HTTP request. The message defines the HTTP request that is sent to an App Engine app when the task is dispatched. Using AppEngineHttpRequest requires [`appengine.applications.get`](https://cloud.google.com/appengine/docs/admin-api/access-control) Google IAM permission for the project and the following scope: `https://www.googleapis.com/auth/cloud-platform` The task will be delivered to the App Engine app which belongs to the same project as the queue. For more information, see [How Requests are Routed](https://cloud.google.com/appengine/docs/standard/python/how-requests-are-routed) and how routing is affected by [dispatch files](https://cloud.google.com/appengine/docs/python/config/dispatchref). Traffic is encrypted during transport and never leaves Google datacenters. Because this traffic is carried over a communication mechanism internal to Google, you cannot explicitly set the protocol (for example, HTTP or HTTPS). The request to the handler, however, will appear to have used the HTTP protocol. The AppEngineRouting used to construct the URL that the task is delivered to can be set at the queue-level or task-level: * If app_engine_routing_override is set on the queue, this value is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing. The `url` that the task will be sent to is: * `url =` host `+` relative_uri Tasks can be dispatched to secure app handlers, unsecure app handlers, and URIs restricted with [`login: admin`](https://cloud.google.com/appengine/docs/standard/python/config/appref). Because tasks are not run as any user, they cannot be dispatched to URIs restricted with [`login: required`](https://cloud.google.com/appengine/docs/standard/python/config/appref) Task dispatches also do not follow redirects. The task attempt has succeeded if the app's request handler returns an HTTP response code in the range [`200` - `299`]. The task attempt has failed if the app's handler returns a non-2xx response code or Cloud Tasks does not receive response before the deadline. Failed tasks will be retried according to the retry configuration. `503` (Service Unavailable) is considered an App Engine system error instead of an application error and will cause Cloud Tasks' traffic congestion control to temporarily throttle the queue's dispatches. Unlike other types of task targets, a `429` (Too Many Requests) response from an app handler does not cause traffic congestion control to throttle the queue.
 * 
 */
public final class AppEngineHttpRequestArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppEngineHttpRequestArgs Empty = new AppEngineHttpRequestArgs();

    /**
     * Task-level setting for App Engine routing. * If app_engine_routing_override is set on the queue, this value is used for all tasks in the queue, no matter what the setting is for the task-level app_engine_routing.
     * 
     */
    @Import(name="appEngineRouting")
      private final @Nullable Output<AppEngineRoutingArgs> appEngineRouting;

    public Output<AppEngineRoutingArgs> getAppEngineRouting() {
        return this.appEngineRouting == null ? Codegen.empty() : this.appEngineRouting;
    }

    /**
     * HTTP request body. A request body is allowed only if the HTTP method is POST or PUT. It is an error to set a body on a task with an incompatible HttpMethod.
     * 
     */
    @Import(name="body")
      private final @Nullable Output<String> body;

    public Output<String> getBody() {
        return this.body == null ? Codegen.empty() : this.body;
    }

    /**
     * HTTP request headers. This map contains the header field names and values. Headers can be set when the task is created. Repeated headers are not supported but a header value can contain commas. Cloud Tasks sets some headers to default values: * `User-Agent`: By default, this header is `"AppEngine-Google; (+http://code.google.com/appengine)"`. This header can be modified, but Cloud Tasks will append `"AppEngine-Google; (+http://code.google.com/appengine)"` to the modified `User-Agent`. If the task has a body, Cloud Tasks sets the following headers: * `Content-Type`: By default, the `Content-Type` header is set to `"application/octet-stream"`. The default can be overridden by explicitly setting `Content-Type` to a particular media type when the task is created. For example, `Content-Type` can be set to `"application/json"`. * `Content-Length`: This is computed by Cloud Tasks. This value is output only. It cannot be changed. The headers below cannot be set or overridden: * `Host` * `X-Google-*` * `X-AppEngine-*` In addition, Cloud Tasks sets some headers when the task is dispatched, such as headers containing information about the task; see [request headers](https://cloud.google.com/tasks/docs/creating-appengine-handlers#reading_request_headers). These headers are set only when the task is dispatched, so they are not visible when the task is returned in a Cloud Tasks response. Although there is no specific limit for the maximum number of headers or the size, there is a limit on the maximum size of the Task. For more information, see the CreateTask documentation.
     * 
     */
    @Import(name="headers")
      private final @Nullable Output<Map<String,String>> headers;

    public Output<Map<String,String>> getHeaders() {
        return this.headers == null ? Codegen.empty() : this.headers;
    }

    /**
     * The HTTP method to use for the request. The default is POST. The app's request handler for the task's target URL must be able to handle HTTP requests with this http_method, otherwise the task attempt fails with error code 405 (Method Not Allowed). See [Writing a push task request handler](https://cloud.google.com/appengine/docs/java/taskqueue/push/creating-handlers#writing_a_push_task_request_handler) and the App Engine documentation for your runtime on [How Requests are Handled](https://cloud.google.com/appengine/docs/standard/python3/how-requests-are-handled).
     * 
     */
    @Import(name="httpMethod")
      private final @Nullable Output<AppEngineHttpRequestHttpMethod> httpMethod;

    public Output<AppEngineHttpRequestHttpMethod> getHttpMethod() {
        return this.httpMethod == null ? Codegen.empty() : this.httpMethod;
    }

    /**
     * The relative URI. The relative URI must begin with "/" and must be a valid HTTP relative URI. It can contain a path and query string arguments. If the relative URI is empty, then the root path "/" will be used. No spaces are allowed, and the maximum length allowed is 2083 characters.
     * 
     */
    @Import(name="relativeUri")
      private final @Nullable Output<String> relativeUri;

    public Output<String> getRelativeUri() {
        return this.relativeUri == null ? Codegen.empty() : this.relativeUri;
    }

    public AppEngineHttpRequestArgs(
        @Nullable Output<AppEngineRoutingArgs> appEngineRouting,
        @Nullable Output<String> body,
        @Nullable Output<Map<String,String>> headers,
        @Nullable Output<AppEngineHttpRequestHttpMethod> httpMethod,
        @Nullable Output<String> relativeUri) {
        this.appEngineRouting = appEngineRouting;
        this.body = body;
        this.headers = headers;
        this.httpMethod = httpMethod;
        this.relativeUri = relativeUri;
    }

    private AppEngineHttpRequestArgs() {
        this.appEngineRouting = Codegen.empty();
        this.body = Codegen.empty();
        this.headers = Codegen.empty();
        this.httpMethod = Codegen.empty();
        this.relativeUri = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppEngineHttpRequestArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AppEngineRoutingArgs> appEngineRouting;
        private @Nullable Output<String> body;
        private @Nullable Output<Map<String,String>> headers;
        private @Nullable Output<AppEngineHttpRequestHttpMethod> httpMethod;
        private @Nullable Output<String> relativeUri;

        public Builder() {
    	      // Empty
        }

        public Builder(AppEngineHttpRequestArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appEngineRouting = defaults.appEngineRouting;
    	      this.body = defaults.body;
    	      this.headers = defaults.headers;
    	      this.httpMethod = defaults.httpMethod;
    	      this.relativeUri = defaults.relativeUri;
        }

        public Builder appEngineRouting(@Nullable Output<AppEngineRoutingArgs> appEngineRouting) {
            this.appEngineRouting = appEngineRouting;
            return this;
        }
        public Builder appEngineRouting(@Nullable AppEngineRoutingArgs appEngineRouting) {
            this.appEngineRouting = Codegen.ofNullable(appEngineRouting);
            return this;
        }
        public Builder body(@Nullable Output<String> body) {
            this.body = body;
            return this;
        }
        public Builder body(@Nullable String body) {
            this.body = Codegen.ofNullable(body);
            return this;
        }
        public Builder headers(@Nullable Output<Map<String,String>> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(@Nullable Map<String,String> headers) {
            this.headers = Codegen.ofNullable(headers);
            return this;
        }
        public Builder httpMethod(@Nullable Output<AppEngineHttpRequestHttpMethod> httpMethod) {
            this.httpMethod = httpMethod;
            return this;
        }
        public Builder httpMethod(@Nullable AppEngineHttpRequestHttpMethod httpMethod) {
            this.httpMethod = Codegen.ofNullable(httpMethod);
            return this;
        }
        public Builder relativeUri(@Nullable Output<String> relativeUri) {
            this.relativeUri = relativeUri;
            return this;
        }
        public Builder relativeUri(@Nullable String relativeUri) {
            this.relativeUri = Codegen.ofNullable(relativeUri);
            return this;
        }        public AppEngineHttpRequestArgs build() {
            return new AppEngineHttpRequestArgs(appEngineRouting, body, headers, httpMethod, relativeUri);
        }
    }
}
