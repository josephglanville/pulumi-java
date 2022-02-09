// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databox.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class DataBoxHeavyAccountCopyLogDetailsResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataBoxHeavyAccountCopyLogDetailsResponse Empty = new DataBoxHeavyAccountCopyLogDetailsResponse();

    @InputImport(name="accountName", required=true)
    private final String accountName;

    public String getAccountName() {
        return this.accountName;
    }

    @InputImport(name="copyLogDetailsType", required=true)
    private final String copyLogDetailsType;

    public String getCopyLogDetailsType() {
        return this.copyLogDetailsType;
    }

    @InputImport(name="copyLogLink", required=true)
    private final List<String> copyLogLink;

    public List<String> getCopyLogLink() {
        return this.copyLogLink;
    }

    @InputImport(name="copyVerboseLogLink", required=true)
    private final List<String> copyVerboseLogLink;

    public List<String> getCopyVerboseLogLink() {
        return this.copyVerboseLogLink;
    }

    public DataBoxHeavyAccountCopyLogDetailsResponse(
        String accountName,
        String copyLogDetailsType,
        List<String> copyLogLink,
        List<String> copyVerboseLogLink) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.copyLogDetailsType = Objects.requireNonNull(copyLogDetailsType, "expected parameter 'copyLogDetailsType' to be non-null");
        this.copyLogLink = Objects.requireNonNull(copyLogLink, "expected parameter 'copyLogLink' to be non-null");
        this.copyVerboseLogLink = Objects.requireNonNull(copyVerboseLogLink, "expected parameter 'copyVerboseLogLink' to be non-null");
    }

    private DataBoxHeavyAccountCopyLogDetailsResponse() {
        this.accountName = null;
        this.copyLogDetailsType = null;
        this.copyLogLink = List.of();
        this.copyVerboseLogLink = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataBoxHeavyAccountCopyLogDetailsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String accountName;
        private String copyLogDetailsType;
        private List<String> copyLogLink;
        private List<String> copyVerboseLogLink;

        public Builder() {
    	      // Empty
        }

        public Builder(DataBoxHeavyAccountCopyLogDetailsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.copyLogDetailsType = defaults.copyLogDetailsType;
    	      this.copyLogLink = defaults.copyLogLink;
    	      this.copyVerboseLogLink = defaults.copyVerboseLogLink;
        }

        public Builder setAccountName(String accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setCopyLogDetailsType(String copyLogDetailsType) {
            this.copyLogDetailsType = Objects.requireNonNull(copyLogDetailsType);
            return this;
        }

        public Builder setCopyLogLink(List<String> copyLogLink) {
            this.copyLogLink = Objects.requireNonNull(copyLogLink);
            return this;
        }

        public Builder setCopyVerboseLogLink(List<String> copyVerboseLogLink) {
            this.copyVerboseLogLink = Objects.requireNonNull(copyVerboseLogLink);
            return this;
        }

        public DataBoxHeavyAccountCopyLogDetailsResponse build() {
            return new DataBoxHeavyAccountCopyLogDetailsResponse(accountName, copyLogDetailsType, copyLogLink, copyVerboseLogLink);
        }
    }
}
