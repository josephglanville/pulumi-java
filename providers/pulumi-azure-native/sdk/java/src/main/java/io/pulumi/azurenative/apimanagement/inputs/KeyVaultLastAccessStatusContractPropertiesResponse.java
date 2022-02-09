// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KeyVaultLastAccessStatusContractPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final KeyVaultLastAccessStatusContractPropertiesResponse Empty = new KeyVaultLastAccessStatusContractPropertiesResponse();

    @InputImport(name="code")
    private final @Nullable String code;

    public Optional<String> getCode() {
        return this.code == null ? Optional.empty() : Optional.ofNullable(this.code);
    }

    @InputImport(name="message")
    private final @Nullable String message;

    public Optional<String> getMessage() {
        return this.message == null ? Optional.empty() : Optional.ofNullable(this.message);
    }

    @InputImport(name="timeStampUtc")
    private final @Nullable String timeStampUtc;

    public Optional<String> getTimeStampUtc() {
        return this.timeStampUtc == null ? Optional.empty() : Optional.ofNullable(this.timeStampUtc);
    }

    public KeyVaultLastAccessStatusContractPropertiesResponse(
        @Nullable String code,
        @Nullable String message,
        @Nullable String timeStampUtc) {
        this.code = code;
        this.message = message;
        this.timeStampUtc = timeStampUtc;
    }

    private KeyVaultLastAccessStatusContractPropertiesResponse() {
        this.code = null;
        this.message = null;
        this.timeStampUtc = null;
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
