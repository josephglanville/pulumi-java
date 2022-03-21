// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyAssociationArgs Empty = new SecurityPolicyAssociationArgs();

    /**
     * The resource that the security policy is attached to.
     * 
     */
    @Import(name="attachmentId")
      private final @Nullable Output<String> attachmentId;

    public Output<String> getAttachmentId() {
        return this.attachmentId == null ? Output.empty() : this.attachmentId;
    }

    /**
     * The name for an association.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public SecurityPolicyAssociationArgs(
        @Nullable Output<String> attachmentId,
        @Nullable Output<String> name) {
        this.attachmentId = attachmentId;
        this.name = name;
    }

    private SecurityPolicyAssociationArgs() {
        this.attachmentId = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> attachmentId;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentId = defaults.attachmentId;
    	      this.name = defaults.name;
        }

        public Builder attachmentId(@Nullable Output<String> attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }
        public Builder attachmentId(@Nullable String attachmentId) {
            this.attachmentId = Output.ofNullable(attachmentId);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public SecurityPolicyAssociationArgs build() {
            return new SecurityPolicyAssociationArgs(attachmentId, name);
        }
    }
}
