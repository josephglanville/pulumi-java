// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.networkservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs extends io.pulumi.resources.ResourceArgs {

    public static final EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs Empty = new EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs();

    @InputImport(name="headerName", required=true)
    private final Input<String> headerName;

    public Input<String> getHeaderName() {
        return this.headerName;
    }

    @InputImport(name="headerValue", required=true)
    private final Input<String> headerValue;

    public Input<String> getHeaderValue() {
        return this.headerValue;
    }

    @InputImport(name="replace")
    private final @Nullable Input<Boolean> replace;

    public Input<Boolean> getReplace() {
        return this.replace == null ? Input.empty() : this.replace;
    }

    public EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs(
        Input<String> headerName,
        Input<String> headerValue,
        @Nullable Input<Boolean> replace) {
        this.headerName = Objects.requireNonNull(headerName, "expected parameter 'headerName' to be non-null");
        this.headerValue = Objects.requireNonNull(headerValue, "expected parameter 'headerValue' to be non-null");
        this.replace = replace;
    }

    private EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs() {
        this.headerName = Input.empty();
        this.headerValue = Input.empty();
        this.replace = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> headerName;
        private Input<String> headerValue;
        private @Nullable Input<Boolean> replace;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.headerName = defaults.headerName;
    	      this.headerValue = defaults.headerValue;
    	      this.replace = defaults.replace;
        }

        public Builder setHeaderName(Input<String> headerName) {
            this.headerName = Objects.requireNonNull(headerName);
            return this;
        }

        public Builder setHeaderName(String headerName) {
            this.headerName = Input.of(Objects.requireNonNull(headerName));
            return this;
        }

        public Builder setHeaderValue(Input<String> headerValue) {
            this.headerValue = Objects.requireNonNull(headerValue);
            return this;
        }

        public Builder setHeaderValue(String headerValue) {
            this.headerValue = Input.of(Objects.requireNonNull(headerValue));
            return this;
        }

        public Builder setReplace(@Nullable Input<Boolean> replace) {
            this.replace = replace;
            return this;
        }

        public Builder setReplace(@Nullable Boolean replace) {
            this.replace = Input.ofNullable(replace);
            return this;
        }

        public EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs build() {
            return new EdgeCacheServiceRoutingPathMatcherRouteRuleHeaderActionRequestHeaderToAddArgs(headerName, headerValue, replace);
        }
    }
}