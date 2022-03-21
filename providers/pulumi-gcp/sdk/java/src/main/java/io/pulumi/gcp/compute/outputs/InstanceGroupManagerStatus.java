// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.gcp.compute.outputs.InstanceGroupManagerStatusStateful;
import io.pulumi.gcp.compute.outputs.InstanceGroupManagerStatusVersionTarget;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceGroupManagerStatus {
    /**
     * A bit indicating whether the managed instance group is in a stable state. A stable state means that: none of the instances in the managed instance group is currently undergoing any type of change (for example, creation, restart, or deletion); no future changes are scheduled for instances in the managed instance group; and the managed instance group itself is not being modified.
     * 
     */
    private final @Nullable Boolean isStable;
    /**
     * Stateful status of the given Instance Group Manager.
     * 
     */
    private final @Nullable List<InstanceGroupManagerStatusStateful> statefuls;
    /**
     * A bit indicating whether version target has been reached in this managed instance group, i.e. all instances are in their target version. Instances' target version are specified by version field on Instance Group Manager.
     * 
     */
    private final @Nullable List<InstanceGroupManagerStatusVersionTarget> versionTargets;

    @CustomType.Constructor
    private InstanceGroupManagerStatus(
        @CustomType.Parameter("isStable") @Nullable Boolean isStable,
        @CustomType.Parameter("statefuls") @Nullable List<InstanceGroupManagerStatusStateful> statefuls,
        @CustomType.Parameter("versionTargets") @Nullable List<InstanceGroupManagerStatusVersionTarget> versionTargets) {
        this.isStable = isStable;
        this.statefuls = statefuls;
        this.versionTargets = versionTargets;
    }

    /**
     * A bit indicating whether the managed instance group is in a stable state. A stable state means that: none of the instances in the managed instance group is currently undergoing any type of change (for example, creation, restart, or deletion); no future changes are scheduled for instances in the managed instance group; and the managed instance group itself is not being modified.
     * 
    */
    public Optional<Boolean> getIsStable() {
        return Optional.ofNullable(this.isStable);
    }
    /**
     * Stateful status of the given Instance Group Manager.
     * 
    */
    public List<InstanceGroupManagerStatusStateful> getStatefuls() {
        return this.statefuls == null ? List.of() : this.statefuls;
    }
    /**
     * A bit indicating whether version target has been reached in this managed instance group, i.e. all instances are in their target version. Instances' target version are specified by version field on Instance Group Manager.
     * 
    */
    public List<InstanceGroupManagerStatusVersionTarget> getVersionTargets() {
        return this.versionTargets == null ? List.of() : this.versionTargets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceGroupManagerStatus defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean isStable;
        private @Nullable List<InstanceGroupManagerStatusStateful> statefuls;
        private @Nullable List<InstanceGroupManagerStatusVersionTarget> versionTargets;

        public Builder() {
    	      // Empty
        }

        public Builder(InstanceGroupManagerStatus defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isStable = defaults.isStable;
    	      this.statefuls = defaults.statefuls;
    	      this.versionTargets = defaults.versionTargets;
        }

        public Builder isStable(@Nullable Boolean isStable) {
            this.isStable = isStable;
            return this;
        }
        public Builder statefuls(@Nullable List<InstanceGroupManagerStatusStateful> statefuls) {
            this.statefuls = statefuls;
            return this;
        }
        public Builder statefuls(InstanceGroupManagerStatusStateful... statefuls) {
            return statefuls(List.of(statefuls));
        }
        public Builder versionTargets(@Nullable List<InstanceGroupManagerStatusVersionTarget> versionTargets) {
            this.versionTargets = versionTargets;
            return this;
        }
        public Builder versionTargets(InstanceGroupManagerStatusVersionTarget... versionTargets) {
            return versionTargets(List.of(versionTargets));
        }        public InstanceGroupManagerStatus build() {
            return new InstanceGroupManagerStatus(isStable, statefuls, versionTargets);
        }
    }
}
