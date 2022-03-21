// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datacatalog_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetEntryArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetEntryArgs Empty = new GetEntryArgs();

    @Import(name="entryGroupId", required=true)
      private final String entryGroupId;

    public String getEntryGroupId() {
        return this.entryGroupId;
    }

    @Import(name="entryId", required=true)
      private final String entryId;

    public String getEntryId() {
        return this.entryId;
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

    public GetEntryArgs(
        String entryGroupId,
        String entryId,
        String location,
        @Nullable String project) {
        this.entryGroupId = Objects.requireNonNull(entryGroupId, "expected parameter 'entryGroupId' to be non-null");
        this.entryId = Objects.requireNonNull(entryId, "expected parameter 'entryId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetEntryArgs() {
        this.entryGroupId = null;
        this.entryId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEntryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String entryGroupId;
        private String entryId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEntryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entryGroupId = defaults.entryGroupId;
    	      this.entryId = defaults.entryId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder entryGroupId(String entryGroupId) {
            this.entryGroupId = Objects.requireNonNull(entryGroupId);
            return this;
        }
        public Builder entryId(String entryId) {
            this.entryId = Objects.requireNonNull(entryId);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetEntryArgs build() {
            return new GetEntryArgs(entryGroupId, entryId, location, project);
        }
    }
}
