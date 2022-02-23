// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AzureClusterControlPlaneProxyConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureClusterControlPlaneProxyConfigGetArgs Empty = new AzureClusterControlPlaneProxyConfigGetArgs();

    /**
     * The ARM ID the of the resource group containing proxy keyvault. Resource group ids are formatted as `/subscriptions/<subscription-id>/resourceGroups/<resource-group-name>`
     * 
     */
    @InputImport(name="resourceGroupId", required=true)
      private final Input<String> resourceGroupId;

    public Input<String> getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * The URL the of the proxy setting secret with its version. Secret ids are formatted as `https:<key-vault-name>.vault.azure.net/secrets/<secret-name>/<secret-version>`.
     * 
     */
    @InputImport(name="secretId", required=true)
      private final Input<String> secretId;

    public Input<String> getSecretId() {
        return this.secretId;
    }

    public AzureClusterControlPlaneProxyConfigGetArgs(
        Input<String> resourceGroupId,
        Input<String> secretId) {
        this.resourceGroupId = Objects.requireNonNull(resourceGroupId, "expected parameter 'resourceGroupId' to be non-null");
        this.secretId = Objects.requireNonNull(secretId, "expected parameter 'secretId' to be non-null");
    }

    private AzureClusterControlPlaneProxyConfigGetArgs() {
        this.resourceGroupId = Input.empty();
        this.secretId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureClusterControlPlaneProxyConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> resourceGroupId;
        private Input<String> secretId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureClusterControlPlaneProxyConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupId = defaults.resourceGroupId;
    	      this.secretId = defaults.secretId;
        }

        public Builder setResourceGroupId(Input<String> resourceGroupId) {
            this.resourceGroupId = Objects.requireNonNull(resourceGroupId);
            return this;
        }

        public Builder setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = Input.of(Objects.requireNonNull(resourceGroupId));
            return this;
        }

        public Builder setSecretId(Input<String> secretId) {
            this.secretId = Objects.requireNonNull(secretId);
            return this;
        }

        public Builder setSecretId(String secretId) {
            this.secretId = Input.of(Objects.requireNonNull(secretId));
            return this;
        }
        public AzureClusterControlPlaneProxyConfigGetArgs build() {
            return new AzureClusterControlPlaneProxyConfigGetArgs(resourceGroupId, secretId);
        }
    }
}
