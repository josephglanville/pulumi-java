// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.azurenative.sql.outputs.SkuResponse;
import io.pulumi.azurenative.sql.outputs.SyncGroupSchemaResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetSyncGroupResult {
    private final @Nullable Integer conflictLoggingRetentionInDays;
    private final @Nullable String conflictResolutionPolicy;
    private final @Nullable Boolean enableConflictLogging;
    private final @Nullable String hubDatabaseUserName;
    private final String id;
    private final @Nullable Integer interval;
    private final String lastSyncTime;
    private final String name;
    private final String privateEndpointName;
    private final @Nullable SyncGroupSchemaResponse schema;
    private final @Nullable SkuResponse sku;
    private final @Nullable String syncDatabaseId;
    private final String syncState;
    private final String type;
    private final @Nullable Boolean usePrivateLinkConnection;

    @OutputCustomType.Constructor({"conflictLoggingRetentionInDays","conflictResolutionPolicy","enableConflictLogging","hubDatabaseUserName","id","interval","lastSyncTime","name","privateEndpointName","schema","sku","syncDatabaseId","syncState","type","usePrivateLinkConnection"})
    private GetSyncGroupResult(
        @Nullable Integer conflictLoggingRetentionInDays,
        @Nullable String conflictResolutionPolicy,
        @Nullable Boolean enableConflictLogging,
        @Nullable String hubDatabaseUserName,
        String id,
        @Nullable Integer interval,
        String lastSyncTime,
        String name,
        String privateEndpointName,
        @Nullable SyncGroupSchemaResponse schema,
        @Nullable SkuResponse sku,
        @Nullable String syncDatabaseId,
        String syncState,
        String type,
        @Nullable Boolean usePrivateLinkConnection) {
        this.conflictLoggingRetentionInDays = conflictLoggingRetentionInDays;
        this.conflictResolutionPolicy = conflictResolutionPolicy;
        this.enableConflictLogging = enableConflictLogging;
        this.hubDatabaseUserName = hubDatabaseUserName;
        this.id = Objects.requireNonNull(id);
        this.interval = interval;
        this.lastSyncTime = Objects.requireNonNull(lastSyncTime);
        this.name = Objects.requireNonNull(name);
        this.privateEndpointName = Objects.requireNonNull(privateEndpointName);
        this.schema = schema;
        this.sku = sku;
        this.syncDatabaseId = syncDatabaseId;
        this.syncState = Objects.requireNonNull(syncState);
        this.type = Objects.requireNonNull(type);
        this.usePrivateLinkConnection = usePrivateLinkConnection;
    }

    public Optional<Integer> getConflictLoggingRetentionInDays() {
        return Optional.ofNullable(this.conflictLoggingRetentionInDays);
    }
    public Optional<String> getConflictResolutionPolicy() {
        return Optional.ofNullable(this.conflictResolutionPolicy);
    }
    public Optional<Boolean> getEnableConflictLogging() {
        return Optional.ofNullable(this.enableConflictLogging);
    }
    public Optional<String> getHubDatabaseUserName() {
        return Optional.ofNullable(this.hubDatabaseUserName);
    }
    public String getId() {
        return this.id;
    }
    public Optional<Integer> getInterval() {
        return Optional.ofNullable(this.interval);
    }
    public String getLastSyncTime() {
        return this.lastSyncTime;
    }
    public String getName() {
        return this.name;
    }
    public String getPrivateEndpointName() {
        return this.privateEndpointName;
    }
    public Optional<SyncGroupSchemaResponse> getSchema() {
        return Optional.ofNullable(this.schema);
    }
    public Optional<SkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    public Optional<String> getSyncDatabaseId() {
        return Optional.ofNullable(this.syncDatabaseId);
    }
    public String getSyncState() {
        return this.syncState;
    }
    public String getType() {
        return this.type;
    }
    public Optional<Boolean> getUsePrivateLinkConnection() {
        return Optional.ofNullable(this.usePrivateLinkConnection);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSyncGroupResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer conflictLoggingRetentionInDays;
        private @Nullable String conflictResolutionPolicy;
        private @Nullable Boolean enableConflictLogging;
        private @Nullable String hubDatabaseUserName;
        private String id;
        private @Nullable Integer interval;
        private String lastSyncTime;
        private String name;
        private String privateEndpointName;
        private @Nullable SyncGroupSchemaResponse schema;
        private @Nullable SkuResponse sku;
        private @Nullable String syncDatabaseId;
        private String syncState;
        private String type;
        private @Nullable Boolean usePrivateLinkConnection;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSyncGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.conflictLoggingRetentionInDays = defaults.conflictLoggingRetentionInDays;
    	      this.conflictResolutionPolicy = defaults.conflictResolutionPolicy;
    	      this.enableConflictLogging = defaults.enableConflictLogging;
    	      this.hubDatabaseUserName = defaults.hubDatabaseUserName;
    	      this.id = defaults.id;
    	      this.interval = defaults.interval;
    	      this.lastSyncTime = defaults.lastSyncTime;
    	      this.name = defaults.name;
    	      this.privateEndpointName = defaults.privateEndpointName;
    	      this.schema = defaults.schema;
    	      this.sku = defaults.sku;
    	      this.syncDatabaseId = defaults.syncDatabaseId;
    	      this.syncState = defaults.syncState;
    	      this.type = defaults.type;
    	      this.usePrivateLinkConnection = defaults.usePrivateLinkConnection;
        }

        public Builder setConflictLoggingRetentionInDays(@Nullable Integer conflictLoggingRetentionInDays) {
            this.conflictLoggingRetentionInDays = conflictLoggingRetentionInDays;
            return this;
        }

        public Builder setConflictResolutionPolicy(@Nullable String conflictResolutionPolicy) {
            this.conflictResolutionPolicy = conflictResolutionPolicy;
            return this;
        }

        public Builder setEnableConflictLogging(@Nullable Boolean enableConflictLogging) {
            this.enableConflictLogging = enableConflictLogging;
            return this;
        }

        public Builder setHubDatabaseUserName(@Nullable String hubDatabaseUserName) {
            this.hubDatabaseUserName = hubDatabaseUserName;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInterval(@Nullable Integer interval) {
            this.interval = interval;
            return this;
        }

        public Builder setLastSyncTime(String lastSyncTime) {
            this.lastSyncTime = Objects.requireNonNull(lastSyncTime);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setPrivateEndpointName(String privateEndpointName) {
            this.privateEndpointName = Objects.requireNonNull(privateEndpointName);
            return this;
        }

        public Builder setSchema(@Nullable SyncGroupSchemaResponse schema) {
            this.schema = schema;
            return this;
        }

        public Builder setSku(@Nullable SkuResponse sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSyncDatabaseId(@Nullable String syncDatabaseId) {
            this.syncDatabaseId = syncDatabaseId;
            return this;
        }

        public Builder setSyncState(String syncState) {
            this.syncState = Objects.requireNonNull(syncState);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUsePrivateLinkConnection(@Nullable Boolean usePrivateLinkConnection) {
            this.usePrivateLinkConnection = usePrivateLinkConnection;
            return this;
        }

        public GetSyncGroupResult build() {
            return new GetSyncGroupResult(conflictLoggingRetentionInDays, conflictResolutionPolicy, enableConflictLogging, hubDatabaseUserName, id, interval, lastSyncTime, name, privateEndpointName, schema, sku, syncDatabaseId, syncState, type, usePrivateLinkConnection);
        }
    }
}
