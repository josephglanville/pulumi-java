// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.accesscontextmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.accesscontextmanager.inputs.AccessLevelCustomExprArgs;
import java.util.Objects;


public final class AccessLevelCustomArgs extends io.pulumi.resources.ResourceArgs {

    public static final AccessLevelCustomArgs Empty = new AccessLevelCustomArgs();

    @InputImport(name="expr", required=true)
    private final Input<AccessLevelCustomExprArgs> expr;

    public Input<AccessLevelCustomExprArgs> getExpr() {
        return this.expr;
    }

    public AccessLevelCustomArgs(Input<AccessLevelCustomExprArgs> expr) {
        this.expr = Objects.requireNonNull(expr, "expected parameter 'expr' to be non-null");
    }

    private AccessLevelCustomArgs() {
        this.expr = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AccessLevelCustomArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<AccessLevelCustomExprArgs> expr;

        public Builder() {
    	      // Empty
        }

        public Builder(AccessLevelCustomArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expr = defaults.expr;
        }

        public Builder setExpr(Input<AccessLevelCustomExprArgs> expr) {
            this.expr = Objects.requireNonNull(expr);
            return this;
        }

        public Builder setExpr(AccessLevelCustomExprArgs expr) {
            this.expr = Input.of(Objects.requireNonNull(expr));
            return this;
        }

        public AccessLevelCustomArgs build() {
            return new AccessLevelCustomArgs(expr);
        }
    }
}