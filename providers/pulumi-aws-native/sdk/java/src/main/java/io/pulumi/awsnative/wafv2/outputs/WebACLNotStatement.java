// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.outputs;

import io.pulumi.awsnative.wafv2.outputs.WebACLStatement;
import io.pulumi.core.annotations.CustomType;
import java.util.Objects;

@CustomType
public final class WebACLNotStatement {
    private final WebACLStatement statement;

    @CustomType.Constructor
    private WebACLNotStatement(@CustomType.Parameter("statement") WebACLStatement statement) {
        this.statement = statement;
    }

    public WebACLStatement getStatement() {
        return this.statement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLNotStatement defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLStatement statement;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLNotStatement defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.statement = defaults.statement;
        }

        public Builder statement(WebACLStatement statement) {
            this.statement = Objects.requireNonNull(statement);
            return this;
        }        public WebACLNotStatement build() {
            return new WebACLNotStatement(statement);
        }
    }
}
