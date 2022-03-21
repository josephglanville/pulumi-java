// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.datastream_v1alpha1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * The VPC Peering configuration is used to create VPC peering between Datastream and the consumer's VPC.
 * 
 */
public final class VpcPeeringConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final VpcPeeringConfigResponse Empty = new VpcPeeringConfigResponse();

    /**
     * A free subnet for peering. (CIDR of /29) TODO(b/172995841) add validators.
     * 
     */
    @Import(name="subnet", required=true)
      private final String subnet;

    public String getSubnet() {
        return this.subnet;
    }

    /**
     * fully qualified name of the VPC Datastream will peer to.
     * 
     */
    @Import(name="vpcName", required=true)
      private final String vpcName;

    public String getVpcName() {
        return this.vpcName;
    }

    public VpcPeeringConfigResponse(
        String subnet,
        String vpcName) {
        this.subnet = Objects.requireNonNull(subnet, "expected parameter 'subnet' to be non-null");
        this.vpcName = Objects.requireNonNull(vpcName, "expected parameter 'vpcName' to be non-null");
    }

    private VpcPeeringConfigResponse() {
        this.subnet = null;
        this.vpcName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VpcPeeringConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String subnet;
        private String vpcName;

        public Builder() {
    	      // Empty
        }

        public Builder(VpcPeeringConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.subnet = defaults.subnet;
    	      this.vpcName = defaults.vpcName;
        }

        public Builder subnet(String subnet) {
            this.subnet = Objects.requireNonNull(subnet);
            return this;
        }
        public Builder vpcName(String vpcName) {
            this.vpcName = Objects.requireNonNull(vpcName);
            return this;
        }        public VpcPeeringConfigResponse build() {
            return new VpcPeeringConfigResponse(subnet, vpcName);
        }
    }
}
