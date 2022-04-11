// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.docker.inputs.VolumeLabelArgs;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final VolumeArgs Empty = new VolumeArgs();

    /**
     * Driver type for the volume. Defaults to `local`.
     * 
     */
    @Import(name="driver")
      private final @Nullable Output<String> driver;

    public Output<String> getDriver() {
        return this.driver == null ? Codegen.empty() : this.driver;
    }

    /**
     * Options specific to the driver.
     * 
     */
    @Import(name="driverOpts")
      private final @Nullable Output<Map<String,Object>> driverOpts;

    public Output<Map<String,Object>> getDriverOpts() {
        return this.driverOpts == null ? Codegen.empty() : this.driverOpts;
    }

    /**
     * User-defined key/value metadata
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<List<VolumeLabelArgs>> labels;

    public Output<List<VolumeLabelArgs>> getLabels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The name of the Docker volume (will be generated if not provided).
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    public VolumeArgs(
        @Nullable Output<String> driver,
        @Nullable Output<Map<String,Object>> driverOpts,
        @Nullable Output<List<VolumeLabelArgs>> labels,
        @Nullable Output<String> name) {
        this.driver = driver;
        this.driverOpts = driverOpts;
        this.labels = labels;
        this.name = name;
    }

    private VolumeArgs() {
        this.driver = Codegen.empty();
        this.driverOpts = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> driver;
        private @Nullable Output<Map<String,Object>> driverOpts;
        private @Nullable Output<List<VolumeLabelArgs>> labels;
        private @Nullable Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(VolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.driver = defaults.driver;
    	      this.driverOpts = defaults.driverOpts;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
        }

        public Builder driver(@Nullable Output<String> driver) {
            this.driver = driver;
            return this;
        }
        public Builder driver(@Nullable String driver) {
            this.driver = Codegen.ofNullable(driver);
            return this;
        }
        public Builder driverOpts(@Nullable Output<Map<String,Object>> driverOpts) {
            this.driverOpts = driverOpts;
            return this;
        }
        public Builder driverOpts(@Nullable Map<String,Object> driverOpts) {
            this.driverOpts = Codegen.ofNullable(driverOpts);
            return this;
        }
        public Builder labels(@Nullable Output<List<VolumeLabelArgs>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable List<VolumeLabelArgs> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder labels(VolumeLabelArgs... labels) {
            return labels(List.of(labels));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }        public VolumeArgs build() {
            return new VolumeArgs(driver, driverOpts, labels, name);
        }
    }
}
