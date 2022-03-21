// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.synthetics.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CanaryRunConfig extends io.pulumi.resources.InvokeArgs {

    public static final CanaryRunConfig Empty = new CanaryRunConfig();

    /**
     * Enable active tracing if set to true
     * 
     */
    @Import(name="activeTracing")
      private final @Nullable Boolean activeTracing;

    public Optional<Boolean> getActiveTracing() {
        return this.activeTracing == null ? Optional.empty() : Optional.ofNullable(this.activeTracing);
    }

    /**
     * Environment variable key-value pairs.
     * 
     */
    @Import(name="environmentVariables")
      private final @Nullable Object environmentVariables;

    public Optional<Object> getEnvironmentVariables() {
        return this.environmentVariables == null ? Optional.empty() : Optional.ofNullable(this.environmentVariables);
    }

    /**
     * Provide maximum memory available for canary in MB
     * 
     */
    @Import(name="memoryInMB")
      private final @Nullable Integer memoryInMB;

    public Optional<Integer> getMemoryInMB() {
        return this.memoryInMB == null ? Optional.empty() : Optional.ofNullable(this.memoryInMB);
    }

    /**
     * Provide maximum canary timeout per run in seconds
     * 
     */
    @Import(name="timeoutInSeconds")
      private final @Nullable Integer timeoutInSeconds;

    public Optional<Integer> getTimeoutInSeconds() {
        return this.timeoutInSeconds == null ? Optional.empty() : Optional.ofNullable(this.timeoutInSeconds);
    }

    public CanaryRunConfig(
        @Nullable Boolean activeTracing,
        @Nullable Object environmentVariables,
        @Nullable Integer memoryInMB,
        @Nullable Integer timeoutInSeconds) {
        this.activeTracing = activeTracing;
        this.environmentVariables = environmentVariables;
        this.memoryInMB = memoryInMB;
        this.timeoutInSeconds = timeoutInSeconds;
    }

    private CanaryRunConfig() {
        this.activeTracing = null;
        this.environmentVariables = null;
        this.memoryInMB = null;
        this.timeoutInSeconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CanaryRunConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean activeTracing;
        private @Nullable Object environmentVariables;
        private @Nullable Integer memoryInMB;
        private @Nullable Integer timeoutInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(CanaryRunConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeTracing = defaults.activeTracing;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.memoryInMB = defaults.memoryInMB;
    	      this.timeoutInSeconds = defaults.timeoutInSeconds;
        }

        public Builder activeTracing(@Nullable Boolean activeTracing) {
            this.activeTracing = activeTracing;
            return this;
        }
        public Builder environmentVariables(@Nullable Object environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }
        public Builder memoryInMB(@Nullable Integer memoryInMB) {
            this.memoryInMB = memoryInMB;
            return this;
        }
        public Builder timeoutInSeconds(@Nullable Integer timeoutInSeconds) {
            this.timeoutInSeconds = timeoutInSeconds;
            return this;
        }        public CanaryRunConfig build() {
            return new CanaryRunConfig(activeTracing, environmentVariables, memoryInMB, timeoutInSeconds);
        }
    }
}
