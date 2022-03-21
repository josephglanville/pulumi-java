// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceToIndexFieldMapping;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration Empty = new DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration();

    @Import(name="documentDataFieldName", required=true)
      private final String documentDataFieldName;

    public String getDocumentDataFieldName() {
        return this.documentDataFieldName;
    }

    @Import(name="documentTitleFieldName")
      private final @Nullable String documentTitleFieldName;

    public Optional<String> getDocumentTitleFieldName() {
        return this.documentTitleFieldName == null ? Optional.empty() : Optional.ofNullable(this.documentTitleFieldName);
    }

    @Import(name="fieldMappings")
      private final @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;

    public List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return this.fieldMappings == null ? List.of() : this.fieldMappings;
    }

    @Import(name="name", required=true)
      private final String name;

    public String getName() {
        return this.name;
    }

    public DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration(
        String documentDataFieldName,
        @Nullable String documentTitleFieldName,
        @Nullable List<DataSourceToIndexFieldMapping> fieldMappings,
        String name) {
        this.documentDataFieldName = Objects.requireNonNull(documentDataFieldName, "expected parameter 'documentDataFieldName' to be non-null");
        this.documentTitleFieldName = documentTitleFieldName;
        this.fieldMappings = fieldMappings;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration() {
        this.documentDataFieldName = null;
        this.documentTitleFieldName = null;
        this.fieldMappings = List.of();
        this.name = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String documentDataFieldName;
        private @Nullable String documentTitleFieldName;
        private @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentDataFieldName = defaults.documentDataFieldName;
    	      this.documentTitleFieldName = defaults.documentTitleFieldName;
    	      this.fieldMappings = defaults.fieldMappings;
    	      this.name = defaults.name;
        }

        public Builder documentDataFieldName(String documentDataFieldName) {
            this.documentDataFieldName = Objects.requireNonNull(documentDataFieldName);
            return this;
        }
        public Builder documentTitleFieldName(@Nullable String documentTitleFieldName) {
            this.documentTitleFieldName = documentTitleFieldName;
            return this;
        }
        public Builder fieldMappings(@Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }
        public Builder fieldMappings(DataSourceToIndexFieldMapping... fieldMappings) {
            return fieldMappings(List.of(fieldMappings));
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration build() {
            return new DataSourceSalesforceCustomKnowledgeArticleTypeConfiguration(documentDataFieldName, documentTitleFieldName, fieldMappings, name);
        }
    }
}
