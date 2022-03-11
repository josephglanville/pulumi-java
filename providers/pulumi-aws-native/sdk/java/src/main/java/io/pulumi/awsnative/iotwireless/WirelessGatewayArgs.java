// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless;

import io.pulumi.awsnative.iotwireless.inputs.WirelessGatewayLoRaWANGatewayArgs;
import io.pulumi.awsnative.iotwireless.inputs.WirelessGatewayTagArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WirelessGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final WirelessGatewayArgs Empty = new WirelessGatewayArgs();

    /**
     * Description of Wireless Gateway.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Output.empty() : this.description;
    }

    /**
     * The date and time when the most recent uplink was received.
     * 
     */
    @InputImport(name="lastUplinkReceivedAt")
      private final @Nullable Output<String> lastUplinkReceivedAt;

    public Output<String> getLastUplinkReceivedAt() {
        return this.lastUplinkReceivedAt == null ? Output.empty() : this.lastUplinkReceivedAt;
    }

    /**
     * The combination of Package, Station and Model which represents the version of the LoRaWAN Wireless Gateway.
     * 
     */
    @InputImport(name="loRaWAN", required=true)
      private final Output<WirelessGatewayLoRaWANGatewayArgs> loRaWAN;

    public Output<WirelessGatewayLoRaWANGatewayArgs> getLoRaWAN() {
        return this.loRaWAN;
    }

    /**
     * Name of Wireless Gateway.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * A list of key-value pairs that contain metadata for the gateway.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Output<List<WirelessGatewayTagArgs>> tags;

    public Output<List<WirelessGatewayTagArgs>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Thing Arn. Passed into Update to associate a Thing with the Wireless Gateway.
     * 
     */
    @InputImport(name="thingArn")
      private final @Nullable Output<String> thingArn;

    public Output<String> getThingArn() {
        return this.thingArn == null ? Output.empty() : this.thingArn;
    }

    public WirelessGatewayArgs(
        @Nullable Output<String> description,
        @Nullable Output<String> lastUplinkReceivedAt,
        Output<WirelessGatewayLoRaWANGatewayArgs> loRaWAN,
        @Nullable Output<String> name,
        @Nullable Output<List<WirelessGatewayTagArgs>> tags,
        @Nullable Output<String> thingArn) {
        this.description = description;
        this.lastUplinkReceivedAt = lastUplinkReceivedAt;
        this.loRaWAN = Objects.requireNonNull(loRaWAN, "expected parameter 'loRaWAN' to be non-null");
        this.name = name;
        this.tags = tags;
        this.thingArn = thingArn;
    }

    private WirelessGatewayArgs() {
        this.description = Output.empty();
        this.lastUplinkReceivedAt = Output.empty();
        this.loRaWAN = Output.empty();
        this.name = Output.empty();
        this.tags = Output.empty();
        this.thingArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WirelessGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> description;
        private @Nullable Output<String> lastUplinkReceivedAt;
        private Output<WirelessGatewayLoRaWANGatewayArgs> loRaWAN;
        private @Nullable Output<String> name;
        private @Nullable Output<List<WirelessGatewayTagArgs>> tags;
        private @Nullable Output<String> thingArn;

        public Builder() {
    	      // Empty
        }

        public Builder(WirelessGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.lastUplinkReceivedAt = defaults.lastUplinkReceivedAt;
    	      this.loRaWAN = defaults.loRaWAN;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.thingArn = defaults.thingArn;
        }

        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }

        public Builder description(@Nullable String description) {
            this.description = Output.ofNullable(description);
            return this;
        }

        public Builder lastUplinkReceivedAt(@Nullable Output<String> lastUplinkReceivedAt) {
            this.lastUplinkReceivedAt = lastUplinkReceivedAt;
            return this;
        }

        public Builder lastUplinkReceivedAt(@Nullable String lastUplinkReceivedAt) {
            this.lastUplinkReceivedAt = Output.ofNullable(lastUplinkReceivedAt);
            return this;
        }

        public Builder loRaWAN(Output<WirelessGatewayLoRaWANGatewayArgs> loRaWAN) {
            this.loRaWAN = Objects.requireNonNull(loRaWAN);
            return this;
        }

        public Builder loRaWAN(WirelessGatewayLoRaWANGatewayArgs loRaWAN) {
            this.loRaWAN = Output.of(Objects.requireNonNull(loRaWAN));
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

        public Builder tags(@Nullable Output<List<WirelessGatewayTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder tags(@Nullable List<WirelessGatewayTagArgs> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }

        public Builder thingArn(@Nullable Output<String> thingArn) {
            this.thingArn = thingArn;
            return this;
        }

        public Builder thingArn(@Nullable String thingArn) {
            this.thingArn = Output.ofNullable(thingArn);
            return this;
        }
        public WirelessGatewayArgs build() {
            return new WirelessGatewayArgs(description, lastUplinkReceivedAt, loRaWAN, name, tags, thingArn);
        }
    }
}
