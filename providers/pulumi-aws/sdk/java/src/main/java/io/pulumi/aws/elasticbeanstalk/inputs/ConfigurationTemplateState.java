// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.elasticbeanstalk.inputs;

import io.pulumi.aws.elasticbeanstalk.inputs.ConfigurationTemplateSettingGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ConfigurationTemplateState extends io.pulumi.resources.ResourceArgs {

    public static final ConfigurationTemplateState Empty = new ConfigurationTemplateState();

    /**
     * name of the application to associate with this configuration template
     * 
     */
    @Import(name="application")
      private final @Nullable Output<String> application;

    public Output<String> getApplication() {
        return this.application == null ? Output.empty() : this.application;
    }

    /**
     * Short description of the Template
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The ID of the environment used with this configuration template
     * 
     */
    @Import(name="environmentId")
      private final @Nullable Output<String> environmentId;

    public Output<String> getEnvironmentId() {
        return this.environmentId == null ? Output.empty() : this.environmentId;
    }

    /**
     * A unique name for this Template.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Option settings to configure the new Environment. These
     * override specific values that are set as defaults. The format is detailed
     * below in Option Settings
     * 
     */
    @Import(name="settings")
      private final @Nullable Output<List<ConfigurationTemplateSettingGetArgs>> settings;

    public Output<List<ConfigurationTemplateSettingGetArgs>> getSettings() {
        return this.settings == null ? Output.empty() : this.settings;
    }

    /**
     * A solution stack to base your Template
     * off of. Example stacks can be found in the [Amazon API documentation](https://docs.aws.amazon.com/elasticbeanstalk/latest/dg/concepts.platforms.html)
     * 
     */
    @Import(name="solutionStackName")
      private final @Nullable Output<String> solutionStackName;

    public Output<String> getSolutionStackName() {
        return this.solutionStackName == null ? Output.empty() : this.solutionStackName;
    }

    public ConfigurationTemplateState(
        @Nullable Output<String> application,
        @Nullable Output<String> description,
        @Nullable Output<String> environmentId,
        @Nullable Output<String> name,
        @Nullable Output<List<ConfigurationTemplateSettingGetArgs>> settings,
        @Nullable Output<String> solutionStackName) {
        this.application = application;
        this.description = description;
        this.environmentId = environmentId;
        this.name = name;
        this.settings = settings;
        this.solutionStackName = solutionStackName;
    }

    private ConfigurationTemplateState() {
        this.application = Output.empty();
        this.description = Output.empty();
        this.environmentId = Output.empty();
        this.name = Output.empty();
        this.settings = Output.empty();
        this.solutionStackName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConfigurationTemplateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> application;
        private @Nullable Output<String> description;
        private @Nullable Output<String> environmentId;
        private @Nullable Output<String> name;
        private @Nullable Output<List<ConfigurationTemplateSettingGetArgs>> settings;
        private @Nullable Output<String> solutionStackName;

        public Builder() {
    	      // Empty
        }

        public Builder(ConfigurationTemplateState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.application = defaults.application;
    	      this.description = defaults.description;
    	      this.environmentId = defaults.environmentId;
    	      this.name = defaults.name;
    	      this.settings = defaults.settings;
    	      this.solutionStackName = defaults.solutionStackName;
        }

        public Builder application(@Nullable Output<String> application) {
            this.application = application;
            return this;
        }
        public Builder application(@Nullable String application) {
            this.application = Output.ofNullable(application);
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
        public Builder environmentId(@Nullable Output<String> environmentId) {
            this.environmentId = environmentId;
            return this;
        }
        public Builder environmentId(@Nullable String environmentId) {
            this.environmentId = Output.ofNullable(environmentId);
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
        public Builder settings(@Nullable Output<List<ConfigurationTemplateSettingGetArgs>> settings) {
            this.settings = settings;
            return this;
        }
        public Builder settings(@Nullable List<ConfigurationTemplateSettingGetArgs> settings) {
            this.settings = Output.ofNullable(settings);
            return this;
        }
        public Builder settings(ConfigurationTemplateSettingGetArgs... settings) {
            return settings(List.of(settings));
        }
        public Builder solutionStackName(@Nullable Output<String> solutionStackName) {
            this.solutionStackName = solutionStackName;
            return this;
        }
        public Builder solutionStackName(@Nullable String solutionStackName) {
            this.solutionStackName = Output.ofNullable(solutionStackName);
            return this;
        }        public ConfigurationTemplateState build() {
            return new ConfigurationTemplateState(application, description, environmentId, name, settings, solutionStackName);
        }
    }
}
