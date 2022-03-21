// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.scheduler.outputs;

import io.pulumi.azurenative.scheduler.outputs.JobCollectionQuotaResponse;
import io.pulumi.azurenative.scheduler.outputs.SkuResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class JobCollectionPropertiesResponse {
    /**
     * Gets or sets the job collection quota.
     * 
     */
    private final @Nullable JobCollectionQuotaResponse quota;
    /**
     * Gets or sets the SKU.
     * 
     */
    private final @Nullable SkuResponse sku;
    /**
     * Gets or sets the state.
     * 
     */
    private final @Nullable String state;

    @CustomType.Constructor
    private JobCollectionPropertiesResponse(
        @CustomType.Parameter("quota") @Nullable JobCollectionQuotaResponse quota,
        @CustomType.Parameter("sku") @Nullable SkuResponse sku,
        @CustomType.Parameter("state") @Nullable String state) {
        this.quota = quota;
        this.sku = sku;
        this.state = state;
    }

    /**
     * Gets or sets the job collection quota.
     * 
    */
    public Optional<JobCollectionQuotaResponse> getQuota() {
        return Optional.ofNullable(this.quota);
    }
    /**
     * Gets or sets the SKU.
     * 
    */
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * Gets or sets the state.
     * 
    */
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JobCollectionPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable JobCollectionQuotaResponse quota;
        private @Nullable SkuResponse sku;
        private @Nullable String state;

        public Builder() {
    	      // Empty
        }

        public Builder(JobCollectionPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.quota = defaults.quota;
    	      this.sku = defaults.sku;
    	      this.state = defaults.state;
        }

        public Builder quota(@Nullable JobCollectionQuotaResponse quota) {
            this.quota = quota;
            return this;
        }
        public Builder sku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }        public JobCollectionPropertiesResponse build() {
            return new JobCollectionPropertiesResponse(quota, sku, state);
        }
    }
}
