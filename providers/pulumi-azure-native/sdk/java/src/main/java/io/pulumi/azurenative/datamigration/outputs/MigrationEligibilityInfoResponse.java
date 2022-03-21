// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datamigration.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MigrationEligibilityInfoResponse {
    /**
     * Whether object is eligible for migration or not.
     * 
     */
    private final Boolean isEligibleForMigration;
    /**
     * Information about eligibility failure for the server object.
     * 
     */
    private final List<String> validationMessages;

    @CustomType.Constructor
    private MigrationEligibilityInfoResponse(
        @CustomType.Parameter("isEligibleForMigration") Boolean isEligibleForMigration,
        @CustomType.Parameter("validationMessages") List<String> validationMessages) {
        this.isEligibleForMigration = isEligibleForMigration;
        this.validationMessages = validationMessages;
    }

    /**
     * Whether object is eligible for migration or not.
     * 
    */
    public Boolean getIsEligibleForMigration() {
        return this.isEligibleForMigration;
    }
    /**
     * Information about eligibility failure for the server object.
     * 
    */
    public List<String> getValidationMessages() {
        return this.validationMessages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MigrationEligibilityInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean isEligibleForMigration;
        private List<String> validationMessages;

        public Builder() {
    	      // Empty
        }

        public Builder(MigrationEligibilityInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isEligibleForMigration = defaults.isEligibleForMigration;
    	      this.validationMessages = defaults.validationMessages;
        }

        public Builder isEligibleForMigration(Boolean isEligibleForMigration) {
            this.isEligibleForMigration = Objects.requireNonNull(isEligibleForMigration);
            return this;
        }
        public Builder validationMessages(List<String> validationMessages) {
            this.validationMessages = Objects.requireNonNull(validationMessages);
            return this;
        }
        public Builder validationMessages(String... validationMessages) {
            return validationMessages(List.of(validationMessages));
        }        public MigrationEligibilityInfoResponse build() {
            return new MigrationEligibilityInfoResponse(isEligibleForMigration, validationMessages);
        }
    }
}
