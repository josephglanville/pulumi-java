// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.outputs;

import io.pulumi.azurenative.connectedvmwarevsphere.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetInventoryItemResult {
    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
     */
    private final String id;
    /**
     * They inventory type.
     * 
     */
    private final String inventoryType;
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    private final @Nullable String kind;
    /**
     * Gets or sets the tracked resource id corresponding to the inventory resource.
     * 
     */
    private final @Nullable String managedResourceId;
    /**
     * Gets or sets the vCenter Managed Object name for the inventory item.
     * 
     */
    private final @Nullable String moName;
    /**
     * Gets or sets the MoRef (Managed Object Reference) ID for the inventory item.
     * 
     */
    private final @Nullable String moRefId;
    /**
     * The name of the resource
     * 
     */
    private final String name;
    /**
     * Gets or sets the provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * The system data.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetInventoryItemResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("inventoryType") String inventoryType,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("managedResourceId") @Nullable String managedResourceId,
        @CustomType.Parameter("moName") @Nullable String moName,
        @CustomType.Parameter("moRefId") @Nullable String moRefId,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.inventoryType = inventoryType;
        this.kind = kind;
        this.managedResourceId = managedResourceId;
        this.moName = moName;
        this.moRefId = moRefId;
        this.name = name;
        this.provisioningState = provisioningState;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Fully qualified resource ID for the resource. Ex - /subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/{resourceProviderNamespace}/{resourceType}/{resourceName}
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * They inventory type.
     * 
    */
    public String getInventoryType() {
        return this.inventoryType;
    }
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Gets or sets the tracked resource id corresponding to the inventory resource.
     * 
    */
    public Optional<String> getManagedResourceId() {
        return Optional.ofNullable(this.managedResourceId);
    }
    /**
     * Gets or sets the vCenter Managed Object name for the inventory item.
     * 
    */
    public Optional<String> getMoName() {
        return Optional.ofNullable(this.moName);
    }
    /**
     * Gets or sets the MoRef (Managed Object Reference) ID for the inventory item.
     * 
    */
    public Optional<String> getMoRefId() {
        return Optional.ofNullable(this.moRefId);
    }
    /**
     * The name of the resource
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Gets or sets the provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The system data.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * The type of the resource. E.g. "Microsoft.Compute/virtualMachines" or "Microsoft.Storage/storageAccounts"
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInventoryItemResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String inventoryType;
        private @Nullable String kind;
        private @Nullable String managedResourceId;
        private @Nullable String moName;
        private @Nullable String moRefId;
        private String name;
        private String provisioningState;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInventoryItemResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.inventoryType = defaults.inventoryType;
    	      this.kind = defaults.kind;
    	      this.managedResourceId = defaults.managedResourceId;
    	      this.moName = defaults.moName;
    	      this.moRefId = defaults.moRefId;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder inventoryType(String inventoryType) {
            this.inventoryType = Objects.requireNonNull(inventoryType);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder managedResourceId(@Nullable String managedResourceId) {
            this.managedResourceId = managedResourceId;
            return this;
        }
        public Builder moName(@Nullable String moName) {
            this.moName = moName;
            return this;
        }
        public Builder moRefId(@Nullable String moRefId) {
            this.moRefId = moRefId;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetInventoryItemResult build() {
            return new GetInventoryItemResult(id, inventoryType, kind, managedResourceId, moName, moRefId, name, provisioningState, systemData, type);
        }
    }
}
