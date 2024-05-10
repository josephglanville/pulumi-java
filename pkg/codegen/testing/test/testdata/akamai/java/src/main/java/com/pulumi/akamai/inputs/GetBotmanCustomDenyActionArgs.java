// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBotmanCustomDenyActionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBotmanCustomDenyActionArgs Empty = new GetBotmanCustomDenyActionArgs();

    @Import(name="actionId")
    private @Nullable Output<String> actionId;

    public Optional<Output<String>> actionId() {
        return Optional.ofNullable(this.actionId);
    }

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    private GetBotmanCustomDenyActionArgs() {}

    private GetBotmanCustomDenyActionArgs(GetBotmanCustomDenyActionArgs $) {
        this.actionId = $.actionId;
        this.configId = $.configId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotmanCustomDenyActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotmanCustomDenyActionArgs $;

        public Builder() {
            $ = new GetBotmanCustomDenyActionArgs();
        }

        public Builder(GetBotmanCustomDenyActionArgs defaults) {
            $ = new GetBotmanCustomDenyActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder actionId(@Nullable Output<String> actionId) {
            $.actionId = actionId;
            return this;
        }

        public Builder actionId(String actionId) {
            return actionId(Output.of(actionId));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public GetBotmanCustomDenyActionArgs build() {
            if ($.configId == null) {
                throw new MissingRequiredPropertyException("GetBotmanCustomDenyActionArgs", "configId");
            }
            return $;
        }
    }

}
