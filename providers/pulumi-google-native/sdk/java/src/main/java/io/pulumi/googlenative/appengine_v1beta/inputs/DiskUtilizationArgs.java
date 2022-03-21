// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1beta.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Target scaling by disk usage. Only applicable in the App Engine flexible environment.
 * 
 */
public final class DiskUtilizationArgs extends io.pulumi.resources.ResourceArgs {

    public static final DiskUtilizationArgs Empty = new DiskUtilizationArgs();

    /**
     * Target bytes read per second.
     * 
     */
    @Import(name="targetReadBytesPerSecond")
      private final @Nullable Output<Integer> targetReadBytesPerSecond;

    public Output<Integer> getTargetReadBytesPerSecond() {
        return this.targetReadBytesPerSecond == null ? Output.empty() : this.targetReadBytesPerSecond;
    }

    /**
     * Target ops read per seconds.
     * 
     */
    @Import(name="targetReadOpsPerSecond")
      private final @Nullable Output<Integer> targetReadOpsPerSecond;

    public Output<Integer> getTargetReadOpsPerSecond() {
        return this.targetReadOpsPerSecond == null ? Output.empty() : this.targetReadOpsPerSecond;
    }

    /**
     * Target bytes written per second.
     * 
     */
    @Import(name="targetWriteBytesPerSecond")
      private final @Nullable Output<Integer> targetWriteBytesPerSecond;

    public Output<Integer> getTargetWriteBytesPerSecond() {
        return this.targetWriteBytesPerSecond == null ? Output.empty() : this.targetWriteBytesPerSecond;
    }

    /**
     * Target ops written per second.
     * 
     */
    @Import(name="targetWriteOpsPerSecond")
      private final @Nullable Output<Integer> targetWriteOpsPerSecond;

    public Output<Integer> getTargetWriteOpsPerSecond() {
        return this.targetWriteOpsPerSecond == null ? Output.empty() : this.targetWriteOpsPerSecond;
    }

    public DiskUtilizationArgs(
        @Nullable Output<Integer> targetReadBytesPerSecond,
        @Nullable Output<Integer> targetReadOpsPerSecond,
        @Nullable Output<Integer> targetWriteBytesPerSecond,
        @Nullable Output<Integer> targetWriteOpsPerSecond) {
        this.targetReadBytesPerSecond = targetReadBytesPerSecond;
        this.targetReadOpsPerSecond = targetReadOpsPerSecond;
        this.targetWriteBytesPerSecond = targetWriteBytesPerSecond;
        this.targetWriteOpsPerSecond = targetWriteOpsPerSecond;
    }

    private DiskUtilizationArgs() {
        this.targetReadBytesPerSecond = Output.empty();
        this.targetReadOpsPerSecond = Output.empty();
        this.targetWriteBytesPerSecond = Output.empty();
        this.targetWriteOpsPerSecond = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DiskUtilizationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> targetReadBytesPerSecond;
        private @Nullable Output<Integer> targetReadOpsPerSecond;
        private @Nullable Output<Integer> targetWriteBytesPerSecond;
        private @Nullable Output<Integer> targetWriteOpsPerSecond;

        public Builder() {
    	      // Empty
        }

        public Builder(DiskUtilizationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetReadBytesPerSecond = defaults.targetReadBytesPerSecond;
    	      this.targetReadOpsPerSecond = defaults.targetReadOpsPerSecond;
    	      this.targetWriteBytesPerSecond = defaults.targetWriteBytesPerSecond;
    	      this.targetWriteOpsPerSecond = defaults.targetWriteOpsPerSecond;
        }

        public Builder targetReadBytesPerSecond(@Nullable Output<Integer> targetReadBytesPerSecond) {
            this.targetReadBytesPerSecond = targetReadBytesPerSecond;
            return this;
        }
        public Builder targetReadBytesPerSecond(@Nullable Integer targetReadBytesPerSecond) {
            this.targetReadBytesPerSecond = Output.ofNullable(targetReadBytesPerSecond);
            return this;
        }
        public Builder targetReadOpsPerSecond(@Nullable Output<Integer> targetReadOpsPerSecond) {
            this.targetReadOpsPerSecond = targetReadOpsPerSecond;
            return this;
        }
        public Builder targetReadOpsPerSecond(@Nullable Integer targetReadOpsPerSecond) {
            this.targetReadOpsPerSecond = Output.ofNullable(targetReadOpsPerSecond);
            return this;
        }
        public Builder targetWriteBytesPerSecond(@Nullable Output<Integer> targetWriteBytesPerSecond) {
            this.targetWriteBytesPerSecond = targetWriteBytesPerSecond;
            return this;
        }
        public Builder targetWriteBytesPerSecond(@Nullable Integer targetWriteBytesPerSecond) {
            this.targetWriteBytesPerSecond = Output.ofNullable(targetWriteBytesPerSecond);
            return this;
        }
        public Builder targetWriteOpsPerSecond(@Nullable Output<Integer> targetWriteOpsPerSecond) {
            this.targetWriteOpsPerSecond = targetWriteOpsPerSecond;
            return this;
        }
        public Builder targetWriteOpsPerSecond(@Nullable Integer targetWriteOpsPerSecond) {
            this.targetWriteOpsPerSecond = Output.ofNullable(targetWriteOpsPerSecond);
            return this;
        }        public DiskUtilizationArgs build() {
            return new DiskUtilizationArgs(targetReadBytesPerSecond, targetReadOpsPerSecond, targetWriteBytesPerSecond, targetWriteOpsPerSecond);
        }
    }
}
