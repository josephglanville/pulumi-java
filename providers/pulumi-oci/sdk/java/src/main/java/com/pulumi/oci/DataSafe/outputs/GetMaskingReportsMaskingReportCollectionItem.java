// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.oci.DataSafe.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetMaskingReportsMaskingReportCollectionItem {
    /**
     * @return A filter to return only resources that match the specified compartment OCID.
     * 
     */
    private final String compartmentId;
    /**
     * @return The OCID of the masking report.
     * 
     */
    private final String id;
    /**
     * @return A filter to return only the resources that match the specified masking policy OCID.
     * 
     */
    private final String maskingPolicyId;
    /**
     * @return The OCID of the masking work request that resulted in this masking report.
     * 
     */
    private final String maskingWorkRequestId;
    /**
     * @return A filter to return only items related to a specific target OCID.
     * 
     */
    private final String targetId;
    /**
     * @return The date and time data masking finished, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)
     * 
     */
    private final String timeMaskingFinished;
    /**
     * @return The date and time data masking started, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)
     * 
     */
    private final String timeMaskingStarted;
    /**
     * @return The total number of masked columns.
     * 
     */
    private final String totalMaskedColumns;
    /**
     * @return The total number of unique objects (tables and editioning views) that contain the masked columns.
     * 
     */
    private final String totalMaskedObjects;
    /**
     * @return The total number of unique schemas that contain the masked columns.
     * 
     */
    private final String totalMaskedSchemas;
    /**
     * @return The total number of unique sensitive types associated with the masked columns.
     * 
     */
    private final String totalMaskedSensitiveTypes;
    /**
     * @return The total number of masked values.
     * 
     */
    private final String totalMaskedValues;

    @CustomType.Constructor
    private GetMaskingReportsMaskingReportCollectionItem(
        @CustomType.Parameter("compartmentId") String compartmentId,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("maskingPolicyId") String maskingPolicyId,
        @CustomType.Parameter("maskingWorkRequestId") String maskingWorkRequestId,
        @CustomType.Parameter("targetId") String targetId,
        @CustomType.Parameter("timeMaskingFinished") String timeMaskingFinished,
        @CustomType.Parameter("timeMaskingStarted") String timeMaskingStarted,
        @CustomType.Parameter("totalMaskedColumns") String totalMaskedColumns,
        @CustomType.Parameter("totalMaskedObjects") String totalMaskedObjects,
        @CustomType.Parameter("totalMaskedSchemas") String totalMaskedSchemas,
        @CustomType.Parameter("totalMaskedSensitiveTypes") String totalMaskedSensitiveTypes,
        @CustomType.Parameter("totalMaskedValues") String totalMaskedValues) {
        this.compartmentId = compartmentId;
        this.id = id;
        this.maskingPolicyId = maskingPolicyId;
        this.maskingWorkRequestId = maskingWorkRequestId;
        this.targetId = targetId;
        this.timeMaskingFinished = timeMaskingFinished;
        this.timeMaskingStarted = timeMaskingStarted;
        this.totalMaskedColumns = totalMaskedColumns;
        this.totalMaskedObjects = totalMaskedObjects;
        this.totalMaskedSchemas = totalMaskedSchemas;
        this.totalMaskedSensitiveTypes = totalMaskedSensitiveTypes;
        this.totalMaskedValues = totalMaskedValues;
    }

    /**
     * @return A filter to return only resources that match the specified compartment OCID.
     * 
     */
    public String compartmentId() {
        return this.compartmentId;
    }
    /**
     * @return The OCID of the masking report.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return A filter to return only the resources that match the specified masking policy OCID.
     * 
     */
    public String maskingPolicyId() {
        return this.maskingPolicyId;
    }
    /**
     * @return The OCID of the masking work request that resulted in this masking report.
     * 
     */
    public String maskingWorkRequestId() {
        return this.maskingWorkRequestId;
    }
    /**
     * @return A filter to return only items related to a specific target OCID.
     * 
     */
    public String targetId() {
        return this.targetId;
    }
    /**
     * @return The date and time data masking finished, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)
     * 
     */
    public String timeMaskingFinished() {
        return this.timeMaskingFinished;
    }
    /**
     * @return The date and time data masking started, in the format defined by [RFC3339](https://tools.ietf.org/html/rfc3339)
     * 
     */
    public String timeMaskingStarted() {
        return this.timeMaskingStarted;
    }
    /**
     * @return The total number of masked columns.
     * 
     */
    public String totalMaskedColumns() {
        return this.totalMaskedColumns;
    }
    /**
     * @return The total number of unique objects (tables and editioning views) that contain the masked columns.
     * 
     */
    public String totalMaskedObjects() {
        return this.totalMaskedObjects;
    }
    /**
     * @return The total number of unique schemas that contain the masked columns.
     * 
     */
    public String totalMaskedSchemas() {
        return this.totalMaskedSchemas;
    }
    /**
     * @return The total number of unique sensitive types associated with the masked columns.
     * 
     */
    public String totalMaskedSensitiveTypes() {
        return this.totalMaskedSensitiveTypes;
    }
    /**
     * @return The total number of masked values.
     * 
     */
    public String totalMaskedValues() {
        return this.totalMaskedValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMaskingReportsMaskingReportCollectionItem defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String compartmentId;
        private String id;
        private String maskingPolicyId;
        private String maskingWorkRequestId;
        private String targetId;
        private String timeMaskingFinished;
        private String timeMaskingStarted;
        private String totalMaskedColumns;
        private String totalMaskedObjects;
        private String totalMaskedSchemas;
        private String totalMaskedSensitiveTypes;
        private String totalMaskedValues;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMaskingReportsMaskingReportCollectionItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.compartmentId = defaults.compartmentId;
    	      this.id = defaults.id;
    	      this.maskingPolicyId = defaults.maskingPolicyId;
    	      this.maskingWorkRequestId = defaults.maskingWorkRequestId;
    	      this.targetId = defaults.targetId;
    	      this.timeMaskingFinished = defaults.timeMaskingFinished;
    	      this.timeMaskingStarted = defaults.timeMaskingStarted;
    	      this.totalMaskedColumns = defaults.totalMaskedColumns;
    	      this.totalMaskedObjects = defaults.totalMaskedObjects;
    	      this.totalMaskedSchemas = defaults.totalMaskedSchemas;
    	      this.totalMaskedSensitiveTypes = defaults.totalMaskedSensitiveTypes;
    	      this.totalMaskedValues = defaults.totalMaskedValues;
        }

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = Objects.requireNonNull(compartmentId);
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder maskingPolicyId(String maskingPolicyId) {
            this.maskingPolicyId = Objects.requireNonNull(maskingPolicyId);
            return this;
        }
        public Builder maskingWorkRequestId(String maskingWorkRequestId) {
            this.maskingWorkRequestId = Objects.requireNonNull(maskingWorkRequestId);
            return this;
        }
        public Builder targetId(String targetId) {
            this.targetId = Objects.requireNonNull(targetId);
            return this;
        }
        public Builder timeMaskingFinished(String timeMaskingFinished) {
            this.timeMaskingFinished = Objects.requireNonNull(timeMaskingFinished);
            return this;
        }
        public Builder timeMaskingStarted(String timeMaskingStarted) {
            this.timeMaskingStarted = Objects.requireNonNull(timeMaskingStarted);
            return this;
        }
        public Builder totalMaskedColumns(String totalMaskedColumns) {
            this.totalMaskedColumns = Objects.requireNonNull(totalMaskedColumns);
            return this;
        }
        public Builder totalMaskedObjects(String totalMaskedObjects) {
            this.totalMaskedObjects = Objects.requireNonNull(totalMaskedObjects);
            return this;
        }
        public Builder totalMaskedSchemas(String totalMaskedSchemas) {
            this.totalMaskedSchemas = Objects.requireNonNull(totalMaskedSchemas);
            return this;
        }
        public Builder totalMaskedSensitiveTypes(String totalMaskedSensitiveTypes) {
            this.totalMaskedSensitiveTypes = Objects.requireNonNull(totalMaskedSensitiveTypes);
            return this;
        }
        public Builder totalMaskedValues(String totalMaskedValues) {
            this.totalMaskedValues = Objects.requireNonNull(totalMaskedValues);
            return this;
        }        public GetMaskingReportsMaskingReportCollectionItem build() {
            return new GetMaskingReportsMaskingReportCollectionItem(compartmentId, id, maskingPolicyId, maskingWorkRequestId, targetId, timeMaskingFinished, timeMaskingStarted, totalMaskedColumns, totalMaskedObjects, totalMaskedSchemas, totalMaskedSensitiveTypes, totalMaskedValues);
        }
    }
}
