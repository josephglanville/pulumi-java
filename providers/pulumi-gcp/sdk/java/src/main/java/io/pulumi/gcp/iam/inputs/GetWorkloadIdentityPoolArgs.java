// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iam.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkloadIdentityPoolArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWorkloadIdentityPoolArgs Empty = new GetWorkloadIdentityPoolArgs();

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    /**
     * The id of the pool which is the
     * final component of the resource name.
     * 
     */
    @InputImport(name="workloadIdentityPoolId", required=true)
      private final String workloadIdentityPoolId;

    public String getWorkloadIdentityPoolId() {
        return this.workloadIdentityPoolId;
    }

    public GetWorkloadIdentityPoolArgs(
        @Nullable String project,
        String workloadIdentityPoolId) {
        this.project = project;
        this.workloadIdentityPoolId = Objects.requireNonNull(workloadIdentityPoolId, "expected parameter 'workloadIdentityPoolId' to be non-null");
    }

    private GetWorkloadIdentityPoolArgs() {
        this.project = null;
        this.workloadIdentityPoolId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadIdentityPoolArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String workloadIdentityPoolId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadIdentityPoolArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.workloadIdentityPoolId = defaults.workloadIdentityPoolId;
        }

        public Builder setProject(@Nullable String project) {
            this.project = project;
            return this;
        }

        public Builder setWorkloadIdentityPoolId(String workloadIdentityPoolId) {
            this.workloadIdentityPoolId = Objects.requireNonNull(workloadIdentityPoolId);
            return this;
        }
        public GetWorkloadIdentityPoolArgs build() {
            return new GetWorkloadIdentityPoolArgs(project, workloadIdentityPoolId);
        }
    }
}
