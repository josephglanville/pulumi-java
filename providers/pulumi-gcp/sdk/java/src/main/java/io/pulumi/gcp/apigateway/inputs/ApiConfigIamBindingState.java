// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.apigateway.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.apigateway.inputs.ApiConfigIamBindingConditionGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ApiConfigIamBindingState extends io.pulumi.resources.ResourceArgs {

    public static final ApiConfigIamBindingState Empty = new ApiConfigIamBindingState();

    /**
     * The API to attach the config to.
     * Used to find the parent resource to bind the IAM policy to
     * 
     */
    @InputImport(name="api")
      private final @Nullable Output<String> api;

    public Output<String> getApi() {
        return this.api == null ? Output.empty() : this.api;
    }

    @InputImport(name="apiConfig")
      private final @Nullable Output<String> apiConfig;

    public Output<String> getApiConfig() {
        return this.apiConfig == null ? Output.empty() : this.apiConfig;
    }

    @InputImport(name="condition")
      private final @Nullable Output<ApiConfigIamBindingConditionGetArgs> condition;

    public Output<ApiConfigIamBindingConditionGetArgs> getCondition() {
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

    @InputImport(name="members")
      private final @Nullable Output<List<String>> members;

    public Output<List<String>> getMembers() {
        return this.members == null ? Output.empty() : this.members;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the project will be parsed from the identifier of the parent resource. If no project is provided in the parent identifier and no project is specified, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The role that should be applied. Only one
     * `gcp.apigateway.ApiConfigIamBinding` can be used per role. Note that custom roles must be of the format
     * `[projects|organizations]/{parent-name}/roles/{role-name}`.
     * 
     */
    @InputImport(name="role")
      private final @Nullable Output<String> role;

    public Output<String> getRole() {
        return this.role == null ? Output.empty() : this.role;
    }

    public ApiConfigIamBindingState(
        @Nullable Output<String> api,
        @Nullable Output<String> apiConfig,
        @Nullable Output<ApiConfigIamBindingConditionGetArgs> condition,
        @Nullable Output<String> etag,
        @Nullable Output<List<String>> members,
        @Nullable Output<String> project,
        @Nullable Output<String> role) {
        this.api = api;
        this.apiConfig = apiConfig;
        this.condition = condition;
        this.etag = etag;
        this.members = members;
        this.project = project;
        this.role = role;
    }

    private ApiConfigIamBindingState() {
        this.api = Output.empty();
        this.apiConfig = Output.empty();
        this.condition = Output.empty();
        this.etag = Output.empty();
        this.members = Output.empty();
        this.project = Output.empty();
        this.role = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiConfigIamBindingState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> api;
        private @Nullable Output<String> apiConfig;
        private @Nullable Output<ApiConfigIamBindingConditionGetArgs> condition;
        private @Nullable Output<String> etag;
        private @Nullable Output<List<String>> members;
        private @Nullable Output<String> project;
        private @Nullable Output<String> role;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiConfigIamBindingState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.api = defaults.api;
    	      this.apiConfig = defaults.apiConfig;
    	      this.condition = defaults.condition;
    	      this.etag = defaults.etag;
    	      this.members = defaults.members;
    	      this.project = defaults.project;
    	      this.role = defaults.role;
        }

        public Builder api(@Nullable Output<String> api) {
            this.api = api;
            return this;
        }

        public Builder api(@Nullable String api) {
            this.api = Output.ofNullable(api);
            return this;
        }

        public Builder apiConfig(@Nullable Output<String> apiConfig) {
            this.apiConfig = apiConfig;
            return this;
        }

        public Builder apiConfig(@Nullable String apiConfig) {
            this.apiConfig = Output.ofNullable(apiConfig);
            return this;
        }

        public Builder condition(@Nullable Output<ApiConfigIamBindingConditionGetArgs> condition) {
            this.condition = condition;
            return this;
        }

        public Builder condition(@Nullable ApiConfigIamBindingConditionGetArgs condition) {
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

        public Builder members(@Nullable Output<List<String>> members) {
            this.members = members;
            return this;
        }

        public Builder members(@Nullable List<String> members) {
            this.members = Output.ofNullable(members);
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

        public Builder role(@Nullable Output<String> role) {
            this.role = role;
            return this;
        }

        public Builder role(@Nullable String role) {
            this.role = Output.ofNullable(role);
            return this;
        }
        public ApiConfigIamBindingState build() {
            return new ApiConfigIamBindingState(api, apiConfig, condition, etag, members, project, role);
        }
    }
}
