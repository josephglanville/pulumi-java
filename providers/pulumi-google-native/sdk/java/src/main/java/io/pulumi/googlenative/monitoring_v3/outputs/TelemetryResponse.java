// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.monitoring_v3.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class TelemetryResponse {
    /**
     * The full name of the resource that defines this service. Formatted as described in https://cloud.google.com/apis/design/resource_names.
     * 
     */
    private final String resourceName;

    @CustomType.Constructor
    private TelemetryResponse(@CustomType.Parameter("resourceName") String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * The full name of the resource that defines this service. Formatted as described in https://cloud.google.com/apis/design/resource_names.
     * 
    */
    public String getPropResourceName() {
        return this.resourceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TelemetryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(TelemetryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceName = defaults.resourceName;
        }

        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }        public TelemetryResponse build() {
            return new TelemetryResponse(resourceName);
        }
    }
}
