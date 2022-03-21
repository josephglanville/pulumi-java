// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.imagebuilder.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ImagePipelineImageTestsConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ImagePipelineImageTestsConfigurationGetArgs Empty = new ImagePipelineImageTestsConfigurationGetArgs();

    /**
     * Whether image tests are enabled. Defaults to `true`.
     * 
     */
    @Import(name="imageTestsEnabled")
      private final @Nullable Output<Boolean> imageTestsEnabled;

    public Output<Boolean> getImageTestsEnabled() {
        return this.imageTestsEnabled == null ? Output.empty() : this.imageTestsEnabled;
    }

    /**
     * Number of minutes before image tests time out. Valid values are between `60` and `1440`. Defaults to `720`.
     * 
     */
    @Import(name="timeoutMinutes")
      private final @Nullable Output<Integer> timeoutMinutes;

    public Output<Integer> getTimeoutMinutes() {
        return this.timeoutMinutes == null ? Output.empty() : this.timeoutMinutes;
    }

    public ImagePipelineImageTestsConfigurationGetArgs(
        @Nullable Output<Boolean> imageTestsEnabled,
        @Nullable Output<Integer> timeoutMinutes) {
        this.imageTestsEnabled = imageTestsEnabled;
        this.timeoutMinutes = timeoutMinutes;
    }

    private ImagePipelineImageTestsConfigurationGetArgs() {
        this.imageTestsEnabled = Output.empty();
        this.timeoutMinutes = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ImagePipelineImageTestsConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> imageTestsEnabled;
        private @Nullable Output<Integer> timeoutMinutes;

        public Builder() {
    	      // Empty
        }

        public Builder(ImagePipelineImageTestsConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.imageTestsEnabled = defaults.imageTestsEnabled;
    	      this.timeoutMinutes = defaults.timeoutMinutes;
        }

        public Builder imageTestsEnabled(@Nullable Output<Boolean> imageTestsEnabled) {
            this.imageTestsEnabled = imageTestsEnabled;
            return this;
        }
        public Builder imageTestsEnabled(@Nullable Boolean imageTestsEnabled) {
            this.imageTestsEnabled = Output.ofNullable(imageTestsEnabled);
            return this;
        }
        public Builder timeoutMinutes(@Nullable Output<Integer> timeoutMinutes) {
            this.timeoutMinutes = timeoutMinutes;
            return this;
        }
        public Builder timeoutMinutes(@Nullable Integer timeoutMinutes) {
            this.timeoutMinutes = Output.ofNullable(timeoutMinutes);
            return this;
        }        public ImagePipelineImageTestsConfigurationGetArgs build() {
            return new ImagePipelineImageTestsConfigurationGetArgs(imageTestsEnabled, timeoutMinutes);
        }
    }
}
