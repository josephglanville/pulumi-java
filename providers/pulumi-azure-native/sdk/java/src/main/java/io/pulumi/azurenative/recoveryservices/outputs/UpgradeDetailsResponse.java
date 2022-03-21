// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class UpgradeDetailsResponse {
    /**
     * UTC time at which the upgrade operation has ended.
     * 
     */
    private final String endTimeUtc;
    /**
     * UTC time at which the upgrade operation status was last updated.
     * 
     */
    private final String lastUpdatedTimeUtc;
    /**
     * Message to the user containing information about the upgrade operation.
     * 
     */
    private final String message;
    /**
     * ID of the vault upgrade operation.
     * 
     */
    private final String operationId;
    /**
     * Resource ID of the vault before the upgrade.
     * 
     */
    private final String previousResourceId;
    /**
     * UTC time at which the upgrade operation has started.
     * 
     */
    private final String startTimeUtc;
    /**
     * Status of the vault upgrade operation.
     * 
     */
    private final String status;
    /**
     * The way the vault upgrade was triggered.
     * 
     */
    private final String triggerType;
    /**
     * Resource ID of the upgraded vault.
     * 
     */
    private final String upgradedResourceId;

    @CustomType.Constructor
    private UpgradeDetailsResponse(
        @CustomType.Parameter("endTimeUtc") String endTimeUtc,
        @CustomType.Parameter("lastUpdatedTimeUtc") String lastUpdatedTimeUtc,
        @CustomType.Parameter("message") String message,
        @CustomType.Parameter("operationId") String operationId,
        @CustomType.Parameter("previousResourceId") String previousResourceId,
        @CustomType.Parameter("startTimeUtc") String startTimeUtc,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("triggerType") String triggerType,
        @CustomType.Parameter("upgradedResourceId") String upgradedResourceId) {
        this.endTimeUtc = endTimeUtc;
        this.lastUpdatedTimeUtc = lastUpdatedTimeUtc;
        this.message = message;
        this.operationId = operationId;
        this.previousResourceId = previousResourceId;
        this.startTimeUtc = startTimeUtc;
        this.status = status;
        this.triggerType = triggerType;
        this.upgradedResourceId = upgradedResourceId;
    }

    /**
     * UTC time at which the upgrade operation has ended.
     * 
    */
    public String getEndTimeUtc() {
        return this.endTimeUtc;
    }
    /**
     * UTC time at which the upgrade operation status was last updated.
     * 
    */
    public String getLastUpdatedTimeUtc() {
        return this.lastUpdatedTimeUtc;
    }
    /**
     * Message to the user containing information about the upgrade operation.
     * 
    */
    public String getMessage() {
        return this.message;
    }
    /**
     * ID of the vault upgrade operation.
     * 
    */
    public String getOperationId() {
        return this.operationId;
    }
    /**
     * Resource ID of the vault before the upgrade.
     * 
    */
    public String getPreviousResourceId() {
        return this.previousResourceId;
    }
    /**
     * UTC time at which the upgrade operation has started.
     * 
    */
    public String getStartTimeUtc() {
        return this.startTimeUtc;
    }
    /**
     * Status of the vault upgrade operation.
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * The way the vault upgrade was triggered.
     * 
    */
    public String getTriggerType() {
        return this.triggerType;
    }
    /**
     * Resource ID of the upgraded vault.
     * 
    */
    public String getUpgradedResourceId() {
        return this.upgradedResourceId;
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

        public Builder endTimeUtc(String endTimeUtc) {
            this.endTimeUtc = Objects.requireNonNull(endTimeUtc);
            return this;
        }
        public Builder lastUpdatedTimeUtc(String lastUpdatedTimeUtc) {
            this.lastUpdatedTimeUtc = Objects.requireNonNull(lastUpdatedTimeUtc);
            return this;
        }
        public Builder message(String message) {
            this.message = Objects.requireNonNull(message);
            return this;
        }
        public Builder operationId(String operationId) {
            this.operationId = Objects.requireNonNull(operationId);
            return this;
        }
        public Builder previousResourceId(String previousResourceId) {
            this.previousResourceId = Objects.requireNonNull(previousResourceId);
            return this;
        }
        public Builder startTimeUtc(String startTimeUtc) {
            this.startTimeUtc = Objects.requireNonNull(startTimeUtc);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder triggerType(String triggerType) {
            this.triggerType = Objects.requireNonNull(triggerType);
            return this;
        }
        public Builder upgradedResourceId(String upgradedResourceId) {
            this.upgradedResourceId = Objects.requireNonNull(upgradedResourceId);
            return this;
        }        public UpgradeDetailsResponse build() {
            return new UpgradeDetailsResponse(endTimeUtc, lastUpdatedTimeUtc, message, operationId, previousResourceId, startTimeUtc, status, triggerType, upgradedResourceId);
        }
    }
}
