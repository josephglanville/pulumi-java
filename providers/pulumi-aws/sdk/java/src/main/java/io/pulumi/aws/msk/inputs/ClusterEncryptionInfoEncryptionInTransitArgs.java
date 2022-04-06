// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.msk.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterEncryptionInfoEncryptionInTransitArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterEncryptionInfoEncryptionInTransitArgs Empty = new ClusterEncryptionInfoEncryptionInTransitArgs();

    /**
     * Encryption setting for data in transit between clients and brokers. Valid values: `TLS`, `TLS_PLAINTEXT`, and `PLAINTEXT`. Default value is `TLS`.
     * 
     */
    @Import(name="clientBroker")
      private final @Nullable Output<String> clientBroker;

    public Output<String> getClientBroker() {
        return this.clientBroker == null ? Output.empty() : this.clientBroker;
    }

    /**
     * Whether data communication among broker nodes is encrypted. Default value: `true`.
     * 
     */
    @Import(name="inCluster")
      private final @Nullable Output<Boolean> inCluster;

    public Output<Boolean> getInCluster() {
        return this.inCluster == null ? Output.empty() : this.inCluster;
    }

    public ClusterEncryptionInfoEncryptionInTransitArgs(
        @Nullable Output<String> clientBroker,
        @Nullable Output<Boolean> inCluster) {
        this.clientBroker = clientBroker;
        this.inCluster = inCluster;
    }

    private ClusterEncryptionInfoEncryptionInTransitArgs() {
        this.clientBroker = Output.empty();
        this.inCluster = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterEncryptionInfoEncryptionInTransitArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clientBroker;
        private @Nullable Output<Boolean> inCluster;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterEncryptionInfoEncryptionInTransitArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientBroker = defaults.clientBroker;
    	      this.inCluster = defaults.inCluster;
        }

        public Builder clientBroker(@Nullable Output<String> clientBroker) {
            this.clientBroker = clientBroker;
            return this;
        }
        public Builder clientBroker(@Nullable String clientBroker) {
            this.clientBroker = Output.ofNullable(clientBroker);
            return this;
        }
        public Builder inCluster(@Nullable Output<Boolean> inCluster) {
            this.inCluster = inCluster;
            return this;
        }
        public Builder inCluster(@Nullable Boolean inCluster) {
            this.inCluster = Output.ofNullable(inCluster);
            return this;
        }        public ClusterEncryptionInfoEncryptionInTransitArgs build() {
            return new ClusterEncryptionInfoEncryptionInTransitArgs(clientBroker, inCluster);
        }
    }
}