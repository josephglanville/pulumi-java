// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.wafv2.inputs;

import io.pulumi.awsnative.wafv2.enums.WebACLIPSetForwardedIPConfigurationFallbackBehavior;
import io.pulumi.awsnative.wafv2.enums.WebACLIPSetForwardedIPConfigurationPosition;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class WebACLIPSetForwardedIPConfiguration extends io.pulumi.resources.InvokeArgs {

    public static final WebACLIPSetForwardedIPConfiguration Empty = new WebACLIPSetForwardedIPConfiguration();

    @InputImport(name="fallbackBehavior", required=true)
      private final WebACLIPSetForwardedIPConfigurationFallbackBehavior fallbackBehavior;

    public WebACLIPSetForwardedIPConfigurationFallbackBehavior getFallbackBehavior() {
        return this.fallbackBehavior;
    }

    @InputImport(name="headerName", required=true)
      private final String headerName;

    public String getHeaderName() {
        return this.headerName;
    }

    @InputImport(name="position", required=true)
      private final WebACLIPSetForwardedIPConfigurationPosition position;

    public WebACLIPSetForwardedIPConfigurationPosition getPosition() {
        return this.position;
    }

    public WebACLIPSetForwardedIPConfiguration(
        WebACLIPSetForwardedIPConfigurationFallbackBehavior fallbackBehavior,
        String headerName,
        WebACLIPSetForwardedIPConfigurationPosition position) {
        this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior, "expected parameter 'fallbackBehavior' to be non-null");
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.position = Objects.requireNonNull(position, "expected parameter 'position' to be non-null");
    }

    private WebACLIPSetForwardedIPConfiguration() {
        this.fallbackBehavior = null;
        this.headerName = null;
        this.position = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebACLIPSetForwardedIPConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WebACLIPSetForwardedIPConfigurationFallbackBehavior fallbackBehavior;
        private String headerName;
        private WebACLIPSetForwardedIPConfigurationPosition position;

        public Builder() {
    	      // Empty
        }

        public Builder(WebACLIPSetForwardedIPConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fallbackBehavior = defaults.fallbackBehavior;
    	      this.headerName = defaults.headerName;
    	      this.position = defaults.position;
        }

        public Builder setFallbackBehavior(WebACLIPSetForwardedIPConfigurationFallbackBehavior fallbackBehavior) {
            this.fallbackBehavior = Objects.requireNonNull(fallbackBehavior);
            return this;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder setPosition(WebACLIPSetForwardedIPConfigurationPosition position) {
            this.position = Objects.requireNonNull(position);
            return this;
        }
        public WebACLIPSetForwardedIPConfiguration build() {
            return new WebACLIPSetForwardedIPConfiguration(fallbackBehavior, headerName, position);
        }
    }
}
