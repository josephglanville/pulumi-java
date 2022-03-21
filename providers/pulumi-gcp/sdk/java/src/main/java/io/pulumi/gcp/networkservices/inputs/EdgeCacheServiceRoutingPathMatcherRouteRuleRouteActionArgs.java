// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyArgs;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteArgs;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionArgs();

    /**
     * The policy to use for defining caching and signed request behaviour for requests that match this route.
     * Structure is documented below.
     * 
     */
    @Import(name="cdnPolicy")
      private final @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs> cdnPolicy;

    public Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs> getCdnPolicy() {
        return this.cdnPolicy == null ? Output.empty() : this.cdnPolicy;
    }

    /**
     * CORSPolicy defines Cross-Origin-Resource-Sharing configuration, including which CORS response headers will be set.
     * Structure is documented below.
     * 
     */
    @Import(name="corsPolicy")
      private final @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyArgs> corsPolicy;

    public Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyArgs> getCorsPolicy() {
        return this.corsPolicy == null ? Output.empty() : this.corsPolicy;
    }

    /**
     * The URL rewrite configuration for requests that match this route.
     * Structure is documented below.
     * 
     */
    @Import(name="urlRewrite")
      private final @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteArgs> urlRewrite;

    public Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteArgs> getUrlRewrite() {
        return this.urlRewrite == null ? Output.empty() : this.urlRewrite;
    }

    public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionArgs(
        @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs> cdnPolicy,
        @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyArgs> corsPolicy,
        @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteArgs> urlRewrite) {
        this.cdnPolicy = cdnPolicy;
        this.corsPolicy = corsPolicy;
        this.urlRewrite = urlRewrite;
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionArgs() {
        this.cdnPolicy = Output.empty();
        this.corsPolicy = Output.empty();
        this.urlRewrite = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs> cdnPolicy;
        private @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyArgs> corsPolicy;
        private @Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteArgs> urlRewrite;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.cdnPolicy = defaults.cdnPolicy;
    	      this.corsPolicy = defaults.corsPolicy;
    	      this.urlRewrite = defaults.urlRewrite;
        }

        public Builder cdnPolicy(@Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs> cdnPolicy) {
            this.cdnPolicy = cdnPolicy;
            return this;
        }
        public Builder cdnPolicy(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCdnPolicyArgs cdnPolicy) {
            this.cdnPolicy = Output.ofNullable(cdnPolicy);
            return this;
        }
        public Builder corsPolicy(@Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyArgs> corsPolicy) {
            this.corsPolicy = corsPolicy;
            return this;
        }
        public Builder corsPolicy(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionCorsPolicyArgs corsPolicy) {
            this.corsPolicy = Output.ofNullable(corsPolicy);
            return this;
        }
        public Builder urlRewrite(@Nullable Output<EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteArgs> urlRewrite) {
            this.urlRewrite = urlRewrite;
            return this;
        }
        public Builder urlRewrite(@Nullable EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionUrlRewriteArgs urlRewrite) {
            this.urlRewrite = Output.ofNullable(urlRewrite);
            return this;
        }        public EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleRouteActionArgs(cdnPolicy, corsPolicy, urlRewrite);
        }
    }
}
