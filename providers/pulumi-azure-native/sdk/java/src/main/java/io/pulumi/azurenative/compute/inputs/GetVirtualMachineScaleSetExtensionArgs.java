// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVirtualMachineScaleSetExtensionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVirtualMachineScaleSetExtensionArgs Empty = new GetVirtualMachineScaleSetExtensionArgs();

    @InputImport(name="expand")
    private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="vmScaleSetName", required=true)
    private final String vmScaleSetName;

    public String getVmScaleSetName() {
        return this.vmScaleSetName;
    }

    @InputImport(name="vmssExtensionName", required=true)
    private final String vmssExtensionName;

    public String getVmssExtensionName() {
        return this.vmssExtensionName;
    }

    public GetVirtualMachineScaleSetExtensionArgs(
        @Nullable String expand,
        String resourceGroupName,
        String vmScaleSetName,
        String vmssExtensionName) {
        this.expand = expand;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vmScaleSetName = Objects.requireNonNull(vmScaleSetName, "expected parameter 'vmScaleSetName' to be non-null");
        this.vmssExtensionName = Objects.requireNonNull(vmssExtensionName, "expected parameter 'vmssExtensionName' to be non-null");
    }

    private GetVirtualMachineScaleSetExtensionArgs() {
        this.expand = null;
        this.resourceGroupName = null;
        this.vmScaleSetName = null;
        this.vmssExtensionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVirtualMachineScaleSetExtensionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String expand;
        private String resourceGroupName;
        private String vmScaleSetName;
        private String vmssExtensionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVirtualMachineScaleSetExtensionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expand = defaults.expand;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vmScaleSetName = defaults.vmScaleSetName;
    	      this.vmssExtensionName = defaults.vmssExtensionName;
        }

        public Builder setExpand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setVmScaleSetName(String vmScaleSetName) {
            this.vmScaleSetName = Objects.requireNonNull(vmScaleSetName);
            return this;
        }

        public Builder setVmssExtensionName(String vmssExtensionName) {
            this.vmssExtensionName = Objects.requireNonNull(vmssExtensionName);
            return this;
        }

        public GetVirtualMachineScaleSetExtensionArgs build() {
            return new GetVirtualMachineScaleSetExtensionArgs(expand, resourceGroupName, vmScaleSetName, vmssExtensionName);
        }
    }
}
