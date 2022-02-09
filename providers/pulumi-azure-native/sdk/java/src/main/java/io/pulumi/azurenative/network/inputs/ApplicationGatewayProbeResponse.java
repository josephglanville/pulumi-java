// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.inputs.ApplicationGatewayProbeHealthResponseMatchResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ApplicationGatewayProbeResponse extends io.pulumi.resources.InvokeArgs {

    public static final ApplicationGatewayProbeResponse Empty = new ApplicationGatewayProbeResponse();

    @InputImport(name="etag", required=true)
    private final String etag;

    public String getEtag() {
        return this.etag;
    }

    @InputImport(name="host")
    private final @Nullable String host;

    public Optional<String> getHost() {
        return this.host == null ? Optional.empty() : Optional.ofNullable(this.host);
    }

    @InputImport(name="id")
    private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    @InputImport(name="interval")
    private final @Nullable Integer interval;

    public Optional<Integer> getInterval() {
        return this.interval == null ? Optional.empty() : Optional.ofNullable(this.interval);
    }

    @InputImport(name="match")
    private final @Nullable ApplicationGatewayProbeHealthResponseMatchResponse match;

    public Optional<ApplicationGatewayProbeHealthResponseMatchResponse> getMatch() {
        return this.match == null ? Optional.empty() : Optional.ofNullable(this.match);
    }

    @InputImport(name="minServers")
    private final @Nullable Integer minServers;

    public Optional<Integer> getMinServers() {
        return this.minServers == null ? Optional.empty() : Optional.ofNullable(this.minServers);
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    @InputImport(name="path")
    private final @Nullable String path;

    public Optional<String> getPath() {
        return this.path == null ? Optional.empty() : Optional.ofNullable(this.path);
    }

    @InputImport(name="pickHostNameFromBackendHttpSettings")
    private final @Nullable Boolean pickHostNameFromBackendHttpSettings;

    public Optional<Boolean> getPickHostNameFromBackendHttpSettings() {
        return this.pickHostNameFromBackendHttpSettings == null ? Optional.empty() : Optional.ofNullable(this.pickHostNameFromBackendHttpSettings);
    }

    @InputImport(name="port")
    private final @Nullable Integer port;

    public Optional<Integer> getPort() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    @InputImport(name="protocol")
    private final @Nullable String protocol;

    public Optional<String> getProtocol() {
        return this.protocol == null ? Optional.empty() : Optional.ofNullable(this.protocol);
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    @InputImport(name="timeout")
    private final @Nullable Integer timeout;

    public Optional<Integer> getTimeout() {
        return this.timeout == null ? Optional.empty() : Optional.ofNullable(this.timeout);
    }

    @InputImport(name="type", required=true)
    private final String type;

    public String getType() {
        return this.type;
    }

    @InputImport(name="unhealthyThreshold")
    private final @Nullable Integer unhealthyThreshold;

    public Optional<Integer> getUnhealthyThreshold() {
        return this.unhealthyThreshold == null ? Optional.empty() : Optional.ofNullable(this.unhealthyThreshold);
    }

    public ApplicationGatewayProbeResponse(
        String etag,
        @Nullable String host,
        @Nullable String id,
        @Nullable Integer interval,
        @Nullable ApplicationGatewayProbeHealthResponseMatchResponse match,
        @Nullable Integer minServers,
        @Nullable String name,
        @Nullable String path,
        @Nullable Boolean pickHostNameFromBackendHttpSettings,
        @Nullable Integer port,
        @Nullable String protocol,
        String provisioningState,
        @Nullable Integer timeout,
        String type,
        @Nullable Integer unhealthyThreshold) {
        this.etag = Objects.requireNonNull(etag, "expected parameter 'etag' to be non-null");
        this.host = host;
        this.id = id;
        this.interval = interval;
        this.match = match;
        this.minServers = minServers;
        this.name = name;
        this.path = path;
        this.pickHostNameFromBackendHttpSettings = pickHostNameFromBackendHttpSettings;
        this.port = port;
        this.protocol = protocol;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.timeout = timeout;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.unhealthyThreshold = unhealthyThreshold;
    }

    private ApplicationGatewayProbeResponse() {
        this.etag = null;
        this.host = null;
        this.id = null;
        this.interval = null;
        this.match = null;
        this.minServers = null;
        this.name = null;
        this.path = null;
        this.pickHostNameFromBackendHttpSettings = null;
        this.port = null;
        this.protocol = null;
        this.provisioningState = null;
        this.timeout = null;
        this.type = null;
        this.unhealthyThreshold = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayProbeResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String etag;
        private @Nullable String host;
        private @Nullable String id;
        private @Nullable Integer interval;
        private @Nullable ApplicationGatewayProbeHealthResponseMatchResponse match;
        private @Nullable Integer minServers;
        private @Nullable String name;
        private @Nullable String path;
        private @Nullable Boolean pickHostNameFromBackendHttpSettings;
        private @Nullable Integer port;
        private @Nullable String protocol;
        private String provisioningState;
        private @Nullable Integer timeout;
        private String type;
        private @Nullable Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayProbeResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.etag = defaults.etag;
    	      this.host = defaults.host;
    	      this.id = defaults.id;
    	      this.interval = defaults.interval;
    	      this.match = defaults.match;
    	      this.minServers = defaults.minServers;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.pickHostNameFromBackendHttpSettings = defaults.pickHostNameFromBackendHttpSettings;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.timeout = defaults.timeout;
    	      this.type = defaults.type;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setHost(@Nullable String host) {
            this.host = host;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setInterval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }

        public Builder setMatch(@Nullable ApplicationGatewayProbeHealthResponseMatchResponse match) {
            this.match = match;
            return this;
        }

        public Builder setMinServers(@Nullable Integer minServers) {
            this.minServers = minServers;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setPickHostNameFromBackendHttpSettings(@Nullable Boolean pickHostNameFromBackendHttpSettings) {
            this.pickHostNameFromBackendHttpSettings = pickHostNameFromBackendHttpSettings;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUnhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        public ApplicationGatewayProbeResponse build() {
            return new ApplicationGatewayProbeResponse(etag, host, id, interval, match, minServers, name, path, pickHostNameFromBackendHttpSettings, port, protocol, provisioningState, timeout, type, unhealthyThreshold);
        }
    }
}
