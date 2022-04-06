// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appstream;

import io.pulumi.aws.appstream.inputs.StackAccessEndpointArgs;
import io.pulumi.aws.appstream.inputs.StackApplicationSettingsArgs;
import io.pulumi.aws.appstream.inputs.StackStorageConnectorArgs;
import io.pulumi.aws.appstream.inputs.StackUserSettingArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class StackArgs extends io.pulumi.resources.ResourceArgs {

    public static final StackArgs Empty = new StackArgs();

    @Import(name="accessEndpoints")
      private final @Nullable Output<List<StackAccessEndpointArgs>> accessEndpoints;

    public Output<List<StackAccessEndpointArgs>> getAccessEndpoints() {
        return this.accessEndpoints == null ? Output.empty() : this.accessEndpoints;
    }

    /**
     * Settings for application settings persistence.
     * 
     */
    @Import(name="applicationSettings")
      private final @Nullable Output<StackApplicationSettingsArgs> applicationSettings;

    public Output<StackApplicationSettingsArgs> getApplicationSettings() {
        return this.applicationSettings == null ? Output.empty() : this.applicationSettings;
    }

    /**
     * Description for the AppStream stack.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Stack name to display.
     * 
     */
    @Import(name="displayName")
      private final @Nullable Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName == null ? Output.empty() : this.displayName;
    }

    /**
     * Domains where AppStream 2.0 streaming sessions can be embedded in an iframe. You must approve the domains that you want to host embedded AppStream 2.0 streaming sessions.
     * 
     */
    @Import(name="embedHostDomains")
      private final @Nullable Output<List<String>> embedHostDomains;

    public Output<List<String>> getEmbedHostDomains() {
        return this.embedHostDomains == null ? Output.empty() : this.embedHostDomains;
    }

    /**
     * URL that users are redirected to after they click the Send Feedback link. If no URL is specified, no Send Feedback link is displayed. .
     * 
     */
    @Import(name="feedbackUrl")
      private final @Nullable Output<String> feedbackUrl;

    public Output<String> getFeedbackUrl() {
        return this.feedbackUrl == null ? Output.empty() : this.feedbackUrl;
    }

    /**
     * Unique name for the AppStream stack.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * URL that users are redirected to after their streaming session ends.
     * 
     */
    @Import(name="redirectUrl")
      private final @Nullable Output<String> redirectUrl;

    public Output<String> getRedirectUrl() {
        return this.redirectUrl == null ? Output.empty() : this.redirectUrl;
    }

    /**
     * Configuration block for the storage connectors to enable. See below.
     * 
     */
    @Import(name="storageConnectors")
      private final @Nullable Output<List<StackStorageConnectorArgs>> storageConnectors;

    public Output<List<StackStorageConnectorArgs>> getStorageConnectors() {
        return this.storageConnectors == null ? Output.empty() : this.storageConnectors;
    }

    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Configuration block for the actions that are enabled or disabled for users during their streaming sessions. By default, these actions are enabled. See below.
     * 
     */
    @Import(name="userSettings")
      private final @Nullable Output<List<StackUserSettingArgs>> userSettings;

    public Output<List<StackUserSettingArgs>> getUserSettings() {
        return this.userSettings == null ? Output.empty() : this.userSettings;
    }

    public StackArgs(
        @Nullable Output<List<StackAccessEndpointArgs>> accessEndpoints,
        @Nullable Output<StackApplicationSettingsArgs> applicationSettings,
        @Nullable Output<String> description,
        @Nullable Output<String> displayName,
        @Nullable Output<List<String>> embedHostDomains,
        @Nullable Output<String> feedbackUrl,
        @Nullable Output<String> name,
        @Nullable Output<String> redirectUrl,
        @Nullable Output<List<StackStorageConnectorArgs>> storageConnectors,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<List<StackUserSettingArgs>> userSettings) {
        this.accessEndpoints = accessEndpoints;
        this.applicationSettings = applicationSettings;
        this.description = description;
        this.displayName = displayName;
        this.embedHostDomains = embedHostDomains;
        this.feedbackUrl = feedbackUrl;
        this.name = name;
        this.redirectUrl = redirectUrl;
        this.storageConnectors = storageConnectors;
        this.tags = tags;
        this.userSettings = userSettings;
    }

    private StackArgs() {
        this.accessEndpoints = Output.empty();
        this.applicationSettings = Output.empty();
        this.description = Output.empty();
        this.displayName = Output.empty();
        this.embedHostDomains = Output.empty();
        this.feedbackUrl = Output.empty();
        this.name = Output.empty();
        this.redirectUrl = Output.empty();
        this.storageConnectors = Output.empty();
        this.tags = Output.empty();
        this.userSettings = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StackArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<StackAccessEndpointArgs>> accessEndpoints;
        private @Nullable Output<StackApplicationSettingsArgs> applicationSettings;
        private @Nullable Output<String> description;
        private @Nullable Output<String> displayName;
        private @Nullable Output<List<String>> embedHostDomains;
        private @Nullable Output<String> feedbackUrl;
        private @Nullable Output<String> name;
        private @Nullable Output<String> redirectUrl;
        private @Nullable Output<List<StackStorageConnectorArgs>> storageConnectors;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<List<StackUserSettingArgs>> userSettings;

        public Builder() {
    	      // Empty
        }

        public Builder(StackArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessEndpoints = defaults.accessEndpoints;
    	      this.applicationSettings = defaults.applicationSettings;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.embedHostDomains = defaults.embedHostDomains;
    	      this.feedbackUrl = defaults.feedbackUrl;
    	      this.name = defaults.name;
    	      this.redirectUrl = defaults.redirectUrl;
    	      this.storageConnectors = defaults.storageConnectors;
    	      this.tags = defaults.tags;
    	      this.userSettings = defaults.userSettings;
        }

        public Builder accessEndpoints(@Nullable Output<List<StackAccessEndpointArgs>> accessEndpoints) {
            this.accessEndpoints = accessEndpoints;
            return this;
        }
        public Builder accessEndpoints(@Nullable List<StackAccessEndpointArgs> accessEndpoints) {
            this.accessEndpoints = Output.ofNullable(accessEndpoints);
            return this;
        }
        public Builder accessEndpoints(StackAccessEndpointArgs... accessEndpoints) {
            return accessEndpoints(List.of(accessEndpoints));
        }
        public Builder applicationSettings(@Nullable Output<StackApplicationSettingsArgs> applicationSettings) {
            this.applicationSettings = applicationSettings;
            return this;
        }
        public Builder applicationSettings(@Nullable StackApplicationSettingsArgs applicationSettings) {
            this.applicationSettings = Output.ofNullable(applicationSettings);
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
        public Builder displayName(@Nullable Output<String> displayName) {
            this.displayName = displayName;
            return this;
        }
        public Builder displayName(@Nullable String displayName) {
            this.displayName = Output.ofNullable(displayName);
            return this;
        }
        public Builder embedHostDomains(@Nullable Output<List<String>> embedHostDomains) {
            this.embedHostDomains = embedHostDomains;
            return this;
        }
        public Builder embedHostDomains(@Nullable List<String> embedHostDomains) {
            this.embedHostDomains = Output.ofNullable(embedHostDomains);
            return this;
        }
        public Builder embedHostDomains(String... embedHostDomains) {
            return embedHostDomains(List.of(embedHostDomains));
        }
        public Builder feedbackUrl(@Nullable Output<String> feedbackUrl) {
            this.feedbackUrl = feedbackUrl;
            return this;
        }
        public Builder feedbackUrl(@Nullable String feedbackUrl) {
            this.feedbackUrl = Output.ofNullable(feedbackUrl);
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
        public Builder redirectUrl(@Nullable Output<String> redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public Builder redirectUrl(@Nullable String redirectUrl) {
            this.redirectUrl = Output.ofNullable(redirectUrl);
            return this;
        }
        public Builder storageConnectors(@Nullable Output<List<StackStorageConnectorArgs>> storageConnectors) {
            this.storageConnectors = storageConnectors;
            return this;
        }
        public Builder storageConnectors(@Nullable List<StackStorageConnectorArgs> storageConnectors) {
            this.storageConnectors = Output.ofNullable(storageConnectors);
            return this;
        }
        public Builder storageConnectors(StackStorageConnectorArgs... storageConnectors) {
            return storageConnectors(List.of(storageConnectors));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder userSettings(@Nullable Output<List<StackUserSettingArgs>> userSettings) {
            this.userSettings = userSettings;
            return this;
        }
        public Builder userSettings(@Nullable List<StackUserSettingArgs> userSettings) {
            this.userSettings = Output.ofNullable(userSettings);
            return this;
        }
        public Builder userSettings(StackUserSettingArgs... userSettings) {
            return userSettings(List.of(userSettings));
        }        public StackArgs build() {
            return new StackArgs(accessEndpoints, applicationSettings, description, displayName, embedHostDomains, feedbackUrl, name, redirectUrl, storageConnectors, tags, userSettings);
        }
    }
}