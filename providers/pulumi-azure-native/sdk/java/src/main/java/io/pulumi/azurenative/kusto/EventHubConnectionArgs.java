// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kusto;

import io.pulumi.azurenative.kusto.enums.DataFormat;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventHubConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventHubConnectionArgs Empty = new EventHubConnectionArgs();

    @InputImport(name="clusterName", required=true)
    private final Input<String> clusterName;

    public Input<String> getClusterName() {
        return this.clusterName;
    }

    @InputImport(name="consumerGroup", required=true)
    private final Input<String> consumerGroup;

    public Input<String> getConsumerGroup() {
        return this.consumerGroup;
    }

    @InputImport(name="dataFormat")
    private final @Nullable Input<Either<String,DataFormat>> dataFormat;

    public Input<Either<String,DataFormat>> getDataFormat() {
        return this.dataFormat == null ? Input.empty() : this.dataFormat;
    }

    @InputImport(name="databaseName", required=true)
    private final Input<String> databaseName;

    public Input<String> getDatabaseName() {
        return this.databaseName;
    }

    @InputImport(name="eventHubConnectionName")
    private final @Nullable Input<String> eventHubConnectionName;

    public Input<String> getEventHubConnectionName() {
        return this.eventHubConnectionName == null ? Input.empty() : this.eventHubConnectionName;
    }

    @InputImport(name="eventHubResourceId", required=true)
    private final Input<String> eventHubResourceId;

    public Input<String> getEventHubResourceId() {
        return this.eventHubResourceId;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="mappingRuleName")
    private final @Nullable Input<String> mappingRuleName;

    public Input<String> getMappingRuleName() {
        return this.mappingRuleName == null ? Input.empty() : this.mappingRuleName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="tableName")
    private final @Nullable Input<String> tableName;

    public Input<String> getTableName() {
        return this.tableName == null ? Input.empty() : this.tableName;
    }

    public EventHubConnectionArgs(
        Input<String> clusterName,
        Input<String> consumerGroup,
        @Nullable Input<Either<String,DataFormat>> dataFormat,
        Input<String> databaseName,
        @Nullable Input<String> eventHubConnectionName,
        Input<String> eventHubResourceId,
        @Nullable Input<String> location,
        @Nullable Input<String> mappingRuleName,
        Input<String> resourceGroupName,
        @Nullable Input<String> tableName) {
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
        this.clusterName = Input.empty();
        this.consumerGroup = Input.empty();
        this.dataFormat = Input.empty();
        this.databaseName = Input.empty();
        this.eventHubConnectionName = Input.empty();
        this.eventHubResourceId = Input.empty();
        this.location = Input.empty();
        this.mappingRuleName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tableName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHubConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> clusterName;
        private Input<String> consumerGroup;
        private @Nullable Input<Either<String,DataFormat>> dataFormat;
        private Input<String> databaseName;
        private @Nullable Input<String> eventHubConnectionName;
        private Input<String> eventHubResourceId;
        private @Nullable Input<String> location;
        private @Nullable Input<String> mappingRuleName;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> tableName;

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

        public Builder setClusterName(Input<String> clusterName) {
            this.clusterName = Objects.requireNonNull(clusterName);
            return this;
        }

        public Builder setClusterName(String clusterName) {
            this.clusterName = Input.of(Objects.requireNonNull(clusterName));
            return this;
        }

        public Builder setConsumerGroup(Input<String> consumerGroup) {
            this.consumerGroup = Objects.requireNonNull(consumerGroup);
            return this;
        }

        public Builder setConsumerGroup(String consumerGroup) {
            this.consumerGroup = Input.of(Objects.requireNonNull(consumerGroup));
            return this;
        }

        public Builder setDataFormat(@Nullable Input<Either<String,DataFormat>> dataFormat) {
            this.dataFormat = dataFormat;
            return this;
        }

        public Builder setDataFormat(@Nullable Either<String,DataFormat> dataFormat) {
            this.dataFormat = Input.ofNullable(dataFormat);
            return this;
        }

        public Builder setDatabaseName(Input<String> databaseName) {
            this.databaseName = Objects.requireNonNull(databaseName);
            return this;
        }

        public Builder setDatabaseName(String databaseName) {
            this.databaseName = Input.of(Objects.requireNonNull(databaseName));
            return this;
        }

        public Builder setEventHubConnectionName(@Nullable Input<String> eventHubConnectionName) {
            this.eventHubConnectionName = eventHubConnectionName;
            return this;
        }

        public Builder setEventHubConnectionName(@Nullable String eventHubConnectionName) {
            this.eventHubConnectionName = Input.ofNullable(eventHubConnectionName);
            return this;
        }

        public Builder setEventHubResourceId(Input<String> eventHubResourceId) {
            this.eventHubResourceId = Objects.requireNonNull(eventHubResourceId);
            return this;
        }

        public Builder setEventHubResourceId(String eventHubResourceId) {
            this.eventHubResourceId = Input.of(Objects.requireNonNull(eventHubResourceId));
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setMappingRuleName(@Nullable Input<String> mappingRuleName) {
            this.mappingRuleName = mappingRuleName;
            return this;
        }

        public Builder setMappingRuleName(@Nullable String mappingRuleName) {
            this.mappingRuleName = Input.ofNullable(mappingRuleName);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTableName(@Nullable Input<String> tableName) {
            this.tableName = tableName;
            return this;
        }

        public Builder setTableName(@Nullable String tableName) {
            this.tableName = Input.ofNullable(tableName);
            return this;
        }

        public EventHubConnectionArgs build() {
            return new EventHubConnectionArgs(clusterName, consumerGroup, dataFormat, databaseName, eventHubConnectionName, eventHubResourceId, location, mappingRuleName, resourceGroupName, tableName);
        }
    }
}
