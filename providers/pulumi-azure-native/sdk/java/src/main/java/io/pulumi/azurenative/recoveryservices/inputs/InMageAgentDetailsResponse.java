// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The details of the InMage agent.
 * 
 */
public final class InMageAgentDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final InMageAgentDetailsResponse Empty = new InMageAgentDetailsResponse();

    /**
     * Agent expiry date.
     * 
     */
    @Import(name="agentExpiryDate")
      private final @Nullable String agentExpiryDate;

    public Optional<String> getAgentExpiryDate() {
        return this.agentExpiryDate == null ? Optional.empty() : Optional.ofNullable(this.agentExpiryDate);
    }

    /**
     * A value indicating whether installed agent needs to be updated.
     * 
     */
    @Import(name="agentUpdateStatus")
      private final @Nullable String agentUpdateStatus;

    public Optional<String> getAgentUpdateStatus() {
        return this.agentUpdateStatus == null ? Optional.empty() : Optional.ofNullable(this.agentUpdateStatus);
    }

    /**
     * The agent version.
     * 
     */
    @Import(name="agentVersion")
      private final @Nullable String agentVersion;

    public Optional<String> getAgentVersion() {
        return this.agentVersion == null ? Optional.empty() : Optional.ofNullable(this.agentVersion);
    }

    /**
     * A value indicating whether reboot is required after update is applied.
     * 
     */
    @Import(name="postUpdateRebootStatus")
      private final @Nullable String postUpdateRebootStatus;

    public Optional<String> getPostUpdateRebootStatus() {
        return this.postUpdateRebootStatus == null ? Optional.empty() : Optional.ofNullable(this.postUpdateRebootStatus);
    }

    public InMageAgentDetailsResponse(
        @Nullable String agentExpiryDate,
        @Nullable String agentUpdateStatus,
        @Nullable String agentVersion,
        @Nullable String postUpdateRebootStatus) {
        this.agentExpiryDate = agentExpiryDate;
        this.agentUpdateStatus = agentUpdateStatus;
        this.agentVersion = agentVersion;
        this.postUpdateRebootStatus = postUpdateRebootStatus;
    }

    private InMageAgentDetailsResponse() {
        this.agentExpiryDate = null;
        this.agentUpdateStatus = null;
        this.agentVersion = null;
        this.postUpdateRebootStatus = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InMageAgentDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String agentExpiryDate;
        private @Nullable String agentUpdateStatus;
        private @Nullable String agentVersion;
        private @Nullable String postUpdateRebootStatus;

        public Builder() {
    	      // Empty
        }

        public Builder(InMageAgentDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agentExpiryDate = defaults.agentExpiryDate;
    	      this.agentUpdateStatus = defaults.agentUpdateStatus;
    	      this.agentVersion = defaults.agentVersion;
    	      this.postUpdateRebootStatus = defaults.postUpdateRebootStatus;
        }

        public Builder agentExpiryDate(@Nullable String agentExpiryDate) {
            this.agentExpiryDate = agentExpiryDate;
            return this;
        }
        public Builder agentUpdateStatus(@Nullable String agentUpdateStatus) {
            this.agentUpdateStatus = agentUpdateStatus;
            return this;
        }
        public Builder agentVersion(@Nullable String agentVersion) {
            this.agentVersion = agentVersion;
            return this;
        }
        public Builder postUpdateRebootStatus(@Nullable String postUpdateRebootStatus) {
            this.postUpdateRebootStatus = postUpdateRebootStatus;
            return this;
        }        public InMageAgentDetailsResponse build() {
            return new InMageAgentDetailsResponse(agentExpiryDate, agentUpdateStatus, agentVersion, postUpdateRebootStatus);
        }
    }
}
