// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.compute.outputs.GlobalForwardingRuleMetadataFilterFilterLabel;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GlobalForwardingRuleMetadataFilter {
    /**
     * The list of label value pairs that must match labels in the
     * provided metadata based on filterMatchCriteria
     * This list must not be empty and can have at the most 64 entries.
     * Structure is documented below.
     * 
     */
    private final List<GlobalForwardingRuleMetadataFilterFilterLabel> filterLabels;
    /**
     * Specifies how individual filterLabel matches within the list of
     * filterLabels contribute towards the overall metadataFilter match.
     * MATCH_ANY - At least one of the filterLabels must have a matching
     * label in the provided metadata.
     * MATCH_ALL - All filterLabels must have matching labels in the
     * provided metadata.
     * Possible values are `MATCH_ANY` and `MATCH_ALL`.
     * 
     */
    private final String filterMatchCriteria;

    @CustomType.Constructor
    private GlobalForwardingRuleMetadataFilter(
        @CustomType.Parameter("filterLabels") List<GlobalForwardingRuleMetadataFilterFilterLabel> filterLabels,
        @CustomType.Parameter("filterMatchCriteria") String filterMatchCriteria) {
        this.filterLabels = filterLabels;
        this.filterMatchCriteria = filterMatchCriteria;
    }

    /**
     * The list of label value pairs that must match labels in the
     * provided metadata based on filterMatchCriteria
     * This list must not be empty and can have at the most 64 entries.
     * Structure is documented below.
     * 
    */
    public List<GlobalForwardingRuleMetadataFilterFilterLabel> getFilterLabels() {
        return this.filterLabels;
    }
    /**
     * Specifies how individual filterLabel matches within the list of
     * filterLabels contribute towards the overall metadataFilter match.
     * MATCH_ANY - At least one of the filterLabels must have a matching
     * label in the provided metadata.
     * MATCH_ALL - All filterLabels must have matching labels in the
     * provided metadata.
     * Possible values are `MATCH_ANY` and `MATCH_ALL`.
     * 
    */
    public String getFilterMatchCriteria() {
        return this.filterMatchCriteria;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GlobalForwardingRuleMetadataFilter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<GlobalForwardingRuleMetadataFilterFilterLabel> filterLabels;
        private String filterMatchCriteria;

        public Builder() {
    	      // Empty
        }

        public Builder(GlobalForwardingRuleMetadataFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filterLabels = defaults.filterLabels;
    	      this.filterMatchCriteria = defaults.filterMatchCriteria;
        }

        public Builder filterLabels(List<GlobalForwardingRuleMetadataFilterFilterLabel> filterLabels) {
            this.filterLabels = Objects.requireNonNull(filterLabels);
            return this;
        }
        public Builder filterLabels(GlobalForwardingRuleMetadataFilterFilterLabel... filterLabels) {
            return filterLabels(List.of(filterLabels));
        }
        public Builder filterMatchCriteria(String filterMatchCriteria) {
            this.filterMatchCriteria = Objects.requireNonNull(filterMatchCriteria);
            return this;
        }        public GlobalForwardingRuleMetadataFilter build() {
            return new GlobalForwardingRuleMetadataFilter(filterLabels, filterMatchCriteria);
        }
    }
}
