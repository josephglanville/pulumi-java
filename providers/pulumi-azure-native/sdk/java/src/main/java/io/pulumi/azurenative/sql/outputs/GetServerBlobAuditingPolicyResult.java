// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetServerBlobAuditingPolicyResult {
    private final @Nullable List<String> auditActionsAndGroups;
    private final String id;
    private final @Nullable Boolean isAzureMonitorTargetEnabled;
    private final @Nullable Boolean isDevopsAuditEnabled;
    private final @Nullable Boolean isStorageSecondaryKeyInUse;
    private final String name;
    private final @Nullable Integer queueDelayMs;
    private final @Nullable Integer retentionDays;
    private final String state;
    private final @Nullable String storageAccountSubscriptionId;
    private final @Nullable String storageEndpoint;
    private final String type;

    @OutputCustomType.Constructor({"auditActionsAndGroups","id","isAzureMonitorTargetEnabled","isDevopsAuditEnabled","isStorageSecondaryKeyInUse","name","queueDelayMs","retentionDays","state","storageAccountSubscriptionId","storageEndpoint","type"})
    private GetServerBlobAuditingPolicyResult(
        @Nullable List<String> auditActionsAndGroups,
        String id,
        @Nullable Boolean isAzureMonitorTargetEnabled,
        @Nullable Boolean isDevopsAuditEnabled,
        @Nullable Boolean isStorageSecondaryKeyInUse,
        String name,
        @Nullable Integer queueDelayMs,
        @Nullable Integer retentionDays,
        String state,
        @Nullable String storageAccountSubscriptionId,
        @Nullable String storageEndpoint,
        String type) {
        this.auditActionsAndGroups = auditActionsAndGroups;
        this.id = Objects.requireNonNull(id);
        this.isAzureMonitorTargetEnabled = isAzureMonitorTargetEnabled;
        this.isDevopsAuditEnabled = isDevopsAuditEnabled;
        this.isStorageSecondaryKeyInUse = isStorageSecondaryKeyInUse;
        this.name = Objects.requireNonNull(name);
        this.queueDelayMs = queueDelayMs;
        this.retentionDays = retentionDays;
        this.state = Objects.requireNonNull(state);
        this.storageAccountSubscriptionId = storageAccountSubscriptionId;
        this.storageEndpoint = storageEndpoint;
        this.type = Objects.requireNonNull(type);
    }

    public List<String> getAuditActionsAndGroups() {
        return this.auditActionsAndGroups == null ? List.of() : this.auditActionsAndGroups;
    }
    public String getId() {
        return this.id;
    }
    public Optional<Boolean> getIsAzureMonitorTargetEnabled() {
        return Optional.ofNullable(this.isAzureMonitorTargetEnabled);
    }
    public Optional<Boolean> getIsDevopsAuditEnabled() {
        return Optional.ofNullable(this.isDevopsAuditEnabled);
    }
    public Optional<Boolean> getIsStorageSecondaryKeyInUse() {
        return Optional.ofNullable(this.isStorageSecondaryKeyInUse);
    }
    public String getName() {
        return this.name;
    }
    public Optional<Integer> getQueueDelayMs() {
        return Optional.ofNullable(this.queueDelayMs);
    }
    public Optional<Integer> getRetentionDays() {
        return Optional.ofNullable(this.retentionDays);
    }
    public String getState() {
        return this.state;
    }
    public Optional<String> getStorageAccountSubscriptionId() {
        return Optional.ofNullable(this.storageAccountSubscriptionId);
    }
    public Optional<String> getStorageEndpoint() {
        return Optional.ofNullable(this.storageEndpoint);
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServerBlobAuditingPolicyResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> auditActionsAndGroups;
        private String id;
        private @Nullable Boolean isAzureMonitorTargetEnabled;
        private @Nullable Boolean isDevopsAuditEnabled;
        private @Nullable Boolean isStorageSecondaryKeyInUse;
        private String name;
        private @Nullable Integer queueDelayMs;
        private @Nullable Integer retentionDays;
        private String state;
        private @Nullable String storageAccountSubscriptionId;
        private @Nullable String storageEndpoint;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetServerBlobAuditingPolicyResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.auditActionsAndGroups = defaults.auditActionsAndGroups;
    	      this.id = defaults.id;
    	      this.isAzureMonitorTargetEnabled = defaults.isAzureMonitorTargetEnabled;
    	      this.isDevopsAuditEnabled = defaults.isDevopsAuditEnabled;
    	      this.isStorageSecondaryKeyInUse = defaults.isStorageSecondaryKeyInUse;
    	      this.name = defaults.name;
    	      this.queueDelayMs = defaults.queueDelayMs;
    	      this.retentionDays = defaults.retentionDays;
    	      this.state = defaults.state;
    	      this.storageAccountSubscriptionId = defaults.storageAccountSubscriptionId;
    	      this.storageEndpoint = defaults.storageEndpoint;
    	      this.type = defaults.type;
        }

        public Builder setAuditActionsAndGroups(@Nullable List<String> auditActionsAndGroups) {
            this.auditActionsAndGroups = auditActionsAndGroups;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setIsAzureMonitorTargetEnabled(@Nullable Boolean isAzureMonitorTargetEnabled) {
            this.isAzureMonitorTargetEnabled = isAzureMonitorTargetEnabled;
            return this;
        }

        public Builder setIsDevopsAuditEnabled(@Nullable Boolean isDevopsAuditEnabled) {
            this.isDevopsAuditEnabled = isDevopsAuditEnabled;
            return this;
        }

        public Builder setIsStorageSecondaryKeyInUse(@Nullable Boolean isStorageSecondaryKeyInUse) {
            this.isStorageSecondaryKeyInUse = isStorageSecondaryKeyInUse;
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setQueueDelayMs(@Nullable Integer queueDelayMs) {
            this.queueDelayMs = queueDelayMs;
            return this;
        }

        public Builder setRetentionDays(@Nullable Integer retentionDays) {
            this.retentionDays = retentionDays;
            return this;
        }

        public Builder setState(String state) {
            this.state = Objects.requireNonNull(state);
            return this;
        }

        public Builder setStorageAccountSubscriptionId(@Nullable String storageAccountSubscriptionId) {
            this.storageAccountSubscriptionId = storageAccountSubscriptionId;
            return this;
        }

        public Builder setStorageEndpoint(@Nullable String storageEndpoint) {
            this.storageEndpoint = storageEndpoint;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetServerBlobAuditingPolicyResult build() {
            return new GetServerBlobAuditingPolicyResult(auditActionsAndGroups, id, isAzureMonitorTargetEnabled, isDevopsAuditEnabled, isStorageSecondaryKeyInUse, name, queueDelayMs, retentionDays, state, storageAccountSubscriptionId, storageEndpoint, type);
        }
    }
}
