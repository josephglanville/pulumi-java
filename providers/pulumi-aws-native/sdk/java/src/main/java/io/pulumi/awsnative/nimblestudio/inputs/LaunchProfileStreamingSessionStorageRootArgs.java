// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>The upload storage root location (folder) on streaming workstations where files are
 *             uploaded.</p>
 * 
 */
public final class LaunchProfileStreamingSessionStorageRootArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchProfileStreamingSessionStorageRootArgs Empty = new LaunchProfileStreamingSessionStorageRootArgs();

    /**
     * <p>The folder path in Linux workstations where files are uploaded.</p>
     * 
     */
    @InputImport(name="linux")
      private final @Nullable Input<String> linux;

    public Input<String> getLinux() {
        return this.linux == null ? Input.empty() : this.linux;
    }

    /**
     * <p>The folder path in Windows workstations where files are uploaded.</p>
     * 
     */
    @InputImport(name="windows")
      private final @Nullable Input<String> windows;

    public Input<String> getWindows() {
        return this.windows == null ? Input.empty() : this.windows;
    }

    public LaunchProfileStreamingSessionStorageRootArgs(
        @Nullable Input<String> linux,
        @Nullable Input<String> windows) {
        this.linux = linux;
        this.windows = windows;
    }

    private LaunchProfileStreamingSessionStorageRootArgs() {
        this.linux = Input.empty();
        this.windows = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchProfileStreamingSessionStorageRootArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> linux;
        private @Nullable Input<String> windows;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchProfileStreamingSessionStorageRootArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linux = defaults.linux;
    	      this.windows = defaults.windows;
        }

        public Builder setLinux(@Nullable Input<String> linux) {
            this.linux = linux;
            return this;
        }

        public Builder setLinux(@Nullable String linux) {
            this.linux = Input.ofNullable(linux);
            return this;
        }

        public Builder setWindows(@Nullable Input<String> windows) {
            this.windows = windows;
            return this;
        }

        public Builder setWindows(@Nullable String windows) {
            this.windows = Input.ofNullable(windows);
            return this;
        }
        public LaunchProfileStreamingSessionStorageRootArgs build() {
            return new LaunchProfileStreamingSessionStorageRootArgs(linux, windows);
        }
    }
}
