// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterAutoscalingAutoProvisioningDefaultsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterAutoscalingAutoProvisioningDefaultsGetArgs Empty = new ClusterClusterAutoscalingAutoProvisioningDefaultsGetArgs();

    /**
     * The image type to use for this node. Note that changing the image type
     * will delete and recreate all nodes in the node pool.
     * 
     */
    @InputImport(name="imageType")
      private final @Nullable Input<String> imageType;

    public Input<String> getImageType() {
        return this.imageType == null ? Input.empty() : this.imageType;
    }

    /**
     * Minimum CPU platform to be used by this instance.
     * The instance may be scheduled on the specified or newer CPU platform. Applicable
     * values are the friendly names of CPU platforms, such as `Intel Haswell`. See the
     * [official documentation](https://cloud.google.com/compute/docs/instances/specify-min-cpu-platform)
     * for more information.
     * 
     */
    @InputImport(name="minCpuPlatform")
      private final @Nullable Input<String> minCpuPlatform;

    public Input<String> getMinCpuPlatform() {
        return this.minCpuPlatform == null ? Input.empty() : this.minCpuPlatform;
    }

    /**
     * The set of Google API scopes to be made available
     * on all of the node VMs under the "default" service account.
     * Use the "https://www.googleapis.com/auth/cloud-platform" scope to grant access to all APIs. It is recommended that you set `service_account` to a non-default service account and grant IAM roles to that service account for only the resources that it needs.
     * 
     */
    @InputImport(name="oauthScopes")
      private final @Nullable Input<List<String>> oauthScopes;

    public Input<List<String>> getOauthScopes() {
        return this.oauthScopes == null ? Input.empty() : this.oauthScopes;
    }

    /**
     * The service account to be used by the Node VMs.
     * If not specified, the "default" service account is used.
     * 
     */
    @InputImport(name="serviceAccount")
      private final @Nullable Input<String> serviceAccount;

    public Input<String> getServiceAccount() {
        return this.serviceAccount == null ? Input.empty() : this.serviceAccount;
    }

    public ClusterClusterAutoscalingAutoProvisioningDefaultsGetArgs(
        @Nullable Input<String> imageType,
        @Nullable Input<String> minCpuPlatform,
        @Nullable Input<List<String>> oauthScopes,
        @Nullable Input<String> serviceAccount) {
        this.imageType = imageType;
        this.minCpuPlatform = minCpuPlatform;
        this.oauthScopes = oauthScopes;
        this.serviceAccount = serviceAccount;
    }

    private ClusterClusterAutoscalingAutoProvisioningDefaultsGetArgs() {
        this.imageType = Input.empty();
        this.minCpuPlatform = Input.empty();
        this.oauthScopes = Input.empty();
        this.serviceAccount = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterAutoscalingAutoProvisioningDefaultsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> imageType;
        private @Nullable Input<String> minCpuPlatform;
        private @Nullable Input<List<String>> oauthScopes;
        private @Nullable Input<String> serviceAccount;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterAutoscalingAutoProvisioningDefaultsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageType = defaults.imageType;
    	      this.minCpuPlatform = defaults.minCpuPlatform;
    	      this.oauthScopes = defaults.oauthScopes;
    	      this.serviceAccount = defaults.serviceAccount;
        }

        public Builder setImageType(@Nullable Input<String> imageType) {
            this.imageType = imageType;
            return this;
        }

        public Builder setImageType(@Nullable String imageType) {
            this.imageType = Input.ofNullable(imageType);
            return this;
        }

        public Builder setMinCpuPlatform(@Nullable Input<String> minCpuPlatform) {
            this.minCpuPlatform = minCpuPlatform;
            return this;
        }

        public Builder setMinCpuPlatform(@Nullable String minCpuPlatform) {
            this.minCpuPlatform = Input.ofNullable(minCpuPlatform);
            return this;
        }

        public Builder setOauthScopes(@Nullable Input<List<String>> oauthScopes) {
            this.oauthScopes = oauthScopes;
            return this;
        }

        public Builder setOauthScopes(@Nullable List<String> oauthScopes) {
            this.oauthScopes = Input.ofNullable(oauthScopes);
            return this;
        }

        public Builder setServiceAccount(@Nullable Input<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }

        public Builder setServiceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Input.ofNullable(serviceAccount);
            return this;
        }
        public ClusterClusterAutoscalingAutoProvisioningDefaultsGetArgs build() {
            return new ClusterClusterAutoscalingAutoProvisioningDefaultsGetArgs(imageType, minCpuPlatform, oauthScopes, serviceAccount);
        }
    }
}
