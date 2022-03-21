// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.azurenative.keyvault.inputs.SecretAttributesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Properties of the secret
 * 
 */
public final class SecretPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretPropertiesArgs Empty = new SecretPropertiesArgs();

    /**
     * The attributes of the secret.
     * 
     */
    @Import(name="attributes")
      private final @Nullable Output<SecretAttributesArgs> attributes;

    public Output<SecretAttributesArgs> getAttributes() {
        return this.attributes == null ? Output.empty() : this.attributes;
    }

    /**
     * The content type of the secret.
     * 
     */
    @Import(name="contentType")
      private final @Nullable Output<String> contentType;

    public Output<String> getContentType() {
        return this.contentType == null ? Output.empty() : this.contentType;
    }

    /**
     * The value of the secret. NOTE: 'value' will never be returned from the service, as APIs using this model are is intended for internal use in ARM deployments. Users should use the data-plane REST service for interaction with vault secrets.
     * 
     */
    @Import(name="value")
      private final @Nullable Output<String> value;

    public Output<String> getValue() {
        return this.value == null ? Output.empty() : this.value;
    }

    public SecretPropertiesArgs(
        @Nullable Output<SecretAttributesArgs> attributes,
        @Nullable Output<String> contentType,
        @Nullable Output<String> value) {
        this.attributes = attributes;
        this.contentType = contentType;
        this.value = value;
    }

    private SecretPropertiesArgs() {
        this.attributes = Output.empty();
        this.contentType = Output.empty();
        this.value = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SecretAttributesArgs> attributes;
        private @Nullable Output<String> contentType;
        private @Nullable Output<String> value;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attributes = defaults.attributes;
    	      this.contentType = defaults.contentType;
    	      this.value = defaults.value;
        }

        public Builder attributes(@Nullable Output<SecretAttributesArgs> attributes) {
            this.attributes = attributes;
            return this;
        }
        public Builder attributes(@Nullable SecretAttributesArgs attributes) {
            this.attributes = Output.ofNullable(attributes);
            return this;
        }
        public Builder contentType(@Nullable Output<String> contentType) {
            this.contentType = contentType;
            return this;
        }
        public Builder contentType(@Nullable String contentType) {
            this.contentType = Output.ofNullable(contentType);
            return this;
        }
        public Builder value(@Nullable Output<String> value) {
            this.value = value;
            return this;
        }
        public Builder value(@Nullable String value) {
            this.value = Output.ofNullable(value);
            return this;
        }        public SecretPropertiesArgs build() {
            return new SecretPropertiesArgs(attributes, contentType, value);
        }
    }
}
