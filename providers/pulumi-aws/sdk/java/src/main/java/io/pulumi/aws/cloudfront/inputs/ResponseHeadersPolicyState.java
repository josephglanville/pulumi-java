// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCorsConfigGetArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicyCustomHeadersConfigGetArgs;
import io.pulumi.aws.cloudfront.inputs.ResponseHeadersPolicySecurityHeadersConfigGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResponseHeadersPolicyState extends io.pulumi.resources.ResourceArgs {

    public static final ResponseHeadersPolicyState Empty = new ResponseHeadersPolicyState();

    /**
     * A comment to describe the response headers policy. The comment cannot be longer than 128 characters.
     * 
     */
    @Import(name="comment")
      private final @Nullable Output<String> comment;

    public Output<String> getComment() {
        return this.comment == null ? Codegen.empty() : this.comment;
    }

    /**
     * A configuration for a set of HTTP response headers that are used for Cross-Origin Resource Sharing (CORS). See Cors Config for more information.
     * 
     */
    @Import(name="corsConfig")
      private final @Nullable Output<ResponseHeadersPolicyCorsConfigGetArgs> corsConfig;

    public Output<ResponseHeadersPolicyCorsConfigGetArgs> getCorsConfig() {
        return this.corsConfig == null ? Codegen.empty() : this.corsConfig;
    }

    /**
     * Object that contains an attribute `items` that contains a list of custom headers. See Custom Header for more information.
     * 
     */
    @Import(name="customHeadersConfig")
      private final @Nullable Output<ResponseHeadersPolicyCustomHeadersConfigGetArgs> customHeadersConfig;

    public Output<ResponseHeadersPolicyCustomHeadersConfigGetArgs> getCustomHeadersConfig() {
        return this.customHeadersConfig == null ? Codegen.empty() : this.customHeadersConfig;
    }

    /**
     * The current version of the response headers policy.
     * 
     */
    @Import(name="etag")
      private final @Nullable Output<String> etag;

    public Output<String> getEtag() {
        return this.etag == null ? Codegen.empty() : this.etag;
    }

    /**
     * A unique name to identify the response headers policy.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A configuration for a set of security-related HTTP response headers. See Security Headers Config for more information.
     * 
     */
    @Import(name="securityHeadersConfig")
      private final @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigGetArgs> securityHeadersConfig;

    public Output<ResponseHeadersPolicySecurityHeadersConfigGetArgs> getSecurityHeadersConfig() {
        return this.securityHeadersConfig == null ? Codegen.empty() : this.securityHeadersConfig;
    }

    public ResponseHeadersPolicyState(
        @Nullable Output<String> comment,
        @Nullable Output<ResponseHeadersPolicyCorsConfigGetArgs> corsConfig,
        @Nullable Output<ResponseHeadersPolicyCustomHeadersConfigGetArgs> customHeadersConfig,
        @Nullable Output<String> etag,
        @Nullable Output<String> name,
        @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigGetArgs> securityHeadersConfig) {
        this.comment = comment;
        this.corsConfig = corsConfig;
        this.customHeadersConfig = customHeadersConfig;
        this.etag = etag;
        this.name = name;
        this.securityHeadersConfig = securityHeadersConfig;
    }

    private ResponseHeadersPolicyState() {
        this.comment = Codegen.empty();
        this.corsConfig = Codegen.empty();
        this.customHeadersConfig = Codegen.empty();
        this.etag = Codegen.empty();
        this.name = Codegen.empty();
        this.securityHeadersConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResponseHeadersPolicyState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> comment;
        private @Nullable Output<ResponseHeadersPolicyCorsConfigGetArgs> corsConfig;
        private @Nullable Output<ResponseHeadersPolicyCustomHeadersConfigGetArgs> customHeadersConfig;
        private @Nullable Output<String> etag;
        private @Nullable Output<String> name;
        private @Nullable Output<ResponseHeadersPolicySecurityHeadersConfigGetArgs> securityHeadersConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(ResponseHeadersPolicyState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.corsConfig = defaults.corsConfig;
    	      this.customHeadersConfig = defaults.customHeadersConfig;
    	      this.etag = defaults.etag;
    	      this.name = defaults.name;
    	      this.securityHeadersConfig = defaults.securityHeadersConfig;
        }

        public Builder comment(@Nullable Output<String> comment) {
            this.comment = comment;
            return this;
        }
        public Builder comment(@Nullable String comment) {
            this.comment = Codegen.ofNullable(comment);
            return this;
        }
        public Builder corsConfig(@Nullable Output<ResponseHeadersPolicyCorsConfigGetArgs> corsConfig) {
            this.corsConfig = corsConfig;
            return this;
        }
        public Builder corsConfig(@Nullable ResponseHeadersPolicyCorsConfigGetArgs corsConfig) {
            this.corsConfig = Codegen.ofNullable(corsConfig);
            return this;
        }
        public Builder customHeadersConfig(@Nullable Output<ResponseHeadersPolicyCustomHeadersConfigGetArgs> customHeadersConfig) {
            this.customHeadersConfig = customHeadersConfig;
            return this;
        }
        public Builder customHeadersConfig(@Nullable ResponseHeadersPolicyCustomHeadersConfigGetArgs customHeadersConfig) {
            this.customHeadersConfig = Codegen.ofNullable(customHeadersConfig);
            return this;
        }
        public Builder etag(@Nullable Output<String> etag) {
            this.etag = etag;
            return this;
        }
        public Builder etag(@Nullable String etag) {
            this.etag = Codegen.ofNullable(etag);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder securityHeadersConfig(@Nullable Output<ResponseHeadersPolicySecurityHeadersConfigGetArgs> securityHeadersConfig) {
            this.securityHeadersConfig = securityHeadersConfig;
            return this;
        }
        public Builder securityHeadersConfig(@Nullable ResponseHeadersPolicySecurityHeadersConfigGetArgs securityHeadersConfig) {
            this.securityHeadersConfig = Codegen.ofNullable(securityHeadersConfig);
            return this;
        }        public ResponseHeadersPolicyState build() {
            return new ResponseHeadersPolicyState(comment, corsConfig, customHeadersConfig, etag, name, securityHeadersConfig);
        }
    }
}
