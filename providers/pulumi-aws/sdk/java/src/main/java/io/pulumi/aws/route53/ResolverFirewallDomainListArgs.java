// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.route53;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResolverFirewallDomainListArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResolverFirewallDomainListArgs Empty = new ResolverFirewallDomainListArgs();

    /**
     * A array of domains for the firewall domain list.
     * 
     */
    @Import(name="domains")
      private final @Nullable Output<List<String>> domains;

    public Output<List<String>> getDomains() {
        return this.domains == null ? Codegen.empty() : this.domains;
    }

    /**
     * A name that lets you identify the domain list, to manage and use it.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public ResolverFirewallDomainListArgs(
        @Nullable Output<List<String>> domains,
        @Nullable Output<String> name,
        @Nullable Output<Map<String,String>> tags) {
        this.domains = domains;
        this.name = name;
        this.tags = tags;
    }

    private ResolverFirewallDomainListArgs() {
        this.domains = Codegen.empty();
        this.name = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResolverFirewallDomainListArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> domains;
        private @Nullable Output<String> name;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ResolverFirewallDomainListArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domains = defaults.domains;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
        }

        public Builder domains(@Nullable Output<List<String>> domains) {
            this.domains = domains;
            return this;
        }
        public Builder domains(@Nullable List<String> domains) {
            this.domains = Codegen.ofNullable(domains);
            return this;
        }
        public Builder domains(String... domains) {
            return domains(List.of(domains));
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public ResolverFirewallDomainListArgs build() {
            return new ResolverFirewallDomainListArgs(domains, name, tags);
        }
    }
}
