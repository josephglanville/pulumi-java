// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.UsageProxy.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.UsageProxy.outputs.GetSubscriptionProductsProductCollectionItem;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSubscriptionProductsProductCollection {
    /**
     * @return The list of product rewards summaries.
     * 
     */
    private final List<GetSubscriptionProductsProductCollectionItem> items;

    @CustomType.Constructor
    private GetSubscriptionProductsProductCollection(@CustomType.Parameter("items") List<GetSubscriptionProductsProductCollectionItem> items) {
        this.items = items;
    }

    /**
     * @return The list of product rewards summaries.
     * 
     */
    public List<GetSubscriptionProductsProductCollectionItem> items() {
        return this.items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionProductsProductCollection defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GetSubscriptionProductsProductCollectionItem> items;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubscriptionProductsProductCollection defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(List<GetSubscriptionProductsProductCollectionItem> items) {
            this.items = Objects.requireNonNull(items);
            return this;
        }
        public Builder items(GetSubscriptionProductsProductCollectionItem... items) {
            return items(List.of(items));
        }        public GetSubscriptionProductsProductCollection build() {
            return new GetSubscriptionProductsProductCollection(items);
        }
    }
}
