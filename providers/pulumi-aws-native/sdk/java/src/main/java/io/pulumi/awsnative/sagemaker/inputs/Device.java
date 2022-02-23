// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.sagemaker.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Edge device you want to create
 * 
 */
public final class Device extends io.pulumi.resources.InvokeArgs {

    public static final Device Empty = new Device();

    /**
     * Description of the device
     * 
     */
    @InputImport(name="description")
      private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    /**
     * The name of the device
     * 
     */
    @InputImport(name="deviceName", required=true)
      private final String deviceName;

    public String getDeviceName() {
        return this.deviceName;
    }

    /**
     * AWS Internet of Things (IoT) object name.
     * 
     */
    @InputImport(name="iotThingName")
      private final @Nullable String iotThingName;

    public Optional<String> getIotThingName() {
        return this.iotThingName == null ? Optional.empty() : Optional.ofNullable(this.iotThingName);
    }

    public Device(
        @Nullable String description,
        String deviceName,
        @Nullable String iotThingName) {
        this.description = description;
        this.deviceName = Objects.requireNonNull(deviceName, "expected parameter 'deviceName' to be non-null");
        this.iotThingName = iotThingName;
    }

    private Device() {
        this.description = null;
        this.deviceName = null;
        this.iotThingName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Device defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String description;
        private String deviceName;
        private @Nullable String iotThingName;

        public Builder() {
    	      // Empty
        }

        public Builder(Device defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.deviceName = defaults.deviceName;
    	      this.iotThingName = defaults.iotThingName;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDeviceName(String deviceName) {
            this.deviceName = Objects.requireNonNull(deviceName);
            return this;
        }

        public Builder setIotThingName(@Nullable String iotThingName) {
            this.iotThingName = iotThingName;
            return this;
        }
        public Device build() {
            return new Device(description, deviceName, iotThingName);
        }
    }
}
