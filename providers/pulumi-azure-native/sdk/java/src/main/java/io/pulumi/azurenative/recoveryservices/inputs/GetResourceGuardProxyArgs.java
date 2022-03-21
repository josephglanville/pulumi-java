// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetResourceGuardProxyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetResourceGuardProxyArgs Empty = new GetResourceGuardProxyArgs();

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @Import(name="resourceGuardProxyName", required=true)
      private final String resourceGuardProxyName;

    public String getResourceGuardProxyName() {
        return this.resourceGuardProxyName;
    }

    /**
     * The name of the recovery services vault.
     * 
     */
    @Import(name="vaultName", required=true)
      private final String vaultName;

    public String getVaultName() {
        return this.vaultName;
    }

    public GetResourceGuardProxyArgs(
        String resourceGroupName,
        String resourceGuardProxyName,
        String vaultName) {
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceGuardProxyName = Objects.requireNonNull(resourceGuardProxyName, "expected parameter 'resourceGuardProxyName' to be non-null");
        this.vaultName = Objects.requireNonNull(vaultName, "expected parameter 'vaultName' to be non-null");
    }

    private GetResourceGuardProxyArgs() {
        this.resourceGroupName = null;
        this.resourceGuardProxyName = null;
        this.vaultName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceGuardProxyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String resourceGroupName;
        private String resourceGuardProxyName;
        private String vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResourceGuardProxyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceGuardProxyName = defaults.resourceGuardProxyName;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGuardProxyName(String resourceGuardProxyName) {
            this.resourceGuardProxyName = Objects.requireNonNull(resourceGuardProxyName);
            return this;
        }
        public Builder vaultName(String vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }        public GetResourceGuardProxyArgs build() {
            return new GetResourceGuardProxyArgs(resourceGroupName, resourceGuardProxyName, vaultName);
        }
    }
}
