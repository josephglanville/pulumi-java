// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.outputs;

import io.pulumi.azurenative.webpubsub.outputs.ManagedIdentitySettingsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class UpstreamAuthSettingsResponse {
    /**
     * Managed identity settings for upstream.
     * 
     */
    private final @Nullable ManagedIdentitySettingsResponse managedIdentity;
    /**
     * Upstream auth type enum.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private UpstreamAuthSettingsResponse(
        @CustomType.Parameter("managedIdentity") @Nullable ManagedIdentitySettingsResponse managedIdentity,
        @CustomType.Parameter("type") @Nullable String type) {
        this.managedIdentity = managedIdentity;
        this.type = type;
    }

    /**
     * Managed identity settings for upstream.
     * 
    */
    public Optional<ManagedIdentitySettingsResponse> getManagedIdentity() {
        return Optional.ofNullable(this.managedIdentity);
    }
    /**
     * Upstream auth type enum.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpstreamAuthSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable ManagedIdentitySettingsResponse managedIdentity;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(UpstreamAuthSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managedIdentity = defaults.managedIdentity;
    	      this.type = defaults.type;
        }

        public Builder managedIdentity(@Nullable ManagedIdentitySettingsResponse managedIdentity) {
            this.managedIdentity = managedIdentity;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }        public UpstreamAuthSettingsResponse build() {
            return new UpstreamAuthSettingsResponse(managedIdentity, type);
        }
    }
}
