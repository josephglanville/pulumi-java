// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync;

import io.pulumi.aws.appsync.inputs.ResolverCachingConfigArgs;
import io.pulumi.aws.appsync.inputs.ResolverPipelineConfigArgs;
import io.pulumi.aws.appsync.inputs.ResolverSyncConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverArgs Empty = new ResolverArgs();

    /**
     * The API ID for the GraphQL API.
     * 
     */
    @Import(name="apiId", required=true)
      private final Output<String> apiId;

    public Output<String> getApiId() {
        return this.apiId;
    }

    /**
     * The CachingConfig.
     * 
     */
    @Import(name="cachingConfig")
      private final @Nullable Output<ResolverCachingConfigArgs> cachingConfig;

    public Output<ResolverCachingConfigArgs> getCachingConfig() {
        return this.cachingConfig == null ? Output.empty() : this.cachingConfig;
    }

    /**
     * The DataSource name.
     * 
     */
    @Import(name="dataSource")
      private final @Nullable Output<String> dataSource;

    public Output<String> getDataSource() {
        return this.dataSource == null ? Output.empty() : this.dataSource;
    }

    /**
     * The field name from the schema defined in the GraphQL API.
     * 
     */
    @Import(name="field", required=true)
      private final Output<String> field;

    public Output<String> getField() {
        return this.field;
    }

    /**
     * The resolver type. Valid values are `UNIT` and `PIPELINE`.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Output.empty() : this.kind;
    }

    /**
     * The maximum batching size for a resolver. Valid values are between `0` and `2000`.
     * 
     */
    @Import(name="maxBatchSize")
      private final @Nullable Output<Integer> maxBatchSize;

    public Output<Integer> getMaxBatchSize() {
        return this.maxBatchSize == null ? Output.empty() : this.maxBatchSize;
    }

    /**
     * The PipelineConfig.
     * 
     */
    @Import(name="pipelineConfig")
      private final @Nullable Output<ResolverPipelineConfigArgs> pipelineConfig;

    public Output<ResolverPipelineConfigArgs> getPipelineConfig() {
        return this.pipelineConfig == null ? Output.empty() : this.pipelineConfig;
    }

    /**
     * The request mapping template for UNIT resolver or 'before mapping template' for PIPELINE resolver. Required for non-Lambda resolvers.
     * 
     */
    @Import(name="requestTemplate")
      private final @Nullable Output<String> requestTemplate;

    public Output<String> getRequestTemplate() {
        return this.requestTemplate == null ? Output.empty() : this.requestTemplate;
    }

    /**
     * The response mapping template for UNIT resolver or 'after mapping template' for PIPELINE resolver. Required for non-Lambda resolvers.
     * 
     */
    @Import(name="responseTemplate")
      private final @Nullable Output<String> responseTemplate;

    public Output<String> getResponseTemplate() {
        return this.responseTemplate == null ? Output.empty() : this.responseTemplate;
    }

    /**
     * Describes a Sync configuration for a resolver. See Sync Config.
     * 
     */
    @Import(name="syncConfig")
      private final @Nullable Output<ResolverSyncConfigArgs> syncConfig;

    public Output<ResolverSyncConfigArgs> getSyncConfig() {
        return this.syncConfig == null ? Output.empty() : this.syncConfig;
    }

    /**
     * The type name from the schema defined in the GraphQL API.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public ResolverArgs(
        Output<String> apiId,
        @Nullable Output<ResolverCachingConfigArgs> cachingConfig,
        @Nullable Output<String> dataSource,
        Output<String> field,
        @Nullable Output<String> kind,
        @Nullable Output<Integer> maxBatchSize,
        @Nullable Output<ResolverPipelineConfigArgs> pipelineConfig,
        @Nullable Output<String> requestTemplate,
        @Nullable Output<String> responseTemplate,
        @Nullable Output<ResolverSyncConfigArgs> syncConfig,
        Output<String> type) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.cachingConfig = cachingConfig;
        this.dataSource = dataSource;
        this.field = Objects.requireNonNull(field, "expected parameter 'field' to be non-null");
        this.kind = kind;
        this.maxBatchSize = maxBatchSize;
        this.pipelineConfig = pipelineConfig;
        this.requestTemplate = requestTemplate;
        this.responseTemplate = responseTemplate;
        this.syncConfig = syncConfig;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ResolverArgs() {
        this.apiId = Output.empty();
        this.cachingConfig = Output.empty();
        this.dataSource = Output.empty();
        this.field = Output.empty();
        this.kind = Output.empty();
        this.maxBatchSize = Output.empty();
        this.pipelineConfig = Output.empty();
        this.requestTemplate = Output.empty();
        this.responseTemplate = Output.empty();
        this.syncConfig = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> apiId;
        private @Nullable Output<ResolverCachingConfigArgs> cachingConfig;
        private @Nullable Output<String> dataSource;
        private Output<String> field;
        private @Nullable Output<String> kind;
        private @Nullable Output<Integer> maxBatchSize;
        private @Nullable Output<ResolverPipelineConfigArgs> pipelineConfig;
        private @Nullable Output<String> requestTemplate;
        private @Nullable Output<String> responseTemplate;
        private @Nullable Output<ResolverSyncConfigArgs> syncConfig;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.cachingConfig = defaults.cachingConfig;
    	      this.dataSource = defaults.dataSource;
    	      this.field = defaults.field;
    	      this.kind = defaults.kind;
    	      this.maxBatchSize = defaults.maxBatchSize;
    	      this.pipelineConfig = defaults.pipelineConfig;
    	      this.requestTemplate = defaults.requestTemplate;
    	      this.responseTemplate = defaults.responseTemplate;
    	      this.syncConfig = defaults.syncConfig;
    	      this.type = defaults.type;
        }

        public Builder apiId(Output<String> apiId) {
            this.apiId = Objects.requireNonNull(apiId);
            return this;
        }
        public Builder apiId(String apiId) {
            this.apiId = Output.of(Objects.requireNonNull(apiId));
            return this;
        }
        public Builder cachingConfig(@Nullable Output<ResolverCachingConfigArgs> cachingConfig) {
            this.cachingConfig = cachingConfig;
            return this;
        }
        public Builder cachingConfig(@Nullable ResolverCachingConfigArgs cachingConfig) {
            this.cachingConfig = Output.ofNullable(cachingConfig);
            return this;
        }
        public Builder dataSource(@Nullable Output<String> dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public Builder dataSource(@Nullable String dataSource) {
            this.dataSource = Output.ofNullable(dataSource);
            return this;
        }
        public Builder field(Output<String> field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }
        public Builder field(String field) {
            this.field = Output.of(Objects.requireNonNull(field));
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Output.ofNullable(kind);
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
        public Builder pipelineConfig(@Nullable Output<ResolverPipelineConfigArgs> pipelineConfig) {
            this.pipelineConfig = pipelineConfig;
            return this;
        }
        public Builder pipelineConfig(@Nullable ResolverPipelineConfigArgs pipelineConfig) {
            this.pipelineConfig = Output.ofNullable(pipelineConfig);
            return this;
        }
        public Builder requestTemplate(@Nullable Output<String> requestTemplate) {
            this.requestTemplate = requestTemplate;
            return this;
        }
        public Builder requestTemplate(@Nullable String requestTemplate) {
            this.requestTemplate = Output.ofNullable(requestTemplate);
            return this;
        }
        public Builder responseTemplate(@Nullable Output<String> responseTemplate) {
            this.responseTemplate = responseTemplate;
            return this;
        }
        public Builder responseTemplate(@Nullable String responseTemplate) {
            this.responseTemplate = Output.ofNullable(responseTemplate);
            return this;
        }
        public Builder syncConfig(@Nullable Output<ResolverSyncConfigArgs> syncConfig) {
            this.syncConfig = syncConfig;
            return this;
        }
        public Builder syncConfig(@Nullable ResolverSyncConfigArgs syncConfig) {
            this.syncConfig = Output.ofNullable(syncConfig);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ResolverArgs build() {
            return new ResolverArgs(apiId, cachingConfig, dataSource, field, kind, maxBatchSize, pipelineConfig, requestTemplate, responseTemplate, syncConfig, type);
        }
    }
}