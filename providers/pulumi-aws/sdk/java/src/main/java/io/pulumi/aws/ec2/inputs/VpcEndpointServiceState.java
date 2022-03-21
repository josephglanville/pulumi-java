// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.VpcEndpointServicePrivateDnsNameConfigurationGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VpcEndpointServiceState extends io.pulumi.resources.ResourceArgs {

    public static final VpcEndpointServiceState Empty = new VpcEndpointServiceState();

    /**
     * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
     * 
     */
    @Import(name="acceptanceRequired")
      private final @Nullable Output<Boolean> acceptanceRequired;

    public Output<Boolean> getAcceptanceRequired() {
        return this.acceptanceRequired == null ? Output.empty() : this.acceptanceRequired;
    }

    /**
     * The ARNs of one or more principals allowed to discover the endpoint service.
     * 
     */
    @Import(name="allowedPrincipals")
      private final @Nullable Output<List<String>> allowedPrincipals;

    public Output<List<String>> getAllowedPrincipals() {
        return this.allowedPrincipals == null ? Output.empty() : this.allowedPrincipals;
    }

    /**
     * The Amazon Resource Name (ARN) of the VPC endpoint service.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The Availability Zones in which the service is available.
     * 
     */
    @Import(name="availabilityZones")
      private final @Nullable Output<List<String>> availabilityZones;

    public Output<List<String>> getAvailabilityZones() {
        return this.availabilityZones == null ? Output.empty() : this.availabilityZones;
    }

    /**
     * The DNS names for the service.
     * 
     */
    @Import(name="baseEndpointDnsNames")
      private final @Nullable Output<List<String>> baseEndpointDnsNames;

    public Output<List<String>> getBaseEndpointDnsNames() {
        return this.baseEndpointDnsNames == null ? Output.empty() : this.baseEndpointDnsNames;
    }

    /**
     * Amazon Resource Names (ARNs) of one or more Gateway Load Balancers for the endpoint service.
     * 
     */
    @Import(name="gatewayLoadBalancerArns")
      private final @Nullable Output<List<String>> gatewayLoadBalancerArns;

    public Output<List<String>> getGatewayLoadBalancerArns() {
        return this.gatewayLoadBalancerArns == null ? Output.empty() : this.gatewayLoadBalancerArns;
    }

    /**
     * Whether or not the service manages its VPC endpoints - `true` or `false`.
     * 
     */
    @Import(name="managesVpcEndpoints")
      private final @Nullable Output<Boolean> managesVpcEndpoints;

    public Output<Boolean> getManagesVpcEndpoints() {
        return this.managesVpcEndpoints == null ? Output.empty() : this.managesVpcEndpoints;
    }

    /**
     * Amazon Resource Names (ARNs) of one or more Network Load Balancers for the endpoint service.
     * 
     */
    @Import(name="networkLoadBalancerArns")
      private final @Nullable Output<List<String>> networkLoadBalancerArns;

    public Output<List<String>> getNetworkLoadBalancerArns() {
        return this.networkLoadBalancerArns == null ? Output.empty() : this.networkLoadBalancerArns;
    }

    /**
     * The private DNS name for the service.
     * 
     */
    @Import(name="privateDnsName")
      private final @Nullable Output<String> privateDnsName;

    public Output<String> getPrivateDnsName() {
        return this.privateDnsName == null ? Output.empty() : this.privateDnsName;
    }

    /**
     * List of objects containing information about the endpoint service private DNS name configuration.
     * 
     */
    @Import(name="privateDnsNameConfigurations")
      private final @Nullable Output<List<VpcEndpointServicePrivateDnsNameConfigurationGetArgs>> privateDnsNameConfigurations;

    public Output<List<VpcEndpointServicePrivateDnsNameConfigurationGetArgs>> getPrivateDnsNameConfigurations() {
        return this.privateDnsNameConfigurations == null ? Output.empty() : this.privateDnsNameConfigurations;
    }

    /**
     * The service name.
     * 
     */
    @Import(name="serviceName")
      private final @Nullable Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName == null ? Output.empty() : this.serviceName;
    }

    /**
     * The service type, `Gateway` or `Interface`.
     * 
     */
    @Import(name="serviceType")
      private final @Nullable Output<String> serviceType;

    public Output<String> getServiceType() {
        return this.serviceType == null ? Output.empty() : this.serviceType;
    }

    /**
     * Verification state of the VPC endpoint service. Consumers of the endpoint service can use the private name only when the state is `verified`.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<String> state;

    public Output<String> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public VpcEndpointServiceState(
        @Nullable Output<Boolean> acceptanceRequired,
        @Nullable Output<List<String>> allowedPrincipals,
        @Nullable Output<String> arn,
        @Nullable Output<List<String>> availabilityZones,
        @Nullable Output<List<String>> baseEndpointDnsNames,
        @Nullable Output<List<String>> gatewayLoadBalancerArns,
        @Nullable Output<Boolean> managesVpcEndpoints,
        @Nullable Output<List<String>> networkLoadBalancerArns,
        @Nullable Output<String> privateDnsName,
        @Nullable Output<List<VpcEndpointServicePrivateDnsNameConfigurationGetArgs>> privateDnsNameConfigurations,
        @Nullable Output<String> serviceName,
        @Nullable Output<String> serviceType,
        @Nullable Output<String> state,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.acceptanceRequired = acceptanceRequired;
        this.allowedPrincipals = allowedPrincipals;
        this.arn = arn;
        this.availabilityZones = availabilityZones;
        this.baseEndpointDnsNames = baseEndpointDnsNames;
        this.gatewayLoadBalancerArns = gatewayLoadBalancerArns;
        this.managesVpcEndpoints = managesVpcEndpoints;
        this.networkLoadBalancerArns = networkLoadBalancerArns;
        this.privateDnsName = privateDnsName;
        this.privateDnsNameConfigurations = privateDnsNameConfigurations;
        this.serviceName = serviceName;
        this.serviceType = serviceType;
        this.state = state;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private VpcEndpointServiceState() {
        this.acceptanceRequired = Output.empty();
        this.allowedPrincipals = Output.empty();
        this.arn = Output.empty();
        this.availabilityZones = Output.empty();
        this.baseEndpointDnsNames = Output.empty();
        this.gatewayLoadBalancerArns = Output.empty();
        this.managesVpcEndpoints = Output.empty();
        this.networkLoadBalancerArns = Output.empty();
        this.privateDnsName = Output.empty();
        this.privateDnsNameConfigurations = Output.empty();
        this.serviceName = Output.empty();
        this.serviceType = Output.empty();
        this.state = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcEndpointServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> acceptanceRequired;
        private @Nullable Output<List<String>> allowedPrincipals;
        private @Nullable Output<String> arn;
        private @Nullable Output<List<String>> availabilityZones;
        private @Nullable Output<List<String>> baseEndpointDnsNames;
        private @Nullable Output<List<String>> gatewayLoadBalancerArns;
        private @Nullable Output<Boolean> managesVpcEndpoints;
        private @Nullable Output<List<String>> networkLoadBalancerArns;
        private @Nullable Output<String> privateDnsName;
        private @Nullable Output<List<VpcEndpointServicePrivateDnsNameConfigurationGetArgs>> privateDnsNameConfigurations;
        private @Nullable Output<String> serviceName;
        private @Nullable Output<String> serviceType;
        private @Nullable Output<String> state;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcEndpointServiceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptanceRequired = defaults.acceptanceRequired;
    	      this.allowedPrincipals = defaults.allowedPrincipals;
    	      this.arn = defaults.arn;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.baseEndpointDnsNames = defaults.baseEndpointDnsNames;
    	      this.gatewayLoadBalancerArns = defaults.gatewayLoadBalancerArns;
    	      this.managesVpcEndpoints = defaults.managesVpcEndpoints;
    	      this.networkLoadBalancerArns = defaults.networkLoadBalancerArns;
    	      this.privateDnsName = defaults.privateDnsName;
    	      this.privateDnsNameConfigurations = defaults.privateDnsNameConfigurations;
    	      this.serviceName = defaults.serviceName;
    	      this.serviceType = defaults.serviceType;
    	      this.state = defaults.state;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder acceptanceRequired(@Nullable Output<Boolean> acceptanceRequired) {
            this.acceptanceRequired = acceptanceRequired;
            return this;
        }
        public Builder acceptanceRequired(@Nullable Boolean acceptanceRequired) {
            this.acceptanceRequired = Output.ofNullable(acceptanceRequired);
            return this;
        }
        public Builder allowedPrincipals(@Nullable Output<List<String>> allowedPrincipals) {
            this.allowedPrincipals = allowedPrincipals;
            return this;
        }
        public Builder allowedPrincipals(@Nullable List<String> allowedPrincipals) {
            this.allowedPrincipals = Output.ofNullable(allowedPrincipals);
            return this;
        }
        public Builder allowedPrincipals(String... allowedPrincipals) {
            return allowedPrincipals(List.of(allowedPrincipals));
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder availabilityZones(@Nullable Output<List<String>> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }
        public Builder availabilityZones(@Nullable List<String> availabilityZones) {
            this.availabilityZones = Output.ofNullable(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        public Builder baseEndpointDnsNames(@Nullable Output<List<String>> baseEndpointDnsNames) {
            this.baseEndpointDnsNames = baseEndpointDnsNames;
            return this;
        }
        public Builder baseEndpointDnsNames(@Nullable List<String> baseEndpointDnsNames) {
            this.baseEndpointDnsNames = Output.ofNullable(baseEndpointDnsNames);
            return this;
        }
        public Builder baseEndpointDnsNames(String... baseEndpointDnsNames) {
            return baseEndpointDnsNames(List.of(baseEndpointDnsNames));
        }
        public Builder gatewayLoadBalancerArns(@Nullable Output<List<String>> gatewayLoadBalancerArns) {
            this.gatewayLoadBalancerArns = gatewayLoadBalancerArns;
            return this;
        }
        public Builder gatewayLoadBalancerArns(@Nullable List<String> gatewayLoadBalancerArns) {
            this.gatewayLoadBalancerArns = Output.ofNullable(gatewayLoadBalancerArns);
            return this;
        }
        public Builder gatewayLoadBalancerArns(String... gatewayLoadBalancerArns) {
            return gatewayLoadBalancerArns(List.of(gatewayLoadBalancerArns));
        }
        public Builder managesVpcEndpoints(@Nullable Output<Boolean> managesVpcEndpoints) {
            this.managesVpcEndpoints = managesVpcEndpoints;
            return this;
        }
        public Builder managesVpcEndpoints(@Nullable Boolean managesVpcEndpoints) {
            this.managesVpcEndpoints = Output.ofNullable(managesVpcEndpoints);
            return this;
        }
        public Builder networkLoadBalancerArns(@Nullable Output<List<String>> networkLoadBalancerArns) {
            this.networkLoadBalancerArns = networkLoadBalancerArns;
            return this;
        }
        public Builder networkLoadBalancerArns(@Nullable List<String> networkLoadBalancerArns) {
            this.networkLoadBalancerArns = Output.ofNullable(networkLoadBalancerArns);
            return this;
        }
        public Builder networkLoadBalancerArns(String... networkLoadBalancerArns) {
            return networkLoadBalancerArns(List.of(networkLoadBalancerArns));
        }
        public Builder privateDnsName(@Nullable Output<String> privateDnsName) {
            this.privateDnsName = privateDnsName;
            return this;
        }
        public Builder privateDnsName(@Nullable String privateDnsName) {
            this.privateDnsName = Output.ofNullable(privateDnsName);
            return this;
        }
        public Builder privateDnsNameConfigurations(@Nullable Output<List<VpcEndpointServicePrivateDnsNameConfigurationGetArgs>> privateDnsNameConfigurations) {
            this.privateDnsNameConfigurations = privateDnsNameConfigurations;
            return this;
        }
        public Builder privateDnsNameConfigurations(@Nullable List<VpcEndpointServicePrivateDnsNameConfigurationGetArgs> privateDnsNameConfigurations) {
            this.privateDnsNameConfigurations = Output.ofNullable(privateDnsNameConfigurations);
            return this;
        }
        public Builder privateDnsNameConfigurations(VpcEndpointServicePrivateDnsNameConfigurationGetArgs... privateDnsNameConfigurations) {
            return privateDnsNameConfigurations(List.of(privateDnsNameConfigurations));
        }
        public Builder serviceName(@Nullable Output<String> serviceName) {
            this.serviceName = serviceName;
            return this;
        }
        public Builder serviceName(@Nullable String serviceName) {
            this.serviceName = Output.ofNullable(serviceName);
            return this;
        }
        public Builder serviceType(@Nullable Output<String> serviceType) {
            this.serviceType = serviceType;
            return this;
        }
        public Builder serviceType(@Nullable String serviceType) {
            this.serviceType = Output.ofNullable(serviceType);
            return this;
        }
        public Builder state(@Nullable Output<String> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = Output.ofNullable(state);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }        public VpcEndpointServiceState build() {
            return new VpcEndpointServiceState(acceptanceRequired, allowedPrincipals, arn, availabilityZones, baseEndpointDnsNames, gatewayLoadBalancerArns, managesVpcEndpoints, networkLoadBalancerArns, privateDnsName, privateDnsNameConfigurations, serviceName, serviceType, state, tags, tagsAll);
        }
    }
}
