// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class CloudEndpointsResponse {
    private final String service;

    @OutputCustomType.Constructor({"service"})
    private CloudEndpointsResponse(String service) {
        this.service = Objects.requireNonNull(service);
    }

    public String getService() {
        return this.service;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CloudEndpointsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String service;

        public Builder() {
    	      // Empty
        }

        public Builder(CloudEndpointsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.service = defaults.service;
        }

        public Builder setService(String service) {
            this.service = Objects.requireNonNull(service);
            return this;
        }

        public CloudEndpointsResponse build() {
            return new CloudEndpointsResponse(service);
        }
    }
}