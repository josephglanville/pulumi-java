// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProjectMetadataArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProjectMetadataArgs Empty = new ProjectMetadataArgs();

    /**
     * A series of key value pairs.
     * 
     */
    @Import(name="metadata", required=true)
      private final Output<Map<String,String>> metadata;

    public Output<Map<String,String>> getMetadata() {
        return this.metadata;
    }

    /**
     * The ID of the project in which the resource belongs. If it
     * is not provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    public ProjectMetadataArgs(
        Output<Map<String,String>> metadata,
        @Nullable Output<String> project) {
        this.metadata = Objects.requireNonNull(metadata, "expected parameter 'metadata' to be non-null");
        this.project = project;
    }

    private ProjectMetadataArgs() {
        this.metadata = Output.empty();
        this.project = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectMetadataArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Map<String,String>> metadata;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(ProjectMetadataArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.metadata = defaults.metadata;
    	      this.project = defaults.project;
        }

        public Builder metadata(Output<Map<String,String>> metadata) {
            this.metadata = Objects.requireNonNull(metadata);
            return this;
        }
        public Builder metadata(Map<String,String> metadata) {
            this.metadata = Output.of(Objects.requireNonNull(metadata));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }        public ProjectMetadataArgs build() {
            return new ProjectMetadataArgs(metadata, project);
        }
    }
}
