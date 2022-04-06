// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codebuild.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class ProjectSecondarySourceGitSubmodulesConfig {
    /**
     * Whether to fetch Git submodules for the AWS CodeBuild build project.
     * 
     */
    private final Boolean fetchSubmodules;

    @CustomType.Constructor
    private ProjectSecondarySourceGitSubmodulesConfig(@CustomType.Parameter("fetchSubmodules") Boolean fetchSubmodules) {
        this.fetchSubmodules = fetchSubmodules;
    }

    /**
     * Whether to fetch Git submodules for the AWS CodeBuild build project.
     * 
    */
    public Boolean getFetchSubmodules() {
        return this.fetchSubmodules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSecondarySourceGitSubmodulesConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean fetchSubmodules;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectSecondarySourceGitSubmodulesConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fetchSubmodules = defaults.fetchSubmodules;
        }

        public Builder fetchSubmodules(Boolean fetchSubmodules) {
            this.fetchSubmodules = Objects.requireNonNull(fetchSubmodules);
            return this;
        }        public ProjectSecondarySourceGitSubmodulesConfig build() {
            return new ProjectSecondarySourceGitSubmodulesConfig(fetchSubmodules);
        }
    }
}