// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsvGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsvGetArgs Empty = new AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsvGetArgs();

    /**
     * The Column Delimiter.
     * 
     */
    @Import(name="recordColumnDelimiter", required=true)
      private final Output<String> recordColumnDelimiter;

    public Output<String> getRecordColumnDelimiter() {
        return this.recordColumnDelimiter;
    }

    /**
     * The Row Delimiter.
     * 
     */
    @Import(name="recordRowDelimiter", required=true)
      private final Output<String> recordRowDelimiter;

    public Output<String> getRecordRowDelimiter() {
        return this.recordRowDelimiter;
    }

    public AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsvGetArgs(
        Output<String> recordColumnDelimiter,
        Output<String> recordRowDelimiter) {
        this.recordColumnDelimiter = Objects.requireNonNull(recordColumnDelimiter, "expected parameter 'recordColumnDelimiter' to be non-null");
        this.recordRowDelimiter = Objects.requireNonNull(recordRowDelimiter, "expected parameter 'recordRowDelimiter' to be non-null");
    }

    private AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsvGetArgs() {
        this.recordColumnDelimiter = Output.empty();
        this.recordRowDelimiter = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsvGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> recordColumnDelimiter;
        private Output<String> recordRowDelimiter;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsvGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordColumnDelimiter = defaults.recordColumnDelimiter;
    	      this.recordRowDelimiter = defaults.recordRowDelimiter;
        }

        public Builder recordColumnDelimiter(Output<String> recordColumnDelimiter) {
            this.recordColumnDelimiter = Objects.requireNonNull(recordColumnDelimiter);
            return this;
        }
        public Builder recordColumnDelimiter(String recordColumnDelimiter) {
            this.recordColumnDelimiter = Output.of(Objects.requireNonNull(recordColumnDelimiter));
            return this;
        }
        public Builder recordRowDelimiter(Output<String> recordRowDelimiter) {
            this.recordRowDelimiter = Objects.requireNonNull(recordRowDelimiter);
            return this;
        }
        public Builder recordRowDelimiter(String recordRowDelimiter) {
            this.recordRowDelimiter = Output.of(Objects.requireNonNull(recordRowDelimiter));
            return this;
        }        public AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsvGetArgs build() {
            return new AnalyticsApplicationInputsSchemaRecordFormatMappingParametersCsvGetArgs(recordColumnDelimiter, recordRowDelimiter);
        }
    }
}