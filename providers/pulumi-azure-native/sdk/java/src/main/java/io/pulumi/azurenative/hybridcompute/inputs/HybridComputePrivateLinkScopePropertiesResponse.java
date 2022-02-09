// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hybridcompute.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class HybridComputePrivateLinkScopePropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final HybridComputePrivateLinkScopePropertiesResponse Empty = new HybridComputePrivateLinkScopePropertiesResponse();

    @InputImport(name="privateLinkScopeId", required=true)
    private final String privateLinkScopeId;

    public String getPrivateLinkScopeId() {
        return this.privateLinkScopeId;
    }

    @InputImport(name="provisioningState", required=true)
    private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    @InputImport(name="publicNetworkAccess")
    private final @Nullable String publicNetworkAccess;

    public Optional<String> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Optional.empty() : Optional.ofNullable(this.publicNetworkAccess);
    }

    public HybridComputePrivateLinkScopePropertiesResponse(
        String privateLinkScopeId,
        String provisioningState,
        @Nullable String publicNetworkAccess) {
        this.privateLinkScopeId = Objects.requireNonNull(privateLinkScopeId, "expected parameter 'privateLinkScopeId' to be non-null");
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.publicNetworkAccess = publicNetworkAccess;
    }

    private HybridComputePrivateLinkScopePropertiesResponse() {
        this.privateLinkScopeId = null;
        this.provisioningState = null;
        this.publicNetworkAccess = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HybridComputePrivateLinkScopePropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String privateLinkScopeId;
        private String provisioningState;
        private @Nullable String publicNetworkAccess;

        public Builder() {
    	      // Empty
        }

        public Builder(HybridComputePrivateLinkScopePropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.privateLinkScopeId = defaults.privateLinkScopeId;
    	      this.provisioningState = defaults.provisioningState;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
        }

        public Builder setPrivateLinkScopeId(String privateLinkScopeId) {
            this.privateLinkScopeId = Objects.requireNonNull(privateLinkScopeId);
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable String publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public HybridComputePrivateLinkScopePropertiesResponse build() {
            return new HybridComputePrivateLinkScopePropertiesResponse(privateLinkScopeId, provisioningState, publicNetworkAccess);
        }
    }
}
