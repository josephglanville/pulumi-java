// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.retail_v2alpha.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GoogleCloudRetailV2alphaRuleBoostActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2alphaRuleBoostActionArgs Empty = new GoogleCloudRetailV2alphaRuleBoostActionArgs();

    @InputImport(name="boost")
    private final @Nullable Input<Double> boost;

    public Input<Double> getBoost() {
        return this.boost == null ? Input.empty() : this.boost;
    }

    @InputImport(name="productsFilter")
    private final @Nullable Input<String> productsFilter;

    public Input<String> getProductsFilter() {
        return this.productsFilter == null ? Input.empty() : this.productsFilter;
    }

    public GoogleCloudRetailV2alphaRuleBoostActionArgs(
        @Nullable Input<Double> boost,
        @Nullable Input<String> productsFilter) {
        this.boost = boost;
        this.productsFilter = productsFilter;
    }

    private GoogleCloudRetailV2alphaRuleBoostActionArgs() {
        this.boost = Input.empty();
        this.productsFilter = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRetailV2alphaRuleBoostActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Double> boost;
        private @Nullable Input<String> productsFilter;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRetailV2alphaRuleBoostActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.boost = defaults.boost;
    	      this.productsFilter = defaults.productsFilter;
        }

        public Builder setBoost(@Nullable Input<Double> boost) {
            this.boost = boost;
            return this;
        }

        public Builder setBoost(@Nullable Double boost) {
            this.boost = Input.ofNullable(boost);
            return this;
        }

        public Builder setProductsFilter(@Nullable Input<String> productsFilter) {
            this.productsFilter = productsFilter;
            return this;
        }

        public Builder setProductsFilter(@Nullable String productsFilter) {
            this.productsFilter = Input.ofNullable(productsFilter);
            return this;
        }

        public GoogleCloudRetailV2alphaRuleBoostActionArgs build() {
            return new GoogleCloudRetailV2alphaRuleBoostActionArgs(boost, productsFilter);
        }
    }
}