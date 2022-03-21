// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionBackendServiceConnectionTrackingPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionBackendServiceConnectionTrackingPolicyGetArgs Empty = new RegionBackendServiceConnectionTrackingPolicyGetArgs();

    /**
     * Specifies connection persistence when backends are unhealthy.
     * If set to `DEFAULT_FOR_PROTOCOL`, the existing connections persist on
     * unhealthy backends only for connection-oriented protocols (TCP and SCTP)
     * and only if the Tracking Mode is PER_CONNECTION (default tracking mode)
     * or the Session Affinity is configured for 5-tuple. They do not persist
     * for UDP.
     * If set to `NEVER_PERSIST`, after a backend becomes unhealthy, the existing
     * connections on the unhealthy backend are never persisted on the unhealthy
     * backend. They are always diverted to newly selected healthy backends
     * (unless all backends are unhealthy).
     * If set to `ALWAYS_PERSIST`, existing connections always persist on
     * unhealthy backends regardless of protocol and session affinity. It is
     * generally not recommended to use this mode overriding the default.
     * Default value is `DEFAULT_FOR_PROTOCOL`.
     * Possible values are `DEFAULT_FOR_PROTOCOL`, `NEVER_PERSIST`, and `ALWAYS_PERSIST`.
     * 
     */
    @Import(name="connectionPersistenceOnUnhealthyBackends")
      private final @Nullable Output<String> connectionPersistenceOnUnhealthyBackends;

    public Output<String> getConnectionPersistenceOnUnhealthyBackends() {
        return this.connectionPersistenceOnUnhealthyBackends == null ? Output.empty() : this.connectionPersistenceOnUnhealthyBackends;
    }

    /**
     * Specifies how long to keep a Connection Tracking entry while there is
     * no matching traffic (in seconds).
     * For L4 ILB the minimum(default) is 10 minutes and maximum is 16 hours.
     * For NLB the minimum(default) is 60 seconds and the maximum is 16 hours.
     * 
     */
    @Import(name="idleTimeoutSec")
      private final @Nullable Output<Integer> idleTimeoutSec;

    public Output<Integer> getIdleTimeoutSec() {
        return this.idleTimeoutSec == null ? Output.empty() : this.idleTimeoutSec;
    }

    /**
     * Specifies the key used for connection tracking. There are two options:
     * `PER_CONNECTION`: The Connection Tracking is performed as per the
     * Connection Key (default Hash Method) for the specific protocol.
     * `PER_SESSION`: The Connection Tracking is performed as per the
     * configured Session Affinity. It matches the configured Session Affinity.
     * Default value is `PER_CONNECTION`.
     * Possible values are `PER_CONNECTION` and `PER_SESSION`.
     * 
     */
    @Import(name="trackingMode")
      private final @Nullable Output<String> trackingMode;

    public Output<String> getTrackingMode() {
        return this.trackingMode == null ? Output.empty() : this.trackingMode;
    }

    public RegionBackendServiceConnectionTrackingPolicyGetArgs(
        @Nullable Output<String> connectionPersistenceOnUnhealthyBackends,
        @Nullable Output<Integer> idleTimeoutSec,
        @Nullable Output<String> trackingMode) {
        this.connectionPersistenceOnUnhealthyBackends = connectionPersistenceOnUnhealthyBackends;
        this.idleTimeoutSec = idleTimeoutSec;
        this.trackingMode = trackingMode;
    }

    private RegionBackendServiceConnectionTrackingPolicyGetArgs() {
        this.connectionPersistenceOnUnhealthyBackends = Output.empty();
        this.idleTimeoutSec = Output.empty();
        this.trackingMode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionBackendServiceConnectionTrackingPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> connectionPersistenceOnUnhealthyBackends;
        private @Nullable Output<Integer> idleTimeoutSec;
        private @Nullable Output<String> trackingMode;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionBackendServiceConnectionTrackingPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPersistenceOnUnhealthyBackends = defaults.connectionPersistenceOnUnhealthyBackends;
    	      this.idleTimeoutSec = defaults.idleTimeoutSec;
    	      this.trackingMode = defaults.trackingMode;
        }

        public Builder connectionPersistenceOnUnhealthyBackends(@Nullable Output<String> connectionPersistenceOnUnhealthyBackends) {
            this.connectionPersistenceOnUnhealthyBackends = connectionPersistenceOnUnhealthyBackends;
            return this;
        }
        public Builder connectionPersistenceOnUnhealthyBackends(@Nullable String connectionPersistenceOnUnhealthyBackends) {
            this.connectionPersistenceOnUnhealthyBackends = Output.ofNullable(connectionPersistenceOnUnhealthyBackends);
            return this;
        }
        public Builder idleTimeoutSec(@Nullable Output<Integer> idleTimeoutSec) {
            this.idleTimeoutSec = idleTimeoutSec;
            return this;
        }
        public Builder idleTimeoutSec(@Nullable Integer idleTimeoutSec) {
            this.idleTimeoutSec = Output.ofNullable(idleTimeoutSec);
            return this;
        }
        public Builder trackingMode(@Nullable Output<String> trackingMode) {
            this.trackingMode = trackingMode;
            return this;
        }
        public Builder trackingMode(@Nullable String trackingMode) {
            this.trackingMode = Output.ofNullable(trackingMode);
            return this;
        }        public RegionBackendServiceConnectionTrackingPolicyGetArgs build() {
            return new RegionBackendServiceConnectionTrackingPolicyGetArgs(connectionPersistenceOnUnhealthyBackends, idleTimeoutSec, trackingMode);
        }
    }
}
