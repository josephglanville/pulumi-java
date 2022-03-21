// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class RolePolicyAttachmentArgs extends io.pulumi.resources.ResourceArgs {

    public static final RolePolicyAttachmentArgs Empty = new RolePolicyAttachmentArgs();

    /**
     * The ARN of the policy you want to apply
     * 
     */
    @Import(name="policyArn", required=true)
      private final Output<String> policyArn;

    public Output<String> getPolicyArn() {
        return this.policyArn;
    }

    /**
     * The name of the IAM role to which the policy should be applied
     * 
     */
    @Import(name="role", required=true)
      private final Output<String> role;

    public Output<String> getRole() {
        return this.role;
    }

    public RolePolicyAttachmentArgs(
        Output<String> policyArn,
        Output<String> role) {
        this.policyArn = Objects.requireNonNull(policyArn, "expected parameter 'policyArn' to be non-null");
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private RolePolicyAttachmentArgs() {
        this.policyArn = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RolePolicyAttachmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> policyArn;
        private Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(RolePolicyAttachmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyArn = defaults.policyArn;
    	      this.role = defaults.role;
        }

        public Builder policyArn(Output<String> policyArn) {
            this.policyArn = Objects.requireNonNull(policyArn);
            return this;
        }
        public Builder policyArn(String policyArn) {
            this.policyArn = Output.of(Objects.requireNonNull(policyArn));
            return this;
        }
        public Builder role(Output<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }        public RolePolicyAttachmentArgs build() {
            return new RolePolicyAttachmentArgs(policyArn, role);
        }
    }
}
