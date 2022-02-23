// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetConnectorArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConnectorArgs Empty = new GetConnectorArgs();

    /**
     * Name of the cloud account connector
     * 
     */
    @InputImport(name="connectorName", required=true)
      private final String connectorName;

    public String getConnectorName() {
        return this.connectorName;
    }

    public GetConnectorArgs(String connectorName) {
        this.connectorName = Objects.requireNonNull(connectorName, "expected parameter 'connectorName' to be non-null");
    }

    private GetConnectorArgs() {
        this.connectorName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectorName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorName = defaults.connectorName;
        }

        public Builder setConnectorName(String connectorName) {
            this.connectorName = Objects.requireNonNull(connectorName);
            return this;
        }
        public GetConnectorArgs build() {
            return new GetConnectorArgs(connectorName);
        }
    }
}
