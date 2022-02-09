// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ConnectionMonitorSourceResponse {
    private final @Nullable Integer port;
    private final String resourceId;

    @OutputCustomType.Constructor({"port","resourceId"})
    private ConnectionMonitorSourceResponse(
        @Nullable Integer port,
        String resourceId) {
        this.port = port;
        this.resourceId = Objects.requireNonNull(resourceId);
    }

    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectionMonitorSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer port;
        private String resourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectionMonitorSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.port = defaults.port;
    	      this.resourceId = defaults.resourceId;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder setResourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }

        public ConnectionMonitorSourceResponse build() {
            return new ConnectionMonitorSourceResponse(port, resourceId);
        }
    }
}
