// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.TerminateNotificationProfileResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ScheduledEventsProfileResponse {
    private final @Nullable TerminateNotificationProfileResponse terminateNotificationProfile;

    @OutputCustomType.Constructor({"terminateNotificationProfile"})
    private ScheduledEventsProfileResponse(@Nullable TerminateNotificationProfileResponse terminateNotificationProfile) {
        this.terminateNotificationProfile = terminateNotificationProfile;
    }

    public Optional<TerminateNotificationProfileResponse> getTerminateNotificationProfile() {
        return Optional.ofNullable(this.terminateNotificationProfile);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScheduledEventsProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable TerminateNotificationProfileResponse terminateNotificationProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(ScheduledEventsProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.terminateNotificationProfile = defaults.terminateNotificationProfile;
        }

        public Builder setTerminateNotificationProfile(@Nullable TerminateNotificationProfileResponse terminateNotificationProfile) {
            this.terminateNotificationProfile = terminateNotificationProfile;
            return this;
        }

        public ScheduledEventsProfileResponse build() {
            return new ScheduledEventsProfileResponse(terminateNotificationProfile);
        }
    }
}
