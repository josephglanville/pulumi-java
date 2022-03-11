// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppSitePushSettingsSlotArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppSitePushSettingsSlotArgs Empty = new WebAppSitePushSettingsSlotArgs();

    /**
     * Gets or sets a JSON string containing a list of dynamic tags that will be evaluated from user claims in the push registration endpoint.
     * 
     */
    @InputImport(name="dynamicTagsJson")
      private final @Nullable Output<String> dynamicTagsJson;

    public Output<String> getDynamicTagsJson() {
        return this.dynamicTagsJson == null ? Output.empty() : this.dynamicTagsJson;
    }

    /**
     * Gets or sets a flag indicating whether the Push endpoint is enabled.
     * 
     */
    @InputImport(name="isPushEnabled", required=true)
      private final Output<Boolean> isPushEnabled;

    public Output<Boolean> getIsPushEnabled() {
        return this.isPushEnabled;
    }

    /**
     * Kind of resource.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Name of web app.
     * 
     */
    @InputImport(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Name of web app slot. If not specified then will default to production slot.
     * 
     */
    @InputImport(name="slot", required=true)
      private final Output<String> slot;

    public Output<String> getSlot() {
        return this.slot;
    }

    /**
     * Gets or sets a JSON string containing a list of tags that are whitelisted for use by the push registration endpoint.
     * 
     */
    @InputImport(name="tagWhitelistJson")
      private final @Nullable Output<String> tagWhitelistJson;

    public Output<String> getTagWhitelistJson() {
        return this.tagWhitelistJson == null ? Output.empty() : this.tagWhitelistJson;
    }

    /**
     * Gets or sets a JSON string containing a list of tags that require user authentication to be used in the push registration endpoint.
     * Tags can consist of alphanumeric characters and the following:
     * '_', '@', '#', '.', ':', '-'.
     * Validation should be performed at the PushRequestHandler.
     * 
     */
    @InputImport(name="tagsRequiringAuth")
      private final @Nullable Output<String> tagsRequiringAuth;

    public Output<String> getTagsRequiringAuth() {
        return this.tagsRequiringAuth == null ? Output.empty() : this.tagsRequiringAuth;
    }

    public WebAppSitePushSettingsSlotArgs(
        @Nullable Output<String> dynamicTagsJson,
        Output<Boolean> isPushEnabled,
        @Nullable Output<String> kind,
        Output<String> name,
        Output<String> resourceGroupName,
        Output<String> slot,
        @Nullable Output<String> tagWhitelistJson,
        @Nullable Output<String> tagsRequiringAuth) {
        this.dynamicTagsJson = dynamicTagsJson;
        this.isPushEnabled = Objects.requireNonNull(isPushEnabled, "expected parameter 'isPushEnabled' to be non-null");
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
        this.tagWhitelistJson = tagWhitelistJson;
        this.tagsRequiringAuth = tagsRequiringAuth;
    }

    private WebAppSitePushSettingsSlotArgs() {
        this.dynamicTagsJson = Output.empty();
        this.isPushEnabled = Output.empty();
        this.kind = Output.empty();
        this.name = Output.empty();
        this.resourceGroupName = Output.empty();
        this.slot = Output.empty();
        this.tagWhitelistJson = Output.empty();
        this.tagsRequiringAuth = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppSitePushSettingsSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dynamicTagsJson;
        private Output<Boolean> isPushEnabled;
        private @Nullable Output<String> kind;
        private Output<String> name;
        private Output<String> resourceGroupName;
        private Output<String> slot;
        private @Nullable Output<String> tagWhitelistJson;
        private @Nullable Output<String> tagsRequiringAuth;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppSitePushSettingsSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dynamicTagsJson = defaults.dynamicTagsJson;
    	      this.isPushEnabled = defaults.isPushEnabled;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.slot = defaults.slot;
    	      this.tagWhitelistJson = defaults.tagWhitelistJson;
    	      this.tagsRequiringAuth = defaults.tagsRequiringAuth;
        }

        public Builder dynamicTagsJson(@Nullable Output<String> dynamicTagsJson) {
            this.dynamicTagsJson = dynamicTagsJson;
            return this;
        }

        public Builder dynamicTagsJson(@Nullable String dynamicTagsJson) {
            this.dynamicTagsJson = Output.ofNullable(dynamicTagsJson);
            return this;
        }

        public Builder isPushEnabled(Output<Boolean> isPushEnabled) {
            this.isPushEnabled = Objects.requireNonNull(isPushEnabled);
            return this;
        }

        public Builder isPushEnabled(Boolean isPushEnabled) {
            this.isPushEnabled = Output.of(Objects.requireNonNull(isPushEnabled));
            return this;
        }

        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }

        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder slot(Output<String> slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }

        public Builder slot(String slot) {
            this.slot = Output.of(Objects.requireNonNull(slot));
            return this;
        }

        public Builder tagWhitelistJson(@Nullable Output<String> tagWhitelistJson) {
            this.tagWhitelistJson = tagWhitelistJson;
            return this;
        }

        public Builder tagWhitelistJson(@Nullable String tagWhitelistJson) {
            this.tagWhitelistJson = Output.ofNullable(tagWhitelistJson);
            return this;
        }

        public Builder tagsRequiringAuth(@Nullable Output<String> tagsRequiringAuth) {
            this.tagsRequiringAuth = tagsRequiringAuth;
            return this;
        }

        public Builder tagsRequiringAuth(@Nullable String tagsRequiringAuth) {
            this.tagsRequiringAuth = Output.ofNullable(tagsRequiringAuth);
            return this;
        }
        public WebAppSitePushSettingsSlotArgs build() {
            return new WebAppSitePushSettingsSlotArgs(dynamicTagsJson, isPushEnabled, kind, name, resourceGroupName, slot, tagWhitelistJson, tagsRequiringAuth);
        }
    }
}
