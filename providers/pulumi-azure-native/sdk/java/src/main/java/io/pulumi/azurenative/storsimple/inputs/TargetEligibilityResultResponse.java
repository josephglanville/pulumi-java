// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.azurenative.storsimple.inputs.TargetEligibilityErrorMessageResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The eligibility result of device, as a failover target device.
 * 
 */
public final class TargetEligibilityResultResponse extends io.pulumi.resources.InvokeArgs {

    public static final TargetEligibilityResultResponse Empty = new TargetEligibilityResultResponse();

    /**
     * The eligibility status of device, as a failover target device.
     * 
     */
    @InputImport(name="eligibilityStatus")
      private final @Nullable String eligibilityStatus;

    public Optional<String> getEligibilityStatus() {
        return this.eligibilityStatus == null ? Optional.empty() : Optional.ofNullable(this.eligibilityStatus);
    }

    /**
     * The list of error messages, if a device does not qualify as a failover target device.
     * 
     */
    @InputImport(name="messages")
      private final @Nullable List<TargetEligibilityErrorMessageResponse> messages;

    public List<TargetEligibilityErrorMessageResponse> getMessages() {
        return this.messages == null ? List.of() : this.messages;
    }

    public TargetEligibilityResultResponse(
        @Nullable String eligibilityStatus,
        @Nullable List<TargetEligibilityErrorMessageResponse> messages) {
        this.eligibilityStatus = eligibilityStatus;
        this.messages = messages;
    }

    private TargetEligibilityResultResponse() {
        this.eligibilityStatus = null;
        this.messages = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TargetEligibilityResultResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String eligibilityStatus;
        private @Nullable List<TargetEligibilityErrorMessageResponse> messages;

        public Builder() {
    	      // Empty
        }

        public Builder(TargetEligibilityResultResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.eligibilityStatus = defaults.eligibilityStatus;
    	      this.messages = defaults.messages;
        }

        public Builder setEligibilityStatus(@Nullable String eligibilityStatus) {
            this.eligibilityStatus = eligibilityStatus;
            return this;
        }

        public Builder setMessages(@Nullable List<TargetEligibilityErrorMessageResponse> messages) {
            this.messages = messages;
            return this;
        }
        public TargetEligibilityResultResponse build() {
            return new TargetEligibilityResultResponse(eligibilityStatus, messages);
        }
    }
}
