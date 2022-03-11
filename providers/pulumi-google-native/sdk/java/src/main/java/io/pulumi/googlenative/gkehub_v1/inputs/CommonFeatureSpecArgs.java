// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.gkehub_v1.inputs.AppDevExperienceFeatureSpecArgs;
import io.pulumi.googlenative.gkehub_v1.inputs.MultiClusterIngressFeatureSpecArgs;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * CommonFeatureSpec contains Hub-wide configuration information
 * 
 */
public final class CommonFeatureSpecArgs extends io.pulumi.resources.ResourceArgs {

    public static final CommonFeatureSpecArgs Empty = new CommonFeatureSpecArgs();

    /**
     * Appdevexperience specific spec.
     * 
     */
    @InputImport(name="appdevexperience")
      private final @Nullable Output<AppDevExperienceFeatureSpecArgs> appdevexperience;

    public Output<AppDevExperienceFeatureSpecArgs> getAppdevexperience() {
        return this.appdevexperience == null ? Output.empty() : this.appdevexperience;
    }

    /**
     * Multicluster Ingress-specific spec.
     * 
     */
    @InputImport(name="multiclusteringress")
      private final @Nullable Output<MultiClusterIngressFeatureSpecArgs> multiclusteringress;

    public Output<MultiClusterIngressFeatureSpecArgs> getMulticlusteringress() {
        return this.multiclusteringress == null ? Output.empty() : this.multiclusteringress;
    }

    public CommonFeatureSpecArgs(
        @Nullable Output<AppDevExperienceFeatureSpecArgs> appdevexperience,
        @Nullable Output<MultiClusterIngressFeatureSpecArgs> multiclusteringress) {
        this.appdevexperience = appdevexperience;
        this.multiclusteringress = multiclusteringress;
    }

    private CommonFeatureSpecArgs() {
        this.appdevexperience = Output.empty();
        this.multiclusteringress = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CommonFeatureSpecArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<AppDevExperienceFeatureSpecArgs> appdevexperience;
        private @Nullable Output<MultiClusterIngressFeatureSpecArgs> multiclusteringress;

        public Builder() {
    	      // Empty
        }

        public Builder(CommonFeatureSpecArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appdevexperience = defaults.appdevexperience;
    	      this.multiclusteringress = defaults.multiclusteringress;
        }

        public Builder appdevexperience(@Nullable Output<AppDevExperienceFeatureSpecArgs> appdevexperience) {
            this.appdevexperience = appdevexperience;
            return this;
        }

        public Builder appdevexperience(@Nullable AppDevExperienceFeatureSpecArgs appdevexperience) {
            this.appdevexperience = Output.ofNullable(appdevexperience);
            return this;
        }

        public Builder multiclusteringress(@Nullable Output<MultiClusterIngressFeatureSpecArgs> multiclusteringress) {
            this.multiclusteringress = multiclusteringress;
            return this;
        }

        public Builder multiclusteringress(@Nullable MultiClusterIngressFeatureSpecArgs multiclusteringress) {
            this.multiclusteringress = Output.ofNullable(multiclusteringress);
            return this;
        }
        public CommonFeatureSpecArgs build() {
            return new CommonFeatureSpecArgs(appdevexperience, multiclusteringress);
        }
    }
}
