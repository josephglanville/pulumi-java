// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.osconfig.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.osconfig.inputs.PatchDeploymentInstanceFilterGroupLabelArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PatchDeploymentInstanceFilterArgs extends io.pulumi.resources.ResourceArgs {

    public static final PatchDeploymentInstanceFilterArgs Empty = new PatchDeploymentInstanceFilterArgs();

    /**
     * Target all VM instances in the project. If true, no other criteria is permitted.
     * 
     */
    @Import(name="all")
      private final @Nullable Output<Boolean> all;

    public Output<Boolean> getAll() {
        return this.all == null ? Codegen.empty() : this.all;
    }

    /**
     * Targets VM instances matching ANY of these GroupLabels. This allows targeting of disparate groups of VM instances.
     * Structure is documented below.
     * 
     */
    @Import(name="groupLabels")
      private final @Nullable Output<List<PatchDeploymentInstanceFilterGroupLabelArgs>> groupLabels;

    public Output<List<PatchDeploymentInstanceFilterGroupLabelArgs>> getGroupLabels() {
        return this.groupLabels == null ? Codegen.empty() : this.groupLabels;
    }

    /**
     * Targets VMs whose name starts with one of these prefixes. Similar to labels, this is another way to group
     * VMs when targeting configs, for example prefix="prod-".
     * 
     */
    @Import(name="instanceNamePrefixes")
      private final @Nullable Output<List<String>> instanceNamePrefixes;

    public Output<List<String>> getInstanceNamePrefixes() {
        return this.instanceNamePrefixes == null ? Codegen.empty() : this.instanceNamePrefixes;
    }

    /**
     * Targets any of the VM instances specified. Instances are specified by their URI in the `form zones/{{zone}}/instances/{{instance_name}}`,
     * `projects/{{project_id}}/zones/{{zone}}/instances/{{instance_name}}`, or
     * `https://www.googleapis.com/compute/v1/projects/{{project_id}}/zones/{{zone}}/instances/{{instance_name}}`
     * 
     */
    @Import(name="instances")
      private final @Nullable Output<List<String>> instances;

    public Output<List<String>> getInstances() {
        return this.instances == null ? Codegen.empty() : this.instances;
    }

    /**
     * Targets VM instances in ANY of these zones. Leave empty to target VM instances in any zone.
     * 
     */
    @Import(name="zones")
      private final @Nullable Output<List<String>> zones;

    public Output<List<String>> getZones() {
        return this.zones == null ? Codegen.empty() : this.zones;
    }

    public PatchDeploymentInstanceFilterArgs(
        @Nullable Output<Boolean> all,
        @Nullable Output<List<PatchDeploymentInstanceFilterGroupLabelArgs>> groupLabels,
        @Nullable Output<List<String>> instanceNamePrefixes,
        @Nullable Output<List<String>> instances,
        @Nullable Output<List<String>> zones) {
        this.all = all;
        this.groupLabels = groupLabels;
        this.instanceNamePrefixes = instanceNamePrefixes;
        this.instances = instances;
        this.zones = zones;
    }

    private PatchDeploymentInstanceFilterArgs() {
        this.all = Codegen.empty();
        this.groupLabels = Codegen.empty();
        this.instanceNamePrefixes = Codegen.empty();
        this.instances = Codegen.empty();
        this.zones = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PatchDeploymentInstanceFilterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> all;
        private @Nullable Output<List<PatchDeploymentInstanceFilterGroupLabelArgs>> groupLabels;
        private @Nullable Output<List<String>> instanceNamePrefixes;
        private @Nullable Output<List<String>> instances;
        private @Nullable Output<List<String>> zones;

        public Builder() {
    	      // Empty
        }

        public Builder(PatchDeploymentInstanceFilterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.all = defaults.all;
    	      this.groupLabels = defaults.groupLabels;
    	      this.instanceNamePrefixes = defaults.instanceNamePrefixes;
    	      this.instances = defaults.instances;
    	      this.zones = defaults.zones;
        }

        public Builder all(@Nullable Output<Boolean> all) {
            this.all = all;
            return this;
        }
        public Builder all(@Nullable Boolean all) {
            this.all = Codegen.ofNullable(all);
            return this;
        }
        public Builder groupLabels(@Nullable Output<List<PatchDeploymentInstanceFilterGroupLabelArgs>> groupLabels) {
            this.groupLabels = groupLabels;
            return this;
        }
        public Builder groupLabels(@Nullable List<PatchDeploymentInstanceFilterGroupLabelArgs> groupLabels) {
            this.groupLabels = Codegen.ofNullable(groupLabels);
            return this;
        }
        public Builder groupLabels(PatchDeploymentInstanceFilterGroupLabelArgs... groupLabels) {
            return groupLabels(List.of(groupLabels));
        }
        public Builder instanceNamePrefixes(@Nullable Output<List<String>> instanceNamePrefixes) {
            this.instanceNamePrefixes = instanceNamePrefixes;
            return this;
        }
        public Builder instanceNamePrefixes(@Nullable List<String> instanceNamePrefixes) {
            this.instanceNamePrefixes = Codegen.ofNullable(instanceNamePrefixes);
            return this;
        }
        public Builder instanceNamePrefixes(String... instanceNamePrefixes) {
            return instanceNamePrefixes(List.of(instanceNamePrefixes));
        }
        public Builder instances(@Nullable Output<List<String>> instances) {
            this.instances = instances;
            return this;
        }
        public Builder instances(@Nullable List<String> instances) {
            this.instances = Codegen.ofNullable(instances);
            return this;
        }
        public Builder instances(String... instances) {
            return instances(List.of(instances));
        }
        public Builder zones(@Nullable Output<List<String>> zones) {
            this.zones = zones;
            return this;
        }
        public Builder zones(@Nullable List<String> zones) {
            this.zones = Codegen.ofNullable(zones);
            return this;
        }
        public Builder zones(String... zones) {
            return zones(List.of(zones));
        }        public PatchDeploymentInstanceFilterArgs build() {
            return new PatchDeploymentInstanceFilterArgs(all, groupLabels, instanceNamePrefixes, instances, zones);
        }
    }
}
