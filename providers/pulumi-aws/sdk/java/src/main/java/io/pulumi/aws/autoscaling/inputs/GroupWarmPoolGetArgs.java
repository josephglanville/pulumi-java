// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.autoscaling.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupWarmPoolGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final GroupWarmPoolGetArgs Empty = new GroupWarmPoolGetArgs();

    /**
     * Specifies the total maximum number of instances that are allowed to be in the warm pool or in any state except Terminated for the Auto Scaling group.
     * 
     */
    @Import(name="maxGroupPreparedCapacity")
      private final @Nullable Output<Integer> maxGroupPreparedCapacity;

    public Output<Integer> getMaxGroupPreparedCapacity() {
        return this.maxGroupPreparedCapacity == null ? Output.empty() : this.maxGroupPreparedCapacity;
    }

    /**
     * Specifies the minimum number of instances to maintain in the warm pool. This helps you to ensure that there is always a certain number of warmed instances available to handle traffic spikes. Defaults to 0 if not specified.
     * 
     */
    @Import(name="minSize")
      private final @Nullable Output<Integer> minSize;

    public Output<Integer> getMinSize() {
        return this.minSize == null ? Output.empty() : this.minSize;
    }

    /**
     * Sets the instance state to transition to after the lifecycle hooks finish. Valid values are: Stopped (default) or Running.
     * 
     */
    @Import(name="poolState")
      private final @Nullable Output<String> poolState;

    public Output<String> getPoolState() {
        return this.poolState == null ? Output.empty() : this.poolState;
    }

    public GroupWarmPoolGetArgs(
        @Nullable Output<Integer> maxGroupPreparedCapacity,
        @Nullable Output<Integer> minSize,
        @Nullable Output<String> poolState) {
        this.maxGroupPreparedCapacity = maxGroupPreparedCapacity;
        this.minSize = minSize;
        this.poolState = poolState;
    }

    private GroupWarmPoolGetArgs() {
        this.maxGroupPreparedCapacity = Output.empty();
        this.minSize = Output.empty();
        this.poolState = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupWarmPoolGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxGroupPreparedCapacity;
        private @Nullable Output<Integer> minSize;
        private @Nullable Output<String> poolState;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupWarmPoolGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxGroupPreparedCapacity = defaults.maxGroupPreparedCapacity;
    	      this.minSize = defaults.minSize;
    	      this.poolState = defaults.poolState;
        }

        public Builder maxGroupPreparedCapacity(@Nullable Output<Integer> maxGroupPreparedCapacity) {
            this.maxGroupPreparedCapacity = maxGroupPreparedCapacity;
            return this;
        }
        public Builder maxGroupPreparedCapacity(@Nullable Integer maxGroupPreparedCapacity) {
            this.maxGroupPreparedCapacity = Output.ofNullable(maxGroupPreparedCapacity);
            return this;
        }
        public Builder minSize(@Nullable Output<Integer> minSize) {
            this.minSize = minSize;
            return this;
        }
        public Builder minSize(@Nullable Integer minSize) {
            this.minSize = Output.ofNullable(minSize);
            return this;
        }
        public Builder poolState(@Nullable Output<String> poolState) {
            this.poolState = poolState;
            return this;
        }
        public Builder poolState(@Nullable String poolState) {
            this.poolState = Output.ofNullable(poolState);
            return this;
        }        public GroupWarmPoolGetArgs build() {
            return new GroupWarmPoolGetArgs(maxGroupPreparedCapacity, minSize, poolState);
        }
    }
}
