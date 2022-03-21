// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.bigquery_v2.outputs.DatasetReferenceResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DatasetAccessEntryResponse {
    /**
     * [Required] The dataset this entry applies to.
     * 
     */
    private final DatasetReferenceResponse dataset;
    private final List<String> targetTypes;

    @CustomType.Constructor
    private DatasetAccessEntryResponse(
        @CustomType.Parameter("dataset") DatasetReferenceResponse dataset,
        @CustomType.Parameter("targetTypes") List<String> targetTypes) {
        this.dataset = dataset;
        this.targetTypes = targetTypes;
    }

    /**
     * [Required] The dataset this entry applies to.
     * 
    */
    public DatasetReferenceResponse getDataset() {
        return this.dataset;
    }
    public List<String> getTargetTypes() {
        return this.targetTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DatasetAccessEntryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatasetReferenceResponse dataset;
        private List<String> targetTypes;

        public Builder() {
    	      // Empty
        }

        public Builder(DatasetAccessEntryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.targetTypes = defaults.targetTypes;
        }

        public Builder dataset(DatasetReferenceResponse dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }
        public Builder targetTypes(List<String> targetTypes) {
            this.targetTypes = Objects.requireNonNull(targetTypes);
            return this;
        }
        public Builder targetTypes(String... targetTypes) {
            return targetTypes(List.of(targetTypes));
        }        public DatasetAccessEntryResponse build() {
            return new DatasetAccessEntryResponse(dataset, targetTypes);
        }
    }
}
