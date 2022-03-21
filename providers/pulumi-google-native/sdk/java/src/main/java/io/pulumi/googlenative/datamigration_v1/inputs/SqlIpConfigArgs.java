// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datamigration_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.datamigration_v1.inputs.SqlAclEntryArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * IP Management configuration.
 * 
 */
public final class SqlIpConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlIpConfigArgs Empty = new SqlIpConfigArgs();

    /**
     * The list of external networks that are allowed to connect to the instance using the IP. See https://en.wikipedia.org/wiki/CIDR_notation#CIDR_notation, also known as 'slash' notation (e.g. `192.168.100.0/24`).
     * 
     */
    @Import(name="authorizedNetworks")
      private final @Nullable Output<List<SqlAclEntryArgs>> authorizedNetworks;

    public Output<List<SqlAclEntryArgs>> getAuthorizedNetworks() {
        return this.authorizedNetworks == null ? Output.empty() : this.authorizedNetworks;
    }

    /**
     * Whether the instance should be assigned an IPv4 address or not.
     * 
     */
    @Import(name="enableIpv4")
      private final @Nullable Output<Boolean> enableIpv4;

    public Output<Boolean> getEnableIpv4() {
        return this.enableIpv4 == null ? Output.empty() : this.enableIpv4;
    }

    /**
     * The resource link for the VPC network from which the Cloud SQL instance is accessible for private IP. For example, `projects/myProject/global/networks/default`. This setting can be updated, but it cannot be removed after it is set.
     * 
     */
    @Import(name="privateNetwork")
      private final @Nullable Output<String> privateNetwork;

    public Output<String> getPrivateNetwork() {
        return this.privateNetwork == null ? Output.empty() : this.privateNetwork;
    }

    /**
     * Whether SSL connections over IP should be enforced or not.
     * 
     */
    @Import(name="requireSsl")
      private final @Nullable Output<Boolean> requireSsl;

    public Output<Boolean> getRequireSsl() {
        return this.requireSsl == null ? Output.empty() : this.requireSsl;
    }

    public SqlIpConfigArgs(
        @Nullable Output<List<SqlAclEntryArgs>> authorizedNetworks,
        @Nullable Output<Boolean> enableIpv4,
        @Nullable Output<String> privateNetwork,
        @Nullable Output<Boolean> requireSsl) {
        this.authorizedNetworks = authorizedNetworks;
        this.enableIpv4 = enableIpv4;
        this.privateNetwork = privateNetwork;
        this.requireSsl = requireSsl;
    }

    private SqlIpConfigArgs() {
        this.authorizedNetworks = Output.empty();
        this.enableIpv4 = Output.empty();
        this.privateNetwork = Output.empty();
        this.requireSsl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlIpConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<SqlAclEntryArgs>> authorizedNetworks;
        private @Nullable Output<Boolean> enableIpv4;
        private @Nullable Output<String> privateNetwork;
        private @Nullable Output<Boolean> requireSsl;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlIpConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.authorizedNetworks = defaults.authorizedNetworks;
    	      this.enableIpv4 = defaults.enableIpv4;
    	      this.privateNetwork = defaults.privateNetwork;
    	      this.requireSsl = defaults.requireSsl;
        }

        public Builder authorizedNetworks(@Nullable Output<List<SqlAclEntryArgs>> authorizedNetworks) {
            this.authorizedNetworks = authorizedNetworks;
            return this;
        }
        public Builder authorizedNetworks(@Nullable List<SqlAclEntryArgs> authorizedNetworks) {
            this.authorizedNetworks = Output.ofNullable(authorizedNetworks);
            return this;
        }
        public Builder authorizedNetworks(SqlAclEntryArgs... authorizedNetworks) {
            return authorizedNetworks(List.of(authorizedNetworks));
        }
        public Builder enableIpv4(@Nullable Output<Boolean> enableIpv4) {
            this.enableIpv4 = enableIpv4;
            return this;
        }
        public Builder enableIpv4(@Nullable Boolean enableIpv4) {
            this.enableIpv4 = Output.ofNullable(enableIpv4);
            return this;
        }
        public Builder privateNetwork(@Nullable Output<String> privateNetwork) {
            this.privateNetwork = privateNetwork;
            return this;
        }
        public Builder privateNetwork(@Nullable String privateNetwork) {
            this.privateNetwork = Output.ofNullable(privateNetwork);
            return this;
        }
        public Builder requireSsl(@Nullable Output<Boolean> requireSsl) {
            this.requireSsl = requireSsl;
            return this;
        }
        public Builder requireSsl(@Nullable Boolean requireSsl) {
            this.requireSsl = Output.ofNullable(requireSsl);
            return this;
        }        public SqlIpConfigArgs build() {
            return new SqlIpConfigArgs(authorizedNetworks, enableIpv4, privateNetwork, requireSsl);
        }
    }
}
