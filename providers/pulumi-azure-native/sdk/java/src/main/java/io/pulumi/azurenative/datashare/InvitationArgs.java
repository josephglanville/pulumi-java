// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datashare;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InvitationArgs extends io.pulumi.resources.ResourceArgs {

    public static final InvitationArgs Empty = new InvitationArgs();

    /**
     * The name of the share account.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * The expiration date for the invitation and share subscription.
     * 
     */
    @Import(name="expirationDate")
      private final @Nullable Output<String> expirationDate;

    public Output<String> getExpirationDate() {
        return this.expirationDate == null ? Output.empty() : this.expirationDate;
    }

    /**
     * The name of the invitation.
     * 
     */
    @Import(name="invitationName")
      private final @Nullable Output<String> invitationName;

    public Output<String> getInvitationName() {
        return this.invitationName == null ? Output.empty() : this.invitationName;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the share to send the invitation for.
     * 
     */
    @Import(name="shareName", required=true)
      private final Output<String> shareName;

    public Output<String> getShareName() {
        return this.shareName;
    }

    /**
     * The target Azure AD Id. Can't be combined with email.
     * 
     */
    @Import(name="targetActiveDirectoryId")
      private final @Nullable Output<String> targetActiveDirectoryId;

    public Output<String> getTargetActiveDirectoryId() {
        return this.targetActiveDirectoryId == null ? Output.empty() : this.targetActiveDirectoryId;
    }

    /**
     * The email the invitation is directed to.
     * 
     */
    @Import(name="targetEmail")
      private final @Nullable Output<String> targetEmail;

    public Output<String> getTargetEmail() {
        return this.targetEmail == null ? Output.empty() : this.targetEmail;
    }

    /**
     * The target user or application Id that invitation is being sent to.
     * Must be specified along TargetActiveDirectoryId. This enables sending
     * invitations to specific users or applications in an AD tenant.
     * 
     */
    @Import(name="targetObjectId")
      private final @Nullable Output<String> targetObjectId;

    public Output<String> getTargetObjectId() {
        return this.targetObjectId == null ? Output.empty() : this.targetObjectId;
    }

    public InvitationArgs(
        Output<String> accountName,
        @Nullable Output<String> expirationDate,
        @Nullable Output<String> invitationName,
        Output<String> resourceGroupName,
        Output<String> shareName,
        @Nullable Output<String> targetActiveDirectoryId,
        @Nullable Output<String> targetEmail,
        @Nullable Output<String> targetObjectId) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.expirationDate = expirationDate;
        this.invitationName = invitationName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.shareName = Objects.requireNonNull(shareName, "expected parameter 'shareName' to be non-null");
        this.targetActiveDirectoryId = targetActiveDirectoryId;
        this.targetEmail = targetEmail;
        this.targetObjectId = targetObjectId;
    }

    private InvitationArgs() {
        this.accountName = Output.empty();
        this.expirationDate = Output.empty();
        this.invitationName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.shareName = Output.empty();
        this.targetActiveDirectoryId = Output.empty();
        this.targetEmail = Output.empty();
        this.targetObjectId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InvitationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> expirationDate;
        private @Nullable Output<String> invitationName;
        private Output<String> resourceGroupName;
        private Output<String> shareName;
        private @Nullable Output<String> targetActiveDirectoryId;
        private @Nullable Output<String> targetEmail;
        private @Nullable Output<String> targetObjectId;

        public Builder() {
    	      // Empty
        }

        public Builder(InvitationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.expirationDate = defaults.expirationDate;
    	      this.invitationName = defaults.invitationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.shareName = defaults.shareName;
    	      this.targetActiveDirectoryId = defaults.targetActiveDirectoryId;
    	      this.targetEmail = defaults.targetEmail;
    	      this.targetObjectId = defaults.targetObjectId;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder expirationDate(@Nullable Output<String> expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public Builder expirationDate(@Nullable String expirationDate) {
            this.expirationDate = Output.ofNullable(expirationDate);
            return this;
        }
        public Builder invitationName(@Nullable Output<String> invitationName) {
            this.invitationName = invitationName;
            return this;
        }
        public Builder invitationName(@Nullable String invitationName) {
            this.invitationName = Output.ofNullable(invitationName);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder shareName(Output<String> shareName) {
            this.shareName = Objects.requireNonNull(shareName);
            return this;
        }
        public Builder shareName(String shareName) {
            this.shareName = Output.of(Objects.requireNonNull(shareName));
            return this;
        }
        public Builder targetActiveDirectoryId(@Nullable Output<String> targetActiveDirectoryId) {
            this.targetActiveDirectoryId = targetActiveDirectoryId;
            return this;
        }
        public Builder targetActiveDirectoryId(@Nullable String targetActiveDirectoryId) {
            this.targetActiveDirectoryId = Output.ofNullable(targetActiveDirectoryId);
            return this;
        }
        public Builder targetEmail(@Nullable Output<String> targetEmail) {
            this.targetEmail = targetEmail;
            return this;
        }
        public Builder targetEmail(@Nullable String targetEmail) {
            this.targetEmail = Output.ofNullable(targetEmail);
            return this;
        }
        public Builder targetObjectId(@Nullable Output<String> targetObjectId) {
            this.targetObjectId = targetObjectId;
            return this;
        }
        public Builder targetObjectId(@Nullable String targetObjectId) {
            this.targetObjectId = Output.ofNullable(targetObjectId);
            return this;
        }        public InvitationArgs build() {
            return new InvitationArgs(accountName, expirationDate, invitationName, resourceGroupName, shareName, targetActiveDirectoryId, targetEmail, targetObjectId);
        }
    }
}
