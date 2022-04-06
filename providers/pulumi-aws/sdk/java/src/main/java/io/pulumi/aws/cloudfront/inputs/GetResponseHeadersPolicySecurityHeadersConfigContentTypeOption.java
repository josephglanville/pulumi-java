// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.util.Objects;


public final class GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption extends io.pulumi.resources.InvokeArgs {

    public static final GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption Empty = new GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption();

    /**
     * A Boolean value that determines whether CloudFront overrides the X-XSS-Protection HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    @Import(name="override", required=true)
      private final Boolean override;

    public Boolean getOverride() {
        return this.override;
    }

    public GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption(Boolean override) {
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
    }

    private GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption() {
        this.override = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean override;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.override = defaults.override;
        }

        public Builder override(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }        public GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption build() {
            return new GetResponseHeadersPolicySecurityHeadersConfigContentTypeOption(override);
        }
    }
}