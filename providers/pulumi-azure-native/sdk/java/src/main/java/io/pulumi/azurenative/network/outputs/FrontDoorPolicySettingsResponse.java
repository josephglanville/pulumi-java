// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FrontDoorPolicySettingsResponse {
    /**
     * If the action type is block, customer can override the response body. The body must be specified in base64 encoding.
     * 
     */
    private final @Nullable String customBlockResponseBody;
    /**
     * If the action type is block, customer can override the response status code.
     * 
     */
    private final @Nullable Integer customBlockResponseStatusCode;
    /**
     * Describes if the policy is in enabled or disabled state. Defaults to Enabled if not specified.
     * 
     */
    private final @Nullable String enabledState;
    /**
     * Describes if it is in detection mode or prevention mode at policy level.
     * 
     */
    private final @Nullable String mode;
    /**
     * If action type is redirect, this field represents redirect URL for the client.
     * 
     */
    private final @Nullable String redirectUrl;
    /**
     * Describes if policy managed rules will inspect the request body content.
     * 
     */
    private final @Nullable String requestBodyCheck;

    @CustomType.Constructor
    private FrontDoorPolicySettingsResponse(
        @CustomType.Parameter("customBlockResponseBody") @Nullable String customBlockResponseBody,
        @CustomType.Parameter("customBlockResponseStatusCode") @Nullable Integer customBlockResponseStatusCode,
        @CustomType.Parameter("enabledState") @Nullable String enabledState,
        @CustomType.Parameter("mode") @Nullable String mode,
        @CustomType.Parameter("redirectUrl") @Nullable String redirectUrl,
        @CustomType.Parameter("requestBodyCheck") @Nullable String requestBodyCheck) {
        this.customBlockResponseBody = customBlockResponseBody;
        this.customBlockResponseStatusCode = customBlockResponseStatusCode;
        this.enabledState = enabledState;
        this.mode = mode;
        this.redirectUrl = redirectUrl;
        this.requestBodyCheck = requestBodyCheck;
    }

    /**
     * If the action type is block, customer can override the response body. The body must be specified in base64 encoding.
     * 
    */
    public Optional<String> getCustomBlockResponseBody() {
        return Optional.ofNullable(this.customBlockResponseBody);
    }
    /**
     * If the action type is block, customer can override the response status code.
     * 
    */
    public Optional<Integer> getCustomBlockResponseStatusCode() {
        return Optional.ofNullable(this.customBlockResponseStatusCode);
    }
    /**
     * Describes if the policy is in enabled or disabled state. Defaults to Enabled if not specified.
     * 
    */
    public Optional<String> getEnabledState() {
        return Optional.ofNullable(this.enabledState);
    }
    /**
     * Describes if it is in detection mode or prevention mode at policy level.
     * 
    */
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    /**
     * If action type is redirect, this field represents redirect URL for the client.
     * 
    */
    public Optional<String> getRedirectUrl() {
        return Optional.ofNullable(this.redirectUrl);
    }
    /**
     * Describes if policy managed rules will inspect the request body content.
     * 
    */
    public Optional<String> getRequestBodyCheck() {
        return Optional.ofNullable(this.requestBodyCheck);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FrontDoorPolicySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String customBlockResponseBody;
        private @Nullable Integer customBlockResponseStatusCode;
        private @Nullable String enabledState;
        private @Nullable String mode;
        private @Nullable String redirectUrl;
        private @Nullable String requestBodyCheck;

        public Builder() {
    	      // Empty
        }

        public Builder(FrontDoorPolicySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customBlockResponseBody = defaults.customBlockResponseBody;
    	      this.customBlockResponseStatusCode = defaults.customBlockResponseStatusCode;
    	      this.enabledState = defaults.enabledState;
    	      this.mode = defaults.mode;
    	      this.redirectUrl = defaults.redirectUrl;
    	      this.requestBodyCheck = defaults.requestBodyCheck;
        }

        public Builder customBlockResponseBody(@Nullable String customBlockResponseBody) {
            this.customBlockResponseBody = customBlockResponseBody;
            return this;
        }
        public Builder customBlockResponseStatusCode(@Nullable Integer customBlockResponseStatusCode) {
            this.customBlockResponseStatusCode = customBlockResponseStatusCode;
            return this;
        }
        public Builder enabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }
        public Builder redirectUrl(@Nullable String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }
        public Builder requestBodyCheck(@Nullable String requestBodyCheck) {
            this.requestBodyCheck = requestBodyCheck;
            return this;
        }        public FrontDoorPolicySettingsResponse build() {
            return new FrontDoorPolicySettingsResponse(customBlockResponseBody, customBlockResponseStatusCode, enabledState, mode, redirectUrl, requestBodyCheck);
        }
    }
}
