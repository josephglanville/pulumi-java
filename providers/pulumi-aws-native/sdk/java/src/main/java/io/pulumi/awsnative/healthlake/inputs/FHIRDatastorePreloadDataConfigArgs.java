// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.healthlake.inputs;

import io.pulumi.awsnative.healthlake.enums.FHIRDatastorePreloadDataConfigPreloadDataType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;


/**
 * The preloaded data configuration for the Data Store. Only data preloaded from Synthea is supported.
 * 
 */
public final class FHIRDatastorePreloadDataConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FHIRDatastorePreloadDataConfigArgs Empty = new FHIRDatastorePreloadDataConfigArgs();

    /**
     * The type of preloaded data. Only Synthea preloaded data is supported.
     * 
     */
    @Import(name="preloadDataType", required=true)
      private final Output<FHIRDatastorePreloadDataConfigPreloadDataType> preloadDataType;

    public Output<FHIRDatastorePreloadDataConfigPreloadDataType> getPreloadDataType() {
        return this.preloadDataType;
    }

    public FHIRDatastorePreloadDataConfigArgs(Output<FHIRDatastorePreloadDataConfigPreloadDataType> preloadDataType) {
        this.preloadDataType = Objects.requireNonNull(preloadDataType, "expected parameter 'preloadDataType' to be non-null");
    }

    private FHIRDatastorePreloadDataConfigArgs() {
        this.preloadDataType = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FHIRDatastorePreloadDataConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<FHIRDatastorePreloadDataConfigPreloadDataType> preloadDataType;

        public Builder() {
    	      // Empty
        }

        public Builder(FHIRDatastorePreloadDataConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.preloadDataType = defaults.preloadDataType;
        }

        public Builder preloadDataType(Output<FHIRDatastorePreloadDataConfigPreloadDataType> preloadDataType) {
            this.preloadDataType = Objects.requireNonNull(preloadDataType);
            return this;
        }
        public Builder preloadDataType(FHIRDatastorePreloadDataConfigPreloadDataType preloadDataType) {
            this.preloadDataType = Output.of(Objects.requireNonNull(preloadDataType));
            return this;
        }        public FHIRDatastorePreloadDataConfigArgs build() {
            return new FHIRDatastorePreloadDataConfigArgs(preloadDataType);
        }
    }
}
