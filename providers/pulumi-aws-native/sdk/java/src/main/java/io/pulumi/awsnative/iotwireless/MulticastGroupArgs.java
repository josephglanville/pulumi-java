// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.iotwireless;

import io.pulumi.awsnative.iotwireless.inputs.MulticastGroupLoRaWANArgs;
import io.pulumi.awsnative.iotwireless.inputs.MulticastGroupTagArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class MulticastGroupArgs extends io.pulumi.resources.ResourceArgs {

    public static final MulticastGroupArgs Empty = new MulticastGroupArgs();

    /**
     * Wireless device to associate. Only for update request.
     * 
     */
    @InputImport(name="associateWirelessDevice")
      private final @Nullable Input<String> associateWirelessDevice;

    public Input<String> getAssociateWirelessDevice() {
        return this.associateWirelessDevice == null ? Input.empty() : this.associateWirelessDevice;
    }

    /**
     * Multicast group description
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Wireless device to disassociate. Only for update request.
     * 
     */
    @InputImport(name="disassociateWirelessDevice")
      private final @Nullable Input<String> disassociateWirelessDevice;

    public Input<String> getDisassociateWirelessDevice() {
        return this.disassociateWirelessDevice == null ? Input.empty() : this.disassociateWirelessDevice;
    }

    /**
     * Multicast group LoRaWAN
     * 
     */
    @InputImport(name="loRaWAN", required=true)
      private final Input<MulticastGroupLoRaWANArgs> loRaWAN;

    public Input<MulticastGroupLoRaWANArgs> getLoRaWAN() {
        return this.loRaWAN;
    }

    /**
     * Name of Multicast group
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * A list of key-value pairs that contain metadata for the Multicast group.
     * 
     */
    @InputImport(name="tags")
      private final @Nullable Input<List<MulticastGroupTagArgs>> tags;

    public Input<List<MulticastGroupTagArgs>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public MulticastGroupArgs(
        @Nullable Input<String> associateWirelessDevice,
        @Nullable Input<String> description,
        @Nullable Input<String> disassociateWirelessDevice,
        Input<MulticastGroupLoRaWANArgs> loRaWAN,
        @Nullable Input<String> name,
        @Nullable Input<List<MulticastGroupTagArgs>> tags) {
        this.associateWirelessDevice = associateWirelessDevice;
        this.description = description;
        this.disassociateWirelessDevice = disassociateWirelessDevice;
        this.loRaWAN = Objects.requireNonNull(loRaWAN, "expected parameter 'loRaWAN' to be non-null");
        this.name = name;
        this.tags = tags;
    }

    private MulticastGroupArgs() {
        this.associateWirelessDevice = Input.empty();
        this.description = Input.empty();
        this.disassociateWirelessDevice = Input.empty();
        this.loRaWAN = Input.empty();
        this.name = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MulticastGroupArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> associateWirelessDevice;
        private @Nullable Input<String> description;
        private @Nullable Input<String> disassociateWirelessDevice;
        private Input<MulticastGroupLoRaWANArgs> loRaWAN;
        private @Nullable Input<String> name;
        private @Nullable Input<List<MulticastGroupTagArgs>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(MulticastGroupArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.associateWirelessDevice = defaults.associateWirelessDevice;
    	      this.description = defaults.description;
    	      this.disassociateWirelessDevice = defaults.disassociateWirelessDevice;
    	      this.loRaWAN = defaults.loRaWAN;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder setAssociateWirelessDevice(@Nullable Input<String> associateWirelessDevice) {
            this.associateWirelessDevice = associateWirelessDevice;
            return this;
        }

        public Builder setAssociateWirelessDevice(@Nullable String associateWirelessDevice) {
            this.associateWirelessDevice = Input.ofNullable(associateWirelessDevice);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setDisassociateWirelessDevice(@Nullable Input<String> disassociateWirelessDevice) {
            this.disassociateWirelessDevice = disassociateWirelessDevice;
            return this;
        }

        public Builder setDisassociateWirelessDevice(@Nullable String disassociateWirelessDevice) {
            this.disassociateWirelessDevice = Input.ofNullable(disassociateWirelessDevice);
            return this;
        }

        public Builder setLoRaWAN(Input<MulticastGroupLoRaWANArgs> loRaWAN) {
            this.loRaWAN = Objects.requireNonNull(loRaWAN);
            return this;
        }

        public Builder setLoRaWAN(MulticastGroupLoRaWANArgs loRaWAN) {
            this.loRaWAN = Input.of(Objects.requireNonNull(loRaWAN));
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

        public Builder setTags(@Nullable Input<List<MulticastGroupTagArgs>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable List<MulticastGroupTagArgs> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public MulticastGroupArgs build() {
            return new MulticastGroupArgs(associateWirelessDevice, description, disassociateWirelessDevice, loRaWAN, name, tags);
        }
    }
}
