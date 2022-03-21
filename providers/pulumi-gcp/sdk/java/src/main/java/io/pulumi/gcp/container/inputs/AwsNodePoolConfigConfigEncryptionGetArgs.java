// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.container.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AwsNodePoolConfigConfigEncryptionGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final AwsNodePoolConfigConfigEncryptionGetArgs Empty = new AwsNodePoolConfigConfigEncryptionGetArgs();

    /**
     * Optional. The Amazon Resource Name (ARN) of the Customer Managed Key (CMK) used to encrypt AWS EBS volumes. If not specified, the default Amazon managed key associated to the AWS region where this cluster runs will be used.
     * 
     */
    @Import(name="kmsKeyArn", required=true)
      private final Output<String> kmsKeyArn;

    public Output<String> getKmsKeyArn() {
        return this.kmsKeyArn;
    }

    public AwsNodePoolConfigConfigEncryptionGetArgs(Output<String> kmsKeyArn) {
        this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn, "expected parameter 'kmsKeyArn' to be non-null");
    }

    private AwsNodePoolConfigConfigEncryptionGetArgs() {
        this.kmsKeyArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsNodePoolConfigConfigEncryptionGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> kmsKeyArn;

        public Builder() {
    	      // Empty
        }

        public Builder(AwsNodePoolConfigConfigEncryptionGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyArn = defaults.kmsKeyArn;
        }

        public Builder kmsKeyArn(Output<String> kmsKeyArn) {
            this.kmsKeyArn = Objects.requireNonNull(kmsKeyArn);
            return this;
        }
        public Builder kmsKeyArn(String kmsKeyArn) {
            this.kmsKeyArn = Output.of(Objects.requireNonNull(kmsKeyArn));
            return this;
        }        public AwsNodePoolConfigConfigEncryptionGetArgs build() {
            return new AwsNodePoolConfigConfigEncryptionGetArgs(kmsKeyArn);
        }
    }
}
