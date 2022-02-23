// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IAMCustomRoleArgs extends io.pulumi.resources.ResourceArgs {

    public static final IAMCustomRoleArgs Empty = new IAMCustomRoleArgs();

    /**
     * A human-readable description for the role.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * The names of the permissions this role grants when bound in an IAM policy. At least one permission must be specified.
     * 
     */
    @InputImport(name="permissions", required=true)
      private final Input<List<String>> permissions;

    public Input<List<String>> getPermissions() {
        return this.permissions;
    }

    /**
     * The project that the service account will be created in.
     * Defaults to the provider project configuration.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    /**
     * The camel case role id to use for this role. Cannot contain `-` characters.
     * 
     */
    @InputImport(name="roleId", required=true)
      private final Input<String> roleId;

    public Input<String> getRoleId() {
        return this.roleId;
    }

    /**
     * The current launch stage of the role.
     * Defaults to `GA`.
     * List of possible stages is [here](https://cloud.google.com/iam/reference/rest/v1/organizations.roles#Role.RoleLaunchStage).
     * 
     */
    @InputImport(name="stage")
      private final @Nullable Input<String> stage;

    public Input<String> getStage() {
        return this.stage == null ? Input.empty() : this.stage;
    }

    /**
     * A human-readable title for the role.
     * 
     */
    @InputImport(name="title", required=true)
      private final Input<String> title;

    public Input<String> getTitle() {
        return this.title;
    }

    public IAMCustomRoleArgs(
        @Nullable Input<String> description,
        Input<List<String>> permissions,
        @Nullable Input<String> project,
        Input<String> roleId,
        @Nullable Input<String> stage,
        Input<String> title) {
        this.description = description;
        this.permissions = Objects.requireNonNull(permissions, "expected parameter 'permissions' to be non-null");
        this.project = project;
        this.roleId = Objects.requireNonNull(roleId, "expected parameter 'roleId' to be non-null");
        this.stage = stage;
        this.title = Objects.requireNonNull(title, "expected parameter 'title' to be non-null");
    }

    private IAMCustomRoleArgs() {
        this.description = Input.empty();
        this.permissions = Input.empty();
        this.project = Input.empty();
        this.roleId = Input.empty();
        this.stage = Input.empty();
        this.title = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IAMCustomRoleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> description;
        private Input<List<String>> permissions;
        private @Nullable Input<String> project;
        private Input<String> roleId;
        private @Nullable Input<String> stage;
        private Input<String> title;

        public Builder() {
    	      // Empty
        }

        public Builder(IAMCustomRoleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.permissions = defaults.permissions;
    	      this.project = defaults.project;
    	      this.roleId = defaults.roleId;
    	      this.stage = defaults.stage;
    	      this.title = defaults.title;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setPermissions(Input<List<String>> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }

        public Builder setPermissions(List<String> permissions) {
            this.permissions = Input.of(Objects.requireNonNull(permissions));
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

        public Builder setRoleId(Input<String> roleId) {
            this.roleId = Objects.requireNonNull(roleId);
            return this;
        }

        public Builder setRoleId(String roleId) {
            this.roleId = Input.of(Objects.requireNonNull(roleId));
            return this;
        }

        public Builder setStage(@Nullable Input<String> stage) {
            this.stage = stage;
            return this;
        }

        public Builder setStage(@Nullable String stage) {
            this.stage = Input.ofNullable(stage);
            return this;
        }

        public Builder setTitle(Input<String> title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }

        public Builder setTitle(String title) {
            this.title = Input.of(Objects.requireNonNull(title));
            return this;
        }
        public IAMCustomRoleArgs build() {
            return new IAMCustomRoleArgs(description, permissions, project, roleId, stage, title);
        }
    }
}
