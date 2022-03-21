// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.enums.SchedulingInstanceTerminationAction;
import io.pulumi.googlenative.compute_alpha.enums.SchedulingMaintenanceInterval;
import io.pulumi.googlenative.compute_alpha.enums.SchedulingOnHostMaintenance;
import io.pulumi.googlenative.compute_alpha.enums.SchedulingProvisioningModel;
import io.pulumi.googlenative.compute_alpha.inputs.DurationArgs;
import io.pulumi.googlenative.compute_alpha.inputs.SchedulingNodeAffinityArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Sets the scheduling options for an Instance. NextID: 21
 * 
 */
public final class SchedulingArgs extends io.pulumi.resources.ResourceArgs {

    public static final SchedulingArgs Empty = new SchedulingArgs();

    /**
     * Specifies whether the instance should be automatically restarted if it is terminated by Compute Engine (not terminated by a user). You can only set the automatic restart option for standard instances. Preemptible instances cannot be automatically restarted. By default, this is set to true so an instance is automatically restarted if it is terminated by Compute Engine.
     * 
     */
    @Import(name="automaticRestart")
      private final @Nullable Output<Boolean> automaticRestart;

    public Output<Boolean> getAutomaticRestart() {
        return this.automaticRestart == null ? Output.empty() : this.automaticRestart;
    }

    /**
     * Specifies the availability domain (AD), which this instance should be scheduled on. The AD belongs to the spread GroupPlacementPolicy resource policy that has been assigned to the instance. Specify a value between 1-max count of availability domains in your GroupPlacementPolicy. See go/placement-policy-extension for more details.
     * 
     */
    @Import(name="availabilityDomain")
      private final @Nullable Output<Integer> availabilityDomain;

    public Output<Integer> getAvailabilityDomain() {
        return this.availabilityDomain == null ? Output.empty() : this.availabilityDomain;
    }

    /**
     * Current number of vCPUs available for VM. 0 or unset means default vCPUs of the current machine type.
     * 
     */
    @Import(name="currentCpus")
      private final @Nullable Output<Integer> currentCpus;

    public Output<Integer> getCurrentCpus() {
        return this.currentCpus == null ? Output.empty() : this.currentCpus;
    }

    /**
     * Current amount of memory (in MB) available for VM. 0 or unset means default amount of memory of the current machine type.
     * 
     */
    @Import(name="currentMemoryMb")
      private final @Nullable Output<String> currentMemoryMb;

    public Output<String> getCurrentMemoryMb() {
        return this.currentMemoryMb == null ? Output.empty() : this.currentMemoryMb;
    }

    /**
     * Specify the time in seconds for host error detection, the value must be within the range of [90, 330] with the increment of 30, if unset, the default behavior of host error recovery will be used.
     * 
     */
    @Import(name="hostErrorTimeoutSeconds")
      private final @Nullable Output<Integer> hostErrorTimeoutSeconds;

    public Output<Integer> getHostErrorTimeoutSeconds() {
        return this.hostErrorTimeoutSeconds == null ? Output.empty() : this.hostErrorTimeoutSeconds;
    }

    /**
     * Specifies the termination action for the instance.
     * 
     */
    @Import(name="instanceTerminationAction")
      private final @Nullable Output<SchedulingInstanceTerminationAction> instanceTerminationAction;

    public Output<SchedulingInstanceTerminationAction> getInstanceTerminationAction() {
        return this.instanceTerminationAction == null ? Output.empty() : this.instanceTerminationAction;
    }

    /**
     * Defines whether the instance is tolerant of higher cpu latency. This can only be set during instance creation, or when the instance is not currently running. It must not be set if the preemptible option is also set.
     * 
     */
    @Import(name="latencyTolerant")
      private final @Nullable Output<Boolean> latencyTolerant;

    public Output<Boolean> getLatencyTolerant() {
        return this.latencyTolerant == null ? Output.empty() : this.latencyTolerant;
    }

    /**
     * An opaque location hint used to place the instance close to other resources. This field is for use by internal tools that use the public API.
     * 
     */
    @Import(name="locationHint")
      private final @Nullable Output<String> locationHint;

    public Output<String> getLocationHint() {
        return this.locationHint == null ? Output.empty() : this.locationHint;
    }

    /**
     * Specifies the number of hours after VM instance creation where the VM won't be scheduled for maintenance.
     * 
     */
    @Import(name="maintenanceFreezeDurationHours")
      private final @Nullable Output<Integer> maintenanceFreezeDurationHours;

    public Output<Integer> getMaintenanceFreezeDurationHours() {
        return this.maintenanceFreezeDurationHours == null ? Output.empty() : this.maintenanceFreezeDurationHours;
    }

    /**
     * For more information about maintenance intervals, see Setting maintenance intervals.
     * 
     */
    @Import(name="maintenanceInterval")
      private final @Nullable Output<SchedulingMaintenanceInterval> maintenanceInterval;

    public Output<SchedulingMaintenanceInterval> getMaintenanceInterval() {
        return this.maintenanceInterval == null ? Output.empty() : this.maintenanceInterval;
    }

    /**
     * Specifies the max run duration for the given instance. If specified, the instance termination action will be performed at the end of the run duration.
     * 
     */
    @Import(name="maxRunDuration")
      private final @Nullable Output<DurationArgs> maxRunDuration;

    public Output<DurationArgs> getMaxRunDuration() {
        return this.maxRunDuration == null ? Output.empty() : this.maxRunDuration;
    }

    /**
     * The minimum number of virtual CPUs this instance will consume when running on a sole-tenant node.
     * 
     */
    @Import(name="minNodeCpus")
      private final @Nullable Output<Integer> minNodeCpus;

    public Output<Integer> getMinNodeCpus() {
        return this.minNodeCpus == null ? Output.empty() : this.minNodeCpus;
    }

    /**
     * A set of node affinity and anti-affinity configurations. Refer to Configuring node affinity for more information. Overrides reservationAffinity.
     * 
     */
    @Import(name="nodeAffinities")
      private final @Nullable Output<List<SchedulingNodeAffinityArgs>> nodeAffinities;

    public Output<List<SchedulingNodeAffinityArgs>> getNodeAffinities() {
        return this.nodeAffinities == null ? Output.empty() : this.nodeAffinities;
    }

    /**
     * Defines the maintenance behavior for this instance. For standard instances, the default behavior is MIGRATE. For preemptible instances, the default and only possible behavior is TERMINATE. For more information, see Set VM availability policies.
     * 
     */
    @Import(name="onHostMaintenance")
      private final @Nullable Output<SchedulingOnHostMaintenance> onHostMaintenance;

    public Output<SchedulingOnHostMaintenance> getOnHostMaintenance() {
        return this.onHostMaintenance == null ? Output.empty() : this.onHostMaintenance;
    }

    /**
     * Defines whether the instance is preemptible. This can only be set during instance creation or while the instance is stopped and therefore, in a `TERMINATED` state. See Instance Life Cycle for more information on the possible instance states.
     * 
     */
    @Import(name="preemptible")
      private final @Nullable Output<Boolean> preemptible;

    public Output<Boolean> getPreemptible() {
        return this.preemptible == null ? Output.empty() : this.preemptible;
    }

    /**
     * Specifies the provisioning model of the instance.
     * 
     */
    @Import(name="provisioningModel")
      private final @Nullable Output<SchedulingProvisioningModel> provisioningModel;

    public Output<SchedulingProvisioningModel> getProvisioningModel() {
        return this.provisioningModel == null ? Output.empty() : this.provisioningModel;
    }

    /**
     * Specifies the timestamp, when the instance will be terminated, in RFC3339 text format. If specified, the instance termination action will be performed at the termination time.
     * 
     */
    @Import(name="terminationTime")
      private final @Nullable Output<String> terminationTime;

    public Output<String> getTerminationTime() {
        return this.terminationTime == null ? Output.empty() : this.terminationTime;
    }

    public SchedulingArgs(
        @Nullable Output<Boolean> automaticRestart,
        @Nullable Output<Integer> availabilityDomain,
        @Nullable Output<Integer> currentCpus,
        @Nullable Output<String> currentMemoryMb,
        @Nullable Output<Integer> hostErrorTimeoutSeconds,
        @Nullable Output<SchedulingInstanceTerminationAction> instanceTerminationAction,
        @Nullable Output<Boolean> latencyTolerant,
        @Nullable Output<String> locationHint,
        @Nullable Output<Integer> maintenanceFreezeDurationHours,
        @Nullable Output<SchedulingMaintenanceInterval> maintenanceInterval,
        @Nullable Output<DurationArgs> maxRunDuration,
        @Nullable Output<Integer> minNodeCpus,
        @Nullable Output<List<SchedulingNodeAffinityArgs>> nodeAffinities,
        @Nullable Output<SchedulingOnHostMaintenance> onHostMaintenance,
        @Nullable Output<Boolean> preemptible,
        @Nullable Output<SchedulingProvisioningModel> provisioningModel,
        @Nullable Output<String> terminationTime) {
        this.automaticRestart = automaticRestart;
        this.availabilityDomain = availabilityDomain;
        this.currentCpus = currentCpus;
        this.currentMemoryMb = currentMemoryMb;
        this.hostErrorTimeoutSeconds = hostErrorTimeoutSeconds;
        this.instanceTerminationAction = instanceTerminationAction;
        this.latencyTolerant = latencyTolerant;
        this.locationHint = locationHint;
        this.maintenanceFreezeDurationHours = maintenanceFreezeDurationHours;
        this.maintenanceInterval = maintenanceInterval;
        this.maxRunDuration = maxRunDuration;
        this.minNodeCpus = minNodeCpus;
        this.nodeAffinities = nodeAffinities;
        this.onHostMaintenance = onHostMaintenance;
        this.preemptible = preemptible;
        this.provisioningModel = provisioningModel;
        this.terminationTime = terminationTime;
    }

    private SchedulingArgs() {
        this.automaticRestart = Output.empty();
        this.availabilityDomain = Output.empty();
        this.currentCpus = Output.empty();
        this.currentMemoryMb = Output.empty();
        this.hostErrorTimeoutSeconds = Output.empty();
        this.instanceTerminationAction = Output.empty();
        this.latencyTolerant = Output.empty();
        this.locationHint = Output.empty();
        this.maintenanceFreezeDurationHours = Output.empty();
        this.maintenanceInterval = Output.empty();
        this.maxRunDuration = Output.empty();
        this.minNodeCpus = Output.empty();
        this.nodeAffinities = Output.empty();
        this.onHostMaintenance = Output.empty();
        this.preemptible = Output.empty();
        this.provisioningModel = Output.empty();
        this.terminationTime = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SchedulingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> automaticRestart;
        private @Nullable Output<Integer> availabilityDomain;
        private @Nullable Output<Integer> currentCpus;
        private @Nullable Output<String> currentMemoryMb;
        private @Nullable Output<Integer> hostErrorTimeoutSeconds;
        private @Nullable Output<SchedulingInstanceTerminationAction> instanceTerminationAction;
        private @Nullable Output<Boolean> latencyTolerant;
        private @Nullable Output<String> locationHint;
        private @Nullable Output<Integer> maintenanceFreezeDurationHours;
        private @Nullable Output<SchedulingMaintenanceInterval> maintenanceInterval;
        private @Nullable Output<DurationArgs> maxRunDuration;
        private @Nullable Output<Integer> minNodeCpus;
        private @Nullable Output<List<SchedulingNodeAffinityArgs>> nodeAffinities;
        private @Nullable Output<SchedulingOnHostMaintenance> onHostMaintenance;
        private @Nullable Output<Boolean> preemptible;
        private @Nullable Output<SchedulingProvisioningModel> provisioningModel;
        private @Nullable Output<String> terminationTime;

        public Builder() {
    	      // Empty
        }

        public Builder(SchedulingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.availabilityDomain = defaults.availabilityDomain;
    	      this.currentCpus = defaults.currentCpus;
    	      this.currentMemoryMb = defaults.currentMemoryMb;
    	      this.hostErrorTimeoutSeconds = defaults.hostErrorTimeoutSeconds;
    	      this.instanceTerminationAction = defaults.instanceTerminationAction;
    	      this.latencyTolerant = defaults.latencyTolerant;
    	      this.locationHint = defaults.locationHint;
    	      this.maintenanceFreezeDurationHours = defaults.maintenanceFreezeDurationHours;
    	      this.maintenanceInterval = defaults.maintenanceInterval;
    	      this.maxRunDuration = defaults.maxRunDuration;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.preemptible = defaults.preemptible;
    	      this.provisioningModel = defaults.provisioningModel;
    	      this.terminationTime = defaults.terminationTime;
        }

        public Builder automaticRestart(@Nullable Output<Boolean> automaticRestart) {
            this.automaticRestart = automaticRestart;
            return this;
        }
        public Builder automaticRestart(@Nullable Boolean automaticRestart) {
            this.automaticRestart = Output.ofNullable(automaticRestart);
            return this;
        }
        public Builder availabilityDomain(@Nullable Output<Integer> availabilityDomain) {
            this.availabilityDomain = availabilityDomain;
            return this;
        }
        public Builder availabilityDomain(@Nullable Integer availabilityDomain) {
            this.availabilityDomain = Output.ofNullable(availabilityDomain);
            return this;
        }
        public Builder currentCpus(@Nullable Output<Integer> currentCpus) {
            this.currentCpus = currentCpus;
            return this;
        }
        public Builder currentCpus(@Nullable Integer currentCpus) {
            this.currentCpus = Output.ofNullable(currentCpus);
            return this;
        }
        public Builder currentMemoryMb(@Nullable Output<String> currentMemoryMb) {
            this.currentMemoryMb = currentMemoryMb;
            return this;
        }
        public Builder currentMemoryMb(@Nullable String currentMemoryMb) {
            this.currentMemoryMb = Output.ofNullable(currentMemoryMb);
            return this;
        }
        public Builder hostErrorTimeoutSeconds(@Nullable Output<Integer> hostErrorTimeoutSeconds) {
            this.hostErrorTimeoutSeconds = hostErrorTimeoutSeconds;
            return this;
        }
        public Builder hostErrorTimeoutSeconds(@Nullable Integer hostErrorTimeoutSeconds) {
            this.hostErrorTimeoutSeconds = Output.ofNullable(hostErrorTimeoutSeconds);
            return this;
        }
        public Builder instanceTerminationAction(@Nullable Output<SchedulingInstanceTerminationAction> instanceTerminationAction) {
            this.instanceTerminationAction = instanceTerminationAction;
            return this;
        }
        public Builder instanceTerminationAction(@Nullable SchedulingInstanceTerminationAction instanceTerminationAction) {
            this.instanceTerminationAction = Output.ofNullable(instanceTerminationAction);
            return this;
        }
        public Builder latencyTolerant(@Nullable Output<Boolean> latencyTolerant) {
            this.latencyTolerant = latencyTolerant;
            return this;
        }
        public Builder latencyTolerant(@Nullable Boolean latencyTolerant) {
            this.latencyTolerant = Output.ofNullable(latencyTolerant);
            return this;
        }
        public Builder locationHint(@Nullable Output<String> locationHint) {
            this.locationHint = locationHint;
            return this;
        }
        public Builder locationHint(@Nullable String locationHint) {
            this.locationHint = Output.ofNullable(locationHint);
            return this;
        }
        public Builder maintenanceFreezeDurationHours(@Nullable Output<Integer> maintenanceFreezeDurationHours) {
            this.maintenanceFreezeDurationHours = maintenanceFreezeDurationHours;
            return this;
        }
        public Builder maintenanceFreezeDurationHours(@Nullable Integer maintenanceFreezeDurationHours) {
            this.maintenanceFreezeDurationHours = Output.ofNullable(maintenanceFreezeDurationHours);
            return this;
        }
        public Builder maintenanceInterval(@Nullable Output<SchedulingMaintenanceInterval> maintenanceInterval) {
            this.maintenanceInterval = maintenanceInterval;
            return this;
        }
        public Builder maintenanceInterval(@Nullable SchedulingMaintenanceInterval maintenanceInterval) {
            this.maintenanceInterval = Output.ofNullable(maintenanceInterval);
            return this;
        }
        public Builder maxRunDuration(@Nullable Output<DurationArgs> maxRunDuration) {
            this.maxRunDuration = maxRunDuration;
            return this;
        }
        public Builder maxRunDuration(@Nullable DurationArgs maxRunDuration) {
            this.maxRunDuration = Output.ofNullable(maxRunDuration);
            return this;
        }
        public Builder minNodeCpus(@Nullable Output<Integer> minNodeCpus) {
            this.minNodeCpus = minNodeCpus;
            return this;
        }
        public Builder minNodeCpus(@Nullable Integer minNodeCpus) {
            this.minNodeCpus = Output.ofNullable(minNodeCpus);
            return this;
        }
        public Builder nodeAffinities(@Nullable Output<List<SchedulingNodeAffinityArgs>> nodeAffinities) {
            this.nodeAffinities = nodeAffinities;
            return this;
        }
        public Builder nodeAffinities(@Nullable List<SchedulingNodeAffinityArgs> nodeAffinities) {
            this.nodeAffinities = Output.ofNullable(nodeAffinities);
            return this;
        }
        public Builder nodeAffinities(SchedulingNodeAffinityArgs... nodeAffinities) {
            return nodeAffinities(List.of(nodeAffinities));
        }
        public Builder onHostMaintenance(@Nullable Output<SchedulingOnHostMaintenance> onHostMaintenance) {
            this.onHostMaintenance = onHostMaintenance;
            return this;
        }
        public Builder onHostMaintenance(@Nullable SchedulingOnHostMaintenance onHostMaintenance) {
            this.onHostMaintenance = Output.ofNullable(onHostMaintenance);
            return this;
        }
        public Builder preemptible(@Nullable Output<Boolean> preemptible) {
            this.preemptible = preemptible;
            return this;
        }
        public Builder preemptible(@Nullable Boolean preemptible) {
            this.preemptible = Output.ofNullable(preemptible);
            return this;
        }
        public Builder provisioningModel(@Nullable Output<SchedulingProvisioningModel> provisioningModel) {
            this.provisioningModel = provisioningModel;
            return this;
        }
        public Builder provisioningModel(@Nullable SchedulingProvisioningModel provisioningModel) {
            this.provisioningModel = Output.ofNullable(provisioningModel);
            return this;
        }
        public Builder terminationTime(@Nullable Output<String> terminationTime) {
            this.terminationTime = terminationTime;
            return this;
        }
        public Builder terminationTime(@Nullable String terminationTime) {
            this.terminationTime = Output.ofNullable(terminationTime);
            return this;
        }        public SchedulingArgs build() {
            return new SchedulingArgs(automaticRestart, availabilityDomain, currentCpus, currentMemoryMb, hostErrorTimeoutSeconds, instanceTerminationAction, latencyTolerant, locationHint, maintenanceFreezeDurationHours, maintenanceInterval, maxRunDuration, minNodeCpus, nodeAffinities, onHostMaintenance, preemptible, provisioningModel, terminationTime);
        }
    }
}
