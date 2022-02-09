// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SqlConnectivityUpdateSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final SqlConnectivityUpdateSettingsResponse Empty = new SqlConnectivityUpdateSettingsResponse();

    @InputImport(name="connectivityType")
    private final @Nullable String connectivityType;

    public Optional<String> getConnectivityType() {
        return this.connectivityType == null ? Optional.empty() : Optional.ofNullable(this.connectivityType);
    }

    @InputImport(name="port")
    private final @Nullable Integer port;

    public Optional<Integer> getPort() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    public SqlConnectivityUpdateSettingsResponse(
        @Nullable String connectivityType,
        @Nullable Integer port) {
        this.connectivityType = connectivityType;
        this.port = port;
    }

    private SqlConnectivityUpdateSettingsResponse() {
        this.connectivityType = null;
        this.port = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlConnectivityUpdateSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String connectivityType;
        private @Nullable Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlConnectivityUpdateSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectivityType = defaults.connectivityType;
    	      this.port = defaults.port;
        }

        public Builder setConnectivityType(@Nullable String connectivityType) {
            this.connectivityType = connectivityType;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public SqlConnectivityUpdateSettingsResponse build() {
            return new SqlConnectivityUpdateSettingsResponse(connectivityType, port);
        }
    }
}
