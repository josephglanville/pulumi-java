// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.apigateway.outputs.ApiConfigGatewayConfigBackendConfig;
import java.util.Objects;

@CustomType
public final class ApiConfigGatewayConfig {
    /**
     * Backend settings that are applied to all backends of the Gateway.
     * Structure is documented below.
     * 
     */
    private final ApiConfigGatewayConfigBackendConfig backendConfig;

    @CustomType.Constructor
    private ApiConfigGatewayConfig(@CustomType.Parameter("backendConfig") ApiConfigGatewayConfigBackendConfig backendConfig) {
        this.backendConfig = backendConfig;
    }

    /**
     * Backend settings that are applied to all backends of the Gateway.
     * Structure is documented below.
     * 
    */
    public ApiConfigGatewayConfigBackendConfig getBackendConfig() {
        return this.backendConfig;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConfigGatewayConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiConfigGatewayConfigBackendConfig backendConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConfigGatewayConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backendConfig = defaults.backendConfig;
        }

        public Builder backendConfig(ApiConfigGatewayConfigBackendConfig backendConfig) {
            this.backendConfig = Objects.requireNonNull(backendConfig);
            return this;
        }        public ApiConfigGatewayConfig build() {
            return new ApiConfigGatewayConfig(backendConfig);
        }
    }
}
