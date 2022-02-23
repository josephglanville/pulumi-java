// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs Empty = new RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs();

    /**
     * The list of label value pairs that must match labels in the provided metadata
     * based on filterMatchCriteria  This list must not be empty and can have at the
     * most 64 entries.
     * Structure is documented below.
     * 
     */
    @InputImport(name="filterLabels", required=true)
      private final Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs>> filterLabels;

    public Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs>> getFilterLabels() {
        return this.filterLabels;
    }

    /**
     * Specifies how individual filterLabel matches within the list of filterLabels
     * contribute towards the overall metadataFilter match. Supported values are:
     * * MATCH_ANY: At least one of the filterLabels must have a matching label in the
     *   provided metadata.
     * * MATCH_ALL: All filterLabels must have matching labels in
     *   the provided metadata.
     *   Possible values are `MATCH_ALL` and `MATCH_ANY`.
     * 
     */
    @InputImport(name="filterMatchCriteria", required=true)
      private final Input<String> filterMatchCriteria;

    public Input<String> getFilterMatchCriteria() {
        return this.filterMatchCriteria;
    }

    public RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs(
        Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs>> filterLabels,
        Input<String> filterMatchCriteria) {
        this.filterLabels = Objects.requireNonNull(filterLabels, "expected parameter 'filterLabels' to be non-null");
        this.filterMatchCriteria = Objects.requireNonNull(filterMatchCriteria, "expected parameter 'filterMatchCriteria' to be non-null");
    }

    private RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs() {
        this.filterLabels = Input.empty();
        this.filterMatchCriteria = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs>> filterLabels;
        private Input<String> filterMatchCriteria;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterLabels = defaults.filterLabels;
    	      this.filterMatchCriteria = defaults.filterMatchCriteria;
        }

        public Builder setFilterLabels(Input<List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs>> filterLabels) {
            this.filterLabels = Objects.requireNonNull(filterLabels);
            return this;
        }

        public Builder setFilterLabels(List<RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterFilterLabelArgs> filterLabels) {
            this.filterLabels = Input.of(Objects.requireNonNull(filterLabels));
            return this;
        }

        public Builder setFilterMatchCriteria(Input<String> filterMatchCriteria) {
            this.filterMatchCriteria = Objects.requireNonNull(filterMatchCriteria);
            return this;
        }

        public Builder setFilterMatchCriteria(String filterMatchCriteria) {
            this.filterMatchCriteria = Input.of(Objects.requireNonNull(filterMatchCriteria));
            return this;
        }
        public RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs build() {
            return new RegionUrlMapPathMatcherRouteRuleMatchRuleMetadataFilterArgs(filterLabels, filterMatchCriteria);
        }
    }
}
