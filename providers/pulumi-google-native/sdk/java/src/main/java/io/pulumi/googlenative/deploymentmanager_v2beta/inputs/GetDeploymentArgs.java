// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.deploymentmanager_v2beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetDeploymentArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetDeploymentArgs Empty = new GetDeploymentArgs();

    @Import(name="deployment", required=true)
      private final String deployment;

    public String getDeployment() {
        return this.deployment;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetDeploymentArgs(
        String deployment,
        @Nullable String project) {
        this.deployment = Objects.requireNonNull(deployment, "expected parameter 'deployment' to be non-null");
        this.project = project;
    }

    private GetDeploymentArgs() {
        this.deployment = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDeploymentArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String deployment;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDeploymentArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deployment = defaults.deployment;
    	      this.project = defaults.project;
        }

        public Builder deployment(String deployment) {
            this.deployment = Objects.requireNonNull(deployment);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetDeploymentArgs build() {
            return new GetDeploymentArgs(deployment, project);
        }
    }
}
