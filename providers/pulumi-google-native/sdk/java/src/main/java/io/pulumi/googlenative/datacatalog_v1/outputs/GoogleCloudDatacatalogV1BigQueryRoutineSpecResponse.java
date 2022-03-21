// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse {
    /**
     * Paths of the imported libraries.
     * 
     */
    private final List<String> importedLibraries;

    @CustomType.Constructor
    private GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse(@CustomType.Parameter("importedLibraries") List<String> importedLibraries) {
        this.importedLibraries = importedLibraries;
    }

    /**
     * Paths of the imported libraries.
     * 
    */
    public List<String> getImportedLibraries() {
        return this.importedLibraries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> importedLibraries;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.importedLibraries = defaults.importedLibraries;
        }

        public Builder importedLibraries(List<String> importedLibraries) {
            this.importedLibraries = Objects.requireNonNull(importedLibraries);
            return this;
        }
        public Builder importedLibraries(String... importedLibraries) {
            return importedLibraries(List.of(importedLibraries));
        }        public GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse build() {
            return new GoogleCloudDatacatalogV1BigQueryRoutineSpecResponse(importedLibraries);
        }
    }
}
