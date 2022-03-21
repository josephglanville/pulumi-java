// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicebus.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetMigrationConfigArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetMigrationConfigArgs Empty = new GetMigrationConfigArgs();

    /**
     * The configuration name. Should always be "$default".
     * 
     */
    @Import(name="configName", required=true)
      private final String configName;

    public String getConfigName() {
        return this.configName;
    }

    /**
     * The namespace name
     * 
     */
    @Import(name="namespaceName", required=true)
      private final String namespaceName;

    public String getNamespaceName() {
        return this.namespaceName;
    }

    /**
     * Name of the Resource group within the Azure subscription.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public GetMigrationConfigArgs(
        String configName,
        String namespaceName,
        String resourceGroupName) {
        this.configName = Objects.requireNonNull(configName, "expected parameter 'configName' to be non-null");
        this.namespaceName = Objects.requireNonNull(namespaceName, "expected parameter 'namespaceName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
    }

    private GetMigrationConfigArgs() {
        this.configName = null;
        this.namespaceName = null;
        this.resourceGroupName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetMigrationConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String configName;
        private String namespaceName;
        private String resourceGroupName;

        public Builder() {
    	      // Empty
        }

        public Builder(GetMigrationConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.configName = defaults.configName;
    	      this.namespaceName = defaults.namespaceName;
    	      this.resourceGroupName = defaults.resourceGroupName;
        }

        public Builder configName(String configName) {
            this.configName = Objects.requireNonNull(configName);
            return this;
        }
        public Builder namespaceName(String namespaceName) {
            this.namespaceName = Objects.requireNonNull(namespaceName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }        public GetMigrationConfigArgs build() {
            return new GetMigrationConfigArgs(configName, namespaceName, resourceGroupName);
        }
    }
}
