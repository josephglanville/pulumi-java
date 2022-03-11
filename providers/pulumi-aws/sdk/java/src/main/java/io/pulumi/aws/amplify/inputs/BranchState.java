// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.amplify.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class BranchState extends io.pulumi.resources.ResourceArgs {

    public static final BranchState Empty = new BranchState();

    /**
     * The unique ID for an Amplify app.
     * 
     */
    @InputImport(name="appId")
      private final @Nullable Output<String> appId;

    public Output<String> getAppId() {
        return this.appId == null ? Output.empty() : this.appId;
    }

    /**
     * The Amazon Resource Name (ARN) for the branch.
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * A list of custom resources that are linked to this branch.
     * 
     */
    @InputImport(name="associatedResources")
      private final @Nullable Output<List<String>> associatedResources;

    public Output<List<String>> getAssociatedResources() {
        return this.associatedResources == null ? Output.empty() : this.associatedResources;
    }

    /**
     * The Amazon Resource Name (ARN) for a backend environment that is part of an Amplify app.
     * 
     */
    @InputImport(name="backendEnvironmentArn")
      private final @Nullable Output<String> backendEnvironmentArn;

    public Output<String> getBackendEnvironmentArn() {
        return this.backendEnvironmentArn == null ? Output.empty() : this.backendEnvironmentArn;
    }

    /**
     * The basic authorization credentials for the branch.
     * 
     */
    @InputImport(name="basicAuthCredentials")
      private final @Nullable Output<String> basicAuthCredentials;

    public Output<String> getBasicAuthCredentials() {
        return this.basicAuthCredentials == null ? Output.empty() : this.basicAuthCredentials;
    }

    /**
     * The name for the branch.
     * 
     */
    @InputImport(name="branchName")
      private final @Nullable Output<String> branchName;

    public Output<String> getBranchName() {
        return this.branchName == null ? Output.empty() : this.branchName;
    }

    /**
     * The custom domains for the branch.
     * 
     */
    @InputImport(name="customDomains")
      private final @Nullable Output<List<String>> customDomains;

    public Output<List<String>> getCustomDomains() {
        return this.customDomains == null ? Output.empty() : this.customDomains;
    }

    /**
     * The description for the branch.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The destination branch if the branch is a pull request branch.
     * 
     */
    @InputImport(name="destinationBranch")
      private final @Nullable Output<String> destinationBranch;

    public Output<String> getDestinationBranch() {
        return this.destinationBranch == null ? Output.empty() : this.destinationBranch;
    }

    /**
     * The display name for a branch. This is used as the default domain prefix.
     * 
     */
    @InputImport(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Enables auto building for the branch.
     * 
     */
    @InputImport(name="enableAutoBuild")
      private final @Nullable Output<Boolean> enableAutoBuild;

    public Output<Boolean> getEnableAutoBuild() {
        return this.enableAutoBuild == null ? Output.empty() : this.enableAutoBuild;
    }

    /**
     * Enables basic authorization for the branch.
     * 
     */
    @InputImport(name="enableBasicAuth")
      private final @Nullable Output<Boolean> enableBasicAuth;

    public Output<Boolean> getEnableBasicAuth() {
        return this.enableBasicAuth == null ? Output.empty() : this.enableBasicAuth;
    }

    /**
     * Enables notifications for the branch.
     * 
     */
    @InputImport(name="enableNotification")
      private final @Nullable Output<Boolean> enableNotification;

    public Output<Boolean> getEnableNotification() {
        return this.enableNotification == null ? Output.empty() : this.enableNotification;
    }

    /**
     * Enables performance mode for the branch.
     * 
     */
    @InputImport(name="enablePerformanceMode")
      private final @Nullable Output<Boolean> enablePerformanceMode;

    public Output<Boolean> getEnablePerformanceMode() {
        return this.enablePerformanceMode == null ? Output.empty() : this.enablePerformanceMode;
    }

    /**
     * Enables pull request previews for this branch.
     * 
     */
    @InputImport(name="enablePullRequestPreview")
      private final @Nullable Output<Boolean> enablePullRequestPreview;

    public Output<Boolean> getEnablePullRequestPreview() {
        return this.enablePullRequestPreview == null ? Output.empty() : this.enablePullRequestPreview;
    }

    /**
     * The environment variables for the branch.
     * 
     */
    @InputImport(name="environmentVariables")
      private final @Nullable Output<Map<String,String>> environmentVariables;

    public Output<Map<String,String>> getEnvironmentVariables() {
        return this.environmentVariables == null ? Output.empty() : this.environmentVariables;
    }

    /**
     * The framework for the branch.
     * 
     */
    @InputImport(name="framework")
      private final @Nullable Output<String> framework;

    public Output<String> getFramework() {
        return this.framework == null ? Output.empty() : this.framework;
    }

    /**
     * The Amplify environment name for the pull request.
     * 
     */
    @InputImport(name="pullRequestEnvironmentName")
      private final @Nullable Output<String> pullRequestEnvironmentName;

    public Output<String> getPullRequestEnvironmentName() {
        return this.pullRequestEnvironmentName == null ? Output.empty() : this.pullRequestEnvironmentName;
    }

    /**
     * The source branch if the branch is a pull request branch.
     * 
     */
    @InputImport(name="sourceBranch")
      private final @Nullable Output<String> sourceBranch;

    public Output<String> getSourceBranch() {
        return this.sourceBranch == null ? Output.empty() : this.sourceBranch;
    }

    /**
     * Describes the current stage for the branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
     * 
     */
    @InputImport(name="stage")
      private final @Nullable Output<String> stage;

    public Output<String> getStage() {
        return this.stage == null ? Output.empty() : this.stage;
    }

    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * The content Time To Live (TTL) for the website in seconds.
     * 
     */
    @InputImport(name="ttl")
      private final @Nullable Output<String> ttl;

    public Output<String> getTtl() {
        return this.ttl == null ? Output.empty() : this.ttl;
    }

    public BranchState(
        @Nullable Output<String> appId,
        @Nullable Output<String> arn,
        @Nullable Output<List<String>> associatedResources,
        @Nullable Output<String> backendEnvironmentArn,
        @Nullable Output<String> basicAuthCredentials,
        @Nullable Output<String> branchName,
        @Nullable Output<List<String>> customDomains,
        @Nullable Output<String> description,
        @Nullable Output<String> destinationBranch,
        @Nullable Output<String> displayName,
        @Nullable Output<Boolean> enableAutoBuild,
        @Nullable Output<Boolean> enableBasicAuth,
        @Nullable Output<Boolean> enableNotification,
        @Nullable Output<Boolean> enablePerformanceMode,
        @Nullable Output<Boolean> enablePullRequestPreview,
        @Nullable Output<Map<String,String>> environmentVariables,
        @Nullable Output<String> framework,
        @Nullable Output<String> pullRequestEnvironmentName,
        @Nullable Output<String> sourceBranch,
        @Nullable Output<String> stage,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> ttl) {
        this.appId = appId;
        this.arn = arn;
        this.associatedResources = associatedResources;
        this.backendEnvironmentArn = backendEnvironmentArn;
        this.basicAuthCredentials = basicAuthCredentials;
        this.branchName = branchName;
        this.customDomains = customDomains;
        this.description = description;
        this.destinationBranch = destinationBranch;
        this.displayName = displayName;
        this.enableAutoBuild = enableAutoBuild;
        this.enableBasicAuth = enableBasicAuth;
        this.enableNotification = enableNotification;
        this.enablePerformanceMode = enablePerformanceMode;
        this.enablePullRequestPreview = enablePullRequestPreview;
        this.environmentVariables = environmentVariables;
        this.framework = framework;
        this.pullRequestEnvironmentName = pullRequestEnvironmentName;
        this.sourceBranch = sourceBranch;
        this.stage = stage;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.ttl = ttl;
    }

    private BranchState() {
        this.appId = Output.empty();
        this.arn = Output.empty();
        this.associatedResources = Output.empty();
        this.backendEnvironmentArn = Output.empty();
        this.basicAuthCredentials = Output.empty();
        this.branchName = Output.empty();
        this.customDomains = Output.empty();
        this.description = Output.empty();
        this.destinationBranch = Output.empty();
        this.displayName = Output.empty();
        this.enableAutoBuild = Output.empty();
        this.enableBasicAuth = Output.empty();
        this.enableNotification = Output.empty();
        this.enablePerformanceMode = Output.empty();
        this.enablePullRequestPreview = Output.empty();
        this.environmentVariables = Output.empty();
        this.framework = Output.empty();
        this.pullRequestEnvironmentName = Output.empty();
        this.sourceBranch = Output.empty();
        this.stage = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.ttl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BranchState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> appId;
        private @Nullable Output<String> arn;
        private @Nullable Output<List<String>> associatedResources;
        private @Nullable Output<String> backendEnvironmentArn;
        private @Nullable Output<String> basicAuthCredentials;
        private @Nullable Output<String> branchName;
        private @Nullable Output<List<String>> customDomains;
        private @Nullable Output<String> description;
        private @Nullable Output<String> destinationBranch;
        private @Nullable Output<String> displayName;
        private @Nullable Output<Boolean> enableAutoBuild;
        private @Nullable Output<Boolean> enableBasicAuth;
        private @Nullable Output<Boolean> enableNotification;
        private @Nullable Output<Boolean> enablePerformanceMode;
        private @Nullable Output<Boolean> enablePullRequestPreview;
        private @Nullable Output<Map<String,String>> environmentVariables;
        private @Nullable Output<String> framework;
        private @Nullable Output<String> pullRequestEnvironmentName;
        private @Nullable Output<String> sourceBranch;
        private @Nullable Output<String> stage;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(BranchState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appId = defaults.appId;
    	      this.arn = defaults.arn;
    	      this.associatedResources = defaults.associatedResources;
    	      this.backendEnvironmentArn = defaults.backendEnvironmentArn;
    	      this.basicAuthCredentials = defaults.basicAuthCredentials;
    	      this.branchName = defaults.branchName;
    	      this.customDomains = defaults.customDomains;
    	      this.description = defaults.description;
    	      this.destinationBranch = defaults.destinationBranch;
    	      this.displayName = defaults.displayName;
    	      this.enableAutoBuild = defaults.enableAutoBuild;
    	      this.enableBasicAuth = defaults.enableBasicAuth;
    	      this.enableNotification = defaults.enableNotification;
    	      this.enablePerformanceMode = defaults.enablePerformanceMode;
    	      this.enablePullRequestPreview = defaults.enablePullRequestPreview;
    	      this.environmentVariables = defaults.environmentVariables;
    	      this.framework = defaults.framework;
    	      this.pullRequestEnvironmentName = defaults.pullRequestEnvironmentName;
    	      this.sourceBranch = defaults.sourceBranch;
    	      this.stage = defaults.stage;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.ttl = defaults.ttl;
        }

        public Builder appId(@Nullable Output<String> appId) {
            this.appId = appId;
            return this;
        }

        public Builder appId(@Nullable String appId) {
            this.appId = Output.ofNullable(appId);
            return this;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder associatedResources(@Nullable Output<List<String>> associatedResources) {
            this.associatedResources = associatedResources;
            return this;
        }

        public Builder associatedResources(@Nullable List<String> associatedResources) {
            this.associatedResources = Output.ofNullable(associatedResources);
            return this;
        }

        public Builder backendEnvironmentArn(@Nullable Output<String> backendEnvironmentArn) {
            this.backendEnvironmentArn = backendEnvironmentArn;
            return this;
        }

        public Builder backendEnvironmentArn(@Nullable String backendEnvironmentArn) {
            this.backendEnvironmentArn = Output.ofNullable(backendEnvironmentArn);
            return this;
        }

        public Builder basicAuthCredentials(@Nullable Output<String> basicAuthCredentials) {
            this.basicAuthCredentials = basicAuthCredentials;
            return this;
        }

        public Builder basicAuthCredentials(@Nullable String basicAuthCredentials) {
            this.basicAuthCredentials = Output.ofNullable(basicAuthCredentials);
            return this;
        }

        public Builder branchName(@Nullable Output<String> branchName) {
            this.branchName = branchName;
            return this;
        }

        public Builder branchName(@Nullable String branchName) {
            this.branchName = Output.ofNullable(branchName);
            return this;
        }

        public Builder customDomains(@Nullable Output<List<String>> customDomains) {
            this.customDomains = customDomains;
            return this;
        }

        public Builder customDomains(@Nullable List<String> customDomains) {
            this.customDomains = Output.ofNullable(customDomains);
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

        public Builder destinationBranch(@Nullable Output<String> destinationBranch) {
            this.destinationBranch = destinationBranch;
            return this;
        }

        public Builder destinationBranch(@Nullable String destinationBranch) {
            this.destinationBranch = Output.ofNullable(destinationBranch);
            return this;
        }

        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }

        public Builder enableAutoBuild(@Nullable Output<Boolean> enableAutoBuild) {
            this.enableAutoBuild = enableAutoBuild;
            return this;
        }

        public Builder enableAutoBuild(@Nullable Boolean enableAutoBuild) {
            this.enableAutoBuild = Output.ofNullable(enableAutoBuild);
            return this;
        }

        public Builder enableBasicAuth(@Nullable Output<Boolean> enableBasicAuth) {
            this.enableBasicAuth = enableBasicAuth;
            return this;
        }

        public Builder enableBasicAuth(@Nullable Boolean enableBasicAuth) {
            this.enableBasicAuth = Output.ofNullable(enableBasicAuth);
            return this;
        }

        public Builder enableNotification(@Nullable Output<Boolean> enableNotification) {
            this.enableNotification = enableNotification;
            return this;
        }

        public Builder enableNotification(@Nullable Boolean enableNotification) {
            this.enableNotification = Output.ofNullable(enableNotification);
            return this;
        }

        public Builder enablePerformanceMode(@Nullable Output<Boolean> enablePerformanceMode) {
            this.enablePerformanceMode = enablePerformanceMode;
            return this;
        }

        public Builder enablePerformanceMode(@Nullable Boolean enablePerformanceMode) {
            this.enablePerformanceMode = Output.ofNullable(enablePerformanceMode);
            return this;
        }

        public Builder enablePullRequestPreview(@Nullable Output<Boolean> enablePullRequestPreview) {
            this.enablePullRequestPreview = enablePullRequestPreview;
            return this;
        }

        public Builder enablePullRequestPreview(@Nullable Boolean enablePullRequestPreview) {
            this.enablePullRequestPreview = Output.ofNullable(enablePullRequestPreview);
            return this;
        }

        public Builder environmentVariables(@Nullable Output<Map<String,String>> environmentVariables) {
            this.environmentVariables = environmentVariables;
            return this;
        }

        public Builder environmentVariables(@Nullable Map<String,String> environmentVariables) {
            this.environmentVariables = Output.ofNullable(environmentVariables);
            return this;
        }

        public Builder framework(@Nullable Output<String> framework) {
            this.framework = framework;
            return this;
        }

        public Builder framework(@Nullable String framework) {
            this.framework = Output.ofNullable(framework);
            return this;
        }

        public Builder pullRequestEnvironmentName(@Nullable Output<String> pullRequestEnvironmentName) {
            this.pullRequestEnvironmentName = pullRequestEnvironmentName;
            return this;
        }

        public Builder pullRequestEnvironmentName(@Nullable String pullRequestEnvironmentName) {
            this.pullRequestEnvironmentName = Output.ofNullable(pullRequestEnvironmentName);
            return this;
        }

        public Builder sourceBranch(@Nullable Output<String> sourceBranch) {
            this.sourceBranch = sourceBranch;
            return this;
        }

        public Builder sourceBranch(@Nullable String sourceBranch) {
            this.sourceBranch = Output.ofNullable(sourceBranch);
            return this;
        }

        public Builder stage(@Nullable Output<String> stage) {
            this.stage = stage;
            return this;
        }

        public Builder stage(@Nullable String stage) {
            this.stage = Output.ofNullable(stage);
            return this;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }

        public Builder ttl(@Nullable Output<String> ttl) {
            this.ttl = ttl;
            return this;
        }

        public Builder ttl(@Nullable String ttl) {
            this.ttl = Output.ofNullable(ttl);
            return this;
        }
        public BranchState build() {
            return new BranchState(appId, arn, associatedResources, backendEnvironmentArn, basicAuthCredentials, branchName, customDomains, description, destinationBranch, displayName, enableAutoBuild, enableBasicAuth, enableNotification, enablePerformanceMode, enablePullRequestPreview, environmentVariables, framework, pullRequestEnvironmentName, sourceBranch, stage, tags, tagsAll, ttl);
        }
    }
}
