// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


/**
 * The VPC Peering configuration is used to create VPC peering between Datastream and the consumer's VPC.
 * 
 */
public final class VpcPeeringConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final VpcPeeringConfigArgs Empty = new VpcPeeringConfigArgs();

    /**
     * A free subnet for peering. (CIDR of /29) TODO(b/172995841) add validators.
     * 
     */
    @Import(name="subnet", required=true)
      private final Output<String> subnet;

    public Output<String> getSubnet() {
        return this.subnet;
    }

    /**
     * Fully qualified name of the VPC that Datastream will peer to. Format: `projects/{project}/global/{networks}/{name}`
     * 
     */
    @Import(name="vpc", required=true)
      private final Output<String> vpc;

    public Output<String> getVpc() {
        return this.vpc;
    }

    public VpcPeeringConfigArgs(
        Output<String> subnet,
        Output<String> vpc) {
        this.subnet = Objects.requireNonNull(subnet, "expected parameter 'subnet' to be non-null");
        this.vpc = Objects.requireNonNull(vpc, "expected parameter 'vpc' to be non-null");
    }

    private VpcPeeringConfigArgs() {
        this.subnet = Codegen.empty();
        this.vpc = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcPeeringConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> subnet;
        private Output<String> vpc;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcPeeringConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnet = defaults.subnet;
    	      this.vpc = defaults.vpc;
        }

        public Builder subnet(Output<String> subnet) {
            this.subnet = Objects.requireNonNull(subnet);
            return this;
        }
        public Builder subnet(String subnet) {
            this.subnet = Output.of(Objects.requireNonNull(subnet));
            return this;
        }
        public Builder vpc(Output<String> vpc) {
            this.vpc = Objects.requireNonNull(vpc);
            return this;
        }
        public Builder vpc(String vpc) {
            this.vpc = Output.of(Objects.requireNonNull(vpc));
            return this;
        }        public VpcPeeringConfigArgs build() {
            return new VpcPeeringConfigArgs(subnet, vpc);
        }
    }
}
