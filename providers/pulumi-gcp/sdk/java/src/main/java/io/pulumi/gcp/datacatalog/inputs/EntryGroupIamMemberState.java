// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.datacatalog.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.datacatalog.inputs.EntryGroupIamMemberConditionGetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntryGroupIamMemberState extends io.pulumi.resources.ResourceArgs {

    public static final EntryGroupIamMemberState Empty = new EntryGroupIamMemberState();

    @InputImport(name="condition")
      private final @Nullable Input<EntryGroupIamMemberConditionGetArgs> condition;

    public Input<EntryGroupIamMemberConditionGetArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    /**
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="entryGroup")
      private final @Nullable Input<String> entryGroup;

    public Input<String> getEntryGroup() {
        return this.entryGroup == null ? Input.empty() : this.entryGroup;
    }

    /**
     * (Computed) The etag of the IAM policy.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Input<String> etag;

    public Input<String> getEtag() {
        return this.etag == null ? Input.empty() : this.etag;
    }

    @InputImport(name="member")
      private final @Nullable Input<String> member;

    public Input<String> getMember() {
        return this.member == null ? Input.empty() : this.member;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    @InputImport(name="region")
      private final @Nullable Input<String> region;

    public Input<String> getRegion() {
        return this.region == null ? Input.empty() : this.region;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.datacatalog.EntryGroupIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
      private final @Nullable Input<String> role;

    public Input<String> getRole() {
        return this.role == null ? Input.empty() : this.role;
    }

    public EntryGroupIamMemberState(
        @Nullable Input<EntryGroupIamMemberConditionGetArgs> condition,
        @Nullable Input<String> entryGroup,
        @Nullable Input<String> etag,
        @Nullable Input<String> member,
        @Nullable Input<String> project,
        @Nullable Input<String> region,
        @Nullable Input<String> role) {
        this.condition = condition;
        this.entryGroup = entryGroup;
        this.etag = etag;
        this.member = member;
        this.project = project;
        this.region = region;
        this.role = role;
    }

    private EntryGroupIamMemberState() {
        this.condition = Input.empty();
        this.entryGroup = Input.empty();
        this.etag = Input.empty();
        this.member = Input.empty();
        this.project = Input.empty();
        this.region = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntryGroupIamMemberState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EntryGroupIamMemberConditionGetArgs> condition;
        private @Nullable Input<String> entryGroup;
        private @Nullable Input<String> etag;
        private @Nullable Input<String> member;
        private @Nullable Input<String> project;
        private @Nullable Input<String> region;
        private @Nullable Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(EntryGroupIamMemberState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.condition = defaults.condition;
    	      this.entryGroup = defaults.entryGroup;
    	      this.etag = defaults.etag;
    	      this.member = defaults.member;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
    	      this.role = defaults.role;
        }

        public Builder setCondition(@Nullable Input<EntryGroupIamMemberConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable EntryGroupIamMemberConditionGetArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setEntryGroup(@Nullable Input<String> entryGroup) {
            this.entryGroup = entryGroup;
            return this;
        }

        public Builder setEntryGroup(@Nullable String entryGroup) {
            this.entryGroup = Input.ofNullable(entryGroup);
            return this;
        }

        public Builder setEtag(@Nullable Input<String> etag) {
            this.etag = etag;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = Input.ofNullable(etag);
            return this;
        }

        public Builder setMember(@Nullable Input<String> member) {
            this.member = member;
            return this;
        }

        public Builder setMember(@Nullable String member) {
            this.member = Input.ofNullable(member);
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }

        public Builder setRegion(@Nullable Input<String> region) {
            this.region = region;
            return this;
        }

        public Builder setRegion(@Nullable String region) {
            this.region = Input.ofNullable(region);
            return this;
        }

        public Builder setRole(@Nullable Input<String> role) {
            this.role = role;
            return this;
        }

        public Builder setRole(@Nullable String role) {
            this.role = Input.ofNullable(role);
            return this;
        }
        public EntryGroupIamMemberState build() {
            return new EntryGroupIamMemberState(condition, entryGroup, etag, member, project, region, role);
        }
    }
}
