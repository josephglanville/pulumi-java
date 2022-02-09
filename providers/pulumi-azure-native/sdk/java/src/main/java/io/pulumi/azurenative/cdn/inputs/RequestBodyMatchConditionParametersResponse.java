// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RequestBodyMatchConditionParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final RequestBodyMatchConditionParametersResponse Empty = new RequestBodyMatchConditionParametersResponse();

    @InputImport(name="matchValues")
    private final @Nullable List<String> matchValues;

    public List<String> getMatchValues() {
        return this.matchValues == null ? List.of() : this.matchValues;
    }

    @InputImport(name="negateCondition")
    private final @Nullable Boolean negateCondition;

    public Optional<Boolean> getNegateCondition() {
        return this.negateCondition == null ? Optional.empty() : Optional.ofNullable(this.negateCondition);
    }

    @InputImport(name="odataType", required=true)
    private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    @InputImport(name="operator", required=true)
    private final String operator;

    public String getOperator() {
        return this.operator;
    }

    @InputImport(name="transforms")
    private final @Nullable List<String> transforms;

    public List<String> getTransforms() {
        return this.transforms == null ? List.of() : this.transforms;
    }

    public RequestBodyMatchConditionParametersResponse(
        @Nullable List<String> matchValues,
        @Nullable Boolean negateCondition,
        String odataType,
        String operator,
        @Nullable List<String> transforms) {
        this.matchValues = matchValues;
        this.negateCondition = negateCondition;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.operator = Objects.requireNonNull(operator, "expected parameter 'operator' to be non-null");
        this.transforms = transforms;
    }

    private RequestBodyMatchConditionParametersResponse() {
        this.matchValues = List.of();
        this.negateCondition = null;
        this.odataType = null;
        this.operator = null;
        this.transforms = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RequestBodyMatchConditionParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> matchValues;
        private @Nullable Boolean negateCondition;
        private String odataType;
        private String operator;
        private @Nullable List<String> transforms;

        public Builder() {
    	      // Empty
        }

        public Builder(RequestBodyMatchConditionParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.matchValues = defaults.matchValues;
    	      this.negateCondition = defaults.negateCondition;
    	      this.odataType = defaults.odataType;
    	      this.operator = defaults.operator;
    	      this.transforms = defaults.transforms;
        }

        public Builder setMatchValues(@Nullable List<String> matchValues) {
            this.matchValues = matchValues;
            return this;
        }

        public Builder setNegateCondition(@Nullable Boolean negateCondition) {
            this.negateCondition = negateCondition;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOperator(String operator) {
            this.operator = Objects.requireNonNull(operator);
            return this;
        }

        public Builder setTransforms(@Nullable List<String> transforms) {
            this.transforms = transforms;
            return this;
        }

        public RequestBodyMatchConditionParametersResponse build() {
            return new RequestBodyMatchConditionParametersResponse(matchValues, negateCondition, odataType, operator, transforms);
        }
    }
}
