// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.configuration.outputs;

import io.pulumi.awsnative.configuration.outputs.OrganizationConformancePackConformancePackInputParameter;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetOrganizationConformancePackResult {
    /**
     * A list of ConformancePackInputParameter objects.
     * 
     */
    private final @Nullable List<OrganizationConformancePackConformancePackInputParameter> conformancePackInputParameters;
    /**
     * AWS Config stores intermediate files while processing conformance pack template.
     * 
     */
    private final @Nullable String deliveryS3Bucket;
    /**
     * The prefix for the delivery S3 bucket.
     * 
     */
    private final @Nullable String deliveryS3KeyPrefix;
    /**
     * A list of AWS accounts to be excluded from an organization conformance pack while deploying a conformance pack.
     * 
     */
    private final @Nullable List<String> excludedAccounts;

    @CustomType.Constructor
    private GetOrganizationConformancePackResult(
        @CustomType.Parameter("conformancePackInputParameters") @Nullable List<OrganizationConformancePackConformancePackInputParameter> conformancePackInputParameters,
        @CustomType.Parameter("deliveryS3Bucket") @Nullable String deliveryS3Bucket,
        @CustomType.Parameter("deliveryS3KeyPrefix") @Nullable String deliveryS3KeyPrefix,
        @CustomType.Parameter("excludedAccounts") @Nullable List<String> excludedAccounts) {
        this.conformancePackInputParameters = conformancePackInputParameters;
        this.deliveryS3Bucket = deliveryS3Bucket;
        this.deliveryS3KeyPrefix = deliveryS3KeyPrefix;
        this.excludedAccounts = excludedAccounts;
    }

    /**
     * A list of ConformancePackInputParameter objects.
     * 
    */
    public List<OrganizationConformancePackConformancePackInputParameter> getConformancePackInputParameters() {
        return this.conformancePackInputParameters == null ? List.of() : this.conformancePackInputParameters;
    }
    /**
     * AWS Config stores intermediate files while processing conformance pack template.
     * 
    */
    public Optional<String> getDeliveryS3Bucket() {
        return Optional.ofNullable(this.deliveryS3Bucket);
    }
    /**
     * The prefix for the delivery S3 bucket.
     * 
    */
    public Optional<String> getDeliveryS3KeyPrefix() {
        return Optional.ofNullable(this.deliveryS3KeyPrefix);
    }
    /**
     * A list of AWS accounts to be excluded from an organization conformance pack while deploying a conformance pack.
     * 
    */
    public List<String> getExcludedAccounts() {
        return this.excludedAccounts == null ? List.of() : this.excludedAccounts;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetOrganizationConformancePackResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<OrganizationConformancePackConformancePackInputParameter> conformancePackInputParameters;
        private @Nullable String deliveryS3Bucket;
        private @Nullable String deliveryS3KeyPrefix;
        private @Nullable List<String> excludedAccounts;

        public Builder() {
    	      // Empty
        }

        public Builder(GetOrganizationConformancePackResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conformancePackInputParameters = defaults.conformancePackInputParameters;
    	      this.deliveryS3Bucket = defaults.deliveryS3Bucket;
    	      this.deliveryS3KeyPrefix = defaults.deliveryS3KeyPrefix;
    	      this.excludedAccounts = defaults.excludedAccounts;
        }

        public Builder conformancePackInputParameters(@Nullable List<OrganizationConformancePackConformancePackInputParameter> conformancePackInputParameters) {
            this.conformancePackInputParameters = conformancePackInputParameters;
            return this;
        }
        public Builder conformancePackInputParameters(OrganizationConformancePackConformancePackInputParameter... conformancePackInputParameters) {
            return conformancePackInputParameters(List.of(conformancePackInputParameters));
        }
        public Builder deliveryS3Bucket(@Nullable String deliveryS3Bucket) {
            this.deliveryS3Bucket = deliveryS3Bucket;
            return this;
        }
        public Builder deliveryS3KeyPrefix(@Nullable String deliveryS3KeyPrefix) {
            this.deliveryS3KeyPrefix = deliveryS3KeyPrefix;
            return this;
        }
        public Builder excludedAccounts(@Nullable List<String> excludedAccounts) {
            this.excludedAccounts = excludedAccounts;
            return this;
        }
        public Builder excludedAccounts(String... excludedAccounts) {
            return excludedAccounts(List.of(excludedAccounts));
        }        public GetOrganizationConformancePackResult build() {
            return new GetOrganizationConformancePackResult(conformancePackInputParameters, deliveryS3Bucket, deliveryS3KeyPrefix, excludedAccounts);
        }
    }
}
