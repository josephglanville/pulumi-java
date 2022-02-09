// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.iotsecurity;

import io.pulumi.azurenative.iotsecurity.enums.OnboardingKind;
import io.pulumi.azurenative.iotsecurity.inputs.DefenderSettingsPropertiesMdeIntegrationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DefenderSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final DefenderSettingArgs Empty = new DefenderSettingArgs();

    @InputImport(name="deviceQuota", required=true)
    private final Input<Integer> deviceQuota;

    public Input<Integer> getDeviceQuota() {
        return this.deviceQuota;
    }

    @InputImport(name="mdeIntegration", required=true)
    private final Input<DefenderSettingsPropertiesMdeIntegrationArgs> mdeIntegration;

    public Input<DefenderSettingsPropertiesMdeIntegrationArgs> getMdeIntegration() {
        return this.mdeIntegration;
    }

    @InputImport(name="onboardingKind", required=true)
    private final Input<Either<String,OnboardingKind>> onboardingKind;

    public Input<Either<String,OnboardingKind>> getOnboardingKind() {
        return this.onboardingKind;
    }

    @InputImport(name="sentinelWorkspaceResourceIds", required=true)
    private final Input<List<String>> sentinelWorkspaceResourceIds;

    public Input<List<String>> getSentinelWorkspaceResourceIds() {
        return this.sentinelWorkspaceResourceIds;
    }

    public DefenderSettingArgs(
        Input<Integer> deviceQuota,
        Input<DefenderSettingsPropertiesMdeIntegrationArgs> mdeIntegration,
        Input<Either<String,OnboardingKind>> onboardingKind,
        Input<List<String>> sentinelWorkspaceResourceIds) {
        this.deviceQuota = Objects.requireNonNull(deviceQuota, "expected parameter 'deviceQuota' to be non-null");
        this.mdeIntegration = Objects.requireNonNull(mdeIntegration, "expected parameter 'mdeIntegration' to be non-null");
        this.onboardingKind = Objects.requireNonNull(onboardingKind, "expected parameter 'onboardingKind' to be non-null");
        this.sentinelWorkspaceResourceIds = Objects.requireNonNull(sentinelWorkspaceResourceIds, "expected parameter 'sentinelWorkspaceResourceIds' to be non-null");
    }

    private DefenderSettingArgs() {
        this.deviceQuota = Input.empty();
        this.mdeIntegration = Input.empty();
        this.onboardingKind = Input.empty();
        this.sentinelWorkspaceResourceIds = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DefenderSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> deviceQuota;
        private Input<DefenderSettingsPropertiesMdeIntegrationArgs> mdeIntegration;
        private Input<Either<String,OnboardingKind>> onboardingKind;
        private Input<List<String>> sentinelWorkspaceResourceIds;

        public Builder() {
    	      // Empty
        }

        public Builder(DefenderSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceQuota = defaults.deviceQuota;
    	      this.mdeIntegration = defaults.mdeIntegration;
    	      this.onboardingKind = defaults.onboardingKind;
    	      this.sentinelWorkspaceResourceIds = defaults.sentinelWorkspaceResourceIds;
        }

        public Builder setDeviceQuota(Input<Integer> deviceQuota) {
            this.deviceQuota = Objects.requireNonNull(deviceQuota);
            return this;
        }

        public Builder setDeviceQuota(Integer deviceQuota) {
            this.deviceQuota = Input.of(Objects.requireNonNull(deviceQuota));
            return this;
        }

        public Builder setMdeIntegration(Input<DefenderSettingsPropertiesMdeIntegrationArgs> mdeIntegration) {
            this.mdeIntegration = Objects.requireNonNull(mdeIntegration);
            return this;
        }

        public Builder setMdeIntegration(DefenderSettingsPropertiesMdeIntegrationArgs mdeIntegration) {
            this.mdeIntegration = Input.of(Objects.requireNonNull(mdeIntegration));
            return this;
        }

        public Builder setOnboardingKind(Input<Either<String,OnboardingKind>> onboardingKind) {
            this.onboardingKind = Objects.requireNonNull(onboardingKind);
            return this;
        }

        public Builder setOnboardingKind(Either<String,OnboardingKind> onboardingKind) {
            this.onboardingKind = Input.of(Objects.requireNonNull(onboardingKind));
            return this;
        }

        public Builder setSentinelWorkspaceResourceIds(Input<List<String>> sentinelWorkspaceResourceIds) {
            this.sentinelWorkspaceResourceIds = Objects.requireNonNull(sentinelWorkspaceResourceIds);
            return this;
        }

        public Builder setSentinelWorkspaceResourceIds(List<String> sentinelWorkspaceResourceIds) {
            this.sentinelWorkspaceResourceIds = Input.of(Objects.requireNonNull(sentinelWorkspaceResourceIds));
            return this;
        }

        public DefenderSettingArgs build() {
            return new DefenderSettingArgs(deviceQuota, mdeIntegration, onboardingKind, sentinelWorkspaceResourceIds);
        }
    }
}
