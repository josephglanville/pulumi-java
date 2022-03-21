// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.docker.inputs.ServiceAuthArgs;
import io.pulumi.docker.inputs.ServiceConvergeConfigArgs;
import io.pulumi.docker.inputs.ServiceEndpointSpecArgs;
import io.pulumi.docker.inputs.ServiceLabelArgs;
import io.pulumi.docker.inputs.ServiceModeArgs;
import io.pulumi.docker.inputs.ServiceRollbackConfigArgs;
import io.pulumi.docker.inputs.ServiceTaskSpecArgs;
import io.pulumi.docker.inputs.ServiceUpdateConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceArgs Empty = new ServiceArgs();

    /**
     * Configuration for the authentication for pulling the images of the service
     * 
     */
    @Import(name="auth")
      private final @Nullable Output<ServiceAuthArgs> auth;

    public Output<ServiceAuthArgs> getAuth() {
        return this.auth == null ? Output.empty() : this.auth;
    }

    /**
     * A configuration to ensure that a service converges aka reaches the desired that of all task up and running
     * 
     */
    @Import(name="convergeConfig")
      private final @Nullable Output<ServiceConvergeConfigArgs> convergeConfig;

    public Output<ServiceConvergeConfigArgs> getConvergeConfig() {
        return this.convergeConfig == null ? Output.empty() : this.convergeConfig;
    }

    /**
     * Properties that can be configured to access and load balance a service
     * 
     */
    @Import(name="endpointSpec")
      private final @Nullable Output<ServiceEndpointSpecArgs> endpointSpec;

    public Output<ServiceEndpointSpecArgs> getEndpointSpec() {
        return this.endpointSpec == null ? Output.empty() : this.endpointSpec;
    }

    /**
     * User-defined key/value metadata
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<List<ServiceLabelArgs>> labels;

    public Output<List<ServiceLabelArgs>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * Scheduling mode for the service
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<ServiceModeArgs> mode;

    public Output<ServiceModeArgs> getMode() {
        return this.mode == null ? Output.empty() : this.mode;
    }

    /**
     * Name of the service
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Specification for the rollback strategy of the service
     * 
     */
    @Import(name="rollbackConfig")
      private final @Nullable Output<ServiceRollbackConfigArgs> rollbackConfig;

    public Output<ServiceRollbackConfigArgs> getRollbackConfig() {
        return this.rollbackConfig == null ? Output.empty() : this.rollbackConfig;
    }

    /**
     * User modifiable task configuration
     * 
     */
    @Import(name="taskSpec", required=true)
      private final Output<ServiceTaskSpecArgs> taskSpec;

    public Output<ServiceTaskSpecArgs> getTaskSpec() {
        return this.taskSpec;
    }

    /**
     * Specification for the update strategy of the service
     * 
     */
    @Import(name="updateConfig")
      private final @Nullable Output<ServiceUpdateConfigArgs> updateConfig;

    public Output<ServiceUpdateConfigArgs> getUpdateConfig() {
        return this.updateConfig == null ? Output.empty() : this.updateConfig;
    }

    public ServiceArgs(
        @Nullable Output<ServiceAuthArgs> auth,
        @Nullable Output<ServiceConvergeConfigArgs> convergeConfig,
        @Nullable Output<ServiceEndpointSpecArgs> endpointSpec,
        @Nullable Output<List<ServiceLabelArgs>> labels,
        @Nullable Output<ServiceModeArgs> mode,
        @Nullable Output<String> name,
        @Nullable Output<ServiceRollbackConfigArgs> rollbackConfig,
        Output<ServiceTaskSpecArgs> taskSpec,
        @Nullable Output<ServiceUpdateConfigArgs> updateConfig) {
        this.auth = auth;
        this.convergeConfig = convergeConfig;
        this.endpointSpec = endpointSpec;
        this.labels = labels;
        this.mode = mode;
        this.name = name;
        this.rollbackConfig = rollbackConfig;
        this.taskSpec = Objects.requireNonNull(taskSpec, "expected parameter 'taskSpec' to be non-null");
        this.updateConfig = updateConfig;
    }

    private ServiceArgs() {
        this.auth = Output.empty();
        this.convergeConfig = Output.empty();
        this.endpointSpec = Output.empty();
        this.labels = Output.empty();
        this.mode = Output.empty();
        this.name = Output.empty();
        this.rollbackConfig = Output.empty();
        this.taskSpec = Output.empty();
        this.updateConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ServiceAuthArgs> auth;
        private @Nullable Output<ServiceConvergeConfigArgs> convergeConfig;
        private @Nullable Output<ServiceEndpointSpecArgs> endpointSpec;
        private @Nullable Output<List<ServiceLabelArgs>> labels;
        private @Nullable Output<ServiceModeArgs> mode;
        private @Nullable Output<String> name;
        private @Nullable Output<ServiceRollbackConfigArgs> rollbackConfig;
        private Output<ServiceTaskSpecArgs> taskSpec;
        private @Nullable Output<ServiceUpdateConfigArgs> updateConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auth = defaults.auth;
    	      this.convergeConfig = defaults.convergeConfig;
    	      this.endpointSpec = defaults.endpointSpec;
    	      this.labels = defaults.labels;
    	      this.mode = defaults.mode;
    	      this.name = defaults.name;
    	      this.rollbackConfig = defaults.rollbackConfig;
    	      this.taskSpec = defaults.taskSpec;
    	      this.updateConfig = defaults.updateConfig;
        }

        public Builder auth(@Nullable Output<ServiceAuthArgs> auth) {
            this.auth = auth;
            return this;
        }
        public Builder auth(@Nullable ServiceAuthArgs auth) {
            this.auth = Output.ofNullable(auth);
            return this;
        }
        public Builder convergeConfig(@Nullable Output<ServiceConvergeConfigArgs> convergeConfig) {
            this.convergeConfig = convergeConfig;
            return this;
        }
        public Builder convergeConfig(@Nullable ServiceConvergeConfigArgs convergeConfig) {
            this.convergeConfig = Output.ofNullable(convergeConfig);
            return this;
        }
        public Builder endpointSpec(@Nullable Output<ServiceEndpointSpecArgs> endpointSpec) {
            this.endpointSpec = endpointSpec;
            return this;
        }
        public Builder endpointSpec(@Nullable ServiceEndpointSpecArgs endpointSpec) {
            this.endpointSpec = Output.ofNullable(endpointSpec);
            return this;
        }
        public Builder labels(@Nullable Output<List<ServiceLabelArgs>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable List<ServiceLabelArgs> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder labels(ServiceLabelArgs... labels) {
            return labels(List.of(labels));
        }
        public Builder mode(@Nullable Output<ServiceModeArgs> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable ServiceModeArgs mode) {
            this.mode = Output.ofNullable(mode);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder rollbackConfig(@Nullable Output<ServiceRollbackConfigArgs> rollbackConfig) {
            this.rollbackConfig = rollbackConfig;
            return this;
        }
        public Builder rollbackConfig(@Nullable ServiceRollbackConfigArgs rollbackConfig) {
            this.rollbackConfig = Output.ofNullable(rollbackConfig);
            return this;
        }
        public Builder taskSpec(Output<ServiceTaskSpecArgs> taskSpec) {
            this.taskSpec = Objects.requireNonNull(taskSpec);
            return this;
        }
        public Builder taskSpec(ServiceTaskSpecArgs taskSpec) {
            this.taskSpec = Output.of(Objects.requireNonNull(taskSpec));
            return this;
        }
        public Builder updateConfig(@Nullable Output<ServiceUpdateConfigArgs> updateConfig) {
            this.updateConfig = updateConfig;
            return this;
        }
        public Builder updateConfig(@Nullable ServiceUpdateConfigArgs updateConfig) {
            this.updateConfig = Output.ofNullable(updateConfig);
            return this;
        }        public ServiceArgs build() {
            return new ServiceArgs(auth, convergeConfig, endpointSpec, labels, mode, name, rollbackConfig, taskSpec, updateConfig);
        }
    }
}
