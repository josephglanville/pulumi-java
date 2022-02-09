// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class AvailabilityInformationResponse {
    private final String availabilityStage;
    private final String disabledReason;
    private final String disabledReasonMessage;

    @OutputCustomType.Constructor({"availabilityStage","disabledReason","disabledReasonMessage"})
    private AvailabilityInformationResponse(
        String availabilityStage,
        String disabledReason,
        String disabledReasonMessage) {
        this.availabilityStage = Objects.requireNonNull(availabilityStage);
        this.disabledReason = Objects.requireNonNull(disabledReason);
        this.disabledReasonMessage = Objects.requireNonNull(disabledReasonMessage);
    }

    public String getAvailabilityStage() {
        return this.availabilityStage;
    }
    public String getDisabledReason() {
        return this.disabledReason;
    }
    public String getDisabledReasonMessage() {
        return this.disabledReasonMessage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AvailabilityInformationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String availabilityStage;
        private String disabledReason;
        private String disabledReasonMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(AvailabilityInformationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityStage = defaults.availabilityStage;
    	      this.disabledReason = defaults.disabledReason;
    	      this.disabledReasonMessage = defaults.disabledReasonMessage;
        }

        public Builder setAvailabilityStage(String availabilityStage) {
            this.availabilityStage = Objects.requireNonNull(availabilityStage);
            return this;
        }

        public Builder setDisabledReason(String disabledReason) {
            this.disabledReason = Objects.requireNonNull(disabledReason);
            return this;
        }

        public Builder setDisabledReasonMessage(String disabledReasonMessage) {
            this.disabledReasonMessage = Objects.requireNonNull(disabledReasonMessage);
            return this;
        }

        public AvailabilityInformationResponse build() {
            return new AvailabilityInformationResponse(availabilityStage, disabledReason, disabledReasonMessage);
        }
    }
}
