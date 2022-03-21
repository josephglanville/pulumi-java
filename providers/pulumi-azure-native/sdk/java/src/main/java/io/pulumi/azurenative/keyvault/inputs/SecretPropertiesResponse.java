// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.azurenative.keyvault.inputs.SecretAttributesResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties of the secret
 * 
 */
public final class SecretPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final SecretPropertiesResponse Empty = new SecretPropertiesResponse();

    /**
     * The attributes of the secret.
     * 
     */
    @Import(name="attributes")
      private final @Nullable SecretAttributesResponse attributes;

    public Optional<SecretAttributesResponse> getAttributes() {
        return this.attributes == null ? Optional.empty() : Optional.ofNullable(this.attributes);
    }

    /**
     * The content type of the secret.
     * 
     */
    @Import(name="contentType")
      private final @Nullable String contentType;

    public Optional<String> getContentType() {
        return this.contentType == null ? Optional.empty() : Optional.ofNullable(this.contentType);
    }

    /**
     * The URI to retrieve the current version of the secret.
     * 
     */
    @Import(name="secretUri", required=true)
      private final String secretUri;

    public String getSecretUri() {
        return this.secretUri;
    }

    /**
     * The URI to retrieve the specific version of the secret.
     * 
     */
    @Import(name="secretUriWithVersion", required=true)
      private final String secretUriWithVersion;

    public String getSecretUriWithVersion() {
        return this.secretUriWithVersion;
    }

    /**
     * The value of the secret. NOTE: 'value' will never be returned from the service, as APIs using this model are is intended for internal use in ARM deployments. Users should use the data-plane REST service for interaction with vault secrets.
     * 
     */
    @Import(name="value")
      private final @Nullable String value;

    public Optional<String> getValue() {
        return this.value == null ? Optional.empty() : Optional.ofNullable(this.value);
    }

    public SecretPropertiesResponse(
        @Nullable SecretAttributesResponse attributes,
        @Nullable String contentType,
        String secretUri,
        String secretUriWithVersion,
        @Nullable String value) {
        this.attributes = attributes;
        this.contentType = contentType;
        this.secretUri = Objects.requireNonNull(secretUri, "expected parameter 'secretUri' to be non-null");
        this.secretUriWithVersion = Objects.requireNonNull(secretUriWithVersion, "expected parameter 'secretUriWithVersion' to be non-null");
        this.value = value;
    }

    private SecretPropertiesResponse() {
        this.attributes = null;
        this.contentType = null;
        this.secretUri = null;
        this.secretUriWithVersion = null;
        this.value = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable SecretAttributesResponse attributes;
        private @Nullable String contentType;
        private String secretUri;
        private String secretUriWithVersion;
        private @Nullable String value;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.contentType = defaults.contentType;
    	      this.secretUri = defaults.secretUri;
    	      this.secretUriWithVersion = defaults.secretUriWithVersion;
    	      this.value = defaults.value;
        }

        public Builder attributes(@Nullable SecretAttributesResponse attributes) {
            this.attributes = attributes;
            return this;
        }
        public Builder contentType(@Nullable String contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder secretUri(String secretUri) {
            this.secretUri = Objects.requireNonNull(secretUri);
            return this;
        }
        public Builder secretUriWithVersion(String secretUriWithVersion) {
            this.secretUriWithVersion = Objects.requireNonNull(secretUriWithVersion);
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = value;
            return this;
        }        public SecretPropertiesResponse build() {
            return new SecretPropertiesResponse(attributes, contentType, secretUri, secretUriWithVersion, value);
        }
    }
}
