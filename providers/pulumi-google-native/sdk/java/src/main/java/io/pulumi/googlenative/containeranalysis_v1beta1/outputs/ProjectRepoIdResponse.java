// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.containeranalysis_v1beta1.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ProjectRepoIdResponse {
    private final String project;
    private final String repoName;

    @OutputCustomType.Constructor({"project","repoName"})
    private ProjectRepoIdResponse(
        String project,
        String repoName) {
        this.project = Objects.requireNonNull(project);
        this.repoName = Objects.requireNonNull(repoName);
    }

    public String getProject() {
        return this.project;
    }
    public String getRepoName() {
        return this.repoName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectRepoIdResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String project;
        private String repoName;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectRepoIdResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.repoName = defaults.repoName;
        }

        public Builder setProject(String project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }

        public Builder setRepoName(String repoName) {
            this.repoName = Objects.requireNonNull(repoName);
            return this;
        }

        public ProjectRepoIdResponse build() {
            return new ProjectRepoIdResponse(project, repoName);
        }
    }
}