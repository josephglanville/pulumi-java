// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.avs.inputs;

import io.pulumi.azurenative.avs.enums.AffinityType;
import io.pulumi.azurenative.avs.enums.PlacementPolicyState;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VmVmPlacementPolicyPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final VmVmPlacementPolicyPropertiesArgs Empty = new VmVmPlacementPolicyPropertiesArgs();

    @InputImport(name="affinityType", required=true)
    private final Input<Either<String,AffinityType>> affinityType;

    public Input<Either<String,AffinityType>> getAffinityType() {
        return this.affinityType;
    }

    @InputImport(name="displayName")
    private final @Nullable Input<String> displayName;

    public Input<String> getDisplayName() {
        return this.displayName == null ? Input.empty() : this.displayName;
    }

    @InputImport(name="state")
    private final @Nullable Input<Either<String,PlacementPolicyState>> state;

    public Input<Either<String,PlacementPolicyState>> getState() {
        return this.state == null ? Input.empty() : this.state;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    @InputImport(name="vmMembers", required=true)
    private final Input<List<String>> vmMembers;

    public Input<List<String>> getVmMembers() {
        return this.vmMembers;
    }

    public VmVmPlacementPolicyPropertiesArgs(
        Input<Either<String,AffinityType>> affinityType,
        @Nullable Input<String> displayName,
        @Nullable Input<Either<String,PlacementPolicyState>> state,
        Input<String> type,
        Input<List<String>> vmMembers) {
        this.affinityType = Objects.requireNonNull(affinityType, "expected parameter 'affinityType' to be non-null");
        this.displayName = displayName;
        this.state = state;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.vmMembers = Objects.requireNonNull(vmMembers, "expected parameter 'vmMembers' to be non-null");
    }

    private VmVmPlacementPolicyPropertiesArgs() {
        this.affinityType = Input.empty();
        this.displayName = Input.empty();
        this.state = Input.empty();
        this.type = Input.empty();
        this.vmMembers = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VmVmPlacementPolicyPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,AffinityType>> affinityType;
        private @Nullable Input<String> displayName;
        private @Nullable Input<Either<String,PlacementPolicyState>> state;
        private Input<String> type;
        private Input<List<String>> vmMembers;

        public Builder() {
    	      // Empty
        }

        public Builder(VmVmPlacementPolicyPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affinityType = defaults.affinityType;
    	      this.displayName = defaults.displayName;
    	      this.state = defaults.state;
    	      this.type = defaults.type;
    	      this.vmMembers = defaults.vmMembers;
        }

        public Builder setAffinityType(Input<Either<String,AffinityType>> affinityType) {
            this.affinityType = Objects.requireNonNull(affinityType);
            return this;
        }

        public Builder setAffinityType(Either<String,AffinityType> affinityType) {
            this.affinityType = Input.of(Objects.requireNonNull(affinityType));
            return this;
        }

        public Builder setDisplayName(@Nullable Input<String> displayName) {
            this.displayName = displayName;
            return this;
        }

        public Builder setDisplayName(@Nullable String displayName) {
            this.displayName = Input.ofNullable(displayName);
            return this;
        }

        public Builder setState(@Nullable Input<Either<String,PlacementPolicyState>> state) {
            this.state = state;
            return this;
        }

        public Builder setState(@Nullable Either<String,PlacementPolicyState> state) {
            this.state = Input.ofNullable(state);
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public Builder setVmMembers(Input<List<String>> vmMembers) {
            this.vmMembers = Objects.requireNonNull(vmMembers);
            return this;
        }

        public Builder setVmMembers(List<String> vmMembers) {
            this.vmMembers = Input.of(Objects.requireNonNull(vmMembers));
            return this;
        }

        public VmVmPlacementPolicyPropertiesArgs build() {
            return new VmVmPlacementPolicyPropertiesArgs(affinityType, displayName, state, type, vmMembers);
        }
    }
}
