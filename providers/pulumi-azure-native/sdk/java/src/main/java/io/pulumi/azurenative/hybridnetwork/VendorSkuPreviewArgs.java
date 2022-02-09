// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridnetwork;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VendorSkuPreviewArgs extends io.pulumi.resources.ResourceArgs {

    public static final VendorSkuPreviewArgs Empty = new VendorSkuPreviewArgs();

    @InputImport(name="previewSubscription")
    private final @Nullable Input<String> previewSubscription;

    public Input<String> getPreviewSubscription() {
        return this.previewSubscription == null ? Input.empty() : this.previewSubscription;
    }

    @InputImport(name="skuName", required=true)
    private final Input<String> skuName;

    public Input<String> getSkuName() {
        return this.skuName;
    }

    @InputImport(name="vendorName", required=true)
    private final Input<String> vendorName;

    public Input<String> getVendorName() {
        return this.vendorName;
    }

    public VendorSkuPreviewArgs(
        @Nullable Input<String> previewSubscription,
        Input<String> skuName,
        Input<String> vendorName) {
        this.previewSubscription = previewSubscription;
        this.skuName = Objects.requireNonNull(skuName, "expected parameter 'skuName' to be non-null");
        this.vendorName = Objects.requireNonNull(vendorName, "expected parameter 'vendorName' to be non-null");
    }

    private VendorSkuPreviewArgs() {
        this.previewSubscription = Input.empty();
        this.skuName = Input.empty();
        this.vendorName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VendorSkuPreviewArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> previewSubscription;
        private Input<String> skuName;
        private Input<String> vendorName;

        public Builder() {
    	      // Empty
        }

        public Builder(VendorSkuPreviewArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.previewSubscription = defaults.previewSubscription;
    	      this.skuName = defaults.skuName;
    	      this.vendorName = defaults.vendorName;
        }

        public Builder setPreviewSubscription(@Nullable Input<String> previewSubscription) {
            this.previewSubscription = previewSubscription;
            return this;
        }

        public Builder setPreviewSubscription(@Nullable String previewSubscription) {
            this.previewSubscription = Input.ofNullable(previewSubscription);
            return this;
        }

        public Builder setSkuName(Input<String> skuName) {
            this.skuName = Objects.requireNonNull(skuName);
            return this;
        }

        public Builder setSkuName(String skuName) {
            this.skuName = Input.of(Objects.requireNonNull(skuName));
            return this;
        }

        public Builder setVendorName(Input<String> vendorName) {
            this.vendorName = Objects.requireNonNull(vendorName);
            return this;
        }

        public Builder setVendorName(String vendorName) {
            this.vendorName = Input.of(Objects.requireNonNull(vendorName));
            return this;
        }

        public VendorSkuPreviewArgs build() {
            return new VendorSkuPreviewArgs(previewSubscription, skuName, vendorName);
        }
    }
}
