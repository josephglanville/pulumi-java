// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dlp_v2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.dlp_v2.enums.GooglePrivacyDlpV2BigQueryOptionsSampleMethod;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2BigQueryTableArgs;
import io.pulumi.googlenative.dlp_v2.inputs.GooglePrivacyDlpV2FieldIdArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Options defining BigQuery table and row identifiers.
 * 
 */
public final class GooglePrivacyDlpV2BigQueryOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final GooglePrivacyDlpV2BigQueryOptionsArgs Empty = new GooglePrivacyDlpV2BigQueryOptionsArgs();

    /**
     * References to fields excluded from scanning. This allows you to skip inspection of entire columns which you know have no findings.
     * 
     */
    @Import(name="excludedFields")
      private final @Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> excludedFields;

    public Output<List<GooglePrivacyDlpV2FieldIdArgs>> getExcludedFields() {
        return this.excludedFields == null ? Output.empty() : this.excludedFields;
    }

    /**
     * Table fields that may uniquely identify a row within the table. When `actions.saveFindings.outputConfig.table` is specified, the values of columns specified here are available in the output table under `location.content_locations.record_location.record_key.id_values`. Nested fields such as `person.birthdate.year` are allowed.
     * 
     */
    @Import(name="identifyingFields")
      private final @Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> identifyingFields;

    public Output<List<GooglePrivacyDlpV2FieldIdArgs>> getIdentifyingFields() {
        return this.identifyingFields == null ? Output.empty() : this.identifyingFields;
    }

    /**
     * Limit scanning only to these fields.
     * 
     */
    @Import(name="includedFields")
      private final @Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> includedFields;

    public Output<List<GooglePrivacyDlpV2FieldIdArgs>> getIncludedFields() {
        return this.includedFields == null ? Output.empty() : this.includedFields;
    }

    /**
     * Max number of rows to scan. If the table has more rows than this value, the rest of the rows are omitted. If not set, or if set to 0, all rows will be scanned. Only one of rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
     * 
     */
    @Import(name="rowsLimit")
      private final @Nullable Output<String> rowsLimit;

    public Output<String> getRowsLimit() {
        return this.rowsLimit == null ? Output.empty() : this.rowsLimit;
    }

    /**
     * Max percentage of rows to scan. The rest are omitted. The number of rows scanned is rounded down. Must be between 0 and 100, inclusively. Both 0 and 100 means no limit. Defaults to 0. Only one of rows_limit and rows_limit_percent can be specified. Cannot be used in conjunction with TimespanConfig.
     * 
     */
    @Import(name="rowsLimitPercent")
      private final @Nullable Output<Integer> rowsLimitPercent;

    public Output<Integer> getRowsLimitPercent() {
        return this.rowsLimitPercent == null ? Output.empty() : this.rowsLimitPercent;
    }

    @Import(name="sampleMethod")
      private final @Nullable Output<GooglePrivacyDlpV2BigQueryOptionsSampleMethod> sampleMethod;

    public Output<GooglePrivacyDlpV2BigQueryOptionsSampleMethod> getSampleMethod() {
        return this.sampleMethod == null ? Output.empty() : this.sampleMethod;
    }

    /**
     * Complete BigQuery table reference.
     * 
     */
    @Import(name="tableReference")
      private final @Nullable Output<GooglePrivacyDlpV2BigQueryTableArgs> tableReference;

    public Output<GooglePrivacyDlpV2BigQueryTableArgs> getTableReference() {
        return this.tableReference == null ? Output.empty() : this.tableReference;
    }

    public GooglePrivacyDlpV2BigQueryOptionsArgs(
        @Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> excludedFields,
        @Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> identifyingFields,
        @Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> includedFields,
        @Nullable Output<String> rowsLimit,
        @Nullable Output<Integer> rowsLimitPercent,
        @Nullable Output<GooglePrivacyDlpV2BigQueryOptionsSampleMethod> sampleMethod,
        @Nullable Output<GooglePrivacyDlpV2BigQueryTableArgs> tableReference) {
        this.excludedFields = excludedFields;
        this.identifyingFields = identifyingFields;
        this.includedFields = includedFields;
        this.rowsLimit = rowsLimit;
        this.rowsLimitPercent = rowsLimitPercent;
        this.sampleMethod = sampleMethod;
        this.tableReference = tableReference;
    }

    private GooglePrivacyDlpV2BigQueryOptionsArgs() {
        this.excludedFields = Output.empty();
        this.identifyingFields = Output.empty();
        this.includedFields = Output.empty();
        this.rowsLimit = Output.empty();
        this.rowsLimitPercent = Output.empty();
        this.sampleMethod = Output.empty();
        this.tableReference = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GooglePrivacyDlpV2BigQueryOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> excludedFields;
        private @Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> identifyingFields;
        private @Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> includedFields;
        private @Nullable Output<String> rowsLimit;
        private @Nullable Output<Integer> rowsLimitPercent;
        private @Nullable Output<GooglePrivacyDlpV2BigQueryOptionsSampleMethod> sampleMethod;
        private @Nullable Output<GooglePrivacyDlpV2BigQueryTableArgs> tableReference;

        public Builder() {
    	      // Empty
        }

        public Builder(GooglePrivacyDlpV2BigQueryOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.excludedFields = defaults.excludedFields;
    	      this.identifyingFields = defaults.identifyingFields;
    	      this.includedFields = defaults.includedFields;
    	      this.rowsLimit = defaults.rowsLimit;
    	      this.rowsLimitPercent = defaults.rowsLimitPercent;
    	      this.sampleMethod = defaults.sampleMethod;
    	      this.tableReference = defaults.tableReference;
        }

        public Builder excludedFields(@Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> excludedFields) {
            this.excludedFields = excludedFields;
            return this;
        }
        public Builder excludedFields(@Nullable List<GooglePrivacyDlpV2FieldIdArgs> excludedFields) {
            this.excludedFields = Output.ofNullable(excludedFields);
            return this;
        }
        public Builder excludedFields(GooglePrivacyDlpV2FieldIdArgs... excludedFields) {
            return excludedFields(List.of(excludedFields));
        }
        public Builder identifyingFields(@Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> identifyingFields) {
            this.identifyingFields = identifyingFields;
            return this;
        }
        public Builder identifyingFields(@Nullable List<GooglePrivacyDlpV2FieldIdArgs> identifyingFields) {
            this.identifyingFields = Output.ofNullable(identifyingFields);
            return this;
        }
        public Builder identifyingFields(GooglePrivacyDlpV2FieldIdArgs... identifyingFields) {
            return identifyingFields(List.of(identifyingFields));
        }
        public Builder includedFields(@Nullable Output<List<GooglePrivacyDlpV2FieldIdArgs>> includedFields) {
            this.includedFields = includedFields;
            return this;
        }
        public Builder includedFields(@Nullable List<GooglePrivacyDlpV2FieldIdArgs> includedFields) {
            this.includedFields = Output.ofNullable(includedFields);
            return this;
        }
        public Builder includedFields(GooglePrivacyDlpV2FieldIdArgs... includedFields) {
            return includedFields(List.of(includedFields));
        }
        public Builder rowsLimit(@Nullable Output<String> rowsLimit) {
            this.rowsLimit = rowsLimit;
            return this;
        }
        public Builder rowsLimit(@Nullable String rowsLimit) {
            this.rowsLimit = Output.ofNullable(rowsLimit);
            return this;
        }
        public Builder rowsLimitPercent(@Nullable Output<Integer> rowsLimitPercent) {
            this.rowsLimitPercent = rowsLimitPercent;
            return this;
        }
        public Builder rowsLimitPercent(@Nullable Integer rowsLimitPercent) {
            this.rowsLimitPercent = Output.ofNullable(rowsLimitPercent);
            return this;
        }
        public Builder sampleMethod(@Nullable Output<GooglePrivacyDlpV2BigQueryOptionsSampleMethod> sampleMethod) {
            this.sampleMethod = sampleMethod;
            return this;
        }
        public Builder sampleMethod(@Nullable GooglePrivacyDlpV2BigQueryOptionsSampleMethod sampleMethod) {
            this.sampleMethod = Output.ofNullable(sampleMethod);
            return this;
        }
        public Builder tableReference(@Nullable Output<GooglePrivacyDlpV2BigQueryTableArgs> tableReference) {
            this.tableReference = tableReference;
            return this;
        }
        public Builder tableReference(@Nullable GooglePrivacyDlpV2BigQueryTableArgs tableReference) {
            this.tableReference = Output.ofNullable(tableReference);
            return this;
        }        public GooglePrivacyDlpV2BigQueryOptionsArgs build() {
            return new GooglePrivacyDlpV2BigQueryOptionsArgs(excludedFields, identifyingFields, includedFields, rowsLimit, rowsLimitPercent, sampleMethod, tableReference);
        }
    }
}
