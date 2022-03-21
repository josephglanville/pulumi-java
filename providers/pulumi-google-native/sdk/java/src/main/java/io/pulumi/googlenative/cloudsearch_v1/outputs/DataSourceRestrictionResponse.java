// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudsearch_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.cloudsearch_v1.outputs.FilterOptionsResponse;
import io.pulumi.googlenative.cloudsearch_v1.outputs.SourceResponse;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DataSourceRestrictionResponse {
    /**
     * Filter options restricting the results. If multiple filters are present, they are grouped by object type before joining. Filters with the same object type are joined conjunctively, then the resulting expressions are joined disjunctively. The maximum number of elements is 20. NOTE: Suggest API supports only few filters at the moment: "objecttype", "type" and "mimetype". For now, schema specific filters cannot be used to filter suggestions.
     * 
     */
    private final List<FilterOptionsResponse> filterOptions;
    /**
     * The source of restriction.
     * 
     */
    private final SourceResponse source;

    @CustomType.Constructor
    private DataSourceRestrictionResponse(
        @CustomType.Parameter("filterOptions") List<FilterOptionsResponse> filterOptions,
        @CustomType.Parameter("source") SourceResponse source) {
        this.filterOptions = filterOptions;
        this.source = source;
    }

    /**
     * Filter options restricting the results. If multiple filters are present, they are grouped by object type before joining. Filters with the same object type are joined conjunctively, then the resulting expressions are joined disjunctively. The maximum number of elements is 20. NOTE: Suggest API supports only few filters at the moment: "objecttype", "type" and "mimetype". For now, schema specific filters cannot be used to filter suggestions.
     * 
    */
    public List<FilterOptionsResponse> getFilterOptions() {
        return this.filterOptions;
    }
    /**
     * The source of restriction.
     * 
    */
    public SourceResponse getSource() {
        return this.source;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceRestrictionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<FilterOptionsResponse> filterOptions;
        private SourceResponse source;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceRestrictionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterOptions = defaults.filterOptions;
    	      this.source = defaults.source;
        }

        public Builder filterOptions(List<FilterOptionsResponse> filterOptions) {
            this.filterOptions = Objects.requireNonNull(filterOptions);
            return this;
        }
        public Builder filterOptions(FilterOptionsResponse... filterOptions) {
            return filterOptions(List.of(filterOptions));
        }
        public Builder source(SourceResponse source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }        public DataSourceRestrictionResponse build() {
            return new DataSourceRestrictionResponse(filterOptions, source);
        }
    }
}
