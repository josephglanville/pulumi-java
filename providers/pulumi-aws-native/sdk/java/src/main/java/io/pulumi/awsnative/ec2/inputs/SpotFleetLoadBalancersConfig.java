// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.awsnative.ec2.inputs.SpotFleetClassicLoadBalancersConfig;
import io.pulumi.awsnative.ec2.inputs.SpotFleetTargetGroupsConfig;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotFleetLoadBalancersConfig extends io.pulumi.resources.InvokeArgs {

    public static final SpotFleetLoadBalancersConfig Empty = new SpotFleetLoadBalancersConfig();

    @InputImport(name="classicLoadBalancersConfig")
      private final @Nullable SpotFleetClassicLoadBalancersConfig classicLoadBalancersConfig;

    public Optional<SpotFleetClassicLoadBalancersConfig> getClassicLoadBalancersConfig() {
        return this.classicLoadBalancersConfig == null ? Optional.empty() : Optional.ofNullable(this.classicLoadBalancersConfig);
    }

    @InputImport(name="targetGroupsConfig")
      private final @Nullable SpotFleetTargetGroupsConfig targetGroupsConfig;

    public Optional<SpotFleetTargetGroupsConfig> getTargetGroupsConfig() {
        return this.targetGroupsConfig == null ? Optional.empty() : Optional.ofNullable(this.targetGroupsConfig);
    }

    public SpotFleetLoadBalancersConfig(
        @Nullable SpotFleetClassicLoadBalancersConfig classicLoadBalancersConfig,
        @Nullable SpotFleetTargetGroupsConfig targetGroupsConfig) {
        this.classicLoadBalancersConfig = classicLoadBalancersConfig;
        this.targetGroupsConfig = targetGroupsConfig;
    }

    private SpotFleetLoadBalancersConfig() {
        this.classicLoadBalancersConfig = null;
        this.targetGroupsConfig = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SpotFleetLoadBalancersConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SpotFleetClassicLoadBalancersConfig classicLoadBalancersConfig;
        private @Nullable SpotFleetTargetGroupsConfig targetGroupsConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(SpotFleetLoadBalancersConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.classicLoadBalancersConfig = defaults.classicLoadBalancersConfig;
    	      this.targetGroupsConfig = defaults.targetGroupsConfig;
        }

        public Builder setClassicLoadBalancersConfig(@Nullable SpotFleetClassicLoadBalancersConfig classicLoadBalancersConfig) {
            this.classicLoadBalancersConfig = classicLoadBalancersConfig;
            return this;
        }

        public Builder setTargetGroupsConfig(@Nullable SpotFleetTargetGroupsConfig targetGroupsConfig) {
            this.targetGroupsConfig = targetGroupsConfig;
            return this;
        }
        public SpotFleetLoadBalancersConfig build() {
            return new SpotFleetLoadBalancersConfig(classicLoadBalancersConfig, targetGroupsConfig);
        }
    }
}
