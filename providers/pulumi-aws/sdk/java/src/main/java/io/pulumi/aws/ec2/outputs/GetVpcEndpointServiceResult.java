// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.outputs;

import io.pulumi.aws.ec2.outputs.GetVpcEndpointServiceFilter;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetVpcEndpointServiceResult {
    /**
     * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
     * 
     */
    private final Boolean acceptanceRequired;
    /**
     * The Amazon Resource Name (ARN) of the VPC endpoint service.
     * 
     */
    private final String arn;
    /**
     * The Availability Zones in which the service is available.
     * 
     */
    private final List<String> availabilityZones;
    /**
     * The DNS names for the service.
     * 
     */
    private final List<String> baseEndpointDnsNames;
    private final @Nullable List<GetVpcEndpointServiceFilter> filters;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    /**
     * Whether or not the service manages its VPC endpoints - `true` or `false`.
     * 
     */
    private final Boolean managesVpcEndpoints;
    /**
     * The AWS account ID of the service owner or `amazon`.
     * 
     */
    private final String owner;
    /**
     * The private DNS name for the service.
     * 
     */
    private final String privateDnsName;
    private final @Nullable String service;
    /**
     * The ID of the endpoint service.
     * 
     */
    private final String serviceId;
    private final String serviceName;
    private final String serviceType;
    /**
     * A map of tags assigned to the resource.
     * 
     */
    private final Map<String,String> tags;
    /**
     * Whether or not the service supports endpoint policies - `true` or `false`.
     * 
     */
    private final Boolean vpcEndpointPolicySupported;

    @OutputCustomType.Constructor
    private GetVpcEndpointServiceResult(
        @OutputCustomType.Parameter("acceptanceRequired") Boolean acceptanceRequired,
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("availabilityZones") List<String> availabilityZones,
        @OutputCustomType.Parameter("baseEndpointDnsNames") List<String> baseEndpointDnsNames,
        @OutputCustomType.Parameter("filters") @Nullable List<GetVpcEndpointServiceFilter> filters,
        @OutputCustomType.Parameter("id") String id,
        @OutputCustomType.Parameter("managesVpcEndpoints") Boolean managesVpcEndpoints,
        @OutputCustomType.Parameter("owner") String owner,
        @OutputCustomType.Parameter("privateDnsName") String privateDnsName,
        @OutputCustomType.Parameter("service") @Nullable String service,
        @OutputCustomType.Parameter("serviceId") String serviceId,
        @OutputCustomType.Parameter("serviceName") String serviceName,
        @OutputCustomType.Parameter("serviceType") String serviceType,
        @OutputCustomType.Parameter("tags") Map<String,String> tags,
        @OutputCustomType.Parameter("vpcEndpointPolicySupported") Boolean vpcEndpointPolicySupported) {
        this.acceptanceRequired = acceptanceRequired;
        this.arn = arn;
        this.availabilityZones = availabilityZones;
        this.baseEndpointDnsNames = baseEndpointDnsNames;
        this.filters = filters;
        this.id = id;
        this.managesVpcEndpoints = managesVpcEndpoints;
        this.owner = owner;
        this.privateDnsName = privateDnsName;
        this.service = service;
        this.serviceId = serviceId;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
        this.tags = tags;
        this.vpcEndpointPolicySupported = vpcEndpointPolicySupported;
    }

    /**
     * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
     * 
    */
    public Boolean getAcceptanceRequired() {
        return this.acceptanceRequired;
    }
    /**
     * The Amazon Resource Name (ARN) of the VPC endpoint service.
     * 
    */
    public String getArn() {
        return this.arn;
    }
    /**
     * The Availability Zones in which the service is available.
     * 
    */
    public List<String> getAvailabilityZones() {
        return this.availabilityZones;
    }
    /**
     * The DNS names for the service.
     * 
    */
    public List<String> getBaseEndpointDnsNames() {
        return this.baseEndpointDnsNames;
    }
    public List<GetVpcEndpointServiceFilter> getFilters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Whether or not the service manages its VPC endpoints - `true` or `false`.
     * 
    */
    public Boolean getManagesVpcEndpoints() {
        return this.managesVpcEndpoints;
    }
    /**
     * The AWS account ID of the service owner or `amazon`.
     * 
    */
    public String getOwner() {
        return this.owner;
    }
    /**
     * The private DNS name for the service.
     * 
    */
    public String getPrivateDnsName() {
        return this.privateDnsName;
    }
    public Optional<String> getService() {
        return Optional.ofNullable(this.service);
    }
    /**
     * The ID of the endpoint service.
     * 
    */
    public String getServiceId() {
        return this.serviceId;
    }
    public String getServiceName() {
        return this.serviceName;
    }
    public String getServiceType() {
        return this.serviceType;
    }
    /**
     * A map of tags assigned to the resource.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags;
    }
    /**
     * Whether or not the service supports endpoint policies - `true` or `false`.
     * 
    */
    public Boolean getVpcEndpointPolicySupported() {
        return this.vpcEndpointPolicySupported;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVpcEndpointServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean acceptanceRequired;
        private String arn;
        private List<String> availabilityZones;
        private List<String> baseEndpointDnsNames;
        private @Nullable List<GetVpcEndpointServiceFilter> filters;
        private String id;
        private Boolean managesVpcEndpoints;
        private String owner;
        private String privateDnsName;
        private @Nullable String service;
        private String serviceId;
        private String serviceName;
        private String serviceType;
        private Map<String,String> tags;
        private Boolean vpcEndpointPolicySupported;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVpcEndpointServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptanceRequired = defaults.acceptanceRequired;
    	      this.arn = defaults.arn;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.baseEndpointDnsNames = defaults.baseEndpointDnsNames;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.managesVpcEndpoints = defaults.managesVpcEndpoints;
    	      this.owner = defaults.owner;
    	      this.privateDnsName = defaults.privateDnsName;
    	      this.service = defaults.service;
    	      this.serviceId = defaults.serviceId;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceType = defaults.serviceType;
    	      this.tags = defaults.tags;
    	      this.vpcEndpointPolicySupported = defaults.vpcEndpointPolicySupported;
        }

        public Builder setAcceptanceRequired(Boolean acceptanceRequired) {
            this.acceptanceRequired = Objects.requireNonNull(acceptanceRequired);
            return this;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setAvailabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }

        public Builder setBaseEndpointDnsNames(List<String> baseEndpointDnsNames) {
            this.baseEndpointDnsNames = Objects.requireNonNull(baseEndpointDnsNames);
            return this;
        }

        public Builder setFilters(@Nullable List<GetVpcEndpointServiceFilter> filters) {
            this.filters = filters;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setManagesVpcEndpoints(Boolean managesVpcEndpoints) {
            this.managesVpcEndpoints = Objects.requireNonNull(managesVpcEndpoints);
            return this;
        }

        public Builder setOwner(String owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }

        public Builder setPrivateDnsName(String privateDnsName) {
            this.privateDnsName = Objects.requireNonNull(privateDnsName);
            return this;
        }

        public Builder setService(@Nullable String service) {
            this.service = service;
            return this;
        }

        public Builder setServiceId(String serviceId) {
            this.serviceId = Objects.requireNonNull(serviceId);
            return this;
        }

        public Builder setServiceName(String serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }

        public Builder setServiceType(String serviceType) {
            this.serviceType = Objects.requireNonNull(serviceType);
            return this;
        }

        public Builder setTags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }

        public Builder setVpcEndpointPolicySupported(Boolean vpcEndpointPolicySupported) {
            this.vpcEndpointPolicySupported = Objects.requireNonNull(vpcEndpointPolicySupported);
            return this;
        }
        public GetVpcEndpointServiceResult build() {
            return new GetVpcEndpointServiceResult(acceptanceRequired, arn, availabilityZones, baseEndpointDnsNames, filters, id, managesVpcEndpoints, owner, privateDnsName, service, serviceId, serviceName, serviceType, tags, vpcEndpointPolicySupported);
        }
    }
}
