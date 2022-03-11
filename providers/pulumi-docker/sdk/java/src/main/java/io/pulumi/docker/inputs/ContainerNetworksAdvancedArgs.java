// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ContainerNetworksAdvancedArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerNetworksAdvancedArgs Empty = new ContainerNetworksAdvancedArgs();

    @InputImport(name="aliases")
      private final @Nullable Output<List<String>> aliases;

    public Output<List<String>> getAliases() {
        return this.aliases == null ? Output.empty() : this.aliases;
    }

    @InputImport(name="ipv4Address")
      private final @Nullable Output<String> ipv4Address;

    public Output<String> getIpv4Address() {
        return this.ipv4Address == null ? Output.empty() : this.ipv4Address;
    }

    @InputImport(name="ipv6Address")
      private final @Nullable Output<String> ipv6Address;

    public Output<String> getIpv6Address() {
        return this.ipv6Address == null ? Output.empty() : this.ipv6Address;
    }

    @InputImport(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    public ContainerNetworksAdvancedArgs(
        @Nullable Output<List<String>> aliases,
        @Nullable Output<String> ipv4Address,
        @Nullable Output<String> ipv6Address,
        Output<String> name) {
        this.aliases = aliases;
        this.ipv4Address = ipv4Address;
        this.ipv6Address = ipv6Address;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ContainerNetworksAdvancedArgs() {
        this.aliases = Output.empty();
        this.ipv4Address = Output.empty();
        this.ipv6Address = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerNetworksAdvancedArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<String>> aliases;
        private @Nullable Output<String> ipv4Address;
        private @Nullable Output<String> ipv6Address;
        private Output<String> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerNetworksAdvancedArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliases = defaults.aliases;
    	      this.ipv4Address = defaults.ipv4Address;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.name = defaults.name;
        }

        public Builder aliases(@Nullable Output<List<String>> aliases) {
            this.aliases = aliases;
            return this;
        }

        public Builder aliases(@Nullable List<String> aliases) {
            this.aliases = Output.ofNullable(aliases);
            return this;
        }

        public Builder ipv4Address(@Nullable Output<String> ipv4Address) {
            this.ipv4Address = ipv4Address;
            return this;
        }

        public Builder ipv4Address(@Nullable String ipv4Address) {
            this.ipv4Address = Output.ofNullable(ipv4Address);
            return this;
        }

        public Builder ipv6Address(@Nullable Output<String> ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }

        public Builder ipv6Address(@Nullable String ipv6Address) {
            this.ipv6Address = Output.ofNullable(ipv6Address);
            return this;
        }

        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public ContainerNetworksAdvancedArgs build() {
            return new ContainerNetworksAdvancedArgs(aliases, ipv4Address, ipv6Address, name);
        }
    }
}
