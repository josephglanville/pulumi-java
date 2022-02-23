// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.bigquery.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableExternalDataConfigurationGoogleSheetsOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final TableExternalDataConfigurationGoogleSheetsOptionsArgs Empty = new TableExternalDataConfigurationGoogleSheetsOptionsArgs();

    /**
     * Information required to partition based on ranges.
     * Structure is documented below.
     * 
     */
    @InputImport(name="range")
      private final @Nullable Input<String> range;

    public Input<String> getRange() {
        return this.range == null ? Input.empty() : this.range;
    }

    /**
     * The number of rows at the top of the sheet
     * that BigQuery will skip when reading the data. At least one of `range` or
     * `skip_leading_rows` must be set.
     * 
     */
    @InputImport(name="skipLeadingRows")
      private final @Nullable Input<Integer> skipLeadingRows;

    public Input<Integer> getSkipLeadingRows() {
        return this.skipLeadingRows == null ? Input.empty() : this.skipLeadingRows;
    }

    public TableExternalDataConfigurationGoogleSheetsOptionsArgs(
        @Nullable Input<String> range,
        @Nullable Input<Integer> skipLeadingRows) {
        this.range = range;
        this.skipLeadingRows = skipLeadingRows;
    }

    private TableExternalDataConfigurationGoogleSheetsOptionsArgs() {
        this.range = Input.empty();
        this.skipLeadingRows = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableExternalDataConfigurationGoogleSheetsOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> range;
        private @Nullable Input<Integer> skipLeadingRows;

        public Builder() {
    	      // Empty
        }

        public Builder(TableExternalDataConfigurationGoogleSheetsOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.range = defaults.range;
    	      this.skipLeadingRows = defaults.skipLeadingRows;
        }

        public Builder setRange(@Nullable Input<String> range) {
            this.range = range;
            return this;
        }

        public Builder setRange(@Nullable String range) {
            this.range = Input.ofNullable(range);
            return this;
        }

        public Builder setSkipLeadingRows(@Nullable Input<Integer> skipLeadingRows) {
            this.skipLeadingRows = skipLeadingRows;
            return this;
        }

        public Builder setSkipLeadingRows(@Nullable Integer skipLeadingRows) {
            this.skipLeadingRows = Input.ofNullable(skipLeadingRows);
            return this;
        }
        public TableExternalDataConfigurationGoogleSheetsOptionsArgs build() {
            return new TableExternalDataConfigurationGoogleSheetsOptionsArgs(range, skipLeadingRows);
        }
    }
}
