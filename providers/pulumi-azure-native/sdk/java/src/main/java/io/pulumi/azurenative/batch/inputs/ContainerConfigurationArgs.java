// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.azurenative.batch.enums.ContainerType;
import io.pulumi.azurenative.batch.inputs.ContainerRegistryArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerConfigurationArgs Empty = new ContainerConfigurationArgs();

    /**
     * This is the full image reference, as would be specified to "docker pull". An image will be sourced from the default Docker registry unless the image is fully qualified with an alternative registry.
     * 
     */
    @Import(name="containerImageNames")
      private final @Nullable Output<List<String>> containerImageNames;

    public Output<List<String>> getContainerImageNames() {
        return this.containerImageNames == null ? Output.empty() : this.containerImageNames;
    }

    /**
     * If any images must be downloaded from a private registry which requires credentials, then those credentials must be provided here.
     * 
     */
    @Import(name="containerRegistries")
      private final @Nullable Output<List<ContainerRegistryArgs>> containerRegistries;

    public Output<List<ContainerRegistryArgs>> getContainerRegistries() {
        return this.containerRegistries == null ? Output.empty() : this.containerRegistries;
    }

    @Import(name="type", required=true)
      private final Output<ContainerType> type;

    public Output<ContainerType> getType() {
        return this.type;
    }

    public ContainerConfigurationArgs(
        @Nullable Output<List<String>> containerImageNames,
        @Nullable Output<List<ContainerRegistryArgs>> containerRegistries,
        Output<ContainerType> type) {
        this.containerImageNames = containerImageNames;
        this.containerRegistries = containerRegistries;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ContainerConfigurationArgs() {
        this.containerImageNames = Output.empty();
        this.containerRegistries = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> containerImageNames;
        private @Nullable Output<List<ContainerRegistryArgs>> containerRegistries;
        private Output<ContainerType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerImageNames = defaults.containerImageNames;
    	      this.containerRegistries = defaults.containerRegistries;
    	      this.type = defaults.type;
        }

        public Builder containerImageNames(@Nullable Output<List<String>> containerImageNames) {
            this.containerImageNames = containerImageNames;
            return this;
        }
        public Builder containerImageNames(@Nullable List<String> containerImageNames) {
            this.containerImageNames = Output.ofNullable(containerImageNames);
            return this;
        }
        public Builder containerImageNames(String... containerImageNames) {
            return containerImageNames(List.of(containerImageNames));
        }
        public Builder containerRegistries(@Nullable Output<List<ContainerRegistryArgs>> containerRegistries) {
            this.containerRegistries = containerRegistries;
            return this;
        }
        public Builder containerRegistries(@Nullable List<ContainerRegistryArgs> containerRegistries) {
            this.containerRegistries = Output.ofNullable(containerRegistries);
            return this;
        }
        public Builder containerRegistries(ContainerRegistryArgs... containerRegistries) {
            return containerRegistries(List.of(containerRegistries));
        }
        public Builder type(Output<ContainerType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(ContainerType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ContainerConfigurationArgs build() {
            return new ContainerConfigurationArgs(containerImageNames, containerRegistries, type);
        }
    }
}
