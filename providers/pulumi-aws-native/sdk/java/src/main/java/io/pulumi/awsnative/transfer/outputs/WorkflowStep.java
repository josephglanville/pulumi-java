// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.transfer.outputs;

import io.pulumi.awsnative.transfer.enums.WorkflowStepType;
import io.pulumi.awsnative.transfer.outputs.WorkflowStepCopyStepDetailsProperties;
import io.pulumi.awsnative.transfer.outputs.WorkflowStepCustomStepDetailsProperties;
import io.pulumi.awsnative.transfer.outputs.WorkflowStepDeleteStepDetailsProperties;
import io.pulumi.awsnative.transfer.outputs.WorkflowStepTagStepDetailsProperties;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowStep {
    /**
     * Details for a step that performs a file copy.
     * 
     */
    private final @Nullable WorkflowStepCopyStepDetailsProperties copyStepDetails;
    /**
     * Details for a step that invokes a lambda function.
     * 
     */
    private final @Nullable WorkflowStepCustomStepDetailsProperties customStepDetails;
    /**
     * Details for a step that deletes the file.
     * 
     */
    private final @Nullable WorkflowStepDeleteStepDetailsProperties deleteStepDetails;
    /**
     * Details for a step that creates one or more tags.
     * 
     */
    private final @Nullable WorkflowStepTagStepDetailsProperties tagStepDetails;
    private final @Nullable WorkflowStepType type;

    @CustomType.Constructor
    private WorkflowStep(
        @CustomType.Parameter("copyStepDetails") @Nullable WorkflowStepCopyStepDetailsProperties copyStepDetails,
        @CustomType.Parameter("customStepDetails") @Nullable WorkflowStepCustomStepDetailsProperties customStepDetails,
        @CustomType.Parameter("deleteStepDetails") @Nullable WorkflowStepDeleteStepDetailsProperties deleteStepDetails,
        @CustomType.Parameter("tagStepDetails") @Nullable WorkflowStepTagStepDetailsProperties tagStepDetails,
        @CustomType.Parameter("type") @Nullable WorkflowStepType type) {
        this.copyStepDetails = copyStepDetails;
        this.customStepDetails = customStepDetails;
        this.deleteStepDetails = deleteStepDetails;
        this.tagStepDetails = tagStepDetails;
        this.type = type;
    }

    /**
     * Details for a step that performs a file copy.
     * 
    */
    public Optional<WorkflowStepCopyStepDetailsProperties> getCopyStepDetails() {
        return Optional.ofNullable(this.copyStepDetails);
    }
    /**
     * Details for a step that invokes a lambda function.
     * 
    */
    public Optional<WorkflowStepCustomStepDetailsProperties> getCustomStepDetails() {
        return Optional.ofNullable(this.customStepDetails);
    }
    /**
     * Details for a step that deletes the file.
     * 
    */
    public Optional<WorkflowStepDeleteStepDetailsProperties> getDeleteStepDetails() {
        return Optional.ofNullable(this.deleteStepDetails);
    }
    /**
     * Details for a step that creates one or more tags.
     * 
    */
    public Optional<WorkflowStepTagStepDetailsProperties> getTagStepDetails() {
        return Optional.ofNullable(this.tagStepDetails);
    }
    public Optional<WorkflowStepType> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowStep defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable WorkflowStepCopyStepDetailsProperties copyStepDetails;
        private @Nullable WorkflowStepCustomStepDetailsProperties customStepDetails;
        private @Nullable WorkflowStepDeleteStepDetailsProperties deleteStepDetails;
        private @Nullable WorkflowStepTagStepDetailsProperties tagStepDetails;
        private @Nullable WorkflowStepType type;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowStep defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyStepDetails = defaults.copyStepDetails;
    	      this.customStepDetails = defaults.customStepDetails;
    	      this.deleteStepDetails = defaults.deleteStepDetails;
    	      this.tagStepDetails = defaults.tagStepDetails;
    	      this.type = defaults.type;
        }

        public Builder copyStepDetails(@Nullable WorkflowStepCopyStepDetailsProperties copyStepDetails) {
            this.copyStepDetails = copyStepDetails;
            return this;
        }
        public Builder customStepDetails(@Nullable WorkflowStepCustomStepDetailsProperties customStepDetails) {
            this.customStepDetails = customStepDetails;
            return this;
        }
        public Builder deleteStepDetails(@Nullable WorkflowStepDeleteStepDetailsProperties deleteStepDetails) {
            this.deleteStepDetails = deleteStepDetails;
            return this;
        }
        public Builder tagStepDetails(@Nullable WorkflowStepTagStepDetailsProperties tagStepDetails) {
            this.tagStepDetails = tagStepDetails;
            return this;
        }
        public Builder type(@Nullable WorkflowStepType type) {
            this.type = type;
            return this;
        }        public WorkflowStep build() {
            return new WorkflowStep(copyStepDetails, customStepDetails, deleteStepDetails, tagStepDetails, type);
        }
    }
}
