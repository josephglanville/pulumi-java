// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs();

    /**
     * The queryParameterMatch matches if the value of the parameter exactly matches the contents of exactMatch.
     * 
     */
    @InputImport(name="exactMatch")
      private final @Nullable Output<String> exactMatch;

    public Output<String> getExactMatch() {
        return this.exactMatch == null ? Output.empty() : this.exactMatch;
    }

    /**
     * Headers to remove from the response prior to sending it back to the client.
     * Response headers are only sent to the client, and do not have an effect on the cache serving the response.
     * 
     */
    @InputImport(name="headerName", required=true)
      private final Output<String> headerName;

    public Output<String> getHeaderName() {
        return this.headerName;
    }

    /**
     * If set to false (default), the headerMatch is considered a match if the match criteria above are met.
     * If set to true, the headerMatch is considered a match if the match criteria above are NOT met.
     * 
     */
    @InputImport(name="invertMatch")
      private final @Nullable Output<Boolean> invertMatch;

    public Output<Boolean> getInvertMatch() {
        return this.invertMatch == null ? Output.empty() : this.invertMatch;
    }

    /**
     * The value of the header must start with the contents of prefixMatch.
     * 
     */
    @InputImport(name="prefixMatch")
      private final @Nullable Output<String> prefixMatch;

    public Output<String> getPrefixMatch() {
        return this.prefixMatch == null ? Output.empty() : this.prefixMatch;
    }

    /**
     * Specifies that the queryParameterMatch matches if the request contains the query parameter, irrespective of whether the parameter has a value or not.
     * 
     */
    @InputImport(name="presentMatch")
      private final @Nullable Output<Boolean> presentMatch;

    public Output<Boolean> getPresentMatch() {
        return this.presentMatch == null ? Output.empty() : this.presentMatch;
    }

    /**
     * The value of the header must end with the contents of suffixMatch.
     * 
     */
    @InputImport(name="suffixMatch")
      private final @Nullable Output<String> suffixMatch;

    public Output<String> getSuffixMatch() {
        return this.suffixMatch == null ? Output.empty() : this.suffixMatch;
    }

    public EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs(
        @Nullable Output<String> exactMatch,
        Output<String> headerName,
        @Nullable Output<Boolean> invertMatch,
        @Nullable Output<String> prefixMatch,
        @Nullable Output<Boolean> presentMatch,
        @Nullable Output<String> suffixMatch) {
        this.exactMatch = exactMatch;
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.invertMatch = invertMatch;
        this.prefixMatch = prefixMatch;
        this.presentMatch = presentMatch;
        this.suffixMatch = suffixMatch;
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs() {
        this.exactMatch = Output.empty();
        this.headerName = Output.empty();
        this.invertMatch = Output.empty();
        this.prefixMatch = Output.empty();
        this.presentMatch = Output.empty();
        this.suffixMatch = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> exactMatch;
        private Output<String> headerName;
        private @Nullable Output<Boolean> invertMatch;
        private @Nullable Output<String> prefixMatch;
        private @Nullable Output<Boolean> presentMatch;
        private @Nullable Output<String> suffixMatch;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exactMatch = defaults.exactMatch;
    	      this.headerName = defaults.headerName;
    	      this.invertMatch = defaults.invertMatch;
    	      this.prefixMatch = defaults.prefixMatch;
    	      this.presentMatch = defaults.presentMatch;
    	      this.suffixMatch = defaults.suffixMatch;
        }

        public Builder exactMatch(@Nullable Output<String> exactMatch) {
            this.exactMatch = exactMatch;
            return this;
        }

        public Builder exactMatch(@Nullable String exactMatch) {
            this.exactMatch = Output.ofNullable(exactMatch);
            return this;
        }

        public Builder headerName(Output<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder headerName(String headerName) {
            this.headerName = Output.of(Objects.requireNonNull(headerName));
            return this;
        }

        public Builder invertMatch(@Nullable Output<Boolean> invertMatch) {
            this.invertMatch = invertMatch;
            return this;
        }

        public Builder invertMatch(@Nullable Boolean invertMatch) {
            this.invertMatch = Output.ofNullable(invertMatch);
            return this;
        }

        public Builder prefixMatch(@Nullable Output<String> prefixMatch) {
            this.prefixMatch = prefixMatch;
            return this;
        }

        public Builder prefixMatch(@Nullable String prefixMatch) {
            this.prefixMatch = Output.ofNullable(prefixMatch);
            return this;
        }

        public Builder presentMatch(@Nullable Output<Boolean> presentMatch) {
            this.presentMatch = presentMatch;
            return this;
        }

        public Builder presentMatch(@Nullable Boolean presentMatch) {
            this.presentMatch = Output.ofNullable(presentMatch);
            return this;
        }

        public Builder suffixMatch(@Nullable Output<String> suffixMatch) {
            this.suffixMatch = suffixMatch;
            return this;
        }

        public Builder suffixMatch(@Nullable String suffixMatch) {
            this.suffixMatch = Output.ofNullable(suffixMatch);
            return this;
        }
        public EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleMatchRuleHeaderMatchGetArgs(exactMatch, headerName, invertMatch, prefixMatch, presentMatch, suffixMatch);
        }
    }
}
