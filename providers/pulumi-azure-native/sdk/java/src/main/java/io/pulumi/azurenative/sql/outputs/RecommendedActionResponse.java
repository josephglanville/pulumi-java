// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.azurenative.sql.outputs.RecommendedActionErrorInfoResponse;
import io.pulumi.azurenative.sql.outputs.RecommendedActionImpactRecordResponse;
import io.pulumi.azurenative.sql.outputs.RecommendedActionImplementationInfoResponse;
import io.pulumi.azurenative.sql.outputs.RecommendedActionMetricInfoResponse;
import io.pulumi.azurenative.sql.outputs.RecommendedActionStateInfoResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class RecommendedActionResponse {
    /**
     * Gets additional details specific to this recommended action.
     * 
     */
    private final Map<String,Object> details;
    /**
     * Gets the error details if and why this recommended action is put to error state.
     * 
     */
    private final RecommendedActionErrorInfoResponse errorDetails;
    /**
     * Gets the estimated impact info for this recommended action e.g., Estimated CPU gain, Estimated Disk Space change
     * 
     */
    private final List<RecommendedActionImpactRecordResponse> estimatedImpact;
    /**
     * Gets the time taken for applying this recommended action on user resource. e.g., time taken for index creation
     * 
     */
    private final String executeActionDuration;
    /**
     * Gets if approval for applying this recommended action was given by user/system.
     * 
     */
    private final String executeActionInitiatedBy;
    /**
     * Gets the time when this recommended action was approved for execution.
     * 
     */
    private final String executeActionInitiatedTime;
    /**
     * Gets the time when system started applying this recommended action on the user resource. e.g., index creation start time
     * 
     */
    private final String executeActionStartTime;
    /**
     * Resource ID.
     * 
     */
    private final String id;
    /**
     * Gets the implementation details of this recommended action for user to apply it manually.
     * 
     */
    private final RecommendedActionImplementationInfoResponse implementationDetails;
    /**
     * Gets if this recommended action was suggested some time ago but user chose to ignore this and system added a new recommended action again.
     * 
     */
    private final Boolean isArchivedAction;
    /**
     * Gets if this recommended action is actionable by user
     * 
     */
    private final Boolean isExecutableAction;
    /**
     * Gets if changes applied by this recommended action can be reverted by user
     * 
     */
    private final Boolean isRevertableAction;
    /**
     * Resource kind.
     * 
     */
    private final String kind;
    /**
     * Gets time when this recommended action was last refreshed.
     * 
     */
    private final String lastRefresh;
    /**
     * Gets the linked objects, if any.
     * 
     */
    private final List<String> linkedObjects;
    /**
     * Resource location.
     * 
     */
    private final String location;
    /**
     * Resource name.
     * 
     */
    private final String name;
    /**
     * Gets the observed/actual impact info for this recommended action e.g., Actual CPU gain, Actual Disk Space change
     * 
     */
    private final List<RecommendedActionImpactRecordResponse> observedImpact;
    /**
     * Gets the reason for recommending this action. e.g., DuplicateIndex
     * 
     */
    private final String recommendationReason;
    /**
     * Gets the time taken for reverting changes of this recommended action on user resource. e.g., time taken for dropping the created index.
     * 
     */
    private final String revertActionDuration;
    /**
     * Gets if approval for reverting this recommended action was given by user/system.
     * 
     */
    private final String revertActionInitiatedBy;
    /**
     * Gets the time when this recommended action was approved for revert.
     * 
     */
    private final String revertActionInitiatedTime;
    /**
     * Gets the time when system started reverting changes of this recommended action on user resource. e.g., time when index drop is executed.
     * 
     */
    private final String revertActionStartTime;
    /**
     * Gets the impact of this recommended action. Possible values are 1 - Low impact, 2 - Medium Impact and 3 - High Impact
     * 
     */
    private final Integer score;
    /**
     * Gets the info of the current state the recommended action is in.
     * 
     */
    private final RecommendedActionStateInfoResponse state;
    /**
     * Gets the time series info of metrics for this recommended action e.g., CPU consumption time series
     * 
     */
    private final List<RecommendedActionMetricInfoResponse> timeSeries;
    /**
     * Resource type.
     * 
     */
    private final String type;
    /**
     * Gets the time since when this recommended action is valid.
     * 
     */
    private final String validSince;

    @CustomType.Constructor
    private RecommendedActionResponse(
        @CustomType.Parameter("details") Map<String,Object> details,
        @CustomType.Parameter("errorDetails") RecommendedActionErrorInfoResponse errorDetails,
        @CustomType.Parameter("estimatedImpact") List<RecommendedActionImpactRecordResponse> estimatedImpact,
        @CustomType.Parameter("executeActionDuration") String executeActionDuration,
        @CustomType.Parameter("executeActionInitiatedBy") String executeActionInitiatedBy,
        @CustomType.Parameter("executeActionInitiatedTime") String executeActionInitiatedTime,
        @CustomType.Parameter("executeActionStartTime") String executeActionStartTime,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("implementationDetails") RecommendedActionImplementationInfoResponse implementationDetails,
        @CustomType.Parameter("isArchivedAction") Boolean isArchivedAction,
        @CustomType.Parameter("isExecutableAction") Boolean isExecutableAction,
        @CustomType.Parameter("isRevertableAction") Boolean isRevertableAction,
        @CustomType.Parameter("kind") String kind,
        @CustomType.Parameter("lastRefresh") String lastRefresh,
        @CustomType.Parameter("linkedObjects") List<String> linkedObjects,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("observedImpact") List<RecommendedActionImpactRecordResponse> observedImpact,
        @CustomType.Parameter("recommendationReason") String recommendationReason,
        @CustomType.Parameter("revertActionDuration") String revertActionDuration,
        @CustomType.Parameter("revertActionInitiatedBy") String revertActionInitiatedBy,
        @CustomType.Parameter("revertActionInitiatedTime") String revertActionInitiatedTime,
        @CustomType.Parameter("revertActionStartTime") String revertActionStartTime,
        @CustomType.Parameter("score") Integer score,
        @CustomType.Parameter("state") RecommendedActionStateInfoResponse state,
        @CustomType.Parameter("timeSeries") List<RecommendedActionMetricInfoResponse> timeSeries,
        @CustomType.Parameter("type") String type,
        @CustomType.Parameter("validSince") String validSince) {
        this.details = details;
        this.errorDetails = errorDetails;
        this.estimatedImpact = estimatedImpact;
        this.executeActionDuration = executeActionDuration;
        this.executeActionInitiatedBy = executeActionInitiatedBy;
        this.executeActionInitiatedTime = executeActionInitiatedTime;
        this.executeActionStartTime = executeActionStartTime;
        this.id = id;
        this.implementationDetails = implementationDetails;
        this.isArchivedAction = isArchivedAction;
        this.isExecutableAction = isExecutableAction;
        this.isRevertableAction = isRevertableAction;
        this.kind = kind;
        this.lastRefresh = lastRefresh;
        this.linkedObjects = linkedObjects;
        this.location = location;
        this.name = name;
        this.observedImpact = observedImpact;
        this.recommendationReason = recommendationReason;
        this.revertActionDuration = revertActionDuration;
        this.revertActionInitiatedBy = revertActionInitiatedBy;
        this.revertActionInitiatedTime = revertActionInitiatedTime;
        this.revertActionStartTime = revertActionStartTime;
        this.score = score;
        this.state = state;
        this.timeSeries = timeSeries;
        this.type = type;
        this.validSince = validSince;
    }

    /**
     * Gets additional details specific to this recommended action.
     * 
    */
    public Map<String,Object> getDetails() {
        return this.details;
    }
    /**
     * Gets the error details if and why this recommended action is put to error state.
     * 
    */
    public RecommendedActionErrorInfoResponse getErrorDetails() {
        return this.errorDetails;
    }
    /**
     * Gets the estimated impact info for this recommended action e.g., Estimated CPU gain, Estimated Disk Space change
     * 
    */
    public List<RecommendedActionImpactRecordResponse> getEstimatedImpact() {
        return this.estimatedImpact;
    }
    /**
     * Gets the time taken for applying this recommended action on user resource. e.g., time taken for index creation
     * 
    */
    public String getExecuteActionDuration() {
        return this.executeActionDuration;
    }
    /**
     * Gets if approval for applying this recommended action was given by user/system.
     * 
    */
    public String getExecuteActionInitiatedBy() {
        return this.executeActionInitiatedBy;
    }
    /**
     * Gets the time when this recommended action was approved for execution.
     * 
    */
    public String getExecuteActionInitiatedTime() {
        return this.executeActionInitiatedTime;
    }
    /**
     * Gets the time when system started applying this recommended action on the user resource. e.g., index creation start time
     * 
    */
    public String getExecuteActionStartTime() {
        return this.executeActionStartTime;
    }
    /**
     * Resource ID.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Gets the implementation details of this recommended action for user to apply it manually.
     * 
    */
    public RecommendedActionImplementationInfoResponse getImplementationDetails() {
        return this.implementationDetails;
    }
    /**
     * Gets if this recommended action was suggested some time ago but user chose to ignore this and system added a new recommended action again.
     * 
    */
    public Boolean getIsArchivedAction() {
        return this.isArchivedAction;
    }
    /**
     * Gets if this recommended action is actionable by user
     * 
    */
    public Boolean getIsExecutableAction() {
        return this.isExecutableAction;
    }
    /**
     * Gets if changes applied by this recommended action can be reverted by user
     * 
    */
    public Boolean getIsRevertableAction() {
        return this.isRevertableAction;
    }
    /**
     * Resource kind.
     * 
    */
    public String getKind() {
        return this.kind;
    }
    /**
     * Gets time when this recommended action was last refreshed.
     * 
    */
    public String getLastRefresh() {
        return this.lastRefresh;
    }
    /**
     * Gets the linked objects, if any.
     * 
    */
    public List<String> getLinkedObjects() {
        return this.linkedObjects;
    }
    /**
     * Resource location.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * Resource name.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Gets the observed/actual impact info for this recommended action e.g., Actual CPU gain, Actual Disk Space change
     * 
    */
    public List<RecommendedActionImpactRecordResponse> getObservedImpact() {
        return this.observedImpact;
    }
    /**
     * Gets the reason for recommending this action. e.g., DuplicateIndex
     * 
    */
    public String getRecommendationReason() {
        return this.recommendationReason;
    }
    /**
     * Gets the time taken for reverting changes of this recommended action on user resource. e.g., time taken for dropping the created index.
     * 
    */
    public String getRevertActionDuration() {
        return this.revertActionDuration;
    }
    /**
     * Gets if approval for reverting this recommended action was given by user/system.
     * 
    */
    public String getRevertActionInitiatedBy() {
        return this.revertActionInitiatedBy;
    }
    /**
     * Gets the time when this recommended action was approved for revert.
     * 
    */
    public String getRevertActionInitiatedTime() {
        return this.revertActionInitiatedTime;
    }
    /**
     * Gets the time when system started reverting changes of this recommended action on user resource. e.g., time when index drop is executed.
     * 
    */
    public String getRevertActionStartTime() {
        return this.revertActionStartTime;
    }
    /**
     * Gets the impact of this recommended action. Possible values are 1 - Low impact, 2 - Medium Impact and 3 - High Impact
     * 
    */
    public Integer getScore() {
        return this.score;
    }
    /**
     * Gets the info of the current state the recommended action is in.
     * 
    */
    public RecommendedActionStateInfoResponse getState() {
        return this.state;
    }
    /**
     * Gets the time series info of metrics for this recommended action e.g., CPU consumption time series
     * 
    */
    public List<RecommendedActionMetricInfoResponse> getTimeSeries() {
        return this.timeSeries;
    }
    /**
     * Resource type.
     * 
    */
    public String getType() {
        return this.type;
    }
    /**
     * Gets the time since when this recommended action is valid.
     * 
    */
    public String getValidSince() {
        return this.validSince;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RecommendedActionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Map<String,Object> details;
        private RecommendedActionErrorInfoResponse errorDetails;
        private List<RecommendedActionImpactRecordResponse> estimatedImpact;
        private String executeActionDuration;
        private String executeActionInitiatedBy;
        private String executeActionInitiatedTime;
        private String executeActionStartTime;
        private String id;
        private RecommendedActionImplementationInfoResponse implementationDetails;
        private Boolean isArchivedAction;
        private Boolean isExecutableAction;
        private Boolean isRevertableAction;
        private String kind;
        private String lastRefresh;
        private List<String> linkedObjects;
        private String location;
        private String name;
        private List<RecommendedActionImpactRecordResponse> observedImpact;
        private String recommendationReason;
        private String revertActionDuration;
        private String revertActionInitiatedBy;
        private String revertActionInitiatedTime;
        private String revertActionStartTime;
        private Integer score;
        private RecommendedActionStateInfoResponse state;
        private List<RecommendedActionMetricInfoResponse> timeSeries;
        private String type;
        private String validSince;

        public Builder() {
    	      // Empty
        }

        public Builder(RecommendedActionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.details = defaults.details;
    	      this.errorDetails = defaults.errorDetails;
    	      this.estimatedImpact = defaults.estimatedImpact;
    	      this.executeActionDuration = defaults.executeActionDuration;
    	      this.executeActionInitiatedBy = defaults.executeActionInitiatedBy;
    	      this.executeActionInitiatedTime = defaults.executeActionInitiatedTime;
    	      this.executeActionStartTime = defaults.executeActionStartTime;
    	      this.id = defaults.id;
    	      this.implementationDetails = defaults.implementationDetails;
    	      this.isArchivedAction = defaults.isArchivedAction;
    	      this.isExecutableAction = defaults.isExecutableAction;
    	      this.isRevertableAction = defaults.isRevertableAction;
    	      this.kind = defaults.kind;
    	      this.lastRefresh = defaults.lastRefresh;
    	      this.linkedObjects = defaults.linkedObjects;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.observedImpact = defaults.observedImpact;
    	      this.recommendationReason = defaults.recommendationReason;
    	      this.revertActionDuration = defaults.revertActionDuration;
    	      this.revertActionInitiatedBy = defaults.revertActionInitiatedBy;
    	      this.revertActionInitiatedTime = defaults.revertActionInitiatedTime;
    	      this.revertActionStartTime = defaults.revertActionStartTime;
    	      this.score = defaults.score;
    	      this.state = defaults.state;
    	      this.timeSeries = defaults.timeSeries;
    	      this.type = defaults.type;
    	      this.validSince = defaults.validSince;
        }

        public Builder details(Map<String,Object> details) {
            this.details = Objects.requireNonNull(details);
            return this;
        }
        public Builder errorDetails(RecommendedActionErrorInfoResponse errorDetails) {
            this.errorDetails = Objects.requireNonNull(errorDetails);
            return this;
        }
        public Builder estimatedImpact(List<RecommendedActionImpactRecordResponse> estimatedImpact) {
            this.estimatedImpact = Objects.requireNonNull(estimatedImpact);
            return this;
        }
        public Builder estimatedImpact(RecommendedActionImpactRecordResponse... estimatedImpact) {
            return estimatedImpact(List.of(estimatedImpact));
        }
        public Builder executeActionDuration(String executeActionDuration) {
            this.executeActionDuration = Objects.requireNonNull(executeActionDuration);
            return this;
        }
        public Builder executeActionInitiatedBy(String executeActionInitiatedBy) {
            this.executeActionInitiatedBy = Objects.requireNonNull(executeActionInitiatedBy);
            return this;
        }
        public Builder executeActionInitiatedTime(String executeActionInitiatedTime) {
            this.executeActionInitiatedTime = Objects.requireNonNull(executeActionInitiatedTime);
            return this;
        }
        public Builder executeActionStartTime(String executeActionStartTime) {
            this.executeActionStartTime = Objects.requireNonNull(executeActionStartTime);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder implementationDetails(RecommendedActionImplementationInfoResponse implementationDetails) {
            this.implementationDetails = Objects.requireNonNull(implementationDetails);
            return this;
        }
        public Builder isArchivedAction(Boolean isArchivedAction) {
            this.isArchivedAction = Objects.requireNonNull(isArchivedAction);
            return this;
        }
        public Builder isExecutableAction(Boolean isExecutableAction) {
            this.isExecutableAction = Objects.requireNonNull(isExecutableAction);
            return this;
        }
        public Builder isRevertableAction(Boolean isRevertableAction) {
            this.isRevertableAction = Objects.requireNonNull(isRevertableAction);
            return this;
        }
        public Builder kind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }
        public Builder lastRefresh(String lastRefresh) {
            this.lastRefresh = Objects.requireNonNull(lastRefresh);
            return this;
        }
        public Builder linkedObjects(List<String> linkedObjects) {
            this.linkedObjects = Objects.requireNonNull(linkedObjects);
            return this;
        }
        public Builder linkedObjects(String... linkedObjects) {
            return linkedObjects(List.of(linkedObjects));
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder observedImpact(List<RecommendedActionImpactRecordResponse> observedImpact) {
            this.observedImpact = Objects.requireNonNull(observedImpact);
            return this;
        }
        public Builder observedImpact(RecommendedActionImpactRecordResponse... observedImpact) {
            return observedImpact(List.of(observedImpact));
        }
        public Builder recommendationReason(String recommendationReason) {
            this.recommendationReason = Objects.requireNonNull(recommendationReason);
            return this;
        }
        public Builder revertActionDuration(String revertActionDuration) {
            this.revertActionDuration = Objects.requireNonNull(revertActionDuration);
            return this;
        }
        public Builder revertActionInitiatedBy(String revertActionInitiatedBy) {
            this.revertActionInitiatedBy = Objects.requireNonNull(revertActionInitiatedBy);
            return this;
        }
        public Builder revertActionInitiatedTime(String revertActionInitiatedTime) {
            this.revertActionInitiatedTime = Objects.requireNonNull(revertActionInitiatedTime);
            return this;
        }
        public Builder revertActionStartTime(String revertActionStartTime) {
            this.revertActionStartTime = Objects.requireNonNull(revertActionStartTime);
            return this;
        }
        public Builder score(Integer score) {
            this.score = Objects.requireNonNull(score);
            return this;
        }
        public Builder state(RecommendedActionStateInfoResponse state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }
        public Builder timeSeries(List<RecommendedActionMetricInfoResponse> timeSeries) {
            this.timeSeries = Objects.requireNonNull(timeSeries);
            return this;
        }
        public Builder timeSeries(RecommendedActionMetricInfoResponse... timeSeries) {
            return timeSeries(List.of(timeSeries));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder validSince(String validSince) {
            this.validSince = Objects.requireNonNull(validSince);
            return this;
        }        public RecommendedActionResponse build() {
            return new RecommendedActionResponse(details, errorDetails, estimatedImpact, executeActionDuration, executeActionInitiatedBy, executeActionInitiatedTime, executeActionStartTime, id, implementationDetails, isArchivedAction, isExecutableAction, isRevertableAction, kind, lastRefresh, linkedObjects, location, name, observedImpact, recommendationReason, revertActionDuration, revertActionInitiatedBy, revertActionInitiatedTime, revertActionStartTime, score, state, timeSeries, type, validSince);
        }
    }
}
