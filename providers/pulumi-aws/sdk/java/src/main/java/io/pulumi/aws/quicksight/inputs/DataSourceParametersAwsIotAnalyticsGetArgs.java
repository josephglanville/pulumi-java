// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.quicksight.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class DataSourceParametersAwsIotAnalyticsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceParametersAwsIotAnalyticsGetArgs Empty = new DataSourceParametersAwsIotAnalyticsGetArgs();

    /**
     * The name of the data set to which to connect.
     * 
     */
    @Import(name="dataSetName", required=true)
      private final Output<String> dataSetName;

    public Output<String> getDataSetName() {
        return this.dataSetName;
    }

    public DataSourceParametersAwsIotAnalyticsGetArgs(Output<String> dataSetName) {
        this.dataSetName = Objects.requireNonNull(dataSetName, "expected parameter 'dataSetName' to be non-null");
    }

    private DataSourceParametersAwsIotAnalyticsGetArgs() {
        this.dataSetName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParametersAwsIotAnalyticsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dataSetName;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParametersAwsIotAnalyticsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSetName = defaults.dataSetName;
        }

        public Builder dataSetName(Output<String> dataSetName) {
            this.dataSetName = Objects.requireNonNull(dataSetName);
            return this;
        }
        public Builder dataSetName(String dataSetName) {
            this.dataSetName = Output.of(Objects.requireNonNull(dataSetName));
            return this;
        }        public DataSourceParametersAwsIotAnalyticsGetArgs build() {
            return new DataSourceParametersAwsIotAnalyticsGetArgs(dataSetName);
        }
    }
}
