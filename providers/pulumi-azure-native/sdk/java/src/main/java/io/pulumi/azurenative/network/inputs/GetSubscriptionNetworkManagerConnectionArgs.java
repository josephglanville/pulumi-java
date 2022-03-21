// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetSubscriptionNetworkManagerConnectionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSubscriptionNetworkManagerConnectionArgs Empty = new GetSubscriptionNetworkManagerConnectionArgs();

    /**
     * Name for the network manager connection.
     * 
     */
    @Import(name="networkManagerConnectionName", required=true)
      private final String networkManagerConnectionName;

    public String getNetworkManagerConnectionName() {
        return this.networkManagerConnectionName;
    }

    public GetSubscriptionNetworkManagerConnectionArgs(String networkManagerConnectionName) {
        this.networkManagerConnectionName = Objects.requireNonNull(networkManagerConnectionName, "expected parameter 'networkManagerConnectionName' to be non-null");
    }

    private GetSubscriptionNetworkManagerConnectionArgs() {
        this.networkManagerConnectionName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSubscriptionNetworkManagerConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String networkManagerConnectionName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSubscriptionNetworkManagerConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.networkManagerConnectionName = defaults.networkManagerConnectionName;
        }

        public Builder networkManagerConnectionName(String networkManagerConnectionName) {
            this.networkManagerConnectionName = Objects.requireNonNull(networkManagerConnectionName);
            return this;
        }        public GetSubscriptionNetworkManagerConnectionArgs build() {
            return new GetSubscriptionNetworkManagerConnectionArgs(networkManagerConnectionName);
        }
    }
}
