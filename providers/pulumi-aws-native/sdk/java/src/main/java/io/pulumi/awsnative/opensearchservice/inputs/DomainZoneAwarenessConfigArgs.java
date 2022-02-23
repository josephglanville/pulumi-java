// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.opensearchservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainZoneAwarenessConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainZoneAwarenessConfigArgs Empty = new DomainZoneAwarenessConfigArgs();

    @InputImport(name="availabilityZoneCount")
      private final @Nullable Input<Integer> availabilityZoneCount;

    public Input<Integer> getAvailabilityZoneCount() {
        return this.availabilityZoneCount == null ? Input.empty() : this.availabilityZoneCount;
    }

    public DomainZoneAwarenessConfigArgs(@Nullable Input<Integer> availabilityZoneCount) {
        this.availabilityZoneCount = availabilityZoneCount;
    }

    private DomainZoneAwarenessConfigArgs() {
        this.availabilityZoneCount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainZoneAwarenessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> availabilityZoneCount;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainZoneAwarenessConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZoneCount = defaults.availabilityZoneCount;
        }

        public Builder setAvailabilityZoneCount(@Nullable Input<Integer> availabilityZoneCount) {
            this.availabilityZoneCount = availabilityZoneCount;
            return this;
        }

        public Builder setAvailabilityZoneCount(@Nullable Integer availabilityZoneCount) {
            this.availabilityZoneCount = Input.ofNullable(availabilityZoneCount);
            return this;
        }
        public DomainZoneAwarenessConfigArgs build() {
            return new DomainZoneAwarenessConfigArgs(availabilityZoneCount);
        }
    }
}
