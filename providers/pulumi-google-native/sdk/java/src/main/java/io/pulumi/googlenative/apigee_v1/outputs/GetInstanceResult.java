// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigee_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInstanceResult {
    /**
     * Time the instance was created in milliseconds since epoch.
     * 
     */
    private final String createdAt;
    /**
     * Optional. Description of the instance.
     * 
     */
    private final String description;
    /**
     * Customer Managed Encryption Key (CMEK) used for disk and volume encryption. Required for Apigee paid subscriptions only. Use the following format: `projects/([^/]+)/locations/([^/]+)/keyRings/([^/]+)/cryptoKeys/([^/]+)`
     * 
     */
    private final String diskEncryptionKeyName;
    /**
     * Optional. Display name for the instance.
     * 
     */
    private final String displayName;
    /**
     * Internal hostname or IP address of the Apigee endpoint used by clients to connect to the service.
     * 
     */
    private final String host;
    /**
     * Optional. IP range represents the customer-provided CIDR block of length 22 that will be used for the Apigee instance creation. This optional range, if provided, should be freely available as part of larger named range the customer has allocated to the Service Networking peering. If this is not provided, Apigee will automatically request for any available /22 CIDR block from Service Networking. The customer should use this CIDR block for configuring their firewall needs to allow traffic from Apigee. Input format: "a.b.c.d/22", Output format: a.b.c.d/22, e.f.g.h/28"
     * 
     */
    private final String ipRange;
    /**
     * Time the instance was last modified in milliseconds since epoch.
     * 
     */
    private final String lastModifiedAt;
    /**
     * Compute Engine location where the instance resides.
     * 
     */
    private final String location;
    /**
     * Resource ID of the instance. Values must match the regular expression `^a-z{0,30}[a-z\d]$`.
     * 
     */
    private final String name;
    /**
     * Optional. Size of the CIDR block range that will be reserved by the instance. PAID organizations support `SLASH_16` to `SLASH_20` and defaults to `SLASH_16`. Evaluation organizations support only `SLASH_23`.
     * 
     */
    private final String peeringCidrRange;
    /**
     * Port number of the exposed Apigee endpoint.
     * 
     */
    private final String port;
    /**
     * Version of the runtime system running in the instance. The runtime system is the set of components that serve the API Proxy traffic in your Environments.
     * 
     */
    private final String runtimeVersion;
    /**
     * State of the instance. Values other than `ACTIVE` means the resource is not ready to use.
     * 
     */
    private final String state;

    @CustomType.Constructor
    private GetInstanceResult(
        @CustomType.Parameter("createdAt") String createdAt,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("diskEncryptionKeyName") String diskEncryptionKeyName,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("ipRange") String ipRange,
        @CustomType.Parameter("lastModifiedAt") String lastModifiedAt,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("peeringCidrRange") String peeringCidrRange,
        @CustomType.Parameter("port") String port,
        @CustomType.Parameter("runtimeVersion") String runtimeVersion,
        @CustomType.Parameter("state") String state) {
        this.createdAt = createdAt;
        this.description = description;
        this.diskEncryptionKeyName = diskEncryptionKeyName;
        this.displayName = displayName;
        this.host = host;
        this.ipRange = ipRange;
        this.lastModifiedAt = lastModifiedAt;
        this.location = location;
        this.name = name;
        this.peeringCidrRange = peeringCidrRange;
        this.port = port;
        this.runtimeVersion = runtimeVersion;
        this.state = state;
    }

    /**
     * Time the instance was created in milliseconds since epoch.
     * 
    */
    public String getCreatedAt() {
        return this.createdAt;
    }
    /**
     * Optional. Description of the instance.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Customer Managed Encryption Key (CMEK) used for disk and volume encryption. Required for Apigee paid subscriptions only. Use the following format: `projects/([^/]+)/locations/([^/]+)/keyRings/([^/]+)/cryptoKeys/([^/]+)`
     * 
    */
    public String getDiskEncryptionKeyName() {
        return this.diskEncryptionKeyName;
    }
    /**
     * Optional. Display name for the instance.
     * 
    */
    public String getDisplayName() {
        return this.displayName;
    }
    /**
     * Internal hostname or IP address of the Apigee endpoint used by clients to connect to the service.
     * 
    */
    public String getHost() {
        return this.host;
    }
    /**
     * Optional. IP range represents the customer-provided CIDR block of length 22 that will be used for the Apigee instance creation. This optional range, if provided, should be freely available as part of larger named range the customer has allocated to the Service Networking peering. If this is not provided, Apigee will automatically request for any available /22 CIDR block from Service Networking. The customer should use this CIDR block for configuring their firewall needs to allow traffic from Apigee. Input format: "a.b.c.d/22", Output format: a.b.c.d/22, e.f.g.h/28"
     * 
    */
    public String getIpRange() {
        return this.ipRange;
    }
    /**
     * Time the instance was last modified in milliseconds since epoch.
     * 
    */
    public String getLastModifiedAt() {
        return this.lastModifiedAt;
    }
    /**
     * Compute Engine location where the instance resides.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource ID of the instance. Values must match the regular expression `^a-z{0,30}[a-z\d]$`.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Optional. Size of the CIDR block range that will be reserved by the instance. PAID organizations support `SLASH_16` to `SLASH_20` and defaults to `SLASH_16`. Evaluation organizations support only `SLASH_23`.
     * 
    */
    public String getPeeringCidrRange() {
        return this.peeringCidrRange;
    }
    /**
     * Port number of the exposed Apigee endpoint.
     * 
    */
    public String getPort() {
        return this.port;
    }
    /**
     * Version of the runtime system running in the instance. The runtime system is the set of components that serve the API Proxy traffic in your Environments.
     * 
    */
    public String getRuntimeVersion() {
        return this.runtimeVersion;
    }
    /**
     * State of the instance. Values other than `ACTIVE` means the resource is not ready to use.
     * 
    */
    public String getState() {
        return this.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createdAt;
        private String description;
        private String diskEncryptionKeyName;
        private String displayName;
        private String host;
        private String ipRange;
        private String lastModifiedAt;
        private String location;
        private String name;
        private String peeringCidrRange;
        private String port;
        private String runtimeVersion;
        private String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInstanceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdAt = defaults.createdAt;
    	      this.description = defaults.description;
    	      this.diskEncryptionKeyName = defaults.diskEncryptionKeyName;
    	      this.displayName = defaults.displayName;
    	      this.host = defaults.host;
    	      this.ipRange = defaults.ipRange;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.peeringCidrRange = defaults.peeringCidrRange;
    	      this.port = defaults.port;
    	      this.runtimeVersion = defaults.runtimeVersion;
    	      this.state = defaults.state;
        }

        public Builder createdAt(String createdAt) {
            this.createdAt = Objects.requireNonNull(createdAt);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder diskEncryptionKeyName(String diskEncryptionKeyName) {
            this.diskEncryptionKeyName = Objects.requireNonNull(diskEncryptionKeyName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder ipRange(String ipRange) {
            this.ipRange = Objects.requireNonNull(ipRange);
            return this;
        }
        public Builder lastModifiedAt(String lastModifiedAt) {
            this.lastModifiedAt = Objects.requireNonNull(lastModifiedAt);
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
        public Builder peeringCidrRange(String peeringCidrRange) {
            this.peeringCidrRange = Objects.requireNonNull(peeringCidrRange);
            return this;
        }
        public Builder port(String port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder runtimeVersion(String runtimeVersion) {
            this.runtimeVersion = Objects.requireNonNull(runtimeVersion);
            return this;
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }        public GetInstanceResult build() {
            return new GetInstanceResult(createdAt, description, diskEncryptionKeyName, displayName, host, ipRange, lastModifiedAt, location, name, peeringCidrRange, port, runtimeVersion, state);
        }
    }
}
