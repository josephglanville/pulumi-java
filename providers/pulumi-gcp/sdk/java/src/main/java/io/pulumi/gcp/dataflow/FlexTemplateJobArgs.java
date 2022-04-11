// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataflow;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FlexTemplateJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlexTemplateJobArgs Empty = new FlexTemplateJobArgs();

    /**
     * The GCS path to the Dataflow job Flex
     * Template.
     * 
     */
    @Import(name="containerSpecGcsPath", required=true)
      private final Output<String> containerSpecGcsPath;

    public Output<String> getContainerSpecGcsPath() {
        return this.containerSpecGcsPath;
    }

    /**
     * User labels to be specified for the job. Keys and values
     * should follow the restrictions specified in the [labeling restrictions](https://cloud.google.com/compute/docs/labeling-resources#restrictions)
     * page. **Note**: This field is marked as deprecated as the API does not currently
     * support adding labels.
     * **NOTE**: Google-provided Dataflow templates often provide default labels
     * that begin with `goog-dataflow-provided`. Unless explicitly set in config, these
     * labels will be ignored to prevent diffs on re-apply.
     * 
     * @Deprecated
     * Deprecated until the API supports this field
     * 
     */
    @Deprecated /* Deprecated until the API supports this field */
    @Import(name="labels")
      private final @Nullable Output<Map<String,Object>> labels;

    @Deprecated /* Deprecated until the API supports this field */
    public Output<Map<String,Object>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * A unique name for the resource, required by Dataflow.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * One of "drain" or "cancel". Specifies behavior of
     * deletion during `pulumi destroy`.  See above note.
     * 
     */
    @Import(name="onDelete")
      private final @Nullable Output<String> onDelete;

    public Output<String> getOnDelete() {
        return this.onDelete == null ? Codegen.empty() : this.onDelete;
    }

    /**
     * Key/Value pairs to be passed to the Dataflow job (as
     * used in the template). Additional [pipeline options](https://cloud.google.com/dataflow/docs/guides/specifying-exec-params#setting-other-cloud-dataflow-pipeline-options)
     * such as `serviceAccount`, `workerMachineType`, etc can be specified here.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<Map<String,Object>> parameters;

    public Output<Map<String,Object>> getParameters() {
        return this.parameters == null ? Codegen.empty() : this.parameters;
    }

    /**
     * The project in which the resource belongs. If it is not
     * provided, the provider project is used.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Codegen.empty() : this.project;
    }

    /**
     * The region in which the created job should run.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    public FlexTemplateJobArgs(
        Output<String> containerSpecGcsPath,
        @Nullable Output<Map<String,Object>> labels,
        @Nullable Output<String> name,
        @Nullable Output<String> onDelete,
        @Nullable Output<Map<String,Object>> parameters,
        @Nullable Output<String> project,
        @Nullable Output<String> region) {
        this.containerSpecGcsPath = Objects.requireNonNull(containerSpecGcsPath, "expected parameter 'containerSpecGcsPath' to be non-null");
        this.labels = labels;
        this.name = name;
        this.onDelete = onDelete;
        this.parameters = parameters;
        this.project = project;
        this.region = region;
    }

    private FlexTemplateJobArgs() {
        this.containerSpecGcsPath = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.onDelete = Codegen.empty();
        this.parameters = Codegen.empty();
        this.project = Codegen.empty();
        this.region = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlexTemplateJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> containerSpecGcsPath;
        private @Nullable Output<Map<String,Object>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<String> onDelete;
        private @Nullable Output<Map<String,Object>> parameters;
        private @Nullable Output<String> project;
        private @Nullable Output<String> region;

        public Builder() {
    	      // Empty
        }

        public Builder(FlexTemplateJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerSpecGcsPath = defaults.containerSpecGcsPath;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.onDelete = defaults.onDelete;
    	      this.parameters = defaults.parameters;
    	      this.project = defaults.project;
    	      this.region = defaults.region;
        }

        public Builder containerSpecGcsPath(Output<String> containerSpecGcsPath) {
            this.containerSpecGcsPath = Objects.requireNonNull(containerSpecGcsPath);
            return this;
        }
        public Builder containerSpecGcsPath(String containerSpecGcsPath) {
            this.containerSpecGcsPath = Output.of(Objects.requireNonNull(containerSpecGcsPath));
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,Object>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,Object> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder onDelete(@Nullable Output<String> onDelete) {
            this.onDelete = onDelete;
            return this;
        }
        public Builder onDelete(@Nullable String onDelete) {
            this.onDelete = Codegen.ofNullable(onDelete);
            return this;
        }
        public Builder parameters(@Nullable Output<Map<String,Object>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable Map<String,Object> parameters) {
            this.parameters = Codegen.ofNullable(parameters);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Codegen.ofNullable(project);
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }        public FlexTemplateJobArgs build() {
            return new FlexTemplateJobArgs(containerSpecGcsPath, labels, name, onDelete, parameters, project, region);
        }
    }
}
