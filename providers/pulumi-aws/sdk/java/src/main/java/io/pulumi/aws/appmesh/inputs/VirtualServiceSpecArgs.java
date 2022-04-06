// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualServiceSpecProviderArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualServiceSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualServiceSpecArgs Empty = new VirtualServiceSpecArgs();

    /**
     * The App Mesh object that is acting as the provider for a virtual service. You can specify a single virtual node or virtual router.
     * 
     */
    @Import(name="provider")
      private final @Nullable Output<VirtualServiceSpecProviderArgs> provider;

    public Output<VirtualServiceSpecProviderArgs> getProvider() {
        return this.provider == null ? Output.empty() : this.provider;
    }

    public VirtualServiceSpecArgs(@Nullable Output<VirtualServiceSpecProviderArgs> provider) {
        this.provider = provider;
    }

    private VirtualServiceSpecArgs() {
        this.provider = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualServiceSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualServiceSpecProviderArgs> provider;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualServiceSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.provider = defaults.provider;
        }

        public Builder provider(@Nullable Output<VirtualServiceSpecProviderArgs> provider) {
            this.provider = provider;
            return this;
        }
        public Builder provider(@Nullable VirtualServiceSpecProviderArgs provider) {
            this.provider = Output.ofNullable(provider);
            return this;
        }        public VirtualServiceSpecArgs build() {
            return new VirtualServiceSpecArgs(provider);
        }
    }
}