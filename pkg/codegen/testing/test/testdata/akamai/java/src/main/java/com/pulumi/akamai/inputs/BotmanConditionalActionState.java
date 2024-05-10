// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BotmanConditionalActionState extends com.pulumi.resources.ResourceArgs {

    public static final BotmanConditionalActionState Empty = new BotmanConditionalActionState();

    @Import(name="actionId")
    private @Nullable Output<String> actionId;

    public Optional<Output<String>> actionId() {
        return Optional.ofNullable(this.actionId);
    }

    @Import(name="conditionalAction")
    private @Nullable Output<String> conditionalAction;

    public Optional<Output<String>> conditionalAction() {
        return Optional.ofNullable(this.conditionalAction);
    }

    @Import(name="configId")
    private @Nullable Output<Integer> configId;

    public Optional<Output<Integer>> configId() {
        return Optional.ofNullable(this.configId);
    }

    private BotmanConditionalActionState() {}

    private BotmanConditionalActionState(BotmanConditionalActionState $) {
        this.actionId = $.actionId;
        this.conditionalAction = $.conditionalAction;
        this.configId = $.configId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotmanConditionalActionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotmanConditionalActionState $;

        public Builder() {
            $ = new BotmanConditionalActionState();
        }

        public Builder(BotmanConditionalActionState defaults) {
            $ = new BotmanConditionalActionState(Objects.requireNonNull(defaults));
        }

        public Builder actionId(@Nullable Output<String> actionId) {
            $.actionId = actionId;
            return this;
        }

        public Builder actionId(String actionId) {
            return actionId(Output.of(actionId));
        }

        public Builder conditionalAction(@Nullable Output<String> conditionalAction) {
            $.conditionalAction = conditionalAction;
            return this;
        }

        public Builder conditionalAction(String conditionalAction) {
            return conditionalAction(Output.of(conditionalAction));
        }

        public Builder configId(@Nullable Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public BotmanConditionalActionState build() {
            return $;
        }
    }

}
