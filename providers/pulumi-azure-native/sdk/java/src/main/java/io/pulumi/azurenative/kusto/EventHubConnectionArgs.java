// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.kusto.enums.DataFormat;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventHubConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventHubConnectionArgs Empty = new EventHubConnectionArgs();

    /**
     * The name of the Kusto cluster.
     * 
     */
    @Import(name="clusterName", required=true)
      private final Output<String> clusterName;

    public Output<String> getClusterName() {
        return this.clusterName;
    }

    /**
     * The event hub consumer group.
     * 
     */
    @Import(name="consumerGroup", required=true)
      private final Output<String> consumerGroup;

    public Output<String> getConsumerGroup() {
        return this.consumerGroup;
    }

    /**
     * The data format of the message. Optionally the data format can be added to each message.
     * 
     */
    @Import(name="dataFormat")
      private final @Nullable Output<Either<String,DataFormat>> dataFormat;

    public Output<Either<String,DataFormat>> getDataFormat() {
        return this.dataFormat == null ? Codegen.empty() : this.dataFormat;
    }

    /**
     * The name of the database in the Kusto cluster.
     * 
     */
    @Import(name="databaseName", required=true)
      private final Output<String> databaseName;

    public Output<String> getDatabaseName() {
        return this.databaseName;
    }

    /**
     * The name of the event hub connection.
     * 
     */
    @Import(name="eventHubConnectionName")
      private final @Nullable Output<String> eventHubConnectionName;

    public Output<String> getEventHubConnectionName() {
        return this.eventHubConnectionName == null ? Codegen.empty() : this.eventHubConnectionName;
    }

    /**
     * The resource ID of the event hub to be used to create a data connection.
     * 
     */
    @Import(name="eventHubResourceId", required=true)
      private final Output<String> eventHubResourceId;

    public Output<String> getEventHubResourceId() {
        return this.eventHubResourceId;
    }

    /**
     * Resource location.
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The mapping rule to be used to ingest the data. Optionally the mapping information can be added to each message.
     * 
     */
    @Import(name="mappingRuleName")
      private final @Nullable Output<String> mappingRuleName;

    public Output<String> getMappingRuleName() {
        return this.mappingRuleName == null ? Codegen.empty() : this.mappingRuleName;
    }

    /**
     * The name of the resource group containing the Kusto cluster.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The table where the data should be ingested. Optionally the table information can be added to each message.
     * 
     */
    @Import(name="tableName")
      private final @Nullable Output<String> tableName;

    public Output<String> getTableName() {
        return this.tableName == null ? Codegen.empty() : this.tableName;
    }

    public EventHubConnectionArgs(
        Output<String> clusterName,
        Output<String> consumerGroup,
        @Nullable Output<Either<String,DataFormat>> dataFormat,
        Output<String> databaseName,
        @Nullable Output<String> eventHubConnectionName,
        Output<String> eventHubResourceId,
        @Nullable Output<String> location,
        @Nullable Output<String> mappingRuleName,
        Output<String> resourceGroupName,
        @Nullable Output<String> tableName) {
        this.clusterName = Objects.requireNonNull(clusterName, "expected parameter 'clusterName' to be non-null");
        this.consumerGroup = Objects.requireNonNull(consumerGroup, "expected parameter 'consumerGroup' to be non-null");
        this.dataFormat = dataFormat;
        this.databaseName = Objects.requireNonNull(databaseName, "expected parameter 'databaseName' to be non-null");
        this.eventHubConnectionName = eventHubConnectionName;
        this.eventHubResourceId = Objects.requireNonNull(eventHubResourceId, "expected parameter 'eventHubResourceId' to be non-null");
        this.location = location;
        this.mappingRuleName = mappingRuleName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tableName = tableName;
    }

    private EventHubConnectionArgs() {
        this.clusterName = Codegen.empty();
        this.consumerGroup = Codegen.empty();
        this.dataFormat = Codegen.empty();
        this.databaseName = Codegen.empty();
        this.eventHubConnectionName = Codegen.empty();
        this.eventHubResourceId = Codegen.empty();
        this.location = Codegen.empty();
        this.mappingRuleName = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tableName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> clusterName;
        private Output<String> consumerGroup;
        private @Nullable Output<Either<String,DataFormat>> dataFormat;
        private Output<String> databaseName;
        private @Nullable Output<String> eventHubConnectionName;
        private Output<String> eventHubResourceId;
        private @Nullable Output<String> location;
        private @Nullable Output<String> mappingRuleName;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> tableName;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHubConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.consumerGroup = defaults.consumerGroup;
    	      this.dataFormat = defaults.dataFormat;
    	      this.databaseName = defaults.databaseName;
    	      this.eventHubConnectionName = defaults.eventHubConnectionName;
    	      this.eventHubResourceId = defaults.eventHubResourceId;
    	      this.location = defaults.location;
    	      this.mappingRuleName = defaults.mappingRuleName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tableName = defaults.tableName;
        }

        public Builder clusterName(Output<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }
        public Builder clusterName(String clusterName) {
            this.clusterName = Output.of(Objects.requireNonNull(clusterName));
            return this;
        }
        public Builder consumerGroup(Output<String> consumerGroup) {
            this.consumerGroup = Objects.requireNonNull(consumerGroup);
            return this;
        }
        public Builder consumerGroup(String consumerGroup) {
            this.consumerGroup = Output.of(Objects.requireNonNull(consumerGroup));
            return this;
        }
        public Builder dataFormat(@Nullable Output<Either<String,DataFormat>> dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }
        public Builder dataFormat(@Nullable Either<String,DataFormat> dataFormat) {
            this.dataFormat = Codegen.ofNullable(dataFormat);
            return this;
        }
        public Builder databaseName(Output<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }
        public Builder databaseName(String databaseName) {
            this.databaseName = Output.of(Objects.requireNonNull(databaseName));
            return this;
        }
        public Builder eventHubConnectionName(@Nullable Output<String> eventHubConnectionName) {
            this.eventHubConnectionName = eventHubConnectionName;
            return this;
        }
        public Builder eventHubConnectionName(@Nullable String eventHubConnectionName) {
            this.eventHubConnectionName = Codegen.ofNullable(eventHubConnectionName);
            return this;
        }
        public Builder eventHubResourceId(Output<String> eventHubResourceId) {
            this.eventHubResourceId = Objects.requireNonNull(eventHubResourceId);
            return this;
        }
        public Builder eventHubResourceId(String eventHubResourceId) {
            this.eventHubResourceId = Output.of(Objects.requireNonNull(eventHubResourceId));
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder mappingRuleName(@Nullable Output<String> mappingRuleName) {
            this.mappingRuleName = mappingRuleName;
            return this;
        }
        public Builder mappingRuleName(@Nullable String mappingRuleName) {
            this.mappingRuleName = Codegen.ofNullable(mappingRuleName);
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
        public Builder tableName(@Nullable Output<String> tableName) {
            this.tableName = tableName;
            return this;
        }
        public Builder tableName(@Nullable String tableName) {
            this.tableName = Codegen.ofNullable(tableName);
            return this;
        }        public EventHubConnectionArgs build() {
            return new EventHubConnectionArgs(clusterName, consumerGroup, dataFormat, databaseName, eventHubConnectionName, eventHubResourceId, location, mappingRuleName, resourceGroupName, tableName);
        }
    }
}
