// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.networksecurity_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.networksecurity_v1.inputs.HttpHeaderMatchArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specification of traffic destination attributes.
 * 
 */
public final class DestinationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DestinationArgs Empty = new DestinationArgs();

    /**
     * List of host names to match. Matched against the ":authority" header in http requests. At least one host should match. Each host can be an exact match, or a prefix match (example "mydomain.*") or a suffix match (example // *.myorg.com") or a presence(any) match "*".
     * 
     */
    @Import(name="hosts", required=true)
      private final Output<List<String>> hosts;

    public Output<List<String>> getHosts() {
        return this.hosts;
    }

    /**
     * Optional. Match against key:value pair in http header. Provides a flexible match based on HTTP headers, for potentially advanced use cases. At least one header should match. Avoid using header matches to make authorization decisions unless there is a strong guarantee that requests arrive through a trusted client or proxy.
     * 
     */
    @Import(name="httpHeaderMatch")
      private final @Nullable Output<HttpHeaderMatchArgs> httpHeaderMatch;

    public Output<HttpHeaderMatchArgs> getHttpHeaderMatch() {
        return this.httpHeaderMatch == null ? Codegen.empty() : this.httpHeaderMatch;
    }

    /**
     * Optional. A list of HTTP methods to match. At least one method should match. Should not be set for gRPC services.
     * 
     */
    @Import(name="methods")
      private final @Nullable Output<List<String>> methods;

    public Output<List<String>> getMethods() {
        return this.methods == null ? Codegen.empty() : this.methods;
    }

    /**
     * List of destination ports to match. At least one port should match.
     * 
     */
    @Import(name="ports", required=true)
      private final Output<List<Integer>> ports;

    public Output<List<Integer>> getPorts() {
        return this.ports;
    }

    public DestinationArgs(
        Output<List<String>> hosts,
        @Nullable Output<HttpHeaderMatchArgs> httpHeaderMatch,
        @Nullable Output<List<String>> methods,
        Output<List<Integer>> ports) {
        this.hosts = Objects.requireNonNull(hosts, "expected parameter 'hosts' to be non-null");
        this.httpHeaderMatch = httpHeaderMatch;
        this.methods = methods;
        this.ports = Objects.requireNonNull(ports, "expected parameter 'ports' to be non-null");
    }

    private DestinationArgs() {
        this.hosts = Codegen.empty();
        this.httpHeaderMatch = Codegen.empty();
        this.methods = Codegen.empty();
        this.ports = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> hosts;
        private @Nullable Output<HttpHeaderMatchArgs> httpHeaderMatch;
        private @Nullable Output<List<String>> methods;
        private Output<List<Integer>> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(DestinationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hosts = defaults.hosts;
    	      this.httpHeaderMatch = defaults.httpHeaderMatch;
    	      this.methods = defaults.methods;
    	      this.ports = defaults.ports;
        }

        public Builder hosts(Output<List<String>> hosts) {
            this.hosts = Objects.requireNonNull(hosts);
            return this;
        }
        public Builder hosts(List<String> hosts) {
            this.hosts = Output.of(Objects.requireNonNull(hosts));
            return this;
        }
        public Builder hosts(String... hosts) {
            return hosts(List.of(hosts));
        }
        public Builder httpHeaderMatch(@Nullable Output<HttpHeaderMatchArgs> httpHeaderMatch) {
            this.httpHeaderMatch = httpHeaderMatch;
            return this;
        }
        public Builder httpHeaderMatch(@Nullable HttpHeaderMatchArgs httpHeaderMatch) {
            this.httpHeaderMatch = Codegen.ofNullable(httpHeaderMatch);
            return this;
        }
        public Builder methods(@Nullable Output<List<String>> methods) {
            this.methods = methods;
            return this;
        }
        public Builder methods(@Nullable List<String> methods) {
            this.methods = Codegen.ofNullable(methods);
            return this;
        }
        public Builder methods(String... methods) {
            return methods(List.of(methods));
        }
        public Builder ports(Output<List<Integer>> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }
        public Builder ports(List<Integer> ports) {
            this.ports = Output.of(Objects.requireNonNull(ports));
            return this;
        }
        public Builder ports(Integer... ports) {
            return ports(List.of(ports));
        }        public DestinationArgs build() {
            return new DestinationArgs(hosts, httpHeaderMatch, methods, ports);
        }
    }
}
