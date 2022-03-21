// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AttachedDiskState extends io.pulumi.resources.ResourceArgs {

    public static final AttachedDiskState Empty = new AttachedDiskState();

    /**
     * Specifies a unique device name of your choice that is
     * reflected into the /dev/disk/by-id/google-* tree of a Linux operating
     * system running within the instance. This name can be used to
     * reference the device for mounting, resizing, and so on, from within
     * the instance.
     * 
     */
    @Import(name="deviceName")
      private final @Nullable Output<String> deviceName;

    public Output<String> getDeviceName() {
        return this.deviceName == null ? Output.empty() : this.deviceName;
    }

    /**
     * `name` or `self_link` of the disk that will be attached.
     * 
     */
    @Import(name="disk")
      private final @Nullable Output<String> disk;

    public Output<String> getDisk() {
        return this.disk == null ? Output.empty() : this.disk;
    }

    /**
     * `name` or `self_link` of the compute instance that the disk will be attached to.
     * If the `self_link` is provided then `zone` and `project` are extracted from the
     * self link. If only the name is used then `zone` and `project` must be defined
     * as properties on the resource or provider.
     * 
     */
    @Import(name="instance")
      private final @Nullable Output<String> instance;

    public Output<String> getInstance() {
        return this.instance == null ? Output.empty() : this.instance;
    }

    /**
     * The mode in which to attach this disk, either READ_WRITE or
     * READ_ONLY. If not specified, the default is to attach the disk in
     * READ_WRITE mode.
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<String> mode;

    public Output<String> getMode() {
        return this.mode == null ? Output.empty() : this.mode;
    }

    /**
     * The project that the referenced compute instance is a part of. If `instance` is referenced by its
     * `self_link` the project defined in the link will take precedence.
     * 
     */
    @Import(name="project")
      private final @Nullable Output<String> project;

    public Output<String> getProject() {
        return this.project == null ? Output.empty() : this.project;
    }

    /**
     * The zone that the referenced compute instance is located within. If `instance` is referenced by its
     * `self_link` the zone defined in the link will take precedence.
     * 
     */
    @Import(name="zone")
      private final @Nullable Output<String> zone;

    public Output<String> getZone() {
        return this.zone == null ? Output.empty() : this.zone;
    }

    public AttachedDiskState(
        @Nullable Output<String> deviceName,
        @Nullable Output<String> disk,
        @Nullable Output<String> instance,
        @Nullable Output<String> mode,
        @Nullable Output<String> project,
        @Nullable Output<String> zone) {
        this.deviceName = deviceName;
        this.disk = disk;
        this.instance = instance;
        this.mode = mode;
        this.project = project;
        this.zone = zone;
    }

    private AttachedDiskState() {
        this.deviceName = Output.empty();
        this.disk = Output.empty();
        this.instance = Output.empty();
        this.mode = Output.empty();
        this.project = Output.empty();
        this.zone = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AttachedDiskState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> deviceName;
        private @Nullable Output<String> disk;
        private @Nullable Output<String> instance;
        private @Nullable Output<String> mode;
        private @Nullable Output<String> project;
        private @Nullable Output<String> zone;

        public Builder() {
    	      // Empty
        }

        public Builder(AttachedDiskState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deviceName = defaults.deviceName;
    	      this.disk = defaults.disk;
    	      this.instance = defaults.instance;
    	      this.mode = defaults.mode;
    	      this.project = defaults.project;
    	      this.zone = defaults.zone;
        }

        public Builder deviceName(@Nullable Output<String> deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public Builder deviceName(@Nullable String deviceName) {
            this.deviceName = Output.ofNullable(deviceName);
            return this;
        }
        public Builder disk(@Nullable Output<String> disk) {
            this.disk = disk;
            return this;
        }
        public Builder disk(@Nullable String disk) {
            this.disk = Output.ofNullable(disk);
            return this;
        }
        public Builder instance(@Nullable Output<String> instance) {
            this.instance = instance;
            return this;
        }
        public Builder instance(@Nullable String instance) {
            this.instance = Output.ofNullable(instance);
            return this;
        }
        public Builder mode(@Nullable Output<String> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable String mode) {
            this.mode = Output.ofNullable(mode);
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
        public Builder zone(@Nullable Output<String> zone) {
            this.zone = zone;
            return this;
        }
        public Builder zone(@Nullable String zone) {
            this.zone = Output.ofNullable(zone);
            return this;
        }        public AttachedDiskState build() {
            return new AttachedDiskState(deviceName, disk, instance, mode, project, zone);
        }
    }
}
