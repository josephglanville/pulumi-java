// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceToIndexFieldMappingArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs Empty = new DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs();

    @InputImport(name="documentDataFieldName", required=true)
      private final Input<String> documentDataFieldName;

    public Input<String> getDocumentDataFieldName() {
        return this.documentDataFieldName;
    }

    @InputImport(name="documentTitleFieldName")
      private final @Nullable Input<String> documentTitleFieldName;

    public Input<String> getDocumentTitleFieldName() {
        return this.documentTitleFieldName == null ? Input.empty() : this.documentTitleFieldName;
    }

    @InputImport(name="fieldMappings")
      private final @Nullable Input<List<DataSourceToIndexFieldMappingArgs>> fieldMappings;

    public Input<List<DataSourceToIndexFieldMappingArgs>> getFieldMappings() {
        return this.fieldMappings == null ? Input.empty() : this.fieldMappings;
    }

    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    public DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs(
        Input<String> documentDataFieldName,
        @Nullable Input<String> documentTitleFieldName,
        @Nullable Input<List<DataSourceToIndexFieldMappingArgs>> fieldMappings,
        Input<String> name) {
        this.documentDataFieldName = Objects.requireNonNull(documentDataFieldName, "expected parameter 'documentDataFieldName' to be non-null");
        this.documentTitleFieldName = documentTitleFieldName;
        this.fieldMappings = fieldMappings;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs() {
        this.documentDataFieldName = Input.empty();
        this.documentTitleFieldName = Input.empty();
        this.fieldMappings = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> documentDataFieldName;
        private @Nullable Input<String> documentTitleFieldName;
        private @Nullable Input<List<DataSourceToIndexFieldMappingArgs>> fieldMappings;
        private Input<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentDataFieldName = defaults.documentDataFieldName;
    	      this.documentTitleFieldName = defaults.documentTitleFieldName;
    	      this.fieldMappings = defaults.fieldMappings;
    	      this.name = defaults.name;
        }

        public Builder setDocumentDataFieldName(Input<String> documentDataFieldName) {
            this.documentDataFieldName = Objects.requireNonNull(documentDataFieldName);
            return this;
        }

        public Builder setDocumentDataFieldName(String documentDataFieldName) {
            this.documentDataFieldName = Input.of(Objects.requireNonNull(documentDataFieldName));
            return this;
        }

        public Builder setDocumentTitleFieldName(@Nullable Input<String> documentTitleFieldName) {
            this.documentTitleFieldName = documentTitleFieldName;
            return this;
        }

        public Builder setDocumentTitleFieldName(@Nullable String documentTitleFieldName) {
            this.documentTitleFieldName = Input.ofNullable(documentTitleFieldName);
            return this;
        }

        public Builder setFieldMappings(@Nullable Input<List<DataSourceToIndexFieldMappingArgs>> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }

        public Builder setFieldMappings(@Nullable List<DataSourceToIndexFieldMappingArgs> fieldMappings) {
            this.fieldMappings = Input.ofNullable(fieldMappings);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs build() {
            return new DataSourceSalesforceCustomKnowledgeArticleTypeConfigurationArgs(documentDataFieldName, documentTitleFieldName, fieldMappings, name);
        }
    }
}
