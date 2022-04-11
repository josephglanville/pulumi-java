// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.wafv2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IpSetArgs extends io.pulumi.resources.ResourceArgs {

    public static final IpSetArgs Empty = new IpSetArgs();

    /**
     * Contains an array of strings that specify one or more IP addresses or blocks of IP addresses in Classless Inter-Domain Routing (CIDR) notation. AWS WAF supports all address ranges for IP versions IPv4 and IPv6.
     * 
     */
    @Import(name="addresses")
      private final @Nullable Output<List<String>> addresses;

    public Output<List<String>> getAddresses() {
        return this.addresses == null ? Codegen.empty() : this.addresses;
    }

    /**
     * A friendly description of the IP set.
     * 
     */
    @Import(name="description")
      private final @Nullable Output<String> description;

    public Output<String> getDescription() {
        return this.description == null ? Codegen.empty() : this.description;
    }

    /**
     * Specify IPV4 or IPV6. Valid values are `IPV4` or `IPV6`.
     * 
     */
    @Import(name="ipAddressVersion", required=true)
      private final Output<String> ipAddressVersion;

    public Output<String> getIpAddressVersion() {
        return this.ipAddressVersion;
    }

    /**
     * A friendly name of the IP set.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the Region US East (N. Virginia).
     * 
     */
    @Import(name="scope", required=true)
      private final Output<String> scope;

    public Output<String> getScope() {
        return this.scope;
    }

    /**
     * An array of key:value pairs to associate with the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Codegen.empty() : this.tags;
    }

    public IpSetArgs(
        @Nullable Output<List<String>> addresses,
        @Nullable Output<String> description,
        Output<String> ipAddressVersion,
        @Nullable Output<String> name,
        Output<String> scope,
        @Nullable Output<Map<String,String>> tags) {
        this.addresses = addresses;
        this.description = description;
        this.ipAddressVersion = Objects.requireNonNull(ipAddressVersion, "expected parameter 'ipAddressVersion' to be non-null");
        this.name = name;
        this.scope = Objects.requireNonNull(scope, "expected parameter 'scope' to be non-null");
        this.tags = tags;
    }

    private IpSetArgs() {
        this.addresses = Codegen.empty();
        this.description = Codegen.empty();
        this.ipAddressVersion = Codegen.empty();
        this.name = Codegen.empty();
        this.scope = Codegen.empty();
        this.tags = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpSetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> addresses;
        private @Nullable Output<String> description;
        private Output<String> ipAddressVersion;
        private @Nullable Output<String> name;
        private Output<String> scope;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(IpSetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addresses = defaults.addresses;
    	      this.description = defaults.description;
    	      this.ipAddressVersion = defaults.ipAddressVersion;
    	      this.name = defaults.name;
    	      this.scope = defaults.scope;
    	      this.tags = defaults.tags;
        }

        public Builder addresses(@Nullable Output<List<String>> addresses) {
            this.addresses = addresses;
            return this;
        }
        public Builder addresses(@Nullable List<String> addresses) {
            this.addresses = Codegen.ofNullable(addresses);
            return this;
        }
        public Builder addresses(String... addresses) {
            return addresses(List.of(addresses));
        }
        public Builder description(@Nullable Output<String> description) {
            this.description = description;
            return this;
        }
        public Builder description(@Nullable String description) {
            this.description = Codegen.ofNullable(description);
            return this;
        }
        public Builder ipAddressVersion(Output<String> ipAddressVersion) {
            this.ipAddressVersion = Objects.requireNonNull(ipAddressVersion);
            return this;
        }
        public Builder ipAddressVersion(String ipAddressVersion) {
            this.ipAddressVersion = Output.of(Objects.requireNonNull(ipAddressVersion));
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder scope(Output<String> scope) {
            this.scope = Objects.requireNonNull(scope);
            return this;
        }
        public Builder scope(String scope) {
            this.scope = Output.of(Objects.requireNonNull(scope));
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Codegen.ofNullable(tags);
            return this;
        }        public IpSetArgs build() {
            return new IpSetArgs(addresses, description, ipAddressVersion, name, scope, tags);
        }
    }
}
