// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotDialogCodeHookSettingArgs;
import io.pulumi.awsnative.lex.inputs.BotFulfillmentCodeHookSettingArgs;
import io.pulumi.awsnative.lex.inputs.BotInputContextArgs;
import io.pulumi.awsnative.lex.inputs.BotIntentClosingSettingArgs;
import io.pulumi.awsnative.lex.inputs.BotIntentConfirmationSettingArgs;
import io.pulumi.awsnative.lex.inputs.BotKendraConfigurationArgs;
import io.pulumi.awsnative.lex.inputs.BotOutputContextArgs;
import io.pulumi.awsnative.lex.inputs.BotSampleUtteranceArgs;
import io.pulumi.awsnative.lex.inputs.BotSlotArgs;
import io.pulumi.awsnative.lex.inputs.BotSlotPriorityArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An intent represents an action that the user wants to perform. You create a bot to support one or more related intents.
 * 
 */
public final class BotIntentArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotIntentArgs Empty = new BotIntentArgs();

    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    @InputImport(name="dialogCodeHook")
      private final @Nullable Output<BotDialogCodeHookSettingArgs> dialogCodeHook;

    public Output<BotDialogCodeHookSettingArgs> getDialogCodeHook() {
        return this.dialogCodeHook == null ? Output.empty() : this.dialogCodeHook;
    }

    @InputImport(name="fulfillmentCodeHook")
      private final @Nullable Output<BotFulfillmentCodeHookSettingArgs> fulfillmentCodeHook;

    public Output<BotFulfillmentCodeHookSettingArgs> getFulfillmentCodeHook() {
        return this.fulfillmentCodeHook == null ? Output.empty() : this.fulfillmentCodeHook;
    }

    @InputImport(name="inputContexts")
      private final @Nullable Output<List<BotInputContextArgs>> inputContexts;

    public Output<List<BotInputContextArgs>> getInputContexts() {
        return this.inputContexts == null ? Output.empty() : this.inputContexts;
    }

    @InputImport(name="intentClosingSetting")
      private final @Nullable Output<BotIntentClosingSettingArgs> intentClosingSetting;

    public Output<BotIntentClosingSettingArgs> getIntentClosingSetting() {
        return this.intentClosingSetting == null ? Output.empty() : this.intentClosingSetting;
    }

    @InputImport(name="intentConfirmationSetting")
      private final @Nullable Output<BotIntentConfirmationSettingArgs> intentConfirmationSetting;

    public Output<BotIntentConfirmationSettingArgs> getIntentConfirmationSetting() {
        return this.intentConfirmationSetting == null ? Output.empty() : this.intentConfirmationSetting;
    }

    @InputImport(name="kendraConfiguration")
      private final @Nullable Output<BotKendraConfigurationArgs> kendraConfiguration;

    public Output<BotKendraConfigurationArgs> getKendraConfiguration() {
        return this.kendraConfiguration == null ? Output.empty() : this.kendraConfiguration;
    }

    @InputImport(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    @InputImport(name="outputContexts")
      private final @Nullable Output<List<BotOutputContextArgs>> outputContexts;

    public Output<List<BotOutputContextArgs>> getOutputContexts() {
        return this.outputContexts == null ? Output.empty() : this.outputContexts;
    }

    @InputImport(name="parentIntentSignature")
      private final @Nullable Output<String> parentIntentSignature;

    public Output<String> getParentIntentSignature() {
        return this.parentIntentSignature == null ? Output.empty() : this.parentIntentSignature;
    }

    @InputImport(name="sampleUtterances")
      private final @Nullable Output<List<BotSampleUtteranceArgs>> sampleUtterances;

    public Output<List<BotSampleUtteranceArgs>> getSampleUtterances() {
        return this.sampleUtterances == null ? Output.empty() : this.sampleUtterances;
    }

    @InputImport(name="slotPriorities")
      private final @Nullable Output<List<BotSlotPriorityArgs>> slotPriorities;

    public Output<List<BotSlotPriorityArgs>> getSlotPriorities() {
        return this.slotPriorities == null ? Output.empty() : this.slotPriorities;
    }

    /**
     * List of slots
     * 
     */
    @InputImport(name="slots")
      private final @Nullable Output<List<BotSlotArgs>> slots;

    public Output<List<BotSlotArgs>> getSlots() {
        return this.slots == null ? Output.empty() : this.slots;
    }

    public BotIntentArgs(
        @Nullable Output<String> description,
        @Nullable Output<BotDialogCodeHookSettingArgs> dialogCodeHook,
        @Nullable Output<BotFulfillmentCodeHookSettingArgs> fulfillmentCodeHook,
        @Nullable Output<List<BotInputContextArgs>> inputContexts,
        @Nullable Output<BotIntentClosingSettingArgs> intentClosingSetting,
        @Nullable Output<BotIntentConfirmationSettingArgs> intentConfirmationSetting,
        @Nullable Output<BotKendraConfigurationArgs> kendraConfiguration,
        Output<String> name,
        @Nullable Output<List<BotOutputContextArgs>> outputContexts,
        @Nullable Output<String> parentIntentSignature,
        @Nullable Output<List<BotSampleUtteranceArgs>> sampleUtterances,
        @Nullable Output<List<BotSlotPriorityArgs>> slotPriorities,
        @Nullable Output<List<BotSlotArgs>> slots) {
        this.description = description;
        this.dialogCodeHook = dialogCodeHook;
        this.fulfillmentCodeHook = fulfillmentCodeHook;
        this.inputContexts = inputContexts;
        this.intentClosingSetting = intentClosingSetting;
        this.intentConfirmationSetting = intentConfirmationSetting;
        this.kendraConfiguration = kendraConfiguration;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.outputContexts = outputContexts;
        this.parentIntentSignature = parentIntentSignature;
        this.sampleUtterances = sampleUtterances;
        this.slotPriorities = slotPriorities;
        this.slots = slots;
    }

    private BotIntentArgs() {
        this.description = Output.empty();
        this.dialogCodeHook = Output.empty();
        this.fulfillmentCodeHook = Output.empty();
        this.inputContexts = Output.empty();
        this.intentClosingSetting = Output.empty();
        this.intentConfirmationSetting = Output.empty();
        this.kendraConfiguration = Output.empty();
        this.name = Output.empty();
        this.outputContexts = Output.empty();
        this.parentIntentSignature = Output.empty();
        this.sampleUtterances = Output.empty();
        this.slotPriorities = Output.empty();
        this.slots = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotIntentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<BotDialogCodeHookSettingArgs> dialogCodeHook;
        private @Nullable Output<BotFulfillmentCodeHookSettingArgs> fulfillmentCodeHook;
        private @Nullable Output<List<BotInputContextArgs>> inputContexts;
        private @Nullable Output<BotIntentClosingSettingArgs> intentClosingSetting;
        private @Nullable Output<BotIntentConfirmationSettingArgs> intentConfirmationSetting;
        private @Nullable Output<BotKendraConfigurationArgs> kendraConfiguration;
        private Output<String> name;
        private @Nullable Output<List<BotOutputContextArgs>> outputContexts;
        private @Nullable Output<String> parentIntentSignature;
        private @Nullable Output<List<BotSampleUtteranceArgs>> sampleUtterances;
        private @Nullable Output<List<BotSlotPriorityArgs>> slotPriorities;
        private @Nullable Output<List<BotSlotArgs>> slots;

        public Builder() {
    	      // Empty
        }

        public Builder(BotIntentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.dialogCodeHook = defaults.dialogCodeHook;
    	      this.fulfillmentCodeHook = defaults.fulfillmentCodeHook;
    	      this.inputContexts = defaults.inputContexts;
    	      this.intentClosingSetting = defaults.intentClosingSetting;
    	      this.intentConfirmationSetting = defaults.intentConfirmationSetting;
    	      this.kendraConfiguration = defaults.kendraConfiguration;
    	      this.name = defaults.name;
    	      this.outputContexts = defaults.outputContexts;
    	      this.parentIntentSignature = defaults.parentIntentSignature;
    	      this.sampleUtterances = defaults.sampleUtterances;
    	      this.slotPriorities = defaults.slotPriorities;
    	      this.slots = defaults.slots;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder dialogCodeHook(@Nullable Output<BotDialogCodeHookSettingArgs> dialogCodeHook) {
            this.dialogCodeHook = dialogCodeHook;
            return this;
        }

        public Builder dialogCodeHook(@Nullable BotDialogCodeHookSettingArgs dialogCodeHook) {
            this.dialogCodeHook = Output.ofNullable(dialogCodeHook);
            return this;
        }

        public Builder fulfillmentCodeHook(@Nullable Output<BotFulfillmentCodeHookSettingArgs> fulfillmentCodeHook) {
            this.fulfillmentCodeHook = fulfillmentCodeHook;
            return this;
        }

        public Builder fulfillmentCodeHook(@Nullable BotFulfillmentCodeHookSettingArgs fulfillmentCodeHook) {
            this.fulfillmentCodeHook = Output.ofNullable(fulfillmentCodeHook);
            return this;
        }

        public Builder inputContexts(@Nullable Output<List<BotInputContextArgs>> inputContexts) {
            this.inputContexts = inputContexts;
            return this;
        }

        public Builder inputContexts(@Nullable List<BotInputContextArgs> inputContexts) {
            this.inputContexts = Output.ofNullable(inputContexts);
            return this;
        }

        public Builder intentClosingSetting(@Nullable Output<BotIntentClosingSettingArgs> intentClosingSetting) {
            this.intentClosingSetting = intentClosingSetting;
            return this;
        }

        public Builder intentClosingSetting(@Nullable BotIntentClosingSettingArgs intentClosingSetting) {
            this.intentClosingSetting = Output.ofNullable(intentClosingSetting);
            return this;
        }

        public Builder intentConfirmationSetting(@Nullable Output<BotIntentConfirmationSettingArgs> intentConfirmationSetting) {
            this.intentConfirmationSetting = intentConfirmationSetting;
            return this;
        }

        public Builder intentConfirmationSetting(@Nullable BotIntentConfirmationSettingArgs intentConfirmationSetting) {
            this.intentConfirmationSetting = Output.ofNullable(intentConfirmationSetting);
            return this;
        }

        public Builder kendraConfiguration(@Nullable Output<BotKendraConfigurationArgs> kendraConfiguration) {
            this.kendraConfiguration = kendraConfiguration;
            return this;
        }

        public Builder kendraConfiguration(@Nullable BotKendraConfigurationArgs kendraConfiguration) {
            this.kendraConfiguration = Output.ofNullable(kendraConfiguration);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder outputContexts(@Nullable Output<List<BotOutputContextArgs>> outputContexts) {
            this.outputContexts = outputContexts;
            return this;
        }

        public Builder outputContexts(@Nullable List<BotOutputContextArgs> outputContexts) {
            this.outputContexts = Output.ofNullable(outputContexts);
            return this;
        }

        public Builder parentIntentSignature(@Nullable Output<String> parentIntentSignature) {
            this.parentIntentSignature = parentIntentSignature;
            return this;
        }

        public Builder parentIntentSignature(@Nullable String parentIntentSignature) {
            this.parentIntentSignature = Output.ofNullable(parentIntentSignature);
            return this;
        }

        public Builder sampleUtterances(@Nullable Output<List<BotSampleUtteranceArgs>> sampleUtterances) {
            this.sampleUtterances = sampleUtterances;
            return this;
        }

        public Builder sampleUtterances(@Nullable List<BotSampleUtteranceArgs> sampleUtterances) {
            this.sampleUtterances = Output.ofNullable(sampleUtterances);
            return this;
        }

        public Builder slotPriorities(@Nullable Output<List<BotSlotPriorityArgs>> slotPriorities) {
            this.slotPriorities = slotPriorities;
            return this;
        }

        public Builder slotPriorities(@Nullable List<BotSlotPriorityArgs> slotPriorities) {
            this.slotPriorities = Output.ofNullable(slotPriorities);
            return this;
        }

        public Builder slots(@Nullable Output<List<BotSlotArgs>> slots) {
            this.slots = slots;
            return this;
        }

        public Builder slots(@Nullable List<BotSlotArgs> slots) {
            this.slots = Output.ofNullable(slots);
            return this;
        }
        public BotIntentArgs build() {
            return new BotIntentArgs(description, dialogCodeHook, fulfillmentCodeHook, inputContexts, intentClosingSetting, intentConfirmationSetting, kendraConfiguration, name, outputContexts, parentIntentSignature, sampleUtterances, slotPriorities, slots);
        }
    }
}
