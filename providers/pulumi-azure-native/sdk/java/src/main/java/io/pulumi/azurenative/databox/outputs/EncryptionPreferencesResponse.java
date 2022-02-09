// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class EncryptionPreferencesResponse {
    private final @Nullable String doubleEncryption;

    @OutputCustomType.Constructor({"doubleEncryption"})
    private EncryptionPreferencesResponse(@Nullable String doubleEncryption) {
        this.doubleEncryption = doubleEncryption;
    }

    public Optional<String> getDoubleEncryption() {
        return Optional.ofNullable(this.doubleEncryption);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EncryptionPreferencesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String doubleEncryption;

        public Builder() {
    	      // Empty
        }

        public Builder(EncryptionPreferencesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.doubleEncryption = defaults.doubleEncryption;
        }

        public Builder setDoubleEncryption(@Nullable String doubleEncryption) {
            this.doubleEncryption = doubleEncryption;
            return this;
        }

        public EncryptionPreferencesResponse build() {
            return new EncryptionPreferencesResponse(doubleEncryption);
        }
    }
}
