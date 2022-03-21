// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.notebooks_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.notebooks_v1.enums.AcceleratorConfigType;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Definition of a hardware accelerator. Note that not all combinations of `type` and `core_count` are valid. Check [GPUs on Compute Engine](/compute/docs/gpus/#gpus-list) to find a valid combination. TPUs are not supported.
 * 
 */
public final class AcceleratorConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final AcceleratorConfigArgs Empty = new AcceleratorConfigArgs();

    /**
     * Count of cores of this accelerator.
     * 
     */
    @Import(name="coreCount")
      private final @Nullable Output<String> coreCount;

    public Output<String> getCoreCount() {
        return this.coreCount == null ? Output.empty() : this.coreCount;
    }

    /**
     * Type of this accelerator.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<AcceleratorConfigType> type;

    public Output<AcceleratorConfigType> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public AcceleratorConfigArgs(
        @Nullable Output<String> coreCount,
        @Nullable Output<AcceleratorConfigType> type) {
        this.coreCount = coreCount;
        this.type = type;
    }

    private AcceleratorConfigArgs() {
        this.coreCount = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AcceleratorConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> coreCount;
        private @Nullable Output<AcceleratorConfigType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AcceleratorConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.coreCount = defaults.coreCount;
    	      this.type = defaults.type;
        }

        public Builder coreCount(@Nullable Output<String> coreCount) {
            this.coreCount = coreCount;
            return this;
        }
        public Builder coreCount(@Nullable String coreCount) {
            this.coreCount = Output.ofNullable(coreCount);
            return this;
        }
        public Builder type(@Nullable Output<AcceleratorConfigType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable AcceleratorConfigType type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public AcceleratorConfigArgs build() {
            return new AcceleratorConfigArgs(coreCount, type);
        }
    }
}
