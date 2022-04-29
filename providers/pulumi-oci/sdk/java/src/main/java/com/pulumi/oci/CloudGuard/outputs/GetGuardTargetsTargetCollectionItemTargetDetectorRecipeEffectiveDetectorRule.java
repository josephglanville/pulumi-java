// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.CloudGuard.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.CloudGuard.outputs.GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetail;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRule {
    /**
     * @return ResponderRule Description
     * 
     */
    private final String description;
    /**
     * @return Details of ResponderRule.
     * 
     */
    private final List<GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetail> details;
    /**
     * @return detector for the rule
     * 
     */
    private final String detector;
    /**
     * @return The unique identifier of the detector rule
     * 
     */
    private final String detectorRuleId;
    /**
     * @return A filter to return only resources that match the entire display name given.
     * 
     */
    private final String displayName;
    /**
     * @return A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    private final String lifecycleDetails;
    /**
     * @return List of cloudguard managed list types related to this rule
     * 
     */
    private final List<String> managedListTypes;
    /**
     * @return Recommendation for TargetDetectorRecipeDetectorRule
     * 
     */
    private final String recommendation;
    /**
     * @return resource type of the configuration to which the rule is applied
     * 
     */
    private final String resourceType;
    /**
     * @return service type of the configuration to which the rule is applied
     * 
     */
    private final String serviceType;
    /**
     * @return The field life cycle state. Only one state can be provided. Default value for state is active. If no value is specified state is active.
     * 
     */
    private final String state;
    /**
     * @return The date and time the target was created. Format defined by RFC3339.
     * 
     */
    private final String timeCreated;
    /**
     * @return The date and time the target was updated. Format defined by RFC3339.
     * 
     */
    private final String timeUpdated;

    @CustomType.Constructor
    private GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRule(
        @CustomType.Parameter("description") String description,
        @CustomType.Parameter("details") List<GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetail> details,
        @CustomType.Parameter("detector") String detector,
        @CustomType.Parameter("detectorRuleId") String detectorRuleId,
        @CustomType.Parameter("displayName") String displayName,
        @CustomType.Parameter("lifecycleDetails") String lifecycleDetails,
        @CustomType.Parameter("managedListTypes") List<String> managedListTypes,
        @CustomType.Parameter("recommendation") String recommendation,
        @CustomType.Parameter("resourceType") String resourceType,
        @CustomType.Parameter("serviceType") String serviceType,
        @CustomType.Parameter("state") String state,
        @CustomType.Parameter("timeCreated") String timeCreated,
        @CustomType.Parameter("timeUpdated") String timeUpdated) {
        this.description = description;
        this.details = details;
        this.detector = detector;
        this.detectorRuleId = detectorRuleId;
        this.displayName = displayName;
        this.lifecycleDetails = lifecycleDetails;
        this.managedListTypes = managedListTypes;
        this.recommendation = recommendation;
        this.resourceType = resourceType;
        this.serviceType = serviceType;
        this.state = state;
        this.timeCreated = timeCreated;
        this.timeUpdated = timeUpdated;
    }

    /**
     * @return ResponderRule Description
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return Details of ResponderRule.
     * 
     */
    public List<GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetail> details() {
        return this.details;
    }
    /**
     * @return detector for the rule
     * 
     */
    public String detector() {
        return this.detector;
    }
    /**
     * @return The unique identifier of the detector rule
     * 
     */
    public String detectorRuleId() {
        return this.detectorRuleId;
    }
    /**
     * @return A filter to return only resources that match the entire display name given.
     * 
     */
    public String displayName() {
        return this.displayName;
    }
    /**
     * @return A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in Failed state.
     * 
     */
    public String lifecycleDetails() {
        return this.lifecycleDetails;
    }
    /**
     * @return List of cloudguard managed list types related to this rule
     * 
     */
    public List<String> managedListTypes() {
        return this.managedListTypes;
    }
    /**
     * @return Recommendation for TargetDetectorRecipeDetectorRule
     * 
     */
    public String recommendation() {
        return this.recommendation;
    }
    /**
     * @return resource type of the configuration to which the rule is applied
     * 
     */
    public String resourceType() {
        return this.resourceType;
    }
    /**
     * @return service type of the configuration to which the rule is applied
     * 
     */
    public String serviceType() {
        return this.serviceType;
    }
    /**
     * @return The field life cycle state. Only one state can be provided. Default value for state is active. If no value is specified state is active.
     * 
     */
    public String state() {
        return this.state;
    }
    /**
     * @return The date and time the target was created. Format defined by RFC3339.
     * 
     */
    public String timeCreated() {
        return this.timeCreated;
    }
    /**
     * @return The date and time the target was updated. Format defined by RFC3339.
     * 
     */
    public String timeUpdated() {
        return this.timeUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRule defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String description;
        private List<GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetail> details;
        private String detector;
        private String detectorRuleId;
        private String displayName;
        private String lifecycleDetails;
        private List<String> managedListTypes;
        private String recommendation;
        private String resourceType;
        private String serviceType;
        private String state;
        private String timeCreated;
        private String timeUpdated;

        public Builder() {
    	      // Empty
        }

        public Builder(GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.details = defaults.details;
    	      this.detector = defaults.detector;
    	      this.detectorRuleId = defaults.detectorRuleId;
    	      this.displayName = defaults.displayName;
    	      this.lifecycleDetails = defaults.lifecycleDetails;
    	      this.managedListTypes = defaults.managedListTypes;
    	      this.recommendation = defaults.recommendation;
    	      this.resourceType = defaults.resourceType;
    	      this.serviceType = defaults.serviceType;
    	      this.state = defaults.state;
    	      this.timeCreated = defaults.timeCreated;
    	      this.timeUpdated = defaults.timeUpdated;
        }

        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        public Builder details(List<GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetail> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }
        public Builder details(GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRuleDetail... details) {
            return details(List.of(details));
        }
        public Builder detector(String detector) {
            this.detector = Objects.requireNonNull(detector);
            return this;
        }
        public Builder detectorRuleId(String detectorRuleId) {
            this.detectorRuleId = Objects.requireNonNull(detectorRuleId);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = Objects.requireNonNull(lifecycleDetails);
            return this;
        }
        public Builder managedListTypes(List<String> managedListTypes) {
            this.managedListTypes = Objects.requireNonNull(managedListTypes);
            return this;
        }
        public Builder managedListTypes(String... managedListTypes) {
            return managedListTypes(List.of(managedListTypes));
        }
        public Builder recommendation(String recommendation) {
            this.recommendation = Objects.requireNonNull(recommendation);
            return this;
        }
        public Builder resourceType(String resourceType) {
            this.resourceType = Objects.requireNonNull(resourceType);
            return this;
        }
        public Builder serviceType(String serviceType) {
            this.serviceType = Objects.requireNonNull(serviceType);
            return this;
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
        }        public GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRule build() {
            return new GetGuardTargetsTargetCollectionItemTargetDetectorRecipeEffectiveDetectorRule(description, details, detector, detectorRuleId, displayName, lifecycleDetails, managedListTypes, recommendation, resourceType, serviceType, state, timeCreated, timeUpdated);
        }
    }
}
