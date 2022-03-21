// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.nimblestudio.inputs;

import io.pulumi.awsnative.nimblestudio.enums.LaunchProfileStreamingSessionStorageMode;
import io.pulumi.awsnative.nimblestudio.inputs.LaunchProfileStreamingSessionStorageRootArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * <p>The configuration for a streaming session’s upload storage.</p>
 * 
 */
public final class LaunchProfileStreamConfigurationSessionStorageArgs extends io.pulumi.resources.ResourceArgs {

    public static final LaunchProfileStreamConfigurationSessionStorageArgs Empty = new LaunchProfileStreamConfigurationSessionStorageArgs();

    /**
     * <p>Allows artists to upload files to their workstations. The only valid option is
     *                 <code>UPLOAD</code>.</p>
     * 
     */
    @Import(name="mode")
      private final @Nullable Output<List<LaunchProfileStreamingSessionStorageMode>> mode;

    public Output<List<LaunchProfileStreamingSessionStorageMode>> getMode() {
        return this.mode == null ? Output.empty() : this.mode;
    }

    @Import(name="root")
      private final @Nullable Output<LaunchProfileStreamingSessionStorageRootArgs> root;

    public Output<LaunchProfileStreamingSessionStorageRootArgs> getRoot() {
        return this.root == null ? Output.empty() : this.root;
    }

    public LaunchProfileStreamConfigurationSessionStorageArgs(
        @Nullable Output<List<LaunchProfileStreamingSessionStorageMode>> mode,
        @Nullable Output<LaunchProfileStreamingSessionStorageRootArgs> root) {
        this.mode = mode;
        this.root = root;
    }

    private LaunchProfileStreamConfigurationSessionStorageArgs() {
        this.mode = Output.empty();
        this.root = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchProfileStreamConfigurationSessionStorageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<LaunchProfileStreamingSessionStorageMode>> mode;
        private @Nullable Output<LaunchProfileStreamingSessionStorageRootArgs> root;

        public Builder() {
    	      // Empty
        }

        public Builder(LaunchProfileStreamConfigurationSessionStorageArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mode = defaults.mode;
    	      this.root = defaults.root;
        }

        public Builder mode(@Nullable Output<List<LaunchProfileStreamingSessionStorageMode>> mode) {
            this.mode = mode;
            return this;
        }
        public Builder mode(@Nullable List<LaunchProfileStreamingSessionStorageMode> mode) {
            this.mode = Output.ofNullable(mode);
            return this;
        }
        public Builder mode(LaunchProfileStreamingSessionStorageMode... mode) {
            return mode(List.of(mode));
        }
        public Builder root(@Nullable Output<LaunchProfileStreamingSessionStorageRootArgs> root) {
            this.root = root;
            return this;
        }
        public Builder root(@Nullable LaunchProfileStreamingSessionStorageRootArgs root) {
            this.root = Output.ofNullable(root);
            return this;
        }        public LaunchProfileStreamConfigurationSessionStorageArgs build() {
            return new LaunchProfileStreamConfigurationSessionStorageArgs(mode, root);
        }
    }
}
