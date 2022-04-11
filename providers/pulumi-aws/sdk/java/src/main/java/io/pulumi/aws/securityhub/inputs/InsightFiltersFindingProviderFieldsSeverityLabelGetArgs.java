// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.securityhub.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class InsightFiltersFindingProviderFieldsSeverityLabelGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final InsightFiltersFindingProviderFieldsSeverityLabelGetArgs Empty = new InsightFiltersFindingProviderFieldsSeverityLabelGetArgs();

    /**
     * The condition to apply to a string value when querying for findings. Valid values include: `EQUALS` and `NOT_EQUALS`.
     * 
     */
    @Import(name="comparison", required=true)
      private final Output<String> comparison;

    public Output<String> getComparison() {
        return this.comparison;
    }

    /**
     * A date range value for the date filter, provided as an Integer.
     * 
     */
    @Import(name="value", required=true)
      private final Output<String> value;

    public Output<String> getValue() {
        return this.value;
    }

    public InsightFiltersFindingProviderFieldsSeverityLabelGetArgs(
        Output<String> comparison,
        Output<String> value) {
        this.comparison = Objects.requireNonNull(comparison, "expected parameter 'comparison' to be non-null");
        this.value = Objects.requireNonNull(value, "expected parameter 'value' to be non-null");
    }

    private InsightFiltersFindingProviderFieldsSeverityLabelGetArgs() {
        this.comparison = Codegen.empty();
        this.value = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InsightFiltersFindingProviderFieldsSeverityLabelGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> comparison;
        private Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(InsightFiltersFindingProviderFieldsSeverityLabelGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comparison = defaults.comparison;
    	      this.value = defaults.value;
        }

        public Builder comparison(Output<String> comparison) {
            this.comparison = Objects.requireNonNull(comparison);
            return this;
        }
        public Builder comparison(String comparison) {
            this.comparison = Output.of(Objects.requireNonNull(comparison));
            return this;
        }
        public Builder value(Output<String> value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public Builder value(String value) {
            this.value = Output.of(Objects.requireNonNull(value));
            return this;
        }        public InsightFiltersFindingProviderFieldsSeverityLabelGetArgs build() {
            return new InsightFiltersFindingProviderFieldsSeverityLabelGetArgs(comparison, value);
        }
    }
}
