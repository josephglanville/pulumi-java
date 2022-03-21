// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceGroupManagerUpdatePolicy {
    /**
     * , The maximum number of instances that can be created above the specified targetSize during the update process. Conflicts with `max_surge_percent`. If neither is set, defaults to 1
     * 
     */
    private final @Nullable Integer maxSurgeFixed;
    /**
     * , The maximum number of instances(calculated as percentage) that can be created above the specified targetSize during the update process. Conflicts with `max_surge_fixed`.
     * 
     */
    private final @Nullable Integer maxSurgePercent;
    /**
     * , The maximum number of instances that can be unavailable during the update process. Conflicts with `max_unavailable_percent`. If neither is set, defaults to 1
     * 
     */
    private final @Nullable Integer maxUnavailableFixed;
    /**
     * , The maximum number of instances(calculated as percentage) that can be unavailable during the update process. Conflicts with `max_unavailable_fixed`.
     * 
     */
    private final @Nullable Integer maxUnavailablePercent;
    /**
     * ), Minimum number of seconds to wait for after a newly created instance becomes available. This value must be from range [0, 3600]
     * 
     */
    private final @Nullable Integer minReadySec;
    /**
     * - Minimal action to be taken on an instance. You can specify either `RESTART` to restart existing instances or `REPLACE` to delete and create new instances from the target template. If you specify a `RESTART`, the Updater will attempt to perform that action only. However, if the Updater determines that the minimal action you specify is not enough to perform the update, it might perform a more disruptive action.
     * 
     */
    private final String minimalAction;
    /**
     * , The instance replacement method for managed instance groups. Valid values are: "RECREATE", "SUBSTITUTE". If SUBSTITUTE (default), the group replaces VM instances with new instances that have randomly generated names. If RECREATE, instance names are preserved.  You must also set max_unavailable_fixed or max_unavailable_percent to be greater than 0.
     * ***
     * 
     */
    private final @Nullable String replacementMethod;
    /**
     * - The type of update process. You can specify either `PROACTIVE` so that the instance group manager proactively executes actions in order to bring instances to their target versions or `OPPORTUNISTIC` so that no action is proactively executed but the update will be performed as part of other actions (for example, resizes or recreateInstances calls).
     * 
     */
    private final String type;

    @CustomType.Constructor
    private InstanceGroupManagerUpdatePolicy(
        @CustomType.Parameter("maxSurgeFixed") @Nullable Integer maxSurgeFixed,
        @CustomType.Parameter("maxSurgePercent") @Nullable Integer maxSurgePercent,
        @CustomType.Parameter("maxUnavailableFixed") @Nullable Integer maxUnavailableFixed,
        @CustomType.Parameter("maxUnavailablePercent") @Nullable Integer maxUnavailablePercent,
        @CustomType.Parameter("minReadySec") @Nullable Integer minReadySec,
        @CustomType.Parameter("minimalAction") String minimalAction,
        @CustomType.Parameter("replacementMethod") @Nullable String replacementMethod,
        @CustomType.Parameter("type") String type) {
        this.maxSurgeFixed = maxSurgeFixed;
        this.maxSurgePercent = maxSurgePercent;
        this.maxUnavailableFixed = maxUnavailableFixed;
        this.maxUnavailablePercent = maxUnavailablePercent;
        this.minReadySec = minReadySec;
        this.minimalAction = minimalAction;
        this.replacementMethod = replacementMethod;
        this.type = type;
    }

    /**
     * , The maximum number of instances that can be created above the specified targetSize during the update process. Conflicts with `max_surge_percent`. If neither is set, defaults to 1
     * 
    */
    public Optional<Integer> getMaxSurgeFixed() {
        return Optional.ofNullable(this.maxSurgeFixed);
    }
    /**
     * , The maximum number of instances(calculated as percentage) that can be created above the specified targetSize during the update process. Conflicts with `max_surge_fixed`.
     * 
    */
    public Optional<Integer> getMaxSurgePercent() {
        return Optional.ofNullable(this.maxSurgePercent);
    }
    /**
     * , The maximum number of instances that can be unavailable during the update process. Conflicts with `max_unavailable_percent`. If neither is set, defaults to 1
     * 
    */
    public Optional<Integer> getMaxUnavailableFixed() {
        return Optional.ofNullable(this.maxUnavailableFixed);
    }
    /**
     * , The maximum number of instances(calculated as percentage) that can be unavailable during the update process. Conflicts with `max_unavailable_fixed`.
     * 
    */
    public Optional<Integer> getMaxUnavailablePercent() {
        return Optional.ofNullable(this.maxUnavailablePercent);
    }
    /**
     * ), Minimum number of seconds to wait for after a newly created instance becomes available. This value must be from range [0, 3600]
     * 
    */
    public Optional<Integer> getMinReadySec() {
        return Optional.ofNullable(this.minReadySec);
    }
    /**
     * - Minimal action to be taken on an instance. You can specify either `RESTART` to restart existing instances or `REPLACE` to delete and create new instances from the target template. If you specify a `RESTART`, the Updater will attempt to perform that action only. However, if the Updater determines that the minimal action you specify is not enough to perform the update, it might perform a more disruptive action.
     * 
    */
    public String getMinimalAction() {
        return this.minimalAction;
    }
    /**
     * , The instance replacement method for managed instance groups. Valid values are: "RECREATE", "SUBSTITUTE". If SUBSTITUTE (default), the group replaces VM instances with new instances that have randomly generated names. If RECREATE, instance names are preserved.  You must also set max_unavailable_fixed or max_unavailable_percent to be greater than 0.
     * ***
     * 
    */
    public Optional<String> getReplacementMethod() {
        return Optional.ofNullable(this.replacementMethod);
    }
    /**
     * - The type of update process. You can specify either `PROACTIVE` so that the instance group manager proactively executes actions in order to bring instances to their target versions or `OPPORTUNISTIC` so that no action is proactively executed but the update will be performed as part of other actions (for example, resizes or recreateInstances calls).
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerUpdatePolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer maxSurgeFixed;
        private @Nullable Integer maxSurgePercent;
        private @Nullable Integer maxUnavailableFixed;
        private @Nullable Integer maxUnavailablePercent;
        private @Nullable Integer minReadySec;
        private String minimalAction;
        private @Nullable String replacementMethod;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerUpdatePolicy defaults) {
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

        public Builder maxSurgeFixed(@Nullable Integer maxSurgeFixed) {
            this.maxSurgeFixed = maxSurgeFixed;
            return this;
        }
        public Builder maxSurgePercent(@Nullable Integer maxSurgePercent) {
            this.maxSurgePercent = maxSurgePercent;
            return this;
        }
        public Builder maxUnavailableFixed(@Nullable Integer maxUnavailableFixed) {
            this.maxUnavailableFixed = maxUnavailableFixed;
            return this;
        }
        public Builder maxUnavailablePercent(@Nullable Integer maxUnavailablePercent) {
            this.maxUnavailablePercent = maxUnavailablePercent;
            return this;
        }
        public Builder minReadySec(@Nullable Integer minReadySec) {
            this.minReadySec = minReadySec;
            return this;
        }
        public Builder minimalAction(String minimalAction) {
            this.minimalAction = Objects.requireNonNull(minimalAction);
            return this;
        }
        public Builder replacementMethod(@Nullable String replacementMethod) {
            this.replacementMethod = replacementMethod;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public InstanceGroupManagerUpdatePolicy build() {
            return new InstanceGroupManagerUpdatePolicy(maxSurgeFixed, maxSurgePercent, maxUnavailableFixed, maxUnavailablePercent, minReadySec, minimalAction, replacementMethod, type);
        }
    }
}
