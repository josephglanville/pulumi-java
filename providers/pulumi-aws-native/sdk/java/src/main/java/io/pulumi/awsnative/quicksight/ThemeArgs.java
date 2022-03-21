// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight;

import io.pulumi.awsnative.quicksight.inputs.ThemeConfigurationArgs;
import io.pulumi.awsnative.quicksight.inputs.ThemeResourcePermissionArgs;
import io.pulumi.awsnative.quicksight.inputs.ThemeTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ThemeArgs extends io.pulumi.resources.ResourceArgs {

    public static final ThemeArgs Empty = new ThemeArgs();

    @Import(name="awsAccountId", required=true)
      private final Output<String> awsAccountId;

    public Output<String> getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>The ID of the theme that a custom theme will inherit from. All themes inherit from one of
     * 			the starting themes defined by Amazon QuickSight. For a list of the starting themes, use
     * 				<code>ListThemes</code> or choose <b>Themes</b> from
     * 			within a QuickSight analysis. </p>
     * 
     */
    @Import(name="baseThemeId")
      private final @Nullable Output<String> baseThemeId;

    public Output<String> getBaseThemeId() {
        return this.baseThemeId == null ? Output.empty() : this.baseThemeId;
    }

    @Import(name="configuration")
      private final @Nullable Output<ThemeConfigurationArgs> configuration;

    public Output<ThemeConfigurationArgs> getConfiguration() {
        return this.configuration == null ? Output.empty() : this.configuration;
    }

    /**
     * <p>A display name for the theme.</p>
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * <p>A valid grouping of resource permissions to apply to the new theme.
     * 			</p>
     * 
     */
    @Import(name="permissions")
      private final @Nullable Output<List<ThemeResourcePermissionArgs>> permissions;

    public Output<List<ThemeResourcePermissionArgs>> getPermissions() {
        return this.permissions == null ? Output.empty() : this.permissions;
    }

    /**
     * <p>A map of the key-value pairs for the resource tag or tags that you want to add to the
     * 			resource.</p>
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<List<ThemeTagArgs>> tags;

    public Output<List<ThemeTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    @Import(name="themeId", required=true)
      private final Output<String> themeId;

    public Output<String> getThemeId() {
        return this.themeId;
    }

    /**
     * <p>A description of the first version of the theme that you're creating. Every time
     * 				<code>UpdateTheme</code> is called, a new version is created. Each version of the
     * 			theme has a description of the version in the <code>VersionDescription</code>
     * 			field.</p>
     * 
     */
    @Import(name="versionDescription")
      private final @Nullable Output<String> versionDescription;

    public Output<String> getVersionDescription() {
        return this.versionDescription == null ? Output.empty() : this.versionDescription;
    }

    public ThemeArgs(
        Output<String> awsAccountId,
        @Nullable Output<String> baseThemeId,
        @Nullable Output<ThemeConfigurationArgs> configuration,
        @Nullable Output<String> name,
        @Nullable Output<List<ThemeResourcePermissionArgs>> permissions,
        @Nullable Output<List<ThemeTagArgs>> tags,
        Output<String> themeId,
        @Nullable Output<String> versionDescription) {
        this.awsAccountId = Objects.requireNonNull(awsAccountId, "expected parameter 'awsAccountId' to be non-null");
        this.baseThemeId = baseThemeId;
        this.configuration = configuration;
        this.name = name;
        this.permissions = permissions;
        this.tags = tags;
        this.themeId = Objects.requireNonNull(themeId, "expected parameter 'themeId' to be non-null");
        this.versionDescription = versionDescription;
    }

    private ThemeArgs() {
        this.awsAccountId = Output.empty();
        this.baseThemeId = Output.empty();
        this.configuration = Output.empty();
        this.name = Output.empty();
        this.permissions = Output.empty();
        this.tags = Output.empty();
        this.themeId = Output.empty();
        this.versionDescription = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ThemeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> awsAccountId;
        private @Nullable Output<String> baseThemeId;
        private @Nullable Output<ThemeConfigurationArgs> configuration;
        private @Nullable Output<String> name;
        private @Nullable Output<List<ThemeResourcePermissionArgs>> permissions;
        private @Nullable Output<List<ThemeTagArgs>> tags;
        private Output<String> themeId;
        private @Nullable Output<String> versionDescription;

        public Builder() {
    	      // Empty
        }

        public Builder(ThemeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.baseThemeId = defaults.baseThemeId;
    	      this.configuration = defaults.configuration;
    	      this.name = defaults.name;
    	      this.permissions = defaults.permissions;
    	      this.tags = defaults.tags;
    	      this.themeId = defaults.themeId;
    	      this.versionDescription = defaults.versionDescription;
        }

        public Builder awsAccountId(Output<String> awsAccountId) {
            this.awsAccountId = Objects.requireNonNull(awsAccountId);
            return this;
        }
        public Builder awsAccountId(String awsAccountId) {
            this.awsAccountId = Output.of(Objects.requireNonNull(awsAccountId));
            return this;
        }
        public Builder baseThemeId(@Nullable Output<String> baseThemeId) {
            this.baseThemeId = baseThemeId;
            return this;
        }
        public Builder baseThemeId(@Nullable String baseThemeId) {
            this.baseThemeId = Output.ofNullable(baseThemeId);
            return this;
        }
        public Builder configuration(@Nullable Output<ThemeConfigurationArgs> configuration) {
            this.configuration = configuration;
            return this;
        }
        public Builder configuration(@Nullable ThemeConfigurationArgs configuration) {
            this.configuration = Output.ofNullable(configuration);
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
        public Builder permissions(@Nullable Output<List<ThemeResourcePermissionArgs>> permissions) {
            this.permissions = permissions;
            return this;
        }
        public Builder permissions(@Nullable List<ThemeResourcePermissionArgs> permissions) {
            this.permissions = Output.ofNullable(permissions);
            return this;
        }
        public Builder permissions(ThemeResourcePermissionArgs... permissions) {
            return permissions(List.of(permissions));
        }
        public Builder tags(@Nullable Output<List<ThemeTagArgs>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable List<ThemeTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tags(ThemeTagArgs... tags) {
            return tags(List.of(tags));
        }
        public Builder themeId(Output<String> themeId) {
            this.themeId = Objects.requireNonNull(themeId);
            return this;
        }
        public Builder themeId(String themeId) {
            this.themeId = Output.of(Objects.requireNonNull(themeId));
            return this;
        }
        public Builder versionDescription(@Nullable Output<String> versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }
        public Builder versionDescription(@Nullable String versionDescription) {
            this.versionDescription = Output.ofNullable(versionDescription);
            return this;
        }        public ThemeArgs build() {
            return new ThemeArgs(awsAccountId, baseThemeId, configuration, name, permissions, tags, themeId, versionDescription);
        }
    }
}
