// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecRestartPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecRestartPolicyGetArgs Empty = new ServiceTaskSpecRestartPolicyGetArgs();

    @Import(name="condition")
      private final @Nullable Output<String> condition;

    public Output<String> getCondition() {
        return this.condition == null ? Codegen.empty() : this.condition;
    }

    @Import(name="delay")
      private final @Nullable Output<String> delay;

    public Output<String> getDelay() {
        return this.delay == null ? Codegen.empty() : this.delay;
    }

    @Import(name="maxAttempts")
      private final @Nullable Output<Integer> maxAttempts;

    public Output<Integer> getMaxAttempts() {
        return this.maxAttempts == null ? Codegen.empty() : this.maxAttempts;
    }

    @Import(name="window")
      private final @Nullable Output<String> window;

    public Output<String> getWindow() {
        return this.window == null ? Codegen.empty() : this.window;
    }

    public ServiceTaskSpecRestartPolicyGetArgs(
        @Nullable Output<String> condition,
        @Nullable Output<String> delay,
        @Nullable Output<Integer> maxAttempts,
        @Nullable Output<String> window) {
        this.condition = condition;
        this.delay = delay;
        this.maxAttempts = maxAttempts;
        this.window = window;
    }

    private ServiceTaskSpecRestartPolicyGetArgs() {
        this.condition = Codegen.empty();
        this.delay = Codegen.empty();
        this.maxAttempts = Codegen.empty();
        this.window = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecRestartPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> condition;
        private @Nullable Output<String> delay;
        private @Nullable Output<Integer> maxAttempts;
        private @Nullable Output<String> window;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecRestartPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.delay = defaults.delay;
    	      this.maxAttempts = defaults.maxAttempts;
    	      this.window = defaults.window;
        }

        public Builder condition(@Nullable Output<String> condition) {
            this.condition = condition;
            return this;
        }
        public Builder condition(@Nullable String condition) {
            this.condition = Codegen.ofNullable(condition);
            return this;
        }
        public Builder delay(@Nullable Output<String> delay) {
            this.delay = delay;
            return this;
        }
        public Builder delay(@Nullable String delay) {
            this.delay = Codegen.ofNullable(delay);
            return this;
        }
        public Builder maxAttempts(@Nullable Output<Integer> maxAttempts) {
            this.maxAttempts = maxAttempts;
            return this;
        }
        public Builder maxAttempts(@Nullable Integer maxAttempts) {
            this.maxAttempts = Codegen.ofNullable(maxAttempts);
            return this;
        }
        public Builder window(@Nullable Output<String> window) {
            this.window = window;
            return this;
        }
        public Builder window(@Nullable String window) {
            this.window = Codegen.ofNullable(window);
            return this;
        }        public ServiceTaskSpecRestartPolicyGetArgs build() {
            return new ServiceTaskSpecRestartPolicyGetArgs(condition, delay, maxAttempts, window);
        }
    }
}
