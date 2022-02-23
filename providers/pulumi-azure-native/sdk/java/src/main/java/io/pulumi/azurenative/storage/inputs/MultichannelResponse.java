// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Multichannel setting. Applies to Premium FileStorage only.
 * 
 */
public final class MultichannelResponse extends io.pulumi.resources.InvokeArgs {

    public static final MultichannelResponse Empty = new MultichannelResponse();

    /**
     * Indicates whether multichannel is enabled
     * 
     */
    @InputImport(name="enabled")
      private final @Nullable Boolean enabled;

    public Optional<Boolean> getEnabled() {
        return this.enabled == null ? Optional.empty() : Optional.ofNullable(this.enabled);
    }

    public MultichannelResponse(@Nullable Boolean enabled) {
        this.enabled = enabled;
    }

    private MultichannelResponse() {
        this.enabled = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultichannelResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;

        public Builder() {
    	      // Empty
        }

        public Builder(MultichannelResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public MultichannelResponse build() {
            return new MultichannelResponse(enabled);
        }
    }
}
