// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.genomics_v1alpha2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.genomics_v1alpha2.inputs.DockerExecutorArgs;
import io.pulumi.googlenative.genomics_v1alpha2.inputs.PipelineParameterArgs;
import io.pulumi.googlenative.genomics_v1alpha2.inputs.PipelineResourcesArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineArgs Empty = new PipelineArgs();

    /**
     * User-specified description.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * Specifies the docker run information.
     * 
     */
    @Import(name="docker")
      private final @Nullable Output<DockerExecutorArgs> docker;

    public Output<DockerExecutorArgs> getDocker() {
        return this.docker == null ? Output.empty() : this.docker;
    }

    /**
     * Input parameters of the pipeline.
     * 
     */
    @Import(name="inputParameters")
      private final @Nullable Output<List<PipelineParameterArgs>> inputParameters;

    public Output<List<PipelineParameterArgs>> getInputParameters() {
        return this.inputParameters == null ? Output.empty() : this.inputParameters;
    }

    /**
     * A user specified pipeline name that does not have to be unique. This name can be used for filtering Pipelines in ListPipelines.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Output parameters of the pipeline.
     * 
     */
    @Import(name="outputParameters")
      private final @Nullable Output<List<PipelineParameterArgs>> outputParameters;

    public Output<List<PipelineParameterArgs>> getOutputParameters() {
        return this.outputParameters == null ? Output.empty() : this.outputParameters;
    }

    /**
     * Unique pipeline id that is generated by the service when CreatePipeline is called. Cannot be specified in the Pipeline used in the CreatePipelineRequest, and will be populated in the response to CreatePipeline and all subsequent Get and List calls. Indicates that the service has registered this pipeline.
     * 
     */
    @Import(name="pipelineId")
      private final @Nullable Output<String> pipelineId;

    public Output<String> getPipelineId() {
        return this.pipelineId == null ? Output.empty() : this.pipelineId;
    }

    /**
     * The project in which to create the pipeline. The caller must have WRITE access.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * Specifies resource requirements for the pipeline run. Required fields: * minimumCpuCores * minimumRamGb
     * 
     */
    @Import(name="resources", required=true)
      private final Output<PipelineResourcesArgs> resources;

    public Output<PipelineResourcesArgs> getResources() {
        return this.resources;
    }

    public PipelineArgs(
        @Nullable Output<String> description,
        @Nullable Output<DockerExecutorArgs> docker,
        @Nullable Output<List<PipelineParameterArgs>> inputParameters,
        @Nullable Output<String> name,
        @Nullable Output<List<PipelineParameterArgs>> outputParameters,
        @Nullable Output<String> pipelineId,
        @Nullable Output<String> project,
        Output<PipelineResourcesArgs> resources) {
        this.description = description;
        this.docker = docker;
        this.inputParameters = inputParameters;
        this.name = name;
        this.outputParameters = outputParameters;
        this.pipelineId = pipelineId;
        this.project = project;
        this.resources = Objects.requireNonNull(resources, "expected parameter 'resources' to be non-null");
    }

    private PipelineArgs() {
        this.description = Output.empty();
        this.docker = Output.empty();
        this.inputParameters = Output.empty();
        this.name = Output.empty();
        this.outputParameters = Output.empty();
        this.pipelineId = Output.empty();
        this.project = Output.empty();
        this.resources = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<DockerExecutorArgs> docker;
        private @Nullable Output<List<PipelineParameterArgs>> inputParameters;
        private @Nullable Output<String> name;
        private @Nullable Output<List<PipelineParameterArgs>> outputParameters;
        private @Nullable Output<String> pipelineId;
        private @Nullable Output<String> project;
        private Output<PipelineResourcesArgs> resources;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.docker = defaults.docker;
    	      this.inputParameters = defaults.inputParameters;
    	      this.name = defaults.name;
    	      this.outputParameters = defaults.outputParameters;
    	      this.pipelineId = defaults.pipelineId;
    	      this.project = defaults.project;
    	      this.resources = defaults.resources;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder docker(@Nullable Output<DockerExecutorArgs> docker) {
            this.docker = docker;
            return this;
        }
        public Builder docker(@Nullable DockerExecutorArgs docker) {
            this.docker = Output.ofNullable(docker);
            return this;
        }
        public Builder inputParameters(@Nullable Output<List<PipelineParameterArgs>> inputParameters) {
            this.inputParameters = inputParameters;
            return this;
        }
        public Builder inputParameters(@Nullable List<PipelineParameterArgs> inputParameters) {
            this.inputParameters = Output.ofNullable(inputParameters);
            return this;
        }
        public Builder inputParameters(PipelineParameterArgs... inputParameters) {
            return inputParameters(List.of(inputParameters));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder outputParameters(@Nullable Output<List<PipelineParameterArgs>> outputParameters) {
            this.outputParameters = outputParameters;
            return this;
        }
        public Builder outputParameters(@Nullable List<PipelineParameterArgs> outputParameters) {
            this.outputParameters = Output.ofNullable(outputParameters);
            return this;
        }
        public Builder outputParameters(PipelineParameterArgs... outputParameters) {
            return outputParameters(List.of(outputParameters));
        }
        public Builder pipelineId(@Nullable Output<String> pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public Builder pipelineId(@Nullable String pipelineId) {
            this.pipelineId = Output.ofNullable(pipelineId);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder resources(Output<PipelineResourcesArgs> resources) {
            this.resources = Objects.requireNonNull(resources);
            return this;
        }
        public Builder resources(PipelineResourcesArgs resources) {
            this.resources = Output.of(Objects.requireNonNull(resources));
            return this;
        }        public PipelineArgs build() {
            return new PipelineArgs(description, docker, inputParameters, name, outputParameters, pipelineId, project, resources);
        }
    }
}
