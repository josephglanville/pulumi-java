// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.enums.BackendServiceConnectionTrackingPolicyConnectionPersistenceOnUnhealthyBackends;
import io.pulumi.googlenative.compute_alpha.enums.BackendServiceConnectionTrackingPolicyTrackingMode;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Connection Tracking configuration for this BackendService.
 * 
 */
public final class BackendServiceConnectionTrackingPolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final BackendServiceConnectionTrackingPolicyArgs Empty = new BackendServiceConnectionTrackingPolicyArgs();

    /**
     * Specifies connection persistence when backends are unhealthy. The default value is DEFAULT_FOR_PROTOCOL. If set to DEFAULT_FOR_PROTOCOL, the existing connections persist on unhealthy backends only for connection-oriented protocols (TCP and SCTP) and only if the Tracking Mode is PER_CONNECTION (default tracking mode) or the Session Affinity is configured for 5-tuple. They do not persist for UDP. If set to NEVER_PERSIST, after a backend becomes unhealthy, the existing connections on the unhealthy backend are never persisted on the unhealthy backend. They are always diverted to newly selected healthy backends (unless all backends are unhealthy). If set to ALWAYS_PERSIST, existing connections always persist on unhealthy backends regardless of protocol and session affinity. It is generally not recommended to use this mode overriding the default. For more details, see [Connection Persistence for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#connection-persistence) and [Connection Persistence for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#connection-persistence).
     * 
     */
    @Import(name="connectionPersistenceOnUnhealthyBackends")
      private final @Nullable Output<BackendServiceConnectionTrackingPolicyConnectionPersistenceOnUnhealthyBackends> connectionPersistenceOnUnhealthyBackends;

    public Output<BackendServiceConnectionTrackingPolicyConnectionPersistenceOnUnhealthyBackends> getConnectionPersistenceOnUnhealthyBackends() {
        return this.connectionPersistenceOnUnhealthyBackends == null ? Output.empty() : this.connectionPersistenceOnUnhealthyBackends;
    }

    /**
     * Enable Strong Session Affinity for Network Load Balancing. This option is not available publicly.
     * 
     */
    @Import(name="enableStrongAffinity")
      private final @Nullable Output<Boolean> enableStrongAffinity;

    public Output<Boolean> getEnableStrongAffinity() {
        return this.enableStrongAffinity == null ? Output.empty() : this.enableStrongAffinity;
    }

    /**
     * Specifies how long to keep a Connection Tracking entry while there is no matching traffic (in seconds). For Internal TCP/UDP Load Balancing: - The minimum (default) is 10 minutes and the maximum is 16 hours. - It can be set only if Connection Tracking is less than 5-tuple (i.e. Session Affinity is CLIENT_IP_NO_DESTINATION, CLIENT_IP or CLIENT_IP_PROTO, and Tracking Mode is PER_SESSION). For Network Load Balancer the default is 60 seconds. This option is not available publicly.
     * 
     */
    @Import(name="idleTimeoutSec")
      private final @Nullable Output<Integer> idleTimeoutSec;

    public Output<Integer> getIdleTimeoutSec() {
        return this.idleTimeoutSec == null ? Output.empty() : this.idleTimeoutSec;
    }

    /**
     * Specifies the key used for connection tracking. There are two options: - PER_CONNECTION: This is the default mode. The Connection Tracking is performed as per the Connection Key (default Hash Method) for the specific protocol. - PER_SESSION: The Connection Tracking is performed as per the configured Session Affinity. It matches the configured Session Affinity. For more details, see [Tracking Mode for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#tracking-mode) and [Tracking Mode for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#tracking-mode).
     * 
     */
    @Import(name="trackingMode")
      private final @Nullable Output<BackendServiceConnectionTrackingPolicyTrackingMode> trackingMode;

    public Output<BackendServiceConnectionTrackingPolicyTrackingMode> getTrackingMode() {
        return this.trackingMode == null ? Output.empty() : this.trackingMode;
    }

    public BackendServiceConnectionTrackingPolicyArgs(
        @Nullable Output<BackendServiceConnectionTrackingPolicyConnectionPersistenceOnUnhealthyBackends> connectionPersistenceOnUnhealthyBackends,
        @Nullable Output<Boolean> enableStrongAffinity,
        @Nullable Output<Integer> idleTimeoutSec,
        @Nullable Output<BackendServiceConnectionTrackingPolicyTrackingMode> trackingMode) {
        this.connectionPersistenceOnUnhealthyBackends = connectionPersistenceOnUnhealthyBackends;
        this.enableStrongAffinity = enableStrongAffinity;
        this.idleTimeoutSec = idleTimeoutSec;
        this.trackingMode = trackingMode;
    }

    private BackendServiceConnectionTrackingPolicyArgs() {
        this.connectionPersistenceOnUnhealthyBackends = Output.empty();
        this.enableStrongAffinity = Output.empty();
        this.idleTimeoutSec = Output.empty();
        this.trackingMode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceConnectionTrackingPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<BackendServiceConnectionTrackingPolicyConnectionPersistenceOnUnhealthyBackends> connectionPersistenceOnUnhealthyBackends;
        private @Nullable Output<Boolean> enableStrongAffinity;
        private @Nullable Output<Integer> idleTimeoutSec;
        private @Nullable Output<BackendServiceConnectionTrackingPolicyTrackingMode> trackingMode;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceConnectionTrackingPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPersistenceOnUnhealthyBackends = defaults.connectionPersistenceOnUnhealthyBackends;
    	      this.enableStrongAffinity = defaults.enableStrongAffinity;
    	      this.idleTimeoutSec = defaults.idleTimeoutSec;
    	      this.trackingMode = defaults.trackingMode;
        }

        public Builder connectionPersistenceOnUnhealthyBackends(@Nullable Output<BackendServiceConnectionTrackingPolicyConnectionPersistenceOnUnhealthyBackends> connectionPersistenceOnUnhealthyBackends) {
            this.connectionPersistenceOnUnhealthyBackends = connectionPersistenceOnUnhealthyBackends;
            return this;
        }
        public Builder connectionPersistenceOnUnhealthyBackends(@Nullable BackendServiceConnectionTrackingPolicyConnectionPersistenceOnUnhealthyBackends connectionPersistenceOnUnhealthyBackends) {
            this.connectionPersistenceOnUnhealthyBackends = Output.ofNullable(connectionPersistenceOnUnhealthyBackends);
            return this;
        }
        public Builder enableStrongAffinity(@Nullable Output<Boolean> enableStrongAffinity) {
            this.enableStrongAffinity = enableStrongAffinity;
            return this;
        }
        public Builder enableStrongAffinity(@Nullable Boolean enableStrongAffinity) {
            this.enableStrongAffinity = Output.ofNullable(enableStrongAffinity);
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
        public Builder trackingMode(@Nullable Output<BackendServiceConnectionTrackingPolicyTrackingMode> trackingMode) {
            this.trackingMode = trackingMode;
            return this;
        }
        public Builder trackingMode(@Nullable BackendServiceConnectionTrackingPolicyTrackingMode trackingMode) {
            this.trackingMode = Output.ofNullable(trackingMode);
            return this;
        }        public BackendServiceConnectionTrackingPolicyArgs build() {
            return new BackendServiceConnectionTrackingPolicyArgs(connectionPersistenceOnUnhealthyBackends, enableStrongAffinity, idleTimeoutSec, trackingMode);
        }
    }
}
