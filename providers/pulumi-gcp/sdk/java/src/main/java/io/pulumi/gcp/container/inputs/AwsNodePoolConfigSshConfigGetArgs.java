// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class AwsNodePoolConfigSshConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsNodePoolConfigSshConfigGetArgs Empty = new AwsNodePoolConfigSshConfigGetArgs();

    /**
     * Required. The name of the EC2 key pair used to login into cluster machines.
     * 
     */
    @Import(name="ec2KeyPair", required=true)
      private final Output<String> ec2KeyPair;

    public Output<String> getEc2KeyPair() {
        return this.ec2KeyPair;
    }

    public AwsNodePoolConfigSshConfigGetArgs(Output<String> ec2KeyPair) {
        this.ec2KeyPair = Objects.requireNonNull(ec2KeyPair, "expected parameter 'ec2KeyPair' to be non-null");
    }

    private AwsNodePoolConfigSshConfigGetArgs() {
        this.ec2KeyPair = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsNodePoolConfigSshConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> ec2KeyPair;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsNodePoolConfigSshConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ec2KeyPair = defaults.ec2KeyPair;
        }

        public Builder ec2KeyPair(Output<String> ec2KeyPair) {
            this.ec2KeyPair = Objects.requireNonNull(ec2KeyPair);
            return this;
        }
        public Builder ec2KeyPair(String ec2KeyPair) {
            this.ec2KeyPair = Output.of(Objects.requireNonNull(ec2KeyPair));
            return this;
        }        public AwsNodePoolConfigSshConfigGetArgs build() {
            return new AwsNodePoolConfigSshConfigGetArgs(ec2KeyPair);
        }
    }
}
