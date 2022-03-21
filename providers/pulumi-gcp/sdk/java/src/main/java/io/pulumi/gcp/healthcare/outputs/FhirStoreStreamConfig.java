// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.healthcare.outputs.FhirStoreStreamConfigBigqueryDestination;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class FhirStoreStreamConfig {
    /**
     * The destination BigQuery structure that contains both the dataset location and corresponding schema config.
     * The output is organized in one table per resource type. The server reuses the existing tables (if any) that
     * are named after the resource types, e.g. "Patient", "Observation". When there is no existing table for a given
     * resource type, the server attempts to create one.
     * See the [streaming config reference](https://cloud.google.com/healthcare/docs/reference/rest/v1beta1/projects.locations.datasets.fhirStores#streamconfig) for more details.
     * Structure is documented below.
     * 
     */
    private final FhirStoreStreamConfigBigqueryDestination bigqueryDestination;
    /**
     * Supply a FHIR resource type (such as "Patient" or "Observation"). See
     * https://www.hl7.org/fhir/valueset-resource-types.html for a list of all FHIR resource types. The server treats
     * an empty list as an intent to stream all the supported resource types in this FHIR store.
     * 
     */
    private final @Nullable List<String> resourceTypes;

    @CustomType.Constructor
    private FhirStoreStreamConfig(
        @CustomType.Parameter("bigqueryDestination") FhirStoreStreamConfigBigqueryDestination bigqueryDestination,
        @CustomType.Parameter("resourceTypes") @Nullable List<String> resourceTypes) {
        this.bigqueryDestination = bigqueryDestination;
        this.resourceTypes = resourceTypes;
    }

    /**
     * The destination BigQuery structure that contains both the dataset location and corresponding schema config.
     * The output is organized in one table per resource type. The server reuses the existing tables (if any) that
     * are named after the resource types, e.g. "Patient", "Observation". When there is no existing table for a given
     * resource type, the server attempts to create one.
     * See the [streaming config reference](https://cloud.google.com/healthcare/docs/reference/rest/v1beta1/projects.locations.datasets.fhirStores#streamconfig) for more details.
     * Structure is documented below.
     * 
    */
    public FhirStoreStreamConfigBigqueryDestination getBigqueryDestination() {
        return this.bigqueryDestination;
    }
    /**
     * Supply a FHIR resource type (such as "Patient" or "Observation"). See
     * https://www.hl7.org/fhir/valueset-resource-types.html for a list of all FHIR resource types. The server treats
     * an empty list as an intent to stream all the supported resource types in this FHIR store.
     * 
    */
    public List<String> getResourceTypes() {
        return this.resourceTypes == null ? List.of() : this.resourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FhirStoreStreamConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private FhirStoreStreamConfigBigqueryDestination bigqueryDestination;
        private @Nullable List<String> resourceTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(FhirStoreStreamConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bigqueryDestination = defaults.bigqueryDestination;
    	      this.resourceTypes = defaults.resourceTypes;
        }

        public Builder bigqueryDestination(FhirStoreStreamConfigBigqueryDestination bigqueryDestination) {
            this.bigqueryDestination = Objects.requireNonNull(bigqueryDestination);
            return this;
        }
        public Builder resourceTypes(@Nullable List<String> resourceTypes) {
            this.resourceTypes = resourceTypes;
            return this;
        }
        public Builder resourceTypes(String... resourceTypes) {
            return resourceTypes(List.of(resourceTypes));
        }        public FhirStoreStreamConfig build() {
            return new FhirStoreStreamConfig(bigqueryDestination, resourceTypes);
        }
    }
}
