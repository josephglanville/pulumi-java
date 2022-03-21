// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gkehub_v1alpha2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * ResourceOptions represent options for Kubernetes resource generation.
 * 
 */
public final class ResourceOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceOptionsArgs Empty = new ResourceOptionsArgs();

    /**
     * Optional. The Connect agent version to use for connect_resources. Defaults to the latest GKE Connect version. The version must be a currently supported version, obsolete versions will be rejected.
     * 
     */
    @Import(name="connectVersion")
      private final @Nullable Output<String> connectVersion;

    public Output<String> getConnectVersion() {
        return this.connectVersion == null ? Output.empty() : this.connectVersion;
    }

    /**
     * Optional. Major version of the Kubernetes cluster. This is only used to determine which version to use for the CustomResourceDefinition resources, `apiextensions/v1beta1` or`apiextensions/v1`.
     * 
     */
    @Import(name="k8sVersion")
      private final @Nullable Output<String> k8sVersion;

    public Output<String> getK8sVersion() {
        return this.k8sVersion == null ? Output.empty() : this.k8sVersion;
    }

    /**
     * Optional. Use `apiextensions/v1beta1` instead of `apiextensions/v1` for CustomResourceDefinition resources. This option should be set for clusters with Kubernetes apiserver versions <1.16.
     * 
     */
    @Import(name="v1beta1Crd")
      private final @Nullable Output<Boolean> v1beta1Crd;

    public Output<Boolean> getV1beta1Crd() {
        return this.v1beta1Crd == null ? Output.empty() : this.v1beta1Crd;
    }

    public ResourceOptionsArgs(
        @Nullable Output<String> connectVersion,
        @Nullable Output<String> k8sVersion,
        @Nullable Output<Boolean> v1beta1Crd) {
        this.connectVersion = connectVersion;
        this.k8sVersion = k8sVersion;
        this.v1beta1Crd = v1beta1Crd;
    }

    private ResourceOptionsArgs() {
        this.connectVersion = Output.empty();
        this.k8sVersion = Output.empty();
        this.v1beta1Crd = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> connectVersion;
        private @Nullable Output<String> k8sVersion;
        private @Nullable Output<Boolean> v1beta1Crd;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectVersion = defaults.connectVersion;
    	      this.k8sVersion = defaults.k8sVersion;
    	      this.v1beta1Crd = defaults.v1beta1Crd;
        }

        public Builder connectVersion(@Nullable Output<String> connectVersion) {
            this.connectVersion = connectVersion;
            return this;
        }
        public Builder connectVersion(@Nullable String connectVersion) {
            this.connectVersion = Output.ofNullable(connectVersion);
            return this;
        }
        public Builder k8sVersion(@Nullable Output<String> k8sVersion) {
            this.k8sVersion = k8sVersion;
            return this;
        }
        public Builder k8sVersion(@Nullable String k8sVersion) {
            this.k8sVersion = Output.ofNullable(k8sVersion);
            return this;
        }
        public Builder v1beta1Crd(@Nullable Output<Boolean> v1beta1Crd) {
            this.v1beta1Crd = v1beta1Crd;
            return this;
        }
        public Builder v1beta1Crd(@Nullable Boolean v1beta1Crd) {
            this.v1beta1Crd = Output.ofNullable(v1beta1Crd);
            return this;
        }        public ResourceOptionsArgs build() {
            return new ResourceOptionsArgs(connectVersion, k8sVersion, v1beta1Crd);
        }
    }
}
