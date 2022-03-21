// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HttpHealthCheckState extends io.pulumi.resources.ResourceArgs {

    public static final HttpHealthCheckState Empty = new HttpHealthCheckState();

    /**
     * How often (in seconds) to send a health check. The default value is 5
     * seconds.
     * 
     */
    @Import(name="checkIntervalSec")
      private final @Nullable Output<Integer> checkIntervalSec;

    public Output<Integer> getCheckIntervalSec() {
        return this.checkIntervalSec == null ? Output.empty() : this.checkIntervalSec;
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
     * An optional description of this resource. Provide this property when
     * you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * A so-far unhealthy instance will be marked healthy after this many
     * consecutive successes. The default value is 2.
     * 
     */
    @Import(name="healthyThreshold")
      private final @Nullable Output<Integer> healthyThreshold;

    public Output<Integer> getHealthyThreshold() {
        return this.healthyThreshold == null ? Output.empty() : this.healthyThreshold;
    }

    /**
     * The value of the host header in the HTTP health check request. If
     * left empty (default value), the public IP on behalf of which this
     * health check is performed will be used.
     * 
     */
    @Import(name="host")
      private final @Nullable Output<String> host;

    public Output<String> getHost() {
        return this.host == null ? Output.empty() : this.host;
    }

    /**
     * Name of the resource. Provided by the client when the resource is
     * created. The name must be 1-63 characters long, and comply with
     * RFC1035.  Specifically, the name must be 1-63 characters long and
     * match the regular expression `a-z?` which means
     * the first character must be a lowercase letter, and all following
     * characters must be a dash, lowercase letter, or digit, except the
     * last character, which cannot be a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The TCP port number for the HTTP health check request.
     * The default value is 80.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Output.empty() : this.port;
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
     * The request path of the HTTP health check request.
     * The default value is /.
     * 
     */
    @Import(name="requestPath")
      private final @Nullable Output<String> requestPath;

    public Output<String> getRequestPath() {
        return this.requestPath == null ? Output.empty() : this.requestPath;
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
     * How long (in seconds) to wait before claiming failure.
     * The default value is 5 seconds.  It is invalid for timeoutSec to have
     * greater value than checkIntervalSec.
     * 
     */
    @Import(name="timeoutSec")
      private final @Nullable Output<Integer> timeoutSec;

    public Output<Integer> getTimeoutSec() {
        return this.timeoutSec == null ? Output.empty() : this.timeoutSec;
    }

    /**
     * A so-far healthy instance will be marked unhealthy after this many
     * consecutive failures. The default value is 2.
     * 
     */
    @Import(name="unhealthyThreshold")
      private final @Nullable Output<Integer> unhealthyThreshold;

    public Output<Integer> getUnhealthyThreshold() {
        return this.unhealthyThreshold == null ? Output.empty() : this.unhealthyThreshold;
    }

    public HttpHealthCheckState(
        @Nullable Output<Integer> checkIntervalSec,
        @Nullable Output<String> creationTimestamp,
        @Nullable Output<String> description,
        @Nullable Output<Integer> healthyThreshold,
        @Nullable Output<String> host,
        @Nullable Output<String> name,
        @Nullable Output<Integer> port,
        @Nullable Output<String> project,
        @Nullable Output<String> requestPath,
        @Nullable Output<String> selfLink,
        @Nullable Output<Integer> timeoutSec,
        @Nullable Output<Integer> unhealthyThreshold) {
        this.checkIntervalSec = checkIntervalSec;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.healthyThreshold = healthyThreshold;
        this.host = host;
        this.name = name;
        this.port = port;
        this.project = project;
        this.requestPath = requestPath;
        this.selfLink = selfLink;
        this.timeoutSec = timeoutSec;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    private HttpHealthCheckState() {
        this.checkIntervalSec = Output.empty();
        this.creationTimestamp = Output.empty();
        this.description = Output.empty();
        this.healthyThreshold = Output.empty();
        this.host = Output.empty();
        this.name = Output.empty();
        this.port = Output.empty();
        this.project = Output.empty();
        this.requestPath = Output.empty();
        this.selfLink = Output.empty();
        this.timeoutSec = Output.empty();
        this.unhealthyThreshold = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HttpHealthCheckState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> checkIntervalSec;
        private @Nullable Output<String> creationTimestamp;
        private @Nullable Output<String> description;
        private @Nullable Output<Integer> healthyThreshold;
        private @Nullable Output<String> host;
        private @Nullable Output<String> name;
        private @Nullable Output<Integer> port;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestPath;
        private @Nullable Output<String> selfLink;
        private @Nullable Output<Integer> timeoutSec;
        private @Nullable Output<Integer> unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(HttpHealthCheckState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkIntervalSec = defaults.checkIntervalSec;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.host = defaults.host;
    	      this.name = defaults.name;
    	      this.port = defaults.port;
    	      this.project = defaults.project;
    	      this.requestPath = defaults.requestPath;
    	      this.selfLink = defaults.selfLink;
    	      this.timeoutSec = defaults.timeoutSec;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder checkIntervalSec(@Nullable Output<Integer> checkIntervalSec) {
            this.checkIntervalSec = checkIntervalSec;
            return this;
        }
        public Builder checkIntervalSec(@Nullable Integer checkIntervalSec) {
            this.checkIntervalSec = Output.ofNullable(checkIntervalSec);
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
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder healthyThreshold(@Nullable Output<Integer> healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Builder healthyThreshold(@Nullable Integer healthyThreshold) {
            this.healthyThreshold = Output.ofNullable(healthyThreshold);
            return this;
        }
        public Builder host(@Nullable Output<String> host) {
            this.host = host;
            return this;
        }
        public Builder host(@Nullable String host) {
            this.host = Output.ofNullable(host);
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
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Output.ofNullable(port);
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
        public Builder requestPath(@Nullable Output<String> requestPath) {
            this.requestPath = requestPath;
            return this;
        }
        public Builder requestPath(@Nullable String requestPath) {
            this.requestPath = Output.ofNullable(requestPath);
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
        public Builder timeoutSec(@Nullable Output<Integer> timeoutSec) {
            this.timeoutSec = timeoutSec;
            return this;
        }
        public Builder timeoutSec(@Nullable Integer timeoutSec) {
            this.timeoutSec = Output.ofNullable(timeoutSec);
            return this;
        }
        public Builder unhealthyThreshold(@Nullable Output<Integer> unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Builder unhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = Output.ofNullable(unhealthyThreshold);
            return this;
        }        public HttpHealthCheckState build() {
            return new HttpHealthCheckState(checkIntervalSec, creationTimestamp, description, healthyThreshold, host, name, port, project, requestPath, selfLink, timeoutSec, unhealthyThreshold);
        }
    }
}
