// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.awsnative.databrew.outputs.JobParameterMap;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class JobStatisticOverride {
    private final JobParameterMap parameters;
    private final String statistic;

    @CustomType.Constructor
    private JobStatisticOverride(
        @CustomType.Parameter("parameters") JobParameterMap parameters,
        @CustomType.Parameter("statistic") String statistic) {
        this.parameters = parameters;
        this.statistic = statistic;
    }

    public JobParameterMap getParameters() {
        return this.parameters;
    }
    public String getStatistic() {
        return this.statistic;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobStatisticOverride defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private JobParameterMap parameters;
        private String statistic;

        public Builder() {
    	      // Empty
        }

        public Builder(JobStatisticOverride defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.parameters = defaults.parameters;
    	      this.statistic = defaults.statistic;
        }

        public Builder parameters(JobParameterMap parameters) {
            this.parameters = Objects.requireNonNull(parameters);
            return this;
        }
        public Builder statistic(String statistic) {
            this.statistic = Objects.requireNonNull(statistic);
            return this;
        }        public JobStatisticOverride build() {
            return new JobStatisticOverride(parameters, statistic);
        }
    }
}
