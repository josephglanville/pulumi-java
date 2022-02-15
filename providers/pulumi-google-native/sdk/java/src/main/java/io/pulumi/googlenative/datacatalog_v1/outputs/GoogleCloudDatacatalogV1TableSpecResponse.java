// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GoogleCloudDatacatalogV1TableSpecResponse {
    private final String groupedEntry;

    @OutputCustomType.Constructor({"groupedEntry"})
    private GoogleCloudDatacatalogV1TableSpecResponse(String groupedEntry) {
        this.groupedEntry = Objects.requireNonNull(groupedEntry);
    }

    public String getGroupedEntry() {
        return this.groupedEntry;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDatacatalogV1TableSpecResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String groupedEntry;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDatacatalogV1TableSpecResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupedEntry = defaults.groupedEntry;
        }

        public Builder setGroupedEntry(String groupedEntry) {
            this.groupedEntry = Objects.requireNonNull(groupedEntry);
            return this;
        }

        public GoogleCloudDatacatalogV1TableSpecResponse build() {
            return new GoogleCloudDatacatalogV1TableSpecResponse(groupedEntry);
        }
    }
}