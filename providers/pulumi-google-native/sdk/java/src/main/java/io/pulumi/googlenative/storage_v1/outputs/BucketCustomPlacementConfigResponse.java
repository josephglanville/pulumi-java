// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.storage_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BucketCustomPlacementConfigResponse {
    /**
     * The list of regional locations in which data is placed.
     * 
     */
    private final List<String> dataLocations;

    @CustomType.Constructor
    private BucketCustomPlacementConfigResponse(@CustomType.Parameter("dataLocations") List<String> dataLocations) {
        this.dataLocations = dataLocations;
    }

    /**
     * The list of regional locations in which data is placed.
     * 
    */
    public List<String> getDataLocations() {
        return this.dataLocations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketCustomPlacementConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> dataLocations;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketCustomPlacementConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataLocations = defaults.dataLocations;
        }

        public Builder dataLocations(List<String> dataLocations) {
            this.dataLocations = Objects.requireNonNull(dataLocations);
            return this;
        }
        public Builder dataLocations(String... dataLocations) {
            return dataLocations(List.of(dataLocations));
        }        public BucketCustomPlacementConfigResponse build() {
            return new BucketCustomPlacementConfigResponse(dataLocations);
        }
    }
}
