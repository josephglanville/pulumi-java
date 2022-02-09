// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.outputs;

import io.pulumi.azurenative.storsimple.outputs.TargetEligibilityErrorMessageResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TargetEligibilityResultResponse {
    private final @Nullable String eligibilityStatus;
    private final @Nullable List<TargetEligibilityErrorMessageResponse> messages;

    @OutputCustomType.Constructor({"eligibilityStatus","messages"})
    private TargetEligibilityResultResponse(
        @Nullable String eligibilityStatus,
        @Nullable List<TargetEligibilityErrorMessageResponse> messages) {
        this.eligibilityStatus = eligibilityStatus;
        this.messages = messages;
    }

    public Optional<String> getEligibilityStatus() {
        return Optional.ofNullable(this.eligibilityStatus);
    }
    public List<TargetEligibilityErrorMessageResponse> getMessages() {
        return this.messages == null ? List.of() : this.messages;
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
