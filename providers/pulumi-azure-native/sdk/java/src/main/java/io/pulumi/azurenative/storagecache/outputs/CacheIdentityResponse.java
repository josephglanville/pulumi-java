// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CacheIdentityResponse {
    /**
     * The principal id of the cache.
     * 
     */
    private final String principalId;
    /**
     * The tenant id associated with the cache.
     * 
     */
    private final String tenantId;
    /**
     * The type of identity used for the cache
     * 
     */
    private final @Nullable String type;

    @CustomType.Constructor
    private CacheIdentityResponse(
        @CustomType.Parameter("principalId") String principalId,
        @CustomType.Parameter("tenantId") String tenantId,
        @CustomType.Parameter("type") @Nullable String type) {
        this.principalId = principalId;
        this.tenantId = tenantId;
        this.type = type;
    }

    /**
     * The principal id of the cache.
     * 
    */
    public String getPrincipalId() {
        return this.principalId;
    }
    /**
     * The tenant id associated with the cache.
     * 
    */
    public String getTenantId() {
        return this.tenantId;
    }
    /**
     * The type of identity used for the cache
     * 
    */
    public Optional<String> getType() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private @Nullable String type;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheIdentityResponse defaults) {
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
        }        public CacheIdentityResponse build() {
            return new CacheIdentityResponse(principalId, tenantId, type);
        }
    }
}
