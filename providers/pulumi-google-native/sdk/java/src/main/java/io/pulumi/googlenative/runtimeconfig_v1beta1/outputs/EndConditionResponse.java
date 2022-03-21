// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.runtimeconfig_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.runtimeconfig_v1beta1.outputs.CardinalityResponse;
import java.util.Objects;

@CustomType
public final class EndConditionResponse {
    /**
     * The cardinality of the `EndCondition`.
     * 
     */
    private final CardinalityResponse cardinality;

    @CustomType.Constructor
    private EndConditionResponse(@CustomType.Parameter("cardinality") CardinalityResponse cardinality) {
        this.cardinality = cardinality;
    }

    /**
     * The cardinality of the `EndCondition`.
     * 
    */
    public CardinalityResponse getCardinality() {
        return this.cardinality;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndConditionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CardinalityResponse cardinality;

        public Builder() {
    	      // Empty
        }

        public Builder(EndConditionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cardinality = defaults.cardinality;
        }

        public Builder cardinality(CardinalityResponse cardinality) {
            this.cardinality = Objects.requireNonNull(cardinality);
            return this;
        }        public EndConditionResponse build() {
            return new EndConditionResponse(cardinality);
        }
    }
}
