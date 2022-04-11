// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.notebooks.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnvironmentVmImageGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnvironmentVmImageGetArgs Empty = new EnvironmentVmImageGetArgs();

    /**
     * Use this VM image family to find the image; the newest image in this family will be used.
     * 
     */
    @Import(name="imageFamily")
      private final @Nullable Output<String> imageFamily;

    public Output<String> getImageFamily() {
        return this.imageFamily == null ? Codegen.empty() : this.imageFamily;
    }

    /**
     * Use VM image name to find the image.
     * 
     */
    @Import(name="imageName")
      private final @Nullable Output<String> imageName;

    public Output<String> getImageName() {
        return this.imageName == null ? Codegen.empty() : this.imageName;
    }

    /**
     * The name of the Google Cloud project that this VM image belongs to.
     * Format: projects/{project_id}
     * 
     */
    @Import(name="project", required=true)
      private final Output<String> project;

    public Output<String> getProject() {
        return this.project;
    }

    public EnvironmentVmImageGetArgs(
        @Nullable Output<String> imageFamily,
        @Nullable Output<String> imageName,
        Output<String> project) {
        this.imageFamily = imageFamily;
        this.imageName = imageName;
        this.project = Objects.requireNonNull(project, "expected parameter 'project' to be non-null");
    }

    private EnvironmentVmImageGetArgs() {
        this.imageFamily = Codegen.empty();
        this.imageName = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnvironmentVmImageGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> imageFamily;
        private @Nullable Output<String> imageName;
        private Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(EnvironmentVmImageGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageFamily = defaults.imageFamily;
    	      this.imageName = defaults.imageName;
    	      this.project = defaults.project;
        }

        public Builder imageFamily(@Nullable Output<String> imageFamily) {
            this.imageFamily = imageFamily;
            return this;
        }
        public Builder imageFamily(@Nullable String imageFamily) {
            this.imageFamily = Codegen.ofNullable(imageFamily);
            return this;
        }
        public Builder imageName(@Nullable Output<String> imageName) {
            this.imageName = imageName;
            return this;
        }
        public Builder imageName(@Nullable String imageName) {
            this.imageName = Codegen.ofNullable(imageName);
            return this;
        }
        public Builder project(Output<String> project) {
            this.project = Objects.requireNonNull(project);
            return this;
        }
        public Builder project(String project) {
            this.project = Output.of(Objects.requireNonNull(project));
            return this;
        }        public EnvironmentVmImageGetArgs build() {
            return new EnvironmentVmImageGetArgs(imageFamily, imageName, project);
        }
    }
}
