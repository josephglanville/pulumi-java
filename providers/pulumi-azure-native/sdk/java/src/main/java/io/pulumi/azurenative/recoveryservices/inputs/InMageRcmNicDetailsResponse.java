// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class InMageRcmNicDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final InMageRcmNicDetailsResponse Empty = new InMageRcmNicDetailsResponse();

    @InputImport(name="isPrimaryNic", required=true)
    private final String isPrimaryNic;

    public String getIsPrimaryNic() {
        return this.isPrimaryNic;
    }

    @InputImport(name="isSelectedForFailover", required=true)
    private final String isSelectedForFailover;

    public String getIsSelectedForFailover() {
        return this.isSelectedForFailover;
    }

    @InputImport(name="nicId", required=true)
    private final String nicId;

    public String getNicId() {
        return this.nicId;
    }

    @InputImport(name="sourceIPAddress", required=true)
    private final String sourceIPAddress;

    public String getSourceIPAddress() {
        return this.sourceIPAddress;
    }

    @InputImport(name="sourceIPAddressType", required=true)
    private final String sourceIPAddressType;

    public String getSourceIPAddressType() {
        return this.sourceIPAddressType;
    }

    @InputImport(name="sourceNetworkId", required=true)
    private final String sourceNetworkId;

    public String getSourceNetworkId() {
        return this.sourceNetworkId;
    }

    @InputImport(name="sourceSubnetName", required=true)
    private final String sourceSubnetName;

    public String getSourceSubnetName() {
        return this.sourceSubnetName;
    }

    @InputImport(name="targetIPAddress", required=true)
    private final String targetIPAddress;

    public String getTargetIPAddress() {
        return this.targetIPAddress;
    }

    @InputImport(name="targetIPAddressType", required=true)
    private final String targetIPAddressType;

    public String getTargetIPAddressType() {
        return this.targetIPAddressType;
    }

    @InputImport(name="targetSubnetName", required=true)
    private final String targetSubnetName;

    public String getTargetSubnetName() {
        return this.targetSubnetName;
    }

    @InputImport(name="testIPAddress", required=true)
    private final String testIPAddress;

    public String getTestIPAddress() {
        return this.testIPAddress;
    }

    @InputImport(name="testIPAddressType", required=true)
    private final String testIPAddressType;

    public String getTestIPAddressType() {
        return this.testIPAddressType;
    }

    @InputImport(name="testSubnetName", required=true)
    private final String testSubnetName;

    public String getTestSubnetName() {
        return this.testSubnetName;
    }

    public InMageRcmNicDetailsResponse(
        String isPrimaryNic,
        String isSelectedForFailover,
        String nicId,
        String sourceIPAddress,
        String sourceIPAddressType,
        String sourceNetworkId,
        String sourceSubnetName,
        String targetIPAddress,
        String targetIPAddressType,
        String targetSubnetName,
        String testIPAddress,
        String testIPAddressType,
        String testSubnetName) {
        this.isPrimaryNic = Objects.requireNonNull(isPrimaryNic, "expected parameter 'isPrimaryNic' to be non-null");
        this.isSelectedForFailover = Objects.requireNonNull(isSelectedForFailover, "expected parameter 'isSelectedForFailover' to be non-null");
        this.nicId = Objects.requireNonNull(nicId, "expected parameter 'nicId' to be non-null");
        this.sourceIPAddress = Objects.requireNonNull(sourceIPAddress, "expected parameter 'sourceIPAddress' to be non-null");
        this.sourceIPAddressType = Objects.requireNonNull(sourceIPAddressType, "expected parameter 'sourceIPAddressType' to be non-null");
        this.sourceNetworkId = Objects.requireNonNull(sourceNetworkId, "expected parameter 'sourceNetworkId' to be non-null");
        this.sourceSubnetName = Objects.requireNonNull(sourceSubnetName, "expected parameter 'sourceSubnetName' to be non-null");
        this.targetIPAddress = Objects.requireNonNull(targetIPAddress, "expected parameter 'targetIPAddress' to be non-null");
        this.targetIPAddressType = Objects.requireNonNull(targetIPAddressType, "expected parameter 'targetIPAddressType' to be non-null");
        this.targetSubnetName = Objects.requireNonNull(targetSubnetName, "expected parameter 'targetSubnetName' to be non-null");
        this.testIPAddress = Objects.requireNonNull(testIPAddress, "expected parameter 'testIPAddress' to be non-null");
        this.testIPAddressType = Objects.requireNonNull(testIPAddressType, "expected parameter 'testIPAddressType' to be non-null");
        this.testSubnetName = Objects.requireNonNull(testSubnetName, "expected parameter 'testSubnetName' to be non-null");
    }

    private InMageRcmNicDetailsResponse() {
        this.isPrimaryNic = null;
        this.isSelectedForFailover = null;
        this.nicId = null;
        this.sourceIPAddress = null;
        this.sourceIPAddressType = null;
        this.sourceNetworkId = null;
        this.sourceSubnetName = null;
        this.targetIPAddress = null;
        this.targetIPAddressType = null;
        this.targetSubnetName = null;
        this.testIPAddress = null;
        this.testIPAddressType = null;
        this.testSubnetName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageRcmNicDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String isPrimaryNic;
        private String isSelectedForFailover;
        private String nicId;
        private String sourceIPAddress;
        private String sourceIPAddressType;
        private String sourceNetworkId;
        private String sourceSubnetName;
        private String targetIPAddress;
        private String targetIPAddressType;
        private String targetSubnetName;
        private String testIPAddress;
        private String testIPAddressType;
        private String testSubnetName;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageRcmNicDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isPrimaryNic = defaults.isPrimaryNic;
    	      this.isSelectedForFailover = defaults.isSelectedForFailover;
    	      this.nicId = defaults.nicId;
    	      this.sourceIPAddress = defaults.sourceIPAddress;
    	      this.sourceIPAddressType = defaults.sourceIPAddressType;
    	      this.sourceNetworkId = defaults.sourceNetworkId;
    	      this.sourceSubnetName = defaults.sourceSubnetName;
    	      this.targetIPAddress = defaults.targetIPAddress;
    	      this.targetIPAddressType = defaults.targetIPAddressType;
    	      this.targetSubnetName = defaults.targetSubnetName;
    	      this.testIPAddress = defaults.testIPAddress;
    	      this.testIPAddressType = defaults.testIPAddressType;
    	      this.testSubnetName = defaults.testSubnetName;
        }

        public Builder setIsPrimaryNic(String isPrimaryNic) {
            this.isPrimaryNic = Objects.requireNonNull(isPrimaryNic);
            return this;
        }

        public Builder setIsSelectedForFailover(String isSelectedForFailover) {
            this.isSelectedForFailover = Objects.requireNonNull(isSelectedForFailover);
            return this;
        }

        public Builder setNicId(String nicId) {
            this.nicId = Objects.requireNonNull(nicId);
            return this;
        }

        public Builder setSourceIPAddress(String sourceIPAddress) {
            this.sourceIPAddress = Objects.requireNonNull(sourceIPAddress);
            return this;
        }

        public Builder setSourceIPAddressType(String sourceIPAddressType) {
            this.sourceIPAddressType = Objects.requireNonNull(sourceIPAddressType);
            return this;
        }

        public Builder setSourceNetworkId(String sourceNetworkId) {
            this.sourceNetworkId = Objects.requireNonNull(sourceNetworkId);
            return this;
        }

        public Builder setSourceSubnetName(String sourceSubnetName) {
            this.sourceSubnetName = Objects.requireNonNull(sourceSubnetName);
            return this;
        }

        public Builder setTargetIPAddress(String targetIPAddress) {
            this.targetIPAddress = Objects.requireNonNull(targetIPAddress);
            return this;
        }

        public Builder setTargetIPAddressType(String targetIPAddressType) {
            this.targetIPAddressType = Objects.requireNonNull(targetIPAddressType);
            return this;
        }

        public Builder setTargetSubnetName(String targetSubnetName) {
            this.targetSubnetName = Objects.requireNonNull(targetSubnetName);
            return this;
        }

        public Builder setTestIPAddress(String testIPAddress) {
            this.testIPAddress = Objects.requireNonNull(testIPAddress);
            return this;
        }

        public Builder setTestIPAddressType(String testIPAddressType) {
            this.testIPAddressType = Objects.requireNonNull(testIPAddressType);
            return this;
        }

        public Builder setTestSubnetName(String testSubnetName) {
            this.testSubnetName = Objects.requireNonNull(testSubnetName);
            return this;
        }

        public InMageRcmNicDetailsResponse build() {
            return new InMageRcmNicDetailsResponse(isPrimaryNic, isSelectedForFailover, nicId, sourceIPAddress, sourceIPAddressType, sourceNetworkId, sourceSubnetName, targetIPAddress, targetIPAddressType, targetSubnetName, testIPAddress, testIPAddressType, testSubnetName);
        }
    }
}
