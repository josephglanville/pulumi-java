// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.backup.inputs;

import io.pulumi.aws.backup.inputs.PlanAdvancedBackupSettingGetArgs;
import io.pulumi.aws.backup.inputs.PlanRuleGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PlanState extends io.pulumi.resources.ResourceArgs {

    public static final PlanState Empty = new PlanState();

    /**
     * An object that specifies backup options for each resource type.
     * 
     */
    @Import(name="advancedBackupSettings")
      private final @Nullable Output<List<PlanAdvancedBackupSettingGetArgs>> advancedBackupSettings;

    public Output<List<PlanAdvancedBackupSettingGetArgs>> getAdvancedBackupSettings() {
        return this.advancedBackupSettings == null ? Output.empty() : this.advancedBackupSettings;
    }

    /**
     * The ARN of the backup plan.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * The display name of a backup plan.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A rule object that specifies a scheduled task that is used to back up a selection of resources.
     * 
     */
    @Import(name="rules")
      private final @Nullable Output<List<PlanRuleGetArgs>> rules;

    public Output<List<PlanRuleGetArgs>> getRules() {
        return this.rules == null ? Output.empty() : this.rules;
    }

    /**
     * Metadata that you can assign to help organize the plans you create. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * Unique, randomly generated, Unicode, UTF-8 encoded string that serves as the version ID of the backup plan.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<String> version;

    public Output<String> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public PlanState(
        @Nullable Output<List<PlanAdvancedBackupSettingGetArgs>> advancedBackupSettings,
        @Nullable Output<String> arn,
        @Nullable Output<String> name,
        @Nullable Output<List<PlanRuleGetArgs>> rules,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> version) {
        this.advancedBackupSettings = advancedBackupSettings;
        this.arn = arn;
        this.name = name;
        this.rules = rules;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.version = version;
    }

    private PlanState() {
        this.advancedBackupSettings = Output.empty();
        this.arn = Output.empty();
        this.name = Output.empty();
        this.rules = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PlanState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<PlanAdvancedBackupSettingGetArgs>> advancedBackupSettings;
        private @Nullable Output<String> arn;
        private @Nullable Output<String> name;
        private @Nullable Output<List<PlanRuleGetArgs>> rules;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(PlanState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advancedBackupSettings = defaults.advancedBackupSettings;
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
    	      this.rules = defaults.rules;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.version = defaults.version;
        }

        public Builder advancedBackupSettings(@Nullable Output<List<PlanAdvancedBackupSettingGetArgs>> advancedBackupSettings) {
            this.advancedBackupSettings = advancedBackupSettings;
            return this;
        }
        public Builder advancedBackupSettings(@Nullable List<PlanAdvancedBackupSettingGetArgs> advancedBackupSettings) {
            this.advancedBackupSettings = Output.ofNullable(advancedBackupSettings);
            return this;
        }
        public Builder advancedBackupSettings(PlanAdvancedBackupSettingGetArgs... advancedBackupSettings) {
            return advancedBackupSettings(List.of(advancedBackupSettings));
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
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
        public Builder rules(@Nullable Output<List<PlanRuleGetArgs>> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(@Nullable List<PlanRuleGetArgs> rules) {
            this.rules = Output.ofNullable(rules);
            return this;
        }
        public Builder rules(PlanRuleGetArgs... rules) {
            return rules(List.of(rules));
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
        public Builder version(@Nullable Output<String> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable String version) {
            this.version = Output.ofNullable(version);
            return this;
        }        public PlanState build() {
            return new PlanState(advancedBackupSettings, arn, name, rules, tags, tagsAll, version);
        }
    }
}