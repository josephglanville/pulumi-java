// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * The priority that Amazon Lex should use when eliciting slot values from a user.
 * 
 */
public final class BotSlotPriorityArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotSlotPriorityArgs Empty = new BotSlotPriorityArgs();

    @InputImport(name="priority", required=true)
      private final Input<Integer> priority;

    public Input<Integer> getPriority() {
        return this.priority;
    }

    /**
     * The name of the slot.
     * 
     */
    @InputImport(name="slotName", required=true)
      private final Input<String> slotName;

    public Input<String> getSlotName() {
        return this.slotName;
    }

    public BotSlotPriorityArgs(
        Input<Integer> priority,
        Input<String> slotName) {
        this.priority = Objects.requireNonNull(priority, "expected parameter 'priority' to be non-null");
        this.slotName = Objects.requireNonNull(slotName, "expected parameter 'slotName' to be non-null");
    }

    private BotSlotPriorityArgs() {
        this.priority = Input.empty();
        this.slotName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotSlotPriorityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> priority;
        private Input<String> slotName;

        public Builder() {
    	      // Empty
        }

        public Builder(BotSlotPriorityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.priority = defaults.priority;
    	      this.slotName = defaults.slotName;
        }

        public Builder setPriority(Input<Integer> priority) {
            this.priority = Objects.requireNonNull(priority);
            return this;
        }

        public Builder setPriority(Integer priority) {
            this.priority = Input.of(Objects.requireNonNull(priority));
            return this;
        }

        public Builder setSlotName(Input<String> slotName) {
            this.slotName = Objects.requireNonNull(slotName);
            return this;
        }

        public Builder setSlotName(String slotName) {
            this.slotName = Input.of(Objects.requireNonNull(slotName));
            return this;
        }
        public BotSlotPriorityArgs build() {
            return new BotSlotPriorityArgs(priority, slotName);
        }
    }
}
