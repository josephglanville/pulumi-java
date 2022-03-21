// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.file_v1beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBackupArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetBackupArgs Empty = new GetBackupArgs();

    @Import(name="backupId", required=true)
      private final String backupId;

    public String getBackupId() {
        return this.backupId;
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

    public GetBackupArgs(
        String backupId,
        String location,
        @Nullable String project) {
        this.backupId = Objects.requireNonNull(backupId, "expected parameter 'backupId' to be non-null");
        this.location = Objects.requireNonNull(location, "expected parameter 'location' to be non-null");
        this.project = project;
    }

    private GetBackupArgs() {
        this.backupId = null;
        this.location = null;
        this.project = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetBackupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String backupId;
        private String location;
        private @Nullable String project;

        public Builder() {
    	      // Empty
        }

        public Builder(GetBackupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.backupId = defaults.backupId;
    	      this.location = defaults.location;
    	      this.project = defaults.project;
        }

        public Builder backupId(String backupId) {
            this.backupId = Objects.requireNonNull(backupId);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = project;
            return this;
        }        public GetBackupArgs build() {
            return new GetBackupArgs(backupId, location, project);
        }
    }
}
