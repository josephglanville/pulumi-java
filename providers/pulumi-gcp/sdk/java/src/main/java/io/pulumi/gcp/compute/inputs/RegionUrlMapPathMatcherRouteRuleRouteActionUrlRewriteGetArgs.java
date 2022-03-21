// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs Empty = new RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs();

    /**
     * Prior to forwarding the request to the selected service, the request's host
     * header is replaced with contents of hostRewrite. The value must be between 1 and
     * 255 characters.
     * 
     */
    @Import(name="hostRewrite")
      private final @Nullable Output<String> hostRewrite;

    public Output<String> getHostRewrite() {
        return this.hostRewrite == null ? Output.empty() : this.hostRewrite;
    }

    /**
     * Prior to forwarding the request to the selected backend service, the matching
     * portion of the request's path is replaced by pathPrefixRewrite. The value must
     * be between 1 and 1024 characters.
     * 
     */
    @Import(name="pathPrefixRewrite")
      private final @Nullable Output<String> pathPrefixRewrite;

    public Output<String> getPathPrefixRewrite() {
        return this.pathPrefixRewrite == null ? Output.empty() : this.pathPrefixRewrite;
    }

    public RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs(
        @Nullable Output<String> hostRewrite,
        @Nullable Output<String> pathPrefixRewrite) {
        this.hostRewrite = hostRewrite;
        this.pathPrefixRewrite = pathPrefixRewrite;
    }

    private RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs() {
        this.hostRewrite = Output.empty();
        this.pathPrefixRewrite = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> hostRewrite;
        private @Nullable Output<String> pathPrefixRewrite;

        public Builder() {
    	      // Empty
        }

        public Builder(RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostRewrite = defaults.hostRewrite;
    	      this.pathPrefixRewrite = defaults.pathPrefixRewrite;
        }

        public Builder hostRewrite(@Nullable Output<String> hostRewrite) {
            this.hostRewrite = hostRewrite;
            return this;
        }
        public Builder hostRewrite(@Nullable String hostRewrite) {
            this.hostRewrite = Output.ofNullable(hostRewrite);
            return this;
        }
        public Builder pathPrefixRewrite(@Nullable Output<String> pathPrefixRewrite) {
            this.pathPrefixRewrite = pathPrefixRewrite;
            return this;
        }
        public Builder pathPrefixRewrite(@Nullable String pathPrefixRewrite) {
            this.pathPrefixRewrite = Output.ofNullable(pathPrefixRewrite);
            return this;
        }        public RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs build() {
            return new RegionUrlMapPathMatcherRouteRuleRouteActionUrlRewriteGetArgs(hostRewrite, pathPrefixRewrite);
        }
    }
}
