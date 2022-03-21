// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetRegionAutoscalingPolicyIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetRegionAutoscalingPolicyIamPolicyArgs Empty = new GetRegionAutoscalingPolicyIamPolicyArgs();

    @Import(name="autoscalingPolicyId", required=true)
      private final String autoscalingPolicyId;

    public String getAutoscalingPolicyId() {
        return this.autoscalingPolicyId;
    }

    @Import(name="optionsRequestedPolicyVersion")
      private final @Nullable String optionsRequestedPolicyVersion;

    public Optional<String> getOptionsRequestedPolicyVersion() {
        return this.optionsRequestedPolicyVersion == null ? Optional.empty() : Optional.ofNullable(this.optionsRequestedPolicyVersion);
    }

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    @Import(name="regionId", required=true)
      private final String regionId;

    public String getRegionId() {
        return this.regionId;
    }

    public GetRegionAutoscalingPolicyIamPolicyArgs(
        String autoscalingPolicyId,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project,
        String regionId) {
        this.autoscalingPolicyId = Objects.requireNonNull(autoscalingPolicyId, "expected parameter 'autoscalingPolicyId' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
        this.regionId = Objects.requireNonNull(regionId, "expected parameter 'regionId' to be non-null");
    }

    private GetRegionAutoscalingPolicyIamPolicyArgs() {
        this.autoscalingPolicyId = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
        this.regionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetRegionAutoscalingPolicyIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String autoscalingPolicyId;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;
        private String regionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetRegionAutoscalingPolicyIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoscalingPolicyId = defaults.autoscalingPolicyId;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
    	      this.regionId = defaults.regionId;
        }

        public Builder autoscalingPolicyId(String autoscalingPolicyId) {
            this.autoscalingPolicyId = Objects.requireNonNull(autoscalingPolicyId);
            return this;
        }
        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder regionId(String regionId) {
            this.regionId = Objects.requireNonNull(regionId);
            return this;
        }        public GetRegionAutoscalingPolicyIamPolicyArgs build() {
            return new GetRegionAutoscalingPolicyIamPolicyArgs(autoscalingPolicyId, optionsRequestedPolicyVersion, project, regionId);
        }
    }
}
