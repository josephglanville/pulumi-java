// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.compute.outputs.GetHealthCheckGrpcHealthCheck;
import io.pulumi.gcp.compute.outputs.GetHealthCheckHttp2HealthCheck;
import io.pulumi.gcp.compute.outputs.GetHealthCheckHttpHealthCheck;
import io.pulumi.gcp.compute.outputs.GetHealthCheckHttpsHealthCheck;
import io.pulumi.gcp.compute.outputs.GetHealthCheckLogConfig;
import io.pulumi.gcp.compute.outputs.GetHealthCheckSslHealthCheck;
import io.pulumi.gcp.compute.outputs.GetHealthCheckTcpHealthCheck;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetHealthCheckResult {
    private final Integer checkIntervalSec;
    private final String creationTimestamp;
    private final String description;
    private final List<GetHealthCheckGrpcHealthCheck> grpcHealthChecks;
    private final Integer healthyThreshold;
    private final List<GetHealthCheckHttp2HealthCheck> http2HealthChecks;
    private final List<GetHealthCheckHttpHealthCheck> httpHealthChecks;
    private final List<GetHealthCheckHttpsHealthCheck> httpsHealthChecks;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final List<GetHealthCheckLogConfig> logConfigs;
    private final String name;
    private final @Nullable String project;
    private final String selfLink;
    private final List<GetHealthCheckSslHealthCheck> sslHealthChecks;
    private final List<GetHealthCheckTcpHealthCheck> tcpHealthChecks;
    private final Integer timeoutSec;
    private final String type;
    private final Integer unhealthyThreshold;

    @CustomType.Constructor
    private GetHealthCheckResult(
        @CustomType.Parameter("checkIntervalSec") Integer checkIntervalSec,
        @CustomType.Parameter("creationTimestamp") String creationTimestamp,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("grpcHealthChecks") List<GetHealthCheckGrpcHealthCheck> grpcHealthChecks,
        @CustomType.Parameter("healthyThreshold") Integer healthyThreshold,
        @CustomType.Parameter("http2HealthChecks") List<GetHealthCheckHttp2HealthCheck> http2HealthChecks,
        @CustomType.Parameter("httpHealthChecks") List<GetHealthCheckHttpHealthCheck> httpHealthChecks,
        @CustomType.Parameter("httpsHealthChecks") List<GetHealthCheckHttpsHealthCheck> httpsHealthChecks,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("logConfigs") List<GetHealthCheckLogConfig> logConfigs,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("project") @Nullable String project,
        @CustomType.Parameter("selfLink") String selfLink,
        @CustomType.Parameter("sslHealthChecks") List<GetHealthCheckSslHealthCheck> sslHealthChecks,
        @CustomType.Parameter("tcpHealthChecks") List<GetHealthCheckTcpHealthCheck> tcpHealthChecks,
        @CustomType.Parameter("timeoutSec") Integer timeoutSec,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("unhealthyThreshold") Integer unhealthyThreshold) {
        this.checkIntervalSec = checkIntervalSec;
        this.creationTimestamp = creationTimestamp;
        this.description = description;
        this.grpcHealthChecks = grpcHealthChecks;
        this.healthyThreshold = healthyThreshold;
        this.http2HealthChecks = http2HealthChecks;
        this.httpHealthChecks = httpHealthChecks;
        this.httpsHealthChecks = httpsHealthChecks;
        this.id = id;
        this.logConfigs = logConfigs;
        this.name = name;
        this.project = project;
        this.selfLink = selfLink;
        this.sslHealthChecks = sslHealthChecks;
        this.tcpHealthChecks = tcpHealthChecks;
        this.timeoutSec = timeoutSec;
        this.type = type;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    public Integer getCheckIntervalSec() {
        return this.checkIntervalSec;
    }
    public String getCreationTimestamp() {
        return this.creationTimestamp;
    }
    public String getDescription() {
        return this.description;
    }
    public List<GetHealthCheckGrpcHealthCheck> getGrpcHealthChecks() {
        return this.grpcHealthChecks;
    }
    public Integer getHealthyThreshold() {
        return this.healthyThreshold;
    }
    public List<GetHealthCheckHttp2HealthCheck> getHttp2HealthChecks() {
        return this.http2HealthChecks;
    }
    public List<GetHealthCheckHttpHealthCheck> getHttpHealthChecks() {
        return this.httpHealthChecks;
    }
    public List<GetHealthCheckHttpsHealthCheck> getHttpsHealthChecks() {
        return this.httpsHealthChecks;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    public List<GetHealthCheckLogConfig> getLogConfigs() {
        return this.logConfigs;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getProject() {
        return Optional.ofNullable(this.project);
    }
    public String getSelfLink() {
        return this.selfLink;
    }
    public List<GetHealthCheckSslHealthCheck> getSslHealthChecks() {
        return this.sslHealthChecks;
    }
    public List<GetHealthCheckTcpHealthCheck> getTcpHealthChecks() {
        return this.tcpHealthChecks;
    }
    public Integer getTimeoutSec() {
        return this.timeoutSec;
    }
    public String getType() {
        return this.type;
    }
    public Integer getUnhealthyThreshold() {
        return this.unhealthyThreshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetHealthCheckResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer checkIntervalSec;
        private String creationTimestamp;
        private String description;
        private List<GetHealthCheckGrpcHealthCheck> grpcHealthChecks;
        private Integer healthyThreshold;
        private List<GetHealthCheckHttp2HealthCheck> http2HealthChecks;
        private List<GetHealthCheckHttpHealthCheck> httpHealthChecks;
        private List<GetHealthCheckHttpsHealthCheck> httpsHealthChecks;
        private String id;
        private List<GetHealthCheckLogConfig> logConfigs;
        private String name;
        private @Nullable String project;
        private String selfLink;
        private List<GetHealthCheckSslHealthCheck> sslHealthChecks;
        private List<GetHealthCheckTcpHealthCheck> tcpHealthChecks;
        private Integer timeoutSec;
        private String type;
        private Integer unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(GetHealthCheckResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkIntervalSec = defaults.checkIntervalSec;
    	      this.creationTimestamp = defaults.creationTimestamp;
    	      this.description = defaults.description;
    	      this.grpcHealthChecks = defaults.grpcHealthChecks;
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.http2HealthChecks = defaults.http2HealthChecks;
    	      this.httpHealthChecks = defaults.httpHealthChecks;
    	      this.httpsHealthChecks = defaults.httpsHealthChecks;
    	      this.id = defaults.id;
    	      this.logConfigs = defaults.logConfigs;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.selfLink = defaults.selfLink;
    	      this.sslHealthChecks = defaults.sslHealthChecks;
    	      this.tcpHealthChecks = defaults.tcpHealthChecks;
    	      this.timeoutSec = defaults.timeoutSec;
    	      this.type = defaults.type;
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
        public Builder grpcHealthChecks(List<GetHealthCheckGrpcHealthCheck> grpcHealthChecks) {
            this.grpcHealthChecks = Objects.requireNonNull(grpcHealthChecks);
            return this;
        }
        public Builder grpcHealthChecks(GetHealthCheckGrpcHealthCheck... grpcHealthChecks) {
            return grpcHealthChecks(List.of(grpcHealthChecks));
        }
        public Builder healthyThreshold(Integer healthyThreshold) {
            this.healthyThreshold = Objects.requireNonNull(healthyThreshold);
            return this;
        }
        public Builder http2HealthChecks(List<GetHealthCheckHttp2HealthCheck> http2HealthChecks) {
            this.http2HealthChecks = Objects.requireNonNull(http2HealthChecks);
            return this;
        }
        public Builder http2HealthChecks(GetHealthCheckHttp2HealthCheck... http2HealthChecks) {
            return http2HealthChecks(List.of(http2HealthChecks));
        }
        public Builder httpHealthChecks(List<GetHealthCheckHttpHealthCheck> httpHealthChecks) {
            this.httpHealthChecks = Objects.requireNonNull(httpHealthChecks);
            return this;
        }
        public Builder httpHealthChecks(GetHealthCheckHttpHealthCheck... httpHealthChecks) {
            return httpHealthChecks(List.of(httpHealthChecks));
        }
        public Builder httpsHealthChecks(List<GetHealthCheckHttpsHealthCheck> httpsHealthChecks) {
            this.httpsHealthChecks = Objects.requireNonNull(httpsHealthChecks);
            return this;
        }
        public Builder httpsHealthChecks(GetHealthCheckHttpsHealthCheck... httpsHealthChecks) {
            return httpsHealthChecks(List.of(httpsHealthChecks));
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder logConfigs(List<GetHealthCheckLogConfig> logConfigs) {
            this.logConfigs = Objects.requireNonNull(logConfigs);
            return this;
        }
        public Builder logConfigs(GetHealthCheckLogConfig... logConfigs) {
            return logConfigs(List.of(logConfigs));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder selfLink(String selfLink) {
            this.selfLink = Objects.requireNonNull(selfLink);
            return this;
        }
        public Builder sslHealthChecks(List<GetHealthCheckSslHealthCheck> sslHealthChecks) {
            this.sslHealthChecks = Objects.requireNonNull(sslHealthChecks);
            return this;
        }
        public Builder sslHealthChecks(GetHealthCheckSslHealthCheck... sslHealthChecks) {
            return sslHealthChecks(List.of(sslHealthChecks));
        }
        public Builder tcpHealthChecks(List<GetHealthCheckTcpHealthCheck> tcpHealthChecks) {
            this.tcpHealthChecks = Objects.requireNonNull(tcpHealthChecks);
            return this;
        }
        public Builder tcpHealthChecks(GetHealthCheckTcpHealthCheck... tcpHealthChecks) {
            return tcpHealthChecks(List.of(tcpHealthChecks));
        }
        public Builder timeoutSec(Integer timeoutSec) {
            this.timeoutSec = Objects.requireNonNull(timeoutSec);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder unhealthyThreshold(Integer unhealthyThreshold) {
            this.unhealthyThreshold = Objects.requireNonNull(unhealthyThreshold);
            return this;
        }        public GetHealthCheckResult build() {
            return new GetHealthCheckResult(checkIntervalSec, creationTimestamp, description, grpcHealthChecks, healthyThreshold, http2HealthChecks, httpHealthChecks, httpsHealthChecks, id, logConfigs, name, project, selfLink, sslHealthChecks, tcpHealthChecks, timeoutSec, type, unhealthyThreshold);
        }
    }
}
