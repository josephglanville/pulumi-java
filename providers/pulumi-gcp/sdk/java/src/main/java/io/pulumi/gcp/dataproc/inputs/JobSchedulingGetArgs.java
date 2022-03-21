// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


public final class JobSchedulingGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final JobSchedulingGetArgs Empty = new JobSchedulingGetArgs();

    @Import(name="maxFailuresPerHour", required=true)
      private final Output<Integer> maxFailuresPerHour;

    public Output<Integer> getMaxFailuresPerHour() {
        return this.maxFailuresPerHour;
    }

    @Import(name="maxFailuresTotal", required=true)
      private final Output<Integer> maxFailuresTotal;

    public Output<Integer> getMaxFailuresTotal() {
        return this.maxFailuresTotal;
    }

    public JobSchedulingGetArgs(
        Output<Integer> maxFailuresPerHour,
        Output<Integer> maxFailuresTotal) {
        this.maxFailuresPerHour = Objects.requireNonNull(maxFailuresPerHour, "expected parameter 'maxFailuresPerHour' to be non-null");
        this.maxFailuresTotal = Objects.requireNonNull(maxFailuresTotal, "expected parameter 'maxFailuresTotal' to be non-null");
    }

    private JobSchedulingGetArgs() {
        this.maxFailuresPerHour = Output.empty();
        this.maxFailuresTotal = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobSchedulingGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> maxFailuresPerHour;
        private Output<Integer> maxFailuresTotal;

        public Builder() {
    	      // Empty
        }

        public Builder(JobSchedulingGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxFailuresPerHour = defaults.maxFailuresPerHour;
    	      this.maxFailuresTotal = defaults.maxFailuresTotal;
        }

        public Builder maxFailuresPerHour(Output<Integer> maxFailuresPerHour) {
            this.maxFailuresPerHour = Objects.requireNonNull(maxFailuresPerHour);
            return this;
        }
        public Builder maxFailuresPerHour(Integer maxFailuresPerHour) {
            this.maxFailuresPerHour = Output.of(Objects.requireNonNull(maxFailuresPerHour));
            return this;
        }
        public Builder maxFailuresTotal(Output<Integer> maxFailuresTotal) {
            this.maxFailuresTotal = Objects.requireNonNull(maxFailuresTotal);
            return this;
        }
        public Builder maxFailuresTotal(Integer maxFailuresTotal) {
            this.maxFailuresTotal = Output.of(Objects.requireNonNull(maxFailuresTotal));
            return this;
        }        public JobSchedulingGetArgs build() {
            return new JobSchedulingGetArgs(maxFailuresPerHour, maxFailuresTotal);
        }
    }
}
