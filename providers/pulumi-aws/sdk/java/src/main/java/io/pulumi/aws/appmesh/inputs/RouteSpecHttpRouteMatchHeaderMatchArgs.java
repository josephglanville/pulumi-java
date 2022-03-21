// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchHeaderMatchRangeArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecHttpRouteMatchHeaderMatchArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttpRouteMatchHeaderMatchArgs Empty = new RouteSpecHttpRouteMatchHeaderMatchArgs();

    /**
     * The value sent by the client must match the specified value exactly. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="exact")
      private final @Nullable Output<String> exact;

    public Output<String> getExact() {
        return this.exact == null ? Output.empty() : this.exact;
    }

    /**
     * The value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
     * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> getPrefix() {
        return this.prefix == null ? Output.empty() : this.prefix;
    }

    /**
     * The object that specifies the range of numbers that the value sent by the client must be included in.
     * 
     */
    @Import(name="range")
      private final @Nullable Output<RouteSpecHttpRouteMatchHeaderMatchRangeArgs> range;

    public Output<RouteSpecHttpRouteMatchHeaderMatchRangeArgs> getRange() {
        return this.range == null ? Output.empty() : this.range;
    }

    /**
     * The value sent by the client must include the specified characters. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="regex")
      private final @Nullable Output<String> regex;

    public Output<String> getRegex() {
        return this.regex == null ? Output.empty() : this.regex;
    }

    /**
     * The value sent by the client must end with the specified characters. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="suffix")
      private final @Nullable Output<String> suffix;

    public Output<String> getSuffix() {
        return this.suffix == null ? Output.empty() : this.suffix;
    }

    public RouteSpecHttpRouteMatchHeaderMatchArgs(
        @Nullable Output<String> exact,
        @Nullable Output<String> prefix,
        @Nullable Output<RouteSpecHttpRouteMatchHeaderMatchRangeArgs> range,
        @Nullable Output<String> regex,
        @Nullable Output<String> suffix) {
        this.exact = exact;
        this.prefix = prefix;
        this.range = range;
        this.regex = regex;
        this.suffix = suffix;
    }

    private RouteSpecHttpRouteMatchHeaderMatchArgs() {
        this.exact = Output.empty();
        this.prefix = Output.empty();
        this.range = Output.empty();
        this.regex = Output.empty();
        this.suffix = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttpRouteMatchHeaderMatchArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> exact;
        private @Nullable Output<String> prefix;
        private @Nullable Output<RouteSpecHttpRouteMatchHeaderMatchRangeArgs> range;
        private @Nullable Output<String> regex;
        private @Nullable Output<String> suffix;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttpRouteMatchHeaderMatchArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.exact = defaults.exact;
    	      this.prefix = defaults.prefix;
    	      this.range = defaults.range;
    	      this.regex = defaults.regex;
    	      this.suffix = defaults.suffix;
        }

        public Builder exact(@Nullable Output<String> exact) {
            this.exact = exact;
            return this;
        }
        public Builder exact(@Nullable String exact) {
            this.exact = Output.ofNullable(exact);
            return this;
        }
        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = Output.ofNullable(prefix);
            return this;
        }
        public Builder range(@Nullable Output<RouteSpecHttpRouteMatchHeaderMatchRangeArgs> range) {
            this.range = range;
            return this;
        }
        public Builder range(@Nullable RouteSpecHttpRouteMatchHeaderMatchRangeArgs range) {
            this.range = Output.ofNullable(range);
            return this;
        }
        public Builder regex(@Nullable Output<String> regex) {
            this.regex = regex;
            return this;
        }
        public Builder regex(@Nullable String regex) {
            this.regex = Output.ofNullable(regex);
            return this;
        }
        public Builder suffix(@Nullable Output<String> suffix) {
            this.suffix = suffix;
            return this;
        }
        public Builder suffix(@Nullable String suffix) {
            this.suffix = Output.ofNullable(suffix);
            return this;
        }        public RouteSpecHttpRouteMatchHeaderMatchArgs build() {
            return new RouteSpecHttpRouteMatchHeaderMatchArgs(exact, prefix, range, regex, suffix);
        }
    }
}
