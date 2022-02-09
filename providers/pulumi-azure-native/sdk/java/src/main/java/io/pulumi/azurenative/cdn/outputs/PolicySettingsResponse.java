// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class PolicySettingsResponse {
    private final @Nullable String defaultCustomBlockResponseBody;
    private final @Nullable Integer defaultCustomBlockResponseStatusCode;
    private final @Nullable String defaultRedirectUrl;
    private final @Nullable String enabledState;
    private final @Nullable String mode;

    @OutputCustomType.Constructor({"defaultCustomBlockResponseBody","defaultCustomBlockResponseStatusCode","defaultRedirectUrl","enabledState","mode"})
    private PolicySettingsResponse(
        @Nullable String defaultCustomBlockResponseBody,
        @Nullable Integer defaultCustomBlockResponseStatusCode,
        @Nullable String defaultRedirectUrl,
        @Nullable String enabledState,
        @Nullable String mode) {
        this.defaultCustomBlockResponseBody = defaultCustomBlockResponseBody;
        this.defaultCustomBlockResponseStatusCode = defaultCustomBlockResponseStatusCode;
        this.defaultRedirectUrl = defaultRedirectUrl;
        this.enabledState = enabledState;
        this.mode = mode;
    }

    public Optional<String> getDefaultCustomBlockResponseBody() {
        return Optional.ofNullable(this.defaultCustomBlockResponseBody);
    }
    public Optional<Integer> getDefaultCustomBlockResponseStatusCode() {
        return Optional.ofNullable(this.defaultCustomBlockResponseStatusCode);
    }
    public Optional<String> getDefaultRedirectUrl() {
        return Optional.ofNullable(this.defaultRedirectUrl);
    }
    public Optional<String> getEnabledState() {
        return Optional.ofNullable(this.enabledState);
    }
    public Optional<String> getMode() {
        return Optional.ofNullable(this.mode);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String defaultCustomBlockResponseBody;
        private @Nullable Integer defaultCustomBlockResponseStatusCode;
        private @Nullable String defaultRedirectUrl;
        private @Nullable String enabledState;
        private @Nullable String mode;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.defaultCustomBlockResponseBody = defaults.defaultCustomBlockResponseBody;
    	      this.defaultCustomBlockResponseStatusCode = defaults.defaultCustomBlockResponseStatusCode;
    	      this.defaultRedirectUrl = defaults.defaultRedirectUrl;
    	      this.enabledState = defaults.enabledState;
    	      this.mode = defaults.mode;
        }

        public Builder setDefaultCustomBlockResponseBody(@Nullable String defaultCustomBlockResponseBody) {
            this.defaultCustomBlockResponseBody = defaultCustomBlockResponseBody;
            return this;
        }

        public Builder setDefaultCustomBlockResponseStatusCode(@Nullable Integer defaultCustomBlockResponseStatusCode) {
            this.defaultCustomBlockResponseStatusCode = defaultCustomBlockResponseStatusCode;
            return this;
        }

        public Builder setDefaultRedirectUrl(@Nullable String defaultRedirectUrl) {
            this.defaultRedirectUrl = defaultRedirectUrl;
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

        public PolicySettingsResponse build() {
            return new PolicySettingsResponse(defaultCustomBlockResponseBody, defaultCustomBlockResponseStatusCode, defaultRedirectUrl, enabledState, mode);
        }
    }
}
