// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ClusterResourceUsageExportConfigBigqueryDestinationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterResourceUsageExportConfigBigqueryDestinationGetArgs Empty = new ClusterResourceUsageExportConfigBigqueryDestinationGetArgs();

    @InputImport(name="datasetId", required=true)
    private final Input<String> datasetId;

    public Input<String> getDatasetId() {
        return this.datasetId;
    }

    public ClusterResourceUsageExportConfigBigqueryDestinationGetArgs(Input<String> datasetId) {
        this.datasetId = Objects.requireNonNull(datasetId, "expected parameter 'datasetId' to be non-null");
    }

    private ClusterResourceUsageExportConfigBigqueryDestinationGetArgs() {
        this.datasetId = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterResourceUsageExportConfigBigqueryDestinationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> datasetId;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterResourceUsageExportConfigBigqueryDestinationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datasetId = defaults.datasetId;
        }

        public Builder setDatasetId(Input<String> datasetId) {
            this.datasetId = Objects.requireNonNull(datasetId);
            return this;
        }

        public Builder setDatasetId(String datasetId) {
            this.datasetId = Input.of(Objects.requireNonNull(datasetId));
            return this;
        }

        public ClusterResourceUsageExportConfigBigqueryDestinationGetArgs build() {
            return new ClusterResourceUsageExportConfigBigqueryDestinationGetArgs(datasetId);
        }
    }
}