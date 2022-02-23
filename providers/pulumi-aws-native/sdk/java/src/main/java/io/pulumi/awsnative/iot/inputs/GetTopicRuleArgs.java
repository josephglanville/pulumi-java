// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iot.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetTopicRuleArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetTopicRuleArgs Empty = new GetTopicRuleArgs();

    @InputImport(name="ruleName", required=true)
      private final String ruleName;

    public String getRuleName() {
        return this.ruleName;
    }

    public GetTopicRuleArgs(String ruleName) {
        this.ruleName = Objects.requireNonNull(ruleName, "expected parameter 'ruleName' to be non-null");
    }

    private GetTopicRuleArgs() {
        this.ruleName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetTopicRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ruleName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetTopicRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ruleName = defaults.ruleName;
        }

        public Builder setRuleName(String ruleName) {
            this.ruleName = Objects.requireNonNull(ruleName);
            return this;
        }
        public GetTopicRuleArgs build() {
            return new GetTopicRuleArgs(ruleName);
        }
    }
}
