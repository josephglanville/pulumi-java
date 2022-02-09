// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TelegramChannelPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final TelegramChannelPropertiesArgs Empty = new TelegramChannelPropertiesArgs();

    @InputImport(name="accessToken")
    private final @Nullable Input<String> accessToken;

    public Input<String> getAccessToken() {
        return this.accessToken == null ? Input.empty() : this.accessToken;
    }

    @InputImport(name="isEnabled", required=true)
    private final Input<Boolean> isEnabled;

    public Input<Boolean> getIsEnabled() {
        return this.isEnabled;
    }

    @InputImport(name="isValidated")
    private final @Nullable Input<Boolean> isValidated;

    public Input<Boolean> getIsValidated() {
        return this.isValidated == null ? Input.empty() : this.isValidated;
    }

    public TelegramChannelPropertiesArgs(
        @Nullable Input<String> accessToken,
        Input<Boolean> isEnabled,
        @Nullable Input<Boolean> isValidated) {
        this.accessToken = accessToken;
        this.isEnabled = Objects.requireNonNull(isEnabled, "expected parameter 'isEnabled' to be non-null");
        this.isValidated = isValidated;
    }

    private TelegramChannelPropertiesArgs() {
        this.accessToken = Input.empty();
        this.isEnabled = Input.empty();
        this.isValidated = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TelegramChannelPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> accessToken;
        private Input<Boolean> isEnabled;
        private @Nullable Input<Boolean> isValidated;

        public Builder() {
    	      // Empty
        }

        public Builder(TelegramChannelPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessToken = defaults.accessToken;
    	      this.isEnabled = defaults.isEnabled;
    	      this.isValidated = defaults.isValidated;
        }

        public Builder setAccessToken(@Nullable Input<String> accessToken) {
            this.accessToken = accessToken;
            return this;
        }

        public Builder setAccessToken(@Nullable String accessToken) {
            this.accessToken = Input.ofNullable(accessToken);
            return this;
        }

        public Builder setIsEnabled(Input<Boolean> isEnabled) {
            this.isEnabled = Objects.requireNonNull(isEnabled);
            return this;
        }

        public Builder setIsEnabled(Boolean isEnabled) {
            this.isEnabled = Input.of(Objects.requireNonNull(isEnabled));
            return this;
        }

        public Builder setIsValidated(@Nullable Input<Boolean> isValidated) {
            this.isValidated = isValidated;
            return this;
        }

        public Builder setIsValidated(@Nullable Boolean isValidated) {
            this.isValidated = Input.ofNullable(isValidated);
            return this;
        }

        public TelegramChannelPropertiesArgs build() {
            return new TelegramChannelPropertiesArgs(accessToken, isEnabled, isValidated);
        }
    }
}
