// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.healthcare_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.healthcare_v1.inputs.GoogleCloudHealthcareV1FhirBigQueryDestinationArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Contains configuration for streaming FHIR export.
 * 
 */
public final class StreamConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final StreamConfigArgs Empty = new StreamConfigArgs();

    /**
     * The destination BigQuery structure that contains both the dataset location and corresponding schema config. The output is organized in one table per resource type. The server reuses the existing tables (if any) that are named after the resource types. For example, "Patient", "Observation". When there is no existing table for a given resource type, the server attempts to create one. When a table schema doesn't align with the schema config, either because of existing incompatible schema or out of band incompatible modification, the server does not stream in new data. BigQuery imposes a 1 MB limit on streaming insert row size, therefore any resource mutation that generates more than 1 MB of BigQuery data is not streamed. One resolution in this case is to delete the incompatible table and let the server recreate one, though the newly created table only contains data after the table recreation. Results are written to BigQuery tables according to the parameters in BigQueryDestination.WriteDisposition. Different versions of the same resource are distinguishable by the meta.versionId and meta.lastUpdated columns. The operation (CREATE/UPDATE/DELETE) that results in the new version is recorded in the meta.tag. The tables contain all historical resource versions since streaming was enabled. For query convenience, the server also creates one view per table of the same name containing only the current resource version. The streamed data in the BigQuery dataset is not guaranteed to be completely unique. The combination of the id and meta.versionId columns should ideally identify a single unique row. But in rare cases, duplicates may exist. At query time, users may use the SQL select statement to keep only one of the duplicate rows given an id and meta.versionId pair. Alternatively, the server created view mentioned above also filters out duplicates. If a resource mutation cannot be streamed to BigQuery, errors are logged to Cloud Logging. For more information, see [Viewing error logs in Cloud Logging](https://cloud.google.com/healthcare/docs/how-tos/logging)).
     * 
     */
    @InputImport(name="bigqueryDestination")
      private final @Nullable Output<GoogleCloudHealthcareV1FhirBigQueryDestinationArgs> bigqueryDestination;

    public Output<GoogleCloudHealthcareV1FhirBigQueryDestinationArgs> getBigqueryDestination() {
        return this.bigqueryDestination == null ? Output.empty() : this.bigqueryDestination;
    }

    /**
     * Supply a FHIR resource type (such as "Patient" or "Observation"). See https://www.hl7.org/fhir/valueset-resource-types.html for a list of all FHIR resource types. The server treats an empty list as an intent to stream all the supported resource types in this FHIR store.
     * 
     */
    @InputImport(name="resourceTypes")
      private final @Nullable Output<List<String>> resourceTypes;

    public Output<List<String>> getResourceTypes() {
        return this.resourceTypes == null ? Output.empty() : this.resourceTypes;
    }

    public StreamConfigArgs(
        @Nullable Output<GoogleCloudHealthcareV1FhirBigQueryDestinationArgs> bigqueryDestination,
        @Nullable Output<List<String>> resourceTypes) {
        this.bigqueryDestination = bigqueryDestination;
        this.resourceTypes = resourceTypes;
    }

    private StreamConfigArgs() {
        this.bigqueryDestination = Output.empty();
        this.resourceTypes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(StreamConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudHealthcareV1FhirBigQueryDestinationArgs> bigqueryDestination;
        private @Nullable Output<List<String>> resourceTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(StreamConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryDestination = defaults.bigqueryDestination;
    	      this.resourceTypes = defaults.resourceTypes;
        }

        public Builder bigqueryDestination(@Nullable Output<GoogleCloudHealthcareV1FhirBigQueryDestinationArgs> bigqueryDestination) {
            this.bigqueryDestination = bigqueryDestination;
            return this;
        }

        public Builder bigqueryDestination(@Nullable GoogleCloudHealthcareV1FhirBigQueryDestinationArgs bigqueryDestination) {
            this.bigqueryDestination = Output.ofNullable(bigqueryDestination);
            return this;
        }

        public Builder resourceTypes(@Nullable Output<List<String>> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }

        public Builder resourceTypes(@Nullable List<String> resourceTypes) {
            this.resourceTypes = Output.ofNullable(resourceTypes);
            return this;
        }
        public StreamConfigArgs build() {
            return new StreamConfigArgs(bigqueryDestination, resourceTypes);
        }
    }
}
