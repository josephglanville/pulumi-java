// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.apigateway_v1.outputs.ApigatewayApiConfigFileResponse;
import java.util.Objects;

@CustomType
public final class ApigatewayApiConfigOpenApiDocumentResponse {
    /**
     * The OpenAPI Specification document file.
     * 
     */
    private final ApigatewayApiConfigFileResponse document;

    @CustomType.Constructor
    private ApigatewayApiConfigOpenApiDocumentResponse(@CustomType.Parameter("document") ApigatewayApiConfigFileResponse document) {
        this.document = document;
    }

    /**
     * The OpenAPI Specification document file.
     * 
    */
    public ApigatewayApiConfigFileResponse getDocument() {
        return this.document;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApigatewayApiConfigOpenApiDocumentResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApigatewayApiConfigFileResponse document;

        public Builder() {
    	      // Empty
        }

        public Builder(ApigatewayApiConfigOpenApiDocumentResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.document = defaults.document;
        }

        public Builder document(ApigatewayApiConfigFileResponse document) {
            this.document = Objects.requireNonNull(document);
            return this;
        }        public ApigatewayApiConfigOpenApiDocumentResponse build() {
            return new ApigatewayApiConfigOpenApiDocumentResponse(document);
        }
    }
}
