// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * A custom alert rule that checks if a value (depends on the custom alert type) is allowed.
 * 
 */
public final class AllowlistCustomAlertRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final AllowlistCustomAlertRuleArgs Empty = new AllowlistCustomAlertRuleArgs();

    /**
     * The values to allow. The format of the values depends on the rule type.
     * 
     */
    @Import(name="allowlistValues", required=true)
      private final Output<List<String>> allowlistValues;

    public Output<List<String>> getAllowlistValues() {
        return this.allowlistValues;
    }

    /**
     * Status of the custom alert.
     * 
     */
    @Import(name="isEnabled", required=true)
      private final Output<Boolean> isEnabled;

    public Output<Boolean> getIsEnabled() {
        return this.isEnabled;
    }

    /**
     * The type of the custom alert rule.
     * Expected value is 'AllowlistCustomAlertRule'.
     * 
     */
    @Import(name="ruleType", required=true)
      private final Output<String> ruleType;

    public Output<String> getRuleType() {
        return this.ruleType;
    }

    public AllowlistCustomAlertRuleArgs(
        Output<List<String>> allowlistValues,
        Output<Boolean> isEnabled,
        Output<String> ruleType) {
        this.allowlistValues = Objects.requireNonNull(allowlistValues, "expected parameter 'allowlistValues' to be non-null");
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.ruleType = Objects.requireNonNull(ruleType, "expected parameter 'ruleType' to be non-null");
    }

    private AllowlistCustomAlertRuleArgs() {
        this.allowlistValues = Output.empty();
        this.isEnabled = Output.empty();
        this.ruleType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AllowlistCustomAlertRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<String>> allowlistValues;
        private Output<Boolean> isEnabled;
        private Output<String> ruleType;

        public Builder() {
    	      // Empty
        }

        public Builder(AllowlistCustomAlertRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowlistValues = defaults.allowlistValues;
    	      this.isEnabled = defaults.isEnabled;
    	      this.ruleType = defaults.ruleType;
        }

        public Builder allowlistValues(Output<List<String>> allowlistValues) {
            this.allowlistValues = Objects.requireNonNull(allowlistValues);
            return this;
        }
        public Builder allowlistValues(List<String> allowlistValues) {
            this.allowlistValues = Output.of(Objects.requireNonNull(allowlistValues));
            return this;
        }
        public Builder allowlistValues(String... allowlistValues) {
            return allowlistValues(List.of(allowlistValues));
        }
        public Builder isEnabled(Output<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Output.of(Objects.requireNonNull(isEnabled));
            return this;
        }
        public Builder ruleType(Output<String> ruleType) {
            this.ruleType = Objects.requireNonNull(ruleType);
            return this;
        }
        public Builder ruleType(String ruleType) {
            this.ruleType = Output.of(Objects.requireNonNull(ruleType));
            return this;
        }        public AllowlistCustomAlertRuleArgs build() {
            return new AllowlistCustomAlertRuleArgs(allowlistValues, isEnabled, ruleType);
        }
    }
}
