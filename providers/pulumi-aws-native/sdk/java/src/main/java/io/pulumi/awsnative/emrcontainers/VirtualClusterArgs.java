// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.emrcontainers;

import io.pulumi.awsnative.emrcontainers.inputs.VirtualClusterContainerProviderArgs;
import io.pulumi.awsnative.emrcontainers.inputs.VirtualClusterTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualClusterArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualClusterArgs Empty = new VirtualClusterArgs();

    /**
     * Container provider of the virtual cluster.
     * 
     */
    @InputImport(name="containerProvider", required=true)
      private final Input<VirtualClusterContainerProviderArgs> containerProvider;

    public Input<VirtualClusterContainerProviderArgs> getContainerProvider() {
        return this.containerProvider;
    }

    /**
     * Name of the virtual cluster.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * An array of key-value pairs to apply to this virtual cluster.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<VirtualClusterTagArgs>> tags;

    public Input<List<VirtualClusterTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public VirtualClusterArgs(
        Input<VirtualClusterContainerProviderArgs> containerProvider,
        @Nullable Input<String> name,
        @Nullable Input<List<VirtualClusterTagArgs>> tags) {
        this.containerProvider = Objects.requireNonNull(containerProvider, "expected parameter 'containerProvider' to be non-null");
        this.name = name;
        this.tags = tags;
    }

    private VirtualClusterArgs() {
        this.containerProvider = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualClusterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<VirtualClusterContainerProviderArgs> containerProvider;
        private @Nullable Input<String> name;
        private @Nullable Input<List<VirtualClusterTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualClusterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerProvider = defaults.containerProvider;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setContainerProvider(Input<VirtualClusterContainerProviderArgs> containerProvider) {
            this.containerProvider = Objects.requireNonNull(containerProvider);
            return this;
        }

        public Builder setContainerProvider(VirtualClusterContainerProviderArgs containerProvider) {
            this.containerProvider = Input.of(Objects.requireNonNull(containerProvider));
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

        public Builder setTags(@Nullable Input<List<VirtualClusterTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<VirtualClusterTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public VirtualClusterArgs build() {
            return new VirtualClusterArgs(containerProvider, name, tags);
        }
    }
}
