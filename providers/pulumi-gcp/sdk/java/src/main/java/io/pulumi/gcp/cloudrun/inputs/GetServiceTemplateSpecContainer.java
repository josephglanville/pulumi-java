// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudrun.inputs;

import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.cloudrun.inputs.GetServiceTemplateSpecContainerEnv;
import io.pulumi.gcp.cloudrun.inputs.GetServiceTemplateSpecContainerEnvFrom;
import io.pulumi.gcp.cloudrun.inputs.GetServiceTemplateSpecContainerPort;
import io.pulumi.gcp.cloudrun.inputs.GetServiceTemplateSpecContainerResource;
import io.pulumi.gcp.cloudrun.inputs.GetServiceTemplateSpecContainerVolumeMount;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class GetServiceTemplateSpecContainer extends io.pulumi.resources.InvokeArgs {

    public static final GetServiceTemplateSpecContainer Empty = new GetServiceTemplateSpecContainer();

    @InputImport(name="args", required=true)
      private final List<String> args;

    public List<String> getArgs() {
        return this.args;
    }

    @InputImport(name="commands", required=true)
      private final List<String> commands;

    public List<String> getCommands() {
        return this.commands;
    }

    @InputImport(name="envFroms", required=true)
      private final List<GetServiceTemplateSpecContainerEnvFrom> envFroms;

    public List<GetServiceTemplateSpecContainerEnvFrom> getEnvFroms() {
        return this.envFroms;
    }

    @InputImport(name="envs", required=true)
      private final List<GetServiceTemplateSpecContainerEnv> envs;

    public List<GetServiceTemplateSpecContainerEnv> getEnvs() {
        return this.envs;
    }

    @InputImport(name="image", required=true)
      private final String image;

    public String getImage() {
        return this.image;
    }

    @InputImport(name="ports", required=true)
      private final List<GetServiceTemplateSpecContainerPort> ports;

    public List<GetServiceTemplateSpecContainerPort> getPorts() {
        return this.ports;
    }

    @InputImport(name="resources", required=true)
      private final List<GetServiceTemplateSpecContainerResource> resources;

    public List<GetServiceTemplateSpecContainerResource> getResources() {
        return this.resources;
    }

    @InputImport(name="volumeMounts", required=true)
      private final List<GetServiceTemplateSpecContainerVolumeMount> volumeMounts;

    public List<GetServiceTemplateSpecContainerVolumeMount> getVolumeMounts() {
        return this.volumeMounts;
    }

    @InputImport(name="workingDir", required=true)
      private final String workingDir;

    public String getWorkingDir() {
        return this.workingDir;
    }

    public GetServiceTemplateSpecContainer(
        List<String> args,
        List<String> commands,
        List<GetServiceTemplateSpecContainerEnvFrom> envFroms,
        List<GetServiceTemplateSpecContainerEnv> envs,
        String image,
        List<GetServiceTemplateSpecContainerPort> ports,
        List<GetServiceTemplateSpecContainerResource> resources,
        List<GetServiceTemplateSpecContainerVolumeMount> volumeMounts,
        String workingDir) {
        this.args = Objects.requireNonNull(args, "expected parameter 'args' to be non-null");
        this.commands = Objects.requireNonNull(commands, "expected parameter 'commands' to be non-null");
        this.envFroms = Objects.requireNonNull(envFroms, "expected parameter 'envFroms' to be non-null");
        this.envs = Objects.requireNonNull(envs, "expected parameter 'envs' to be non-null");
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.ports = Objects.requireNonNull(ports, "expected parameter 'ports' to be non-null");
        this.resources = Objects.requireNonNull(resources, "expected parameter 'resources' to be non-null");
        this.volumeMounts = Objects.requireNonNull(volumeMounts, "expected parameter 'volumeMounts' to be non-null");
        this.workingDir = Objects.requireNonNull(workingDir, "expected parameter 'workingDir' to be non-null");
    }

    private GetServiceTemplateSpecContainer() {
        this.args = List.of();
        this.commands = List.of();
        this.envFroms = List.of();
        this.envs = List.of();
        this.image = null;
        this.ports = List.of();
        this.resources = List.of();
        this.volumeMounts = List.of();
        this.workingDir = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceTemplateSpecContainer defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> args;
        private List<String> commands;
        private List<GetServiceTemplateSpecContainerEnvFrom> envFroms;
        private List<GetServiceTemplateSpecContainerEnv> envs;
        private String image;
        private List<GetServiceTemplateSpecContainerPort> ports;
        private List<GetServiceTemplateSpecContainerResource> resources;
        private List<GetServiceTemplateSpecContainerVolumeMount> volumeMounts;
        private String workingDir;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServiceTemplateSpecContainer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.commands = defaults.commands;
    	      this.envFroms = defaults.envFroms;
    	      this.envs = defaults.envs;
    	      this.image = defaults.image;
    	      this.ports = defaults.ports;
    	      this.resources = defaults.resources;
    	      this.volumeMounts = defaults.volumeMounts;
    	      this.workingDir = defaults.workingDir;
        }

        public Builder setArgs(List<String> args) {
            this.args = Objects.requireNonNull(args);
            return this;
        }

        public Builder setCommands(List<String> commands) {
            this.commands = Objects.requireNonNull(commands);
            return this;
        }

        public Builder setEnvFroms(List<GetServiceTemplateSpecContainerEnvFrom> envFroms) {
            this.envFroms = Objects.requireNonNull(envFroms);
            return this;
        }

        public Builder setEnvs(List<GetServiceTemplateSpecContainerEnv> envs) {
            this.envs = Objects.requireNonNull(envs);
            return this;
        }

        public Builder setImage(String image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }

        public Builder setPorts(List<GetServiceTemplateSpecContainerPort> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }

        public Builder setResources(List<GetServiceTemplateSpecContainerResource> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }

        public Builder setVolumeMounts(List<GetServiceTemplateSpecContainerVolumeMount> volumeMounts) {
            this.volumeMounts = Objects.requireNonNull(volumeMounts);
            return this;
        }

        public Builder setWorkingDir(String workingDir) {
            this.workingDir = Objects.requireNonNull(workingDir);
            return this;
        }
        public GetServiceTemplateSpecContainer build() {
            return new GetServiceTemplateSpecContainer(args, commands, envFroms, envs, image, ports, resources, volumeMounts, workingDir);
        }
    }
}
