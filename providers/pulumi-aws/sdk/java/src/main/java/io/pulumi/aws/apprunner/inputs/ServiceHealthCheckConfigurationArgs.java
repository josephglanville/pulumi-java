// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceHealthCheckConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceHealthCheckConfigurationArgs Empty = new ServiceHealthCheckConfigurationArgs();

    /**
     * The number of consecutive checks that must succeed before App Runner decides that the service is healthy. Defaults to 1. Minimum value of 1. Maximum value of 20.
     * 
     */
    @Import(name="healthyThreshold")
      private final @Nullable Output<Integer> healthyThreshold;

    public Output<Integer> getHealthyThreshold() {
        return this.healthyThreshold == null ? Codegen.empty() : this.healthyThreshold;
    }

    /**
     * The time interval, in seconds, between health checks. Defaults to 5. Minimum value of 1. Maximum value of 20.
     * 
     */
    @Import(name="interval")
      private final @Nullable Output<Integer> interval;

    public Output<Integer> getInterval() {
        return this.interval == null ? Codegen.empty() : this.interval;
    }

    /**
     * The URL to send requests to for health checks. Defaults to `/`. Minimum length of 0. Maximum length of 51200.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Codegen.empty() : this.path;
    }

    /**
     * The IP protocol that App Runner uses to perform health checks for your service. Valid values: `TCP`, `HTTP`. Defaults to `TCP`. If you set protocol to `HTTP`, App Runner sends health check requests to the HTTP path specified by `path`.
     * 
     */
    @Import(name="protocol")
      private final @Nullable Output<String> protocol;

    public Output<String> getProtocol() {
        return this.protocol == null ? Codegen.empty() : this.protocol;
    }

    /**
     * The time, in seconds, to wait for a health check response before deciding it failed. Defaults to 2. Minimum value of  1. Maximum value of 20.
     * 
     */
    @Import(name="timeout")
      private final @Nullable Output<Integer> timeout;

    public Output<Integer> getTimeout() {
        return this.timeout == null ? Codegen.empty() : this.timeout;
    }

    /**
     * The number of consecutive checks that must fail before App Runner decides that the service is unhealthy. Defaults to 5. Minimum value of  1. Maximum value of 20.
     * 
     */
    @Import(name="unhealthyThreshold")
      private final @Nullable Output<Integer> unhealthyThreshold;

    public Output<Integer> getUnhealthyThreshold() {
        return this.unhealthyThreshold == null ? Codegen.empty() : this.unhealthyThreshold;
    }

    public ServiceHealthCheckConfigurationArgs(
        @Nullable Output<Integer> healthyThreshold,
        @Nullable Output<Integer> interval,
        @Nullable Output<String> path,
        @Nullable Output<String> protocol,
        @Nullable Output<Integer> timeout,
        @Nullable Output<Integer> unhealthyThreshold) {
        this.healthyThreshold = healthyThreshold;
        this.interval = interval;
        this.path = path;
        this.protocol = protocol;
        this.timeout = timeout;
        this.unhealthyThreshold = unhealthyThreshold;
    }

    private ServiceHealthCheckConfigurationArgs() {
        this.healthyThreshold = Codegen.empty();
        this.interval = Codegen.empty();
        this.path = Codegen.empty();
        this.protocol = Codegen.empty();
        this.timeout = Codegen.empty();
        this.unhealthyThreshold = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceHealthCheckConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> healthyThreshold;
        private @Nullable Output<Integer> interval;
        private @Nullable Output<String> path;
        private @Nullable Output<String> protocol;
        private @Nullable Output<Integer> timeout;
        private @Nullable Output<Integer> unhealthyThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceHealthCheckConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthyThreshold = defaults.healthyThreshold;
    	      this.interval = defaults.interval;
    	      this.path = defaults.path;
    	      this.protocol = defaults.protocol;
    	      this.timeout = defaults.timeout;
    	      this.unhealthyThreshold = defaults.unhealthyThreshold;
        }

        public Builder healthyThreshold(@Nullable Output<Integer> healthyThreshold) {
            this.healthyThreshold = healthyThreshold;
            return this;
        }
        public Builder healthyThreshold(@Nullable Integer healthyThreshold) {
            this.healthyThreshold = Codegen.ofNullable(healthyThreshold);
            return this;
        }
        public Builder interval(@Nullable Output<Integer> interval) {
            this.interval = interval;
            return this;
        }
        public Builder interval(@Nullable Integer interval) {
            this.interval = Codegen.ofNullable(interval);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Codegen.ofNullable(path);
            return this;
        }
        public Builder protocol(@Nullable Output<String> protocol) {
            this.protocol = protocol;
            return this;
        }
        public Builder protocol(@Nullable String protocol) {
            this.protocol = Codegen.ofNullable(protocol);
            return this;
        }
        public Builder timeout(@Nullable Output<Integer> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable Integer timeout) {
            this.timeout = Codegen.ofNullable(timeout);
            return this;
        }
        public Builder unhealthyThreshold(@Nullable Output<Integer> unhealthyThreshold) {
            this.unhealthyThreshold = unhealthyThreshold;
            return this;
        }
        public Builder unhealthyThreshold(@Nullable Integer unhealthyThreshold) {
            this.unhealthyThreshold = Codegen.ofNullable(unhealthyThreshold);
            return this;
        }        public ServiceHealthCheckConfigurationArgs build() {
            return new ServiceHealthCheckConfigurationArgs(healthyThreshold, interval, path, protocol, timeout, unhealthyThreshold);
        }
    }
}
