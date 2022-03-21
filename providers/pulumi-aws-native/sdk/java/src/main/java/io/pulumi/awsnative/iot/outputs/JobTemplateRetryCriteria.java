// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.outputs;

import io.pulumi.awsnative.iot.enums.JobTemplateJobRetryFailureType;
import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobTemplateRetryCriteria {
    private final @Nullable JobTemplateJobRetryFailureType failureType;
    private final @Nullable Integer numberOfRetries;

    @CustomType.Constructor
    private JobTemplateRetryCriteria(
        @CustomType.Parameter("failureType") @Nullable JobTemplateJobRetryFailureType failureType,
        @CustomType.Parameter("numberOfRetries") @Nullable Integer numberOfRetries) {
        this.failureType = failureType;
        this.numberOfRetries = numberOfRetries;
    }

    public Optional<JobTemplateJobRetryFailureType> getFailureType() {
        return Optional.ofNullable(this.failureType);
    }
    public Optional<Integer> getNumberOfRetries() {
        return Optional.ofNullable(this.numberOfRetries);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobTemplateRetryCriteria defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable JobTemplateJobRetryFailureType failureType;
        private @Nullable Integer numberOfRetries;

        public Builder() {
    	      // Empty
        }

        public Builder(JobTemplateRetryCriteria defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failureType = defaults.failureType;
    	      this.numberOfRetries = defaults.numberOfRetries;
        }

        public Builder failureType(@Nullable JobTemplateJobRetryFailureType failureType) {
            this.failureType = failureType;
            return this;
        }
        public Builder numberOfRetries(@Nullable Integer numberOfRetries) {
            this.numberOfRetries = numberOfRetries;
            return this;
        }        public JobTemplateRetryCriteria build() {
            return new JobTemplateRetryCriteria(failureType, numberOfRetries);
        }
    }
}
