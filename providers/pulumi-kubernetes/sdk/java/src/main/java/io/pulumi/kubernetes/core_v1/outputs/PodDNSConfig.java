// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.core_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.kubernetes.core_v1.outputs.PodDNSConfigOption;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class PodDNSConfig {
    /**
     * A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.
     * 
     */
    private final @Nullable List<String> nameservers;
    /**
     * A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.
     * 
     */
    private final @Nullable List<PodDNSConfigOption> options;
    /**
     * A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
     * 
     */
    private final @Nullable List<String> searches;

    @CustomType.Constructor
    private PodDNSConfig(
        @CustomType.Parameter("nameservers") @Nullable List<String> nameservers,
        @CustomType.Parameter("options") @Nullable List<PodDNSConfigOption> options,
        @CustomType.Parameter("searches") @Nullable List<String> searches) {
        this.nameservers = nameservers;
        this.options = options;
        this.searches = searches;
    }

    /**
     * A list of DNS name server IP addresses. This will be appended to the base nameservers generated from DNSPolicy. Duplicated nameservers will be removed.
     * 
    */
    public List<String> getNameservers() {
        return this.nameservers == null ? List.of() : this.nameservers;
    }
    /**
     * A list of DNS resolver options. This will be merged with the base options generated from DNSPolicy. Duplicated entries will be removed. Resolution options given in Options will override those that appear in the base DNSPolicy.
     * 
    */
    public List<PodDNSConfigOption> getOptions() {
        return this.options == null ? List.of() : this.options;
    }
    /**
     * A list of DNS search domains for host-name lookup. This will be appended to the base search paths generated from DNSPolicy. Duplicated search paths will be removed.
     * 
    */
    public List<String> getSearches() {
        return this.searches == null ? List.of() : this.searches;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PodDNSConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> nameservers;
        private @Nullable List<PodDNSConfigOption> options;
        private @Nullable List<String> searches;

        public Builder() {
    	      // Empty
        }

        public Builder(PodDNSConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nameservers = defaults.nameservers;
    	      this.options = defaults.options;
    	      this.searches = defaults.searches;
        }

        public Builder nameservers(@Nullable List<String> nameservers) {
            this.nameservers = nameservers;
            return this;
        }
        public Builder nameservers(String... nameservers) {
            return nameservers(List.of(nameservers));
        }
        public Builder options(@Nullable List<PodDNSConfigOption> options) {
            this.options = options;
            return this;
        }
        public Builder options(PodDNSConfigOption... options) {
            return options(List.of(options));
        }
        public Builder searches(@Nullable List<String> searches) {
            this.searches = searches;
            return this;
        }
        public Builder searches(String... searches) {
            return searches(List.of(searches));
        }        public PodDNSConfig build() {
            return new PodDNSConfig(nameservers, options, searches);
        }
    }
}
