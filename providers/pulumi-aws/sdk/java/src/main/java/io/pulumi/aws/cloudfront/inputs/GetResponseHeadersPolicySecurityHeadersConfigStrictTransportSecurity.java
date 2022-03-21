// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


public final class GetResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity extends io.pulumi.resources.InvokeArgs {

    public static final GetResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity Empty = new GetResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity();

    /**
     * A number that CloudFront uses as the value for the max-age directive in the Strict-Transport-Security HTTP response header.
     * 
     */
    @Import(name="accessControlMaxAgeSec", required=true)
      private final Integer accessControlMaxAgeSec;

    public Integer getAccessControlMaxAgeSec() {
        return this.accessControlMaxAgeSec;
    }

    /**
     * A Boolean value that determines whether CloudFront includes the includeSubDomains directive in the Strict-Transport-Security HTTP response header.
     * 
     */
    @Import(name="includeSubdomains", required=true)
      private final Boolean includeSubdomains;

    public Boolean getIncludeSubdomains() {
        return this.includeSubdomains;
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

    /**
     * A Boolean value that determines whether CloudFront includes the preload directive in the Strict-Transport-Security HTTP response header.
     * 
     */
    @Import(name="preload", required=true)
      private final Boolean preload;

    public Boolean getPreload() {
        return this.preload;
    }

    public GetResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity(
        Integer accessControlMaxAgeSec,
        Boolean includeSubdomains,
        Boolean override,
        Boolean preload) {
        this.accessControlMaxAgeSec = Objects.requireNonNull(accessControlMaxAgeSec, "expected parameter 'accessControlMaxAgeSec' to be non-null");
        this.includeSubdomains = Objects.requireNonNull(includeSubdomains, "expected parameter 'includeSubdomains' to be non-null");
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
        this.preload = Objects.requireNonNull(preload, "expected parameter 'preload' to be non-null");
    }

    private GetResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity() {
        this.accessControlMaxAgeSec = null;
        this.includeSubdomains = null;
        this.override = null;
        this.preload = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer accessControlMaxAgeSec;
        private Boolean includeSubdomains;
        private Boolean override;
        private Boolean preload;

        public Builder() {
    	      // Empty
        }

        public Builder(GetResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessControlMaxAgeSec = defaults.accessControlMaxAgeSec;
    	      this.includeSubdomains = defaults.includeSubdomains;
    	      this.override = defaults.override;
    	      this.preload = defaults.preload;
        }

        public Builder accessControlMaxAgeSec(Integer accessControlMaxAgeSec) {
            this.accessControlMaxAgeSec = Objects.requireNonNull(accessControlMaxAgeSec);
            return this;
        }
        public Builder includeSubdomains(Boolean includeSubdomains) {
            this.includeSubdomains = Objects.requireNonNull(includeSubdomains);
            return this;
        }
        public Builder override(Boolean override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }
        public Builder preload(Boolean preload) {
            this.preload = Objects.requireNonNull(preload);
            return this;
        }        public GetResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity build() {
            return new GetResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurity(accessControlMaxAgeSec, includeSubdomains, override, preload);
        }
    }
}
