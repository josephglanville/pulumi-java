// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningcompute.inputs;

import io.pulumi.azurenative.machinelearningcompute.enums.Status;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * AutoScale configuration properties.
 * 
 */
public final class AutoScaleConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoScaleConfigurationArgs Empty = new AutoScaleConfigurationArgs();

    /**
     * The maximum number of replicas for each service.
     * 
     */
    @Import(name="maxReplicas")
      private final @Nullable Output<Integer> maxReplicas;

    public Output<Integer> getMaxReplicas() {
        return this.maxReplicas == null ? Codegen.empty() : this.maxReplicas;
    }

    /**
     * The minimum number of replicas for each service.
     * 
     */
    @Import(name="minReplicas")
      private final @Nullable Output<Integer> minReplicas;

    public Output<Integer> getMinReplicas() {
        return this.minReplicas == null ? Codegen.empty() : this.minReplicas;
    }

    /**
     * Refresh period in seconds.
     * 
     */
    @Import(name="refreshPeriodInSeconds")
      private final @Nullable Output<Integer> refreshPeriodInSeconds;

    public Output<Integer> getRefreshPeriodInSeconds() {
        return this.refreshPeriodInSeconds == null ? Codegen.empty() : this.refreshPeriodInSeconds;
    }

    /**
     * If auto-scale is enabled for all services. Each service can turn it off individually.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<Either<String,Status>> status;

    public Output<Either<String,Status>> getStatus() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * The target utilization.
     * 
     */
    @Import(name="targetUtilization")
      private final @Nullable Output<Double> targetUtilization;

    public Output<Double> getTargetUtilization() {
        return this.targetUtilization == null ? Codegen.empty() : this.targetUtilization;
    }

    public AutoScaleConfigurationArgs(
        @Nullable Output<Integer> maxReplicas,
        @Nullable Output<Integer> minReplicas,
        @Nullable Output<Integer> refreshPeriodInSeconds,
        @Nullable Output<Either<String,Status>> status,
        @Nullable Output<Double> targetUtilization) {
        this.maxReplicas = maxReplicas == null ? Codegen.ofNullable(100) : maxReplicas;
        this.minReplicas = minReplicas == null ? Codegen.ofNullable(1) : minReplicas;
        this.refreshPeriodInSeconds = refreshPeriodInSeconds;
        this.status = status == null ? Output.ofLeft("Disabled") : status;
        this.targetUtilization = targetUtilization;
    }

    private AutoScaleConfigurationArgs() {
        this.maxReplicas = Codegen.empty();
        this.minReplicas = Codegen.empty();
        this.refreshPeriodInSeconds = Codegen.empty();
        this.status = Codegen.empty();
        this.targetUtilization = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoScaleConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxReplicas;
        private @Nullable Output<Integer> minReplicas;
        private @Nullable Output<Integer> refreshPeriodInSeconds;
        private @Nullable Output<Either<String,Status>> status;
        private @Nullable Output<Double> targetUtilization;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoScaleConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxReplicas = defaults.maxReplicas;
    	      this.minReplicas = defaults.minReplicas;
    	      this.refreshPeriodInSeconds = defaults.refreshPeriodInSeconds;
    	      this.status = defaults.status;
    	      this.targetUtilization = defaults.targetUtilization;
        }

        public Builder maxReplicas(@Nullable Output<Integer> maxReplicas) {
            this.maxReplicas = maxReplicas;
            return this;
        }
        public Builder maxReplicas(@Nullable Integer maxReplicas) {
            this.maxReplicas = Codegen.ofNullable(maxReplicas);
            return this;
        }
        public Builder minReplicas(@Nullable Output<Integer> minReplicas) {
            this.minReplicas = minReplicas;
            return this;
        }
        public Builder minReplicas(@Nullable Integer minReplicas) {
            this.minReplicas = Codegen.ofNullable(minReplicas);
            return this;
        }
        public Builder refreshPeriodInSeconds(@Nullable Output<Integer> refreshPeriodInSeconds) {
            this.refreshPeriodInSeconds = refreshPeriodInSeconds;
            return this;
        }
        public Builder refreshPeriodInSeconds(@Nullable Integer refreshPeriodInSeconds) {
            this.refreshPeriodInSeconds = Codegen.ofNullable(refreshPeriodInSeconds);
            return this;
        }
        public Builder status(@Nullable Output<Either<String,Status>> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable Either<String,Status> status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder targetUtilization(@Nullable Output<Double> targetUtilization) {
            this.targetUtilization = targetUtilization;
            return this;
        }
        public Builder targetUtilization(@Nullable Double targetUtilization) {
            this.targetUtilization = Codegen.ofNullable(targetUtilization);
            return this;
        }        public AutoScaleConfigurationArgs build() {
            return new AutoScaleConfigurationArgs(maxReplicas, minReplicas, refreshPeriodInSeconds, status, targetUtilization);
        }
    }
}
