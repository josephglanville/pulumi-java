// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.databrew.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DatasetCsvOptions {
    private final @Nullable String delimiter;
    private final @Nullable Boolean headerRow;

    @CustomType.Constructor
    private DatasetCsvOptions(
        @CustomType.Parameter("delimiter") @Nullable String delimiter,
        @CustomType.Parameter("headerRow") @Nullable Boolean headerRow) {
        this.delimiter = delimiter;
        this.headerRow = headerRow;
    }

    public Optional<String> getDelimiter() {
        return Optional.ofNullable(this.delimiter);
    }
    public Optional<Boolean> getHeaderRow() {
        return Optional.ofNullable(this.headerRow);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetCsvOptions defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String delimiter;
        private @Nullable Boolean headerRow;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetCsvOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delimiter = defaults.delimiter;
    	      this.headerRow = defaults.headerRow;
        }

        public Builder delimiter(@Nullable String delimiter) {
            this.delimiter = delimiter;
            return this;
        }
        public Builder headerRow(@Nullable Boolean headerRow) {
            this.headerRow = headerRow;
            return this;
        }        public DatasetCsvOptions build() {
            return new DatasetCsvOptions(delimiter, headerRow);
        }
    }
}
