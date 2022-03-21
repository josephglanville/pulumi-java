// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.outputs.DataSourceToIndexFieldMapping;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration {
    private final String documentDataFieldName;
    private final @Nullable String documentTitleFieldName;
    private final @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;

    @CustomType.Constructor
    private DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration(
        @CustomType.Parameter("documentDataFieldName") String documentDataFieldName,
        @CustomType.Parameter("documentTitleFieldName") @Nullable String documentTitleFieldName,
        @CustomType.Parameter("fieldMappings") @Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
        this.documentDataFieldName = documentDataFieldName;
        this.documentTitleFieldName = documentTitleFieldName;
        this.fieldMappings = fieldMappings;
    }

    public String getDocumentDataFieldName() {
        return this.documentDataFieldName;
    }
    public Optional<String> getDocumentTitleFieldName() {
        return Optional.ofNullable(this.documentTitleFieldName);
    }
    public List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return this.fieldMappings == null ? List.of() : this.fieldMappings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String documentDataFieldName;
        private @Nullable String documentTitleFieldName;
        private @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentDataFieldName = defaults.documentDataFieldName;
    	      this.documentTitleFieldName = defaults.documentTitleFieldName;
    	      this.fieldMappings = defaults.fieldMappings;
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
        }        public DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration build() {
            return new DataSourceSalesforceStandardKnowledgeArticleTypeConfiguration(documentDataFieldName, documentTitleFieldName, fieldMappings);
        }
    }
}
