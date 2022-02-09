// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.inputs.LightHouseAuthorizationResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderHubMetadataResponseThirdPartyProviderAuthorization extends io.pulumi.resources.InvokeArgs {

    public static final ProviderHubMetadataResponseThirdPartyProviderAuthorization Empty = new ProviderHubMetadataResponseThirdPartyProviderAuthorization();

    @InputImport(name="authorizations")
    private final @Nullable List<LightHouseAuthorizationResponse> authorizations;

    public List<LightHouseAuthorizationResponse> getAuthorizations() {
        return this.authorizations == null ? List.of() : this.authorizations;
    }

    @InputImport(name="managedByTenantId")
    private final @Nullable String managedByTenantId;

    public Optional<String> getManagedByTenantId() {
        return this.managedByTenantId == null ? Optional.empty() : Optional.ofNullable(this.managedByTenantId);
    }

    public ProviderHubMetadataResponseThirdPartyProviderAuthorization(
        @Nullable List<LightHouseAuthorizationResponse> authorizations,
        @Nullable String managedByTenantId) {
        this.authorizations = authorizations;
        this.managedByTenantId = managedByTenantId;
    }

    private ProviderHubMetadataResponseThirdPartyProviderAuthorization() {
        this.authorizations = List.of();
        this.managedByTenantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderHubMetadataResponseThirdPartyProviderAuthorization defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<LightHouseAuthorizationResponse> authorizations;
        private @Nullable String managedByTenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderHubMetadataResponseThirdPartyProviderAuthorization defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizations = defaults.authorizations;
    	      this.managedByTenantId = defaults.managedByTenantId;
        }

        public Builder setAuthorizations(@Nullable List<LightHouseAuthorizationResponse> authorizations) {
            this.authorizations = authorizations;
            return this;
        }

        public Builder setManagedByTenantId(@Nullable String managedByTenantId) {
            this.managedByTenantId = managedByTenantId;
            return this;
        }

        public ProviderHubMetadataResponseThirdPartyProviderAuthorization build() {
            return new ProviderHubMetadataResponseThirdPartyProviderAuthorization(authorizations, managedByTenantId);
        }
    }
}
