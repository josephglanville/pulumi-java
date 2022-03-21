// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.run_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2ContainerPortArgs;
import io.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2EnvVarArgs;
import io.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2ResourceRequirementsArgs;
import io.pulumi.googlenative.run_v2.inputs.GoogleCloudRunOpV2VolumeMountArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * A single application container. This specifies both the container to run, the command to run in the container and the arguments to supply to it. Note that additional arguments may be supplied by the system to the container at runtime.
 * 
 */
public final class GoogleCloudRunOpV2ContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRunOpV2ContainerArgs Empty = new GoogleCloudRunOpV2ContainerArgs();

    /**
     * Arguments to the entrypoint. The docker image's CMD is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @Import(name="args")
      private final @Nullable Output<List<String>> args;

    public Output<List<String>> getArgs() {
        return this.args == null ? Output.empty() : this.args;
    }

    /**
     * Entrypoint array. Not executed within a shell. The docker image's ENTRYPOINT is used if this is not provided. Variable references $(VAR_NAME) are expanded using the container's environment. If a variable cannot be resolved, the reference in the input string will be unchanged. The $(VAR_NAME) syntax can be escaped with a double $$, ie: $$(VAR_NAME). Escaped references will never be expanded, regardless of whether the variable exists or not. More info: https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell
     * 
     */
    @Import(name="command")
      private final @Nullable Output<List<String>> command;

    public Output<List<String>> getCommand() {
        return this.command == null ? Output.empty() : this.command;
    }

    /**
     * List of environment variables to set in the container.
     * 
     */
    @Import(name="env")
      private final @Nullable Output<List<GoogleCloudRunOpV2EnvVarArgs>> env;

    public Output<List<GoogleCloudRunOpV2EnvVarArgs>> getEnv() {
        return this.env == null ? Output.empty() : this.env;
    }

    /**
     * URL of the Container image in Google Container Registry or Docker More info: https://kubernetes.io/docs/concepts/containers/images
     * 
     */
    @Import(name="image", required=true)
      private final Output<String> image;

    public Output<String> getImage() {
        return this.image;
    }

    /**
     * Name of the container specified as a DNS_LABEL.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * List of ports to expose from the container. Only a single port can be specified. The specified ports must be listening on all interfaces (0.0.0.0) within the container to be accessible. If omitted, a port number will be chosen and passed to the container through the PORT environment variable for the container to listen on.
     * 
     */
    @Import(name="ports")
      private final @Nullable Output<List<GoogleCloudRunOpV2ContainerPortArgs>> ports;

    public Output<List<GoogleCloudRunOpV2ContainerPortArgs>> getPorts() {
        return this.ports == null ? Output.empty() : this.ports;
    }

    /**
     * Compute Resource requirements by this container. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#resources
     * 
     */
    @Import(name="resources")
      private final @Nullable Output<GoogleCloudRunOpV2ResourceRequirementsArgs> resources;

    public Output<GoogleCloudRunOpV2ResourceRequirementsArgs> getResources() {
        return this.resources == null ? Output.empty() : this.resources;
    }

    /**
     * Volume to mount into the container's filesystem.
     * 
     */
    @Import(name="volumeMounts")
      private final @Nullable Output<List<GoogleCloudRunOpV2VolumeMountArgs>> volumeMounts;

    public Output<List<GoogleCloudRunOpV2VolumeMountArgs>> getVolumeMounts() {
        return this.volumeMounts == null ? Output.empty() : this.volumeMounts;
    }

    public GoogleCloudRunOpV2ContainerArgs(
        @Nullable Output<List<String>> args,
        @Nullable Output<List<String>> command,
        @Nullable Output<List<GoogleCloudRunOpV2EnvVarArgs>> env,
        Output<String> image,
        @Nullable Output<String> name,
        @Nullable Output<List<GoogleCloudRunOpV2ContainerPortArgs>> ports,
        @Nullable Output<GoogleCloudRunOpV2ResourceRequirementsArgs> resources,
        @Nullable Output<List<GoogleCloudRunOpV2VolumeMountArgs>> volumeMounts) {
        this.args = args;
        this.command = command;
        this.env = env;
        this.image = Objects.requireNonNull(image, "expected parameter 'image' to be non-null");
        this.name = name;
        this.ports = ports;
        this.resources = resources;
        this.volumeMounts = volumeMounts;
    }

    private GoogleCloudRunOpV2ContainerArgs() {
        this.args = Output.empty();
        this.command = Output.empty();
        this.env = Output.empty();
        this.image = Output.empty();
        this.name = Output.empty();
        this.ports = Output.empty();
        this.resources = Output.empty();
        this.volumeMounts = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRunOpV2ContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> args;
        private @Nullable Output<List<String>> command;
        private @Nullable Output<List<GoogleCloudRunOpV2EnvVarArgs>> env;
        private Output<String> image;
        private @Nullable Output<String> name;
        private @Nullable Output<List<GoogleCloudRunOpV2ContainerPortArgs>> ports;
        private @Nullable Output<GoogleCloudRunOpV2ResourceRequirementsArgs> resources;
        private @Nullable Output<List<GoogleCloudRunOpV2VolumeMountArgs>> volumeMounts;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRunOpV2ContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.command = defaults.command;
    	      this.env = defaults.env;
    	      this.image = defaults.image;
    	      this.name = defaults.name;
    	      this.ports = defaults.ports;
    	      this.resources = defaults.resources;
    	      this.volumeMounts = defaults.volumeMounts;
        }

        public Builder args(@Nullable Output<List<String>> args) {
            this.args = args;
            return this;
        }
        public Builder args(@Nullable List<String> args) {
            this.args = Output.ofNullable(args);
            return this;
        }
        public Builder args(String... args) {
            return args(List.of(args));
        }
        public Builder command(@Nullable Output<List<String>> command) {
            this.command = command;
            return this;
        }
        public Builder command(@Nullable List<String> command) {
            this.command = Output.ofNullable(command);
            return this;
        }
        public Builder command(String... command) {
            return command(List.of(command));
        }
        public Builder env(@Nullable Output<List<GoogleCloudRunOpV2EnvVarArgs>> env) {
            this.env = env;
            return this;
        }
        public Builder env(@Nullable List<GoogleCloudRunOpV2EnvVarArgs> env) {
            this.env = Output.ofNullable(env);
            return this;
        }
        public Builder env(GoogleCloudRunOpV2EnvVarArgs... env) {
            return env(List.of(env));
        }
        public Builder image(Output<String> image) {
            this.image = Objects.requireNonNull(image);
            return this;
        }
        public Builder image(String image) {
            this.image = Output.of(Objects.requireNonNull(image));
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
        public Builder ports(@Nullable Output<List<GoogleCloudRunOpV2ContainerPortArgs>> ports) {
            this.ports = ports;
            return this;
        }
        public Builder ports(@Nullable List<GoogleCloudRunOpV2ContainerPortArgs> ports) {
            this.ports = Output.ofNullable(ports);
            return this;
        }
        public Builder ports(GoogleCloudRunOpV2ContainerPortArgs... ports) {
            return ports(List.of(ports));
        }
        public Builder resources(@Nullable Output<GoogleCloudRunOpV2ResourceRequirementsArgs> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(@Nullable GoogleCloudRunOpV2ResourceRequirementsArgs resources) {
            this.resources = Output.ofNullable(resources);
            return this;
        }
        public Builder volumeMounts(@Nullable Output<List<GoogleCloudRunOpV2VolumeMountArgs>> volumeMounts) {
            this.volumeMounts = volumeMounts;
            return this;
        }
        public Builder volumeMounts(@Nullable List<GoogleCloudRunOpV2VolumeMountArgs> volumeMounts) {
            this.volumeMounts = Output.ofNullable(volumeMounts);
            return this;
        }
        public Builder volumeMounts(GoogleCloudRunOpV2VolumeMountArgs... volumeMounts) {
            return volumeMounts(List.of(volumeMounts));
        }        public GoogleCloudRunOpV2ContainerArgs build() {
            return new GoogleCloudRunOpV2ContainerArgs(args, command, env, image, name, ports, resources, volumeMounts);
        }
    }
}
