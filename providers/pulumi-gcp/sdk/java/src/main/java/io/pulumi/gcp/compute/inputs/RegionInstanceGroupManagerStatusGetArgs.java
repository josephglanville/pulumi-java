// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusStatefulGetArgs;
import io.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusVersionTargetGetArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionInstanceGroupManagerStatusGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerStatusGetArgs Empty = new RegionInstanceGroupManagerStatusGetArgs();

    /**
     * A bit indicating whether the managed instance group is in a stable state. A stable state means that: none of the instances in the managed instance group is currently undergoing any type of change (for example, creation, restart, or deletion); no future changes are scheduled for instances in the managed instance group; and the managed instance group itself is not being modified.
     * 
     */
    @Import(name="isStable")
      private final @Nullable Output<Boolean> isStable;

    public Output<Boolean> getIsStable() {
        return this.isStable == null ? Codegen.empty() : this.isStable;
    }

    /**
     * Stateful status of the given Instance Group Manager.
     * 
     */
    @Import(name="statefuls")
      private final @Nullable Output<List<RegionInstanceGroupManagerStatusStatefulGetArgs>> statefuls;

    public Output<List<RegionInstanceGroupManagerStatusStatefulGetArgs>> getStatefuls() {
        return this.statefuls == null ? Codegen.empty() : this.statefuls;
    }

    /**
     * A bit indicating whether version target has been reached in this managed instance group, i.e. all instances are in their target version. Instances' target version are specified by version field on Instance Group Manager.
     * 
     */
    @Import(name="versionTargets")
      private final @Nullable Output<List<RegionInstanceGroupManagerStatusVersionTargetGetArgs>> versionTargets;

    public Output<List<RegionInstanceGroupManagerStatusVersionTargetGetArgs>> getVersionTargets() {
        return this.versionTargets == null ? Codegen.empty() : this.versionTargets;
    }

    public RegionInstanceGroupManagerStatusGetArgs(
        @Nullable Output<Boolean> isStable,
        @Nullable Output<List<RegionInstanceGroupManagerStatusStatefulGetArgs>> statefuls,
        @Nullable Output<List<RegionInstanceGroupManagerStatusVersionTargetGetArgs>> versionTargets) {
        this.isStable = isStable;
        this.statefuls = statefuls;
        this.versionTargets = versionTargets;
    }

    private RegionInstanceGroupManagerStatusGetArgs() {
        this.isStable = Codegen.empty();
        this.statefuls = Codegen.empty();
        this.versionTargets = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerStatusGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Boolean> isStable;
        private @Nullable Output<List<RegionInstanceGroupManagerStatusStatefulGetArgs>> statefuls;
        private @Nullable Output<List<RegionInstanceGroupManagerStatusVersionTargetGetArgs>> versionTargets;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerStatusGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isStable = defaults.isStable;
    	      this.statefuls = defaults.statefuls;
    	      this.versionTargets = defaults.versionTargets;
        }

        public Builder isStable(@Nullable Output<Boolean> isStable) {
            this.isStable = isStable;
            return this;
        }
        public Builder isStable(@Nullable Boolean isStable) {
            this.isStable = Codegen.ofNullable(isStable);
            return this;
        }
        public Builder statefuls(@Nullable Output<List<RegionInstanceGroupManagerStatusStatefulGetArgs>> statefuls) {
            this.statefuls = statefuls;
            return this;
        }
        public Builder statefuls(@Nullable List<RegionInstanceGroupManagerStatusStatefulGetArgs> statefuls) {
            this.statefuls = Codegen.ofNullable(statefuls);
            return this;
        }
        public Builder statefuls(RegionInstanceGroupManagerStatusStatefulGetArgs... statefuls) {
            return statefuls(List.of(statefuls));
        }
        public Builder versionTargets(@Nullable Output<List<RegionInstanceGroupManagerStatusVersionTargetGetArgs>> versionTargets) {
            this.versionTargets = versionTargets;
            return this;
        }
        public Builder versionTargets(@Nullable List<RegionInstanceGroupManagerStatusVersionTargetGetArgs> versionTargets) {
            this.versionTargets = Codegen.ofNullable(versionTargets);
            return this;
        }
        public Builder versionTargets(RegionInstanceGroupManagerStatusVersionTargetGetArgs... versionTargets) {
            return versionTargets(List.of(versionTargets));
        }        public RegionInstanceGroupManagerStatusGetArgs build() {
            return new RegionInstanceGroupManagerStatusGetArgs(isStable, statefuls, versionTargets);
        }
    }
}
