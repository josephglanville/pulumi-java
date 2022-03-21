// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;


public final class ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs Empty = new ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs();

    /**
     * A Boolean value that determines whether CloudFront overrides the `X-XSS-Protection` HTTP response header received from the origin with the one specified in this response headers policy.
     * 
     */
    @Import(name="override", required=true)
      private final Output<Boolean> override;

    public Output<Boolean> getOverride() {
        return this.override;
    }

    /**
     * The value of the `Referrer-Policy` HTTP response header. Valid Values: `no-referrer` | `no-referrer-when-downgrade` | `origin` | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
     * 
     */
    @Import(name="referrerPolicy", required=true)
      private final Output<String> referrerPolicy;

    public Output<String> getReferrerPolicy() {
        return this.referrerPolicy;
    }

    public ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs(
        Output<Boolean> override,
        Output<String> referrerPolicy) {
        this.override = Objects.requireNonNull(override, "expected parameter 'override' to be non-null");
        this.referrerPolicy = Objects.requireNonNull(referrerPolicy, "expected parameter 'referrerPolicy' to be non-null");
    }

    private ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs() {
        this.override = Output.empty();
        this.referrerPolicy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Boolean> override;
        private Output<String> referrerPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.override = defaults.override;
    	      this.referrerPolicy = defaults.referrerPolicy;
        }

        public Builder override(Output<Boolean> override) {
            this.override = Objects.requireNonNull(override);
            return this;
        }
        public Builder override(Boolean override) {
            this.override = Output.of(Objects.requireNonNull(override));
            return this;
        }
        public Builder referrerPolicy(Output<String> referrerPolicy) {
            this.referrerPolicy = Objects.requireNonNull(referrerPolicy);
            return this;
        }
        public Builder referrerPolicy(String referrerPolicy) {
            this.referrerPolicy = Output.of(Objects.requireNonNull(referrerPolicy));
            return this;
        }        public ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs build() {
            return new ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs(override, referrerPolicy);
        }
    }
}
