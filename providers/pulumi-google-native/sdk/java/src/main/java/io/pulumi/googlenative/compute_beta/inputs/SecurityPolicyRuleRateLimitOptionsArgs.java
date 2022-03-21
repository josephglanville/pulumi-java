// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_beta.enums.SecurityPolicyRuleRateLimitOptionsEnforceOnKey;
import io.pulumi.googlenative.compute_beta.inputs.SecurityPolicyRuleRateLimitOptionsThresholdArgs;
import io.pulumi.googlenative.compute_beta.inputs.SecurityPolicyRuleRedirectOptionsArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SecurityPolicyRuleRateLimitOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecurityPolicyRuleRateLimitOptionsArgs Empty = new SecurityPolicyRuleRateLimitOptionsArgs();

    /**
     * Can only be specified if the action for the rule is "rate_based_ban". If specified, determines the time (in seconds) the traffic will continue to be banned by the rate limit after the rate falls below the threshold.
     * 
     */
    @Import(name="banDurationSec")
      private final @Nullable Output<Integer> banDurationSec;

    public Output<Integer> getBanDurationSec() {
        return this.banDurationSec == null ? Output.empty() : this.banDurationSec;
    }

    /**
     * Can only be specified if the action for the rule is "rate_based_ban". If specified, the key will be banned for the configured 'ban_duration_sec' when the number of requests that exceed the 'rate_limit_threshold' also exceed this 'ban_threshold'.
     * 
     */
    @Import(name="banThreshold")
      private final @Nullable Output<SecurityPolicyRuleRateLimitOptionsThresholdArgs> banThreshold;

    public Output<SecurityPolicyRuleRateLimitOptionsThresholdArgs> getBanThreshold() {
        return this.banThreshold == null ? Output.empty() : this.banThreshold;
    }

    /**
     * Action to take for requests that are under the configured rate limit threshold. Valid option is "allow" only.
     * 
     */
    @Import(name="conformAction")
      private final @Nullable Output<String> conformAction;

    public Output<String> getConformAction() {
        return this.conformAction == null ? Output.empty() : this.conformAction;
    }

    /**
     * Determines the key to enforce the rate_limit_threshold on. Possible values are: - ALL: A single rate limit threshold is applied to all the requests matching this rule. This is the default value if this field 'enforce_on_key' is not configured. - IP: The source IP address of the request is the key. Each IP has this limit enforced separately. - HTTP_HEADER: The value of the HTTP header whose name is configured under "enforce_on_key_name". The key value is truncated to the first 128 bytes of the header value. If no such header is present in the request, the key type defaults to ALL. - XFF_IP: The first IP address (i.e. the originating client IP address) specified in the list of IPs under X-Forwarded-For HTTP header. If no such header is present or the value is not a valid IP, the key type defaults to ALL. - HTTP_COOKIE: The value of the HTTP cookie whose name is configured under "enforce_on_key_name". The key value is truncated to the first 128 bytes of the cookie value. If no such cookie is present in the request, the key type defaults to ALL.
     * 
     */
    @Import(name="enforceOnKey")
      private final @Nullable Output<SecurityPolicyRuleRateLimitOptionsEnforceOnKey> enforceOnKey;

    public Output<SecurityPolicyRuleRateLimitOptionsEnforceOnKey> getEnforceOnKey() {
        return this.enforceOnKey == null ? Output.empty() : this.enforceOnKey;
    }

    /**
     * Rate limit key name applicable only for the following key types: HTTP_HEADER -- Name of the HTTP header whose value is taken as the key value. HTTP_COOKIE -- Name of the HTTP cookie whose value is taken as the key value.
     * 
     */
    @Import(name="enforceOnKeyName")
      private final @Nullable Output<String> enforceOnKeyName;

    public Output<String> getEnforceOnKeyName() {
        return this.enforceOnKeyName == null ? Output.empty() : this.enforceOnKeyName;
    }

    /**
     * Action to take for requests that are above the configured rate limit threshold, to either deny with a specified HTTP response code, or redirect to a different endpoint. Valid options are "deny()" where valid values for status are 403, 404, 429, and 502, and "redirect" where the redirect parameters come from exceed_redirect_options below.
     * 
     */
    @Import(name="exceedAction")
      private final @Nullable Output<String> exceedAction;

    public Output<String> getExceedAction() {
        return this.exceedAction == null ? Output.empty() : this.exceedAction;
    }

    /**
     * Parameters defining the redirect action that is used as the exceed action. Cannot be specified if the exceed action is not redirect.
     * 
     */
    @Import(name="exceedRedirectOptions")
      private final @Nullable Output<SecurityPolicyRuleRedirectOptionsArgs> exceedRedirectOptions;

    public Output<SecurityPolicyRuleRedirectOptionsArgs> getExceedRedirectOptions() {
        return this.exceedRedirectOptions == null ? Output.empty() : this.exceedRedirectOptions;
    }

    /**
     * Threshold at which to begin ratelimiting.
     * 
     */
    @Import(name="rateLimitThreshold")
      private final @Nullable Output<SecurityPolicyRuleRateLimitOptionsThresholdArgs> rateLimitThreshold;

    public Output<SecurityPolicyRuleRateLimitOptionsThresholdArgs> getRateLimitThreshold() {
        return this.rateLimitThreshold == null ? Output.empty() : this.rateLimitThreshold;
    }

    public SecurityPolicyRuleRateLimitOptionsArgs(
        @Nullable Output<Integer> banDurationSec,
        @Nullable Output<SecurityPolicyRuleRateLimitOptionsThresholdArgs> banThreshold,
        @Nullable Output<String> conformAction,
        @Nullable Output<SecurityPolicyRuleRateLimitOptionsEnforceOnKey> enforceOnKey,
        @Nullable Output<String> enforceOnKeyName,
        @Nullable Output<String> exceedAction,
        @Nullable Output<SecurityPolicyRuleRedirectOptionsArgs> exceedRedirectOptions,
        @Nullable Output<SecurityPolicyRuleRateLimitOptionsThresholdArgs> rateLimitThreshold) {
        this.banDurationSec = banDurationSec;
        this.banThreshold = banThreshold;
        this.conformAction = conformAction;
        this.enforceOnKey = enforceOnKey;
        this.enforceOnKeyName = enforceOnKeyName;
        this.exceedAction = exceedAction;
        this.exceedRedirectOptions = exceedRedirectOptions;
        this.rateLimitThreshold = rateLimitThreshold;
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
        private @Nullable Output<SecurityPolicyRuleRateLimitOptionsThresholdArgs> banThreshold;
        private @Nullable Output<String> conformAction;
        private @Nullable Output<SecurityPolicyRuleRateLimitOptionsEnforceOnKey> enforceOnKey;
        private @Nullable Output<String> enforceOnKeyName;
        private @Nullable Output<String> exceedAction;
        private @Nullable Output<SecurityPolicyRuleRedirectOptionsArgs> exceedRedirectOptions;
        private @Nullable Output<SecurityPolicyRuleRateLimitOptionsThresholdArgs> rateLimitThreshold;

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
        public Builder banThreshold(@Nullable Output<SecurityPolicyRuleRateLimitOptionsThresholdArgs> banThreshold) {
            this.banThreshold = banThreshold;
            return this;
        }
        public Builder banThreshold(@Nullable SecurityPolicyRuleRateLimitOptionsThresholdArgs banThreshold) {
            this.banThreshold = Output.ofNullable(banThreshold);
            return this;
        }
        public Builder conformAction(@Nullable Output<String> conformAction) {
            this.conformAction = conformAction;
            return this;
        }
        public Builder conformAction(@Nullable String conformAction) {
            this.conformAction = Output.ofNullable(conformAction);
            return this;
        }
        public Builder enforceOnKey(@Nullable Output<SecurityPolicyRuleRateLimitOptionsEnforceOnKey> enforceOnKey) {
            this.enforceOnKey = enforceOnKey;
            return this;
        }
        public Builder enforceOnKey(@Nullable SecurityPolicyRuleRateLimitOptionsEnforceOnKey enforceOnKey) {
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
        public Builder exceedAction(@Nullable Output<String> exceedAction) {
            this.exceedAction = exceedAction;
            return this;
        }
        public Builder exceedAction(@Nullable String exceedAction) {
            this.exceedAction = Output.ofNullable(exceedAction);
            return this;
        }
        public Builder exceedRedirectOptions(@Nullable Output<SecurityPolicyRuleRedirectOptionsArgs> exceedRedirectOptions) {
            this.exceedRedirectOptions = exceedRedirectOptions;
            return this;
        }
        public Builder exceedRedirectOptions(@Nullable SecurityPolicyRuleRedirectOptionsArgs exceedRedirectOptions) {
            this.exceedRedirectOptions = Output.ofNullable(exceedRedirectOptions);
            return this;
        }
        public Builder rateLimitThreshold(@Nullable Output<SecurityPolicyRuleRateLimitOptionsThresholdArgs> rateLimitThreshold) {
            this.rateLimitThreshold = rateLimitThreshold;
            return this;
        }
        public Builder rateLimitThreshold(@Nullable SecurityPolicyRuleRateLimitOptionsThresholdArgs rateLimitThreshold) {
            this.rateLimitThreshold = Output.ofNullable(rateLimitThreshold);
            return this;
        }        public SecurityPolicyRuleRateLimitOptionsArgs build() {
            return new SecurityPolicyRuleRateLimitOptionsArgs(banDurationSec, banThreshold, conformAction, enforceOnKey, enforceOnKeyName, exceedAction, exceedRedirectOptions, rateLimitThreshold);
        }
    }
}
