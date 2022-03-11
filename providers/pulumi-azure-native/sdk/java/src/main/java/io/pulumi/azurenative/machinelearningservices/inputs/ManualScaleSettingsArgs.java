// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ManualScaleSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManualScaleSettingsArgs Empty = new ManualScaleSettingsArgs();

    /**
     * Fixed number of instances for this deployment.
     * 
     */
    @InputImport(name="instanceCount")
      private final @Nullable Output<Integer> instanceCount;

    public Output<Integer> getInstanceCount() {
        return this.instanceCount == null ? Output.empty() : this.instanceCount;
    }

    /**
     * Maximum number of instances for this deployment.
     * 
     */
    @InputImport(name="maxInstances")
      private final @Nullable Output<Integer> maxInstances;

    public Output<Integer> getMaxInstances() {
        return this.maxInstances == null ? Output.empty() : this.maxInstances;
    }

    /**
     * Minimum number of instances for this deployment.
     * 
     */
    @InputImport(name="minInstances")
      private final @Nullable Output<Integer> minInstances;

    public Output<Integer> getMinInstances() {
        return this.minInstances == null ? Output.empty() : this.minInstances;
    }

    /**
     * Expected value is 'Manual'.
     * 
     */
    @InputImport(name="scaleType", required=true)
      private final Output<String> scaleType;

    public Output<String> getScaleType() {
        return this.scaleType;
    }

    public ManualScaleSettingsArgs(
        @Nullable Output<Integer> instanceCount,
        @Nullable Output<Integer> maxInstances,
        @Nullable Output<Integer> minInstances,
        Output<String> scaleType) {
        this.instanceCount = instanceCount;
        this.maxInstances = maxInstances;
        this.minInstances = minInstances;
        this.scaleType = Objects.requireNonNull(scaleType, "expected parameter 'scaleType' to be non-null");
    }

    private ManualScaleSettingsArgs() {
        this.instanceCount = Output.empty();
        this.maxInstances = Output.empty();
        this.minInstances = Output.empty();
        this.scaleType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManualScaleSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> instanceCount;
        private @Nullable Output<Integer> maxInstances;
        private @Nullable Output<Integer> minInstances;
        private Output<String> scaleType;

        public Builder() {
    	      // Empty
        }

        public Builder(ManualScaleSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.instanceCount = defaults.instanceCount;
    	      this.maxInstances = defaults.maxInstances;
    	      this.minInstances = defaults.minInstances;
    	      this.scaleType = defaults.scaleType;
        }

        public Builder instanceCount(@Nullable Output<Integer> instanceCount) {
            this.instanceCount = instanceCount;
            return this;
        }

        public Builder instanceCount(@Nullable Integer instanceCount) {
            this.instanceCount = Output.ofNullable(instanceCount);
            return this;
        }

        public Builder maxInstances(@Nullable Output<Integer> maxInstances) {
            this.maxInstances = maxInstances;
            return this;
        }

        public Builder maxInstances(@Nullable Integer maxInstances) {
            this.maxInstances = Output.ofNullable(maxInstances);
            return this;
        }

        public Builder minInstances(@Nullable Output<Integer> minInstances) {
            this.minInstances = minInstances;
            return this;
        }

        public Builder minInstances(@Nullable Integer minInstances) {
            this.minInstances = Output.ofNullable(minInstances);
            return this;
        }

        public Builder scaleType(Output<String> scaleType) {
            this.scaleType = Objects.requireNonNull(scaleType);
            return this;
        }

        public Builder scaleType(String scaleType) {
            this.scaleType = Output.of(Objects.requireNonNull(scaleType));
            return this;
        }
        public ManualScaleSettingsArgs build() {
            return new ManualScaleSettingsArgs(instanceCount, maxInstances, minInstances, scaleType);
        }
    }
}
