// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SkuCostResponse {
    private final @Nullable String extendedUnit;
    private final String meterId;
    private final @Nullable Integer quantity;

    @CustomType.Constructor
    private SkuCostResponse(
        @CustomType.Parameter("extendedUnit") @Nullable String extendedUnit,
        @CustomType.Parameter("meterId") String meterId,
        @CustomType.Parameter("quantity") @Nullable Integer quantity) {
        this.extendedUnit = extendedUnit;
        this.meterId = meterId;
        this.quantity = quantity;
    }

    public Optional<String> getExtendedUnit() {
        return Optional.ofNullable(this.extendedUnit);
    }
    public String getMeterId() {
        return this.meterId;
    }
    public Optional<Integer> getQuantity() {
        return Optional.ofNullable(this.quantity);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuCostResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String extendedUnit;
        private String meterId;
        private @Nullable Integer quantity;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuCostResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extendedUnit = defaults.extendedUnit;
    	      this.meterId = defaults.meterId;
    	      this.quantity = defaults.quantity;
        }

        public Builder extendedUnit(@Nullable String extendedUnit) {
            this.extendedUnit = extendedUnit;
            return this;
        }
        public Builder meterId(String meterId) {
            this.meterId = Objects.requireNonNull(meterId);
            return this;
        }
        public Builder quantity(@Nullable Integer quantity) {
            this.quantity = quantity;
            return this;
        }        public SkuCostResponse build() {
            return new SkuCostResponse(extendedUnit, meterId, quantity);
        }
    }
}
