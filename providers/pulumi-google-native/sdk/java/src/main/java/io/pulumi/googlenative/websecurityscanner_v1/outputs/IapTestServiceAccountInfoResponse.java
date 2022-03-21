// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class IapTestServiceAccountInfoResponse {
    /**
     * Describes OAuth2 client id of resources protected by Identity-Aware-Proxy (IAP).
     * 
     */
    private final String targetAudienceClientId;

    @CustomType.Constructor
    private IapTestServiceAccountInfoResponse(@CustomType.Parameter("targetAudienceClientId") String targetAudienceClientId) {
        this.targetAudienceClientId = targetAudienceClientId;
    }

    /**
     * Describes OAuth2 client id of resources protected by Identity-Aware-Proxy (IAP).
     * 
    */
    public String getTargetAudienceClientId() {
        return this.targetAudienceClientId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IapTestServiceAccountInfoResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String targetAudienceClientId;

        public Builder() {
    	      // Empty
        }

        public Builder(IapTestServiceAccountInfoResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetAudienceClientId = defaults.targetAudienceClientId;
        }

        public Builder targetAudienceClientId(String targetAudienceClientId) {
            this.targetAudienceClientId = Objects.requireNonNull(targetAudienceClientId);
            return this;
        }        public IapTestServiceAccountInfoResponse build() {
            return new IapTestServiceAccountInfoResponse(targetAudienceClientId);
        }
    }
}
