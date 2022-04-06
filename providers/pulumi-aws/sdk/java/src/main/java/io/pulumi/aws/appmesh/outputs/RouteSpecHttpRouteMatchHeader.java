// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.outputs;

import io.pulumi.aws.appmesh.outputs.RouteSpecHttpRouteMatchHeaderMatch;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class RouteSpecHttpRouteMatchHeader {
    /**
     * If `true`, the match is on the opposite of the `match` method and value. Default is `false`.
     * 
     */
    private final @Nullable Boolean invert;
    /**
     * The method and value to match the header value sent with a request. Specify one match method.
     * 
     */
    private final @Nullable RouteSpecHttpRouteMatchHeaderMatch match;
    /**
     * A name for the HTTP header in the client request that will be matched on.
     * 
     */
    private final String name;

    @CustomType.Constructor
    private RouteSpecHttpRouteMatchHeader(
        @CustomType.Parameter("invert") @Nullable Boolean invert,
        @CustomType.Parameter("match") @Nullable RouteSpecHttpRouteMatchHeaderMatch match,
        @CustomType.Parameter("name") String name) {
        this.invert = invert;
        this.match = match;
        this.name = name;
    }

    /**
     * If `true`, the match is on the opposite of the `match` method and value. Default is `false`.
     * 
    */
    public Optional<Boolean> getInvert() {
        return Optional.ofNullable(this.invert);
    }
    /**
     * The method and value to match the header value sent with a request. Specify one match method.
     * 
    */
    public Optional<RouteSpecHttpRouteMatchHeaderMatch> getMatch() {
        return Optional.ofNullable(this.match);
    }
    /**
     * A name for the HTTP header in the client request that will be matched on.
     * 
    */
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttpRouteMatchHeader defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Boolean invert;
        private @Nullable RouteSpecHttpRouteMatchHeaderMatch match;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttpRouteMatchHeader defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.invert = defaults.invert;
    	      this.match = defaults.match;
    	      this.name = defaults.name;
        }

        public Builder invert(@Nullable Boolean invert) {
            this.invert = invert;
            return this;
        }
        public Builder match(@Nullable RouteSpecHttpRouteMatchHeaderMatch match) {
            this.match = match;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public RouteSpecHttpRouteMatchHeader build() {
            return new RouteSpecHttpRouteMatchHeader(invert, match, name);
        }
    }
}