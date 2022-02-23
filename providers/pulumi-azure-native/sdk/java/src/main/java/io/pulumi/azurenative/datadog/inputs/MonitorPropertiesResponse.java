// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datadog.inputs;

import io.pulumi.azurenative.datadog.inputs.DatadogOrganizationPropertiesResponse;
import io.pulumi.azurenative.datadog.inputs.UserInfoResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Properties specific to the monitor resource.
 * 
 */
public final class MonitorPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final MonitorPropertiesResponse Empty = new MonitorPropertiesResponse();

    /**
     * Datadog organization properties
     * 
     */
    @InputImport(name="datadogOrganizationProperties")
      private final @Nullable DatadogOrganizationPropertiesResponse datadogOrganizationProperties;

    public Optional<DatadogOrganizationPropertiesResponse> getDatadogOrganizationProperties() {
        return this.datadogOrganizationProperties == null ? Optional.empty() : Optional.ofNullable(this.datadogOrganizationProperties);
    }

    @InputImport(name="liftrResourceCategory", required=true)
      private final String liftrResourceCategory;

    public String getLiftrResourceCategory() {
        return this.liftrResourceCategory;
    }

    /**
     * The priority of the resource.
     * 
     */
    @InputImport(name="liftrResourcePreference", required=true)
      private final Integer liftrResourcePreference;

    public Integer getLiftrResourcePreference() {
        return this.liftrResourcePreference;
    }

    /**
     * Flag specifying the Marketplace Subscription Status of the resource. If payment is not made in time, the resource will go in Suspended state.
     * 
     */
    @InputImport(name="marketplaceSubscriptionStatus", required=true)
      private final String marketplaceSubscriptionStatus;

    public String getMarketplaceSubscriptionStatus() {
        return this.marketplaceSubscriptionStatus;
    }

    /**
     * Flag specifying if the resource monitoring is enabled or disabled.
     * 
     */
    @InputImport(name="monitoringStatus")
      private final @Nullable String monitoringStatus;

    public Optional<String> getMonitoringStatus() {
        return this.monitoringStatus == null ? Optional.empty() : Optional.ofNullable(this.monitoringStatus);
    }

    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * User info
     * 
     */
    @InputImport(name="userInfo")
      private final @Nullable UserInfoResponse userInfo;

    public Optional<UserInfoResponse> getUserInfo() {
        return this.userInfo == null ? Optional.empty() : Optional.ofNullable(this.userInfo);
    }

    public MonitorPropertiesResponse(
        @Nullable DatadogOrganizationPropertiesResponse datadogOrganizationProperties,
        String liftrResourceCategory,
        Integer liftrResourcePreference,
        String marketplaceSubscriptionStatus,
        @Nullable String monitoringStatus,
        String provisioningState,
        @Nullable UserInfoResponse userInfo) {
        this.datadogOrganizationProperties = datadogOrganizationProperties;
        this.liftrResourceCategory = Objects.requireNonNull(liftrResourceCategory, "expected parameter 'liftrResourceCategory' to be non-null");
        this.liftrResourcePreference = Objects.requireNonNull(liftrResourcePreference, "expected parameter 'liftrResourcePreference' to be non-null");
        this.marketplaceSubscriptionStatus = Objects.requireNonNull(marketplaceSubscriptionStatus, "expected parameter 'marketplaceSubscriptionStatus' to be non-null");
        this.monitoringStatus = monitoringStatus;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.userInfo = userInfo;
    }

    private MonitorPropertiesResponse() {
        this.datadogOrganizationProperties = null;
        this.liftrResourceCategory = null;
        this.liftrResourcePreference = null;
        this.marketplaceSubscriptionStatus = null;
        this.monitoringStatus = null;
        this.provisioningState = null;
        this.userInfo = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DatadogOrganizationPropertiesResponse datadogOrganizationProperties;
        private String liftrResourceCategory;
        private Integer liftrResourcePreference;
        private String marketplaceSubscriptionStatus;
        private @Nullable String monitoringStatus;
        private String provisioningState;
        private @Nullable UserInfoResponse userInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitorPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.datadogOrganizationProperties = defaults.datadogOrganizationProperties;
    	      this.liftrResourceCategory = defaults.liftrResourceCategory;
    	      this.liftrResourcePreference = defaults.liftrResourcePreference;
    	      this.marketplaceSubscriptionStatus = defaults.marketplaceSubscriptionStatus;
    	      this.monitoringStatus = defaults.monitoringStatus;
    	      this.provisioningState = defaults.provisioningState;
    	      this.userInfo = defaults.userInfo;
        }

        public Builder setDatadogOrganizationProperties(@Nullable DatadogOrganizationPropertiesResponse datadogOrganizationProperties) {
            this.datadogOrganizationProperties = datadogOrganizationProperties;
            return this;
        }

        public Builder setLiftrResourceCategory(String liftrResourceCategory) {
            this.liftrResourceCategory = Objects.requireNonNull(liftrResourceCategory);
            return this;
        }

        public Builder setLiftrResourcePreference(Integer liftrResourcePreference) {
            this.liftrResourcePreference = Objects.requireNonNull(liftrResourcePreference);
            return this;
        }

        public Builder setMarketplaceSubscriptionStatus(String marketplaceSubscriptionStatus) {
            this.marketplaceSubscriptionStatus = Objects.requireNonNull(marketplaceSubscriptionStatus);
            return this;
        }

        public Builder setMonitoringStatus(@Nullable String monitoringStatus) {
            this.monitoringStatus = monitoringStatus;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setUserInfo(@Nullable UserInfoResponse userInfo) {
            this.userInfo = userInfo;
            return this;
        }
        public MonitorPropertiesResponse build() {
            return new MonitorPropertiesResponse(datadogOrganizationProperties, liftrResourceCategory, liftrResourcePreference, marketplaceSubscriptionStatus, monitoringStatus, provisioningState, userInfo);
        }
    }
}
