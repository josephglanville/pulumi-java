// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.kinesis.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AnalyticsApplicationOutputSchemaArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnalyticsApplicationOutputSchemaArgs Empty = new AnalyticsApplicationOutputSchemaArgs();

    /**
     * The Format Type of the records on the output stream. Can be `CSV` or `JSON`.
     * 
     */
    @Import(name="recordFormatType", required=true)
      private final Output<String> recordFormatType;

    public Output<String> getRecordFormatType() {
        return this.recordFormatType;
    }

    public AnalyticsApplicationOutputSchemaArgs(Output<String> recordFormatType) {
        this.recordFormatType = Objects.requireNonNull(recordFormatType, "expected parameter 'recordFormatType' to be non-null");
    }

    private AnalyticsApplicationOutputSchemaArgs() {
        this.recordFormatType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnalyticsApplicationOutputSchemaArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> recordFormatType;

        public Builder() {
    	      // Empty
        }

        public Builder(AnalyticsApplicationOutputSchemaArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.recordFormatType = defaults.recordFormatType;
        }

        public Builder recordFormatType(Output<String> recordFormatType) {
            this.recordFormatType = Objects.requireNonNull(recordFormatType);
            return this;
        }
        public Builder recordFormatType(String recordFormatType) {
            this.recordFormatType = Output.of(Objects.requireNonNull(recordFormatType));
            return this;
        }        public AnalyticsApplicationOutputSchemaArgs build() {
            return new AnalyticsApplicationOutputSchemaArgs(recordFormatType);
        }
    }
}