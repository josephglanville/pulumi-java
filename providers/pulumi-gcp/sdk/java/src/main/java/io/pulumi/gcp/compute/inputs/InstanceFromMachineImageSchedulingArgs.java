// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.compute.inputs.InstanceFromMachineImageSchedulingNodeAffinityArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class InstanceFromMachineImageSchedulingArgs extends io.pulumi.resources.ResourceArgs {

    public static final InstanceFromMachineImageSchedulingArgs Empty = new InstanceFromMachineImageSchedulingArgs();

    @Import(name="automaticRestart")
      private final @Nullable Output<Boolean> automaticRestart;

    public Output<Boolean> getAutomaticRestart() {
        return this.automaticRestart == null ? Output.empty() : this.automaticRestart;
    }

    @Import(name="minNodeCpus")
      private final @Nullable Output<Integer> minNodeCpus;

    public Output<Integer> getMinNodeCpus() {
        return this.minNodeCpus == null ? Output.empty() : this.minNodeCpus;
    }

    @Import(name="nodeAffinities")
      private final @Nullable Output<List<InstanceFromMachineImageSchedulingNodeAffinityArgs>> nodeAffinities;

    public Output<List<InstanceFromMachineImageSchedulingNodeAffinityArgs>> getNodeAffinities() {
        return this.nodeAffinities == null ? Output.empty() : this.nodeAffinities;
    }

    @Import(name="onHostMaintenance")
      private final @Nullable Output<String> onHostMaintenance;

    public Output<String> getOnHostMaintenance() {
        return this.onHostMaintenance == null ? Output.empty() : this.onHostMaintenance;
    }

    @Import(name="preemptible")
      private final @Nullable Output<Boolean> preemptible;

    public Output<Boolean> getPreemptible() {
        return this.preemptible == null ? Output.empty() : this.preemptible;
    }

    public InstanceFromMachineImageSchedulingArgs(
        @Nullable Output<Boolean> automaticRestart,
        @Nullable Output<Integer> minNodeCpus,
        @Nullable Output<List<InstanceFromMachineImageSchedulingNodeAffinityArgs>> nodeAffinities,
        @Nullable Output<String> onHostMaintenance,
        @Nullable Output<Boolean> preemptible) {
        this.automaticRestart = automaticRestart;
        this.minNodeCpus = minNodeCpus;
        this.nodeAffinities = nodeAffinities;
        this.onHostMaintenance = onHostMaintenance;
        this.preemptible = preemptible;
    }

    private InstanceFromMachineImageSchedulingArgs() {
        this.automaticRestart = Output.empty();
        this.minNodeCpus = Output.empty();
        this.nodeAffinities = Output.empty();
        this.onHostMaintenance = Output.empty();
        this.preemptible = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceFromMachineImageSchedulingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> automaticRestart;
        private @Nullable Output<Integer> minNodeCpus;
        private @Nullable Output<List<InstanceFromMachineImageSchedulingNodeAffinityArgs>> nodeAffinities;
        private @Nullable Output<String> onHostMaintenance;
        private @Nullable Output<Boolean> preemptible;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceFromMachineImageSchedulingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automaticRestart = defaults.automaticRestart;
    	      this.minNodeCpus = defaults.minNodeCpus;
    	      this.nodeAffinities = defaults.nodeAffinities;
    	      this.onHostMaintenance = defaults.onHostMaintenance;
    	      this.preemptible = defaults.preemptible;
        }

        public Builder automaticRestart(@Nullable Output<Boolean> automaticRestart) {
            this.automaticRestart = automaticRestart;
            return this;
        }
        public Builder automaticRestart(@Nullable Boolean automaticRestart) {
            this.automaticRestart = Output.ofNullable(automaticRestart);
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
        public Builder nodeAffinities(@Nullable Output<List<InstanceFromMachineImageSchedulingNodeAffinityArgs>> nodeAffinities) {
            this.nodeAffinities = nodeAffinities;
            return this;
        }
        public Builder nodeAffinities(@Nullable List<InstanceFromMachineImageSchedulingNodeAffinityArgs> nodeAffinities) {
            this.nodeAffinities = Output.ofNullable(nodeAffinities);
            return this;
        }
        public Builder nodeAffinities(InstanceFromMachineImageSchedulingNodeAffinityArgs... nodeAffinities) {
            return nodeAffinities(List.of(nodeAffinities));
        }
        public Builder onHostMaintenance(@Nullable Output<String> onHostMaintenance) {
            this.onHostMaintenance = onHostMaintenance;
            return this;
        }
        public Builder onHostMaintenance(@Nullable String onHostMaintenance) {
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
        }        public InstanceFromMachineImageSchedulingArgs build() {
            return new InstanceFromMachineImageSchedulingArgs(automaticRestart, minNodeCpus, nodeAffinities, onHostMaintenance, preemptible);
        }
    }
}
