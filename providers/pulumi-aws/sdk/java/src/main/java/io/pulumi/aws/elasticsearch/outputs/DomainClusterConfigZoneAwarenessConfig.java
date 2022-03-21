// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DomainClusterConfigZoneAwarenessConfig {
    /**
     * Number of Availability Zones for the domain to use with `zone_awareness_enabled`. Defaults to `2`. Valid values: `2` or `3`.
     * 
     */
    private final @Nullable Integer availabilityZoneCount;

    @CustomType.Constructor
    private DomainClusterConfigZoneAwarenessConfig(@CustomType.Parameter("availabilityZoneCount") @Nullable Integer availabilityZoneCount) {
        this.availabilityZoneCount = availabilityZoneCount;
    }

    /**
     * Number of Availability Zones for the domain to use with `zone_awareness_enabled`. Defaults to `2`. Valid values: `2` or `3`.
     * 
    */
    public Optional<Integer> getAvailabilityZoneCount() {
        return Optional.ofNullable(this.availabilityZoneCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainClusterConfigZoneAwarenessConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer availabilityZoneCount;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainClusterConfigZoneAwarenessConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZoneCount = defaults.availabilityZoneCount;
        }

        public Builder availabilityZoneCount(@Nullable Integer availabilityZoneCount) {
            this.availabilityZoneCount = availabilityZoneCount;
            return this;
        }        public DomainClusterConfigZoneAwarenessConfig build() {
            return new DomainClusterConfigZoneAwarenessConfig(availabilityZoneCount);
        }
    }
}
