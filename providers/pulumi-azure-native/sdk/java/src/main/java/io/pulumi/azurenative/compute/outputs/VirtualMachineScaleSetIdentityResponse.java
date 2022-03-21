// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.outputs;

import io.pulumi.azurenative.compute.outputs.VirtualMachineScaleSetIdentityResponseUserAssignedIdentities;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualMachineScaleSetIdentityResponse {
    /**
     * The principal id of virtual machine scale set identity. This property will only be provided for a system assigned identity.
     * 
     */
    private final String principalId;
    /**
     * The tenant id associated with the virtual machine scale set. This property will only be provided for a system assigned identity.
     * 
     */
    private final String tenantId;
    /**
     * The type of identity used for the virtual machine scale set. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user assigned identities. The type 'None' will remove any identities from the virtual machine scale set.
     * 
     */
    private final @Nullable String type;
    /**
     * The list of user identities associated with the virtual machine scale set. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
     */
    private final @Nullable Map<String,VirtualMachineScaleSetIdentityResponseUserAssignedIdentities> userAssignedIdentities;

    @CustomType.Constructor
    private VirtualMachineScaleSetIdentityResponse(
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") @Nullable String type,
        @CustomType.Parameter("userAssignedIdentities") @Nullable Map<String,VirtualMachineScaleSetIdentityResponseUserAssignedIdentities> userAssignedIdentities) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
        this.userAssignedIdentities = userAssignedIdentities;
    }

    /**
     * The principal id of virtual machine scale set identity. This property will only be provided for a system assigned identity.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The tenant id associated with the virtual machine scale set. This property will only be provided for a system assigned identity.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * The type of identity used for the virtual machine scale set. The type 'SystemAssigned, UserAssigned' includes both an implicitly created identity and a set of user assigned identities. The type 'None' will remove any identities from the virtual machine scale set.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }
    /**
     * The list of user identities associated with the virtual machine scale set. The user identity dictionary key references will be ARM resource ids in the form: '/subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.ManagedIdentity/userAssignedIdentities/{identityName}'.
     * 
    */
    public Map<String,VirtualMachineScaleSetIdentityResponseUserAssignedIdentities> getUserAssignedIdentities() {
        return this.userAssignedIdentities == null ? Map.of() : this.userAssignedIdentities;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private @Nullable String type;
        private @Nullable Map<String,VirtualMachineScaleSetIdentityResponseUserAssignedIdentities> userAssignedIdentities;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
    	      this.userAssignedIdentities = defaults.userAssignedIdentities;
        }

        public Builder principalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }
        public Builder tenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public Builder userAssignedIdentities(@Nullable Map<String,VirtualMachineScaleSetIdentityResponseUserAssignedIdentities> userAssignedIdentities) {
            this.userAssignedIdentities = userAssignedIdentities;
            return this;
        }        public VirtualMachineScaleSetIdentityResponse build() {
            return new VirtualMachineScaleSetIdentityResponse(principalId, tenantId, type, userAssignedIdentities);
        }
    }
}
