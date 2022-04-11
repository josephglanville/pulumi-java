// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.healthcare.inputs.DicomStoreStreamConfigBigqueryDestinationArgs;
import java.util.Objects;


public final class DicomStoreStreamConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DicomStoreStreamConfigArgs Empty = new DicomStoreStreamConfigArgs();

    /**
     * BigQueryDestination to include a fully qualified BigQuery table URI where DICOM instance metadata will be streamed.
     * Structure is documented below.
     * 
     */
    @Import(name="bigqueryDestination", required=true)
      private final Output<DicomStoreStreamConfigBigqueryDestinationArgs> bigqueryDestination;

    public Output<DicomStoreStreamConfigBigqueryDestinationArgs> getBigqueryDestination() {
        return this.bigqueryDestination;
    }

    public DicomStoreStreamConfigArgs(Output<DicomStoreStreamConfigBigqueryDestinationArgs> bigqueryDestination) {
        this.bigqueryDestination = Objects.requireNonNull(bigqueryDestination, "expected parameter 'bigqueryDestination' to be non-null");
    }

    private DicomStoreStreamConfigArgs() {
        this.bigqueryDestination = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomStoreStreamConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<DicomStoreStreamConfigBigqueryDestinationArgs> bigqueryDestination;

        public Builder() {
    	      // Empty
        }

        public Builder(DicomStoreStreamConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryDestination = defaults.bigqueryDestination;
        }

        public Builder bigqueryDestination(Output<DicomStoreStreamConfigBigqueryDestinationArgs> bigqueryDestination) {
            this.bigqueryDestination = Objects.requireNonNull(bigqueryDestination);
            return this;
        }
        public Builder bigqueryDestination(DicomStoreStreamConfigBigqueryDestinationArgs bigqueryDestination) {
            this.bigqueryDestination = Output.of(Objects.requireNonNull(bigqueryDestination));
            return this;
        }        public DicomStoreStreamConfigArgs build() {
            return new DicomStoreStreamConfigArgs(bigqueryDestination);
        }
    }
}
