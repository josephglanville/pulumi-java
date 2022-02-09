// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.customerinsights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetConnectorMappingArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetConnectorMappingArgs Empty = new GetConnectorMappingArgs();

    @InputImport(name="connectorName", required=true)
    private final String connectorName;

    public String getConnectorName() {
        return this.connectorName;
    }

    @InputImport(name="hubName", required=true)
    private final String hubName;

    public String getHubName() {
        return this.hubName;
    }

    @InputImport(name="mappingName", required=true)
    private final String mappingName;

    public String getMappingName() {
        return this.mappingName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetConnectorMappingArgs(
        String connectorName,
        String hubName,
        String mappingName,
        String resourceGroupName) {
        this.connectorName = Objects.requireNonNull(connectorName, "expected parameter 'connectorName' to be non-null");
        this.hubName = Objects.requireNonNull(hubName, "expected parameter 'hubName' to be non-null");
        this.mappingName = Objects.requireNonNull(mappingName, "expected parameter 'mappingName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetConnectorMappingArgs() {
        this.connectorName = null;
        this.hubName = null;
        this.mappingName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConnectorMappingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String connectorName;
        private String hubName;
        private String mappingName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConnectorMappingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.connectorName = defaults.connectorName;
    	      this.hubName = defaults.hubName;
    	      this.mappingName = defaults.mappingName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder setConnectorName(String connectorName) {
            this.connectorName = Objects.requireNonNull(connectorName);
            return this;
        }

        public Builder setHubName(String hubName) {
            this.hubName = Objects.requireNonNull(hubName);
            return this;
        }

        public Builder setMappingName(String mappingName) {
            this.mappingName = Objects.requireNonNull(mappingName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public GetConnectorMappingArgs build() {
            return new GetConnectorMappingArgs(connectorName, hubName, mappingName, resourceGroupName);
        }
    }
}
