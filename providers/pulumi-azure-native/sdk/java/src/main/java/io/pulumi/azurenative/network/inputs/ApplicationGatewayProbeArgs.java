// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.ApplicationGatewayProtocol;
import io.pulumi.azurenative.network.inputs.ApplicationGatewayProbeHealthResponseMatchArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationGatewayProbeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationGatewayProbeArgs Empty = new ApplicationGatewayProbeArgs();

    @InputImport(name="host")
    private final @Nullable Input<String> host;

    public Input<String> getHost() {
        return this.host == null ? Input.empty() : this.host;
    }

    @InputImport(name="id")
    private final @Nullable Input<String> id;

    public Input<String> getId() {
        return this.id == null ? Input.empty() : this.id;
    }

    @InputImport(name="interval")
    private final @Nullable Input<Integer> interval;

    public Input<Integer> getInterval() {
        return this.interval == null ? Input.empty() : this.interval;
    }

    @InputImport(name="match")
    private final @Nullable Input<ApplicationGatewayProbeHealthResponseMatchArgs> match;

    public Input<ApplicationGatewayProbeHealthResponseMatchArgs> getMatch() {
        return this.match == null ? Input.empty() : this.match;
    }

    @InputImport(name="minServers")
    private final @Nullable Input<Integer> minServers;

    public Input<Integer> getMinServers() {
        return this.minServers == null ? Input.empty() : this.minServers;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="path")
    private final @Nullable Input<String> path;

    public Input<String> getPath() {
        return this.path == null ? Input.empty() : this.path;
    }

    @InputImport(name="pickHostNameFromBackendHttpSettings")
    private final @Nullable Input<Boolean> pickHostNameFromBackendHttpSettings;

    public Input<Boolean> getPickHostNameFromBackendHttpSettings() {
        return this.pickHostNameFromBackendHttpSettings == null ? Input.empty() : this.pickHostNameFromBackendHttpSettings;
    }

    @InputImport(name="port")
    private final @Nullable Input<Integer> port;

    public Input<Integer> getPort() {
        return this.port == null ? Input.empty() : this.port;
    }

    @InputImport(name="protocol")
    private final @Nullable Input<Either<String,ApplicationGatewayProtocol>> protocol;

    public Input<Either<String,ApplicationGatewayProtocol>> getProtocol() {
        return this.protocol == null ? Input.empty() : this.protocol;
    }

    @InputImport(name="timeout")
    private final @Nullable Input<Integer> timeout;

    public Input<Integer> getTimeout() {
        return this.timeout == null ? Input.empty() : this.timeout;
    }

    @InputImport(name="unhealthyThreshold")
    private final @Nullable Input<Integer> unhealthyThreshold;

    public Input<Integer> getUnhealthyThreshold() {
        return this.unhealthyThreshold == null ? Input.empty() : this.unhealthyThreshold;
    }

    public ApplicationGatewayProbeArgs(
        @Nullable Input<String> host,
        @Nullable Input<String> id,
        @Nullable Input<Integer> interval,
        @Nullable Input<ApplicationGatewayProbeHealthResponseMatchArgs> match,
        @Nullable Input<Integer> minServers,
        @Nullable Input<String> name,
        @Nullable Input<String> path,
        @Nullable Input<Boolean> pickHostNameFromBackendHttpSettings,
        @Nullable Input<Integer> port,
        @Nullable Input<Either<String,ApplicationGatewayProtocol>> protocol,
        @Nullable Input<Integer> timeout,
        @Nullable Input<Integer> unhealthyThreshold) {
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
        this.timeout = timeout;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    private ApplicationGatewayProbeArgs() {
        this.host = Input.empty();
        this.id = Input.empty();
        this.interval = Input.empty();
        this.match = Input.empty();
        this.minServers = Input.empty();
        this.name = Input.empty();
        this.path = Input.empty();
        this.pickHostNameFromBackendHttpSettings = Input.empty();
        this.port = Input.empty();
        this.protocol = Input.empty();
        this.timeout = Input.empty();
        this.unhealthyThreshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayProbeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> host;
        private @Nullable Input<String> id;
        private @Nullable Input<Integer> interval;
        private @Nullable Input<ApplicationGatewayProbeHealthResponseMatchArgs> match;
        private @Nullable Input<Integer> minServers;
        private @Nullable Input<String> name;
        private @Nullable Input<String> path;
        private @Nullable Input<Boolean> pickHostNameFromBackendHttpSettings;
        private @Nullable Input<Integer> port;
        private @Nullable Input<Either<String,ApplicationGatewayProtocol>> protocol;
        private @Nullable Input<Integer> timeout;
        private @Nullable Input<Integer> unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayProbeArgs defaults) {
    	      Objects.requireNonNull(defaults);
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
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder setHost(@Nullable Input<String> host) {
            this.host = host;
            return this;
        }

        public Builder setHost(@Nullable String host) {
            this.host = Input.ofNullable(host);
            return this;
        }

        public Builder setId(@Nullable Input<String> id) {
            this.id = id;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = Input.ofNullable(id);
            return this;
        }

        public Builder setInterval(@Nullable Input<Integer> interval) {
            this.interval = interval;
            return this;
        }

        public Builder setInterval(@Nullable Integer interval) {
            this.interval = Input.ofNullable(interval);
            return this;
        }

        public Builder setMatch(@Nullable Input<ApplicationGatewayProbeHealthResponseMatchArgs> match) {
            this.match = match;
            return this;
        }

        public Builder setMatch(@Nullable ApplicationGatewayProbeHealthResponseMatchArgs match) {
            this.match = Input.ofNullable(match);
            return this;
        }

        public Builder setMinServers(@Nullable Input<Integer> minServers) {
            this.minServers = minServers;
            return this;
        }

        public Builder setMinServers(@Nullable Integer minServers) {
            this.minServers = Input.ofNullable(minServers);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setPath(@Nullable Input<String> path) {
            this.path = path;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = Input.ofNullable(path);
            return this;
        }

        public Builder setPickHostNameFromBackendHttpSettings(@Nullable Input<Boolean> pickHostNameFromBackendHttpSettings) {
            this.pickHostNameFromBackendHttpSettings = pickHostNameFromBackendHttpSettings;
            return this;
        }

        public Builder setPickHostNameFromBackendHttpSettings(@Nullable Boolean pickHostNameFromBackendHttpSettings) {
            this.pickHostNameFromBackendHttpSettings = Input.ofNullable(pickHostNameFromBackendHttpSettings);
            return this;
        }

        public Builder setPort(@Nullable Input<Integer> port) {
            this.port = port;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = Input.ofNullable(port);
            return this;
        }

        public Builder setProtocol(@Nullable Input<Either<String,ApplicationGatewayProtocol>> protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProtocol(@Nullable Either<String,ApplicationGatewayProtocol> protocol) {
            this.protocol = Input.ofNullable(protocol);
            return this;
        }

        public Builder setTimeout(@Nullable Input<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder setTimeout(@Nullable Integer timeout) {
            this.timeout = Input.ofNullable(timeout);
            return this;
        }

        public Builder setUnhealthyThreshold(@Nullable Input<Integer> unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }

        public Builder setUnhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = Input.ofNullable(unhealthyThreshold);
            return this;
        }

        public ApplicationGatewayProbeArgs build() {
            return new ApplicationGatewayProbeArgs(host, id, interval, match, minServers, name, path, pickHostNameFromBackendHttpSettings, port, protocol, timeout, unhealthyThreshold);
        }
    }
}