// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The secret management attributes.
 * 
 */
public final class SecretAttributesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretAttributesArgs Empty = new SecretAttributesArgs();

    /**
     * Determines whether the object is enabled.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * Expiry date in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    @Import(name="expires")
      private final @Nullable Output<Integer> expires;

    public Output<Integer> getExpires() {
        return this.expires == null ? Output.empty() : this.expires;
    }

    /**
     * Not before date in seconds since 1970-01-01T00:00:00Z.
     * 
     */
    @Import(name="notBefore")
      private final @Nullable Output<Integer> notBefore;

    public Output<Integer> getNotBefore() {
        return this.notBefore == null ? Output.empty() : this.notBefore;
    }

    public SecretAttributesArgs(
        @Nullable Output<Boolean> enabled,
        @Nullable Output<Integer> expires,
        @Nullable Output<Integer> notBefore) {
        this.enabled = enabled;
        this.expires = expires;
        this.notBefore = notBefore;
    }

    private SecretAttributesArgs() {
        this.enabled = Output.empty();
        this.expires = Output.empty();
        this.notBefore = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> enabled;
        private @Nullable Output<Integer> expires;
        private @Nullable Output<Integer> notBefore;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretAttributesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.expires = defaults.expires;
    	      this.notBefore = defaults.notBefore;
        }

        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder expires(@Nullable Output<Integer> expires) {
            this.expires = expires;
            return this;
        }
        public Builder expires(@Nullable Integer expires) {
            this.expires = Output.ofNullable(expires);
            return this;
        }
        public Builder notBefore(@Nullable Output<Integer> notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public Builder notBefore(@Nullable Integer notBefore) {
            this.notBefore = Output.ofNullable(notBefore);
            return this;
        }        public SecretAttributesArgs build() {
            return new SecretAttributesArgs(enabled, expires, notBefore);
        }
    }
}
