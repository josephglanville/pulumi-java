// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1beta1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.gkehub_v1beta1.inputs.ResourceOptionsArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * KubernetesResource contains the YAML manifests and configuration for Membership Kubernetes resources in the cluster. After CreateMembership or UpdateMembership, these resources should be re-applied in the cluster.
 * 
 */
public final class KubernetesResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final KubernetesResourceArgs Empty = new KubernetesResourceArgs();

    /**
     * Input only. The YAML representation of the Membership CR. This field is ignored for GKE clusters where Hub can read the CR directly. Callers should provide the CR that is currently present in the cluster during CreateMembership or UpdateMembership, or leave this field empty if none exists. The CR manifest is used to validate the cluster has not been registered with another Membership.
     * 
     */
    @InputImport(name="membershipCrManifest")
      private final @Nullable Output<String> membershipCrManifest;

    public Output<String> getMembershipCrManifest() {
        return this.membershipCrManifest == null ? Output.empty() : this.membershipCrManifest;
    }

    /**
     * Optional. Options for Kubernetes resource generation.
     * 
     */
    @InputImport(name="resourceOptions")
      private final @Nullable Output<ResourceOptionsArgs> resourceOptions;

    public Output<ResourceOptionsArgs> getResourceOptions() {
        return this.resourceOptions == null ? Output.empty() : this.resourceOptions;
    }

    public KubernetesResourceArgs(
        @Nullable Output<String> membershipCrManifest,
        @Nullable Output<ResourceOptionsArgs> resourceOptions) {
        this.membershipCrManifest = membershipCrManifest;
        this.resourceOptions = resourceOptions;
    }

    private KubernetesResourceArgs() {
        this.membershipCrManifest = Output.empty();
        this.resourceOptions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KubernetesResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> membershipCrManifest;
        private @Nullable Output<ResourceOptionsArgs> resourceOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(KubernetesResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.membershipCrManifest = defaults.membershipCrManifest;
    	      this.resourceOptions = defaults.resourceOptions;
        }

        public Builder membershipCrManifest(@Nullable Output<String> membershipCrManifest) {
            this.membershipCrManifest = membershipCrManifest;
            return this;
        }

        public Builder membershipCrManifest(@Nullable String membershipCrManifest) {
            this.membershipCrManifest = Output.ofNullable(membershipCrManifest);
            return this;
        }

        public Builder resourceOptions(@Nullable Output<ResourceOptionsArgs> resourceOptions) {
            this.resourceOptions = resourceOptions;
            return this;
        }

        public Builder resourceOptions(@Nullable ResourceOptionsArgs resourceOptions) {
            this.resourceOptions = Output.ofNullable(resourceOptions);
            return this;
        }
        public KubernetesResourceArgs build() {
            return new KubernetesResourceArgs(membershipCrManifest, resourceOptions);
        }
    }
}
