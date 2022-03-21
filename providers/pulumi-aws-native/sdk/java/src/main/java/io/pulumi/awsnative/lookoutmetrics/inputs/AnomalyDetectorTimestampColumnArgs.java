// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lookoutmetrics.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnomalyDetectorTimestampColumnArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnomalyDetectorTimestampColumnArgs Empty = new AnomalyDetectorTimestampColumnArgs();

    /**
     * A timestamp format for the timestamps in the dataset
     * 
     */
    @Import(name="columnFormat")
      private final @Nullable Output<String> columnFormat;

    public Output<String> getColumnFormat() {
        return this.columnFormat == null ? Output.empty() : this.columnFormat;
    }

    @Import(name="columnName")
      private final @Nullable Output<String> columnName;

    public Output<String> getColumnName() {
        return this.columnName == null ? Output.empty() : this.columnName;
    }

    public AnomalyDetectorTimestampColumnArgs(
        @Nullable Output<String> columnFormat,
        @Nullable Output<String> columnName) {
        this.columnFormat = columnFormat;
        this.columnName = columnName;
    }

    private AnomalyDetectorTimestampColumnArgs() {
        this.columnFormat = Output.empty();
        this.columnName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnomalyDetectorTimestampColumnArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> columnFormat;
        private @Nullable Output<String> columnName;

        public Builder() {
    	      // Empty
        }

        public Builder(AnomalyDetectorTimestampColumnArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.columnFormat = defaults.columnFormat;
    	      this.columnName = defaults.columnName;
        }

        public Builder columnFormat(@Nullable Output<String> columnFormat) {
            this.columnFormat = columnFormat;
            return this;
        }
        public Builder columnFormat(@Nullable String columnFormat) {
            this.columnFormat = Output.ofNullable(columnFormat);
            return this;
        }
        public Builder columnName(@Nullable Output<String> columnName) {
            this.columnName = columnName;
            return this;
        }
        public Builder columnName(@Nullable String columnName) {
            this.columnName = Output.ofNullable(columnName);
            return this;
        }        public AnomalyDetectorTimestampColumnArgs build() {
            return new AnomalyDetectorTimestampColumnArgs(columnFormat, columnName);
        }
    }
}
