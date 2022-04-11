// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ecs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TaskDefinitionVolumeDockerVolumeConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final TaskDefinitionVolumeDockerVolumeConfigurationGetArgs Empty = new TaskDefinitionVolumeDockerVolumeConfigurationGetArgs();

    /**
     * If this value is `true`, the Docker volume is created if it does not already exist. *Note*: This field is only used if the scope is `shared`.
     * 
     */
    @Import(name="autoprovision")
      private final @Nullable Output<Boolean> autoprovision;

    public Output<Boolean> getAutoprovision() {
        return this.autoprovision == null ? Codegen.empty() : this.autoprovision;
    }

    /**
     * Docker volume driver to use. The driver value must match the driver name provided by Docker because it is used for task placement.
     * 
     */
    @Import(name="driver")
      private final @Nullable Output<String> driver;

    public Output<String> getDriver() {
        return this.driver == null ? Codegen.empty() : this.driver;
    }

    /**
     * Map of Docker driver specific options.
     * 
     */
    @Import(name="driverOpts")
      private final @Nullable Output<Map<String,String>> driverOpts;

    public Output<Map<String,String>> getDriverOpts() {
        return this.driverOpts == null ? Codegen.empty() : this.driverOpts;
    }

    /**
     * Map of custom metadata to add to your Docker volume.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * Scope for the Docker volume, which determines its lifecycle, either `task` or `shared`.  Docker volumes that are scoped to a `task` are automatically provisioned when the task starts and destroyed when the task stops. Docker volumes that are scoped as `shared` persist after the task stops.
     * 
     */
    @Import(name="scope")
      private final @Nullable Output<String> scope;

    public Output<String> getScope() {
        return this.scope == null ? Codegen.empty() : this.scope;
    }

    public TaskDefinitionVolumeDockerVolumeConfigurationGetArgs(
        @Nullable Output<Boolean> autoprovision,
        @Nullable Output<String> driver,
        @Nullable Output<Map<String,String>> driverOpts,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> scope) {
        this.autoprovision = autoprovision;
        this.driver = driver;
        this.driverOpts = driverOpts;
        this.labels = labels;
        this.scope = scope;
    }

    private TaskDefinitionVolumeDockerVolumeConfigurationGetArgs() {
        this.autoprovision = Codegen.empty();
        this.driver = Codegen.empty();
        this.driverOpts = Codegen.empty();
        this.labels = Codegen.empty();
        this.scope = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskDefinitionVolumeDockerVolumeConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> autoprovision;
        private @Nullable Output<String> driver;
        private @Nullable Output<Map<String,String>> driverOpts;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(TaskDefinitionVolumeDockerVolumeConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoprovision = defaults.autoprovision;
    	      this.driver = defaults.driver;
    	      this.driverOpts = defaults.driverOpts;
    	      this.labels = defaults.labels;
    	      this.scope = defaults.scope;
        }

        public Builder autoprovision(@Nullable Output<Boolean> autoprovision) {
            this.autoprovision = autoprovision;
            return this;
        }
        public Builder autoprovision(@Nullable Boolean autoprovision) {
            this.autoprovision = Codegen.ofNullable(autoprovision);
            return this;
        }
        public Builder driver(@Nullable Output<String> driver) {
            this.driver = driver;
            return this;
        }
        public Builder driver(@Nullable String driver) {
            this.driver = Codegen.ofNullable(driver);
            return this;
        }
        public Builder driverOpts(@Nullable Output<Map<String,String>> driverOpts) {
            this.driverOpts = driverOpts;
            return this;
        }
        public Builder driverOpts(@Nullable Map<String,String> driverOpts) {
            this.driverOpts = Codegen.ofNullable(driverOpts);
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder scope(@Nullable Output<String> scope) {
            this.scope = scope;
            return this;
        }
        public Builder scope(@Nullable String scope) {
            this.scope = Codegen.ofNullable(scope);
            return this;
        }        public TaskDefinitionVolumeDockerVolumeConfigurationGetArgs build() {
            return new TaskDefinitionVolumeDockerVolumeConfigurationGetArgs(autoprovision, driver, driverOpts, labels, scope);
        }
    }
}
