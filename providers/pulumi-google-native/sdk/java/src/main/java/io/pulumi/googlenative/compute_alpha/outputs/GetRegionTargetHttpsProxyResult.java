// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetRegionTargetHttpsProxyResult {
    /**
     * Optional. A URL referring to a networksecurity.AuthorizationPolicy resource that describes how the proxy should authorize inbound traffic. If left blank, access will not be restricted by an authorization policy. Refer to the AuthorizationPolicy resource for additional details. authorizationPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED. Note: This field currently has no impact.
     * 
     */
    private final String authorizationPolicy;
    /**
     * URL of a certificate map that identifies a certificate map associated with the given target proxy. This field can only be set for global target proxies. If set, sslCertificates will be ignored.
     * 
     */
    private final String certificateMap;
    /**
     * Creation timestamp in RFC3339 text format.
     * 
     */
    private final String creationTimestamp;
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    private final String description;
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a TargetHttpsProxy. An up-to-date fingerprint must be provided in order to patch the TargetHttpsProxy; otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the TargetHttpsProxy.
     * 
     */
    private final String fingerprint;
    /**
     * URLs to networkservices.HttpFilter resources enabled for xDS clients using this configuration. For example, https://networkservices.googleapis.com/beta/projects/project/locations/ locationhttpFilters/httpFilter Only filters that handle outbound connection and stream events may be specified. These filters work in conjunction with a default set of HTTP filters that may already be configured by Traffic Director. Traffic Director will determine the final location of these filters within xDS configuration based on the name of the HTTP filter. If Traffic Director positions multiple filters at the same location, those filters will be in the same order as specified in this list. httpFilters only applies for loadbalancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details.
     * 
     */
    private final List<String> httpFilters;
    /**
     * Type of resource. Always compute#targetHttpsProxy for target HTTPS proxies.
     * 
     */
    private final String kind;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * This field only applies when the forwarding rule that references this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED. When this field is set to true, Envoy proxies set up inbound traffic interception and bind to the IP address and port specified in the forwarding rule. This is generally useful when using Traffic Director to configure Envoy as a gateway or middle proxy (in other words, not a sidecar proxy). The Envoy proxy listens for inbound requests and handles requests when it receives them. The default is false.
     * 
     */
    private final Boolean proxyBind;
    /**
     * Specifies the QUIC override policy for this TargetHttpsProxy resource. This setting determines whether the load balancer attempts to negotiate QUIC with clients. You can specify NONE, ENABLE, or DISABLE. - When quic-override is set to NONE, Google manages whether QUIC is used. - When quic-override is set to ENABLE, the load balancer uses QUIC when possible. - When quic-override is set to DISABLE, the load balancer doesn't use QUIC. - If the quic-override flag is not specified, NONE is implied.
     * 
     */
    private final String quicOverride;
    /**
     * URL of the region where the regional TargetHttpsProxy resides. This field is not applicable to global TargetHttpsProxies.
     * 
     */
    private final String region;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * Server-defined URL for this resource with the resource id.
     * 
     */
    private final String selfLinkWithId;
    /**
     * Optional. A URL referring to a networksecurity.ServerTlsPolicy resource that describes how the proxy should authenticate inbound traffic. serverTlsPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED. If left blank, communications are not encrypted. Note: This field currently has no impact.
     * 
     */
    private final String serverTlsPolicy;
    /**
     * URLs to SslCertificate resources that are used to authenticate connections between users and the load balancer. At least one SSL certificate must be specified. Currently, you may specify up to 15 SSL certificates. sslCertificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED.
     * 
     */
    private final List<String> sslCertificates;
    /**
     * URL of SslPolicy resource that will be associated with the TargetHttpsProxy resource. If not set, the TargetHttpsProxy resource has no SSL policy configured.
     * 
     */
    private final String sslPolicy;
    /**
     * A fully-qualified or valid partial URL to the UrlMap resource that defines the mapping from URL to the BackendService. For example, the following are all valid URLs for specifying a URL map: - https://www.googleapis.compute/v1/projects/project/global/urlMaps/ url-map - projects/project/global/urlMaps/url-map - global/urlMaps/url-map
     * 
     */
    private final String urlMap;

    @CustomType.Constructor
    private GetRegionTargetHttpsProxyResult(
        @CustomType.Parameter("authorizationPolicy") String authorizationPolicy,
        @CustomType.Parameter("certificateMap") String certificateMap,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("fingerprint") String fingerprint,
        @CustomType.Parameter("httpFilters") List<String> httpFilters,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("proxyBind") Boolean proxyBind,
        @CustomType.Parameter("quicOverride") String quicOverride,
        @CustomType.Parameter("region") String region,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("selfLinkWithId") String selfLinkWithId,
        @CustomType.Parameter("serverTlsPolicy") String serverTlsPolicy,
        @CustomType.Parameter("sslCertificates") List<String> sslCertificates,
        @CustomType.Parameter("sslPolicy") String sslPolicy,
        @CustomType.Parameter("urlMap") String urlMap) {
        this.authorizationPolicy = authorizationPolicy;
        this.certificateMap = certificateMap;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.fingerprint = fingerprint;
        this.httpFilters = httpFilters;
        this.kind = kind;
        this.name = name;
        this.proxyBind = proxyBind;
        this.quicOverride = quicOverride;
        this.region = region;
        this.selfLink = selfLink;
        this.selfLinkWithId = selfLinkWithId;
        this.serverTlsPolicy = serverTlsPolicy;
        this.sslCertificates = sslCertificates;
        this.sslPolicy = sslPolicy;
        this.urlMap = urlMap;
    }

    /**
     * Optional. A URL referring to a networksecurity.AuthorizationPolicy resource that describes how the proxy should authorize inbound traffic. If left blank, access will not be restricted by an authorization policy. Refer to the AuthorizationPolicy resource for additional details. authorizationPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED. Note: This field currently has no impact.
     * 
    */
    public String getAuthorizationPolicy() {
        return this.authorizationPolicy;
    }
    /**
     * URL of a certificate map that identifies a certificate map associated with the given target proxy. This field can only be set for global target proxies. If set, sslCertificates will be ignored.
     * 
    */
    public String getCertificateMap() {
        return this.certificateMap;
    }
    /**
     * Creation timestamp in RFC3339 text format.
     * 
    */
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
    */
    public String getDescription() {
        return this.description;
    }
    /**
     * Fingerprint of this resource. A hash of the contents stored in this object. This field is used in optimistic locking. This field will be ignored when inserting a TargetHttpsProxy. An up-to-date fingerprint must be provided in order to patch the TargetHttpsProxy; otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint, make a get() request to retrieve the TargetHttpsProxy.
     * 
    */
    public String getFingerprint() {
        return this.fingerprint;
    }
    /**
     * URLs to networkservices.HttpFilter resources enabled for xDS clients using this configuration. For example, https://networkservices.googleapis.com/beta/projects/project/locations/ locationhttpFilters/httpFilter Only filters that handle outbound connection and stream events may be specified. These filters work in conjunction with a default set of HTTP filters that may already be configured by Traffic Director. Traffic Director will determine the final location of these filters within xDS configuration based on the name of the HTTP filter. If Traffic Director positions multiple filters at the same location, those filters will be in the same order as specified in this list. httpFilters only applies for loadbalancers with loadBalancingScheme set to INTERNAL_SELF_MANAGED. See ForwardingRule for more details.
     * 
    */
    public List<String> getHttpFilters() {
        return this.httpFilters;
    }
    /**
     * Type of resource. Always compute#targetHttpsProxy for target HTTPS proxies.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * This field only applies when the forwarding rule that references this target proxy has a loadBalancingScheme set to INTERNAL_SELF_MANAGED. When this field is set to true, Envoy proxies set up inbound traffic interception and bind to the IP address and port specified in the forwarding rule. This is generally useful when using Traffic Director to configure Envoy as a gateway or middle proxy (in other words, not a sidecar proxy). The Envoy proxy listens for inbound requests and handles requests when it receives them. The default is false.
     * 
    */
    public Boolean getProxyBind() {
        return this.proxyBind;
    }
    /**
     * Specifies the QUIC override policy for this TargetHttpsProxy resource. This setting determines whether the load balancer attempts to negotiate QUIC with clients. You can specify NONE, ENABLE, or DISABLE. - When quic-override is set to NONE, Google manages whether QUIC is used. - When quic-override is set to ENABLE, the load balancer uses QUIC when possible. - When quic-override is set to DISABLE, the load balancer doesn't use QUIC. - If the quic-override flag is not specified, NONE is implied.
     * 
    */
    public String getQuicOverride() {
        return this.quicOverride;
    }
    /**
     * URL of the region where the regional TargetHttpsProxy resides. This field is not applicable to global TargetHttpsProxies.
     * 
    */
    public String getRegion() {
        return this.region;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * Server-defined URL for this resource with the resource id.
     * 
    */
    public String getSelfLinkWithId() {
        return this.selfLinkWithId;
    }
    /**
     * Optional. A URL referring to a networksecurity.ServerTlsPolicy resource that describes how the proxy should authenticate inbound traffic. serverTlsPolicy only applies to a global TargetHttpsProxy attached to globalForwardingRules with the loadBalancingScheme set to INTERNAL_SELF_MANAGED. If left blank, communications are not encrypted. Note: This field currently has no impact.
     * 
    */
    public String getServerTlsPolicy() {
        return this.serverTlsPolicy;
    }
    /**
     * URLs to SslCertificate resources that are used to authenticate connections between users and the load balancer. At least one SSL certificate must be specified. Currently, you may specify up to 15 SSL certificates. sslCertificates do not apply when the load balancing scheme is set to INTERNAL_SELF_MANAGED.
     * 
    */
    public List<String> getSslCertificates() {
        return this.sslCertificates;
    }
    /**
     * URL of SslPolicy resource that will be associated with the TargetHttpsProxy resource. If not set, the TargetHttpsProxy resource has no SSL policy configured.
     * 
    */
    public String getSslPolicy() {
        return this.sslPolicy;
    }
    /**
     * A fully-qualified or valid partial URL to the UrlMap resource that defines the mapping from URL to the BackendService. For example, the following are all valid URLs for specifying a URL map: - https://www.googleapis.compute/v1/projects/project/global/urlMaps/ url-map - projects/project/global/urlMaps/url-map - global/urlMaps/url-map
     * 
    */
    public String getUrlMap() {
        return this.urlMap;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionTargetHttpsProxyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String authorizationPolicy;
        private String certificateMap;
        private String creationTimestamp;
        private String description;
        private String fingerprint;
        private List<String> httpFilters;
        private String kind;
        private String name;
        private Boolean proxyBind;
        private String quicOverride;
        private String region;
        private String selfLink;
        private String selfLinkWithId;
        private String serverTlsPolicy;
        private List<String> sslCertificates;
        private String sslPolicy;
        private String urlMap;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionTargetHttpsProxyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizationPolicy = defaults.authorizationPolicy;
    	      this.certificateMap = defaults.certificateMap;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.fingerprint = defaults.fingerprint;
    	      this.httpFilters = defaults.httpFilters;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.proxyBind = defaults.proxyBind;
    	      this.quicOverride = defaults.quicOverride;
    	      this.region = defaults.region;
    	      this.selfLink = defaults.selfLink;
    	      this.selfLinkWithId = defaults.selfLinkWithId;
    	      this.serverTlsPolicy = defaults.serverTlsPolicy;
    	      this.sslCertificates = defaults.sslCertificates;
    	      this.sslPolicy = defaults.sslPolicy;
    	      this.urlMap = defaults.urlMap;
        }

        public Builder authorizationPolicy(String authorizationPolicy) {
            this.authorizationPolicy = Objects.requireNonNull(authorizationPolicy);
            return this;
        }
        public Builder certificateMap(String certificateMap) {
            this.certificateMap = Objects.requireNonNull(certificateMap);
            return this;
        }
        public Builder creationTimestamp(String creationTimestamp) {
            this.creationTimestamp = Objects.requireNonNull(creationTimestamp);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder fingerprint(String fingerprint) {
            this.fingerprint = Objects.requireNonNull(fingerprint);
            return this;
        }
        public Builder httpFilters(List<String> httpFilters) {
            this.httpFilters = Objects.requireNonNull(httpFilters);
            return this;
        }
        public Builder httpFilters(String... httpFilters) {
            return httpFilters(List.of(httpFilters));
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder proxyBind(Boolean proxyBind) {
            this.proxyBind = Objects.requireNonNull(proxyBind);
            return this;
        }
        public Builder quicOverride(String quicOverride) {
            this.quicOverride = Objects.requireNonNull(quicOverride);
            return this;
        }
        public Builder region(String region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder selfLinkWithId(String selfLinkWithId) {
            this.selfLinkWithId = Objects.requireNonNull(selfLinkWithId);
            return this;
        }
        public Builder serverTlsPolicy(String serverTlsPolicy) {
            this.serverTlsPolicy = Objects.requireNonNull(serverTlsPolicy);
            return this;
        }
        public Builder sslCertificates(List<String> sslCertificates) {
            this.sslCertificates = Objects.requireNonNull(sslCertificates);
            return this;
        }
        public Builder sslCertificates(String... sslCertificates) {
            return sslCertificates(List.of(sslCertificates));
        }
        public Builder sslPolicy(String sslPolicy) {
            this.sslPolicy = Objects.requireNonNull(sslPolicy);
            return this;
        }
        public Builder urlMap(String urlMap) {
            this.urlMap = Objects.requireNonNull(urlMap);
            return this;
        }        public GetRegionTargetHttpsProxyResult build() {
            return new GetRegionTargetHttpsProxyResult(authorizationPolicy, certificateMap, creationTimestamp, description, fingerprint, httpFilters, kind, name, proxyBind, quicOverride, region, selfLink, selfLinkWithId, serverTlsPolicy, sslCertificates, sslPolicy, urlMap);
        }
    }
}
