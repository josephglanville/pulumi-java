// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.azurenative.sql.outputs.RecommendedActionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetServerAdvisorResult {
    private final String advisorStatus;
    private final String autoExecuteStatus;
    private final String autoExecuteStatusInheritedFrom;
    private final String id;
    private final String kind;
    private final String lastChecked;
    private final String location;
    private final String name;
    private final String recommendationsStatus;
    private final List<RecommendedActionResponse> recommendedActions;
    private final String type;

    @OutputCustomType.Constructor({"advisorStatus","autoExecuteStatus","autoExecuteStatusInheritedFrom","id","kind","lastChecked","location","name","recommendationsStatus","recommendedActions","type"})
    private GetServerAdvisorResult(
        String advisorStatus,
        String autoExecuteStatus,
        String autoExecuteStatusInheritedFrom,
        String id,
        String kind,
        String lastChecked,
        String location,
        String name,
        String recommendationsStatus,
        List<RecommendedActionResponse> recommendedActions,
        String type) {
        this.advisorStatus = Objects.requireNonNull(advisorStatus);
        this.autoExecuteStatus = Objects.requireNonNull(autoExecuteStatus);
        this.autoExecuteStatusInheritedFrom = Objects.requireNonNull(autoExecuteStatusInheritedFrom);
        this.id = Objects.requireNonNull(id);
        this.kind = Objects.requireNonNull(kind);
        this.lastChecked = Objects.requireNonNull(lastChecked);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.recommendationsStatus = Objects.requireNonNull(recommendationsStatus);
        this.recommendedActions = Objects.requireNonNull(recommendedActions);
        this.type = Objects.requireNonNull(type);
    }

    public String getAdvisorStatus() {
        return this.advisorStatus;
    }
    public String getAutoExecuteStatus() {
        return this.autoExecuteStatus;
    }
    public String getAutoExecuteStatusInheritedFrom() {
        return this.autoExecuteStatusInheritedFrom;
    }
    public String getId() {
        return this.id;
    }
    public String getKind() {
        return this.kind;
    }
    public String getLastChecked() {
        return this.lastChecked;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public String getRecommendationsStatus() {
        return this.recommendationsStatus;
    }
    public List<RecommendedActionResponse> getRecommendedActions() {
        return this.recommendedActions;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerAdvisorResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String advisorStatus;
        private String autoExecuteStatus;
        private String autoExecuteStatusInheritedFrom;
        private String id;
        private String kind;
        private String lastChecked;
        private String location;
        private String name;
        private String recommendationsStatus;
        private List<RecommendedActionResponse> recommendedActions;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerAdvisorResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.advisorStatus = defaults.advisorStatus;
    	      this.autoExecuteStatus = defaults.autoExecuteStatus;
    	      this.autoExecuteStatusInheritedFrom = defaults.autoExecuteStatusInheritedFrom;
    	      this.id = defaults.id;
    	      this.kind = defaults.kind;
    	      this.lastChecked = defaults.lastChecked;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.recommendationsStatus = defaults.recommendationsStatus;
    	      this.recommendedActions = defaults.recommendedActions;
    	      this.type = defaults.type;
        }

        public Builder setAdvisorStatus(String advisorStatus) {
            this.advisorStatus = Objects.requireNonNull(advisorStatus);
            return this;
        }

        public Builder setAutoExecuteStatus(String autoExecuteStatus) {
            this.autoExecuteStatus = Objects.requireNonNull(autoExecuteStatus);
            return this;
        }

        public Builder setAutoExecuteStatusInheritedFrom(String autoExecuteStatusInheritedFrom) {
            this.autoExecuteStatusInheritedFrom = Objects.requireNonNull(autoExecuteStatusInheritedFrom);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKind(String kind) {
            this.kind = Objects.requireNonNull(kind);
            return this;
        }

        public Builder setLastChecked(String lastChecked) {
            this.lastChecked = Objects.requireNonNull(lastChecked);
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

        public Builder setRecommendationsStatus(String recommendationsStatus) {
            this.recommendationsStatus = Objects.requireNonNull(recommendationsStatus);
            return this;
        }

        public Builder setRecommendedActions(List<RecommendedActionResponse> recommendedActions) {
            this.recommendedActions = Objects.requireNonNull(recommendedActions);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetServerAdvisorResult build() {
            return new GetServerAdvisorResult(advisorStatus, autoExecuteStatus, autoExecuteStatusInheritedFrom, id, kind, lastChecked, location, name, recommendationsStatus, recommendedActions, type);
        }
    }
}
