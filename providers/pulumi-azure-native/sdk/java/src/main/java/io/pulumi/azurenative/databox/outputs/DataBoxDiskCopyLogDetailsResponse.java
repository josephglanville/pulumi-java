// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class DataBoxDiskCopyLogDetailsResponse {
    /**
     * Indicates the type of job details.
     * Expected value is 'DataBoxDisk'.
     * 
     */
    private final String copyLogDetailsType;
    /**
     * Disk Serial Number.
     * 
     */
    private final String diskSerialNumber;
    /**
     * Link for copy error logs.
     * 
     */
    private final String errorLogLink;
    /**
     * Link for copy verbose logs.
     * 
     */
    private final String verboseLogLink;

    @CustomType.Constructor
    private DataBoxDiskCopyLogDetailsResponse(
        @CustomType.Parameter("copyLogDetailsType") String copyLogDetailsType,
        @CustomType.Parameter("diskSerialNumber") String diskSerialNumber,
        @CustomType.Parameter("errorLogLink") String errorLogLink,
        @CustomType.Parameter("verboseLogLink") String verboseLogLink) {
        this.copyLogDetailsType = copyLogDetailsType;
        this.diskSerialNumber = diskSerialNumber;
        this.errorLogLink = errorLogLink;
        this.verboseLogLink = verboseLogLink;
    }

    /**
     * Indicates the type of job details.
     * Expected value is 'DataBoxDisk'.
     * 
    */
    public String getCopyLogDetailsType() {
        return this.copyLogDetailsType;
    }
    /**
     * Disk Serial Number.
     * 
    */
    public String getDiskSerialNumber() {
        return this.diskSerialNumber;
    }
    /**
     * Link for copy error logs.
     * 
    */
    public String getErrorLogLink() {
        return this.errorLogLink;
    }
    /**
     * Link for copy verbose logs.
     * 
    */
    public String getVerboseLogLink() {
        return this.verboseLogLink;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataBoxDiskCopyLogDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String copyLogDetailsType;
        private String diskSerialNumber;
        private String errorLogLink;
        private String verboseLogLink;

        public Builder() {
    	      // Empty
        }

        public Builder(DataBoxDiskCopyLogDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.copyLogDetailsType = defaults.copyLogDetailsType;
    	      this.diskSerialNumber = defaults.diskSerialNumber;
    	      this.errorLogLink = defaults.errorLogLink;
    	      this.verboseLogLink = defaults.verboseLogLink;
        }

        public Builder copyLogDetailsType(String copyLogDetailsType) {
            this.copyLogDetailsType = Objects.requireNonNull(copyLogDetailsType);
            return this;
        }
        public Builder diskSerialNumber(String diskSerialNumber) {
            this.diskSerialNumber = Objects.requireNonNull(diskSerialNumber);
            return this;
        }
        public Builder errorLogLink(String errorLogLink) {
            this.errorLogLink = Objects.requireNonNull(errorLogLink);
            return this;
        }
        public Builder verboseLogLink(String verboseLogLink) {
            this.verboseLogLink = Objects.requireNonNull(verboseLogLink);
            return this;
        }        public DataBoxDiskCopyLogDetailsResponse build() {
            return new DataBoxDiskCopyLogDetailsResponse(copyLogDetailsType, diskSerialNumber, errorLogLink, verboseLogLink);
        }
    }
}
