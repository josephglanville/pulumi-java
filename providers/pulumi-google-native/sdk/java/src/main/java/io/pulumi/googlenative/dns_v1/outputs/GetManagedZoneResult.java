// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dns_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.dns_v1.outputs.ManagedZoneCloudLoggingConfigResponse;
import io.pulumi.googlenative.dns_v1.outputs.ManagedZoneDnsSecConfigResponse;
import io.pulumi.googlenative.dns_v1.outputs.ManagedZoneForwardingConfigResponse;
import io.pulumi.googlenative.dns_v1.outputs.ManagedZonePeeringConfigResponse;
import io.pulumi.googlenative.dns_v1.outputs.ManagedZonePrivateVisibilityConfigResponse;
import io.pulumi.googlenative.dns_v1.outputs.ManagedZoneReverseLookupConfigResponse;
import io.pulumi.googlenative.dns_v1.outputs.ManagedZoneServiceDirectoryConfigResponse;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetManagedZoneResult {
    private final ManagedZoneCloudLoggingConfigResponse cloudLoggingConfig;
    /**
     * The time that this resource was created on the server. This is in RFC3339 text format. Output only.
     * 
     */
    private final String creationTime;
    /**
     * A mutable string of at most 1024 characters associated with this resource for the user's convenience. Has no effect on the managed zone's function.
     * 
     */
    private final String description;
    /**
     * The DNS name of this managed zone, for instance "example.com.".
     * 
     */
    private final String dnsName;
    /**
     * DNSSEC configuration.
     * 
     */
    private final ManagedZoneDnsSecConfigResponse dnssecConfig;
    /**
     * The presence for this field indicates that outbound forwarding is enabled for this zone. The value of this field contains the set of destinations to forward to.
     * 
     */
    private final ManagedZoneForwardingConfigResponse forwardingConfig;
    private final String kind;
    /**
     * User labels.
     * 
     */
    private final Map<String,String> labels;
    /**
     * User assigned name for this resource. Must be unique within the project. The name must be 1-63 characters long, must begin with a letter, end with a letter or digit, and only contain lowercase letters, digits or dashes.
     * 
     */
    private final String name;
    /**
     * Optionally specifies the NameServerSet for this ManagedZone. A NameServerSet is a set of DNS name servers that all host the same ManagedZones. Most users leave this field unset. If you need to use this field, contact your account team.
     * 
     */
    private final String nameServerSet;
    /**
     * Delegate your managed_zone to these virtual name servers; defined by the server (output only)
     * 
     */
    private final List<String> nameServers;
    /**
     * The presence of this field indicates that DNS Peering is enabled for this zone. The value of this field contains the network to peer with.
     * 
     */
    private final ManagedZonePeeringConfigResponse peeringConfig;
    /**
     * For privately visible zones, the set of Virtual Private Cloud resources that the zone is visible from.
     * 
     */
    private final ManagedZonePrivateVisibilityConfigResponse privateVisibilityConfig;
    /**
     * The presence of this field indicates that this is a managed reverse lookup zone and Cloud DNS resolves reverse lookup queries using automatically configured records for VPC resources. This only applies to networks listed under private_visibility_config.
     * 
     */
    private final ManagedZoneReverseLookupConfigResponse reverseLookupConfig;
    /**
     * This field links to the associated service directory namespace. Do not set this field for public zones or forwarding zones.
     * 
     */
    private final ManagedZoneServiceDirectoryConfigResponse serviceDirectoryConfig;
    /**
     * The zone's visibility: public zones are exposed to the Internet, while private zones are visible only to Virtual Private Cloud resources.
     * 
     */
    private final String visibility;

    @CustomType.Constructor
    private GetManagedZoneResult(
        @CustomType.Parameter("cloudLoggingConfig") ManagedZoneCloudLoggingConfigResponse cloudLoggingConfig,
        @CustomType.Parameter("creationTime") String creationTime,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("dnsName") String dnsName,
        @CustomType.Parameter("dnssecConfig") ManagedZoneDnsSecConfigResponse dnssecConfig,
        @CustomType.Parameter("forwardingConfig") ManagedZoneForwardingConfigResponse forwardingConfig,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("nameServerSet") String nameServerSet,
        @CustomType.Parameter("nameServers") List<String> nameServers,
        @CustomType.Parameter("peeringConfig") ManagedZonePeeringConfigResponse peeringConfig,
        @CustomType.Parameter("privateVisibilityConfig") ManagedZonePrivateVisibilityConfigResponse privateVisibilityConfig,
        @CustomType.Parameter("reverseLookupConfig") ManagedZoneReverseLookupConfigResponse reverseLookupConfig,
        @CustomType.Parameter("serviceDirectoryConfig") ManagedZoneServiceDirectoryConfigResponse serviceDirectoryConfig,
        @CustomType.Parameter("visibility") String visibility) {
        this.cloudLoggingConfig = cloudLoggingConfig;
        this.creationTime = creationTime;
        this.description = description;
        this.dnsName = dnsName;
        this.dnssecConfig = dnssecConfig;
        this.forwardingConfig = forwardingConfig;
        this.kind = kind;
        this.labels = labels;
        this.name = name;
        this.nameServerSet = nameServerSet;
        this.nameServers = nameServers;
        this.peeringConfig = peeringConfig;
        this.privateVisibilityConfig = privateVisibilityConfig;
        this.reverseLookupConfig = reverseLookupConfig;
        this.serviceDirectoryConfig = serviceDirectoryConfig;
        this.visibility = visibility;
    }

    public ManagedZoneCloudLoggingConfigResponse getCloudLoggingConfig() {
        return this.cloudLoggingConfig;
    }
    /**
     * The time that this resource was created on the server. This is in RFC3339 text format. Output only.
     * 
    */
    public String getCreationTime() {
        return this.creationTime;
    }
    /**
     * A mutable string of at most 1024 characters associated with this resource for the user's convenience. Has no effect on the managed zone's function.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * The DNS name of this managed zone, for instance "example.com.".
     * 
    */
    public String getDnsName() {
        return this.dnsName;
    }
    /**
     * DNSSEC configuration.
     * 
    */
    public ManagedZoneDnsSecConfigResponse getDnssecConfig() {
        return this.dnssecConfig;
    }
    /**
     * The presence for this field indicates that outbound forwarding is enabled for this zone. The value of this field contains the set of destinations to forward to.
     * 
    */
    public ManagedZoneForwardingConfigResponse getForwardingConfig() {
        return this.forwardingConfig;
    }
    public String getKind() {
        return this.kind;
    }
    /**
     * User labels.
     * 
    */
    public Map<String,String> getLabels() {
        return this.labels;
    }
    /**
     * User assigned name for this resource. Must be unique within the project. The name must be 1-63 characters long, must begin with a letter, end with a letter or digit, and only contain lowercase letters, digits or dashes.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Optionally specifies the NameServerSet for this ManagedZone. A NameServerSet is a set of DNS name servers that all host the same ManagedZones. Most users leave this field unset. If you need to use this field, contact your account team.
     * 
    */
    public String getNameServerSet() {
        return this.nameServerSet;
    }
    /**
     * Delegate your managed_zone to these virtual name servers; defined by the server (output only)
     * 
    */
    public List<String> getNameServers() {
        return this.nameServers;
    }
    /**
     * The presence of this field indicates that DNS Peering is enabled for this zone. The value of this field contains the network to peer with.
     * 
    */
    public ManagedZonePeeringConfigResponse getPeeringConfig() {
        return this.peeringConfig;
    }
    /**
     * For privately visible zones, the set of Virtual Private Cloud resources that the zone is visible from.
     * 
    */
    public ManagedZonePrivateVisibilityConfigResponse getPrivateVisibilityConfig() {
        return this.privateVisibilityConfig;
    }
    /**
     * The presence of this field indicates that this is a managed reverse lookup zone and Cloud DNS resolves reverse lookup queries using automatically configured records for VPC resources. This only applies to networks listed under private_visibility_config.
     * 
    */
    public ManagedZoneReverseLookupConfigResponse getReverseLookupConfig() {
        return this.reverseLookupConfig;
    }
    /**
     * This field links to the associated service directory namespace. Do not set this field for public zones or forwarding zones.
     * 
    */
    public ManagedZoneServiceDirectoryConfigResponse getServiceDirectoryConfig() {
        return this.serviceDirectoryConfig;
    }
    /**
     * The zone's visibility: public zones are exposed to the Internet, while private zones are visible only to Virtual Private Cloud resources.
     * 
    */
    public String getVisibility() {
        return this.visibility;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagedZoneResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ManagedZoneCloudLoggingConfigResponse cloudLoggingConfig;
        private String creationTime;
        private String description;
        private String dnsName;
        private ManagedZoneDnsSecConfigResponse dnssecConfig;
        private ManagedZoneForwardingConfigResponse forwardingConfig;
        private String kind;
        private Map<String,String> labels;
        private String name;
        private String nameServerSet;
        private List<String> nameServers;
        private ManagedZonePeeringConfigResponse peeringConfig;
        private ManagedZonePrivateVisibilityConfigResponse privateVisibilityConfig;
        private ManagedZoneReverseLookupConfigResponse reverseLookupConfig;
        private ManagedZoneServiceDirectoryConfigResponse serviceDirectoryConfig;
        private String visibility;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagedZoneResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudLoggingConfig = defaults.cloudLoggingConfig;
    	      this.creationTime = defaults.creationTime;
    	      this.description = defaults.description;
    	      this.dnsName = defaults.dnsName;
    	      this.dnssecConfig = defaults.dnssecConfig;
    	      this.forwardingConfig = defaults.forwardingConfig;
    	      this.kind = defaults.kind;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.nameServerSet = defaults.nameServerSet;
    	      this.nameServers = defaults.nameServers;
    	      this.peeringConfig = defaults.peeringConfig;
    	      this.privateVisibilityConfig = defaults.privateVisibilityConfig;
    	      this.reverseLookupConfig = defaults.reverseLookupConfig;
    	      this.serviceDirectoryConfig = defaults.serviceDirectoryConfig;
    	      this.visibility = defaults.visibility;
        }

        public Builder cloudLoggingConfig(ManagedZoneCloudLoggingConfigResponse cloudLoggingConfig) {
            this.cloudLoggingConfig = Objects.requireNonNull(cloudLoggingConfig);
            return this;
        }
        public Builder creationTime(String creationTime) {
            this.creationTime = Objects.requireNonNull(creationTime);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder dnsName(String dnsName) {
            this.dnsName = Objects.requireNonNull(dnsName);
            return this;
        }
        public Builder dnssecConfig(ManagedZoneDnsSecConfigResponse dnssecConfig) {
            this.dnssecConfig = Objects.requireNonNull(dnssecConfig);
            return this;
        }
        public Builder forwardingConfig(ManagedZoneForwardingConfigResponse forwardingConfig) {
            this.forwardingConfig = Objects.requireNonNull(forwardingConfig);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder nameServerSet(String nameServerSet) {
            this.nameServerSet = Objects.requireNonNull(nameServerSet);
            return this;
        }
        public Builder nameServers(List<String> nameServers) {
            this.nameServers = Objects.requireNonNull(nameServers);
            return this;
        }
        public Builder nameServers(String... nameServers) {
            return nameServers(List.of(nameServers));
        }
        public Builder peeringConfig(ManagedZonePeeringConfigResponse peeringConfig) {
            this.peeringConfig = Objects.requireNonNull(peeringConfig);
            return this;
        }
        public Builder privateVisibilityConfig(ManagedZonePrivateVisibilityConfigResponse privateVisibilityConfig) {
            this.privateVisibilityConfig = Objects.requireNonNull(privateVisibilityConfig);
            return this;
        }
        public Builder reverseLookupConfig(ManagedZoneReverseLookupConfigResponse reverseLookupConfig) {
            this.reverseLookupConfig = Objects.requireNonNull(reverseLookupConfig);
            return this;
        }
        public Builder serviceDirectoryConfig(ManagedZoneServiceDirectoryConfigResponse serviceDirectoryConfig) {
            this.serviceDirectoryConfig = Objects.requireNonNull(serviceDirectoryConfig);
            return this;
        }
        public Builder visibility(String visibility) {
            this.visibility = Objects.requireNonNull(visibility);
            return this;
        }        public GetManagedZoneResult build() {
            return new GetManagedZoneResult(cloudLoggingConfig, creationTime, description, dnsName, dnssecConfig, forwardingConfig, kind, labels, name, nameServerSet, nameServers, peeringConfig, privateVisibilityConfig, reverseLookupConfig, serviceDirectoryConfig, visibility);
        }
    }
}
