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


public final class BotmanCustomBotCategoryActionState extends com.pulumi.resources.ResourceArgs {

    public static final BotmanCustomBotCategoryActionState Empty = new BotmanCustomBotCategoryActionState();

    @Import(name="categoryId")
    private @Nullable Output<String> categoryId;

    public Optional<Output<String>> categoryId() {
        return Optional.ofNullable(this.categoryId);
    }

    @Import(name="configId")
    private @Nullable Output<Integer> configId;

    public Optional<Output<Integer>> configId() {
        return Optional.ofNullable(this.configId);
    }

    @Import(name="customBotCategoryAction")
    private @Nullable Output<String> customBotCategoryAction;

    public Optional<Output<String>> customBotCategoryAction() {
        return Optional.ofNullable(this.customBotCategoryAction);
    }

    @Import(name="securityPolicyId")
    private @Nullable Output<String> securityPolicyId;

    public Optional<Output<String>> securityPolicyId() {
        return Optional.ofNullable(this.securityPolicyId);
    }

    private BotmanCustomBotCategoryActionState() {}

    private BotmanCustomBotCategoryActionState(BotmanCustomBotCategoryActionState $) {
        this.categoryId = $.categoryId;
        this.configId = $.configId;
        this.customBotCategoryAction = $.customBotCategoryAction;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotmanCustomBotCategoryActionState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotmanCustomBotCategoryActionState $;

        public Builder() {
            $ = new BotmanCustomBotCategoryActionState();
        }

        public Builder(BotmanCustomBotCategoryActionState defaults) {
            $ = new BotmanCustomBotCategoryActionState(Objects.requireNonNull(defaults));
        }

        public Builder categoryId(@Nullable Output<String> categoryId) {
            $.categoryId = categoryId;
            return this;
        }

        public Builder categoryId(String categoryId) {
            return categoryId(Output.of(categoryId));
        }

        public Builder configId(@Nullable Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public Builder customBotCategoryAction(@Nullable Output<String> customBotCategoryAction) {
            $.customBotCategoryAction = customBotCategoryAction;
            return this;
        }

        public Builder customBotCategoryAction(String customBotCategoryAction) {
            return customBotCategoryAction(Output.of(customBotCategoryAction));
        }

        public Builder securityPolicyId(@Nullable Output<String> securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        public Builder securityPolicyId(String securityPolicyId) {
            return securityPolicyId(Output.of(securityPolicyId));
        }

        public BotmanCustomBotCategoryActionState build() {
            return $;
        }
    }

}
