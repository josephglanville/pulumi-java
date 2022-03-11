// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation.inputs;

import io.pulumi.azurenative.automation.inputs.TaskPropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Task properties of the software update configuration.
 * 
 */
public final class SoftwareUpdateConfigurationTasksArgs extends io.pulumi.resources.ResourceArgs {

    public static final SoftwareUpdateConfigurationTasksArgs Empty = new SoftwareUpdateConfigurationTasksArgs();

    /**
     * Post task properties.
     * 
     */
    @InputImport(name="postTask")
      private final @Nullable Output<TaskPropertiesArgs> postTask;

    public Output<TaskPropertiesArgs> getPostTask() {
        return this.postTask == null ? Output.empty() : this.postTask;
    }

    /**
     * Pre task properties.
     * 
     */
    @InputImport(name="preTask")
      private final @Nullable Output<TaskPropertiesArgs> preTask;

    public Output<TaskPropertiesArgs> getPreTask() {
        return this.preTask == null ? Output.empty() : this.preTask;
    }

    public SoftwareUpdateConfigurationTasksArgs(
        @Nullable Output<TaskPropertiesArgs> postTask,
        @Nullable Output<TaskPropertiesArgs> preTask) {
        this.postTask = postTask;
        this.preTask = preTask;
    }

    private SoftwareUpdateConfigurationTasksArgs() {
        this.postTask = Output.empty();
        this.preTask = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SoftwareUpdateConfigurationTasksArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TaskPropertiesArgs> postTask;
        private @Nullable Output<TaskPropertiesArgs> preTask;

        public Builder() {
    	      // Empty
        }

        public Builder(SoftwareUpdateConfigurationTasksArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.postTask = defaults.postTask;
    	      this.preTask = defaults.preTask;
        }

        public Builder postTask(@Nullable Output<TaskPropertiesArgs> postTask) {
            this.postTask = postTask;
            return this;
        }

        public Builder postTask(@Nullable TaskPropertiesArgs postTask) {
            this.postTask = Output.ofNullable(postTask);
            return this;
        }

        public Builder preTask(@Nullable Output<TaskPropertiesArgs> preTask) {
            this.preTask = preTask;
            return this;
        }

        public Builder preTask(@Nullable TaskPropertiesArgs preTask) {
            this.preTask = Output.ofNullable(preTask);
            return this;
        }
        public SoftwareUpdateConfigurationTasksArgs build() {
            return new SoftwareUpdateConfigurationTasksArgs(postTask, preTask);
        }
    }
}
