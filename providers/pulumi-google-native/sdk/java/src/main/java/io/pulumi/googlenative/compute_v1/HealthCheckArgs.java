// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.compute_v1.enums.HealthCheckType;
import io.pulumi.googlenative.compute_v1.inputs.GRPCHealthCheckArgs;
import io.pulumi.googlenative.compute_v1.inputs.HTTP2HealthCheckArgs;
import io.pulumi.googlenative.compute_v1.inputs.HTTPHealthCheckArgs;
import io.pulumi.googlenative.compute_v1.inputs.HTTPSHealthCheckArgs;
import io.pulumi.googlenative.compute_v1.inputs.HealthCheckLogConfigArgs;
import io.pulumi.googlenative.compute_v1.inputs.SSLHealthCheckArgs;
import io.pulumi.googlenative.compute_v1.inputs.TCPHealthCheckArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HealthCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final HealthCheckArgs Empty = new HealthCheckArgs();

    /**
     * How often (in seconds) to send a health check. The default value is 5 seconds.
     * 
     */
    @Import(name="checkIntervalSec")
      private final @Nullable Output<Integer> checkIntervalSec;

    public Output<Integer> getCheckIntervalSec() {
        return this.checkIntervalSec == null ? Codegen.empty() : this.checkIntervalSec;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    @Import(name="grpcHealthCheck")
      private final @Nullable Output<GRPCHealthCheckArgs> grpcHealthCheck;

    public Output<GRPCHealthCheckArgs> getGrpcHealthCheck() {
        return this.grpcHealthCheck == null ? Codegen.empty() : this.grpcHealthCheck;
    }

    /**
     * A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
     * 
     */
    @Import(name="healthyThreshold")
      private final @Nullable Output<Integer> healthyThreshold;

    public Output<Integer> getHealthyThreshold() {
        return this.healthyThreshold == null ? Codegen.empty() : this.healthyThreshold;
    }

    @Import(name="http2HealthCheck")
      private final @Nullable Output<HTTP2HealthCheckArgs> http2HealthCheck;

    public Output<HTTP2HealthCheckArgs> getHttp2HealthCheck() {
        return this.http2HealthCheck == null ? Codegen.empty() : this.http2HealthCheck;
    }

    @Import(name="httpHealthCheck")
      private final @Nullable Output<HTTPHealthCheckArgs> httpHealthCheck;

    public Output<HTTPHealthCheckArgs> getHttpHealthCheck() {
        return this.httpHealthCheck == null ? Codegen.empty() : this.httpHealthCheck;
    }

    @Import(name="httpsHealthCheck")
      private final @Nullable Output<HTTPSHealthCheckArgs> httpsHealthCheck;

    public Output<HTTPSHealthCheckArgs> getHttpsHealthCheck() {
        return this.httpsHealthCheck == null ? Codegen.empty() : this.httpsHealthCheck;
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Configure logging on this health check.
     * 
     */
    @Import(name="logConfig")
      private final @Nullable Output<HealthCheckLogConfigArgs> logConfig;

    public Output<HealthCheckLogConfigArgs> getLogConfig() {
        return this.logConfig == null ? Codegen.empty() : this.logConfig;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. For example, a name that is 1-63 characters long, matches the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`, and otherwise complies with RFC1035. This regular expression describes a name where the first character is a lowercase letter, and all following characters are a dash, lowercase letter, or digit, except the last character, which isn't a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Codegen.empty() : this.requestId;
    }

    @Import(name="sslHealthCheck")
      private final @Nullable Output<SSLHealthCheckArgs> sslHealthCheck;

    public Output<SSLHealthCheckArgs> getSslHealthCheck() {
        return this.sslHealthCheck == null ? Codegen.empty() : this.sslHealthCheck;
    }

    @Import(name="tcpHealthCheck")
      private final @Nullable Output<TCPHealthCheckArgs> tcpHealthCheck;

    public Output<TCPHealthCheckArgs> getTcpHealthCheck() {
        return this.tcpHealthCheck == null ? Codegen.empty() : this.tcpHealthCheck;
    }

    /**
     * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
     * 
     */
    @Import(name="timeoutSec")
      private final @Nullable Output<Integer> timeoutSec;

    public Output<Integer> getTimeoutSec() {
        return this.timeoutSec == null ? Codegen.empty() : this.timeoutSec;
    }

    /**
     * Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS or HTTP2. Exactly one of the protocol-specific health check field must be specified, which must match type field.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<HealthCheckType> type;

    public Output<HealthCheckType> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    /**
     * A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
     * 
     */
    @Import(name="unhealthyThreshold")
      private final @Nullable Output<Integer> unhealthyThreshold;

    public Output<Integer> getUnhealthyThreshold() {
        return this.unhealthyThreshold == null ? Codegen.empty() : this.unhealthyThreshold;
    }

    public HealthCheckArgs(
        @Nullable Output<Integer> checkIntervalSec,
        @Nullable Output<String> description,
        @Nullable Output<GRPCHealthCheckArgs> grpcHealthCheck,
        @Nullable Output<Integer> healthyThreshold,
        @Nullable Output<HTTP2HealthCheckArgs> http2HealthCheck,
        @Nullable Output<HTTPHealthCheckArgs> httpHealthCheck,
        @Nullable Output<HTTPSHealthCheckArgs> httpsHealthCheck,
        @Nullable Output<String> kind,
        @Nullable Output<HealthCheckLogConfigArgs> logConfig,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> requestId,
        @Nullable Output<SSLHealthCheckArgs> sslHealthCheck,
        @Nullable Output<TCPHealthCheckArgs> tcpHealthCheck,
        @Nullable Output<Integer> timeoutSec,
        @Nullable Output<HealthCheckType> type,
        @Nullable Output<Integer> unhealthyThreshold) {
        this.checkIntervalSec = checkIntervalSec;
        this.description = description;
        this.grpcHealthCheck = grpcHealthCheck;
        this.healthyThreshold = healthyThreshold;
        this.http2HealthCheck = http2HealthCheck;
        this.httpHealthCheck = httpHealthCheck;
        this.httpsHealthCheck = httpsHealthCheck;
        this.kind = kind;
        this.logConfig = logConfig;
        this.name = name;
        this.project = project;
        this.requestId = requestId;
        this.sslHealthCheck = sslHealthCheck;
        this.tcpHealthCheck = tcpHealthCheck;
        this.timeoutSec = timeoutSec;
        this.type = type;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    private HealthCheckArgs() {
        this.checkIntervalSec = Codegen.empty();
        this.description = Codegen.empty();
        this.grpcHealthCheck = Codegen.empty();
        this.healthyThreshold = Codegen.empty();
        this.http2HealthCheck = Codegen.empty();
        this.httpHealthCheck = Codegen.empty();
        this.httpsHealthCheck = Codegen.empty();
        this.kind = Codegen.empty();
        this.logConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.project = Codegen.empty();
        this.requestId = Codegen.empty();
        this.sslHealthCheck = Codegen.empty();
        this.tcpHealthCheck = Codegen.empty();
        this.timeoutSec = Codegen.empty();
        this.type = Codegen.empty();
        this.unhealthyThreshold = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> checkIntervalSec;
        private @Nullable Output<String> description;
        private @Nullable Output<GRPCHealthCheckArgs> grpcHealthCheck;
        private @Nullable Output<Integer> healthyThreshold;
        private @Nullable Output<HTTP2HealthCheckArgs> http2HealthCheck;
        private @Nullable Output<HTTPHealthCheckArgs> httpHealthCheck;
        private @Nullable Output<HTTPSHealthCheckArgs> httpsHealthCheck;
        private @Nullable Output<String> kind;
        private @Nullable Output<HealthCheckLogConfigArgs> logConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> requestId;
        private @Nullable Output<SSLHealthCheckArgs> sslHealthCheck;
        private @Nullable Output<TCPHealthCheckArgs> tcpHealthCheck;
        private @Nullable Output<Integer> timeoutSec;
        private @Nullable Output<HealthCheckType> type;
        private @Nullable Output<Integer> unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkIntervalSec = defaults.checkIntervalSec;
    	      this.description = defaults.description;
    	      this.grpcHealthCheck = defaults.grpcHealthCheck;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.http2HealthCheck = defaults.http2HealthCheck;
    	      this.httpHealthCheck = defaults.httpHealthCheck;
    	      this.httpsHealthCheck = defaults.httpsHealthCheck;
    	      this.kind = defaults.kind;
    	      this.logConfig = defaults.logConfig;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.requestId = defaults.requestId;
    	      this.sslHealthCheck = defaults.sslHealthCheck;
    	      this.tcpHealthCheck = defaults.tcpHealthCheck;
    	      this.timeoutSec = defaults.timeoutSec;
    	      this.type = defaults.type;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder checkIntervalSec(@Nullable Output<Integer> checkIntervalSec) {
            this.checkIntervalSec = checkIntervalSec;
            return this;
        }
        public Builder checkIntervalSec(@Nullable Integer checkIntervalSec) {
            this.checkIntervalSec = Codegen.ofNullable(checkIntervalSec);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder grpcHealthCheck(@Nullable Output<GRPCHealthCheckArgs> grpcHealthCheck) {
            this.grpcHealthCheck = grpcHealthCheck;
            return this;
        }
        public Builder grpcHealthCheck(@Nullable GRPCHealthCheckArgs grpcHealthCheck) {
            this.grpcHealthCheck = Codegen.ofNullable(grpcHealthCheck);
            return this;
        }
        public Builder healthyThreshold(@Nullable Output<Integer> healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Builder healthyThreshold(@Nullable Integer healthyThreshold) {
            this.healthyThreshold = Codegen.ofNullable(healthyThreshold);
            return this;
        }
        public Builder http2HealthCheck(@Nullable Output<HTTP2HealthCheckArgs> http2HealthCheck) {
            this.http2HealthCheck = http2HealthCheck;
            return this;
        }
        public Builder http2HealthCheck(@Nullable HTTP2HealthCheckArgs http2HealthCheck) {
            this.http2HealthCheck = Codegen.ofNullable(http2HealthCheck);
            return this;
        }
        public Builder httpHealthCheck(@Nullable Output<HTTPHealthCheckArgs> httpHealthCheck) {
            this.httpHealthCheck = httpHealthCheck;
            return this;
        }
        public Builder httpHealthCheck(@Nullable HTTPHealthCheckArgs httpHealthCheck) {
            this.httpHealthCheck = Codegen.ofNullable(httpHealthCheck);
            return this;
        }
        public Builder httpsHealthCheck(@Nullable Output<HTTPSHealthCheckArgs> httpsHealthCheck) {
            this.httpsHealthCheck = httpsHealthCheck;
            return this;
        }
        public Builder httpsHealthCheck(@Nullable HTTPSHealthCheckArgs httpsHealthCheck) {
            this.httpsHealthCheck = Codegen.ofNullable(httpsHealthCheck);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder logConfig(@Nullable Output<HealthCheckLogConfigArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }
        public Builder logConfig(@Nullable HealthCheckLogConfigArgs logConfig) {
            this.logConfig = Codegen.ofNullable(logConfig);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Codegen.ofNullable(requestId);
            return this;
        }
        public Builder sslHealthCheck(@Nullable Output<SSLHealthCheckArgs> sslHealthCheck) {
            this.sslHealthCheck = sslHealthCheck;
            return this;
        }
        public Builder sslHealthCheck(@Nullable SSLHealthCheckArgs sslHealthCheck) {
            this.sslHealthCheck = Codegen.ofNullable(sslHealthCheck);
            return this;
        }
        public Builder tcpHealthCheck(@Nullable Output<TCPHealthCheckArgs> tcpHealthCheck) {
            this.tcpHealthCheck = tcpHealthCheck;
            return this;
        }
        public Builder tcpHealthCheck(@Nullable TCPHealthCheckArgs tcpHealthCheck) {
            this.tcpHealthCheck = Codegen.ofNullable(tcpHealthCheck);
            return this;
        }
        public Builder timeoutSec(@Nullable Output<Integer> timeoutSec) {
            this.timeoutSec = timeoutSec;
            return this;
        }
        public Builder timeoutSec(@Nullable Integer timeoutSec) {
            this.timeoutSec = Codegen.ofNullable(timeoutSec);
            return this;
        }
        public Builder type(@Nullable Output<HealthCheckType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable HealthCheckType type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }
        public Builder unhealthyThreshold(@Nullable Output<Integer> unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Builder unhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = Codegen.ofNullable(unhealthyThreshold);
            return this;
        }        public HealthCheckArgs build() {
            return new HealthCheckArgs(checkIntervalSec, description, grpcHealthCheck, healthyThreshold, http2HealthCheck, httpHealthCheck, httpsHealthCheck, kind, logConfig, name, project, requestId, sslHealthCheck, tcpHealthCheck, timeoutSec, type, unhealthyThreshold);
        }
    }
}
