// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class GetResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy extends io.pulumi.resources.InvokeArgs {

    public static final GetResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy Empty = new GetResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy();

    /**
     * The policy directives and their values that CloudFront includes as values for the Content-Security-Policy HTTP response header.
     * 
     */
    @Import(name="contentSecurityPolicy", required=true)
      private final String contentSecurityPolicy;

    public String getContentSecurityPolicy() {
        return this.contentSecurityPolicy;
    }

    /**
     * A Boolean value that determines whether CloudFront overrides the X-XSS-Protection HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    @Import(name="override", required=true)
      private final Boolean override;

    public Boolean getOverride() {
        return this.override;
    }

    public GetResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy(
        String contentSecurityPolicy,
        Boolean override) {
        this.contentSecurityPolicy = Objects.requireNonNull(contentSecurityPolicy, "expected parameter 'contentSecurityPolicy' to be non-null");
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
    }

    private GetResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy() {
        this.contentSecurityPolicy = null;
        this.override = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String contentSecurityPolicy;
        private Boolean override;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentSecurityPolicy = defaults.contentSecurityPolicy;
    	      this.override = defaults.override;
        }

        public Builder contentSecurityPolicy(String contentSecurityPolicy) {
            this.contentSecurityPolicy = Objects.requireNonNull(contentSecurityPolicy);
            return this;
        }
        public Builder override(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }        public GetResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy build() {
            return new GetResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicy(contentSecurityPolicy, override);
        }
    }
}