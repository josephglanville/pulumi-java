// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.outputs;

import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ExtendedLocationResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.ResourceStatusResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.SystemDataResponse;
import io.pulumi.azurenative.connectedvmwarevsphere.outputs.VICredentialResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetVCenterResult {
    /**
     * Gets or sets the connection status to the vCenter.
     * 
     */
    private final String connectionStatus;
    /**
     * Username / Password Credentials to connect to vcenter.
     * 
     */
    private final @Nullable VICredentialResponse credentials;
    /**
     * Gets the name of the corresponding resource in Kubernetes.
     * 
     */
    private final String customResourceName;
    /**
     * Gets or sets the extended location.
     * 
     */
    private final @Nullable ExtendedLocationResponse extendedLocation;
    /**
     * Gets or sets the FQDN/IPAddress of the vCenter.
     * 
     */
    private final String fqdn;
    /**
     * Gets or sets the Id.
     * 
     */
    private final String id;
    /**
     * Gets or sets the instance UUID of the vCenter.
     * 
     */
    private final String instanceUuid;
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
     */
    private final @Nullable String kind;
    /**
     * Gets or sets the location.
     * 
     */
    private final String location;
    /**
     * Gets or sets the name.
     * 
     */
    private final String name;
    /**
     * Gets or sets the port of the vCenter.
     * 
     */
    private final @Nullable Integer port;
    /**
     * Gets or sets the provisioning state.
     * 
     */
    private final String provisioningState;
    /**
     * The resource status information.
     * 
     */
    private final List<ResourceStatusResponse> statuses;
    /**
     * The system data.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Gets or sets the Resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * Gets or sets the type of the resource.
     * 
     */
    private final String type;
    /**
     * Gets or sets a unique identifier for this resource.
     * 
     */
    private final String uuid;
    /**
     * Gets or sets the version of the vCenter.
     * 
     */
    private final String version;

    @CustomType.Constructor
    private GetVCenterResult(
        @CustomType.Parameter("connectionStatus") String connectionStatus,
        @CustomType.Parameter("credentials") @Nullable VICredentialResponse credentials,
        @CustomType.Parameter("customResourceName") String customResourceName,
        @CustomType.Parameter("extendedLocation") @Nullable ExtendedLocationResponse extendedLocation,
        @CustomType.Parameter("fqdn") String fqdn,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("instanceUuid") String instanceUuid,
        @CustomType.Parameter("kind") @Nullable String kind,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("port") @Nullable Integer port,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("statuses") List<ResourceStatusResponse> statuses,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("uuid") String uuid,
        @CustomType.Parameter("version") String version) {
        this.connectionStatus = connectionStatus;
        this.credentials = credentials;
        this.customResourceName = customResourceName;
        this.extendedLocation = extendedLocation;
        this.fqdn = fqdn;
        this.id = id;
        this.instanceUuid = instanceUuid;
        this.kind = kind;
        this.location = location;
        this.name = name;
        this.port = port;
        this.provisioningState = provisioningState;
        this.statuses = statuses;
        this.systemData = systemData;
        this.tags = tags;
        this.type = type;
        this.uuid = uuid;
        this.version = version;
    }

    /**
     * Gets or sets the connection status to the vCenter.
     * 
    */
    public String getConnectionStatus() {
        return this.connectionStatus;
    }
    /**
     * Username / Password Credentials to connect to vcenter.
     * 
    */
    public Optional<VICredentialResponse> getCredentials() {
        return Optional.ofNullable(this.credentials);
    }
    /**
     * Gets the name of the corresponding resource in Kubernetes.
     * 
    */
    public String getCustomResourceName() {
        return this.customResourceName;
    }
    /**
     * Gets or sets the extended location.
     * 
    */
    public Optional<ExtendedLocationResponse> getExtendedLocation() {
        return Optional.ofNullable(this.extendedLocation);
    }
    /**
     * Gets or sets the FQDN/IPAddress of the vCenter.
     * 
    */
    public String getFqdn() {
        return this.fqdn;
    }
    /**
     * Gets or sets the Id.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Gets or sets the instance UUID of the vCenter.
     * 
    */
    public String getInstanceUuid() {
        return this.instanceUuid;
    }
    /**
     * Metadata used by portal/tooling/etc to render different UX experiences for resources of the same type; e.g. ApiApps are a kind of Microsoft.Web/sites type.  If supported, the resource provider must validate and persist this value.
     * 
    */
    public Optional<String> getKind() {
        return Optional.ofNullable(this.kind);
    }
    /**
     * Gets or sets the location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Gets or sets the name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Gets or sets the port of the vCenter.
     * 
    */
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    /**
     * Gets or sets the provisioning state.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The resource status information.
     * 
    */
    public List<ResourceStatusResponse> getStatuses() {
        return this.statuses;
    }
    /**
     * The system data.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Gets or sets the Resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * Gets or sets the type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Gets or sets a unique identifier for this resource.
     * 
    */
    public String getUuid() {
        return this.uuid;
    }
    /**
     * Gets or sets the version of the vCenter.
     * 
    */
    public String getVersion() {
        return this.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVCenterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionStatus;
        private @Nullable VICredentialResponse credentials;
        private String customResourceName;
        private @Nullable ExtendedLocationResponse extendedLocation;
        private String fqdn;
        private String id;
        private String instanceUuid;
        private @Nullable String kind;
        private String location;
        private String name;
        private @Nullable Integer port;
        private String provisioningState;
        private List<ResourceStatusResponse> statuses;
        private SystemDataResponse systemData;
        private @Nullable Map<String,String> tags;
        private String type;
        private String uuid;
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVCenterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionStatus = defaults.connectionStatus;
    	      this.credentials = defaults.credentials;
    	      this.customResourceName = defaults.customResourceName;
    	      this.extendedLocation = defaults.extendedLocation;
    	      this.fqdn = defaults.fqdn;
    	      this.id = defaults.id;
    	      this.instanceUuid = defaults.instanceUuid;
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.provisioningState = defaults.provisioningState;
    	      this.statuses = defaults.statuses;
    	      this.systemData = defaults.systemData;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
    	      this.uuid = defaults.uuid;
    	      this.version = defaults.version;
        }

        public Builder connectionStatus(String connectionStatus) {
            this.connectionStatus = Objects.requireNonNull(connectionStatus);
            return this;
        }
        public Builder credentials(@Nullable VICredentialResponse credentials) {
            this.credentials = credentials;
            return this;
        }
        public Builder customResourceName(String customResourceName) {
            this.customResourceName = Objects.requireNonNull(customResourceName);
            return this;
        }
        public Builder extendedLocation(@Nullable ExtendedLocationResponse extendedLocation) {
            this.extendedLocation = extendedLocation;
            return this;
        }
        public Builder fqdn(String fqdn) {
            this.fqdn = Objects.requireNonNull(fqdn);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder instanceUuid(String instanceUuid) {
            this.instanceUuid = Objects.requireNonNull(instanceUuid);
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder statuses(List<ResourceStatusResponse> statuses) {
            this.statuses = Objects.requireNonNull(statuses);
            return this;
        }
        public Builder statuses(ResourceStatusResponse... statuses) {
            return statuses(List.of(statuses));
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder uuid(String uuid) {
            this.uuid = Objects.requireNonNull(uuid);
            return this;
        }
        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }        public GetVCenterResult build() {
            return new GetVCenterResult(connectionStatus, credentials, customResourceName, extendedLocation, fqdn, id, instanceUuid, kind, location, name, port, provisioningState, statuses, systemData, tags, type, uuid, version);
        }
    }
}
