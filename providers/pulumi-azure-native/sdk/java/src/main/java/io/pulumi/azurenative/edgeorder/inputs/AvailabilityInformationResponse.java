// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.edgeorder.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class AvailabilityInformationResponse extends io.pulumi.resources.InvokeArgs {

    public static final AvailabilityInformationResponse Empty = new AvailabilityInformationResponse();

    @InputImport(name="availabilityStage", required=true)
    private final String availabilityStage;

    public String getAvailabilityStage() {
        return this.availabilityStage;
    }

    @InputImport(name="disabledReason", required=true)
    private final String disabledReason;

    public String getDisabledReason() {
        return this.disabledReason;
    }

    @InputImport(name="disabledReasonMessage", required=true)
    private final String disabledReasonMessage;

    public String getDisabledReasonMessage() {
        return this.disabledReasonMessage;
    }

    public AvailabilityInformationResponse(
        String availabilityStage,
        String disabledReason,
        String disabledReasonMessage) {
        this.availabilityStage = Objects.requireNonNull(availabilityStage, "expected parameter 'availabilityStage' to be non-null");
        this.disabledReason = Objects.requireNonNull(disabledReason, "expected parameter 'disabledReason' to be non-null");
        this.disabledReasonMessage = Objects.requireNonNull(disabledReasonMessage, "expected parameter 'disabledReasonMessage' to be non-null");
    }

    private AvailabilityInformationResponse() {
        this.availabilityStage = null;
        this.disabledReason = null;
        this.disabledReasonMessage = null;
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
