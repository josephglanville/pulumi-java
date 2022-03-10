// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.outputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@OutputCustomType
public final class ProviderIgnoreTagsArgs {
    private final @Nullable Input<List<String>> keyPrefixes;
    private final @Nullable Input<List<String>> keys;

    @OutputCustomType.Constructor
    private ProviderIgnoreTagsArgs(
        @OutputCustomType.Parameter("keyPrefixes") @Nullable Input<List<String>> keyPrefixes,
        @OutputCustomType.Parameter("keys") @Nullable Input<List<String>> keys) {
        this.keyPrefixes = keyPrefixes;
        this.keys = keys;
    }

    public @Nullable Input<List<String>> getKeyPrefixes() {
        return this.keyPrefixes;
    }
    public @Nullable Input<List<String>> getKeys() {
        return this.keys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderIgnoreTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> keyPrefixes;
        private @Nullable Input<List<String>> keys;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderIgnoreTagsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyPrefixes = defaults.keyPrefixes;
    	      this.keys = defaults.keys;
        }

        public Builder setKeyPrefixes(@Nullable Input<List<String>> keyPrefixes) {
            this.keyPrefixes = keyPrefixes;
            return this;
        }

        public Builder setKeys(@Nullable Input<List<String>> keys) {
            this.keys = keys;
            return this;
        }
        public ProviderIgnoreTagsArgs build() {
            return new ProviderIgnoreTagsArgs(keyPrefixes, keys);
        }
    }
}
