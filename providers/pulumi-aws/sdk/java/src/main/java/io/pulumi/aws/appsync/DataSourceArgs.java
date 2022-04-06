// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appsync;

import io.pulumi.aws.appsync.inputs.DataSourceDynamodbConfigArgs;
import io.pulumi.aws.appsync.inputs.DataSourceElasticsearchConfigArgs;
import io.pulumi.aws.appsync.inputs.DataSourceHttpConfigArgs;
import io.pulumi.aws.appsync.inputs.DataSourceLambdaConfigArgs;
import io.pulumi.aws.appsync.inputs.DataSourceRelationalDatabaseConfigArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataSourceArgs Empty = new DataSourceArgs();

    /**
     * The API ID for the GraphQL API for the DataSource.
     * 
     */
    @Import(name="apiId", required=true)
      private final Output<String> apiId;

    public Output<String> getApiId() {
        return this.apiId;
    }

    /**
     * A description of the DataSource.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * DynamoDB settings. See below
     * 
     */
    @Import(name="dynamodbConfig")
      private final @Nullable Output<DataSourceDynamodbConfigArgs> dynamodbConfig;

    public Output<DataSourceDynamodbConfigArgs> getDynamodbConfig() {
        return this.dynamodbConfig == null ? Output.empty() : this.dynamodbConfig;
    }

    /**
     * Amazon Elasticsearch settings. See below
     * 
     */
    @Import(name="elasticsearchConfig")
      private final @Nullable Output<DataSourceElasticsearchConfigArgs> elasticsearchConfig;

    public Output<DataSourceElasticsearchConfigArgs> getElasticsearchConfig() {
        return this.elasticsearchConfig == null ? Output.empty() : this.elasticsearchConfig;
    }

    /**
     * HTTP settings. See below
     * 
     */
    @Import(name="httpConfig")
      private final @Nullable Output<DataSourceHttpConfigArgs> httpConfig;

    public Output<DataSourceHttpConfigArgs> getHttpConfig() {
        return this.httpConfig == null ? Output.empty() : this.httpConfig;
    }

    /**
     * AWS Lambda settings. See below
     * 
     */
    @Import(name="lambdaConfig")
      private final @Nullable Output<DataSourceLambdaConfigArgs> lambdaConfig;

    public Output<DataSourceLambdaConfigArgs> getLambdaConfig() {
        return this.lambdaConfig == null ? Output.empty() : this.lambdaConfig;
    }

    /**
     * A user-supplied name for the DataSource.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * AWS RDS settings. See Relational Database Config
     * 
     */
    @Import(name="relationalDatabaseConfig")
      private final @Nullable Output<DataSourceRelationalDatabaseConfigArgs> relationalDatabaseConfig;

    public Output<DataSourceRelationalDatabaseConfigArgs> getRelationalDatabaseConfig() {
        return this.relationalDatabaseConfig == null ? Output.empty() : this.relationalDatabaseConfig;
    }

    /**
     * The IAM service role ARN for the data source.
     * 
     */
    @Import(name="serviceRoleArn")
      private final @Nullable Output<String> serviceRoleArn;

    public Output<String> getServiceRoleArn() {
        return this.serviceRoleArn == null ? Output.empty() : this.serviceRoleArn;
    }

    /**
     * The type of the DataSource. Valid values: `AWS_LAMBDA`, `AMAZON_DYNAMODB`, `AMAZON_ELASTICSEARCH`, `HTTP`, `NONE`, `RELATIONAL_DATABASE`.
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public DataSourceArgs(
        Output<String> apiId,
        @Nullable Output<String> description,
        @Nullable Output<DataSourceDynamodbConfigArgs> dynamodbConfig,
        @Nullable Output<DataSourceElasticsearchConfigArgs> elasticsearchConfig,
        @Nullable Output<DataSourceHttpConfigArgs> httpConfig,
        @Nullable Output<DataSourceLambdaConfigArgs> lambdaConfig,
        @Nullable Output<String> name,
        @Nullable Output<DataSourceRelationalDatabaseConfigArgs> relationalDatabaseConfig,
        @Nullable Output<String> serviceRoleArn,
        Output<String> type) {
        this.apiId = Objects.requireNonNull(apiId, "expected parameter 'apiId' to be non-null");
        this.description = description;
        this.dynamodbConfig = dynamodbConfig;
        this.elasticsearchConfig = elasticsearchConfig;
        this.httpConfig = httpConfig;
        this.lambdaConfig = lambdaConfig;
        this.name = name;
        this.relationalDatabaseConfig = relationalDatabaseConfig;
        this.serviceRoleArn = serviceRoleArn;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private DataSourceArgs() {
        this.apiId = Output.empty();
        this.description = Output.empty();
        this.dynamodbConfig = Output.empty();
        this.elasticsearchConfig = Output.empty();
        this.httpConfig = Output.empty();
        this.lambdaConfig = Output.empty();
        this.name = Output.empty();
        this.relationalDatabaseConfig = Output.empty();
        this.serviceRoleArn = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> apiId;
        private @Nullable Output<String> description;
        private @Nullable Output<DataSourceDynamodbConfigArgs> dynamodbConfig;
        private @Nullable Output<DataSourceElasticsearchConfigArgs> elasticsearchConfig;
        private @Nullable Output<DataSourceHttpConfigArgs> httpConfig;
        private @Nullable Output<DataSourceLambdaConfigArgs> lambdaConfig;
        private @Nullable Output<String> name;
        private @Nullable Output<DataSourceRelationalDatabaseConfigArgs> relationalDatabaseConfig;
        private @Nullable Output<String> serviceRoleArn;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiId = defaults.apiId;
    	      this.description = defaults.description;
    	      this.dynamodbConfig = defaults.dynamodbConfig;
    	      this.elasticsearchConfig = defaults.elasticsearchConfig;
    	      this.httpConfig = defaults.httpConfig;
    	      this.lambdaConfig = defaults.lambdaConfig;
    	      this.name = defaults.name;
    	      this.relationalDatabaseConfig = defaults.relationalDatabaseConfig;
    	      this.serviceRoleArn = defaults.serviceRoleArn;
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
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }
        public Builder dynamodbConfig(@Nullable Output<DataSourceDynamodbConfigArgs> dynamodbConfig) {
            this.dynamodbConfig = dynamodbConfig;
            return this;
        }
        public Builder dynamodbConfig(@Nullable DataSourceDynamodbConfigArgs dynamodbConfig) {
            this.dynamodbConfig = Output.ofNullable(dynamodbConfig);
            return this;
        }
        public Builder elasticsearchConfig(@Nullable Output<DataSourceElasticsearchConfigArgs> elasticsearchConfig) {
            this.elasticsearchConfig = elasticsearchConfig;
            return this;
        }
        public Builder elasticsearchConfig(@Nullable DataSourceElasticsearchConfigArgs elasticsearchConfig) {
            this.elasticsearchConfig = Output.ofNullable(elasticsearchConfig);
            return this;
        }
        public Builder httpConfig(@Nullable Output<DataSourceHttpConfigArgs> httpConfig) {
            this.httpConfig = httpConfig;
            return this;
        }
        public Builder httpConfig(@Nullable DataSourceHttpConfigArgs httpConfig) {
            this.httpConfig = Output.ofNullable(httpConfig);
            return this;
        }
        public Builder lambdaConfig(@Nullable Output<DataSourceLambdaConfigArgs> lambdaConfig) {
            this.lambdaConfig = lambdaConfig;
            return this;
        }
        public Builder lambdaConfig(@Nullable DataSourceLambdaConfigArgs lambdaConfig) {
            this.lambdaConfig = Output.ofNullable(lambdaConfig);
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
        public Builder relationalDatabaseConfig(@Nullable Output<DataSourceRelationalDatabaseConfigArgs> relationalDatabaseConfig) {
            this.relationalDatabaseConfig = relationalDatabaseConfig;
            return this;
        }
        public Builder relationalDatabaseConfig(@Nullable DataSourceRelationalDatabaseConfigArgs relationalDatabaseConfig) {
            this.relationalDatabaseConfig = Output.ofNullable(relationalDatabaseConfig);
            return this;
        }
        public Builder serviceRoleArn(@Nullable Output<String> serviceRoleArn) {
            this.serviceRoleArn = serviceRoleArn;
            return this;
        }
        public Builder serviceRoleArn(@Nullable String serviceRoleArn) {
            this.serviceRoleArn = Output.ofNullable(serviceRoleArn);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public DataSourceArgs build() {
            return new DataSourceArgs(apiId, description, dynamodbConfig, elasticsearchConfig, httpConfig, lambdaConfig, name, relationalDatabaseConfig, serviceRoleArn, type);
        }
    }
}