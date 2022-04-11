// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
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
    @Import(name="accessConfig")
      private final @Nullable Output<RuntimeAccessConfigGetArgs> accessConfig;

    public Output<RuntimeAccessConfigGetArgs> getAccessConfig() {
        return this.accessConfig == null ? Codegen.empty() : this.accessConfig;
    }

    /**
     * The health state of this runtime. For a list of possible output values, see
     * 'https://cloud.google.com/vertex-ai/docs/workbench/ reference/rest/v1/projects.locations.runtimes#healthstate'.
     * 
     */
    @Import(name="healthState")
      private final @Nullable Output<String> healthState;

    public Output<String> getHealthState() {
        return this.healthState == null ? Codegen.empty() : this.healthState;
    }

    /**
     * A reference to the zone where the machine resides.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Contains Runtime daemon metrics such as Service status and JupyterLab status
     * 
     */
    @Import(name="metrics")
      private final @Nullable Output<List<RuntimeMetricGetArgs>> metrics;

    public Output<List<RuntimeMetricGetArgs>> getMetrics() {
        return this.metrics == null ? Codegen.empty() : this.metrics;
    }

    /**
     * The name specified for the Notebook instance.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The config settings for software inside the runtime.
     * Structure is documented below.
     * 
     */
    @Import(name="softwareConfig")
      private final @Nullable Output<RuntimeSoftwareConfigGetArgs> softwareConfig;

    public Output<RuntimeSoftwareConfigGetArgs> getSoftwareConfig() {
        return this.softwareConfig == null ? Codegen.empty() : this.softwareConfig;
    }

    /**
     * The state of this runtime.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> getState() {
        return this.state == null ? Codegen.empty() : this.state;
    }

    /**
     * Use a Compute Engine VM image to start the managed notebook instance.
     * Structure is documented below.
     * 
     */
    @Import(name="virtualMachine")
      private final @Nullable Output<RuntimeVirtualMachineGetArgs> virtualMachine;

    public Output<RuntimeVirtualMachineGetArgs> getVirtualMachine() {
        return this.virtualMachine == null ? Codegen.empty() : this.virtualMachine;
    }

    public RuntimeState(
        @Nullable Output<RuntimeAccessConfigGetArgs> accessConfig,
        @Nullable Output<String> healthState,
        @Nullable Output<String> location,
        @Nullable Output<List<RuntimeMetricGetArgs>> metrics,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<RuntimeSoftwareConfigGetArgs> softwareConfig,
        @Nullable Output<String> state,
        @Nullable Output<RuntimeVirtualMachineGetArgs> virtualMachine) {
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
        this.accessConfig = Codegen.empty();
        this.healthState = Codegen.empty();
        this.location = Codegen.empty();
        this.metrics = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.softwareConfig = Codegen.empty();
        this.state = Codegen.empty();
        this.virtualMachine = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuntimeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RuntimeAccessConfigGetArgs> accessConfig;
        private @Nullable Output<String> healthState;
        private @Nullable Output<String> location;
        private @Nullable Output<List<RuntimeMetricGetArgs>> metrics;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<RuntimeSoftwareConfigGetArgs> softwareConfig;
        private @Nullable Output<String> state;
        private @Nullable Output<RuntimeVirtualMachineGetArgs> virtualMachine;

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

        public Builder accessConfig(@Nullable Output<RuntimeAccessConfigGetArgs> accessConfig) {
            this.accessConfig = accessConfig;
            return this;
        }
        public Builder accessConfig(@Nullable RuntimeAccessConfigGetArgs accessConfig) {
            this.accessConfig = Codegen.ofNullable(accessConfig);
            return this;
        }
        public Builder healthState(@Nullable Output<String> healthState) {
            this.healthState = healthState;
            return this;
        }
        public Builder healthState(@Nullable String healthState) {
            this.healthState = Codegen.ofNullable(healthState);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder metrics(@Nullable Output<List<RuntimeMetricGetArgs>> metrics) {
            this.metrics = metrics;
            return this;
        }
        public Builder metrics(@Nullable List<RuntimeMetricGetArgs> metrics) {
            this.metrics = Codegen.ofNullable(metrics);
            return this;
        }
        public Builder metrics(RuntimeMetricGetArgs... metrics) {
            return metrics(List.of(metrics));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder softwareConfig(@Nullable Output<RuntimeSoftwareConfigGetArgs> softwareConfig) {
            this.softwareConfig = softwareConfig;
            return this;
        }
        public Builder softwareConfig(@Nullable RuntimeSoftwareConfigGetArgs softwareConfig) {
            this.softwareConfig = Codegen.ofNullable(softwareConfig);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Codegen.ofNullable(state);
            return this;
        }
        public Builder virtualMachine(@Nullable Output<RuntimeVirtualMachineGetArgs> virtualMachine) {
            this.virtualMachine = virtualMachine;
            return this;
        }
        public Builder virtualMachine(@Nullable RuntimeVirtualMachineGetArgs virtualMachine) {
            this.virtualMachine = Codegen.ofNullable(virtualMachine);
            return this;
        }        public RuntimeState build() {
            return new RuntimeState(accessConfig, healthState, location, metrics, name, project, softwareConfig, state, virtualMachine);
        }
    }
}
