// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.connectedvmwarevsphere.inputs;

import io.pulumi.azurenative.connectedvmwarevsphere.enums.NICType;
import io.pulumi.azurenative.connectedvmwarevsphere.enums.PowerOnBootOption;
import io.pulumi.azurenative.connectedvmwarevsphere.inputs.NicIPSettingsArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class NetworkInterfaceArgs extends io.pulumi.resources.ResourceArgs {

    public static final NetworkInterfaceArgs Empty = new NetworkInterfaceArgs();

    @InputImport(name="deviceKey")
    private final @Nullable Input<Integer> deviceKey;

    public Input<Integer> getDeviceKey() {
        return this.deviceKey == null ? Input.empty() : this.deviceKey;
    }

    @InputImport(name="ipSettings")
    private final @Nullable Input<NicIPSettingsArgs> ipSettings;

    public Input<NicIPSettingsArgs> getIpSettings() {
        return this.ipSettings == null ? Input.empty() : this.ipSettings;
    }

    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    @InputImport(name="networkId")
    private final @Nullable Input<String> networkId;

    public Input<String> getNetworkId() {
        return this.networkId == null ? Input.empty() : this.networkId;
    }

    @InputImport(name="nicType")
    private final @Nullable Input<Either<String,NICType>> nicType;

    public Input<Either<String,NICType>> getNicType() {
        return this.nicType == null ? Input.empty() : this.nicType;
    }

    @InputImport(name="powerOnBoot")
    private final @Nullable Input<Either<String,PowerOnBootOption>> powerOnBoot;

    public Input<Either<String,PowerOnBootOption>> getPowerOnBoot() {
        return this.powerOnBoot == null ? Input.empty() : this.powerOnBoot;
    }

    public NetworkInterfaceArgs(
        @Nullable Input<Integer> deviceKey,
        @Nullable Input<NicIPSettingsArgs> ipSettings,
        @Nullable Input<String> name,
        @Nullable Input<String> networkId,
        @Nullable Input<Either<String,NICType>> nicType,
        @Nullable Input<Either<String,PowerOnBootOption>> powerOnBoot) {
        this.deviceKey = deviceKey;
        this.ipSettings = ipSettings;
        this.name = name;
        this.networkId = networkId;
        this.nicType = nicType;
        this.powerOnBoot = powerOnBoot;
    }

    private NetworkInterfaceArgs() {
        this.deviceKey = Input.empty();
        this.ipSettings = Input.empty();
        this.name = Input.empty();
        this.networkId = Input.empty();
        this.nicType = Input.empty();
        this.powerOnBoot = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NetworkInterfaceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> deviceKey;
        private @Nullable Input<NicIPSettingsArgs> ipSettings;
        private @Nullable Input<String> name;
        private @Nullable Input<String> networkId;
        private @Nullable Input<Either<String,NICType>> nicType;
        private @Nullable Input<Either<String,PowerOnBootOption>> powerOnBoot;

        public Builder() {
    	      // Empty
        }

        public Builder(NetworkInterfaceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceKey = defaults.deviceKey;
    	      this.ipSettings = defaults.ipSettings;
    	      this.name = defaults.name;
    	      this.networkId = defaults.networkId;
    	      this.nicType = defaults.nicType;
    	      this.powerOnBoot = defaults.powerOnBoot;
        }

        public Builder setDeviceKey(@Nullable Input<Integer> deviceKey) {
            this.deviceKey = deviceKey;
            return this;
        }

        public Builder setDeviceKey(@Nullable Integer deviceKey) {
            this.deviceKey = Input.ofNullable(deviceKey);
            return this;
        }

        public Builder setIpSettings(@Nullable Input<NicIPSettingsArgs> ipSettings) {
            this.ipSettings = ipSettings;
            return this;
        }

        public Builder setIpSettings(@Nullable NicIPSettingsArgs ipSettings) {
            this.ipSettings = Input.ofNullable(ipSettings);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setNetworkId(@Nullable Input<String> networkId) {
            this.networkId = networkId;
            return this;
        }

        public Builder setNetworkId(@Nullable String networkId) {
            this.networkId = Input.ofNullable(networkId);
            return this;
        }

        public Builder setNicType(@Nullable Input<Either<String,NICType>> nicType) {
            this.nicType = nicType;
            return this;
        }

        public Builder setNicType(@Nullable Either<String,NICType> nicType) {
            this.nicType = Input.ofNullable(nicType);
            return this;
        }

        public Builder setPowerOnBoot(@Nullable Input<Either<String,PowerOnBootOption>> powerOnBoot) {
            this.powerOnBoot = powerOnBoot;
            return this;
        }

        public Builder setPowerOnBoot(@Nullable Either<String,PowerOnBootOption> powerOnBoot) {
            this.powerOnBoot = Input.ofNullable(powerOnBoot);
            return this;
        }

        public NetworkInterfaceArgs build() {
            return new NetworkInterfaceArgs(deviceKey, ipSettings, name, networkId, nicType, powerOnBoot);
        }
    }
}
