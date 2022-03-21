// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EmailChannelPropertiesResponse {
    /**
     * The email address
     * 
     */
    private final String emailAddress;
    /**
     * Whether this channel is enabled for the bot
     * 
     */
    private final Boolean isEnabled;
    /**
     * The password for the email address. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
     */
    private final @Nullable String password;

    @CustomType.Constructor
    private EmailChannelPropertiesResponse(
        @CustomType.Parameter("emailAddress") String emailAddress,
        @CustomType.Parameter("isEnabled") Boolean isEnabled,
        @CustomType.Parameter("password") @Nullable String password) {
        this.emailAddress = emailAddress;
        this.isEnabled = isEnabled;
        this.password = password;
    }

    /**
     * The email address
     * 
    */
    public String getEmailAddress() {
        return this.emailAddress;
    }
    /**
     * Whether this channel is enabled for the bot
     * 
    */
    public Boolean getIsEnabled() {
        return this.isEnabled;
    }
    /**
     * The password for the email address. Value only returned through POST to the action Channel List API, otherwise empty.
     * 
    */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EmailChannelPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String emailAddress;
        private Boolean isEnabled;
        private @Nullable String password;

        public Builder() {
    	      // Empty
        }

        public Builder(EmailChannelPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailAddress = defaults.emailAddress;
    	      this.isEnabled = defaults.isEnabled;
    	      this.password = defaults.password;
        }

        public Builder emailAddress(String emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }        public EmailChannelPropertiesResponse build() {
            return new EmailChannelPropertiesResponse(emailAddress, isEnabled, password);
        }
    }
}
