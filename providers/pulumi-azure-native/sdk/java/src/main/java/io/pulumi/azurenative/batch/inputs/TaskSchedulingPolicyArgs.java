// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.enums.ComputeNodeFillType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


public final class TaskSchedulingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskSchedulingPolicyArgs Empty = new TaskSchedulingPolicyArgs();

    @Import(name="nodeFillType", required=true)
      private final Output<ComputeNodeFillType> nodeFillType;

    public Output<ComputeNodeFillType> getNodeFillType() {
        return this.nodeFillType;
    }

    public TaskSchedulingPolicyArgs(Output<ComputeNodeFillType> nodeFillType) {
        this.nodeFillType = Objects.requireNonNull(nodeFillType, "expected parameter 'nodeFillType' to be non-null");
    }

    private TaskSchedulingPolicyArgs() {
        this.nodeFillType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSchedulingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ComputeNodeFillType> nodeFillType;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskSchedulingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nodeFillType = defaults.nodeFillType;
        }

        public Builder nodeFillType(Output<ComputeNodeFillType> nodeFillType) {
            this.nodeFillType = Objects.requireNonNull(nodeFillType);
            return this;
        }
        public Builder nodeFillType(ComputeNodeFillType nodeFillType) {
            this.nodeFillType = Output.of(Objects.requireNonNull(nodeFillType));
            return this;
        }        public TaskSchedulingPolicyArgs build() {
            return new TaskSchedulingPolicyArgs(nodeFillType);
        }
    }
}
