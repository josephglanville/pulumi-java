// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.inputs.ContainerPortArgs;
import io.pulumi.azurenative.containerinstance.inputs.ContainerProbeArgs;
import io.pulumi.azurenative.containerinstance.inputs.EnvironmentVariableArgs;
import io.pulumi.azurenative.containerinstance.inputs.ResourceRequirementsArgs;
import io.pulumi.azurenative.containerinstance.inputs.VolumeMountArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerArgs Empty = new ContainerArgs();

    @InputImport(name="command")
    private final @Nullable Input<List<String>> command;

    public Input<List<String>> getCommand() {
        return this.command == null ? Input.empty() : this.command;
    }

    @InputImport(name="environmentVariables")
    private final @Nullable Input<List<EnvironmentVariableArgs>> environmentVariables;

    public Input<List<EnvironmentVariableArgs>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Input.empty() : this.environmentVariables;
    }

    @InputImport(name="image", required=true)
    private final Input<String> image;

    public Input<String> getImage() {
        return this.image;
    }

    @InputImport(name="livenessProbe")
    private final @Nullable Input<ContainerProbeArgs> livenessProbe;

    public Input<ContainerProbeArgs> getLivenessProbe() {
        return this.livenessProbe == null ? Input.empty() : this.livenessProbe;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="ports")
    private final @Nullable Input<List<ContainerPortArgs>> ports;

    public Input<List<ContainerPortArgs>> getPorts() {
        return this.ports == null ? Input.empty() : this.ports;
    }

    @InputImport(name="readinessProbe")
    private final @Nullable Input<ContainerProbeArgs> readinessProbe;

    public Input<ContainerProbeArgs> getReadinessProbe() {
        return this.readinessProbe == null ? Input.empty() : this.readinessProbe;
    }

    @InputImport(name="resources", required=true)
    private final Input<ResourceRequirementsArgs> resources;

    public Input<ResourceRequirementsArgs> getResources() {
        return this.resources;
    }

    @InputImport(name="volumeMounts")
    private final @Nullable Input<List<VolumeMountArgs>> volumeMounts;

    public Input<List<VolumeMountArgs>> getVolumeMounts() {
        return this.volumeMounts == null ? Input.empty() : this.volumeMounts;
    }

    public ContainerArgs(
        @Nullable Input<List<String>> command,
        @Nullable Input<List<EnvironmentVariableArgs>> environmentVariables,
        Input<String> image,
        @Nullable Input<ContainerProbeArgs> livenessProbe,
        Input<String> name,
        @Nullable Input<List<ContainerPortArgs>> ports,
        @Nullable Input<ContainerProbeArgs> readinessProbe,
        Input<ResourceRequirementsArgs> resources,
        @Nullable Input<List<VolumeMountArgs>> volumeMounts) {
        this.command = command;
        this.environmentVariables = environmentVariables;
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.livenessProbe = livenessProbe;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.ports = ports;
        this.readinessProbe = readinessProbe;
        this.resources = Objects.requireNonNull(resources, "expected parameter 'resources' to be non-null");
        this.volumeMounts = volumeMounts;
    }

    private ContainerArgs() {
        this.command = Input.empty();
        this.environmentVariables = Input.empty();
        this.image = Input.empty();
        this.livenessProbe = Input.empty();
        this.name = Input.empty();
        this.ports = Input.empty();
        this.readinessProbe = Input.empty();
        this.resources = Input.empty();
        this.volumeMounts = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> command;
        private @Nullable Input<List<EnvironmentVariableArgs>> environmentVariables;
        private Input<String> image;
        private @Nullable Input<ContainerProbeArgs> livenessProbe;
        private Input<String> name;
        private @Nullable Input<List<ContainerPortArgs>> ports;
        private @Nullable Input<ContainerProbeArgs> readinessProbe;
        private Input<ResourceRequirementsArgs> resources;
        private @Nullable Input<List<VolumeMountArgs>> volumeMounts;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.command = defaults.command;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.image = defaults.image;
    	      this.livenessProbe = defaults.livenessProbe;
    	      this.name = defaults.name;
    	      this.ports = defaults.ports;
    	      this.readinessProbe = defaults.readinessProbe;
    	      this.resources = defaults.resources;
    	      this.volumeMounts = defaults.volumeMounts;
        }

        public Builder setCommand(@Nullable Input<List<String>> command) {
            this.command = command;
            return this;
        }

        public Builder setCommand(@Nullable List<String> command) {
            this.command = Input.ofNullable(command);
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable Input<List<EnvironmentVariableArgs>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder setEnvironmentVariables(@Nullable List<EnvironmentVariableArgs> environmentVariables) {
            this.environmentVariables = Input.ofNullable(environmentVariables);
            return this;
        }

        public Builder setImage(Input<String> image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setImage(String image) {
            this.image = Input.of(Objects.requireNonNull(image));
            return this;
        }

        public Builder setLivenessProbe(@Nullable Input<ContainerProbeArgs> livenessProbe) {
            this.livenessProbe = livenessProbe;
            return this;
        }

        public Builder setLivenessProbe(@Nullable ContainerProbeArgs livenessProbe) {
            this.livenessProbe = Input.ofNullable(livenessProbe);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPorts(@Nullable Input<List<ContainerPortArgs>> ports) {
            this.ports = ports;
            return this;
        }

        public Builder setPorts(@Nullable List<ContainerPortArgs> ports) {
            this.ports = Input.ofNullable(ports);
            return this;
        }

        public Builder setReadinessProbe(@Nullable Input<ContainerProbeArgs> readinessProbe) {
            this.readinessProbe = readinessProbe;
            return this;
        }

        public Builder setReadinessProbe(@Nullable ContainerProbeArgs readinessProbe) {
            this.readinessProbe = Input.ofNullable(readinessProbe);
            return this;
        }

        public Builder setResources(Input<ResourceRequirementsArgs> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder setResources(ResourceRequirementsArgs resources) {
            this.resources = Input.of(Objects.requireNonNull(resources));
            return this;
        }

        public Builder setVolumeMounts(@Nullable Input<List<VolumeMountArgs>> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }

        public Builder setVolumeMounts(@Nullable List<VolumeMountArgs> volumeMounts) {
            this.volumeMounts = Input.ofNullable(volumeMounts);
            return this;
        }

        public ContainerArgs build() {
            return new ContainerArgs(command, environmentVariables, image, livenessProbe, name, ports, readinessProbe, resources, volumeMounts);
        }
    }
}
