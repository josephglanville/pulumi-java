// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.random;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;

import javax.annotation.Nullable;
import java.util.Map;
import java.util.Objects;


public final class RandomPetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RandomPetArgs Empty = new RandomPetArgs();

    /**
     * Arbitrary map of values that, when changed, will trigger recreation of resource. See the main provider documentation for more information.
     * 
     */
    @InputImport(name="keepers")
      private final @Nullable Output<Map<String,Object>> keepers;

    public Output<Map<String,Object>> getKeepers() {
        return this.keepers == null ? Output.empty() : this.keepers;
    }

    /**
     * The length (in words) of the pet name.
     * 
     */
    @InputImport(name="length")
      private final @Nullable Output<Integer> length;

    public Output<Integer> getLength() {
        return this.length == null ? Output.empty() : this.length;
    }

    /**
     * A string to prefix the name with.
     * 
     */
    @InputImport(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> getPrefix() {
        return this.prefix == null ? Output.empty() : this.prefix;
    }

    /**
     * The character to separate words in the pet name.
     * 
     */
    @InputImport(name="separator")
      private final @Nullable Output<String> separator;

    public Output<String> getSeparator() {
        return this.separator == null ? Output.empty() : this.separator;
    }

    public RandomPetArgs(
        @Nullable Output<Map<String,Object>> keepers,
        @Nullable Output<Integer> length,
        @Nullable Output<String> prefix,
        @Nullable Output<String> separator) {
        this.keepers = keepers;
        this.length = length;
        this.prefix = prefix;
        this.separator = separator;
    }

    private RandomPetArgs() {
        this.keepers = Output.empty();
        this.length = Output.empty();
        this.prefix = Output.empty();
        this.separator = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RandomPetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,Object>> keepers;
        private @Nullable Output<Integer> length;
        private @Nullable Output<String> prefix;
        private @Nullable Output<String> separator;

        public Builder() {
    	      // Empty
        }

        public Builder(RandomPetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keepers = defaults.keepers;
    	      this.length = defaults.length;
    	      this.prefix = defaults.prefix;
    	      this.separator = defaults.separator;
        }

        public Builder keepers(@Nullable Output<Map<String,Object>> keepers) {
            this.keepers = keepers;
            return this;
        }

        public Builder keepers(@Nullable Map<String,Object> keepers) {
            this.keepers = Output.ofNullable(keepers);
            return this;
        }

        public Builder length(@Nullable Output<Integer> length) {
            this.length = length;
            return this;
        }

        public Builder length(@Nullable Integer length) {
            this.length = Output.ofNullable(length);
            return this;
        }

        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder prefix(@Nullable String prefix) {
            this.prefix = Output.ofNullable(prefix);
            return this;
        }

        public Builder separator(@Nullable Output<String> separator) {
            this.separator = separator;
            return this;
        }

        public Builder separator(@Nullable String separator) {
            this.separator = Output.ofNullable(separator);
            return this;
        }
        public RandomPetArgs build() {
            return new RandomPetArgs(keepers, length, prefix, separator);
        }
    }
}
