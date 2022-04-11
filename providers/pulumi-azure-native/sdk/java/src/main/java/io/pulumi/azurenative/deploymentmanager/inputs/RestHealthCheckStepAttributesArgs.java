// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.azurenative.deploymentmanager.inputs.RestHealthCheckArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the REST health check step properties.
 * 
 */
public final class RestHealthCheckStepAttributesArgs extends io.pulumi.resources.ResourceArgs {

    public static final RestHealthCheckStepAttributesArgs Empty = new RestHealthCheckStepAttributesArgs();

    /**
     * The list of checks that form the health check step.
     * 
     */
    @Import(name="healthChecks", required=true)
      private final Output<List<RestHealthCheckArgs>> healthChecks;

    public Output<List<RestHealthCheckArgs>> getHealthChecks() {
        return this.healthChecks;
    }

    /**
     * The duration in ISO 8601 format for which the resource is expected to be continuously healthy. If maxElasticDuration is specified, healthy state duration is enforced after the detection of first healthy signal.
     * 
     */
    @Import(name="healthyStateDuration", required=true)
      private final Output<String> healthyStateDuration;

    public Output<String> getHealthyStateDuration() {
        return this.healthyStateDuration;
    }

    /**
     * The duration in ISO 8601 format for which the health check waits for the resource to become healthy. Health check fails if it doesn't. Health check starts to enforce healthyStateDuration once resource becomes healthy.
     * 
     */
    @Import(name="maxElasticDuration")
      private final @Nullable Output<String> maxElasticDuration;

    public Output<String> getMaxElasticDuration() {
        return this.maxElasticDuration == null ? Codegen.empty() : this.maxElasticDuration;
    }

    /**
     * The type of health check.
     * Expected value is 'REST'.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    /**
     * The duration in ISO 8601 format for which health check waits idly without any checks.
     * 
     */
    @Import(name="waitDuration")
      private final @Nullable Output<String> waitDuration;

    public Output<String> getWaitDuration() {
        return this.waitDuration == null ? Codegen.empty() : this.waitDuration;
    }

    public RestHealthCheckStepAttributesArgs(
        Output<List<RestHealthCheckArgs>> healthChecks,
        Output<String> healthyStateDuration,
        @Nullable Output<String> maxElasticDuration,
        Output<String> type,
        @Nullable Output<String> waitDuration) {
        this.healthChecks = Objects.requireNonNull(healthChecks, "expected parameter 'healthChecks' to be non-null");
        this.healthyStateDuration = Objects.requireNonNull(healthyStateDuration, "expected parameter 'healthyStateDuration' to be non-null");
        this.maxElasticDuration = maxElasticDuration;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.waitDuration = waitDuration;
    }

    private RestHealthCheckStepAttributesArgs() {
        this.healthChecks = Codegen.empty();
        this.healthyStateDuration = Codegen.empty();
        this.maxElasticDuration = Codegen.empty();
        this.type = Codegen.empty();
        this.waitDuration = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RestHealthCheckStepAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<RestHealthCheckArgs>> healthChecks;
        private Output<String> healthyStateDuration;
        private @Nullable Output<String> maxElasticDuration;
        private Output<String> type;
        private @Nullable Output<String> waitDuration;

        public Builder() {
    	      // Empty
        }

        public Builder(RestHealthCheckStepAttributesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthChecks = defaults.healthChecks;
    	      this.healthyStateDuration = defaults.healthyStateDuration;
    	      this.maxElasticDuration = defaults.maxElasticDuration;
    	      this.type = defaults.type;
    	      this.waitDuration = defaults.waitDuration;
        }

        public Builder healthChecks(Output<List<RestHealthCheckArgs>> healthChecks) {
            this.healthChecks = Objects.requireNonNull(healthChecks);
            return this;
        }
        public Builder healthChecks(List<RestHealthCheckArgs> healthChecks) {
            this.healthChecks = Output.of(Objects.requireNonNull(healthChecks));
            return this;
        }
        public Builder healthChecks(RestHealthCheckArgs... healthChecks) {
            return healthChecks(List.of(healthChecks));
        }
        public Builder healthyStateDuration(Output<String> healthyStateDuration) {
            this.healthyStateDuration = Objects.requireNonNull(healthyStateDuration);
            return this;
        }
        public Builder healthyStateDuration(String healthyStateDuration) {
            this.healthyStateDuration = Output.of(Objects.requireNonNull(healthyStateDuration));
            return this;
        }
        public Builder maxElasticDuration(@Nullable Output<String> maxElasticDuration) {
            this.maxElasticDuration = maxElasticDuration;
            return this;
        }
        public Builder maxElasticDuration(@Nullable String maxElasticDuration) {
            this.maxElasticDuration = Codegen.ofNullable(maxElasticDuration);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public Builder waitDuration(@Nullable Output<String> waitDuration) {
            this.waitDuration = waitDuration;
            return this;
        }
        public Builder waitDuration(@Nullable String waitDuration) {
            this.waitDuration = Codegen.ofNullable(waitDuration);
            return this;
        }        public RestHealthCheckStepAttributesArgs build() {
            return new RestHealthCheckStepAttributesArgs(healthChecks, healthyStateDuration, maxElasticDuration, type, waitDuration);
        }
    }
}
