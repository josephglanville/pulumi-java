// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.iam.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GroupPolicyAttachmentState extends io.pulumi.resources.ResourceArgs {

    public static final GroupPolicyAttachmentState Empty = new GroupPolicyAttachmentState();

    /**
     * The group the policy should be applied to
     * 
     */
    @Import(name="group")
      private final @Nullable Output<String> group;

    public Output<String> getGroup() {
        return this.group == null ? Output.empty() : this.group;
    }

    /**
     * The ARN of the policy you want to apply
     * 
     */
    @Import(name="policyArn")
      private final @Nullable Output<String> policyArn;

    public Output<String> getPolicyArn() {
        return this.policyArn == null ? Output.empty() : this.policyArn;
    }

    public GroupPolicyAttachmentState(
        @Nullable Output<String> group,
        @Nullable Output<String> policyArn) {
        this.group = group;
        this.policyArn = policyArn;
    }

    private GroupPolicyAttachmentState() {
        this.group = Output.empty();
        this.policyArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GroupPolicyAttachmentState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> group;
        private @Nullable Output<String> policyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GroupPolicyAttachmentState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.group = defaults.group;
    	      this.policyArn = defaults.policyArn;
        }

        public Builder group(@Nullable Output<String> group) {
            this.group = group;
            return this;
        }
        public Builder policyArn(@Nullable Output<String> policyArn) {
            this.policyArn = policyArn;
            return this;
        }
        public Builder policyArn(@Nullable String policyArn) {
            this.policyArn = Output.ofNullable(policyArn);
            return this;
        }        public GroupPolicyAttachmentState build() {
            return new GroupPolicyAttachmentState(group, policyArn);
        }
    }
}
