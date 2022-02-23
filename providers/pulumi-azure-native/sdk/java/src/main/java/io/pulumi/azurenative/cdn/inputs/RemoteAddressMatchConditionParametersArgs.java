// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.enums.RemoteAddressOperator;
import io.pulumi.azurenative.cdn.enums.Transform;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines the parameters for RemoteAddress match conditions
 * 
 */
public final class RemoteAddressMatchConditionParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final RemoteAddressMatchConditionParametersArgs Empty = new RemoteAddressMatchConditionParametersArgs();

    /**
     * Match values to match against. The operator will apply to each value in here with OR semantics. If any of them match the variable with the given operator this match condition is considered a match.
     * 
     */
    @InputImport(name="matchValues")
      private final @Nullable Input<List<String>> matchValues;

    public Input<List<String>> getMatchValues() {
        return this.matchValues == null ? Input.empty() : this.matchValues;
    }

    /**
     * Describes if this is negate condition or not
     * 
     */
    @InputImport(name="negateCondition")
      private final @Nullable Input<Boolean> negateCondition;

    public Input<Boolean> getNegateCondition() {
        return this.negateCondition == null ? Input.empty() : this.negateCondition;
    }

    @InputImport(name="odataType", required=true)
      private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    /**
     * Describes operator to be matched
     * 
     */
    @InputImport(name="operator", required=true)
      private final Input<Either<String,RemoteAddressOperator>> operator;

    public Input<Either<String,RemoteAddressOperator>> getOperator() {
        return this.operator;
    }

    /**
     * List of transforms
     * 
     */
    @InputImport(name="transforms")
      private final @Nullable Input<List<Either<String,Transform>>> transforms;

    public Input<List<Either<String,Transform>>> getTransforms() {
        return this.transforms == null ? Input.empty() : this.transforms;
    }

    public RemoteAddressMatchConditionParametersArgs(
        @Nullable Input<List<String>> matchValues,
        @Nullable Input<Boolean> negateCondition,
        Input<String> odataType,
        Input<Either<String,RemoteAddressOperator>> operator,
        @Nullable Input<List<Either<String,Transform>>> transforms) {
        this.matchValues = matchValues;
        this.negateCondition = negateCondition;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.transforms = transforms;
    }

    private RemoteAddressMatchConditionParametersArgs() {
        this.matchValues = Input.empty();
        this.negateCondition = Input.empty();
        this.odataType = Input.empty();
        this.operator = Input.empty();
        this.transforms = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RemoteAddressMatchConditionParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> matchValues;
        private @Nullable Input<Boolean> negateCondition;
        private Input<String> odataType;
        private Input<Either<String,RemoteAddressOperator>> operator;
        private @Nullable Input<List<Either<String,Transform>>> transforms;

        public Builder() {
    	      // Empty
        }

        public Builder(RemoteAddressMatchConditionParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValues = defaults.matchValues;
    	      this.negateCondition = defaults.negateCondition;
    	      this.odataType = defaults.odataType;
    	      this.operator = defaults.operator;
    	      this.transforms = defaults.transforms;
        }

        public Builder setMatchValues(@Nullable Input<List<String>> matchValues) {
            this.matchValues = matchValues;
            return this;
        }

        public Builder setMatchValues(@Nullable List<String> matchValues) {
            this.matchValues = Input.ofNullable(matchValues);
            return this;
        }

        public Builder setNegateCondition(@Nullable Input<Boolean> negateCondition) {
            this.negateCondition = negateCondition;
            return this;
        }

        public Builder setNegateCondition(@Nullable Boolean negateCondition) {
            this.negateCondition = Input.ofNullable(negateCondition);
            return this;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }

        public Builder setOperator(Input<Either<String,RemoteAddressOperator>> operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setOperator(Either<String,RemoteAddressOperator> operator) {
            this.operator = Input.of(Objects.requireNonNull(operator));
            return this;
        }

        public Builder setTransforms(@Nullable Input<List<Either<String,Transform>>> transforms) {
            this.transforms = transforms;
            return this;
        }

        public Builder setTransforms(@Nullable List<Either<String,Transform>> transforms) {
            this.transforms = Input.ofNullable(transforms);
            return this;
        }
        public RemoteAddressMatchConditionParametersArgs build() {
            return new RemoteAddressMatchConditionParametersArgs(matchValues, negateCondition, odataType, operator, transforms);
        }
    }
}
