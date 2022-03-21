// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elb.outputs;

import io.pulumi.aws.elb.outputs.GetLoadBalancerAccessLogs;
import io.pulumi.aws.elb.outputs.GetLoadBalancerHealthCheck;
import io.pulumi.aws.elb.outputs.GetLoadBalancerListener;
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
    private final List<String> availabilityZones;
    private final Boolean connectionDraining;
    private final Integer connectionDrainingTimeout;
    private final Boolean crossZoneLoadBalancing;
    private final String desyncMitigationMode;
    private final String dnsName;
    private final GetLoadBalancerHealthCheck healthCheck;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final Integer idleTimeout;
    private final List<String> instances;
    private final Boolean internal;
    private final List<GetLoadBalancerListener> listeners;
    private final String name;
    private final List<String> securityGroups;
    private final String sourceSecurityGroup;
    private final String sourceSecurityGroupId;
    private final List<String> subnets;
    private final Map<String,String> tags;
    private final String zoneId;

    @CustomType.Constructor
    private GetLoadBalancerResult(
        @CustomType.Parameter("accessLogs") GetLoadBalancerAccessLogs accessLogs,
        @CustomType.Parameter("arn") String arn,
        @CustomType.Parameter("availabilityZones") List<String> availabilityZones,
        @CustomType.Parameter("connectionDraining") Boolean connectionDraining,
        @CustomType.Parameter("connectionDrainingTimeout") Integer connectionDrainingTimeout,
        @CustomType.Parameter("crossZoneLoadBalancing") Boolean crossZoneLoadBalancing,
        @CustomType.Parameter("desyncMitigationMode") String desyncMitigationMode,
        @CustomType.Parameter("dnsName") String dnsName,
        @CustomType.Parameter("healthCheck") GetLoadBalancerHealthCheck healthCheck,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("idleTimeout") Integer idleTimeout,
        @CustomType.Parameter("instances") List<String> instances,
        @CustomType.Parameter("internal") Boolean internal,
        @CustomType.Parameter("listeners") List<GetLoadBalancerListener> listeners,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("securityGroups") List<String> securityGroups,
        @CustomType.Parameter("sourceSecurityGroup") String sourceSecurityGroup,
        @CustomType.Parameter("sourceSecurityGroupId") String sourceSecurityGroupId,
        @CustomType.Parameter("subnets") List<String> subnets,
        @CustomType.Parameter("tags") Map<String,String> tags,
        @CustomType.Parameter("zoneId") String zoneId) {
        this.accessLogs = accessLogs;
        this.arn = arn;
        this.availabilityZones = availabilityZones;
        this.connectionDraining = connectionDraining;
        this.connectionDrainingTimeout = connectionDrainingTimeout;
        this.crossZoneLoadBalancing = crossZoneLoadBalancing;
        this.desyncMitigationMode = desyncMitigationMode;
        this.dnsName = dnsName;
        this.healthCheck = healthCheck;
        this.id = id;
        this.idleTimeout = idleTimeout;
        this.instances = instances;
        this.internal = internal;
        this.listeners = listeners;
        this.name = name;
        this.securityGroups = securityGroups;
        this.sourceSecurityGroup = sourceSecurityGroup;
        this.sourceSecurityGroupId = sourceSecurityGroupId;
        this.subnets = subnets;
        this.tags = tags;
        this.zoneId = zoneId;
    }

    public GetLoadBalancerAccessLogs getAccessLogs() {
        return this.accessLogs;
    }
    public String getArn() {
        return this.arn;
    }
    public List<String> getAvailabilityZones() {
        return this.availabilityZones;
    }
    public Boolean getConnectionDraining() {
        return this.connectionDraining;
    }
    public Integer getConnectionDrainingTimeout() {
        return this.connectionDrainingTimeout;
    }
    public Boolean getCrossZoneLoadBalancing() {
        return this.crossZoneLoadBalancing;
    }
    public String getDesyncMitigationMode() {
        return this.desyncMitigationMode;
    }
    public String getDnsName() {
        return this.dnsName;
    }
    public GetLoadBalancerHealthCheck getHealthCheck() {
        return this.healthCheck;
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
    public List<String> getInstances() {
        return this.instances;
    }
    public Boolean getInternal() {
        return this.internal;
    }
    public List<GetLoadBalancerListener> getListeners() {
        return this.listeners;
    }
    public String getName() {
        return this.name;
    }
    public List<String> getSecurityGroups() {
        return this.securityGroups;
    }
    public String getSourceSecurityGroup() {
        return this.sourceSecurityGroup;
    }
    public String getSourceSecurityGroupId() {
        return this.sourceSecurityGroupId;
    }
    public List<String> getSubnets() {
        return this.subnets;
    }
    public Map<String,String> getTags() {
        return this.tags;
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
        private List<String> availabilityZones;
        private Boolean connectionDraining;
        private Integer connectionDrainingTimeout;
        private Boolean crossZoneLoadBalancing;
        private String desyncMitigationMode;
        private String dnsName;
        private GetLoadBalancerHealthCheck healthCheck;
        private String id;
        private Integer idleTimeout;
        private List<String> instances;
        private Boolean internal;
        private List<GetLoadBalancerListener> listeners;
        private String name;
        private List<String> securityGroups;
        private String sourceSecurityGroup;
        private String sourceSecurityGroupId;
        private List<String> subnets;
        private Map<String,String> tags;
        private String zoneId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLoadBalancerResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessLogs = defaults.accessLogs;
    	      this.arn = defaults.arn;
    	      this.availabilityZones = defaults.availabilityZones;
    	      this.connectionDraining = defaults.connectionDraining;
    	      this.connectionDrainingTimeout = defaults.connectionDrainingTimeout;
    	      this.crossZoneLoadBalancing = defaults.crossZoneLoadBalancing;
    	      this.desyncMitigationMode = defaults.desyncMitigationMode;
    	      this.dnsName = defaults.dnsName;
    	      this.healthCheck = defaults.healthCheck;
    	      this.id = defaults.id;
    	      this.idleTimeout = defaults.idleTimeout;
    	      this.instances = defaults.instances;
    	      this.internal = defaults.internal;
    	      this.listeners = defaults.listeners;
    	      this.name = defaults.name;
    	      this.securityGroups = defaults.securityGroups;
    	      this.sourceSecurityGroup = defaults.sourceSecurityGroup;
    	      this.sourceSecurityGroupId = defaults.sourceSecurityGroupId;
    	      this.subnets = defaults.subnets;
    	      this.tags = defaults.tags;
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
        public Builder availabilityZones(List<String> availabilityZones) {
            this.availabilityZones = Objects.requireNonNull(availabilityZones);
            return this;
        }
        public Builder availabilityZones(String... availabilityZones) {
            return availabilityZones(List.of(availabilityZones));
        }
        public Builder connectionDraining(Boolean connectionDraining) {
            this.connectionDraining = Objects.requireNonNull(connectionDraining);
            return this;
        }
        public Builder connectionDrainingTimeout(Integer connectionDrainingTimeout) {
            this.connectionDrainingTimeout = Objects.requireNonNull(connectionDrainingTimeout);
            return this;
        }
        public Builder crossZoneLoadBalancing(Boolean crossZoneLoadBalancing) {
            this.crossZoneLoadBalancing = Objects.requireNonNull(crossZoneLoadBalancing);
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
        public Builder healthCheck(GetLoadBalancerHealthCheck healthCheck) {
            this.healthCheck = Objects.requireNonNull(healthCheck);
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
        public Builder instances(List<String> instances) {
            this.instances = Objects.requireNonNull(instances);
            return this;
        }
        public Builder instances(String... instances) {
            return instances(List.of(instances));
        }
        public Builder internal(Boolean internal) {
            this.internal = Objects.requireNonNull(internal);
            return this;
        }
        public Builder listeners(List<GetLoadBalancerListener> listeners) {
            this.listeners = Objects.requireNonNull(listeners);
            return this;
        }
        public Builder listeners(GetLoadBalancerListener... listeners) {
            return listeners(List.of(listeners));
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
        public Builder sourceSecurityGroup(String sourceSecurityGroup) {
            this.sourceSecurityGroup = Objects.requireNonNull(sourceSecurityGroup);
            return this;
        }
        public Builder sourceSecurityGroupId(String sourceSecurityGroupId) {
            this.sourceSecurityGroupId = Objects.requireNonNull(sourceSecurityGroupId);
            return this;
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
        public Builder zoneId(String zoneId) {
            this.zoneId = Objects.requireNonNull(zoneId);
            return this;
        }        public GetLoadBalancerResult build() {
            return new GetLoadBalancerResult(accessLogs, arn, availabilityZones, connectionDraining, connectionDrainingTimeout, crossZoneLoadBalancing, desyncMitigationMode, dnsName, healthCheck, id, idleTimeout, instances, internal, listeners, name, securityGroups, sourceSecurityGroup, sourceSecurityGroupId, subnets, tags, zoneId);
        }
    }
}
