// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.azurenative.edgeorder.inputs.CustomerSubscriptionDetails;
import io.pulumi.azurenative.edgeorder.inputs.FilterableProperty;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ListProductFamiliesArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListProductFamiliesArgs Empty = new ListProductFamiliesArgs();

    /**
     * Customer subscription properties. Clients can display available products to unregistered customers by explicitly passing subscription details
     * 
     */
    @Import(name="customerSubscriptionDetails")
      private final @Nullable CustomerSubscriptionDetails customerSubscriptionDetails;

    public Optional<CustomerSubscriptionDetails> getCustomerSubscriptionDetails() {
        return this.customerSubscriptionDetails == null ? Optional.empty() : Optional.ofNullable(this.customerSubscriptionDetails);
    }

    /**
     * $expand is supported on configurations parameter for product, which provides details on the configurations for the product.
     * 
     */
    @Import(name="expand")
      private final @Nullable String expand;

    public Optional<String> getExpand() {
        return this.expand == null ? Optional.empty() : Optional.ofNullable(this.expand);
    }

    /**
     * Dictionary of filterable properties on product family.
     * 
     */
    @Import(name="filterableProperties", required=true)
      private final Map<String,List<FilterableProperty>> filterableProperties;

    public Map<String,List<FilterableProperty>> getFilterableProperties() {
        return this.filterableProperties;
    }

    /**
     * $skipToken is supported on list of product families, which provides the next page in the list of product families.
     * 
     */
    @Import(name="skipToken")
      private final @Nullable String skipToken;

    public Optional<String> getSkipToken() {
        return this.skipToken == null ? Optional.empty() : Optional.ofNullable(this.skipToken);
    }

    public ListProductFamiliesArgs(
        @Nullable CustomerSubscriptionDetails customerSubscriptionDetails,
        @Nullable String expand,
        Map<String,List<FilterableProperty>> filterableProperties,
        @Nullable String skipToken) {
        this.customerSubscriptionDetails = customerSubscriptionDetails;
        this.expand = expand;
        this.filterableProperties = Objects.requireNonNull(filterableProperties, "expected parameter 'filterableProperties' to be non-null");
        this.skipToken = skipToken;
    }

    private ListProductFamiliesArgs() {
        this.customerSubscriptionDetails = null;
        this.expand = null;
        this.filterableProperties = Map.of();
        this.skipToken = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListProductFamiliesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable CustomerSubscriptionDetails customerSubscriptionDetails;
        private @Nullable String expand;
        private Map<String,List<FilterableProperty>> filterableProperties;
        private @Nullable String skipToken;

        public Builder() {
    	      // Empty
        }

        public Builder(ListProductFamiliesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerSubscriptionDetails = defaults.customerSubscriptionDetails;
    	      this.expand = defaults.expand;
    	      this.filterableProperties = defaults.filterableProperties;
    	      this.skipToken = defaults.skipToken;
        }

        public Builder customerSubscriptionDetails(@Nullable CustomerSubscriptionDetails customerSubscriptionDetails) {
            this.customerSubscriptionDetails = customerSubscriptionDetails;
            return this;
        }
        public Builder expand(@Nullable String expand) {
            this.expand = expand;
            return this;
        }
        public Builder filterableProperties(Map<String,List<FilterableProperty>> filterableProperties) {
            this.filterableProperties = Objects.requireNonNull(filterableProperties);
            return this;
        }
        public Builder skipToken(@Nullable String skipToken) {
            this.skipToken = skipToken;
            return this;
        }        public ListProductFamiliesArgs build() {
            return new ListProductFamiliesArgs(customerSubscriptionDetails, expand, filterableProperties, skipToken);
        }
    }
}
