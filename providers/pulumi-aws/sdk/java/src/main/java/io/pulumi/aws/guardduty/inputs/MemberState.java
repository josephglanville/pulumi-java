// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.guardduty.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MemberState extends io.pulumi.resources.ResourceArgs {

    public static final MemberState Empty = new MemberState();

    /**
     * AWS account ID for member account.
     * 
     */
    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId == null ? Codegen.empty() : this.accountId;
    }

    /**
     * The detector ID of the GuardDuty account where you want to create member accounts.
     * 
     */
    @Import(name="detectorId")
      private final @Nullable Output<String> detectorId;

    public Output<String> getDetectorId() {
        return this.detectorId == null ? Codegen.empty() : this.detectorId;
    }

    /**
     * Boolean whether an email notification is sent to the accounts. Defaults to `false`.
     * 
     */
    @Import(name="disableEmailNotification")
      private final @Nullable Output<Boolean> disableEmailNotification;

    public Output<Boolean> getDisableEmailNotification() {
        return this.disableEmailNotification == null ? Codegen.empty() : this.disableEmailNotification;
    }

    /**
     * Email address for member account.
     * 
     */
    @Import(name="email")
      private final @Nullable Output<String> email;

    public Output<String> getEmail() {
        return this.email == null ? Codegen.empty() : this.email;
    }

    /**
     * Message for invitation.
     * 
     */
    @Import(name="invitationMessage")
      private final @Nullable Output<String> invitationMessage;

    public Output<String> getInvitationMessage() {
        return this.invitationMessage == null ? Codegen.empty() : this.invitationMessage;
    }

    /**
     * Boolean whether to invite the account to GuardDuty as a member. Defaults to `false`. To detect if an invitation needs to be (re-)sent, the this provider state value is `true` based on a `relationship_status` of `Disabled`, `Enabled`, `Invited`, or `EmailVerificationInProgress`.
     * 
     */
    @Import(name="invite")
      private final @Nullable Output<Boolean> invite;

    public Output<Boolean> getInvite() {
        return this.invite == null ? Codegen.empty() : this.invite;
    }

    /**
     * The status of the relationship between the member account and its primary account. More information can be found in [Amazon GuardDuty API Reference](https://docs.aws.amazon.com/guardduty/latest/ug/get-members.html).
     * 
     */
    @Import(name="relationshipStatus")
      private final @Nullable Output<String> relationshipStatus;

    public Output<String> getRelationshipStatus() {
        return this.relationshipStatus == null ? Codegen.empty() : this.relationshipStatus;
    }

    public MemberState(
        @Nullable Output<String> accountId,
        @Nullable Output<String> detectorId,
        @Nullable Output<Boolean> disableEmailNotification,
        @Nullable Output<String> email,
        @Nullable Output<String> invitationMessage,
        @Nullable Output<Boolean> invite,
        @Nullable Output<String> relationshipStatus) {
        this.accountId = accountId;
        this.detectorId = detectorId;
        this.disableEmailNotification = disableEmailNotification;
        this.email = email;
        this.invitationMessage = invitationMessage;
        this.invite = invite;
        this.relationshipStatus = relationshipStatus;
    }

    private MemberState() {
        this.accountId = Codegen.empty();
        this.detectorId = Codegen.empty();
        this.disableEmailNotification = Codegen.empty();
        this.email = Codegen.empty();
        this.invitationMessage = Codegen.empty();
        this.invite = Codegen.empty();
        this.relationshipStatus = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private @Nullable Output<String> detectorId;
        private @Nullable Output<Boolean> disableEmailNotification;
        private @Nullable Output<String> email;
        private @Nullable Output<String> invitationMessage;
        private @Nullable Output<Boolean> invite;
        private @Nullable Output<String> relationshipStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(MemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.detectorId = defaults.detectorId;
    	      this.disableEmailNotification = defaults.disableEmailNotification;
    	      this.email = defaults.email;
    	      this.invitationMessage = defaults.invitationMessage;
    	      this.invite = defaults.invite;
    	      this.relationshipStatus = defaults.relationshipStatus;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Codegen.ofNullable(accountId);
            return this;
        }
        public Builder detectorId(@Nullable Output<String> detectorId) {
            this.detectorId = detectorId;
            return this;
        }
        public Builder detectorId(@Nullable String detectorId) {
            this.detectorId = Codegen.ofNullable(detectorId);
            return this;
        }
        public Builder disableEmailNotification(@Nullable Output<Boolean> disableEmailNotification) {
            this.disableEmailNotification = disableEmailNotification;
            return this;
        }
        public Builder disableEmailNotification(@Nullable Boolean disableEmailNotification) {
            this.disableEmailNotification = Codegen.ofNullable(disableEmailNotification);
            return this;
        }
        public Builder email(@Nullable Output<String> email) {
            this.email = email;
            return this;
        }
        public Builder email(@Nullable String email) {
            this.email = Codegen.ofNullable(email);
            return this;
        }
        public Builder invitationMessage(@Nullable Output<String> invitationMessage) {
            this.invitationMessage = invitationMessage;
            return this;
        }
        public Builder invitationMessage(@Nullable String invitationMessage) {
            this.invitationMessage = Codegen.ofNullable(invitationMessage);
            return this;
        }
        public Builder invite(@Nullable Output<Boolean> invite) {
            this.invite = invite;
            return this;
        }
        public Builder invite(@Nullable Boolean invite) {
            this.invite = Codegen.ofNullable(invite);
            return this;
        }
        public Builder relationshipStatus(@Nullable Output<String> relationshipStatus) {
            this.relationshipStatus = relationshipStatus;
            return this;
        }
        public Builder relationshipStatus(@Nullable String relationshipStatus) {
            this.relationshipStatus = Codegen.ofNullable(relationshipStatus);
            return this;
        }        public MemberState build() {
            return new MemberState(accountId, detectorId, disableEmailNotification, email, invitationMessage, invite, relationshipStatus);
        }
    }
}
