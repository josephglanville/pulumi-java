// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ClusterClusterConfigEncryptionConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigEncryptionConfigGetArgs Empty = new ClusterClusterConfigEncryptionConfigGetArgs();

    /**
     * The Cloud KMS key name to use for PD disk encryption for
     * all instances in the cluster.
     * 
     */
    @Import(name="kmsKeyName", required=true)
      private final Output<String> kmsKeyName;

    public Output<String> getKmsKeyName() {
        return this.kmsKeyName;
    }

    public ClusterClusterConfigEncryptionConfigGetArgs(Output<String> kmsKeyName) {
        this.kmsKeyName = Objects.requireNonNull(kmsKeyName, "expected parameter 'kmsKeyName' to be non-null");
    }

    private ClusterClusterConfigEncryptionConfigGetArgs() {
        this.kmsKeyName = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigEncryptionConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> kmsKeyName;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigEncryptionConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKeyName = defaults.kmsKeyName;
        }

        public Builder kmsKeyName(Output<String> kmsKeyName) {
            this.kmsKeyName = Objects.requireNonNull(kmsKeyName);
            return this;
        }
        public Builder kmsKeyName(String kmsKeyName) {
            this.kmsKeyName = Output.of(Objects.requireNonNull(kmsKeyName));
            return this;
        }        public ClusterClusterConfigEncryptionConfigGetArgs build() {
            return new ClusterClusterConfigEncryptionConfigGetArgs(kmsKeyName);
        }
    }
}
