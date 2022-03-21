// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * RollingUpdateStatefulSetStrategy is used to communicate parameter for RollingUpdateStatefulSetStrategyType.
 * 
 */
public final class RollingUpdateStatefulSetStrategyArgs extends io.pulumi.resources.ResourceArgs {

    public static final RollingUpdateStatefulSetStrategyArgs Empty = new RollingUpdateStatefulSetStrategyArgs();

    /**
     * Partition indicates the ordinal at which the StatefulSet should be partitioned. Default value is 0.
     * 
     */
    @Import(name="partition")
      private final @Nullable Output<Integer> partition;

    public Output<Integer> getPartition() {
        return this.partition == null ? Output.empty() : this.partition;
    }

    public RollingUpdateStatefulSetStrategyArgs(@Nullable Output<Integer> partition) {
        this.partition = partition;
    }

    private RollingUpdateStatefulSetStrategyArgs() {
        this.partition = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RollingUpdateStatefulSetStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> partition;

        public Builder() {
    	      // Empty
        }

        public Builder(RollingUpdateStatefulSetStrategyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.partition = defaults.partition;
        }

        public Builder partition(@Nullable Output<Integer> partition) {
            this.partition = partition;
            return this;
        }
        public Builder partition(@Nullable Integer partition) {
            this.partition = Output.ofNullable(partition);
            return this;
        }        public RollingUpdateStatefulSetStrategyArgs build() {
            return new RollingUpdateStatefulSetStrategyArgs(partition);
        }
    }
}
