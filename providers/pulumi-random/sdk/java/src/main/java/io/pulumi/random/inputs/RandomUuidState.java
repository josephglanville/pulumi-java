// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.random.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RandomUuidState extends io.pulumi.resources.ResourceArgs {

    public static final RandomUuidState Empty = new RandomUuidState();

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
     * The generated uuid presented in string format.
     * 
     */
    @InputImport(name="result")
      private final @Nullable Output<String> result;

    public Output<String> getResult() {
        return this.result == null ? Output.empty() : this.result;
    }

    public RandomUuidState(
        @Nullable Output<Map<String,Object>> keepers,
        @Nullable Output<String> result) {
        this.keepers = keepers;
        this.result = result;
    }

    private RandomUuidState() {
        this.keepers = Output.empty();
        this.result = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RandomUuidState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,Object>> keepers;
        private @Nullable Output<String> result;

        public Builder() {
    	      // Empty
        }

        public Builder(RandomUuidState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keepers = defaults.keepers;
    	      this.result = defaults.result;
        }

        public Builder keepers(@Nullable Output<Map<String,Object>> keepers) {
            this.keepers = keepers;
            return this;
        }

        public Builder keepers(@Nullable Map<String,Object> keepers) {
            this.keepers = Output.ofNullable(keepers);
            return this;
        }

        public Builder result(@Nullable Output<String> result) {
            this.result = result;
            return this;
        }

        public Builder result(@Nullable String result) {
            this.result = Output.ofNullable(result);
            return this;
        }
        public RandomUuidState build() {
            return new RandomUuidState(keepers, result);
        }
    }
}
