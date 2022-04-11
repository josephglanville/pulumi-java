// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.accesscontextmanager.inputs.AccessLevelsAccessLevelCustomExprGetArgs;
import java.util.Objects;


public final class AccessLevelsAccessLevelCustomGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessLevelsAccessLevelCustomGetArgs Empty = new AccessLevelsAccessLevelCustomGetArgs();

    /**
     * Represents a textual expression in the Common Expression Language (CEL) syntax. CEL is a C-like expression language.
     * This page details the objects and attributes that are used to the build the CEL expressions for
     * custom access levels - https://cloud.google.com/access-context-manager/docs/custom-access-level-spec.
     * Structure is documented below.
     * 
     */
    @Import(name="expr", required=true)
      private final Output<AccessLevelsAccessLevelCustomExprGetArgs> expr;

    public Output<AccessLevelsAccessLevelCustomExprGetArgs> getExpr() {
        return this.expr;
    }

    public AccessLevelsAccessLevelCustomGetArgs(Output<AccessLevelsAccessLevelCustomExprGetArgs> expr) {
        this.expr = Objects.requireNonNull(expr, "expected parameter 'expr' to be non-null");
    }

    private AccessLevelsAccessLevelCustomGetArgs() {
        this.expr = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelsAccessLevelCustomGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<AccessLevelsAccessLevelCustomExprGetArgs> expr;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelsAccessLevelCustomGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expr = defaults.expr;
        }

        public Builder expr(Output<AccessLevelsAccessLevelCustomExprGetArgs> expr) {
            this.expr = Objects.requireNonNull(expr);
            return this;
        }
        public Builder expr(AccessLevelsAccessLevelCustomExprGetArgs expr) {
            this.expr = Output.of(Objects.requireNonNull(expr));
            return this;
        }        public AccessLevelsAccessLevelCustomGetArgs build() {
            return new AccessLevelsAccessLevelCustomGetArgs(expr);
        }
    }
}
