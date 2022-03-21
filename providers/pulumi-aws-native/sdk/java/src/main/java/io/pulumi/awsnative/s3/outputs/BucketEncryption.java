// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.s3.outputs;

import io.pulumi.awsnative.s3.outputs.BucketServerSideEncryptionRule;
import io.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;

@CustomType
public final class BucketEncryption {
    /**
     * Specifies the default server-side-encryption configuration.
     * 
     */
    private final List<BucketServerSideEncryptionRule> serverSideEncryptionConfiguration;

    @CustomType.Constructor
    private BucketEncryption(@CustomType.Parameter("serverSideEncryptionConfiguration") List<BucketServerSideEncryptionRule> serverSideEncryptionConfiguration) {
        this.serverSideEncryptionConfiguration = serverSideEncryptionConfiguration;
    }

    /**
     * Specifies the default server-side-encryption configuration.
     * 
    */
    public List<BucketServerSideEncryptionRule> getServerSideEncryptionConfiguration() {
        return this.serverSideEncryptionConfiguration;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BucketEncryption defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<BucketServerSideEncryptionRule> serverSideEncryptionConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(BucketEncryption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.serverSideEncryptionConfiguration = defaults.serverSideEncryptionConfiguration;
        }

        public Builder serverSideEncryptionConfiguration(List<BucketServerSideEncryptionRule> serverSideEncryptionConfiguration) {
            this.serverSideEncryptionConfiguration = Objects.requireNonNull(serverSideEncryptionConfiguration);
            return this;
        }
        public Builder serverSideEncryptionConfiguration(BucketServerSideEncryptionRule... serverSideEncryptionConfiguration) {
            return serverSideEncryptionConfiguration(List.of(serverSideEncryptionConfiguration));
        }        public BucketEncryption build() {
            return new BucketEncryption(serverSideEncryptionConfiguration);
        }
    }
}
