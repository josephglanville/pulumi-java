// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApiIamPolicyArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetApiIamPolicyArgs Empty = new GetApiIamPolicyArgs();

    @Import(name="apiId", required=true)
      private final String apiId;

    public String getApiId() {
        return this.apiId;
    }

    @Import(name="location", required=true)
      private final String location;

    public String getLocation() {
        return this.location;
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

    public GetApiIamPolicyArgs(
        String apiId,
        String location,
        @Nullable String optionsRequestedPolicyVersion,
        @Nullable String project) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
        this.project = project;
    }

    private GetApiIamPolicyArgs() {
        this.apiId = null;
        this.location = null;
        this.optionsRequestedPolicyVersion = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiIamPolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiId;
        private String location;
        private @Nullable String optionsRequestedPolicyVersion;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiIamPolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.location = defaults.location;
    	      this.optionsRequestedPolicyVersion = defaults.optionsRequestedPolicyVersion;
    	      this.project = defaults.project;
        }

        public Builder apiId(String apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder optionsRequestedPolicyVersion(@Nullable String optionsRequestedPolicyVersion) {
            this.optionsRequestedPolicyVersion = optionsRequestedPolicyVersion;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetApiIamPolicyArgs build() {
            return new GetApiIamPolicyArgs(apiId, location, optionsRequestedPolicyVersion, project);
        }
    }
}
