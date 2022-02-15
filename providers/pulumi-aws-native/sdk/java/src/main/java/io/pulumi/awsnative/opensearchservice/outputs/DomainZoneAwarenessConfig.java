// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DomainZoneAwarenessConfig {
    private final @Nullable Integer availabilityZoneCount;

    @OutputCustomType.Constructor({"availabilityZoneCount"})
    private DomainZoneAwarenessConfig(@Nullable Integer availabilityZoneCount) {
        this.availabilityZoneCount = availabilityZoneCount;
    }

    public Optional<Integer> getAvailabilityZoneCount() {
        return Optional.ofNullable(this.availabilityZoneCount);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainZoneAwarenessConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer availabilityZoneCount;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainZoneAwarenessConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZoneCount = defaults.availabilityZoneCount;
        }

        public Builder setAvailabilityZoneCount(@Nullable Integer availabilityZoneCount) {
            this.availabilityZoneCount = availabilityZoneCount;
            return this;
        }

        public DomainZoneAwarenessConfig build() {
            return new DomainZoneAwarenessConfig(availabilityZoneCount);
        }
    }
}