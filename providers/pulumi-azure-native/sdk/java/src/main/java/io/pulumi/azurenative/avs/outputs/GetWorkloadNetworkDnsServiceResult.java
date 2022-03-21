// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWorkloadNetworkDnsServiceResult {
    /**
     * Default DNS zone of the DNS Service.
     * 
     */
    private final @Nullable String defaultDnsZone;
    /**
     * Display name of the DNS Service.
     * 
     */
    private final @Nullable String displayName;
    /**
     * DNS service IP of the DNS Service.
     * 
     */
    private final @Nullable String dnsServiceIp;
    /**
     * FQDN zones of the DNS Service.
     * 
     */
    private final @Nullable List<String> fqdnZones;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * DNS Service log level.
     * 
     */
    private final @Nullable String logLevel;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * The provisioning state
     * 
     */
    private final String provisioningState;
    /**
     * NSX revision number.
     * 
     */
    private final @Nullable Double revision;
    /**
     * DNS Service status.
     * 
     */
    private final String status;
    /**
     * Resource type.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetWorkloadNetworkDnsServiceResult(
        @CustomType.Parameter("defaultDnsZone") @Nullable String defaultDnsZone,
        @CustomType.Parameter("displayName") @Nullable String displayName,
        @CustomType.Parameter("dnsServiceIp") @Nullable String dnsServiceIp,
        @CustomType.Parameter("fqdnZones") @Nullable List<String> fqdnZones,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("logLevel") @Nullable String logLevel,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("revision") @Nullable Double revision,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("type") String type) {
        this.defaultDnsZone = defaultDnsZone;
        this.displayName = displayName;
        this.dnsServiceIp = dnsServiceIp;
        this.fqdnZones = fqdnZones;
        this.id = id;
        this.logLevel = logLevel;
        this.name = name;
        this.provisioningState = provisioningState;
        this.revision = revision;
        this.status = status;
        this.type = type;
    }

    /**
     * Default DNS zone of the DNS Service.
     * 
    */
    public Optional<String> getDefaultDnsZone() {
        return Optional.ofNullable(this.defaultDnsZone);
    }
    /**
     * Display name of the DNS Service.
     * 
    */
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    /**
     * DNS service IP of the DNS Service.
     * 
    */
    public Optional<String> getDnsServiceIp() {
        return Optional.ofNullable(this.dnsServiceIp);
    }
    /**
     * FQDN zones of the DNS Service.
     * 
    */
    public List<String> getFqdnZones() {
        return this.fqdnZones == null ? List.of() : this.fqdnZones;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * DNS Service log level.
     * 
    */
    public Optional<String> getLogLevel() {
        return Optional.ofNullable(this.logLevel);
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The provisioning state
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * NSX revision number.
     * 
    */
    public Optional<Double> getRevision() {
        return Optional.ofNullable(this.revision);
    }
    /**
     * DNS Service status.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadNetworkDnsServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultDnsZone;
        private @Nullable String displayName;
        private @Nullable String dnsServiceIp;
        private @Nullable List<String> fqdnZones;
        private String id;
        private @Nullable String logLevel;
        private String name;
        private String provisioningState;
        private @Nullable Double revision;
        private String status;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadNetworkDnsServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultDnsZone = defaults.defaultDnsZone;
    	      this.displayName = defaults.displayName;
    	      this.dnsServiceIp = defaults.dnsServiceIp;
    	      this.fqdnZones = defaults.fqdnZones;
    	      this.id = defaults.id;
    	      this.logLevel = defaults.logLevel;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.revision = defaults.revision;
    	      this.status = defaults.status;
    	      this.type = defaults.type;
        }

        public Builder defaultDnsZone(@Nullable String defaultDnsZone) {
            this.defaultDnsZone = defaultDnsZone;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder dnsServiceIp(@Nullable String dnsServiceIp) {
            this.dnsServiceIp = dnsServiceIp;
            return this;
        }
        public Builder fqdnZones(@Nullable List<String> fqdnZones) {
            this.fqdnZones = fqdnZones;
            return this;
        }
        public Builder fqdnZones(String... fqdnZones) {
            return fqdnZones(List.of(fqdnZones));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder logLevel(@Nullable String logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder revision(@Nullable Double revision) {
            this.revision = revision;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetWorkloadNetworkDnsServiceResult build() {
            return new GetWorkloadNetworkDnsServiceResult(defaultDnsZone, displayName, dnsServiceIp, fqdnZones, id, logLevel, name, provisioningState, revision, status, type);
        }
    }
}
