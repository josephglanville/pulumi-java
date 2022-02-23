// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetManagementGroupNetworkManagerConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetManagementGroupNetworkManagerConnectionArgs Empty = new GetManagementGroupNetworkManagerConnectionArgs();

    /**
     * The management group Id which uniquely identify the Microsoft Azure management group.
     * 
     */
    @InputImport(name="managementGroupId", required=true)
      private final String managementGroupId;

    public String getManagementGroupId() {
        return this.managementGroupId;
    }

    /**
     * Name for the network manager connection.
     * 
     */
    @InputImport(name="networkManagerConnectionName", required=true)
      private final String networkManagerConnectionName;

    public String getNetworkManagerConnectionName() {
        return this.networkManagerConnectionName;
    }

    public GetManagementGroupNetworkManagerConnectionArgs(
        String managementGroupId,
        String networkManagerConnectionName) {
        this.managementGroupId = Objects.requireNonNull(managementGroupId, "expected parameter 'managementGroupId' to be non-null");
        this.networkManagerConnectionName = Objects.requireNonNull(networkManagerConnectionName, "expected parameter 'networkManagerConnectionName' to be non-null");
    }

    private GetManagementGroupNetworkManagerConnectionArgs() {
        this.managementGroupId = null;
        this.networkManagerConnectionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetManagementGroupNetworkManagerConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String managementGroupId;
        private String networkManagerConnectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetManagementGroupNetworkManagerConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.managementGroupId = defaults.managementGroupId;
    	      this.networkManagerConnectionName = defaults.networkManagerConnectionName;
        }

        public Builder setManagementGroupId(String managementGroupId) {
            this.managementGroupId = Objects.requireNonNull(managementGroupId);
            return this;
        }

        public Builder setNetworkManagerConnectionName(String networkManagerConnectionName) {
            this.networkManagerConnectionName = Objects.requireNonNull(networkManagerConnectionName);
            return this;
        }
        public GetManagementGroupNetworkManagerConnectionArgs build() {
            return new GetManagementGroupNetworkManagerConnectionArgs(managementGroupId, networkManagerConnectionName);
        }
    }
}
