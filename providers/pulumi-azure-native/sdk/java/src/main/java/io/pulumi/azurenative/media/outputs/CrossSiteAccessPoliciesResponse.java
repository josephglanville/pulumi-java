// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CrossSiteAccessPoliciesResponse {
    /**
     * The content of clientaccesspolicy.xml used by Silverlight.
     * 
     */
    private final @Nullable String clientAccessPolicy;
    /**
     * The content of crossdomain.xml used by Silverlight.
     * 
     */
    private final @Nullable String crossDomainPolicy;

    @CustomType.Constructor
    private CrossSiteAccessPoliciesResponse(
        @CustomType.Parameter("clientAccessPolicy") @Nullable String clientAccessPolicy,
        @CustomType.Parameter("crossDomainPolicy") @Nullable String crossDomainPolicy) {
        this.clientAccessPolicy = clientAccessPolicy;
        this.crossDomainPolicy = crossDomainPolicy;
    }

    /**
     * The content of clientaccesspolicy.xml used by Silverlight.
     * 
    */
    public Optional<String> getClientAccessPolicy() {
        return Optional.ofNullable(this.clientAccessPolicy);
    }
    /**
     * The content of crossdomain.xml used by Silverlight.
     * 
    */
    public Optional<String> getCrossDomainPolicy() {
        return Optional.ofNullable(this.crossDomainPolicy);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CrossSiteAccessPoliciesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String clientAccessPolicy;
        private @Nullable String crossDomainPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(CrossSiteAccessPoliciesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientAccessPolicy = defaults.clientAccessPolicy;
    	      this.crossDomainPolicy = defaults.crossDomainPolicy;
        }

        public Builder clientAccessPolicy(@Nullable String clientAccessPolicy) {
            this.clientAccessPolicy = clientAccessPolicy;
            return this;
        }
        public Builder crossDomainPolicy(@Nullable String crossDomainPolicy) {
            this.crossDomainPolicy = crossDomainPolicy;
            return this;
        }        public CrossSiteAccessPoliciesResponse build() {
            return new CrossSiteAccessPoliciesResponse(clientAccessPolicy, crossDomainPolicy);
        }
    }
}
