// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.testbase.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetCustomerEventArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetCustomerEventArgs Empty = new GetCustomerEventArgs();

    /**
     * The resource name of the Test Base Customer event.
     * 
     */
    @Import(name="customerEventName", required=true)
      private final String customerEventName;

    public String getCustomerEventName() {
        return this.customerEventName;
    }

    /**
     * The name of the resource group that contains the resource.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The resource name of the Test Base Account.
     * 
     */
    @Import(name="testBaseAccountName", required=true)
      private final String testBaseAccountName;

    public String getTestBaseAccountName() {
        return this.testBaseAccountName;
    }

    public GetCustomerEventArgs(
        String customerEventName,
        String resourceGroupName,
        String testBaseAccountName) {
        this.customerEventName = Objects.requireNonNull(customerEventName, "expected parameter 'customerEventName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.testBaseAccountName = Objects.requireNonNull(testBaseAccountName, "expected parameter 'testBaseAccountName' to be non-null");
    }

    private GetCustomerEventArgs() {
        this.customerEventName = null;
        this.resourceGroupName = null;
        this.testBaseAccountName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCustomerEventArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String customerEventName;
        private String resourceGroupName;
        private String testBaseAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCustomerEventArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customerEventName = defaults.customerEventName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.testBaseAccountName = defaults.testBaseAccountName;
        }

        public Builder customerEventName(String customerEventName) {
            this.customerEventName = Objects.requireNonNull(customerEventName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder testBaseAccountName(String testBaseAccountName) {
            this.testBaseAccountName = Objects.requireNonNull(testBaseAccountName);
            return this;
        }        public GetCustomerEventArgs build() {
            return new GetCustomerEventArgs(customerEventName, resourceGroupName, testBaseAccountName);
        }
    }
}
