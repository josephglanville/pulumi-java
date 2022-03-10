// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class IdentityPoolCognitoIdentityProvider {
    /**
     * The client ID for the Amazon Cognito Identity User Pool.
     * 
     */
    private final @Nullable String clientId;
    /**
     * The provider name for an Amazon Cognito Identity User Pool.
     * 
     */
    private final @Nullable String providerName;
    /**
     * Whether server-side token validation is enabled for the identity provider’s token or not.
     * 
     */
    private final @Nullable Boolean serverSideTokenCheck;

    @OutputCustomType.Constructor
    private IdentityPoolCognitoIdentityProvider(
        @OutputCustomType.Parameter("clientId") @Nullable String clientId,
        @OutputCustomType.Parameter("providerName") @Nullable String providerName,
        @OutputCustomType.Parameter("serverSideTokenCheck") @Nullable Boolean serverSideTokenCheck) {
        this.clientId = clientId;
        this.providerName = providerName;
        this.serverSideTokenCheck = serverSideTokenCheck;
    }

    /**
     * The client ID for the Amazon Cognito Identity User Pool.
     * 
    */
    public Optional<String> getClientId() {
        return Optional.ofNullable(this.clientId);
    }
    /**
     * The provider name for an Amazon Cognito Identity User Pool.
     * 
    */
    public Optional<String> getProviderName() {
        return Optional.ofNullable(this.providerName);
    }
    /**
     * Whether server-side token validation is enabled for the identity provider’s token or not.
     * 
    */
    public Optional<Boolean> getServerSideTokenCheck() {
        return Optional.ofNullable(this.serverSideTokenCheck);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityPoolCognitoIdentityProvider defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientId;
        private @Nullable String providerName;
        private @Nullable Boolean serverSideTokenCheck;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityPoolCognitoIdentityProvider defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
    	      this.providerName = defaults.providerName;
    	      this.serverSideTokenCheck = defaults.serverSideTokenCheck;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setProviderName(@Nullable String providerName) {
            this.providerName = providerName;
            return this;
        }

        public Builder setServerSideTokenCheck(@Nullable Boolean serverSideTokenCheck) {
            this.serverSideTokenCheck = serverSideTokenCheck;
            return this;
        }
        public IdentityPoolCognitoIdentityProvider build() {
            return new IdentityPoolCognitoIdentityProvider(clientId, providerName, serverSideTokenCheck);
        }
    }
}
