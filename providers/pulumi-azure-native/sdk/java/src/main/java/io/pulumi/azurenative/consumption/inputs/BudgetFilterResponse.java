// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.consumption.inputs;

import io.pulumi.azurenative.consumption.inputs.BudgetComparisonExpressionResponse;
import io.pulumi.azurenative.consumption.inputs.BudgetFilterPropertiesResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * May be used to filter budgets by resource group, resource, or meter.
 * 
 */
public final class BudgetFilterResponse extends io.pulumi.resources.InvokeArgs {

    public static final BudgetFilterResponse Empty = new BudgetFilterResponse();

    /**
     * The logical "AND" expression. Must have at least 2 items.
     * 
     */
    @InputImport(name="and")
      private final @Nullable List<BudgetFilterPropertiesResponse> and;

    public List<BudgetFilterPropertiesResponse> getAnd() {
        return this.and == null ? List.of() : this.and;
    }

    /**
     * Has comparison expression for a dimension
     * 
     */
    @InputImport(name="dimensions")
      private final @Nullable BudgetComparisonExpressionResponse dimensions;

    public Optional<BudgetComparisonExpressionResponse> getDimensions() {
        return this.dimensions == null ? Optional.empty() : Optional.ofNullable(this.dimensions);
    }

    /**
     * The logical "NOT" expression.
     * 
     */
    @InputImport(name="not")
      private final @Nullable BudgetFilterPropertiesResponse not;

    public Optional<BudgetFilterPropertiesResponse> getNot() {
        return this.not == null ? Optional.empty() : Optional.ofNullable(this.not);
    }

    /**
     * Has comparison expression for a tag
     * 
     */
    @InputImport(name="tags")
      private final @Nullable BudgetComparisonExpressionResponse tags;

    public Optional<BudgetComparisonExpressionResponse> getTags() {
        return this.tags == null ? Optional.empty() : Optional.ofNullable(this.tags);
    }

    public BudgetFilterResponse(
        @Nullable List<BudgetFilterPropertiesResponse> and,
        @Nullable BudgetComparisonExpressionResponse dimensions,
        @Nullable BudgetFilterPropertiesResponse not,
        @Nullable BudgetComparisonExpressionResponse tags) {
        this.and = and;
        this.dimensions = dimensions;
        this.not = not;
        this.tags = tags;
    }

    private BudgetFilterResponse() {
        this.and = List.of();
        this.dimensions = null;
        this.not = null;
        this.tags = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BudgetFilterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<BudgetFilterPropertiesResponse> and;
        private @Nullable BudgetComparisonExpressionResponse dimensions;
        private @Nullable BudgetFilterPropertiesResponse not;
        private @Nullable BudgetComparisonExpressionResponse tags;

        public Builder() {
    	      // Empty
        }

        public Builder(BudgetFilterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.and = defaults.and;
    	      this.dimensions = defaults.dimensions;
    	      this.not = defaults.not;
    	      this.tags = defaults.tags;
        }

        public Builder setAnd(@Nullable List<BudgetFilterPropertiesResponse> and) {
            this.and = and;
            return this;
        }

        public Builder setDimensions(@Nullable BudgetComparisonExpressionResponse dimensions) {
            this.dimensions = dimensions;
            return this;
        }

        public Builder setNot(@Nullable BudgetFilterPropertiesResponse not) {
            this.not = not;
            return this;
        }

        public Builder setTags(@Nullable BudgetComparisonExpressionResponse tags) {
            this.tags = tags;
            return this;
        }
        public BudgetFilterResponse build() {
            return new BudgetFilterResponse(and, dimensions, not, tags);
        }
    }
}
