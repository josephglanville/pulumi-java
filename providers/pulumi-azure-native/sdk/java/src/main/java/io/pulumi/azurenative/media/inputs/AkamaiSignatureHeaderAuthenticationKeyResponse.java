// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Akamai Signature Header authentication key.
 * 
 */
public final class AkamaiSignatureHeaderAuthenticationKeyResponse extends io.pulumi.resources.InvokeArgs {

    public static final AkamaiSignatureHeaderAuthenticationKeyResponse Empty = new AkamaiSignatureHeaderAuthenticationKeyResponse();

    /**
     * authentication key
     * 
     */
    @Import(name="base64Key")
      private final @Nullable String base64Key;

    public Optional<String> getBase64Key() {
        return this.base64Key == null ? Optional.empty() : Optional.ofNullable(this.base64Key);
    }

    /**
     * The expiration time of the authentication key.
     * 
     */
    @Import(name="expiration")
      private final @Nullable String expiration;

    public Optional<String> getExpiration() {
        return this.expiration == null ? Optional.empty() : Optional.ofNullable(this.expiration);
    }

    /**
     * identifier of the key
     * 
     */
    @Import(name="identifier")
      private final @Nullable String identifier;

    public Optional<String> getIdentifier() {
        return this.identifier == null ? Optional.empty() : Optional.ofNullable(this.identifier);
    }

    public AkamaiSignatureHeaderAuthenticationKeyResponse(
        @Nullable String base64Key,
        @Nullable String expiration,
        @Nullable String identifier) {
        this.base64Key = base64Key;
        this.expiration = expiration;
        this.identifier = identifier;
    }

    private AkamaiSignatureHeaderAuthenticationKeyResponse() {
        this.base64Key = null;
        this.expiration = null;
        this.identifier = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AkamaiSignatureHeaderAuthenticationKeyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String base64Key;
        private @Nullable String expiration;
        private @Nullable String identifier;

        public Builder() {
    	      // Empty
        }

        public Builder(AkamaiSignatureHeaderAuthenticationKeyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.base64Key = defaults.base64Key;
    	      this.expiration = defaults.expiration;
    	      this.identifier = defaults.identifier;
        }

        public Builder base64Key(@Nullable String base64Key) {
            this.base64Key = base64Key;
            return this;
        }
        public Builder expiration(@Nullable String expiration) {
            this.expiration = expiration;
            return this;
        }
        public Builder identifier(@Nullable String identifier) {
            this.identifier = identifier;
            return this;
        }        public AkamaiSignatureHeaderAuthenticationKeyResponse build() {
            return new AkamaiSignatureHeaderAuthenticationKeyResponse(base64Key, expiration, identifier);
        }
    }
}
