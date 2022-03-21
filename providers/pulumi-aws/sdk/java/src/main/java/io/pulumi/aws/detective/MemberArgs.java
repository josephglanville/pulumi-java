// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.detective;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MemberArgs extends io.pulumi.resources.ResourceArgs {

    public static final MemberArgs Empty = new MemberArgs();

    /**
     * AWS account ID for the account.
     * 
     */
    @Import(name="accountId", required=true)
      private final Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId;
    }

    /**
     * If set to true, then the root user of the invited account will _not_ receive an email notification. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. By default, this is set to `false`.
     * 
     */
    @Import(name="disableEmailNotification")
      private final @Nullable Output<Boolean> disableEmailNotification;

    public Output<Boolean> getDisableEmailNotification() {
        return this.disableEmailNotification == null ? Output.empty() : this.disableEmailNotification;
    }

    /**
     * Email address for the account.
     * 
     */
    @Import(name="emailAddress", required=true)
      private final Output<String> emailAddress;

    public Output<String> getEmailAddress() {
        return this.emailAddress;
    }

    /**
     * ARN of the behavior graph to invite the member accounts to contribute their data to.
     * 
     */
    @Import(name="graphArn", required=true)
      private final Output<String> graphArn;

    public Output<String> getGraphArn() {
        return this.graphArn;
    }

    /**
     * A custom message to include in the invitation. Amazon Detective adds this message to the standard content that it sends for an invitation.
     * 
     */
    @Import(name="message")
      private final @Nullable Output<String> message;

    public Output<String> getMessage() {
        return this.message == null ? Output.empty() : this.message;
    }

    public MemberArgs(
        Output<String> accountId,
        @Nullable Output<Boolean> disableEmailNotification,
        Output<String> emailAddress,
        Output<String> graphArn,
        @Nullable Output<String> message) {
        this.accountId = Objects.requireNonNull(accountId, "expected parameter 'accountId' to be non-null");
        this.disableEmailNotification = disableEmailNotification;
        this.emailAddress = Objects.requireNonNull(emailAddress, "expected parameter 'emailAddress' to be non-null");
        this.graphArn = Objects.requireNonNull(graphArn, "expected parameter 'graphArn' to be non-null");
        this.message = message;
    }

    private MemberArgs() {
        this.accountId = Output.empty();
        this.disableEmailNotification = Output.empty();
        this.emailAddress = Output.empty();
        this.graphArn = Output.empty();
        this.message = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MemberArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountId;
        private @Nullable Output<Boolean> disableEmailNotification;
        private Output<String> emailAddress;
        private Output<String> graphArn;
        private @Nullable Output<String> message;

        public Builder() {
    	      // Empty
        }

        public Builder(MemberArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.disableEmailNotification = defaults.disableEmailNotification;
    	      this.emailAddress = defaults.emailAddress;
    	      this.graphArn = defaults.graphArn;
    	      this.message = defaults.message;
        }

        public Builder accountId(Output<String> accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        public Builder accountId(String accountId) {
            this.accountId = Output.of(Objects.requireNonNull(accountId));
            return this;
        }
        public Builder disableEmailNotification(@Nullable Output<Boolean> disableEmailNotification) {
            this.disableEmailNotification = disableEmailNotification;
            return this;
        }
        public Builder disableEmailNotification(@Nullable Boolean disableEmailNotification) {
            this.disableEmailNotification = Output.ofNullable(disableEmailNotification);
            return this;
        }
        public Builder emailAddress(Output<String> emailAddress) {
            this.emailAddress = Objects.requireNonNull(emailAddress);
            return this;
        }
        public Builder emailAddress(String emailAddress) {
            this.emailAddress = Output.of(Objects.requireNonNull(emailAddress));
            return this;
        }
        public Builder graphArn(Output<String> graphArn) {
            this.graphArn = Objects.requireNonNull(graphArn);
            return this;
        }
        public Builder graphArn(String graphArn) {
            this.graphArn = Output.of(Objects.requireNonNull(graphArn));
            return this;
        }
        public Builder message(@Nullable Output<String> message) {
            this.message = message;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = Output.ofNullable(message);
            return this;
        }        public MemberArgs build() {
            return new MemberArgs(accountId, disableEmailNotification, emailAddress, graphArn, message);
        }
    }
}
