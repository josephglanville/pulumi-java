// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.appflow.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetConnectorProfileArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConnectorProfileArgs Empty = new GetConnectorProfileArgs();

    /**
     * The maximum number of items to retrieve in a single batch.
     * 
     */
    @InputImport(name="connectorProfileName", required=true)
      private final String connectorProfileName;

    public String getConnectorProfileName() {
        return this.connectorProfileName;
    }

    public GetConnectorProfileArgs(String connectorProfileName) {
        this.connectorProfileName = Objects.requireNonNull(connectorProfileName, "expected parameter 'connectorProfileName' to be non-null");
    }

    private GetConnectorProfileArgs() {
        this.connectorProfileName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectorProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectorProfileName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectorProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorProfileName = defaults.connectorProfileName;
        }

        public Builder setConnectorProfileName(String connectorProfileName) {
            this.connectorProfileName = Objects.requireNonNull(connectorProfileName);
            return this;
        }
        public GetConnectorProfileArgs build() {
            return new GetConnectorProfileArgs(connectorProfileName);
        }
    }
}
