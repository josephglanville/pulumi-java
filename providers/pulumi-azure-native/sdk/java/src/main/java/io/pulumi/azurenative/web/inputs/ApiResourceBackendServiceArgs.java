// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The API backend service
 * 
 */
public final class ApiResourceBackendServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiResourceBackendServiceArgs Empty = new ApiResourceBackendServiceArgs();

    /**
     * The service URL
     * 
     */
    @InputImport(name="serviceUrl")
      private final @Nullable Output<String> serviceUrl;

    public Output<String> getServiceUrl() {
        return this.serviceUrl == null ? Output.empty() : this.serviceUrl;
    }

    public ApiResourceBackendServiceArgs(@Nullable Output<String> serviceUrl) {
        this.serviceUrl = serviceUrl;
    }

    private ApiResourceBackendServiceArgs() {
        this.serviceUrl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiResourceBackendServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> serviceUrl;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiResourceBackendServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serviceUrl = defaults.serviceUrl;
        }

        public Builder serviceUrl(@Nullable Output<String> serviceUrl) {
            this.serviceUrl = serviceUrl;
            return this;
        }

        public Builder serviceUrl(@Nullable String serviceUrl) {
            this.serviceUrl = Output.ofNullable(serviceUrl);
            return this;
        }
        public ApiResourceBackendServiceArgs build() {
            return new ApiResourceBackendServiceArgs(serviceUrl);
        }
    }
}
