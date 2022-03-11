// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.servicedirectory.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.servicedirectory.inputs.NamespaceIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NamespaceIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final NamespaceIamMemberState Empty = new NamespaceIamMemberState();

    @InputImport(name="condition")
      private final @Nullable Output<NamespaceIamMemberConditionGetArgs> condition;

    public Output<NamespaceIamMemberConditionGetArgs> getCondition() {
        return this.condition == null ? Output.empty() : this.condition;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    @InputImport(name="member")
      private final @Nullable Output<String> member;

    public Output<String> getMember() {
        return this.member == null ? Output.empty() : this.member;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.servicedirectory.NamespaceIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Output.empty() : this.role;
    }

    public NamespaceIamMemberState(
        @Nullable Output<NamespaceIamMemberConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<String> member,
        @Nullable Output<String> name,
        @Nullable Output<String> role) {
        this.condition = condition;
        this.etag = etag;
        this.member = member;
        this.name = name;
        this.role = role;
    }

    private NamespaceIamMemberState() {
        this.condition = Output.empty();
        this.etag = Output.empty();
        this.member = Output.empty();
        this.name = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NamespaceIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<NamespaceIamMemberConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> member;
        private @Nullable Output<String> name;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(NamespaceIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.member = defaults.member;
    	      this.name = defaults.name;
    	      this.role = defaults.role;
        }

        public Builder condition(@Nullable Output<NamespaceIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable NamespaceIamMemberConditionGetArgs condition) {
            this.condition = Output.ofNullable(condition);
            return this;
        }

        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder etag(@Nullable String etag) {
            this.etag = Output.ofNullable(etag);
            return this;
        }

        public Builder member(@Nullable Output<String> member) {
            this.member = member;
            return this;
        }

        public Builder member(@Nullable String member) {
            this.member = Output.ofNullable(member);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }

        public Builder role(@Nullable String role) {
            this.role = Output.ofNullable(role);
            return this;
        }
        public NamespaceIamMemberState build() {
            return new NamespaceIamMemberState(condition, etag, member, name, role);
        }
    }
}
