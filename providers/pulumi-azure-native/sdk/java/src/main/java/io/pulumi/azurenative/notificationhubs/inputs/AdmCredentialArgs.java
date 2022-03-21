// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.notificationhubs.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Description of a NotificationHub AdmCredential.
 * 
 */
public final class AdmCredentialArgs extends io.pulumi.resources.ResourceArgs {

    public static final AdmCredentialArgs Empty = new AdmCredentialArgs();

    /**
     * The URL of the authorization token.
     * 
     */
    @Import(name="authTokenUrl")
      private final @Nullable Output<String> authTokenUrl;

    public Output<String> getAuthTokenUrl() {
        return this.authTokenUrl == null ? Output.empty() : this.authTokenUrl;
    }

    /**
     * The client identifier.
     * 
     */
    @Import(name="clientId")
      private final @Nullable Output<String> clientId;

    public Output<String> getClientId() {
        return this.clientId == null ? Output.empty() : this.clientId;
    }

    /**
     * The credential secret access key.
     * 
     */
    @Import(name="clientSecret")
      private final @Nullable Output<String> clientSecret;

    public Output<String> getClientSecret() {
        return this.clientSecret == null ? Output.empty() : this.clientSecret;
    }

    public AdmCredentialArgs(
        @Nullable Output<String> authTokenUrl,
        @Nullable Output<String> clientId,
        @Nullable Output<String> clientSecret) {
        this.authTokenUrl = authTokenUrl;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    private AdmCredentialArgs() {
        this.authTokenUrl = Output.empty();
        this.clientId = Output.empty();
        this.clientSecret = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AdmCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authTokenUrl;
        private @Nullable Output<String> clientId;
        private @Nullable Output<String> clientSecret;

        public Builder() {
    	      // Empty
        }

        public Builder(AdmCredentialArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authTokenUrl = defaults.authTokenUrl;
    	      this.clientId = defaults.clientId;
    	      this.clientSecret = defaults.clientSecret;
        }

        public Builder authTokenUrl(@Nullable Output<String> authTokenUrl) {
            this.authTokenUrl = authTokenUrl;
            return this;
        }
        public Builder authTokenUrl(@Nullable String authTokenUrl) {
            this.authTokenUrl = Output.ofNullable(authTokenUrl);
            return this;
        }
        public Builder clientId(@Nullable Output<String> clientId) {
            this.clientId = clientId;
            return this;
        }
        public Builder clientId(@Nullable String clientId) {
            this.clientId = Output.ofNullable(clientId);
            return this;
        }
        public Builder clientSecret(@Nullable Output<String> clientSecret) {
            this.clientSecret = clientSecret;
            return this;
        }
        public Builder clientSecret(@Nullable String clientSecret) {
            this.clientSecret = Output.ofNullable(clientSecret);
            return this;
        }        public AdmCredentialArgs build() {
            return new AdmCredentialArgs(authTokenUrl, clientId, clientSecret);
        }
    }
}
