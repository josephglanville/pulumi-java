// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecServiceDiscoveryAwsCloudMapGetArgs;
import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecServiceDiscoveryDnsGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecServiceDiscoveryGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecServiceDiscoveryGetArgs Empty = new VirtualNodeSpecServiceDiscoveryGetArgs();

    /**
     * Specifies any AWS Cloud Map information for the virtual node.
     * 
     */
    @Import(name="awsCloudMap")
      private final @Nullable Output<VirtualNodeSpecServiceDiscoveryAwsCloudMapGetArgs> awsCloudMap;

    public Output<VirtualNodeSpecServiceDiscoveryAwsCloudMapGetArgs> getAwsCloudMap() {
        return this.awsCloudMap == null ? Output.empty() : this.awsCloudMap;
    }

    /**
     * Specifies the DNS service name for the virtual node.
     * 
     */
    @Import(name="dns")
      private final @Nullable Output<VirtualNodeSpecServiceDiscoveryDnsGetArgs> dns;

    public Output<VirtualNodeSpecServiceDiscoveryDnsGetArgs> getDns() {
        return this.dns == null ? Output.empty() : this.dns;
    }

    public VirtualNodeSpecServiceDiscoveryGetArgs(
        @Nullable Output<VirtualNodeSpecServiceDiscoveryAwsCloudMapGetArgs> awsCloudMap,
        @Nullable Output<VirtualNodeSpecServiceDiscoveryDnsGetArgs> dns) {
        this.awsCloudMap = awsCloudMap;
        this.dns = dns;
    }

    private VirtualNodeSpecServiceDiscoveryGetArgs() {
        this.awsCloudMap = Output.empty();
        this.dns = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecServiceDiscoveryGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecServiceDiscoveryAwsCloudMapGetArgs> awsCloudMap;
        private @Nullable Output<VirtualNodeSpecServiceDiscoveryDnsGetArgs> dns;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecServiceDiscoveryGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsCloudMap = defaults.awsCloudMap;
    	      this.dns = defaults.dns;
        }

        public Builder awsCloudMap(@Nullable Output<VirtualNodeSpecServiceDiscoveryAwsCloudMapGetArgs> awsCloudMap) {
            this.awsCloudMap = awsCloudMap;
            return this;
        }
        public Builder awsCloudMap(@Nullable VirtualNodeSpecServiceDiscoveryAwsCloudMapGetArgs awsCloudMap) {
            this.awsCloudMap = Output.ofNullable(awsCloudMap);
            return this;
        }
        public Builder dns(@Nullable Output<VirtualNodeSpecServiceDiscoveryDnsGetArgs> dns) {
            this.dns = dns;
            return this;
        }
        public Builder dns(@Nullable VirtualNodeSpecServiceDiscoveryDnsGetArgs dns) {
            this.dns = Output.ofNullable(dns);
            return this;
        }        public VirtualNodeSpecServiceDiscoveryGetArgs build() {
            return new VirtualNodeSpecServiceDiscoveryGetArgs(awsCloudMap, dns);
        }
    }
}
