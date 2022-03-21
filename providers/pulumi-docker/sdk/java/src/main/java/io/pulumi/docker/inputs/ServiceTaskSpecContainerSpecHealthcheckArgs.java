// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServiceTaskSpecContainerSpecHealthcheckArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceTaskSpecContainerSpecHealthcheckArgs Empty = new ServiceTaskSpecContainerSpecHealthcheckArgs();

    @Import(name="interval")
      private final @Nullable Output<String> interval;

    public Output<String> getInterval() {
        return this.interval == null ? Output.empty() : this.interval;
    }

    @Import(name="retries")
      private final @Nullable Output<Integer> retries;

    public Output<Integer> getRetries() {
        return this.retries == null ? Output.empty() : this.retries;
    }

    @Import(name="startPeriod")
      private final @Nullable Output<String> startPeriod;

    public Output<String> getStartPeriod() {
        return this.startPeriod == null ? Output.empty() : this.startPeriod;
    }

    @Import(name="tests", required=true)
      private final Output<List<String>> tests;

    public Output<List<String>> getTests() {
        return this.tests;
    }

    @Import(name="timeout")
      private final @Nullable Output<String> timeout;

    public Output<String> getTimeout() {
        return this.timeout == null ? Output.empty() : this.timeout;
    }

    public ServiceTaskSpecContainerSpecHealthcheckArgs(
        @Nullable Output<String> interval,
        @Nullable Output<Integer> retries,
        @Nullable Output<String> startPeriod,
        Output<List<String>> tests,
        @Nullable Output<String> timeout) {
        this.interval = interval;
        this.retries = retries;
        this.startPeriod = startPeriod;
        this.tests = Objects.requireNonNull(tests, "expected parameter 'tests' to be non-null");
        this.timeout = timeout;
    }

    private ServiceTaskSpecContainerSpecHealthcheckArgs() {
        this.interval = Output.empty();
        this.retries = Output.empty();
        this.startPeriod = Output.empty();
        this.tests = Output.empty();
        this.timeout = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceTaskSpecContainerSpecHealthcheckArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> interval;
        private @Nullable Output<Integer> retries;
        private @Nullable Output<String> startPeriod;
        private Output<List<String>> tests;
        private @Nullable Output<String> timeout;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceTaskSpecContainerSpecHealthcheckArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.interval = defaults.interval;
    	      this.retries = defaults.retries;
    	      this.startPeriod = defaults.startPeriod;
    	      this.tests = defaults.tests;
    	      this.timeout = defaults.timeout;
        }

        public Builder interval(@Nullable Output<String> interval) {
            this.interval = interval;
            return this;
        }
        public Builder interval(@Nullable String interval) {
            this.interval = Output.ofNullable(interval);
            return this;
        }
        public Builder retries(@Nullable Output<Integer> retries) {
            this.retries = retries;
            return this;
        }
        public Builder retries(@Nullable Integer retries) {
            this.retries = Output.ofNullable(retries);
            return this;
        }
        public Builder startPeriod(@Nullable Output<String> startPeriod) {
            this.startPeriod = startPeriod;
            return this;
        }
        public Builder startPeriod(@Nullable String startPeriod) {
            this.startPeriod = Output.ofNullable(startPeriod);
            return this;
        }
        public Builder tests(Output<List<String>> tests) {
            this.tests = Objects.requireNonNull(tests);
            return this;
        }
        public Builder tests(List<String> tests) {
            this.tests = Output.of(Objects.requireNonNull(tests));
            return this;
        }
        public Builder tests(String... tests) {
            return tests(List.of(tests));
        }
        public Builder timeout(@Nullable Output<String> timeout) {
            this.timeout = timeout;
            return this;
        }
        public Builder timeout(@Nullable String timeout) {
            this.timeout = Output.ofNullable(timeout);
            return this;
        }        public ServiceTaskSpecContainerSpecHealthcheckArgs build() {
            return new ServiceTaskSpecContainerSpecHealthcheckArgs(interval, retries, startPeriod, tests, timeout);
        }
    }
}
