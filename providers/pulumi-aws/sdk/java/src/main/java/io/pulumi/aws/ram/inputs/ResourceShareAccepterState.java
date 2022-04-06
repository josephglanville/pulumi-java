// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ram.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceShareAccepterState extends io.pulumi.resources.ResourceArgs {

    public static final ResourceShareAccepterState Empty = new ResourceShareAccepterState();

    /**
     * The ARN of the resource share invitation.
     * 
     */
    @Import(name="invitationArn")
      private final @Nullable Output<String> invitationArn;

    public Output<String> getInvitationArn() {
        return this.invitationArn == null ? Output.empty() : this.invitationArn;
    }

    /**
     * The account ID of the receiver account which accepts the invitation.
     * 
     */
    @Import(name="receiverAccountId")
      private final @Nullable Output<String> receiverAccountId;

    public Output<String> getReceiverAccountId() {
        return this.receiverAccountId == null ? Output.empty() : this.receiverAccountId;
    }

    /**
     * A list of the resource ARNs shared via the resource share.
     * 
     */
    @Import(name="resources")
      private final @Nullable Output<List<String>> resources;

    public Output<List<String>> getResources() {
        return this.resources == null ? Output.empty() : this.resources;
    }

    /**
     * The account ID of the sender account which submits the invitation.
     * 
     */
    @Import(name="senderAccountId")
      private final @Nullable Output<String> senderAccountId;

    public Output<String> getSenderAccountId() {
        return this.senderAccountId == null ? Output.empty() : this.senderAccountId;
    }

    /**
     * The ARN of the resource share.
     * 
     */
    @Import(name="shareArn")
      private final @Nullable Output<String> shareArn;

    public Output<String> getShareArn() {
        return this.shareArn == null ? Output.empty() : this.shareArn;
    }

    /**
     * The ID of the resource share as displayed in the console.
     * 
     */
    @Import(name="shareId")
      private final @Nullable Output<String> shareId;

    public Output<String> getShareId() {
        return this.shareId == null ? Output.empty() : this.shareId;
    }

    /**
     * The name of the resource share.
     * 
     */
    @Import(name="shareName")
      private final @Nullable Output<String> shareName;

    public Output<String> getShareName() {
        return this.shareName == null ? Output.empty() : this.shareName;
    }

    /**
     * The status of the resource share (ACTIVE, PENDING, FAILED, DELETING, DELETED).
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public ResourceShareAccepterState(
        @Nullable Output<String> invitationArn,
        @Nullable Output<String> receiverAccountId,
        @Nullable Output<List<String>> resources,
        @Nullable Output<String> senderAccountId,
        @Nullable Output<String> shareArn,
        @Nullable Output<String> shareId,
        @Nullable Output<String> shareName,
        @Nullable Output<String> status) {
        this.invitationArn = invitationArn;
        this.receiverAccountId = receiverAccountId;
        this.resources = resources;
        this.senderAccountId = senderAccountId;
        this.shareArn = shareArn;
        this.shareId = shareId;
        this.shareName = shareName;
        this.status = status;
    }

    private ResourceShareAccepterState() {
        this.invitationArn = Output.empty();
        this.receiverAccountId = Output.empty();
        this.resources = Output.empty();
        this.senderAccountId = Output.empty();
        this.shareArn = Output.empty();
        this.shareId = Output.empty();
        this.shareName = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceShareAccepterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> invitationArn;
        private @Nullable Output<String> receiverAccountId;
        private @Nullable Output<List<String>> resources;
        private @Nullable Output<String> senderAccountId;
        private @Nullable Output<String> shareArn;
        private @Nullable Output<String> shareId;
        private @Nullable Output<String> shareName;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceShareAccepterState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.invitationArn = defaults.invitationArn;
    	      this.receiverAccountId = defaults.receiverAccountId;
    	      this.resources = defaults.resources;
    	      this.senderAccountId = defaults.senderAccountId;
    	      this.shareArn = defaults.shareArn;
    	      this.shareId = defaults.shareId;
    	      this.shareName = defaults.shareName;
    	      this.status = defaults.status;
        }

        public Builder invitationArn(@Nullable Output<String> invitationArn) {
            this.invitationArn = invitationArn;
            return this;
        }
        public Builder invitationArn(@Nullable String invitationArn) {
            this.invitationArn = Output.ofNullable(invitationArn);
            return this;
        }
        public Builder receiverAccountId(@Nullable Output<String> receiverAccountId) {
            this.receiverAccountId = receiverAccountId;
            return this;
        }
        public Builder receiverAccountId(@Nullable String receiverAccountId) {
            this.receiverAccountId = Output.ofNullable(receiverAccountId);
            return this;
        }
        public Builder resources(@Nullable Output<List<String>> resources) {
            this.resources = resources;
            return this;
        }
        public Builder resources(@Nullable List<String> resources) {
            this.resources = Output.ofNullable(resources);
            return this;
        }
        public Builder resources(String... resources) {
            return resources(List.of(resources));
        }
        public Builder senderAccountId(@Nullable Output<String> senderAccountId) {
            this.senderAccountId = senderAccountId;
            return this;
        }
        public Builder senderAccountId(@Nullable String senderAccountId) {
            this.senderAccountId = Output.ofNullable(senderAccountId);
            return this;
        }
        public Builder shareArn(@Nullable Output<String> shareArn) {
            this.shareArn = shareArn;
            return this;
        }
        public Builder shareArn(@Nullable String shareArn) {
            this.shareArn = Output.ofNullable(shareArn);
            return this;
        }
        public Builder shareId(@Nullable Output<String> shareId) {
            this.shareId = shareId;
            return this;
        }
        public Builder shareId(@Nullable String shareId) {
            this.shareId = Output.ofNullable(shareId);
            return this;
        }
        public Builder shareName(@Nullable Output<String> shareName) {
            this.shareName = shareName;
            return this;
        }
        public Builder shareName(@Nullable String shareName) {
            this.shareName = Output.ofNullable(shareName);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }        public ResourceShareAccepterState build() {
            return new ResourceShareAccepterState(invitationArn, receiverAccountId, resources, senderAccountId, shareArn, shareId, shareName, status);
        }
    }
}