// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.route53;

import io.pulumi.awsnative.route53.inputs.HealthCheckConfigPropertiesArgs;
import io.pulumi.awsnative.route53.inputs.HealthCheckTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class HealthCheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final HealthCheckArgs Empty = new HealthCheckArgs();

    /**
     * A complex type that contains information about the health check.
     * 
     */
    @InputImport(name="healthCheckConfig", required=true)
      private final Input<HealthCheckConfigPropertiesArgs> healthCheckConfig;

    public Input<HealthCheckConfigPropertiesArgs> getHealthCheckConfig() {
        return this.healthCheckConfig;
    }

    /**
     * An array of key-value pairs to apply to this resource.
     * 
     */
    @InputImport(name="healthCheckTags")
      private final @Nullable Input<List<HealthCheckTagArgs>> healthCheckTags;

    public Input<List<HealthCheckTagArgs>> getHealthCheckTags() {
        return this.healthCheckTags == null ? Input.empty() : this.healthCheckTags;
    }

    public HealthCheckArgs(
        Input<HealthCheckConfigPropertiesArgs> healthCheckConfig,
        @Nullable Input<List<HealthCheckTagArgs>> healthCheckTags) {
        this.healthCheckConfig = Objects.requireNonNull(healthCheckConfig, "expected parameter 'healthCheckConfig' to be non-null");
        this.healthCheckTags = healthCheckTags;
    }

    private HealthCheckArgs() {
        this.healthCheckConfig = Input.empty();
        this.healthCheckTags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HealthCheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<HealthCheckConfigPropertiesArgs> healthCheckConfig;
        private @Nullable Input<List<HealthCheckTagArgs>> healthCheckTags;

        public Builder() {
    	      // Empty
        }

        public Builder(HealthCheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.healthCheckConfig = defaults.healthCheckConfig;
    	      this.healthCheckTags = defaults.healthCheckTags;
        }

        public Builder setHealthCheckConfig(Input<HealthCheckConfigPropertiesArgs> healthCheckConfig) {
            this.healthCheckConfig = Objects.requireNonNull(healthCheckConfig);
            return this;
        }

        public Builder setHealthCheckConfig(HealthCheckConfigPropertiesArgs healthCheckConfig) {
            this.healthCheckConfig = Input.of(Objects.requireNonNull(healthCheckConfig));
            return this;
        }

        public Builder setHealthCheckTags(@Nullable Input<List<HealthCheckTagArgs>> healthCheckTags) {
            this.healthCheckTags = healthCheckTags;
            return this;
        }

        public Builder setHealthCheckTags(@Nullable List<HealthCheckTagArgs> healthCheckTags) {
            this.healthCheckTags = Input.ofNullable(healthCheckTags);
            return this;
        }
        public HealthCheckArgs build() {
            return new HealthCheckArgs(healthCheckConfig, healthCheckTags);
        }
    }
}
