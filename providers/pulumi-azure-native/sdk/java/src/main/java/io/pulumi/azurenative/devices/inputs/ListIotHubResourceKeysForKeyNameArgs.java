// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ListIotHubResourceKeysForKeyNameArgs extends io.pulumi.resources.InvokeArgs {

    public static final ListIotHubResourceKeysForKeyNameArgs Empty = new ListIotHubResourceKeysForKeyNameArgs();

    /**
     * The name of the shared access policy.
     * 
     */
    @Import(name="keyName", required=true)
      private final String keyName;

    public String getKeyName() {
        return this.keyName;
    }

    /**
     * The name of the resource group that contains the IoT hub.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final String resourceGroupName;

    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the IoT hub.
     * 
     */
    @Import(name="resourceName", required=true)
      private final String resourceName;

    public String getPropResourceName() {
        return this.resourceName;
    }

    public ListIotHubResourceKeysForKeyNameArgs(
        String keyName,
        String resourceGroupName,
        String resourceName) {
        this.keyName = Objects.requireNonNull(keyName, "expected parameter 'keyName' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private ListIotHubResourceKeysForKeyNameArgs() {
        this.keyName = null;
        this.resourceGroupName = null;
        this.resourceName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ListIotHubResourceKeysForKeyNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String keyName;
        private String resourceGroupName;
        private String resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(ListIotHubResourceKeysForKeyNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keyName = defaults.keyName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder keyName(String keyName) {
            this.keyName = Objects.requireNonNull(keyName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }        public ListIotHubResourceKeysForKeyNameArgs build() {
            return new ListIotHubResourceKeysForKeyNameArgs(keyName, resourceGroupName, resourceName);
        }
    }
}
