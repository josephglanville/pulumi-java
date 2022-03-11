// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.iam_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.iam_v1.enums.RoleStage;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RoleArgs extends io.pulumi.resources.ResourceArgs {

    public static final RoleArgs Empty = new RoleArgs();

    /**
     * The current deleted state of the role. This field is read only. It will be ignored in calls to CreateRole and UpdateRole.
     * 
     */
    @InputImport(name="deleted")
      private final @Nullable Output<Boolean> deleted;

    public Output<Boolean> getDeleted() {
        return this.deleted == null ? Output.empty() : this.deleted;
    }

    /**
     * Optional. A human-readable description for the role.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Used to perform a consistent read-modify-write.
     * 
     */
    @InputImport(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Output.empty() : this.etag;
    }

    /**
     * The names of the permissions this role grants when bound in an IAM policy.
     * 
     */
    @InputImport(name="includedPermissions")
      private final @Nullable Output<List<String>> includedPermissions;

    public Output<List<String>> getIncludedPermissions() {
        return this.includedPermissions == null ? Output.empty() : this.includedPermissions;
    }

    /**
     * The name of the role. When Role is used in CreateRole, the role name must not be set. When Role is used in output and other input such as UpdateRole, the role name is the complete path, e.g., roles/logging.viewer for predefined roles and organizations/{ORGANIZATION_ID}/roles/logging.viewer for custom roles.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The role ID to use for this role. A role ID may contain alphanumeric characters, underscores (`_`), and periods (`.`). It must contain a minimum of 3 characters and a maximum of 64 characters.
     * 
     */
    @InputImport(name="roleId")
      private final @Nullable Output<String> roleId;

    public Output<String> getRoleId() {
        return this.roleId == null ? Output.empty() : this.roleId;
    }

    /**
     * The current launch stage of the role. If the `ALPHA` launch stage has been selected for a role, the `stage` field will not be included in the returned definition for the role.
     * 
     */
    @InputImport(name="stage")
      private final @Nullable Output<RoleStage> stage;

    public Output<RoleStage> getStage() {
        return this.stage == null ? Output.empty() : this.stage;
    }

    /**
     * Optional. A human-readable title for the role. Typically this is limited to 100 UTF-8 bytes.
     * 
     */
    @InputImport(name="title")
      private final @Nullable Output<String> title;

    public Output<String> getTitle() {
        return this.title == null ? Output.empty() : this.title;
    }

    public RoleArgs(
        @Nullable Output<Boolean> deleted,
        @Nullable Output<String> description,
        @Nullable Output<String> etag,
        @Nullable Output<List<String>> includedPermissions,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> roleId,
        @Nullable Output<RoleStage> stage,
        @Nullable Output<String> title) {
        this.deleted = deleted;
        this.description = description;
        this.etag = etag;
        this.includedPermissions = includedPermissions;
        this.name = name;
        this.project = project;
        this.roleId = roleId;
        this.stage = stage;
        this.title = title;
    }

    private RoleArgs() {
        this.deleted = Output.empty();
        this.description = Output.empty();
        this.etag = Output.empty();
        this.includedPermissions = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.roleId = Output.empty();
        this.stage = Output.empty();
        this.title = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> deleted;
        private @Nullable Output<String> description;
        private @Nullable Output<String> etag;
        private @Nullable Output<List<String>> includedPermissions;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> roleId;
        private @Nullable Output<RoleStage> stage;
        private @Nullable Output<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(RoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleted = defaults.deleted;
    	      this.description = defaults.description;
    	      this.etag = defaults.etag;
    	      this.includedPermissions = defaults.includedPermissions;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.roleId = defaults.roleId;
    	      this.stage = defaults.stage;
    	      this.title = defaults.title;
        }

        public Builder deleted(@Nullable Output<Boolean> deleted) {
            this.deleted = deleted;
            return this;
        }

        public Builder deleted(@Nullable Boolean deleted) {
            this.deleted = Output.ofNullable(deleted);
            return this;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
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

        public Builder includedPermissions(@Nullable Output<List<String>> includedPermissions) {
            this.includedPermissions = includedPermissions;
            return this;
        }

        public Builder includedPermissions(@Nullable List<String> includedPermissions) {
            this.includedPermissions = Output.ofNullable(includedPermissions);
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

        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }

        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }

        public Builder roleId(@Nullable Output<String> roleId) {
            this.roleId = roleId;
            return this;
        }

        public Builder roleId(@Nullable String roleId) {
            this.roleId = Output.ofNullable(roleId);
            return this;
        }

        public Builder stage(@Nullable Output<RoleStage> stage) {
            this.stage = stage;
            return this;
        }

        public Builder stage(@Nullable RoleStage stage) {
            this.stage = Output.ofNullable(stage);
            return this;
        }

        public Builder title(@Nullable Output<String> title) {
            this.title = title;
            return this;
        }

        public Builder title(@Nullable String title) {
            this.title = Output.ofNullable(title);
            return this;
        }
        public RoleArgs build() {
            return new RoleArgs(deleted, description, etag, includedPermissions, name, project, roleId, stage, title);
        }
    }
}
