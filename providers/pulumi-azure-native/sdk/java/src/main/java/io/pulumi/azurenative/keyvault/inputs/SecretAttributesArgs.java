// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecretAttributesArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecretAttributesArgs Empty = new SecretAttributesArgs();

    @InputImport(name="enabled")
    private final @Nullable Input<Boolean> enabled;

    public Input<Boolean> getEnabled() {
        return this.enabled == null ? Input.empty() : this.enabled;
    }

    @InputImport(name="expires")
    private final @Nullable Input<Integer> expires;

    public Input<Integer> getExpires() {
        return this.expires == null ? Input.empty() : this.expires;
    }

    @InputImport(name="notBefore")
    private final @Nullable Input<Integer> notBefore;

    public Input<Integer> getNotBefore() {
        return this.notBefore == null ? Input.empty() : this.notBefore;
    }

    public SecretAttributesArgs(
        @Nullable Input<Boolean> enabled,
        @Nullable Input<Integer> expires,
        @Nullable Input<Integer> notBefore) {
        this.enabled = enabled;
        this.expires = expires;
        this.notBefore = notBefore;
    }

    private SecretAttributesArgs() {
        this.enabled = Input.empty();
        this.expires = Input.empty();
        this.notBefore = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretAttributesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> enabled;
        private @Nullable Input<Integer> expires;
        private @Nullable Input<Integer> notBefore;

        public Builder() {
    	      // Empty
        }

        public Builder(SecretAttributesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.expires = defaults.expires;
    	      this.notBefore = defaults.notBefore;
        }

        public Builder setEnabled(@Nullable Input<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = Input.ofNullable(enabled);
            return this;
        }

        public Builder setExpires(@Nullable Input<Integer> expires) {
            this.expires = expires;
            return this;
        }

        public Builder setExpires(@Nullable Integer expires) {
            this.expires = Input.ofNullable(expires);
            return this;
        }

        public Builder setNotBefore(@Nullable Input<Integer> notBefore) {
            this.notBefore = notBefore;
            return this;
        }

        public Builder setNotBefore(@Nullable Integer notBefore) {
            this.notBefore = Input.ofNullable(notBefore);
            return this;
        }

        public SecretAttributesArgs build() {
            return new SecretAttributesArgs(enabled, expires, notBefore);
        }
    }
}
