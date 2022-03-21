// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.eks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NodeGroupUpdateConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final NodeGroupUpdateConfigGetArgs Empty = new NodeGroupUpdateConfigGetArgs();

    /**
     * Desired max number of unavailable worker nodes during node group update.
     * 
     */
    @Import(name="maxUnavailable")
      private final @Nullable Output<Integer> maxUnavailable;

    public Output<Integer> getMaxUnavailable() {
        return this.maxUnavailable == null ? Output.empty() : this.maxUnavailable;
    }

    /**
     * Desired max percentage of unavailable worker nodes during node group update.
     * 
     */
    @Import(name="maxUnavailablePercentage")
      private final @Nullable Output<Integer> maxUnavailablePercentage;

    public Output<Integer> getMaxUnavailablePercentage() {
        return this.maxUnavailablePercentage == null ? Output.empty() : this.maxUnavailablePercentage;
    }

    public NodeGroupUpdateConfigGetArgs(
        @Nullable Output<Integer> maxUnavailable,
        @Nullable Output<Integer> maxUnavailablePercentage) {
        this.maxUnavailable = maxUnavailable;
        this.maxUnavailablePercentage = maxUnavailablePercentage;
    }

    private NodeGroupUpdateConfigGetArgs() {
        this.maxUnavailable = Output.empty();
        this.maxUnavailablePercentage = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NodeGroupUpdateConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxUnavailable;
        private @Nullable Output<Integer> maxUnavailablePercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(NodeGroupUpdateConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxUnavailable = defaults.maxUnavailable;
    	      this.maxUnavailablePercentage = defaults.maxUnavailablePercentage;
        }

        public Builder maxUnavailable(@Nullable Output<Integer> maxUnavailable) {
            this.maxUnavailable = maxUnavailable;
            return this;
        }
        public Builder maxUnavailable(@Nullable Integer maxUnavailable) {
            this.maxUnavailable = Output.ofNullable(maxUnavailable);
            return this;
        }
        public Builder maxUnavailablePercentage(@Nullable Output<Integer> maxUnavailablePercentage) {
            this.maxUnavailablePercentage = maxUnavailablePercentage;
            return this;
        }
        public Builder maxUnavailablePercentage(@Nullable Integer maxUnavailablePercentage) {
            this.maxUnavailablePercentage = Output.ofNullable(maxUnavailablePercentage);
            return this;
        }        public NodeGroupUpdateConfigGetArgs build() {
            return new NodeGroupUpdateConfigGetArgs(maxUnavailable, maxUnavailablePercentage);
        }
    }
}
