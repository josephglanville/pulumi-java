// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabricmesh.inputs;

import io.pulumi.azurenative.servicefabricmesh.inputs.HttpHostConfigResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Describes the http configuration for external connectivity for this network.
 * 
 */
public final class HttpConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final HttpConfigResponse Empty = new HttpConfigResponse();

    /**
     * description for routing.
     * 
     */
    @InputImport(name="hosts", required=true)
      private final List<HttpHostConfigResponse> hosts;

    public List<HttpHostConfigResponse> getHosts() {
        return this.hosts;
    }

    /**
     * http gateway config name.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Specifies the port at which the service endpoint below needs to be exposed.
     * 
     */
    @InputImport(name="port", required=true)
      private final Integer port;

    public Integer getPort() {
        return this.port;
    }

    public HttpConfigResponse(
        List<HttpHostConfigResponse> hosts,
        String name,
        Integer port) {
        this.hosts = Objects.requireNonNull(hosts, "expected parameter 'hosts' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.port = Objects.requireNonNull(port, "expected parameter 'port' to be non-null");
    }

    private HttpConfigResponse() {
        this.hosts = List.of();
        this.name = null;
        this.port = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<HttpHostConfigResponse> hosts;
        private String name;
        private Integer port;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hosts = defaults.hosts;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
        }

        public Builder setHosts(List<HttpHostConfigResponse> hosts) {
            this.hosts = Objects.requireNonNull(hosts);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPort(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public HttpConfigResponse build() {
            return new HttpConfigResponse(hosts, name, port);
        }
    }
}
