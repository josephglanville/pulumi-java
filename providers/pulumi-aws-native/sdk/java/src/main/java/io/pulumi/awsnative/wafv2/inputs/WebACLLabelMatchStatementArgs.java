// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.WebACLLabelMatchScope;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class WebACLLabelMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLLabelMatchStatementArgs Empty = new WebACLLabelMatchStatementArgs();

    @InputImport(name="key", required=true)
      private final Output<String> key;

    public Output<String> getKey() {
        return this.key;
    }

    @InputImport(name="scope", required=true)
      private final Output<WebACLLabelMatchScope> scope;

    public Output<WebACLLabelMatchScope> getScope() {
        return this.scope;
    }

    public WebACLLabelMatchStatementArgs(
        Output<String> key,
        Output<WebACLLabelMatchScope> scope) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private WebACLLabelMatchStatementArgs() {
        this.key = Output.empty();
        this.scope = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLLabelMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> key;
        private Output<WebACLLabelMatchScope> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLLabelMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.scope = defaults.scope;
        }

        public Builder key(Output<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder key(String key) {
            this.key = Output.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder scope(Output<WebACLLabelMatchScope> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder scope(WebACLLabelMatchScope scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }
        public WebACLLabelMatchStatementArgs build() {
            return new WebACLLabelMatchStatementArgs(key, scope);
        }
    }
}
