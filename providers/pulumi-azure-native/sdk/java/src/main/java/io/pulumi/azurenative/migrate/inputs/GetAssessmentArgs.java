// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.migrate.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetAssessmentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAssessmentArgs Empty = new GetAssessmentArgs();

    @InputImport(name="assessmentName", required=true)
    private final String assessmentName;

    public String getAssessmentName() {
        return this.assessmentName;
    }

    @InputImport(name="groupName", required=true)
    private final String groupName;

    public String getGroupName() {
        return this.groupName;
    }

    @InputImport(name="projectName", required=true)
    private final String projectName;

    public String getProjectName() {
        return this.projectName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetAssessmentArgs(
        String assessmentName,
        String groupName,
        String projectName,
        String resourceGroupName) {
        this.assessmentName = Objects.requireNonNull(assessmentName, "expected parameter 'assessmentName' to be non-null");
        this.groupName = Objects.requireNonNull(groupName, "expected parameter 'groupName' to be non-null");
        this.projectName = Objects.requireNonNull(projectName, "expected parameter 'projectName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetAssessmentArgs() {
        this.assessmentName = null;
        this.groupName = null;
        this.projectName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAssessmentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String assessmentName;
        private String groupName;
        private String projectName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAssessmentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.assessmentName = defaults.assessmentName;
    	      this.groupName = defaults.groupName;
    	      this.projectName = defaults.projectName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setAssessmentName(String assessmentName) {
            this.assessmentName = Objects.requireNonNull(assessmentName);
            return this;
        }

        public Builder setGroupName(String groupName) {
            this.groupName = Objects.requireNonNull(groupName);
            return this;
        }

        public Builder setProjectName(String projectName) {
            this.projectName = Objects.requireNonNull(projectName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetAssessmentArgs build() {
            return new GetAssessmentArgs(assessmentName, groupName, projectName, resourceGroupName);
        }
    }
}
