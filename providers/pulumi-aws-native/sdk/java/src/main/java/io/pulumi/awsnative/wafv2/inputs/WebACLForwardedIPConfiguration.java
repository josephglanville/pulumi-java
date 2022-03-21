// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.WebACLForwardedIPConfigurationFallbackBehavior;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class WebACLForwardedIPConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final WebACLForwardedIPConfiguration Empty = new WebACLForwardedIPConfiguration();

    @Import(name="fallbackBehavior", required=true)
      private final WebACLForwardedIPConfigurationFallbackBehavior fallbackBehavior;

    public WebACLForwardedIPConfigurationFallbackBehavior getFallbackBehavior() {
        return this.fallbackBehavior;
    }

    @Import(name="headerName", required=true)
      private final String headerName;

    public String getHeaderName() {
        return this.headerName;
    }

    public WebACLForwardedIPConfiguration(
        WebACLForwardedIPConfigurationFallbackBehavior fallbackBehavior,
        String headerName) {
        this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior, "expected parameter 'fallbackBehavior' to be non-null");
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
    }

    private WebACLForwardedIPConfiguration() {
        this.fallbackBehavior = null;
        this.headerName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLForwardedIPConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLForwardedIPConfigurationFallbackBehavior fallbackBehavior;
        private String headerName;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLForwardedIPConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fallbackBehavior = defaults.fallbackBehavior;
    	      this.headerName = defaults.headerName;
        }

        public Builder fallbackBehavior(WebACLForwardedIPConfigurationFallbackBehavior fallbackBehavior) {
            this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior);
            return this;
        }
        public Builder headerName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }        public WebACLForwardedIPConfiguration build() {
            return new WebACLForwardedIPConfiguration(fallbackBehavior, headerName);
        }
    }
}
