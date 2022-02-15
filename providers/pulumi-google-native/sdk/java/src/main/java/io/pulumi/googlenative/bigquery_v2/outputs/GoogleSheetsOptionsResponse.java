// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleSheetsOptionsResponse {
    private final String range;
    private final String skipLeadingRows;

    @OutputCustomType.Constructor({"range","skipLeadingRows"})
    private GoogleSheetsOptionsResponse(
        String range,
        String skipLeadingRows) {
        this.range = Objects.requireNonNull(range);
        this.skipLeadingRows = Objects.requireNonNull(skipLeadingRows);
    }

    public String getRange() {
        return this.range;
    }
    public String getSkipLeadingRows() {
        return this.skipLeadingRows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleSheetsOptionsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String range;
        private String skipLeadingRows;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleSheetsOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.range = defaults.range;
    	      this.skipLeadingRows = defaults.skipLeadingRows;
        }

        public Builder setRange(String range) {
            this.range = Objects.requireNonNull(range);
            return this;
        }

        public Builder setSkipLeadingRows(String skipLeadingRows) {
            this.skipLeadingRows = Objects.requireNonNull(skipLeadingRows);
            return this;
        }

        public GoogleSheetsOptionsResponse build() {
            return new GoogleSheetsOptionsResponse(range, skipLeadingRows);
        }
    }
}