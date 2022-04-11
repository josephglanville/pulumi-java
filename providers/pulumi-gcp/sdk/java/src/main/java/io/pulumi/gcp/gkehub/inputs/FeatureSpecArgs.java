// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.gkehub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.gkehub.inputs.FeatureSpecMulticlusteringressArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FeatureSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final FeatureSpecArgs Empty = new FeatureSpecArgs();

    /**
     * Multicluster Ingress-specific spec.
     * The `multiclusteringress` block supports:
     * 
     */
    @Import(name="multiclusteringress")
      private final @Nullable Output<FeatureSpecMulticlusteringressArgs> multiclusteringress;

    public Output<FeatureSpecMulticlusteringressArgs> getMulticlusteringress() {
        return this.multiclusteringress == null ? Codegen.empty() : this.multiclusteringress;
    }

    public FeatureSpecArgs(@Nullable Output<FeatureSpecMulticlusteringressArgs> multiclusteringress) {
        this.multiclusteringress = multiclusteringress;
    }

    private FeatureSpecArgs() {
        this.multiclusteringress = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FeatureSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<FeatureSpecMulticlusteringressArgs> multiclusteringress;

        public Builder() {
    	      // Empty
        }

        public Builder(FeatureSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.multiclusteringress = defaults.multiclusteringress;
        }

        public Builder multiclusteringress(@Nullable Output<FeatureSpecMulticlusteringressArgs> multiclusteringress) {
            this.multiclusteringress = multiclusteringress;
            return this;
        }
        public Builder multiclusteringress(@Nullable FeatureSpecMulticlusteringressArgs multiclusteringress) {
            this.multiclusteringress = Codegen.ofNullable(multiclusteringress);
            return this;
        }        public FeatureSpecArgs build() {
            return new FeatureSpecArgs(multiclusteringress);
        }
    }
}
