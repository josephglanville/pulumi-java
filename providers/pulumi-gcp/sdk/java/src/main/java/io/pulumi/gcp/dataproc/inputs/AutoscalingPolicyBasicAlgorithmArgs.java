// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.dataproc.inputs.AutoscalingPolicyBasicAlgorithmYarnConfigArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoscalingPolicyBasicAlgorithmArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoscalingPolicyBasicAlgorithmArgs Empty = new AutoscalingPolicyBasicAlgorithmArgs();

    /**
     * Duration between scaling events. A scaling period starts after the
     * update operation from the previous event has completed.
     * Bounds: [2m, 1d]. Default: 2m.
     * 
     */
    @InputImport(name="cooldownPeriod")
      private final @Nullable Output<String> cooldownPeriod;

    public Output<String> getCooldownPeriod() {
        return this.cooldownPeriod == null ? Output.empty() : this.cooldownPeriod;
    }

    /**
     * YARN autoscaling configuration.
     * Structure is documented below.
     * 
     */
    @InputImport(name="yarnConfig", required=true)
      private final Output<AutoscalingPolicyBasicAlgorithmYarnConfigArgs> yarnConfig;

    public Output<AutoscalingPolicyBasicAlgorithmYarnConfigArgs> getYarnConfig() {
        return this.yarnConfig;
    }

    public AutoscalingPolicyBasicAlgorithmArgs(
        @Nullable Output<String> cooldownPeriod,
        Output<AutoscalingPolicyBasicAlgorithmYarnConfigArgs> yarnConfig) {
        this.cooldownPeriod = cooldownPeriod;
        this.yarnConfig = Objects.requireNonNull(yarnConfig, "expected parameter 'yarnConfig' to be non-null");
    }

    private AutoscalingPolicyBasicAlgorithmArgs() {
        this.cooldownPeriod = Output.empty();
        this.yarnConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoscalingPolicyBasicAlgorithmArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> cooldownPeriod;
        private Output<AutoscalingPolicyBasicAlgorithmYarnConfigArgs> yarnConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoscalingPolicyBasicAlgorithmArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cooldownPeriod = defaults.cooldownPeriod;
    	      this.yarnConfig = defaults.yarnConfig;
        }

        public Builder cooldownPeriod(@Nullable Output<String> cooldownPeriod) {
            this.cooldownPeriod = cooldownPeriod;
            return this;
        }

        public Builder cooldownPeriod(@Nullable String cooldownPeriod) {
            this.cooldownPeriod = Output.ofNullable(cooldownPeriod);
            return this;
        }

        public Builder yarnConfig(Output<AutoscalingPolicyBasicAlgorithmYarnConfigArgs> yarnConfig) {
            this.yarnConfig = Objects.requireNonNull(yarnConfig);
            return this;
        }

        public Builder yarnConfig(AutoscalingPolicyBasicAlgorithmYarnConfigArgs yarnConfig) {
            this.yarnConfig = Output.of(Objects.requireNonNull(yarnConfig));
            return this;
        }
        public AutoscalingPolicyBasicAlgorithmArgs build() {
            return new AutoscalingPolicyBasicAlgorithmArgs(cooldownPeriod, yarnConfig);
        }
    }
}
