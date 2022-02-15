// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.analysisservices;

import io.pulumi.azurenative.analysisservices.enums.ConnectionMode;
import io.pulumi.azurenative.analysisservices.inputs.GatewayDetailsArgs;
import io.pulumi.azurenative.analysisservices.inputs.IPv4FirewallSettingsArgs;
import io.pulumi.azurenative.analysisservices.inputs.ResourceSkuArgs;
import io.pulumi.azurenative.analysisservices.inputs.ServerAdministratorsArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ServerDetailsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerDetailsArgs Empty = new ServerDetailsArgs();

    @InputImport(name="asAdministrators")
    private final @Nullable Input<ServerAdministratorsArgs> asAdministrators;

    public Input<ServerAdministratorsArgs> getAsAdministrators() {
        return this.asAdministrators == null ? Input.empty() : this.asAdministrators;
    }

    @InputImport(name="backupBlobContainerUri")
    private final @Nullable Input<String> backupBlobContainerUri;

    public Input<String> getBackupBlobContainerUri() {
        return this.backupBlobContainerUri == null ? Input.empty() : this.backupBlobContainerUri;
    }

    @InputImport(name="gatewayDetails")
    private final @Nullable Input<GatewayDetailsArgs> gatewayDetails;

    public Input<GatewayDetailsArgs> getGatewayDetails() {
        return this.gatewayDetails == null ? Input.empty() : this.gatewayDetails;
    }

    @InputImport(name="ipV4FirewallSettings")
    private final @Nullable Input<IPv4FirewallSettingsArgs> ipV4FirewallSettings;

    public Input<IPv4FirewallSettingsArgs> getIpV4FirewallSettings() {
        return this.ipV4FirewallSettings == null ? Input.empty() : this.ipV4FirewallSettings;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="managedMode")
    private final @Nullable Input<Integer> managedMode;

    public Input<Integer> getManagedMode() {
        return this.managedMode == null ? Input.empty() : this.managedMode;
    }

    @InputImport(name="querypoolConnectionMode")
    private final @Nullable Input<ConnectionMode> querypoolConnectionMode;

    public Input<ConnectionMode> getQuerypoolConnectionMode() {
        return this.querypoolConnectionMode == null ? Input.empty() : this.querypoolConnectionMode;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="serverMonitorMode")
    private final @Nullable Input<Integer> serverMonitorMode;

    public Input<Integer> getServerMonitorMode() {
        return this.serverMonitorMode == null ? Input.empty() : this.serverMonitorMode;
    }

    @InputImport(name="serverName")
    private final @Nullable Input<String> serverName;

    public Input<String> getServerName() {
        return this.serverName == null ? Input.empty() : this.serverName;
    }

    @InputImport(name="sku", required=true)
    private final Input<ResourceSkuArgs> sku;

    public Input<ResourceSkuArgs> getSku() {
        return this.sku;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public ServerDetailsArgs(
        @Nullable Input<ServerAdministratorsArgs> asAdministrators,
        @Nullable Input<String> backupBlobContainerUri,
        @Nullable Input<GatewayDetailsArgs> gatewayDetails,
        @Nullable Input<IPv4FirewallSettingsArgs> ipV4FirewallSettings,
        @Nullable Input<String> location,
        @Nullable Input<Integer> managedMode,
        @Nullable Input<ConnectionMode> querypoolConnectionMode,
        Input<String> resourceGroupName,
        @Nullable Input<Integer> serverMonitorMode,
        @Nullable Input<String> serverName,
        Input<ResourceSkuArgs> sku,
        @Nullable Input<Map<String,String>> tags) {
        this.asAdministrators = asAdministrators;
        this.backupBlobContainerUri = backupBlobContainerUri;
        this.gatewayDetails = gatewayDetails;
        this.ipV4FirewallSettings = ipV4FirewallSettings;
        this.location = location;
        this.managedMode = managedMode == null ? Input.ofNullable(1) : managedMode;
        this.querypoolConnectionMode = querypoolConnectionMode == null ? Input.ofNullable(io.pulumi.azurenative.analysisservices.enums.ConnectionMode.All) : querypoolConnectionMode;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.serverMonitorMode = serverMonitorMode == null ? Input.ofNullable(1) : serverMonitorMode;
        this.serverName = serverName;
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
        this.tags = tags;
    }

    private ServerDetailsArgs() {
        this.asAdministrators = Input.empty();
        this.backupBlobContainerUri = Input.empty();
        this.gatewayDetails = Input.empty();
        this.ipV4FirewallSettings = Input.empty();
        this.location = Input.empty();
        this.managedMode = Input.empty();
        this.querypoolConnectionMode = Input.empty();
        this.resourceGroupName = Input.empty();
        this.serverMonitorMode = Input.empty();
        this.serverName = Input.empty();
        this.sku = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerDetailsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<ServerAdministratorsArgs> asAdministrators;
        private @Nullable Input<String> backupBlobContainerUri;
        private @Nullable Input<GatewayDetailsArgs> gatewayDetails;
        private @Nullable Input<IPv4FirewallSettingsArgs> ipV4FirewallSettings;
        private @Nullable Input<String> location;
        private @Nullable Input<Integer> managedMode;
        private @Nullable Input<ConnectionMode> querypoolConnectionMode;
        private Input<String> resourceGroupName;
        private @Nullable Input<Integer> serverMonitorMode;
        private @Nullable Input<String> serverName;
        private Input<ResourceSkuArgs> sku;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerDetailsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.asAdministrators = defaults.asAdministrators;
    	      this.backupBlobContainerUri = defaults.backupBlobContainerUri;
    	      this.gatewayDetails = defaults.gatewayDetails;
    	      this.ipV4FirewallSettings = defaults.ipV4FirewallSettings;
    	      this.location = defaults.location;
    	      this.managedMode = defaults.managedMode;
    	      this.querypoolConnectionMode = defaults.querypoolConnectionMode;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.serverMonitorMode = defaults.serverMonitorMode;
    	      this.serverName = defaults.serverName;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
        }

        public Builder setAsAdministrators(@Nullable Input<ServerAdministratorsArgs> asAdministrators) {
            this.asAdministrators = asAdministrators;
            return this;
        }

        public Builder setAsAdministrators(@Nullable ServerAdministratorsArgs asAdministrators) {
            this.asAdministrators = Input.ofNullable(asAdministrators);
            return this;
        }

        public Builder setBackupBlobContainerUri(@Nullable Input<String> backupBlobContainerUri) {
            this.backupBlobContainerUri = backupBlobContainerUri;
            return this;
        }

        public Builder setBackupBlobContainerUri(@Nullable String backupBlobContainerUri) {
            this.backupBlobContainerUri = Input.ofNullable(backupBlobContainerUri);
            return this;
        }

        public Builder setGatewayDetails(@Nullable Input<GatewayDetailsArgs> gatewayDetails) {
            this.gatewayDetails = gatewayDetails;
            return this;
        }

        public Builder setGatewayDetails(@Nullable GatewayDetailsArgs gatewayDetails) {
            this.gatewayDetails = Input.ofNullable(gatewayDetails);
            return this;
        }

        public Builder setIpV4FirewallSettings(@Nullable Input<IPv4FirewallSettingsArgs> ipV4FirewallSettings) {
            this.ipV4FirewallSettings = ipV4FirewallSettings;
            return this;
        }

        public Builder setIpV4FirewallSettings(@Nullable IPv4FirewallSettingsArgs ipV4FirewallSettings) {
            this.ipV4FirewallSettings = Input.ofNullable(ipV4FirewallSettings);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setManagedMode(@Nullable Input<Integer> managedMode) {
            this.managedMode = managedMode;
            return this;
        }

        public Builder setManagedMode(@Nullable Integer managedMode) {
            this.managedMode = Input.ofNullable(managedMode);
            return this;
        }

        public Builder setQuerypoolConnectionMode(@Nullable Input<ConnectionMode> querypoolConnectionMode) {
            this.querypoolConnectionMode = querypoolConnectionMode;
            return this;
        }

        public Builder setQuerypoolConnectionMode(@Nullable ConnectionMode querypoolConnectionMode) {
            this.querypoolConnectionMode = Input.ofNullable(querypoolConnectionMode);
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

        public Builder setServerMonitorMode(@Nullable Input<Integer> serverMonitorMode) {
            this.serverMonitorMode = serverMonitorMode;
            return this;
        }

        public Builder setServerMonitorMode(@Nullable Integer serverMonitorMode) {
            this.serverMonitorMode = Input.ofNullable(serverMonitorMode);
            return this;
        }

        public Builder setServerName(@Nullable Input<String> serverName) {
            this.serverName = serverName;
            return this;
        }

        public Builder setServerName(@Nullable String serverName) {
            this.serverName = Input.ofNullable(serverName);
            return this;
        }

        public Builder setSku(Input<ResourceSkuArgs> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setSku(ResourceSkuArgs sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public ServerDetailsArgs build() {
            return new ServerDetailsArgs(asAdministrators, backupBlobContainerUri, gatewayDetails, ipV4FirewallSettings, location, managedMode, querypoolConnectionMode, resourceGroupName, serverMonitorMode, serverName, sku, tags);
        }
    }
}