// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.cloudiot_v1;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.cloudiot_v1.enums.DeviceLogLevel;
import io.pulumi.googlenative.cloudiot_v1.inputs.DeviceConfigArgs;
import io.pulumi.googlenative.cloudiot_v1.inputs.DeviceCredentialArgs;
import io.pulumi.googlenative.cloudiot_v1.inputs.GatewayConfigArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class DeviceArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeviceArgs Empty = new DeviceArgs();

    /**
     * If a device is blocked, connections or requests from this device will fail. Can be used to temporarily prevent the device from connecting if, for example, the sensor is generating bad data and needs maintenance.
     * 
     */
    @Import(name="blocked")
      private final @Nullable Output<Boolean> blocked;

    public Output<Boolean> getBlocked() {
        return this.blocked == null ? Output.empty() : this.blocked;
    }

    /**
     * The most recent device configuration, which is eventually sent from Cloud IoT Core to the device. If not present on creation, the configuration will be initialized with an empty payload and version value of `1`. To update this field after creation, use the `DeviceManager.ModifyCloudToDeviceConfig` method.
     * 
     */
    @Import(name="config")
      private final @Nullable Output<DeviceConfigArgs> config;

    public Output<DeviceConfigArgs> getConfig() {
        return this.config == null ? Output.empty() : this.config;
    }

    /**
     * The credentials used to authenticate this device. To allow credential rotation without interruption, multiple device credentials can be bound to this device. No more than 3 credentials can be bound to a single device at a time. When new credentials are added to a device, they are verified against the registry credentials. For details, see the description of the `DeviceRegistry.credentials` field.
     * 
     */
    @Import(name="credentials")
      private final @Nullable Output<List<DeviceCredentialArgs>> credentials;

    public Output<List<DeviceCredentialArgs>> getCredentials() {
        return this.credentials == null ? Output.empty() : this.credentials;
    }

    /**
     * Gateway-related configuration and state.
     * 
     */
    @Import(name="gatewayConfig")
      private final @Nullable Output<GatewayConfigArgs> gatewayConfig;

    public Output<GatewayConfigArgs> getGatewayConfig() {
        return this.gatewayConfig == null ? Output.empty() : this.gatewayConfig;
    }

    /**
     * The user-defined device identifier. The device ID must be unique within a device registry.
     * 
     */
    @Import(name="id")
      private final @Nullable Output<String> id;

    public Output<String> getId() {
        return this.id == null ? Output.empty() : this.id;
    }

    @Import(name="location")
      private final @Nullable Output<String> location;

    public Output<String> getLocation() {
        return this.location == null ? Output.empty() : this.location;
    }

    /**
     * **Beta Feature** The logging verbosity for device activity. If unspecified, DeviceRegistry.log_level will be used.
     * 
     */
    @Import(name="logLevel")
      private final @Nullable Output<DeviceLogLevel> logLevel;

    public Output<DeviceLogLevel> getLogLevel() {
        return this.logLevel == null ? Output.empty() : this.logLevel;
    }

    /**
     * The metadata key-value pairs assigned to the device. This metadata is not interpreted or indexed by Cloud IoT Core. It can be used to add contextual information for the device. Keys must conform to the regular expression a-zA-Z+ and be less than 128 bytes in length. Values are free-form strings. Each value must be less than or equal to 32 KB in size. The total size of all keys and values must be less than 256 KB, and the maximum number of key-value pairs is 500.
     * 
     */
    @Import(name="metadata")
      private final @Nullable Output<Map<String,String>> metadata;

    public Output<Map<String,String>> getMetadata() {
        return this.metadata == null ? Output.empty() : this.metadata;
    }

    /**
     * The resource path name. For example, `projects/p1/locations/us-central1/registries/registry0/devices/dev0` or `projects/p1/locations/us-central1/registries/registry0/devices/{num_id}`. When `name` is populated as a response from the service, it always ends in the device numeric ID.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    @Import(name="registryId", required=true)
      private final Output<String> registryId;

    public Output<String> getRegistryId() {
        return this.registryId;
    }

    public DeviceArgs(
        @Nullable Output<Boolean> blocked,
        @Nullable Output<DeviceConfigArgs> config,
        @Nullable Output<List<DeviceCredentialArgs>> credentials,
        @Nullable Output<GatewayConfigArgs> gatewayConfig,
        @Nullable Output<String> id,
        @Nullable Output<String> location,
        @Nullable Output<DeviceLogLevel> logLevel,
        @Nullable Output<Map<String,String>> metadata,
        @Nullable Output<String> name,
        @Nullable Output<String> project,
        Output<String> registryId) {
        this.blocked = blocked;
        this.config = config;
        this.credentials = credentials;
        this.gatewayConfig = gatewayConfig;
        this.id = id;
        this.location = location;
        this.logLevel = logLevel;
        this.metadata = metadata;
        this.name = name;
        this.project = project;
        this.registryId = Objects.requireNonNull(registryId, "expected parameter 'registryId' to be non-null");
    }

    private DeviceArgs() {
        this.blocked = Output.empty();
        this.config = Output.empty();
        this.credentials = Output.empty();
        this.gatewayConfig = Output.empty();
        this.id = Output.empty();
        this.location = Output.empty();
        this.logLevel = Output.empty();
        this.metadata = Output.empty();
        this.name = Output.empty();
        this.project = Output.empty();
        this.registryId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeviceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> blocked;
        private @Nullable Output<DeviceConfigArgs> config;
        private @Nullable Output<List<DeviceCredentialArgs>> credentials;
        private @Nullable Output<GatewayConfigArgs> gatewayConfig;
        private @Nullable Output<String> id;
        private @Nullable Output<String> location;
        private @Nullable Output<DeviceLogLevel> logLevel;
        private @Nullable Output<Map<String,String>> metadata;
        private @Nullable Output<String> name;
        private @Nullable Output<String> project;
        private Output<String> registryId;

        public Builder() {
    	      // Empty
        }

        public Builder(DeviceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.blocked = defaults.blocked;
    	      this.config = defaults.config;
    	      this.credentials = defaults.credentials;
    	      this.gatewayConfig = defaults.gatewayConfig;
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.logLevel = defaults.logLevel;
    	      this.metadata = defaults.metadata;
    	      this.name = defaults.name;
    	      this.project = defaults.project;
    	      this.registryId = defaults.registryId;
        }

        public Builder blocked(@Nullable Output<Boolean> blocked) {
            this.blocked = blocked;
            return this;
        }
        public Builder blocked(@Nullable Boolean blocked) {
            this.blocked = Output.ofNullable(blocked);
            return this;
        }
        public Builder config(@Nullable Output<DeviceConfigArgs> config) {
            this.config = config;
            return this;
        }
        public Builder config(@Nullable DeviceConfigArgs config) {
            this.config = Output.ofNullable(config);
            return this;
        }
        public Builder credentials(@Nullable Output<List<DeviceCredentialArgs>> credentials) {
            this.credentials = credentials;
            return this;
        }
        public Builder credentials(@Nullable List<DeviceCredentialArgs> credentials) {
            this.credentials = Output.ofNullable(credentials);
            return this;
        }
        public Builder credentials(DeviceCredentialArgs... credentials) {
            return credentials(List.of(credentials));
        }
        public Builder gatewayConfig(@Nullable Output<GatewayConfigArgs> gatewayConfig) {
            this.gatewayConfig = gatewayConfig;
            return this;
        }
        public Builder gatewayConfig(@Nullable GatewayConfigArgs gatewayConfig) {
            this.gatewayConfig = Output.ofNullable(gatewayConfig);
            return this;
        }
        public Builder id(@Nullable Output<String> id) {
            this.id = id;
            return this;
        }
        public Builder id(@Nullable String id) {
            this.id = Output.ofNullable(id);
            return this;
        }
        public Builder location(@Nullable Output<String> location) {
            this.location = location;
            return this;
        }
        public Builder location(@Nullable String location) {
            this.location = Output.ofNullable(location);
            return this;
        }
        public Builder logLevel(@Nullable Output<DeviceLogLevel> logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public Builder logLevel(@Nullable DeviceLogLevel logLevel) {
            this.logLevel = Output.ofNullable(logLevel);
            return this;
        }
        public Builder metadata(@Nullable Output<Map<String,String>> metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder metadata(@Nullable Map<String,String> metadata) {
            this.metadata = Output.ofNullable(metadata);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder project(@Nullable Output<String> project) {
            this.project = project;
            return this;
        }
        public Builder project(@Nullable String project) {
            this.project = Output.ofNullable(project);
            return this;
        }
        public Builder registryId(Output<String> registryId) {
            this.registryId = Objects.requireNonNull(registryId);
            return this;
        }
        public Builder registryId(String registryId) {
            this.registryId = Output.of(Objects.requireNonNull(registryId));
            return this;
        }        public DeviceArgs build() {
            return new DeviceArgs(blocked, config, credentials, gatewayConfig, id, location, logLevel, metadata, name, project, registryId);
        }
    }
}
