// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventhub.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetSchemaRegistryArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetSchemaRegistryArgs Empty = new GetSchemaRegistryArgs();

    @InputImport(name="namespaceName", required=true)
    private final String namespaceName;

    public String getNamespaceName() {
        return this.namespaceName;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="schemaGroupName", required=true)
    private final String schemaGroupName;

    public String getSchemaGroupName() {
        return this.schemaGroupName;
    }

    public GetSchemaRegistryArgs(
        String namespaceName,
        String resourceGroupName,
        String schemaGroupName) {
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.schemaGroupName = Objects.requireNonNull(schemaGroupName, "expected parameter 'schemaGroupName' to be non-null");
    }

    private GetSchemaRegistryArgs() {
        this.namespaceName = null;
        this.resourceGroupName = null;
        this.schemaGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSchemaRegistryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String namespaceName;
        private String resourceGroupName;
        private String schemaGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetSchemaRegistryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.schemaGroupName = defaults.schemaGroupName;
        }

        public Builder setNamespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setSchemaGroupName(String schemaGroupName) {
            this.schemaGroupName = Objects.requireNonNull(schemaGroupName);
            return this;
        }

        public GetSchemaRegistryArgs build() {
            return new GetSchemaRegistryArgs(namespaceName, resourceGroupName, schemaGroupName);
        }
    }
}
