// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="linux")
      private final @Nullable Output<String> linux;

    public Output<String> getLinux() {
        return this.linux == null ? Output.empty() : this.linux;
    }

    /**
     * <p>The folder path in Windows workstations where files are uploaded.</p>
     * 
     */
    @Import(name="windows")
      private final @Nullable Output<String> windows;

    public Output<String> getWindows() {
        return this.windows == null ? Output.empty() : this.windows;
    }

    public LaunchProfileStreamingSessionStorageRootArgs(
        @Nullable Output<String> linux,
        @Nullable Output<String> windows) {
        this.linux = linux;
        this.windows = windows;
    }

    private LaunchProfileStreamingSessionStorageRootArgs() {
        this.linux = Output.empty();
        this.windows = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchProfileStreamingSessionStorageRootArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> linux;
        private @Nullable Output<String> windows;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchProfileStreamingSessionStorageRootArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.linux = defaults.linux;
    	      this.windows = defaults.windows;
        }

        public Builder linux(@Nullable Output<String> linux) {
            this.linux = linux;
            return this;
        }
        public Builder linux(@Nullable String linux) {
            this.linux = Output.ofNullable(linux);
            return this;
        }
        public Builder windows(@Nullable Output<String> windows) {
            this.windows = windows;
            return this;
        }
        public Builder windows(@Nullable String windows) {
            this.windows = Output.ofNullable(windows);
            return this;
        }        public LaunchProfileStreamingSessionStorageRootArgs build() {
            return new LaunchProfileStreamingSessionStorageRootArgs(linux, windows);
        }
    }
}
