// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.macie;

import io.pulumi.awsnative.macie.enums.SessionFindingPublishingFrequency;
import io.pulumi.awsnative.macie.enums.SessionStatus;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SessionArgs extends io.pulumi.resources.ResourceArgs {

    public static final SessionArgs Empty = new SessionArgs();

    /**
     * A enumeration value that specifies how frequently finding updates are published.
     * 
     */
    @InputImport(name="findingPublishingFrequency")
      private final @Nullable Input<SessionFindingPublishingFrequency> findingPublishingFrequency;

    public Input<SessionFindingPublishingFrequency> getFindingPublishingFrequency() {
        return this.findingPublishingFrequency == null ? Input.empty() : this.findingPublishingFrequency;
    }

    /**
     * A enumeration value that specifies the status of the Macie Session.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Input<SessionStatus> status;

    public Input<SessionStatus> getStatus() {
        return this.status == null ? Input.empty() : this.status;
    }

    public SessionArgs(
        @Nullable Input<SessionFindingPublishingFrequency> findingPublishingFrequency,
        @Nullable Input<SessionStatus> status) {
        this.findingPublishingFrequency = findingPublishingFrequency;
        this.status = status;
    }

    private SessionArgs() {
        this.findingPublishingFrequency = Input.empty();
        this.status = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SessionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<SessionFindingPublishingFrequency> findingPublishingFrequency;
        private @Nullable Input<SessionStatus> status;

        public Builder() {
    	      // Empty
        }

        public Builder(SessionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.findingPublishingFrequency = defaults.findingPublishingFrequency;
    	      this.status = defaults.status;
        }

        public Builder setFindingPublishingFrequency(@Nullable Input<SessionFindingPublishingFrequency> findingPublishingFrequency) {
            this.findingPublishingFrequency = findingPublishingFrequency;
            return this;
        }

        public Builder setFindingPublishingFrequency(@Nullable SessionFindingPublishingFrequency findingPublishingFrequency) {
            this.findingPublishingFrequency = Input.ofNullable(findingPublishingFrequency);
            return this;
        }

        public Builder setStatus(@Nullable Input<SessionStatus> status) {
            this.status = status;
            return this;
        }

        public Builder setStatus(@Nullable SessionStatus status) {
            this.status = Input.ofNullable(status);
            return this;
        }
        public SessionArgs build() {
            return new SessionArgs(findingPublishingFrequency, status);
        }
    }
}
