// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.dbformysql.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceIdentityResponse {
    /**
     * The Azure Active Directory principal id.
     * 
     */
    private final String principalId;
    /**
     * The Azure Active Directory tenant id.
     * 
     */
    private final String tenantId;
    /**
     * The identity type. Set this to 'SystemAssigned' in order to automatically create and assign an Azure Active Directory principal for the resource.
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private ResourceIdentityResponse(
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") @Nullable String type) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * The Azure Active Directory principal id.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The Azure Active Directory tenant id.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * The identity type. Set this to 'SystemAssigned' in order to automatically create and assign an Azure Active Directory principal for the resource.
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
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
        }        public ResourceIdentityResponse build() {
            return new ResourceIdentityResponse(principalId, tenantId, type);
        }
    }
}
