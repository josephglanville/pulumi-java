// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VMwareCbtNicDetailsResponse {
    /**
     * A value indicating whether this is the primary NIC.
     * 
     */
    private final @Nullable String isPrimaryNic;
    /**
     * A value indicating whether this NIC is selected for migration.
     * 
     */
    private final @Nullable String isSelectedForMigration;
    /**
     * The NIC Id.
     * 
     */
    private final String nicId;
    /**
     * The source IP address.
     * 
     */
    private final String sourceIPAddress;
    /**
     * The source IP address type.
     * 
     */
    private final String sourceIPAddressType;
    /**
     * Source network Id.
     * 
     */
    private final String sourceNetworkId;
    /**
     * The target IP address.
     * 
     */
    private final @Nullable String targetIPAddress;
    /**
     * The target IP address type.
     * 
     */
    private final @Nullable String targetIPAddressType;
    /**
     * Target subnet name.
     * 
     */
    private final @Nullable String targetSubnetName;

    @CustomType.Constructor
    private VMwareCbtNicDetailsResponse(
        @CustomType.Parameter("isPrimaryNic") @Nullable String isPrimaryNic,
        @CustomType.Parameter("isSelectedForMigration") @Nullable String isSelectedForMigration,
        @CustomType.Parameter("nicId") String nicId,
        @CustomType.Parameter("sourceIPAddress") String sourceIPAddress,
        @CustomType.Parameter("sourceIPAddressType") String sourceIPAddressType,
        @CustomType.Parameter("sourceNetworkId") String sourceNetworkId,
        @CustomType.Parameter("targetIPAddress") @Nullable String targetIPAddress,
        @CustomType.Parameter("targetIPAddressType") @Nullable String targetIPAddressType,
        @CustomType.Parameter("targetSubnetName") @Nullable String targetSubnetName) {
        this.isPrimaryNic = isPrimaryNic;
        this.isSelectedForMigration = isSelectedForMigration;
        this.nicId = nicId;
        this.sourceIPAddress = sourceIPAddress;
        this.sourceIPAddressType = sourceIPAddressType;
        this.sourceNetworkId = sourceNetworkId;
        this.targetIPAddress = targetIPAddress;
        this.targetIPAddressType = targetIPAddressType;
        this.targetSubnetName = targetSubnetName;
    }

    /**
     * A value indicating whether this is the primary NIC.
     * 
    */
    public Optional<String> getIsPrimaryNic() {
        return Optional.ofNullable(this.isPrimaryNic);
    }
    /**
     * A value indicating whether this NIC is selected for migration.
     * 
    */
    public Optional<String> getIsSelectedForMigration() {
        return Optional.ofNullable(this.isSelectedForMigration);
    }
    /**
     * The NIC Id.
     * 
    */
    public String getNicId() {
        return this.nicId;
    }
    /**
     * The source IP address.
     * 
    */
    public String getSourceIPAddress() {
        return this.sourceIPAddress;
    }
    /**
     * The source IP address type.
     * 
    */
    public String getSourceIPAddressType() {
        return this.sourceIPAddressType;
    }
    /**
     * Source network Id.
     * 
    */
    public String getSourceNetworkId() {
        return this.sourceNetworkId;
    }
    /**
     * The target IP address.
     * 
    */
    public Optional<String> getTargetIPAddress() {
        return Optional.ofNullable(this.targetIPAddress);
    }
    /**
     * The target IP address type.
     * 
    */
    public Optional<String> getTargetIPAddressType() {
        return Optional.ofNullable(this.targetIPAddressType);
    }
    /**
     * Target subnet name.
     * 
    */
    public Optional<String> getTargetSubnetName() {
        return Optional.ofNullable(this.targetSubnetName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VMwareCbtNicDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String isPrimaryNic;
        private @Nullable String isSelectedForMigration;
        private String nicId;
        private String sourceIPAddress;
        private String sourceIPAddressType;
        private String sourceNetworkId;
        private @Nullable String targetIPAddress;
        private @Nullable String targetIPAddressType;
        private @Nullable String targetSubnetName;

        public Builder() {
    	      // Empty
        }

        public Builder(VMwareCbtNicDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isPrimaryNic = defaults.isPrimaryNic;
    	      this.isSelectedForMigration = defaults.isSelectedForMigration;
    	      this.nicId = defaults.nicId;
    	      this.sourceIPAddress = defaults.sourceIPAddress;
    	      this.sourceIPAddressType = defaults.sourceIPAddressType;
    	      this.sourceNetworkId = defaults.sourceNetworkId;
    	      this.targetIPAddress = defaults.targetIPAddress;
    	      this.targetIPAddressType = defaults.targetIPAddressType;
    	      this.targetSubnetName = defaults.targetSubnetName;
        }

        public Builder isPrimaryNic(@Nullable String isPrimaryNic) {
            this.isPrimaryNic = isPrimaryNic;
            return this;
        }
        public Builder isSelectedForMigration(@Nullable String isSelectedForMigration) {
            this.isSelectedForMigration = isSelectedForMigration;
            return this;
        }
        public Builder nicId(String nicId) {
            this.nicId = Objects.requireNonNull(nicId);
            return this;
        }
        public Builder sourceIPAddress(String sourceIPAddress) {
            this.sourceIPAddress = Objects.requireNonNull(sourceIPAddress);
            return this;
        }
        public Builder sourceIPAddressType(String sourceIPAddressType) {
            this.sourceIPAddressType = Objects.requireNonNull(sourceIPAddressType);
            return this;
        }
        public Builder sourceNetworkId(String sourceNetworkId) {
            this.sourceNetworkId = Objects.requireNonNull(sourceNetworkId);
            return this;
        }
        public Builder targetIPAddress(@Nullable String targetIPAddress) {
            this.targetIPAddress = targetIPAddress;
            return this;
        }
        public Builder targetIPAddressType(@Nullable String targetIPAddressType) {
            this.targetIPAddressType = targetIPAddressType;
            return this;
        }
        public Builder targetSubnetName(@Nullable String targetSubnetName) {
            this.targetSubnetName = targetSubnetName;
            return this;
        }        public VMwareCbtNicDetailsResponse build() {
            return new VMwareCbtNicDetailsResponse(isPrimaryNic, isSelectedForMigration, nicId, sourceIPAddress, sourceIPAddressType, sourceNetworkId, targetIPAddress, targetIPAddressType, targetSubnetName);
        }
    }
}
