// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.WebHookActivityMethod;
import io.pulumi.azurenative.datafactory.inputs.ActivityDependencyArgs;
import io.pulumi.azurenative.datafactory.inputs.UserPropertyArgs;
import io.pulumi.azurenative.datafactory.inputs.WebActivityAuthenticationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * WebHook activity.
 * 
 */
public final class WebHookActivityArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebHookActivityArgs Empty = new WebHookActivityArgs();

    /**
     * Authentication method used for calling the endpoint.
     * 
     */
    @Import(name="authentication")
      private final @Nullable Output<WebActivityAuthenticationArgs> authentication;

    public Output<WebActivityAuthenticationArgs> getAuthentication() {
        return this.authentication == null ? Output.empty() : this.authentication;
    }

    /**
     * Represents the payload that will be sent to the endpoint. Required for POST/PUT method, not allowed for GET method Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="body")
      private final @Nullable Output<Object> body;

    public Output<Object> getBody() {
        return this.body == null ? Output.empty() : this.body;
    }

    /**
     * Activity depends on condition.
     * 
     */
    @Import(name="dependsOn")
      private final @Nullable Output<List<ActivityDependencyArgs>> dependsOn;

    public Output<List<ActivityDependencyArgs>> getDependsOn() {
        return this.dependsOn == null ? Output.empty() : this.dependsOn;
    }

    /**
     * Activity description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Represents the headers that will be sent to the request. For example, to set the language and type on a request: "headers" : { "Accept-Language": "en-us", "Content-Type": "application/json" }. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="headers")
      private final @Nullable Output<Object> headers;

    public Output<Object> getHeaders() {
        return this.headers == null ? Output.empty() : this.headers;
    }

    /**
     * Rest API method for target endpoint.
     * 
     */
    @Import(name="method", required=true)
      private final Output<Either<String,WebHookActivityMethod>> method;

    public Output<Either<String,WebHookActivityMethod>> getMethod() {
        return this.method;
    }

    /**
     * Activity name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * When set to true, statusCode, output and error in callback request body will be consumed by activity. The activity can be marked as failed by setting statusCode >= 400 in callback request. Default is false. Type: boolean (or Expression with resultType boolean).
     * 
     */
    @Import(name="reportStatusOnCallBack")
      private final @Nullable Output<Object> reportStatusOnCallBack;

    public Output<Object> getReportStatusOnCallBack() {
        return this.reportStatusOnCallBack == null ? Output.empty() : this.reportStatusOnCallBack;
    }

    /**
     * The timeout within which the webhook should be called back. If there is no value specified, it defaults to 10 minutes. Type: string. Pattern: ((\d+)\.)?(\d\d):(60|([0-5][0-9])):(60|([0-5][0-9])).
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<String> timeout;

    public Output<String> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    /**
     * Type of activity.
     * Expected value is 'WebHook'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * WebHook activity target endpoint and path. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="url", required=true)
      private final Output<Object> url;

    public Output<Object> getUrl() {
        return this.url;
    }

    /**
     * Activity user properties.
     * 
     */
    @Import(name="userProperties")
      private final @Nullable Output<List<UserPropertyArgs>> userProperties;

    public Output<List<UserPropertyArgs>> getUserProperties() {
        return this.userProperties == null ? Output.empty() : this.userProperties;
    }

    public WebHookActivityArgs(
        @Nullable Output<WebActivityAuthenticationArgs> authentication,
        @Nullable Output<Object> body,
        @Nullable Output<List<ActivityDependencyArgs>> dependsOn,
        @Nullable Output<String> description,
        @Nullable Output<Object> headers,
        Output<Either<String,WebHookActivityMethod>> method,
        Output<String> name,
        @Nullable Output<Object> reportStatusOnCallBack,
        @Nullable Output<String> timeout,
        Output<String> type,
        Output<Object> url,
        @Nullable Output<List<UserPropertyArgs>> userProperties) {
        this.authentication = authentication;
        this.body = body;
        this.dependsOn = dependsOn;
        this.description = description;
        this.headers = headers;
        this.method = Objects.requireNonNull(method, "expected parameter 'method' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.reportStatusOnCallBack = reportStatusOnCallBack;
        this.timeout = timeout;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.userProperties = userProperties;
    }

    private WebHookActivityArgs() {
        this.authentication = Output.empty();
        this.body = Output.empty();
        this.dependsOn = Output.empty();
        this.description = Output.empty();
        this.headers = Output.empty();
        this.method = Output.empty();
        this.name = Output.empty();
        this.reportStatusOnCallBack = Output.empty();
        this.timeout = Output.empty();
        this.type = Output.empty();
        this.url = Output.empty();
        this.userProperties = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebHookActivityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WebActivityAuthenticationArgs> authentication;
        private @Nullable Output<Object> body;
        private @Nullable Output<List<ActivityDependencyArgs>> dependsOn;
        private @Nullable Output<String> description;
        private @Nullable Output<Object> headers;
        private Output<Either<String,WebHookActivityMethod>> method;
        private Output<String> name;
        private @Nullable Output<Object> reportStatusOnCallBack;
        private @Nullable Output<String> timeout;
        private Output<String> type;
        private Output<Object> url;
        private @Nullable Output<List<UserPropertyArgs>> userProperties;

        public Builder() {
    	      // Empty
        }

        public Builder(WebHookActivityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authentication = defaults.authentication;
    	      this.body = defaults.body;
    	      this.dependsOn = defaults.dependsOn;
    	      this.description = defaults.description;
    	      this.headers = defaults.headers;
    	      this.method = defaults.method;
    	      this.name = defaults.name;
    	      this.reportStatusOnCallBack = defaults.reportStatusOnCallBack;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.userProperties = defaults.userProperties;
        }

        public Builder authentication(@Nullable Output<WebActivityAuthenticationArgs> authentication) {
            this.authentication = authentication;
            return this;
        }
        public Builder authentication(@Nullable WebActivityAuthenticationArgs authentication) {
            this.authentication = Output.ofNullable(authentication);
            return this;
        }
        public Builder body(@Nullable Output<Object> body) {
            this.body = body;
            return this;
        }
        public Builder body(@Nullable Object body) {
            this.body = Output.ofNullable(body);
            return this;
        }
        public Builder dependsOn(@Nullable Output<List<ActivityDependencyArgs>> dependsOn) {
            this.dependsOn = dependsOn;
            return this;
        }
        public Builder dependsOn(@Nullable List<ActivityDependencyArgs> dependsOn) {
            this.dependsOn = Output.ofNullable(dependsOn);
            return this;
        }
        public Builder dependsOn(ActivityDependencyArgs... dependsOn) {
            return dependsOn(List.of(dependsOn));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder headers(@Nullable Output<Object> headers) {
            this.headers = headers;
            return this;
        }
        public Builder headers(@Nullable Object headers) {
            this.headers = Output.ofNullable(headers);
            return this;
        }
        public Builder method(Output<Either<String,WebHookActivityMethod>> method) {
            this.method = Objects.requireNonNull(method);
            return this;
        }
        public Builder method(Either<String,WebHookActivityMethod> method) {
            this.method = Output.of(Objects.requireNonNull(method));
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder reportStatusOnCallBack(@Nullable Output<Object> reportStatusOnCallBack) {
            this.reportStatusOnCallBack = reportStatusOnCallBack;
            return this;
        }
        public Builder reportStatusOnCallBack(@Nullable Object reportStatusOnCallBack) {
            this.reportStatusOnCallBack = Output.ofNullable(reportStatusOnCallBack);
            return this;
        }
        public Builder timeout(@Nullable Output<String> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable String timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder url(Output<Object> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder url(Object url) {
            this.url = Output.of(Objects.requireNonNull(url));
            return this;
        }
        public Builder userProperties(@Nullable Output<List<UserPropertyArgs>> userProperties) {
            this.userProperties = userProperties;
            return this;
        }
        public Builder userProperties(@Nullable List<UserPropertyArgs> userProperties) {
            this.userProperties = Output.ofNullable(userProperties);
            return this;
        }
        public Builder userProperties(UserPropertyArgs... userProperties) {
            return userProperties(List.of(userProperties));
        }        public WebHookActivityArgs build() {
            return new WebHookActivityArgs(authentication, body, dependsOn, description, headers, method, name, reportStatusOnCallBack, timeout, type, url, userProperties);
        }
    }
}
