// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datalabeling_v1beta1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.googlenative.datalabeling_v1beta1.inputs.GoogleCloudDatalabelingV1beta1AnnotationSpecArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AnnotationSpecSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AnnotationSpecSetArgs Empty = new AnnotationSpecSetArgs();

    /**
     * The array of AnnotationSpecs that you define when you create the AnnotationSpecSet. These are the possible labels for the labeling task.
     * 
     */
    @Import(name="annotationSpecs", required=true)
      private final Output<List<GoogleCloudDatalabelingV1beta1AnnotationSpecArgs>> annotationSpecs;

    public Output<List<GoogleCloudDatalabelingV1beta1AnnotationSpecArgs>> getAnnotationSpecs() {
        return this.annotationSpecs;
    }

    /**
     * Optional. User-provided description of the annotation specification set. The description can be up to 10,000 characters long.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * The display name for AnnotationSpecSet that you define when you create it. Maximum of 64 characters.
     * 
     */
    @Import(name="displayName", required=true)
      private final Output<String> displayName;

    public Output<String> getDisplayName() {
        return this.displayName;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    public AnnotationSpecSetArgs(
        Output<List<GoogleCloudDatalabelingV1beta1AnnotationSpecArgs>> annotationSpecs,
        @Nullable Output<String> description,
        Output<String> displayName,
        @Nullable Output<String> project) {
        this.annotationSpecs = Objects.requireNonNull(annotationSpecs, "expected parameter 'annotationSpecs' to be non-null");
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.project = project;
    }

    private AnnotationSpecSetArgs() {
        this.annotationSpecs = Codegen.empty();
        this.description = Codegen.empty();
        this.displayName = Codegen.empty();
        this.project = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AnnotationSpecSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<List<GoogleCloudDatalabelingV1beta1AnnotationSpecArgs>> annotationSpecs;
        private @Nullable Output<String> description;
        private Output<String> displayName;
        private @Nullable Output<String> project;

        public Builder() {
    	      // Empty
        }

        public Builder(AnnotationSpecSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.annotationSpecs = defaults.annotationSpecs;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.project = defaults.project;
        }

        public Builder annotationSpecs(Output<List<GoogleCloudDatalabelingV1beta1AnnotationSpecArgs>> annotationSpecs) {
            this.annotationSpecs = Objects.requireNonNull(annotationSpecs);
            return this;
        }
        public Builder annotationSpecs(List<GoogleCloudDatalabelingV1beta1AnnotationSpecArgs> annotationSpecs) {
            this.annotationSpecs = Output.of(Objects.requireNonNull(annotationSpecs));
            return this;
        }
        public Builder annotationSpecs(GoogleCloudDatalabelingV1beta1AnnotationSpecArgs... annotationSpecs) {
            return annotationSpecs(List.of(annotationSpecs));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder displayName(Output<String> displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }
        public Builder displayName(String displayName) {
            this.displayName = Output.of(Objects.requireNonNull(displayName));
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }        public AnnotationSpecSetArgs build() {
            return new AnnotationSpecSetArgs(annotationSpecs, description, displayName, project);
        }
    }
}
