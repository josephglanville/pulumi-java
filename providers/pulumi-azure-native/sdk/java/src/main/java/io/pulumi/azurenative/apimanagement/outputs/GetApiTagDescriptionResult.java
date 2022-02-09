// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetApiTagDescriptionResult {
    private final @Nullable String description;
    private final @Nullable String displayName;
    private final @Nullable String externalDocsDescription;
    private final @Nullable String externalDocsUrl;
    private final String id;
    private final String name;
    private final @Nullable String tagId;
    private final String type;

    @OutputCustomType.Constructor({"description","displayName","externalDocsDescription","externalDocsUrl","id","name","tagId","type"})
    private GetApiTagDescriptionResult(
        @Nullable String description,
        @Nullable String displayName,
        @Nullable String externalDocsDescription,
        @Nullable String externalDocsUrl,
        String id,
        String name,
        @Nullable String tagId,
        String type) {
        this.description = description;
        this.displayName = displayName;
        this.externalDocsDescription = externalDocsDescription;
        this.externalDocsUrl = externalDocsUrl;
        this.id = Objects.requireNonNull(id);
        this.name = Objects.requireNonNull(name);
        this.tagId = tagId;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<String> getDisplayName() {
        return Optional.ofNullable(this.displayName);
    }
    public Optional<String> getExternalDocsDescription() {
        return Optional.ofNullable(this.externalDocsDescription);
    }
    public Optional<String> getExternalDocsUrl() {
        return Optional.ofNullable(this.externalDocsUrl);
    }
    public String getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getTagId() {
        return Optional.ofNullable(this.tagId);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiTagDescriptionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private @Nullable String displayName;
        private @Nullable String externalDocsDescription;
        private @Nullable String externalDocsUrl;
        private String id;
        private String name;
        private @Nullable String tagId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiTagDescriptionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.externalDocsDescription = defaults.externalDocsDescription;
    	      this.externalDocsUrl = defaults.externalDocsUrl;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.tagId = defaults.tagId;
    	      this.type = defaults.type;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setExternalDocsDescription(@Nullable String externalDocsDescription) {
            this.externalDocsDescription = externalDocsDescription;
            return this;
        }

        public Builder setExternalDocsUrl(@Nullable String externalDocsUrl) {
            this.externalDocsUrl = externalDocsUrl;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setTagId(@Nullable String tagId) {
            this.tagId = tagId;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetApiTagDescriptionResult build() {
            return new GetApiTagDescriptionResult(description, displayName, externalDocsDescription, externalDocsUrl, id, name, tagId, type);
        }
    }
}
