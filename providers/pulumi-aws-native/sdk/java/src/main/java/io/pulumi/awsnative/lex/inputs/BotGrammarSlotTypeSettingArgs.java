// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotGrammarSlotTypeSourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Settings required for a slot type based on a grammar that you provide.
 * 
 */
public final class BotGrammarSlotTypeSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotGrammarSlotTypeSettingArgs Empty = new BotGrammarSlotTypeSettingArgs();

    @InputImport(name="source")
      private final @Nullable Input<BotGrammarSlotTypeSourceArgs> source;

    public Input<BotGrammarSlotTypeSourceArgs> getSource() {
        return this.source == null ? Input.empty() : this.source;
    }

    public BotGrammarSlotTypeSettingArgs(@Nullable Input<BotGrammarSlotTypeSourceArgs> source) {
        this.source = source;
    }

    private BotGrammarSlotTypeSettingArgs() {
        this.source = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotGrammarSlotTypeSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<BotGrammarSlotTypeSourceArgs> source;

        public Builder() {
    	      // Empty
        }

        public Builder(BotGrammarSlotTypeSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.source = defaults.source;
        }

        public Builder setSource(@Nullable Input<BotGrammarSlotTypeSourceArgs> source) {
            this.source = source;
            return this;
        }

        public Builder setSource(@Nullable BotGrammarSlotTypeSourceArgs source) {
            this.source = Input.ofNullable(source);
            return this;
        }
        public BotGrammarSlotTypeSettingArgs build() {
            return new BotGrammarSlotTypeSettingArgs(source);
        }
    }
}
