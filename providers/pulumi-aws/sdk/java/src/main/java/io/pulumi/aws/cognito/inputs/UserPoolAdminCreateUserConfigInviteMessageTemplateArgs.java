// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cognito.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPoolAdminCreateUserConfigInviteMessageTemplateArgs extends io.pulumi.resources.ResourceArgs {

    public static final UserPoolAdminCreateUserConfigInviteMessageTemplateArgs Empty = new UserPoolAdminCreateUserConfigInviteMessageTemplateArgs();

    /**
     * Email message template. Must contain the `{####}` placeholder. Conflicts with `email_verification_message` argument.
     * 
     */
    @Import(name="emailMessage")
      private final @Nullable Output<String> emailMessage;

    public Output<String> getEmailMessage() {
        return this.emailMessage == null ? Output.empty() : this.emailMessage;
    }

    /**
     * Subject line for the email message template. Conflicts with `email_verification_subject` argument.
     * 
     */
    @Import(name="emailSubject")
      private final @Nullable Output<String> emailSubject;

    public Output<String> getEmailSubject() {
        return this.emailSubject == null ? Output.empty() : this.emailSubject;
    }

    /**
     * SMS message template. Must contain the `{####}` placeholder. Conflicts with `sms_verification_message` argument.
     * 
     */
    @Import(name="smsMessage")
      private final @Nullable Output<String> smsMessage;

    public Output<String> getSmsMessage() {
        return this.smsMessage == null ? Output.empty() : this.smsMessage;
    }

    public UserPoolAdminCreateUserConfigInviteMessageTemplateArgs(
        @Nullable Output<String> emailMessage,
        @Nullable Output<String> emailSubject,
        @Nullable Output<String> smsMessage) {
        this.emailMessage = emailMessage;
        this.emailSubject = emailSubject;
        this.smsMessage = smsMessage;
    }

    private UserPoolAdminCreateUserConfigInviteMessageTemplateArgs() {
        this.emailMessage = Output.empty();
        this.emailSubject = Output.empty();
        this.smsMessage = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPoolAdminCreateUserConfigInviteMessageTemplateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> emailMessage;
        private @Nullable Output<String> emailSubject;
        private @Nullable Output<String> smsMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPoolAdminCreateUserConfigInviteMessageTemplateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.emailMessage = defaults.emailMessage;
    	      this.emailSubject = defaults.emailSubject;
    	      this.smsMessage = defaults.smsMessage;
        }

        public Builder emailMessage(@Nullable Output<String> emailMessage) {
            this.emailMessage = emailMessage;
            return this;
        }
        public Builder emailMessage(@Nullable String emailMessage) {
            this.emailMessage = Output.ofNullable(emailMessage);
            return this;
        }
        public Builder emailSubject(@Nullable Output<String> emailSubject) {
            this.emailSubject = emailSubject;
            return this;
        }
        public Builder emailSubject(@Nullable String emailSubject) {
            this.emailSubject = Output.ofNullable(emailSubject);
            return this;
        }
        public Builder smsMessage(@Nullable Output<String> smsMessage) {
            this.smsMessage = smsMessage;
            return this;
        }
        public Builder smsMessage(@Nullable String smsMessage) {
            this.smsMessage = Output.ofNullable(smsMessage);
            return this;
        }        public UserPoolAdminCreateUserConfigInviteMessageTemplateArgs build() {
            return new UserPoolAdminCreateUserConfigInviteMessageTemplateArgs(emailMessage, emailSubject, smsMessage);
        }
    }
}
