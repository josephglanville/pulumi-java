// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigFrameOptionsGetArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityGetArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicySecurityHeadersConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicySecurityHeadersConfigGetArgs Empty = new ResponseHeadersPolicySecurityHeadersConfigGetArgs();

    /**
     * The policy directives and their values that CloudFront includes as values for the `Content-Security-Policy` HTTP response header.
     * 
     */
    @Import(name="contentSecurityPolicy")
      private final @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs> contentSecurityPolicy;

    public Output<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs> getContentSecurityPolicy() {
        return this.contentSecurityPolicy == null ? Output.empty() : this.contentSecurityPolicy;
    }

    /**
     * Determines whether CloudFront includes the `X-Content-Type-Options` HTTP response header with its value set to `nosniff`. See Content Type Options for more information.
     * 
     */
    @Import(name="contentTypeOptions")
      private final @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs> contentTypeOptions;

    public Output<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs> getContentTypeOptions() {
        return this.contentTypeOptions == null ? Output.empty() : this.contentTypeOptions;
    }

    /**
     * Determines whether CloudFront includes the `X-Frame-Options` HTTP response header and the header’s value. See Frame Options for more information.
     * 
     */
    @Import(name="frameOptions")
      private final @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsGetArgs> frameOptions;

    public Output<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsGetArgs> getFrameOptions() {
        return this.frameOptions == null ? Output.empty() : this.frameOptions;
    }

    /**
     * The value of the `Referrer-Policy` HTTP response header. Valid Values: `no-referrer` | `no-referrer-when-downgrade` | `origin` | `origin-when-cross-origin` | `same-origin` | `strict-origin` | `strict-origin-when-cross-origin` | `unsafe-url`
     * 
     */
    @Import(name="referrerPolicy")
      private final @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs> referrerPolicy;

    public Output<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs> getReferrerPolicy() {
        return this.referrerPolicy == null ? Output.empty() : this.referrerPolicy;
    }

    /**
     * Determines whether CloudFront includes the `Strict-Transport-Security` HTTP response header and the header’s value. See Strict Transport Security for more information.
     * 
     */
    @Import(name="strictTransportSecurity")
      private final @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityGetArgs> strictTransportSecurity;

    public Output<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityGetArgs> getStrictTransportSecurity() {
        return this.strictTransportSecurity == null ? Output.empty() : this.strictTransportSecurity;
    }

    /**
     * Determine whether CloudFront includes the `X-XSS-Protection` HTTP response header and the header’s value. See XSS Protection for more information.
     * 
     */
    @Import(name="xssProtection")
      private final @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs> xssProtection;

    public Output<ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs> getXssProtection() {
        return this.xssProtection == null ? Output.empty() : this.xssProtection;
    }

    public ResponseHeadersPolicySecurityHeadersConfigGetArgs(
        @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs> contentSecurityPolicy,
        @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs> contentTypeOptions,
        @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsGetArgs> frameOptions,
        @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs> referrerPolicy,
        @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityGetArgs> strictTransportSecurity,
        @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs> xssProtection) {
        this.contentSecurityPolicy = contentSecurityPolicy;
        this.contentTypeOptions = contentTypeOptions;
        this.frameOptions = frameOptions;
        this.referrerPolicy = referrerPolicy;
        this.strictTransportSecurity = strictTransportSecurity;
        this.xssProtection = xssProtection;
    }

    private ResponseHeadersPolicySecurityHeadersConfigGetArgs() {
        this.contentSecurityPolicy = Output.empty();
        this.contentTypeOptions = Output.empty();
        this.frameOptions = Output.empty();
        this.referrerPolicy = Output.empty();
        this.strictTransportSecurity = Output.empty();
        this.xssProtection = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicySecurityHeadersConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs> contentSecurityPolicy;
        private @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs> contentTypeOptions;
        private @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsGetArgs> frameOptions;
        private @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs> referrerPolicy;
        private @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityGetArgs> strictTransportSecurity;
        private @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs> xssProtection;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicySecurityHeadersConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentSecurityPolicy = defaults.contentSecurityPolicy;
    	      this.contentTypeOptions = defaults.contentTypeOptions;
    	      this.frameOptions = defaults.frameOptions;
    	      this.referrerPolicy = defaults.referrerPolicy;
    	      this.strictTransportSecurity = defaults.strictTransportSecurity;
    	      this.xssProtection = defaults.xssProtection;
        }

        public Builder contentSecurityPolicy(@Nullable Output<ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs> contentSecurityPolicy) {
            this.contentSecurityPolicy = contentSecurityPolicy;
            return this;
        }
        public Builder contentSecurityPolicy(@Nullable ResponseHeadersPolicySecurityHeadersConfigContentSecurityPolicyGetArgs contentSecurityPolicy) {
            this.contentSecurityPolicy = Output.ofNullable(contentSecurityPolicy);
            return this;
        }
        public Builder contentTypeOptions(@Nullable Output<ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs> contentTypeOptions) {
            this.contentTypeOptions = contentTypeOptions;
            return this;
        }
        public Builder contentTypeOptions(@Nullable ResponseHeadersPolicySecurityHeadersConfigContentTypeOptionsGetArgs contentTypeOptions) {
            this.contentTypeOptions = Output.ofNullable(contentTypeOptions);
            return this;
        }
        public Builder frameOptions(@Nullable Output<ResponseHeadersPolicySecurityHeadersConfigFrameOptionsGetArgs> frameOptions) {
            this.frameOptions = frameOptions;
            return this;
        }
        public Builder frameOptions(@Nullable ResponseHeadersPolicySecurityHeadersConfigFrameOptionsGetArgs frameOptions) {
            this.frameOptions = Output.ofNullable(frameOptions);
            return this;
        }
        public Builder referrerPolicy(@Nullable Output<ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs> referrerPolicy) {
            this.referrerPolicy = referrerPolicy;
            return this;
        }
        public Builder referrerPolicy(@Nullable ResponseHeadersPolicySecurityHeadersConfigReferrerPolicyGetArgs referrerPolicy) {
            this.referrerPolicy = Output.ofNullable(referrerPolicy);
            return this;
        }
        public Builder strictTransportSecurity(@Nullable Output<ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityGetArgs> strictTransportSecurity) {
            this.strictTransportSecurity = strictTransportSecurity;
            return this;
        }
        public Builder strictTransportSecurity(@Nullable ResponseHeadersPolicySecurityHeadersConfigStrictTransportSecurityGetArgs strictTransportSecurity) {
            this.strictTransportSecurity = Output.ofNullable(strictTransportSecurity);
            return this;
        }
        public Builder xssProtection(@Nullable Output<ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs> xssProtection) {
            this.xssProtection = xssProtection;
            return this;
        }
        public Builder xssProtection(@Nullable ResponseHeadersPolicySecurityHeadersConfigXssProtectionGetArgs xssProtection) {
            this.xssProtection = Output.ofNullable(xssProtection);
            return this;
        }        public ResponseHeadersPolicySecurityHeadersConfigGetArgs build() {
            return new ResponseHeadersPolicySecurityHeadersConfigGetArgs(contentSecurityPolicy, contentTypeOptions, frameOptions, referrerPolicy, strictTransportSecurity, xssProtection);
        }
    }
}
