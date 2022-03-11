// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.cloudbuild.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class TriggerBuildOptionsVolumeArgs extends io.pulumi.resources.ResourceArgs {

    public static final TriggerBuildOptionsVolumeArgs Empty = new TriggerBuildOptionsVolumeArgs();

    /**
     * Name of the volume to mount.
     * Volume names must be unique per build step and must be valid names for Docker volumes.
     * Each named volume must be used by at least two build steps.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Path at which to mount the volume.
     * Paths must be absolute and cannot conflict with other volume paths on the same
     * build step or with certain reserved volume paths.
     * 
     */
    @InputImport(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Output.empty() : this.path;
    }

    public TriggerBuildOptionsVolumeArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> path) {
        this.name = name;
        this.path = path;
    }

    private TriggerBuildOptionsVolumeArgs() {
        this.name = Output.empty();
        this.path = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TriggerBuildOptionsVolumeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> path;

        public Builder() {
    	      // Empty
        }

        public Builder(TriggerBuildOptionsVolumeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.path = defaults.path;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }

        public Builder path(@Nullable String path) {
            this.path = Output.ofNullable(path);
            return this;
        }
        public TriggerBuildOptionsVolumeArgs build() {
            return new TriggerBuildOptionsVolumeArgs(name, path);
        }
    }
}
