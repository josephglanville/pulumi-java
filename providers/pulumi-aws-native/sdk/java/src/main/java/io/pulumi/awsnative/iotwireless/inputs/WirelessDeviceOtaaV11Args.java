// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class WirelessDeviceOtaaV11Args extends io.pulumi.resources.ResourceArgs {

    public static final WirelessDeviceOtaaV11Args Empty = new WirelessDeviceOtaaV11Args();

    @Import(name="appKey", required=true)
      private final Output<String> appKey;

    public Output<String> getAppKey() {
        return this.appKey;
    }

    @Import(name="joinEui", required=true)
      private final Output<String> joinEui;

    public Output<String> getJoinEui() {
        return this.joinEui;
    }

    @Import(name="nwkKey", required=true)
      private final Output<String> nwkKey;

    public Output<String> getNwkKey() {
        return this.nwkKey;
    }

    public WirelessDeviceOtaaV11Args(
        Output<String> appKey,
        Output<String> joinEui,
        Output<String> nwkKey) {
        this.appKey = Objects.requireNonNull(appKey, "expected parameter 'appKey' to be non-null");
        this.joinEui = Objects.requireNonNull(joinEui, "expected parameter 'joinEui' to be non-null");
        this.nwkKey = Objects.requireNonNull(nwkKey, "expected parameter 'nwkKey' to be non-null");
    }

    private WirelessDeviceOtaaV11Args() {
        this.appKey = Codegen.empty();
        this.joinEui = Codegen.empty();
        this.nwkKey = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessDeviceOtaaV11Args defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> appKey;
        private Output<String> joinEui;
        private Output<String> nwkKey;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessDeviceOtaaV11Args defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.appKey = defaults.appKey;
    	      this.joinEui = defaults.joinEui;
    	      this.nwkKey = defaults.nwkKey;
        }

        public Builder appKey(Output<String> appKey) {
            this.appKey = Objects.requireNonNull(appKey);
            return this;
        }
        public Builder appKey(String appKey) {
            this.appKey = Output.of(Objects.requireNonNull(appKey));
            return this;
        }
        public Builder joinEui(Output<String> joinEui) {
            this.joinEui = Objects.requireNonNull(joinEui);
            return this;
        }
        public Builder joinEui(String joinEui) {
            this.joinEui = Output.of(Objects.requireNonNull(joinEui));
            return this;
        }
        public Builder nwkKey(Output<String> nwkKey) {
            this.nwkKey = Objects.requireNonNull(nwkKey);
            return this;
        }
        public Builder nwkKey(String nwkKey) {
            this.nwkKey = Output.of(Objects.requireNonNull(nwkKey));
            return this;
        }        public WirelessDeviceOtaaV11Args build() {
            return new WirelessDeviceOtaaV11Args(appKey, joinEui, nwkKey);
        }
    }
}
