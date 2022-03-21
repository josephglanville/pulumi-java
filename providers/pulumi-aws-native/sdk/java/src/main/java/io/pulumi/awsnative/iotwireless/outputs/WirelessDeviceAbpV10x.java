// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.outputs;

import io.pulumi.awsnative.iotwireless.outputs.WirelessDeviceSessionKeysAbpV10x;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class WirelessDeviceAbpV10x {
    private final String devAddr;
    private final WirelessDeviceSessionKeysAbpV10x sessionKeys;

    @CustomType.Constructor
    private WirelessDeviceAbpV10x(
        @CustomType.Parameter("devAddr") String devAddr,
        @CustomType.Parameter("sessionKeys") WirelessDeviceSessionKeysAbpV10x sessionKeys) {
        this.devAddr = devAddr;
        this.sessionKeys = sessionKeys;
    }

    public String getDevAddr() {
        return this.devAddr;
    }
    public WirelessDeviceSessionKeysAbpV10x getSessionKeys() {
        return this.sessionKeys;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessDeviceAbpV10x defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String devAddr;
        private WirelessDeviceSessionKeysAbpV10x sessionKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessDeviceAbpV10x defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.devAddr = defaults.devAddr;
    	      this.sessionKeys = defaults.sessionKeys;
        }

        public Builder devAddr(String devAddr) {
            this.devAddr = Objects.requireNonNull(devAddr);
            return this;
        }
        public Builder sessionKeys(WirelessDeviceSessionKeysAbpV10x sessionKeys) {
            this.sessionKeys = Objects.requireNonNull(sessionKeys);
            return this;
        }        public WirelessDeviceAbpV10x build() {
            return new WirelessDeviceAbpV10x(devAddr, sessionKeys);
        }
    }
}
