// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.confidentialledger.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetLedgerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetLedgerArgs Empty = new GetLedgerArgs();

    @InputImport(name="ledgerName", required=true)
    private final String ledgerName;

    public String getLedgerName() {
        return this.ledgerName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetLedgerArgs(
        String ledgerName,
        String resourceGroupName) {
        this.ledgerName = Objects.requireNonNull(ledgerName, "expected parameter 'ledgerName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetLedgerArgs() {
        this.ledgerName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetLedgerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String ledgerName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetLedgerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ledgerName = defaults.ledgerName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setLedgerName(String ledgerName) {
            this.ledgerName = Objects.requireNonNull(ledgerName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetLedgerArgs build() {
            return new GetLedgerArgs(ledgerName, resourceGroupName);
        }
    }
}
