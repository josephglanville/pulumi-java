// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.apps_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.kubernetes.apps_v1.inputs.RollingUpdateDaemonSetArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * DaemonSetUpdateStrategy is a struct used to control the update strategy for a DaemonSet.
 * 
 */
public final class DaemonSetUpdateStrategyArgs extends io.pulumi.resources.ResourceArgs {

    public static final DaemonSetUpdateStrategyArgs Empty = new DaemonSetUpdateStrategyArgs();

    /**
     * Rolling update config params. Present only if type = "RollingUpdate".
     * 
     */
    @Import(name="rollingUpdate")
      private final @Nullable Output<RollingUpdateDaemonSetArgs> rollingUpdate;

    public Output<RollingUpdateDaemonSetArgs> getRollingUpdate() {
        return this.rollingUpdate == null ? Codegen.empty() : this.rollingUpdate;
    }

    /**
     * Type of daemon set update. Can be "RollingUpdate" or "OnDelete". Default is RollingUpdate.
     * 
     * Possible enum values:
     *  - `"OnDelete"` Replace the old daemons only when it's killed
     *  - `"RollingUpdate"` Replace the old daemons by new ones using rolling update i.e replace them on each node one after the other.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public DaemonSetUpdateStrategyArgs(
        @Nullable Output<RollingUpdateDaemonSetArgs> rollingUpdate,
        @Nullable Output<String> type) {
        this.rollingUpdate = rollingUpdate;
        this.type = type;
    }

    private DaemonSetUpdateStrategyArgs() {
        this.rollingUpdate = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DaemonSetUpdateStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<RollingUpdateDaemonSetArgs> rollingUpdate;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(DaemonSetUpdateStrategyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.rollingUpdate = defaults.rollingUpdate;
    	      this.type = defaults.type;
        }

        public Builder rollingUpdate(@Nullable Output<RollingUpdateDaemonSetArgs> rollingUpdate) {
            this.rollingUpdate = rollingUpdate;
            return this;
        }
        public Builder rollingUpdate(@Nullable RollingUpdateDaemonSetArgs rollingUpdate) {
            this.rollingUpdate = Codegen.ofNullable(rollingUpdate);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public DaemonSetUpdateStrategyArgs build() {
            return new DaemonSetUpdateStrategyArgs(rollingUpdate, type);
        }
    }
}
