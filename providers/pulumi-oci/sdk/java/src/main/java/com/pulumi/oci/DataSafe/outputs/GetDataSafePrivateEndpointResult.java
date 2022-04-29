// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetDataSafePrivateEndpointResult {
    /**
     * @return The OCID of the compartment.
     * 
     */
    private final String compartmentId;
    private final String dataSafePrivateEndpointId;
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    private final Map<String,Object> definedTags;
    /**
     * @return The description of the private endpoint.
     * 
     */
    private final String description;
    /**
     * @return The display name of the private endpoint.
     * 
     */
    private final String displayName;
    /**
     * @return The three-label fully qualified domain name (FQDN) of the private endpoint. The customer VCN&#39;s DNS records are updated with this FQDN.
     * 
     */
    private final String endpointFqdn;
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    private final Map<String,Object> freeformTags;
    /**
     * @return The OCID of the Data Safe private endpoint.
     * 
     */
    private final String id;
    /**
     * @return The OCIDs of the network security groups that the private endpoint belongs to.
     * 
     */
    private final List<String> nsgIds;
    /**
     * @return The OCID of the underlying private endpoint.
     * 
     */
    private final String privateEndpointId;
    /**
     * @return The private IP address of the private endpoint.
     * 
     */
    private final String privateEndpointIp;
    /**
     * @return The current state of the private endpoint.
     * 
     */
    private final String state;
    /**
     * @return The OCID of the subnet.
     * 
     */
    private final String subnetId;
    /**
     * @return System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    private final Map<String,Object> systemTags;
    /**
     * @return The date and time the private endpoint was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    private final String timeCreated;
    /**
     * @return The OCID of the VCN.
     * 
     */
    private final String vcnId;

    @CustomType.Constructor
    private GetDataSafePrivateEndpointResult(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("dataSafePrivateEndpointId") String dataSafePrivateEndpointId,
        @CustomType.Parameter("definedTags") Map<String,Object> definedTags,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("endpointFqdn") String endpointFqdn,
        @CustomType.Parameter("freeformTags") Map<String,Object> freeformTags,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("nsgIds") List<String> nsgIds,
        @CustomType.Parameter("privateEndpointId") String privateEndpointId,
        @CustomType.Parameter("privateEndpointIp") String privateEndpointIp,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("subnetId") String subnetId,
        @CustomType.Parameter("systemTags") Map<String,Object> systemTags,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("vcnId") String vcnId) {
        this.compartmentId = compartmentId;
        this.dataSafePrivateEndpointId = dataSafePrivateEndpointId;
        this.definedTags = definedTags;
        this.description = description;
        this.displayName = displayName;
        this.endpointFqdn = endpointFqdn;
        this.freeformTags = freeformTags;
        this.id = id;
        this.nsgIds = nsgIds;
        this.privateEndpointId = privateEndpointId;
        this.privateEndpointIp = privateEndpointIp;
        this.state = state;
        this.subnetId = subnetId;
        this.systemTags = systemTags;
        this.timeCreated = timeCreated;
        this.vcnId = vcnId;
    }

    /**
     * @return The OCID of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    public String dataSafePrivateEndpointId() {
        return this.dataSafePrivateEndpointId;
    }
    /**
     * @return Defined tags for this resource. Each key is predefined and scoped to a namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Operations.CostCenter&#34;: &#34;42&#34;}`
     * 
     */
    public Map<String,Object> definedTags() {
        return this.definedTags;
    }
    /**
     * @return The description of the private endpoint.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The display name of the private endpoint.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return The three-label fully qualified domain name (FQDN) of the private endpoint. The customer VCN&#39;s DNS records are updated with this FQDN.
     * 
     */
    public String endpointFqdn() {
        return this.endpointFqdn;
    }
    /**
     * @return Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace. For more information, see [Resource Tags](https://docs.cloud.oracle.com/iaas/Content/General/Concepts/resourcetags.htm)  Example: `{&#34;Department&#34;: &#34;Finance&#34;}`
     * 
     */
    public Map<String,Object> freeformTags() {
        return this.freeformTags;
    }
    /**
     * @return The OCID of the Data Safe private endpoint.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return The OCIDs of the network security groups that the private endpoint belongs to.
     * 
     */
    public List<String> nsgIds() {
        return this.nsgIds;
    }
    /**
     * @return The OCID of the underlying private endpoint.
     * 
     */
    public String privateEndpointId() {
        return this.privateEndpointId;
    }
    /**
     * @return The private IP address of the private endpoint.
     * 
     */
    public String privateEndpointIp() {
        return this.privateEndpointIp;
    }
    /**
     * @return The current state of the private endpoint.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The OCID of the subnet.
     * 
     */
    public String subnetId() {
        return this.subnetId;
    }
    /**
     * @return System tags for this resource. Each key is predefined and scoped to a namespace. For more information, see Resource Tags. Example: `{&#34;orcl-cloud.free-tier-retained&#34;: &#34;true&#34;}`
     * 
     */
    public Map<String,Object> systemTags() {
        return this.systemTags;
    }
    /**
     * @return The date and time the private endpoint was created, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339).
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The OCID of the VCN.
     * 
     */
    public String vcnId() {
        return this.vcnId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataSafePrivateEndpointResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private String dataSafePrivateEndpointId;
        private Map<String,Object> definedTags;
        private String description;
        private String displayName;
        private String endpointFqdn;
        private Map<String,Object> freeformTags;
        private String id;
        private List<String> nsgIds;
        private String privateEndpointId;
        private String privateEndpointIp;
        private String state;
        private String subnetId;
        private Map<String,Object> systemTags;
        private String timeCreated;
        private String vcnId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataSafePrivateEndpointResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.dataSafePrivateEndpointId = defaults.dataSafePrivateEndpointId;
    	      this.definedTags = defaults.definedTags;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.endpointFqdn = defaults.endpointFqdn;
    	      this.freeformTags = defaults.freeformTags;
    	      this.id = defaults.id;
    	      this.nsgIds = defaults.nsgIds;
    	      this.privateEndpointId = defaults.privateEndpointId;
    	      this.privateEndpointIp = defaults.privateEndpointIp;
    	      this.state = defaults.state;
    	      this.subnetId = defaults.subnetId;
    	      this.systemTags = defaults.systemTags;
    	      this.timeCreated = defaults.timeCreated;
    	      this.vcnId = defaults.vcnId;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder dataSafePrivateEndpointId(String dataSafePrivateEndpointId) {
            this.dataSafePrivateEndpointId = Objects.requireNonNull(dataSafePrivateEndpointId);
            return this;
        }
        public Builder definedTags(Map<String,Object> definedTags) {
            this.definedTags = Objects.requireNonNull(definedTags);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder endpointFqdn(String endpointFqdn) {
            this.endpointFqdn = Objects.requireNonNull(endpointFqdn);
            return this;
        }
        public Builder freeformTags(Map<String,Object> freeformTags) {
            this.freeformTags = Objects.requireNonNull(freeformTags);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder nsgIds(List<String> nsgIds) {
            this.nsgIds = Objects.requireNonNull(nsgIds);
            return this;
        }
        public Builder nsgIds(String... nsgIds) {
            return nsgIds(List.of(nsgIds));
        }
        public Builder privateEndpointId(String privateEndpointId) {
            this.privateEndpointId = Objects.requireNonNull(privateEndpointId);
            return this;
        }
        public Builder privateEndpointIp(String privateEndpointIp) {
            this.privateEndpointIp = Objects.requireNonNull(privateEndpointIp);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder subnetId(String subnetId) {
            this.subnetId = Objects.requireNonNull(subnetId);
            return this;
        }
        public Builder systemTags(Map<String,Object> systemTags) {
            this.systemTags = Objects.requireNonNull(systemTags);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder vcnId(String vcnId) {
            this.vcnId = Objects.requireNonNull(vcnId);
            return this;
        }        public GetDataSafePrivateEndpointResult build() {
            return new GetDataSafePrivateEndpointResult(compartmentId, dataSafePrivateEndpointId, definedTags, description, displayName, endpointFqdn, freeformTags, id, nsgIds, privateEndpointId, privateEndpointIp, state, subnetId, systemTags, timeCreated, vcnId);
        }
    }
}
