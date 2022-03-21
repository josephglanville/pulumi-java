// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AutoScaleSettingsResponse {
    /**
     * Maximum number of instances for this deployment.
     * 
     */
    private final @Nullable Integer maxInstances;
    /**
     * Minimum number of instances for this deployment.
     * 
     */
    private final @Nullable Integer minInstances;
    /**
     * The polling interval in ISO 8691 format. Only supports duration with precision as low as Seconds.
     * 
     */
    private final @Nullable String pollingInterval;
    /**
     * Expected value is 'Auto'.
     * 
     */
    private final String scaleType;
    /**
     * Target CPU usage for the autoscaler.
     * 
     */
    private final @Nullable Integer targetUtilizationPercentage;

    @CustomType.Constructor
    private AutoScaleSettingsResponse(
        @CustomType.Parameter("maxInstances") @Nullable Integer maxInstances,
        @CustomType.Parameter("minInstances") @Nullable Integer minInstances,
        @CustomType.Parameter("pollingInterval") @Nullable String pollingInterval,
        @CustomType.Parameter("scaleType") String scaleType,
        @CustomType.Parameter("targetUtilizationPercentage") @Nullable Integer targetUtilizationPercentage) {
        this.maxInstances = maxInstances;
        this.minInstances = minInstances;
        this.pollingInterval = pollingInterval;
        this.scaleType = scaleType;
        this.targetUtilizationPercentage = targetUtilizationPercentage;
    }

    /**
     * Maximum number of instances for this deployment.
     * 
    */
    public Optional<Integer> getMaxInstances() {
        return Optional.ofNullable(this.maxInstances);
    }
    /**
     * Minimum number of instances for this deployment.
     * 
    */
    public Optional<Integer> getMinInstances() {
        return Optional.ofNullable(this.minInstances);
    }
    /**
     * The polling interval in ISO 8691 format. Only supports duration with precision as low as Seconds.
     * 
    */
    public Optional<String> getPollingInterval() {
        return Optional.ofNullable(this.pollingInterval);
    }
    /**
     * Expected value is 'Auto'.
     * 
    */
    public String getScaleType() {
        return this.scaleType;
    }
    /**
     * Target CPU usage for the autoscaler.
     * 
    */
    public Optional<Integer> getTargetUtilizationPercentage() {
        return Optional.ofNullable(this.targetUtilizationPercentage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoScaleSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxInstances;
        private @Nullable Integer minInstances;
        private @Nullable String pollingInterval;
        private String scaleType;
        private @Nullable Integer targetUtilizationPercentage;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoScaleSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.pollingInterval = defaults.pollingInterval;
    	      this.scaleType = defaults.scaleType;
    	      this.targetUtilizationPercentage = defaults.targetUtilizationPercentage;
        }

        public Builder maxInstances(@Nullable Integer maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }
        public Builder minInstances(@Nullable Integer minInstances) {
            this.minInstances = minInstances;
            return this;
        }
        public Builder pollingInterval(@Nullable String pollingInterval) {
            this.pollingInterval = pollingInterval;
            return this;
        }
        public Builder scaleType(String scaleType) {
            this.scaleType = Objects.requireNonNull(scaleType);
            return this;
        }
        public Builder targetUtilizationPercentage(@Nullable Integer targetUtilizationPercentage) {
            this.targetUtilizationPercentage = targetUtilizationPercentage;
            return this;
        }        public AutoScaleSettingsResponse build() {
            return new AutoScaleSettingsResponse(maxInstances, minInstances, pollingInterval, scaleType, targetUtilizationPercentage);
        }
    }
}
