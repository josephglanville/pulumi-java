// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v2.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetVersionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVersionArgs Empty = new GetVersionArgs();

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

    @Import(name="versionId", required=true)
      private final String versionId;

    public String getVersionId() {
        return this.versionId;
    }

    public GetVersionArgs(
        String location,
        @Nullable String project,
        String versionId) {
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
        this.versionId = Objects.requireNonNull(versionId, "expected parameter 'versionId' to be non-null");
    }

    private GetVersionArgs() {
        this.location = null;
        this.project = null;
        this.versionId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVersionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String location;
        private @Nullable String project;
        private String versionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVersionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.project = defaults.project;
    	      this.versionId = defaults.versionId;
        }

        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }
        public Builder versionId(String versionId) {
            this.versionId = Objects.requireNonNull(versionId);
            return this;
        }        public GetVersionArgs build() {
            return new GetVersionArgs(location, project, versionId);
        }
    }
}
