// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class BackendServiceConnectionTrackingPolicyResponse {
    /**
     * Specifies connection persistence when backends are unhealthy. The default value is DEFAULT_FOR_PROTOCOL. If set to DEFAULT_FOR_PROTOCOL, the existing connections persist on unhealthy backends only for connection-oriented protocols (TCP and SCTP) and only if the Tracking Mode is PER_CONNECTION (default tracking mode) or the Session Affinity is configured for 5-tuple. They do not persist for UDP. If set to NEVER_PERSIST, after a backend becomes unhealthy, the existing connections on the unhealthy backend are never persisted on the unhealthy backend. They are always diverted to newly selected healthy backends (unless all backends are unhealthy). If set to ALWAYS_PERSIST, existing connections always persist on unhealthy backends regardless of protocol and session affinity. It is generally not recommended to use this mode overriding the default. For more details, see [Connection Persistence for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#connection-persistence) and [Connection Persistence for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#connection-persistence).
     * 
     */
    private final String connectionPersistenceOnUnhealthyBackends;
    /**
     * Enable Strong Session Affinity for Network Load Balancing. This option is not available publicly.
     * 
     */
    private final Boolean enableStrongAffinity;
    /**
     * Specifies how long to keep a Connection Tracking entry while there is no matching traffic (in seconds). For Internal TCP/UDP Load Balancing: - The minimum (default) is 10 minutes and the maximum is 16 hours. - It can be set only if Connection Tracking is less than 5-tuple (i.e. Session Affinity is CLIENT_IP_NO_DESTINATION, CLIENT_IP or CLIENT_IP_PROTO, and Tracking Mode is PER_SESSION). For Network Load Balancer the default is 60 seconds. This option is not available publicly.
     * 
     */
    private final Integer idleTimeoutSec;
    /**
     * Specifies the key used for connection tracking. There are two options: - PER_CONNECTION: This is the default mode. The Connection Tracking is performed as per the Connection Key (default Hash Method) for the specific protocol. - PER_SESSION: The Connection Tracking is performed as per the configured Session Affinity. It matches the configured Session Affinity. For more details, see [Tracking Mode for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#tracking-mode) and [Tracking Mode for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#tracking-mode).
     * 
     */
    private final String trackingMode;

    @CustomType.Constructor
    private BackendServiceConnectionTrackingPolicyResponse(
        @CustomType.Parameter("connectionPersistenceOnUnhealthyBackends") String connectionPersistenceOnUnhealthyBackends,
        @CustomType.Parameter("enableStrongAffinity") Boolean enableStrongAffinity,
        @CustomType.Parameter("idleTimeoutSec") Integer idleTimeoutSec,
        @CustomType.Parameter("trackingMode") String trackingMode) {
        this.connectionPersistenceOnUnhealthyBackends = connectionPersistenceOnUnhealthyBackends;
        this.enableStrongAffinity = enableStrongAffinity;
        this.idleTimeoutSec = idleTimeoutSec;
        this.trackingMode = trackingMode;
    }

    /**
     * Specifies connection persistence when backends are unhealthy. The default value is DEFAULT_FOR_PROTOCOL. If set to DEFAULT_FOR_PROTOCOL, the existing connections persist on unhealthy backends only for connection-oriented protocols (TCP and SCTP) and only if the Tracking Mode is PER_CONNECTION (default tracking mode) or the Session Affinity is configured for 5-tuple. They do not persist for UDP. If set to NEVER_PERSIST, after a backend becomes unhealthy, the existing connections on the unhealthy backend are never persisted on the unhealthy backend. They are always diverted to newly selected healthy backends (unless all backends are unhealthy). If set to ALWAYS_PERSIST, existing connections always persist on unhealthy backends regardless of protocol and session affinity. It is generally not recommended to use this mode overriding the default. For more details, see [Connection Persistence for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#connection-persistence) and [Connection Persistence for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#connection-persistence).
     * 
    */
    public String getConnectionPersistenceOnUnhealthyBackends() {
        return this.connectionPersistenceOnUnhealthyBackends;
    }
    /**
     * Enable Strong Session Affinity for Network Load Balancing. This option is not available publicly.
     * 
    */
    public Boolean getEnableStrongAffinity() {
        return this.enableStrongAffinity;
    }
    /**
     * Specifies how long to keep a Connection Tracking entry while there is no matching traffic (in seconds). For Internal TCP/UDP Load Balancing: - The minimum (default) is 10 minutes and the maximum is 16 hours. - It can be set only if Connection Tracking is less than 5-tuple (i.e. Session Affinity is CLIENT_IP_NO_DESTINATION, CLIENT_IP or CLIENT_IP_PROTO, and Tracking Mode is PER_SESSION). For Network Load Balancer the default is 60 seconds. This option is not available publicly.
     * 
    */
    public Integer getIdleTimeoutSec() {
        return this.idleTimeoutSec;
    }
    /**
     * Specifies the key used for connection tracking. There are two options: - PER_CONNECTION: This is the default mode. The Connection Tracking is performed as per the Connection Key (default Hash Method) for the specific protocol. - PER_SESSION: The Connection Tracking is performed as per the configured Session Affinity. It matches the configured Session Affinity. For more details, see [Tracking Mode for Network Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-backend-service#tracking-mode) and [Tracking Mode for Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal#tracking-mode).
     * 
    */
    public String getTrackingMode() {
        return this.trackingMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceConnectionTrackingPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectionPersistenceOnUnhealthyBackends;
        private Boolean enableStrongAffinity;
        private Integer idleTimeoutSec;
        private String trackingMode;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceConnectionTrackingPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectionPersistenceOnUnhealthyBackends = defaults.connectionPersistenceOnUnhealthyBackends;
    	      this.enableStrongAffinity = defaults.enableStrongAffinity;
    	      this.idleTimeoutSec = defaults.idleTimeoutSec;
    	      this.trackingMode = defaults.trackingMode;
        }

        public Builder connectionPersistenceOnUnhealthyBackends(String connectionPersistenceOnUnhealthyBackends) {
            this.connectionPersistenceOnUnhealthyBackends = Objects.requireNonNull(connectionPersistenceOnUnhealthyBackends);
            return this;
        }
        public Builder enableStrongAffinity(Boolean enableStrongAffinity) {
            this.enableStrongAffinity = Objects.requireNonNull(enableStrongAffinity);
            return this;
        }
        public Builder idleTimeoutSec(Integer idleTimeoutSec) {
            this.idleTimeoutSec = Objects.requireNonNull(idleTimeoutSec);
            return this;
        }
        public Builder trackingMode(String trackingMode) {
            this.trackingMode = Objects.requireNonNull(trackingMode);
            return this;
        }        public BackendServiceConnectionTrackingPolicyResponse build() {
            return new BackendServiceConnectionTrackingPolicyResponse(connectionPersistenceOnUnhealthyBackends, enableStrongAffinity, idleTimeoutSec, trackingMode);
        }
    }
}
