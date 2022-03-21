// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.ApiErrorResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LastPatchInstallationSummaryResponse {
    /**
     * The errors that were encountered during execution of the operation. The details array contains the list of them.
     * 
     */
    private final ApiErrorResponse error;
    /**
     * The number of all available patches but excluded explicitly by a customer-specified exclusion list match.
     * 
     */
    private final Integer excludedPatchCount;
    /**
     * The count of patches that failed installation.
     * 
     */
    private final Integer failedPatchCount;
    /**
     * The activity ID of the operation that produced this result. It is used to correlate across CRP and extension logs.
     * 
     */
    private final String installationActivityId;
    /**
     * The count of patches that successfully installed.
     * 
     */
    private final Integer installedPatchCount;
    /**
     * The UTC timestamp when the operation began.
     * 
     */
    private final String lastModifiedTime;
    /**
     * Describes whether the operation ran out of time before it completed all its intended actions
     * 
     */
    private final Boolean maintenanceWindowExceeded;
    /**
     * The number of all available patches but not going to be installed because it didn't match a classification or inclusion list entry.
     * 
     */
    private final Integer notSelectedPatchCount;
    /**
     * The number of all available patches expected to be installed over the course of the patch installation operation.
     * 
     */
    private final Integer pendingPatchCount;
    /**
     * The UTC timestamp when the operation began.
     * 
     */
    private final String startTime;
    /**
     * The overall success or failure status of the operation. It remains "InProgress" until the operation completes. At that point it will become "Unknown", "Failed", "Succeeded", or "CompletedWithWarnings."
     * 
     */
    private final String status;

    @CustomType.Constructor
    private LastPatchInstallationSummaryResponse(
        @CustomType.Parameter("error") ApiErrorResponse error,
        @CustomType.Parameter("excludedPatchCount") Integer excludedPatchCount,
        @CustomType.Parameter("failedPatchCount") Integer failedPatchCount,
        @CustomType.Parameter("installationActivityId") String installationActivityId,
        @CustomType.Parameter("installedPatchCount") Integer installedPatchCount,
        @CustomType.Parameter("lastModifiedTime") String lastModifiedTime,
        @CustomType.Parameter("maintenanceWindowExceeded") Boolean maintenanceWindowExceeded,
        @CustomType.Parameter("notSelectedPatchCount") Integer notSelectedPatchCount,
        @CustomType.Parameter("pendingPatchCount") Integer pendingPatchCount,
        @CustomType.Parameter("startTime") String startTime,
        @CustomType.Parameter("status") String status) {
        this.error = error;
        this.excludedPatchCount = excludedPatchCount;
        this.failedPatchCount = failedPatchCount;
        this.installationActivityId = installationActivityId;
        this.installedPatchCount = installedPatchCount;
        this.lastModifiedTime = lastModifiedTime;
        this.maintenanceWindowExceeded = maintenanceWindowExceeded;
        this.notSelectedPatchCount = notSelectedPatchCount;
        this.pendingPatchCount = pendingPatchCount;
        this.startTime = startTime;
        this.status = status;
    }

    /**
     * The errors that were encountered during execution of the operation. The details array contains the list of them.
     * 
    */
    public ApiErrorResponse getError() {
        return this.error;
    }
    /**
     * The number of all available patches but excluded explicitly by a customer-specified exclusion list match.
     * 
    */
    public Integer getExcludedPatchCount() {
        return this.excludedPatchCount;
    }
    /**
     * The count of patches that failed installation.
     * 
    */
    public Integer getFailedPatchCount() {
        return this.failedPatchCount;
    }
    /**
     * The activity ID of the operation that produced this result. It is used to correlate across CRP and extension logs.
     * 
    */
    public String getInstallationActivityId() {
        return this.installationActivityId;
    }
    /**
     * The count of patches that successfully installed.
     * 
    */
    public Integer getInstalledPatchCount() {
        return this.installedPatchCount;
    }
    /**
     * The UTC timestamp when the operation began.
     * 
    */
    public String getLastModifiedTime() {
        return this.lastModifiedTime;
    }
    /**
     * Describes whether the operation ran out of time before it completed all its intended actions
     * 
    */
    public Boolean getMaintenanceWindowExceeded() {
        return this.maintenanceWindowExceeded;
    }
    /**
     * The number of all available patches but not going to be installed because it didn't match a classification or inclusion list entry.
     * 
    */
    public Integer getNotSelectedPatchCount() {
        return this.notSelectedPatchCount;
    }
    /**
     * The number of all available patches expected to be installed over the course of the patch installation operation.
     * 
    */
    public Integer getPendingPatchCount() {
        return this.pendingPatchCount;
    }
    /**
     * The UTC timestamp when the operation began.
     * 
    */
    public String getStartTime() {
        return this.startTime;
    }
    /**
     * The overall success or failure status of the operation. It remains "InProgress" until the operation completes. At that point it will become "Unknown", "Failed", "Succeeded", or "CompletedWithWarnings."
     * 
    */
    public String getStatus() {
        return this.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LastPatchInstallationSummaryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ApiErrorResponse error;
        private Integer excludedPatchCount;
        private Integer failedPatchCount;
        private String installationActivityId;
        private Integer installedPatchCount;
        private String lastModifiedTime;
        private Boolean maintenanceWindowExceeded;
        private Integer notSelectedPatchCount;
        private Integer pendingPatchCount;
        private String startTime;
        private String status;

        public Builder() {
    	      // Empty
        }

        public Builder(LastPatchInstallationSummaryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.error = defaults.error;
    	      this.excludedPatchCount = defaults.excludedPatchCount;
    	      this.failedPatchCount = defaults.failedPatchCount;
    	      this.installationActivityId = defaults.installationActivityId;
    	      this.installedPatchCount = defaults.installedPatchCount;
    	      this.lastModifiedTime = defaults.lastModifiedTime;
    	      this.maintenanceWindowExceeded = defaults.maintenanceWindowExceeded;
    	      this.notSelectedPatchCount = defaults.notSelectedPatchCount;
    	      this.pendingPatchCount = defaults.pendingPatchCount;
    	      this.startTime = defaults.startTime;
    	      this.status = defaults.status;
        }

        public Builder error(ApiErrorResponse error) {
            this.error = Objects.requireNonNull(error);
            return this;
        }
        public Builder excludedPatchCount(Integer excludedPatchCount) {
            this.excludedPatchCount = Objects.requireNonNull(excludedPatchCount);
            return this;
        }
        public Builder failedPatchCount(Integer failedPatchCount) {
            this.failedPatchCount = Objects.requireNonNull(failedPatchCount);
            return this;
        }
        public Builder installationActivityId(String installationActivityId) {
            this.installationActivityId = Objects.requireNonNull(installationActivityId);
            return this;
        }
        public Builder installedPatchCount(Integer installedPatchCount) {
            this.installedPatchCount = Objects.requireNonNull(installedPatchCount);
            return this;
        }
        public Builder lastModifiedTime(String lastModifiedTime) {
            this.lastModifiedTime = Objects.requireNonNull(lastModifiedTime);
            return this;
        }
        public Builder maintenanceWindowExceeded(Boolean maintenanceWindowExceeded) {
            this.maintenanceWindowExceeded = Objects.requireNonNull(maintenanceWindowExceeded);
            return this;
        }
        public Builder notSelectedPatchCount(Integer notSelectedPatchCount) {
            this.notSelectedPatchCount = Objects.requireNonNull(notSelectedPatchCount);
            return this;
        }
        public Builder pendingPatchCount(Integer pendingPatchCount) {
            this.pendingPatchCount = Objects.requireNonNull(pendingPatchCount);
            return this;
        }
        public Builder startTime(String startTime) {
            this.startTime = Objects.requireNonNull(startTime);
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }        public LastPatchInstallationSummaryResponse build() {
            return new LastPatchInstallationSummaryResponse(error, excludedPatchCount, failedPatchCount, installationActivityId, installedPatchCount, lastModifiedTime, maintenanceWindowExceeded, notSelectedPatchCount, pendingPatchCount, startTime, status);
        }
    }
}
