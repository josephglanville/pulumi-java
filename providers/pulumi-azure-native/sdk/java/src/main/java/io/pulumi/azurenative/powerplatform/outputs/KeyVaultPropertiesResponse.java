// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform.outputs;

import io.pulumi.azurenative.powerplatform.outputs.KeyPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KeyVaultPropertiesResponse {
    private final @Nullable String id;
    private final @Nullable KeyPropertiesResponse key;

    @OutputCustomType.Constructor({"id","key"})
    private KeyVaultPropertiesResponse(
        @Nullable String id,
        @Nullable KeyPropertiesResponse key) {
        this.id = id;
        this.key = key;
    }

    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<KeyPropertiesResponse> getKey() {
        return Optional.ofNullable(this.key);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable KeyPropertiesResponse key;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.key = defaults.key;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setKey(@Nullable KeyPropertiesResponse key) {
            this.key = key;
            return this;
        }

        public KeyVaultPropertiesResponse build() {
            return new KeyVaultPropertiesResponse(id, key);
        }
    }
}
