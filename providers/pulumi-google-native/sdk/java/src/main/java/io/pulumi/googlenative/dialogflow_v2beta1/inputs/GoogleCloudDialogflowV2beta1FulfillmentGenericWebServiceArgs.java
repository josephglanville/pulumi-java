// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents configuration for a generic web service. Dialogflow supports two mechanisms for authentications: - Basic authentication with username and password. - Authentication with additional authentication headers. More information could be found at: https://cloud.google.com/dialogflow/docs/fulfillment-configure.
 * 
 */
public final class GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs Empty = new GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs();

    /**
     * Optional. Indicates if generic web service is created through Cloud Functions integration. Defaults to false. is_cloud_function is deprecated. Cloud functions can be configured by its uri as a regular web service now.
     * 
     */
    @Import(name="isCloudFunction")
      private final @Nullable Output<Boolean> isCloudFunction;

    public Output<Boolean> getIsCloudFunction() {
        return this.isCloudFunction == null ? Output.empty() : this.isCloudFunction;
    }

    /**
     * The password for HTTP Basic authentication.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    /**
     * The HTTP request headers to send together with fulfillment requests.
     * 
     */
    @Import(name="requestHeaders")
      private final @Nullable Output<Map<String,String>> requestHeaders;

    public Output<Map<String,String>> getRequestHeaders() {
        return this.requestHeaders == null ? Output.empty() : this.requestHeaders;
    }

    /**
     * The fulfillment URI for receiving POST requests. It must use https protocol.
     * 
     */
    @Import(name="uri", required=true)
      private final Output<String> uri;

    public Output<String> getUri() {
        return this.uri;
    }

    /**
     * The user name for HTTP Basic authentication.
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> getUsername() {
        return this.username == null ? Output.empty() : this.username;
    }

    public GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs(
        @Nullable Output<Boolean> isCloudFunction,
        @Nullable Output<String> password,
        @Nullable Output<Map<String,String>> requestHeaders,
        Output<String> uri,
        @Nullable Output<String> username) {
        this.isCloudFunction = isCloudFunction;
        this.password = password;
        this.requestHeaders = requestHeaders;
        this.uri = Objects.requireNonNull(uri, "expected parameter 'uri' to be non-null");
        this.username = username;
    }

    private GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs() {
        this.isCloudFunction = Output.empty();
        this.password = Output.empty();
        this.requestHeaders = Output.empty();
        this.uri = Output.empty();
        this.username = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> isCloudFunction;
        private @Nullable Output<String> password;
        private @Nullable Output<Map<String,String>> requestHeaders;
        private Output<String> uri;
        private @Nullable Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isCloudFunction = defaults.isCloudFunction;
    	      this.password = defaults.password;
    	      this.requestHeaders = defaults.requestHeaders;
    	      this.uri = defaults.uri;
    	      this.username = defaults.username;
        }

        public Builder isCloudFunction(@Nullable Output<Boolean> isCloudFunction) {
            this.isCloudFunction = isCloudFunction;
            return this;
        }
        public Builder isCloudFunction(@Nullable Boolean isCloudFunction) {
            this.isCloudFunction = Output.ofNullable(isCloudFunction);
            return this;
        }
        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Output.ofNullable(password);
            return this;
        }
        public Builder requestHeaders(@Nullable Output<Map<String,String>> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        public Builder requestHeaders(@Nullable Map<String,String> requestHeaders) {
            this.requestHeaders = Output.ofNullable(requestHeaders);
            return this;
        }
        public Builder uri(Output<String> uri) {
            this.uri = Objects.requireNonNull(uri);
            return this;
        }
        public Builder uri(String uri) {
            this.uri = Output.of(Objects.requireNonNull(uri));
            return this;
        }
        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = Output.ofNullable(username);
            return this;
        }        public GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs build() {
            return new GoogleCloudDialogflowV2beta1FulfillmentGenericWebServiceArgs(isCloudFunction, password, requestHeaders, uri, username);
        }
    }
}
