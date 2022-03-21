// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetVendorSkuPreviewArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVendorSkuPreviewArgs Empty = new GetVendorSkuPreviewArgs();

    /**
     * Preview subscription ID.
     * 
     */
    @Import(name="previewSubscription", required=true)
      private final String previewSubscription;

    public String getPreviewSubscription() {
        return this.previewSubscription;
    }

    /**
     * The name of the vendor sku.
     * 
     */
    @Import(name="skuName", required=true)
      private final String skuName;

    public String getSkuName() {
        return this.skuName;
    }

    /**
     * The name of the vendor.
     * 
     */
    @Import(name="vendorName", required=true)
      private final String vendorName;

    public String getVendorName() {
        return this.vendorName;
    }

    public GetVendorSkuPreviewArgs(
        String previewSubscription,
        String skuName,
        String vendorName) {
        this.previewSubscription = Objects.requireNonNull(previewSubscription, "expected parameter 'previewSubscription' to be non-null");
        this.skuName = Objects.requireNonNull(skuName, "expected parameter 'skuName' to be non-null");
        this.vendorName = Objects.requireNonNull(vendorName, "expected parameter 'vendorName' to be non-null");
    }

    private GetVendorSkuPreviewArgs() {
        this.previewSubscription = null;
        this.skuName = null;
        this.vendorName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVendorSkuPreviewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String previewSubscription;
        private String skuName;
        private String vendorName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVendorSkuPreviewArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.previewSubscription = defaults.previewSubscription;
    	      this.skuName = defaults.skuName;
    	      this.vendorName = defaults.vendorName;
        }

        public Builder previewSubscription(String previewSubscription) {
            this.previewSubscription = Objects.requireNonNull(previewSubscription);
            return this;
        }
        public Builder skuName(String skuName) {
            this.skuName = Objects.requireNonNull(skuName);
            return this;
        }
        public Builder vendorName(String vendorName) {
            this.vendorName = Objects.requireNonNull(vendorName);
            return this;
        }        public GetVendorSkuPreviewArgs build() {
            return new GetVendorSkuPreviewArgs(previewSubscription, skuName, vendorName);
        }
    }
}
