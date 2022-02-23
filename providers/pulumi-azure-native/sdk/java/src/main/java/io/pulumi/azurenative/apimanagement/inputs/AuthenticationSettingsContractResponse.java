// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.inputs.OAuth2AuthenticationSettingsContractResponse;
import io.pulumi.azurenative.apimanagement.inputs.OpenIdAuthenticationSettingsContractResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * API Authentication Settings.
 * 
 */
public final class AuthenticationSettingsContractResponse extends io.pulumi.resources.InvokeArgs {

    public static final AuthenticationSettingsContractResponse Empty = new AuthenticationSettingsContractResponse();

    /**
     * OAuth2 Authentication settings
     * 
     */
    @InputImport(name="oAuth2")
      private final @Nullable OAuth2AuthenticationSettingsContractResponse oAuth2;

    public Optional<OAuth2AuthenticationSettingsContractResponse> getOAuth2() {
        return this.oAuth2 == null ? Optional.empty() : Optional.ofNullable(this.oAuth2);
    }

    /**
     * OpenID Connect Authentication Settings
     * 
     */
    @InputImport(name="openid")
      private final @Nullable OpenIdAuthenticationSettingsContractResponse openid;

    public Optional<OpenIdAuthenticationSettingsContractResponse> getOpenid() {
        return this.openid == null ? Optional.empty() : Optional.ofNullable(this.openid);
    }

    public AuthenticationSettingsContractResponse(
        @Nullable OAuth2AuthenticationSettingsContractResponse oAuth2,
        @Nullable OpenIdAuthenticationSettingsContractResponse openid) {
        this.oAuth2 = oAuth2;
        this.openid = openid;
    }

    private AuthenticationSettingsContractResponse() {
        this.oAuth2 = null;
        this.openid = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AuthenticationSettingsContractResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable OAuth2AuthenticationSettingsContractResponse oAuth2;
        private @Nullable OpenIdAuthenticationSettingsContractResponse openid;

        public Builder() {
    	      // Empty
        }

        public Builder(AuthenticationSettingsContractResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.oAuth2 = defaults.oAuth2;
    	      this.openid = defaults.openid;
        }

        public Builder setOAuth2(@Nullable OAuth2AuthenticationSettingsContractResponse oAuth2) {
            this.oAuth2 = oAuth2;
            return this;
        }

        public Builder setOpenid(@Nullable OpenIdAuthenticationSettingsContractResponse openid) {
            this.openid = openid;
            return this;
        }
        public AuthenticationSettingsContractResponse build() {
            return new AuthenticationSettingsContractResponse(oAuth2, openid);
        }
    }
}
