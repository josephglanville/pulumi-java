// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resources.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetTagAtScopeArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTagAtScopeArgs Empty = new GetTagAtScopeArgs();

    /**
     * The resource scope.
     * 
     */
    @InputImport(name="scope", required=true)
      private final String scope;

    public String getScope() {
        return this.scope;
    }

    public GetTagAtScopeArgs(String scope) {
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private GetTagAtScopeArgs() {
        this.scope = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTagAtScopeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String scope;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTagAtScopeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.scope = defaults.scope;
        }

        public Builder setScope(String scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public GetTagAtScopeArgs build() {
            return new GetTagAtScopeArgs(scope);
        }
    }
}
