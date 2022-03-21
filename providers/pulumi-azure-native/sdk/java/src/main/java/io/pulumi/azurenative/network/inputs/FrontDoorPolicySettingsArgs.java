// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.PolicyEnabledState;
import io.pulumi.azurenative.network.enums.PolicyMode;
import io.pulumi.azurenative.network.enums.PolicyRequestBodyCheck;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Defines top-level WebApplicationFirewallPolicy configuration settings.
 * 
 */
public final class FrontDoorPolicySettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final FrontDoorPolicySettingsArgs Empty = new FrontDoorPolicySettingsArgs();

    /**
     * If the action type is block, customer can override the response body. The body must be specified in base64 encoding.
     * 
     */
    @Import(name="customBlockResponseBody")
      private final @Nullable Output<String> customBlockResponseBody;

    public Output<String> getCustomBlockResponseBody() {
        return this.customBlockResponseBody == null ? Output.empty() : this.customBlockResponseBody;
    }

    /**
     * If the action type is block, customer can override the response status code.
     * 
     */
    @Import(name="customBlockResponseStatusCode")
      private final @Nullable Output<Integer> customBlockResponseStatusCode;

    public Output<Integer> getCustomBlockResponseStatusCode() {
        return this.customBlockResponseStatusCode == null ? Output.empty() : this.customBlockResponseStatusCode;
    }

    /**
     * Describes if the policy is in enabled or disabled state. Defaults to Enabled if not specified.
     * 
     */
    @Import(name="enabledState")
      private final @Nullable Output<Either<String,PolicyEnabledState>> enabledState;

    public Output<Either<String,PolicyEnabledState>> getEnabledState() {
        return this.enabledState == null ? Output.empty() : this.enabledState;
    }

    /**
     * Describes if it is in detection mode or prevention mode at policy level.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<Either<String,PolicyMode>> mode;

    public Output<Either<String,PolicyMode>> getMode() {
        return this.mode == null ? Output.empty() : this.mode;
    }

    /**
     * If action type is redirect, this field represents redirect URL for the client.
     * 
     */
    @Import(name="redirectUrl")
      private final @Nullable Output<String> redirectUrl;

    public Output<String> getRedirectUrl() {
        return this.redirectUrl == null ? Output.empty() : this.redirectUrl;
    }

    /**
     * Describes if policy managed rules will inspect the request body content.
     * 
     */
    @Import(name="requestBodyCheck")
      private final @Nullable Output<Either<String,PolicyRequestBodyCheck>> requestBodyCheck;

    public Output<Either<String,PolicyRequestBodyCheck>> getRequestBodyCheck() {
        return this.requestBodyCheck == null ? Output.empty() : this.requestBodyCheck;
    }

    public FrontDoorPolicySettingsArgs(
        @Nullable Output<String> customBlockResponseBody,
        @Nullable Output<Integer> customBlockResponseStatusCode,
        @Nullable Output<Either<String,PolicyEnabledState>> enabledState,
        @Nullable Output<Either<String,PolicyMode>> mode,
        @Nullable Output<String> redirectUrl,
        @Nullable Output<Either<String,PolicyRequestBodyCheck>> requestBodyCheck) {
        this.customBlockResponseBody = customBlockResponseBody;
        this.customBlockResponseStatusCode = customBlockResponseStatusCode;
        this.enabledState = enabledState;
        this.mode = mode;
        this.redirectUrl = redirectUrl;
        this.requestBodyCheck = requestBodyCheck;
    }

    private FrontDoorPolicySettingsArgs() {
        this.customBlockResponseBody = Output.empty();
        this.customBlockResponseStatusCode = Output.empty();
        this.enabledState = Output.empty();
        this.mode = Output.empty();
        this.redirectUrl = Output.empty();
        this.requestBodyCheck = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontDoorPolicySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> customBlockResponseBody;
        private @Nullable Output<Integer> customBlockResponseStatusCode;
        private @Nullable Output<Either<String,PolicyEnabledState>> enabledState;
        private @Nullable Output<Either<String,PolicyMode>> mode;
        private @Nullable Output<String> redirectUrl;
        private @Nullable Output<Either<String,PolicyRequestBodyCheck>> requestBodyCheck;

        public Builder() {
    	      // Empty
        }

        public Builder(FrontDoorPolicySettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customBlockResponseBody = defaults.customBlockResponseBody;
    	      this.customBlockResponseStatusCode = defaults.customBlockResponseStatusCode;
    	      this.enabledState = defaults.enabledState;
    	      this.mode = defaults.mode;
    	      this.redirectUrl = defaults.redirectUrl;
    	      this.requestBodyCheck = defaults.requestBodyCheck;
        }

        public Builder customBlockResponseBody(@Nullable Output<String> customBlockResponseBody) {
            this.customBlockResponseBody = customBlockResponseBody;
            return this;
        }
        public Builder customBlockResponseBody(@Nullable String customBlockResponseBody) {
            this.customBlockResponseBody = Output.ofNullable(customBlockResponseBody);
            return this;
        }
        public Builder customBlockResponseStatusCode(@Nullable Output<Integer> customBlockResponseStatusCode) {
            this.customBlockResponseStatusCode = customBlockResponseStatusCode;
            return this;
        }
        public Builder customBlockResponseStatusCode(@Nullable Integer customBlockResponseStatusCode) {
            this.customBlockResponseStatusCode = Output.ofNullable(customBlockResponseStatusCode);
            return this;
        }
        public Builder enabledState(@Nullable Output<Either<String,PolicyEnabledState>> enabledState) {
            this.enabledState = enabledState;
            return this;
        }
        public Builder enabledState(@Nullable Either<String,PolicyEnabledState> enabledState) {
            this.enabledState = Output.ofNullable(enabledState);
            return this;
        }
        public Builder mode(@Nullable Output<Either<String,PolicyMode>> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable Either<String,PolicyMode> mode) {
            this.mode = Output.ofNullable(mode);
            return this;
        }
        public Builder redirectUrl(@Nullable Output<String> redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public Builder redirectUrl(@Nullable String redirectUrl) {
            this.redirectUrl = Output.ofNullable(redirectUrl);
            return this;
        }
        public Builder requestBodyCheck(@Nullable Output<Either<String,PolicyRequestBodyCheck>> requestBodyCheck) {
            this.requestBodyCheck = requestBodyCheck;
            return this;
        }
        public Builder requestBodyCheck(@Nullable Either<String,PolicyRequestBodyCheck> requestBodyCheck) {
            this.requestBodyCheck = Output.ofNullable(requestBodyCheck);
            return this;
        }        public FrontDoorPolicySettingsArgs build() {
            return new FrontDoorPolicySettingsArgs(customBlockResponseBody, customBlockResponseStatusCode, enabledState, mode, redirectUrl, requestBodyCheck);
        }
    }
}
