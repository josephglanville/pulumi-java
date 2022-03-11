// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.awsnative.lex.inputs.BotSampleValueArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Value that the slot type can take.
 * 
 */
public final class BotSlotTypeValueArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotSlotTypeValueArgs Empty = new BotSlotTypeValueArgs();

    @InputImport(name="sampleValue", required=true)
      private final Output<BotSampleValueArgs> sampleValue;

    public Output<BotSampleValueArgs> getSampleValue() {
        return this.sampleValue;
    }

    @InputImport(name="synonyms")
      private final @Nullable Output<List<BotSampleValueArgs>> synonyms;

    public Output<List<BotSampleValueArgs>> getSynonyms() {
        return this.synonyms == null ? Output.empty() : this.synonyms;
    }

    public BotSlotTypeValueArgs(
        Output<BotSampleValueArgs> sampleValue,
        @Nullable Output<List<BotSampleValueArgs>> synonyms) {
        this.sampleValue = Objects.requireNonNull(sampleValue, "expected parameter 'sampleValue' to be non-null");
        this.synonyms = synonyms;
    }

    private BotSlotTypeValueArgs() {
        this.sampleValue = Output.empty();
        this.synonyms = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotSlotTypeValueArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<BotSampleValueArgs> sampleValue;
        private @Nullable Output<List<BotSampleValueArgs>> synonyms;

        public Builder() {
    	      // Empty
        }

        public Builder(BotSlotTypeValueArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sampleValue = defaults.sampleValue;
    	      this.synonyms = defaults.synonyms;
        }

        public Builder sampleValue(Output<BotSampleValueArgs> sampleValue) {
            this.sampleValue = Objects.requireNonNull(sampleValue);
            return this;
        }

        public Builder sampleValue(BotSampleValueArgs sampleValue) {
            this.sampleValue = Output.of(Objects.requireNonNull(sampleValue));
            return this;
        }

        public Builder synonyms(@Nullable Output<List<BotSampleValueArgs>> synonyms) {
            this.synonyms = synonyms;
            return this;
        }

        public Builder synonyms(@Nullable List<BotSampleValueArgs> synonyms) {
            this.synonyms = Output.ofNullable(synonyms);
            return this;
        }
        public BotSlotTypeValueArgs build() {
            return new BotSlotTypeValueArgs(sampleValue, synonyms);
        }
    }
}
