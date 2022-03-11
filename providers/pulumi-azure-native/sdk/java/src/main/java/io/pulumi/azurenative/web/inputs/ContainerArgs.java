// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.azurenative.web.inputs.ContainerResourcesArgs;
import io.pulumi.azurenative.web.inputs.EnvironmentVarArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Container App container definition.
 * 
 */
public final class ContainerArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerArgs Empty = new ContainerArgs();

    /**
     * Container start command arguments.
     * 
     */
    @InputImport(name="args")
      private final @Nullable Output<List<String>> args;

    public Output<List<String>> getArgs() {
        return this.args == null ? Output.empty() : this.args;
    }

    /**
     * Container start command.
     * 
     */
    @InputImport(name="command")
      private final @Nullable Output<List<String>> command;

    public Output<List<String>> getCommand() {
        return this.command == null ? Output.empty() : this.command;
    }

    /**
     * Container environment variables.
     * 
     */
    @InputImport(name="env")
      private final @Nullable Output<List<EnvironmentVarArgs>> env;

    public Output<List<EnvironmentVarArgs>> getEnv() {
        return this.env == null ? Output.empty() : this.env;
    }

    /**
     * Container image tag.
     * 
     */
    @InputImport(name="image")
      private final @Nullable Output<String> image;

    public Output<String> getImage() {
        return this.image == null ? Output.empty() : this.image;
    }

    /**
     * Custom container name.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Container resource requirements.
     * 
     */
    @InputImport(name="resources")
      private final @Nullable Output<ContainerResourcesArgs> resources;

    public Output<ContainerResourcesArgs> getResources() {
        return this.resources == null ? Output.empty() : this.resources;
    }

    public ContainerArgs(
        @Nullable Output<List<String>> args,
        @Nullable Output<List<String>> command,
        @Nullable Output<List<EnvironmentVarArgs>> env,
        @Nullable Output<String> image,
        @Nullable Output<String> name,
        @Nullable Output<ContainerResourcesArgs> resources) {
        this.args = args;
        this.command = command;
        this.env = env;
        this.image = image;
        this.name = name;
        this.resources = resources;
    }

    private ContainerArgs() {
        this.args = Output.empty();
        this.command = Output.empty();
        this.env = Output.empty();
        this.image = Output.empty();
        this.name = Output.empty();
        this.resources = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> args;
        private @Nullable Output<List<String>> command;
        private @Nullable Output<List<EnvironmentVarArgs>> env;
        private @Nullable Output<String> image;
        private @Nullable Output<String> name;
        private @Nullable Output<ContainerResourcesArgs> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.args = defaults.args;
    	      this.command = defaults.command;
    	      this.env = defaults.env;
    	      this.image = defaults.image;
    	      this.name = defaults.name;
    	      this.resources = defaults.resources;
        }

        public Builder args(@Nullable Output<List<String>> args) {
            this.args = args;
            return this;
        }

        public Builder args(@Nullable List<String> args) {
            this.args = Output.ofNullable(args);
            return this;
        }

        public Builder command(@Nullable Output<List<String>> command) {
            this.command = command;
            return this;
        }

        public Builder command(@Nullable List<String> command) {
            this.command = Output.ofNullable(command);
            return this;
        }

        public Builder env(@Nullable Output<List<EnvironmentVarArgs>> env) {
            this.env = env;
            return this;
        }

        public Builder env(@Nullable List<EnvironmentVarArgs> env) {
            this.env = Output.ofNullable(env);
            return this;
        }

        public Builder image(@Nullable Output<String> image) {
            this.image = image;
            return this;
        }

        public Builder image(@Nullable String image) {
            this.image = Output.ofNullable(image);
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

        public Builder resources(@Nullable Output<ContainerResourcesArgs> resources) {
            this.resources = resources;
            return this;
        }

        public Builder resources(@Nullable ContainerResourcesArgs resources) {
            this.resources = Output.ofNullable(resources);
            return this;
        }
        public ContainerArgs build() {
            return new ContainerArgs(args, command, env, image, name, resources);
        }
    }
}
