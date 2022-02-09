// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.recoveryservices.inputs;

import io.pulumi.azurenative.recoveryservices.inputs.A2AEnableProtectionInputArgs;
import io.pulumi.azurenative.recoveryservices.inputs.HyperVReplicaAzureEnableProtectionInputArgs;
import io.pulumi.azurenative.recoveryservices.inputs.InMageAzureV2EnableProtectionInputArgs;
import io.pulumi.azurenative.recoveryservices.inputs.InMageEnableProtectionInputArgs;
import io.pulumi.azurenative.recoveryservices.inputs.InMageRcmEnableProtectionInputArgs;
import io.pulumi.azurenative.recoveryservices.inputs.SanEnableProtectionInputArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EnableProtectionInputPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final EnableProtectionInputPropertiesArgs Empty = new EnableProtectionInputPropertiesArgs();

    @InputImport(name="policyId")
    private final @Nullable Input<String> policyId;

    public Input<String> getPolicyId() {
        return this.policyId == null ? Input.empty() : this.policyId;
    }

    @InputImport(name="protectableItemId")
    private final @Nullable Input<String> protectableItemId;

    public Input<String> getProtectableItemId() {
        return this.protectableItemId == null ? Input.empty() : this.protectableItemId;
    }

    @InputImport(name="providerSpecificDetails")
    private final @Nullable Input<Object> providerSpecificDetails;

    public Input<Object> getProviderSpecificDetails() {
        return this.providerSpecificDetails == null ? Input.empty() : this.providerSpecificDetails;
    }

    public EnableProtectionInputPropertiesArgs(
        @Nullable Input<String> policyId,
        @Nullable Input<String> protectableItemId,
        @Nullable Input<Object> providerSpecificDetails) {
        this.policyId = policyId;
        this.protectableItemId = protectableItemId;
        this.providerSpecificDetails = providerSpecificDetails;
    }

    private EnableProtectionInputPropertiesArgs() {
        this.policyId = Input.empty();
        this.protectableItemId = Input.empty();
        this.providerSpecificDetails = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EnableProtectionInputPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> policyId;
        private @Nullable Input<String> protectableItemId;
        private @Nullable Input<Object> providerSpecificDetails;

        public Builder() {
    	      // Empty
        }

        public Builder(EnableProtectionInputPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.policyId = defaults.policyId;
    	      this.protectableItemId = defaults.protectableItemId;
    	      this.providerSpecificDetails = defaults.providerSpecificDetails;
        }

        public Builder setPolicyId(@Nullable Input<String> policyId) {
            this.policyId = policyId;
            return this;
        }

        public Builder setPolicyId(@Nullable String policyId) {
            this.policyId = Input.ofNullable(policyId);
            return this;
        }

        public Builder setProtectableItemId(@Nullable Input<String> protectableItemId) {
            this.protectableItemId = protectableItemId;
            return this;
        }

        public Builder setProtectableItemId(@Nullable String protectableItemId) {
            this.protectableItemId = Input.ofNullable(protectableItemId);
            return this;
        }

        public Builder setProviderSpecificDetails(@Nullable Input<Object> providerSpecificDetails) {
            this.providerSpecificDetails = providerSpecificDetails;
            return this;
        }

        public Builder setProviderSpecificDetails(@Nullable Object providerSpecificDetails) {
            this.providerSpecificDetails = Input.ofNullable(providerSpecificDetails);
            return this;
        }

        public EnableProtectionInputPropertiesArgs build() {
            return new EnableProtectionInputPropertiesArgs(policyId, protectableItemId, providerSpecificDetails);
        }
    }
}
