// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.projects.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;

@CustomType
public final class GetProjectProject {
    private final String createTime;
    private final Map<String,String> labels;
    private final String lifecycleState;
    private final String name;
    private final String number;
    private final Map<String,String> parent;
    /**
     * The project id of the project.
     * 
     */
    private final String projectId;

    @CustomType.Constructor
    private GetProjectProject(
        @CustomType.Parameter("createTime") String createTime,
        @CustomType.Parameter("labels") Map<String,String> labels,
        @CustomType.Parameter("lifecycleState") String lifecycleState,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("number") String number,
        @CustomType.Parameter("parent") Map<String,String> parent,
        @CustomType.Parameter("projectId") String projectId) {
        this.createTime = createTime;
        this.labels = labels;
        this.lifecycleState = lifecycleState;
        this.name = name;
        this.number = number;
        this.parent = parent;
        this.projectId = projectId;
    }

    public String getCreateTime() {
        return this.createTime;
    }
    public Map<String,String> getLabels() {
        return this.labels;
    }
    public String getLifecycleState() {
        return this.lifecycleState;
    }
    public String getName() {
        return this.name;
    }
    public String getNumber() {
        return this.number;
    }
    public Map<String,String> getParent() {
        return this.parent;
    }
    /**
     * The project id of the project.
     * 
    */
    public String getProjectId() {
        return this.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetProjectProject defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String createTime;
        private Map<String,String> labels;
        private String lifecycleState;
        private String name;
        private String number;
        private Map<String,String> parent;
        private String projectId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetProjectProject defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createTime = defaults.createTime;
    	      this.labels = defaults.labels;
    	      this.lifecycleState = defaults.lifecycleState;
    	      this.name = defaults.name;
    	      this.number = defaults.number;
    	      this.parent = defaults.parent;
    	      this.projectId = defaults.projectId;
        }

        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        public Builder labels(Map<String,String> labels) {
            this.labels = Objects.requireNonNull(labels);
            return this;
        }
        public Builder lifecycleState(String lifecycleState) {
            this.lifecycleState = Objects.requireNonNull(lifecycleState);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder number(String number) {
            this.number = Objects.requireNonNull(number);
            return this;
        }
        public Builder parent(Map<String,String> parent) {
            this.parent = Objects.requireNonNull(parent);
            return this;
        }
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }        public GetProjectProject build() {
            return new GetProjectProject(createTime, labels, lifecycleState, name, number, parent, projectId);
        }
    }
}
