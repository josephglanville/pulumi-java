// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.RuleGroupTextTransformationType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;


/**
 * Text Transformation on the Search String before match.
 * 
 */
public final class RuleGroupTextTransformationArgs extends io.pulumi.resources.ResourceArgs {

    public static final RuleGroupTextTransformationArgs Empty = new RuleGroupTextTransformationArgs();

    @Import(name="priority", required=true)
      private final Output<Integer> priority;

    public Output<Integer> getPriority() {
        return this.priority;
    }

    @Import(name="type", required=true)
      private final Output<RuleGroupTextTransformationType> type;

    public Output<RuleGroupTextTransformationType> getType() {
        return this.type;
    }

    public RuleGroupTextTransformationArgs(
        Output<Integer> priority,
        Output<RuleGroupTextTransformationType> type) {
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private RuleGroupTextTransformationArgs() {
        this.priority = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleGroupTextTransformationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> priority;
        private Output<RuleGroupTextTransformationType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleGroupTextTransformationArgs defaults) {
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
        public Builder type(Output<RuleGroupTextTransformationType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(RuleGroupTextTransformationType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public RuleGroupTextTransformationArgs build() {
            return new RuleGroupTextTransformationArgs(priority, type);
        }
    }
}
