// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class FrontDoorPolicySettingsResponse {
    private final @Nullable String customBlockResponseBody;
    private final @Nullable Integer customBlockResponseStatusCode;
    private final @Nullable String enabledState;
    private final @Nullable String mode;
    private final @Nullable String redirectUrl;
    private final @Nullable String requestBodyCheck;

    @OutputCustomType.Constructor({"customBlockResponseBody","customBlockResponseStatusCode","enabledState","mode","redirectUrl","requestBodyCheck"})
    private FrontDoorPolicySettingsResponse(
        @Nullable String customBlockResponseBody,
        @Nullable Integer customBlockResponseStatusCode,
        @Nullable String enabledState,
        @Nullable String mode,
        @Nullable String redirectUrl,
        @Nullable String requestBodyCheck) {
        this.customBlockResponseBody = customBlockResponseBody;
        this.customBlockResponseStatusCode = customBlockResponseStatusCode;
        this.enabledState = enabledState;
        this.mode = mode;
        this.redirectUrl = redirectUrl;
        this.requestBodyCheck = requestBodyCheck;
    }

    public Optional<String> getCustomBlockResponseBody() {
        return Optional.ofNullable(this.customBlockResponseBody);
    }
    public Optional<Integer> getCustomBlockResponseStatusCode() {
        return Optional.ofNullable(this.customBlockResponseStatusCode);
    }
    public Optional<String> getEnabledState() {
        return Optional.ofNullable(this.enabledState);
    }
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }
    public Optional<String> getRedirectUrl() {
        return Optional.ofNullable(this.redirectUrl);
    }
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

        public Builder setCustomBlockResponseBody(@Nullable String customBlockResponseBody) {
            this.customBlockResponseBody = customBlockResponseBody;
            return this;
        }

        public Builder setCustomBlockResponseStatusCode(@Nullable Integer customBlockResponseStatusCode) {
            this.customBlockResponseStatusCode = customBlockResponseStatusCode;
            return this;
        }

        public Builder setEnabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder setMode(@Nullable String mode) {
            this.mode = mode;
            return this;
        }

        public Builder setRedirectUrl(@Nullable String redirectUrl) {
            this.redirectUrl = redirectUrl;
            return this;
        }

        public Builder setRequestBodyCheck(@Nullable String requestBodyCheck) {
            this.requestBodyCheck = requestBodyCheck;
            return this;
        }

        public FrontDoorPolicySettingsResponse build() {
            return new FrontDoorPolicySettingsResponse(customBlockResponseBody, customBlockResponseStatusCode, enabledState, mode, redirectUrl, requestBodyCheck);
        }
    }
}
