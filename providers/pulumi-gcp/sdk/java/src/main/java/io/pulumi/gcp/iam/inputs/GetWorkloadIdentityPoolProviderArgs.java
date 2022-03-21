// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.iam.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetWorkloadIdentityPoolProviderArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetWorkloadIdentityPoolProviderArgs Empty = new GetWorkloadIdentityPoolProviderArgs();

    /**
     * The project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    /**
     * The id of the pool which is the
     * final component of the pool resource name.
     * 
     */
    @Import(name="workloadIdentityPoolId", required=true)
      private final String workloadIdentityPoolId;

    public String getWorkloadIdentityPoolId() {
        return this.workloadIdentityPoolId;
    }

    /**
     * The id of the provider which is the
     * final component of the resource name.
     * 
     */
    @Import(name="workloadIdentityPoolProviderId", required=true)
      private final String workloadIdentityPoolProviderId;

    public String getWorkloadIdentityPoolProviderId() {
        return this.workloadIdentityPoolProviderId;
    }

    public GetWorkloadIdentityPoolProviderArgs(
        @Nullable String project,
        String workloadIdentityPoolId,
        String workloadIdentityPoolProviderId) {
        this.project = project;
        this.workloadIdentityPoolId = Objects.requireNonNull(workloadIdentityPoolId, "expected parameter 'workloadIdentityPoolId' to be non-null");
        this.workloadIdentityPoolProviderId = Objects.requireNonNull(workloadIdentityPoolProviderId, "expected parameter 'workloadIdentityPoolProviderId' to be non-null");
    }

    private GetWorkloadIdentityPoolProviderArgs() {
        this.project = null;
        this.workloadIdentityPoolId = null;
        this.workloadIdentityPoolProviderId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWorkloadIdentityPoolProviderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String project;
        private String workloadIdentityPoolId;
        private String workloadIdentityPoolProviderId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetWorkloadIdentityPoolProviderArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.project = defaults.project;
    	      this.workloadIdentityPoolId = defaults.workloadIdentityPoolId;
    	      this.workloadIdentityPoolProviderId = defaults.workloadIdentityPoolProviderId;
        }

        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder workloadIdentityPoolId(String workloadIdentityPoolId) {
            this.workloadIdentityPoolId = Objects.requireNonNull(workloadIdentityPoolId);
            return this;
        }
        public Builder workloadIdentityPoolProviderId(String workloadIdentityPoolProviderId) {
            this.workloadIdentityPoolProviderId = Objects.requireNonNull(workloadIdentityPoolProviderId);
            return this;
        }        public GetWorkloadIdentityPoolProviderArgs build() {
            return new GetWorkloadIdentityPoolProviderArgs(project, workloadIdentityPoolId, workloadIdentityPoolProviderId);
        }
    }
}
