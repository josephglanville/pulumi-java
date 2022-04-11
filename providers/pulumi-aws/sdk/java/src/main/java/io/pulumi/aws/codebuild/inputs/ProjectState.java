// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.inputs;

import io.pulumi.aws.codebuild.inputs.ProjectArtifactsGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectBuildBatchConfigGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectCacheGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectEnvironmentGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectFileSystemLocationGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectLogsConfigGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectSecondaryArtifactGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectSecondarySourceGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectSecondarySourceVersionGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectSourceGetArgs;
import io.pulumi.aws.codebuild.inputs.ProjectVpcConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectState extends io.pulumi.resources.ResourceArgs {

    public static final ProjectState Empty = new ProjectState();

    /**
     * ARN of the CodeBuild project.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Codegen.empty() : this.arn;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="artifacts")
      private final @Nullable Output<ProjectArtifactsGetArgs> artifacts;

    public Output<ProjectArtifactsGetArgs> getArtifacts() {
        return this.artifacts == null ? Codegen.empty() : this.artifacts;
    }

    /**
     * Generates a publicly-accessible URL for the projects build badge. Available as `badge_url` attribute when enabled.
     * 
     */
    @Import(name="badgeEnabled")
      private final @Nullable Output<Boolean> badgeEnabled;

    public Output<Boolean> getBadgeEnabled() {
        return this.badgeEnabled == null ? Codegen.empty() : this.badgeEnabled;
    }

    /**
     * URL of the build badge when `badge_enabled` is enabled.
     * 
     */
    @Import(name="badgeUrl")
      private final @Nullable Output<String> badgeUrl;

    public Output<String> getBadgeUrl() {
        return this.badgeUrl == null ? Codegen.empty() : this.badgeUrl;
    }

    /**
     * Defines the batch build options for the project.
     * 
     */
    @Import(name="buildBatchConfig")
      private final @Nullable Output<ProjectBuildBatchConfigGetArgs> buildBatchConfig;

    public Output<ProjectBuildBatchConfigGetArgs> getBuildBatchConfig() {
        return this.buildBatchConfig == null ? Codegen.empty() : this.buildBatchConfig;
    }

    /**
     * Number of minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that does not get marked as completed. The default is 60 minutes.
     * 
     */
    @Import(name="buildTimeout")
      private final @Nullable Output<Integer> buildTimeout;

    public Output<Integer> getBuildTimeout() {
        return this.buildTimeout == null ? Codegen.empty() : this.buildTimeout;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="cache")
      private final @Nullable Output<ProjectCacheGetArgs> cache;

    public Output<ProjectCacheGetArgs> getCache() {
        return this.cache == null ? Codegen.empty() : this.cache;
    }

    /**
     * Specify a maximum number of concurrent builds for the project. The value specified must be greater than 0 and less than the account concurrent running builds limit.
     * 
     */
    @Import(name="concurrentBuildLimit")
      private final @Nullable Output<Integer> concurrentBuildLimit;

    public Output<Integer> getConcurrentBuildLimit() {
        return this.concurrentBuildLimit == null ? Codegen.empty() : this.concurrentBuildLimit;
    }

    /**
     * Short description of the project.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build project's build output artifacts.
     * 
     */
    @Import(name="encryptionKey")
      private final @Nullable Output<String> encryptionKey;

    public Output<String> getEncryptionKey() {
        return this.encryptionKey == null ? Codegen.empty() : this.encryptionKey;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="environment")
      private final @Nullable Output<ProjectEnvironmentGetArgs> environment;

    public Output<ProjectEnvironmentGetArgs> getEnvironment() {
        return this.environment == null ? Codegen.empty() : this.environment;
    }

    /**
     * A set of file system locations to to mount inside the build. File system locations are documented below.
     * 
     */
    @Import(name="fileSystemLocations")
      private final @Nullable Output<List<ProjectFileSystemLocationGetArgs>> fileSystemLocations;

    public Output<List<ProjectFileSystemLocationGetArgs>> getFileSystemLocations() {
        return this.fileSystemLocations == null ? Codegen.empty() : this.fileSystemLocations;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="logsConfig")
      private final @Nullable Output<ProjectLogsConfigGetArgs> logsConfig;

    public Output<ProjectLogsConfigGetArgs> getLogsConfig() {
        return this.logsConfig == null ? Codegen.empty() : this.logsConfig;
    }

    /**
     * Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Specifies the visibility of the project's builds. Possible values are: `PUBLIC_READ` and `PRIVATE`. Default value is `PRIVATE`.
     * 
     */
    @Import(name="projectVisibility")
      private final @Nullable Output<String> projectVisibility;

    public Output<String> getProjectVisibility() {
        return this.projectVisibility == null ? Codegen.empty() : this.projectVisibility;
    }

    /**
     * The project identifier used with the public build APIs.
     * 
     */
    @Import(name="publicProjectAlias")
      private final @Nullable Output<String> publicProjectAlias;

    public Output<String> getPublicProjectAlias() {
        return this.publicProjectAlias == null ? Codegen.empty() : this.publicProjectAlias;
    }

    /**
     * Number of minutes, from 5 to 480 (8 hours), a build is allowed to be queued before it times out. The default is 8 hours.
     * 
     */
    @Import(name="queuedTimeout")
      private final @Nullable Output<Integer> queuedTimeout;

    public Output<Integer> getQueuedTimeout() {
        return this.queuedTimeout == null ? Codegen.empty() : this.queuedTimeout;
    }

    /**
     * The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3 artifacts for the project's builds.
     * 
     */
    @Import(name="resourceAccessRole")
      private final @Nullable Output<String> resourceAccessRole;

    public Output<String> getResourceAccessRole() {
        return this.resourceAccessRole == null ? Codegen.empty() : this.resourceAccessRole;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="secondaryArtifacts")
      private final @Nullable Output<List<ProjectSecondaryArtifactGetArgs>> secondaryArtifacts;

    public Output<List<ProjectSecondaryArtifactGetArgs>> getSecondaryArtifacts() {
        return this.secondaryArtifacts == null ? Codegen.empty() : this.secondaryArtifacts;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="secondarySourceVersions")
      private final @Nullable Output<List<ProjectSecondarySourceVersionGetArgs>> secondarySourceVersions;

    public Output<List<ProjectSecondarySourceVersionGetArgs>> getSecondarySourceVersions() {
        return this.secondarySourceVersions == null ? Codegen.empty() : this.secondarySourceVersions;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="secondarySources")
      private final @Nullable Output<List<ProjectSecondarySourceGetArgs>> secondarySources;

    public Output<List<ProjectSecondarySourceGetArgs>> getSecondarySources() {
        return this.secondarySources == null ? Codegen.empty() : this.secondarySources;
    }

    /**
     * Specifies the service role ARN for the batch build project.
     * 
     */
    @Import(name="serviceRole")
      private final @Nullable Output<String> serviceRole;

    public Output<String> getServiceRole() {
        return this.serviceRole == null ? Codegen.empty() : this.serviceRole;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="source")
      private final @Nullable Output<ProjectSourceGetArgs> source;

    public Output<ProjectSourceGetArgs> getSource() {
        return this.source == null ? Codegen.empty() : this.source;
    }

    /**
     * The source version for the corresponding source identifier. See [AWS docs](https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ProjectSourceVersion.html#CodeBuild-Type-ProjectSourceVersion-sourceVersion) for more details.
     * 
     */
    @Import(name="sourceVersion")
      private final @Nullable Output<String> sourceVersion;

    public Output<String> getSourceVersion() {
        return this.sourceVersion == null ? Codegen.empty() : this.sourceVersion;
    }

    /**
     * Map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Codegen.empty() : this.tagsAll;
    }

    /**
     * Configuration block. Detailed below.
     * 
     */
    @Import(name="vpcConfig")
      private final @Nullable Output<ProjectVpcConfigGetArgs> vpcConfig;

    public Output<ProjectVpcConfigGetArgs> getVpcConfig() {
        return this.vpcConfig == null ? Codegen.empty() : this.vpcConfig;
    }

    public ProjectState(
        @Nullable Output<String> arn,
        @Nullable Output<ProjectArtifactsGetArgs> artifacts,
        @Nullable Output<Boolean> badgeEnabled,
        @Nullable Output<String> badgeUrl,
        @Nullable Output<ProjectBuildBatchConfigGetArgs> buildBatchConfig,
        @Nullable Output<Integer> buildTimeout,
        @Nullable Output<ProjectCacheGetArgs> cache,
        @Nullable Output<Integer> concurrentBuildLimit,
        @Nullable Output<String> description,
        @Nullable Output<String> encryptionKey,
        @Nullable Output<ProjectEnvironmentGetArgs> environment,
        @Nullable Output<List<ProjectFileSystemLocationGetArgs>> fileSystemLocations,
        @Nullable Output<ProjectLogsConfigGetArgs> logsConfig,
        @Nullable Output<String> name,
        @Nullable Output<String> projectVisibility,
        @Nullable Output<String> publicProjectAlias,
        @Nullable Output<Integer> queuedTimeout,
        @Nullable Output<String> resourceAccessRole,
        @Nullable Output<List<ProjectSecondaryArtifactGetArgs>> secondaryArtifacts,
        @Nullable Output<List<ProjectSecondarySourceVersionGetArgs>> secondarySourceVersions,
        @Nullable Output<List<ProjectSecondarySourceGetArgs>> secondarySources,
        @Nullable Output<String> serviceRole,
        @Nullable Output<ProjectSourceGetArgs> source,
        @Nullable Output<String> sourceVersion,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<ProjectVpcConfigGetArgs> vpcConfig) {
        this.arn = arn;
        this.artifacts = artifacts;
        this.badgeEnabled = badgeEnabled;
        this.badgeUrl = badgeUrl;
        this.buildBatchConfig = buildBatchConfig;
        this.buildTimeout = buildTimeout;
        this.cache = cache;
        this.concurrentBuildLimit = concurrentBuildLimit;
        this.description = description;
        this.encryptionKey = encryptionKey;
        this.environment = environment;
        this.fileSystemLocations = fileSystemLocations;
        this.logsConfig = logsConfig;
        this.name = name;
        this.projectVisibility = projectVisibility;
        this.publicProjectAlias = publicProjectAlias;
        this.queuedTimeout = queuedTimeout;
        this.resourceAccessRole = resourceAccessRole;
        this.secondaryArtifacts = secondaryArtifacts;
        this.secondarySourceVersions = secondarySourceVersions;
        this.secondarySources = secondarySources;
        this.serviceRole = serviceRole;
        this.source = source;
        this.sourceVersion = sourceVersion;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.vpcConfig = vpcConfig;
    }

    private ProjectState() {
        this.arn = Codegen.empty();
        this.artifacts = Codegen.empty();
        this.badgeEnabled = Codegen.empty();
        this.badgeUrl = Codegen.empty();
        this.buildBatchConfig = Codegen.empty();
        this.buildTimeout = Codegen.empty();
        this.cache = Codegen.empty();
        this.concurrentBuildLimit = Codegen.empty();
        this.description = Codegen.empty();
        this.encryptionKey = Codegen.empty();
        this.environment = Codegen.empty();
        this.fileSystemLocations = Codegen.empty();
        this.logsConfig = Codegen.empty();
        this.name = Codegen.empty();
        this.projectVisibility = Codegen.empty();
        this.publicProjectAlias = Codegen.empty();
        this.queuedTimeout = Codegen.empty();
        this.resourceAccessRole = Codegen.empty();
        this.secondaryArtifacts = Codegen.empty();
        this.secondarySourceVersions = Codegen.empty();
        this.secondarySources = Codegen.empty();
        this.serviceRole = Codegen.empty();
        this.source = Codegen.empty();
        this.sourceVersion = Codegen.empty();
        this.tags = Codegen.empty();
        this.tagsAll = Codegen.empty();
        this.vpcConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<ProjectArtifactsGetArgs> artifacts;
        private @Nullable Output<Boolean> badgeEnabled;
        private @Nullable Output<String> badgeUrl;
        private @Nullable Output<ProjectBuildBatchConfigGetArgs> buildBatchConfig;
        private @Nullable Output<Integer> buildTimeout;
        private @Nullable Output<ProjectCacheGetArgs> cache;
        private @Nullable Output<Integer> concurrentBuildLimit;
        private @Nullable Output<String> description;
        private @Nullable Output<String> encryptionKey;
        private @Nullable Output<ProjectEnvironmentGetArgs> environment;
        private @Nullable Output<List<ProjectFileSystemLocationGetArgs>> fileSystemLocations;
        private @Nullable Output<ProjectLogsConfigGetArgs> logsConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<String> projectVisibility;
        private @Nullable Output<String> publicProjectAlias;
        private @Nullable Output<Integer> queuedTimeout;
        private @Nullable Output<String> resourceAccessRole;
        private @Nullable Output<List<ProjectSecondaryArtifactGetArgs>> secondaryArtifacts;
        private @Nullable Output<List<ProjectSecondarySourceVersionGetArgs>> secondarySourceVersions;
        private @Nullable Output<List<ProjectSecondarySourceGetArgs>> secondarySources;
        private @Nullable Output<String> serviceRole;
        private @Nullable Output<ProjectSourceGetArgs> source;
        private @Nullable Output<String> sourceVersion;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<ProjectVpcConfigGetArgs> vpcConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.artifacts = defaults.artifacts;
    	      this.badgeEnabled = defaults.badgeEnabled;
    	      this.badgeUrl = defaults.badgeUrl;
    	      this.buildBatchConfig = defaults.buildBatchConfig;
    	      this.buildTimeout = defaults.buildTimeout;
    	      this.cache = defaults.cache;
    	      this.concurrentBuildLimit = defaults.concurrentBuildLimit;
    	      this.description = defaults.description;
    	      this.encryptionKey = defaults.encryptionKey;
    	      this.environment = defaults.environment;
    	      this.fileSystemLocations = defaults.fileSystemLocations;
    	      this.logsConfig = defaults.logsConfig;
    	      this.name = defaults.name;
    	      this.projectVisibility = defaults.projectVisibility;
    	      this.publicProjectAlias = defaults.publicProjectAlias;
    	      this.queuedTimeout = defaults.queuedTimeout;
    	      this.resourceAccessRole = defaults.resourceAccessRole;
    	      this.secondaryArtifacts = defaults.secondaryArtifacts;
    	      this.secondarySourceVersions = defaults.secondarySourceVersions;
    	      this.secondarySources = defaults.secondarySources;
    	      this.serviceRole = defaults.serviceRole;
    	      this.source = defaults.source;
    	      this.sourceVersion = defaults.sourceVersion;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.vpcConfig = defaults.vpcConfig;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Codegen.ofNullable(arn);
            return this;
        }
        public Builder artifacts(@Nullable Output<ProjectArtifactsGetArgs> artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public Builder artifacts(@Nullable ProjectArtifactsGetArgs artifacts) {
            this.artifacts = Codegen.ofNullable(artifacts);
            return this;
        }
        public Builder badgeEnabled(@Nullable Output<Boolean> badgeEnabled) {
            this.badgeEnabled = badgeEnabled;
            return this;
        }
        public Builder badgeEnabled(@Nullable Boolean badgeEnabled) {
            this.badgeEnabled = Codegen.ofNullable(badgeEnabled);
            return this;
        }
        public Builder badgeUrl(@Nullable Output<String> badgeUrl) {
            this.badgeUrl = badgeUrl;
            return this;
        }
        public Builder badgeUrl(@Nullable String badgeUrl) {
            this.badgeUrl = Codegen.ofNullable(badgeUrl);
            return this;
        }
        public Builder buildBatchConfig(@Nullable Output<ProjectBuildBatchConfigGetArgs> buildBatchConfig) {
            this.buildBatchConfig = buildBatchConfig;
            return this;
        }
        public Builder buildBatchConfig(@Nullable ProjectBuildBatchConfigGetArgs buildBatchConfig) {
            this.buildBatchConfig = Codegen.ofNullable(buildBatchConfig);
            return this;
        }
        public Builder buildTimeout(@Nullable Output<Integer> buildTimeout) {
            this.buildTimeout = buildTimeout;
            return this;
        }
        public Builder buildTimeout(@Nullable Integer buildTimeout) {
            this.buildTimeout = Codegen.ofNullable(buildTimeout);
            return this;
        }
        public Builder cache(@Nullable Output<ProjectCacheGetArgs> cache) {
            this.cache = cache;
            return this;
        }
        public Builder cache(@Nullable ProjectCacheGetArgs cache) {
            this.cache = Codegen.ofNullable(cache);
            return this;
        }
        public Builder concurrentBuildLimit(@Nullable Output<Integer> concurrentBuildLimit) {
            this.concurrentBuildLimit = concurrentBuildLimit;
            return this;
        }
        public Builder concurrentBuildLimit(@Nullable Integer concurrentBuildLimit) {
            this.concurrentBuildLimit = Codegen.ofNullable(concurrentBuildLimit);
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder encryptionKey(@Nullable Output<String> encryptionKey) {
            this.encryptionKey = encryptionKey;
            return this;
        }
        public Builder encryptionKey(@Nullable String encryptionKey) {
            this.encryptionKey = Codegen.ofNullable(encryptionKey);
            return this;
        }
        public Builder environment(@Nullable Output<ProjectEnvironmentGetArgs> environment) {
            this.environment = environment;
            return this;
        }
        public Builder environment(@Nullable ProjectEnvironmentGetArgs environment) {
            this.environment = Codegen.ofNullable(environment);
            return this;
        }
        public Builder fileSystemLocations(@Nullable Output<List<ProjectFileSystemLocationGetArgs>> fileSystemLocations) {
            this.fileSystemLocations = fileSystemLocations;
            return this;
        }
        public Builder fileSystemLocations(@Nullable List<ProjectFileSystemLocationGetArgs> fileSystemLocations) {
            this.fileSystemLocations = Codegen.ofNullable(fileSystemLocations);
            return this;
        }
        public Builder fileSystemLocations(ProjectFileSystemLocationGetArgs... fileSystemLocations) {
            return fileSystemLocations(List.of(fileSystemLocations));
        }
        public Builder logsConfig(@Nullable Output<ProjectLogsConfigGetArgs> logsConfig) {
            this.logsConfig = logsConfig;
            return this;
        }
        public Builder logsConfig(@Nullable ProjectLogsConfigGetArgs logsConfig) {
            this.logsConfig = Codegen.ofNullable(logsConfig);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder projectVisibility(@Nullable Output<String> projectVisibility) {
            this.projectVisibility = projectVisibility;
            return this;
        }
        public Builder projectVisibility(@Nullable String projectVisibility) {
            this.projectVisibility = Codegen.ofNullable(projectVisibility);
            return this;
        }
        public Builder publicProjectAlias(@Nullable Output<String> publicProjectAlias) {
            this.publicProjectAlias = publicProjectAlias;
            return this;
        }
        public Builder publicProjectAlias(@Nullable String publicProjectAlias) {
            this.publicProjectAlias = Codegen.ofNullable(publicProjectAlias);
            return this;
        }
        public Builder queuedTimeout(@Nullable Output<Integer> queuedTimeout) {
            this.queuedTimeout = queuedTimeout;
            return this;
        }
        public Builder queuedTimeout(@Nullable Integer queuedTimeout) {
            this.queuedTimeout = Codegen.ofNullable(queuedTimeout);
            return this;
        }
        public Builder resourceAccessRole(@Nullable Output<String> resourceAccessRole) {
            this.resourceAccessRole = resourceAccessRole;
            return this;
        }
        public Builder resourceAccessRole(@Nullable String resourceAccessRole) {
            this.resourceAccessRole = Codegen.ofNullable(resourceAccessRole);
            return this;
        }
        public Builder secondaryArtifacts(@Nullable Output<List<ProjectSecondaryArtifactGetArgs>> secondaryArtifacts) {
            this.secondaryArtifacts = secondaryArtifacts;
            return this;
        }
        public Builder secondaryArtifacts(@Nullable List<ProjectSecondaryArtifactGetArgs> secondaryArtifacts) {
            this.secondaryArtifacts = Codegen.ofNullable(secondaryArtifacts);
            return this;
        }
        public Builder secondaryArtifacts(ProjectSecondaryArtifactGetArgs... secondaryArtifacts) {
            return secondaryArtifacts(List.of(secondaryArtifacts));
        }
        public Builder secondarySourceVersions(@Nullable Output<List<ProjectSecondarySourceVersionGetArgs>> secondarySourceVersions) {
            this.secondarySourceVersions = secondarySourceVersions;
            return this;
        }
        public Builder secondarySourceVersions(@Nullable List<ProjectSecondarySourceVersionGetArgs> secondarySourceVersions) {
            this.secondarySourceVersions = Codegen.ofNullable(secondarySourceVersions);
            return this;
        }
        public Builder secondarySourceVersions(ProjectSecondarySourceVersionGetArgs... secondarySourceVersions) {
            return secondarySourceVersions(List.of(secondarySourceVersions));
        }
        public Builder secondarySources(@Nullable Output<List<ProjectSecondarySourceGetArgs>> secondarySources) {
            this.secondarySources = secondarySources;
            return this;
        }
        public Builder secondarySources(@Nullable List<ProjectSecondarySourceGetArgs> secondarySources) {
            this.secondarySources = Codegen.ofNullable(secondarySources);
            return this;
        }
        public Builder secondarySources(ProjectSecondarySourceGetArgs... secondarySources) {
            return secondarySources(List.of(secondarySources));
        }
        public Builder serviceRole(@Nullable Output<String> serviceRole) {
            this.serviceRole = serviceRole;
            return this;
        }
        public Builder serviceRole(@Nullable String serviceRole) {
            this.serviceRole = Codegen.ofNullable(serviceRole);
            return this;
        }
        public Builder source(@Nullable Output<ProjectSourceGetArgs> source) {
            this.source = source;
            return this;
        }
        public Builder source(@Nullable ProjectSourceGetArgs source) {
            this.source = Codegen.ofNullable(source);
            return this;
        }
        public Builder sourceVersion(@Nullable Output<String> sourceVersion) {
            this.sourceVersion = sourceVersion;
            return this;
        }
        public Builder sourceVersion(@Nullable String sourceVersion) {
            this.sourceVersion = Codegen.ofNullable(sourceVersion);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Codegen.ofNullable(tagsAll);
            return this;
        }
        public Builder vpcConfig(@Nullable Output<ProjectVpcConfigGetArgs> vpcConfig) {
            this.vpcConfig = vpcConfig;
            return this;
        }
        public Builder vpcConfig(@Nullable ProjectVpcConfigGetArgs vpcConfig) {
            this.vpcConfig = Codegen.ofNullable(vpcConfig);
            return this;
        }        public ProjectState build() {
            return new ProjectState(arn, artifacts, badgeEnabled, badgeUrl, buildBatchConfig, buildTimeout, cache, concurrentBuildLimit, description, encryptionKey, environment, fileSystemLocations, logsConfig, name, projectVisibility, publicProjectAlias, queuedTimeout, resourceAccessRole, secondaryArtifacts, secondarySourceVersions, secondarySources, serviceRole, source, sourceVersion, tags, tagsAll, vpcConfig);
        }
    }
}
