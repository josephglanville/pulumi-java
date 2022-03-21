// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.batch.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AutoScaleSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final AutoScaleSettingsArgs Empty = new AutoScaleSettingsArgs();

    /**
     * If omitted, the default value is 15 minutes (PT15M).
     * 
     */
    @Import(name="evaluationInterval")
      private final @Nullable Output<String> evaluationInterval;

    public Output<String> getEvaluationInterval() {
        return this.evaluationInterval == null ? Output.empty() : this.evaluationInterval;
    }

    @Import(name="formula", required=true)
      private final Output<String> formula;

    public Output<String> getFormula() {
        return this.formula;
    }

    public AutoScaleSettingsArgs(
        @Nullable Output<String> evaluationInterval,
        Output<String> formula) {
        this.evaluationInterval = evaluationInterval;
        this.formula = Objects.requireNonNull(formula, "expected parameter 'formula' to be non-null");
    }

    private AutoScaleSettingsArgs() {
        this.evaluationInterval = Output.empty();
        this.formula = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AutoScaleSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> evaluationInterval;
        private Output<String> formula;

        public Builder() {
    	      // Empty
        }

        public Builder(AutoScaleSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.evaluationInterval = defaults.evaluationInterval;
    	      this.formula = defaults.formula;
        }

        public Builder evaluationInterval(@Nullable Output<String> evaluationInterval) {
            this.evaluationInterval = evaluationInterval;
            return this;
        }
        public Builder evaluationInterval(@Nullable String evaluationInterval) {
            this.evaluationInterval = Output.ofNullable(evaluationInterval);
            return this;
        }
        public Builder formula(Output<String> formula) {
            this.formula = Objects.requireNonNull(formula);
            return this;
        }
        public Builder formula(String formula) {
            this.formula = Output.of(Objects.requireNonNull(formula));
            return this;
        }        public AutoScaleSettingsArgs build() {
            return new AutoScaleSettingsArgs(evaluationInterval, formula);
        }
    }
}
