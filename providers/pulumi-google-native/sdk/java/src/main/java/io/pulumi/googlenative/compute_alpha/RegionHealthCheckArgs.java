// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.enums.RegionHealthCheckType;
import io.pulumi.googlenative.compute_alpha.inputs.GRPCHealthCheckArgs;
import io.pulumi.googlenative.compute_alpha.inputs.HTTP2HealthCheckArgs;
import io.pulumi.googlenative.compute_alpha.inputs.HTTPHealthCheckArgs;
import io.pulumi.googlenative.compute_alpha.inputs.HTTPSHealthCheckArgs;
import io.pulumi.googlenative.compute_alpha.inputs.HealthCheckLogConfigArgs;
import io.pulumi.googlenative.compute_alpha.inputs.SSLHealthCheckArgs;
import io.pulumi.googlenative.compute_alpha.inputs.TCPHealthCheckArgs;
import io.pulumi.googlenative.compute_alpha.inputs.UDPHealthCheckArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionHealthCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionHealthCheckArgs Empty = new RegionHealthCheckArgs();

    /**
     * How often (in seconds) to send a health check. The default value is 5 seconds.
     * 
     */
    @Import(name="checkIntervalSec")
      private final @Nullable Output<Integer> checkIntervalSec;

    public Output<Integer> getCheckIntervalSec() {
        return this.checkIntervalSec == null ? Output.empty() : this.checkIntervalSec;
    }

    /**
     * An optional description of this resource. Provide this property when you create the resource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    @Import(name="grpcHealthCheck")
      private final @Nullable Output<GRPCHealthCheckArgs> grpcHealthCheck;

    public Output<GRPCHealthCheckArgs> getGrpcHealthCheck() {
        return this.grpcHealthCheck == null ? Output.empty() : this.grpcHealthCheck;
    }

    /**
     * A so-far unhealthy instance will be marked healthy after this many consecutive successes. The default value is 2.
     * 
     */
    @Import(name="healthyThreshold")
      private final @Nullable Output<Integer> healthyThreshold;

    public Output<Integer> getHealthyThreshold() {
        return this.healthyThreshold == null ? Output.empty() : this.healthyThreshold;
    }

    @Import(name="http2HealthCheck")
      private final @Nullable Output<HTTP2HealthCheckArgs> http2HealthCheck;

    public Output<HTTP2HealthCheckArgs> getHttp2HealthCheck() {
        return this.http2HealthCheck == null ? Output.empty() : this.http2HealthCheck;
    }

    @Import(name="httpHealthCheck")
      private final @Nullable Output<HTTPHealthCheckArgs> httpHealthCheck;

    public Output<HTTPHealthCheckArgs> getHttpHealthCheck() {
        return this.httpHealthCheck == null ? Output.empty() : this.httpHealthCheck;
    }

    @Import(name="httpsHealthCheck")
      private final @Nullable Output<HTTPSHealthCheckArgs> httpsHealthCheck;

    public Output<HTTPSHealthCheckArgs> getHttpsHealthCheck() {
        return this.httpsHealthCheck == null ? Output.empty() : this.httpsHealthCheck;
    }

    /**
     * Type of the resource.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Configure logging on this health check.
     * 
     */
    @Import(name="logConfig")
      private final @Nullable Output<HealthCheckLogConfigArgs> logConfig;

    public Output<HealthCheckLogConfigArgs> getLogConfig() {
        return this.logConfig == null ? Output.empty() : this.logConfig;
    }

    /**
     * Name of the resource. Provided by the client when the resource is created. The name must be 1-63 characters long, and comply with RFC1035. For example, a name that is 1-63 characters long, matches the regular expression `[a-z]([-a-z0-9]*[a-z0-9])?`, and otherwise complies with RFC1035. This regular expression describes a name where the first character is a lowercase letter, and all following characters are a dash, lowercase letter, or digit, except the last character, which isn't a dash.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="region", required=true)
      private final Output<String> region;

    public Output<String> getRegion() {
        return this.region;
    }

    @Import(name="requestId")
      private final @Nullable Output<String> requestId;

    public Output<String> getRequestId() {
        return this.requestId == null ? Output.empty() : this.requestId;
    }

    @Import(name="sslHealthCheck")
      private final @Nullable Output<SSLHealthCheckArgs> sslHealthCheck;

    public Output<SSLHealthCheckArgs> getSslHealthCheck() {
        return this.sslHealthCheck == null ? Output.empty() : this.sslHealthCheck;
    }

    @Import(name="tcpHealthCheck")
      private final @Nullable Output<TCPHealthCheckArgs> tcpHealthCheck;

    public Output<TCPHealthCheckArgs> getTcpHealthCheck() {
        return this.tcpHealthCheck == null ? Output.empty() : this.tcpHealthCheck;
    }

    /**
     * How long (in seconds) to wait before claiming failure. The default value is 5 seconds. It is invalid for timeoutSec to have greater value than checkIntervalSec.
     * 
     */
    @Import(name="timeoutSec")
      private final @Nullable Output<Integer> timeoutSec;

    public Output<Integer> getTimeoutSec() {
        return this.timeoutSec == null ? Output.empty() : this.timeoutSec;
    }

    /**
     * Specifies the type of the healthCheck, either TCP, SSL, HTTP, HTTPS or HTTP2. Exactly one of the protocol-specific health check field must be specified, which must match type field.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<RegionHealthCheckType> type;

    public Output<RegionHealthCheckType> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    @Import(name="udpHealthCheck")
      private final @Nullable Output<UDPHealthCheckArgs> udpHealthCheck;

    public Output<UDPHealthCheckArgs> getUdpHealthCheck() {
        return this.udpHealthCheck == null ? Output.empty() : this.udpHealthCheck;
    }

    /**
     * A so-far healthy instance will be marked unhealthy after this many consecutive failures. The default value is 2.
     * 
     */
    @Import(name="unhealthyThreshold")
      private final @Nullable Output<Integer> unhealthyThreshold;

    public Output<Integer> getUnhealthyThreshold() {
        return this.unhealthyThreshold == null ? Output.empty() : this.unhealthyThreshold;
    }

    public RegionHealthCheckArgs(
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
        Output<String> region,
        @Nullable Output<String> requestId,
        @Nullable Output<SSLHealthCheckArgs> sslHealthCheck,
        @Nullable Output<TCPHealthCheckArgs> tcpHealthCheck,
        @Nullable Output<Integer> timeoutSec,
        @Nullable Output<RegionHealthCheckType> type,
        @Nullable Output<UDPHealthCheckArgs> udpHealthCheck,
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
        this.region = Objects.requireNonNull(region, "expected parameter 'region' to be non-null");
        this.requestId = requestId;
        this.sslHealthCheck = sslHealthCheck;
        this.tcpHealthCheck = tcpHealthCheck;
        this.timeoutSec = timeoutSec;
        this.type = type;
        this.udpHealthCheck = udpHealthCheck;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    private RegionHealthCheckArgs() {
        this.checkIntervalSec = Output.empty();
        this.description = Output.empty();
        this.grpcHealthCheck = Output.empty();
        this.healthyThreshold = Output.empty();
        this.http2HealthCheck = Output.empty();
        this.httpHealthCheck = Output.empty();
        this.httpsHealthCheck = Output.empty();
        this.kind = Output.empty();
        this.logConfig = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.region = Output.empty();
        this.requestId = Output.empty();
        this.sslHealthCheck = Output.empty();
        this.tcpHealthCheck = Output.empty();
        this.timeoutSec = Output.empty();
        this.type = Output.empty();
        this.udpHealthCheck = Output.empty();
        this.unhealthyThreshold = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionHealthCheckArgs defaults) {
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
        private Output<String> region;
        private @Nullable Output<String> requestId;
        private @Nullable Output<SSLHealthCheckArgs> sslHealthCheck;
        private @Nullable Output<TCPHealthCheckArgs> tcpHealthCheck;
        private @Nullable Output<Integer> timeoutSec;
        private @Nullable Output<RegionHealthCheckType> type;
        private @Nullable Output<UDPHealthCheckArgs> udpHealthCheck;
        private @Nullable Output<Integer> unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionHealthCheckArgs defaults) {
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
    	      this.region = defaults.region;
    	      this.requestId = defaults.requestId;
    	      this.sslHealthCheck = defaults.sslHealthCheck;
    	      this.tcpHealthCheck = defaults.tcpHealthCheck;
    	      this.timeoutSec = defaults.timeoutSec;
    	      this.type = defaults.type;
    	      this.udpHealthCheck = defaults.udpHealthCheck;
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
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder grpcHealthCheck(@Nullable Output<GRPCHealthCheckArgs> grpcHealthCheck) {
            this.grpcHealthCheck = grpcHealthCheck;
            return this;
        }
        public Builder grpcHealthCheck(@Nullable GRPCHealthCheckArgs grpcHealthCheck) {
            this.grpcHealthCheck = Output.ofNullable(grpcHealthCheck);
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
        public Builder http2HealthCheck(@Nullable Output<HTTP2HealthCheckArgs> http2HealthCheck) {
            this.http2HealthCheck = http2HealthCheck;
            return this;
        }
        public Builder http2HealthCheck(@Nullable HTTP2HealthCheckArgs http2HealthCheck) {
            this.http2HealthCheck = Output.ofNullable(http2HealthCheck);
            return this;
        }
        public Builder httpHealthCheck(@Nullable Output<HTTPHealthCheckArgs> httpHealthCheck) {
            this.httpHealthCheck = httpHealthCheck;
            return this;
        }
        public Builder httpHealthCheck(@Nullable HTTPHealthCheckArgs httpHealthCheck) {
            this.httpHealthCheck = Output.ofNullable(httpHealthCheck);
            return this;
        }
        public Builder httpsHealthCheck(@Nullable Output<HTTPSHealthCheckArgs> httpsHealthCheck) {
            this.httpsHealthCheck = httpsHealthCheck;
            return this;
        }
        public Builder httpsHealthCheck(@Nullable HTTPSHealthCheckArgs httpsHealthCheck) {
            this.httpsHealthCheck = Output.ofNullable(httpsHealthCheck);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }
        public Builder logConfig(@Nullable Output<HealthCheckLogConfigArgs> logConfig) {
            this.logConfig = logConfig;
            return this;
        }
        public Builder logConfig(@Nullable HealthCheckLogConfigArgs logConfig) {
            this.logConfig = Output.ofNullable(logConfig);
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder region(Output<String> region) {
            this.region = Objects.requireNonNull(region);
            return this;
        }
        public Builder region(String region) {
            this.region = Output.of(Objects.requireNonNull(region));
            return this;
        }
        public Builder requestId(@Nullable Output<String> requestId) {
            this.requestId = requestId;
            return this;
        }
        public Builder requestId(@Nullable String requestId) {
            this.requestId = Output.ofNullable(requestId);
            return this;
        }
        public Builder sslHealthCheck(@Nullable Output<SSLHealthCheckArgs> sslHealthCheck) {
            this.sslHealthCheck = sslHealthCheck;
            return this;
        }
        public Builder sslHealthCheck(@Nullable SSLHealthCheckArgs sslHealthCheck) {
            this.sslHealthCheck = Output.ofNullable(sslHealthCheck);
            return this;
        }
        public Builder tcpHealthCheck(@Nullable Output<TCPHealthCheckArgs> tcpHealthCheck) {
            this.tcpHealthCheck = tcpHealthCheck;
            return this;
        }
        public Builder tcpHealthCheck(@Nullable TCPHealthCheckArgs tcpHealthCheck) {
            this.tcpHealthCheck = Output.ofNullable(tcpHealthCheck);
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
        public Builder type(@Nullable Output<RegionHealthCheckType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable RegionHealthCheckType type) {
            this.type = Output.ofNullable(type);
            return this;
        }
        public Builder udpHealthCheck(@Nullable Output<UDPHealthCheckArgs> udpHealthCheck) {
            this.udpHealthCheck = udpHealthCheck;
            return this;
        }
        public Builder udpHealthCheck(@Nullable UDPHealthCheckArgs udpHealthCheck) {
            this.udpHealthCheck = Output.ofNullable(udpHealthCheck);
            return this;
        }
        public Builder unhealthyThreshold(@Nullable Output<Integer> unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Builder unhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = Output.ofNullable(unhealthyThreshold);
            return this;
        }        public RegionHealthCheckArgs build() {
            return new RegionHealthCheckArgs(checkIntervalSec, description, grpcHealthCheck, healthyThreshold, http2HealthCheck, httpHealthCheck, httpsHealthCheck, kind, logConfig, name, project, region, requestId, sslHealthCheck, tcpHealthCheck, timeoutSec, type, udpHealthCheck, unhealthyThreshold);
        }
    }
}
