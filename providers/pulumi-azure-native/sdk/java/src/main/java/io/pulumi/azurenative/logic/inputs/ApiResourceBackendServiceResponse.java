// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The API backend service.
 * 
 */
public final class ApiResourceBackendServiceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApiResourceBackendServiceResponse Empty = new ApiResourceBackendServiceResponse();

    /**
     * The service URL.
     * 
     */
    @InputImport(name="serviceUrl")
      private final @Nullable String serviceUrl;

    public Optional<String> getServiceUrl() {
        return this.serviceUrl == null ? Optional.empty() : Optional.ofNullable(this.serviceUrl);
    }

    public ApiResourceBackendServiceResponse(@Nullable String serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    private ApiResourceBackendServiceResponse() {
        this.serviceUrl = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiResourceBackendServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String serviceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiResourceBackendServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceUrl = defaults.serviceUrl;
        }

        public Builder setServiceUrl(@Nullable String serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }
        public ApiResourceBackendServiceResponse build() {
            return new ApiResourceBackendServiceResponse(serviceUrl);
        }
    }
}
