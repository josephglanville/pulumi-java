// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudbuild_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.Utilities;
import io.pulumi.googlenative.cloudbuild_v1.TriggerArgs;
import io.pulumi.googlenative.cloudbuild_v1.outputs.ApprovalConfigResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.BitbucketServerTriggerConfigResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.BuildResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.GitFileSourceResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.GitHubEventsConfigResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.GitRepoSourceResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.PubsubConfigResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.RepoSourceResponse;
import io.pulumi.googlenative.cloudbuild_v1.outputs.WebhookConfigResponse;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import javax.annotation.Nullable;

/**
 * Creates a new `BuildTrigger`. This API is experimental.
 * 
 */
@ResourceType(type="google-native:cloudbuild/v1:Trigger")
public class Trigger extends io.pulumi.resources.CustomResource {
    /**
     * Configuration for manual approval to start a build invocation of this BuildTrigger.
     * 
     */
    @Export(name="approvalConfig", type=ApprovalConfigResponse.class, parameters={})
    private Output<ApprovalConfigResponse> approvalConfig;

    /**
     * @return Configuration for manual approval to start a build invocation of this BuildTrigger.
     * 
     */
    public Output<ApprovalConfigResponse> getApprovalConfig() {
        return this.approvalConfig;
    }
    /**
     * Autodetect build configuration. The following precedence is used (case insensitive): 1. cloudbuild.yaml 2. cloudbuild.yml 3. cloudbuild.json 4. Dockerfile Currently only available for GitHub App Triggers.
     * 
     */
    @Export(name="autodetect", type=Boolean.class, parameters={})
    private Output<Boolean> autodetect;

    /**
     * @return Autodetect build configuration. The following precedence is used (case insensitive): 1. cloudbuild.yaml 2. cloudbuild.yml 3. cloudbuild.json 4. Dockerfile Currently only available for GitHub App Triggers.
     * 
     */
    public Output<Boolean> getAutodetect() {
        return this.autodetect;
    }
    /**
     * BitbucketServerTriggerConfig describes the configuration of a trigger that creates a build whenever a Bitbucket Server event is received.
     * 
     */
    @Export(name="bitbucketServerTriggerConfig", type=BitbucketServerTriggerConfigResponse.class, parameters={})
    private Output<BitbucketServerTriggerConfigResponse> bitbucketServerTriggerConfig;

    /**
     * @return BitbucketServerTriggerConfig describes the configuration of a trigger that creates a build whenever a Bitbucket Server event is received.
     * 
     */
    public Output<BitbucketServerTriggerConfigResponse> getBitbucketServerTriggerConfig() {
        return this.bitbucketServerTriggerConfig;
    }
    /**
     * Contents of the build template.
     * 
     */
    @Export(name="build", type=BuildResponse.class, parameters={})
    private Output<BuildResponse> build;

    /**
     * @return Contents of the build template.
     * 
     */
    public Output<BuildResponse> getBuild() {
        return this.build;
    }
    /**
     * Time when the trigger was created.
     * 
     */
    @Export(name="createTime", type=String.class, parameters={})
    private Output<String> createTime;

    /**
     * @return Time when the trigger was created.
     * 
     */
    public Output<String> getCreateTime() {
        return this.createTime;
    }
    /**
     * Human-readable description of this trigger.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output<String> description;

    /**
     * @return Human-readable description of this trigger.
     * 
     */
    public Output<String> getDescription() {
        return this.description;
    }
    /**
     * If true, the trigger will never automatically execute a build.
     * 
     */
    @Export(name="disabled", type=Boolean.class, parameters={})
    private Output<Boolean> disabled;

    /**
     * @return If true, the trigger will never automatically execute a build.
     * 
     */
    public Output<Boolean> getDisabled() {
        return this.disabled;
    }
    /**
     * EventType allows the user to explicitly set the type of event to which this BuildTrigger should respond. This field will be validated against the rest of the configuration if it is set.
     * 
     */
    @Export(name="eventType", type=String.class, parameters={})
    private Output<String> eventType;

    /**
     * @return EventType allows the user to explicitly set the type of event to which this BuildTrigger should respond. This field will be validated against the rest of the configuration if it is set.
     * 
     */
    public Output<String> getEventType() {
        return this.eventType;
    }
    /**
     * Path, from the source root, to the build configuration file (i.e. cloudbuild.yaml).
     * 
     */
    @Export(name="filename", type=String.class, parameters={})
    private Output<String> filename;

    /**
     * @return Path, from the source root, to the build configuration file (i.e. cloudbuild.yaml).
     * 
     */
    public Output<String> getFilename() {
        return this.filename;
    }
    /**
     * A Common Expression Language string.
     * 
     */
    @Export(name="filter", type=String.class, parameters={})
    private Output<String> filter;

    /**
     * @return A Common Expression Language string.
     * 
     */
    public Output<String> getFilter() {
        return this.filter;
    }
    /**
     * The file source describing the local or remote Build template.
     * 
     */
    @Export(name="gitFileSource", type=GitFileSourceResponse.class, parameters={})
    private Output<GitFileSourceResponse> gitFileSource;

    /**
     * @return The file source describing the local or remote Build template.
     * 
     */
    public Output<GitFileSourceResponse> getGitFileSource() {
        return this.gitFileSource;
    }
    /**
     * GitHubEventsConfig describes the configuration of a trigger that creates a build whenever a GitHub event is received. Mutually exclusive with `trigger_template`.
     * 
     */
    @Export(name="github", type=GitHubEventsConfigResponse.class, parameters={})
    private Output<GitHubEventsConfigResponse> github;

    /**
     * @return GitHubEventsConfig describes the configuration of a trigger that creates a build whenever a GitHub event is received. Mutually exclusive with `trigger_template`.
     * 
     */
    public Output<GitHubEventsConfigResponse> getGithub() {
        return this.github;
    }
    /**
     * ignored_files and included_files are file glob matches using https://golang.org/pkg/path/filepath/#Match extended with support for "**". If ignored_files and changed files are both empty, then they are not used to determine whether or not to trigger a build. If ignored_files is not empty, then we ignore any files that match any of the ignored_file globs. If the change has no files that are outside of the ignored_files globs, then we do not trigger a build.
     * 
     */
    @Export(name="ignoredFiles", type=List.class, parameters={String.class})
    private Output<List<String>> ignoredFiles;

    /**
     * @return ignored_files and included_files are file glob matches using https://golang.org/pkg/path/filepath/#Match extended with support for "**". If ignored_files and changed files are both empty, then they are not used to determine whether or not to trigger a build. If ignored_files is not empty, then we ignore any files that match any of the ignored_file globs. If the change has no files that are outside of the ignored_files globs, then we do not trigger a build.
     * 
     */
    public Output<List<String>> getIgnoredFiles() {
        return this.ignoredFiles;
    }
    /**
     * If any of the files altered in the commit pass the ignored_files filter and included_files is empty, then as far as this filter is concerned, we should trigger the build. If any of the files altered in the commit pass the ignored_files filter and included_files is not empty, then we make sure that at least one of those files matches a included_files glob. If not, then we do not trigger a build.
     * 
     */
    @Export(name="includedFiles", type=List.class, parameters={String.class})
    private Output<List<String>> includedFiles;

    /**
     * @return If any of the files altered in the commit pass the ignored_files filter and included_files is empty, then as far as this filter is concerned, we should trigger the build. If any of the files altered in the commit pass the ignored_files filter and included_files is not empty, then we make sure that at least one of those files matches a included_files glob. If not, then we do not trigger a build.
     * 
     */
    public Output<List<String>> getIncludedFiles() {
        return this.includedFiles;
    }
    /**
     * User-assigned name of the trigger. Must be unique within the project. Trigger names must meet the following requirements: + They must contain only alphanumeric characters and dashes. + They can be 1-64 characters long. + They must begin and end with an alphanumeric character.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return User-assigned name of the trigger. Must be unique within the project. Trigger names must meet the following requirements: + They must contain only alphanumeric characters and dashes. + They can be 1-64 characters long. + They must begin and end with an alphanumeric character.
     * 
     */
    public Output<String> getName() {
        return this.name;
    }
    /**
     * PubsubConfig describes the configuration of a trigger that creates a build whenever a Pub/Sub message is published.
     * 
     */
    @Export(name="pubsubConfig", type=PubsubConfigResponse.class, parameters={})
    private Output<PubsubConfigResponse> pubsubConfig;

    /**
     * @return PubsubConfig describes the configuration of a trigger that creates a build whenever a Pub/Sub message is published.
     * 
     */
    public Output<PubsubConfigResponse> getPubsubConfig() {
        return this.pubsubConfig;
    }
    /**
     * The `Trigger` name with format: `projects/{project}/locations/{location}/triggers/{trigger}`, where {trigger} is a unique identifier generated by the service.
     * 
     */
    @Export(name="resourceName", type=String.class, parameters={})
    private Output<String> resourceName;

    /**
     * @return The `Trigger` name with format: `projects/{project}/locations/{location}/triggers/{trigger}`, where {trigger} is a unique identifier generated by the service.
     * 
     */
    public Output<String> getPropResourceName() {
        return this.resourceName;
    }
    /**
     * The service account used for all user-controlled operations including UpdateBuildTrigger, RunBuildTrigger, CreateBuild, and CancelBuild. If no service account is set, then the standard Cloud Build service account ([PROJECT_NUM]@system.gserviceaccount.com) will be used instead. Format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_ID_OR_EMAIL}`
     * 
     */
    @Export(name="serviceAccount", type=String.class, parameters={})
    private Output<String> serviceAccount;

    /**
     * @return The service account used for all user-controlled operations including UpdateBuildTrigger, RunBuildTrigger, CreateBuild, and CancelBuild. If no service account is set, then the standard Cloud Build service account ([PROJECT_NUM]@system.gserviceaccount.com) will be used instead. Format: `projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_ID_OR_EMAIL}`
     * 
     */
    public Output<String> getServiceAccount() {
        return this.serviceAccount;
    }
    /**
     * The repo and ref of the repository from which to build. This field is used only for those triggers that do not respond to SCM events. Triggers that respond to such events build source at whatever commit caused the event. This field is currently only used by Webhook, Pub/Sub, Manual, and Cron triggers.
     * 
     */
    @Export(name="sourceToBuild", type=GitRepoSourceResponse.class, parameters={})
    private Output<GitRepoSourceResponse> sourceToBuild;

    /**
     * @return The repo and ref of the repository from which to build. This field is used only for those triggers that do not respond to SCM events. Triggers that respond to such events build source at whatever commit caused the event. This field is currently only used by Webhook, Pub/Sub, Manual, and Cron triggers.
     * 
     */
    public Output<GitRepoSourceResponse> getSourceToBuild() {
        return this.sourceToBuild;
    }
    /**
     * Substitutions for Build resource. The keys must match the following regular expression: `^_[A-Z0-9_]+$`.
     * 
     */
    @Export(name="substitutions", type=Map.class, parameters={String.class, String.class})
    private Output<Map<String,String>> substitutions;

    /**
     * @return Substitutions for Build resource. The keys must match the following regular expression: `^_[A-Z0-9_]+$`.
     * 
     */
    public Output<Map<String,String>> getSubstitutions() {
        return this.substitutions;
    }
    /**
     * Tags for annotation of a `BuildTrigger`
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output<List<String>> tags;

    /**
     * @return Tags for annotation of a `BuildTrigger`
     * 
     */
    public Output<List<String>> getTags() {
        return this.tags;
    }
    /**
     * Template describing the types of source changes to trigger a build. Branch and tag names in trigger templates are interpreted as regular expressions. Any branch or tag change that matches that regular expression will trigger a build. Mutually exclusive with `github`.
     * 
     */
    @Export(name="triggerTemplate", type=RepoSourceResponse.class, parameters={})
    private Output<RepoSourceResponse> triggerTemplate;

    /**
     * @return Template describing the types of source changes to trigger a build. Branch and tag names in trigger templates are interpreted as regular expressions. Any branch or tag change that matches that regular expression will trigger a build. Mutually exclusive with `github`.
     * 
     */
    public Output<RepoSourceResponse> getTriggerTemplate() {
        return this.triggerTemplate;
    }
    /**
     * WebhookConfig describes the configuration of a trigger that creates a build whenever a webhook is sent to a trigger's webhook URL.
     * 
     */
    @Export(name="webhookConfig", type=WebhookConfigResponse.class, parameters={})
    private Output<WebhookConfigResponse> webhookConfig;

    /**
     * @return WebhookConfig describes the configuration of a trigger that creates a build whenever a webhook is sent to a trigger's webhook URL.
     * 
     */
    public Output<WebhookConfigResponse> getWebhookConfig() {
        return this.webhookConfig;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Trigger(String name) {
        this(name, TriggerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Trigger(String name, TriggerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Trigger(String name, TriggerArgs args, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudbuild/v1:Trigger", name, args == null ? TriggerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Trigger(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        super("google-native:cloudbuild/v1:Trigger", name, null, makeResourceOptions(options, id));
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
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static Trigger get(String name, Output<String> id, @Nullable io.pulumi.resources.CustomResourceOptions options) {
        return new Trigger(name, id, options);
    }
}
