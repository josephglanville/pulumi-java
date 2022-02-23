// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * An update history of the ImmutabilityPolicy of a blob container.
 * 
 */
public final class UpdateHistoryPropertyResponse extends io.pulumi.resources.InvokeArgs {

    public static final UpdateHistoryPropertyResponse Empty = new UpdateHistoryPropertyResponse();

    /**
     * The immutability period for the blobs in the container since the policy creation, in days.
     * 
     */
    @InputImport(name="immutabilityPeriodSinceCreationInDays", required=true)
      private final Integer immutabilityPeriodSinceCreationInDays;

    public Integer getImmutabilityPeriodSinceCreationInDays() {
        return this.immutabilityPeriodSinceCreationInDays;
    }

    /**
     * Returns the Object ID of the user who updated the ImmutabilityPolicy.
     * 
     */
    @InputImport(name="objectIdentifier", required=true)
      private final String objectIdentifier;

    public String getObjectIdentifier() {
        return this.objectIdentifier;
    }

    /**
     * Returns the Tenant ID that issued the token for the user who updated the ImmutabilityPolicy.
     * 
     */
    @InputImport(name="tenantId", required=true)
      private final String tenantId;

    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * Returns the date and time the ImmutabilityPolicy was updated.
     * 
     */
    @InputImport(name="timestamp", required=true)
      private final String timestamp;

    public String getTimestamp() {
        return this.timestamp;
    }

    /**
     * The ImmutabilityPolicy update type of a blob container, possible values include: put, lock and extend.
     * 
     */
    @InputImport(name="update", required=true)
      private final String update;

    public String getUpdate() {
        return this.update;
    }

    /**
     * Returns the User Principal Name of the user who updated the ImmutabilityPolicy.
     * 
     */
    @InputImport(name="upn", required=true)
      private final String upn;

    public String getUpn() {
        return this.upn;
    }

    public UpdateHistoryPropertyResponse(
        Integer immutabilityPeriodSinceCreationInDays,
        String objectIdentifier,
        String tenantId,
        String timestamp,
        String update,
        String upn) {
        this.immutabilityPeriodSinceCreationInDays = Objects.requireNonNull(immutabilityPeriodSinceCreationInDays, "expected parameter 'immutabilityPeriodSinceCreationInDays' to be non-null");
        this.objectIdentifier = Objects.requireNonNull(objectIdentifier, "expected parameter 'objectIdentifier' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
        this.timestamp = Objects.requireNonNull(timestamp, "expected parameter 'timestamp' to be non-null");
        this.update = Objects.requireNonNull(update, "expected parameter 'update' to be non-null");
        this.upn = Objects.requireNonNull(upn, "expected parameter 'upn' to be non-null");
    }

    private UpdateHistoryPropertyResponse() {
        this.immutabilityPeriodSinceCreationInDays = null;
        this.objectIdentifier = null;
        this.tenantId = null;
        this.timestamp = null;
        this.update = null;
        this.upn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UpdateHistoryPropertyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer immutabilityPeriodSinceCreationInDays;
        private String objectIdentifier;
        private String tenantId;
        private String timestamp;
        private String update;
        private String upn;

        public Builder() {
    	      // Empty
        }

        public Builder(UpdateHistoryPropertyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.immutabilityPeriodSinceCreationInDays = defaults.immutabilityPeriodSinceCreationInDays;
    	      this.objectIdentifier = defaults.objectIdentifier;
    	      this.tenantId = defaults.tenantId;
    	      this.timestamp = defaults.timestamp;
    	      this.update = defaults.update;
    	      this.upn = defaults.upn;
        }

        public Builder setImmutabilityPeriodSinceCreationInDays(Integer immutabilityPeriodSinceCreationInDays) {
            this.immutabilityPeriodSinceCreationInDays = Objects.requireNonNull(immutabilityPeriodSinceCreationInDays);
            return this;
        }

        public Builder setObjectIdentifier(String objectIdentifier) {
            this.objectIdentifier = Objects.requireNonNull(objectIdentifier);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setTimestamp(String timestamp) {
            this.timestamp = Objects.requireNonNull(timestamp);
            return this;
        }

        public Builder setUpdate(String update) {
            this.update = Objects.requireNonNull(update);
            return this;
        }

        public Builder setUpn(String upn) {
            this.upn = Objects.requireNonNull(upn);
            return this;
        }
        public UpdateHistoryPropertyResponse build() {
            return new UpdateHistoryPropertyResponse(immutabilityPeriodSinceCreationInDays, objectIdentifier, tenantId, timestamp, update, upn);
        }
    }
}
