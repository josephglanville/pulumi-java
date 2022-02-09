// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.securityinsights.outputs;

import io.pulumi.azurenative.securityinsights.outputs.MetadataAuthorResponse;
import io.pulumi.azurenative.securityinsights.outputs.MetadataCategoriesResponse;
import io.pulumi.azurenative.securityinsights.outputs.MetadataDependenciesResponse;
import io.pulumi.azurenative.securityinsights.outputs.MetadataSourceResponse;
import io.pulumi.azurenative.securityinsights.outputs.MetadataSupportResponse;
import io.pulumi.azurenative.securityinsights.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMetadataResult {
    private final @Nullable MetadataAuthorResponse author;
    private final @Nullable MetadataCategoriesResponse categories;
    private final @Nullable String contentId;
    private final @Nullable MetadataDependenciesResponse dependencies;
    private final @Nullable String etag;
    private final @Nullable String firstPublishDate;
    private final String id;
    private final String kind;
    private final @Nullable String lastPublishDate;
    private final String name;
    private final String parentId;
    private final @Nullable List<String> providers;
    private final @Nullable MetadataSourceResponse source;
    private final @Nullable MetadataSupportResponse support;
    private final SystemDataResponse systemData;
    private final String type;
    private final @Nullable String version;

    @OutputCustomType.Constructor({"author","categories","contentId","dependencies","etag","firstPublishDate","id","kind","lastPublishDate","name","parentId","providers","source","support","systemData","type","version"})
    private GetMetadataResult(
        @Nullable MetadataAuthorResponse author,
        @Nullable MetadataCategoriesResponse categories,
        @Nullable String contentId,
        @Nullable MetadataDependenciesResponse dependencies,
        @Nullable String etag,
        @Nullable String firstPublishDate,
        String id,
        String kind,
        @Nullable String lastPublishDate,
        String name,
        String parentId,
        @Nullable List<String> providers,
        @Nullable MetadataSourceResponse source,
        @Nullable MetadataSupportResponse support,
        SystemDataResponse systemData,
        String type,
        @Nullable String version) {
        this.author = author;
        this.categories = categories;
        this.contentId = contentId;
        this.dependencies = dependencies;
        this.etag = etag;
        this.firstPublishDate = firstPublishDate;
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.lastPublishDate = lastPublishDate;
        this.name = Objects.requireNonNull(name);
        this.parentId = Objects.requireNonNull(parentId);
        this.providers = providers;
        this.source = source;
        this.support = support;
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
        this.version = version;
    }

    public Optional<MetadataAuthorResponse> getAuthor() {
        return Optional.ofNullable(this.author);
    }
    public Optional<MetadataCategoriesResponse> getCategories() {
        return Optional.ofNullable(this.categories);
    }
    public Optional<String> getContentId() {
        return Optional.ofNullable(this.contentId);
    }
    public Optional<MetadataDependenciesResponse> getDependencies() {
        return Optional.ofNullable(this.dependencies);
    }
    public Optional<String> getEtag() {
        return Optional.ofNullable(this.etag);
    }
    public Optional<String> getFirstPublishDate() {
        return Optional.ofNullable(this.firstPublishDate);
    }
    public String getId() {
        return this.id;
    }
    public String getKind() {
        return this.kind;
    }
    public Optional<String> getLastPublishDate() {
        return Optional.ofNullable(this.lastPublishDate);
    }
    public String getName() {
        return this.name;
    }
    public String getParentId() {
        return this.parentId;
    }
    public List<String> getProviders() {
        return this.providers == null ? List.of() : this.providers;
    }
    public Optional<MetadataSourceResponse> getSource() {
        return Optional.ofNullable(this.source);
    }
    public Optional<MetadataSupportResponse> getSupport() {
        return Optional.ofNullable(this.support);
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public String getType() {
        return this.type;
    }
    public Optional<String> getVersion() {
        return Optional.ofNullable(this.version);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetadataResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable MetadataAuthorResponse author;
        private @Nullable MetadataCategoriesResponse categories;
        private @Nullable String contentId;
        private @Nullable MetadataDependenciesResponse dependencies;
        private @Nullable String etag;
        private @Nullable String firstPublishDate;
        private String id;
        private String kind;
        private @Nullable String lastPublishDate;
        private String name;
        private String parentId;
        private @Nullable List<String> providers;
        private @Nullable MetadataSourceResponse source;
        private @Nullable MetadataSupportResponse support;
        private SystemDataResponse systemData;
        private String type;
        private @Nullable String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMetadataResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.author = defaults.author;
    	      this.categories = defaults.categories;
    	      this.contentId = defaults.contentId;
    	      this.dependencies = defaults.dependencies;
    	      this.etag = defaults.etag;
    	      this.firstPublishDate = defaults.firstPublishDate;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.lastPublishDate = defaults.lastPublishDate;
    	      this.name = defaults.name;
    	      this.parentId = defaults.parentId;
    	      this.providers = defaults.providers;
    	      this.source = defaults.source;
    	      this.support = defaults.support;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setAuthor(@Nullable MetadataAuthorResponse author) {
            this.author = author;
            return this;
        }

        public Builder setCategories(@Nullable MetadataCategoriesResponse categories) {
            this.categories = categories;
            return this;
        }

        public Builder setContentId(@Nullable String contentId) {
            this.contentId = contentId;
            return this;
        }

        public Builder setDependencies(@Nullable MetadataDependenciesResponse dependencies) {
            this.dependencies = dependencies;
            return this;
        }

        public Builder setEtag(@Nullable String etag) {
            this.etag = etag;
            return this;
        }

        public Builder setFirstPublishDate(@Nullable String firstPublishDate) {
            this.firstPublishDate = firstPublishDate;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLastPublishDate(@Nullable String lastPublishDate) {
            this.lastPublishDate = lastPublishDate;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setParentId(String parentId) {
            this.parentId = Objects.requireNonNull(parentId);
            return this;
        }

        public Builder setProviders(@Nullable List<String> providers) {
            this.providers = providers;
            return this;
        }

        public Builder setSource(@Nullable MetadataSourceResponse source) {
            this.source = source;
            return this;
        }

        public Builder setSupport(@Nullable MetadataSupportResponse support) {
            this.support = support;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setVersion(@Nullable String version) {
            this.version = version;
            return this;
        }

        public GetMetadataResult build() {
            return new GetMetadataResult(author, categories, contentId, dependencies, etag, firstPublishDate, id, kind, lastPublishDate, name, parentId, providers, source, support, systemData, type, version);
        }
    }
}
