// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ec2;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CarrierGatewayArgs extends io.pulumi.resources.ResourceArgs {

    public static final CarrierGatewayArgs Empty = new CarrierGatewayArgs();

    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * The ID of the VPC to associate with the carrier gateway.
     * 
     */
    @Import(name="vpcId", required=true)
      private final Output<String> vpcId;

    public Output<String> getVpcId() {
        return this.vpcId;
    }

    public CarrierGatewayArgs(
        @Nullable Output<Map<String,String>> tags,
        Output<String> vpcId) {
        this.tags = tags;
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private CarrierGatewayArgs() {
        this.tags = Output.empty();
        this.vpcId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CarrierGatewayArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Map<String,String>> tags;
        private Output<String> vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(CarrierGatewayArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder vpcId(Output<String> vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public Builder vpcId(String vpcId) {
            this.vpcId = Output.of(Objects.requireNonNull(vpcId));
            return this;
        }        public CarrierGatewayArgs build() {
            return new CarrierGatewayArgs(tags, vpcId);
        }
    }
}
