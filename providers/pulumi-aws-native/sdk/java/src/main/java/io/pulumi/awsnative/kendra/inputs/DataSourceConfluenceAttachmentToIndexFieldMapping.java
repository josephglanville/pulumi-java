// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.inputs;

import io.pulumi.awsnative.kendra.enums.DataSourceConfluenceAttachmentFieldName;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DataSourceConfluenceAttachmentToIndexFieldMapping extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceConfluenceAttachmentToIndexFieldMapping Empty = new DataSourceConfluenceAttachmentToIndexFieldMapping();

    @Import(name="dataSourceFieldName", required=true)
      private final DataSourceConfluenceAttachmentFieldName dataSourceFieldName;

    public DataSourceConfluenceAttachmentFieldName getDataSourceFieldName() {
        return this.dataSourceFieldName;
    }

    @Import(name="dateFieldFormat")
      private final @Nullable String dateFieldFormat;

    public Optional<String> getDateFieldFormat() {
        return this.dateFieldFormat == null ? Optional.empty() : Optional.ofNullable(this.dateFieldFormat);
    }

    @Import(name="indexFieldName", required=true)
      private final String indexFieldName;

    public String getIndexFieldName() {
        return this.indexFieldName;
    }

    public DataSourceConfluenceAttachmentToIndexFieldMapping(
        DataSourceConfluenceAttachmentFieldName dataSourceFieldName,
        @Nullable String dateFieldFormat,
        String indexFieldName) {
        this.dataSourceFieldName = Objects.requireNonNull(dataSourceFieldName, "expected parameter 'dataSourceFieldName' to be non-null");
        this.dateFieldFormat = dateFieldFormat;
        this.indexFieldName = Objects.requireNonNull(indexFieldName, "expected parameter 'indexFieldName' to be non-null");
    }

    private DataSourceConfluenceAttachmentToIndexFieldMapping() {
        this.dataSourceFieldName = null;
        this.dateFieldFormat = null;
        this.indexFieldName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConfluenceAttachmentToIndexFieldMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceConfluenceAttachmentFieldName dataSourceFieldName;
        private @Nullable String dateFieldFormat;
        private String indexFieldName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConfluenceAttachmentToIndexFieldMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSourceFieldName = defaults.dataSourceFieldName;
    	      this.dateFieldFormat = defaults.dateFieldFormat;
    	      this.indexFieldName = defaults.indexFieldName;
        }

        public Builder dataSourceFieldName(DataSourceConfluenceAttachmentFieldName dataSourceFieldName) {
            this.dataSourceFieldName = Objects.requireNonNull(dataSourceFieldName);
            return this;
        }
        public Builder dateFieldFormat(@Nullable String dateFieldFormat) {
            this.dateFieldFormat = dateFieldFormat;
            return this;
        }
        public Builder indexFieldName(String indexFieldName) {
            this.indexFieldName = Objects.requireNonNull(indexFieldName);
            return this;
        }        public DataSourceConfluenceAttachmentToIndexFieldMapping build() {
            return new DataSourceConfluenceAttachmentToIndexFieldMapping(dataSourceFieldName, dateFieldFormat, indexFieldName);
        }
    }
}
