// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dataproc_v1beta2.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Specifies the cluster auto-delete schedule configuration.
 * 
 */
public final class LifecycleConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final LifecycleConfigArgs Empty = new LifecycleConfigArgs();

    /**
     * Optional. The time when cluster will be auto-deleted. (see JSON representation of Timestamp (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    @Import(name="autoDeleteTime")
      private final @Nullable Output<String> autoDeleteTime;

    public Output<String> getAutoDeleteTime() {
        return this.autoDeleteTime == null ? Output.empty() : this.autoDeleteTime;
    }

    /**
     * Optional. The lifetime duration of cluster. The cluster will be auto-deleted at the end of this period. Minimum value is 10 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    @Import(name="autoDeleteTtl")
      private final @Nullable Output<String> autoDeleteTtl;

    public Output<String> getAutoDeleteTtl() {
        return this.autoDeleteTtl == null ? Output.empty() : this.autoDeleteTtl;
    }

    /**
     * Optional. The duration to keep the cluster alive while idling (when no jobs are running). Passing this threshold will cause the cluster to be deleted. Minimum value is 5 minutes; maximum value is 14 days (see JSON representation of Duration (https://developers.google.com/protocol-buffers/docs/proto3#json)).
     * 
     */
    @Import(name="idleDeleteTtl")
      private final @Nullable Output<String> idleDeleteTtl;

    public Output<String> getIdleDeleteTtl() {
        return this.idleDeleteTtl == null ? Output.empty() : this.idleDeleteTtl;
    }

    public LifecycleConfigArgs(
        @Nullable Output<String> autoDeleteTime,
        @Nullable Output<String> autoDeleteTtl,
        @Nullable Output<String> idleDeleteTtl) {
        this.autoDeleteTime = autoDeleteTime;
        this.autoDeleteTtl = autoDeleteTtl;
        this.idleDeleteTtl = idleDeleteTtl;
    }

    private LifecycleConfigArgs() {
        this.autoDeleteTime = Output.empty();
        this.autoDeleteTtl = Output.empty();
        this.idleDeleteTtl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LifecycleConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> autoDeleteTime;
        private @Nullable Output<String> autoDeleteTtl;
        private @Nullable Output<String> idleDeleteTtl;

        public Builder() {
    	      // Empty
        }

        public Builder(LifecycleConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.autoDeleteTime = defaults.autoDeleteTime;
    	      this.autoDeleteTtl = defaults.autoDeleteTtl;
    	      this.idleDeleteTtl = defaults.idleDeleteTtl;
        }

        public Builder autoDeleteTime(@Nullable Output<String> autoDeleteTime) {
            this.autoDeleteTime = autoDeleteTime;
            return this;
        }
        public Builder autoDeleteTime(@Nullable String autoDeleteTime) {
            this.autoDeleteTime = Output.ofNullable(autoDeleteTime);
            return this;
        }
        public Builder autoDeleteTtl(@Nullable Output<String> autoDeleteTtl) {
            this.autoDeleteTtl = autoDeleteTtl;
            return this;
        }
        public Builder autoDeleteTtl(@Nullable String autoDeleteTtl) {
            this.autoDeleteTtl = Output.ofNullable(autoDeleteTtl);
            return this;
        }
        public Builder idleDeleteTtl(@Nullable Output<String> idleDeleteTtl) {
            this.idleDeleteTtl = idleDeleteTtl;
            return this;
        }
        public Builder idleDeleteTtl(@Nullable String idleDeleteTtl) {
            this.idleDeleteTtl = Output.ofNullable(idleDeleteTtl);
            return this;
        }        public LifecycleConfigArgs build() {
            return new LifecycleConfigArgs(autoDeleteTime, autoDeleteTtl, idleDeleteTtl);
        }
    }
}
