// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2.inputs;

import io.pulumi.aws.ec2.inputs.PeeringConnectionOptionsAccepterGetArgs;
import io.pulumi.aws.ec2.inputs.PeeringConnectionOptionsRequesterGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class PeeringConnectionOptionsState extends io.pulumi.resources.ResourceArgs {

    public static final PeeringConnectionOptionsState Empty = new PeeringConnectionOptionsState();

    /**
     * An optional configuration block that allows for [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that accepts
     * the peering connection (a maximum of one).
     * 
     */
    @Import(name="accepter")
      private final @Nullable Output<PeeringConnectionOptionsAccepterGetArgs> accepter;

    public Output<PeeringConnectionOptionsAccepterGetArgs> getAccepter() {
        return this.accepter == null ? Output.empty() : this.accepter;
    }

    /**
     * A optional configuration block that allows for [VPC Peering Connection]
     * (https://docs.aws.amazon.com/vpc/latest/peering/what-is-vpc-peering.html) options to be set for the VPC that requests
     * the peering connection (a maximum of one).
     * 
     */
    @Import(name="requester")
      private final @Nullable Output<PeeringConnectionOptionsRequesterGetArgs> requester;

    public Output<PeeringConnectionOptionsRequesterGetArgs> getRequester() {
        return this.requester == null ? Output.empty() : this.requester;
    }

    /**
     * The ID of the requester VPC peering connection.
     * 
     */
    @Import(name="vpcPeeringConnectionId")
      private final @Nullable Output<String> vpcPeeringConnectionId;

    public Output<String> getVpcPeeringConnectionId() {
        return this.vpcPeeringConnectionId == null ? Output.empty() : this.vpcPeeringConnectionId;
    }

    public PeeringConnectionOptionsState(
        @Nullable Output<PeeringConnectionOptionsAccepterGetArgs> accepter,
        @Nullable Output<PeeringConnectionOptionsRequesterGetArgs> requester,
        @Nullable Output<String> vpcPeeringConnectionId) {
        this.accepter = accepter;
        this.requester = requester;
        this.vpcPeeringConnectionId = vpcPeeringConnectionId;
    }

    private PeeringConnectionOptionsState() {
        this.accepter = Output.empty();
        this.requester = Output.empty();
        this.vpcPeeringConnectionId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PeeringConnectionOptionsState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<PeeringConnectionOptionsAccepterGetArgs> accepter;
        private @Nullable Output<PeeringConnectionOptionsRequesterGetArgs> requester;
        private @Nullable Output<String> vpcPeeringConnectionId;

        public Builder() {
    	      // Empty
        }

        public Builder(PeeringConnectionOptionsState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accepter = defaults.accepter;
    	      this.requester = defaults.requester;
    	      this.vpcPeeringConnectionId = defaults.vpcPeeringConnectionId;
        }

        public Builder accepter(@Nullable Output<PeeringConnectionOptionsAccepterGetArgs> accepter) {
            this.accepter = accepter;
            return this;
        }
        public Builder accepter(@Nullable PeeringConnectionOptionsAccepterGetArgs accepter) {
            this.accepter = Output.ofNullable(accepter);
            return this;
        }
        public Builder requester(@Nullable Output<PeeringConnectionOptionsRequesterGetArgs> requester) {
            this.requester = requester;
            return this;
        }
        public Builder requester(@Nullable PeeringConnectionOptionsRequesterGetArgs requester) {
            this.requester = Output.ofNullable(requester);
            return this;
        }
        public Builder vpcPeeringConnectionId(@Nullable Output<String> vpcPeeringConnectionId) {
            this.vpcPeeringConnectionId = vpcPeeringConnectionId;
            return this;
        }
        public Builder vpcPeeringConnectionId(@Nullable String vpcPeeringConnectionId) {
            this.vpcPeeringConnectionId = Output.ofNullable(vpcPeeringConnectionId);
            return this;
        }        public PeeringConnectionOptionsState build() {
            return new PeeringConnectionOptionsState(accepter, requester, vpcPeeringConnectionId);
        }
    }
}