// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.outputs;

import io.pulumi.aws.applicationloadbalancing.outputs.GetLoadBalancerAccessLogs;
import io.pulumi.aws.applicationloadbalancing.outputs.GetLoadBalancerSubnetMapping;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetLoadBalancerResult {
    private final GetLoadBalancerAccessLogs accessLogs;
    private final String arn;
    private final String arnSuffix;
    private final String customerOwnedIpv4Pool;
    private final String desyncMitigationMode;
    private final String dnsName;
    private final Boolean dropInvalidHeaderFields;
    private final Boolean enableDeletionProtection;
    private final Boolean enableHttp2;
    private final Boolean enableWafFailOpen;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final Integer idleTimeout;
    private final Boolean internal;
    private final String ipAddressType;
    private final String loadBalancerType;
    private final String name;
    private final List<String> securityGroups;
    private final List<GetLoadBalancerSubnetMapping> subnetMappings;
    private final List<String> subnets;
    private final Map<String,String> tags;
    private final String vpcId;
    private final String zoneId;

    @CustomType.Constructor
    private GetLoadBalancerResult(
        @CustomType.Parameter("accessLogs") GetLoadBalancerAccessLogs accessLogs,
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("arnSuffix") String arnSuffix,
        @CustomType.Parameter("customerOwnedIpv4Pool") String customerOwnedIpv4Pool,
        @CustomType.Parameter("desyncMitigationMode") String desyncMitigationMode,
        @CustomType.Parameter("dnsName") String dnsName,
        @CustomType.Parameter("dropInvalidHeaderFields") Boolean dropInvalidHeaderFields,
        @CustomType.Parameter("enableDeletionProtection") Boolean enableDeletionProtection,
        @CustomType.Parameter("enableHttp2") Boolean enableHttp2,
        @CustomType.Parameter("enableWafFailOpen") Boolean enableWafFailOpen,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("idleTimeout") Integer idleTimeout,
        @CustomType.Parameter("internal") Boolean internal,
        @CustomType.Parameter("ipAddressType") String ipAddressType,
        @CustomType.Parameter("loadBalancerType") String loadBalancerType,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("securityGroups") List<String> securityGroups,
        @CustomType.Parameter("subnetMappings") List<GetLoadBalancerSubnetMapping> subnetMappings,
        @CustomType.Parameter("subnets") List<String> subnets,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("vpcId") String vpcId,
        @CustomType.Parameter("zoneId") String zoneId) {
        this.accessLogs = accessLogs;
        this.arn = arn;
        this.arnSuffix = arnSuffix;
        this.customerOwnedIpv4Pool = customerOwnedIpv4Pool;
        this.desyncMitigationMode = desyncMitigationMode;
        this.dnsName = dnsName;
        this.dropInvalidHeaderFields = dropInvalidHeaderFields;
        this.enableDeletionProtection = enableDeletionProtection;
        this.enableHttp2 = enableHttp2;
        this.enableWafFailOpen = enableWafFailOpen;
        this.id = id;
        this.idleTimeout = idleTimeout;
        this.internal = internal;
        this.ipAddressType = ipAddressType;
        this.loadBalancerType = loadBalancerType;
        this.name = name;
        this.securityGroups = securityGroups;
        this.subnetMappings = subnetMappings;
        this.subnets = subnets;
        this.tags = tags;
        this.vpcId = vpcId;
        this.zoneId = zoneId;
    }

    public GetLoadBalancerAccessLogs getAccessLogs() {
        return this.accessLogs;
    }
    public String getArn() {
        return this.arn;
    }
    public String getArnSuffix() {
        return this.arnSuffix;
    }
    public String getCustomerOwnedIpv4Pool() {
        return this.customerOwnedIpv4Pool;
    }
    public String getDesyncMitigationMode() {
        return this.desyncMitigationMode;
    }
    public String getDnsName() {
        return this.dnsName;
    }
    public Boolean getDropInvalidHeaderFields() {
        return this.dropInvalidHeaderFields;
    }
    public Boolean getEnableDeletionProtection() {
        return this.enableDeletionProtection;
    }
    public Boolean getEnableHttp2() {
        return this.enableHttp2;
    }
    public Boolean getEnableWafFailOpen() {
        return this.enableWafFailOpen;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }
    public Boolean getInternal() {
        return this.internal;
    }
    public String getIpAddressType() {
        return this.ipAddressType;
    }
    public String getLoadBalancerType() {
        return this.loadBalancerType;
    }
    public String getName() {
        return this.name;
    }
    public List<String> getSecurityGroups() {
        return this.securityGroups;
    }
    public List<GetLoadBalancerSubnetMapping> getSubnetMappings() {
        return this.subnetMappings;
    }
    public List<String> getSubnets() {
        return this.subnets;
    }
    public Map<String,String> getTags() {
        return this.tags;
    }
    public String getVpcId() {
        return this.vpcId;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLoadBalancerResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetLoadBalancerAccessLogs accessLogs;
        private String arn;
        private String arnSuffix;
        private String customerOwnedIpv4Pool;
        private String desyncMitigationMode;
        private String dnsName;
        private Boolean dropInvalidHeaderFields;
        private Boolean enableDeletionProtection;
        private Boolean enableHttp2;
        private Boolean enableWafFailOpen;
        private String id;
        private Integer idleTimeout;
        private Boolean internal;
        private String ipAddressType;
        private String loadBalancerType;
        private String name;
        private List<String> securityGroups;
        private List<GetLoadBalancerSubnetMapping> subnetMappings;
        private List<String> subnets;
        private Map<String,String> tags;
        private String vpcId;
        private String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLogs = defaults.accessLogs;
    	      this.arn = defaults.arn;
    	      this.arnSuffix = defaults.arnSuffix;
    	      this.customerOwnedIpv4Pool = defaults.customerOwnedIpv4Pool;
    	      this.desyncMitigationMode = defaults.desyncMitigationMode;
    	      this.dnsName = defaults.dnsName;
    	      this.dropInvalidHeaderFields = defaults.dropInvalidHeaderFields;
    	      this.enableDeletionProtection = defaults.enableDeletionProtection;
    	      this.enableHttp2 = defaults.enableHttp2;
    	      this.enableWafFailOpen = defaults.enableWafFailOpen;
    	      this.id = defaults.id;
    	      this.idleTimeout = defaults.idleTimeout;
    	      this.internal = defaults.internal;
    	      this.ipAddressType = defaults.ipAddressType;
    	      this.loadBalancerType = defaults.loadBalancerType;
    	      this.name = defaults.name;
    	      this.securityGroups = defaults.securityGroups;
    	      this.subnetMappings = defaults.subnetMappings;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
    	      this.zoneId = defaults.zoneId;
        }

        public Builder accessLogs(GetLoadBalancerAccessLogs accessLogs) {
            this.accessLogs = Objects.requireNonNull(accessLogs);
            return this;
        }
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public Builder arnSuffix(String arnSuffix) {
            this.arnSuffix = Objects.requireNonNull(arnSuffix);
            return this;
        }
        public Builder customerOwnedIpv4Pool(String customerOwnedIpv4Pool) {
            this.customerOwnedIpv4Pool = Objects.requireNonNull(customerOwnedIpv4Pool);
            return this;
        }
        public Builder desyncMitigationMode(String desyncMitigationMode) {
            this.desyncMitigationMode = Objects.requireNonNull(desyncMitigationMode);
            return this;
        }
        public Builder dnsName(String dnsName) {
            this.dnsName = Objects.requireNonNull(dnsName);
            return this;
        }
        public Builder dropInvalidHeaderFields(Boolean dropInvalidHeaderFields) {
            this.dropInvalidHeaderFields = Objects.requireNonNull(dropInvalidHeaderFields);
            return this;
        }
        public Builder enableDeletionProtection(Boolean enableDeletionProtection) {
            this.enableDeletionProtection = Objects.requireNonNull(enableDeletionProtection);
            return this;
        }
        public Builder enableHttp2(Boolean enableHttp2) {
            this.enableHttp2 = Objects.requireNonNull(enableHttp2);
            return this;
        }
        public Builder enableWafFailOpen(Boolean enableWafFailOpen) {
            this.enableWafFailOpen = Objects.requireNonNull(enableWafFailOpen);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder idleTimeout(Integer idleTimeout) {
            this.idleTimeout = Objects.requireNonNull(idleTimeout);
            return this;
        }
        public Builder internal(Boolean internal) {
            this.internal = Objects.requireNonNull(internal);
            return this;
        }
        public Builder ipAddressType(String ipAddressType) {
            this.ipAddressType = Objects.requireNonNull(ipAddressType);
            return this;
        }
        public Builder loadBalancerType(String loadBalancerType) {
            this.loadBalancerType = Objects.requireNonNull(loadBalancerType);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder securityGroups(List<String> securityGroups) {
            this.securityGroups = Objects.requireNonNull(securityGroups);
            return this;
        }
        public Builder securityGroups(String... securityGroups) {
            return securityGroups(List.of(securityGroups));
        }
        public Builder subnetMappings(List<GetLoadBalancerSubnetMapping> subnetMappings) {
            this.subnetMappings = Objects.requireNonNull(subnetMappings);
            return this;
        }
        public Builder subnetMappings(GetLoadBalancerSubnetMapping... subnetMappings) {
            return subnetMappings(List.of(subnetMappings));
        }
        public Builder subnets(List<String> subnets) {
            this.subnets = Objects.requireNonNull(subnets);
            return this;
        }
        public Builder subnets(String... subnets) {
            return subnets(List.of(subnets));
        }
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }        public GetLoadBalancerResult build() {
            return new GetLoadBalancerResult(accessLogs, arn, arnSuffix, customerOwnedIpv4Pool, desyncMitigationMode, dnsName, dropInvalidHeaderFields, enableDeletionProtection, enableHttp2, enableWafFailOpen, id, idleTimeout, internal, ipAddressType, loadBalancerType, name, securityGroups, subnetMappings, subnets, tags, vpcId, zoneId);
        }
    }
}
