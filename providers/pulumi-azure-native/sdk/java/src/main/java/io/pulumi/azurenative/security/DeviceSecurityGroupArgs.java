// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security;

import io.pulumi.azurenative.security.inputs.AllowlistCustomAlertRuleArgs;
import io.pulumi.azurenative.security.inputs.DenylistCustomAlertRuleArgs;
import io.pulumi.azurenative.security.inputs.ThresholdCustomAlertRuleArgs;
import io.pulumi.azurenative.security.inputs.TimeWindowCustomAlertRuleArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceSecurityGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceSecurityGroupArgs Empty = new DeviceSecurityGroupArgs();

    /**
     * The allow-list custom alert rules.
     * 
     */
    @Import(name="allowlistRules")
      private final @Nullable Output<List<AllowlistCustomAlertRuleArgs>> allowlistRules;

    public Output<List<AllowlistCustomAlertRuleArgs>> getAllowlistRules() {
        return this.allowlistRules == null ? Output.empty() : this.allowlistRules;
    }

    /**
     * The deny-list custom alert rules.
     * 
     */
    @Import(name="denylistRules")
      private final @Nullable Output<List<DenylistCustomAlertRuleArgs>> denylistRules;

    public Output<List<DenylistCustomAlertRuleArgs>> getDenylistRules() {
        return this.denylistRules == null ? Output.empty() : this.denylistRules;
    }

    /**
     * The name of the device security group. Note that the name of the device security group is case insensitive.
     * 
     */
    @Import(name="deviceSecurityGroupName")
      private final @Nullable Output<String> deviceSecurityGroupName;

    public Output<String> getDeviceSecurityGroupName() {
        return this.deviceSecurityGroupName == null ? Output.empty() : this.deviceSecurityGroupName;
    }

    /**
     * The identifier of the resource.
     * 
     */
    @Import(name="resourceId", required=true)
      private final Output<String> resourceId;

    public Output<String> getResourceId() {
        return this.resourceId;
    }

    /**
     * The list of custom alert threshold rules.
     * 
     */
    @Import(name="thresholdRules")
      private final @Nullable Output<List<ThresholdCustomAlertRuleArgs>> thresholdRules;

    public Output<List<ThresholdCustomAlertRuleArgs>> getThresholdRules() {
        return this.thresholdRules == null ? Output.empty() : this.thresholdRules;
    }

    /**
     * The list of custom alert time-window rules.
     * 
     */
    @Import(name="timeWindowRules")
      private final @Nullable Output<List<TimeWindowCustomAlertRuleArgs>> timeWindowRules;

    public Output<List<TimeWindowCustomAlertRuleArgs>> getTimeWindowRules() {
        return this.timeWindowRules == null ? Output.empty() : this.timeWindowRules;
    }

    public DeviceSecurityGroupArgs(
        @Nullable Output<List<AllowlistCustomAlertRuleArgs>> allowlistRules,
        @Nullable Output<List<DenylistCustomAlertRuleArgs>> denylistRules,
        @Nullable Output<String> deviceSecurityGroupName,
        Output<String> resourceId,
        @Nullable Output<List<ThresholdCustomAlertRuleArgs>> thresholdRules,
        @Nullable Output<List<TimeWindowCustomAlertRuleArgs>> timeWindowRules) {
        this.allowlistRules = allowlistRules;
        this.denylistRules = denylistRules;
        this.deviceSecurityGroupName = deviceSecurityGroupName;
        this.resourceId = Objects.requireNonNull(resourceId, "expected parameter 'resourceId' to be non-null");
        this.thresholdRules = thresholdRules;
        this.timeWindowRules = timeWindowRules;
    }

    private DeviceSecurityGroupArgs() {
        this.allowlistRules = Output.empty();
        this.denylistRules = Output.empty();
        this.deviceSecurityGroupName = Output.empty();
        this.resourceId = Output.empty();
        this.thresholdRules = Output.empty();
        this.timeWindowRules = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceSecurityGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<AllowlistCustomAlertRuleArgs>> allowlistRules;
        private @Nullable Output<List<DenylistCustomAlertRuleArgs>> denylistRules;
        private @Nullable Output<String> deviceSecurityGroupName;
        private Output<String> resourceId;
        private @Nullable Output<List<ThresholdCustomAlertRuleArgs>> thresholdRules;
        private @Nullable Output<List<TimeWindowCustomAlertRuleArgs>> timeWindowRules;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceSecurityGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowlistRules = defaults.allowlistRules;
    	      this.denylistRules = defaults.denylistRules;
    	      this.deviceSecurityGroupName = defaults.deviceSecurityGroupName;
    	      this.resourceId = defaults.resourceId;
    	      this.thresholdRules = defaults.thresholdRules;
    	      this.timeWindowRules = defaults.timeWindowRules;
        }

        public Builder allowlistRules(@Nullable Output<List<AllowlistCustomAlertRuleArgs>> allowlistRules) {
            this.allowlistRules = allowlistRules;
            return this;
        }
        public Builder allowlistRules(@Nullable List<AllowlistCustomAlertRuleArgs> allowlistRules) {
            this.allowlistRules = Output.ofNullable(allowlistRules);
            return this;
        }
        public Builder allowlistRules(AllowlistCustomAlertRuleArgs... allowlistRules) {
            return allowlistRules(List.of(allowlistRules));
        }
        public Builder denylistRules(@Nullable Output<List<DenylistCustomAlertRuleArgs>> denylistRules) {
            this.denylistRules = denylistRules;
            return this;
        }
        public Builder denylistRules(@Nullable List<DenylistCustomAlertRuleArgs> denylistRules) {
            this.denylistRules = Output.ofNullable(denylistRules);
            return this;
        }
        public Builder denylistRules(DenylistCustomAlertRuleArgs... denylistRules) {
            return denylistRules(List.of(denylistRules));
        }
        public Builder deviceSecurityGroupName(@Nullable Output<String> deviceSecurityGroupName) {
            this.deviceSecurityGroupName = deviceSecurityGroupName;
            return this;
        }
        public Builder deviceSecurityGroupName(@Nullable String deviceSecurityGroupName) {
            this.deviceSecurityGroupName = Output.ofNullable(deviceSecurityGroupName);
            return this;
        }
        public Builder resourceId(Output<String> resourceId) {
            this.resourceId = Objects.requireNonNull(resourceId);
            return this;
        }
        public Builder resourceId(String resourceId) {
            this.resourceId = Output.of(Objects.requireNonNull(resourceId));
            return this;
        }
        public Builder thresholdRules(@Nullable Output<List<ThresholdCustomAlertRuleArgs>> thresholdRules) {
            this.thresholdRules = thresholdRules;
            return this;
        }
        public Builder thresholdRules(@Nullable List<ThresholdCustomAlertRuleArgs> thresholdRules) {
            this.thresholdRules = Output.ofNullable(thresholdRules);
            return this;
        }
        public Builder thresholdRules(ThresholdCustomAlertRuleArgs... thresholdRules) {
            return thresholdRules(List.of(thresholdRules));
        }
        public Builder timeWindowRules(@Nullable Output<List<TimeWindowCustomAlertRuleArgs>> timeWindowRules) {
            this.timeWindowRules = timeWindowRules;
            return this;
        }
        public Builder timeWindowRules(@Nullable List<TimeWindowCustomAlertRuleArgs> timeWindowRules) {
            this.timeWindowRules = Output.ofNullable(timeWindowRules);
            return this;
        }
        public Builder timeWindowRules(TimeWindowCustomAlertRuleArgs... timeWindowRules) {
            return timeWindowRules(List.of(timeWindowRules));
        }        public DeviceSecurityGroupArgs build() {
            return new DeviceSecurityGroupArgs(allowlistRules, denylistRules, deviceSecurityGroupName, resourceId, thresholdRules, timeWindowRules);
        }
    }
}
