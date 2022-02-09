// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class StandardComponentPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final StandardComponentPropertiesResponse Empty = new StandardComponentPropertiesResponse();

    @InputImport(name="key")
    private final @Nullable String key;

    public Optional<String> getKey() {
        return this.key == null ? Optional.empty() : Optional.ofNullable(this.key);
    }

    public StandardComponentPropertiesResponse(@Nullable String key) {
        this.key = key;
    }

    private StandardComponentPropertiesResponse() {
        this.key = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StandardComponentPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String key;

        public Builder() {
    	      // Empty
        }

        public Builder(StandardComponentPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
        }

        public Builder setKey(@Nullable String key) {
            this.key = key;
            return this;
        }

        public StandardComponentPropertiesResponse build() {
            return new StandardComponentPropertiesResponse(key);
        }
    }
}
