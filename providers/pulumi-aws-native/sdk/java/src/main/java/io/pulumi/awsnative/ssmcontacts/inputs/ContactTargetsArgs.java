// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ssmcontacts.inputs;

import io.pulumi.awsnative.ssmcontacts.inputs.ContactChannelTargetInfoArgs;
import io.pulumi.awsnative.ssmcontacts.inputs.ContactTargetInfoArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The contacts or contact methods that the escalation plan or engagement plan is engaging.
 * 
 */
public final class ContactTargetsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContactTargetsArgs Empty = new ContactTargetsArgs();

    @Import(name="channelTargetInfo")
      private final @Nullable Output<ContactChannelTargetInfoArgs> channelTargetInfo;

    public Output<ContactChannelTargetInfoArgs> getChannelTargetInfo() {
        return this.channelTargetInfo == null ? Output.empty() : this.channelTargetInfo;
    }

    @Import(name="contactTargetInfo")
      private final @Nullable Output<ContactTargetInfoArgs> contactTargetInfo;

    public Output<ContactTargetInfoArgs> getContactTargetInfo() {
        return this.contactTargetInfo == null ? Output.empty() : this.contactTargetInfo;
    }

    public ContactTargetsArgs(
        @Nullable Output<ContactChannelTargetInfoArgs> channelTargetInfo,
        @Nullable Output<ContactTargetInfoArgs> contactTargetInfo) {
        this.channelTargetInfo = channelTargetInfo;
        this.contactTargetInfo = contactTargetInfo;
    }

    private ContactTargetsArgs() {
        this.channelTargetInfo = Output.empty();
        this.contactTargetInfo = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContactTargetsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ContactChannelTargetInfoArgs> channelTargetInfo;
        private @Nullable Output<ContactTargetInfoArgs> contactTargetInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(ContactTargetsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.channelTargetInfo = defaults.channelTargetInfo;
    	      this.contactTargetInfo = defaults.contactTargetInfo;
        }

        public Builder channelTargetInfo(@Nullable Output<ContactChannelTargetInfoArgs> channelTargetInfo) {
            this.channelTargetInfo = channelTargetInfo;
            return this;
        }
        public Builder channelTargetInfo(@Nullable ContactChannelTargetInfoArgs channelTargetInfo) {
            this.channelTargetInfo = Output.ofNullable(channelTargetInfo);
            return this;
        }
        public Builder contactTargetInfo(@Nullable Output<ContactTargetInfoArgs> contactTargetInfo) {
            this.contactTargetInfo = contactTargetInfo;
            return this;
        }
        public Builder contactTargetInfo(@Nullable ContactTargetInfoArgs contactTargetInfo) {
            this.contactTargetInfo = Output.ofNullable(contactTargetInfo);
            return this;
        }        public ContactTargetsArgs build() {
            return new ContactTargetsArgs(channelTargetInfo, contactTargetInfo);
        }
    }
}
