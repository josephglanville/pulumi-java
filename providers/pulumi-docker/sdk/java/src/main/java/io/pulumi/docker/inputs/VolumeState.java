// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.docker.inputs.VolumeLabelGetArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VolumeState extends io.pulumi.resources.ResourceArgs {

    public static final VolumeState Empty = new VolumeState();

    /**
     * Driver type for the volume. Defaults to `local`.
     * 
     */
    @Import(name="driver")
      private final @Nullable Output<String> driver;

    public Output<String> getDriver() {
        return this.driver == null ? Output.empty() : this.driver;
    }

    /**
     * Options specific to the driver.
     * 
     */
    @Import(name="driverOpts")
      private final @Nullable Output<Map<String,Object>> driverOpts;

    public Output<Map<String,Object>> getDriverOpts() {
        return this.driverOpts == null ? Output.empty() : this.driverOpts;
    }

    /**
     * User-defined key/value metadata
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<List<VolumeLabelGetArgs>> labels;

    public Output<List<VolumeLabelGetArgs>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * The mountpoint of the volume.
     * 
     */
    @Import(name="mountpoint")
      private final @Nullable Output<String> mountpoint;

    public Output<String> getMountpoint() {
        return this.mountpoint == null ? Output.empty() : this.mountpoint;
    }

    /**
     * The name of the Docker volume (will be generated if not provided).
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    public VolumeState(
        @Nullable Output<String> driver,
        @Nullable Output<Map<String,Object>> driverOpts,
        @Nullable Output<List<VolumeLabelGetArgs>> labels,
        @Nullable Output<String> mountpoint,
        @Nullable Output<String> name) {
        this.driver = driver;
        this.driverOpts = driverOpts;
        this.labels = labels;
        this.mountpoint = mountpoint;
        this.name = name;
    }

    private VolumeState() {
        this.driver = Output.empty();
        this.driverOpts = Output.empty();
        this.labels = Output.empty();
        this.mountpoint = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> driver;
        private @Nullable Output<Map<String,Object>> driverOpts;
        private @Nullable Output<List<VolumeLabelGetArgs>> labels;
        private @Nullable Output<String> mountpoint;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driver = defaults.driver;
    	      this.driverOpts = defaults.driverOpts;
    	      this.labels = defaults.labels;
    	      this.mountpoint = defaults.mountpoint;
    	      this.name = defaults.name;
        }

        public Builder driver(@Nullable Output<String> driver) {
            this.driver = driver;
            return this;
        }
        public Builder driver(@Nullable String driver) {
            this.driver = Output.ofNullable(driver);
            return this;
        }
        public Builder driverOpts(@Nullable Output<Map<String,Object>> driverOpts) {
            this.driverOpts = driverOpts;
            return this;
        }
        public Builder driverOpts(@Nullable Map<String,Object> driverOpts) {
            this.driverOpts = Output.ofNullable(driverOpts);
            return this;
        }
        public Builder labels(@Nullable Output<List<VolumeLabelGetArgs>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable List<VolumeLabelGetArgs> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }
        public Builder labels(VolumeLabelGetArgs... labels) {
            return labels(List.of(labels));
        }
        public Builder mountpoint(@Nullable Output<String> mountpoint) {
            this.mountpoint = mountpoint;
            return this;
        }
        public Builder mountpoint(@Nullable String mountpoint) {
            this.mountpoint = Output.ofNullable(mountpoint);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }        public VolumeState build() {
            return new VolumeState(driver, driverOpts, labels, mountpoint, name);
        }
    }
}
