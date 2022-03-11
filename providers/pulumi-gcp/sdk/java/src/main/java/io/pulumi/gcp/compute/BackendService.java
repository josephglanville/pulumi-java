// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.gcp.Utilities;
import io.pulumi.gcp.compute.BackendServiceArgs;
import io.pulumi.gcp.compute.inputs.BackendServiceState;
import io.pulumi.gcp.compute.outputs.BackendServiceBackend;
import io.pulumi.gcp.compute.outputs.BackendServiceCdnPolicy;
import io.pulumi.gcp.compute.outputs.BackendServiceCircuitBreakers;
import io.pulumi.gcp.compute.outputs.BackendServiceConsistentHash;
import io.pulumi.gcp.compute.outputs.BackendServiceIap;
import io.pulumi.gcp.compute.outputs.BackendServiceLogConfig;
import io.pulumi.gcp.compute.outputs.BackendServiceOutlierDetection;
import io.pulumi.gcp.compute.outputs.BackendServiceSecuritySettings;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * A Backend Service defines a group of virtual machines that will serve
 * traffic for load balancing. This resource is a global backend service,
 * appropriate for external load balancing or self-managed internal load balancing.
 * For managed internal load balancing, use a regional backend service instead.
 * 
 * Currently self-managed internal load balancing is only available in beta.
 * 
 * To get more information about BackendService, see:
 * 
 * * [API documentation](https://cloud.google.com/compute/docs/reference/v1/backendServices)
 * * How-to Guides
 *     * [Official Documentation](https://cloud.google.com/compute/docs/load-balancing/http/backend-service)
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * BackendService can be imported using any of these accepted formats
 * 
 * ```sh
 *  $ pulumi import gcp:compute/backendService:BackendService default projects/{{project}}/global/backendServices/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/backendService:BackendService default {{project}}/{{name}}
 * ```
 * 
 * ```sh
 *  $ pulumi import gcp:compute/backendService:BackendService default {{name}}
 * ```
 * 
 */
@ResourceType(type="gcp:compute/backendService:BackendService")
public class BackendService extends io.pulumi.resources.CustomResource {
    /**
     * Lifetime of cookies in seconds if session_affinity is
     * GENERATED_COOKIE. If set to 0, the cookie is non-persistent and lasts
     * only until the end of the browser session (or equivalent). The
     * maximum allowed value for TTL is one day.
     * When the load balancing scheme is INTERNAL, this field is not used.
     * 
     */
    @OutputExport(name="affinityCookieTtlSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> affinityCookieTtlSec;

    /**
     * @return Lifetime of cookies in seconds if session_affinity is
     * GENERATED_COOKIE. If set to 0, the cookie is non-persistent and lasts
     * only until the end of the browser session (or equivalent). The
     * maximum allowed value for TTL is one day.
     * When the load balancing scheme is INTERNAL, this field is not used.
     * 
     */
    public Output</* @Nullable */ Integer> getAffinityCookieTtlSec() {
        return this.affinityCookieTtlSec;
    }
    /**
     * The set of backends that serve this BackendService.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="backends", type=List.class, parameters={BackendServiceBackend.class})
    private Output</* @Nullable */ List<BackendServiceBackend>> backends;

    /**
     * @return The set of backends that serve this BackendService.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ List<BackendServiceBackend>> getBackends() {
        return this.backends;
    }
    /**
     * Cloud CDN configuration for this BackendService.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="cdnPolicy", type=BackendServiceCdnPolicy.class, parameters={})
    private Output<BackendServiceCdnPolicy> cdnPolicy;

    /**
     * @return Cloud CDN configuration for this BackendService.
     * Structure is documented below.
     * 
     */
    public Output<BackendServiceCdnPolicy> getCdnPolicy() {
        return this.cdnPolicy;
    }
    /**
     * Settings controlling the volume of connections to a backend service. This field
     * is applicable only when the load_balancing_scheme is set to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="circuitBreakers", type=BackendServiceCircuitBreakers.class, parameters={})
    private Output</* @Nullable */ BackendServiceCircuitBreakers> circuitBreakers;

    /**
     * @return Settings controlling the volume of connections to a backend service. This field
     * is applicable only when the load_balancing_scheme is set to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ BackendServiceCircuitBreakers> getCircuitBreakers() {
        return this.circuitBreakers;
    }
    /**
     * Time for which instance will be drained (not accept new
     * connections, but still work to finish started).
     * 
     */
    @OutputExport(name="connectionDrainingTimeoutSec", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> connectionDrainingTimeoutSec;

    /**
     * @return Time for which instance will be drained (not accept new
     * connections, but still work to finish started).
     * 
     */
    public Output</* @Nullable */ Integer> getConnectionDrainingTimeoutSec() {
        return this.connectionDrainingTimeoutSec;
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
    @OutputExport(name="consistentHash", type=BackendServiceConsistentHash.class, parameters={})
    private Output</* @Nullable */ BackendServiceConsistentHash> consistentHash;

    /**
     * @return Consistent Hash-based load balancing can be used to provide soft session
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
    public Output</* @Nullable */ BackendServiceConsistentHash> getConsistentHash() {
        return this.consistentHash;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    @OutputExport(name="creationTimestamp", type=String.class, parameters={})
    private Output<String> creationTimestamp;

    /**
     * @return Creation timestamp in RFC3339 text format.
     * 
     */
    public Output<String> getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * Headers that the HTTP/S load balancer should add to proxied
     * requests.
     * 
     */
    @OutputExport(name="customRequestHeaders", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> customRequestHeaders;

    /**
     * @return Headers that the HTTP/S load balancer should add to proxied
     * requests.
     * 
     */
    public Output</* @Nullable */ List<String>> getCustomRequestHeaders() {
        return this.customRequestHeaders;
    }
    /**
     * Headers that the HTTP/S load balancer should add to proxied
     * responses.
     * 
     */
    @OutputExport(name="customResponseHeaders", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> customResponseHeaders;

    /**
     * @return Headers that the HTTP/S load balancer should add to proxied
     * responses.
     * 
     */
    public Output</* @Nullable */ List<String>> getCustomResponseHeaders() {
        return this.customResponseHeaders;
    }
    /**
     * An optional description of this resource.
     * Provide this property when you create the resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return An optional description of this resource.
     * Provide this property when you create the resource.
     * 
     */
    public Output</* @Nullable */ String> getDescription() {
        return this.description;
    }
    /**
     * If true, enable Cloud CDN for this BackendService.
     * 
     */
    @OutputExport(name="enableCdn", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableCdn;

    /**
     * @return If true, enable Cloud CDN for this BackendService.
     * 
     */
    public Output</* @Nullable */ Boolean> getEnableCdn() {
        return this.enableCdn;
    }
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking.
     * 
     */
    @OutputExport(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking.
     * 
     */
    public Output<String> getFingerprint() {
        return this.fingerprint;
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
    @OutputExport(name="healthChecks", type=String.class, parameters={})
    private Output</* @Nullable */ String> healthChecks;

    /**
     * @return The set of URLs to the HttpHealthCheck or HttpsHealthCheck resource
     * for health checking this BackendService. Currently at most one health
     * check can be specified.
     * A health check must be specified unless the backend service uses an internet
     * or serverless NEG as a backend.
     * For internal load balancing, a URL to a HealthCheck resource must be specified instead.
     * 
     */
    public Output</* @Nullable */ String> getHealthChecks() {
        return this.healthChecks;
    }
    /**
     * Settings for enabling Cloud Identity Aware Proxy
     * Structure is documented below.
     * 
     */
    @OutputExport(name="iap", type=BackendServiceIap.class, parameters={})
    private Output</* @Nullable */ BackendServiceIap> iap;

    /**
     * @return Settings for enabling Cloud Identity Aware Proxy
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ BackendServiceIap> getIap() {
        return this.iap;
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
    @OutputExport(name="loadBalancingScheme", type=String.class, parameters={})
    private Output</* @Nullable */ String> loadBalancingScheme;

    /**
     * @return Indicates whether the backend service will be used with internal or
     * external load balancing. A backend service created for one type of
     * load balancing cannot be used with the other. For more information, refer to
     * [Choosing a load balancer](https://cloud.google.com/load-balancing/docs/backend-service).
     * Default value is `EXTERNAL`.
     * Possible values are `EXTERNAL`, `INTERNAL_SELF_MANAGED`, and `EXTERNAL_MANAGED`.
     * 
     */
    public Output</* @Nullable */ String> getLoadBalancingScheme() {
        return this.loadBalancingScheme;
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
    @OutputExport(name="localityLbPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> localityLbPolicy;

    /**
     * @return The load balancing algorithm used within the scope of the locality.
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
    public Output</* @Nullable */ String> getLocalityLbPolicy() {
        return this.localityLbPolicy;
    }
    /**
     * This field denotes the logging options for the load balancer traffic served by this backend service.
     * If logging is enabled, logs will be exported to Stackdriver.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="logConfig", type=BackendServiceLogConfig.class, parameters={})
    private Output<BackendServiceLogConfig> logConfig;

    /**
     * @return This field denotes the logging options for the load balancer traffic served by this backend service.
     * If logging is enabled, logs will be exported to Stackdriver.
     * Structure is documented below.
     * 
     */
    public Output<BackendServiceLogConfig> getLogConfig() {
        return this.logConfig;
    }
    /**
     * Name of the cookie.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the cookie.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Settings controlling eviction of unhealthy hosts from the load balancing pool.
     * This field is applicable only when the load_balancing_scheme is set
     * to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="outlierDetection", type=BackendServiceOutlierDetection.class, parameters={})
    private Output</* @Nullable */ BackendServiceOutlierDetection> outlierDetection;

    /**
     * @return Settings controlling eviction of unhealthy hosts from the load balancing pool.
     * This field is applicable only when the load_balancing_scheme is set
     * to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ BackendServiceOutlierDetection> getOutlierDetection() {
        return this.outlierDetection;
    }
    /**
     * Name of backend port. The same name should appear in the instance
     * groups referenced by this service. Required when the load balancing
     * scheme is EXTERNAL.
     * 
     */
    @OutputExport(name="portName", type=String.class, parameters={})
    private Output<String> portName;

    /**
     * @return Name of backend port. The same name should appear in the instance
     * groups referenced by this service. Required when the load balancing
     * scheme is EXTERNAL.
     * 
     */
    public Output<String> getPortName() {
        return this.portName;
    }
    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @OutputExport(name="project", type=String.class, parameters={})
    private Output<String> project;

    /**
     * @return The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    public Output<String> getProject() {
        return this.project;
    }
    /**
     * The protocol this BackendService uses to communicate with backends.
     * The default is HTTP. **NOTE**: HTTP2 is only valid for beta HTTP/2 load balancer
     * types and may result in errors if used with the GA API.
     * Possible values are `HTTP`, `HTTPS`, `HTTP2`, `TCP`, `SSL`, and `GRPC`.
     * 
     */
    @OutputExport(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return The protocol this BackendService uses to communicate with backends.
     * The default is HTTP. **NOTE**: HTTP2 is only valid for beta HTTP/2 load balancer
     * types and may result in errors if used with the GA API.
     * Possible values are `HTTP`, `HTTPS`, `HTTP2`, `TCP`, `SSL`, and `GRPC`.
     * 
     */
    public Output<String> getProtocol() {
        return this.protocol;
    }
    /**
     * The security policy associated with this backend service.
     * 
     */
    @OutputExport(name="securityPolicy", type=String.class, parameters={})
    private Output</* @Nullable */ String> securityPolicy;

    /**
     * @return The security policy associated with this backend service.
     * 
     */
    public Output</* @Nullable */ String> getSecurityPolicy() {
        return this.securityPolicy;
    }
    /**
     * The security settings that apply to this backend service. This field is applicable to either
     * a regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and
     * load_balancing_scheme set to INTERNAL_MANAGED; or a global backend service with the
     * load_balancing_scheme set to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * 
     */
    @OutputExport(name="securitySettings", type=BackendServiceSecuritySettings.class, parameters={})
    private Output</* @Nullable */ BackendServiceSecuritySettings> securitySettings;

    /**
     * @return The security settings that apply to this backend service. This field is applicable to either
     * a regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and
     * load_balancing_scheme set to INTERNAL_MANAGED; or a global backend service with the
     * load_balancing_scheme set to INTERNAL_SELF_MANAGED.
     * Structure is documented below.
     * 
     */
    public Output</* @Nullable */ BackendServiceSecuritySettings> getSecuritySettings() {
        return this.securitySettings;
    }
    /**
     * The URI of the created resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return The URI of the created resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Type of session affinity to use. The default is NONE. Session affinity is
     * not applicable if the protocol is UDP.
     * Possible values are `NONE`, `CLIENT_IP`, `CLIENT_IP_PORT_PROTO`, `CLIENT_IP_PROTO`, `GENERATED_COOKIE`, `HEADER_FIELD`, and `HTTP_COOKIE`.
     * 
     */
    @OutputExport(name="sessionAffinity", type=String.class, parameters={})
    private Output<String> sessionAffinity;

    /**
     * @return Type of session affinity to use. The default is NONE. Session affinity is
     * not applicable if the protocol is UDP.
     * Possible values are `NONE`, `CLIENT_IP`, `CLIENT_IP_PORT_PROTO`, `CLIENT_IP_PROTO`, `GENERATED_COOKIE`, `HEADER_FIELD`, and `HTTP_COOKIE`.
     * 
     */
    public Output<String> getSessionAffinity() {
        return this.sessionAffinity;
    }
    /**
     * How many seconds to wait for the backend before considering it a
     * failed request. Default is 30 seconds. Valid range is [1, 86400].
     * 
     */
    @OutputExport(name="timeoutSec", type=Integer.class, parameters={})
    private Output<Integer> timeoutSec;

    /**
     * @return How many seconds to wait for the backend before considering it a
     * failed request. Default is 30 seconds. Valid range is [1, 86400].
     * 
     */
    public Output<Integer> getTimeoutSec() {
        return this.timeoutSec;
    }

    public interface BuilderApplicator {
        public void apply(@Nullable BackendServiceArgs.Builder a);
    }
    private static io.pulumi.gcp.compute.BackendServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.gcp.compute.BackendServiceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public BackendService(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BackendService(String name) {
        this(name, BackendServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BackendService(String name, @Nullable BackendServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BackendService(String name, @Nullable BackendServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/backendService:BackendService", name, args == null ? BackendServiceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private BackendService(String name, Output<String> id, @Nullable BackendServiceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("gcp:compute/backendService:BackendService", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static BackendService get(String name, Output<String> id, @Nullable BackendServiceState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new BackendService(name, id, state, options);
    }
}
