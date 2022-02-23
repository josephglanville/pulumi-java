// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ecs.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionEphemeralStorageArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionEphemeralStorageArgs Empty = new TaskDefinitionEphemeralStorageArgs();

    @InputImport(name="sizeInGiB")
      private final @Nullable Input<Integer> sizeInGiB;

    public Input<Integer> getSizeInGiB() {
        return this.sizeInGiB == null ? Input.empty() : this.sizeInGiB;
    }

    public TaskDefinitionEphemeralStorageArgs(@Nullable Input<Integer> sizeInGiB) {
        this.sizeInGiB = sizeInGiB;
    }

    private TaskDefinitionEphemeralStorageArgs() {
        this.sizeInGiB = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionEphemeralStorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> sizeInGiB;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionEphemeralStorageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sizeInGiB = defaults.sizeInGiB;
        }

        public Builder setSizeInGiB(@Nullable Input<Integer> sizeInGiB) {
            this.sizeInGiB = sizeInGiB;
            return this;
        }

        public Builder setSizeInGiB(@Nullable Integer sizeInGiB) {
            this.sizeInGiB = Input.ofNullable(sizeInGiB);
            return this;
        }
        public TaskDefinitionEphemeralStorageArgs build() {
            return new TaskDefinitionEphemeralStorageArgs(sizeInGiB);
        }
    }
}
