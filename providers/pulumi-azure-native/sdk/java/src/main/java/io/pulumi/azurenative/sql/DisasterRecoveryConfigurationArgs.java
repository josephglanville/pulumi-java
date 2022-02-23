// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sql;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DisasterRecoveryConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DisasterRecoveryConfigurationArgs Empty = new DisasterRecoveryConfigurationArgs();

    /**
     * The name of the disaster recovery configuration to be created/updated.
     * 
     */
    @InputImport(name="disasterRecoveryConfigurationName")
      private final @Nullable Input<String> disasterRecoveryConfigurationName;

    public Input<String> getDisasterRecoveryConfigurationName() {
        return this.disasterRecoveryConfigurationName == null ? Input.empty() : this.disasterRecoveryConfigurationName;
    }

    /**
     * The name of the resource group that contains the resource. You can obtain this value from the Azure Resource Manager API or the portal.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the server.
     * 
     */
    @InputImport(name="serverName", required=true)
      private final Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName;
    }

    public DisasterRecoveryConfigurationArgs(
        @Nullable Input<String> disasterRecoveryConfigurationName,
        Input<String> resourceGroupName,
        Input<String> serverName) {
        this.disasterRecoveryConfigurationName = disasterRecoveryConfigurationName;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverName = Objects.requireNonNull(serverName, "expected parameter 'serverName' to be non-null");
    }

    private DisasterRecoveryConfigurationArgs() {
        this.disasterRecoveryConfigurationName = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serverName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DisasterRecoveryConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> disasterRecoveryConfigurationName;
        private Input<String> resourceGroupName;
        private Input<String> serverName;

        public Builder() {
    	      // Empty
        }

        public Builder(DisasterRecoveryConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.disasterRecoveryConfigurationName = defaults.disasterRecoveryConfigurationName;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverName = defaults.serverName;
        }

        public Builder setDisasterRecoveryConfigurationName(@Nullable Input<String> disasterRecoveryConfigurationName) {
            this.disasterRecoveryConfigurationName = disasterRecoveryConfigurationName;
            return this;
        }

        public Builder setDisasterRecoveryConfigurationName(@Nullable String disasterRecoveryConfigurationName) {
            this.disasterRecoveryConfigurationName = Input.ofNullable(disasterRecoveryConfigurationName);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setServerName(Input<String> serverName) {
            this.serverName = Objects.requireNonNull(serverName);
            return this;
        }

        public Builder setServerName(String serverName) {
            this.serverName = Input.of(Objects.requireNonNull(serverName));
            return this;
        }
        public DisasterRecoveryConfigurationArgs build() {
            return new DisasterRecoveryConfigurationArgs(disasterRecoveryConfigurationName, resourceGroupName, serverName);
        }
    }
}
