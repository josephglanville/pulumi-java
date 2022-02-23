// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.inputs;

import io.pulumi.awsnative.databrew.inputs.RulesetColumnSelectorArgs;
import io.pulumi.awsnative.databrew.inputs.RulesetSubstitutionValueArgs;
import io.pulumi.awsnative.databrew.inputs.RulesetThresholdArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Data quality rule for a target resource (dataset)
 * 
 */
public final class RulesetRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RulesetRuleArgs Empty = new RulesetRuleArgs();

    @InputImport(name="checkExpression", required=true)
      private final Input<String> checkExpression;

    public Input<String> getCheckExpression() {
        return this.checkExpression;
    }

    @InputImport(name="columnSelectors")
      private final @Nullable Input<List<RulesetColumnSelectorArgs>> columnSelectors;

    public Input<List<RulesetColumnSelectorArgs>> getColumnSelectors() {
        return this.columnSelectors == null ? Input.empty() : this.columnSelectors;
    }

    @InputImport(name="disabled")
      private final @Nullable Input<Boolean> disabled;

    public Input<Boolean> getDisabled() {
        return this.disabled == null ? Input.empty() : this.disabled;
    }

    /**
     * Name of the rule
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="substitutionMap")
      private final @Nullable Input<List<RulesetSubstitutionValueArgs>> substitutionMap;

    public Input<List<RulesetSubstitutionValueArgs>> getSubstitutionMap() {
        return this.substitutionMap == null ? Input.empty() : this.substitutionMap;
    }

    @InputImport(name="threshold")
      private final @Nullable Input<RulesetThresholdArgs> threshold;

    public Input<RulesetThresholdArgs> getThreshold() {
        return this.threshold == null ? Input.empty() : this.threshold;
    }

    public RulesetRuleArgs(
        Input<String> checkExpression,
        @Nullable Input<List<RulesetColumnSelectorArgs>> columnSelectors,
        @Nullable Input<Boolean> disabled,
        Input<String> name,
        @Nullable Input<List<RulesetSubstitutionValueArgs>> substitutionMap,
        @Nullable Input<RulesetThresholdArgs> threshold) {
        this.checkExpression = Objects.requireNonNull(checkExpression, "expected parameter 'checkExpression' to be non-null");
        this.columnSelectors = columnSelectors;
        this.disabled = disabled;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.substitutionMap = substitutionMap;
        this.threshold = threshold;
    }

    private RulesetRuleArgs() {
        this.checkExpression = Input.empty();
        this.columnSelectors = Input.empty();
        this.disabled = Input.empty();
        this.name = Input.empty();
        this.substitutionMap = Input.empty();
        this.threshold = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RulesetRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> checkExpression;
        private @Nullable Input<List<RulesetColumnSelectorArgs>> columnSelectors;
        private @Nullable Input<Boolean> disabled;
        private Input<String> name;
        private @Nullable Input<List<RulesetSubstitutionValueArgs>> substitutionMap;
        private @Nullable Input<RulesetThresholdArgs> threshold;

        public Builder() {
    	      // Empty
        }

        public Builder(RulesetRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.checkExpression = defaults.checkExpression;
    	      this.columnSelectors = defaults.columnSelectors;
    	      this.disabled = defaults.disabled;
    	      this.name = defaults.name;
    	      this.substitutionMap = defaults.substitutionMap;
    	      this.threshold = defaults.threshold;
        }

        public Builder setCheckExpression(Input<String> checkExpression) {
            this.checkExpression = Objects.requireNonNull(checkExpression);
            return this;
        }

        public Builder setCheckExpression(String checkExpression) {
            this.checkExpression = Input.of(Objects.requireNonNull(checkExpression));
            return this;
        }

        public Builder setColumnSelectors(@Nullable Input<List<RulesetColumnSelectorArgs>> columnSelectors) {
            this.columnSelectors = columnSelectors;
            return this;
        }

        public Builder setColumnSelectors(@Nullable List<RulesetColumnSelectorArgs> columnSelectors) {
            this.columnSelectors = Input.ofNullable(columnSelectors);
            return this;
        }

        public Builder setDisabled(@Nullable Input<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }

        public Builder setDisabled(@Nullable Boolean disabled) {
            this.disabled = Input.ofNullable(disabled);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setSubstitutionMap(@Nullable Input<List<RulesetSubstitutionValueArgs>> substitutionMap) {
            this.substitutionMap = substitutionMap;
            return this;
        }

        public Builder setSubstitutionMap(@Nullable List<RulesetSubstitutionValueArgs> substitutionMap) {
            this.substitutionMap = Input.ofNullable(substitutionMap);
            return this;
        }

        public Builder setThreshold(@Nullable Input<RulesetThresholdArgs> threshold) {
            this.threshold = threshold;
            return this;
        }

        public Builder setThreshold(@Nullable RulesetThresholdArgs threshold) {
            this.threshold = Input.ofNullable(threshold);
            return this;
        }
        public RulesetRuleArgs build() {
            return new RulesetRuleArgs(checkExpression, columnSelectors, disabled, name, substitutionMap, threshold);
        }
    }
}
