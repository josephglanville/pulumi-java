// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.apigateway_v1beta.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetApiArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetApiArgs Empty = new GetApiArgs();

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

    @Import(name="project")
      private final @Nullable String project;

    public Optional<String> getProject() {
        return this.project == null ? Optional.empty() : Optional.ofNullable(this.project);
    }

    public GetApiArgs(
        String apiId,
        String location,
        @Nullable String project) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetApiArgs() {
        this.apiId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetApiArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String apiId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetApiArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.location = defaults.location;
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
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetApiArgs build() {
            return new GetApiArgs(apiId, location, project);
        }
    }
}
