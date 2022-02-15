// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.kinesisfirehose.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class DeliveryStreamKMSEncryptionConfig extends io.pulumi.resources.InvokeArgs {

    public static final DeliveryStreamKMSEncryptionConfig Empty = new DeliveryStreamKMSEncryptionConfig();

    @InputImport(name="aWSKMSKeyARN", required=true)
    private final String aWSKMSKeyARN;

    public String getAWSKMSKeyARN() {
        return this.aWSKMSKeyARN;
    }

    public DeliveryStreamKMSEncryptionConfig(String aWSKMSKeyARN) {
        this.aWSKMSKeyARN = Objects.requireNonNull(aWSKMSKeyARN, "expected parameter 'aWSKMSKeyARN' to be non-null");
    }

    private DeliveryStreamKMSEncryptionConfig() {
        this.aWSKMSKeyARN = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeliveryStreamKMSEncryptionConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String aWSKMSKeyARN;

        public Builder() {
    	      // Empty
        }

        public Builder(DeliveryStreamKMSEncryptionConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.aWSKMSKeyARN = defaults.aWSKMSKeyARN;
        }

        public Builder setAWSKMSKeyARN(String aWSKMSKeyARN) {
            this.aWSKMSKeyARN = Objects.requireNonNull(aWSKMSKeyARN);
            return this;
        }

        public DeliveryStreamKMSEncryptionConfig build() {
            return new DeliveryStreamKMSEncryptionConfig(aWSKMSKeyARN);
        }
    }
}