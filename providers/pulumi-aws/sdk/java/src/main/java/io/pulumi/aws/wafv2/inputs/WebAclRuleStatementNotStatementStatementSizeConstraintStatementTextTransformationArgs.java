// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class WebAclRuleStatementNotStatementStatementSizeConstraintStatementTextTransformationArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAclRuleStatementNotStatementStatementSizeConstraintStatementTextTransformationArgs Empty = new WebAclRuleStatementNotStatementStatementSizeConstraintStatementTextTransformationArgs();

    /**
     * The relative processing order for multiple transformations that are defined for a rule statement. AWS WAF processes all transformations, from lowest priority to highest, before inspecting the transformed content.
     * 
     */
    @Import(name="priority", required=true)
      private final Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority;
    }

    /**
     * The transformation to apply, please refer to the Text Transformation [documentation](https://docs.aws.amazon.com/waf/latest/APIReference/API_TextTransformation.html) for more details.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public WebAclRuleStatementNotStatementStatementSizeConstraintStatementTextTransformationArgs(
        Output<Integer> priority,
        Output<String> type) {
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private WebAclRuleStatementNotStatementStatementSizeConstraintStatementTextTransformationArgs() {
        this.priority = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAclRuleStatementNotStatementStatementSizeConstraintStatementTextTransformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> priority;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAclRuleStatementNotStatementStatementSizeConstraintStatementTextTransformationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.type = defaults.type;
        }

        public Builder priority(Output<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }
        public Builder priority(Integer priority) {
            this.priority = Output.of(Objects.requireNonNull(priority));
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public WebAclRuleStatementNotStatementStatementSizeConstraintStatementTextTransformationArgs build() {
            return new WebAclRuleStatementNotStatementStatementSizeConstraintStatementTextTransformationArgs(priority, type);
        }
    }
}