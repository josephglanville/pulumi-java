// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deviceupdate;

import io.pulumi.azurenative.deviceupdate.inputs.DiagnosticStoragePropertiesArgs;
import io.pulumi.azurenative.deviceupdate.inputs.IotHubSettingsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceArgs Empty = new InstanceArgs();

    /**
     * Account name.
     * 
     */
    @Import(name="accountName", required=true)
      private final Output<String> accountName;

    public Output<String> getAccountName() {
        return this.accountName;
    }

    /**
     * Customer-initiated diagnostic log collection storage properties
     * 
     */
    @Import(name="diagnosticStorageProperties")
      private final @Nullable Output<DiagnosticStoragePropertiesArgs> diagnosticStorageProperties;

    public Output<DiagnosticStoragePropertiesArgs> getDiagnosticStorageProperties() {
        return this.diagnosticStorageProperties == null ? Codegen.empty() : this.diagnosticStorageProperties;
    }

    /**
     * Enables or Disables the diagnostic logs collection
     * 
     */
    @Import(name="enableDiagnostics")
      private final @Nullable Output<Boolean> enableDiagnostics;

    public Output<Boolean> getEnableDiagnostics() {
        return this.enableDiagnostics == null ? Codegen.empty() : this.enableDiagnostics;
    }

    /**
     * Instance name.
     * 
     */
    @Import(name="instanceName")
      private final @Nullable Output<String> instanceName;

    public Output<String> getInstanceName() {
        return this.instanceName == null ? Codegen.empty() : this.instanceName;
    }

    /**
     * List of IoT Hubs associated with the account.
     * 
     */
    @Import(name="iotHubs")
      private final @Nullable Output<List<IotHubSettingsArgs>> iotHubs;

    public Output<List<IotHubSettingsArgs>> getIotHubs() {
        return this.iotHubs == null ? Codegen.empty() : this.iotHubs;
    }

    /**
     * The geo-location where the resource lives
     * 
     */
    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Codegen.empty() : this.location;
    }

    /**
     * The resource group name.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public InstanceArgs(
        Output<String> accountName,
        @Nullable Output<DiagnosticStoragePropertiesArgs> diagnosticStorageProperties,
        @Nullable Output<Boolean> enableDiagnostics,
        @Nullable Output<String> instanceName,
        @Nullable Output<List<IotHubSettingsArgs>> iotHubs,
        @Nullable Output<String> location,
        Output<String> resourceGroupName,
        @Nullable Output<Map<String,String>> tags) {
        this.accountName = Objects.requireNonNull(accountName, "expected parameter 'accountName' to be non-null");
        this.diagnosticStorageProperties = diagnosticStorageProperties;
        this.enableDiagnostics = enableDiagnostics;
        this.instanceName = instanceName;
        this.iotHubs = iotHubs;
        this.location = location;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private InstanceArgs() {
        this.accountName = Codegen.empty();
        this.diagnosticStorageProperties = Codegen.empty();
        this.enableDiagnostics = Codegen.empty();
        this.instanceName = Codegen.empty();
        this.iotHubs = Codegen.empty();
        this.location = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> accountName;
        private @Nullable Output<DiagnosticStoragePropertiesArgs> diagnosticStorageProperties;
        private @Nullable Output<Boolean> enableDiagnostics;
        private @Nullable Output<String> instanceName;
        private @Nullable Output<List<IotHubSettingsArgs>> iotHubs;
        private @Nullable Output<String> location;
        private Output<String> resourceGroupName;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.diagnosticStorageProperties = defaults.diagnosticStorageProperties;
    	      this.enableDiagnostics = defaults.enableDiagnostics;
    	      this.instanceName = defaults.instanceName;
    	      this.iotHubs = defaults.iotHubs;
    	      this.location = defaults.location;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder accountName(Output<String> accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }
        public Builder accountName(String accountName) {
            this.accountName = Output.of(Objects.requireNonNull(accountName));
            return this;
        }
        public Builder diagnosticStorageProperties(@Nullable Output<DiagnosticStoragePropertiesArgs> diagnosticStorageProperties) {
            this.diagnosticStorageProperties = diagnosticStorageProperties;
            return this;
        }
        public Builder diagnosticStorageProperties(@Nullable DiagnosticStoragePropertiesArgs diagnosticStorageProperties) {
            this.diagnosticStorageProperties = Codegen.ofNullable(diagnosticStorageProperties);
            return this;
        }
        public Builder enableDiagnostics(@Nullable Output<Boolean> enableDiagnostics) {
            this.enableDiagnostics = enableDiagnostics;
            return this;
        }
        public Builder enableDiagnostics(@Nullable Boolean enableDiagnostics) {
            this.enableDiagnostics = Codegen.ofNullable(enableDiagnostics);
            return this;
        }
        public Builder instanceName(@Nullable Output<String> instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public Builder instanceName(@Nullable String instanceName) {
            this.instanceName = Codegen.ofNullable(instanceName);
            return this;
        }
        public Builder iotHubs(@Nullable Output<List<IotHubSettingsArgs>> iotHubs) {
            this.iotHubs = iotHubs;
            return this;
        }
        public Builder iotHubs(@Nullable List<IotHubSettingsArgs> iotHubs) {
            this.iotHubs = Codegen.ofNullable(iotHubs);
            return this;
        }
        public Builder iotHubs(IotHubSettingsArgs... iotHubs) {
            return iotHubs(List.of(iotHubs));
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Codegen.ofNullable(location);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public InstanceArgs build() {
            return new InstanceArgs(accountName, diagnosticStorageProperties, enableDiagnostics, instanceName, iotHubs, location, resourceGroupName, tags);
        }
    }
}
