// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kendra.outputs;

import io.pulumi.awsnative.kendra.enums.DataSourceConfluencePageFieldName;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DataSourceConfluencePageToIndexFieldMapping {
    private final DataSourceConfluencePageFieldName dataSourceFieldName;
    private final @Nullable String dateFieldFormat;
    private final String indexFieldName;

    @CustomType.Constructor
    private DataSourceConfluencePageToIndexFieldMapping(
        @CustomType.Parameter("dataSourceFieldName") DataSourceConfluencePageFieldName dataSourceFieldName,
        @CustomType.Parameter("dateFieldFormat") @Nullable String dateFieldFormat,
        @CustomType.Parameter("indexFieldName") String indexFieldName) {
        this.dataSourceFieldName = dataSourceFieldName;
        this.dateFieldFormat = dateFieldFormat;
        this.indexFieldName = indexFieldName;
    }

    public DataSourceConfluencePageFieldName getDataSourceFieldName() {
        return this.dataSourceFieldName;
    }
    public Optional<String> getDateFieldFormat() {
        return Optional.ofNullable(this.dateFieldFormat);
    }
    public String getIndexFieldName() {
        return this.indexFieldName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceConfluencePageToIndexFieldMapping defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DataSourceConfluencePageFieldName dataSourceFieldName;
        private @Nullable String dateFieldFormat;
        private String indexFieldName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceConfluencePageToIndexFieldMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSourceFieldName = defaults.dataSourceFieldName;
    	      this.dateFieldFormat = defaults.dateFieldFormat;
    	      this.indexFieldName = defaults.indexFieldName;
        }

        public Builder dataSourceFieldName(DataSourceConfluencePageFieldName dataSourceFieldName) {
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
        }        public DataSourceConfluencePageToIndexFieldMapping build() {
            return new DataSourceConfluencePageToIndexFieldMapping(dataSourceFieldName, dateFieldFormat, indexFieldName);
        }
    }
}
