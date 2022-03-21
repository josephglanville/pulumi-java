// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The KPI alias.
 * 
 */
public final class KpiAliasResponse extends io.pulumi.resources.InvokeArgs {

    public static final KpiAliasResponse Empty = new KpiAliasResponse();

    /**
     * KPI alias name.
     * 
     */
    @Import(name="aliasName", required=true)
      private final String aliasName;

    public String getAliasName() {
        return this.aliasName;
    }

    /**
     * The expression.
     * 
     */
    @Import(name="expression", required=true)
      private final String expression;

    public String getExpression() {
        return this.expression;
    }

    public KpiAliasResponse(
        String aliasName,
        String expression) {
        this.aliasName = Objects.requireNonNull(aliasName, "expected parameter 'aliasName' to be non-null");
        this.expression = Objects.requireNonNull(expression, "expected parameter 'expression' to be non-null");
    }

    private KpiAliasResponse() {
        this.aliasName = null;
        this.expression = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KpiAliasResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aliasName;
        private String expression;

        public Builder() {
    	      // Empty
        }

        public Builder(KpiAliasResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliasName = defaults.aliasName;
    	      this.expression = defaults.expression;
        }

        public Builder aliasName(String aliasName) {
            this.aliasName = Objects.requireNonNull(aliasName);
            return this;
        }
        public Builder expression(String expression) {
            this.expression = Objects.requireNonNull(expression);
            return this;
        }        public KpiAliasResponse build() {
            return new KpiAliasResponse(aliasName, expression);
        }
    }
}
