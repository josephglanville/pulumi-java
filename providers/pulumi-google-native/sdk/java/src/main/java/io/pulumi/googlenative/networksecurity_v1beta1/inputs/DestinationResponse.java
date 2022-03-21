// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.networksecurity_v1beta1.inputs.HttpHeaderMatchResponse;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Specification of traffic destination attributes.
 * 
 */
public final class DestinationResponse extends io.pulumi.resources.InvokeArgs {

    public static final DestinationResponse Empty = new DestinationResponse();

    /**
     * List of host names to match. Matched against the ":authority" header in http requests. At least one host should match. Each host can be an exact match, or a prefix match (example "mydomain.*") or a suffix match (example // *.myorg.com") or a presence(any) match "*".
     * 
     */
    @Import(name="hosts", required=true)
      private final List<String> hosts;

    public List<String> getHosts() {
        return this.hosts;
    }

    /**
     * Optional. Match against key:value pair in http header. Provides a flexible match based on HTTP headers, for potentially advanced use cases. At least one header should match. Avoid using header matches to make authorization decisions unless there is a strong guarantee that requests arrive through a trusted client or proxy.
     * 
     */
    @Import(name="httpHeaderMatch", required=true)
      private final HttpHeaderMatchResponse httpHeaderMatch;

    public HttpHeaderMatchResponse getHttpHeaderMatch() {
        return this.httpHeaderMatch;
    }

    /**
     * Optional. A list of HTTP methods to match. At least one method should match. Should not be set for gRPC services.
     * 
     */
    @Import(name="methods", required=true)
      private final List<String> methods;

    public List<String> getMethods() {
        return this.methods;
    }

    /**
     * List of destination ports to match. At least one port should match.
     * 
     */
    @Import(name="ports", required=true)
      private final List<Integer> ports;

    public List<Integer> getPorts() {
        return this.ports;
    }

    public DestinationResponse(
        List<String> hosts,
        HttpHeaderMatchResponse httpHeaderMatch,
        List<String> methods,
        List<Integer> ports) {
        this.hosts = Objects.requireNonNull(hosts, "expected parameter 'hosts' to be non-null");
        this.httpHeaderMatch = Objects.requireNonNull(httpHeaderMatch, "expected parameter 'httpHeaderMatch' to be non-null");
        this.methods = Objects.requireNonNull(methods, "expected parameter 'methods' to be non-null");
        this.ports = Objects.requireNonNull(ports, "expected parameter 'ports' to be non-null");
    }

    private DestinationResponse() {
        this.hosts = List.of();
        this.httpHeaderMatch = null;
        this.methods = List.of();
        this.ports = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> hosts;
        private HttpHeaderMatchResponse httpHeaderMatch;
        private List<String> methods;
        private List<Integer> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hosts = defaults.hosts;
    	      this.httpHeaderMatch = defaults.httpHeaderMatch;
    	      this.methods = defaults.methods;
    	      this.ports = defaults.ports;
        }

        public Builder hosts(List<String> hosts) {
            this.hosts = Objects.requireNonNull(hosts);
            return this;
        }
        public Builder hosts(String... hosts) {
            return hosts(List.of(hosts));
        }
        public Builder httpHeaderMatch(HttpHeaderMatchResponse httpHeaderMatch) {
            this.httpHeaderMatch = Objects.requireNonNull(httpHeaderMatch);
            return this;
        }
        public Builder methods(List<String> methods) {
            this.methods = Objects.requireNonNull(methods);
            return this;
        }
        public Builder methods(String... methods) {
            return methods(List.of(methods));
        }
        public Builder ports(List<Integer> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }
        public Builder ports(Integer... ports) {
            return ports(List.of(ports));
        }        public DestinationResponse build() {
            return new DestinationResponse(hosts, httpHeaderMatch, methods, ports);
        }
    }
}
