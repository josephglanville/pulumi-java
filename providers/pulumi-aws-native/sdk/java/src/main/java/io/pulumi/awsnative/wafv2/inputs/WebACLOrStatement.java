// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.inputs.WebACLStatement;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;


public final class WebACLOrStatement extends io.pulumi.resources.InvokeArgs {

    public static final WebACLOrStatement Empty = new WebACLOrStatement();

    @InputImport(name="statements", required=true)
      private final List<WebACLStatement> statements;

    public List<WebACLStatement> getStatements() {
        return this.statements;
    }

    public WebACLOrStatement(List<WebACLStatement> statements) {
        this.statements = Objects.requireNonNull(statements, "expected parameter 'statements' to be non-null");
    }

    private WebACLOrStatement() {
        this.statements = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLOrStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<WebACLStatement> statements;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLOrStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statements = defaults.statements;
        }

        public Builder setStatements(List<WebACLStatement> statements) {
            this.statements = Objects.requireNonNull(statements);
            return this;
        }
        public WebACLOrStatement build() {
            return new WebACLOrStatement(statements);
        }
    }
}
