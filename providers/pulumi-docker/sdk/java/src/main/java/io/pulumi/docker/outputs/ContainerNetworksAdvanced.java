// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.docker.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ContainerNetworksAdvanced {
    private final @Nullable List<String> aliases;
    private final @Nullable String ipv4Address;
    private final @Nullable String ipv6Address;
    private final String name;

    @CustomType.Constructor
    private ContainerNetworksAdvanced(
        @CustomType.Parameter("aliases") @Nullable List<String> aliases,
        @CustomType.Parameter("ipv4Address") @Nullable String ipv4Address,
        @CustomType.Parameter("ipv6Address") @Nullable String ipv6Address,
        @CustomType.Parameter("name") String name) {
        this.aliases = aliases;
        this.ipv4Address = ipv4Address;
        this.ipv6Address = ipv6Address;
        this.name = name;
    }

    public List<String> getAliases() {
        return this.aliases == null ? List.of() : this.aliases;
    }
    public Optional<String> getIpv4Address() {
        return Optional.ofNullable(this.ipv4Address);
    }
    public Optional<String> getIpv6Address() {
        return Optional.ofNullable(this.ipv6Address);
    }
    public String getName() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerNetworksAdvanced defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> aliases;
        private @Nullable String ipv4Address;
        private @Nullable String ipv6Address;
        private String name;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerNetworksAdvanced defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aliases = defaults.aliases;
    	      this.ipv4Address = defaults.ipv4Address;
    	      this.ipv6Address = defaults.ipv6Address;
    	      this.name = defaults.name;
        }

        public Builder aliases(@Nullable List<String> aliases) {
            this.aliases = aliases;
            return this;
        }
        public Builder aliases(String... aliases) {
            return aliases(List.of(aliases));
        }
        public Builder ipv4Address(@Nullable String ipv4Address) {
            this.ipv4Address = ipv4Address;
            return this;
        }
        public Builder ipv6Address(@Nullable String ipv6Address) {
            this.ipv6Address = ipv6Address;
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }        public ContainerNetworksAdvanced build() {
            return new ContainerNetworksAdvanced(aliases, ipv4Address, ipv6Address, name);
        }
    }
}