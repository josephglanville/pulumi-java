// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.mwaa.outputs;

import io.pulumi.awsnative.mwaa.enums.EnvironmentLoggingLevel;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EnvironmentModuleLoggingConfiguration {
    private final @Nullable String cloudWatchLogGroupArn;
    private final @Nullable Boolean enabled;
    private final @Nullable EnvironmentLoggingLevel logLevel;

    @CustomType.Constructor
    private EnvironmentModuleLoggingConfiguration(
        @CustomType.Parameter("cloudWatchLogGroupArn") @Nullable String cloudWatchLogGroupArn,
        @CustomType.Parameter("enabled") @Nullable Boolean enabled,
        @CustomType.Parameter("logLevel") @Nullable EnvironmentLoggingLevel logLevel) {
        this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
        this.enabled = enabled;
        this.logLevel = logLevel;
    }

    public Optional<String> getCloudWatchLogGroupArn() {
        return Optional.ofNullable(this.cloudWatchLogGroupArn);
    }
    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<EnvironmentLoggingLevel> getLogLevel() {
        return Optional.ofNullable(this.logLevel);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentModuleLoggingConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String cloudWatchLogGroupArn;
        private @Nullable Boolean enabled;
        private @Nullable EnvironmentLoggingLevel logLevel;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentModuleLoggingConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cloudWatchLogGroupArn = defaults.cloudWatchLogGroupArn;
    	      this.enabled = defaults.enabled;
    	      this.logLevel = defaults.logLevel;
        }

        public Builder cloudWatchLogGroupArn(@Nullable String cloudWatchLogGroupArn) {
            this.cloudWatchLogGroupArn = cloudWatchLogGroupArn;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder logLevel(@Nullable EnvironmentLoggingLevel logLevel) {
            this.logLevel = logLevel;
            return this;
        }        public EnvironmentModuleLoggingConfiguration build() {
            return new EnvironmentModuleLoggingConfiguration(cloudWatchLogGroupArn, enabled, logLevel);
        }
    }
}
