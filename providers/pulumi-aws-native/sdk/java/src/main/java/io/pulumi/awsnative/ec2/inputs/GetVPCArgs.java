// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetVPCArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetVPCArgs Empty = new GetVPCArgs();

    /**
     * The Id for the model.
     * 
     */
    @InputImport(name="vpcId", required=true)
      private final String vpcId;

    public String getVpcId() {
        return this.vpcId;
    }

    public GetVPCArgs(String vpcId) {
        this.vpcId = Objects.requireNonNull(vpcId, "expected parameter 'vpcId' to be non-null");
    }

    private GetVPCArgs() {
        this.vpcId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetVPCArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String vpcId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetVPCArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.vpcId = defaults.vpcId;
        }

        public Builder setVpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetVPCArgs build() {
            return new GetVPCArgs(vpcId);
        }
    }
}
