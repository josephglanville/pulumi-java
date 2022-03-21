// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisAnalysisAclRule;
import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisAnalysisComponent;
import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisAnalysisLoadBalancerListener;
import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisAnalysisLoadBalancerTarget;
import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisAnalysisRouteTableRoute;
import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisAnalysisSecurityGroupRule;
import io.pulumi.awsnative.ec2.outputs.NetworkInsightsAnalysisPortRange;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NetworkInsightsAnalysisExplanation {
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent acl;
    private final @Nullable NetworkInsightsAnalysisAnalysisAclRule aclRule;
    private final @Nullable String address;
    private final @Nullable List<String> addresses;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent attachedTo;
    private final @Nullable List<String> availabilityZones;
    private final @Nullable List<String> cidrs;
    private final @Nullable NetworkInsightsAnalysisAnalysisLoadBalancerListener classicLoadBalancerListener;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent component;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent customerGateway;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent destination;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent destinationVpc;
    private final @Nullable String direction;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent elasticLoadBalancerListener;
    private final @Nullable String explanationCode;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent ingressRouteTable;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent internetGateway;
    private final @Nullable String loadBalancerArn;
    private final @Nullable Integer loadBalancerListenerPort;
    private final @Nullable NetworkInsightsAnalysisAnalysisLoadBalancerTarget loadBalancerTarget;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent loadBalancerTargetGroup;
    private final @Nullable List<NetworkInsightsAnalysisAnalysisComponent> loadBalancerTargetGroups;
    private final @Nullable Integer loadBalancerTargetPort;
    private final @Nullable String missingComponent;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent natGateway;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent networkInterface;
    private final @Nullable String packetField;
    private final @Nullable Integer port;
    private final @Nullable List<NetworkInsightsAnalysisPortRange> portRanges;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent prefixList;
    private final @Nullable List<String> protocols;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent routeTable;
    private final @Nullable NetworkInsightsAnalysisAnalysisRouteTableRoute routeTableRoute;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent securityGroup;
    private final @Nullable NetworkInsightsAnalysisAnalysisSecurityGroupRule securityGroupRule;
    private final @Nullable List<NetworkInsightsAnalysisAnalysisComponent> securityGroups;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent sourceVpc;
    private final @Nullable String state;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent subnet;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent subnetRouteTable;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent vpc;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent vpcEndpoint;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent vpcPeeringConnection;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent vpnConnection;
    private final @Nullable NetworkInsightsAnalysisAnalysisComponent vpnGateway;

    @CustomType.Constructor
    private NetworkInsightsAnalysisExplanation(
        @CustomType.Parameter("acl") @Nullable NetworkInsightsAnalysisAnalysisComponent acl,
        @CustomType.Parameter("aclRule") @Nullable NetworkInsightsAnalysisAnalysisAclRule aclRule,
        @CustomType.Parameter("address") @Nullable String address,
        @CustomType.Parameter("addresses") @Nullable List<String> addresses,
        @CustomType.Parameter("attachedTo") @Nullable NetworkInsightsAnalysisAnalysisComponent attachedTo,
        @CustomType.Parameter("availabilityZones") @Nullable List<String> availabilityZones,
        @CustomType.Parameter("cidrs") @Nullable List<String> cidrs,
        @CustomType.Parameter("classicLoadBalancerListener") @Nullable NetworkInsightsAnalysisAnalysisLoadBalancerListener classicLoadBalancerListener,
        @CustomType.Parameter("component") @Nullable NetworkInsightsAnalysisAnalysisComponent component,
        @CustomType.Parameter("customerGateway") @Nullable NetworkInsightsAnalysisAnalysisComponent customerGateway,
        @CustomType.Parameter("destination") @Nullable NetworkInsightsAnalysisAnalysisComponent destination,
        @CustomType.Parameter("destinationVpc") @Nullable NetworkInsightsAnalysisAnalysisComponent destinationVpc,
        @CustomType.Parameter("direction") @Nullable String direction,
        @CustomType.Parameter("elasticLoadBalancerListener") @Nullable NetworkInsightsAnalysisAnalysisComponent elasticLoadBalancerListener,
        @CustomType.Parameter("explanationCode") @Nullable String explanationCode,
        @CustomType.Parameter("ingressRouteTable") @Nullable NetworkInsightsAnalysisAnalysisComponent ingressRouteTable,
        @CustomType.Parameter("internetGateway") @Nullable NetworkInsightsAnalysisAnalysisComponent internetGateway,
        @CustomType.Parameter("loadBalancerArn") @Nullable String loadBalancerArn,
        @CustomType.Parameter("loadBalancerListenerPort") @Nullable Integer loadBalancerListenerPort,
        @CustomType.Parameter("loadBalancerTarget") @Nullable NetworkInsightsAnalysisAnalysisLoadBalancerTarget loadBalancerTarget,
        @CustomType.Parameter("loadBalancerTargetGroup") @Nullable NetworkInsightsAnalysisAnalysisComponent loadBalancerTargetGroup,
        @CustomType.Parameter("loadBalancerTargetGroups") @Nullable List<NetworkInsightsAnalysisAnalysisComponent> loadBalancerTargetGroups,
        @CustomType.Parameter("loadBalancerTargetPort") @Nullable Integer loadBalancerTargetPort,
        @CustomType.Parameter("missingComponent") @Nullable String missingComponent,
        @CustomType.Parameter("natGateway") @Nullable NetworkInsightsAnalysisAnalysisComponent natGateway,
        @CustomType.Parameter("networkInterface") @Nullable NetworkInsightsAnalysisAnalysisComponent networkInterface,
        @CustomType.Parameter("packetField") @Nullable String packetField,
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("portRanges") @Nullable List<NetworkInsightsAnalysisPortRange> portRanges,
        @CustomType.Parameter("prefixList") @Nullable NetworkInsightsAnalysisAnalysisComponent prefixList,
        @CustomType.Parameter("protocols") @Nullable List<String> protocols,
        @CustomType.Parameter("routeTable") @Nullable NetworkInsightsAnalysisAnalysisComponent routeTable,
        @CustomType.Parameter("routeTableRoute") @Nullable NetworkInsightsAnalysisAnalysisRouteTableRoute routeTableRoute,
        @CustomType.Parameter("securityGroup") @Nullable NetworkInsightsAnalysisAnalysisComponent securityGroup,
        @CustomType.Parameter("securityGroupRule") @Nullable NetworkInsightsAnalysisAnalysisSecurityGroupRule securityGroupRule,
        @CustomType.Parameter("securityGroups") @Nullable List<NetworkInsightsAnalysisAnalysisComponent> securityGroups,
        @CustomType.Parameter("sourceVpc") @Nullable NetworkInsightsAnalysisAnalysisComponent sourceVpc,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("subnet") @Nullable NetworkInsightsAnalysisAnalysisComponent subnet,
        @CustomType.Parameter("subnetRouteTable") @Nullable NetworkInsightsAnalysisAnalysisComponent subnetRouteTable,
        @CustomType.Parameter("vpc") @Nullable NetworkInsightsAnalysisAnalysisComponent vpc,
        @CustomType.Parameter("vpcEndpoint") @Nullable NetworkInsightsAnalysisAnalysisComponent vpcEndpoint,
        @CustomType.Parameter("vpcPeeringConnection") @Nullable NetworkInsightsAnalysisAnalysisComponent vpcPeeringConnection,
        @CustomType.Parameter("vpnConnection") @Nullable NetworkInsightsAnalysisAnalysisComponent vpnConnection,
        @CustomType.Parameter("vpnGateway") @Nullable NetworkInsightsAnalysisAnalysisComponent vpnGateway) {
        this.acl = acl;
        this.aclRule = aclRule;
        this.address = address;
        this.addresses = addresses;
        this.attachedTo = attachedTo;
        this.availabilityZones = availabilityZones;
        this.cidrs = cidrs;
        this.classicLoadBalancerListener = classicLoadBalancerListener;
        this.component = component;
        this.customerGateway = customerGateway;
        this.destination = destination;
        this.destinationVpc = destinationVpc;
        this.direction = direction;
        this.elasticLoadBalancerListener = elasticLoadBalancerListener;
        this.explanationCode = explanationCode;
        this.ingressRouteTable = ingressRouteTable;
        this.internetGateway = internetGateway;
        this.loadBalancerArn = loadBalancerArn;
        this.loadBalancerListenerPort = loadBalancerListenerPort;
        this.loadBalancerTarget = loadBalancerTarget;
        this.loadBalancerTargetGroup = loadBalancerTargetGroup;
        this.loadBalancerTargetGroups = loadBalancerTargetGroups;
        this.loadBalancerTargetPort = loadBalancerTargetPort;
        this.missingComponent = missingComponent;
        this.natGateway = natGateway;
        this.networkInterface = networkInterface;
        this.packetField = packetField;
        this.port = port;
        this.portRanges = portRanges;
        this.prefixList = prefixList;
        this.protocols = protocols;
        this.routeTable = routeTable;
        this.routeTableRoute = routeTableRoute;
        this.securityGroup = securityGroup;
        this.securityGroupRule = securityGroupRule;
        this.securityGroups = securityGroups;
        this.sourceVpc = sourceVpc;
        this.state = state;
        this.subnet = subnet;
        this.subnetRouteTable = subnetRouteTable;
        this.vpc = vpc;
        this.vpcEndpoint = vpcEndpoint;
        this.vpcPeeringConnection = vpcPeeringConnection;
        this.vpnConnection = vpnConnection;
        this.vpnGateway = vpnGateway;
    }

    public Optional<NetworkInsightsAnalysisAnalysisComponent> getAcl() {
        return Optional.ofNullable(this.acl);
    }
    public Optional<NetworkInsightsAnalysisAnalysisAclRule> getAclRule() {
        return Optional.ofNullable(this.aclRule);
    }
    public Optional<String> getAddress() {
        return Optional.ofNullable(this.address);
    }
    public List<String> getAddresses() {
        return this.addresses == null ? List.of() : this.addresses;
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getAttachedTo() {
        return Optional.ofNullable(this.attachedTo);
    }
    public List<String> getAvailabilityZones() {
        return this.availabilityZones == null ? List.of() : this.availabilityZones;
    }
    public List<String> getCidrs() {
        return this.cidrs == null ? List.of() : this.cidrs;
    }
    public Optional<NetworkInsightsAnalysisAnalysisLoadBalancerListener> getClassicLoadBalancerListener() {
        return Optional.ofNullable(this.classicLoadBalancerListener);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getComponent() {
        return Optional.ofNullable(this.component);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getCustomerGateway() {
        return Optional.ofNullable(this.customerGateway);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getDestination() {
        return Optional.ofNullable(this.destination);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getDestinationVpc() {
        return Optional.ofNullable(this.destinationVpc);
    }
    public Optional<String> getDirection() {
        return Optional.ofNullable(this.direction);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getElasticLoadBalancerListener() {
        return Optional.ofNullable(this.elasticLoadBalancerListener);
    }
    public Optional<String> getExplanationCode() {
        return Optional.ofNullable(this.explanationCode);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getIngressRouteTable() {
        return Optional.ofNullable(this.ingressRouteTable);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getInternetGateway() {
        return Optional.ofNullable(this.internetGateway);
    }
    public Optional<String> getLoadBalancerArn() {
        return Optional.ofNullable(this.loadBalancerArn);
    }
    public Optional<Integer> getLoadBalancerListenerPort() {
        return Optional.ofNullable(this.loadBalancerListenerPort);
    }
    public Optional<NetworkInsightsAnalysisAnalysisLoadBalancerTarget> getLoadBalancerTarget() {
        return Optional.ofNullable(this.loadBalancerTarget);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getLoadBalancerTargetGroup() {
        return Optional.ofNullable(this.loadBalancerTargetGroup);
    }
    public List<NetworkInsightsAnalysisAnalysisComponent> getLoadBalancerTargetGroups() {
        return this.loadBalancerTargetGroups == null ? List.of() : this.loadBalancerTargetGroups;
    }
    public Optional<Integer> getLoadBalancerTargetPort() {
        return Optional.ofNullable(this.loadBalancerTargetPort);
    }
    public Optional<String> getMissingComponent() {
        return Optional.ofNullable(this.missingComponent);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getNatGateway() {
        return Optional.ofNullable(this.natGateway);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getNetworkInterface() {
        return Optional.ofNullable(this.networkInterface);
    }
    public Optional<String> getPacketField() {
        return Optional.ofNullable(this.packetField);
    }
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    public List<NetworkInsightsAnalysisPortRange> getPortRanges() {
        return this.portRanges == null ? List.of() : this.portRanges;
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getPrefixList() {
        return Optional.ofNullable(this.prefixList);
    }
    public List<String> getProtocols() {
        return this.protocols == null ? List.of() : this.protocols;
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getRouteTable() {
        return Optional.ofNullable(this.routeTable);
    }
    public Optional<NetworkInsightsAnalysisAnalysisRouteTableRoute> getRouteTableRoute() {
        return Optional.ofNullable(this.routeTableRoute);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getSecurityGroup() {
        return Optional.ofNullable(this.securityGroup);
    }
    public Optional<NetworkInsightsAnalysisAnalysisSecurityGroupRule> getSecurityGroupRule() {
        return Optional.ofNullable(this.securityGroupRule);
    }
    public List<NetworkInsightsAnalysisAnalysisComponent> getSecurityGroups() {
        return this.securityGroups == null ? List.of() : this.securityGroups;
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getSourceVpc() {
        return Optional.ofNullable(this.sourceVpc);
    }
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getSubnetRouteTable() {
        return Optional.ofNullable(this.subnetRouteTable);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getVpc() {
        return Optional.ofNullable(this.vpc);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getVpcEndpoint() {
        return Optional.ofNullable(this.vpcEndpoint);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getVpcPeeringConnection() {
        return Optional.ofNullable(this.vpcPeeringConnection);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getVpnConnection() {
        return Optional.ofNullable(this.vpnConnection);
    }
    public Optional<NetworkInsightsAnalysisAnalysisComponent> getVpnGateway() {
        return Optional.ofNullable(this.vpnGateway);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInsightsAnalysisExplanation defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable NetworkInsightsAnalysisAnalysisComponent acl;
        private @Nullable NetworkInsightsAnalysisAnalysisAclRule aclRule;
        private @Nullable String address;
        private @Nullable List<String> addresses;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent attachedTo;
        private @Nullable List<String> availabilityZones;
        private @Nullable List<String> cidrs;
        private @Nullable NetworkInsightsAnalysisAnalysisLoadBalancerListener classicLoadBalancerListener;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent component;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent customerGateway;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent destination;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent destinationVpc;
        private @Nullable String direction;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent elasticLoadBalancerListener;
        private @Nullable String explanationCode;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent ingressRouteTable;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent internetGateway;
        private @Nullable String loadBalancerArn;
        private @Nullable Integer loadBalancerListenerPort;
        private @Nullable NetworkInsightsAnalysisAnalysisLoadBalancerTarget loadBalancerTarget;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent loadBalancerTargetGroup;
        private @Nullable List<NetworkInsightsAnalysisAnalysisComponent> loadBalancerTargetGroups;
        private @Nullable Integer loadBalancerTargetPort;
        private @Nullable String missingComponent;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent natGateway;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent networkInterface;
        private @Nullable String packetField;
        private @Nullable Integer port;
        private @Nullable List<NetworkInsightsAnalysisPortRange> portRanges;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent prefixList;
        private @Nullable List<String> protocols;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent routeTable;
        private @Nullable NetworkInsightsAnalysisAnalysisRouteTableRoute routeTableRoute;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent securityGroup;
        private @Nullable NetworkInsightsAnalysisAnalysisSecurityGroupRule securityGroupRule;
        private @Nullable List<NetworkInsightsAnalysisAnalysisComponent> securityGroups;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent sourceVpc;
        private @Nullable String state;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent subnet;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent subnetRouteTable;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent vpc;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent vpcEndpoint;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent vpcPeeringConnection;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent vpnConnection;
        private @Nullable NetworkInsightsAnalysisAnalysisComponent vpnGateway;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInsightsAnalysisExplanation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acl = defaults.acl;
    	      this.aclRule = defaults.aclRule;
    	      this.address = defaults.address;
    	      this.addresses = defaults.addresses;
    	      this.attachedTo = defaults.attachedTo;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.cidrs = defaults.cidrs;
    	      this.classicLoadBalancerListener = defaults.classicLoadBalancerListener;
    	      this.component = defaults.component;
    	      this.customerGateway = defaults.customerGateway;
    	      this.destination = defaults.destination;
    	      this.destinationVpc = defaults.destinationVpc;
    	      this.direction = defaults.direction;
    	      this.elasticLoadBalancerListener = defaults.elasticLoadBalancerListener;
    	      this.explanationCode = defaults.explanationCode;
    	      this.ingressRouteTable = defaults.ingressRouteTable;
    	      this.internetGateway = defaults.internetGateway;
    	      this.loadBalancerArn = defaults.loadBalancerArn;
    	      this.loadBalancerListenerPort = defaults.loadBalancerListenerPort;
    	      this.loadBalancerTarget = defaults.loadBalancerTarget;
    	      this.loadBalancerTargetGroup = defaults.loadBalancerTargetGroup;
    	      this.loadBalancerTargetGroups = defaults.loadBalancerTargetGroups;
    	      this.loadBalancerTargetPort = defaults.loadBalancerTargetPort;
    	      this.missingComponent = defaults.missingComponent;
    	      this.natGateway = defaults.natGateway;
    	      this.networkInterface = defaults.networkInterface;
    	      this.packetField = defaults.packetField;
    	      this.port = defaults.port;
    	      this.portRanges = defaults.portRanges;
    	      this.prefixList = defaults.prefixList;
    	      this.protocols = defaults.protocols;
    	      this.routeTable = defaults.routeTable;
    	      this.routeTableRoute = defaults.routeTableRoute;
    	      this.securityGroup = defaults.securityGroup;
    	      this.securityGroupRule = defaults.securityGroupRule;
    	      this.securityGroups = defaults.securityGroups;
    	      this.sourceVpc = defaults.sourceVpc;
    	      this.state = defaults.state;
    	      this.subnet = defaults.subnet;
    	      this.subnetRouteTable = defaults.subnetRouteTable;
    	      this.vpc = defaults.vpc;
    	      this.vpcEndpoint = defaults.vpcEndpoint;
    	      this.vpcPeeringConnection = defaults.vpcPeeringConnection;
    	      this.vpnConnection = defaults.vpnConnection;
    	      this.vpnGateway = defaults.vpnGateway;
        }

        public Builder acl(@Nullable NetworkInsightsAnalysisAnalysisComponent acl) {
            this.acl = acl;
            return this;
        }
        public Builder aclRule(@Nullable NetworkInsightsAnalysisAnalysisAclRule aclRule) {
            this.aclRule = aclRule;
            return this;
        }
        public Builder address(@Nullable String address) {
            this.address = address;
            return this;
        }
        public Builder addresses(@Nullable List<String> addresses) {
            this.addresses = addresses;
            return this;
        }
        public Builder addresses(String... addresses) {
            return addresses(List.of(addresses));
        }
        public Builder attachedTo(@Nullable NetworkInsightsAnalysisAnalysisComponent attachedTo) {
            this.attachedTo = attachedTo;
            return this;
        }
        public Builder availabilityZones(@Nullable List<String> availabilityZones) {
            this.availabilityZones = availabilityZones;
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        public Builder cidrs(@Nullable List<String> cidrs) {
            this.cidrs = cidrs;
            return this;
        }
        public Builder cidrs(String... cidrs) {
            return cidrs(List.of(cidrs));
        }
        public Builder classicLoadBalancerListener(@Nullable NetworkInsightsAnalysisAnalysisLoadBalancerListener classicLoadBalancerListener) {
            this.classicLoadBalancerListener = classicLoadBalancerListener;
            return this;
        }
        public Builder component(@Nullable NetworkInsightsAnalysisAnalysisComponent component) {
            this.component = component;
            return this;
        }
        public Builder customerGateway(@Nullable NetworkInsightsAnalysisAnalysisComponent customerGateway) {
            this.customerGateway = customerGateway;
            return this;
        }
        public Builder destination(@Nullable NetworkInsightsAnalysisAnalysisComponent destination) {
            this.destination = destination;
            return this;
        }
        public Builder destinationVpc(@Nullable NetworkInsightsAnalysisAnalysisComponent destinationVpc) {
            this.destinationVpc = destinationVpc;
            return this;
        }
        public Builder direction(@Nullable String direction) {
            this.direction = direction;
            return this;
        }
        public Builder elasticLoadBalancerListener(@Nullable NetworkInsightsAnalysisAnalysisComponent elasticLoadBalancerListener) {
            this.elasticLoadBalancerListener = elasticLoadBalancerListener;
            return this;
        }
        public Builder explanationCode(@Nullable String explanationCode) {
            this.explanationCode = explanationCode;
            return this;
        }
        public Builder ingressRouteTable(@Nullable NetworkInsightsAnalysisAnalysisComponent ingressRouteTable) {
            this.ingressRouteTable = ingressRouteTable;
            return this;
        }
        public Builder internetGateway(@Nullable NetworkInsightsAnalysisAnalysisComponent internetGateway) {
            this.internetGateway = internetGateway;
            return this;
        }
        public Builder loadBalancerArn(@Nullable String loadBalancerArn) {
            this.loadBalancerArn = loadBalancerArn;
            return this;
        }
        public Builder loadBalancerListenerPort(@Nullable Integer loadBalancerListenerPort) {
            this.loadBalancerListenerPort = loadBalancerListenerPort;
            return this;
        }
        public Builder loadBalancerTarget(@Nullable NetworkInsightsAnalysisAnalysisLoadBalancerTarget loadBalancerTarget) {
            this.loadBalancerTarget = loadBalancerTarget;
            return this;
        }
        public Builder loadBalancerTargetGroup(@Nullable NetworkInsightsAnalysisAnalysisComponent loadBalancerTargetGroup) {
            this.loadBalancerTargetGroup = loadBalancerTargetGroup;
            return this;
        }
        public Builder loadBalancerTargetGroups(@Nullable List<NetworkInsightsAnalysisAnalysisComponent> loadBalancerTargetGroups) {
            this.loadBalancerTargetGroups = loadBalancerTargetGroups;
            return this;
        }
        public Builder loadBalancerTargetGroups(NetworkInsightsAnalysisAnalysisComponent... loadBalancerTargetGroups) {
            return loadBalancerTargetGroups(List.of(loadBalancerTargetGroups));
        }
        public Builder loadBalancerTargetPort(@Nullable Integer loadBalancerTargetPort) {
            this.loadBalancerTargetPort = loadBalancerTargetPort;
            return this;
        }
        public Builder missingComponent(@Nullable String missingComponent) {
            this.missingComponent = missingComponent;
            return this;
        }
        public Builder natGateway(@Nullable NetworkInsightsAnalysisAnalysisComponent natGateway) {
            this.natGateway = natGateway;
            return this;
        }
        public Builder networkInterface(@Nullable NetworkInsightsAnalysisAnalysisComponent networkInterface) {
            this.networkInterface = networkInterface;
            return this;
        }
        public Builder packetField(@Nullable String packetField) {
            this.packetField = packetField;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public Builder portRanges(@Nullable List<NetworkInsightsAnalysisPortRange> portRanges) {
            this.portRanges = portRanges;
            return this;
        }
        public Builder portRanges(NetworkInsightsAnalysisPortRange... portRanges) {
            return portRanges(List.of(portRanges));
        }
        public Builder prefixList(@Nullable NetworkInsightsAnalysisAnalysisComponent prefixList) {
            this.prefixList = prefixList;
            return this;
        }
        public Builder protocols(@Nullable List<String> protocols) {
            this.protocols = protocols;
            return this;
        }
        public Builder protocols(String... protocols) {
            return protocols(List.of(protocols));
        }
        public Builder routeTable(@Nullable NetworkInsightsAnalysisAnalysisComponent routeTable) {
            this.routeTable = routeTable;
            return this;
        }
        public Builder routeTableRoute(@Nullable NetworkInsightsAnalysisAnalysisRouteTableRoute routeTableRoute) {
            this.routeTableRoute = routeTableRoute;
            return this;
        }
        public Builder securityGroup(@Nullable NetworkInsightsAnalysisAnalysisComponent securityGroup) {
            this.securityGroup = securityGroup;
            return this;
        }
        public Builder securityGroupRule(@Nullable NetworkInsightsAnalysisAnalysisSecurityGroupRule securityGroupRule) {
            this.securityGroupRule = securityGroupRule;
            return this;
        }
        public Builder securityGroups(@Nullable List<NetworkInsightsAnalysisAnalysisComponent> securityGroups) {
            this.securityGroups = securityGroups;
            return this;
        }
        public Builder securityGroups(NetworkInsightsAnalysisAnalysisComponent... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        public Builder sourceVpc(@Nullable NetworkInsightsAnalysisAnalysisComponent sourceVpc) {
            this.sourceVpc = sourceVpc;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder subnet(@Nullable NetworkInsightsAnalysisAnalysisComponent subnet) {
            this.subnet = subnet;
            return this;
        }
        public Builder subnetRouteTable(@Nullable NetworkInsightsAnalysisAnalysisComponent subnetRouteTable) {
            this.subnetRouteTable = subnetRouteTable;
            return this;
        }
        public Builder vpc(@Nullable NetworkInsightsAnalysisAnalysisComponent vpc) {
            this.vpc = vpc;
            return this;
        }
        public Builder vpcEndpoint(@Nullable NetworkInsightsAnalysisAnalysisComponent vpcEndpoint) {
            this.vpcEndpoint = vpcEndpoint;
            return this;
        }
        public Builder vpcPeeringConnection(@Nullable NetworkInsightsAnalysisAnalysisComponent vpcPeeringConnection) {
            this.vpcPeeringConnection = vpcPeeringConnection;
            return this;
        }
        public Builder vpnConnection(@Nullable NetworkInsightsAnalysisAnalysisComponent vpnConnection) {
            this.vpnConnection = vpnConnection;
            return this;
        }
        public Builder vpnGateway(@Nullable NetworkInsightsAnalysisAnalysisComponent vpnGateway) {
            this.vpnGateway = vpnGateway;
            return this;
        }        public NetworkInsightsAnalysisExplanation build() {
            return new NetworkInsightsAnalysisExplanation(acl, aclRule, address, addresses, attachedTo, availabilityZones, cidrs, classicLoadBalancerListener, component, customerGateway, destination, destinationVpc, direction, elasticLoadBalancerListener, explanationCode, ingressRouteTable, internetGateway, loadBalancerArn, loadBalancerListenerPort, loadBalancerTarget, loadBalancerTargetGroup, loadBalancerTargetGroups, loadBalancerTargetPort, missingComponent, natGateway, networkInterface, packetField, port, portRanges, prefixList, protocols, routeTable, routeTableRoute, securityGroup, securityGroupRule, securityGroups, sourceVpc, state, subnet, subnetRouteTable, vpc, vpcEndpoint, vpcPeeringConnection, vpnConnection, vpnGateway);
        }
    }
}
