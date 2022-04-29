// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.Waas.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.oci.Waas.outputs.PolicyWafConfigJsChallengeChallengeSettings;
import com.pulumi.oci.Waas.outputs.PolicyWafConfigJsChallengeCriteria;
import com.pulumi.oci.Waas.outputs.PolicyWafConfigJsChallengeSetHttpHeader;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyWafConfigJsChallenge {
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
     * @return (Updatable) When enabled, redirect responses from the origin will also be challenged. This will change HTTP 301/302 responses from origin to HTTP 200 with an HTML body containing JavaScript page redirection.
     * 
     */
    private final @Nullable Boolean areRedirectsChallenged;
    /**
     * @return (Updatable) The challenge settings if `action` is set to `BLOCK`.
     * 
     */
    private final @Nullable PolicyWafConfigJsChallengeChallengeSettings challengeSettings;
    /**
     * @return (Updatable) When defined, the JavaScript Challenge would be applied only for the requests that matched all the listed conditions.
     * 
     */
    private final @Nullable List<PolicyWafConfigJsChallengeCriteria> criterias;
    /**
     * @return (Updatable) The number of failed requests before taking action. If unspecified, defaults to `10`.
     * 
     */
    private final @Nullable Integer failureThreshold;
    /**
     * @return (Updatable) Enables or disables the JavaScript challenge Web Application Firewall feature.
     * 
     */
    private final Boolean isEnabled;
    /**
     * @return (Updatable) When enabled, the user is identified not only by the IP address but also by an unique additional hash, which prevents blocking visitors with shared IP addresses.
     * 
     */
    private final @Nullable Boolean isNatEnabled;
    /**
     * @return (Updatable) Adds an additional HTTP header to requests that fail the challenge before being passed to the origin. Only applicable when the `action` is set to `DETECT`.
     * 
     */
    private final @Nullable PolicyWafConfigJsChallengeSetHttpHeader setHttpHeader;

    @CustomType.Constructor
    private PolicyWafConfigJsChallenge(
        @CustomType.Parameter("action") @Nullable String action,
        @CustomType.Parameter("actionExpirationInSeconds") @Nullable Integer actionExpirationInSeconds,
        @CustomType.Parameter("areRedirectsChallenged") @Nullable Boolean areRedirectsChallenged,
        @CustomType.Parameter("challengeSettings") @Nullable PolicyWafConfigJsChallengeChallengeSettings challengeSettings,
        @CustomType.Parameter("criterias") @Nullable List<PolicyWafConfigJsChallengeCriteria> criterias,
        @CustomType.Parameter("failureThreshold") @Nullable Integer failureThreshold,
        @CustomType.Parameter("isEnabled") Boolean isEnabled,
        @CustomType.Parameter("isNatEnabled") @Nullable Boolean isNatEnabled,
        @CustomType.Parameter("setHttpHeader") @Nullable PolicyWafConfigJsChallengeSetHttpHeader setHttpHeader) {
        this.action = action;
        this.actionExpirationInSeconds = actionExpirationInSeconds;
        this.areRedirectsChallenged = areRedirectsChallenged;
        this.challengeSettings = challengeSettings;
        this.criterias = criterias;
        this.failureThreshold = failureThreshold;
        this.isEnabled = isEnabled;
        this.isNatEnabled = isNatEnabled;
        this.setHttpHeader = setHttpHeader;
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
     * @return (Updatable) When enabled, redirect responses from the origin will also be challenged. This will change HTTP 301/302 responses from origin to HTTP 200 with an HTML body containing JavaScript page redirection.
     * 
     */
    public Optional<Boolean> areRedirectsChallenged() {
        return Optional.ofNullable(this.areRedirectsChallenged);
    }
    /**
     * @return (Updatable) The challenge settings if `action` is set to `BLOCK`.
     * 
     */
    public Optional<PolicyWafConfigJsChallengeChallengeSettings> challengeSettings() {
        return Optional.ofNullable(this.challengeSettings);
    }
    /**
     * @return (Updatable) When defined, the JavaScript Challenge would be applied only for the requests that matched all the listed conditions.
     * 
     */
    public List<PolicyWafConfigJsChallengeCriteria> criterias() {
        return this.criterias == null ? List.of() : this.criterias;
    }
    /**
     * @return (Updatable) The number of failed requests before taking action. If unspecified, defaults to `10`.
     * 
     */
    public Optional<Integer> failureThreshold() {
        return Optional.ofNullable(this.failureThreshold);
    }
    /**
     * @return (Updatable) Enables or disables the JavaScript challenge Web Application Firewall feature.
     * 
     */
    public Boolean isEnabled() {
        return this.isEnabled;
    }
    /**
     * @return (Updatable) When enabled, the user is identified not only by the IP address but also by an unique additional hash, which prevents blocking visitors with shared IP addresses.
     * 
     */
    public Optional<Boolean> isNatEnabled() {
        return Optional.ofNullable(this.isNatEnabled);
    }
    /**
     * @return (Updatable) Adds an additional HTTP header to requests that fail the challenge before being passed to the origin. Only applicable when the `action` is set to `DETECT`.
     * 
     */
    public Optional<PolicyWafConfigJsChallengeSetHttpHeader> setHttpHeader() {
        return Optional.ofNullable(this.setHttpHeader);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyWafConfigJsChallenge defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String action;
        private @Nullable Integer actionExpirationInSeconds;
        private @Nullable Boolean areRedirectsChallenged;
        private @Nullable PolicyWafConfigJsChallengeChallengeSettings challengeSettings;
        private @Nullable List<PolicyWafConfigJsChallengeCriteria> criterias;
        private @Nullable Integer failureThreshold;
        private Boolean isEnabled;
        private @Nullable Boolean isNatEnabled;
        private @Nullable PolicyWafConfigJsChallengeSetHttpHeader setHttpHeader;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyWafConfigJsChallenge defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.action = defaults.action;
    	      this.actionExpirationInSeconds = defaults.actionExpirationInSeconds;
    	      this.areRedirectsChallenged = defaults.areRedirectsChallenged;
    	      this.challengeSettings = defaults.challengeSettings;
    	      this.criterias = defaults.criterias;
    	      this.failureThreshold = defaults.failureThreshold;
    	      this.isEnabled = defaults.isEnabled;
    	      this.isNatEnabled = defaults.isNatEnabled;
    	      this.setHttpHeader = defaults.setHttpHeader;
        }

        public Builder action(@Nullable String action) {
            this.action = action;
            return this;
        }
        public Builder actionExpirationInSeconds(@Nullable Integer actionExpirationInSeconds) {
            this.actionExpirationInSeconds = actionExpirationInSeconds;
            return this;
        }
        public Builder areRedirectsChallenged(@Nullable Boolean areRedirectsChallenged) {
            this.areRedirectsChallenged = areRedirectsChallenged;
            return this;
        }
        public Builder challengeSettings(@Nullable PolicyWafConfigJsChallengeChallengeSettings challengeSettings) {
            this.challengeSettings = challengeSettings;
            return this;
        }
        public Builder criterias(@Nullable List<PolicyWafConfigJsChallengeCriteria> criterias) {
            this.criterias = criterias;
            return this;
        }
        public Builder criterias(PolicyWafConfigJsChallengeCriteria... criterias) {
            return criterias(List.of(criterias));
        }
        public Builder failureThreshold(@Nullable Integer failureThreshold) {
            this.failureThreshold = failureThreshold;
            return this;
        }
        public Builder isEnabled(Boolean isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }
        public Builder isNatEnabled(@Nullable Boolean isNatEnabled) {
            this.isNatEnabled = isNatEnabled;
            return this;
        }
        public Builder setHttpHeader(@Nullable PolicyWafConfigJsChallengeSetHttpHeader setHttpHeader) {
            this.setHttpHeader = setHttpHeader;
            return this;
        }        public PolicyWafConfigJsChallenge build() {
            return new PolicyWafConfigJsChallenge(action, actionExpirationInSeconds, areRedirectsChallenged, challengeSettings, criterias, failureThreshold, isEnabled, isNatEnabled, setHttpHeader);
        }
    }
}
