// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The KPI extract.
 * 
 */
public final class KpiExtractArgs extends io.pulumi.resources.ResourceArgs {

    public static final KpiExtractArgs Empty = new KpiExtractArgs();

    /**
     * The expression.
     * 
     */
    @InputImport(name="expression", required=true)
      private final Input<String> expression;

    public Input<String> getExpression() {
        return this.expression;
    }

    /**
     * KPI extract name.
     * 
     */
    @InputImport(name="extractName", required=true)
      private final Input<String> extractName;

    public Input<String> getExtractName() {
        return this.extractName;
    }

    public KpiExtractArgs(
        Input<String> expression,
        Input<String> extractName) {
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
        this.extractName = Objects.requireNonNull(extractName, "expected parameter 'extractName' to be non-null");
    }

    private KpiExtractArgs() {
        this.expression = Input.empty();
        this.extractName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KpiExtractArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> expression;
        private Input<String> extractName;

        public Builder() {
    	      // Empty
        }

        public Builder(KpiExtractArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expression = defaults.expression;
    	      this.extractName = defaults.extractName;
        }

        public Builder setExpression(Input<String> expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }

        public Builder setExpression(String expression) {
            this.expression = Input.of(Objects.requireNonNull(expression));
            return this;
        }

        public Builder setExtractName(Input<String> extractName) {
            this.extractName = Objects.requireNonNull(extractName);
            return this;
        }

        public Builder setExtractName(String extractName) {
            this.extractName = Input.of(Objects.requireNonNull(extractName));
            return this;
        }
        public KpiExtractArgs build() {
            return new KpiExtractArgs(expression, extractName);
        }
    }
}
