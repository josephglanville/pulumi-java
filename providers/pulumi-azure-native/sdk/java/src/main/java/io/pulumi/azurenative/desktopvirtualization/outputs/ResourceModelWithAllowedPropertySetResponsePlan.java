// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.desktopvirtualization.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ResourceModelWithAllowedPropertySetResponsePlan {
    private final String name;
    private final String product;
    private final @Nullable String promotionCode;
    private final String publisher;
    private final @Nullable String version;

    @OutputCustomType.Constructor({"name","product","promotionCode","publisher","version"})
    private ResourceModelWithAllowedPropertySetResponsePlan(
        String name,
        String product,
        @Nullable String promotionCode,
        String publisher,
        @Nullable String version) {
        this.name = Objects.requireNonNull(name);
        this.product = Objects.requireNonNull(product);
        this.promotionCode = promotionCode;
        this.publisher = Objects.requireNonNull(publisher);
        this.version = version;
    }

    public String getName() {
        return this.name;
    }
    public String getProduct() {
        return this.product;
    }
    public Optional<String> getPromotionCode() {
        return Optional.ofNullable(this.promotionCode);
    }
    public String getPublisher() {
        return this.publisher;
    }
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceModelWithAllowedPropertySetResponsePlan defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String product;
        private @Nullable String promotionCode;
        private String publisher;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceModelWithAllowedPropertySetResponsePlan defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.product = defaults.product;
    	      this.promotionCode = defaults.promotionCode;
    	      this.publisher = defaults.publisher;
    	      this.version = defaults.version;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProduct(String product) {
            this.product = Objects.requireNonNull(product);
            return this;
        }

        public Builder setPromotionCode(@Nullable String promotionCode) {
            this.promotionCode = promotionCode;
            return this;
        }

        public Builder setPublisher(String publisher) {
            this.publisher = Objects.requireNonNull(publisher);
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public ResourceModelWithAllowedPropertySetResponsePlan build() {
            return new ResourceModelWithAllowedPropertySetResponsePlan(name, product, promotionCode, publisher, version);
        }
    }
}