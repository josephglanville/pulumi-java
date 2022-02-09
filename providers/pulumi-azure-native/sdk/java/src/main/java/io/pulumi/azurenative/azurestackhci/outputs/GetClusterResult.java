// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurestackhci.outputs;

import io.pulumi.azurenative.azurestackhci.outputs.ClusterReportedPropertiesResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Double;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetClusterResult {
    private final String aadClientId;
    private final String aadTenantId;
    private final String billingModel;
    private final String cloudId;
    private final @Nullable String createdAt;
    private final @Nullable String createdBy;
    private final @Nullable String createdByType;
    private final String id;
    private final String lastBillingTimestamp;
    private final @Nullable String lastModifiedAt;
    private final @Nullable String lastModifiedBy;
    private final @Nullable String lastModifiedByType;
    private final String lastSyncTimestamp;
    private final String location;
    private final String name;
    private final String provisioningState;
    private final String registrationTimestamp;
    private final @Nullable ClusterReportedPropertiesResponse reportedProperties;
    private final String status;
    private final @Nullable Map<String,String> tags;
    private final Double trialDaysRemaining;
    private final String type;

    @OutputCustomType.Constructor({"aadClientId","aadTenantId","billingModel","cloudId","createdAt","createdBy","createdByType","id","lastBillingTimestamp","lastModifiedAt","lastModifiedBy","lastModifiedByType","lastSyncTimestamp","location","name","provisioningState","registrationTimestamp","reportedProperties","status","tags","trialDaysRemaining","type"})
    private GetClusterResult(
        String aadClientId,
        String aadTenantId,
        String billingModel,
        String cloudId,
        @Nullable String createdAt,
        @Nullable String createdBy,
        @Nullable String createdByType,
        String id,
        String lastBillingTimestamp,
        @Nullable String lastModifiedAt,
        @Nullable String lastModifiedBy,
        @Nullable String lastModifiedByType,
        String lastSyncTimestamp,
        String location,
        String name,
        String provisioningState,
        String registrationTimestamp,
        @Nullable ClusterReportedPropertiesResponse reportedProperties,
        String status,
        @Nullable Map<String,String> tags,
        Double trialDaysRemaining,
        String type) {
        this.aadClientId = Objects.requireNonNull(aadClientId);
        this.aadTenantId = Objects.requireNonNull(aadTenantId);
        this.billingModel = Objects.requireNonNull(billingModel);
        this.cloudId = Objects.requireNonNull(cloudId);
        this.createdAt = createdAt;
        this.createdBy = createdBy;
        this.createdByType = createdByType;
        this.id = Objects.requireNonNull(id);
        this.lastBillingTimestamp = Objects.requireNonNull(lastBillingTimestamp);
        this.lastModifiedAt = lastModifiedAt;
        this.lastModifiedBy = lastModifiedBy;
        this.lastModifiedByType = lastModifiedByType;
        this.lastSyncTimestamp = Objects.requireNonNull(lastSyncTimestamp);
        this.location = Objects.requireNonNull(location);
        this.name = Objects.requireNonNull(name);
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.registrationTimestamp = Objects.requireNonNull(registrationTimestamp);
        this.reportedProperties = reportedProperties;
        this.status = Objects.requireNonNull(status);
        this.tags = tags;
        this.trialDaysRemaining = Objects.requireNonNull(trialDaysRemaining);
        this.type = Objects.requireNonNull(type);
    }

    public String getAadClientId() {
        return this.aadClientId;
    }
    public String getAadTenantId() {
        return this.aadTenantId;
    }
    public String getBillingModel() {
        return this.billingModel;
    }
    public String getCloudId() {
        return this.cloudId;
    }
    public Optional<String> getCreatedAt() {
        return Optional.ofNullable(this.createdAt);
    }
    public Optional<String> getCreatedBy() {
        return Optional.ofNullable(this.createdBy);
    }
    public Optional<String> getCreatedByType() {
        return Optional.ofNullable(this.createdByType);
    }
    public String getId() {
        return this.id;
    }
    public String getLastBillingTimestamp() {
        return this.lastBillingTimestamp;
    }
    public Optional<String> getLastModifiedAt() {
        return Optional.ofNullable(this.lastModifiedAt);
    }
    public Optional<String> getLastModifiedBy() {
        return Optional.ofNullable(this.lastModifiedBy);
    }
    public Optional<String> getLastModifiedByType() {
        return Optional.ofNullable(this.lastModifiedByType);
    }
    public String getLastSyncTimestamp() {
        return this.lastSyncTimestamp;
    }
    public String getLocation() {
        return this.location;
    }
    public String getName() {
        return this.name;
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getRegistrationTimestamp() {
        return this.registrationTimestamp;
    }
    public Optional<ClusterReportedPropertiesResponse> getReportedProperties() {
        return Optional.ofNullable(this.reportedProperties);
    }
    public String getStatus() {
        return this.status;
    }
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    public Double getTrialDaysRemaining() {
        return this.trialDaysRemaining;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aadClientId;
        private String aadTenantId;
        private String billingModel;
        private String cloudId;
        private @Nullable String createdAt;
        private @Nullable String createdBy;
        private @Nullable String createdByType;
        private String id;
        private String lastBillingTimestamp;
        private @Nullable String lastModifiedAt;
        private @Nullable String lastModifiedBy;
        private @Nullable String lastModifiedByType;
        private String lastSyncTimestamp;
        private String location;
        private String name;
        private String provisioningState;
        private String registrationTimestamp;
        private @Nullable ClusterReportedPropertiesResponse reportedProperties;
        private String status;
        private @Nullable Map<String,String> tags;
        private Double trialDaysRemaining;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetClusterResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aadClientId = defaults.aadClientId;
    	      this.aadTenantId = defaults.aadTenantId;
    	      this.billingModel = defaults.billingModel;
    	      this.cloudId = defaults.cloudId;
    	      this.createdAt = defaults.createdAt;
    	      this.createdBy = defaults.createdBy;
    	      this.createdByType = defaults.createdByType;
    	      this.id = defaults.id;
    	      this.lastBillingTimestamp = defaults.lastBillingTimestamp;
    	      this.lastModifiedAt = defaults.lastModifiedAt;
    	      this.lastModifiedBy = defaults.lastModifiedBy;
    	      this.lastModifiedByType = defaults.lastModifiedByType;
    	      this.lastSyncTimestamp = defaults.lastSyncTimestamp;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.provisioningState = defaults.provisioningState;
    	      this.registrationTimestamp = defaults.registrationTimestamp;
    	      this.reportedProperties = defaults.reportedProperties;
    	      this.status = defaults.status;
    	      this.tags = defaults.tags;
    	      this.trialDaysRemaining = defaults.trialDaysRemaining;
    	      this.type = defaults.type;
        }

        public Builder setAadClientId(String aadClientId) {
            this.aadClientId = Objects.requireNonNull(aadClientId);
            return this;
        }

        public Builder setAadTenantId(String aadTenantId) {
            this.aadTenantId = Objects.requireNonNull(aadTenantId);
            return this;
        }

        public Builder setBillingModel(String billingModel) {
            this.billingModel = Objects.requireNonNull(billingModel);
            return this;
        }

        public Builder setCloudId(String cloudId) {
            this.cloudId = Objects.requireNonNull(cloudId);
            return this;
        }

        public Builder setCreatedAt(@Nullable String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Builder setCreatedBy(@Nullable String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public Builder setCreatedByType(@Nullable String createdByType) {
            this.createdByType = createdByType;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setLastBillingTimestamp(String lastBillingTimestamp) {
            this.lastBillingTimestamp = Objects.requireNonNull(lastBillingTimestamp);
            return this;
        }

        public Builder setLastModifiedAt(@Nullable String lastModifiedAt) {
            this.lastModifiedAt = lastModifiedAt;
            return this;
        }

        public Builder setLastModifiedBy(@Nullable String lastModifiedBy) {
            this.lastModifiedBy = lastModifiedBy;
            return this;
        }

        public Builder setLastModifiedByType(@Nullable String lastModifiedByType) {
            this.lastModifiedByType = lastModifiedByType;
            return this;
        }

        public Builder setLastSyncTimestamp(String lastSyncTimestamp) {
            this.lastSyncTimestamp = Objects.requireNonNull(lastSyncTimestamp);
            return this;
        }

        public Builder setLocation(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRegistrationTimestamp(String registrationTimestamp) {
            this.registrationTimestamp = Objects.requireNonNull(registrationTimestamp);
            return this;
        }

        public Builder setReportedProperties(@Nullable ClusterReportedPropertiesResponse reportedProperties) {
            this.reportedProperties = reportedProperties;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTrialDaysRemaining(Double trialDaysRemaining) {
            this.trialDaysRemaining = Objects.requireNonNull(trialDaysRemaining);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetClusterResult build() {
            return new GetClusterResult(aadClientId, aadTenantId, billingModel, cloudId, createdAt, createdBy, createdByType, id, lastBillingTimestamp, lastModifiedAt, lastModifiedBy, lastModifiedByType, lastSyncTimestamp, location, name, provisioningState, registrationTimestamp, reportedProperties, status, tags, trialDaysRemaining, type);
        }
    }
}
