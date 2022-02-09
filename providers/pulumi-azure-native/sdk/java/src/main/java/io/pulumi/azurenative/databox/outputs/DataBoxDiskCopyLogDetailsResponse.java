// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class DataBoxDiskCopyLogDetailsResponse {
    private final String copyLogDetailsType;
    private final String diskSerialNumber;
    private final String errorLogLink;
    private final String verboseLogLink;

    @OutputCustomType.Constructor({"copyLogDetailsType","diskSerialNumber","errorLogLink","verboseLogLink"})
    private DataBoxDiskCopyLogDetailsResponse(
        String copyLogDetailsType,
        String diskSerialNumber,
        String errorLogLink,
        String verboseLogLink) {
        this.copyLogDetailsType = Objects.requireNonNull(copyLogDetailsType);
        this.diskSerialNumber = Objects.requireNonNull(diskSerialNumber);
        this.errorLogLink = Objects.requireNonNull(errorLogLink);
        this.verboseLogLink = Objects.requireNonNull(verboseLogLink);
    }

    public String getCopyLogDetailsType() {
        return this.copyLogDetailsType;
    }
    public String getDiskSerialNumber() {
        return this.diskSerialNumber;
    }
    public String getErrorLogLink() {
        return this.errorLogLink;
    }
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

        public Builder setCopyLogDetailsType(String copyLogDetailsType) {
            this.copyLogDetailsType = Objects.requireNonNull(copyLogDetailsType);
            return this;
        }

        public Builder setDiskSerialNumber(String diskSerialNumber) {
            this.diskSerialNumber = Objects.requireNonNull(diskSerialNumber);
            return this;
        }

        public Builder setErrorLogLink(String errorLogLink) {
            this.errorLogLink = Objects.requireNonNull(errorLogLink);
            return this;
        }

        public Builder setVerboseLogLink(String verboseLogLink) {
            this.verboseLogLink = Objects.requireNonNull(verboseLogLink);
            return this;
        }

        public DataBoxDiskCopyLogDetailsResponse build() {
            return new DataBoxDiskCopyLogDetailsResponse(copyLogDetailsType, diskSerialNumber, errorLogLink, verboseLogLink);
        }
    }
}
