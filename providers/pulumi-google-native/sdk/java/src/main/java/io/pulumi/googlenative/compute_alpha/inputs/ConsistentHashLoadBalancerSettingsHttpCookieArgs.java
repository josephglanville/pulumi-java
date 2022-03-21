// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.compute_alpha.inputs.DurationArgs;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The information about the HTTP Cookie on which the hash function is based for load balancing policies that use a consistent hash.
 * 
 */
public final class ConsistentHashLoadBalancerSettingsHttpCookieArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConsistentHashLoadBalancerSettingsHttpCookieArgs Empty = new ConsistentHashLoadBalancerSettingsHttpCookieArgs();

    /**
     * Name of the cookie.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Path to set for the cookie.
     * 
     */
    @Import(name="path")
      private final @Nullable Output<String> path;

    public Output<String> getPath() {
        return this.path == null ? Output.empty() : this.path;
    }

    /**
     * Lifetime of the cookie.
     * 
     */
    @Import(name="ttl")
      private final @Nullable Output<DurationArgs> ttl;

    public Output<DurationArgs> getTtl() {
        return this.ttl == null ? Output.empty() : this.ttl;
    }

    public ConsistentHashLoadBalancerSettingsHttpCookieArgs(
        @Nullable Output<String> name,
        @Nullable Output<String> path,
        @Nullable Output<DurationArgs> ttl) {
        this.name = name;
        this.path = path;
        this.ttl = ttl;
    }

    private ConsistentHashLoadBalancerSettingsHttpCookieArgs() {
        this.name = Output.empty();
        this.path = Output.empty();
        this.ttl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConsistentHashLoadBalancerSettingsHttpCookieArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<String> path;
        private @Nullable Output<DurationArgs> ttl;

        public Builder() {
    	      // Empty
        }

        public Builder(ConsistentHashLoadBalancerSettingsHttpCookieArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.ttl = defaults.ttl;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder path(@Nullable Output<String> path) {
            this.path = path;
            return this;
        }
        public Builder path(@Nullable String path) {
            this.path = Output.ofNullable(path);
            return this;
        }
        public Builder ttl(@Nullable Output<DurationArgs> ttl) {
            this.ttl = ttl;
            return this;
        }
        public Builder ttl(@Nullable DurationArgs ttl) {
            this.ttl = Output.ofNullable(ttl);
            return this;
        }        public ConsistentHashLoadBalancerSettingsHttpCookieArgs build() {
            return new ConsistentHashLoadBalancerSettingsHttpCookieArgs(name, path, ttl);
        }
    }
}
