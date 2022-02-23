// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetDataSetArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDataSetArgs Empty = new GetDataSetArgs();

    @InputImport(name="awsAccountId", required=true)
      private final String awsAccountId;

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    @InputImport(name="dataSetId", required=true)
      private final String dataSetId;

    public String getDataSetId() {
        return this.dataSetId;
    }

    public GetDataSetArgs(
        String awsAccountId,
        String dataSetId) {
        this.awsAccountId = Objects.requireNonNull(awsAccountId, "expected parameter 'awsAccountId' to be non-null");
        this.dataSetId = Objects.requireNonNull(dataSetId, "expected parameter 'dataSetId' to be non-null");
    }

    private GetDataSetArgs() {
        this.awsAccountId = null;
        this.dataSetId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDataSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String awsAccountId;
        private String dataSetId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDataSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsAccountId = defaults.awsAccountId;
    	      this.dataSetId = defaults.dataSetId;
        }

        public Builder setAwsAccountId(String awsAccountId) {
            this.awsAccountId = Objects.requireNonNull(awsAccountId);
            return this;
        }

        public Builder setDataSetId(String dataSetId) {
            this.dataSetId = Objects.requireNonNull(dataSetId);
            return this;
        }
        public GetDataSetArgs build() {
            return new GetDataSetArgs(awsAccountId, dataSetId);
        }
    }
}
