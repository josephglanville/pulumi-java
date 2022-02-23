// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.notebooks.inputs.RuntimeAccessConfigGetArgs;
import io.pulumi.gcp.notebooks.inputs.RuntimeMetricGetArgs;
import io.pulumi.gcp.notebooks.inputs.RuntimeSoftwareConfigGetArgs;
import io.pulumi.gcp.notebooks.inputs.RuntimeVirtualMachineGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RuntimeState extends io.pulumi.resources.ResourceArgs {

    public static final RuntimeState Empty = new RuntimeState();

    /**
     * The config settings for accessing runtime.
     * Structure is documented below.
     * 
     */
    @InputImport(name="accessConfig")
      private final @Nullable Input<RuntimeAccessConfigGetArgs> accessConfig;

    public Input<RuntimeAccessConfigGetArgs> getAccessConfig() {
        return this.accessConfig == null ? Input.empty() : this.accessConfig;
    }

    /**
     * The health state of this runtime. For a list of possible output values, see
     * 'https://cloud.google.com/vertex-ai/docs/workbench/ reference/rest/v1/projects.locations.runtimes#healthstate'.
     * 
     */
    @InputImport(name="healthState")
      private final @Nullable Input<String> healthState;

    public Input<String> getHealthState() {
        return this.healthState == null ? Input.empty() : this.healthState;
    }

    /**
     * A reference to the zone where the machine resides.
     * 
     */
    @InputImport(name="location")
      private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Contains Runtime daemon metrics such as Service status and JupyterLab status
     * 
     */
    @InputImport(name="metrics")
      private final @Nullable Input<List<RuntimeMetricGetArgs>> metrics;

    public Input<List<RuntimeMetricGetArgs>> getMetrics() {
        return this.metrics == null ? Input.empty() : this.metrics;
    }

    /**
     * The name specified for the Notebook instance.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The config settings for software inside the runtime.
     * Structure is documented below.
     * 
     */
    @InputImport(name="softwareConfig")
      private final @Nullable Input<RuntimeSoftwareConfigGetArgs> softwareConfig;

    public Input<RuntimeSoftwareConfigGetArgs> getSoftwareConfig() {
        return this.softwareConfig == null ? Input.empty() : this.softwareConfig;
    }

    /**
     * The state of this runtime.
     * 
     */
    @InputImport(name="state")
      private final @Nullable Input<String> state;

    public Input<String> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    /**
     * Use a Compute Engine VM image to start the managed notebook instance.
     * Structure is documented below.
     * 
     */
    @InputImport(name="virtualMachine")
      private final @Nullable Input<RuntimeVirtualMachineGetArgs> virtualMachine;

    public Input<RuntimeVirtualMachineGetArgs> getVirtualMachine() {
        return this.virtualMachine == null ? Input.empty() : this.virtualMachine;
    }

    public RuntimeState(
        @Nullable Input<RuntimeAccessConfigGetArgs> accessConfig,
        @Nullable Input<String> healthState,
        @Nullable Input<String> location,
        @Nullable Input<List<RuntimeMetricGetArgs>> metrics,
        @Nullable Input<String> name,
        @Nullable Input<String> project,
        @Nullable Input<RuntimeSoftwareConfigGetArgs> softwareConfig,
        @Nullable Input<String> state,
        @Nullable Input<RuntimeVirtualMachineGetArgs> virtualMachine) {
        this.accessConfig = accessConfig;
        this.healthState = healthState;
        this.location = location;
        this.metrics = metrics;
        this.name = name;
        this.project = project;
        this.softwareConfig = softwareConfig;
        this.state = state;
        this.virtualMachine = virtualMachine;
    }

    private RuntimeState() {
        this.accessConfig = Input.empty();
        this.healthState = Input.empty();
        this.location = Input.empty();
        this.metrics = Input.empty();
        this.name = Input.empty();
        this.project = Input.empty();
        this.softwareConfig = Input.empty();
        this.state = Input.empty();
        this.virtualMachine = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<RuntimeAccessConfigGetArgs> accessConfig;
        private @Nullable Input<String> healthState;
        private @Nullable Input<String> location;
        private @Nullable Input<List<RuntimeMetricGetArgs>> metrics;
        private @Nullable Input<String> name;
        private @Nullable Input<String> project;
        private @Nullable Input<RuntimeSoftwareConfigGetArgs> softwareConfig;
        private @Nullable Input<String> state;
        private @Nullable Input<RuntimeVirtualMachineGetArgs> virtualMachine;

        public Builder() {
    	      // Empty
        }

        public Builder(RuntimeState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessConfig = defaults.accessConfig;
    	      this.healthState = defaults.healthState;
    	      this.location = defaults.location;
    	      this.metrics = defaults.metrics;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.softwareConfig = defaults.softwareConfig;
    	      this.state = defaults.state;
    	      this.virtualMachine = defaults.virtualMachine;
        }

        public Builder setAccessConfig(@Nullable Input<RuntimeAccessConfigGetArgs> accessConfig) {
            this.accessConfig = accessConfig;
            return this;
        }

        public Builder setAccessConfig(@Nullable RuntimeAccessConfigGetArgs accessConfig) {
            this.accessConfig = Input.ofNullable(accessConfig);
            return this;
        }

        public Builder setHealthState(@Nullable Input<String> healthState) {
            this.healthState = healthState;
            return this;
        }

        public Builder setHealthState(@Nullable String healthState) {
            this.healthState = Input.ofNullable(healthState);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMetrics(@Nullable Input<List<RuntimeMetricGetArgs>> metrics) {
            this.metrics = metrics;
            return this;
        }

        public Builder setMetrics(@Nullable List<RuntimeMetricGetArgs> metrics) {
            this.metrics = Input.ofNullable(metrics);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setSoftwareConfig(@Nullable Input<RuntimeSoftwareConfigGetArgs> softwareConfig) {
            this.softwareConfig = softwareConfig;
            return this;
        }

        public Builder setSoftwareConfig(@Nullable RuntimeSoftwareConfigGetArgs softwareConfig) {
            this.softwareConfig = Input.ofNullable(softwareConfig);
            return this;
        }

        public Builder setState(@Nullable Input<String> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setVirtualMachine(@Nullable Input<RuntimeVirtualMachineGetArgs> virtualMachine) {
            this.virtualMachine = virtualMachine;
            return this;
        }

        public Builder setVirtualMachine(@Nullable RuntimeVirtualMachineGetArgs virtualMachine) {
            this.virtualMachine = Input.ofNullable(virtualMachine);
            return this;
        }
        public RuntimeState build() {
            return new RuntimeState(accessConfig, healthState, location, metrics, name, project, softwareConfig, state, virtualMachine);
        }
    }
}
