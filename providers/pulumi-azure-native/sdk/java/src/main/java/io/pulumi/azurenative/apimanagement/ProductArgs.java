// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement;

import io.pulumi.azurenative.apimanagement.enums.ProductState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProductArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProductArgs Empty = new ProductArgs();

    /**
     * whether subscription approval is required. If false, new subscriptions will be approved automatically enabling developers to call the product’s APIs immediately after subscribing. If true, administrators must manually approve the subscription before the developer can any of the product’s APIs. Can be present only if subscriptionRequired property is present and has a value of false.
     * 
     */
    @Import(name="approvalRequired")
      private final @Nullable Output<Boolean> approvalRequired;

    public Output<Boolean> getApprovalRequired() {
        return this.approvalRequired == null ? Output.empty() : this.approvalRequired;
    }

    /**
     * Product description. May include HTML formatting tags.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Product name.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Product identifier. Must be unique in the current API Management service instance.
     * 
     */
    @Import(name="productId")
      private final @Nullable Output<String> productId;

    public Output<String> getProductId() {
        return this.productId == null ? Output.empty() : this.productId;
    }

    /**
     * The name of the resource group.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the API Management service.
     * 
     */
    @Import(name="serviceName", required=true)
      private final Output<String> serviceName;

    public Output<String> getServiceName() {
        return this.serviceName;
    }

    /**
     * whether product is published or not. Published products are discoverable by users of developer portal. Non published products are visible only to administrators. Default state of Product is notPublished.
     * 
     */
    @Import(name="state")
      private final @Nullable Output<ProductState> state;

    public Output<ProductState> getState() {
        return this.state == null ? Output.empty() : this.state;
    }

    /**
     * Whether a product subscription is required for accessing APIs included in this product. If true, the product is referred to as "protected" and a valid subscription key is required for a request to an API included in the product to succeed. If false, the product is referred to as "open" and requests to an API included in the product can be made without a subscription key. If property is omitted when creating a new product it's value is assumed to be true.
     * 
     */
    @Import(name="subscriptionRequired")
      private final @Nullable Output<Boolean> subscriptionRequired;

    public Output<Boolean> getSubscriptionRequired() {
        return this.subscriptionRequired == null ? Output.empty() : this.subscriptionRequired;
    }

    /**
     * Whether the number of subscriptions a user can have to this product at the same time. Set to null or omit to allow unlimited per user subscriptions. Can be present only if subscriptionRequired property is present and has a value of false.
     * 
     */
    @Import(name="subscriptionsLimit")
      private final @Nullable Output<Integer> subscriptionsLimit;

    public Output<Integer> getSubscriptionsLimit() {
        return this.subscriptionsLimit == null ? Output.empty() : this.subscriptionsLimit;
    }

    /**
     * Product terms of use. Developers trying to subscribe to the product will be presented and required to accept these terms before they can complete the subscription process.
     * 
     */
    @Import(name="terms")
      private final @Nullable Output<String> terms;

    public Output<String> getTerms() {
        return this.terms == null ? Output.empty() : this.terms;
    }

    public ProductArgs(
        @Nullable Output<Boolean> approvalRequired,
        @Nullable Output<String> description,
        Output<String> displayName,
        @Nullable Output<String> productId,
        Output<String> resourceGroupName,
        Output<String> serviceName,
        @Nullable Output<ProductState> state,
        @Nullable Output<Boolean> subscriptionRequired,
        @Nullable Output<Integer> subscriptionsLimit,
        @Nullable Output<String> terms) {
        this.approvalRequired = approvalRequired;
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.productId = productId;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serviceName = Objects.requireNonNull(serviceName, "expected parameter 'serviceName' to be non-null");
        this.state = state;
        this.subscriptionRequired = subscriptionRequired;
        this.subscriptionsLimit = subscriptionsLimit;
        this.terms = terms;
    }

    private ProductArgs() {
        this.approvalRequired = Output.empty();
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.productId = Output.empty();
        this.resourceGroupName = Output.empty();
        this.serviceName = Output.empty();
        this.state = Output.empty();
        this.subscriptionRequired = Output.empty();
        this.subscriptionsLimit = Output.empty();
        this.terms = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProductArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> approvalRequired;
        private @Nullable Output<String> description;
        private Output<String> displayName;
        private @Nullable Output<String> productId;
        private Output<String> resourceGroupName;
        private Output<String> serviceName;
        private @Nullable Output<ProductState> state;
        private @Nullable Output<Boolean> subscriptionRequired;
        private @Nullable Output<Integer> subscriptionsLimit;
        private @Nullable Output<String> terms;

        public Builder() {
    	      // Empty
        }

        public Builder(ProductArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvalRequired = defaults.approvalRequired;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.productId = defaults.productId;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serviceName = defaults.serviceName;
    	      this.state = defaults.state;
    	      this.subscriptionRequired = defaults.subscriptionRequired;
    	      this.subscriptionsLimit = defaults.subscriptionsLimit;
    	      this.terms = defaults.terms;
        }

        public Builder approvalRequired(@Nullable Output<Boolean> approvalRequired) {
            this.approvalRequired = approvalRequired;
            return this;
        }
        public Builder approvalRequired(@Nullable Boolean approvalRequired) {
            this.approvalRequired = Output.ofNullable(approvalRequired);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder productId(@Nullable Output<String> productId) {
            this.productId = productId;
            return this;
        }
        public Builder productId(@Nullable String productId) {
            this.productId = Output.ofNullable(productId);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder serviceName(Output<String> serviceName) {
            this.serviceName = Objects.requireNonNull(serviceName);
            return this;
        }
        public Builder serviceName(String serviceName) {
            this.serviceName = Output.of(Objects.requireNonNull(serviceName));
            return this;
        }
        public Builder state(@Nullable Output<ProductState> state) {
            this.state = state;
            return this;
        }
        public Builder state(@Nullable ProductState state) {
            this.state = Output.ofNullable(state);
            return this;
        }
        public Builder subscriptionRequired(@Nullable Output<Boolean> subscriptionRequired) {
            this.subscriptionRequired = subscriptionRequired;
            return this;
        }
        public Builder subscriptionRequired(@Nullable Boolean subscriptionRequired) {
            this.subscriptionRequired = Output.ofNullable(subscriptionRequired);
            return this;
        }
        public Builder subscriptionsLimit(@Nullable Output<Integer> subscriptionsLimit) {
            this.subscriptionsLimit = subscriptionsLimit;
            return this;
        }
        public Builder subscriptionsLimit(@Nullable Integer subscriptionsLimit) {
            this.subscriptionsLimit = Output.ofNullable(subscriptionsLimit);
            return this;
        }
        public Builder terms(@Nullable Output<String> terms) {
            this.terms = terms;
            return this;
        }
        public Builder terms(@Nullable String terms) {
            this.terms = Output.ofNullable(terms);
            return this;
        }        public ProductArgs build() {
            return new ProductArgs(approvalRequired, description, displayName, productId, resourceGroupName, serviceName, state, subscriptionRequired, subscriptionsLimit, terms);
        }
    }
}
