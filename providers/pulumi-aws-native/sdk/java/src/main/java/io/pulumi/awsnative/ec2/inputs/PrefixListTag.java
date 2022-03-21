// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrefixListTag extends io.pulumi.resources.InvokeArgs {

    public static final PrefixListTag Empty = new PrefixListTag();

    @Import(name="key", required=true)
      private final String key;

    public String getKey() {
        return this.key;
    }

    @Import(name="value")
      private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public PrefixListTag(
        String key,
        @Nullable String value) {
        this.key = Objects.requireNonNull(key, "expected parameter 'key' to be non-null");
        this.value = value;
    }

    private PrefixListTag() {
        this.key = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrefixListTag defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String key;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(PrefixListTag defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.value = defaults.value;
        }

        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public PrefixListTag build() {
            return new PrefixListTag(key, value);
        }
    }
}
