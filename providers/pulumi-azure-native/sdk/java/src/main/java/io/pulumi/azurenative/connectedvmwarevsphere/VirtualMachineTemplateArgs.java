// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.connectedvmwarevsphere.inputs.ExtendedLocationArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualMachineTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineTemplateArgs Empty = new VirtualMachineTemplateArgs();

    /**
     * Gets or sets the extended location.
     * 
     */
    @Import(name="extendedLocation")
      private final @Nullable Output<ExtendedLocationArgs> extendedLocation;

    public Output<ExtendedLocationArgs> getExtendedLocation() {
        return this.extendedLocation == null ? Codegen.empty() : this.extendedLocation;
    }

    /**
     * Gets or sets the inventory Item ID for the virtual machine template.
     * 
     */
    @Import(name="inventoryItemId")
      private final @Nullable Output<String> inventoryItemId;

    public Output<String> getInventoryItemId() {
        return this.inventoryItemId == null ? Codegen.empty() : this.inventoryItemId;
    }

    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Gets or sets the location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * Gets or sets the vCenter MoRef (Managed Object Reference) ID for the virtual machine
     * template.
     * 
     */
    @Import(name="moRefId")
      private final @Nullable Output<String> moRefId;

    public Output<String> getMoRefId() {
        return this.moRefId == null ? Codegen.empty() : this.moRefId;
    }

    /**
     * The Resource Group Name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * Gets or sets the ARM Id of the vCenter resource in which this template resides.
     * 
     */
    @Import(name="vCenterId")
      private final @Nullable Output<String> vCenterId;

    public Output<String> getVCenterId() {
        return this.vCenterId == null ? Codegen.empty() : this.vCenterId;
    }

    /**
     * Name of the virtual machine template resource.
     * 
     */
    @Import(name="virtualMachineTemplateName")
      private final @Nullable Output<String> virtualMachineTemplateName;

    public Output<String> getVirtualMachineTemplateName() {
        return this.virtualMachineTemplateName == null ? Codegen.empty() : this.virtualMachineTemplateName;
    }

    public VirtualMachineTemplateArgs(
        @Nullable Output<ExtendedLocationArgs> extendedLocation,
        @Nullable Output<String> inventoryItemId,
        @Nullable Output<String> kind,
        @Nullable Output<String> location,
        @Nullable Output<String> moRefId,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> vCenterId,
        @Nullable Output<String> virtualMachineTemplateName) {
        this.extendedLocation = extendedLocation;
        this.inventoryItemId = inventoryItemId;
        this.kind = kind;
        this.location = location;
        this.moRefId = moRefId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
        this.vCenterId = vCenterId;
        this.virtualMachineTemplateName = virtualMachineTemplateName;
    }

    private VirtualMachineTemplateArgs() {
        this.extendedLocation = Codegen.empty();
        this.inventoryItemId = Codegen.empty();
        this.kind = Codegen.empty();
        this.location = Codegen.empty();
        this.moRefId = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
        this.vCenterId = Codegen.empty();
        this.virtualMachineTemplateName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ExtendedLocationArgs> extendedLocation;
        private @Nullable Output<String> inventoryItemId;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> location;
        private @Nullable Output<String> moRefId;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> vCenterId;
        private @Nullable Output<String> virtualMachineTemplateName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.inventoryItemId = defaults.inventoryItemId;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.moRefId = defaults.moRefId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
    	      this.vCenterId = defaults.vCenterId;
    	      this.virtualMachineTemplateName = defaults.virtualMachineTemplateName;
        }

        public Builder extendedLocation(@Nullable Output<ExtendedLocationArgs> extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }
        public Builder extendedLocation(@Nullable ExtendedLocationArgs extendedLocation) {
            this.extendedLocation = Codegen.ofNullable(extendedLocation);
            return this;
        }
        public Builder inventoryItemId(@Nullable Output<String> inventoryItemId) {
            this.inventoryItemId = inventoryItemId;
            return this;
        }
        public Builder inventoryItemId(@Nullable String inventoryItemId) {
            this.inventoryItemId = Codegen.ofNullable(inventoryItemId);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder moRefId(@Nullable Output<String> moRefId) {
            this.moRefId = moRefId;
            return this;
        }
        public Builder moRefId(@Nullable String moRefId) {
            this.moRefId = Codegen.ofNullable(moRefId);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder vCenterId(@Nullable Output<String> vCenterId) {
            this.vCenterId = vCenterId;
            return this;
        }
        public Builder vCenterId(@Nullable String vCenterId) {
            this.vCenterId = Codegen.ofNullable(vCenterId);
            return this;
        }
        public Builder virtualMachineTemplateName(@Nullable Output<String> virtualMachineTemplateName) {
            this.virtualMachineTemplateName = virtualMachineTemplateName;
            return this;
        }
        public Builder virtualMachineTemplateName(@Nullable String virtualMachineTemplateName) {
            this.virtualMachineTemplateName = Codegen.ofNullable(virtualMachineTemplateName);
            return this;
        }        public VirtualMachineTemplateArgs build() {
            return new VirtualMachineTemplateArgs(extendedLocation, inventoryItemId, kind, location, moRefId, resourceGroupName, tags, vCenterId, virtualMachineTemplateName);
        }
    }
}
