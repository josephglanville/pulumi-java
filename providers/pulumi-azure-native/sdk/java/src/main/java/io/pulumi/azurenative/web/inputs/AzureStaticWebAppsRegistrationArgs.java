// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration settings of the registration for the Azure Static Web Apps provider
 * 
 */
public final class AzureStaticWebAppsRegistrationArgs extends io.pulumi.resources.ResourceArgs {

    public static final AzureStaticWebAppsRegistrationArgs Empty = new AzureStaticWebAppsRegistrationArgs();

    /**
     * The Client ID of the app used for login.
     * 
     */
    @InputImport(name="clientId")
      private final @Nullable Input<String> clientId;

    public Input<String> getClientId() {
        return this.clientId == null ? Input.empty() : this.clientId;
    }

    public AzureStaticWebAppsRegistrationArgs(@Nullable Input<String> clientId) {
        this.clientId = clientId;
    }

    private AzureStaticWebAppsRegistrationArgs() {
        this.clientId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureStaticWebAppsRegistrationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> clientId;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureStaticWebAppsRegistrationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientId = defaults.clientId;
        }

        public Builder setClientId(@Nullable Input<String> clientId) {
            this.clientId = clientId;
            return this;
        }

        public Builder setClientId(@Nullable String clientId) {
            this.clientId = Input.ofNullable(clientId);
            return this;
        }
        public AzureStaticWebAppsRegistrationArgs build() {
            return new AzureStaticWebAppsRegistrationArgs(clientId);
        }
    }
}
