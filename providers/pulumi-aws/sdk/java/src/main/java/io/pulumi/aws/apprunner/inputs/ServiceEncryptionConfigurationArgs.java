// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class ServiceEncryptionConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceEncryptionConfigurationArgs Empty = new ServiceEncryptionConfigurationArgs();

    /**
     * The ARN of the KMS key used for encryption.
     * 
     */
    @Import(name="kmsKey", required=true)
      private final Output<String> kmsKey;

    public Output<String> getKmsKey() {
        return this.kmsKey;
    }

    public ServiceEncryptionConfigurationArgs(Output<String> kmsKey) {
        this.kmsKey = Objects.requireNonNull(kmsKey, "expected parameter 'kmsKey' to be non-null");
    }

    private ServiceEncryptionConfigurationArgs() {
        this.kmsKey = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceEncryptionConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> kmsKey;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceEncryptionConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.kmsKey = defaults.kmsKey;
        }

        public Builder kmsKey(Output<String> kmsKey) {
            this.kmsKey = Objects.requireNonNull(kmsKey);
            return this;
        }
        public Builder kmsKey(String kmsKey) {
            this.kmsKey = Output.of(Objects.requireNonNull(kmsKey));
            return this;
        }        public ServiceEncryptionConfigurationArgs build() {
            return new ServiceEncryptionConfigurationArgs(kmsKey);
        }
    }
}
