// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.macie2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MemberState extends io.pulumi.resources.ResourceArgs {

    public static final MemberState Empty = new MemberState();

    /**
     * The AWS account ID for the account.
     * 
     */
    @Import(name="accountId")
      private final @Nullable Output<String> accountId;

    public Output<String> getAccountId() {
        return this.accountId == null ? Codegen.empty() : this.accountId;
    }

    /**
     * The AWS account ID for the administrator account.
     * 
     */
    @Import(name="administratorAccountId")
      private final @Nullable Output<String> administratorAccountId;

    public Output<String> getAdministratorAccountId() {
        return this.administratorAccountId == null ? Codegen.empty() : this.administratorAccountId;
    }

    /**
     * The Amazon Resource Name (ARN) of the account.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * The email address for the account.
     * 
     */
    @Import(name="email")
      private final @Nullable Output<String> email;

    public Output<String> getEmail() {
        return this.email == null ? Codegen.empty() : this.email;
    }

    /**
     * Specifies whether to send an email notification to the root user of each account that the invitation will be sent to. This notification is in addition to an alert that the root user receives in AWS Personal Health Dashboard. To send an email notification to the root user of each account, set this value to `true`.
     * 
     */
    @Import(name="invitationDisableEmailNotification")
      private final @Nullable Output<String> invitationDisableEmailNotification;

    public Output<String> getInvitationDisableEmailNotification() {
        return this.invitationDisableEmailNotification == null ? Codegen.empty() : this.invitationDisableEmailNotification;
    }

    /**
     * A custom message to include in the invitation. Amazon Macie adds this message to the standard content that it sends for an invitation.
     * 
     */
    @Import(name="invitationMessage")
      private final @Nullable Output<String> invitationMessage;

    public Output<String> getInvitationMessage() {
        return this.invitationMessage == null ? Codegen.empty() : this.invitationMessage;
    }

    /**
     * Send an invitation to a member
     * 
     */
    @Import(name="invite")
      private final @Nullable Output<Boolean> invite;

    public Output<Boolean> getInvite() {
        return this.invite == null ? Codegen.empty() : this.invite;
    }

    /**
     * The date and time, in UTC and extended RFC 3339 format, when an Amazon Macie membership invitation was last sent to the account. This value is null if a Macie invitation hasn't been sent to the account.
     * 
     */
    @Import(name="invitedAt")
      private final @Nullable Output<String> invitedAt;

    public Output<String> getInvitedAt() {
        return this.invitedAt == null ? Codegen.empty() : this.invitedAt;
    }

    @Import(name="masterAccountId")
      private final @Nullable Output<String> masterAccountId;

    public Output<String> getMasterAccountId() {
        return this.masterAccountId == null ? Codegen.empty() : this.masterAccountId;
    }

    /**
     * The current status of the relationship between the account and the administrator account.
     * 
     */
    @Import(name="relationshipStatus")
      private final @Nullable Output<String> relationshipStatus;

    public Output<String> getRelationshipStatus() {
        return this.relationshipStatus == null ? Codegen.empty() : this.relationshipStatus;
    }

    /**
     * Specifies the status for the account. To enable Amazon Macie and start all Macie activities for the account, set this value to `ENABLED`. Valid values are `ENABLED` or `PAUSED`.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Codegen.empty() : this.status;
    }

    /**
     * A map of key-value pairs that specifies the tags to associate with the account in Amazon Macie.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * The date and time, in UTC and extended RFC 3339 format, of the most recent change to the status of the relationship between the account and the administrator account.
     * 
     */
    @Import(name="updatedAt")
      private final @Nullable Output<String> updatedAt;

    public Output<String> getUpdatedAt() {
        return this.updatedAt == null ? Codegen.empty() : this.updatedAt;
    }

    public MemberState(
        @Nullable Output<String> accountId,
        @Nullable Output<String> administratorAccountId,
        @Nullable Output<String> arn,
        @Nullable Output<String> email,
        @Nullable Output<String> invitationDisableEmailNotification,
        @Nullable Output<String> invitationMessage,
        @Nullable Output<Boolean> invite,
        @Nullable Output<String> invitedAt,
        @Nullable Output<String> masterAccountId,
        @Nullable Output<String> relationshipStatus,
        @Nullable Output<String> status,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> updatedAt) {
        this.accountId = accountId;
        this.administratorAccountId = administratorAccountId;
        this.arn = arn;
        this.email = email;
        this.invitationDisableEmailNotification = invitationDisableEmailNotification;
        this.invitationMessage = invitationMessage;
        this.invite = invite;
        this.invitedAt = invitedAt;
        this.masterAccountId = masterAccountId;
        this.relationshipStatus = relationshipStatus;
        this.status = status;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.updatedAt = updatedAt;
    }

    private MemberState() {
        this.accountId = Codegen.empty();
        this.administratorAccountId = Codegen.empty();
        this.arn = Codegen.empty();
        this.email = Codegen.empty();
        this.invitationDisableEmailNotification = Codegen.empty();
        this.invitationMessage = Codegen.empty();
        this.invite = Codegen.empty();
        this.invitedAt = Codegen.empty();
        this.masterAccountId = Codegen.empty();
        this.relationshipStatus = Codegen.empty();
        this.status = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.updatedAt = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> accountId;
        private @Nullable Output<String> administratorAccountId;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> email;
        private @Nullable Output<String> invitationDisableEmailNotification;
        private @Nullable Output<String> invitationMessage;
        private @Nullable Output<Boolean> invite;
        private @Nullable Output<String> invitedAt;
        private @Nullable Output<String> masterAccountId;
        private @Nullable Output<String> relationshipStatus;
        private @Nullable Output<String> status;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> updatedAt;

        public Builder() {
    	      // Empty
        }

        public Builder(MemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.administratorAccountId = defaults.administratorAccountId;
    	      this.arn = defaults.arn;
    	      this.email = defaults.email;
    	      this.invitationDisableEmailNotification = defaults.invitationDisableEmailNotification;
    	      this.invitationMessage = defaults.invitationMessage;
    	      this.invite = defaults.invite;
    	      this.invitedAt = defaults.invitedAt;
    	      this.masterAccountId = defaults.masterAccountId;
    	      this.relationshipStatus = defaults.relationshipStatus;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.updatedAt = defaults.updatedAt;
        }

        public Builder accountId(@Nullable Output<String> accountId) {
            this.accountId = accountId;
            return this;
        }
        public Builder accountId(@Nullable String accountId) {
            this.accountId = Codegen.ofNullable(accountId);
            return this;
        }
        public Builder administratorAccountId(@Nullable Output<String> administratorAccountId) {
            this.administratorAccountId = administratorAccountId;
            return this;
        }
        public Builder administratorAccountId(@Nullable String administratorAccountId) {
            this.administratorAccountId = Codegen.ofNullable(administratorAccountId);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
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
        public Builder invitationDisableEmailNotification(@Nullable Output<String> invitationDisableEmailNotification) {
            this.invitationDisableEmailNotification = invitationDisableEmailNotification;
            return this;
        }
        public Builder invitationDisableEmailNotification(@Nullable String invitationDisableEmailNotification) {
            this.invitationDisableEmailNotification = Codegen.ofNullable(invitationDisableEmailNotification);
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
        public Builder invitedAt(@Nullable Output<String> invitedAt) {
            this.invitedAt = invitedAt;
            return this;
        }
        public Builder invitedAt(@Nullable String invitedAt) {
            this.invitedAt = Codegen.ofNullable(invitedAt);
            return this;
        }
        public Builder masterAccountId(@Nullable Output<String> masterAccountId) {
            this.masterAccountId = masterAccountId;
            return this;
        }
        public Builder masterAccountId(@Nullable String masterAccountId) {
            this.masterAccountId = Codegen.ofNullable(masterAccountId);
            return this;
        }
        public Builder relationshipStatus(@Nullable Output<String> relationshipStatus) {
            this.relationshipStatus = relationshipStatus;
            return this;
        }
        public Builder relationshipStatus(@Nullable String relationshipStatus) {
            this.relationshipStatus = Codegen.ofNullable(relationshipStatus);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Codegen.ofNullable(status);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }
        public Builder updatedAt(@Nullable String updatedAt) {
            this.updatedAt = Codegen.ofNullable(updatedAt);
            return this;
        }        public MemberState build() {
            return new MemberState(accountId, administratorAccountId, arn, email, invitationDisableEmailNotification, invitationMessage, invite, invitedAt, masterAccountId, relationshipStatus, status, tags, tagsAll, updatedAt);
        }
    }
}
