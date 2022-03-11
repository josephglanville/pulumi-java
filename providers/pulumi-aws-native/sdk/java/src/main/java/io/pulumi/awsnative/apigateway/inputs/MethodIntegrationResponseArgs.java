// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.apigateway.inputs;

import io.pulumi.awsnative.apigateway.enums.MethodIntegrationResponseContentHandling;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MethodIntegrationResponseArgs extends io.pulumi.resources.ResourceArgs {

    public static final MethodIntegrationResponseArgs Empty = new MethodIntegrationResponseArgs();

    /**
     * Specifies how to handle request payload content type conversions.
     * 
     */
    @InputImport(name="contentHandling")
      private final @Nullable Output<MethodIntegrationResponseContentHandling> contentHandling;

    public Output<MethodIntegrationResponseContentHandling> getContentHandling() {
        return this.contentHandling == null ? Output.empty() : this.contentHandling;
    }

    /**
     * The response parameters from the backend response that API Gateway sends to the method response.
     * 
     */
    @InputImport(name="responseParameters")
      private final @Nullable Output<Object> responseParameters;

    public Output<Object> getResponseParameters() {
        return this.responseParameters == null ? Output.empty() : this.responseParameters;
    }

    /**
     * The templates that are used to transform the integration response body. Specify templates as key-value pairs (string-to-string mappings), with a content type as the key and a template as the value.
     * 
     */
    @InputImport(name="responseTemplates")
      private final @Nullable Output<Object> responseTemplates;

    public Output<Object> getResponseTemplates() {
        return this.responseTemplates == null ? Output.empty() : this.responseTemplates;
    }

    /**
     * A regular expression that specifies which error strings or status codes from the backend map to the integration response.
     * 
     */
    @InputImport(name="selectionPattern")
      private final @Nullable Output<String> selectionPattern;

    public Output<String> getSelectionPattern() {
        return this.selectionPattern == null ? Output.empty() : this.selectionPattern;
    }

    /**
     * The status code that API Gateway uses to map the integration response to a MethodResponse status code.
     * 
     */
    @InputImport(name="statusCode", required=true)
      private final Output<String> statusCode;

    public Output<String> getStatusCode() {
        return this.statusCode;
    }

    public MethodIntegrationResponseArgs(
        @Nullable Output<MethodIntegrationResponseContentHandling> contentHandling,
        @Nullable Output<Object> responseParameters,
        @Nullable Output<Object> responseTemplates,
        @Nullable Output<String> selectionPattern,
        Output<String> statusCode) {
        this.contentHandling = contentHandling;
        this.responseParameters = responseParameters;
        this.responseTemplates = responseTemplates;
        this.selectionPattern = selectionPattern;
        this.statusCode = Objects.requireNonNull(statusCode, "expected parameter 'statusCode' to be non-null");
    }

    private MethodIntegrationResponseArgs() {
        this.contentHandling = Output.empty();
        this.responseParameters = Output.empty();
        this.responseTemplates = Output.empty();
        this.selectionPattern = Output.empty();
        this.statusCode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MethodIntegrationResponseArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<MethodIntegrationResponseContentHandling> contentHandling;
        private @Nullable Output<Object> responseParameters;
        private @Nullable Output<Object> responseTemplates;
        private @Nullable Output<String> selectionPattern;
        private Output<String> statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(MethodIntegrationResponseArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentHandling = defaults.contentHandling;
    	      this.responseParameters = defaults.responseParameters;
    	      this.responseTemplates = defaults.responseTemplates;
    	      this.selectionPattern = defaults.selectionPattern;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder contentHandling(@Nullable Output<MethodIntegrationResponseContentHandling> contentHandling) {
            this.contentHandling = contentHandling;
            return this;
        }

        public Builder contentHandling(@Nullable MethodIntegrationResponseContentHandling contentHandling) {
            this.contentHandling = Output.ofNullable(contentHandling);
            return this;
        }

        public Builder responseParameters(@Nullable Output<Object> responseParameters) {
            this.responseParameters = responseParameters;
            return this;
        }

        public Builder responseParameters(@Nullable Object responseParameters) {
            this.responseParameters = Output.ofNullable(responseParameters);
            return this;
        }

        public Builder responseTemplates(@Nullable Output<Object> responseTemplates) {
            this.responseTemplates = responseTemplates;
            return this;
        }

        public Builder responseTemplates(@Nullable Object responseTemplates) {
            this.responseTemplates = Output.ofNullable(responseTemplates);
            return this;
        }

        public Builder selectionPattern(@Nullable Output<String> selectionPattern) {
            this.selectionPattern = selectionPattern;
            return this;
        }

        public Builder selectionPattern(@Nullable String selectionPattern) {
            this.selectionPattern = Output.ofNullable(selectionPattern);
            return this;
        }

        public Builder statusCode(Output<String> statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }

        public Builder statusCode(String statusCode) {
            this.statusCode = Output.of(Objects.requireNonNull(statusCode));
            return this;
        }
        public MethodIntegrationResponseArgs build() {
            return new MethodIntegrationResponseArgs(contentHandling, responseParameters, responseTemplates, selectionPattern, statusCode);
        }
    }
}
