// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApplicationAppversionLifecycleArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationAppversionLifecycleArgs Empty = new ApplicationAppversionLifecycleArgs();

    /**
     * Set to `true` to delete a version's source bundle from S3 when the application version is deleted.
     * 
     */
    @InputImport(name="deleteSourceFromS3")
      private final @Nullable Output<Boolean> deleteSourceFromS3;

    public Output<Boolean> getDeleteSourceFromS3() {
        return this.deleteSourceFromS3 == null ? Output.empty() : this.deleteSourceFromS3;
    }

    /**
     * The number of days to retain an application version ('max_age_in_days' and 'max_count' cannot be enabled simultaneously.).
     * 
     */
    @InputImport(name="maxAgeInDays")
      private final @Nullable Output<Integer> maxAgeInDays;

    public Output<Integer> getMaxAgeInDays() {
        return this.maxAgeInDays == null ? Output.empty() : this.maxAgeInDays;
    }

    /**
     * The maximum number of application versions to retain ('max_age_in_days' and 'max_count' cannot be enabled simultaneously.).
     * 
     */
    @InputImport(name="maxCount")
      private final @Nullable Output<Integer> maxCount;

    public Output<Integer> getMaxCount() {
        return this.maxCount == null ? Output.empty() : this.maxCount;
    }

    /**
     * The ARN of an IAM service role under which the application version is deleted.  Elastic Beanstalk must have permission to assume this role.
     * 
     */
    @InputImport(name="serviceRole", required=true)
      private final Output<String> serviceRole;

    public Output<String> getServiceRole() {
        return this.serviceRole;
    }

    public ApplicationAppversionLifecycleArgs(
        @Nullable Output<Boolean> deleteSourceFromS3,
        @Nullable Output<Integer> maxAgeInDays,
        @Nullable Output<Integer> maxCount,
        Output<String> serviceRole) {
        this.deleteSourceFromS3 = deleteSourceFromS3;
        this.maxAgeInDays = maxAgeInDays;
        this.maxCount = maxCount;
        this.serviceRole = Objects.requireNonNull(serviceRole, "expected parameter 'serviceRole' to be non-null");
    }

    private ApplicationAppversionLifecycleArgs() {
        this.deleteSourceFromS3 = Output.empty();
        this.maxAgeInDays = Output.empty();
        this.maxCount = Output.empty();
        this.serviceRole = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationAppversionLifecycleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> deleteSourceFromS3;
        private @Nullable Output<Integer> maxAgeInDays;
        private @Nullable Output<Integer> maxCount;
        private Output<String> serviceRole;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationAppversionLifecycleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteSourceFromS3 = defaults.deleteSourceFromS3;
    	      this.maxAgeInDays = defaults.maxAgeInDays;
    	      this.maxCount = defaults.maxCount;
    	      this.serviceRole = defaults.serviceRole;
        }

        public Builder deleteSourceFromS3(@Nullable Output<Boolean> deleteSourceFromS3) {
            this.deleteSourceFromS3 = deleteSourceFromS3;
            return this;
        }

        public Builder deleteSourceFromS3(@Nullable Boolean deleteSourceFromS3) {
            this.deleteSourceFromS3 = Output.ofNullable(deleteSourceFromS3);
            return this;
        }

        public Builder maxAgeInDays(@Nullable Output<Integer> maxAgeInDays) {
            this.maxAgeInDays = maxAgeInDays;
            return this;
        }

        public Builder maxAgeInDays(@Nullable Integer maxAgeInDays) {
            this.maxAgeInDays = Output.ofNullable(maxAgeInDays);
            return this;
        }

        public Builder maxCount(@Nullable Output<Integer> maxCount) {
            this.maxCount = maxCount;
            return this;
        }

        public Builder maxCount(@Nullable Integer maxCount) {
            this.maxCount = Output.ofNullable(maxCount);
            return this;
        }

        public Builder serviceRole(Output<String> serviceRole) {
            this.serviceRole = Objects.requireNonNull(serviceRole);
            return this;
        }

        public Builder serviceRole(String serviceRole) {
            this.serviceRole = Output.of(Objects.requireNonNull(serviceRole));
            return this;
        }
        public ApplicationAppversionLifecycleArgs build() {
            return new ApplicationAppversionLifecycleArgs(deleteSourceFromS3, maxAgeInDays, maxCount, serviceRole);
        }
    }
}
