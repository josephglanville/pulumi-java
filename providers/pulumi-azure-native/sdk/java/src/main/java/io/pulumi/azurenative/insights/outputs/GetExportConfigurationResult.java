// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetExportConfigurationResult {
    private final String applicationName;
    private final String containerName;
    private final String destinationAccountId;
    private final String destinationStorageLocationId;
    private final String destinationStorageSubscriptionId;
    private final String destinationType;
    private final String exportId;
    private final String exportStatus;
    private final String instrumentationKey;
    private final String isUserEnabled;
    private final String lastGapTime;
    private final String lastSuccessTime;
    private final String lastUserUpdate;
    private final @Nullable String notificationQueueEnabled;
    private final String permanentErrorReason;
    private final @Nullable String recordTypes;
    private final String resourceGroup;
    private final String storageName;
    private final String subscriptionId;

    @OutputCustomType.Constructor({"applicationName","containerName","destinationAccountId","destinationStorageLocationId","destinationStorageSubscriptionId","destinationType","exportId","exportStatus","instrumentationKey","isUserEnabled","lastGapTime","lastSuccessTime","lastUserUpdate","notificationQueueEnabled","permanentErrorReason","recordTypes","resourceGroup","storageName","subscriptionId"})
    private GetExportConfigurationResult(
        String applicationName,
        String containerName,
        String destinationAccountId,
        String destinationStorageLocationId,
        String destinationStorageSubscriptionId,
        String destinationType,
        String exportId,
        String exportStatus,
        String instrumentationKey,
        String isUserEnabled,
        String lastGapTime,
        String lastSuccessTime,
        String lastUserUpdate,
        @Nullable String notificationQueueEnabled,
        String permanentErrorReason,
        @Nullable String recordTypes,
        String resourceGroup,
        String storageName,
        String subscriptionId) {
        this.applicationName = Objects.requireNonNull(applicationName);
        this.containerName = Objects.requireNonNull(containerName);
        this.destinationAccountId = Objects.requireNonNull(destinationAccountId);
        this.destinationStorageLocationId = Objects.requireNonNull(destinationStorageLocationId);
        this.destinationStorageSubscriptionId = Objects.requireNonNull(destinationStorageSubscriptionId);
        this.destinationType = Objects.requireNonNull(destinationType);
        this.exportId = Objects.requireNonNull(exportId);
        this.exportStatus = Objects.requireNonNull(exportStatus);
        this.instrumentationKey = Objects.requireNonNull(instrumentationKey);
        this.isUserEnabled = Objects.requireNonNull(isUserEnabled);
        this.lastGapTime = Objects.requireNonNull(lastGapTime);
        this.lastSuccessTime = Objects.requireNonNull(lastSuccessTime);
        this.lastUserUpdate = Objects.requireNonNull(lastUserUpdate);
        this.notificationQueueEnabled = notificationQueueEnabled;
        this.permanentErrorReason = Objects.requireNonNull(permanentErrorReason);
        this.recordTypes = recordTypes;
        this.resourceGroup = Objects.requireNonNull(resourceGroup);
        this.storageName = Objects.requireNonNull(storageName);
        this.subscriptionId = Objects.requireNonNull(subscriptionId);
    }

    public String getApplicationName() {
        return this.applicationName;
    }
    public String getContainerName() {
        return this.containerName;
    }
    public String getDestinationAccountId() {
        return this.destinationAccountId;
    }
    public String getDestinationStorageLocationId() {
        return this.destinationStorageLocationId;
    }
    public String getDestinationStorageSubscriptionId() {
        return this.destinationStorageSubscriptionId;
    }
    public String getDestinationType() {
        return this.destinationType;
    }
    public String getExportId() {
        return this.exportId;
    }
    public String getExportStatus() {
        return this.exportStatus;
    }
    public String getInstrumentationKey() {
        return this.instrumentationKey;
    }
    public String getIsUserEnabled() {
        return this.isUserEnabled;
    }
    public String getLastGapTime() {
        return this.lastGapTime;
    }
    public String getLastSuccessTime() {
        return this.lastSuccessTime;
    }
    public String getLastUserUpdate() {
        return this.lastUserUpdate;
    }
    public Optional<String> getNotificationQueueEnabled() {
        return Optional.ofNullable(this.notificationQueueEnabled);
    }
    public String getPermanentErrorReason() {
        return this.permanentErrorReason;
    }
    public Optional<String> getRecordTypes() {
        return Optional.ofNullable(this.recordTypes);
    }
    public String getResourceGroup() {
        return this.resourceGroup;
    }
    public String getStorageName() {
        return this.storageName;
    }
    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetExportConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String applicationName;
        private String containerName;
        private String destinationAccountId;
        private String destinationStorageLocationId;
        private String destinationStorageSubscriptionId;
        private String destinationType;
        private String exportId;
        private String exportStatus;
        private String instrumentationKey;
        private String isUserEnabled;
        private String lastGapTime;
        private String lastSuccessTime;
        private String lastUserUpdate;
        private @Nullable String notificationQueueEnabled;
        private String permanentErrorReason;
        private @Nullable String recordTypes;
        private String resourceGroup;
        private String storageName;
        private String subscriptionId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetExportConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.applicationName = defaults.applicationName;
    	      this.containerName = defaults.containerName;
    	      this.destinationAccountId = defaults.destinationAccountId;
    	      this.destinationStorageLocationId = defaults.destinationStorageLocationId;
    	      this.destinationStorageSubscriptionId = defaults.destinationStorageSubscriptionId;
    	      this.destinationType = defaults.destinationType;
    	      this.exportId = defaults.exportId;
    	      this.exportStatus = defaults.exportStatus;
    	      this.instrumentationKey = defaults.instrumentationKey;
    	      this.isUserEnabled = defaults.isUserEnabled;
    	      this.lastGapTime = defaults.lastGapTime;
    	      this.lastSuccessTime = defaults.lastSuccessTime;
    	      this.lastUserUpdate = defaults.lastUserUpdate;
    	      this.notificationQueueEnabled = defaults.notificationQueueEnabled;
    	      this.permanentErrorReason = defaults.permanentErrorReason;
    	      this.recordTypes = defaults.recordTypes;
    	      this.resourceGroup = defaults.resourceGroup;
    	      this.storageName = defaults.storageName;
    	      this.subscriptionId = defaults.subscriptionId;
        }

        public Builder setApplicationName(String applicationName) {
            this.applicationName = Objects.requireNonNull(applicationName);
            return this;
        }

        public Builder setContainerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }

        public Builder setDestinationAccountId(String destinationAccountId) {
            this.destinationAccountId = Objects.requireNonNull(destinationAccountId);
            return this;
        }

        public Builder setDestinationStorageLocationId(String destinationStorageLocationId) {
            this.destinationStorageLocationId = Objects.requireNonNull(destinationStorageLocationId);
            return this;
        }

        public Builder setDestinationStorageSubscriptionId(String destinationStorageSubscriptionId) {
            this.destinationStorageSubscriptionId = Objects.requireNonNull(destinationStorageSubscriptionId);
            return this;
        }

        public Builder setDestinationType(String destinationType) {
            this.destinationType = Objects.requireNonNull(destinationType);
            return this;
        }

        public Builder setExportId(String exportId) {
            this.exportId = Objects.requireNonNull(exportId);
            return this;
        }

        public Builder setExportStatus(String exportStatus) {
            this.exportStatus = Objects.requireNonNull(exportStatus);
            return this;
        }

        public Builder setInstrumentationKey(String instrumentationKey) {
            this.instrumentationKey = Objects.requireNonNull(instrumentationKey);
            return this;
        }

        public Builder setIsUserEnabled(String isUserEnabled) {
            this.isUserEnabled = Objects.requireNonNull(isUserEnabled);
            return this;
        }

        public Builder setLastGapTime(String lastGapTime) {
            this.lastGapTime = Objects.requireNonNull(lastGapTime);
            return this;
        }

        public Builder setLastSuccessTime(String lastSuccessTime) {
            this.lastSuccessTime = Objects.requireNonNull(lastSuccessTime);
            return this;
        }

        public Builder setLastUserUpdate(String lastUserUpdate) {
            this.lastUserUpdate = Objects.requireNonNull(lastUserUpdate);
            return this;
        }

        public Builder setNotificationQueueEnabled(@Nullable String notificationQueueEnabled) {
            this.notificationQueueEnabled = notificationQueueEnabled;
            return this;
        }

        public Builder setPermanentErrorReason(String permanentErrorReason) {
            this.permanentErrorReason = Objects.requireNonNull(permanentErrorReason);
            return this;
        }

        public Builder setRecordTypes(@Nullable String recordTypes) {
            this.recordTypes = recordTypes;
            return this;
        }

        public Builder setResourceGroup(String resourceGroup) {
            this.resourceGroup = Objects.requireNonNull(resourceGroup);
            return this;
        }

        public Builder setStorageName(String storageName) {
            this.storageName = Objects.requireNonNull(storageName);
            return this;
        }

        public Builder setSubscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }

        public GetExportConfigurationResult build() {
            return new GetExportConfigurationResult(applicationName, containerName, destinationAccountId, destinationStorageLocationId, destinationStorageSubscriptionId, destinationType, exportId, exportStatus, instrumentationKey, isUserEnabled, lastGapTime, lastSuccessTime, lastUserUpdate, notificationQueueEnabled, permanentErrorReason, recordTypes, resourceGroup, storageName, subscriptionId);
        }
    }
}
