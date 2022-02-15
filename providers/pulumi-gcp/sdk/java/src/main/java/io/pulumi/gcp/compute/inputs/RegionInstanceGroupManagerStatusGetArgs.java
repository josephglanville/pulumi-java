// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import io.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusStatefulGetArgs;
import io.pulumi.gcp.compute.inputs.RegionInstanceGroupManagerStatusVersionTargetGetArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionInstanceGroupManagerStatusGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionInstanceGroupManagerStatusGetArgs Empty = new RegionInstanceGroupManagerStatusGetArgs();

    @InputImport(name="isStable")
    private final @Nullable Input<Boolean> isStable;

    public Input<Boolean> getIsStable() {
        return this.isStable == null ? Input.empty() : this.isStable;
    }

    @InputImport(name="statefuls")
    private final @Nullable Input<List<RegionInstanceGroupManagerStatusStatefulGetArgs>> statefuls;

    public Input<List<RegionInstanceGroupManagerStatusStatefulGetArgs>> getStatefuls() {
        return this.statefuls == null ? Input.empty() : this.statefuls;
    }

    @InputImport(name="versionTargets")
    private final @Nullable Input<List<RegionInstanceGroupManagerStatusVersionTargetGetArgs>> versionTargets;

    public Input<List<RegionInstanceGroupManagerStatusVersionTargetGetArgs>> getVersionTargets() {
        return this.versionTargets == null ? Input.empty() : this.versionTargets;
    }

    public RegionInstanceGroupManagerStatusGetArgs(
        @Nullable Input<Boolean> isStable,
        @Nullable Input<List<RegionInstanceGroupManagerStatusStatefulGetArgs>> statefuls,
        @Nullable Input<List<RegionInstanceGroupManagerStatusVersionTargetGetArgs>> versionTargets) {
        this.isStable = isStable;
        this.statefuls = statefuls;
        this.versionTargets = versionTargets;
    }

    private RegionInstanceGroupManagerStatusGetArgs() {
        this.isStable = Input.empty();
        this.statefuls = Input.empty();
        this.versionTargets = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionInstanceGroupManagerStatusGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Boolean> isStable;
        private @Nullable Input<List<RegionInstanceGroupManagerStatusStatefulGetArgs>> statefuls;
        private @Nullable Input<List<RegionInstanceGroupManagerStatusVersionTargetGetArgs>> versionTargets;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionInstanceGroupManagerStatusGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.isStable = defaults.isStable;
    	      this.statefuls = defaults.statefuls;
    	      this.versionTargets = defaults.versionTargets;
        }

        public Builder setIsStable(@Nullable Input<Boolean> isStable) {
            this.isStable = isStable;
            return this;
        }

        public Builder setIsStable(@Nullable Boolean isStable) {
            this.isStable = Input.ofNullable(isStable);
            return this;
        }

        public Builder setStatefuls(@Nullable Input<List<RegionInstanceGroupManagerStatusStatefulGetArgs>> statefuls) {
            this.statefuls = statefuls;
            return this;
        }

        public Builder setStatefuls(@Nullable List<RegionInstanceGroupManagerStatusStatefulGetArgs> statefuls) {
            this.statefuls = Input.ofNullable(statefuls);
            return this;
        }

        public Builder setVersionTargets(@Nullable Input<List<RegionInstanceGroupManagerStatusVersionTargetGetArgs>> versionTargets) {
            this.versionTargets = versionTargets;
            return this;
        }

        public Builder setVersionTargets(@Nullable List<RegionInstanceGroupManagerStatusVersionTargetGetArgs> versionTargets) {
            this.versionTargets = Input.ofNullable(versionTargets);
            return this;
        }

        public RegionInstanceGroupManagerStatusGetArgs build() {
            return new RegionInstanceGroupManagerStatusGetArgs(isStable, statefuls, versionTargets);
        }
    }
}