// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dms;

import io.pulumi.aws.dms.inputs.EndpointElasticsearchSettingsArgs;
import io.pulumi.aws.dms.inputs.EndpointKafkaSettingsArgs;
import io.pulumi.aws.dms.inputs.EndpointKinesisSettingsArgs;
import io.pulumi.aws.dms.inputs.EndpointMongodbSettingsArgs;
import io.pulumi.aws.dms.inputs.EndpointS3SettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EndpointArgs extends io.pulumi.resources.ResourceArgs {

    public static final EndpointArgs Empty = new EndpointArgs();

    /**
     * The Amazon Resource Name (ARN) for the certificate.
     * 
     */
    @Import(name="certificateArn")
      private final @Nullable Output<String> certificateArn;

    public Output<String> getCertificateArn() {
        return this.certificateArn == null ? Output.empty() : this.certificateArn;
    }

    /**
     * The name of the endpoint database.
     * 
     */
    @Import(name="databaseName")
      private final @Nullable Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName == null ? Output.empty() : this.databaseName;
    }

    /**
     * Configuration block with Elasticsearch settings. Detailed below.
     * 
     */
    @Import(name="elasticsearchSettings")
      private final @Nullable Output<EndpointElasticsearchSettingsArgs> elasticsearchSettings;

    public Output<EndpointElasticsearchSettingsArgs> getElasticsearchSettings() {
        return this.elasticsearchSettings == null ? Output.empty() : this.elasticsearchSettings;
    }

    /**
     * The database endpoint identifier.
     * 
     */
    @Import(name="endpointId", required=true)
      private final Output<String> endpointId;

    public Output<String> getEndpointId() {
        return this.endpointId;
    }

    /**
     * The type of endpoint. Can be one of `source | target`.
     * 
     */
    @Import(name="endpointType", required=true)
      private final Output<String> endpointType;

    public Output<String> getEndpointType() {
        return this.endpointType;
    }

    /**
     * The type of engine for the endpoint. Can be one of `aurora | aurora-postgresql| azuredb | db2 | docdb | dynamodb | elasticsearch | kafka | kinesis | mariadb | mongodb | mysql | oracle | postgres | redshift | s3 | sqlserver | sybase`.
     * 
     */
    @Import(name="engineName", required=true)
      private final Output<String> engineName;

    public Output<String> getEngineName() {
        return this.engineName;
    }

    /**
     * Additional attributes associated with the connection. For available attributes see [Using Extra Connection Attributes with AWS Database Migration Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Source.PostgreSQL.html#CHAP_Source.PostgreSQL.ConnectionAttrib).
     * 
     */
    @Import(name="extraConnectionAttributes")
      private final @Nullable Output<String> extraConnectionAttributes;

    public Output<String> getExtraConnectionAttributes() {
        return this.extraConnectionAttributes == null ? Output.empty() : this.extraConnectionAttributes;
    }

    /**
     * Configuration block with Kafka settings. Detailed below.
     * 
     */
    @Import(name="kafkaSettings")
      private final @Nullable Output<EndpointKafkaSettingsArgs> kafkaSettings;

    public Output<EndpointKafkaSettingsArgs> getKafkaSettings() {
        return this.kafkaSettings == null ? Output.empty() : this.kafkaSettings;
    }

    /**
     * Configuration block with Kinesis settings. Detailed below.
     * 
     */
    @Import(name="kinesisSettings")
      private final @Nullable Output<EndpointKinesisSettingsArgs> kinesisSettings;

    public Output<EndpointKinesisSettingsArgs> getKinesisSettings() {
        return this.kinesisSettings == null ? Output.empty() : this.kinesisSettings;
    }

    /**
     * The Amazon Resource Name (ARN) for the KMS key that will be used to encrypt the connection parameters. If you do not specify a value for `kms_key_arn`, then AWS DMS will use your default encryption key. AWS KMS creates the default encryption key for your AWS account. Your AWS account has a different default encryption key for each AWS region.
     * 
     */
    @Import(name="kmsKeyArn")
      private final @Nullable Output<String> kmsKeyArn;

    public Output<String> getKmsKeyArn() {
        return this.kmsKeyArn == null ? Output.empty() : this.kmsKeyArn;
    }

    /**
     * Configuration block with MongoDB settings. Detailed below.
     * 
     */
    @Import(name="mongodbSettings")
      private final @Nullable Output<EndpointMongodbSettingsArgs> mongodbSettings;

    public Output<EndpointMongodbSettingsArgs> getMongodbSettings() {
        return this.mongodbSettings == null ? Output.empty() : this.mongodbSettings;
    }

    /**
     * The password to be used to login to the endpoint database.
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    /**
     * The port used by the endpoint database.
     * 
     */
    @Import(name="port")
      private final @Nullable Output<Integer> port;

    public Output<Integer> getPort() {
        return this.port == null ? Output.empty() : this.port;
    }

    /**
     * Configuration block with S3 settings. Detailed below.
     * 
     */
    @Import(name="s3Settings")
      private final @Nullable Output<EndpointS3SettingsArgs> s3Settings;

    public Output<EndpointS3SettingsArgs> getS3Settings() {
        return this.s3Settings == null ? Output.empty() : this.s3Settings;
    }

    /**
     * Amazon Resource Name (ARN) of the IAM role that specifies AWS DMS as the trusted entity and has the required permissions to access the value in SecretsManagerSecret.
     * 
     */
    @Import(name="secretsManagerAccessRoleArn")
      private final @Nullable Output<String> secretsManagerAccessRoleArn;

    public Output<String> getSecretsManagerAccessRoleArn() {
        return this.secretsManagerAccessRoleArn == null ? Output.empty() : this.secretsManagerAccessRoleArn;
    }

    /**
     * The full ARN, partial ARN, or friendly name of the SecretsManagerSecret that contains the endpoint connection details. Supported only for `engine_name` as `oracle` and `postgres`.
     * 
     */
    @Import(name="secretsManagerArn")
      private final @Nullable Output<String> secretsManagerArn;

    public Output<String> getSecretsManagerArn() {
        return this.secretsManagerArn == null ? Output.empty() : this.secretsManagerArn;
    }

    /**
     * The host name of the server.
     * 
     */
    @Import(name="serverName")
      private final @Nullable Output<String> serverName;

    public Output<String> getServerName() {
        return this.serverName == null ? Output.empty() : this.serverName;
    }

    /**
     * The Amazon Resource Name (ARN) used by the service access IAM role for dynamodb endpoints.
     * 
     */
    @Import(name="serviceAccessRole")
      private final @Nullable Output<String> serviceAccessRole;

    public Output<String> getServiceAccessRole() {
        return this.serviceAccessRole == null ? Output.empty() : this.serviceAccessRole;
    }

    /**
     * The SSL mode to use for the connection. Can be one of `none | require | verify-ca | verify-full`
     * 
     */
    @Import(name="sslMode")
      private final @Nullable Output<String> sslMode;

    public Output<String> getSslMode() {
        return this.sslMode == null ? Output.empty() : this.sslMode;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The user name to be used to login to the endpoint database.
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> getUsername() {
        return this.username == null ? Output.empty() : this.username;
    }

    public EndpointArgs(
        @Nullable Output<String> certificateArn,
        @Nullable Output<String> databaseName,
        @Nullable Output<EndpointElasticsearchSettingsArgs> elasticsearchSettings,
        Output<String> endpointId,
        Output<String> endpointType,
        Output<String> engineName,
        @Nullable Output<String> extraConnectionAttributes,
        @Nullable Output<EndpointKafkaSettingsArgs> kafkaSettings,
        @Nullable Output<EndpointKinesisSettingsArgs> kinesisSettings,
        @Nullable Output<String> kmsKeyArn,
        @Nullable Output<EndpointMongodbSettingsArgs> mongodbSettings,
        @Nullable Output<String> password,
        @Nullable Output<Integer> port,
        @Nullable Output<EndpointS3SettingsArgs> s3Settings,
        @Nullable Output<String> secretsManagerAccessRoleArn,
        @Nullable Output<String> secretsManagerArn,
        @Nullable Output<String> serverName,
        @Nullable Output<String> serviceAccessRole,
        @Nullable Output<String> sslMode,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> username) {
        this.certificateArn = certificateArn;
        this.databaseName = databaseName;
        this.elasticsearchSettings = elasticsearchSettings;
        this.endpointId = Objects.requireNonNull(endpointId, "expected parameter 'endpointId' to be non-null");
        this.endpointType = Objects.requireNonNull(endpointType, "expected parameter 'endpointType' to be non-null");
        this.engineName = Objects.requireNonNull(engineName, "expected parameter 'engineName' to be non-null");
        this.extraConnectionAttributes = extraConnectionAttributes;
        this.kafkaSettings = kafkaSettings;
        this.kinesisSettings = kinesisSettings;
        this.kmsKeyArn = kmsKeyArn;
        this.mongodbSettings = mongodbSettings;
        this.password = password;
        this.port = port;
        this.s3Settings = s3Settings;
        this.secretsManagerAccessRoleArn = secretsManagerAccessRoleArn;
        this.secretsManagerArn = secretsManagerArn;
        this.serverName = serverName;
        this.serviceAccessRole = serviceAccessRole;
        this.sslMode = sslMode;
        this.tags = tags;
        this.username = username;
    }

    private EndpointArgs() {
        this.certificateArn = Output.empty();
        this.databaseName = Output.empty();
        this.elasticsearchSettings = Output.empty();
        this.endpointId = Output.empty();
        this.endpointType = Output.empty();
        this.engineName = Output.empty();
        this.extraConnectionAttributes = Output.empty();
        this.kafkaSettings = Output.empty();
        this.kinesisSettings = Output.empty();
        this.kmsKeyArn = Output.empty();
        this.mongodbSettings = Output.empty();
        this.password = Output.empty();
        this.port = Output.empty();
        this.s3Settings = Output.empty();
        this.secretsManagerAccessRoleArn = Output.empty();
        this.secretsManagerArn = Output.empty();
        this.serverName = Output.empty();
        this.serviceAccessRole = Output.empty();
        this.sslMode = Output.empty();
        this.tags = Output.empty();
        this.username = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificateArn;
        private @Nullable Output<String> databaseName;
        private @Nullable Output<EndpointElasticsearchSettingsArgs> elasticsearchSettings;
        private Output<String> endpointId;
        private Output<String> endpointType;
        private Output<String> engineName;
        private @Nullable Output<String> extraConnectionAttributes;
        private @Nullable Output<EndpointKafkaSettingsArgs> kafkaSettings;
        private @Nullable Output<EndpointKinesisSettingsArgs> kinesisSettings;
        private @Nullable Output<String> kmsKeyArn;
        private @Nullable Output<EndpointMongodbSettingsArgs> mongodbSettings;
        private @Nullable Output<String> password;
        private @Nullable Output<Integer> port;
        private @Nullable Output<EndpointS3SettingsArgs> s3Settings;
        private @Nullable Output<String> secretsManagerAccessRoleArn;
        private @Nullable Output<String> secretsManagerArn;
        private @Nullable Output<String> serverName;
        private @Nullable Output<String> serviceAccessRole;
        private @Nullable Output<String> sslMode;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(EndpointArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
    	      this.databaseName = defaults.databaseName;
    	      this.elasticsearchSettings = defaults.elasticsearchSettings;
    	      this.endpointId = defaults.endpointId;
    	      this.endpointType = defaults.endpointType;
    	      this.engineName = defaults.engineName;
    	      this.extraConnectionAttributes = defaults.extraConnectionAttributes;
    	      this.kafkaSettings = defaults.kafkaSettings;
    	      this.kinesisSettings = defaults.kinesisSettings;
    	      this.kmsKeyArn = defaults.kmsKeyArn;
    	      this.mongodbSettings = defaults.mongodbSettings;
    	      this.password = defaults.password;
    	      this.port = defaults.port;
    	      this.s3Settings = defaults.s3Settings;
    	      this.secretsManagerAccessRoleArn = defaults.secretsManagerAccessRoleArn;
    	      this.secretsManagerArn = defaults.secretsManagerArn;
    	      this.serverName = defaults.serverName;
    	      this.serviceAccessRole = defaults.serviceAccessRole;
    	      this.sslMode = defaults.sslMode;
    	      this.tags = defaults.tags;
    	      this.username = defaults.username;
        }

        public Builder certificateArn(@Nullable Output<String> certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }
        public Builder certificateArn(@Nullable String certificateArn) {
            this.certificateArn = Output.ofNullable(certificateArn);
            return this;
        }
        public Builder databaseName(@Nullable Output<String> databaseName) {
            this.databaseName = databaseName;
            return this;
        }
        public Builder databaseName(@Nullable String databaseName) {
            this.databaseName = Output.ofNullable(databaseName);
            return this;
        }
        public Builder elasticsearchSettings(@Nullable Output<EndpointElasticsearchSettingsArgs> elasticsearchSettings) {
            this.elasticsearchSettings = elasticsearchSettings;
            return this;
        }
        public Builder elasticsearchSettings(@Nullable EndpointElasticsearchSettingsArgs elasticsearchSettings) {
            this.elasticsearchSettings = Output.ofNullable(elasticsearchSettings);
            return this;
        }
        public Builder endpointId(Output<String> endpointId) {
            this.endpointId = Objects.requireNonNull(endpointId);
            return this;
        }
        public Builder endpointId(String endpointId) {
            this.endpointId = Output.of(Objects.requireNonNull(endpointId));
            return this;
        }
        public Builder endpointType(Output<String> endpointType) {
            this.endpointType = Objects.requireNonNull(endpointType);
            return this;
        }
        public Builder endpointType(String endpointType) {
            this.endpointType = Output.of(Objects.requireNonNull(endpointType));
            return this;
        }
        public Builder engineName(Output<String> engineName) {
            this.engineName = Objects.requireNonNull(engineName);
            return this;
        }
        public Builder engineName(String engineName) {
            this.engineName = Output.of(Objects.requireNonNull(engineName));
            return this;
        }
        public Builder extraConnectionAttributes(@Nullable Output<String> extraConnectionAttributes) {
            this.extraConnectionAttributes = extraConnectionAttributes;
            return this;
        }
        public Builder extraConnectionAttributes(@Nullable String extraConnectionAttributes) {
            this.extraConnectionAttributes = Output.ofNullable(extraConnectionAttributes);
            return this;
        }
        public Builder kafkaSettings(@Nullable Output<EndpointKafkaSettingsArgs> kafkaSettings) {
            this.kafkaSettings = kafkaSettings;
            return this;
        }
        public Builder kafkaSettings(@Nullable EndpointKafkaSettingsArgs kafkaSettings) {
            this.kafkaSettings = Output.ofNullable(kafkaSettings);
            return this;
        }
        public Builder kinesisSettings(@Nullable Output<EndpointKinesisSettingsArgs> kinesisSettings) {
            this.kinesisSettings = kinesisSettings;
            return this;
        }
        public Builder kinesisSettings(@Nullable EndpointKinesisSettingsArgs kinesisSettings) {
            this.kinesisSettings = Output.ofNullable(kinesisSettings);
            return this;
        }
        public Builder kmsKeyArn(@Nullable Output<String> kmsKeyArn) {
            this.kmsKeyArn = kmsKeyArn;
            return this;
        }
        public Builder kmsKeyArn(@Nullable String kmsKeyArn) {
            this.kmsKeyArn = Output.ofNullable(kmsKeyArn);
            return this;
        }
        public Builder mongodbSettings(@Nullable Output<EndpointMongodbSettingsArgs> mongodbSettings) {
            this.mongodbSettings = mongodbSettings;
            return this;
        }
        public Builder mongodbSettings(@Nullable EndpointMongodbSettingsArgs mongodbSettings) {
            this.mongodbSettings = Output.ofNullable(mongodbSettings);
            return this;
        }
        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Output.ofNullable(password);
            return this;
        }
        public Builder port(@Nullable Output<Integer> port) {
            this.port = port;
            return this;
        }
        public Builder port(@Nullable Integer port) {
            this.port = Output.ofNullable(port);
            return this;
        }
        public Builder s3Settings(@Nullable Output<EndpointS3SettingsArgs> s3Settings) {
            this.s3Settings = s3Settings;
            return this;
        }
        public Builder s3Settings(@Nullable EndpointS3SettingsArgs s3Settings) {
            this.s3Settings = Output.ofNullable(s3Settings);
            return this;
        }
        public Builder secretsManagerAccessRoleArn(@Nullable Output<String> secretsManagerAccessRoleArn) {
            this.secretsManagerAccessRoleArn = secretsManagerAccessRoleArn;
            return this;
        }
        public Builder secretsManagerAccessRoleArn(@Nullable String secretsManagerAccessRoleArn) {
            this.secretsManagerAccessRoleArn = Output.ofNullable(secretsManagerAccessRoleArn);
            return this;
        }
        public Builder secretsManagerArn(@Nullable Output<String> secretsManagerArn) {
            this.secretsManagerArn = secretsManagerArn;
            return this;
        }
        public Builder secretsManagerArn(@Nullable String secretsManagerArn) {
            this.secretsManagerArn = Output.ofNullable(secretsManagerArn);
            return this;
        }
        public Builder serverName(@Nullable Output<String> serverName) {
            this.serverName = serverName;
            return this;
        }
        public Builder serverName(@Nullable String serverName) {
            this.serverName = Output.ofNullable(serverName);
            return this;
        }
        public Builder serviceAccessRole(@Nullable Output<String> serviceAccessRole) {
            this.serviceAccessRole = serviceAccessRole;
            return this;
        }
        public Builder serviceAccessRole(@Nullable String serviceAccessRole) {
            this.serviceAccessRole = Output.ofNullable(serviceAccessRole);
            return this;
        }
        public Builder sslMode(@Nullable Output<String> sslMode) {
            this.sslMode = sslMode;
            return this;
        }
        public Builder sslMode(@Nullable String sslMode) {
            this.sslMode = Output.ofNullable(sslMode);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = Output.ofNullable(username);
            return this;
        }        public EndpointArgs build() {
            return new EndpointArgs(certificateArn, databaseName, elasticsearchSettings, endpointId, endpointType, engineName, extraConnectionAttributes, kafkaSettings, kinesisSettings, kmsKeyArn, mongodbSettings, password, port, s3Settings, secretsManagerAccessRoleArn, secretsManagerArn, serverName, serviceAccessRole, sslMode, tags, username);
        }
    }
}
