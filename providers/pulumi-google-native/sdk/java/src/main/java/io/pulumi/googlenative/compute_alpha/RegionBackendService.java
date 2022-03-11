// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.OutputExport;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.compute_alpha.RegionBackendServiceArgs;
import io.pulumi.googlenative.compute_alpha.outputs.BackendResponse;
import io.pulumi.googlenative.compute_alpha.outputs.BackendServiceCdnPolicyResponse;
import io.pulumi.googlenative.compute_alpha.outputs.BackendServiceConnectionTrackingPolicyResponse;
import io.pulumi.googlenative.compute_alpha.outputs.BackendServiceFailoverPolicyResponse;
import io.pulumi.googlenative.compute_alpha.outputs.BackendServiceIAPResponse;
import io.pulumi.googlenative.compute_alpha.outputs.BackendServiceLogConfigResponse;
import io.pulumi.googlenative.compute_alpha.outputs.CircuitBreakersResponse;
import io.pulumi.googlenative.compute_alpha.outputs.ConnectionDrainingResponse;
import io.pulumi.googlenative.compute_alpha.outputs.ConsistentHashLoadBalancerSettingsResponse;
import io.pulumi.googlenative.compute_alpha.outputs.DurationResponse;
import io.pulumi.googlenative.compute_alpha.outputs.OutlierDetectionResponse;
import io.pulumi.googlenative.compute_alpha.outputs.SecuritySettingsResponse;
import io.pulumi.googlenative.compute_alpha.outputs.SubsettingResponse;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

/**
 * Creates a regional BackendService resource in the specified project using the data included in the request. For more information, see Backend services overview.
 * 
 */
@ResourceType(type="google-native:compute/alpha:RegionBackendService")
public class RegionBackendService extends io.pulumi.resources.CustomResource {
    /**
     * Lifetime of cookies in seconds. This setting is applicable to external and internal HTTP(S) load balancers and Traffic Director and requires GENERATED_COOKIE or HTTP_COOKIE session affinity. If set to 0, the cookie is non-persistent and lasts only until the end of the browser session (or equivalent). The maximum allowed value is one day (86,400). Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @OutputExport(name="affinityCookieTtlSec", type=Integer.class, parameters={})
    private Output<Integer> affinityCookieTtlSec;

    /**
     * @return Lifetime of cookies in seconds. This setting is applicable to external and internal HTTP(S) load balancers and Traffic Director and requires GENERATED_COOKIE or HTTP_COOKIE session affinity. If set to 0, the cookie is non-persistent and lasts only until the end of the browser session (or equivalent). The maximum allowed value is one day (86,400). Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    public Output<Integer> getAffinityCookieTtlSec() {
        return this.affinityCookieTtlSec;
    }
    /**
     * The list of backends that serve this BackendService.
     * 
     */
    @OutputExport(name="backends", type=List.class, parameters={BackendResponse.class})
    private Output<List<BackendResponse>> backends;

    /**
     * @return The list of backends that serve this BackendService.
     * 
     */
    public Output<List<BackendResponse>> getBackends() {
        return this.backends;
    }
    /**
     * Cloud CDN configuration for this BackendService. Only available for specified load balancer types.
     * 
     */
    @OutputExport(name="cdnPolicy", type=BackendServiceCdnPolicyResponse.class, parameters={})
    private Output<BackendServiceCdnPolicyResponse> cdnPolicy;

    /**
     * @return Cloud CDN configuration for this BackendService. Only available for specified load balancer types.
     * 
     */
    public Output<BackendServiceCdnPolicyResponse> getCdnPolicy() {
        return this.cdnPolicy;
    }
    @OutputExport(name="circuitBreakers", type=CircuitBreakersResponse.class, parameters={})
    private Output<CircuitBreakersResponse> circuitBreakers;

    public Output<CircuitBreakersResponse> getCircuitBreakers() {
        return this.circuitBreakers;
    }
    /**
     * Compress text responses using Brotli or gzip compression, based on the client's Accept-Encoding header.
     * 
     */
    @OutputExport(name="compressionMode", type=String.class, parameters={})
    private Output<String> compressionMode;

    /**
     * @return Compress text responses using Brotli or gzip compression, based on the client's Accept-Encoding header.
     * 
     */
    public Output<String> getCompressionMode() {
        return this.compressionMode;
    }
    @OutputExport(name="connectionDraining", type=ConnectionDrainingResponse.class, parameters={})
    private Output<ConnectionDrainingResponse> connectionDraining;

    public Output<ConnectionDrainingResponse> getConnectionDraining() {
        return this.connectionDraining;
    }
    /**
     * Connection Tracking configuration for this BackendService. Connection tracking policy settings are only available for Network Load Balancing and Internal TCP/UDP Load Balancing.
     * 
     */
    @OutputExport(name="connectionTrackingPolicy", type=BackendServiceConnectionTrackingPolicyResponse.class, parameters={})
    private Output<BackendServiceConnectionTrackingPolicyResponse> connectionTrackingPolicy;

    /**
     * @return Connection Tracking configuration for this BackendService. Connection tracking policy settings are only available for Network Load Balancing and Internal TCP/UDP Load Balancing.
     * 
     */
    public Output<BackendServiceConnectionTrackingPolicyResponse> getConnectionTrackingPolicy() {
        return this.connectionTrackingPolicy;
    }
    /**
     * Consistent Hash-based load balancing can be used to provide soft session affinity based on HTTP headers, cookies or other properties. This load balancing policy is applicable only for HTTP connections. The affinity to a particular destination host will be lost when one or more hosts are added/removed from the destination service. This field specifies parameters that control consistent hashing. This field is only applicable when localityLbPolicy is set to MAGLEV or RING_HASH. This field is applicable to either: - A regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @OutputExport(name="consistentHash", type=ConsistentHashLoadBalancerSettingsResponse.class, parameters={})
    private Output<ConsistentHashLoadBalancerSettingsResponse> consistentHash;

    /**
     * @return Consistent Hash-based load balancing can be used to provide soft session affinity based on HTTP headers, cookies or other properties. This load balancing policy is applicable only for HTTP connections. The affinity to a particular destination host will be lost when one or more hosts are added/removed from the destination service. This field specifies parameters that control consistent hashing. This field is only applicable when localityLbPolicy is set to MAGLEV or RING_HASH. This field is applicable to either: - A regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    public Output<ConsistentHashLoadBalancerSettingsResponse> getConsistentHash() {
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
     * Headers that the load balancer adds to proxied requests. See [Creating custom headers](https://cloud.google.com/load-balancing/docs/custom-headers).
     * 
     */
    @OutputExport(name="customRequestHeaders", type=List.class, parameters={String.class})
    private Output<List<String>> customRequestHeaders;

    /**
     * @return Headers that the load balancer adds to proxied requests. See [Creating custom headers](https://cloud.google.com/load-balancing/docs/custom-headers).
     * 
     */
    public Output<List<String>> getCustomRequestHeaders() {
        return this.customRequestHeaders;
    }
    /**
     * Headers that the load balancer adds to proxied responses. See [Creating custom headers](https://cloud.google.com/load-balancing/docs/custom-headers).
     * 
     */
    @OutputExport(name="customResponseHeaders", type=List.class, parameters={String.class})
    private Output<List<String>> customResponseHeaders;

    /**
     * @return Headers that the load balancer adds to proxied responses. See [Creating custom headers](https://cloud.google.com/load-balancing/docs/custom-headers).
     * 
     */
    public Output<List<String>> getCustomResponseHeaders() {
        return this.customResponseHeaders;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @OutputExport(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * The resource URL for the edge security policy associated with this backend service.
     * 
     */
    @OutputExport(name="edgeSecurityPolicy", type=String.class, parameters={})
    private Output<String> edgeSecurityPolicy;

    /**
     * @return The resource URL for the edge security policy associated with this backend service.
     * 
     */
    public Output<String> getEdgeSecurityPolicy() {
        return this.edgeSecurityPolicy;
    }
    /**
     * If true, enables Cloud CDN for the backend service of an external HTTP(S) load balancer.
     * 
     */
    @OutputExport(name="enableCDN", type=Boolean.class, parameters={})
    private Output<Boolean> enableCDN;

    /**
     * @return If true, enables Cloud CDN for the backend service of an external HTTP(S) load balancer.
     * 
     */
    public Output<Boolean> getEnableCDN() {
        return this.enableCDN;
    }
    /**
     * Requires at least one backend instance group to be defined as a backup (failover) backend. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
     * 
     */
    @OutputExport(name="failoverPolicy", type=BackendServiceFailoverPolicyResponse.class, parameters={})
    private Output<BackendServiceFailoverPolicyResponse> failoverPolicy;

    /**
     * @return Requires at least one backend instance group to be defined as a backup (failover) backend. For load balancers that have configurable failover: [Internal TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/internal/failover-overview) and [external TCP/UDP Load Balancing](https://cloud.google.com/load-balancing/docs/network/networklb-failover-overview).
     * 
     */
    public Output<BackendServiceFailoverPolicyResponse> getFailoverPolicy() {
        return this.failoverPolicy;
    }
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a BackendService. An up-to-date fingerprint must be provided in order to update the BackendService, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a BackendService.
     * 
     */
    @OutputExport(name="fingerprint", type=String.class, parameters={})
    private Output<String> fingerprint;

    /**
     * @return Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a BackendService. An up-to-date fingerprint must be provided in order to update the BackendService, otherwise the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve a BackendService.
     * 
     */
    public Output<String> getFingerprint() {
        return this.fingerprint;
    }
    /**
     * The list of URLs to the healthChecks, httpHealthChecks (legacy), or httpsHealthChecks (legacy) resource for health checking this backend service. Not all backend services support legacy health checks. See Load balancer guide. Currently, at most one health check can be specified for each backend service. Backend services with instance group or zonal NEG backends must have a health check. Backend services with internet or serverless NEG backends must not have a health check.
     * 
     */
    @OutputExport(name="healthChecks", type=List.class, parameters={String.class})
    private Output<List<String>> healthChecks;

    /**
     * @return The list of URLs to the healthChecks, httpHealthChecks (legacy), or httpsHealthChecks (legacy) resource for health checking this backend service. Not all backend services support legacy health checks. See Load balancer guide. Currently, at most one health check can be specified for each backend service. Backend services with instance group or zonal NEG backends must have a health check. Backend services with internet or serverless NEG backends must not have a health check.
     * 
     */
    public Output<List<String>> getHealthChecks() {
        return this.healthChecks;
    }
    /**
     * The configurations for Identity-Aware Proxy on this resource. Not available for Internal TCP/UDP Load Balancing and Network Load Balancing.
     * 
     */
    @OutputExport(name="iap", type=BackendServiceIAPResponse.class, parameters={})
    private Output<BackendServiceIAPResponse> iap;

    /**
     * @return The configurations for Identity-Aware Proxy on this resource. Not available for Internal TCP/UDP Load Balancing and Network Load Balancing.
     * 
     */
    public Output<BackendServiceIAPResponse> getIap() {
        return this.iap;
    }
    /**
     * Type of resource. Always compute#backendService for backend services.
     * 
     */
    @OutputExport(name="kind", type=String.class, parameters={})
    private Output<String> kind;

    /**
     * @return Type of resource. Always compute#backendService for backend services.
     * 
     */
    public Output<String> getKind() {
        return this.kind;
    }
    /**
     * Specifies the load balancer type. A backend service created for one type of load balancer cannot be used with another. For more information, refer to Choosing a load balancer.
     * 
     */
    @OutputExport(name="loadBalancingScheme", type=String.class, parameters={})
    private Output<String> loadBalancingScheme;

    /**
     * @return Specifies the load balancer type. A backend service created for one type of load balancer cannot be used with another. For more information, refer to Choosing a load balancer.
     * 
     */
    public Output<String> getLoadBalancingScheme() {
        return this.loadBalancingScheme;
    }
    /**
     * The load balancing algorithm used within the scope of the locality. The possible values are: - ROUND_ROBIN: This is a simple policy in which each healthy backend is selected in round robin order. This is the default. - LEAST_REQUEST: An O(1) algorithm which selects two random healthy hosts and picks the host which has fewer active requests. - RING_HASH: The ring/modulo hash load balancer implements consistent hashing to backends. The algorithm has the property that the addition/removal of a host from a set of N hosts only affects 1/N of the requests. - RANDOM: The load balancer selects a random healthy host. - ORIGINAL_DESTINATION: Backend host is selected based on the client connection metadata, i.e., connections are opened to the same address as the destination address of the incoming connection before the connection was redirected to the load balancer. - MAGLEV: used as a drop in replacement for the ring hash load balancer. Maglev is not as stable as ring hash but has faster table lookup build times and host selection times. For more information about Maglev, see https://ai.google/research/pubs/pub44824 This field is applicable to either: - A regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED. If sessionAffinity is not NONE, and this field is not set to MAGLEV or RING_HASH, session affinity settings will not take effect. Only ROUND_ROBIN and RING_HASH are supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @OutputExport(name="localityLbPolicy", type=String.class, parameters={})
    private Output<String> localityLbPolicy;

    /**
     * @return The load balancing algorithm used within the scope of the locality. The possible values are: - ROUND_ROBIN: This is a simple policy in which each healthy backend is selected in round robin order. This is the default. - LEAST_REQUEST: An O(1) algorithm which selects two random healthy hosts and picks the host which has fewer active requests. - RING_HASH: The ring/modulo hash load balancer implements consistent hashing to backends. The algorithm has the property that the addition/removal of a host from a set of N hosts only affects 1/N of the requests. - RANDOM: The load balancer selects a random healthy host. - ORIGINAL_DESTINATION: Backend host is selected based on the client connection metadata, i.e., connections are opened to the same address as the destination address of the incoming connection before the connection was redirected to the load balancer. - MAGLEV: used as a drop in replacement for the ring hash load balancer. Maglev is not as stable as ring hash but has faster table lookup build times and host selection times. For more information about Maglev, see https://ai.google/research/pubs/pub44824 This field is applicable to either: - A regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED. If sessionAffinity is not NONE, and this field is not set to MAGLEV or RING_HASH, session affinity settings will not take effect. Only ROUND_ROBIN and RING_HASH are supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    public Output<String> getLocalityLbPolicy() {
        return this.localityLbPolicy;
    }
    /**
     * This field denotes the logging options for the load balancer traffic served by this backend service. If logging is enabled, logs will be exported to Stackdriver.
     * 
     */
    @OutputExport(name="logConfig", type=BackendServiceLogConfigResponse.class, parameters={})
    private Output<BackendServiceLogConfigResponse> logConfig;

    /**
     * @return This field denotes the logging options for the load balancer traffic served by this backend service. If logging is enabled, logs will be exported to Stackdriver.
     * 
     */
    public Output<BackendServiceLogConfigResponse> getLogConfig() {
        return this.logConfig;
    }
    /**
     * Specifies the default maximum duration (timeout) for streams to this service. Duration is computed from the beginning of the stream until the response has been completely processed, including all retries. A stream that does not complete in this duration is closed. If not specified, there will be no timeout limit, i.e. the maximum duration is infinite. This value can be overridden in the PathMatcher configuration of the UrlMap that references this backend service. This field is only allowed when the loadBalancingScheme of the backend service is INTERNAL_SELF_MANAGED.
     * 
     */
    @OutputExport(name="maxStreamDuration", type=DurationResponse.class, parameters={})
    private Output<DurationResponse> maxStreamDuration;

    /**
     * @return Specifies the default maximum duration (timeout) for streams to this service. Duration is computed from the beginning of the stream until the response has been completely processed, including all retries. A stream that does not complete in this duration is closed. If not specified, there will be no timeout limit, i.e. the maximum duration is infinite. This value can be overridden in the PathMatcher configuration of the UrlMap that references this backend service. This field is only allowed when the loadBalancingScheme of the backend service is INTERNAL_SELF_MANAGED.
     * 
     */
    public Output<DurationResponse> getMaxStreamDuration() {
        return this.maxStreamDuration;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    @OutputExport(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * The URL of the network to which this backend service belongs. This field can only be specified when the load balancing scheme is set to INTERNAL.
     * 
     */
    @OutputExport(name="network", type=String.class, parameters={})
    private Output<String> network;

    /**
     * @return The URL of the network to which this backend service belongs. This field can only be specified when the load balancing scheme is set to INTERNAL.
     * 
     */
    public Output<String> getNetwork() {
        return this.network;
    }
    /**
     * Settings controlling the eviction of unhealthy hosts from the load balancing pool for the backend service. If not set, this feature is considered disabled. This field is applicable to either: - A regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED. Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    @OutputExport(name="outlierDetection", type=OutlierDetectionResponse.class, parameters={})
    private Output<OutlierDetectionResponse> outlierDetection;

    /**
     * @return Settings controlling the eviction of unhealthy hosts from the load balancing pool for the backend service. If not set, this feature is considered disabled. This field is applicable to either: - A regional backend service with the service_protocol set to HTTP, HTTPS, or HTTP2, and load_balancing_scheme set to INTERNAL_MANAGED. - A global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED. Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true.
     * 
     */
    public Output<OutlierDetectionResponse> getOutlierDetection() {
        return this.outlierDetection;
    }
    /**
     * A named port on a backend instance group representing the port for communication to the backend VMs in that group. The named port must be [defined on each backend instance group](https://cloud.google.com/load-balancing/docs/backend-service#named_ports). This parameter has no meaning if the backends are NEGs. For Internal TCP/UDP Load Balancing and Network Load Balancing, omit port_name.
     * 
     */
    @OutputExport(name="portName", type=String.class, parameters={})
    private Output<String> portName;

    /**
     * @return A named port on a backend instance group representing the port for communication to the backend VMs in that group. The named port must be [defined on each backend instance group](https://cloud.google.com/load-balancing/docs/backend-service#named_ports). This parameter has no meaning if the backends are NEGs. For Internal TCP/UDP Load Balancing and Network Load Balancing, omit port_name.
     * 
     */
    public Output<String> getPortName() {
        return this.portName;
    }
    /**
     * The protocol this BackendService uses to communicate with backends. Possible values are HTTP, HTTPS, HTTP2, TCP, SSL, UDP or GRPC. depending on the chosen load balancer or Traffic Director configuration. Refer to the documentation for the load balancers or for Traffic Director for more information. Must be set to GRPC when the backend service is referenced by a URL map that is bound to target gRPC proxy.
     * 
     */
    @OutputExport(name="protocol", type=String.class, parameters={})
    private Output<String> protocol;

    /**
     * @return The protocol this BackendService uses to communicate with backends. Possible values are HTTP, HTTPS, HTTP2, TCP, SSL, UDP or GRPC. depending on the chosen load balancer or Traffic Director configuration. Refer to the documentation for the load balancers or for Traffic Director for more information. Must be set to GRPC when the backend service is referenced by a URL map that is bound to target gRPC proxy.
     * 
     */
    public Output<String> getProtocol() {
        return this.protocol;
    }
    /**
     * URL of the region where the regional backend service resides. This field is not applicable to global backend services. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    @OutputExport(name="region", type=String.class, parameters={})
    private Output<String> region;

    /**
     * @return URL of the region where the regional backend service resides. This field is not applicable to global backend services. You must specify this field as part of the HTTP request URL. It is not settable as a field in the request body.
     * 
     */
    public Output<String> getRegion() {
        return this.region;
    }
    /**
     * The resource URL for the security policy associated with this backend service.
     * 
     */
    @OutputExport(name="securityPolicy", type=String.class, parameters={})
    private Output<String> securityPolicy;

    /**
     * @return The resource URL for the security policy associated with this backend service.
     * 
     */
    public Output<String> getSecurityPolicy() {
        return this.securityPolicy;
    }
    /**
     * This field specifies the security settings that apply to this backend service. This field is applicable to a global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    @OutputExport(name="securitySettings", type=SecuritySettingsResponse.class, parameters={})
    private Output<SecuritySettingsResponse> securitySettings;

    /**
     * @return This field specifies the security settings that apply to this backend service. This field is applicable to a global backend service with the load_balancing_scheme set to INTERNAL_SELF_MANAGED.
     * 
     */
    public Output<SecuritySettingsResponse> getSecuritySettings() {
        return this.securitySettings;
    }
    /**
     * Server-defined URL for the resource.
     * 
     */
    @OutputExport(name="selfLink", type=String.class, parameters={})
    private Output<String> selfLink;

    /**
     * @return Server-defined URL for the resource.
     * 
     */
    public Output<String> getSelfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    @OutputExport(name="selfLinkWithId", type=String.class, parameters={})
    private Output<String> selfLinkWithId;

    /**
     * @return Server-defined URL for this resource with the resource id.
     * 
     */
    public Output<String> getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * URLs of networkservices.ServiceBinding resources. Can only be set if load balancing scheme is INTERNAL_SELF_MANAGED. If set, lists of backends and health checks must be both empty.
     * 
     */
    @OutputExport(name="serviceBindings", type=List.class, parameters={String.class})
    private Output<List<String>> serviceBindings;

    /**
     * @return URLs of networkservices.ServiceBinding resources. Can only be set if load balancing scheme is INTERNAL_SELF_MANAGED. If set, lists of backends and health checks must be both empty.
     * 
     */
    public Output<List<String>> getServiceBindings() {
        return this.serviceBindings;
    }
    /**
     * URL to networkservices.ServiceLbPolicy resource. Can only be set if load balancing scheme is EXTERNAL, INTERNAL_MANAGED or INTERNAL_SELF_MANAGED. If used with a backend service, must reference a global policy. If used with a regional backend service, must reference a regional policy.
     * 
     */
    @OutputExport(name="serviceLbPolicy", type=String.class, parameters={})
    private Output<String> serviceLbPolicy;

    /**
     * @return URL to networkservices.ServiceLbPolicy resource. Can only be set if load balancing scheme is EXTERNAL, INTERNAL_MANAGED or INTERNAL_SELF_MANAGED. If used with a backend service, must reference a global policy. If used with a regional backend service, must reference a regional policy.
     * 
     */
    public Output<String> getServiceLbPolicy() {
        return this.serviceLbPolicy;
    }
    /**
     * Type of session affinity to use. The default is NONE. Only NONE and HEADER_FIELD are supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true. For more details, see: [Session Affinity](https://cloud.google.com/load-balancing/docs/backend-service#session_affinity).
     * 
     */
    @OutputExport(name="sessionAffinity", type=String.class, parameters={})
    private Output<String> sessionAffinity;

    /**
     * @return Type of session affinity to use. The default is NONE. Only NONE and HEADER_FIELD are supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true. For more details, see: [Session Affinity](https://cloud.google.com/load-balancing/docs/backend-service#session_affinity).
     * 
     */
    public Output<String> getSessionAffinity() {
        return this.sessionAffinity;
    }
    @OutputExport(name="subsetting", type=SubsettingResponse.class, parameters={})
    private Output<SubsettingResponse> subsetting;

    public Output<SubsettingResponse> getSubsetting() {
        return this.subsetting;
    }
    /**
     * Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true. Instead, use maxStreamDuration.
     * 
     */
    @OutputExport(name="timeoutSec", type=Integer.class, parameters={})
    private Output<Integer> timeoutSec;

    /**
     * @return Not supported when the backend service is referenced by a URL map that is bound to target gRPC proxy that has validateForProxyless field set to true. Instead, use maxStreamDuration.
     * 
     */
    public Output<Integer> getTimeoutSec() {
        return this.timeoutSec;
    }

    public interface BuilderApplicator {
        public void apply(RegionBackendServiceArgs.Builder a);
    }
    private static io.pulumi.googlenative.compute_alpha.RegionBackendServiceArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.googlenative.compute_alpha.RegionBackendServiceArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public RegionBackendService(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public RegionBackendService(String name) {
        this(name, RegionBackendServiceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public RegionBackendService(String name, RegionBackendServiceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public RegionBackendService(String name, RegionBackendServiceArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:RegionBackendService", name, args == null ? RegionBackendServiceArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private RegionBackendService(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:compute/alpha:RegionBackendService", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static RegionBackendService get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new RegionBackendService(name, id, options);
    }
}
