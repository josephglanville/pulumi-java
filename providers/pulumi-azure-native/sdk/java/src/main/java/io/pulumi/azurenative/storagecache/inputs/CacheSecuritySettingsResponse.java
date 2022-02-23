// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storagecache.inputs;

import io.pulumi.azurenative.storagecache.inputs.NfsAccessPolicyResponse;
import io.pulumi.core.annotations.InputImport;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Cache security settings.
 * 
 */
public final class CacheSecuritySettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final CacheSecuritySettingsResponse Empty = new CacheSecuritySettingsResponse();

    /**
     * NFS access policies defined for this cache.
     * 
     */
    @InputImport(name="accessPolicies")
      private final @Nullable List<NfsAccessPolicyResponse> accessPolicies;

    public List<NfsAccessPolicyResponse> getAccessPolicies() {
        return this.accessPolicies == null ? List.of() : this.accessPolicies;
    }

    public CacheSecuritySettingsResponse(@Nullable List<NfsAccessPolicyResponse> accessPolicies) {
        this.accessPolicies = accessPolicies;
    }

    private CacheSecuritySettingsResponse() {
        this.accessPolicies = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CacheSecuritySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<NfsAccessPolicyResponse> accessPolicies;

        public Builder() {
    	      // Empty
        }

        public Builder(CacheSecuritySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessPolicies = defaults.accessPolicies;
        }

        public Builder setAccessPolicies(@Nullable List<NfsAccessPolicyResponse> accessPolicies) {
            this.accessPolicies = accessPolicies;
            return this;
        }
        public CacheSecuritySettingsResponse build() {
            return new CacheSecuritySettingsResponse(accessPolicies);
        }
    }
}
