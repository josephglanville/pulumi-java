// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.transfer.outputs;

import io.pulumi.awsnative.transfer.outputs.WorkflowS3Tag;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkflowStepTagStepDetailsProperties {
    /**
     * The name of the step, used as an identifier.
     * 
     */
    private final @Nullable String name;
    /**
     * Array that contains from 1 to 10 key/value pairs.
     * 
     */
    private final @Nullable List<WorkflowS3Tag> tags;

    @CustomType.Constructor
    private WorkflowStepTagStepDetailsProperties(
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("tags") @Nullable List<WorkflowS3Tag> tags) {
        this.name = name;
        this.tags = tags;
    }

    /**
     * The name of the step, used as an identifier.
     * 
    */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * Array that contains from 1 to 10 key/value pairs.
     * 
    */
    public List<WorkflowS3Tag> getTags() {
        return this.tags == null ? List.of() : this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkflowStepTagStepDetailsProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable List<WorkflowS3Tag> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(WorkflowStepTagStepDetailsProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder tags(@Nullable List<WorkflowS3Tag> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(WorkflowS3Tag... tags) {
            return tags(List.of(tags));
        }        public WorkflowStepTagStepDetailsProperties build() {
            return new WorkflowStepTagStepDetailsProperties(name, tags);
        }
    }
}
