// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.codepipeline.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PipelineStageActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final PipelineStageActionArgs Empty = new PipelineStageActionArgs();

    /**
     * A category defines what kind of action can be taken in the stage, and constrains the provider type for the action. Possible values are `Approval`, `Build`, `Deploy`, `Invoke`, `Source` and `Test`.
     * 
     */
    @Import(name="category", required=true)
      private final Output<String> category;

    public Output<String> getCategory() {
        return this.category;
    }

    /**
     * A map of the action declaration's configuration. Configurations options for action types and providers can be found in the [Pipeline Structure Reference](http://docs.aws.amazon.com/codepipeline/latest/userguide/reference-pipeline-structure.html#action-requirements) and [Action Structure Reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) documentation.
     * 
     */
    @Import(name="configuration")
      private final @Nullable Output<Map<String,String>> configuration;

    public Output<Map<String,String>> getConfiguration() {
        return this.configuration == null ? Codegen.empty() : this.configuration;
    }

    /**
     * A list of artifact names to be worked on.
     * 
     */
    @Import(name="inputArtifacts")
      private final @Nullable Output<List<String>> inputArtifacts;

    public Output<List<String>> getInputArtifacts() {
        return this.inputArtifacts == null ? Codegen.empty() : this.inputArtifacts;
    }

    /**
     * The action declaration's name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The namespace all output variables will be accessed from.
     * 
     */
    @Import(name="namespace")
      private final @Nullable Output<String> namespace;

    public Output<String> getNamespace() {
        return this.namespace == null ? Codegen.empty() : this.namespace;
    }

    /**
     * A list of artifact names to output. Output artifact names must be unique within a pipeline.
     * 
     */
    @Import(name="outputArtifacts")
      private final @Nullable Output<List<String>> outputArtifacts;

    public Output<List<String>> getOutputArtifacts() {
        return this.outputArtifacts == null ? Codegen.empty() : this.outputArtifacts;
    }

    /**
     * The creator of the action being called. Possible values are `AWS`, `Custom` and `ThirdParty`.
     * 
     */
    @Import(name="owner", required=true)
      private final Output<String> owner;

    public Output<String> getOwner() {
        return this.owner;
    }

    /**
     * The provider of the service being called by the action. Valid providers are determined by the action category. Provider names are listed in the [Action Structure Reference](https://docs.aws.amazon.com/codepipeline/latest/userguide/action-reference.html) documentation.
     * 
     */
    @Import(name="provider", required=true)
      private final Output<String> provider;

    public Output<String> getProvider() {
        return this.provider;
    }

    /**
     * The region in which to run the action.
     * 
     */
    @Import(name="region")
      private final @Nullable Output<String> region;

    public Output<String> getRegion() {
        return this.region == null ? Codegen.empty() : this.region;
    }

    /**
     * The ARN of the IAM service role that will perform the declared action. This is assumed through the roleArn for the pipeline.
     * 
     */
    @Import(name="roleArn")
      private final @Nullable Output<String> roleArn;

    public Output<String> getRoleArn() {
        return this.roleArn == null ? Codegen.empty() : this.roleArn;
    }

    /**
     * The order in which actions are run.
     * 
     */
    @Import(name="runOrder")
      private final @Nullable Output<Integer> runOrder;

    public Output<Integer> getRunOrder() {
        return this.runOrder == null ? Codegen.empty() : this.runOrder;
    }

    /**
     * A string that identifies the action type.
     * 
     */
    @Import(name="version", required=true)
      private final Output<String> version;

    public Output<String> getVersion() {
        return this.version;
    }

    public PipelineStageActionArgs(
        Output<String> category,
        @Nullable Output<Map<String,String>> configuration,
        @Nullable Output<List<String>> inputArtifacts,
        Output<String> name,
        @Nullable Output<String> namespace,
        @Nullable Output<List<String>> outputArtifacts,
        Output<String> owner,
        Output<String> provider,
        @Nullable Output<String> region,
        @Nullable Output<String> roleArn,
        @Nullable Output<Integer> runOrder,
        Output<String> version) {
        this.category = Objects.requireNonNull(category, "expected parameter 'category' to be non-null");
        this.configuration = configuration;
        this.inputArtifacts = inputArtifacts;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.namespace = namespace;
        this.outputArtifacts = outputArtifacts;
        this.owner = Objects.requireNonNull(owner, "expected parameter 'owner' to be non-null");
        this.provider = Objects.requireNonNull(provider, "expected parameter 'provider' to be non-null");
        this.region = region;
        this.roleArn = roleArn;
        this.runOrder = runOrder;
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private PipelineStageActionArgs() {
        this.category = Codegen.empty();
        this.configuration = Codegen.empty();
        this.inputArtifacts = Codegen.empty();
        this.name = Codegen.empty();
        this.namespace = Codegen.empty();
        this.outputArtifacts = Codegen.empty();
        this.owner = Codegen.empty();
        this.provider = Codegen.empty();
        this.region = Codegen.empty();
        this.roleArn = Codegen.empty();
        this.runOrder = Codegen.empty();
        this.version = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineStageActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> category;
        private @Nullable Output<Map<String,String>> configuration;
        private @Nullable Output<List<String>> inputArtifacts;
        private Output<String> name;
        private @Nullable Output<String> namespace;
        private @Nullable Output<List<String>> outputArtifacts;
        private Output<String> owner;
        private Output<String> provider;
        private @Nullable Output<String> region;
        private @Nullable Output<String> roleArn;
        private @Nullable Output<Integer> runOrder;
        private Output<String> version;

        public Builder() {
    	      // Empty
        }

        public Builder(PipelineStageActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.category = defaults.category;
    	      this.configuration = defaults.configuration;
    	      this.inputArtifacts = defaults.inputArtifacts;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.outputArtifacts = defaults.outputArtifacts;
    	      this.owner = defaults.owner;
    	      this.provider = defaults.provider;
    	      this.region = defaults.region;
    	      this.roleArn = defaults.roleArn;
    	      this.runOrder = defaults.runOrder;
    	      this.version = defaults.version;
        }

        public Builder category(Output<String> category) {
            this.category = Objects.requireNonNull(category);
            return this;
        }
        public Builder category(String category) {
            this.category = Output.of(Objects.requireNonNull(category));
            return this;
        }
        public Builder configuration(@Nullable Output<Map<String,String>> configuration) {
            this.configuration = configuration;
            return this;
        }
        public Builder configuration(@Nullable Map<String,String> configuration) {
            this.configuration = Codegen.ofNullable(configuration);
            return this;
        }
        public Builder inputArtifacts(@Nullable Output<List<String>> inputArtifacts) {
            this.inputArtifacts = inputArtifacts;
            return this;
        }
        public Builder inputArtifacts(@Nullable List<String> inputArtifacts) {
            this.inputArtifacts = Codegen.ofNullable(inputArtifacts);
            return this;
        }
        public Builder inputArtifacts(String... inputArtifacts) {
            return inputArtifacts(List.of(inputArtifacts));
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder namespace(@Nullable Output<String> namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = Codegen.ofNullable(namespace);
            return this;
        }
        public Builder outputArtifacts(@Nullable Output<List<String>> outputArtifacts) {
            this.outputArtifacts = outputArtifacts;
            return this;
        }
        public Builder outputArtifacts(@Nullable List<String> outputArtifacts) {
            this.outputArtifacts = Codegen.ofNullable(outputArtifacts);
            return this;
        }
        public Builder outputArtifacts(String... outputArtifacts) {
            return outputArtifacts(List.of(outputArtifacts));
        }
        public Builder owner(Output<String> owner) {
            this.owner = Objects.requireNonNull(owner);
            return this;
        }
        public Builder owner(String owner) {
            this.owner = Output.of(Objects.requireNonNull(owner));
            return this;
        }
        public Builder provider(Output<String> provider) {
            this.provider = Objects.requireNonNull(provider);
            return this;
        }
        public Builder provider(String provider) {
            this.provider = Output.of(Objects.requireNonNull(provider));
            return this;
        }
        public Builder region(@Nullable Output<String> region) {
            this.region = region;
            return this;
        }
        public Builder region(@Nullable String region) {
            this.region = Codegen.ofNullable(region);
            return this;
        }
        public Builder roleArn(@Nullable Output<String> roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public Builder roleArn(@Nullable String roleArn) {
            this.roleArn = Codegen.ofNullable(roleArn);
            return this;
        }
        public Builder runOrder(@Nullable Output<Integer> runOrder) {
            this.runOrder = runOrder;
            return this;
        }
        public Builder runOrder(@Nullable Integer runOrder) {
            this.runOrder = Codegen.ofNullable(runOrder);
            return this;
        }
        public Builder version(Output<String> version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public Builder version(String version) {
            this.version = Output.of(Objects.requireNonNull(version));
            return this;
        }        public PipelineStageActionArgs build() {
            return new PipelineStageActionArgs(category, configuration, inputArtifacts, name, namespace, outputArtifacts, owner, provider, region, roleArn, runOrder, version);
        }
    }
}
