// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Core.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetFastConnectProviderServiceResult {
    /**
     * @return Who is responsible for managing the virtual circuit bandwidth.
     * 
     */
    private final String bandwithShapeManagement;
    /**
     * @return Who is responsible for managing the ASN information for the network at the other end of the connection from Oracle.
     * 
     */
    private final String customerAsnManagement;
    /**
     * @return The location of the provider&#39;s website or portal. This portal is where you can get information about the provider service, create a virtual circuit connection from the provider to Oracle Cloud Infrastructure, and retrieve your provider service key for that virtual circuit connection.  Example: `https://example.com`
     * 
     */
    private final String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * @return Who is responsible for managing the private peering BGP information.
     * 
     */
    private final String privatePeeringBgpManagement;
    /**
     * @return The name of the provider.
     * 
     */
    private final String providerName;
    private final String providerServiceId;
    /**
     * @return Who is responsible for managing the provider service key.
     * 
     */
    private final String providerServiceKeyManagement;
    /**
     * @return The name of the service offered by the provider.
     * 
     */
    private final String providerServiceName;
    /**
     * @return Who is responsible for managing the public peering BGP information.
     * 
     */
    private final String publicPeeringBgpManagement;
    /**
     * @return Total number of cross-connect or cross-connect groups required for the virtual circuit.
     * 
     */
    private final Integer requiredTotalCrossConnects;
    /**
     * @return An array of virtual circuit types supported by this service.
     * 
     */
    private final List<String> supportedVirtualCircuitTypes;
    /**
     * @return Provider service type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetFastConnectProviderServiceResult(
        @CustomType.Parameter("bandwithShapeManagement") String bandwithShapeManagement,
        @CustomType.Parameter("customerAsnManagement") String customerAsnManagement,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("privatePeeringBgpManagement") String privatePeeringBgpManagement,
        @CustomType.Parameter("providerName") String providerName,
        @CustomType.Parameter("providerServiceId") String providerServiceId,
        @CustomType.Parameter("providerServiceKeyManagement") String providerServiceKeyManagement,
        @CustomType.Parameter("providerServiceName") String providerServiceName,
        @CustomType.Parameter("publicPeeringBgpManagement") String publicPeeringBgpManagement,
        @CustomType.Parameter("requiredTotalCrossConnects") Integer requiredTotalCrossConnects,
        @CustomType.Parameter("supportedVirtualCircuitTypes") List<String> supportedVirtualCircuitTypes,
        @CustomType.Parameter("type") String type) {
        this.bandwithShapeManagement = bandwithShapeManagement;
        this.customerAsnManagement = customerAsnManagement;
        this.description = description;
        this.id = id;
        this.privatePeeringBgpManagement = privatePeeringBgpManagement;
        this.providerName = providerName;
        this.providerServiceId = providerServiceId;
        this.providerServiceKeyManagement = providerServiceKeyManagement;
        this.providerServiceName = providerServiceName;
        this.publicPeeringBgpManagement = publicPeeringBgpManagement;
        this.requiredTotalCrossConnects = requiredTotalCrossConnects;
        this.supportedVirtualCircuitTypes = supportedVirtualCircuitTypes;
        this.type = type;
    }

    /**
     * @return Who is responsible for managing the virtual circuit bandwidth.
     * 
     */
    public String bandwithShapeManagement() {
        return this.bandwithShapeManagement;
    }
    /**
     * @return Who is responsible for managing the ASN information for the network at the other end of the connection from Oracle.
     * 
     */
    public String customerAsnManagement() {
        return this.customerAsnManagement;
    }
    /**
     * @return The location of the provider&#39;s website or portal. This portal is where you can get information about the provider service, create a virtual circuit connection from the provider to Oracle Cloud Infrastructure, and retrieve your provider service key for that virtual circuit connection.  Example: `https://example.com`
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Who is responsible for managing the private peering BGP information.
     * 
     */
    public String privatePeeringBgpManagement() {
        return this.privatePeeringBgpManagement;
    }
    /**
     * @return The name of the provider.
     * 
     */
    public String providerName() {
        return this.providerName;
    }
    public String providerServiceId() {
        return this.providerServiceId;
    }
    /**
     * @return Who is responsible for managing the provider service key.
     * 
     */
    public String providerServiceKeyManagement() {
        return this.providerServiceKeyManagement;
    }
    /**
     * @return The name of the service offered by the provider.
     * 
     */
    public String providerServiceName() {
        return this.providerServiceName;
    }
    /**
     * @return Who is responsible for managing the public peering BGP information.
     * 
     */
    public String publicPeeringBgpManagement() {
        return this.publicPeeringBgpManagement;
    }
    /**
     * @return Total number of cross-connect or cross-connect groups required for the virtual circuit.
     * 
     */
    public Integer requiredTotalCrossConnects() {
        return this.requiredTotalCrossConnects;
    }
    /**
     * @return An array of virtual circuit types supported by this service.
     * 
     */
    public List<String> supportedVirtualCircuitTypes() {
        return this.supportedVirtualCircuitTypes;
    }
    /**
     * @return Provider service type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFastConnectProviderServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String bandwithShapeManagement;
        private String customerAsnManagement;
        private String description;
        private String id;
        private String privatePeeringBgpManagement;
        private String providerName;
        private String providerServiceId;
        private String providerServiceKeyManagement;
        private String providerServiceName;
        private String publicPeeringBgpManagement;
        private Integer requiredTotalCrossConnects;
        private List<String> supportedVirtualCircuitTypes;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFastConnectProviderServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwithShapeManagement = defaults.bandwithShapeManagement;
    	      this.customerAsnManagement = defaults.customerAsnManagement;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.privatePeeringBgpManagement = defaults.privatePeeringBgpManagement;
    	      this.providerName = defaults.providerName;
    	      this.providerServiceId = defaults.providerServiceId;
    	      this.providerServiceKeyManagement = defaults.providerServiceKeyManagement;
    	      this.providerServiceName = defaults.providerServiceName;
    	      this.publicPeeringBgpManagement = defaults.publicPeeringBgpManagement;
    	      this.requiredTotalCrossConnects = defaults.requiredTotalCrossConnects;
    	      this.supportedVirtualCircuitTypes = defaults.supportedVirtualCircuitTypes;
    	      this.type = defaults.type;
        }

        public Builder bandwithShapeManagement(String bandwithShapeManagement) {
            this.bandwithShapeManagement = Objects.requireNonNull(bandwithShapeManagement);
            return this;
        }
        public Builder customerAsnManagement(String customerAsnManagement) {
            this.customerAsnManagement = Objects.requireNonNull(customerAsnManagement);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder privatePeeringBgpManagement(String privatePeeringBgpManagement) {
            this.privatePeeringBgpManagement = Objects.requireNonNull(privatePeeringBgpManagement);
            return this;
        }
        public Builder providerName(String providerName) {
            this.providerName = Objects.requireNonNull(providerName);
            return this;
        }
        public Builder providerServiceId(String providerServiceId) {
            this.providerServiceId = Objects.requireNonNull(providerServiceId);
            return this;
        }
        public Builder providerServiceKeyManagement(String providerServiceKeyManagement) {
            this.providerServiceKeyManagement = Objects.requireNonNull(providerServiceKeyManagement);
            return this;
        }
        public Builder providerServiceName(String providerServiceName) {
            this.providerServiceName = Objects.requireNonNull(providerServiceName);
            return this;
        }
        public Builder publicPeeringBgpManagement(String publicPeeringBgpManagement) {
            this.publicPeeringBgpManagement = Objects.requireNonNull(publicPeeringBgpManagement);
            return this;
        }
        public Builder requiredTotalCrossConnects(Integer requiredTotalCrossConnects) {
            this.requiredTotalCrossConnects = Objects.requireNonNull(requiredTotalCrossConnects);
            return this;
        }
        public Builder supportedVirtualCircuitTypes(List<String> supportedVirtualCircuitTypes) {
            this.supportedVirtualCircuitTypes = Objects.requireNonNull(supportedVirtualCircuitTypes);
            return this;
        }
        public Builder supportedVirtualCircuitTypes(String... supportedVirtualCircuitTypes) {
            return supportedVirtualCircuitTypes(List.of(supportedVirtualCircuitTypes));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetFastConnectProviderServiceResult build() {
            return new GetFastConnectProviderServiceResult(bandwithShapeManagement, customerAsnManagement, description, id, privatePeeringBgpManagement, providerName, providerServiceId, providerServiceKeyManagement, providerServiceName, publicPeeringBgpManagement, requiredTotalCrossConnects, supportedVirtualCircuitTypes, type);
        }
    }
}
