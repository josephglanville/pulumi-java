// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigBigqueryDestinationGetArgs;
import java.util.Objects;


public final class DicomStoreStreamConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final DicomStoreStreamConfigGetArgs Empty = new DicomStoreStreamConfigGetArgs();

    /**
     * BigQueryDestination to include a fully qualified BigQuery table URI where DICOM instance metadata will be streamed.
     * Structure is documented below.
     * 
     */
    @InputImport(name="bigqueryDestination", required=true)
      private final Input<DicomStoreStreamConfigBigqueryDestinationGetArgs> bigqueryDestination;

    public Input<DicomStoreStreamConfigBigqueryDestinationGetArgs> getBigqueryDestination() {
        return this.bigqueryDestination;
    }

    public DicomStoreStreamConfigGetArgs(Input<DicomStoreStreamConfigBigqueryDestinationGetArgs> bigqueryDestination) {
        this.bigqueryDestination = Objects.requireNonNull(bigqueryDestination, "expected parameter 'bigqueryDestination' to be non-null");
    }

    private DicomStoreStreamConfigGetArgs() {
        this.bigqueryDestination = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomStoreStreamConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<DicomStoreStreamConfigBigqueryDestinationGetArgs> bigqueryDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(DicomStoreStreamConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryDestination = defaults.bigqueryDestination;
        }

        public Builder setBigqueryDestination(Input<DicomStoreStreamConfigBigqueryDestinationGetArgs> bigqueryDestination) {
            this.bigqueryDestination = Objects.requireNonNull(bigqueryDestination);
            return this;
        }

        public Builder setBigqueryDestination(DicomStoreStreamConfigBigqueryDestinationGetArgs bigqueryDestination) {
            this.bigqueryDestination = Input.of(Objects.requireNonNull(bigqueryDestination));
            return this;
        }
        public DicomStoreStreamConfigGetArgs build() {
            return new DicomStoreStreamConfigGetArgs(bigqueryDestination);
        }
    }
}
