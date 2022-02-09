// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere;

import io.pulumi.azurenative.connectedvmwarevsphere.enums.InventoryType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InventoryItemArgs extends io.pulumi.resources.ResourceArgs {

    public static final InventoryItemArgs Empty = new InventoryItemArgs();

    @InputImport(name="inventoryItemName")
    private final @Nullable Input<String> inventoryItemName;

    public Input<String> getInventoryItemName() {
        return this.inventoryItemName == null ? Input.empty() : this.inventoryItemName;
    }

    @InputImport(name="inventoryType", required=true)
    private final Input<Either<String,InventoryType>> inventoryType;

    public Input<Either<String,InventoryType>> getInventoryType() {
        return this.inventoryType;
    }

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="managedResourceId")
    private final @Nullable Input<String> managedResourceId;

    public Input<String> getManagedResourceId() {
        return this.managedResourceId == null ? Input.empty() : this.managedResourceId;
    }

    @InputImport(name="moName")
    private final @Nullable Input<String> moName;

    public Input<String> getMoName() {
        return this.moName == null ? Input.empty() : this.moName;
    }

    @InputImport(name="moRefId")
    private final @Nullable Input<String> moRefId;

    public Input<String> getMoRefId() {
        return this.moRefId == null ? Input.empty() : this.moRefId;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="vcenterName", required=true)
    private final Input<String> vcenterName;

    public Input<String> getVcenterName() {
        return this.vcenterName;
    }

    public InventoryItemArgs(
        @Nullable Input<String> inventoryItemName,
        Input<Either<String,InventoryType>> inventoryType,
        @Nullable Input<String> kind,
        @Nullable Input<String> managedResourceId,
        @Nullable Input<String> moName,
        @Nullable Input<String> moRefId,
        Input<String> resourceGroupName,
        Input<String> vcenterName) {
        this.inventoryItemName = inventoryItemName;
        this.inventoryType = Objects.requireNonNull(inventoryType, "expected parameter 'inventoryType' to be non-null");
        this.kind = kind;
        this.managedResourceId = managedResourceId;
        this.moName = moName;
        this.moRefId = moRefId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.vcenterName = Objects.requireNonNull(vcenterName, "expected parameter 'vcenterName' to be non-null");
    }

    private InventoryItemArgs() {
        this.inventoryItemName = Input.empty();
        this.inventoryType = Input.empty();
        this.kind = Input.empty();
        this.managedResourceId = Input.empty();
        this.moName = Input.empty();
        this.moRefId = Input.empty();
        this.resourceGroupName = Input.empty();
        this.vcenterName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InventoryItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> inventoryItemName;
        private Input<Either<String,InventoryType>> inventoryType;
        private @Nullable Input<String> kind;
        private @Nullable Input<String> managedResourceId;
        private @Nullable Input<String> moName;
        private @Nullable Input<String> moRefId;
        private Input<String> resourceGroupName;
        private Input<String> vcenterName;

        public Builder() {
    	      // Empty
        }

        public Builder(InventoryItemArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inventoryItemName = defaults.inventoryItemName;
    	      this.inventoryType = defaults.inventoryType;
    	      this.kind = defaults.kind;
    	      this.managedResourceId = defaults.managedResourceId;
    	      this.moName = defaults.moName;
    	      this.moRefId = defaults.moRefId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.vcenterName = defaults.vcenterName;
        }

        public Builder setInventoryItemName(@Nullable Input<String> inventoryItemName) {
            this.inventoryItemName = inventoryItemName;
            return this;
        }

        public Builder setInventoryItemName(@Nullable String inventoryItemName) {
            this.inventoryItemName = Input.ofNullable(inventoryItemName);
            return this;
        }

        public Builder setInventoryType(Input<Either<String,InventoryType>> inventoryType) {
            this.inventoryType = Objects.requireNonNull(inventoryType);
            return this;
        }

        public Builder setInventoryType(Either<String,InventoryType> inventoryType) {
            this.inventoryType = Input.of(Objects.requireNonNull(inventoryType));
            return this;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setManagedResourceId(@Nullable Input<String> managedResourceId) {
            this.managedResourceId = managedResourceId;
            return this;
        }

        public Builder setManagedResourceId(@Nullable String managedResourceId) {
            this.managedResourceId = Input.ofNullable(managedResourceId);
            return this;
        }

        public Builder setMoName(@Nullable Input<String> moName) {
            this.moName = moName;
            return this;
        }

        public Builder setMoName(@Nullable String moName) {
            this.moName = Input.ofNullable(moName);
            return this;
        }

        public Builder setMoRefId(@Nullable Input<String> moRefId) {
            this.moRefId = moRefId;
            return this;
        }

        public Builder setMoRefId(@Nullable String moRefId) {
            this.moRefId = Input.ofNullable(moRefId);
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

        public Builder setVcenterName(Input<String> vcenterName) {
            this.vcenterName = Objects.requireNonNull(vcenterName);
            return this;
        }

        public Builder setVcenterName(String vcenterName) {
            this.vcenterName = Input.of(Objects.requireNonNull(vcenterName));
            return this;
        }

        public InventoryItemArgs build() {
            return new InventoryItemArgs(inventoryItemName, inventoryType, kind, managedResourceId, moName, moRefId, resourceGroupName, vcenterName);
        }
    }
}
