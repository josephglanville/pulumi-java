// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.firebase.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectLocationState extends io.pulumi.resources.ResourceArgs {

    public static final ProjectLocationState Empty = new ProjectLocationState();

    /**
     * The ID of the default GCP resource location for the Project. The location must be one of the available GCP
     * resource locations.
     * 
     */
    @Import(name="locationId")
      private final @Nullable Output<String> locationId;

    public Output<String> getLocationId() {
        return this.locationId == null ? Codegen.empty() : this.locationId;
    }

    /**
     * The ID of the project in which the resource belongs.
     * If it is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public ProjectLocationState(
        @Nullable Output<String> locationId,
        @Nullable Output<String> project) {
        this.locationId = locationId;
        this.project = project;
    }

    private ProjectLocationState() {
        this.locationId = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectLocationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> locationId;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectLocationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.locationId = defaults.locationId;
    	      this.project = defaults.project;
        }

        public Builder locationId(@Nullable Output<String> locationId) {
            this.locationId = locationId;
            return this;
        }
        public Builder locationId(@Nullable String locationId) {
            this.locationId = Codegen.ofNullable(locationId);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public ProjectLocationState build() {
            return new ProjectLocationState(locationId, project);
        }
    }
}
