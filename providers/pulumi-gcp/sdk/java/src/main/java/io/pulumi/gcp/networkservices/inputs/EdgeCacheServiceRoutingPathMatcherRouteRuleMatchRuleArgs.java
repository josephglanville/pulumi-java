// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs;
import io.pulumi.gcp.networkservices.inputs.EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs();

    /**
     * For satisfying the matchRule condition, the path of the request must exactly match the value specified in fullPathMatch after removing any query parameters and anchor that may be part of the original URL.
     * 
     */
    @InputImport(name="fullPathMatch")
      private final @Nullable Input<String> fullPathMatch;

    public Input<String> getFullPathMatch() {
        return this.fullPathMatch == null ? Input.empty() : this.fullPathMatch;
    }

    /**
     * Specifies a list of header match criteria, all of which must match corresponding headers in the request.
     * Structure is documented below.
     * 
     */
    @InputImport(name="headerMatches")
      private final @Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs>> headerMatches;

    public Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs>> getHeaderMatches() {
        return this.headerMatches == null ? Input.empty() : this.headerMatches;
    }

    /**
     * Specifies that prefixMatch and fullPathMatch matches are case sensitive.
     * 
     */
    @InputImport(name="ignoreCase")
      private final @Nullable Input<Boolean> ignoreCase;

    public Input<Boolean> getIgnoreCase() {
        return this.ignoreCase == null ? Input.empty() : this.ignoreCase;
    }

    /**
     * For satisfying the matchRule condition, the path of the request
     * must match the wildcard pattern specified in pathTemplateMatch
     * after removing any query parameters and anchor that may be part
     * of the original URL.
     * pathTemplateMatch must be between 1 and 255 characters
     * (inclusive).  The pattern specified by pathTemplateMatch may
     * have at most 5 wildcard operators and at most 5 variable
     * captures in total.
     * 
     */
    @InputImport(name="pathTemplateMatch")
      private final @Nullable Input<String> pathTemplateMatch;

    public Input<String> getPathTemplateMatch() {
        return this.pathTemplateMatch == null ? Input.empty() : this.pathTemplateMatch;
    }

    /**
     * The value of the header must start with the contents of prefixMatch.
     * 
     */
    @InputImport(name="prefixMatch")
      private final @Nullable Input<String> prefixMatch;

    public Input<String> getPrefixMatch() {
        return this.prefixMatch == null ? Input.empty() : this.prefixMatch;
    }

    /**
     * Specifies a list of query parameter match criteria, all of which must match corresponding query parameters in the request.
     * Structure is documented below.
     * 
     */
    @InputImport(name="queryParameterMatches")
      private final @Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs>> queryParameterMatches;

    public Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs>> getQueryParameterMatches() {
        return this.queryParameterMatches == null ? Input.empty() : this.queryParameterMatches;
    }

    public EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs(
        @Nullable Input<String> fullPathMatch,
        @Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs>> headerMatches,
        @Nullable Input<Boolean> ignoreCase,
        @Nullable Input<String> pathTemplateMatch,
        @Nullable Input<String> prefixMatch,
        @Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs>> queryParameterMatches) {
        this.fullPathMatch = fullPathMatch;
        this.headerMatches = headerMatches;
        this.ignoreCase = ignoreCase;
        this.pathTemplateMatch = pathTemplateMatch;
        this.prefixMatch = prefixMatch;
        this.queryParameterMatches = queryParameterMatches;
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs() {
        this.fullPathMatch = Input.empty();
        this.headerMatches = Input.empty();
        this.ignoreCase = Input.empty();
        this.pathTemplateMatch = Input.empty();
        this.prefixMatch = Input.empty();
        this.queryParameterMatches = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> fullPathMatch;
        private @Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs>> headerMatches;
        private @Nullable Input<Boolean> ignoreCase;
        private @Nullable Input<String> pathTemplateMatch;
        private @Nullable Input<String> prefixMatch;
        private @Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs>> queryParameterMatches;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fullPathMatch = defaults.fullPathMatch;
    	      this.headerMatches = defaults.headerMatches;
    	      this.ignoreCase = defaults.ignoreCase;
    	      this.pathTemplateMatch = defaults.pathTemplateMatch;
    	      this.prefixMatch = defaults.prefixMatch;
    	      this.queryParameterMatches = defaults.queryParameterMatches;
        }

        public Builder setFullPathMatch(@Nullable Input<String> fullPathMatch) {
            this.fullPathMatch = fullPathMatch;
            return this;
        }

        public Builder setFullPathMatch(@Nullable String fullPathMatch) {
            this.fullPathMatch = Input.ofNullable(fullPathMatch);
            return this;
        }

        public Builder setHeaderMatches(@Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs>> headerMatches) {
            this.headerMatches = headerMatches;
            return this;
        }

        public Builder setHeaderMatches(@Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchArgs> headerMatches) {
            this.headerMatches = Input.ofNullable(headerMatches);
            return this;
        }

        public Builder setIgnoreCase(@Nullable Input<Boolean> ignoreCase) {
            this.ignoreCase = ignoreCase;
            return this;
        }

        public Builder setIgnoreCase(@Nullable Boolean ignoreCase) {
            this.ignoreCase = Input.ofNullable(ignoreCase);
            return this;
        }

        public Builder setPathTemplateMatch(@Nullable Input<String> pathTemplateMatch) {
            this.pathTemplateMatch = pathTemplateMatch;
            return this;
        }

        public Builder setPathTemplateMatch(@Nullable String pathTemplateMatch) {
            this.pathTemplateMatch = Input.ofNullable(pathTemplateMatch);
            return this;
        }

        public Builder setPrefixMatch(@Nullable Input<String> prefixMatch) {
            this.prefixMatch = prefixMatch;
            return this;
        }

        public Builder setPrefixMatch(@Nullable String prefixMatch) {
            this.prefixMatch = Input.ofNullable(prefixMatch);
            return this;
        }

        public Builder setQueryParameterMatches(@Nullable Input<List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs>> queryParameterMatches) {
            this.queryParameterMatches = queryParameterMatches;
            return this;
        }

        public Builder setQueryParameterMatches(@Nullable List<EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleQueryParameterMatchArgs> queryParameterMatches) {
            this.queryParameterMatches = Input.ofNullable(queryParameterMatches);
            return this;
        }
        public EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleArgs(fullPathMatch, headerMatches, ignoreCase, pathTemplateMatch, prefixMatch, queryParameterMatches);
        }
    }
}
