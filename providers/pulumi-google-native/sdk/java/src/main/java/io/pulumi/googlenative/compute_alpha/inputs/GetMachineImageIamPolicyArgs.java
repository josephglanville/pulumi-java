// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetMachineImageIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMachineImageIamPolicyArgs Empty = new GetMachineImageIamPolicyArgs();

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

    @Import(name="resource", required=true)
      private final String resource;

    public String getResource() {
        return this.resource;
    }

    public GetMachineImageIamPolicyArgs(
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project,
        String resource) {
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
        this.resource = Objects.requireNonNull(resource, "expected parameter 'resource' to be non-null");
    }

    private GetMachineImageIamPolicyArgs() {
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
        this.resource = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMachineImageIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;
        private String resource;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMachineImageIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
    	      this.resource = defaults.resource;
        }

        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder resource(String resource) {
            this.resource = Objects.requireNonNull(resource);
            return this;
        }        public GetMachineImageIamPolicyArgs build() {
            return new GetMachineImageIamPolicyArgs(optionsRequestedPolicyVersion, project, resource);
        }
    }
}
