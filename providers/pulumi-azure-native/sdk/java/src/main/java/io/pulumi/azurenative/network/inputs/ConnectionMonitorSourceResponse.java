// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes the source of connection monitor.
 * 
 */
public final class ConnectionMonitorSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ConnectionMonitorSourceResponse Empty = new ConnectionMonitorSourceResponse();

    /**
     * The source port used by connection monitor.
     * 
     */
    @Import(name="port")
      private final @Nullable Integer port;

    public Optional<Integer> getPort() {
        return this.port == null ? Optional.empty() : Optional.ofNullable(this.port);
    }

    /**
     * The ID of the resource used as the source by connection monitor.
     * 
     */
    @Import(name="resourceId", required=true)
      private final String resourceId;

    public String getResourceId() {
        return this.resourceId;
    }

    public ConnectionMonitorSourceResponse(
        @Nullable Integer port,
        String resourceId) {
        this.port = port;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
    }

    private ConnectionMonitorSourceResponse() {
        this.port = null;
        this.resourceId = null;
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

        public Builder port(@Nullable Integer port) {
            this.port = port;
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }        public ConnectionMonitorSourceResponse build() {
            return new ConnectionMonitorSourceResponse(port, resourceId);
        }
    }
}
