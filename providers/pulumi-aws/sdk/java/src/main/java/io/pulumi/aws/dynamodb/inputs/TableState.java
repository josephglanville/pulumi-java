// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dynamodb.inputs;

import io.pulumi.aws.dynamodb.inputs.TableAttributeGetArgs;
import io.pulumi.aws.dynamodb.inputs.TableGlobalSecondaryIndexGetArgs;
import io.pulumi.aws.dynamodb.inputs.TableLocalSecondaryIndexGetArgs;
import io.pulumi.aws.dynamodb.inputs.TablePointInTimeRecoveryGetArgs;
import io.pulumi.aws.dynamodb.inputs.TableReplicaGetArgs;
import io.pulumi.aws.dynamodb.inputs.TableServerSideEncryptionGetArgs;
import io.pulumi.aws.dynamodb.inputs.TableTtlGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TableState extends io.pulumi.resources.ResourceArgs {

    public static final TableState Empty = new TableState();

    /**
     * The arn of the table
     * 
     */
    @InputImport(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * List of nested attribute definitions. Only required for `hash_key` and `range_key` attributes. Each attribute has two properties:
     * 
     */
    @InputImport(name="attributes")
      private final @Nullable Output<List<TableAttributeGetArgs>> attributes;

    public Output<List<TableAttributeGetArgs>> getAttributes() {
        return this.attributes == null ? Output.empty() : this.attributes;
    }

    /**
     * Controls how you are charged for read and write throughput and how you manage capacity. The valid values are `PROVISIONED` and `PAY_PER_REQUEST`. Defaults to `PROVISIONED`.
     * 
     */
    @InputImport(name="billingMode")
      private final @Nullable Output<String> billingMode;

    public Output<String> getBillingMode() {
        return this.billingMode == null ? Output.empty() : this.billingMode;
    }

    /**
     * Describe a GSI for the table;
     * subject to the normal limits on the number of GSIs, projected
     * attributes, etc.
     * 
     */
    @InputImport(name="globalSecondaryIndexes")
      private final @Nullable Output<List<TableGlobalSecondaryIndexGetArgs>> globalSecondaryIndexes;

    public Output<List<TableGlobalSecondaryIndexGetArgs>> getGlobalSecondaryIndexes() {
        return this.globalSecondaryIndexes == null ? Output.empty() : this.globalSecondaryIndexes;
    }

    /**
     * The name of the hash key in the index; must be
     * defined as an attribute in the resource.
     * 
     */
    @InputImport(name="hashKey")
      private final @Nullable Output<String> hashKey;

    public Output<String> getHashKey() {
        return this.hashKey == null ? Output.empty() : this.hashKey;
    }

    /**
     * Describe an LSI on the table;
     * these can only be allocated *at creation* so you cannot change this
     * definition after you have created the resource.
     * 
     */
    @InputImport(name="localSecondaryIndexes")
      private final @Nullable Output<List<TableLocalSecondaryIndexGetArgs>> localSecondaryIndexes;

    public Output<List<TableLocalSecondaryIndexGetArgs>> getLocalSecondaryIndexes() {
        return this.localSecondaryIndexes == null ? Output.empty() : this.localSecondaryIndexes;
    }

    /**
     * The name of the index
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Enable point-in-time recovery options.
     * 
     */
    @InputImport(name="pointInTimeRecovery")
      private final @Nullable Output<TablePointInTimeRecoveryGetArgs> pointInTimeRecovery;

    public Output<TablePointInTimeRecoveryGetArgs> getPointInTimeRecovery() {
        return this.pointInTimeRecovery == null ? Output.empty() : this.pointInTimeRecovery;
    }

    /**
     * The name of the range key; must be defined
     * 
     */
    @InputImport(name="rangeKey")
      private final @Nullable Output<String> rangeKey;

    public Output<String> getRangeKey() {
        return this.rangeKey == null ? Output.empty() : this.rangeKey;
    }

    /**
     * The number of read units for this index. Must be set if billing_mode is set to PROVISIONED.
     * 
     */
    @InputImport(name="readCapacity")
      private final @Nullable Output<Integer> readCapacity;

    public Output<Integer> getReadCapacity() {
        return this.readCapacity == null ? Output.empty() : this.readCapacity;
    }

    /**
     * Configuration block(s) with [DynamoDB Global Tables V2 (version 2019.11.21)](https://docs.aws.amazon.com/amazondynamodb/latest/developerguide/globaltables.V2.html) replication configurations. Detailed below.
     * 
     */
    @InputImport(name="replicas")
      private final @Nullable Output<List<TableReplicaGetArgs>> replicas;

    public Output<List<TableReplicaGetArgs>> getReplicas() {
        return this.replicas == null ? Output.empty() : this.replicas;
    }

    /**
     * The time of the point-in-time recovery point to restore.
     * 
     */
    @InputImport(name="restoreDateTime")
      private final @Nullable Output<String> restoreDateTime;

    public Output<String> getRestoreDateTime() {
        return this.restoreDateTime == null ? Output.empty() : this.restoreDateTime;
    }

    /**
     * The name of the table to restore. Must match the name of an existing table.
     * 
     */
    @InputImport(name="restoreSourceName")
      private final @Nullable Output<String> restoreSourceName;

    public Output<String> getRestoreSourceName() {
        return this.restoreSourceName == null ? Output.empty() : this.restoreSourceName;
    }

    /**
     * If set, restores table to the most recent point-in-time recovery point.
     * 
     */
    @InputImport(name="restoreToLatestTime")
      private final @Nullable Output<Boolean> restoreToLatestTime;

    public Output<Boolean> getRestoreToLatestTime() {
        return this.restoreToLatestTime == null ? Output.empty() : this.restoreToLatestTime;
    }

    /**
     * Encryption at rest options. AWS DynamoDB tables are automatically encrypted at rest with an AWS owned Customer Master Key if this argument isn't specified.
     * 
     */
    @InputImport(name="serverSideEncryption")
      private final @Nullable Output<TableServerSideEncryptionGetArgs> serverSideEncryption;

    public Output<TableServerSideEncryptionGetArgs> getServerSideEncryption() {
        return this.serverSideEncryption == null ? Output.empty() : this.serverSideEncryption;
    }

    /**
     * The ARN of the Table Stream. Only available when `stream_enabled = true`
     * 
     */
    @InputImport(name="streamArn")
      private final @Nullable Output<String> streamArn;

    public Output<String> getStreamArn() {
        return this.streamArn == null ? Output.empty() : this.streamArn;
    }

    /**
     * Indicates whether Streams are to be enabled (true) or disabled (false).
     * 
     */
    @InputImport(name="streamEnabled")
      private final @Nullable Output<Boolean> streamEnabled;

    public Output<Boolean> getStreamEnabled() {
        return this.streamEnabled == null ? Output.empty() : this.streamEnabled;
    }

    /**
     * A timestamp, in ISO 8601 format, for this stream. Note that this timestamp is not
     * a unique identifier for the stream on its own. However, the combination of AWS customer ID,
     * table name and this field is guaranteed to be unique.
     * It can be used for creating CloudWatch Alarms. Only available when `stream_enabled = true`
     * 
     */
    @InputImport(name="streamLabel")
      private final @Nullable Output<String> streamLabel;

    public Output<String> getStreamLabel() {
        return this.streamLabel == null ? Output.empty() : this.streamLabel;
    }

    /**
     * When an item in the table is modified, StreamViewType determines what information is written to the table's stream. Valid values are `KEYS_ONLY`, `NEW_IMAGE`, `OLD_IMAGE`, `NEW_AND_OLD_IMAGES`.
     * 
     */
    @InputImport(name="streamViewType")
      private final @Nullable Output<String> streamViewType;

    public Output<String> getStreamViewType() {
        return this.streamViewType == null ? Output.empty() : this.streamViewType;
    }

    /**
     * The storage class of the table. Valid values are `STANDARD` and `STANDARD_INFREQUENT_ACCESS`.
     * 
     */
    @InputImport(name="tableClass")
      private final @Nullable Output<String> tableClass;

    public Output<String> getTableClass() {
        return this.tableClass == null ? Output.empty() : this.tableClass;
    }

    /**
     * A map of tags to populate on the created table. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @InputImport(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * Defines ttl, has two properties, and can only be specified once:
     * 
     */
    @InputImport(name="ttl")
      private final @Nullable Output<TableTtlGetArgs> ttl;

    public Output<TableTtlGetArgs> getTtl() {
        return this.ttl == null ? Output.empty() : this.ttl;
    }

    /**
     * The number of write units for this index. Must be set if billing_mode is set to PROVISIONED.
     * 
     */
    @InputImport(name="writeCapacity")
      private final @Nullable Output<Integer> writeCapacity;

    public Output<Integer> getWriteCapacity() {
        return this.writeCapacity == null ? Output.empty() : this.writeCapacity;
    }

    public TableState(
        @Nullable Output<String> arn,
        @Nullable Output<List<TableAttributeGetArgs>> attributes,
        @Nullable Output<String> billingMode,
        @Nullable Output<List<TableGlobalSecondaryIndexGetArgs>> globalSecondaryIndexes,
        @Nullable Output<String> hashKey,
        @Nullable Output<List<TableLocalSecondaryIndexGetArgs>> localSecondaryIndexes,
        @Nullable Output<String> name,
        @Nullable Output<TablePointInTimeRecoveryGetArgs> pointInTimeRecovery,
        @Nullable Output<String> rangeKey,
        @Nullable Output<Integer> readCapacity,
        @Nullable Output<List<TableReplicaGetArgs>> replicas,
        @Nullable Output<String> restoreDateTime,
        @Nullable Output<String> restoreSourceName,
        @Nullable Output<Boolean> restoreToLatestTime,
        @Nullable Output<TableServerSideEncryptionGetArgs> serverSideEncryption,
        @Nullable Output<String> streamArn,
        @Nullable Output<Boolean> streamEnabled,
        @Nullable Output<String> streamLabel,
        @Nullable Output<String> streamViewType,
        @Nullable Output<String> tableClass,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<TableTtlGetArgs> ttl,
        @Nullable Output<Integer> writeCapacity) {
        this.arn = arn;
        this.attributes = attributes;
        this.billingMode = billingMode;
        this.globalSecondaryIndexes = globalSecondaryIndexes;
        this.hashKey = hashKey;
        this.localSecondaryIndexes = localSecondaryIndexes;
        this.name = name;
        this.pointInTimeRecovery = pointInTimeRecovery;
        this.rangeKey = rangeKey;
        this.readCapacity = readCapacity;
        this.replicas = replicas;
        this.restoreDateTime = restoreDateTime;
        this.restoreSourceName = restoreSourceName;
        this.restoreToLatestTime = restoreToLatestTime;
        this.serverSideEncryption = serverSideEncryption;
        this.streamArn = streamArn;
        this.streamEnabled = streamEnabled;
        this.streamLabel = streamLabel;
        this.streamViewType = streamViewType;
        this.tableClass = tableClass;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.ttl = ttl;
        this.writeCapacity = writeCapacity;
    }

    private TableState() {
        this.arn = Output.empty();
        this.attributes = Output.empty();
        this.billingMode = Output.empty();
        this.globalSecondaryIndexes = Output.empty();
        this.hashKey = Output.empty();
        this.localSecondaryIndexes = Output.empty();
        this.name = Output.empty();
        this.pointInTimeRecovery = Output.empty();
        this.rangeKey = Output.empty();
        this.readCapacity = Output.empty();
        this.replicas = Output.empty();
        this.restoreDateTime = Output.empty();
        this.restoreSourceName = Output.empty();
        this.restoreToLatestTime = Output.empty();
        this.serverSideEncryption = Output.empty();
        this.streamArn = Output.empty();
        this.streamEnabled = Output.empty();
        this.streamLabel = Output.empty();
        this.streamViewType = Output.empty();
        this.tableClass = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.ttl = Output.empty();
        this.writeCapacity = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TableState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> arn;
        private @Nullable Output<List<TableAttributeGetArgs>> attributes;
        private @Nullable Output<String> billingMode;
        private @Nullable Output<List<TableGlobalSecondaryIndexGetArgs>> globalSecondaryIndexes;
        private @Nullable Output<String> hashKey;
        private @Nullable Output<List<TableLocalSecondaryIndexGetArgs>> localSecondaryIndexes;
        private @Nullable Output<String> name;
        private @Nullable Output<TablePointInTimeRecoveryGetArgs> pointInTimeRecovery;
        private @Nullable Output<String> rangeKey;
        private @Nullable Output<Integer> readCapacity;
        private @Nullable Output<List<TableReplicaGetArgs>> replicas;
        private @Nullable Output<String> restoreDateTime;
        private @Nullable Output<String> restoreSourceName;
        private @Nullable Output<Boolean> restoreToLatestTime;
        private @Nullable Output<TableServerSideEncryptionGetArgs> serverSideEncryption;
        private @Nullable Output<String> streamArn;
        private @Nullable Output<Boolean> streamEnabled;
        private @Nullable Output<String> streamLabel;
        private @Nullable Output<String> streamViewType;
        private @Nullable Output<String> tableClass;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<TableTtlGetArgs> ttl;
        private @Nullable Output<Integer> writeCapacity;

        public Builder() {
    	      // Empty
        }

        public Builder(TableState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.attributes = defaults.attributes;
    	      this.billingMode = defaults.billingMode;
    	      this.globalSecondaryIndexes = defaults.globalSecondaryIndexes;
    	      this.hashKey = defaults.hashKey;
    	      this.localSecondaryIndexes = defaults.localSecondaryIndexes;
    	      this.name = defaults.name;
    	      this.pointInTimeRecovery = defaults.pointInTimeRecovery;
    	      this.rangeKey = defaults.rangeKey;
    	      this.readCapacity = defaults.readCapacity;
    	      this.replicas = defaults.replicas;
    	      this.restoreDateTime = defaults.restoreDateTime;
    	      this.restoreSourceName = defaults.restoreSourceName;
    	      this.restoreToLatestTime = defaults.restoreToLatestTime;
    	      this.serverSideEncryption = defaults.serverSideEncryption;
    	      this.streamArn = defaults.streamArn;
    	      this.streamEnabled = defaults.streamEnabled;
    	      this.streamLabel = defaults.streamLabel;
    	      this.streamViewType = defaults.streamViewType;
    	      this.tableClass = defaults.tableClass;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.ttl = defaults.ttl;
    	      this.writeCapacity = defaults.writeCapacity;
        }

        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }

        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }

        public Builder attributes(@Nullable Output<List<TableAttributeGetArgs>> attributes) {
            this.attributes = attributes;
            return this;
        }

        public Builder attributes(@Nullable List<TableAttributeGetArgs> attributes) {
            this.attributes = Output.ofNullable(attributes);
            return this;
        }

        public Builder billingMode(@Nullable Output<String> billingMode) {
            this.billingMode = billingMode;
            return this;
        }

        public Builder billingMode(@Nullable String billingMode) {
            this.billingMode = Output.ofNullable(billingMode);
            return this;
        }

        public Builder globalSecondaryIndexes(@Nullable Output<List<TableGlobalSecondaryIndexGetArgs>> globalSecondaryIndexes) {
            this.globalSecondaryIndexes = globalSecondaryIndexes;
            return this;
        }

        public Builder globalSecondaryIndexes(@Nullable List<TableGlobalSecondaryIndexGetArgs> globalSecondaryIndexes) {
            this.globalSecondaryIndexes = Output.ofNullable(globalSecondaryIndexes);
            return this;
        }

        public Builder hashKey(@Nullable Output<String> hashKey) {
            this.hashKey = hashKey;
            return this;
        }

        public Builder hashKey(@Nullable String hashKey) {
            this.hashKey = Output.ofNullable(hashKey);
            return this;
        }

        public Builder localSecondaryIndexes(@Nullable Output<List<TableLocalSecondaryIndexGetArgs>> localSecondaryIndexes) {
            this.localSecondaryIndexes = localSecondaryIndexes;
            return this;
        }

        public Builder localSecondaryIndexes(@Nullable List<TableLocalSecondaryIndexGetArgs> localSecondaryIndexes) {
            this.localSecondaryIndexes = Output.ofNullable(localSecondaryIndexes);
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

        public Builder pointInTimeRecovery(@Nullable Output<TablePointInTimeRecoveryGetArgs> pointInTimeRecovery) {
            this.pointInTimeRecovery = pointInTimeRecovery;
            return this;
        }

        public Builder pointInTimeRecovery(@Nullable TablePointInTimeRecoveryGetArgs pointInTimeRecovery) {
            this.pointInTimeRecovery = Output.ofNullable(pointInTimeRecovery);
            return this;
        }

        public Builder rangeKey(@Nullable Output<String> rangeKey) {
            this.rangeKey = rangeKey;
            return this;
        }

        public Builder rangeKey(@Nullable String rangeKey) {
            this.rangeKey = Output.ofNullable(rangeKey);
            return this;
        }

        public Builder readCapacity(@Nullable Output<Integer> readCapacity) {
            this.readCapacity = readCapacity;
            return this;
        }

        public Builder readCapacity(@Nullable Integer readCapacity) {
            this.readCapacity = Output.ofNullable(readCapacity);
            return this;
        }

        public Builder replicas(@Nullable Output<List<TableReplicaGetArgs>> replicas) {
            this.replicas = replicas;
            return this;
        }

        public Builder replicas(@Nullable List<TableReplicaGetArgs> replicas) {
            this.replicas = Output.ofNullable(replicas);
            return this;
        }

        public Builder restoreDateTime(@Nullable Output<String> restoreDateTime) {
            this.restoreDateTime = restoreDateTime;
            return this;
        }

        public Builder restoreDateTime(@Nullable String restoreDateTime) {
            this.restoreDateTime = Output.ofNullable(restoreDateTime);
            return this;
        }

        public Builder restoreSourceName(@Nullable Output<String> restoreSourceName) {
            this.restoreSourceName = restoreSourceName;
            return this;
        }

        public Builder restoreSourceName(@Nullable String restoreSourceName) {
            this.restoreSourceName = Output.ofNullable(restoreSourceName);
            return this;
        }

        public Builder restoreToLatestTime(@Nullable Output<Boolean> restoreToLatestTime) {
            this.restoreToLatestTime = restoreToLatestTime;
            return this;
        }

        public Builder restoreToLatestTime(@Nullable Boolean restoreToLatestTime) {
            this.restoreToLatestTime = Output.ofNullable(restoreToLatestTime);
            return this;
        }

        public Builder serverSideEncryption(@Nullable Output<TableServerSideEncryptionGetArgs> serverSideEncryption) {
            this.serverSideEncryption = serverSideEncryption;
            return this;
        }

        public Builder serverSideEncryption(@Nullable TableServerSideEncryptionGetArgs serverSideEncryption) {
            this.serverSideEncryption = Output.ofNullable(serverSideEncryption);
            return this;
        }

        public Builder streamArn(@Nullable Output<String> streamArn) {
            this.streamArn = streamArn;
            return this;
        }

        public Builder streamArn(@Nullable String streamArn) {
            this.streamArn = Output.ofNullable(streamArn);
            return this;
        }

        public Builder streamEnabled(@Nullable Output<Boolean> streamEnabled) {
            this.streamEnabled = streamEnabled;
            return this;
        }

        public Builder streamEnabled(@Nullable Boolean streamEnabled) {
            this.streamEnabled = Output.ofNullable(streamEnabled);
            return this;
        }

        public Builder streamLabel(@Nullable Output<String> streamLabel) {
            this.streamLabel = streamLabel;
            return this;
        }

        public Builder streamLabel(@Nullable String streamLabel) {
            this.streamLabel = Output.ofNullable(streamLabel);
            return this;
        }

        public Builder streamViewType(@Nullable Output<String> streamViewType) {
            this.streamViewType = streamViewType;
            return this;
        }

        public Builder streamViewType(@Nullable String streamViewType) {
            this.streamViewType = Output.ofNullable(streamViewType);
            return this;
        }

        public Builder tableClass(@Nullable Output<String> tableClass) {
            this.tableClass = tableClass;
            return this;
        }

        public Builder tableClass(@Nullable String tableClass) {
            this.tableClass = Output.ofNullable(tableClass);
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

        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }

        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }

        public Builder ttl(@Nullable Output<TableTtlGetArgs> ttl) {
            this.ttl = ttl;
            return this;
        }

        public Builder ttl(@Nullable TableTtlGetArgs ttl) {
            this.ttl = Output.ofNullable(ttl);
            return this;
        }

        public Builder writeCapacity(@Nullable Output<Integer> writeCapacity) {
            this.writeCapacity = writeCapacity;
            return this;
        }

        public Builder writeCapacity(@Nullable Integer writeCapacity) {
            this.writeCapacity = Output.ofNullable(writeCapacity);
            return this;
        }
        public TableState build() {
            return new TableState(arn, attributes, billingMode, globalSecondaryIndexes, hashKey, localSecondaryIndexes, name, pointInTimeRecovery, rangeKey, readCapacity, replicas, restoreDateTime, restoreSourceName, restoreToLatestTime, serverSideEncryption, streamArn, streamEnabled, streamLabel, streamViewType, tableClass, tags, tagsAll, ttl, writeCapacity);
        }
    }
}
