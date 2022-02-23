// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.apigateway.inputs.ApiIamBindingConditionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiIamBindingArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiIamBindingArgs Empty = new ApiIamBindingArgs();

    @InputImport(name="api", required=true)
      private final Input<String> api;

    public Input<String> getApi() {
        return this.api;
    }

    @InputImport(name="condition")
      private final @Nullable Input<ApiIamBindingConditionArgs> condition;

    public Input<ApiIamBindingConditionArgs> getCondition() {
        return this.condition == null ? Input.empty() : this.condition;
    }

    @InputImport(name="members", required=true)
      private final Input<List<String>> members;

    public Input<List<String>> getMembers() {
        return this.members;
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

    /**
     * The role that should be applied. Only one
     * `gcp.apigateway.ApiIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role", required=true)
      private final Input<String> role;

    public Input<String> getRole() {
        return this.role;
    }

    public ApiIamBindingArgs(
        Input<String> api,
        @Nullable Input<ApiIamBindingConditionArgs> condition,
        Input<List<String>> members,
        @Nullable Input<String> project,
        Input<String> role) {
        this.api = Objects.requireNonNull(api, "expected parameter 'api' to be non-null");
        this.condition = condition;
        this.members = Objects.requireNonNull(members, "expected parameter 'members' to be non-null");
        this.project = project;
        this.role = Objects.requireNonNull(role, "expected parameter 'role' to be non-null");
    }

    private ApiIamBindingArgs() {
        this.api = Input.empty();
        this.condition = Input.empty();
        this.members = Input.empty();
        this.project = Input.empty();
        this.role = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiIamBindingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> api;
        private @Nullable Input<ApiIamBindingConditionArgs> condition;
        private Input<List<String>> members;
        private @Nullable Input<String> project;
        private Input<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiIamBindingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.api = defaults.api;
    	      this.condition = defaults.condition;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder setApi(Input<String> api) {
            this.api = Objects.requireNonNull(api);
            return this;
        }

        public Builder setApi(String api) {
            this.api = Input.of(Objects.requireNonNull(api));
            return this;
        }

        public Builder setCondition(@Nullable Input<ApiIamBindingConditionArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder setCondition(@Nullable ApiIamBindingConditionArgs condition) {
            this.condition = Input.ofNullable(condition);
            return this;
        }

        public Builder setMembers(Input<List<String>> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }

        public Builder setMembers(List<String> members) {
            this.members = Input.of(Objects.requireNonNull(members));
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

        public Builder setRole(Input<String> role) {
            this.role = Objects.requireNonNull(role);
            return this;
        }

        public Builder setRole(String role) {
            this.role = Input.of(Objects.requireNonNull(role));
            return this;
        }
        public ApiIamBindingArgs build() {
            return new ApiIamBindingArgs(api, condition, members, project, role);
        }
    }
}
