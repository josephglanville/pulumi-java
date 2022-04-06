// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs Empty = new CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs();

    /**
     * A list of item names (cookies, headers, or query strings).
     * 
     */
    @Import(name="items")
      private final @Nullable Output<List<String>> items;

    public Output<List<String>> getItems() {
        return this.items == null ? Output.empty() : this.items;
    }

    public CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs(@Nullable Output<List<String>> items) {
        this.items = items;
    }

    private CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs() {
        this.items = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder items(@Nullable Output<List<String>> items) {
            this.items = items;
            return this;
        }
        public Builder items(@Nullable List<String> items) {
            this.items = Output.ofNullable(items);
            return this;
        }
        public Builder items(String... items) {
            return items(List.of(items));
        }        public CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs build() {
            return new CachePolicyParametersInCacheKeyAndForwardedToOriginCookiesConfigCookiesGetArgs(items);
        }
    }
}