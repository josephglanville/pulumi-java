// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azurenative.web.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SiteConfigResponse {
    /**
     * @return .NET Framework version.
     * 
     */
    private @Nullable String netFrameworkVersion;

    private SiteConfigResponse() {}
    /**
     * @return .NET Framework version.
     * 
     */
    public Optional<String> netFrameworkVersion() {
        return Optional.ofNullable(this.netFrameworkVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SiteConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String netFrameworkVersion;
        public Builder() {}
        public Builder(SiteConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.netFrameworkVersion = defaults.netFrameworkVersion;
        }

        @CustomType.Setter
        public Builder netFrameworkVersion(@Nullable String netFrameworkVersion) {

            this.netFrameworkVersion = netFrameworkVersion;
            return this;
        }
        public SiteConfigResponse build() {
            final var o = new SiteConfigResponse();
            o.netFrameworkVersion = netFrameworkVersion;
            return o;
        }
    }
}
