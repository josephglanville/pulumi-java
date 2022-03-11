// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync;

import io.pulumi.aws.appsync.inputs.FunctionSyncConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FunctionArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionArgs Empty = new FunctionArgs();

    /**
     * The ID of the associated AppSync API.
     * 
     */
    @InputImport(name="apiId", required=true)
      private final Output<String> apiId;

    public Output<String> getApiId() {
        return this.apiId;
    }

    /**
     * The Function DataSource name.
     * 
     */
    @InputImport(name="dataSource", required=true)
      private final Output<String> dataSource;

    public Output<String> getDataSource() {
        return this.dataSource;
    }

    /**
     * The Function description.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The version of the request mapping template. Currently the supported value is `2018-05-29`.
     * 
     */
    @InputImport(name="functionVersion")
      private final @Nullable Output<String> functionVersion;

    public Output<String> getFunctionVersion() {
        return this.functionVersion == null ? Output.empty() : this.functionVersion;
    }

    /**
     * The maximum batching size for a resolver. Valid values are between `0` and `2000`.
     * 
     */
    @InputImport(name="maxBatchSize")
      private final @Nullable Output<Integer> maxBatchSize;

    public Output<Integer> getMaxBatchSize() {
        return this.maxBatchSize == null ? Output.empty() : this.maxBatchSize;
    }

    /**
     * The Function name. The function name does not have to be unique.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * The Function request mapping template. Functions support only the 2018-05-29 version of the request mapping template.
     * 
     */
    @InputImport(name="requestMappingTemplate", required=true)
      private final Output<String> requestMappingTemplate;

    public Output<String> getRequestMappingTemplate() {
        return this.requestMappingTemplate;
    }

    /**
     * The Function response mapping template.
     * 
     */
    @InputImport(name="responseMappingTemplate", required=true)
      private final Output<String> responseMappingTemplate;

    public Output<String> getResponseMappingTemplate() {
        return this.responseMappingTemplate;
    }

    /**
     * Describes a Sync configuration for a resolver. See Sync Config.
     * 
     */
    @InputImport(name="syncConfig")
      private final @Nullable Output<FunctionSyncConfigArgs> syncConfig;

    public Output<FunctionSyncConfigArgs> getSyncConfig() {
        return this.syncConfig == null ? Output.empty() : this.syncConfig;
    }

    public FunctionArgs(
        Output<String> apiId,
        Output<String> dataSource,
        @Nullable Output<String> description,
        @Nullable Output<String> functionVersion,
        @Nullable Output<Integer> maxBatchSize,
        @Nullable Output<String> name,
        Output<String> requestMappingTemplate,
        Output<String> responseMappingTemplate,
        @Nullable Output<FunctionSyncConfigArgs> syncConfig) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.dataSource = Objects.requireNonNull(dataSource, "expected parameter 'dataSource' to be non-null");
        this.description = description;
        this.functionVersion = functionVersion;
        this.maxBatchSize = maxBatchSize;
        this.name = name;
        this.requestMappingTemplate = Objects.requireNonNull(requestMappingTemplate, "expected parameter 'requestMappingTemplate' to be non-null");
        this.responseMappingTemplate = Objects.requireNonNull(responseMappingTemplate, "expected parameter 'responseMappingTemplate' to be non-null");
        this.syncConfig = syncConfig;
    }

    private FunctionArgs() {
        this.apiId = Output.empty();
        this.dataSource = Output.empty();
        this.description = Output.empty();
        this.functionVersion = Output.empty();
        this.maxBatchSize = Output.empty();
        this.name = Output.empty();
        this.requestMappingTemplate = Output.empty();
        this.responseMappingTemplate = Output.empty();
        this.syncConfig = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> apiId;
        private Output<String> dataSource;
        private @Nullable Output<String> description;
        private @Nullable Output<String> functionVersion;
        private @Nullable Output<Integer> maxBatchSize;
        private @Nullable Output<String> name;
        private Output<String> requestMappingTemplate;
        private Output<String> responseMappingTemplate;
        private @Nullable Output<FunctionSyncConfigArgs> syncConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.dataSource = defaults.dataSource;
    	      this.description = defaults.description;
    	      this.functionVersion = defaults.functionVersion;
    	      this.maxBatchSize = defaults.maxBatchSize;
    	      this.name = defaults.name;
    	      this.requestMappingTemplate = defaults.requestMappingTemplate;
    	      this.responseMappingTemplate = defaults.responseMappingTemplate;
    	      this.syncConfig = defaults.syncConfig;
        }

        public Builder apiId(Output<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }

        public Builder apiId(String apiId) {
            this.apiId = Output.of(Objects.requireNonNull(apiId));
            return this;
        }

        public Builder dataSource(Output<String> dataSource) {
            this.dataSource = Objects.requireNonNull(dataSource);
            return this;
        }

        public Builder dataSource(String dataSource) {
            this.dataSource = Output.of(Objects.requireNonNull(dataSource));
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

        public Builder functionVersion(@Nullable Output<String> functionVersion) {
            this.functionVersion = functionVersion;
            return this;
        }

        public Builder functionVersion(@Nullable String functionVersion) {
            this.functionVersion = Output.ofNullable(functionVersion);
            return this;
        }

        public Builder maxBatchSize(@Nullable Output<Integer> maxBatchSize) {
            this.maxBatchSize = maxBatchSize;
            return this;
        }

        public Builder maxBatchSize(@Nullable Integer maxBatchSize) {
            this.maxBatchSize = Output.ofNullable(maxBatchSize);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder requestMappingTemplate(Output<String> requestMappingTemplate) {
            this.requestMappingTemplate = Objects.requireNonNull(requestMappingTemplate);
            return this;
        }

        public Builder requestMappingTemplate(String requestMappingTemplate) {
            this.requestMappingTemplate = Output.of(Objects.requireNonNull(requestMappingTemplate));
            return this;
        }

        public Builder responseMappingTemplate(Output<String> responseMappingTemplate) {
            this.responseMappingTemplate = Objects.requireNonNull(responseMappingTemplate);
            return this;
        }

        public Builder responseMappingTemplate(String responseMappingTemplate) {
            this.responseMappingTemplate = Output.of(Objects.requireNonNull(responseMappingTemplate));
            return this;
        }

        public Builder syncConfig(@Nullable Output<FunctionSyncConfigArgs> syncConfig) {
            this.syncConfig = syncConfig;
            return this;
        }

        public Builder syncConfig(@Nullable FunctionSyncConfigArgs syncConfig) {
            this.syncConfig = Output.ofNullable(syncConfig);
            return this;
        }
        public FunctionArgs build() {
            return new FunctionArgs(apiId, dataSource, description, functionVersion, maxBatchSize, name, requestMappingTemplate, responseMappingTemplate, syncConfig);
        }
    }
}
