// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.enums.IndexDocumentAttributeValueType;
import io.pulumi.awsnative.kendra.inputs.IndexRelevanceArgs;
import io.pulumi.awsnative.kendra.inputs.IndexSearchArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IndexDocumentMetadataConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final IndexDocumentMetadataConfigurationArgs Empty = new IndexDocumentMetadataConfigurationArgs();

    @InputImport(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    @InputImport(name="relevance")
      private final @Nullable Output<IndexRelevanceArgs> relevance;

    public Output<IndexRelevanceArgs> getRelevance() {
        return this.relevance == null ? Output.empty() : this.relevance;
    }

    @InputImport(name="search")
      private final @Nullable Output<IndexSearchArgs> search;

    public Output<IndexSearchArgs> getSearch() {
        return this.search == null ? Output.empty() : this.search;
    }

    @InputImport(name="type", required=true)
      private final Output<IndexDocumentAttributeValueType> type;

    public Output<IndexDocumentAttributeValueType> getType() {
        return this.type;
    }

    public IndexDocumentMetadataConfigurationArgs(
        Output<String> name,
        @Nullable Output<IndexRelevanceArgs> relevance,
        @Nullable Output<IndexSearchArgs> search,
        Output<IndexDocumentAttributeValueType> type) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.relevance = relevance;
        this.search = search;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private IndexDocumentMetadataConfigurationArgs() {
        this.name = Output.empty();
        this.relevance = Output.empty();
        this.search = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IndexDocumentMetadataConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> name;
        private @Nullable Output<IndexRelevanceArgs> relevance;
        private @Nullable Output<IndexSearchArgs> search;
        private Output<IndexDocumentAttributeValueType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(IndexDocumentMetadataConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.relevance = defaults.relevance;
    	      this.search = defaults.search;
    	      this.type = defaults.type;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder relevance(@Nullable Output<IndexRelevanceArgs> relevance) {
            this.relevance = relevance;
            return this;
        }

        public Builder relevance(@Nullable IndexRelevanceArgs relevance) {
            this.relevance = Output.ofNullable(relevance);
            return this;
        }

        public Builder search(@Nullable Output<IndexSearchArgs> search) {
            this.search = search;
            return this;
        }

        public Builder search(@Nullable IndexSearchArgs search) {
            this.search = Output.ofNullable(search);
            return this;
        }

        public Builder type(Output<IndexDocumentAttributeValueType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder type(IndexDocumentAttributeValueType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }
        public IndexDocumentMetadataConfigurationArgs build() {
            return new IndexDocumentMetadataConfigurationArgs(name, relevance, search, type);
        }
    }
}
