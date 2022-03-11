// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsBanThresholdArgs;
import io.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsArgs;
import io.pulumi.gcp.compute.inputs.SecurityPolicyRuleRateLimitOptionsRateLimitThresholdArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyRuleRateLimitOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleRateLimitOptionsArgs Empty = new SecurityPolicyRuleRateLimitOptionsArgs();

    /**
     * Can only be specified if the `action` for the rule is "rate_based_ban".
     * If specified, determines the time (in seconds) the traffic will continue to be banned by the rate limit after the rate falls below the threshold.
     * 
     */
    @InputImport(name="banDurationSec")
      private final @Nullable Output<Integer> banDurationSec;

    public Output<Integer> getBanDurationSec() {
        return this.banDurationSec == null ? Output.empty() : this.banDurationSec;
    }

    /**
     * Can only be specified if the `action` for the rule is "rate_based_ban".
     * If specified, the key will be banned for the configured 'ban_duration_sec' when the number of requests that exceed the 'rate_limit_threshold' also
     * exceed this 'ban_threshold'. Structure is documented below.
     * 
     */
    @InputImport(name="banThreshold")
      private final @Nullable Output<SecurityPolicyRuleRateLimitOptionsBanThresholdArgs> banThreshold;

    public Output<SecurityPolicyRuleRateLimitOptionsBanThresholdArgs> getBanThreshold() {
        return this.banThreshold == null ? Output.empty() : this.banThreshold;
    }

    /**
     * Action to take for requests that are under the configured rate limit threshold. Valid option is "allow" only.
     * 
     */
    @InputImport(name="conformAction", required=true)
      private final Output<String> conformAction;

    public Output<String> getConformAction() {
        return this.conformAction;
    }

    /**
     * Determines the key to enforce the rate_limit_threshold on.
     * Possible values incude "ALL", "ALL_IPS", "HTTP_HEADER", "IP", "XFF_IP". If not specified, defaults to "ALL".
     * 
     */
    @InputImport(name="enforceOnKey")
      private final @Nullable Output<String> enforceOnKey;

    public Output<String> getEnforceOnKey() {
        return this.enforceOnKey == null ? Output.empty() : this.enforceOnKey;
    }

    /**
     * Rate limit key name applicable only for HTTP_HEADER key types. Name of the HTTP header whose value is taken as the key value.
     * 
     */
    @InputImport(name="enforceOnKeyName")
      private final @Nullable Output<String> enforceOnKeyName;

    public Output<String> getEnforceOnKeyName() {
        return this.enforceOnKeyName == null ? Output.empty() : this.enforceOnKeyName;
    }

    /**
     * When a request is denied, returns the HTTP response code specified.
     * Valid options are "deny()" where valid values for status are 403, 404, 429, and 502.
     * 
     */
    @InputImport(name="exceedAction", required=true)
      private final Output<String> exceedAction;

    public Output<String> getExceedAction() {
        return this.exceedAction;
    }

    @InputImport(name="exceedRedirectOptions")
      private final @Nullable Output<SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsArgs> exceedRedirectOptions;

    public Output<SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsArgs> getExceedRedirectOptions() {
        return this.exceedRedirectOptions == null ? Output.empty() : this.exceedRedirectOptions;
    }

    /**
     * Threshold at which to begin ratelimiting. Structure is documented below.
     * 
     */
    @InputImport(name="rateLimitThreshold", required=true)
      private final Output<SecurityPolicyRuleRateLimitOptionsRateLimitThresholdArgs> rateLimitThreshold;

    public Output<SecurityPolicyRuleRateLimitOptionsRateLimitThresholdArgs> getRateLimitThreshold() {
        return this.rateLimitThreshold;
    }

    public SecurityPolicyRuleRateLimitOptionsArgs(
        @Nullable Output<Integer> banDurationSec,
        @Nullable Output<SecurityPolicyRuleRateLimitOptionsBanThresholdArgs> banThreshold,
        Output<String> conformAction,
        @Nullable Output<String> enforceOnKey,
        @Nullable Output<String> enforceOnKeyName,
        Output<String> exceedAction,
        @Nullable Output<SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsArgs> exceedRedirectOptions,
        Output<SecurityPolicyRuleRateLimitOptionsRateLimitThresholdArgs> rateLimitThreshold) {
        this.banDurationSec = banDurationSec;
        this.banThreshold = banThreshold;
        this.conformAction = Objects.requireNonNull(conformAction, "expected parameter 'conformAction' to be non-null");
        this.enforceOnKey = enforceOnKey;
        this.enforceOnKeyName = enforceOnKeyName;
        this.exceedAction = Objects.requireNonNull(exceedAction, "expected parameter 'exceedAction' to be non-null");
        this.exceedRedirectOptions = exceedRedirectOptions;
        this.rateLimitThreshold = Objects.requireNonNull(rateLimitThreshold, "expected parameter 'rateLimitThreshold' to be non-null");
    }

    private SecurityPolicyRuleRateLimitOptionsArgs() {
        this.banDurationSec = Output.empty();
        this.banThreshold = Output.empty();
        this.conformAction = Output.empty();
        this.enforceOnKey = Output.empty();
        this.enforceOnKeyName = Output.empty();
        this.exceedAction = Output.empty();
        this.exceedRedirectOptions = Output.empty();
        this.rateLimitThreshold = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecurityPolicyRuleRateLimitOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> banDurationSec;
        private @Nullable Output<SecurityPolicyRuleRateLimitOptionsBanThresholdArgs> banThreshold;
        private Output<String> conformAction;
        private @Nullable Output<String> enforceOnKey;
        private @Nullable Output<String> enforceOnKeyName;
        private Output<String> exceedAction;
        private @Nullable Output<SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsArgs> exceedRedirectOptions;
        private Output<SecurityPolicyRuleRateLimitOptionsRateLimitThresholdArgs> rateLimitThreshold;

        public Builder() {
    	      // Empty
        }

        public Builder(SecurityPolicyRuleRateLimitOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.banDurationSec = defaults.banDurationSec;
    	      this.banThreshold = defaults.banThreshold;
    	      this.conformAction = defaults.conformAction;
    	      this.enforceOnKey = defaults.enforceOnKey;
    	      this.enforceOnKeyName = defaults.enforceOnKeyName;
    	      this.exceedAction = defaults.exceedAction;
    	      this.exceedRedirectOptions = defaults.exceedRedirectOptions;
    	      this.rateLimitThreshold = defaults.rateLimitThreshold;
        }

        public Builder banDurationSec(@Nullable Output<Integer> banDurationSec) {
            this.banDurationSec = banDurationSec;
            return this;
        }

        public Builder banDurationSec(@Nullable Integer banDurationSec) {
            this.banDurationSec = Output.ofNullable(banDurationSec);
            return this;
        }

        public Builder banThreshold(@Nullable Output<SecurityPolicyRuleRateLimitOptionsBanThresholdArgs> banThreshold) {
            this.banThreshold = banThreshold;
            return this;
        }

        public Builder banThreshold(@Nullable SecurityPolicyRuleRateLimitOptionsBanThresholdArgs banThreshold) {
            this.banThreshold = Output.ofNullable(banThreshold);
            return this;
        }

        public Builder conformAction(Output<String> conformAction) {
            this.conformAction = Objects.requireNonNull(conformAction);
            return this;
        }

        public Builder conformAction(String conformAction) {
            this.conformAction = Output.of(Objects.requireNonNull(conformAction));
            return this;
        }

        public Builder enforceOnKey(@Nullable Output<String> enforceOnKey) {
            this.enforceOnKey = enforceOnKey;
            return this;
        }

        public Builder enforceOnKey(@Nullable String enforceOnKey) {
            this.enforceOnKey = Output.ofNullable(enforceOnKey);
            return this;
        }

        public Builder enforceOnKeyName(@Nullable Output<String> enforceOnKeyName) {
            this.enforceOnKeyName = enforceOnKeyName;
            return this;
        }

        public Builder enforceOnKeyName(@Nullable String enforceOnKeyName) {
            this.enforceOnKeyName = Output.ofNullable(enforceOnKeyName);
            return this;
        }

        public Builder exceedAction(Output<String> exceedAction) {
            this.exceedAction = Objects.requireNonNull(exceedAction);
            return this;
        }

        public Builder exceedAction(String exceedAction) {
            this.exceedAction = Output.of(Objects.requireNonNull(exceedAction));
            return this;
        }

        public Builder exceedRedirectOptions(@Nullable Output<SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsArgs> exceedRedirectOptions) {
            this.exceedRedirectOptions = exceedRedirectOptions;
            return this;
        }

        public Builder exceedRedirectOptions(@Nullable SecurityPolicyRuleRateLimitOptionsExceedRedirectOptionsArgs exceedRedirectOptions) {
            this.exceedRedirectOptions = Output.ofNullable(exceedRedirectOptions);
            return this;
        }

        public Builder rateLimitThreshold(Output<SecurityPolicyRuleRateLimitOptionsRateLimitThresholdArgs> rateLimitThreshold) {
            this.rateLimitThreshold = Objects.requireNonNull(rateLimitThreshold);
            return this;
        }

        public Builder rateLimitThreshold(SecurityPolicyRuleRateLimitOptionsRateLimitThresholdArgs rateLimitThreshold) {
            this.rateLimitThreshold = Output.of(Objects.requireNonNull(rateLimitThreshold));
            return this;
        }
        public SecurityPolicyRuleRateLimitOptionsArgs build() {
            return new SecurityPolicyRuleRateLimitOptionsArgs(banDurationSec, banThreshold, conformAction, enforceOnKey, enforceOnKeyName, exceedAction, exceedRedirectOptions, rateLimitThreshold);
        }
    }
}
