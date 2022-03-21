// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetHttpHealthCheckResult {
    /**
     * How often (in seconds) to send a health check. The default value is 5 seconds.
     * 
     */
    private final Integer checkIntervalSec;
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
     * A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
     * 
     */
    private final Integer healthyThreshold;
    /**
     * The value of the host header in the HTTP health check request. If left empty (default value), the public IP on behalf of which this health check is performed will be used.
     * 
     */
    private final String host;
    /**
     * Type of the resource. Always compute#httpHealthCheck for HTTP health checks.
     * 
     */
    private final String kind;
    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. Specifically, the name must be 1-63 characters long and match the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and all following characters must be a dash, lowercase letter, or digit, except the last character, which cannot be a dash.
     * 
     */
    private final String name;
    /**
     * The TCP port number for the HTTP health check request. The default value is 80.
     * 
     */
    private final Integer port;
    /**
     * The request path of the HTTP health check request. The default value is /. This field does not support query parameters.
     * 
     */
    private final String requestPath;
    /**
     * Server-defined URL for the resource.
     * 
     */
    private final String selfLink;
    /**
     * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
     * 
     */
    private final Integer timeoutSec;
    /**
     * A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
     * 
     */
    private final Integer unhealthyThreshold;

    @CustomType.Constructor
    private GetHttpHealthCheckResult(
        @CustomType.Parameter("checkIntervalSec") Integer checkIntervalSec,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("healthyThreshold") Integer healthyThreshold,
        @CustomType.Parameter("host") String host,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("port") Integer port,
        @CustomType.Parameter("requestPath") String requestPath,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("timeoutSec") Integer timeoutSec,
        @CustomType.Parameter("unhealthyThreshold") Integer unhealthyThreshold) {
        this.checkIntervalSec = checkIntervalSec;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.healthyThreshold = healthyThreshold;
        this.host = host;
        this.kind = kind;
        this.name = name;
        this.port = port;
        this.requestPath = requestPath;
        this.selfLink = selfLink;
        this.timeoutSec = timeoutSec;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    /**
     * How often (in seconds) to send a health check. The default value is 5 seconds.
     * 
    */
    public Integer getCheckIntervalSec() {
        return this.checkIntervalSec;
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
     * A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
     * 
    */
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }
    /**
     * The value of the host header in the HTTP health check request. If left empty (default value), the public IP on behalf of which this health check is performed will be used.
     * 
    */
    public String getHost() {
        return this.host;
    }
    /**
     * Type of the resource. Always compute#httpHealthCheck for HTTP health checks.
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
     * The TCP port number for the HTTP health check request. The default value is 80.
     * 
    */
    public Integer getPort() {
        return this.port;
    }
    /**
     * The request path of the HTTP health check request. The default value is /. This field does not support query parameters.
     * 
    */
    public String getRequestPath() {
        return this.requestPath;
    }
    /**
     * Server-defined URL for the resource.
     * 
    */
    public String getSelfLink() {
        return this.selfLink;
    }
    /**
     * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
     * 
    */
    public Integer getTimeoutSec() {
        return this.timeoutSec;
    }
    /**
     * A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
     * 
    */
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHttpHealthCheckResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer checkIntervalSec;
        private String creationTimestamp;
        private String description;
        private Integer healthyThreshold;
        private String host;
        private String kind;
        private String name;
        private Integer port;
        private String requestPath;
        private String selfLink;
        private Integer timeoutSec;
        private Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHttpHealthCheckResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkIntervalSec = defaults.checkIntervalSec;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.host = defaults.host;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.requestPath = defaults.requestPath;
    	      this.selfLink = defaults.selfLink;
    	      this.timeoutSec = defaults.timeoutSec;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder checkIntervalSec(Integer checkIntervalSec) {
            this.checkIntervalSec = Objects.requireNonNull(checkIntervalSec);
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
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
            return this;
        }
        public Builder host(String host) {
            this.host = Objects.requireNonNull(host);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public Builder requestPath(String requestPath) {
            this.requestPath = Objects.requireNonNull(requestPath);
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder timeoutSec(Integer timeoutSec) {
            this.timeoutSec = Objects.requireNonNull(timeoutSec);
            return this;
        }
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
            return this;
        }        public GetHttpHealthCheckResult build() {
            return new GetHttpHealthCheckResult(checkIntervalSec, creationTimestamp, description, healthyThreshold, host, kind, name, port, requestPath, selfLink, timeoutSec, unhealthyThreshold);
        }
    }
}
