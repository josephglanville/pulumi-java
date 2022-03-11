// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AzureNodePoolConfigRootVolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureNodePoolConfigRootVolumeArgs Empty = new AzureNodePoolConfigRootVolumeArgs();

    /**
     * Optional. The size of the disk, in GiBs. When unspecified, a default value is provided. See the specific reference in the parent resource.
     * 
     */
    @InputImport(name="sizeGib")
      private final @Nullable Output<Integer> sizeGib;

    public Output<Integer> getSizeGib() {
        return this.sizeGib == null ? Output.empty() : this.sizeGib;
    }

    public AzureNodePoolConfigRootVolumeArgs(@Nullable Output<Integer> sizeGib) {
        this.sizeGib = sizeGib;
    }

    private AzureNodePoolConfigRootVolumeArgs() {
        this.sizeGib = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureNodePoolConfigRootVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> sizeGib;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureNodePoolConfigRootVolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sizeGib = defaults.sizeGib;
        }

        public Builder sizeGib(@Nullable Output<Integer> sizeGib) {
            this.sizeGib = sizeGib;
            return this;
        }

        public Builder sizeGib(@Nullable Integer sizeGib) {
            this.sizeGib = Output.ofNullable(sizeGib);
            return this;
        }
        public AzureNodePoolConfigRootVolumeArgs build() {
            return new AzureNodePoolConfigRootVolumeArgs(sizeGib);
        }
    }
}
