// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSubAccountArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSubAccountArgs Empty = new GetSubAccountArgs();

    /**
     * Monitor resource name
     * 
     */
    @Import(name="monitorName", required=true)
      private final String monitorName;

    public String getMonitorName() {
        return this.monitorName;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Sub Account resource name
     * 
     */
    @Import(name="subAccountName", required=true)
      private final String subAccountName;

    public String getSubAccountName() {
        return this.subAccountName;
    }

    public GetSubAccountArgs(
        String monitorName,
        String resourceGroupName,
        String subAccountName) {
        this.monitorName = Objects.requireNonNull(monitorName, "expected parameter 'monitorName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.subAccountName = Objects.requireNonNull(subAccountName, "expected parameter 'subAccountName' to be non-null");
    }

    private GetSubAccountArgs() {
        this.monitorName = null;
        this.resourceGroupName = null;
        this.subAccountName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubAccountArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String monitorName;
        private String resourceGroupName;
        private String subAccountName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubAccountArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.monitorName = defaults.monitorName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.subAccountName = defaults.subAccountName;
        }

        public Builder monitorName(String monitorName) {
            this.monitorName = Objects.requireNonNull(monitorName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder subAccountName(String subAccountName) {
            this.subAccountName = Objects.requireNonNull(subAccountName);
            return this;
        }        public GetSubAccountArgs build() {
            return new GetSubAccountArgs(monitorName, resourceGroupName, subAccountName);
        }
    }
}
