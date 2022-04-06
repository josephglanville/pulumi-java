// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecServiceDiscoveryDnsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecServiceDiscoveryArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecServiceDiscoveryArgs Empty = new VirtualNodeSpecServiceDiscoveryArgs();

    /**
     * Specifies any AWS Cloud Map information for the virtual node.
     * 
     */
    @Import(name="awsCloudMap")
      private final @Nullable Output<VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs> awsCloudMap;

    public Output<VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs> getAwsCloudMap() {
        return this.awsCloudMap == null ? Output.empty() : this.awsCloudMap;
    }

    /**
     * Specifies the DNS service name for the virtual node.
     * 
     */
    @Import(name="dns")
      private final @Nullable Output<VirtualNodeSpecServiceDiscoveryDnsArgs> dns;

    public Output<VirtualNodeSpecServiceDiscoveryDnsArgs> getDns() {
        return this.dns == null ? Output.empty() : this.dns;
    }

    public VirtualNodeSpecServiceDiscoveryArgs(
        @Nullable Output<VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs> awsCloudMap,
        @Nullable Output<VirtualNodeSpecServiceDiscoveryDnsArgs> dns) {
        this.awsCloudMap = awsCloudMap;
        this.dns = dns;
    }

    private VirtualNodeSpecServiceDiscoveryArgs() {
        this.awsCloudMap = Output.empty();
        this.dns = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecServiceDiscoveryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs> awsCloudMap;
        private @Nullable Output<VirtualNodeSpecServiceDiscoveryDnsArgs> dns;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecServiceDiscoveryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsCloudMap = defaults.awsCloudMap;
    	      this.dns = defaults.dns;
        }

        public Builder awsCloudMap(@Nullable Output<VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs> awsCloudMap) {
            this.awsCloudMap = awsCloudMap;
            return this;
        }
        public Builder awsCloudMap(@Nullable VirtualNodeSpecServiceDiscoveryAwsCloudMapArgs awsCloudMap) {
            this.awsCloudMap = Output.ofNullable(awsCloudMap);
            return this;
        }
        public Builder dns(@Nullable Output<VirtualNodeSpecServiceDiscoveryDnsArgs> dns) {
            this.dns = dns;
            return this;
        }
        public Builder dns(@Nullable VirtualNodeSpecServiceDiscoveryDnsArgs dns) {
            this.dns = Output.ofNullable(dns);
            return this;
        }        public VirtualNodeSpecServiceDiscoveryArgs build() {
            return new VirtualNodeSpecServiceDiscoveryArgs(awsCloudMap, dns);
        }
    }
}