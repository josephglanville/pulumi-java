// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_beta.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.googlenative.compute_beta.enums.SchedulingInstanceTerminationAction;
import io.pulumi.googlenative.compute_beta.enums.SchedulingMaintenanceInterval;
import io.pulumi.googlenative.compute_beta.enums.SchedulingOnHostMaintenance;
import io.pulumi.googlenative.compute_beta.enums.SchedulingProvisioningModel;
import io.pulumi.googlenative.compute_beta.inputs.SchedulingNodeAffinityArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class SchedulingArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchedulingArgs Empty = new SchedulingArgs();

    @InputImport(name="automaticRestart")
    private final @Nullable Input<Boolean> automaticRestart;

    public Input<Boolean> getAutomaticRestart() {
        return this.automaticRestart == null ? Input.empty() : this.automaticRestart;
    }

    @InputImport(name="hostErrorTimeoutSeconds")
    private final @Nullable Input<Integer> hostErrorTimeoutSeconds;

    public Input<Integer> getHostErrorTimeoutSeconds() {
        return this.hostErrorTimeoutSeconds == null ? Input.empty() : this.hostErrorTimeoutSeconds;
    }

    @InputImport(name="instanceTerminationAction")
    private final @Nullable Input<SchedulingInstanceTerminationAction> instanceTerminationAction;

    public Input<SchedulingInstanceTerminationAction> getInstanceTerminationAction() {
        return this.instanceTerminationAction == null ? Input.empty() : this.instanceTerminationAction;
    }

    @InputImport(name="locationHint")
    private final @Nullable Input<String> locationHint;

    public Input<String> getLocationHint() {
        return this.locationHint == null ? Input.empty() : this.locationHint;
    }

    @InputImport(name="maintenanceFreezeDurationHours")
    private final @Nullable Input<Integer> maintenanceFreezeDurationHours;

    public Input<Integer> getMaintenanceFreezeDurationHours() {
        return this.maintenanceFreezeDurationHours == null ? Input.empty() : this.maintenanceFreezeDurationHours;
    }

    @InputImport(name="maintenanceInterval")
    private final @Nullable Input<SchedulingMaintenanceInterval> maintenanceInterval;

    public Input<SchedulingMaintenanceInterval> getMaintenanceInterval() {
        return this.maintenanceInterval == null ? Input.empty() : this.maintenanceInterval;
    }

    @InputImport(name="minNodeCpus")
    private final @Nullable Input<Integer> minNodeCpus;

    public Input<Integer> getMinNodeCpus() {
        return this.minNodeCpus == null ? Input.empty() : this.minNodeCpus;
    }

    @InputImport(name="nodeAffinities")
    private final @Nullable Input<List<SchedulingNodeAffinityArgs>> nodeAffinities;

    public Input<List<SchedulingNodeAffinityArgs>> getNodeAffinities() {
        return this.nodeAffinities == null ? Input.empty() : this.nodeAffinities;
    }

    @InputImport(name="onHostMaintenance")
    private final @Nullable Input<SchedulingOnHostMaintenance> onHostMaintenance;

    public Input<SchedulingOnHostMaintenance> getOnHostMaintenance() {
        return this.onHostMaintenance == null ? Input.empty() : this.onHostMaintenance;
    }

    @InputImport(name="preemptible")
    private final @Nullable Input<Boolean> preemptible;

    public Input<Boolean> getPreemptible() {
        return this.preemptible == null ? Input.empty() : this.preemptible;
    }

    @InputImport(name="provisioningModel")
    private final @Nullable Input<SchedulingProvisioningModel> provisioningModel;

    public Input<SchedulingProvisioningModel> getProvisioningModel() {
        return this.provisioningModel == null ? Input.empty() : this.provisioningModel;
    }

    public SchedulingArgs(
        @Nullable Input<Boolean> automaticRestart,
        @Nullable Input<Integer> hostErrorTimeoutSeconds,
        @Nullable Input<SchedulingInstanceTerminationAction> instanceTerminationAction,
        @Nullable Input<String> locationHint,
        @Nullable Input<Integer> maintenanceFreezeDurationHours,
        @Nullable Input<SchedulingMaintenanceInterval> maintenanceInterval,
        @Nullable Input<Integer> minNodeCpus,
        @Nullable Input<List<SchedulingNodeAffinityArgs>> nodeAffinities,
        @Nullable Input<SchedulingOnHostMaintenance> onHostMaintenance,
        @Nullable Input<Boolean> preemptible,
        @Nullable Input<SchedulingProvisioningModel> provisioningModel) {
        this.automaticRestart = automaticRestart;
        this.hostErrorTimeoutSeconds = hostErrorTimeoutSeconds;
        this.instanceTerminationAction = instanceTerminationAction;
        this.locationHint = locationHint;
        this.maintenanceFreezeDurationHours = maintenanceFreezeDurationHours;
        this.maintenanceInterval = maintenanceInterval;
        this.minNodeCpus = minNodeCpus;
        this.nodeAffinities = nodeAffinities;
        this.onHostMaintenance = onHostMaintenance;
        this.preemptible = preemptible;
        this.provisioningModel = provisioningModel;
    }

    private SchedulingArgs() {
        this.automaticRestart = Input.empty();
        this.hostErrorTimeoutSeconds = Input.empty();
        this.instanceTerminationAction = Input.empty();
        this.locationHint = Input.empty();
        this.maintenanceFreezeDurationHours = Input.empty();
        this.maintenanceInterval = Input.empty();
        this.minNodeCpus = Input.empty();
        this.nodeAffinities = Input.empty();
        this.onHostMaintenance = Input.empty();
        this.preemptible = Input.empty();
        this.provisioningModel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> automaticRestart;
        private @Nullable Input<Integer> hostErrorTimeoutSeconds;
        private @Nullable Input<SchedulingInstanceTerminationAction> instanceTerminationAction;
        private @Nullable Input<String> locationHint;
        private @Nullable Input<Integer> maintenanceFreezeDurationHours;
        private @Nullable Input<SchedulingMaintenanceInterval> maintenanceInterval;
        private @Nullable Input<Integer> minNodeCpus;
        private @Nullable Input<List<SchedulingNodeAffinityArgs>> nodeAffinities;
        private @Nullable Input<SchedulingOnHostMaintenance> onHostMaintenance;
        private @Nullable Input<Boolean> preemptible;
        private @Nullable Input<SchedulingProvisioningModel> provisioningModel;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.hostErrorTimeoutSeconds = defaults.hostErrorTimeoutSeconds;
    	      this.instanceTerminationAction = defaults.instanceTerminationAction;
    	      this.locationHint = defaults.locationHint;
    	      this.maintenanceFreezeDurationHours = defaults.maintenanceFreezeDurationHours;
    	      this.maintenanceInterval = defaults.maintenanceInterval;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.preemptible = defaults.preemptible;
    	      this.provisioningModel = defaults.provisioningModel;
        }

        public Builder setAutomaticRestart(@Nullable Input<Boolean> automaticRestart) {
            this.automaticRestart = automaticRestart;
            return this;
        }

        public Builder setAutomaticRestart(@Nullable Boolean automaticRestart) {
            this.automaticRestart = Input.ofNullable(automaticRestart);
            return this;
        }

        public Builder setHostErrorTimeoutSeconds(@Nullable Input<Integer> hostErrorTimeoutSeconds) {
            this.hostErrorTimeoutSeconds = hostErrorTimeoutSeconds;
            return this;
        }

        public Builder setHostErrorTimeoutSeconds(@Nullable Integer hostErrorTimeoutSeconds) {
            this.hostErrorTimeoutSeconds = Input.ofNullable(hostErrorTimeoutSeconds);
            return this;
        }

        public Builder setInstanceTerminationAction(@Nullable Input<SchedulingInstanceTerminationAction> instanceTerminationAction) {
            this.instanceTerminationAction = instanceTerminationAction;
            return this;
        }

        public Builder setInstanceTerminationAction(@Nullable SchedulingInstanceTerminationAction instanceTerminationAction) {
            this.instanceTerminationAction = Input.ofNullable(instanceTerminationAction);
            return this;
        }

        public Builder setLocationHint(@Nullable Input<String> locationHint) {
            this.locationHint = locationHint;
            return this;
        }

        public Builder setLocationHint(@Nullable String locationHint) {
            this.locationHint = Input.ofNullable(locationHint);
            return this;
        }

        public Builder setMaintenanceFreezeDurationHours(@Nullable Input<Integer> maintenanceFreezeDurationHours) {
            this.maintenanceFreezeDurationHours = maintenanceFreezeDurationHours;
            return this;
        }

        public Builder setMaintenanceFreezeDurationHours(@Nullable Integer maintenanceFreezeDurationHours) {
            this.maintenanceFreezeDurationHours = Input.ofNullable(maintenanceFreezeDurationHours);
            return this;
        }

        public Builder setMaintenanceInterval(@Nullable Input<SchedulingMaintenanceInterval> maintenanceInterval) {
            this.maintenanceInterval = maintenanceInterval;
            return this;
        }

        public Builder setMaintenanceInterval(@Nullable SchedulingMaintenanceInterval maintenanceInterval) {
            this.maintenanceInterval = Input.ofNullable(maintenanceInterval);
            return this;
        }

        public Builder setMinNodeCpus(@Nullable Input<Integer> minNodeCpus) {
            this.minNodeCpus = minNodeCpus;
            return this;
        }

        public Builder setMinNodeCpus(@Nullable Integer minNodeCpus) {
            this.minNodeCpus = Input.ofNullable(minNodeCpus);
            return this;
        }

        public Builder setNodeAffinities(@Nullable Input<List<SchedulingNodeAffinityArgs>> nodeAffinities) {
            this.nodeAffinities = nodeAffinities;
            return this;
        }

        public Builder setNodeAffinities(@Nullable List<SchedulingNodeAffinityArgs> nodeAffinities) {
            this.nodeAffinities = Input.ofNullable(nodeAffinities);
            return this;
        }

        public Builder setOnHostMaintenance(@Nullable Input<SchedulingOnHostMaintenance> onHostMaintenance) {
            this.onHostMaintenance = onHostMaintenance;
            return this;
        }

        public Builder setOnHostMaintenance(@Nullable SchedulingOnHostMaintenance onHostMaintenance) {
            this.onHostMaintenance = Input.ofNullable(onHostMaintenance);
            return this;
        }

        public Builder setPreemptible(@Nullable Input<Boolean> preemptible) {
            this.preemptible = preemptible;
            return this;
        }

        public Builder setPreemptible(@Nullable Boolean preemptible) {
            this.preemptible = Input.ofNullable(preemptible);
            return this;
        }

        public Builder setProvisioningModel(@Nullable Input<SchedulingProvisioningModel> provisioningModel) {
            this.provisioningModel = provisioningModel;
            return this;
        }

        public Builder setProvisioningModel(@Nullable SchedulingProvisioningModel provisioningModel) {
            this.provisioningModel = Input.ofNullable(provisioningModel);
            return this;
        }

        public SchedulingArgs build() {
            return new SchedulingArgs(automaticRestart, hostErrorTimeoutSeconds, instanceTerminationAction, locationHint, maintenanceFreezeDurationHours, maintenanceInterval, minNodeCpus, nodeAffinities, onHostMaintenance, preemptible, provisioningModel);
        }
    }
}