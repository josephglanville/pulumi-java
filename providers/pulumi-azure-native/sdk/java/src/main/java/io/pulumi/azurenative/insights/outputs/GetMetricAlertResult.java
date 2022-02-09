// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.azurenative.insights.outputs.MetricAlertActionResponse;
import io.pulumi.azurenative.insights.outputs.MetricAlertMultipleResourceMultipleMetricCriteriaResponse;
import io.pulumi.azurenative.insights.outputs.MetricAlertSingleResourceMultipleMetricCriteriaResponse;
import io.pulumi.azurenative.insights.outputs.WebtestLocationAvailabilityCriteriaResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetMetricAlertResult {
    private final @Nullable List<MetricAlertActionResponse> actions;
    private final @Nullable Boolean autoMitigate;
    private final Object criteria;
    private final @Nullable String description;
    private final Boolean enabled;
    private final String evaluationFrequency;
    private final String id;
    private final Boolean isMigrated;
    private final String lastUpdatedTime;
    private final String location;
    private final String name;
    private final List<String> scopes;
    private final Integer severity;
    private final @Nullable Map<String,String> tags;
    private final @Nullable String targetResourceRegion;
    private final @Nullable String targetResourceType;
    private final String type;
    private final String windowSize;

    @OutputCustomType.Constructor({"actions","autoMitigate","criteria","description","enabled","evaluationFrequency","id","isMigrated","lastUpdatedTime","location","name","scopes","severity","tags","targetResourceRegion","targetResourceType","type","windowSize"})
    private GetMetricAlertResult(
        @Nullable List<MetricAlertActionResponse> actions,
        @Nullable Boolean autoMitigate,
        Object criteria,
        @Nullable String description,
        Boolean enabled,
        String evaluationFrequency,
        String id,
        Boolean isMigrated,
        String lastUpdatedTime,
        String location,
        String name,
        List<String> scopes,
        Integer severity,
        @Nullable Map<String,String> tags,
        @Nullable String targetResourceRegion,
        @Nullable String targetResourceType,
        String type,
        String windowSize) {
        this.actions = actions;
        this.autoMitigate = autoMitigate;
        this.criteria = Objects.requireNonNull(criteria);
        this.description = description;
        this.enabled = Objects.requireNonNull(enabled);
        this.evaluationFrequency = Objects.requireNonNull(evaluationFrequency);
        this.id = Objects.requireNonNull(id);
        this.isMigrated = Objects.requireNonNull(isMigrated);
        this.lastUpdatedTime = Objects.requireNonNull(lastUpdatedTime);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.scopes = Objects.requireNonNull(scopes);
        this.severity = Objects.requireNonNull(severity);
        this.tags = tags;
        this.targetResourceRegion = targetResourceRegion;
        this.targetResourceType = targetResourceType;
        this.type = Objects.requireNonNull(type);
        this.windowSize = Objects.requireNonNull(windowSize);
    }

    public List<MetricAlertActionResponse> getActions() {
        return this.actions == null ? List.of() : this.actions;
    }
    public Optional<Boolean> getAutoMitigate() {
        return Optional.ofNullable(this.autoMitigate);
    }
    public Object getCriteria() {
        return this.criteria;
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Boolean getEnabled() {
        return this.enabled;
    }
    public String getEvaluationFrequency() {
        return this.evaluationFrequency;
    }
    public String getId() {
        return this.id;
    }
    public Boolean getIsMigrated() {
        return this.isMigrated;
    }
    public String getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public List<String> getScopes() {
        return this.scopes;
    }
    public Integer getSeverity() {
        return this.severity;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Optional<String> getTargetResourceRegion() {
        return Optional.ofNullable(this.targetResourceRegion);
    }
    public Optional<String> getTargetResourceType() {
        return Optional.ofNullable(this.targetResourceType);
    }
    public String getType() {
        return this.type;
    }
    public String getWindowSize() {
        return this.windowSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMetricAlertResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<MetricAlertActionResponse> actions;
        private @Nullable Boolean autoMitigate;
        private Object criteria;
        private @Nullable String description;
        private Boolean enabled;
        private String evaluationFrequency;
        private String id;
        private Boolean isMigrated;
        private String lastUpdatedTime;
        private String location;
        private String name;
        private List<String> scopes;
        private Integer severity;
        private @Nullable Map<String,String> tags;
        private @Nullable String targetResourceRegion;
        private @Nullable String targetResourceType;
        private String type;
        private String windowSize;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMetricAlertResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.actions = defaults.actions;
    	      this.autoMitigate = defaults.autoMitigate;
    	      this.criteria = defaults.criteria;
    	      this.description = defaults.description;
    	      this.enabled = defaults.enabled;
    	      this.evaluationFrequency = defaults.evaluationFrequency;
    	      this.id = defaults.id;
    	      this.isMigrated = defaults.isMigrated;
    	      this.lastUpdatedTime = defaults.lastUpdatedTime;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.scopes = defaults.scopes;
    	      this.severity = defaults.severity;
    	      this.tags = defaults.tags;
    	      this.targetResourceRegion = defaults.targetResourceRegion;
    	      this.targetResourceType = defaults.targetResourceType;
    	      this.type = defaults.type;
    	      this.windowSize = defaults.windowSize;
        }

        public Builder setActions(@Nullable List<MetricAlertActionResponse> actions) {
            this.actions = actions;
            return this;
        }

        public Builder setAutoMitigate(@Nullable Boolean autoMitigate) {
            this.autoMitigate = autoMitigate;
            return this;
        }

        public Builder setCriteria(Object criteria) {
            this.criteria = Objects.requireNonNull(criteria);
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEnabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }

        public Builder setEvaluationFrequency(String evaluationFrequency) {
            this.evaluationFrequency = Objects.requireNonNull(evaluationFrequency);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsMigrated(Boolean isMigrated) {
            this.isMigrated = Objects.requireNonNull(isMigrated);
            return this;
        }

        public Builder setLastUpdatedTime(String lastUpdatedTime) {
            this.lastUpdatedTime = Objects.requireNonNull(lastUpdatedTime);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setScopes(List<String> scopes) {
            this.scopes = Objects.requireNonNull(scopes);
            return this;
        }

        public Builder setSeverity(Integer severity) {
            this.severity = Objects.requireNonNull(severity);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTargetResourceRegion(@Nullable String targetResourceRegion) {
            this.targetResourceRegion = targetResourceRegion;
            return this;
        }

        public Builder setTargetResourceType(@Nullable String targetResourceType) {
            this.targetResourceType = targetResourceType;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setWindowSize(String windowSize) {
            this.windowSize = Objects.requireNonNull(windowSize);
            return this;
        }

        public GetMetricAlertResult build() {
            return new GetMetricAlertResult(actions, autoMitigate, criteria, description, enabled, evaluationFrequency, id, isMigrated, lastUpdatedTime, location, name, scopes, severity, tags, targetResourceRegion, targetResourceType, type, windowSize);
        }
    }
}
