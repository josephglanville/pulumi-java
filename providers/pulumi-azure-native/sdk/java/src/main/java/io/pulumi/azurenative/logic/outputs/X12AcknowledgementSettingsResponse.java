// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logic.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class X12AcknowledgementSettingsResponse {
    /**
     * The acknowledgement control number lower bound.
     * 
     */
    private final Integer acknowledgementControlNumberLowerBound;
    /**
     * The acknowledgement control number prefix.
     * 
     */
    private final @Nullable String acknowledgementControlNumberPrefix;
    /**
     * The acknowledgement control number suffix.
     * 
     */
    private final @Nullable String acknowledgementControlNumberSuffix;
    /**
     * The acknowledgement control number upper bound.
     * 
     */
    private final Integer acknowledgementControlNumberUpperBound;
    /**
     * The value indicating whether to batch functional acknowledgements.
     * 
     */
    private final Boolean batchFunctionalAcknowledgements;
    /**
     * The value indicating whether to batch implementation acknowledgements.
     * 
     */
    private final Boolean batchImplementationAcknowledgements;
    /**
     * The value indicating whether to batch the technical acknowledgements.
     * 
     */
    private final Boolean batchTechnicalAcknowledgements;
    /**
     * The functional acknowledgement version.
     * 
     */
    private final @Nullable String functionalAcknowledgementVersion;
    /**
     * The implementation acknowledgement version.
     * 
     */
    private final @Nullable String implementationAcknowledgementVersion;
    /**
     * The value indicating whether functional acknowledgement is needed.
     * 
     */
    private final Boolean needFunctionalAcknowledgement;
    /**
     * The value indicating whether implementation acknowledgement is needed.
     * 
     */
    private final Boolean needImplementationAcknowledgement;
    /**
     * The value indicating whether a loop is needed for valid messages.
     * 
     */
    private final Boolean needLoopForValidMessages;
    /**
     * The value indicating whether technical acknowledgement is needed.
     * 
     */
    private final Boolean needTechnicalAcknowledgement;
    /**
     * The value indicating whether to rollover acknowledgement control number.
     * 
     */
    private final Boolean rolloverAcknowledgementControlNumber;
    /**
     * The value indicating whether to send synchronous acknowledgement.
     * 
     */
    private final Boolean sendSynchronousAcknowledgement;

    @CustomType.Constructor
    private X12AcknowledgementSettingsResponse(
        @CustomType.Parameter("acknowledgementControlNumberLowerBound") Integer acknowledgementControlNumberLowerBound,
        @CustomType.Parameter("acknowledgementControlNumberPrefix") @Nullable String acknowledgementControlNumberPrefix,
        @CustomType.Parameter("acknowledgementControlNumberSuffix") @Nullable String acknowledgementControlNumberSuffix,
        @CustomType.Parameter("acknowledgementControlNumberUpperBound") Integer acknowledgementControlNumberUpperBound,
        @CustomType.Parameter("batchFunctionalAcknowledgements") Boolean batchFunctionalAcknowledgements,
        @CustomType.Parameter("batchImplementationAcknowledgements") Boolean batchImplementationAcknowledgements,
        @CustomType.Parameter("batchTechnicalAcknowledgements") Boolean batchTechnicalAcknowledgements,
        @CustomType.Parameter("functionalAcknowledgementVersion") @Nullable String functionalAcknowledgementVersion,
        @CustomType.Parameter("implementationAcknowledgementVersion") @Nullable String implementationAcknowledgementVersion,
        @CustomType.Parameter("needFunctionalAcknowledgement") Boolean needFunctionalAcknowledgement,
        @CustomType.Parameter("needImplementationAcknowledgement") Boolean needImplementationAcknowledgement,
        @CustomType.Parameter("needLoopForValidMessages") Boolean needLoopForValidMessages,
        @CustomType.Parameter("needTechnicalAcknowledgement") Boolean needTechnicalAcknowledgement,
        @CustomType.Parameter("rolloverAcknowledgementControlNumber") Boolean rolloverAcknowledgementControlNumber,
        @CustomType.Parameter("sendSynchronousAcknowledgement") Boolean sendSynchronousAcknowledgement) {
        this.acknowledgementControlNumberLowerBound = acknowledgementControlNumberLowerBound;
        this.acknowledgementControlNumberPrefix = acknowledgementControlNumberPrefix;
        this.acknowledgementControlNumberSuffix = acknowledgementControlNumberSuffix;
        this.acknowledgementControlNumberUpperBound = acknowledgementControlNumberUpperBound;
        this.batchFunctionalAcknowledgements = batchFunctionalAcknowledgements;
        this.batchImplementationAcknowledgements = batchImplementationAcknowledgements;
        this.batchTechnicalAcknowledgements = batchTechnicalAcknowledgements;
        this.functionalAcknowledgementVersion = functionalAcknowledgementVersion;
        this.implementationAcknowledgementVersion = implementationAcknowledgementVersion;
        this.needFunctionalAcknowledgement = needFunctionalAcknowledgement;
        this.needImplementationAcknowledgement = needImplementationAcknowledgement;
        this.needLoopForValidMessages = needLoopForValidMessages;
        this.needTechnicalAcknowledgement = needTechnicalAcknowledgement;
        this.rolloverAcknowledgementControlNumber = rolloverAcknowledgementControlNumber;
        this.sendSynchronousAcknowledgement = sendSynchronousAcknowledgement;
    }

    /**
     * The acknowledgement control number lower bound.
     * 
    */
    public Integer getAcknowledgementControlNumberLowerBound() {
        return this.acknowledgementControlNumberLowerBound;
    }
    /**
     * The acknowledgement control number prefix.
     * 
    */
    public Optional<String> getAcknowledgementControlNumberPrefix() {
        return Optional.ofNullable(this.acknowledgementControlNumberPrefix);
    }
    /**
     * The acknowledgement control number suffix.
     * 
    */
    public Optional<String> getAcknowledgementControlNumberSuffix() {
        return Optional.ofNullable(this.acknowledgementControlNumberSuffix);
    }
    /**
     * The acknowledgement control number upper bound.
     * 
    */
    public Integer getAcknowledgementControlNumberUpperBound() {
        return this.acknowledgementControlNumberUpperBound;
    }
    /**
     * The value indicating whether to batch functional acknowledgements.
     * 
    */
    public Boolean getBatchFunctionalAcknowledgements() {
        return this.batchFunctionalAcknowledgements;
    }
    /**
     * The value indicating whether to batch implementation acknowledgements.
     * 
    */
    public Boolean getBatchImplementationAcknowledgements() {
        return this.batchImplementationAcknowledgements;
    }
    /**
     * The value indicating whether to batch the technical acknowledgements.
     * 
    */
    public Boolean getBatchTechnicalAcknowledgements() {
        return this.batchTechnicalAcknowledgements;
    }
    /**
     * The functional acknowledgement version.
     * 
    */
    public Optional<String> getFunctionalAcknowledgementVersion() {
        return Optional.ofNullable(this.functionalAcknowledgementVersion);
    }
    /**
     * The implementation acknowledgement version.
     * 
    */
    public Optional<String> getImplementationAcknowledgementVersion() {
        return Optional.ofNullable(this.implementationAcknowledgementVersion);
    }
    /**
     * The value indicating whether functional acknowledgement is needed.
     * 
    */
    public Boolean getNeedFunctionalAcknowledgement() {
        return this.needFunctionalAcknowledgement;
    }
    /**
     * The value indicating whether implementation acknowledgement is needed.
     * 
    */
    public Boolean getNeedImplementationAcknowledgement() {
        return this.needImplementationAcknowledgement;
    }
    /**
     * The value indicating whether a loop is needed for valid messages.
     * 
    */
    public Boolean getNeedLoopForValidMessages() {
        return this.needLoopForValidMessages;
    }
    /**
     * The value indicating whether technical acknowledgement is needed.
     * 
    */
    public Boolean getNeedTechnicalAcknowledgement() {
        return this.needTechnicalAcknowledgement;
    }
    /**
     * The value indicating whether to rollover acknowledgement control number.
     * 
    */
    public Boolean getRolloverAcknowledgementControlNumber() {
        return this.rolloverAcknowledgementControlNumber;
    }
    /**
     * The value indicating whether to send synchronous acknowledgement.
     * 
    */
    public Boolean getSendSynchronousAcknowledgement() {
        return this.sendSynchronousAcknowledgement;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(X12AcknowledgementSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer acknowledgementControlNumberLowerBound;
        private @Nullable String acknowledgementControlNumberPrefix;
        private @Nullable String acknowledgementControlNumberSuffix;
        private Integer acknowledgementControlNumberUpperBound;
        private Boolean batchFunctionalAcknowledgements;
        private Boolean batchImplementationAcknowledgements;
        private Boolean batchTechnicalAcknowledgements;
        private @Nullable String functionalAcknowledgementVersion;
        private @Nullable String implementationAcknowledgementVersion;
        private Boolean needFunctionalAcknowledgement;
        private Boolean needImplementationAcknowledgement;
        private Boolean needLoopForValidMessages;
        private Boolean needTechnicalAcknowledgement;
        private Boolean rolloverAcknowledgementControlNumber;
        private Boolean sendSynchronousAcknowledgement;

        public Builder() {
    	      // Empty
        }

        public Builder(X12AcknowledgementSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acknowledgementControlNumberLowerBound = defaults.acknowledgementControlNumberLowerBound;
    	      this.acknowledgementControlNumberPrefix = defaults.acknowledgementControlNumberPrefix;
    	      this.acknowledgementControlNumberSuffix = defaults.acknowledgementControlNumberSuffix;
    	      this.acknowledgementControlNumberUpperBound = defaults.acknowledgementControlNumberUpperBound;
    	      this.batchFunctionalAcknowledgements = defaults.batchFunctionalAcknowledgements;
    	      this.batchImplementationAcknowledgements = defaults.batchImplementationAcknowledgements;
    	      this.batchTechnicalAcknowledgements = defaults.batchTechnicalAcknowledgements;
    	      this.functionalAcknowledgementVersion = defaults.functionalAcknowledgementVersion;
    	      this.implementationAcknowledgementVersion = defaults.implementationAcknowledgementVersion;
    	      this.needFunctionalAcknowledgement = defaults.needFunctionalAcknowledgement;
    	      this.needImplementationAcknowledgement = defaults.needImplementationAcknowledgement;
    	      this.needLoopForValidMessages = defaults.needLoopForValidMessages;
    	      this.needTechnicalAcknowledgement = defaults.needTechnicalAcknowledgement;
    	      this.rolloverAcknowledgementControlNumber = defaults.rolloverAcknowledgementControlNumber;
    	      this.sendSynchronousAcknowledgement = defaults.sendSynchronousAcknowledgement;
        }

        public Builder acknowledgementControlNumberLowerBound(Integer acknowledgementControlNumberLowerBound) {
            this.acknowledgementControlNumberLowerBound = Objects.requireNonNull(acknowledgementControlNumberLowerBound);
            return this;
        }
        public Builder acknowledgementControlNumberPrefix(@Nullable String acknowledgementControlNumberPrefix) {
            this.acknowledgementControlNumberPrefix = acknowledgementControlNumberPrefix;
            return this;
        }
        public Builder acknowledgementControlNumberSuffix(@Nullable String acknowledgementControlNumberSuffix) {
            this.acknowledgementControlNumberSuffix = acknowledgementControlNumberSuffix;
            return this;
        }
        public Builder acknowledgementControlNumberUpperBound(Integer acknowledgementControlNumberUpperBound) {
            this.acknowledgementControlNumberUpperBound = Objects.requireNonNull(acknowledgementControlNumberUpperBound);
            return this;
        }
        public Builder batchFunctionalAcknowledgements(Boolean batchFunctionalAcknowledgements) {
            this.batchFunctionalAcknowledgements = Objects.requireNonNull(batchFunctionalAcknowledgements);
            return this;
        }
        public Builder batchImplementationAcknowledgements(Boolean batchImplementationAcknowledgements) {
            this.batchImplementationAcknowledgements = Objects.requireNonNull(batchImplementationAcknowledgements);
            return this;
        }
        public Builder batchTechnicalAcknowledgements(Boolean batchTechnicalAcknowledgements) {
            this.batchTechnicalAcknowledgements = Objects.requireNonNull(batchTechnicalAcknowledgements);
            return this;
        }
        public Builder functionalAcknowledgementVersion(@Nullable String functionalAcknowledgementVersion) {
            this.functionalAcknowledgementVersion = functionalAcknowledgementVersion;
            return this;
        }
        public Builder implementationAcknowledgementVersion(@Nullable String implementationAcknowledgementVersion) {
            this.implementationAcknowledgementVersion = implementationAcknowledgementVersion;
            return this;
        }
        public Builder needFunctionalAcknowledgement(Boolean needFunctionalAcknowledgement) {
            this.needFunctionalAcknowledgement = Objects.requireNonNull(needFunctionalAcknowledgement);
            return this;
        }
        public Builder needImplementationAcknowledgement(Boolean needImplementationAcknowledgement) {
            this.needImplementationAcknowledgement = Objects.requireNonNull(needImplementationAcknowledgement);
            return this;
        }
        public Builder needLoopForValidMessages(Boolean needLoopForValidMessages) {
            this.needLoopForValidMessages = Objects.requireNonNull(needLoopForValidMessages);
            return this;
        }
        public Builder needTechnicalAcknowledgement(Boolean needTechnicalAcknowledgement) {
            this.needTechnicalAcknowledgement = Objects.requireNonNull(needTechnicalAcknowledgement);
            return this;
        }
        public Builder rolloverAcknowledgementControlNumber(Boolean rolloverAcknowledgementControlNumber) {
            this.rolloverAcknowledgementControlNumber = Objects.requireNonNull(rolloverAcknowledgementControlNumber);
            return this;
        }
        public Builder sendSynchronousAcknowledgement(Boolean sendSynchronousAcknowledgement) {
            this.sendSynchronousAcknowledgement = Objects.requireNonNull(sendSynchronousAcknowledgement);
            return this;
        }        public X12AcknowledgementSettingsResponse build() {
            return new X12AcknowledgementSettingsResponse(acknowledgementControlNumberLowerBound, acknowledgementControlNumberPrefix, acknowledgementControlNumberSuffix, acknowledgementControlNumberUpperBound, batchFunctionalAcknowledgements, batchImplementationAcknowledgements, batchTechnicalAcknowledgements, functionalAcknowledgementVersion, implementationAcknowledgementVersion, needFunctionalAcknowledgement, needImplementationAcknowledgement, needLoopForValidMessages, needTechnicalAcknowledgement, rolloverAcknowledgementControlNumber, sendSynchronousAcknowledgement);
        }
    }
}
