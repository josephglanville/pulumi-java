// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.inputs;

import io.pulumi.azurenative.logz.enums.MarketplaceSubscriptionStatus;
import io.pulumi.azurenative.logz.enums.MonitoringStatus;
import io.pulumi.azurenative.logz.inputs.LogzOrganizationPropertiesArgs;
import io.pulumi.azurenative.logz.inputs.PlanDataArgs;
import io.pulumi.azurenative.logz.inputs.UserInfoArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MonitorPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final MonitorPropertiesArgs Empty = new MonitorPropertiesArgs();

    @InputImport(name="logzOrganizationProperties")
    private final @Nullable Input<LogzOrganizationPropertiesArgs> logzOrganizationProperties;

    public Input<LogzOrganizationPropertiesArgs> getLogzOrganizationProperties() {
        return this.logzOrganizationProperties == null ? Input.empty() : this.logzOrganizationProperties;
    }

    @InputImport(name="marketplaceSubscriptionStatus")
    private final @Nullable Input<Either<String,MarketplaceSubscriptionStatus>> marketplaceSubscriptionStatus;

    public Input<Either<String,MarketplaceSubscriptionStatus>> getMarketplaceSubscriptionStatus() {
        return this.marketplaceSubscriptionStatus == null ? Input.empty() : this.marketplaceSubscriptionStatus;
    }

    @InputImport(name="monitoringStatus")
    private final @Nullable Input<Either<String,MonitoringStatus>> monitoringStatus;

    public Input<Either<String,MonitoringStatus>> getMonitoringStatus() {
        return this.monitoringStatus == null ? Input.empty() : this.monitoringStatus;
    }

    @InputImport(name="planData")
    private final @Nullable Input<PlanDataArgs> planData;

    public Input<PlanDataArgs> getPlanData() {
        return this.planData == null ? Input.empty() : this.planData;
    }

    @InputImport(name="userInfo")
    private final @Nullable Input<UserInfoArgs> userInfo;

    public Input<UserInfoArgs> getUserInfo() {
        return this.userInfo == null ? Input.empty() : this.userInfo;
    }

    public MonitorPropertiesArgs(
        @Nullable Input<LogzOrganizationPropertiesArgs> logzOrganizationProperties,
        @Nullable Input<Either<String,MarketplaceSubscriptionStatus>> marketplaceSubscriptionStatus,
        @Nullable Input<Either<String,MonitoringStatus>> monitoringStatus,
        @Nullable Input<PlanDataArgs> planData,
        @Nullable Input<UserInfoArgs> userInfo) {
        this.logzOrganizationProperties = logzOrganizationProperties;
        this.marketplaceSubscriptionStatus = marketplaceSubscriptionStatus;
        this.monitoringStatus = monitoringStatus;
        this.planData = planData;
        this.userInfo = userInfo;
    }

    private MonitorPropertiesArgs() {
        this.logzOrganizationProperties = Input.empty();
        this.marketplaceSubscriptionStatus = Input.empty();
        this.monitoringStatus = Input.empty();
        this.planData = Input.empty();
        this.userInfo = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MonitorPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<LogzOrganizationPropertiesArgs> logzOrganizationProperties;
        private @Nullable Input<Either<String,MarketplaceSubscriptionStatus>> marketplaceSubscriptionStatus;
        private @Nullable Input<Either<String,MonitoringStatus>> monitoringStatus;
        private @Nullable Input<PlanDataArgs> planData;
        private @Nullable Input<UserInfoArgs> userInfo;

        public Builder() {
    	      // Empty
        }

        public Builder(MonitorPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logzOrganizationProperties = defaults.logzOrganizationProperties;
    	      this.marketplaceSubscriptionStatus = defaults.marketplaceSubscriptionStatus;
    	      this.monitoringStatus = defaults.monitoringStatus;
    	      this.planData = defaults.planData;
    	      this.userInfo = defaults.userInfo;
        }

        public Builder setLogzOrganizationProperties(@Nullable Input<LogzOrganizationPropertiesArgs> logzOrganizationProperties) {
            this.logzOrganizationProperties = logzOrganizationProperties;
            return this;
        }

        public Builder setLogzOrganizationProperties(@Nullable LogzOrganizationPropertiesArgs logzOrganizationProperties) {
            this.logzOrganizationProperties = Input.ofNullable(logzOrganizationProperties);
            return this;
        }

        public Builder setMarketplaceSubscriptionStatus(@Nullable Input<Either<String,MarketplaceSubscriptionStatus>> marketplaceSubscriptionStatus) {
            this.marketplaceSubscriptionStatus = marketplaceSubscriptionStatus;
            return this;
        }

        public Builder setMarketplaceSubscriptionStatus(@Nullable Either<String,MarketplaceSubscriptionStatus> marketplaceSubscriptionStatus) {
            this.marketplaceSubscriptionStatus = Input.ofNullable(marketplaceSubscriptionStatus);
            return this;
        }

        public Builder setMonitoringStatus(@Nullable Input<Either<String,MonitoringStatus>> monitoringStatus) {
            this.monitoringStatus = monitoringStatus;
            return this;
        }

        public Builder setMonitoringStatus(@Nullable Either<String,MonitoringStatus> monitoringStatus) {
            this.monitoringStatus = Input.ofNullable(monitoringStatus);
            return this;
        }

        public Builder setPlanData(@Nullable Input<PlanDataArgs> planData) {
            this.planData = planData;
            return this;
        }

        public Builder setPlanData(@Nullable PlanDataArgs planData) {
            this.planData = Input.ofNullable(planData);
            return this;
        }

        public Builder setUserInfo(@Nullable Input<UserInfoArgs> userInfo) {
            this.userInfo = userInfo;
            return this;
        }

        public Builder setUserInfo(@Nullable UserInfoArgs userInfo) {
            this.userInfo = Input.ofNullable(userInfo);
            return this;
        }

        public MonitorPropertiesArgs build() {
            return new MonitorPropertiesArgs(logzOrganizationProperties, marketplaceSubscriptionStatus, monitoringStatus, planData, userInfo);
        }
    }
}
