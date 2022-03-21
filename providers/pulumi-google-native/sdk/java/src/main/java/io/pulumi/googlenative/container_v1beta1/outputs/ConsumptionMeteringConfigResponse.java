// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.container_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ConsumptionMeteringConfigResponse {
    /**
     * Whether to enable consumption metering for this cluster. If enabled, a second BigQuery table will be created to hold resource consumption records.
     * 
     */
    private final Boolean enabled;

    @CustomType.Constructor
    private ConsumptionMeteringConfigResponse(@CustomType.Parameter("enabled") Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Whether to enable consumption metering for this cluster. If enabled, a second BigQuery table will be created to hold resource consumption records.
     * 
    */
    public Boolean getEnabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsumptionMeteringConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsumptionMeteringConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }        public ConsumptionMeteringConfigResponse build() {
            return new ConsumptionMeteringConfigResponse(enabled);
        }
    }
}
