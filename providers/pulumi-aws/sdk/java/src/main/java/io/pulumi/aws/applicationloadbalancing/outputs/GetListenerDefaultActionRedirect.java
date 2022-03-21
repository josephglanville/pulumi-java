// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.applicationloadbalancing.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetListenerDefaultActionRedirect {
    private final String host;
    private final String path;
    /**
     * Port of the listener. Required if `arn` is not set.
     * 
     */
    private final String port;
    private final String protocol;
    private final String query;
    private final String statusCode;

    @CustomType.Constructor
    private GetListenerDefaultActionRedirect(
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("path") String path,
        @CustomType.Parameter("port") String port,
        @CustomType.Parameter("protocol") String protocol,
        @CustomType.Parameter("query") String query,
        @CustomType.Parameter("statusCode") String statusCode) {
        this.host = host;
        this.path = path;
        this.port = port;
        this.protocol = protocol;
        this.query = query;
        this.statusCode = statusCode;
    }

    public String getHost() {
        return this.host;
    }
    public String getPath() {
        return this.path;
    }
    /**
     * Port of the listener. Required if `arn` is not set.
     * 
    */
    public String getPort() {
        return this.port;
    }
    public String getProtocol() {
        return this.protocol;
    }
    public String getQuery() {
        return this.query;
    }
    public String getStatusCode() {
        return this.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetListenerDefaultActionRedirect defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String host;
        private String path;
        private String port;
        private String protocol;
        private String query;
        private String statusCode;

        public Builder() {
    	      // Empty
        }

        public Builder(GetListenerDefaultActionRedirect defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.host = defaults.host;
    	      this.path = defaults.path;
    	      this.port = defaults.port;
    	      this.protocol = defaults.protocol;
    	      this.query = defaults.query;
    	      this.statusCode = defaults.statusCode;
        }

        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder path(String path) {
            this.path = Objects.requireNonNull(path);
            return this;
        }
        public Builder port(String port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        public Builder query(String query) {
            this.query = Objects.requireNonNull(query);
            return this;
        }
        public Builder statusCode(String statusCode) {
            this.statusCode = Objects.requireNonNull(statusCode);
            return this;
        }        public GetListenerDefaultActionRedirect build() {
            return new GetListenerDefaultActionRedirect(host, path, port, protocol, query, statusCode);
        }
    }
}
