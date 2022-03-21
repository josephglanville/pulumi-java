// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAutoscalingPolicyIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAutoscalingPolicyIamPolicyArgs Empty = new GetAutoscalingPolicyIamPolicyArgs();

    @Import(name="autoscalingPolicyId", required=true)
      private final String autoscalingPolicyId;

    public String getAutoscalingPolicyId() {
        return this.autoscalingPolicyId;
    }

    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetAutoscalingPolicyIamPolicyArgs(
        String autoscalingPolicyId,
        String location,
        @Nullable String project) {
        this.autoscalingPolicyId = Objects.requireNonNull(autoscalingPolicyId, "expected parameter 'autoscalingPolicyId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetAutoscalingPolicyIamPolicyArgs() {
        this.autoscalingPolicyId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAutoscalingPolicyIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoscalingPolicyId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAutoscalingPolicyIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingPolicyId = defaults.autoscalingPolicyId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder autoscalingPolicyId(String autoscalingPolicyId) {
            this.autoscalingPolicyId = Objects.requireNonNull(autoscalingPolicyId);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetAutoscalingPolicyIamPolicyArgs build() {
            return new GetAutoscalingPolicyIamPolicyArgs(autoscalingPolicyId, location, project);
        }
    }
}
