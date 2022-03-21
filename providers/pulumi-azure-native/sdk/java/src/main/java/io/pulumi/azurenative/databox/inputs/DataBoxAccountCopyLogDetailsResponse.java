// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Copy log details for a storage account of a DataBox job
 * 
 */
public final class DataBoxAccountCopyLogDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataBoxAccountCopyLogDetailsResponse Empty = new DataBoxAccountCopyLogDetailsResponse();

    /**
     * Account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    /**
     * Indicates the type of job details.
     * Expected value is 'DataBox'.
     * 
     */
    @Import(name="copyLogDetailsType", required=true)
      private final String copyLogDetailsType;

    public String getCopyLogDetailsType() {
        return this.copyLogDetailsType;
    }

    /**
     * Link for copy logs.
     * 
     */
    @Import(name="copyLogLink", required=true)
      private final String copyLogLink;

    public String getCopyLogLink() {
        return this.copyLogLink;
    }

    /**
     * Link for copy verbose logs. This will be set only when LogCollectionLevel is set to Verbose.
     * 
     */
    @Import(name="copyVerboseLogLink", required=true)
      private final String copyVerboseLogLink;

    public String getCopyVerboseLogLink() {
        return this.copyVerboseLogLink;
    }

    public DataBoxAccountCopyLogDetailsResponse(
        String accountName,
        String copyLogDetailsType,
        String copyLogLink,
        String copyVerboseLogLink) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.copyLogDetailsType = Objects.requireNonNull(copyLogDetailsType, "expected parameter 'copyLogDetailsType' to be non-null");
        this.copyLogLink = Objects.requireNonNull(copyLogLink, "expected parameter 'copyLogLink' to be non-null");
        this.copyVerboseLogLink = Objects.requireNonNull(copyVerboseLogLink, "expected parameter 'copyVerboseLogLink' to be non-null");
    }

    private DataBoxAccountCopyLogDetailsResponse() {
        this.accountName = null;
        this.copyLogDetailsType = null;
        this.copyLogLink = null;
        this.copyVerboseLogLink = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataBoxAccountCopyLogDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String copyLogDetailsType;
        private String copyLogLink;
        private String copyVerboseLogLink;

        public Builder() {
    	      // Empty
        }

        public Builder(DataBoxAccountCopyLogDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.copyLogDetailsType = defaults.copyLogDetailsType;
    	      this.copyLogLink = defaults.copyLogLink;
    	      this.copyVerboseLogLink = defaults.copyVerboseLogLink;
        }

        public Builder accountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder copyLogDetailsType(String copyLogDetailsType) {
            this.copyLogDetailsType = Objects.requireNonNull(copyLogDetailsType);
            return this;
        }
        public Builder copyLogLink(String copyLogLink) {
            this.copyLogLink = Objects.requireNonNull(copyLogLink);
            return this;
        }
        public Builder copyVerboseLogLink(String copyVerboseLogLink) {
            this.copyVerboseLogLink = Objects.requireNonNull(copyVerboseLogLink);
            return this;
        }        public DataBoxAccountCopyLogDetailsResponse build() {
            return new DataBoxAccountCopyLogDetailsResponse(accountName, copyLogDetailsType, copyLogLink, copyVerboseLogLink);
        }
    }
}
