// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.emr.inputs;

import io.pulumi.aws.emr.inputs.ManagedScalingPolicyComputeLimitGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManagedScalingPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final ManagedScalingPolicyState Empty = new ManagedScalingPolicyState();

    /**
     * The id of the EMR cluster
     * 
     */
    @Import(name="clusterId")
      private final @Nullable Output<String> clusterId;

    public Output<String> getClusterId() {
        return this.clusterId == null ? Codegen.empty() : this.clusterId;
    }

    /**
     * Configuration block with compute limit settings. Described below.
     * 
     */
    @Import(name="computeLimits")
      private final @Nullable Output<List<ManagedScalingPolicyComputeLimitGetArgs>> computeLimits;

    public Output<List<ManagedScalingPolicyComputeLimitGetArgs>> getComputeLimits() {
        return this.computeLimits == null ? Codegen.empty() : this.computeLimits;
    }

    public ManagedScalingPolicyState(
        @Nullable Output<String> clusterId,
        @Nullable Output<List<ManagedScalingPolicyComputeLimitGetArgs>> computeLimits) {
        this.clusterId = clusterId;
        this.computeLimits = computeLimits;
    }

    private ManagedScalingPolicyState() {
        this.clusterId = Codegen.empty();
        this.computeLimits = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedScalingPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clusterId;
        private @Nullable Output<List<ManagedScalingPolicyComputeLimitGetArgs>> computeLimits;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedScalingPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterId = defaults.clusterId;
    	      this.computeLimits = defaults.computeLimits;
        }

        public Builder clusterId(@Nullable Output<String> clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public Builder clusterId(@Nullable String clusterId) {
            this.clusterId = Codegen.ofNullable(clusterId);
            return this;
        }
        public Builder computeLimits(@Nullable Output<List<ManagedScalingPolicyComputeLimitGetArgs>> computeLimits) {
            this.computeLimits = computeLimits;
            return this;
        }
        public Builder computeLimits(@Nullable List<ManagedScalingPolicyComputeLimitGetArgs> computeLimits) {
            this.computeLimits = Codegen.ofNullable(computeLimits);
            return this;
        }
        public Builder computeLimits(ManagedScalingPolicyComputeLimitGetArgs... computeLimits) {
            return computeLimits(List.of(computeLimits));
        }        public ManagedScalingPolicyState build() {
            return new ManagedScalingPolicyState(clusterId, computeLimits);
        }
    }
}
