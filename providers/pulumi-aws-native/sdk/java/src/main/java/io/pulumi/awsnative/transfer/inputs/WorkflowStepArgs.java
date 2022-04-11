// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.transfer.inputs;

import io.pulumi.awsnative.transfer.enums.WorkflowStepType;
import io.pulumi.awsnative.transfer.inputs.WorkflowStepCopyStepDetailsPropertiesArgs;
import io.pulumi.awsnative.transfer.inputs.WorkflowStepCustomStepDetailsPropertiesArgs;
import io.pulumi.awsnative.transfer.inputs.WorkflowStepDeleteStepDetailsPropertiesArgs;
import io.pulumi.awsnative.transfer.inputs.WorkflowStepTagStepDetailsPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The basic building block of a workflow.
 * 
 */
public final class WorkflowStepArgs extends io.pulumi.resources.ResourceArgs {

    public static final WorkflowStepArgs Empty = new WorkflowStepArgs();

    /**
     * Details for a step that performs a file copy.
     * 
     */
    @Import(name="copyStepDetails")
      private final @Nullable Output<WorkflowStepCopyStepDetailsPropertiesArgs> copyStepDetails;

    public Output<WorkflowStepCopyStepDetailsPropertiesArgs> getCopyStepDetails() {
        return this.copyStepDetails == null ? Codegen.empty() : this.copyStepDetails;
    }

    /**
     * Details for a step that invokes a lambda function.
     * 
     */
    @Import(name="customStepDetails")
      private final @Nullable Output<WorkflowStepCustomStepDetailsPropertiesArgs> customStepDetails;

    public Output<WorkflowStepCustomStepDetailsPropertiesArgs> getCustomStepDetails() {
        return this.customStepDetails == null ? Codegen.empty() : this.customStepDetails;
    }

    /**
     * Details for a step that deletes the file.
     * 
     */
    @Import(name="deleteStepDetails")
      private final @Nullable Output<WorkflowStepDeleteStepDetailsPropertiesArgs> deleteStepDetails;

    public Output<WorkflowStepDeleteStepDetailsPropertiesArgs> getDeleteStepDetails() {
        return this.deleteStepDetails == null ? Codegen.empty() : this.deleteStepDetails;
    }

    /**
     * Details for a step that creates one or more tags.
     * 
     */
    @Import(name="tagStepDetails")
      private final @Nullable Output<WorkflowStepTagStepDetailsPropertiesArgs> tagStepDetails;

    public Output<WorkflowStepTagStepDetailsPropertiesArgs> getTagStepDetails() {
        return this.tagStepDetails == null ? Codegen.empty() : this.tagStepDetails;
    }

    @Import(name="type")
      private final @Nullable Output<WorkflowStepType> type;

    public Output<WorkflowStepType> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public WorkflowStepArgs(
        @Nullable Output<WorkflowStepCopyStepDetailsPropertiesArgs> copyStepDetails,
        @Nullable Output<WorkflowStepCustomStepDetailsPropertiesArgs> customStepDetails,
        @Nullable Output<WorkflowStepDeleteStepDetailsPropertiesArgs> deleteStepDetails,
        @Nullable Output<WorkflowStepTagStepDetailsPropertiesArgs> tagStepDetails,
        @Nullable Output<WorkflowStepType> type) {
        this.copyStepDetails = copyStepDetails;
        this.customStepDetails = customStepDetails;
        this.deleteStepDetails = deleteStepDetails;
        this.tagStepDetails = tagStepDetails;
        this.type = type;
    }

    private WorkflowStepArgs() {
        this.copyStepDetails = Codegen.empty();
        this.customStepDetails = Codegen.empty();
        this.deleteStepDetails = Codegen.empty();
        this.tagStepDetails = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowStepArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<WorkflowStepCopyStepDetailsPropertiesArgs> copyStepDetails;
        private @Nullable Output<WorkflowStepCustomStepDetailsPropertiesArgs> customStepDetails;
        private @Nullable Output<WorkflowStepDeleteStepDetailsPropertiesArgs> deleteStepDetails;
        private @Nullable Output<WorkflowStepTagStepDetailsPropertiesArgs> tagStepDetails;
        private @Nullable Output<WorkflowStepType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowStepArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyStepDetails = defaults.copyStepDetails;
    	      this.customStepDetails = defaults.customStepDetails;
    	      this.deleteStepDetails = defaults.deleteStepDetails;
    	      this.tagStepDetails = defaults.tagStepDetails;
    	      this.type = defaults.type;
        }

        public Builder copyStepDetails(@Nullable Output<WorkflowStepCopyStepDetailsPropertiesArgs> copyStepDetails) {
            this.copyStepDetails = copyStepDetails;
            return this;
        }
        public Builder copyStepDetails(@Nullable WorkflowStepCopyStepDetailsPropertiesArgs copyStepDetails) {
            this.copyStepDetails = Codegen.ofNullable(copyStepDetails);
            return this;
        }
        public Builder customStepDetails(@Nullable Output<WorkflowStepCustomStepDetailsPropertiesArgs> customStepDetails) {
            this.customStepDetails = customStepDetails;
            return this;
        }
        public Builder customStepDetails(@Nullable WorkflowStepCustomStepDetailsPropertiesArgs customStepDetails) {
            this.customStepDetails = Codegen.ofNullable(customStepDetails);
            return this;
        }
        public Builder deleteStepDetails(@Nullable Output<WorkflowStepDeleteStepDetailsPropertiesArgs> deleteStepDetails) {
            this.deleteStepDetails = deleteStepDetails;
            return this;
        }
        public Builder deleteStepDetails(@Nullable WorkflowStepDeleteStepDetailsPropertiesArgs deleteStepDetails) {
            this.deleteStepDetails = Codegen.ofNullable(deleteStepDetails);
            return this;
        }
        public Builder tagStepDetails(@Nullable Output<WorkflowStepTagStepDetailsPropertiesArgs> tagStepDetails) {
            this.tagStepDetails = tagStepDetails;
            return this;
        }
        public Builder tagStepDetails(@Nullable WorkflowStepTagStepDetailsPropertiesArgs tagStepDetails) {
            this.tagStepDetails = Codegen.ofNullable(tagStepDetails);
            return this;
        }
        public Builder type(@Nullable Output<WorkflowStepType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable WorkflowStepType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public WorkflowStepArgs build() {
            return new WorkflowStepArgs(copyStepDetails, customStepDetails, deleteStepDetails, tagStepDetails, type);
        }
    }
}
