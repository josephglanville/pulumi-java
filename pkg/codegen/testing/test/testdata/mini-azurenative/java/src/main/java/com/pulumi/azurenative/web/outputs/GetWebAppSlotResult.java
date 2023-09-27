// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.azurenative.web.outputs.SiteConfigResponse;
import com.pulumi.core.annotations.CustomType;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetWebAppSlotResult {
    /**
     * @return Configuration of the app.
     * 
     */
    private @Nullable SiteConfigResponse siteConfig;

    private GetWebAppSlotResult() {}
    /**
     * @return Configuration of the app.
     * 
     */
    public Optional<SiteConfigResponse> siteConfig() {
        return Optional.ofNullable(this.siteConfig);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetWebAppSlotResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable SiteConfigResponse siteConfig;
        public Builder() {}
        public Builder(GetWebAppSlotResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.siteConfig = defaults.siteConfig;
        }

        @CustomType.Setter
        public Builder siteConfig(@Nullable SiteConfigResponse siteConfig) {

            this.siteConfig = siteConfig;
            return this;
        }
        public GetWebAppSlotResult build() {
            final var o = new GetWebAppSlotResult();
            o.siteConfig = siteConfig;
            return o;
        }
    }
}
