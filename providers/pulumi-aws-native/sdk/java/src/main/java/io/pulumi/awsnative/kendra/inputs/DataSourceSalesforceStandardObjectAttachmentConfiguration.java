// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.inputs.DataSourceToIndexFieldMapping;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceSalesforceStandardObjectAttachmentConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceSalesforceStandardObjectAttachmentConfiguration Empty = new DataSourceSalesforceStandardObjectAttachmentConfiguration();

    @InputImport(name="documentTitleFieldName")
      private final @Nullable String documentTitleFieldName;

    public Optional<String> getDocumentTitleFieldName() {
        return this.documentTitleFieldName == null ? Optional.empty() : Optional.ofNullable(this.documentTitleFieldName);
    }

    @InputImport(name="fieldMappings")
      private final @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;

    public List<DataSourceToIndexFieldMapping> getFieldMappings() {
        return this.fieldMappings == null ? List.of() : this.fieldMappings;
    }

    public DataSourceSalesforceStandardObjectAttachmentConfiguration(
        @Nullable String documentTitleFieldName,
        @Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
        this.documentTitleFieldName = documentTitleFieldName;
        this.fieldMappings = fieldMappings;
    }

    private DataSourceSalesforceStandardObjectAttachmentConfiguration() {
        this.documentTitleFieldName = null;
        this.fieldMappings = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceSalesforceStandardObjectAttachmentConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String documentTitleFieldName;
        private @Nullable List<DataSourceToIndexFieldMapping> fieldMappings;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceSalesforceStandardObjectAttachmentConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentTitleFieldName = defaults.documentTitleFieldName;
    	      this.fieldMappings = defaults.fieldMappings;
        }

        public Builder setDocumentTitleFieldName(@Nullable String documentTitleFieldName) {
            this.documentTitleFieldName = documentTitleFieldName;
            return this;
        }

        public Builder setFieldMappings(@Nullable List<DataSourceToIndexFieldMapping> fieldMappings) {
            this.fieldMappings = fieldMappings;
            return this;
        }
        public DataSourceSalesforceStandardObjectAttachmentConfiguration build() {
            return new DataSourceSalesforceStandardObjectAttachmentConfiguration(documentTitleFieldName, fieldMappings);
        }
    }
}
