// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Push settings for the App.
 * 
 */
public final class PushSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final PushSettingsResponse Empty = new PushSettingsResponse();

    /**
     * Gets or sets a JSON string containing a list of dynamic tags that will be evaluated from user claims in the push registration endpoint.
     * 
     */
    @InputImport(name="dynamicTagsJson")
      private final @Nullable String dynamicTagsJson;

    public Optional<String> getDynamicTagsJson() {
        return this.dynamicTagsJson == null ? Optional.empty() : Optional.ofNullable(this.dynamicTagsJson);
    }

    /**
     * Resource Id.
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * Gets or sets a flag indicating whether the Push endpoint is enabled.
     * 
     */
    @InputImport(name="isPushEnabled", required=true)
      private final Boolean isPushEnabled;

    public Boolean getIsPushEnabled() {
        return this.isPushEnabled;
    }

    /**
     * Kind of resource.
     * 
     */
    @InputImport(name="kind")
      private final @Nullable String kind;

    public Optional<String> getKind() {
        return this.kind == null ? Optional.empty() : Optional.ofNullable(this.kind);
    }

    /**
     * Resource Name.
     * 
     */
    @InputImport(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * Gets or sets a JSON string containing a list of tags that are whitelisted for use by the push registration endpoint.
     * 
     */
    @InputImport(name="tagWhitelistJson")
      private final @Nullable String tagWhitelistJson;

    public Optional<String> getTagWhitelistJson() {
        return this.tagWhitelistJson == null ? Optional.empty() : Optional.ofNullable(this.tagWhitelistJson);
    }

    /**
     * Gets or sets a JSON string containing a list of tags that require user authentication to be used in the push registration endpoint.
     * Tags can consist of alphanumeric characters and the following:
     * '_', '@', '#', '.', ':', '-'.
     * Validation should be performed at the PushRequestHandler.
     * 
     */
    @InputImport(name="tagsRequiringAuth")
      private final @Nullable String tagsRequiringAuth;

    public Optional<String> getTagsRequiringAuth() {
        return this.tagsRequiringAuth == null ? Optional.empty() : Optional.ofNullable(this.tagsRequiringAuth);
    }

    /**
     * Resource type.
     * 
     */
    @InputImport(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    public PushSettingsResponse(
        @Nullable String dynamicTagsJson,
        String id,
        Boolean isPushEnabled,
        @Nullable String kind,
        String name,
        @Nullable String tagWhitelistJson,
        @Nullable String tagsRequiringAuth,
        String type) {
        this.dynamicTagsJson = dynamicTagsJson;
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.isPushEnabled = Objects.requireNonNull(isPushEnabled, "expected parameter 'isPushEnabled' to be non-null");
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.tagWhitelistJson = tagWhitelistJson;
        this.tagsRequiringAuth = tagsRequiringAuth;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private PushSettingsResponse() {
        this.dynamicTagsJson = null;
        this.id = null;
        this.isPushEnabled = null;
        this.kind = null;
        this.name = null;
        this.tagWhitelistJson = null;
        this.tagsRequiringAuth = null;
        this.type = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PushSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String dynamicTagsJson;
        private String id;
        private Boolean isPushEnabled;
        private @Nullable String kind;
        private String name;
        private @Nullable String tagWhitelistJson;
        private @Nullable String tagsRequiringAuth;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(PushSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dynamicTagsJson = defaults.dynamicTagsJson;
    	      this.id = defaults.id;
    	      this.isPushEnabled = defaults.isPushEnabled;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.tagWhitelistJson = defaults.tagWhitelistJson;
    	      this.tagsRequiringAuth = defaults.tagsRequiringAuth;
    	      this.type = defaults.type;
        }

        public Builder setDynamicTagsJson(@Nullable String dynamicTagsJson) {
            this.dynamicTagsJson = dynamicTagsJson;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsPushEnabled(Boolean isPushEnabled) {
            this.isPushEnabled = Objects.requireNonNull(isPushEnabled);
            return this;
        }

        public Builder setKind(@Nullable String kind) {
            this.kind = kind;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTagWhitelistJson(@Nullable String tagWhitelistJson) {
            this.tagWhitelistJson = tagWhitelistJson;
            return this;
        }

        public Builder setTagsRequiringAuth(@Nullable String tagsRequiringAuth) {
            this.tagsRequiringAuth = tagsRequiringAuth;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public PushSettingsResponse build() {
            return new PushSettingsResponse(dynamicTagsJson, id, isPushEnabled, kind, name, tagWhitelistJson, tagsRequiringAuth, type);
        }
    }
}
