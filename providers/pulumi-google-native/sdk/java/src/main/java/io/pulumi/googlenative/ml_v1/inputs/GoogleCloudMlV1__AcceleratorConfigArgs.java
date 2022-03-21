// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.ml_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.ml_v1.enums.GoogleCloudMlV1__AcceleratorConfigType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Represents a hardware accelerator request config. Note that the AcceleratorConfig can be used in both Jobs and Versions. Learn more about [accelerators for training](/ml-engine/docs/using-gpus) and [accelerators for online prediction](/ml-engine/docs/machine-types-online-prediction#gpus).
 * 
 */
public final class GoogleCloudMlV1__AcceleratorConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudMlV1__AcceleratorConfigArgs Empty = new GoogleCloudMlV1__AcceleratorConfigArgs();

    /**
     * The number of accelerators to attach to each machine running the job.
     * 
     */
    @Import(name="count")
      private final @Nullable Output<String> count;

    public Output<String> getCount() {
        return this.count == null ? Output.empty() : this.count;
    }

    /**
     * The type of accelerator to use.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<GoogleCloudMlV1__AcceleratorConfigType> type;

    public Output<GoogleCloudMlV1__AcceleratorConfigType> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public GoogleCloudMlV1__AcceleratorConfigArgs(
        @Nullable Output<String> count,
        @Nullable Output<GoogleCloudMlV1__AcceleratorConfigType> type) {
        this.count = count;
        this.type = type;
    }

    private GoogleCloudMlV1__AcceleratorConfigArgs() {
        this.count = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudMlV1__AcceleratorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> count;
        private @Nullable Output<GoogleCloudMlV1__AcceleratorConfigType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudMlV1__AcceleratorConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.type = defaults.type;
        }

        public Builder count(@Nullable Output<String> count) {
            this.count = count;
            return this;
        }
        public Builder count(@Nullable String count) {
            this.count = Output.ofNullable(count);
            return this;
        }
        public Builder type(@Nullable Output<GoogleCloudMlV1__AcceleratorConfigType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable GoogleCloudMlV1__AcceleratorConfigType type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public GoogleCloudMlV1__AcceleratorConfigArgs build() {
            return new GoogleCloudMlV1__AcceleratorConfigArgs(count, type);
        }
    }
}
