// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.random.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RandomIdState extends io.pulumi.resources.ResourceArgs {

    public static final RandomIdState Empty = new RandomIdState();

    /**
     * The generated id presented in base64 without additional transformations.
     * 
     */
    @InputImport(name="b64Std")
      private final @Nullable Input<String> b64Std;

    public Input<String> getB64Std() {
        return this.b64Std == null ? Input.empty() : this.b64Std;
    }

    /**
     * The generated id presented in base64, using the URL-friendly character set: case-sensitive letters, digits and the characters `_` and `-`.
     * 
     */
    @InputImport(name="b64Url")
      private final @Nullable Input<String> b64Url;

    public Input<String> getB64Url() {
        return this.b64Url == null ? Input.empty() : this.b64Url;
    }

    /**
     * The number of random bytes to produce. The minimum value is 1, which produces eight bits of randomness.
     * 
     */
    @InputImport(name="byteLength")
      private final @Nullable Input<Integer> byteLength;

    public Input<Integer> getByteLength() {
        return this.byteLength == null ? Input.empty() : this.byteLength;
    }

    /**
     * The generated id presented in non-padded decimal digits.
     * 
     */
    @InputImport(name="dec")
      private final @Nullable Input<String> dec;

    public Input<String> getDec() {
        return this.dec == null ? Input.empty() : this.dec;
    }

    /**
     * The generated id presented in padded hexadecimal digits. This result will always be twice as long as the requested byte length.
     * 
     */
    @InputImport(name="hex")
      private final @Nullable Input<String> hex;

    public Input<String> getHex() {
        return this.hex == null ? Input.empty() : this.hex;
    }

    /**
     * Arbitrary map of values that, when changed, will trigger recreation of resource. See the main provider documentation for more information.
     * 
     */
    @InputImport(name="keepers")
      private final @Nullable Input<Map<String,Object>> keepers;

    public Input<Map<String,Object>> getKeepers() {
        return this.keepers == null ? Input.empty() : this.keepers;
    }

    /**
     * Arbitrary string to prefix the output value with. This string is supplied as-is, meaning it is not guaranteed to be URL-safe or base64 encoded.
     * 
     */
    @InputImport(name="prefix")
      private final @Nullable Input<String> prefix;

    public Input<String> getPrefix() {
        return this.prefix == null ? Input.empty() : this.prefix;
    }

    public RandomIdState(
        @Nullable Input<String> b64Std,
        @Nullable Input<String> b64Url,
        @Nullable Input<Integer> byteLength,
        @Nullable Input<String> dec,
        @Nullable Input<String> hex,
        @Nullable Input<Map<String,Object>> keepers,
        @Nullable Input<String> prefix) {
        this.b64Std = b64Std;
        this.b64Url = b64Url;
        this.byteLength = byteLength;
        this.dec = dec;
        this.hex = hex;
        this.keepers = keepers;
        this.prefix = prefix;
    }

    private RandomIdState() {
        this.b64Std = Input.empty();
        this.b64Url = Input.empty();
        this.byteLength = Input.empty();
        this.dec = Input.empty();
        this.hex = Input.empty();
        this.keepers = Input.empty();
        this.prefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RandomIdState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> b64Std;
        private @Nullable Input<String> b64Url;
        private @Nullable Input<Integer> byteLength;
        private @Nullable Input<String> dec;
        private @Nullable Input<String> hex;
        private @Nullable Input<Map<String,Object>> keepers;
        private @Nullable Input<String> prefix;

        public Builder() {
    	      // Empty
        }

        public Builder(RandomIdState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.b64Std = defaults.b64Std;
    	      this.b64Url = defaults.b64Url;
    	      this.byteLength = defaults.byteLength;
    	      this.dec = defaults.dec;
    	      this.hex = defaults.hex;
    	      this.keepers = defaults.keepers;
    	      this.prefix = defaults.prefix;
        }

        public Builder setB64Std(@Nullable Input<String> b64Std) {
            this.b64Std = b64Std;
            return this;
        }

        public Builder setB64Std(@Nullable String b64Std) {
            this.b64Std = Input.ofNullable(b64Std);
            return this;
        }

        public Builder setB64Url(@Nullable Input<String> b64Url) {
            this.b64Url = b64Url;
            return this;
        }

        public Builder setB64Url(@Nullable String b64Url) {
            this.b64Url = Input.ofNullable(b64Url);
            return this;
        }

        public Builder setByteLength(@Nullable Input<Integer> byteLength) {
            this.byteLength = byteLength;
            return this;
        }

        public Builder setByteLength(@Nullable Integer byteLength) {
            this.byteLength = Input.ofNullable(byteLength);
            return this;
        }

        public Builder setDec(@Nullable Input<String> dec) {
            this.dec = dec;
            return this;
        }

        public Builder setDec(@Nullable String dec) {
            this.dec = Input.ofNullable(dec);
            return this;
        }

        public Builder setHex(@Nullable Input<String> hex) {
            this.hex = hex;
            return this;
        }

        public Builder setHex(@Nullable String hex) {
            this.hex = Input.ofNullable(hex);
            return this;
        }

        public Builder setKeepers(@Nullable Input<Map<String,Object>> keepers) {
            this.keepers = keepers;
            return this;
        }

        public Builder setKeepers(@Nullable Map<String,Object> keepers) {
            this.keepers = Input.ofNullable(keepers);
            return this;
        }

        public Builder setPrefix(@Nullable Input<String> prefix) {
            this.prefix = prefix;
            return this;
        }

        public Builder setPrefix(@Nullable String prefix) {
            this.prefix = Input.ofNullable(prefix);
            return this;
        }
        public RandomIdState build() {
            return new RandomIdState(b64Std, b64Url, byteLength, dec, hex, keepers, prefix);
        }
    }
}
