// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.inputs.RuleManagementEventClaimsDataSourceResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A rule management event data source. The discriminator fields is always RuleManagementEventDataSource in this case.
 * 
 */
public final class RuleManagementEventDataSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final RuleManagementEventDataSourceResponse Empty = new RuleManagementEventDataSourceResponse();

    /**
     * the claims.
     * 
     */
    @InputImport(name="claims")
      private final @Nullable RuleManagementEventClaimsDataSourceResponse claims;

    public Optional<RuleManagementEventClaimsDataSourceResponse> getClaims() {
        return this.claims == null ? Optional.empty() : Optional.ofNullable(this.claims);
    }

    /**
     * the event name.
     * 
     */
    @InputImport(name="eventName")
      private final @Nullable String eventName;

    public Optional<String> getEventName() {
        return this.eventName == null ? Optional.empty() : Optional.ofNullable(this.eventName);
    }

    /**
     * the event source.
     * 
     */
    @InputImport(name="eventSource")
      private final @Nullable String eventSource;

    public Optional<String> getEventSource() {
        return this.eventSource == null ? Optional.empty() : Optional.ofNullable(this.eventSource);
    }

    /**
     * the legacy resource identifier of the resource the rule monitors. **NOTE**: this property cannot be updated for an existing rule.
     * 
     */
    @InputImport(name="legacyResourceId")
      private final @Nullable String legacyResourceId;

    public Optional<String> getLegacyResourceId() {
        return this.legacyResourceId == null ? Optional.empty() : Optional.ofNullable(this.legacyResourceId);
    }

    /**
     * the level.
     * 
     */
    @InputImport(name="level")
      private final @Nullable String level;

    public Optional<String> getLevel() {
        return this.level == null ? Optional.empty() : Optional.ofNullable(this.level);
    }

    /**
     * the namespace of the metric.
     * 
     */
    @InputImport(name="metricNamespace")
      private final @Nullable String metricNamespace;

    public Optional<String> getMetricNamespace() {
        return this.metricNamespace == null ? Optional.empty() : Optional.ofNullable(this.metricNamespace);
    }

    /**
     * specifies the type of data source. There are two types of rule data sources: RuleMetricDataSource and RuleManagementEventDataSource
     * Expected value is 'Microsoft.Azure.Management.Insights.Models.RuleManagementEventDataSource'.
     * 
     */
    @InputImport(name="odataType", required=true)
      private final String odataType;

    public String getOdataType() {
        return this.odataType;
    }

    /**
     * The name of the operation that should be checked for. If no name is provided, any operation will match.
     * 
     */
    @InputImport(name="operationName")
      private final @Nullable String operationName;

    public Optional<String> getOperationName() {
        return this.operationName == null ? Optional.empty() : Optional.ofNullable(this.operationName);
    }

    /**
     * the resource group name.
     * 
     */
    @InputImport(name="resourceGroupName")
      private final @Nullable String resourceGroupName;

    public Optional<String> getResourceGroupName() {
        return this.resourceGroupName == null ? Optional.empty() : Optional.ofNullable(this.resourceGroupName);
    }

    /**
     * the location of the resource.
     * 
     */
    @InputImport(name="resourceLocation")
      private final @Nullable String resourceLocation;

    public Optional<String> getResourceLocation() {
        return this.resourceLocation == null ? Optional.empty() : Optional.ofNullable(this.resourceLocation);
    }

    /**
     * the resource provider name.
     * 
     */
    @InputImport(name="resourceProviderName")
      private final @Nullable String resourceProviderName;

    public Optional<String> getResourceProviderName() {
        return this.resourceProviderName == null ? Optional.empty() : Optional.ofNullable(this.resourceProviderName);
    }

    /**
     * the resource identifier of the resource the rule monitors. **NOTE**: this property cannot be updated for an existing rule.
     * 
     */
    @InputImport(name="resourceUri")
      private final @Nullable String resourceUri;

    public Optional<String> getResourceUri() {
        return this.resourceUri == null ? Optional.empty() : Optional.ofNullable(this.resourceUri);
    }

    /**
     * The status of the operation that should be checked for. If no status is provided, any status will match.
     * 
     */
    @InputImport(name="status")
      private final @Nullable String status;

    public Optional<String> getStatus() {
        return this.status == null ? Optional.empty() : Optional.ofNullable(this.status);
    }

    /**
     * the substatus.
     * 
     */
    @InputImport(name="subStatus")
      private final @Nullable String subStatus;

    public Optional<String> getSubStatus() {
        return this.subStatus == null ? Optional.empty() : Optional.ofNullable(this.subStatus);
    }

    public RuleManagementEventDataSourceResponse(
        @Nullable RuleManagementEventClaimsDataSourceResponse claims,
        @Nullable String eventName,
        @Nullable String eventSource,
        @Nullable String legacyResourceId,
        @Nullable String level,
        @Nullable String metricNamespace,
        String odataType,
        @Nullable String operationName,
        @Nullable String resourceGroupName,
        @Nullable String resourceLocation,
        @Nullable String resourceProviderName,
        @Nullable String resourceUri,
        @Nullable String status,
        @Nullable String subStatus) {
        this.claims = claims;
        this.eventName = eventName;
        this.eventSource = eventSource;
        this.legacyResourceId = legacyResourceId;
        this.level = level;
        this.metricNamespace = metricNamespace;
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
        this.operationName = operationName;
        this.resourceGroupName = resourceGroupName;
        this.resourceLocation = resourceLocation;
        this.resourceProviderName = resourceProviderName;
        this.resourceUri = resourceUri;
        this.status = status;
        this.subStatus = subStatus;
    }

    private RuleManagementEventDataSourceResponse() {
        this.claims = null;
        this.eventName = null;
        this.eventSource = null;
        this.legacyResourceId = null;
        this.level = null;
        this.metricNamespace = null;
        this.odataType = null;
        this.operationName = null;
        this.resourceGroupName = null;
        this.resourceLocation = null;
        this.resourceProviderName = null;
        this.resourceUri = null;
        this.status = null;
        this.subStatus = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RuleManagementEventDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable RuleManagementEventClaimsDataSourceResponse claims;
        private @Nullable String eventName;
        private @Nullable String eventSource;
        private @Nullable String legacyResourceId;
        private @Nullable String level;
        private @Nullable String metricNamespace;
        private String odataType;
        private @Nullable String operationName;
        private @Nullable String resourceGroupName;
        private @Nullable String resourceLocation;
        private @Nullable String resourceProviderName;
        private @Nullable String resourceUri;
        private @Nullable String status;
        private @Nullable String subStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(RuleManagementEventDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.claims = defaults.claims;
    	      this.eventName = defaults.eventName;
    	      this.eventSource = defaults.eventSource;
    	      this.legacyResourceId = defaults.legacyResourceId;
    	      this.level = defaults.level;
    	      this.metricNamespace = defaults.metricNamespace;
    	      this.odataType = defaults.odataType;
    	      this.operationName = defaults.operationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceLocation = defaults.resourceLocation;
    	      this.resourceProviderName = defaults.resourceProviderName;
    	      this.resourceUri = defaults.resourceUri;
    	      this.status = defaults.status;
    	      this.subStatus = defaults.subStatus;
        }

        public Builder setClaims(@Nullable RuleManagementEventClaimsDataSourceResponse claims) {
            this.claims = claims;
            return this;
        }

        public Builder setEventName(@Nullable String eventName) {
            this.eventName = eventName;
            return this;
        }

        public Builder setEventSource(@Nullable String eventSource) {
            this.eventSource = eventSource;
            return this;
        }

        public Builder setLegacyResourceId(@Nullable String legacyResourceId) {
            this.legacyResourceId = legacyResourceId;
            return this;
        }

        public Builder setLevel(@Nullable String level) {
            this.level = level;
            return this;
        }

        public Builder setMetricNamespace(@Nullable String metricNamespace) {
            this.metricNamespace = metricNamespace;
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOperationName(@Nullable String operationName) {
            this.operationName = operationName;
            return this;
        }

        public Builder setResourceGroupName(@Nullable String resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder setResourceLocation(@Nullable String resourceLocation) {
            this.resourceLocation = resourceLocation;
            return this;
        }

        public Builder setResourceProviderName(@Nullable String resourceProviderName) {
            this.resourceProviderName = resourceProviderName;
            return this;
        }

        public Builder setResourceUri(@Nullable String resourceUri) {
            this.resourceUri = resourceUri;
            return this;
        }

        public Builder setStatus(@Nullable String status) {
            this.status = status;
            return this;
        }

        public Builder setSubStatus(@Nullable String subStatus) {
            this.subStatus = subStatus;
            return this;
        }
        public RuleManagementEventDataSourceResponse build() {
            return new RuleManagementEventDataSourceResponse(claims, eventName, eventSource, legacyResourceId, level, metricNamespace, odataType, operationName, resourceGroupName, resourceLocation, resourceProviderName, resourceUri, status, subStatus);
        }
    }
}
