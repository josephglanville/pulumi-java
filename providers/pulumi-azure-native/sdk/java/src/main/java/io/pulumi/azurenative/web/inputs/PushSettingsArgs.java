// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Push settings for the App.
 * 
 */
public final class PushSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final PushSettingsArgs Empty = new PushSettingsArgs();

    /**
     * Gets or sets a JSON string containing a list of dynamic tags that will be evaluated from user claims in the push registration endpoint.
     * 
     */
    @Import(name="dynamicTagsJson")
      private final @Nullable Output<String> dynamicTagsJson;

    public Output<String> getDynamicTagsJson() {
        return this.dynamicTagsJson == null ? Output.empty() : this.dynamicTagsJson;
    }

    /**
     * Gets or sets a flag indicating whether the Push endpoint is enabled.
     * 
     */
    @Import(name="isPushEnabled", required=true)
      private final Output<Boolean> isPushEnabled;

    public Output<Boolean> getIsPushEnabled() {
        return this.isPushEnabled;
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * Gets or sets a JSON string containing a list of tags that are whitelisted for use by the push registration endpoint.
     * 
     */
    @Import(name="tagWhitelistJson")
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
    @Import(name="tagsRequiringAuth")
      private final @Nullable Output<String> tagsRequiringAuth;

    public Output<String> getTagsRequiringAuth() {
        return this.tagsRequiringAuth == null ? Output.empty() : this.tagsRequiringAuth;
    }

    public PushSettingsArgs(
        @Nullable Output<String> dynamicTagsJson,
        Output<Boolean> isPushEnabled,
        @Nullable Output<String> kind,
        @Nullable Output<String> tagWhitelistJson,
        @Nullable Output<String> tagsRequiringAuth) {
        this.dynamicTagsJson = dynamicTagsJson;
        this.isPushEnabled = Objects.requireNonNull(isPushEnabled, "expected parameter 'isPushEnabled' to be non-null");
        this.kind = kind;
        this.tagWhitelistJson = tagWhitelistJson;
        this.tagsRequiringAuth = tagsRequiringAuth;
    }

    private PushSettingsArgs() {
        this.dynamicTagsJson = Output.empty();
        this.isPushEnabled = Output.empty();
        this.kind = Output.empty();
        this.tagWhitelistJson = Output.empty();
        this.tagsRequiringAuth = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PushSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dynamicTagsJson;
        private Output<Boolean> isPushEnabled;
        private @Nullable Output<String> kind;
        private @Nullable Output<String> tagWhitelistJson;
        private @Nullable Output<String> tagsRequiringAuth;

        public Builder() {
    	      // Empty
        }

        public Builder(PushSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dynamicTagsJson = defaults.dynamicTagsJson;
    	      this.isPushEnabled = defaults.isPushEnabled;
    	      this.kind = defaults.kind;
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
        }        public PushSettingsArgs build() {
            return new PushSettingsArgs(dynamicTagsJson, isPushEnabled, kind, tagWhitelistJson, tagsRequiringAuth);
        }
    }
}
