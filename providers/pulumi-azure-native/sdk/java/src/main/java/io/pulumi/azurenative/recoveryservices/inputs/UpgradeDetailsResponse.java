// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Details for upgrading vault.
 * 
 */
public final class UpgradeDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final UpgradeDetailsResponse Empty = new UpgradeDetailsResponse();

    /**
     * UTC time at which the upgrade operation has ended.
     * 
     */
    @InputImport(name="endTimeUtc", required=true)
      private final String endTimeUtc;

    public String getEndTimeUtc() {
        return this.endTimeUtc;
    }

    /**
     * UTC time at which the upgrade operation status was last updated.
     * 
     */
    @InputImport(name="lastUpdatedTimeUtc", required=true)
      private final String lastUpdatedTimeUtc;

    public String getLastUpdatedTimeUtc() {
        return this.lastUpdatedTimeUtc;
    }

    /**
     * Message to the user containing information about the upgrade operation.
     * 
     */
    @InputImport(name="message", required=true)
      private final String message;

    public String getMessage() {
        return this.message;
    }

    /**
     * ID of the vault upgrade operation.
     * 
     */
    @InputImport(name="operationId", required=true)
      private final String operationId;

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * Resource ID of the vault before the upgrade.
     * 
     */
    @InputImport(name="previousResourceId", required=true)
      private final String previousResourceId;

    public String getPreviousResourceId() {
        return this.previousResourceId;
    }

    /**
     * UTC time at which the upgrade operation has started.
     * 
     */
    @InputImport(name="startTimeUtc", required=true)
      private final String startTimeUtc;

    public String getStartTimeUtc() {
        return this.startTimeUtc;
    }

    /**
     * Status of the vault upgrade operation.
     * 
     */
    @InputImport(name="status", required=true)
      private final String status;

    public String getStatus() {
        return this.status;
    }

    /**
     * The way the vault upgrade was triggered.
     * 
     */
    @InputImport(name="triggerType", required=true)
      private final String triggerType;

    public String getTriggerType() {
        return this.triggerType;
    }

    /**
     * Resource ID of the upgraded vault.
     * 
     */
    @InputImport(name="upgradedResourceId", required=true)
      private final String upgradedResourceId;

    public String getUpgradedResourceId() {
        return this.upgradedResourceId;
    }

    public UpgradeDetailsResponse(
        String endTimeUtc,
        String lastUpdatedTimeUtc,
        String message,
        String operationId,
        String previousResourceId,
        String startTimeUtc,
        String status,
        String triggerType,
        String upgradedResourceId) {
        this.endTimeUtc = Objects.requireNonNull(endTimeUtc, "expected parameter 'endTimeUtc' to be non-null");
        this.lastUpdatedTimeUtc = Objects.requireNonNull(lastUpdatedTimeUtc, "expected parameter 'lastUpdatedTimeUtc' to be non-null");
        this.message = Objects.requireNonNull(message, "expected parameter 'message' to be non-null");
        this.operationId = Objects.requireNonNull(operationId, "expected parameter 'operationId' to be non-null");
        this.previousResourceId = Objects.requireNonNull(previousResourceId, "expected parameter 'previousResourceId' to be non-null");
        this.startTimeUtc = Objects.requireNonNull(startTimeUtc, "expected parameter 'startTimeUtc' to be non-null");
        this.status = Objects.requireNonNull(status, "expected parameter 'status' to be non-null");
        this.triggerType = Objects.requireNonNull(triggerType, "expected parameter 'triggerType' to be non-null");
        this.upgradedResourceId = Objects.requireNonNull(upgradedResourceId, "expected parameter 'upgradedResourceId' to be non-null");
    }

    private UpgradeDetailsResponse() {
        this.endTimeUtc = null;
        this.lastUpdatedTimeUtc = null;
        this.message = null;
        this.operationId = null;
        this.previousResourceId = null;
        this.startTimeUtc = null;
        this.status = null;
        this.triggerType = null;
        this.upgradedResourceId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpgradeDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String endTimeUtc;
        private String lastUpdatedTimeUtc;
        private String message;
        private String operationId;
        private String previousResourceId;
        private String startTimeUtc;
        private String status;
        private String triggerType;
        private String upgradedResourceId;

        public Builder() {
    	      // Empty
        }

        public Builder(UpgradeDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.endTimeUtc = defaults.endTimeUtc;
    	      this.lastUpdatedTimeUtc = defaults.lastUpdatedTimeUtc;
    	      this.message = defaults.message;
    	      this.operationId = defaults.operationId;
    	      this.previousResourceId = defaults.previousResourceId;
    	      this.startTimeUtc = defaults.startTimeUtc;
    	      this.status = defaults.status;
    	      this.triggerType = defaults.triggerType;
    	      this.upgradedResourceId = defaults.upgradedResourceId;
        }

        public Builder setEndTimeUtc(String endTimeUtc) {
            this.endTimeUtc = Objects.requireNonNull(endTimeUtc);
            return this;
        }

        public Builder setLastUpdatedTimeUtc(String lastUpdatedTimeUtc) {
            this.lastUpdatedTimeUtc = Objects.requireNonNull(lastUpdatedTimeUtc);
            return this;
        }

        public Builder setMessage(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }

        public Builder setOperationId(String operationId) {
            this.operationId = Objects.requireNonNull(operationId);
            return this;
        }

        public Builder setPreviousResourceId(String previousResourceId) {
            this.previousResourceId = Objects.requireNonNull(previousResourceId);
            return this;
        }

        public Builder setStartTimeUtc(String startTimeUtc) {
            this.startTimeUtc = Objects.requireNonNull(startTimeUtc);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setTriggerType(String triggerType) {
            this.triggerType = Objects.requireNonNull(triggerType);
            return this;
        }

        public Builder setUpgradedResourceId(String upgradedResourceId) {
            this.upgradedResourceId = Objects.requireNonNull(upgradedResourceId);
            return this;
        }
        public UpgradeDetailsResponse build() {
            return new UpgradeDetailsResponse(endTimeUtc, lastUpdatedTimeUtc, message, operationId, previousResourceId, startTimeUtc, status, triggerType, upgradedResourceId);
        }
    }
}
