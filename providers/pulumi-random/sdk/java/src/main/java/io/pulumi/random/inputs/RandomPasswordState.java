// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.random.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RandomPasswordState extends io.pulumi.resources.ResourceArgs {

    public static final RandomPasswordState Empty = new RandomPasswordState();

    /**
     * Arbitrary map of values that, when changed, will trigger recreation of resource. See the main provider documentation for more information.
     * 
     */
    @Import(name="keepers")
      private final @Nullable Output<Map<String,Object>> keepers;

    public Output<Map<String,Object>> getKeepers() {
        return this.keepers == null ? Codegen.empty() : this.keepers;
    }

    /**
     * The length of the string desired.
     * 
     */
    @Import(name="length")
      private final @Nullable Output<Integer> length;

    public Output<Integer> getLength() {
        return this.length == null ? Codegen.empty() : this.length;
    }

    /**
     * Include lowercase alphabet characters in the result.
     * 
     */
    @Import(name="lower")
      private final @Nullable Output<Boolean> lower;

    public Output<Boolean> getLower() {
        return this.lower == null ? Codegen.empty() : this.lower;
    }

    /**
     * Minimum number of lowercase alphabet characters in the result.
     * 
     */
    @Import(name="minLower")
      private final @Nullable Output<Integer> minLower;

    public Output<Integer> getMinLower() {
        return this.minLower == null ? Codegen.empty() : this.minLower;
    }

    /**
     * Minimum number of numeric characters in the result.
     * 
     */
    @Import(name="minNumeric")
      private final @Nullable Output<Integer> minNumeric;

    public Output<Integer> getMinNumeric() {
        return this.minNumeric == null ? Codegen.empty() : this.minNumeric;
    }

    /**
     * Minimum number of special characters in the result.
     * 
     */
    @Import(name="minSpecial")
      private final @Nullable Output<Integer> minSpecial;

    public Output<Integer> getMinSpecial() {
        return this.minSpecial == null ? Codegen.empty() : this.minSpecial;
    }

    /**
     * Minimum number of uppercase alphabet characters in the result.
     * 
     */
    @Import(name="minUpper")
      private final @Nullable Output<Integer> minUpper;

    public Output<Integer> getMinUpper() {
        return this.minUpper == null ? Codegen.empty() : this.minUpper;
    }

    /**
     * Include numeric characters in the result.
     * 
     */
    @Import(name="number")
      private final @Nullable Output<Boolean> number;

    public Output<Boolean> getNumber() {
        return this.number == null ? Codegen.empty() : this.number;
    }

    /**
     * Supply your own list of special characters to use for string generation.  This overrides the default character list in the special argument.  The `special` argument must still be set to true for any overwritten characters to be used in generation.
     * 
     */
    @Import(name="overrideSpecial")
      private final @Nullable Output<String> overrideSpecial;

    public Output<String> getOverrideSpecial() {
        return this.overrideSpecial == null ? Codegen.empty() : this.overrideSpecial;
    }

    /**
     * The generated random string.
     * 
     */
    @Import(name="result")
      private final @Nullable Output<String> result;

    public Output<String> getResult() {
        return this.result == null ? Codegen.empty() : this.result;
    }

    /**
     * Include special characters in the result. These are `!@#$%&*()-_=+[]{}<>:?`
     * 
     */
    @Import(name="special")
      private final @Nullable Output<Boolean> special;

    public Output<Boolean> getSpecial() {
        return this.special == null ? Codegen.empty() : this.special;
    }

    /**
     * Include uppercase alphabet characters in the result.
     * 
     */
    @Import(name="upper")
      private final @Nullable Output<Boolean> upper;

    public Output<Boolean> getUpper() {
        return this.upper == null ? Codegen.empty() : this.upper;
    }

    public RandomPasswordState(
        @Nullable Output<Map<String,Object>> keepers,
        @Nullable Output<Integer> length,
        @Nullable Output<Boolean> lower,
        @Nullable Output<Integer> minLower,
        @Nullable Output<Integer> minNumeric,
        @Nullable Output<Integer> minSpecial,
        @Nullable Output<Integer> minUpper,
        @Nullable Output<Boolean> number,
        @Nullable Output<String> overrideSpecial,
        @Nullable Output<String> result,
        @Nullable Output<Boolean> special,
        @Nullable Output<Boolean> upper) {
        this.keepers = keepers;
        this.length = length;
        this.lower = lower;
        this.minLower = minLower;
        this.minNumeric = minNumeric;
        this.minSpecial = minSpecial;
        this.minUpper = minUpper;
        this.number = number;
        this.overrideSpecial = overrideSpecial;
        this.result = result;
        this.special = special;
        this.upper = upper;
    }

    private RandomPasswordState() {
        this.keepers = Codegen.empty();
        this.length = Codegen.empty();
        this.lower = Codegen.empty();
        this.minLower = Codegen.empty();
        this.minNumeric = Codegen.empty();
        this.minSpecial = Codegen.empty();
        this.minUpper = Codegen.empty();
        this.number = Codegen.empty();
        this.overrideSpecial = Codegen.empty();
        this.result = Codegen.empty();
        this.special = Codegen.empty();
        this.upper = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RandomPasswordState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,Object>> keepers;
        private @Nullable Output<Integer> length;
        private @Nullable Output<Boolean> lower;
        private @Nullable Output<Integer> minLower;
        private @Nullable Output<Integer> minNumeric;
        private @Nullable Output<Integer> minSpecial;
        private @Nullable Output<Integer> minUpper;
        private @Nullable Output<Boolean> number;
        private @Nullable Output<String> overrideSpecial;
        private @Nullable Output<String> result;
        private @Nullable Output<Boolean> special;
        private @Nullable Output<Boolean> upper;

        public Builder() {
    	      // Empty
        }

        public Builder(RandomPasswordState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keepers = defaults.keepers;
    	      this.length = defaults.length;
    	      this.lower = defaults.lower;
    	      this.minLower = defaults.minLower;
    	      this.minNumeric = defaults.minNumeric;
    	      this.minSpecial = defaults.minSpecial;
    	      this.minUpper = defaults.minUpper;
    	      this.number = defaults.number;
    	      this.overrideSpecial = defaults.overrideSpecial;
    	      this.result = defaults.result;
    	      this.special = defaults.special;
    	      this.upper = defaults.upper;
        }

        public Builder keepers(@Nullable Output<Map<String,Object>> keepers) {
            this.keepers = keepers;
            return this;
        }
        public Builder keepers(@Nullable Map<String,Object> keepers) {
            this.keepers = Codegen.ofNullable(keepers);
            return this;
        }
        public Builder length(@Nullable Output<Integer> length) {
            this.length = length;
            return this;
        }
        public Builder length(@Nullable Integer length) {
            this.length = Codegen.ofNullable(length);
            return this;
        }
        public Builder lower(@Nullable Output<Boolean> lower) {
            this.lower = lower;
            return this;
        }
        public Builder lower(@Nullable Boolean lower) {
            this.lower = Codegen.ofNullable(lower);
            return this;
        }
        public Builder minLower(@Nullable Output<Integer> minLower) {
            this.minLower = minLower;
            return this;
        }
        public Builder minLower(@Nullable Integer minLower) {
            this.minLower = Codegen.ofNullable(minLower);
            return this;
        }
        public Builder minNumeric(@Nullable Output<Integer> minNumeric) {
            this.minNumeric = minNumeric;
            return this;
        }
        public Builder minNumeric(@Nullable Integer minNumeric) {
            this.minNumeric = Codegen.ofNullable(minNumeric);
            return this;
        }
        public Builder minSpecial(@Nullable Output<Integer> minSpecial) {
            this.minSpecial = minSpecial;
            return this;
        }
        public Builder minSpecial(@Nullable Integer minSpecial) {
            this.minSpecial = Codegen.ofNullable(minSpecial);
            return this;
        }
        public Builder minUpper(@Nullable Output<Integer> minUpper) {
            this.minUpper = minUpper;
            return this;
        }
        public Builder minUpper(@Nullable Integer minUpper) {
            this.minUpper = Codegen.ofNullable(minUpper);
            return this;
        }
        public Builder number(@Nullable Output<Boolean> number) {
            this.number = number;
            return this;
        }
        public Builder number(@Nullable Boolean number) {
            this.number = Codegen.ofNullable(number);
            return this;
        }
        public Builder overrideSpecial(@Nullable Output<String> overrideSpecial) {
            this.overrideSpecial = overrideSpecial;
            return this;
        }
        public Builder overrideSpecial(@Nullable String overrideSpecial) {
            this.overrideSpecial = Codegen.ofNullable(overrideSpecial);
            return this;
        }
        public Builder result(@Nullable Output<String> result) {
            this.result = result;
            return this;
        }
        public Builder result(@Nullable String result) {
            this.result = Codegen.ofNullable(result);
            return this;
        }
        public Builder special(@Nullable Output<Boolean> special) {
            this.special = special;
            return this;
        }
        public Builder special(@Nullable Boolean special) {
            this.special = Codegen.ofNullable(special);
            return this;
        }
        public Builder upper(@Nullable Output<Boolean> upper) {
            this.upper = upper;
            return this;
        }
        public Builder upper(@Nullable Boolean upper) {
            this.upper = Codegen.ofNullable(upper);
            return this;
        }        public RandomPasswordState build() {
            return new RandomPasswordState(keepers, length, lower, minLower, minNumeric, minSpecial, minUpper, number, overrideSpecial, result, special, upper);
        }
    }
}
