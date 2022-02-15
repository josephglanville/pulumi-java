// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class KeyVaultLastAccessStatusContractPropertiesResponse {
    private final @Nullable String code;
    private final @Nullable String message;
    private final @Nullable String timeStampUtc;

    @OutputCustomType.Constructor({"code","message","timeStampUtc"})
    private KeyVaultLastAccessStatusContractPropertiesResponse(
        @Nullable String code,
        @Nullable String message,
        @Nullable String timeStampUtc) {
        this.code = code;
        this.message = message;
        this.timeStampUtc = timeStampUtc;
    }

    public Optional<String> getCode() {
        return Optional.ofNullable(this.code);
    }
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    public Optional<String> getTimeStampUtc() {
        return Optional.ofNullable(this.timeStampUtc);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KeyVaultLastAccessStatusContractPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String code;
        private @Nullable String message;
        private @Nullable String timeStampUtc;

        public Builder() {
    	      // Empty
        }

        public Builder(KeyVaultLastAccessStatusContractPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.code = defaults.code;
    	      this.message = defaults.message;
    	      this.timeStampUtc = defaults.timeStampUtc;
        }

        public Builder setCode(@Nullable String code) {
            this.code = code;
            return this;
        }

        public Builder setMessage(@Nullable String message) {
            this.message = message;
            return this;
        }

        public Builder setTimeStampUtc(@Nullable String timeStampUtc) {
            this.timeStampUtc = timeStampUtc;
            return this;
        }

        public KeyVaultLastAccessStatusContractPropertiesResponse build() {
            return new KeyVaultLastAccessStatusContractPropertiesResponse(code, message, timeStampUtc);
        }
    }
}