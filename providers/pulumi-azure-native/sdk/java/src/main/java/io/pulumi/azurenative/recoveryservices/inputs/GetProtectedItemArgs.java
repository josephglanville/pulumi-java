// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetProtectedItemArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetProtectedItemArgs Empty = new GetProtectedItemArgs();

    /**
     * Container name associated with the backed up item.
     * 
     */
    @Import(name="containerName", required=true)
      private final String containerName;

    public String getContainerName() {
        return this.containerName;
    }

    /**
     * Fabric name associated with the backed up item.
     * 
     */
    @Import(name="fabricName", required=true)
      private final String fabricName;

    public String getFabricName() {
        return this.fabricName;
    }

    /**
     * OData filter options.
     * 
     */
    @Import(name="filter")
      private final @Nullable String filter;

    public Optional<String> getFilter() {
        return this.filter == null ? Optional.empty() : Optional.ofNullable(this.filter);
    }

    /**
     * Backed up item name whose details are to be fetched.
     * 
     */
    @Import(name="protectedItemName", required=true)
      private final String protectedItemName;

    public String getProtectedItemName() {
        return this.protectedItemName;
    }

    /**
     * The name of the resource group where the recovery services vault is present.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
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

    public GetProtectedItemArgs(
        String containerName,
        String fabricName,
        @Nullable String filter,
        String protectedItemName,
        String resourceGroupName,
        String vaultName) {
        this.containerName = Objects.requireNonNull(containerName, "expected parameter 'containerName' to be non-null");
        this.fabricName = Objects.requireNonNull(fabricName, "expected parameter 'fabricName' to be non-null");
        this.filter = filter;
        this.protectedItemName = Objects.requireNonNull(protectedItemName, "expected parameter 'protectedItemName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vaultName = Objects.requireNonNull(vaultName, "expected parameter 'vaultName' to be non-null");
    }

    private GetProtectedItemArgs() {
        this.containerName = null;
        this.fabricName = null;
        this.filter = null;
        this.protectedItemName = null;
        this.resourceGroupName = null;
        this.vaultName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProtectedItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String containerName;
        private String fabricName;
        private @Nullable String filter;
        private String protectedItemName;
        private String resourceGroupName;
        private String vaultName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProtectedItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.fabricName = defaults.fabricName;
    	      this.filter = defaults.filter;
    	      this.protectedItemName = defaults.protectedItemName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vaultName = defaults.vaultName;
        }

        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        public Builder fabricName(String fabricName) {
            this.fabricName = Objects.requireNonNull(fabricName);
            return this;
        }
        public Builder filter(@Nullable String filter) {
            this.filter = filter;
            return this;
        }
        public Builder protectedItemName(String protectedItemName) {
            this.protectedItemName = Objects.requireNonNull(protectedItemName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder vaultName(String vaultName) {
            this.vaultName = Objects.requireNonNull(vaultName);
            return this;
        }        public GetProtectedItemArgs build() {
            return new GetProtectedItemArgs(containerName, fabricName, filter, protectedItemName, resourceGroupName, vaultName);
        }
    }
}
