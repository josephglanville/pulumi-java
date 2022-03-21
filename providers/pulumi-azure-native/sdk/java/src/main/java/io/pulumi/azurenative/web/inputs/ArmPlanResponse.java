// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The plan object in Azure Resource Manager, represents a marketplace plan.
 * 
 */
public final class ArmPlanResponse extends io.pulumi.resources.InvokeArgs {

    public static final ArmPlanResponse Empty = new ArmPlanResponse();

    /**
     * The name.
     * 
     */
    @Import(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * The product.
     * 
     */
    @Import(name="product")
      private final @Nullable String product;

    public Optional<String> getProduct() {
        return this.product == null ? Optional.empty() : Optional.ofNullable(this.product);
    }

    /**
     * The promotion code.
     * 
     */
    @Import(name="promotionCode")
      private final @Nullable String promotionCode;

    public Optional<String> getPromotionCode() {
        return this.promotionCode == null ? Optional.empty() : Optional.ofNullable(this.promotionCode);
    }

    /**
     * The publisher.
     * 
     */
    @Import(name="publisher")
      private final @Nullable String publisher;

    public Optional<String> getPublisher() {
        return this.publisher == null ? Optional.empty() : Optional.ofNullable(this.publisher);
    }

    /**
     * Version of product.
     * 
     */
    @Import(name="version")
      private final @Nullable String version;

    public Optional<String> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public ArmPlanResponse(
        @Nullable String name,
        @Nullable String product,
        @Nullable String promotionCode,
        @Nullable String publisher,
        @Nullable String version) {
        this.name = name;
        this.product = product;
        this.promotionCode = promotionCode;
        this.publisher = publisher;
        this.version = version;
    }

    private ArmPlanResponse() {
        this.name = null;
        this.product = null;
        this.promotionCode = null;
        this.publisher = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ArmPlanResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable String product;
        private @Nullable String promotionCode;
        private @Nullable String publisher;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ArmPlanResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.promotionCode = defaults.promotionCode;
    	      this.publisher = defaults.publisher;
    	      this.version = defaults.version;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public Builder product(@Nullable String product) {
            this.product = product;
            return this;
        }
        public Builder promotionCode(@Nullable String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }
        public Builder publisher(@Nullable String publisher) {
            this.publisher = publisher;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = version;
            return this;
        }        public ArmPlanResponse build() {
            return new ArmPlanResponse(name, product, promotionCode, publisher, version);
        }
    }
}
