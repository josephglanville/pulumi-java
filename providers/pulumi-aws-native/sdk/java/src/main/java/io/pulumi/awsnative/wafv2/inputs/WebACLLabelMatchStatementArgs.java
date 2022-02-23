// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.WebACLLabelMatchScope;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class WebACLLabelMatchStatementArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebACLLabelMatchStatementArgs Empty = new WebACLLabelMatchStatementArgs();

    @InputImport(name="key", required=true)
      private final Input<String> key;

    public Input<String> getKey() {
        return this.key;
    }

    @InputImport(name="scope", required=true)
      private final Input<WebACLLabelMatchScope> scope;

    public Input<WebACLLabelMatchScope> getScope() {
        return this.scope;
    }

    public WebACLLabelMatchStatementArgs(
        Input<String> key,
        Input<WebACLLabelMatchScope> scope) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
    }

    private WebACLLabelMatchStatementArgs() {
        this.key = Input.empty();
        this.scope = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLLabelMatchStatementArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> key;
        private Input<WebACLLabelMatchScope> scope;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLLabelMatchStatementArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.scope = defaults.scope;
        }

        public Builder setKey(Input<String> key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }

        public Builder setKey(String key) {
            this.key = Input.of(Objects.requireNonNull(key));
            return this;
        }

        public Builder setScope(Input<WebACLLabelMatchScope> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }

        public Builder setScope(WebACLLabelMatchScope scope) {
            this.scope = Input.of(Objects.requireNonNull(scope));
            return this;
        }
        public WebACLLabelMatchStatementArgs build() {
            return new WebACLLabelMatchStatementArgs(key, scope);
        }
    }
}
