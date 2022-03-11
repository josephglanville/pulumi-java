// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lex.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * A regular expression used to validate the value of a slot.
 * 
 */
public final class BotSlotValueRegexFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final BotSlotValueRegexFilterArgs Empty = new BotSlotValueRegexFilterArgs();

    /**
     * Regex pattern
     * 
     */
    @InputImport(name="pattern", required=true)
      private final Output<String> pattern;

    public Output<String> getPattern() {
        return this.pattern;
    }

    public BotSlotValueRegexFilterArgs(Output<String> pattern) {
        this.pattern = Objects.requireNonNull(pattern, "expected parameter 'pattern' to be non-null");
    }

    private BotSlotValueRegexFilterArgs() {
        this.pattern = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BotSlotValueRegexFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> pattern;

        public Builder() {
    	      // Empty
        }

        public Builder(BotSlotValueRegexFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.pattern = defaults.pattern;
        }

        public Builder pattern(Output<String> pattern) {
            this.pattern = Objects.requireNonNull(pattern);
            return this;
        }

        public Builder pattern(String pattern) {
            this.pattern = Output.of(Objects.requireNonNull(pattern));
            return this;
        }
        public BotSlotValueRegexFilterArgs build() {
            return new BotSlotValueRegexFilterArgs(pattern);
        }
    }
}
