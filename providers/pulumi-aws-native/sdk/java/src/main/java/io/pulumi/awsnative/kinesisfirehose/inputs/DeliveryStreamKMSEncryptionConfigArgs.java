// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DeliveryStreamKMSEncryptionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final DeliveryStreamKMSEncryptionConfigArgs Empty = new DeliveryStreamKMSEncryptionConfigArgs();

    @InputImport(name="aWSKMSKeyARN", required=true)
      private final Input<String> aWSKMSKeyARN;

    public Input<String> getAWSKMSKeyARN() {
        return this.aWSKMSKeyARN;
    }

    public DeliveryStreamKMSEncryptionConfigArgs(Input<String> aWSKMSKeyARN) {
        this.aWSKMSKeyARN = Objects.requireNonNull(aWSKMSKeyARN, "expected parameter 'aWSKMSKeyARN' to be non-null");
    }

    private DeliveryStreamKMSEncryptionConfigArgs() {
        this.aWSKMSKeyARN = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamKMSEncryptionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> aWSKMSKeyARN;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamKMSEncryptionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aWSKMSKeyARN = defaults.aWSKMSKeyARN;
        }

        public Builder setAWSKMSKeyARN(Input<String> aWSKMSKeyARN) {
            this.aWSKMSKeyARN = Objects.requireNonNull(aWSKMSKeyARN);
            return this;
        }

        public Builder setAWSKMSKeyARN(String aWSKMSKeyARN) {
            this.aWSKMSKeyARN = Input.of(Objects.requireNonNull(aWSKMSKeyARN));
            return this;
        }
        public DeliveryStreamKMSEncryptionConfigArgs build() {
            return new DeliveryStreamKMSEncryptionConfigArgs(aWSKMSKeyARN);
        }
    }
}
