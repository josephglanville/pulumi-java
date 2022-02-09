// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class MediaServiceIdentityResponse {
    private final String principalId;
    private final String tenantId;
    private final String type;

    @OutputCustomType.Constructor({"principalId","tenantId","type"})
    private MediaServiceIdentityResponse(
        String principalId,
        String tenantId,
        String type) {
        this.principalId = Objects.requireNonNull(principalId);
        this.tenantId = Objects.requireNonNull(tenantId);
        this.type = Objects.requireNonNull(type);
    }

    public String getPrincipalId() {
        return this.principalId;
    }
    public String getTenantId() {
        return this.tenantId;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MediaServiceIdentityResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String principalId;
        private String tenantId;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(MediaServiceIdentityResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.principalId = defaults.principalId;
    	      this.tenantId = defaults.tenantId;
    	      this.type = defaults.type;
        }

        public Builder setPrincipalId(String principalId) {
            this.principalId = Objects.requireNonNull(principalId);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public MediaServiceIdentityResponse build() {
            return new MediaServiceIdentityResponse(principalId, tenantId, type);
        }
    }
}
