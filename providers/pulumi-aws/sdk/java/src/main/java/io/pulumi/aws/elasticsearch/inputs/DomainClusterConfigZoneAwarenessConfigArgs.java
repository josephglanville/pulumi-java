// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticsearch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DomainClusterConfigZoneAwarenessConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DomainClusterConfigZoneAwarenessConfigArgs Empty = new DomainClusterConfigZoneAwarenessConfigArgs();

    /**
     * Number of Availability Zones for the domain to use with `zone_awareness_enabled`. Defaults to `2`. Valid values: `2` or `3`.
     * 
     */
    @Import(name="availabilityZoneCount")
      private final @Nullable Output<Integer> availabilityZoneCount;

    public Output<Integer> getAvailabilityZoneCount() {
        return this.availabilityZoneCount == null ? Codegen.empty() : this.availabilityZoneCount;
    }

    public DomainClusterConfigZoneAwarenessConfigArgs(@Nullable Output<Integer> availabilityZoneCount) {
        this.availabilityZoneCount = availabilityZoneCount;
    }

    private DomainClusterConfigZoneAwarenessConfigArgs() {
        this.availabilityZoneCount = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainClusterConfigZoneAwarenessConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> availabilityZoneCount;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainClusterConfigZoneAwarenessConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZoneCount = defaults.availabilityZoneCount;
        }

        public Builder availabilityZoneCount(@Nullable Output<Integer> availabilityZoneCount) {
            this.availabilityZoneCount = availabilityZoneCount;
            return this;
        }
        public Builder availabilityZoneCount(@Nullable Integer availabilityZoneCount) {
            this.availabilityZoneCount = Codegen.ofNullable(availabilityZoneCount);
            return this;
        }        public DomainClusterConfigZoneAwarenessConfigArgs build() {
            return new DomainClusterConfigZoneAwarenessConfigArgs(availabilityZoneCount);
        }
    }
}
