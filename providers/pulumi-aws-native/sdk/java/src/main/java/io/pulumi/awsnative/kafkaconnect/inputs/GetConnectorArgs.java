// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kafkaconnect.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetConnectorArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConnectorArgs Empty = new GetConnectorArgs();

    /**
     * Amazon Resource Name for the created Connector.
     * 
     */
    @Import(name="connectorArn", required=true)
      private final String connectorArn;

    public String getConnectorArn() {
        return this.connectorArn;
    }

    public GetConnectorArgs(String connectorArn) {
        this.connectorArn = Objects.requireNonNull(connectorArn, "expected parameter 'connectorArn' to be non-null");
    }

    private GetConnectorArgs() {
        this.connectorArn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectorArn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectorArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorArn = defaults.connectorArn;
        }

        public Builder connectorArn(String connectorArn) {
            this.connectorArn = Objects.requireNonNull(connectorArn);
            return this;
        }        public GetConnectorArgs build() {
            return new GetConnectorArgs(connectorArn);
        }
    }
}
