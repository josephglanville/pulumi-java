// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.azurenative.machinelearningservices.inputs.ContainerResourceRequirementsArgs;
import io.pulumi.azurenative.machinelearningservices.inputs.DatasetReferenceArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Double;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * An Azure Machine Learning Model.
 * 
 */
public final class ModelArgs extends io.pulumi.resources.ResourceArgs {

    public static final ModelArgs Empty = new ModelArgs();

    /**
     * The Model creation time (UTC).
     * 
     */
    @Import(name="createdTime")
      private final @Nullable Output<String> createdTime;

    public Output<String> getCreatedTime() {
        return this.createdTime == null ? Output.empty() : this.createdTime;
    }

    /**
     * The list of datasets associated with the model.
     * 
     */
    @Import(name="datasets")
      private final @Nullable Output<List<DatasetReferenceArgs>> datasets;

    public Output<List<DatasetReferenceArgs>> getDatasets() {
        return this.datasets == null ? Output.empty() : this.datasets;
    }

    /**
     * Models derived from this model
     * 
     */
    @Import(name="derivedModelIds")
      private final @Nullable Output<List<String>> derivedModelIds;

    public Output<List<String>> getDerivedModelIds() {
        return this.derivedModelIds == null ? Output.empty() : this.derivedModelIds;
    }

    /**
     * The Model description text.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The name of the experiment where this model was created.
     * 
     */
    @Import(name="experimentName")
      private final @Nullable Output<String> experimentName;

    public Output<String> getExperimentName() {
        return this.experimentName == null ? Output.empty() : this.experimentName;
    }

    /**
     * The Model framework.
     * 
     */
    @Import(name="framework")
      private final @Nullable Output<String> framework;

    public Output<String> getFramework() {
        return this.framework == null ? Output.empty() : this.framework;
    }

    /**
     * The Model framework version.
     * 
     */
    @Import(name="frameworkVersion")
      private final @Nullable Output<String> frameworkVersion;

    public Output<String> getFrameworkVersion() {
        return this.frameworkVersion == null ? Output.empty() : this.frameworkVersion;
    }

    /**
     * The Model Id.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    /**
     * The Model tag dictionary. Items are mutable.
     * 
     */
    @Import(name="kvTags")
      private final @Nullable Output<Map<String,String>> kvTags;

    public Output<Map<String,String>> getKvTags() {
        return this.kvTags == null ? Output.empty() : this.kvTags;
    }

    /**
     * The MIME type of Model content. For more details about MIME type, please open https://www.iana.org/assignments/media-types/media-types.xhtml
     * 
     */
    @Import(name="mimeType", required=true)
      private final Output<String> mimeType;

    public Output<String> getMimeType() {
        return this.mimeType;
    }

    /**
     * The Model last modified time (UTC).
     * 
     */
    @Import(name="modifiedTime")
      private final @Nullable Output<String> modifiedTime;

    public Output<String> getModifiedTime() {
        return this.modifiedTime == null ? Output.empty() : this.modifiedTime;
    }

    /**
     * The Model name.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * The Parent Model Id.
     * 
     */
    @Import(name="parentModelId")
      private final @Nullable Output<String> parentModelId;

    public Output<String> getParentModelId() {
        return this.parentModelId == null ? Output.empty() : this.parentModelId;
    }

    /**
     * The Model property dictionary. Properties are immutable.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<Map<String,String>> properties;

    public Output<Map<String,String>> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * Resource requirements for the model
     * 
     */
    @Import(name="resourceRequirements")
      private final @Nullable Output<ContainerResourceRequirementsArgs> resourceRequirements;

    public Output<ContainerResourceRequirementsArgs> getResourceRequirements() {
        return this.resourceRequirements == null ? Output.empty() : this.resourceRequirements;
    }

    /**
     * The RunId that created this model.
     * 
     */
    @Import(name="runId")
      private final @Nullable Output<String> runId;

    public Output<String> getRunId() {
        return this.runId == null ? Output.empty() : this.runId;
    }

    /**
     * Sample Input Data for the Model. A reference to a dataset in the workspace in the format aml://dataset/{datasetId}
     * 
     */
    @Import(name="sampleInputData")
      private final @Nullable Output<String> sampleInputData;

    public Output<String> getSampleInputData() {
        return this.sampleInputData == null ? Output.empty() : this.sampleInputData;
    }

    /**
     * Sample Output Data for the Model. A reference to a dataset in the workspace in the format aml://dataset/{datasetId}
     * 
     */
    @Import(name="sampleOutputData")
      private final @Nullable Output<String> sampleOutputData;

    public Output<String> getSampleOutputData() {
        return this.sampleOutputData == null ? Output.empty() : this.sampleOutputData;
    }

    /**
     * Indicates whether we need to unpack the Model during docker Image creation.
     * 
     */
    @Import(name="unpack")
      private final @Nullable Output<Boolean> unpack;

    public Output<Boolean> getUnpack() {
        return this.unpack == null ? Output.empty() : this.unpack;
    }

    /**
     * The URL of the Model. Usually a SAS URL.
     * 
     */
    @Import(name="url", required=true)
      private final Output<String> url;

    public Output<String> getUrl() {
        return this.url;
    }

    /**
     * The Model version assigned by Model Management Service.
     * 
     */
    @Import(name="version")
      private final @Nullable Output<Double> version;

    public Output<Double> getVersion() {
        return this.version == null ? Output.empty() : this.version;
    }

    public ModelArgs(
        @Nullable Output<String> createdTime,
        @Nullable Output<List<DatasetReferenceArgs>> datasets,
        @Nullable Output<List<String>> derivedModelIds,
        @Nullable Output<String> description,
        @Nullable Output<String> experimentName,
        @Nullable Output<String> framework,
        @Nullable Output<String> frameworkVersion,
        @Nullable Output<String> id,
        @Nullable Output<Map<String,String>> kvTags,
        Output<String> mimeType,
        @Nullable Output<String> modifiedTime,
        Output<String> name,
        @Nullable Output<String> parentModelId,
        @Nullable Output<Map<String,String>> properties,
        @Nullable Output<ContainerResourceRequirementsArgs> resourceRequirements,
        @Nullable Output<String> runId,
        @Nullable Output<String> sampleInputData,
        @Nullable Output<String> sampleOutputData,
        @Nullable Output<Boolean> unpack,
        Output<String> url,
        @Nullable Output<Double> version) {
        this.createdTime = createdTime;
        this.datasets = datasets;
        this.derivedModelIds = derivedModelIds;
        this.description = description;
        this.experimentName = experimentName;
        this.framework = framework;
        this.frameworkVersion = frameworkVersion;
        this.id = id;
        this.kvTags = kvTags;
        this.mimeType = Objects.requireNonNull(mimeType, "expected parameter 'mimeType' to be non-null");
        this.modifiedTime = modifiedTime;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.parentModelId = parentModelId;
        this.properties = properties;
        this.resourceRequirements = resourceRequirements;
        this.runId = runId;
        this.sampleInputData = sampleInputData;
        this.sampleOutputData = sampleOutputData;
        this.unpack = unpack;
        this.url = Objects.requireNonNull(url, "expected parameter 'url' to be non-null");
        this.version = version;
    }

    private ModelArgs() {
        this.createdTime = Output.empty();
        this.datasets = Output.empty();
        this.derivedModelIds = Output.empty();
        this.description = Output.empty();
        this.experimentName = Output.empty();
        this.framework = Output.empty();
        this.frameworkVersion = Output.empty();
        this.id = Output.empty();
        this.kvTags = Output.empty();
        this.mimeType = Output.empty();
        this.modifiedTime = Output.empty();
        this.name = Output.empty();
        this.parentModelId = Output.empty();
        this.properties = Output.empty();
        this.resourceRequirements = Output.empty();
        this.runId = Output.empty();
        this.sampleInputData = Output.empty();
        this.sampleOutputData = Output.empty();
        this.unpack = Output.empty();
        this.url = Output.empty();
        this.version = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ModelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> createdTime;
        private @Nullable Output<List<DatasetReferenceArgs>> datasets;
        private @Nullable Output<List<String>> derivedModelIds;
        private @Nullable Output<String> description;
        private @Nullable Output<String> experimentName;
        private @Nullable Output<String> framework;
        private @Nullable Output<String> frameworkVersion;
        private @Nullable Output<String> id;
        private @Nullable Output<Map<String,String>> kvTags;
        private Output<String> mimeType;
        private @Nullable Output<String> modifiedTime;
        private Output<String> name;
        private @Nullable Output<String> parentModelId;
        private @Nullable Output<Map<String,String>> properties;
        private @Nullable Output<ContainerResourceRequirementsArgs> resourceRequirements;
        private @Nullable Output<String> runId;
        private @Nullable Output<String> sampleInputData;
        private @Nullable Output<String> sampleOutputData;
        private @Nullable Output<Boolean> unpack;
        private Output<String> url;
        private @Nullable Output<Double> version;

        public Builder() {
    	      // Empty
        }

        public Builder(ModelArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.createdTime = defaults.createdTime;
    	      this.datasets = defaults.datasets;
    	      this.derivedModelIds = defaults.derivedModelIds;
    	      this.description = defaults.description;
    	      this.experimentName = defaults.experimentName;
    	      this.framework = defaults.framework;
    	      this.frameworkVersion = defaults.frameworkVersion;
    	      this.id = defaults.id;
    	      this.kvTags = defaults.kvTags;
    	      this.mimeType = defaults.mimeType;
    	      this.modifiedTime = defaults.modifiedTime;
    	      this.name = defaults.name;
    	      this.parentModelId = defaults.parentModelId;
    	      this.properties = defaults.properties;
    	      this.resourceRequirements = defaults.resourceRequirements;
    	      this.runId = defaults.runId;
    	      this.sampleInputData = defaults.sampleInputData;
    	      this.sampleOutputData = defaults.sampleOutputData;
    	      this.unpack = defaults.unpack;
    	      this.url = defaults.url;
    	      this.version = defaults.version;
        }

        public Builder createdTime(@Nullable Output<String> createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = Output.ofNullable(createdTime);
            return this;
        }
        public Builder datasets(@Nullable Output<List<DatasetReferenceArgs>> datasets) {
            this.datasets = datasets;
            return this;
        }
        public Builder datasets(@Nullable List<DatasetReferenceArgs> datasets) {
            this.datasets = Output.ofNullable(datasets);
            return this;
        }
        public Builder datasets(DatasetReferenceArgs... datasets) {
            return datasets(List.of(datasets));
        }
        public Builder derivedModelIds(@Nullable Output<List<String>> derivedModelIds) {
            this.derivedModelIds = derivedModelIds;
            return this;
        }
        public Builder derivedModelIds(@Nullable List<String> derivedModelIds) {
            this.derivedModelIds = Output.ofNullable(derivedModelIds);
            return this;
        }
        public Builder derivedModelIds(String... derivedModelIds) {
            return derivedModelIds(List.of(derivedModelIds));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder experimentName(@Nullable Output<String> experimentName) {
            this.experimentName = experimentName;
            return this;
        }
        public Builder experimentName(@Nullable String experimentName) {
            this.experimentName = Output.ofNullable(experimentName);
            return this;
        }
        public Builder framework(@Nullable Output<String> framework) {
            this.framework = framework;
            return this;
        }
        public Builder framework(@Nullable String framework) {
            this.framework = Output.ofNullable(framework);
            return this;
        }
        public Builder frameworkVersion(@Nullable Output<String> frameworkVersion) {
            this.frameworkVersion = frameworkVersion;
            return this;
        }
        public Builder frameworkVersion(@Nullable String frameworkVersion) {
            this.frameworkVersion = Output.ofNullable(frameworkVersion);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder kvTags(@Nullable Output<Map<String,String>> kvTags) {
            this.kvTags = kvTags;
            return this;
        }
        public Builder kvTags(@Nullable Map<String,String> kvTags) {
            this.kvTags = Output.ofNullable(kvTags);
            return this;
        }
        public Builder mimeType(Output<String> mimeType) {
            this.mimeType = Objects.requireNonNull(mimeType);
            return this;
        }
        public Builder mimeType(String mimeType) {
            this.mimeType = Output.of(Objects.requireNonNull(mimeType));
            return this;
        }
        public Builder modifiedTime(@Nullable Output<String> modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public Builder modifiedTime(@Nullable String modifiedTime) {
            this.modifiedTime = Output.ofNullable(modifiedTime);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder parentModelId(@Nullable Output<String> parentModelId) {
            this.parentModelId = parentModelId;
            return this;
        }
        public Builder parentModelId(@Nullable String parentModelId) {
            this.parentModelId = Output.ofNullable(parentModelId);
            return this;
        }
        public Builder properties(@Nullable Output<Map<String,String>> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable Map<String,String> properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }
        public Builder resourceRequirements(@Nullable Output<ContainerResourceRequirementsArgs> resourceRequirements) {
            this.resourceRequirements = resourceRequirements;
            return this;
        }
        public Builder resourceRequirements(@Nullable ContainerResourceRequirementsArgs resourceRequirements) {
            this.resourceRequirements = Output.ofNullable(resourceRequirements);
            return this;
        }
        public Builder runId(@Nullable Output<String> runId) {
            this.runId = runId;
            return this;
        }
        public Builder runId(@Nullable String runId) {
            this.runId = Output.ofNullable(runId);
            return this;
        }
        public Builder sampleInputData(@Nullable Output<String> sampleInputData) {
            this.sampleInputData = sampleInputData;
            return this;
        }
        public Builder sampleInputData(@Nullable String sampleInputData) {
            this.sampleInputData = Output.ofNullable(sampleInputData);
            return this;
        }
        public Builder sampleOutputData(@Nullable Output<String> sampleOutputData) {
            this.sampleOutputData = sampleOutputData;
            return this;
        }
        public Builder sampleOutputData(@Nullable String sampleOutputData) {
            this.sampleOutputData = Output.ofNullable(sampleOutputData);
            return this;
        }
        public Builder unpack(@Nullable Output<Boolean> unpack) {
            this.unpack = unpack;
            return this;
        }
        public Builder unpack(@Nullable Boolean unpack) {
            this.unpack = Output.ofNullable(unpack);
            return this;
        }
        public Builder url(Output<String> url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }
        public Builder url(String url) {
            this.url = Output.of(Objects.requireNonNull(url));
            return this;
        }
        public Builder version(@Nullable Output<Double> version) {
            this.version = version;
            return this;
        }
        public Builder version(@Nullable Double version) {
            this.version = Output.ofNullable(version);
            return this;
        }        public ModelArgs build() {
            return new ModelArgs(createdTime, datasets, derivedModelIds, description, experimentName, framework, frameworkVersion, id, kvTags, mimeType, modifiedTime, name, parentModelId, properties, resourceRequirements, runId, sampleInputData, sampleOutputData, unpack, url, version);
        }
    }
}
