// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Waas.outputs.PolicyWafConfigDeviceFingerprintChallengeChallengeSettings;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyWafConfigDeviceFingerprintChallenge {
    /**
     * @return (Updatable) The action to take against requests from detected bots. If unspecified, defaults to `DETECT`.
     * 
     */
    private final @Nullable String action;
    /**
     * @return (Updatable) The number of seconds between challenges from the same IP address. If unspecified, defaults to `60`.
     * 
     */
    private final @Nullable Integer actionExpirationInSeconds;
    /**
     * @return (Updatable) The challenge settings if `action` is set to `BLOCK`.
     * 
     */
    private final @Nullable PolicyWafConfigDeviceFingerprintChallengeChallengeSettings challengeSettings;
    /**
     * @return (Updatable) The number of failed requests before taking action. If unspecified, defaults to `10`.
     * 
     */
    private final @Nullable Integer failureThreshold;
    /**
     * @return (Updatable) The number of seconds before the failure threshold resets. If unspecified, defaults to  `60`.
     * 
     */
    private final @Nullable Integer failureThresholdExpirationInSeconds;
    /**
     * @return (Updatable) Enables or disables the JavaScript challenge Web Application Firewall feature.
     * 
     */
    private final Boolean isEnabled;
    /**
     * @return (Updatable) The maximum number of IP addresses permitted with the same device fingerprint. If unspecified, defaults to `20`.
     * 
     */
    private final @Nullable Integer maxAddressCount;
    /**
     * @return (Updatable) The number of seconds before the maximum addresses count resets. If unspecified, defaults to `60`.
     * 
     */
    private final @Nullable Integer maxAddressCountExpirationInSeconds;

    @CustomType.Constructor
    private PolicyWafConfigDeviceFingerprintChallenge(
        @CustomType.Parameter("action") @Nullable String action,
        @CustomType.Parameter("actionExpirationInSeconds") @Nullable Integer actionExpirationInSeconds,
        @CustomType.Parameter("challengeSettings") @Nullable PolicyWafConfigDeviceFingerprintChallengeChallengeSettings challengeSettings,
        @CustomType.Parameter("failureThreshold") @Nullable Integer failureThreshold,
        @CustomType.Parameter("failureThresholdExpirationInSeconds") @Nullable Integer failureThresholdExpirationInSeconds,
        @CustomType.Parameter("isEnabled") Boolean isEnabled,
        @CustomType.Parameter("maxAddressCount") @Nullable Integer maxAddressCount,
        @CustomType.Parameter("maxAddressCountExpirationInSeconds") @Nullable Integer maxAddressCountExpirationInSeconds) {
        this.action = action;
        this.actionExpirationInSeconds = actionExpirationInSeconds;
        this.challengeSettings = challengeSettings;
        this.failureThreshold = failureThreshold;
        this.failureThresholdExpirationInSeconds = failureThresholdExpirationInSeconds;
        this.isEnabled = isEnabled;
        this.maxAddressCount = maxAddressCount;
        this.maxAddressCountExpirationInSeconds = maxAddressCountExpirationInSeconds;
    }

    /**
     * @return (Updatable) The action to take against requests from detected bots. If unspecified, defaults to `DETECT`.
     * 
     */
    public Optional<String> action() {
        return Optional.ofNullable(this.action);
    }
    /**
     * @return (Updatable) The number of seconds between challenges from the same IP address. If unspecified, defaults to `60`.
     * 
     */
    public Optional<Integer> actionExpirationInSeconds() {
        return Optional.ofNullable(this.actionExpirationInSeconds);
    }
    /**
     * @return (Updatable) The challenge settings if `action` is set to `BLOCK`.
     * 
     */
    public Optional<PolicyWafConfigDeviceFingerprintChallengeChallengeSettings> challengeSettings() {
        return Optional.ofNullable(this.challengeSettings);
    }
    /**
     * @return (Updatable) The number of failed requests before taking action. If unspecified, defaults to `10`.
     * 
     */
    public Optional<Integer> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }
    /**
     * @return (Updatable) The number of seconds before the failure threshold resets. If unspecified, defaults to  `60`.
     * 
     */
    public Optional<Integer> failureThresholdExpirationInSeconds() {
        return Optional.ofNullable(this.failureThresholdExpirationInSeconds);
    }
    /**
     * @return (Updatable) Enables or disables the JavaScript challenge Web Application Firewall feature.
     * 
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    /**
     * @return (Updatable) The maximum number of IP addresses permitted with the same device fingerprint. If unspecified, defaults to `20`.
     * 
     */
    public Optional<Integer> maxAddressCount() {
        return Optional.ofNullable(this.maxAddressCount);
    }
    /**
     * @return (Updatable) The number of seconds before the maximum addresses count resets. If unspecified, defaults to `60`.
     * 
     */
    public Optional<Integer> maxAddressCountExpirationInSeconds() {
        return Optional.ofNullable(this.maxAddressCountExpirationInSeconds);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyWafConfigDeviceFingerprintChallenge defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private @Nullable Integer actionExpirationInSeconds;
        private @Nullable PolicyWafConfigDeviceFingerprintChallengeChallengeSettings challengeSettings;
        private @Nullable Integer failureThreshold;
        private @Nullable Integer failureThresholdExpirationInSeconds;
        private Boolean isEnabled;
        private @Nullable Integer maxAddressCount;
        private @Nullable Integer maxAddressCountExpirationInSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyWafConfigDeviceFingerprintChallenge defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.actionExpirationInSeconds = defaults.actionExpirationInSeconds;
    	      this.challengeSettings = defaults.challengeSettings;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.failureThresholdExpirationInSeconds = defaults.failureThresholdExpirationInSeconds;
    	      this.isEnabled = defaults.isEnabled;
    	      this.maxAddressCount = defaults.maxAddressCount;
    	      this.maxAddressCountExpirationInSeconds = defaults.maxAddressCountExpirationInSeconds;
        }

        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        public Builder actionExpirationInSeconds(@Nullable Integer actionExpirationInSeconds) {
            this.actionExpirationInSeconds = actionExpirationInSeconds;
            return this;
        }
        public Builder challengeSettings(@Nullable PolicyWafConfigDeviceFingerprintChallengeChallengeSettings challengeSettings) {
            this.challengeSettings = challengeSettings;
            return this;
        }
        public Builder failureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Builder failureThresholdExpirationInSeconds(@Nullable Integer failureThresholdExpirationInSeconds) {
            this.failureThresholdExpirationInSeconds = failureThresholdExpirationInSeconds;
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder maxAddressCount(@Nullable Integer maxAddressCount) {
            this.maxAddressCount = maxAddressCount;
            return this;
        }
        public Builder maxAddressCountExpirationInSeconds(@Nullable Integer maxAddressCountExpirationInSeconds) {
            this.maxAddressCountExpirationInSeconds = maxAddressCountExpirationInSeconds;
            return this;
        }        public PolicyWafConfigDeviceFingerprintChallenge build() {
            return new PolicyWafConfigDeviceFingerprintChallenge(action, actionExpirationInSeconds, challengeSettings, failureThreshold, failureThresholdExpirationInSeconds, isEnabled, maxAddressCount, maxAddressCountExpirationInSeconds);
        }
    }
}
