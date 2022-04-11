// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FirewallPolicyAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final FirewallPolicyAssociationArgs Empty = new FirewallPolicyAssociationArgs();

    /**
     * The target that the firewall policy is attached to.
     * 
     */
    @Import(name="attachmentTarget")
      private final @Nullable Output<String> attachmentTarget;

    public Output<String> getAttachmentTarget() {
        return this.attachmentTarget == null ? Codegen.empty() : this.attachmentTarget;
    }

    /**
     * The name for an association.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public FirewallPolicyAssociationArgs(
        @Nullable Output<String> attachmentTarget,
        @Nullable Output<String> name) {
        this.attachmentTarget = attachmentTarget;
        this.name = name;
    }

    private FirewallPolicyAssociationArgs() {
        this.attachmentTarget = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FirewallPolicyAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> attachmentTarget;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(FirewallPolicyAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentTarget = defaults.attachmentTarget;
    	      this.name = defaults.name;
        }

        public Builder attachmentTarget(@Nullable Output<String> attachmentTarget) {
            this.attachmentTarget = attachmentTarget;
            return this;
        }
        public Builder attachmentTarget(@Nullable String attachmentTarget) {
            this.attachmentTarget = Codegen.ofNullable(attachmentTarget);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public FirewallPolicyAssociationArgs build() {
            return new FirewallPolicyAssociationArgs(attachmentTarget, name);
        }
    }
}
