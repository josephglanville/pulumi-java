// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild;

import io.pulumi.aws.Utilities;
import io.pulumi.aws.codebuild.ProjectArgs;
import io.pulumi.aws.codebuild.inputs.ProjectState;
import io.pulumi.aws.codebuild.outputs.ProjectArtifacts;
import io.pulumi.aws.codebuild.outputs.ProjectBuildBatchConfig;
import io.pulumi.aws.codebuild.outputs.ProjectCache;
import io.pulumi.aws.codebuild.outputs.ProjectEnvironment;
import io.pulumi.aws.codebuild.outputs.ProjectFileSystemLocation;
import io.pulumi.aws.codebuild.outputs.ProjectLogsConfig;
import io.pulumi.aws.codebuild.outputs.ProjectSecondaryArtifact;
import io.pulumi.aws.codebuild.outputs.ProjectSecondarySource;
import io.pulumi.aws.codebuild.outputs.ProjectSecondarySourceVersion;
import io.pulumi.aws.codebuild.outputs.ProjectSource;
import io.pulumi.aws.codebuild.outputs.ProjectVpcConfig;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Provides a CodeBuild Project resource. See also the `aws.codebuild.Webhook` resource, which manages the webhook to the source (e.g., the "rebuild every time a code change is pushed" option in the CodeBuild web console).
 * 
 * ## Example Usage
 * 
 * ## Import
 * 
 * CodeBuild Project can be imported using the `name`, e.g.,
 * 
 * ```sh
 *  $ pulumi import aws:codebuild/project:Project name project-name
 * ```
 * 
 */
@ResourceType(type="aws:codebuild/project:Project")
public class Project extends io.pulumi.resources.CustomResource {
    /**
     * ARN of the CodeBuild project.
     * 
     */
    @Export(name="arn", type=String.class, parameters={})
    private Output<String> arn;

    /**
     * @return ARN of the CodeBuild project.
     * 
     */
    public Output<String> getArn() {
        return this.arn;
    }
    /**
     * Configuration block. Detailed below.
     * 
     */
    @Export(name="artifacts", type=ProjectArtifacts.class, parameters={})
    private Output<ProjectArtifacts> artifacts;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Output<ProjectArtifacts> getArtifacts() {
        return this.artifacts;
    }
    /**
     * Generates a publicly-accessible URL for the projects build badge. Available as `badge_url` attribute when enabled.
     * 
     */
    @Export(name="badgeEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> badgeEnabled;

    /**
     * @return Generates a publicly-accessible URL for the projects build badge. Available as `badge_url` attribute when enabled.
     * 
     */
    public Output</* @Nullable */ Boolean> getBadgeEnabled() {
        return this.badgeEnabled;
    }
    /**
     * URL of the build badge when `badge_enabled` is enabled.
     * 
     */
    @Export(name="badgeUrl", type=String.class, parameters={})
    private Output<String> badgeUrl;

    /**
     * @return URL of the build badge when `badge_enabled` is enabled.
     * 
     */
    public Output<String> getBadgeUrl() {
        return this.badgeUrl;
    }
    /**
     * Defines the batch build options for the project.
     * 
     */
    @Export(name="buildBatchConfig", type=ProjectBuildBatchConfig.class, parameters={})
    private Output</* @Nullable */ ProjectBuildBatchConfig> buildBatchConfig;

    /**
     * @return Defines the batch build options for the project.
     * 
     */
    public Output</* @Nullable */ ProjectBuildBatchConfig> getBuildBatchConfig() {
        return this.buildBatchConfig;
    }
    /**
     * Number of minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that does not get marked as completed. The default is 60 minutes.
     * 
     */
    @Export(name="buildTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> buildTimeout;

    /**
     * @return Number of minutes, from 5 to 480 (8 hours), for AWS CodeBuild to wait until timing out any related build that does not get marked as completed. The default is 60 minutes.
     * 
     */
    public Output</* @Nullable */ Integer> getBuildTimeout() {
        return this.buildTimeout;
    }
    /**
     * Configuration block. Detailed below.
     * 
     */
    @Export(name="cache", type=ProjectCache.class, parameters={})
    private Output</* @Nullable */ ProjectCache> cache;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Output</* @Nullable */ ProjectCache> getCache() {
        return this.cache;
    }
    /**
     * Specify a maximum number of concurrent builds for the project. The value specified must be greater than 0 and less than the account concurrent running builds limit.
     * 
     */
    @Export(name="concurrentBuildLimit", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> concurrentBuildLimit;

    /**
     * @return Specify a maximum number of concurrent builds for the project. The value specified must be greater than 0 and less than the account concurrent running builds limit.
     * 
     */
    public Output</* @Nullable */ Integer> getConcurrentBuildLimit() {
        return this.concurrentBuildLimit;
    }
    /**
     * Short description of the project.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Short description of the project.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build project's build output artifacts.
     * 
     */
    @Export(name="encryptionKey", type=String.class, parameters={})
    private Output<String> encryptionKey;

    /**
     * @return AWS Key Management Service (AWS KMS) customer master key (CMK) to be used for encrypting the build project's build output artifacts.
     * 
     */
    public Output<String> getEncryptionKey() {
        return this.encryptionKey;
    }
    /**
     * Configuration block. Detailed below.
     * 
     */
    @Export(name="environment", type=ProjectEnvironment.class, parameters={})
    private Output<ProjectEnvironment> environment;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Output<ProjectEnvironment> getEnvironment() {
        return this.environment;
    }
    /**
     * A set of file system locations to to mount inside the build. File system locations are documented below.
     * 
     */
    @Export(name="fileSystemLocations", type=List.class, parameters={ProjectFileSystemLocation.class})
    private Output</* @Nullable */ List<ProjectFileSystemLocation>> fileSystemLocations;

    /**
     * @return A set of file system locations to to mount inside the build. File system locations are documented below.
     * 
     */
    public Output</* @Nullable */ List<ProjectFileSystemLocation>> getFileSystemLocations() {
        return this.fileSystemLocations;
    }
    /**
     * Configuration block. Detailed below.
     * 
     */
    @Export(name="logsConfig", type=ProjectLogsConfig.class, parameters={})
    private Output</* @Nullable */ ProjectLogsConfig> logsConfig;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Output</* @Nullable */ ProjectLogsConfig> getLogsConfig() {
        return this.logsConfig;
    }
    /**
     * Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * Specifies the visibility of the project's builds. Possible values are: `PUBLIC_READ` and `PRIVATE`. Default value is `PRIVATE`.
     * 
     */
    @Export(name="projectVisibility", type=String.class, parameters={})
    private Output</* @Nullable */ String> projectVisibility;

    /**
     * @return Specifies the visibility of the project's builds. Possible values are: `PUBLIC_READ` and `PRIVATE`. Default value is `PRIVATE`.
     * 
     */
    public Output</* @Nullable */ String> getProjectVisibility() {
        return this.projectVisibility;
    }
    /**
     * The project identifier used with the public build APIs.
     * 
     */
    @Export(name="publicProjectAlias", type=String.class, parameters={})
    private Output<String> publicProjectAlias;

    /**
     * @return The project identifier used with the public build APIs.
     * 
     */
    public Output<String> getPublicProjectAlias() {
        return this.publicProjectAlias;
    }
    /**
     * Number of minutes, from 5 to 480 (8 hours), a build is allowed to be queued before it times out. The default is 8 hours.
     * 
     */
    @Export(name="queuedTimeout", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> queuedTimeout;

    /**
     * @return Number of minutes, from 5 to 480 (8 hours), a build is allowed to be queued before it times out. The default is 8 hours.
     * 
     */
    public Output</* @Nullable */ Integer> getQueuedTimeout() {
        return this.queuedTimeout;
    }
    /**
     * The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3 artifacts for the project's builds.
     * 
     */
    @Export(name="resourceAccessRole", type=String.class, parameters={})
    private Output</* @Nullable */ String> resourceAccessRole;

    /**
     * @return The ARN of the IAM role that enables CodeBuild to access the CloudWatch Logs and Amazon S3 artifacts for the project's builds.
     * 
     */
    public Output</* @Nullable */ String> getResourceAccessRole() {
        return this.resourceAccessRole;
    }
    /**
     * Configuration block. Detailed below.
     * 
     */
    @Export(name="secondaryArtifacts", type=List.class, parameters={ProjectSecondaryArtifact.class})
    private Output</* @Nullable */ List<ProjectSecondaryArtifact>> secondaryArtifacts;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Output</* @Nullable */ List<ProjectSecondaryArtifact>> getSecondaryArtifacts() {
        return this.secondaryArtifacts;
    }
    /**
     * Configuration block. Detailed below.
     * 
     */
    @Export(name="secondarySourceVersions", type=List.class, parameters={ProjectSecondarySourceVersion.class})
    private Output</* @Nullable */ List<ProjectSecondarySourceVersion>> secondarySourceVersions;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Output</* @Nullable */ List<ProjectSecondarySourceVersion>> getSecondarySourceVersions() {
        return this.secondarySourceVersions;
    }
    /**
     * Configuration block. Detailed below.
     * 
     */
    @Export(name="secondarySources", type=List.class, parameters={ProjectSecondarySource.class})
    private Output</* @Nullable */ List<ProjectSecondarySource>> secondarySources;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Output</* @Nullable */ List<ProjectSecondarySource>> getSecondarySources() {
        return this.secondarySources;
    }
    /**
     * Specifies the service role ARN for the batch build project.
     * 
     */
    @Export(name="serviceRole", type=String.class, parameters={})
    private Output<String> serviceRole;

    /**
     * @return Specifies the service role ARN for the batch build project.
     * 
     */
    public Output<String> getServiceRole() {
        return this.serviceRole;
    }
    /**
     * Configuration block. Detailed below.
     * 
     */
    @Export(name="source", type=ProjectSource.class, parameters={})
    private Output<ProjectSource> source;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Output<ProjectSource> getSource() {
        return this.source;
    }
    /**
     * The source version for the corresponding source identifier. See [AWS docs](https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ProjectSourceVersion.html#CodeBuild-Type-ProjectSourceVersion-sourceVersion) for more details.
     * 
     */
    @Export(name="sourceVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> sourceVersion;

    /**
     * @return The source version for the corresponding source identifier. See [AWS docs](https://docs.aws.amazon.com/codebuild/latest/APIReference/API_ProjectSourceVersion.html#CodeBuild-Type-ProjectSourceVersion-sourceVersion) for more details.
     * 
     */
    public Output</* @Nullable */ String> getSourceVersion() {
        return this.sourceVersion;
    }
    /**
     * Map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", type=Map.class, parameters={String.class, String.class})
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output</* @Nullable */ Map<String,String>> getTags() {
        return this.tags;
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll;
    }
    /**
     * Configuration block. Detailed below.
     * 
     */
    @Export(name="vpcConfig", type=ProjectVpcConfig.class, parameters={})
    private Output</* @Nullable */ ProjectVpcConfig> vpcConfig;

    /**
     * @return Configuration block. Detailed below.
     * 
     */
    public Output</* @Nullable */ ProjectVpcConfig> getVpcConfig() {
        return this.vpcConfig;
    }

    public interface BuilderApplicator {
        public void apply(ProjectArgs.Builder a);
    }
    private static io.pulumi.aws.codebuild.ProjectArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.aws.codebuild.ProjectArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Project(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Project(String name) {
        this(name, ProjectArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Project(String name, ProjectArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Project(String name, ProjectArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:codebuild/project:Project", name, args == null ? ProjectArgs.Empty : args, makeResourceOptions(options, Output.empty()));
    }

    private Project(String name, Output<String> id, @Nullable ProjectState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("aws:codebuild/project:Project", name, state, makeResourceOptions(options, id));
    }

    private static io.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return io.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Project get(String name, Output<String> id, @Nullable ProjectState state, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Project(name, id, state, options);
    }
}
