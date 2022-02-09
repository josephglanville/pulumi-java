// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppPremierAddOnArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppPremierAddOnArgs Empty = new WebAppPremierAddOnArgs();

    @InputImport(name="kind")
    private final @Nullable Input<String> kind;

    public Input<String> getKind() {
        return this.kind == null ? Input.empty() : this.kind;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="marketplaceOffer")
    private final @Nullable Input<String> marketplaceOffer;

    public Input<String> getMarketplaceOffer() {
        return this.marketplaceOffer == null ? Input.empty() : this.marketplaceOffer;
    }

    @InputImport(name="marketplacePublisher")
    private final @Nullable Input<String> marketplacePublisher;

    public Input<String> getMarketplacePublisher() {
        return this.marketplacePublisher == null ? Input.empty() : this.marketplacePublisher;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="premierAddOnName")
    private final @Nullable Input<String> premierAddOnName;

    public Input<String> getPremierAddOnName() {
        return this.premierAddOnName == null ? Input.empty() : this.premierAddOnName;
    }

    @InputImport(name="product")
    private final @Nullable Input<String> product;

    public Input<String> getProduct() {
        return this.product == null ? Input.empty() : this.product;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="sku")
    private final @Nullable Input<String> sku;

    public Input<String> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    @InputImport(name="vendor")
    private final @Nullable Input<String> vendor;

    public Input<String> getVendor() {
        return this.vendor == null ? Input.empty() : this.vendor;
    }

    public WebAppPremierAddOnArgs(
        @Nullable Input<String> kind,
        @Nullable Input<String> location,
        @Nullable Input<String> marketplaceOffer,
        @Nullable Input<String> marketplacePublisher,
        Input<String> name,
        @Nullable Input<String> premierAddOnName,
        @Nullable Input<String> product,
        Input<String> resourceGroupName,
        @Nullable Input<String> sku,
        @Nullable Input<Map<String,String>> tags,
        @Nullable Input<String> vendor) {
        this.kind = kind;
        this.location = location;
        this.marketplaceOffer = marketplaceOffer;
        this.marketplacePublisher = marketplacePublisher;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.premierAddOnName = premierAddOnName;
        this.product = product;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.sku = sku;
        this.tags = tags;
        this.vendor = vendor;
    }

    private WebAppPremierAddOnArgs() {
        this.kind = Input.empty();
        this.location = Input.empty();
        this.marketplaceOffer = Input.empty();
        this.marketplacePublisher = Input.empty();
        this.name = Input.empty();
        this.premierAddOnName = Input.empty();
        this.product = Input.empty();
        this.resourceGroupName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
        this.vendor = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppPremierAddOnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> kind;
        private @Nullable Input<String> location;
        private @Nullable Input<String> marketplaceOffer;
        private @Nullable Input<String> marketplacePublisher;
        private Input<String> name;
        private @Nullable Input<String> premierAddOnName;
        private @Nullable Input<String> product;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> sku;
        private @Nullable Input<Map<String,String>> tags;
        private @Nullable Input<String> vendor;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppPremierAddOnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kind = defaults.kind;
    	      this.location = defaults.location;
    	      this.marketplaceOffer = defaults.marketplaceOffer;
    	      this.marketplacePublisher = defaults.marketplacePublisher;
    	      this.name = defaults.name;
    	      this.premierAddOnName = defaults.premierAddOnName;
    	      this.product = defaults.product;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.vendor = defaults.vendor;
        }

        public Builder setKind(@Nullable Input<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = Input.ofNullable(kind);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMarketplaceOffer(@Nullable Input<String> marketplaceOffer) {
            this.marketplaceOffer = marketplaceOffer;
            return this;
        }

        public Builder setMarketplaceOffer(@Nullable String marketplaceOffer) {
            this.marketplaceOffer = Input.ofNullable(marketplaceOffer);
            return this;
        }

        public Builder setMarketplacePublisher(@Nullable Input<String> marketplacePublisher) {
            this.marketplacePublisher = marketplacePublisher;
            return this;
        }

        public Builder setMarketplacePublisher(@Nullable String marketplacePublisher) {
            this.marketplacePublisher = Input.ofNullable(marketplacePublisher);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setPremierAddOnName(@Nullable Input<String> premierAddOnName) {
            this.premierAddOnName = premierAddOnName;
            return this;
        }

        public Builder setPremierAddOnName(@Nullable String premierAddOnName) {
            this.premierAddOnName = Input.ofNullable(premierAddOnName);
            return this;
        }

        public Builder setProduct(@Nullable Input<String> product) {
            this.product = product;
            return this;
        }

        public Builder setProduct(@Nullable String product) {
            this.product = Input.ofNullable(product);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setSku(@Nullable Input<String> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable String sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public Builder setVendor(@Nullable Input<String> vendor) {
            this.vendor = vendor;
            return this;
        }

        public Builder setVendor(@Nullable String vendor) {
            this.vendor = Input.ofNullable(vendor);
            return this;
        }

        public WebAppPremierAddOnArgs build() {
            return new WebAppPremierAddOnArgs(kind, location, marketplaceOffer, marketplacePublisher, name, premierAddOnName, product, resourceGroupName, sku, tags, vendor);
        }
    }
}
