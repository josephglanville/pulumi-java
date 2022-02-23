// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.kubernetes.core_v1.inputs.PodDNSConfigOptionArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * PodDNSConfig defines the DNS parameters of a pod in addition to those generated from DNSPolicy.
 * 
 */
public final class PodDNSConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final PodDNSConfigArgs Empty = new PodDNSConfigArgs();

    /**
     * A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.
     * 
     */
    @InputImport(name="nameservers")
      private final @Nullable Input<List<String>> nameservers;

    public Input<List<String>> getNameservers() {
        return this.nameservers == null ? Input.empty() : this.nameservers;
    }

    /**
     * A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.
     * 
     */
    @InputImport(name="options")
      private final @Nullable Input<List<PodDNSConfigOptionArgs>> options;

    public Input<List<PodDNSConfigOptionArgs>> getOptions() {
        return this.options == null ? Input.empty() : this.options;
    }

    /**
     * A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
     * 
     */
    @InputImport(name="searches")
      private final @Nullable Input<List<String>> searches;

    public Input<List<String>> getSearches() {
        return this.searches == null ? Input.empty() : this.searches;
    }

    public PodDNSConfigArgs(
        @Nullable Input<List<String>> nameservers,
        @Nullable Input<List<PodDNSConfigOptionArgs>> options,
        @Nullable Input<List<String>> searches) {
        this.nameservers = nameservers;
        this.options = options;
        this.searches = searches;
    }

    private PodDNSConfigArgs() {
        this.nameservers = Input.empty();
        this.options = Input.empty();
        this.searches = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodDNSConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> nameservers;
        private @Nullable Input<List<PodDNSConfigOptionArgs>> options;
        private @Nullable Input<List<String>> searches;

        public Builder() {
    	      // Empty
        }

        public Builder(PodDNSConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nameservers = defaults.nameservers;
    	      this.options = defaults.options;
    	      this.searches = defaults.searches;
        }

        public Builder setNameservers(@Nullable Input<List<String>> nameservers) {
            this.nameservers = nameservers;
            return this;
        }

        public Builder setNameservers(@Nullable List<String> nameservers) {
            this.nameservers = Input.ofNullable(nameservers);
            return this;
        }

        public Builder setOptions(@Nullable Input<List<PodDNSConfigOptionArgs>> options) {
            this.options = options;
            return this;
        }

        public Builder setOptions(@Nullable List<PodDNSConfigOptionArgs> options) {
            this.options = Input.ofNullable(options);
            return this;
        }

        public Builder setSearches(@Nullable Input<List<String>> searches) {
            this.searches = searches;
            return this;
        }

        public Builder setSearches(@Nullable List<String> searches) {
            this.searches = Input.ofNullable(searches);
            return this;
        }
        public PodDNSConfigArgs build() {
            return new PodDNSConfigArgs(nameservers, options, searches);
        }
    }
}
