// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProvisionedProductStackSetProvisioningPreferencesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProvisionedProductStackSetProvisioningPreferencesArgs Empty = new ProvisionedProductStackSetProvisioningPreferencesArgs();

    /**
     * One or more AWS accounts that will have access to the provisioned product. The AWS accounts specified should be within the list of accounts in the STACKSET constraint. To get the list of accounts in the STACKSET constraint, use the `aws_servicecatalog_provisioning_parameters` data source. If no values are specified, the default value is all accounts from the STACKSET constraint.
     * 
     */
    @Import(name="accounts")
      private final @Nullable Output<List<String>> accounts;

    public Output<List<String>> getAccounts() {
        return this.accounts == null ? Output.empty() : this.accounts;
    }

    /**
     * Number of accounts, per region, for which this operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the operation in any subsequent regions. You must specify either `failure_tolerance_count` or `failure_tolerance_percentage`, but not both. The default value is 0 if no value is specified.
     * 
     */
    @Import(name="failureToleranceCount")
      private final @Nullable Output<Integer> failureToleranceCount;

    public Output<Integer> getFailureToleranceCount() {
        return this.failureToleranceCount == null ? Output.empty() : this.failureToleranceCount;
    }

    /**
     * Percentage of accounts, per region, for which this stack operation can fail before AWS Service Catalog stops the operation in that region. If the operation is stopped in a region, AWS Service Catalog doesn't attempt the operation in any subsequent regions. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. You must specify either `failure_tolerance_count` or `failure_tolerance_percentage`, but not both.
     * 
     */
    @Import(name="failureTolerancePercentage")
      private final @Nullable Output<Integer> failureTolerancePercentage;

    public Output<Integer> getFailureTolerancePercentage() {
        return this.failureTolerancePercentage == null ? Output.empty() : this.failureTolerancePercentage;
    }

    /**
     * Maximum number of accounts in which to perform this operation at one time. This is dependent on the value of `failure_tolerance_count`. `max_concurrency_count` is at most one more than the `failure_tolerance_count`. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. You must specify either `max_concurrency_count` or `max_concurrency_percentage`, but not both.
     * 
     */
    @Import(name="maxConcurrencyCount")
      private final @Nullable Output<Integer> maxConcurrencyCount;

    public Output<Integer> getMaxConcurrencyCount() {
        return this.maxConcurrencyCount == null ? Output.empty() : this.maxConcurrencyCount;
    }

    /**
     * Maximum percentage of accounts in which to perform this operation at one time. When calculating the number of accounts based on the specified percentage, AWS Service Catalog rounds down to the next whole number. This is true except in cases where rounding down would result is zero. In this case, AWS Service Catalog sets the number as 1 instead. Note that this setting lets you specify the maximum for operations. For large deployments, under certain circumstances the actual number of accounts acted upon concurrently may be lower due to service throttling. You must specify either `max_concurrency_count` or `max_concurrency_percentage`, but not both.
     * 
     */
    @Import(name="maxConcurrencyPercentage")
      private final @Nullable Output<Integer> maxConcurrencyPercentage;

    public Output<Integer> getMaxConcurrencyPercentage() {
        return this.maxConcurrencyPercentage == null ? Output.empty() : this.maxConcurrencyPercentage;
    }

    /**
     * One or more AWS Regions where the provisioned product will be available. The specified regions should be within the list of regions from the STACKSET constraint. To get the list of regions in the STACKSET constraint, use the `aws_servicecatalog_provisioning_parameters` data source. If no values are specified, the default value is all regions from the STACKSET constraint.
     * 
     */
    @Import(name="regions")
      private final @Nullable Output<List<String>> regions;

    public Output<List<String>> getRegions() {
        return this.regions == null ? Output.empty() : this.regions;
    }

    public ProvisionedProductStackSetProvisioningPreferencesArgs(
        @Nullable Output<List<String>> accounts,
        @Nullable Output<Integer> failureToleranceCount,
        @Nullable Output<Integer> failureTolerancePercentage,
        @Nullable Output<Integer> maxConcurrencyCount,
        @Nullable Output<Integer> maxConcurrencyPercentage,
        @Nullable Output<List<String>> regions) {
        this.accounts = accounts;
        this.failureToleranceCount = failureToleranceCount;
        this.failureTolerancePercentage = failureTolerancePercentage;
        this.maxConcurrencyCount = maxConcurrencyCount;
        this.maxConcurrencyPercentage = maxConcurrencyPercentage;
        this.regions = regions;
    }

    private ProvisionedProductStackSetProvisioningPreferencesArgs() {
        this.accounts = Output.empty();
        this.failureToleranceCount = Output.empty();
        this.failureTolerancePercentage = Output.empty();
        this.maxConcurrencyCount = Output.empty();
        this.maxConcurrencyPercentage = Output.empty();
        this.regions = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProvisionedProductStackSetProvisioningPreferencesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> accounts;
        private @Nullable Output<Integer> failureToleranceCount;
        private @Nullable Output<Integer> failureTolerancePercentage;
        private @Nullable Output<Integer> maxConcurrencyCount;
        private @Nullable Output<Integer> maxConcurrencyPercentage;
        private @Nullable Output<List<String>> regions;

        public Builder() {
    	      // Empty
        }

        public Builder(ProvisionedProductStackSetProvisioningPreferencesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accounts = defaults.accounts;
    	      this.failureToleranceCount = defaults.failureToleranceCount;
    	      this.failureTolerancePercentage = defaults.failureTolerancePercentage;
    	      this.maxConcurrencyCount = defaults.maxConcurrencyCount;
    	      this.maxConcurrencyPercentage = defaults.maxConcurrencyPercentage;
    	      this.regions = defaults.regions;
        }

        public Builder accounts(@Nullable Output<List<String>> accounts) {
            this.accounts = accounts;
            return this;
        }
        public Builder accounts(@Nullable List<String> accounts) {
            this.accounts = Output.ofNullable(accounts);
            return this;
        }
        public Builder accounts(String... accounts) {
            return accounts(List.of(accounts));
        }
        public Builder failureToleranceCount(@Nullable Output<Integer> failureToleranceCount) {
            this.failureToleranceCount = failureToleranceCount;
            return this;
        }
        public Builder failureToleranceCount(@Nullable Integer failureToleranceCount) {
            this.failureToleranceCount = Output.ofNullable(failureToleranceCount);
            return this;
        }
        public Builder failureTolerancePercentage(@Nullable Output<Integer> failureTolerancePercentage) {
            this.failureTolerancePercentage = failureTolerancePercentage;
            return this;
        }
        public Builder failureTolerancePercentage(@Nullable Integer failureTolerancePercentage) {
            this.failureTolerancePercentage = Output.ofNullable(failureTolerancePercentage);
            return this;
        }
        public Builder maxConcurrencyCount(@Nullable Output<Integer> maxConcurrencyCount) {
            this.maxConcurrencyCount = maxConcurrencyCount;
            return this;
        }
        public Builder maxConcurrencyCount(@Nullable Integer maxConcurrencyCount) {
            this.maxConcurrencyCount = Output.ofNullable(maxConcurrencyCount);
            return this;
        }
        public Builder maxConcurrencyPercentage(@Nullable Output<Integer> maxConcurrencyPercentage) {
            this.maxConcurrencyPercentage = maxConcurrencyPercentage;
            return this;
        }
        public Builder maxConcurrencyPercentage(@Nullable Integer maxConcurrencyPercentage) {
            this.maxConcurrencyPercentage = Output.ofNullable(maxConcurrencyPercentage);
            return this;
        }
        public Builder regions(@Nullable Output<List<String>> regions) {
            this.regions = regions;
            return this;
        }
        public Builder regions(@Nullable List<String> regions) {
            this.regions = Output.ofNullable(regions);
            return this;
        }
        public Builder regions(String... regions) {
            return regions(List.of(regions));
        }        public ProvisionedProductStackSetProvisioningPreferencesArgs build() {
            return new ProvisionedProductStackSetProvisioningPreferencesArgs(accounts, failureToleranceCount, failureTolerancePercentage, maxConcurrencyCount, maxConcurrencyPercentage, regions);
        }
    }
}
