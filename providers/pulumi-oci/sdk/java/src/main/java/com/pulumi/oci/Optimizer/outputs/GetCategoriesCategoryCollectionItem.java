// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Optimizer.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Optimizer.outputs.GetCategoriesCategoryCollectionItemRecommendationCount;
import com.pulumi.oci.Optimizer.outputs.GetCategoriesCategoryCollectionItemResourceCount;
import java.lang.Double;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetCategoriesCategoryCollectionItem {
    /**
     * @return The OCID of the compartment.
     * 
     */
    private final String compartmentId;
    /**
     * @return Text describing the category.
     * 
     */
    private final String description;
    /**
     * @return The estimated cost savings, in dollars, for the category.
     * 
     */
    private final Double estimatedCostSaving;
    /**
     * @return Additional metadata key/value pairs for the category.
     * 
     */
    private final Map<String,Object> extendedMetadata;
    /**
     * @return The unique OCID of the category.
     * 
     */
    private final String id;
    /**
     * @return Optional. A filter that returns results that match the name specified.
     * 
     */
    private final String name;
    /**
     * @return An array of `RecommendationCount` objects grouped by the level of importance assigned to the recommendation.
     * 
     */
    private final List<GetCategoriesCategoryCollectionItemRecommendationCount> recommendationCounts;
    /**
     * @return An array of `ResourceCount` objects grouped by the status of the recommendation.
     * 
     */
    private final List<GetCategoriesCategoryCollectionItemResourceCount> resourceCounts;
    /**
     * @return A filter that returns results that match the lifecycle state specified.
     * 
     */
    private final String state;
    /**
     * @return The date and time the category details were created, in the format defined by RFC3339.
     * 
     */
    private final String timeCreated;
    /**
     * @return The date and time the category details were last updated, in the format defined by RFC3339.
     * 
     */
    private final String timeUpdated;

    @CustomType.Constructor
    private GetCategoriesCategoryCollectionItem(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("estimatedCostSaving") Double estimatedCostSaving,
        @CustomType.Parameter("extendedMetadata") Map<String,Object> extendedMetadata,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("recommendationCounts") List<GetCategoriesCategoryCollectionItemRecommendationCount> recommendationCounts,
        @CustomType.Parameter("resourceCounts") List<GetCategoriesCategoryCollectionItemResourceCount> resourceCounts,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated) {
        this.compartmentId = compartmentId;
        this.description = description;
        this.estimatedCostSaving = estimatedCostSaving;
        this.extendedMetadata = extendedMetadata;
        this.id = id;
        this.name = name;
        this.recommendationCounts = recommendationCounts;
        this.resourceCounts = resourceCounts;
        this.state = state;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    /**
     * @return The OCID of the compartment.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return Text describing the category.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The estimated cost savings, in dollars, for the category.
     * 
     */
    public Double estimatedCostSaving() {
        return this.estimatedCostSaving;
    }
    /**
     * @return Additional metadata key/value pairs for the category.
     * 
     */
    public Map<String,Object> extendedMetadata() {
        return this.extendedMetadata;
    }
    /**
     * @return The unique OCID of the category.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Optional. A filter that returns results that match the name specified.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return An array of `RecommendationCount` objects grouped by the level of importance assigned to the recommendation.
     * 
     */
    public List<GetCategoriesCategoryCollectionItemRecommendationCount> recommendationCounts() {
        return this.recommendationCounts;
    }
    /**
     * @return An array of `ResourceCount` objects grouped by the status of the recommendation.
     * 
     */
    public List<GetCategoriesCategoryCollectionItemResourceCount> resourceCounts() {
        return this.resourceCounts;
    }
    /**
     * @return A filter that returns results that match the lifecycle state specified.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The date and time the category details were created, in the format defined by RFC3339.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The date and time the category details were last updated, in the format defined by RFC3339.
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCategoriesCategoryCollectionItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private String description;
        private Double estimatedCostSaving;
        private Map<String,Object> extendedMetadata;
        private String id;
        private String name;
        private List<GetCategoriesCategoryCollectionItemRecommendationCount> recommendationCounts;
        private List<GetCategoriesCategoryCollectionItemResourceCount> resourceCounts;
        private String state;
        private String timeCreated;
        private String timeUpdated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCategoriesCategoryCollectionItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.description = defaults.description;
    	      this.estimatedCostSaving = defaults.estimatedCostSaving;
    	      this.extendedMetadata = defaults.extendedMetadata;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.recommendationCounts = defaults.recommendationCounts;
    	      this.resourceCounts = defaults.resourceCounts;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder estimatedCostSaving(Double estimatedCostSaving) {
            this.estimatedCostSaving = Objects.requireNonNull(estimatedCostSaving);
            return this;
        }
        public Builder extendedMetadata(Map<String,Object> extendedMetadata) {
            this.extendedMetadata = Objects.requireNonNull(extendedMetadata);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder recommendationCounts(List<GetCategoriesCategoryCollectionItemRecommendationCount> recommendationCounts) {
            this.recommendationCounts = Objects.requireNonNull(recommendationCounts);
            return this;
        }
        public Builder recommendationCounts(GetCategoriesCategoryCollectionItemRecommendationCount... recommendationCounts) {
            return recommendationCounts(List.of(recommendationCounts));
        }
        public Builder resourceCounts(List<GetCategoriesCategoryCollectionItemResourceCount> resourceCounts) {
            this.resourceCounts = Objects.requireNonNull(resourceCounts);
            return this;
        }
        public Builder resourceCounts(GetCategoriesCategoryCollectionItemResourceCount... resourceCounts) {
            return resourceCounts(List.of(resourceCounts));
        }
        public Builder state(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder timeCreated(String timeCreated) {
            this.timeCreated = Objects.requireNonNull(timeCreated);
            return this;
        }
        public Builder timeUpdated(String timeUpdated) {
            this.timeUpdated = Objects.requireNonNull(timeUpdated);
            return this;
        }        public GetCategoriesCategoryCollectionItem build() {
            return new GetCategoriesCategoryCollectionItem(compartmentId, description, estimatedCostSaving, extendedMetadata, id, name, recommendationCounts, resourceCounts, state, timeCreated, timeUpdated);
        }
    }
}
