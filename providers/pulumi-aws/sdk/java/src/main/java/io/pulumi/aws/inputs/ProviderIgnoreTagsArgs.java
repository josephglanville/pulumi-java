// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProviderIgnoreTagsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProviderIgnoreTagsArgs Empty = new ProviderIgnoreTagsArgs();

    @Import(name="keyPrefixes")
      private final @Nullable Output<List<String>> keyPrefixes;

    public Output<List<String>> getKeyPrefixes() {
        return this.keyPrefixes == null ? Output.empty() : this.keyPrefixes;
    }

    @Import(name="keys")
      private final @Nullable Output<List<String>> keys;

    public Output<List<String>> getKeys() {
        return this.keys == null ? Output.empty() : this.keys;
    }

    public ProviderIgnoreTagsArgs(
        @Nullable Output<List<String>> keyPrefixes,
        @Nullable Output<List<String>> keys) {
        this.keyPrefixes = keyPrefixes;
        this.keys = keys;
    }

    private ProviderIgnoreTagsArgs() {
        this.keyPrefixes = Output.empty();
        this.keys = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderIgnoreTagsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> keyPrefixes;
        private @Nullable Output<List<String>> keys;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderIgnoreTagsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyPrefixes = defaults.keyPrefixes;
    	      this.keys = defaults.keys;
        }

        public Builder keyPrefixes(@Nullable Output<List<String>> keyPrefixes) {
            this.keyPrefixes = keyPrefixes;
            return this;
        }
        public Builder keyPrefixes(@Nullable List<String> keyPrefixes) {
            this.keyPrefixes = Output.ofNullable(keyPrefixes);
            return this;
        }
        public Builder keyPrefixes(String... keyPrefixes) {
            return keyPrefixes(List.of(keyPrefixes));
        }
        public Builder keys(@Nullable Output<List<String>> keys) {
            this.keys = keys;
            return this;
        }
        public Builder keys(@Nullable List<String> keys) {
            this.keys = Output.ofNullable(keys);
            return this;
        }
        public Builder keys(String... keys) {
            return keys(List.of(keys));
        }        public ProviderIgnoreTagsArgs build() {
            return new ProviderIgnoreTagsArgs(keyPrefixes, keys);
        }
    }
}
