// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolEmailConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolEmailConfigurationArgs Empty = new UserPoolEmailConfigurationArgs();

    /**
     * Email configuration set name from SES.
     * 
     */
    @Import(name="configurationSet")
      private final @Nullable Output<String> configurationSet;

    public Output<String> getConfigurationSet() {
        return this.configurationSet == null ? Output.empty() : this.configurationSet;
    }

    /**
     * Email delivery method to use. `COGNITO_DEFAULT` for the default email functionality built into Cognito or `DEVELOPER` to use your Amazon SES configuration.
     * 
     */
    @Import(name="emailSendingAccount")
      private final @Nullable Output<String> emailSendingAccount;

    public Output<String> getEmailSendingAccount() {
        return this.emailSendingAccount == null ? Output.empty() : this.emailSendingAccount;
    }

    /**
     * Sender’s email address or sender’s display name with their email address (e.g., `john@example.com`, `John Smith <john@example.com>` or `\"John Smith Ph.D.\" <john@example.com>`). Escaped double quotes are required around display names that contain certain characters as specified in [RFC 5322](https://tools.ietf.org/html/rfc5322).
     * 
     */
    @Import(name="fromEmailAddress")
      private final @Nullable Output<String> fromEmailAddress;

    public Output<String> getFromEmailAddress() {
        return this.fromEmailAddress == null ? Output.empty() : this.fromEmailAddress;
    }

    /**
     * REPLY-TO email address.
     * 
     */
    @Import(name="replyToEmailAddress")
      private final @Nullable Output<String> replyToEmailAddress;

    public Output<String> getReplyToEmailAddress() {
        return this.replyToEmailAddress == null ? Output.empty() : this.replyToEmailAddress;
    }

    /**
     * ARN of the SES verified email identity to to use. Required if `email_sending_account` is set to `DEVELOPER`.
     * 
     */
    @Import(name="sourceArn")
      private final @Nullable Output<String> sourceArn;

    public Output<String> getSourceArn() {
        return this.sourceArn == null ? Output.empty() : this.sourceArn;
    }

    public UserPoolEmailConfigurationArgs(
        @Nullable Output<String> configurationSet,
        @Nullable Output<String> emailSendingAccount,
        @Nullable Output<String> fromEmailAddress,
        @Nullable Output<String> replyToEmailAddress,
        @Nullable Output<String> sourceArn) {
        this.configurationSet = configurationSet;
        this.emailSendingAccount = emailSendingAccount;
        this.fromEmailAddress = fromEmailAddress;
        this.replyToEmailAddress = replyToEmailAddress;
        this.sourceArn = sourceArn;
    }

    private UserPoolEmailConfigurationArgs() {
        this.configurationSet = Output.empty();
        this.emailSendingAccount = Output.empty();
        this.fromEmailAddress = Output.empty();
        this.replyToEmailAddress = Output.empty();
        this.sourceArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolEmailConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> configurationSet;
        private @Nullable Output<String> emailSendingAccount;
        private @Nullable Output<String> fromEmailAddress;
        private @Nullable Output<String> replyToEmailAddress;
        private @Nullable Output<String> sourceArn;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolEmailConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configurationSet = defaults.configurationSet;
    	      this.emailSendingAccount = defaults.emailSendingAccount;
    	      this.fromEmailAddress = defaults.fromEmailAddress;
    	      this.replyToEmailAddress = defaults.replyToEmailAddress;
    	      this.sourceArn = defaults.sourceArn;
        }

        public Builder configurationSet(@Nullable Output<String> configurationSet) {
            this.configurationSet = configurationSet;
            return this;
        }
        public Builder configurationSet(@Nullable String configurationSet) {
            this.configurationSet = Output.ofNullable(configurationSet);
            return this;
        }
        public Builder emailSendingAccount(@Nullable Output<String> emailSendingAccount) {
            this.emailSendingAccount = emailSendingAccount;
            return this;
        }
        public Builder emailSendingAccount(@Nullable String emailSendingAccount) {
            this.emailSendingAccount = Output.ofNullable(emailSendingAccount);
            return this;
        }
        public Builder fromEmailAddress(@Nullable Output<String> fromEmailAddress) {
            this.fromEmailAddress = fromEmailAddress;
            return this;
        }
        public Builder fromEmailAddress(@Nullable String fromEmailAddress) {
            this.fromEmailAddress = Output.ofNullable(fromEmailAddress);
            return this;
        }
        public Builder replyToEmailAddress(@Nullable Output<String> replyToEmailAddress) {
            this.replyToEmailAddress = replyToEmailAddress;
            return this;
        }
        public Builder replyToEmailAddress(@Nullable String replyToEmailAddress) {
            this.replyToEmailAddress = Output.ofNullable(replyToEmailAddress);
            return this;
        }
        public Builder sourceArn(@Nullable Output<String> sourceArn) {
            this.sourceArn = sourceArn;
            return this;
        }
        public Builder sourceArn(@Nullable String sourceArn) {
            this.sourceArn = Output.ofNullable(sourceArn);
            return this;
        }        public UserPoolEmailConfigurationArgs build() {
            return new UserPoolEmailConfigurationArgs(configurationSet, emailSendingAccount, fromEmailAddress, replyToEmailAddress, sourceArn);
        }
    }
}
