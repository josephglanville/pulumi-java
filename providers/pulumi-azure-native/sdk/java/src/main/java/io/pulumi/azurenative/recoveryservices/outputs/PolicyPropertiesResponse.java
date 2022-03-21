// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.outputs;

import io.pulumi.azurenative.recoveryservices.outputs.A2APolicyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.HyperVReplicaAzurePolicyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.HyperVReplicaBasePolicyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.HyperVReplicaBluePolicyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.HyperVReplicaPolicyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.InMageAzureV2PolicyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.InMageBasePolicyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.InMagePolicyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.InMageRcmPolicyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.RcmAzureMigrationPolicyDetailsResponse;
import io.pulumi.azurenative.recoveryservices.outputs.VmwareCbtPolicyDetailsResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PolicyPropertiesResponse {
    /**
     * The FriendlyName.
     * 
     */
    private final @Nullable String friendlyName;
    /**
     * The ReplicationChannelSetting.
     * 
     */
    private final @Nullable Object providerSpecificDetails;

    @CustomType.Constructor
    private PolicyPropertiesResponse(
        @CustomType.Parameter("friendlyName") @Nullable String friendlyName,
        @CustomType.Parameter("providerSpecificDetails") @Nullable Object providerSpecificDetails) {
        this.friendlyName = friendlyName;
        this.providerSpecificDetails = providerSpecificDetails;
    }

    /**
     * The FriendlyName.
     * 
    */
    public Optional<String> getFriendlyName() {
        return Optional.ofNullable(this.friendlyName);
    }
    /**
     * The ReplicationChannelSetting.
     * 
    */
    public Optional<Object> getProviderSpecificDetails() {
        return Optional.ofNullable(this.providerSpecificDetails);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PolicyPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String friendlyName;
        private @Nullable Object providerSpecificDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(PolicyPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.friendlyName = defaults.friendlyName;
    	      this.providerSpecificDetails = defaults.providerSpecificDetails;
        }

        public Builder friendlyName(@Nullable String friendlyName) {
            this.friendlyName = friendlyName;
            return this;
        }
        public Builder providerSpecificDetails(@Nullable Object providerSpecificDetails) {
            this.providerSpecificDetails = providerSpecificDetails;
            return this;
        }        public PolicyPropertiesResponse build() {
            return new PolicyPropertiesResponse(friendlyName, providerSpecificDetails);
        }
    }
}
