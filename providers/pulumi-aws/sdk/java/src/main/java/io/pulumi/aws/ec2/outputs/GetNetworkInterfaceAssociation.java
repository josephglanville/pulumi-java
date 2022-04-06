// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNetworkInterfaceAssociation {
    /**
     * The allocation ID.
     * 
     */
    private final String allocationId;
    /**
     * The association ID.
     * 
     */
    private final String associationId;
    /**
     * The carrier IP address associated with the network interface. This attribute is only set when the network interface is in a subnet which is associated with a Wavelength Zone.
     * 
     */
    private final String carrierIp;
    /**
     * The customer-owned IP address.
     * 
     */
    private final String customerOwnedIp;
    /**
     * The ID of the Elastic IP address owner.
     * 
     */
    private final String ipOwnerId;
    /**
     * The public DNS name.
     * 
     */
    private final String publicDnsName;
    /**
     * The address of the Elastic IP address bound to the network interface.
     * 
     */
    private final String publicIp;

    @CustomType.Constructor
    private GetNetworkInterfaceAssociation(
        @CustomType.Parameter("allocationId") String allocationId,
        @CustomType.Parameter("associationId") String associationId,
        @CustomType.Parameter("carrierIp") String carrierIp,
        @CustomType.Parameter("customerOwnedIp") String customerOwnedIp,
        @CustomType.Parameter("ipOwnerId") String ipOwnerId,
        @CustomType.Parameter("publicDnsName") String publicDnsName,
        @CustomType.Parameter("publicIp") String publicIp) {
        this.allocationId = allocationId;
        this.associationId = associationId;
        this.carrierIp = carrierIp;
        this.customerOwnedIp = customerOwnedIp;
        this.ipOwnerId = ipOwnerId;
        this.publicDnsName = publicDnsName;
        this.publicIp = publicIp;
    }

    /**
     * The allocation ID.
     * 
    */
    public String getAllocationId() {
        return this.allocationId;
    }
    /**
     * The association ID.
     * 
    */
    public String getAssociationId() {
        return this.associationId;
    }
    /**
     * The carrier IP address associated with the network interface. This attribute is only set when the network interface is in a subnet which is associated with a Wavelength Zone.
     * 
    */
    public String getCarrierIp() {
        return this.carrierIp;
    }
    /**
     * The customer-owned IP address.
     * 
    */
    public String getCustomerOwnedIp() {
        return this.customerOwnedIp;
    }
    /**
     * The ID of the Elastic IP address owner.
     * 
    */
    public String getIpOwnerId() {
        return this.ipOwnerId;
    }
    /**
     * The public DNS name.
     * 
    */
    public String getPublicDnsName() {
        return this.publicDnsName;
    }
    /**
     * The address of the Elastic IP address bound to the network interface.
     * 
    */
    public String getPublicIp() {
        return this.publicIp;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInterfaceAssociation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String allocationId;
        private String associationId;
        private String carrierIp;
        private String customerOwnedIp;
        private String ipOwnerId;
        private String publicDnsName;
        private String publicIp;

        public Builder() {
    	      // Empty
        }

        public Builder(GetNetworkInterfaceAssociation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allocationId = defaults.allocationId;
    	      this.associationId = defaults.associationId;
    	      this.carrierIp = defaults.carrierIp;
    	      this.customerOwnedIp = defaults.customerOwnedIp;
    	      this.ipOwnerId = defaults.ipOwnerId;
    	      this.publicDnsName = defaults.publicDnsName;
    	      this.publicIp = defaults.publicIp;
        }

        public Builder allocationId(String allocationId) {
            this.allocationId = Objects.requireNonNull(allocationId);
            return this;
        }
        public Builder associationId(String associationId) {
            this.associationId = Objects.requireNonNull(associationId);
            return this;
        }
        public Builder carrierIp(String carrierIp) {
            this.carrierIp = Objects.requireNonNull(carrierIp);
            return this;
        }
        public Builder customerOwnedIp(String customerOwnedIp) {
            this.customerOwnedIp = Objects.requireNonNull(customerOwnedIp);
            return this;
        }
        public Builder ipOwnerId(String ipOwnerId) {
            this.ipOwnerId = Objects.requireNonNull(ipOwnerId);
            return this;
        }
        public Builder publicDnsName(String publicDnsName) {
            this.publicDnsName = Objects.requireNonNull(publicDnsName);
            return this;
        }
        public Builder publicIp(String publicIp) {
            this.publicIp = Objects.requireNonNull(publicIp);
            return this;
        }        public GetNetworkInterfaceAssociation build() {
            return new GetNetworkInterfaceAssociation(allocationId, associationId, carrierIp, customerOwnedIp, ipOwnerId, publicDnsName, publicIp);
        }
    }
}