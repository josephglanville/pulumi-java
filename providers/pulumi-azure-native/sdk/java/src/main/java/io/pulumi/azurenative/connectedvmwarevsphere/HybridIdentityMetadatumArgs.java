// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HybridIdentityMetadatumArgs extends io.pulumi.resources.ResourceArgs {

    public static final HybridIdentityMetadatumArgs Empty = new HybridIdentityMetadatumArgs();

    /**
     * Name of the hybridIdentityMetadata.
     * 
     */
    @InputImport(name="metadataName")
      private final @Nullable Input<String> metadataName;

    public Input<String> getMetadataName() {
        return this.metadataName == null ? Input.empty() : this.metadataName;
    }

    /**
     * Gets or sets the Public Key.
     * 
     */
    @InputImport(name="publicKey")
      private final @Nullable Input<String> publicKey;

    public Input<String> getPublicKey() {
        return this.publicKey == null ? Input.empty() : this.publicKey;
    }

    /**
     * The Resource Group Name.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of the vm.
     * 
     */
    @InputImport(name="virtualMachineName", required=true)
      private final Input<String> virtualMachineName;

    public Input<String> getVirtualMachineName() {
        return this.virtualMachineName;
    }

    /**
     * Gets or sets the Vm Id.
     * 
     */
    @InputImport(name="vmId")
      private final @Nullable Input<String> vmId;

    public Input<String> getVmId() {
        return this.vmId == null ? Input.empty() : this.vmId;
    }

    public HybridIdentityMetadatumArgs(
        @Nullable Input<String> metadataName,
        @Nullable Input<String> publicKey,
        Input<String> resourceGroupName,
        Input<String> virtualMachineName,
        @Nullable Input<String> vmId) {
        this.metadataName = metadataName;
        this.publicKey = publicKey;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.virtualMachineName = Objects.requireNonNull(virtualMachineName, "expected parameter 'virtualMachineName' to be non-null");
        this.vmId = vmId;
    }

    private HybridIdentityMetadatumArgs() {
        this.metadataName = Input.empty();
        this.publicKey = Input.empty();
        this.resourceGroupName = Input.empty();
        this.virtualMachineName = Input.empty();
        this.vmId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HybridIdentityMetadatumArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> metadataName;
        private @Nullable Input<String> publicKey;
        private Input<String> resourceGroupName;
        private Input<String> virtualMachineName;
        private @Nullable Input<String> vmId;

        public Builder() {
    	      // Empty
        }

        public Builder(HybridIdentityMetadatumArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadataName = defaults.metadataName;
    	      this.publicKey = defaults.publicKey;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.virtualMachineName = defaults.virtualMachineName;
    	      this.vmId = defaults.vmId;
        }

        public Builder setMetadataName(@Nullable Input<String> metadataName) {
            this.metadataName = metadataName;
            return this;
        }

        public Builder setMetadataName(@Nullable String metadataName) {
            this.metadataName = Input.ofNullable(metadataName);
            return this;
        }

        public Builder setPublicKey(@Nullable Input<String> publicKey) {
            this.publicKey = publicKey;
            return this;
        }

        public Builder setPublicKey(@Nullable String publicKey) {
            this.publicKey = Input.ofNullable(publicKey);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setVirtualMachineName(Input<String> virtualMachineName) {
            this.virtualMachineName = Objects.requireNonNull(virtualMachineName);
            return this;
        }

        public Builder setVirtualMachineName(String virtualMachineName) {
            this.virtualMachineName = Input.of(Objects.requireNonNull(virtualMachineName));
            return this;
        }

        public Builder setVmId(@Nullable Input<String> vmId) {
            this.vmId = vmId;
            return this;
        }

        public Builder setVmId(@Nullable String vmId) {
            this.vmId = Input.ofNullable(vmId);
            return this;
        }
        public HybridIdentityMetadatumArgs build() {
            return new HybridIdentityMetadatumArgs(metadataName, publicKey, resourceGroupName, virtualMachineName, vmId);
        }
    }
}
