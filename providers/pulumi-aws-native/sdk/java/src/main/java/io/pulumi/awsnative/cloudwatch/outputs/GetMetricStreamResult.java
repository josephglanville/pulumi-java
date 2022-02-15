// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudwatch.outputs;

import io.pulumi.awsnative.cloudwatch.outputs.MetricStreamFilter;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMetricStreamResult {
    private final @Nullable String arn;
    private final @Nullable String creationDate;
    private final @Nullable List<MetricStreamFilter> excludeFilters;
    private final @Nullable String firehoseArn;
    private final @Nullable List<MetricStreamFilter> includeFilters;
    private final @Nullable String lastUpdateDate;
    private final @Nullable String outputFormat;
    private final @Nullable String roleArn;
    private final @Nullable String state;

    @OutputCustomType.Constructor({"arn","creationDate","excludeFilters","firehoseArn","includeFilters","lastUpdateDate","outputFormat","roleArn","state"})
    private GetMetricStreamResult(
        @Nullable String arn,
        @Nullable String creationDate,
        @Nullable List<MetricStreamFilter> excludeFilters,
        @Nullable String firehoseArn,
        @Nullable List<MetricStreamFilter> includeFilters,
        @Nullable String lastUpdateDate,
        @Nullable String outputFormat,
        @Nullable String roleArn,
        @Nullable String state) {
        this.arn = arn;
        this.creationDate = creationDate;
        this.excludeFilters = excludeFilters;
        this.firehoseArn = firehoseArn;
        this.includeFilters = includeFilters;
        this.lastUpdateDate = lastUpdateDate;
        this.outputFormat = outputFormat;
        this.roleArn = roleArn;
        this.state = state;
    }

    public Optional<String> getArn() {
        return Optional.ofNullable(this.arn);
    }
    public Optional<String> getCreationDate() {
        return Optional.ofNullable(this.creationDate);
    }
    public List<MetricStreamFilter> getExcludeFilters() {
        return this.excludeFilters == null ? List.of() : this.excludeFilters;
    }
    public Optional<String> getFirehoseArn() {
        return Optional.ofNullable(this.firehoseArn);
    }
    public List<MetricStreamFilter> getIncludeFilters() {
        return this.includeFilters == null ? List.of() : this.includeFilters;
    }
    public Optional<String> getLastUpdateDate() {
        return Optional.ofNullable(this.lastUpdateDate);
    }
    public Optional<String> getOutputFormat() {
        return Optional.ofNullable(this.outputFormat);
    }
    public Optional<String> getRoleArn() {
        return Optional.ofNullable(this.roleArn);
    }
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetricStreamResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String creationDate;
        private @Nullable List<MetricStreamFilter> excludeFilters;
        private @Nullable String firehoseArn;
        private @Nullable List<MetricStreamFilter> includeFilters;
        private @Nullable String lastUpdateDate;
        private @Nullable String outputFormat;
        private @Nullable String roleArn;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMetricStreamResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.creationDate = defaults.creationDate;
    	      this.excludeFilters = defaults.excludeFilters;
    	      this.firehoseArn = defaults.firehoseArn;
    	      this.includeFilters = defaults.includeFilters;
    	      this.lastUpdateDate = defaults.lastUpdateDate;
    	      this.outputFormat = defaults.outputFormat;
    	      this.roleArn = defaults.roleArn;
    	      this.state = defaults.state;
        }

        public Builder setArn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }

        public Builder setCreationDate(@Nullable String creationDate) {
            this.creationDate = creationDate;
            return this;
        }

        public Builder setExcludeFilters(@Nullable List<MetricStreamFilter> excludeFilters) {
            this.excludeFilters = excludeFilters;
            return this;
        }

        public Builder setFirehoseArn(@Nullable String firehoseArn) {
            this.firehoseArn = firehoseArn;
            return this;
        }

        public Builder setIncludeFilters(@Nullable List<MetricStreamFilter> includeFilters) {
            this.includeFilters = includeFilters;
            return this;
        }

        public Builder setLastUpdateDate(@Nullable String lastUpdateDate) {
            this.lastUpdateDate = lastUpdateDate;
            return this;
        }

        public Builder setOutputFormat(@Nullable String outputFormat) {
            this.outputFormat = outputFormat;
            return this;
        }

        public Builder setRoleArn(@Nullable String roleArn) {
            this.roleArn = roleArn;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public GetMetricStreamResult build() {
            return new GetMetricStreamResult(arn, creationDate, excludeFilters, firehoseArn, includeFilters, lastUpdateDate, outputFormat, roleArn, state);
        }
    }
}