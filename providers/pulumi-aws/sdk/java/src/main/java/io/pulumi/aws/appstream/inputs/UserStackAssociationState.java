// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserStackAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final UserStackAssociationState Empty = new UserStackAssociationState();

    /**
     * Authentication type for the user.
     * 
     */
    @InputImport(name="authenticationType")
      private final @Nullable Output<String> authenticationType;

    public Output<String> getAuthenticationType() {
        return this.authenticationType == null ? Output.empty() : this.authenticationType;
    }

    /**
     * Specifies whether a welcome email is sent to a user after the user is created in the user pool.
     * 
     */
    @InputImport(name="sendEmailNotification")
      private final @Nullable Output<Boolean> sendEmailNotification;

    public Output<Boolean> getSendEmailNotification() {
        return this.sendEmailNotification == null ? Output.empty() : this.sendEmailNotification;
    }

    /**
     * Name of the stack that is associated with the user.
     * 
     */
    @InputImport(name="stackName")
      private final @Nullable Output<String> stackName;

    public Output<String> getStackName() {
        return this.stackName == null ? Output.empty() : this.stackName;
    }

    /**
     * Email address of the user who is associated with the stack.
     * 
     */
    @InputImport(name="userName")
      private final @Nullable Output<String> userName;

    public Output<String> getUserName() {
        return this.userName == null ? Output.empty() : this.userName;
    }

    public UserStackAssociationState(
        @Nullable Output<String> authenticationType,
        @Nullable Output<Boolean> sendEmailNotification,
        @Nullable Output<String> stackName,
        @Nullable Output<String> userName) {
        this.authenticationType = authenticationType;
        this.sendEmailNotification = sendEmailNotification;
        this.stackName = stackName;
        this.userName = userName;
    }

    private UserStackAssociationState() {
        this.authenticationType = Output.empty();
        this.sendEmailNotification = Output.empty();
        this.stackName = Output.empty();
        this.userName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserStackAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> authenticationType;
        private @Nullable Output<Boolean> sendEmailNotification;
        private @Nullable Output<String> stackName;
        private @Nullable Output<String> userName;

        public Builder() {
    	      // Empty
        }

        public Builder(UserStackAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authenticationType = defaults.authenticationType;
    	      this.sendEmailNotification = defaults.sendEmailNotification;
    	      this.stackName = defaults.stackName;
    	      this.userName = defaults.userName;
        }

        public Builder authenticationType(@Nullable Output<String> authenticationType) {
            this.authenticationType = authenticationType;
            return this;
        }

        public Builder authenticationType(@Nullable String authenticationType) {
            this.authenticationType = Output.ofNullable(authenticationType);
            return this;
        }

        public Builder sendEmailNotification(@Nullable Output<Boolean> sendEmailNotification) {
            this.sendEmailNotification = sendEmailNotification;
            return this;
        }

        public Builder sendEmailNotification(@Nullable Boolean sendEmailNotification) {
            this.sendEmailNotification = Output.ofNullable(sendEmailNotification);
            return this;
        }

        public Builder stackName(@Nullable Output<String> stackName) {
            this.stackName = stackName;
            return this;
        }

        public Builder stackName(@Nullable String stackName) {
            this.stackName = Output.ofNullable(stackName);
            return this;
        }

        public Builder userName(@Nullable Output<String> userName) {
            this.userName = userName;
            return this;
        }

        public Builder userName(@Nullable String userName) {
            this.userName = Output.ofNullable(userName);
            return this;
        }
        public UserStackAssociationState build() {
            return new UserStackAssociationState(authenticationType, sendEmailNotification, stackName, userName);
        }
    }
}
