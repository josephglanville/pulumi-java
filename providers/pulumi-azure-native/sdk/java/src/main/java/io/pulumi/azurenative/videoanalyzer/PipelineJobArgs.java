// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer;

import io.pulumi.azurenative.videoanalyzer.inputs.ParameterDefinitionArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineJobArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineJobArgs Empty = new PipelineJobArgs();

    /**
     * The Azure Video Analyzer account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * An optional description for the pipeline.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * List of the instance level parameter values for the user-defined topology parameters. A pipeline can only define or override parameters values for parameters which have been declared in the referenced topology. Topology parameters without a default value must be defined. Topology parameters with a default value can be optionally be overridden.
     * 
     */
    @Import(name="parameters")
      private final @Nullable Output<List<ParameterDefinitionArgs>> parameters;

    public Output<List<ParameterDefinitionArgs>> getParameters() {
        return this.parameters == null ? Output.empty() : this.parameters;
    }

    /**
     * The pipeline job name.
     * 
     */
    @Import(name="pipelineJobName")
      private final @Nullable Output<String> pipelineJobName;

    public Output<String> getPipelineJobName() {
        return this.pipelineJobName == null ? Output.empty() : this.pipelineJobName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Reference to an existing pipeline topology. When activated, this pipeline job will process content according to the pipeline topology definition.
     * 
     */
    @Import(name="topologyName", required=true)
      private final Output<String> topologyName;

    public Output<String> getTopologyName() {
        return this.topologyName;
    }

    public PipelineJobArgs(
        Output<String> accountName,
        @Nullable Output<String> description,
        @Nullable Output<List<ParameterDefinitionArgs>> parameters,
        @Nullable Output<String> pipelineJobName,
        Output<String> resourceGroupName,
        Output<String> topologyName) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.description = description;
        this.parameters = parameters;
        this.pipelineJobName = pipelineJobName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.topologyName = Objects.requireNonNull(topologyName, "expected parameter 'topologyName' to be non-null");
    }

    private PipelineJobArgs() {
        this.accountName = Output.empty();
        this.description = Output.empty();
        this.parameters = Output.empty();
        this.pipelineJobName = Output.empty();
        this.resourceGroupName = Output.empty();
        this.topologyName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineJobArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<String> description;
        private @Nullable Output<List<ParameterDefinitionArgs>> parameters;
        private @Nullable Output<String> pipelineJobName;
        private Output<String> resourceGroupName;
        private Output<String> topologyName;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineJobArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.description = defaults.description;
    	      this.parameters = defaults.parameters;
    	      this.pipelineJobName = defaults.pipelineJobName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.topologyName = defaults.topologyName;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder parameters(@Nullable Output<List<ParameterDefinitionArgs>> parameters) {
            this.parameters = parameters;
            return this;
        }
        public Builder parameters(@Nullable List<ParameterDefinitionArgs> parameters) {
            this.parameters = Output.ofNullable(parameters);
            return this;
        }
        public Builder parameters(ParameterDefinitionArgs... parameters) {
            return parameters(List.of(parameters));
        }
        public Builder pipelineJobName(@Nullable Output<String> pipelineJobName) {
            this.pipelineJobName = pipelineJobName;
            return this;
        }
        public Builder pipelineJobName(@Nullable String pipelineJobName) {
            this.pipelineJobName = Output.ofNullable(pipelineJobName);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder topologyName(Output<String> topologyName) {
            this.topologyName = Objects.requireNonNull(topologyName);
            return this;
        }
        public Builder topologyName(String topologyName) {
            this.topologyName = Output.of(Objects.requireNonNull(topologyName));
            return this;
        }        public PipelineJobArgs build() {
            return new PipelineJobArgs(accountName, description, parameters, pipelineJobName, resourceGroupName, topologyName);
        }
    }
}
