// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dialogflow_v2beta1.enums.DocumentKnowledgeTypesItem;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DocumentArgs extends io.pulumi.resources.ResourceArgs {

    public static final DocumentArgs Empty = new DocumentArgs();

    /**
     * The raw content of the document. This field is only permitted for EXTRACTIVE_QA and FAQ knowledge types. Note: This field is in the process of being deprecated, please use raw_content instead.
     * 
     */
    @Import(name="content")
      private final @Nullable Output<String> content;

    public Output<String> getContent() {
        return this.content == null ? Output.empty() : this.content;
    }

    /**
     * The URI where the file content is located. For documents stored in Google Cloud Storage, these URIs must have the form `gs:///`. NOTE: External URLs must correspond to public webpages, i.e., they must be indexed by Google Search. In particular, URLs for showing documents in Google Cloud Storage (i.e. the URL in your browser) are not supported. Instead use the `gs://` format URI described above.
     * 
     */
    @Import(name="contentUri")
      private final @Nullable Output<String> contentUri;

    public Output<String> getContentUri() {
        return this.contentUri == null ? Output.empty() : this.contentUri;
    }

    /**
     * The display name of the document. The name must be 1024 bytes or less; otherwise, the creation request fails.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    /**
     * Optional. If true, we try to automatically reload the document every day (at a time picked by the system). If false or unspecified, we don't try to automatically reload the document. Currently you can only enable automatic reload for documents sourced from a public url, see `source` field for the source types. Reload status can be tracked in `latest_reload_status`. If a reload fails, we will keep the document unchanged. If a reload fails with internal errors, the system will try to reload the document on the next day. If a reload fails with non-retriable errors (e.g. PERMISION_DENIED), the system will not try to reload the document anymore. You need to manually reload the document successfully by calling `ReloadDocument` and clear the errors.
     * 
     */
    @Import(name="enableAutoReload")
      private final @Nullable Output<Boolean> enableAutoReload;

    public Output<Boolean> getEnableAutoReload() {
        return this.enableAutoReload == null ? Output.empty() : this.enableAutoReload;
    }

    @Import(name="importGcsCustomMetadata")
      private final @Nullable Output<String> importGcsCustomMetadata;

    public Output<String> getImportGcsCustomMetadata() {
        return this.importGcsCustomMetadata == null ? Output.empty() : this.importGcsCustomMetadata;
    }

    @Import(name="knowledgeBaseId", required=true)
      private final Output<String> knowledgeBaseId;

    public Output<String> getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * The knowledge type of document content.
     * 
     */
    @Import(name="knowledgeTypes", required=true)
      private final Output<List<DocumentKnowledgeTypesItem>> knowledgeTypes;

    public Output<List<DocumentKnowledgeTypesItem>> getKnowledgeTypes() {
        return this.knowledgeTypes;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * Optional. Metadata for the document. The metadata supports arbitrary key-value pairs. Suggested use cases include storing a document's title, an external URL distinct from the document's content_uri, etc. The max size of a `key` or a `value` of the metadata is 1024 bytes.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * The MIME type of this document.
     * 
     */
    @Import(name="mimeType", required=true)
      private final Output<String> mimeType;

    public Output<String> getMimeType() {
        return this.mimeType;
    }

    /**
     * Optional. The document resource name. The name must be empty when creating a document. Format: `projects//locations//knowledgeBases//documents/`.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The raw content of the document. This field is only permitted for EXTRACTIVE_QA and FAQ knowledge types.
     * 
     */
    @Import(name="rawContent")
      private final @Nullable Output<String> rawContent;

    public Output<String> getRawContent() {
        return this.rawContent == null ? Output.empty() : this.rawContent;
    }

    public DocumentArgs(
        @Nullable Output<String> content,
        @Nullable Output<String> contentUri,
        Output<String> displayName,
        @Nullable Output<Boolean> enableAutoReload,
        @Nullable Output<String> importGcsCustomMetadata,
        Output<String> knowledgeBaseId,
        Output<List<DocumentKnowledgeTypesItem>> knowledgeTypes,
        @Nullable Output<String> location,
        @Nullable Output<Map<String,String>> metadata,
        Output<String> mimeType,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        @Nullable Output<String> rawContent) {
        this.content = content;
        this.contentUri = contentUri;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.enableAutoReload = enableAutoReload;
        this.importGcsCustomMetadata = importGcsCustomMetadata;
        this.knowledgeBaseId = Objects.requireNonNull(knowledgeBaseId, "expected parameter 'knowledgeBaseId' to be non-null");
        this.knowledgeTypes = Objects.requireNonNull(knowledgeTypes, "expected parameter 'knowledgeTypes' to be non-null");
        this.location = location;
        this.metadata = metadata;
        this.mimeType = Objects.requireNonNull(mimeType, "expected parameter 'mimeType' to be non-null");
        this.name = name;
        this.project = project;
        this.rawContent = rawContent;
    }

    private DocumentArgs() {
        this.content = Output.empty();
        this.contentUri = Output.empty();
        this.displayName = Output.empty();
        this.enableAutoReload = Output.empty();
        this.importGcsCustomMetadata = Output.empty();
        this.knowledgeBaseId = Output.empty();
        this.knowledgeTypes = Output.empty();
        this.location = Output.empty();
        this.metadata = Output.empty();
        this.mimeType = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.rawContent = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DocumentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> content;
        private @Nullable Output<String> contentUri;
        private Output<String> displayName;
        private @Nullable Output<Boolean> enableAutoReload;
        private @Nullable Output<String> importGcsCustomMetadata;
        private Output<String> knowledgeBaseId;
        private Output<List<DocumentKnowledgeTypesItem>> knowledgeTypes;
        private @Nullable Output<String> location;
        private @Nullable Output<Map<String,String>> metadata;
        private Output<String> mimeType;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private @Nullable Output<String> rawContent;

        public Builder() {
    	      // Empty
        }

        public Builder(DocumentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentUri = defaults.contentUri;
    	      this.displayName = defaults.displayName;
    	      this.enableAutoReload = defaults.enableAutoReload;
    	      this.importGcsCustomMetadata = defaults.importGcsCustomMetadata;
    	      this.knowledgeBaseId = defaults.knowledgeBaseId;
    	      this.knowledgeTypes = defaults.knowledgeTypes;
    	      this.location = defaults.location;
    	      this.metadata = defaults.metadata;
    	      this.mimeType = defaults.mimeType;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.rawContent = defaults.rawContent;
        }

        public Builder content(@Nullable Output<String> content) {
            this.content = content;
            return this;
        }
        public Builder content(@Nullable String content) {
            this.content = Output.ofNullable(content);
            return this;
        }
        public Builder contentUri(@Nullable Output<String> contentUri) {
            this.contentUri = contentUri;
            return this;
        }
        public Builder contentUri(@Nullable String contentUri) {
            this.contentUri = Output.ofNullable(contentUri);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder enableAutoReload(@Nullable Output<Boolean> enableAutoReload) {
            this.enableAutoReload = enableAutoReload;
            return this;
        }
        public Builder enableAutoReload(@Nullable Boolean enableAutoReload) {
            this.enableAutoReload = Output.ofNullable(enableAutoReload);
            return this;
        }
        public Builder importGcsCustomMetadata(@Nullable Output<String> importGcsCustomMetadata) {
            this.importGcsCustomMetadata = importGcsCustomMetadata;
            return this;
        }
        public Builder importGcsCustomMetadata(@Nullable String importGcsCustomMetadata) {
            this.importGcsCustomMetadata = Output.ofNullable(importGcsCustomMetadata);
            return this;
        }
        public Builder knowledgeBaseId(Output<String> knowledgeBaseId) {
            this.knowledgeBaseId = Objects.requireNonNull(knowledgeBaseId);
            return this;
        }
        public Builder knowledgeBaseId(String knowledgeBaseId) {
            this.knowledgeBaseId = Output.of(Objects.requireNonNull(knowledgeBaseId));
            return this;
        }
        public Builder knowledgeTypes(Output<List<DocumentKnowledgeTypesItem>> knowledgeTypes) {
            this.knowledgeTypes = Objects.requireNonNull(knowledgeTypes);
            return this;
        }
        public Builder knowledgeTypes(List<DocumentKnowledgeTypesItem> knowledgeTypes) {
            this.knowledgeTypes = Output.of(Objects.requireNonNull(knowledgeTypes));
            return this;
        }
        public Builder knowledgeTypes(DocumentKnowledgeTypesItem... knowledgeTypes) {
            return knowledgeTypes(List.of(knowledgeTypes));
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }
        public Builder mimeType(Output<String> mimeType) {
            this.mimeType = Objects.requireNonNull(mimeType);
            return this;
        }
        public Builder mimeType(String mimeType) {
            this.mimeType = Output.of(Objects.requireNonNull(mimeType));
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
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder rawContent(@Nullable Output<String> rawContent) {
            this.rawContent = rawContent;
            return this;
        }
        public Builder rawContent(@Nullable String rawContent) {
            this.rawContent = Output.ofNullable(rawContent);
            return this;
        }        public DocumentArgs build() {
            return new DocumentArgs(content, contentUri, displayName, enableAutoReload, importGcsCustomMetadata, knowledgeBaseId, knowledgeTypes, location, metadata, mimeType, name, project, rawContent);
        }
    }
}
