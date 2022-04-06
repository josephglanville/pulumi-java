// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.aws.msk.inputs.ClusterClientAuthenticationSaslArgs;
import io.pulumi.aws.msk.inputs.ClusterClientAuthenticationTlsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClientAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClientAuthenticationArgs Empty = new ClusterClientAuthenticationArgs();

    /**
     * Configuration block for specifying SASL client authentication. See below.
     * 
     */
    @Import(name="sasl")
      private final @Nullable Output<ClusterClientAuthenticationSaslArgs> sasl;

    public Output<ClusterClientAuthenticationSaslArgs> getSasl() {
        return this.sasl == null ? Output.empty() : this.sasl;
    }

    /**
     * Configuration block for specifying TLS client authentication. See below.
     * 
     */
    @Import(name="tls")
      private final @Nullable Output<ClusterClientAuthenticationTlsArgs> tls;

    public Output<ClusterClientAuthenticationTlsArgs> getTls() {
        return this.tls == null ? Output.empty() : this.tls;
    }

    public ClusterClientAuthenticationArgs(
        @Nullable Output<ClusterClientAuthenticationSaslArgs> sasl,
        @Nullable Output<ClusterClientAuthenticationTlsArgs> tls) {
        this.sasl = sasl;
        this.tls = tls;
    }

    private ClusterClientAuthenticationArgs() {
        this.sasl = Output.empty();
        this.tls = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClientAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ClusterClientAuthenticationSaslArgs> sasl;
        private @Nullable Output<ClusterClientAuthenticationTlsArgs> tls;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClientAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sasl = defaults.sasl;
    	      this.tls = defaults.tls;
        }

        public Builder sasl(@Nullable Output<ClusterClientAuthenticationSaslArgs> sasl) {
            this.sasl = sasl;
            return this;
        }
        public Builder sasl(@Nullable ClusterClientAuthenticationSaslArgs sasl) {
            this.sasl = Output.ofNullable(sasl);
            return this;
        }
        public Builder tls(@Nullable Output<ClusterClientAuthenticationTlsArgs> tls) {
            this.tls = tls;
            return this;
        }
        public Builder tls(@Nullable ClusterClientAuthenticationTlsArgs tls) {
            this.tls = Output.ofNullable(tls);
            return this;
        }        public ClusterClientAuthenticationArgs build() {
            return new ClusterClientAuthenticationArgs(sasl, tls);
        }
    }
}