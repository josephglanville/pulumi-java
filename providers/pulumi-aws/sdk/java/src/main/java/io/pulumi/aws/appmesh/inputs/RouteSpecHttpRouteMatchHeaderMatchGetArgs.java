// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.RouteSpecHttpRouteMatchHeaderMatchRangeGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouteSpecHttpRouteMatchHeaderMatchGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouteSpecHttpRouteMatchHeaderMatchGetArgs Empty = new RouteSpecHttpRouteMatchHeaderMatchGetArgs();

    /**
     * The value sent by the client must match the specified value exactly. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="exact")
      private final @Nullable Output<String> exact;

    public Output<String> getExact() {
        return this.exact == null ? Codegen.empty() : this.exact;
    }

    /**
     * The value sent by the client must begin with the specified characters. Must be between 1 and 255 characters in length.
     * This parameter must always start with /, which by itself matches all requests to the virtual router service name.
     * 
     */
    @Import(name="prefix")
      private final @Nullable Output<String> prefix;

    public Output<String> getPrefix() {
        return this.prefix == null ? Codegen.empty() : this.prefix;
    }

    /**
     * The object that specifies the range of numbers that the value sent by the client must be included in.
     * 
     */
    @Import(name="range")
      private final @Nullable Output<RouteSpecHttpRouteMatchHeaderMatchRangeGetArgs> range;

    public Output<RouteSpecHttpRouteMatchHeaderMatchRangeGetArgs> getRange() {
        return this.range == null ? Codegen.empty() : this.range;
    }

    /**
     * The value sent by the client must include the specified characters. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="regex")
      private final @Nullable Output<String> regex;

    public Output<String> getRegex() {
        return this.regex == null ? Codegen.empty() : this.regex;
    }

    /**
     * The value sent by the client must end with the specified characters. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="suffix")
      private final @Nullable Output<String> suffix;

    public Output<String> getSuffix() {
        return this.suffix == null ? Codegen.empty() : this.suffix;
    }

    public RouteSpecHttpRouteMatchHeaderMatchGetArgs(
        @Nullable Output<String> exact,
        @Nullable Output<String> prefix,
        @Nullable Output<RouteSpecHttpRouteMatchHeaderMatchRangeGetArgs> range,
        @Nullable Output<String> regex,
        @Nullable Output<String> suffix) {
        this.exact = exact;
        this.prefix = prefix;
        this.range = range;
        this.regex = regex;
        this.suffix = suffix;
    }

    private RouteSpecHttpRouteMatchHeaderMatchGetArgs() {
        this.exact = Codegen.empty();
        this.prefix = Codegen.empty();
        this.range = Codegen.empty();
        this.regex = Codegen.empty();
        this.suffix = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouteSpecHttpRouteMatchHeaderMatchGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> exact;
        private @Nullable Output<String> prefix;
        private @Nullable Output<RouteSpecHttpRouteMatchHeaderMatchRangeGetArgs> range;
        private @Nullable Output<String> regex;
        private @Nullable Output<String> suffix;

        public Builder() {
    	      // Empty
        }

        public Builder(RouteSpecHttpRouteMatchHeaderMatchGetArgs defaults) {
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
            this.exact = Codegen.ofNullable(exact);
            return this;
        }
        public Builder prefix(@Nullable Output<String> prefix) {
            this.prefix = prefix;
            return this;
        }
        public Builder prefix(@Nullable String prefix) {
            this.prefix = Codegen.ofNullable(prefix);
            return this;
        }
        public Builder range(@Nullable Output<RouteSpecHttpRouteMatchHeaderMatchRangeGetArgs> range) {
            this.range = range;
            return this;
        }
        public Builder range(@Nullable RouteSpecHttpRouteMatchHeaderMatchRangeGetArgs range) {
            this.range = Codegen.ofNullable(range);
            return this;
        }
        public Builder regex(@Nullable Output<String> regex) {
            this.regex = regex;
            return this;
        }
        public Builder regex(@Nullable String regex) {
            this.regex = Codegen.ofNullable(regex);
            return this;
        }
        public Builder suffix(@Nullable Output<String> suffix) {
            this.suffix = suffix;
            return this;
        }
        public Builder suffix(@Nullable String suffix) {
            this.suffix = Codegen.ofNullable(suffix);
            return this;
        }        public RouteSpecHttpRouteMatchHeaderMatchGetArgs build() {
            return new RouteSpecHttpRouteMatchHeaderMatchGetArgs(exact, prefix, range, regex, suffix);
        }
    }
}
