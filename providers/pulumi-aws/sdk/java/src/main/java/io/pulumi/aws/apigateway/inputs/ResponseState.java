// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResponseState extends io.pulumi.resources.ResourceArgs {

    public static final ResponseState Empty = new ResponseState();

    /**
     * A map specifying the parameters (paths, query strings and headers) of the Gateway Response.
     * 
     */
    @Import(name="responseParameters")
      private final @Nullable Output<Map<String,String>> responseParameters;

    public Output<Map<String,String>> getResponseParameters() {
        return this.responseParameters == null ? Output.empty() : this.responseParameters;
    }

    /**
     * A map specifying the templates used to transform the response body.
     * 
     */
    @Import(name="responseTemplates")
      private final @Nullable Output<Map<String,String>> responseTemplates;

    public Output<Map<String,String>> getResponseTemplates() {
        return this.responseTemplates == null ? Output.empty() : this.responseTemplates;
    }

    /**
     * The response type of the associated GatewayResponse.
     * 
     */
    @Import(name="responseType")
      private final @Nullable Output<String> responseType;

    public Output<String> getResponseType() {
        return this.responseType == null ? Output.empty() : this.responseType;
    }

    /**
     * The string identifier of the associated REST API.
     * 
     */
    @Import(name="restApiId")
      private final @Nullable Output<String> restApiId;

    public Output<String> getRestApiId() {
        return this.restApiId == null ? Output.empty() : this.restApiId;
    }

    /**
     * The HTTP status code of the Gateway Response.
     * 
     */
    @Import(name="statusCode")
      private final @Nullable Output<String> statusCode;

    public Output<String> getStatusCode() {
        return this.statusCode == null ? Output.empty() : this.statusCode;
    }

    public ResponseState(
        @Nullable Output<Map<String,String>> responseParameters,
        @Nullable Output<Map<String,String>> responseTemplates,
        @Nullable Output<String> responseType,
        @Nullable Output<String> restApiId,
        @Nullable Output<String> statusCode) {
        this.responseParameters = responseParameters;
        this.responseTemplates = responseTemplates;
        this.responseType = responseType;
        this.restApiId = restApiId;
        this.statusCode = statusCode;
    }

    private ResponseState() {
        this.responseParameters = Output.empty();
        this.responseTemplates = Output.empty();
        this.responseType = Output.empty();
        this.restApiId = Output.empty();
        this.statusCode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> responseParameters;
        private @Nullable Output<Map<String,String>> responseTemplates;
        private @Nullable Output<String> responseType;
        private @Nullable Output<String> restApiId;
        private @Nullable Output<String> statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.responseParameters = defaults.responseParameters;
    	      this.responseTemplates = defaults.responseTemplates;
    	      this.responseType = defaults.responseType;
    	      this.restApiId = defaults.restApiId;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder responseParameters(@Nullable Output<Map<String,String>> responseParameters) {
            this.responseParameters = responseParameters;
            return this;
        }
        public Builder responseParameters(@Nullable Map<String,String> responseParameters) {
            this.responseParameters = Output.ofNullable(responseParameters);
            return this;
        }
        public Builder responseTemplates(@Nullable Output<Map<String,String>> responseTemplates) {
            this.responseTemplates = responseTemplates;
            return this;
        }
        public Builder responseTemplates(@Nullable Map<String,String> responseTemplates) {
            this.responseTemplates = Output.ofNullable(responseTemplates);
            return this;
        }
        public Builder responseType(@Nullable Output<String> responseType) {
            this.responseType = responseType;
            return this;
        }
        public Builder responseType(@Nullable String responseType) {
            this.responseType = Output.ofNullable(responseType);
            return this;
        }
        public Builder restApiId(@Nullable Output<String> restApiId) {
            this.restApiId = restApiId;
            return this;
        }
        public Builder restApiId(@Nullable String restApiId) {
            this.restApiId = Output.ofNullable(restApiId);
            return this;
        }
        public Builder statusCode(@Nullable Output<String> statusCode) {
            this.statusCode = statusCode;
            return this;
        }
        public Builder statusCode(@Nullable String statusCode) {
            this.statusCode = Output.ofNullable(statusCode);
            return this;
        }        public ResponseState build() {
            return new ResponseState(responseParameters, responseTemplates, responseType, restApiId, statusCode);
        }
    }
}