// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.firebase;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectLocationArgs Empty = new ProjectLocationArgs();

    /**
     * The ID of the default GCP resource location for the Project. The location must be one of the available GCP
     * resource locations.
     * 
     */
    @InputImport(name="locationId", required=true)
      private final Input<String> locationId;

    public Input<String> getLocationId() {
        return this.locationId;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @InputImport(name="project")
      private final @Nullable Input<String> project;

    public Input<String> getProject() {
        return this.project == null ? Input.empty() : this.project;
    }

    public ProjectLocationArgs(
        Input<String> locationId,
        @Nullable Input<String> project) {
        this.locationId = Objects.requireNonNull(locationId, "expected parameter 'locationId' to be non-null");
        this.project = project;
    }

    private ProjectLocationArgs() {
        this.locationId = Input.empty();
        this.project = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> locationId;
        private @Nullable Input<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locationId = defaults.locationId;
    	      this.project = defaults.project;
        }

        public Builder setLocationId(Input<String> locationId) {
            this.locationId = Objects.requireNonNull(locationId);
            return this;
        }

        public Builder setLocationId(String locationId) {
            this.locationId = Input.of(Objects.requireNonNull(locationId));
            return this;
        }

        public Builder setProject(@Nullable Input<String> project) {
            this.project = project;
            return this;
        }

        public Builder setProject(@Nullable String project) {
            this.project = Input.ofNullable(project);
            return this;
        }
        public ProjectLocationArgs build() {
            return new ProjectLocationArgs(locationId, project);
        }
    }
}
