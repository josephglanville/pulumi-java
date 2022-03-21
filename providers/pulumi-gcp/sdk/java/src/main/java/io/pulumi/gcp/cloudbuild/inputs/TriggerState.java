// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.cloudbuild.inputs.TriggerBuildGetArgs;
import io.pulumi.gcp.cloudbuild.inputs.TriggerGithubGetArgs;
import io.pulumi.gcp.cloudbuild.inputs.TriggerPubsubConfigGetArgs;
import io.pulumi.gcp.cloudbuild.inputs.TriggerTriggerTemplateGetArgs;
import io.pulumi.gcp.cloudbuild.inputs.TriggerWebhookConfigGetArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerState extends io.pulumi.resources.ResourceArgs {

    public static final TriggerState Empty = new TriggerState();

    /**
     * Contents of the build template. Either a filename or build template must be provided.
     * Structure is documented below.
     * 
     */
    @Import(name="build")
      private final @Nullable Output<TriggerBuildGetArgs> build;

    public Output<TriggerBuildGetArgs> getBuild() {
        return this.build == null ? Output.empty() : this.build;
    }

    /**
     * Time when the trigger was created.
     * 
     */
    @Import(name="createTime")
      private final @Nullable Output<String> createTime;

    public Output<String> getCreateTime() {
        return this.createTime == null ? Output.empty() : this.createTime;
    }

    /**
     * Human-readable description of the trigger.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Whether the trigger is disabled or not. If true, the trigger will never result in a build.
     * 
     */
    @Import(name="disabled")
      private final @Nullable Output<Boolean> disabled;

    public Output<Boolean> getDisabled() {
        return this.disabled == null ? Output.empty() : this.disabled;
    }

    /**
     * Path, from the source root, to a file whose contents is used for the template. Either a filename or build template must be provided.
     * 
     */
    @Import(name="filename")
      private final @Nullable Output<String> filename;

    public Output<String> getFilename() {
        return this.filename == null ? Output.empty() : this.filename;
    }

    /**
     * Describes the configuration of a trigger that creates a build whenever a GitHub event is received.
     * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
     * Structure is documented below.
     * 
     */
    @Import(name="github")
      private final @Nullable Output<TriggerGithubGetArgs> github;

    public Output<TriggerGithubGetArgs> getGithub() {
        return this.github == null ? Output.empty() : this.github;
    }

    /**
     * ignoredFiles and includedFiles are file glob matches using https://golang.org/pkg/path/filepath/#Match
     * extended with support for `**`.
     * If ignoredFiles and changed files are both empty, then they are not
     * used to determine whether or not to trigger a build.
     * If ignoredFiles is not empty, then we ignore any files that match any
     * of the ignored_file globs. If the change has no files that are outside
     * of the ignoredFiles globs, then we do not trigger a build.
     * 
     */
    @Import(name="ignoredFiles")
      private final @Nullable Output<List<String>> ignoredFiles;

    public Output<List<String>> getIgnoredFiles() {
        return this.ignoredFiles == null ? Output.empty() : this.ignoredFiles;
    }

    /**
     * ignoredFiles and includedFiles are file glob matches using https://golang.org/pkg/path/filepath/#Match
     * extended with support for `**`.
     * If any of the files altered in the commit pass the ignoredFiles filter
     * and includedFiles is empty, then as far as this filter is concerned, we
     * should trigger the build.
     * If any of the files altered in the commit pass the ignoredFiles filter
     * and includedFiles is not empty, then we make sure that at least one of
     * those files matches a includedFiles glob. If not, then we do not trigger
     * a build.
     * 
     */
    @Import(name="includedFiles")
      private final @Nullable Output<List<String>> includedFiles;

    public Output<List<String>> getIncludedFiles() {
        return this.includedFiles == null ? Output.empty() : this.includedFiles;
    }

    /**
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for Docker volumes.
     * Each named volume must be used by at least two build steps.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * PubsubConfig describes the configuration of a trigger that creates
     * a build whenever a Pub/Sub message is published.
     * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
     * Structure is documented below.
     * 
     */
    @Import(name="pubsubConfig")
      private final @Nullable Output<TriggerPubsubConfigGetArgs> pubsubConfig;

    public Output<TriggerPubsubConfigGetArgs> getPubsubConfig() {
        return this.pubsubConfig == null ? Output.empty() : this.pubsubConfig;
    }

    /**
     * The service account used for all user-controlled operations including
     * triggers.patch, triggers.run, builds.create, and builds.cancel.
     * If no service account is set, then the standard Cloud Build service account
     * ([PROJECT_NUM]@system.gserviceaccount.com) will be used instead.
     * Format: projects/{PROJECT_ID}/serviceAccounts/{ACCOUNT_ID_OR_EMAIL}
     * 
     */
    @Import(name="serviceAccount")
      private final @Nullable Output<String> serviceAccount;

    public Output<String> getServiceAccount() {
        return this.serviceAccount == null ? Output.empty() : this.serviceAccount;
    }

    /**
     * Substitutions to use in a triggered build. Should only be used with triggers.run
     * 
     */
    @Import(name="substitutions")
      private final @Nullable Output<Map<String,String>> substitutions;

    public Output<Map<String,String>> getSubstitutions() {
        return this.substitutions == null ? Output.empty() : this.substitutions;
    }

    /**
     * Tags for annotation of a Build. These are not docker tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<String>> tags;

    public Output<List<String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The unique identifier for the trigger.
     * 
     */
    @Import(name="triggerId")
      private final @Nullable Output<String> triggerId;

    public Output<String> getTriggerId() {
        return this.triggerId == null ? Output.empty() : this.triggerId;
    }

    /**
     * Template describing the types of source changes to trigger a build.
     * Branch and tag names in trigger templates are interpreted as regular
     * expressions. Any branch or tag change that matches that regular
     * expression will trigger a build.
     * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
     * Structure is documented below.
     * 
     */
    @Import(name="triggerTemplate")
      private final @Nullable Output<TriggerTriggerTemplateGetArgs> triggerTemplate;

    public Output<TriggerTriggerTemplateGetArgs> getTriggerTemplate() {
        return this.triggerTemplate == null ? Output.empty() : this.triggerTemplate;
    }

    /**
     * WebhookConfig describes the configuration of a trigger that creates
     * a build whenever a webhook is sent to a trigger's webhook URL.
     * One of `trigger_template`, `github`, `pubsub_config` or `webhook_config` must be provided.
     * Structure is documented below.
     * 
     */
    @Import(name="webhookConfig")
      private final @Nullable Output<TriggerWebhookConfigGetArgs> webhookConfig;

    public Output<TriggerWebhookConfigGetArgs> getWebhookConfig() {
        return this.webhookConfig == null ? Output.empty() : this.webhookConfig;
    }

    public TriggerState(
        @Nullable Output<TriggerBuildGetArgs> build,
        @Nullable Output<String> createTime,
        @Nullable Output<String> description,
        @Nullable Output<Boolean> disabled,
        @Nullable Output<String> filename,
        @Nullable Output<TriggerGithubGetArgs> github,
        @Nullable Output<List<String>> ignoredFiles,
        @Nullable Output<List<String>> includedFiles,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<TriggerPubsubConfigGetArgs> pubsubConfig,
        @Nullable Output<String> serviceAccount,
        @Nullable Output<Map<String,String>> substitutions,
        @Nullable Output<List<String>> tags,
        @Nullable Output<String> triggerId,
        @Nullable Output<TriggerTriggerTemplateGetArgs> triggerTemplate,
        @Nullable Output<TriggerWebhookConfigGetArgs> webhookConfig) {
        this.build = build;
        this.createTime = createTime;
        this.description = description;
        this.disabled = disabled;
        this.filename = filename;
        this.github = github;
        this.ignoredFiles = ignoredFiles;
        this.includedFiles = includedFiles;
        this.name = name;
        this.project = project;
        this.pubsubConfig = pubsubConfig;
        this.serviceAccount = serviceAccount;
        this.substitutions = substitutions;
        this.tags = tags;
        this.triggerId = triggerId;
        this.triggerTemplate = triggerTemplate;
        this.webhookConfig = webhookConfig;
    }

    private TriggerState() {
        this.build = Output.empty();
        this.createTime = Output.empty();
        this.description = Output.empty();
        this.disabled = Output.empty();
        this.filename = Output.empty();
        this.github = Output.empty();
        this.ignoredFiles = Output.empty();
        this.includedFiles = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.pubsubConfig = Output.empty();
        this.serviceAccount = Output.empty();
        this.substitutions = Output.empty();
        this.tags = Output.empty();
        this.triggerId = Output.empty();
        this.triggerTemplate = Output.empty();
        this.webhookConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TriggerBuildGetArgs> build;
        private @Nullable Output<String> createTime;
        private @Nullable Output<String> description;
        private @Nullable Output<Boolean> disabled;
        private @Nullable Output<String> filename;
        private @Nullable Output<TriggerGithubGetArgs> github;
        private @Nullable Output<List<String>> ignoredFiles;
        private @Nullable Output<List<String>> includedFiles;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<TriggerPubsubConfigGetArgs> pubsubConfig;
        private @Nullable Output<String> serviceAccount;
        private @Nullable Output<Map<String,String>> substitutions;
        private @Nullable Output<List<String>> tags;
        private @Nullable Output<String> triggerId;
        private @Nullable Output<TriggerTriggerTemplateGetArgs> triggerTemplate;
        private @Nullable Output<TriggerWebhookConfigGetArgs> webhookConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.build = defaults.build;
    	      this.createTime = defaults.createTime;
    	      this.description = defaults.description;
    	      this.disabled = defaults.disabled;
    	      this.filename = defaults.filename;
    	      this.github = defaults.github;
    	      this.ignoredFiles = defaults.ignoredFiles;
    	      this.includedFiles = defaults.includedFiles;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.pubsubConfig = defaults.pubsubConfig;
    	      this.serviceAccount = defaults.serviceAccount;
    	      this.substitutions = defaults.substitutions;
    	      this.tags = defaults.tags;
    	      this.triggerId = defaults.triggerId;
    	      this.triggerTemplate = defaults.triggerTemplate;
    	      this.webhookConfig = defaults.webhookConfig;
        }

        public Builder build(@Nullable Output<TriggerBuildGetArgs> build) {
            this.build = build;
            return this;
        }
        public Builder build(@Nullable TriggerBuildGetArgs build) {
            this.build = Output.ofNullable(build);
            return this;
        }
        public Builder createTime(@Nullable Output<String> createTime) {
            this.createTime = createTime;
            return this;
        }
        public Builder createTime(@Nullable String createTime) {
            this.createTime = Output.ofNullable(createTime);
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
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            this.disabled = disabled;
            return this;
        }
        public Builder disabled(@Nullable Boolean disabled) {
            this.disabled = Output.ofNullable(disabled);
            return this;
        }
        public Builder filename(@Nullable Output<String> filename) {
            this.filename = filename;
            return this;
        }
        public Builder filename(@Nullable String filename) {
            this.filename = Output.ofNullable(filename);
            return this;
        }
        public Builder github(@Nullable Output<TriggerGithubGetArgs> github) {
            this.github = github;
            return this;
        }
        public Builder github(@Nullable TriggerGithubGetArgs github) {
            this.github = Output.ofNullable(github);
            return this;
        }
        public Builder ignoredFiles(@Nullable Output<List<String>> ignoredFiles) {
            this.ignoredFiles = ignoredFiles;
            return this;
        }
        public Builder ignoredFiles(@Nullable List<String> ignoredFiles) {
            this.ignoredFiles = Output.ofNullable(ignoredFiles);
            return this;
        }
        public Builder ignoredFiles(String... ignoredFiles) {
            return ignoredFiles(List.of(ignoredFiles));
        }
        public Builder includedFiles(@Nullable Output<List<String>> includedFiles) {
            this.includedFiles = includedFiles;
            return this;
        }
        public Builder includedFiles(@Nullable List<String> includedFiles) {
            this.includedFiles = Output.ofNullable(includedFiles);
            return this;
        }
        public Builder includedFiles(String... includedFiles) {
            return includedFiles(List.of(includedFiles));
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
        public Builder pubsubConfig(@Nullable Output<TriggerPubsubConfigGetArgs> pubsubConfig) {
            this.pubsubConfig = pubsubConfig;
            return this;
        }
        public Builder pubsubConfig(@Nullable TriggerPubsubConfigGetArgs pubsubConfig) {
            this.pubsubConfig = Output.ofNullable(pubsubConfig);
            return this;
        }
        public Builder serviceAccount(@Nullable Output<String> serviceAccount) {
            this.serviceAccount = serviceAccount;
            return this;
        }
        public Builder serviceAccount(@Nullable String serviceAccount) {
            this.serviceAccount = Output.ofNullable(serviceAccount);
            return this;
        }
        public Builder substitutions(@Nullable Output<Map<String,String>> substitutions) {
            this.substitutions = substitutions;
            return this;
        }
        public Builder substitutions(@Nullable Map<String,String> substitutions) {
            this.substitutions = Output.ofNullable(substitutions);
            return this;
        }
        public Builder tags(@Nullable Output<List<String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }
        public Builder triggerId(@Nullable Output<String> triggerId) {
            this.triggerId = triggerId;
            return this;
        }
        public Builder triggerId(@Nullable String triggerId) {
            this.triggerId = Output.ofNullable(triggerId);
            return this;
        }
        public Builder triggerTemplate(@Nullable Output<TriggerTriggerTemplateGetArgs> triggerTemplate) {
            this.triggerTemplate = triggerTemplate;
            return this;
        }
        public Builder triggerTemplate(@Nullable TriggerTriggerTemplateGetArgs triggerTemplate) {
            this.triggerTemplate = Output.ofNullable(triggerTemplate);
            return this;
        }
        public Builder webhookConfig(@Nullable Output<TriggerWebhookConfigGetArgs> webhookConfig) {
            this.webhookConfig = webhookConfig;
            return this;
        }
        public Builder webhookConfig(@Nullable TriggerWebhookConfigGetArgs webhookConfig) {
            this.webhookConfig = Output.ofNullable(webhookConfig);
            return this;
        }        public TriggerState build() {
            return new TriggerState(build, createTime, description, disabled, filename, github, ignoredFiles, includedFiles, name, project, pubsubConfig, serviceAccount, substitutions, tags, triggerId, triggerTemplate, webhookConfig);
        }
    }
}
