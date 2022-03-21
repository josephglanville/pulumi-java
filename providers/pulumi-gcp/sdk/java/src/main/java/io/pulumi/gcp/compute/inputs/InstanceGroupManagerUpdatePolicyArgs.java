// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceGroupManagerUpdatePolicyArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceGroupManagerUpdatePolicyArgs Empty = new InstanceGroupManagerUpdatePolicyArgs();

    /**
     * , The maximum number of instances that can be created above the specified targetSize during the update process. Conflicts with `max_surge_percent`. If neither is set, defaults to 1
     * 
     */
    @Import(name="maxSurgeFixed")
      private final @Nullable Output<Integer> maxSurgeFixed;

    public Output<Integer> getMaxSurgeFixed() {
        return this.maxSurgeFixed == null ? Output.empty() : this.maxSurgeFixed;
    }

    /**
     * , The maximum number of instances(calculated as percentage) that can be created above the specified targetSize during the update process. Conflicts with `max_surge_fixed`.
     * 
     */
    @Import(name="maxSurgePercent")
      private final @Nullable Output<Integer> maxSurgePercent;

    public Output<Integer> getMaxSurgePercent() {
        return this.maxSurgePercent == null ? Output.empty() : this.maxSurgePercent;
    }

    /**
     * , The maximum number of instances that can be unavailable during the update process. Conflicts with `max_unavailable_percent`. If neither is set, defaults to 1
     * 
     */
    @Import(name="maxUnavailableFixed")
      private final @Nullable Output<Integer> maxUnavailableFixed;

    public Output<Integer> getMaxUnavailableFixed() {
        return this.maxUnavailableFixed == null ? Output.empty() : this.maxUnavailableFixed;
    }

    /**
     * , The maximum number of instances(calculated as percentage) that can be unavailable during the update process. Conflicts with `max_unavailable_fixed`.
     * 
     */
    @Import(name="maxUnavailablePercent")
      private final @Nullable Output<Integer> maxUnavailablePercent;

    public Output<Integer> getMaxUnavailablePercent() {
        return this.maxUnavailablePercent == null ? Output.empty() : this.maxUnavailablePercent;
    }

    /**
     * ), Minimum number of seconds to wait for after a newly created instance becomes available. This value must be from range [0, 3600]
     * 
     */
    @Import(name="minReadySec")
      private final @Nullable Output<Integer> minReadySec;

    public Output<Integer> getMinReadySec() {
        return this.minReadySec == null ? Output.empty() : this.minReadySec;
    }

    /**
     * - Minimal action to be taken on an instance. You can specify either `RESTART` to restart existing instances or `REPLACE` to delete and create new instances from the target template. If you specify a `RESTART`, the Updater will attempt to perform that action only. However, if the Updater determines that the minimal action you specify is not enough to perform the update, it might perform a more disruptive action.
     * 
     */
    @Import(name="minimalAction", required=true)
      private final Output<String> minimalAction;

    public Output<String> getMinimalAction() {
        return this.minimalAction;
    }

    /**
     * , The instance replacement method for managed instance groups. Valid values are: "RECREATE", "SUBSTITUTE". If SUBSTITUTE (default), the group replaces VM instances with new instances that have randomly generated names. If RECREATE, instance names are preserved.  You must also set max_unavailable_fixed or max_unavailable_percent to be greater than 0.
     * ***
     * 
     */
    @Import(name="replacementMethod")
      private final @Nullable Output<String> replacementMethod;

    public Output<String> getReplacementMethod() {
        return this.replacementMethod == null ? Output.empty() : this.replacementMethod;
    }

    /**
     * - The type of update process. You can specify either `PROACTIVE` so that the instance group manager proactively executes actions in order to bring instances to their target versions or `OPPORTUNISTIC` so that no action is proactively executed but the update will be performed as part of other actions (for example, resizes or recreateInstances calls).
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public InstanceGroupManagerUpdatePolicyArgs(
        @Nullable Output<Integer> maxSurgeFixed,
        @Nullable Output<Integer> maxSurgePercent,
        @Nullable Output<Integer> maxUnavailableFixed,
        @Nullable Output<Integer> maxUnavailablePercent,
        @Nullable Output<Integer> minReadySec,
        Output<String> minimalAction,
        @Nullable Output<String> replacementMethod,
        Output<String> type) {
        this.maxSurgeFixed = maxSurgeFixed;
        this.maxSurgePercent = maxSurgePercent;
        this.maxUnavailableFixed = maxUnavailableFixed;
        this.maxUnavailablePercent = maxUnavailablePercent;
        this.minReadySec = minReadySec;
        this.minimalAction = Objects.requireNonNull(minimalAction, "expected parameter 'minimalAction' to be non-null");
        this.replacementMethod = replacementMethod;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private InstanceGroupManagerUpdatePolicyArgs() {
        this.maxSurgeFixed = Output.empty();
        this.maxSurgePercent = Output.empty();
        this.maxUnavailableFixed = Output.empty();
        this.maxUnavailablePercent = Output.empty();
        this.minReadySec = Output.empty();
        this.minimalAction = Output.empty();
        this.replacementMethod = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerUpdatePolicyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> maxSurgeFixed;
        private @Nullable Output<Integer> maxSurgePercent;
        private @Nullable Output<Integer> maxUnavailableFixed;
        private @Nullable Output<Integer> maxUnavailablePercent;
        private @Nullable Output<Integer> minReadySec;
        private Output<String> minimalAction;
        private @Nullable Output<String> replacementMethod;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerUpdatePolicyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.maxSurgeFixed = defaults.maxSurgeFixed;
    	      this.maxSurgePercent = defaults.maxSurgePercent;
    	      this.maxUnavailableFixed = defaults.maxUnavailableFixed;
    	      this.maxUnavailablePercent = defaults.maxUnavailablePercent;
    	      this.minReadySec = defaults.minReadySec;
    	      this.minimalAction = defaults.minimalAction;
    	      this.replacementMethod = defaults.replacementMethod;
    	      this.type = defaults.type;
        }

        public Builder maxSurgeFixed(@Nullable Output<Integer> maxSurgeFixed) {
            this.maxSurgeFixed = maxSurgeFixed;
            return this;
        }
        public Builder maxSurgeFixed(@Nullable Integer maxSurgeFixed) {
            this.maxSurgeFixed = Output.ofNullable(maxSurgeFixed);
            return this;
        }
        public Builder maxSurgePercent(@Nullable Output<Integer> maxSurgePercent) {
            this.maxSurgePercent = maxSurgePercent;
            return this;
        }
        public Builder maxSurgePercent(@Nullable Integer maxSurgePercent) {
            this.maxSurgePercent = Output.ofNullable(maxSurgePercent);
            return this;
        }
        public Builder maxUnavailableFixed(@Nullable Output<Integer> maxUnavailableFixed) {
            this.maxUnavailableFixed = maxUnavailableFixed;
            return this;
        }
        public Builder maxUnavailableFixed(@Nullable Integer maxUnavailableFixed) {
            this.maxUnavailableFixed = Output.ofNullable(maxUnavailableFixed);
            return this;
        }
        public Builder maxUnavailablePercent(@Nullable Output<Integer> maxUnavailablePercent) {
            this.maxUnavailablePercent = maxUnavailablePercent;
            return this;
        }
        public Builder maxUnavailablePercent(@Nullable Integer maxUnavailablePercent) {
            this.maxUnavailablePercent = Output.ofNullable(maxUnavailablePercent);
            return this;
        }
        public Builder minReadySec(@Nullable Output<Integer> minReadySec) {
            this.minReadySec = minReadySec;
            return this;
        }
        public Builder minReadySec(@Nullable Integer minReadySec) {
            this.minReadySec = Output.ofNullable(minReadySec);
            return this;
        }
        public Builder minimalAction(Output<String> minimalAction) {
            this.minimalAction = Objects.requireNonNull(minimalAction);
            return this;
        }
        public Builder minimalAction(String minimalAction) {
            this.minimalAction = Output.of(Objects.requireNonNull(minimalAction));
            return this;
        }
        public Builder replacementMethod(@Nullable Output<String> replacementMethod) {
            this.replacementMethod = replacementMethod;
            return this;
        }
        public Builder replacementMethod(@Nullable String replacementMethod) {
            this.replacementMethod = Output.ofNullable(replacementMethod);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public InstanceGroupManagerUpdatePolicyArgs build() {
            return new InstanceGroupManagerUpdatePolicyArgs(maxSurgeFixed, maxSurgePercent, maxUnavailableFixed, maxUnavailablePercent, minReadySec, minimalAction, replacementMethod, type);
        }
    }
}
