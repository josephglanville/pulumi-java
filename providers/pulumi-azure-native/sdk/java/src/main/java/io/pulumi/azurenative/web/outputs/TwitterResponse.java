// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web.outputs;

import io.pulumi.azurenative.web.outputs.TwitterRegistrationResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TwitterResponse {
    private final @Nullable Boolean enabled;
    private final @Nullable TwitterRegistrationResponse registration;

    @OutputCustomType.Constructor({"enabled","registration"})
    private TwitterResponse(
        @Nullable Boolean enabled,
        @Nullable TwitterRegistrationResponse registration) {
        this.enabled = enabled;
        this.registration = registration;
    }

    public Optional<Boolean> getEnabled() {
        return Optional.ofNullable(this.enabled);
    }
    public Optional<TwitterRegistrationResponse> getRegistration() {
        return Optional.ofNullable(this.registration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TwitterResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean enabled;
        private @Nullable TwitterRegistrationResponse registration;

        public Builder() {
    	      // Empty
        }

        public Builder(TwitterResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.registration = defaults.registration;
        }

        public Builder setEnabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }

        public Builder setRegistration(@Nullable TwitterRegistrationResponse registration) {
            this.registration = registration;
            return this;
        }

        public TwitterResponse build() {
            return new TwitterResponse(enabled, registration);
        }
    }
}
