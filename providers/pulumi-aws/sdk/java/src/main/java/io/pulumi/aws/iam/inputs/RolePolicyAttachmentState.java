// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RolePolicyAttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final RolePolicyAttachmentState Empty = new RolePolicyAttachmentState();

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
     * The name of the IAM role to which the policy should be applied
     * 
     */
    @Import(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Output.empty() : this.role;
    }

    public RolePolicyAttachmentState(
        @Nullable Output<String> policyArn,
        @Nullable Output<String> role) {
        this.policyArn = policyArn;
        this.role = role;
    }

    private RolePolicyAttachmentState() {
        this.policyArn = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RolePolicyAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> policyArn;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(RolePolicyAttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyArn = defaults.policyArn;
    	      this.role = defaults.role;
        }

        public Builder policyArn(@Nullable Output<String> policyArn) {
            this.policyArn = policyArn;
            return this;
        }
        public Builder policyArn(@Nullable String policyArn) {
            this.policyArn = Output.ofNullable(policyArn);
            return this;
        }
        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }        public RolePolicyAttachmentState build() {
            return new RolePolicyAttachmentState(policyArn, role);
        }
    }
}
