// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.BackendServiceBackendGetArgs;
import io.pulumi.gcp.compute.inputs.BackendServiceCdnPolicyGetArgs;
import io.pulumi.gcp.compute.inputs.BackendServiceCircuitBreakersGetArgs;
import io.pulumi.gcp.compute.inputs.BackendServiceConsistentHashGetArgs;
import io.pulumi.gcp.compute.inputs.BackendServiceIapGetArgs;
import io.pulumi.gcp.compute.inputs.BackendServiceLogConfigGetArgs;
import io.pulumi.gcp.compute.inputs.BackendServiceOutlierDetectionGetArgs;
import io.pulumi.gcp.compute.inputs.BackendServiceSecuritySettingsGetArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BackendServiceState extends io.pulumi.resources.ResourceArgs {

    public static final BackendServiceState Empty = new BackendServiceState();

    /**
     * Lifetime of cookies in seconds if session_affinity is
     * GENERATED_COOKIE. If set to 0, the cookie is non-persistent and lasts
     * only until the end of the browser session (or equivalent). The
     * maximum allowed value for TTL is one day.
     * When the load balancing scheme is INTERNAL, this field is not used.
     * 
     */
    @Import(name="affinityCookieTtlSec")
      private final @Nullable Output<Integer> affinityCookieTtlSec;

    public Output<Integer> getAffinityCookieTtlSec() {
        return this.affinityCookieTtlSec == null ? Output.empty() : this.affinityCookieTtlSec;
    }

    /**
     * The set of backends that serve this BackendService.
     * Structure is documented below.
     * 
     */
    @Import(name="backends")
      private final @Nullable Output<List<BackendServiceBackendGetArgs>> backends;

    public Output<List<BackendServiceBackendGetArgs>> getBackends() {
        return this.backends == null ? Output.empty() : this.backends;
    }

    /**
     * Cloud CDN configuration for this BackendService.
     * Structure is documented below.
     * 
     */
    @Import(name="cdnPolicy")
      private final @Nullable Output<BackendServiceCdnPolicyGetArgs> cdnPolicy;

    public Output<BackendServiceCdnPolicyGetArgs> getCdnPolicy() {
        return this.cdnPolicy == null ? Output.empty() : this.cdnPolicy;
    }

    /**
     * Settings controlling the volume of connections to a backend service. This field
     * is applicable only when the load_balancing_scheme is set to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * 
     */
    @Import(name="circuitBreakers")
      private final @Nullable Output<BackendServiceCircuitBreakersGetArgs> circuitBreakers;

    public Output<BackendServiceCircuitBreakersGetArgs> getCircuitBreakers() {
        return this.circuitBreakers == null ? Output.empty() : this.circuitBreakers;
    }

    /**
     * Time for which instance will be drained (not accept new
     * connections, but still work to finish started).
     * 
     */
    @Import(name="connectionDrainingTimeoutSec")
      private final @Nullable Output<Integer> connectionDrainingTimeoutSec;

    public Output<Integer> getConnectionDrainingTimeoutSec() {
        return this.connectionDrainingTimeoutSec == null ? Output.empty() : this.connectionDrainingTimeoutSec;
    }

    /**
     * Consistent Hash-based load balancing can be used to provide soft session
     * affinity based on HTTP headers, cookies or other properties. This load balancing
     * policy is applicable only for HTTP connections. The affinity to a particular
     * destination host will be lost when one or more hosts are added/removed from the
     * destination service. This field specifies parameters that control consistent
     * hashing. This field only applies if the load_balancing_scheme is set to
     * INTERNAL_SELF_MANAGED. This field is only applicable when locality_lb_policy is
     * set to MAGLEV or RING_HASH.
     * Structure is documented below.
     * 
     */
    @Import(name="consistentHash")
      private final @Nullable Output<BackendServiceConsistentHashGetArgs> consistentHash;

    public Output<BackendServiceConsistentHashGetArgs> getConsistentHash() {
        return this.consistentHash == null ? Output.empty() : this.consistentHash;
    }

    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @Import(name="creationTimestamp")
      private final @Nullable Output<String> creationTimestamp;

    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp == null ? Output.empty() : this.creationTimestamp;
    }

    /**
     * Headers that the HTTP/S load balancer should add to proxied
     * requests.
     * 
     */
    @Import(name="customRequestHeaders")
      private final @Nullable Output<List<String>> customRequestHeaders;

    public Output<List<String>> getCustomRequestHeaders() {
        return this.customRequestHeaders == null ? Output.empty() : this.customRequestHeaders;
    }

    /**
     * Headers that the HTTP/S load balancer should add to proxied
     * responses.
     * 
     */
    @Import(name="customResponseHeaders")
      private final @Nullable Output<List<String>> customResponseHeaders;

    public Output<List<String>> getCustomResponseHeaders() {
        return this.customResponseHeaders == null ? Output.empty() : this.customResponseHeaders;
    }

    /**
     * An optional description of this resource.
     * Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * If true, enable Cloud CDN for this BackendService.
     * 
     */
    @Import(name="enableCdn")
      private final @Nullable Output<Boolean> enableCdn;

    public Output<Boolean> getEnableCdn() {
        return this.enableCdn == null ? Output.empty() : this.enableCdn;
    }

    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking.
     * 
     */
    @Import(name="fingerprint")
      private final @Nullable Output<String> fingerprint;

    public Output<String> getFingerprint() {
        return this.fingerprint == null ? Output.empty() : this.fingerprint;
    }

    /**
     * The set of URLs to the HttpHealthCheck or HttpsHealthCheck resource
     * for health checking this BackendService. Currently at most one health
     * check can be specified.
     * A health check must be specified unless the backend service uses an internet
     * or serverless NEG as a backend.
     * For internal load balancing, a URL to a HealthCheck resource must be specified instead.
     * 
     */
    @Import(name="healthChecks")
      private final @Nullable Output<String> healthChecks;

    public Output<String> getHealthChecks() {
        return this.healthChecks == null ? Output.empty() : this.healthChecks;
    }

    /**
     * Settings for enabling Cloud Identity Aware Proxy
     * Structure is documented below.
     * 
     */
    @Import(name="iap")
      private final @Nullable Output<BackendServiceIapGetArgs> iap;

    public Output<BackendServiceIapGetArgs> getIap() {
        return this.iap == null ? Output.empty() : this.iap;
    }

    /**
     * Indicates whether the backend service will be used with internal or
     * external load balancing. A backend service created for one type of
     * load balancing cannot be used with the other. For more information, refer to
     * [Choosing a load balancer](https://cloud.google.com/load-balancing/docs/backend-service).
     * Default value is `EXTERNAL`.
     * Possible values are `EXTERNAL`, `INTERNAL_SELF_MANAGED`, and `EXTERNAL_MANAGED`.
     * 
     */
    @Import(name="loadBalancingScheme")
      private final @Nullable Output<String> loadBalancingScheme;

    public Output<String> getLoadBalancingScheme() {
        return this.loadBalancingScheme == null ? Output.empty() : this.loadBalancingScheme;
    }

    /**
     * The load balancing algorithm used within the scope of the locality.
     * The possible values are:
     * * `ROUND_ROBIN`: This is a simple policy in which each healthy backend
     *   is selected in round robin order.
     * * `LEAST_REQUEST`: An O(1) algorithm which selects two random healthy
     *   hosts and picks the host which has fewer active requests.
     * * `RING_HASH`: The ring/modulo hash load balancer implements consistent
     *   hashing to backends. The algorithm has the property that the
     *   addition/removal of a host from a set of N hosts only affects
     *   1/N of the requests.
     * * `RANDOM`: The load balancer selects a random healthy host.
     * * `ORIGINAL_DESTINATION`: Backend host is selected based on the client
     *   connection metadata, i.e., connections are opened
     *   to the same address as the destination address of
     *   the incoming connection before the connection
     *   was redirected to the load balancer.
     * * `MAGLEV`: used as a drop in replacement for the ring hash load balancer.
     *   Maglev is not as stable as ring hash but has faster table lookup
     *   build times and host selection times. For more information about
     *   Maglev, refer to https://ai.google/research/pubs/pub44824
     * 
     */
    @Import(name="localityLbPolicy")
      private final @Nullable Output<String> localityLbPolicy;

    public Output<String> getLocalityLbPolicy() {
        return this.localityLbPolicy == null ? Output.empty() : this.localityLbPolicy;
    }

    /**
     * This field denotes the logging options for the load balancer traffic served by this backend service.
     * If logging is enabled, logs will be exported to Stackdriver.
     * Structure is documented below.
     * 
     */
    @Import(name="logConfig")
      private final @Nullable Output<BackendServiceLogConfigGetArgs> logConfig;

    public Output<BackendServiceLogConfigGetArgs> getLogConfig() {
        return this.logConfig == null ? Output.empty() : this.logConfig;
    }

    /**
     * Name of the cookie.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Settings controlling eviction of unhealthy hosts from the load balancing pool.
     * This field is applicable only when the load_balancing_scheme is set
     * to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * 
     */
    @Import(name="outlierDetection")
      private final @Nullable Output<BackendServiceOutlierDetectionGetArgs> outlierDetection;

    public Output<BackendServiceOutlierDetectionGetArgs> getOutlierDetection() {
        return this.outlierDetection == null ? Output.empty() : this.outlierDetection;
    }

    /**
     * Name of backend port. The same name should appear in the instance
     * groups referenced by this service. Required when the load balancing
     * scheme is EXTERNAL.
     * 
     */
    @Import(name="portName")
      private final @Nullable Output<String> portName;

    public Output<String> getPortName() {
        return this.portName == null ? Output.empty() : this.portName;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The protocol this BackendService uses to communicate with backends.
     * The default is HTTP. **NOTE**: HTTP2 is only valid for beta HTTP/2 load balancer
     * types and may result in errors if used with the GA API.
     * Possible values are `HTTP`, `HTTPS`, `HTTP2`, `TCP`, `SSL`, and `GRPC`.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> getProtocol() {
        return this.protocol == null ? Output.empty() : this.protocol;
    }

    /**
     * The security policy associated with this backend service.
     * 
     */
    @Import(name="securityPolicy")
      private final @Nullable Output<String> securityPolicy;

    public Output<String> getSecurityPolicy() {
        return this.securityPolicy == null ? Output.empty() : this.securityPolicy;
    }

    /**
     * The security settings that apply to this backend service. This field is applicable to either
     * a regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and
     * load_balancing_scheme set to INTERNAL_MANAGED; or a global backend service with the
     * load_balancing_scheme set to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * 
     */
    @Import(name="securitySettings")
      private final @Nullable Output<BackendServiceSecuritySettingsGetArgs> securitySettings;

    public Output<BackendServiceSecuritySettingsGetArgs> getSecuritySettings() {
        return this.securitySettings == null ? Output.empty() : this.securitySettings;
    }

    /**
     * The URI of the created resource.
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink == null ? Output.empty() : this.selfLink;
    }

    /**
     * Type of session affinity to use. The default is NONE. Session affinity is
     * not applicable if the protocol is UDP.
     * Possible values are `NONE`, `CLIENT_IP`, `CLIENT_IP_PORT_PROTO`, `CLIENT_IP_PROTO`, `GENERATED_COOKIE`, `HEADER_FIELD`, and `HTTP_COOKIE`.
     * 
     */
    @Import(name="sessionAffinity")
      private final @Nullable Output<String> sessionAffinity;

    public Output<String> getSessionAffinity() {
        return this.sessionAffinity == null ? Output.empty() : this.sessionAffinity;
    }

    /**
     * How many seconds to wait for the backend before considering it a
     * failed request. Default is 30 seconds. Valid range is [1, 86400].
     * 
     */
    @Import(name="timeoutSec")
      private final @Nullable Output<Integer> timeoutSec;

    public Output<Integer> getTimeoutSec() {
        return this.timeoutSec == null ? Output.empty() : this.timeoutSec;
    }

    public BackendServiceState(
        @Nullable Output<Integer> affinityCookieTtlSec,
        @Nullable Output<List<BackendServiceBackendGetArgs>> backends,
        @Nullable Output<BackendServiceCdnPolicyGetArgs> cdnPolicy,
        @Nullable Output<BackendServiceCircuitBreakersGetArgs> circuitBreakers,
        @Nullable Output<Integer> connectionDrainingTimeoutSec,
        @Nullable Output<BackendServiceConsistentHashGetArgs> consistentHash,
        @Nullable Output<String> creationTimestamp,
        @Nullable Output<List<String>> customRequestHeaders,
        @Nullable Output<List<String>> customResponseHeaders,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> enableCdn,
        @Nullable Output<String> fingerprint,
        @Nullable Output<String> healthChecks,
        @Nullable Output<BackendServiceIapGetArgs> iap,
        @Nullable Output<String> loadBalancingScheme,
        @Nullable Output<String> localityLbPolicy,
        @Nullable Output<BackendServiceLogConfigGetArgs> logConfig,
        @Nullable Output<String> name,
        @Nullable Output<BackendServiceOutlierDetectionGetArgs> outlierDetection,
        @Nullable Output<String> portName,
        @Nullable Output<String> project,
        @Nullable Output<String> protocol,
        @Nullable Output<String> securityPolicy,
        @Nullable Output<BackendServiceSecuritySettingsGetArgs> securitySettings,
        @Nullable Output<String> selfLink,
        @Nullable Output<String> sessionAffinity,
        @Nullable Output<Integer> timeoutSec) {
        this.affinityCookieTtlSec = affinityCookieTtlSec;
        this.backends = backends;
        this.cdnPolicy = cdnPolicy;
        this.circuitBreakers = circuitBreakers;
        this.connectionDrainingTimeoutSec = connectionDrainingTimeoutSec;
        this.consistentHash = consistentHash;
        this.creationTimestamp = creationTimestamp;
        this.customRequestHeaders = customRequestHeaders;
        this.customResponseHeaders = customResponseHeaders;
        this.description = description;
        this.enableCdn = enableCdn;
        this.fingerprint = fingerprint;
        this.healthChecks = healthChecks;
        this.iap = iap;
        this.loadBalancingScheme = loadBalancingScheme;
        this.localityLbPolicy = localityLbPolicy;
        this.logConfig = logConfig;
        this.name = name;
        this.outlierDetection = outlierDetection;
        this.portName = portName;
        this.project = project;
        this.protocol = protocol;
        this.securityPolicy = securityPolicy;
        this.securitySettings = securitySettings;
        this.selfLink = selfLink;
        this.sessionAffinity = sessionAffinity;
        this.timeoutSec = timeoutSec;
    }

    private BackendServiceState() {
        this.affinityCookieTtlSec = Output.empty();
        this.backends = Output.empty();
        this.cdnPolicy = Output.empty();
        this.circuitBreakers = Output.empty();
        this.connectionDrainingTimeoutSec = Output.empty();
        this.consistentHash = Output.empty();
        this.creationTimestamp = Output.empty();
        this.customRequestHeaders = Output.empty();
        this.customResponseHeaders = Output.empty();
        this.description = Output.empty();
        this.enableCdn = Output.empty();
        this.fingerprint = Output.empty();
        this.healthChecks = Output.empty();
        this.iap = Output.empty();
        this.loadBalancingScheme = Output.empty();
        this.localityLbPolicy = Output.empty();
        this.logConfig = Output.empty();
        this.name = Output.empty();
        this.outlierDetection = Output.empty();
        this.portName = Output.empty();
        this.project = Output.empty();
        this.protocol = Output.empty();
        this.securityPolicy = Output.empty();
        this.securitySettings = Output.empty();
        this.selfLink = Output.empty();
        this.sessionAffinity = Output.empty();
        this.timeoutSec = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendServiceState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> affinityCookieTtlSec;
        private @Nullable Output<List<BackendServiceBackendGetArgs>> backends;
        private @Nullable Output<BackendServiceCdnPolicyGetArgs> cdnPolicy;
        private @Nullable Output<BackendServiceCircuitBreakersGetArgs> circuitBreakers;
        private @Nullable Output<Integer> connectionDrainingTimeoutSec;
        private @Nullable Output<BackendServiceConsistentHashGetArgs> consistentHash;
        private @Nullable Output<String> creationTimestamp;
        private @Nullable Output<List<String>> customRequestHeaders;
        private @Nullable Output<List<String>> customResponseHeaders;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> enableCdn;
        private @Nullable Output<String> fingerprint;
        private @Nullable Output<String> healthChecks;
        private @Nullable Output<BackendServiceIapGetArgs> iap;
        private @Nullable Output<String> loadBalancingScheme;
        private @Nullable Output<String> localityLbPolicy;
        private @Nullable Output<BackendServiceLogConfigGetArgs> logConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<BackendServiceOutlierDetectionGetArgs> outlierDetection;
        private @Nullable Output<String> portName;
        private @Nullable Output<String> project;
        private @Nullable Output<String> protocol;
        private @Nullable Output<String> securityPolicy;
        private @Nullable Output<BackendServiceSecuritySettingsGetArgs> securitySettings;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<String> sessionAffinity;
        private @Nullable Output<Integer> timeoutSec;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendServiceState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affinityCookieTtlSec = defaults.affinityCookieTtlSec;
    	      this.backends = defaults.backends;
    	      this.cdnPolicy = defaults.cdnPolicy;
    	      this.circuitBreakers = defaults.circuitBreakers;
    	      this.connectionDrainingTimeoutSec = defaults.connectionDrainingTimeoutSec;
    	      this.consistentHash = defaults.consistentHash;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.customRequestHeaders = defaults.customRequestHeaders;
    	      this.customResponseHeaders = defaults.customResponseHeaders;
    	      this.description = defaults.description;
    	      this.enableCdn = defaults.enableCdn;
    	      this.fingerprint = defaults.fingerprint;
    	      this.healthChecks = defaults.healthChecks;
    	      this.iap = defaults.iap;
    	      this.loadBalancingScheme = defaults.loadBalancingScheme;
    	      this.localityLbPolicy = defaults.localityLbPolicy;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.outlierDetection = defaults.outlierDetection;
    	      this.portName = defaults.portName;
    	      this.project = defaults.project;
    	      this.protocol = defaults.protocol;
    	      this.securityPolicy = defaults.securityPolicy;
    	      this.securitySettings = defaults.securitySettings;
    	      this.selfLink = defaults.selfLink;
    	      this.sessionAffinity = defaults.sessionAffinity;
    	      this.timeoutSec = defaults.timeoutSec;
        }

        public Builder affinityCookieTtlSec(@Nullable Output<Integer> affinityCookieTtlSec) {
            this.affinityCookieTtlSec = affinityCookieTtlSec;
            return this;
        }
        public Builder affinityCookieTtlSec(@Nullable Integer affinityCookieTtlSec) {
            this.affinityCookieTtlSec = Output.ofNullable(affinityCookieTtlSec);
            return this;
        }
        public Builder backends(@Nullable Output<List<BackendServiceBackendGetArgs>> backends) {
            this.backends = backends;
            return this;
        }
        public Builder backends(@Nullable List<BackendServiceBackendGetArgs> backends) {
            this.backends = Output.ofNullable(backends);
            return this;
        }
        public Builder backends(BackendServiceBackendGetArgs... backends) {
            return backends(List.of(backends));
        }
        public Builder cdnPolicy(@Nullable Output<BackendServiceCdnPolicyGetArgs> cdnPolicy) {
            this.cdnPolicy = cdnPolicy;
            return this;
        }
        public Builder cdnPolicy(@Nullable BackendServiceCdnPolicyGetArgs cdnPolicy) {
            this.cdnPolicy = Output.ofNullable(cdnPolicy);
            return this;
        }
        public Builder circuitBreakers(@Nullable Output<BackendServiceCircuitBreakersGetArgs> circuitBreakers) {
            this.circuitBreakers = circuitBreakers;
            return this;
        }
        public Builder circuitBreakers(@Nullable BackendServiceCircuitBreakersGetArgs circuitBreakers) {
            this.circuitBreakers = Output.ofNullable(circuitBreakers);
            return this;
        }
        public Builder connectionDrainingTimeoutSec(@Nullable Output<Integer> connectionDrainingTimeoutSec) {
            this.connectionDrainingTimeoutSec = connectionDrainingTimeoutSec;
            return this;
        }
        public Builder connectionDrainingTimeoutSec(@Nullable Integer connectionDrainingTimeoutSec) {
            this.connectionDrainingTimeoutSec = Output.ofNullable(connectionDrainingTimeoutSec);
            return this;
        }
        public Builder consistentHash(@Nullable Output<BackendServiceConsistentHashGetArgs> consistentHash) {
            this.consistentHash = consistentHash;
            return this;
        }
        public Builder consistentHash(@Nullable BackendServiceConsistentHashGetArgs consistentHash) {
            this.consistentHash = Output.ofNullable(consistentHash);
            return this;
        }
        public Builder creationTimestamp(@Nullable Output<String> creationTimestamp) {
            this.creationTimestamp = creationTimestamp;
            return this;
        }
        public Builder creationTimestamp(@Nullable String creationTimestamp) {
            this.creationTimestamp = Output.ofNullable(creationTimestamp);
            return this;
        }
        public Builder customRequestHeaders(@Nullable Output<List<String>> customRequestHeaders) {
            this.customRequestHeaders = customRequestHeaders;
            return this;
        }
        public Builder customRequestHeaders(@Nullable List<String> customRequestHeaders) {
            this.customRequestHeaders = Output.ofNullable(customRequestHeaders);
            return this;
        }
        public Builder customRequestHeaders(String... customRequestHeaders) {
            return customRequestHeaders(List.of(customRequestHeaders));
        }
        public Builder customResponseHeaders(@Nullable Output<List<String>> customResponseHeaders) {
            this.customResponseHeaders = customResponseHeaders;
            return this;
        }
        public Builder customResponseHeaders(@Nullable List<String> customResponseHeaders) {
            this.customResponseHeaders = Output.ofNullable(customResponseHeaders);
            return this;
        }
        public Builder customResponseHeaders(String... customResponseHeaders) {
            return customResponseHeaders(List.of(customResponseHeaders));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder enableCdn(@Nullable Output<Boolean> enableCdn) {
            this.enableCdn = enableCdn;
            return this;
        }
        public Builder enableCdn(@Nullable Boolean enableCdn) {
            this.enableCdn = Output.ofNullable(enableCdn);
            return this;
        }
        public Builder fingerprint(@Nullable Output<String> fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public Builder fingerprint(@Nullable String fingerprint) {
            this.fingerprint = Output.ofNullable(fingerprint);
            return this;
        }
        public Builder healthChecks(@Nullable Output<String> healthChecks) {
            this.healthChecks = healthChecks;
            return this;
        }
        public Builder healthChecks(@Nullable String healthChecks) {
            this.healthChecks = Output.ofNullable(healthChecks);
            return this;
        }
        public Builder iap(@Nullable Output<BackendServiceIapGetArgs> iap) {
            this.iap = iap;
            return this;
        }
        public Builder iap(@Nullable BackendServiceIapGetArgs iap) {
            this.iap = Output.ofNullable(iap);
            return this;
        }
        public Builder loadBalancingScheme(@Nullable Output<String> loadBalancingScheme) {
            this.loadBalancingScheme = loadBalancingScheme;
            return this;
        }
        public Builder loadBalancingScheme(@Nullable String loadBalancingScheme) {
            this.loadBalancingScheme = Output.ofNullable(loadBalancingScheme);
            return this;
        }
        public Builder localityLbPolicy(@Nullable Output<String> localityLbPolicy) {
            this.localityLbPolicy = localityLbPolicy;
            return this;
        }
        public Builder localityLbPolicy(@Nullable String localityLbPolicy) {
            this.localityLbPolicy = Output.ofNullable(localityLbPolicy);
            return this;
        }
        public Builder logConfig(@Nullable Output<BackendServiceLogConfigGetArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }
        public Builder logConfig(@Nullable BackendServiceLogConfigGetArgs logConfig) {
            this.logConfig = Output.ofNullable(logConfig);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder outlierDetection(@Nullable Output<BackendServiceOutlierDetectionGetArgs> outlierDetection) {
            this.outlierDetection = outlierDetection;
            return this;
        }
        public Builder outlierDetection(@Nullable BackendServiceOutlierDetectionGetArgs outlierDetection) {
            this.outlierDetection = Output.ofNullable(outlierDetection);
            return this;
        }
        public Builder portName(@Nullable Output<String> portName) {
            this.portName = portName;
            return this;
        }
        public Builder portName(@Nullable String portName) {
            this.portName = Output.ofNullable(portName);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder protocol(@Nullable Output<String> protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = Output.ofNullable(protocol);
            return this;
        }
        public Builder securityPolicy(@Nullable Output<String> securityPolicy) {
            this.securityPolicy = securityPolicy;
            return this;
        }
        public Builder securityPolicy(@Nullable String securityPolicy) {
            this.securityPolicy = Output.ofNullable(securityPolicy);
            return this;
        }
        public Builder securitySettings(@Nullable Output<BackendServiceSecuritySettingsGetArgs> securitySettings) {
            this.securitySettings = securitySettings;
            return this;
        }
        public Builder securitySettings(@Nullable BackendServiceSecuritySettingsGetArgs securitySettings) {
            this.securitySettings = Output.ofNullable(securitySettings);
            return this;
        }
        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }
        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Output.ofNullable(selfLink);
            return this;
        }
        public Builder sessionAffinity(@Nullable Output<String> sessionAffinity) {
            this.sessionAffinity = sessionAffinity;
            return this;
        }
        public Builder sessionAffinity(@Nullable String sessionAffinity) {
            this.sessionAffinity = Output.ofNullable(sessionAffinity);
            return this;
        }
        public Builder timeoutSec(@Nullable Output<Integer> timeoutSec) {
            this.timeoutSec = timeoutSec;
            return this;
        }
        public Builder timeoutSec(@Nullable Integer timeoutSec) {
            this.timeoutSec = Output.ofNullable(timeoutSec);
            return this;
        }        public BackendServiceState build() {
            return new BackendServiceState(affinityCookieTtlSec, backends, cdnPolicy, circuitBreakers, connectionDrainingTimeoutSec, consistentHash, creationTimestamp, customRequestHeaders, customResponseHeaders, description, enableCdn, fingerprint, healthChecks, iap, loadBalancingScheme, localityLbPolicy, logConfig, name, outlierDetection, portName, project, protocol, securityPolicy, securitySettings, selfLink, sessionAffinity, timeoutSec);
        }
    }
}
