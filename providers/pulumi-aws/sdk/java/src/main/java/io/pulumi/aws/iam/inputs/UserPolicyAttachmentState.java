// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class UserPolicyAttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final UserPolicyAttachmentState Empty = new UserPolicyAttachmentState();

    /**
     * The ARN of the policy you want to apply
     * 
     */
    @Import(name="policyArn")
      private final @Nullable Output<String> policyArn;

    public Output<String> getPolicyArn() {
        return this.policyArn == null ? Output.empty() : this.policyArn;
    }

    /**
     * The user the policy should be applied to
     * 
     */
    @Import(name="user")
      private final @Nullable Output<String> user;

    public Output<String> getUser() {
        return this.user == null ? Output.empty() : this.user;
    }

    public UserPolicyAttachmentState(
        @Nullable Output<String> policyArn,
        @Nullable Output<String> user) {
        this.policyArn = policyArn;
        this.user = user;
    }

    private UserPolicyAttachmentState() {
        this.policyArn = Output.empty();
        this.user = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserPolicyAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> policyArn;
        private @Nullable Output<String> user;

        public Builder() {
    	      // Empty
        }

        public Builder(UserPolicyAttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyArn = defaults.policyArn;
    	      this.user = defaults.user;
        }

        public Builder policyArn(@Nullable Output<String> policyArn) {
            this.policyArn = policyArn;
            return this;
        }
        public Builder policyArn(@Nullable String policyArn) {
            this.policyArn = Output.ofNullable(policyArn);
            return this;
        }
        public Builder user(@Nullable Output<String> user) {
            this.user = user;
            return this;
        }        public UserPolicyAttachmentState build() {
            return new UserPolicyAttachmentState(policyArn, user);
        }
    }
}