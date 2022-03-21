// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.ec2.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEnclaveCertificateIamRoleAssociationResult {
    /**
     * The name of the Amazon S3 bucket to which the certificate was uploaded.
     * 
     */
    private final @Nullable String certificateS3BucketName;
    /**
     * The Amazon S3 object key where the certificate, certificate chain, and encrypted private key bundle are stored.
     * 
     */
    private final @Nullable String certificateS3ObjectKey;
    /**
     * The ID of the AWS KMS CMK used to encrypt the private key of the certificate.
     * 
     */
    private final @Nullable String encryptionKmsKeyId;

    @CustomType.Constructor
    private GetEnclaveCertificateIamRoleAssociationResult(
        @CustomType.Parameter("certificateS3BucketName") @Nullable String certificateS3BucketName,
        @CustomType.Parameter("certificateS3ObjectKey") @Nullable String certificateS3ObjectKey,
        @CustomType.Parameter("encryptionKmsKeyId") @Nullable String encryptionKmsKeyId) {
        this.certificateS3BucketName = certificateS3BucketName;
        this.certificateS3ObjectKey = certificateS3ObjectKey;
        this.encryptionKmsKeyId = encryptionKmsKeyId;
    }

    /**
     * The name of the Amazon S3 bucket to which the certificate was uploaded.
     * 
    */
    public Optional<String> getCertificateS3BucketName() {
        return Optional.ofNullable(this.certificateS3BucketName);
    }
    /**
     * The Amazon S3 object key where the certificate, certificate chain, and encrypted private key bundle are stored.
     * 
    */
    public Optional<String> getCertificateS3ObjectKey() {
        return Optional.ofNullable(this.certificateS3ObjectKey);
    }
    /**
     * The ID of the AWS KMS CMK used to encrypt the private key of the certificate.
     * 
    */
    public Optional<String> getEncryptionKmsKeyId() {
        return Optional.ofNullable(this.encryptionKmsKeyId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEnclaveCertificateIamRoleAssociationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateS3BucketName;
        private @Nullable String certificateS3ObjectKey;
        private @Nullable String encryptionKmsKeyId;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEnclaveCertificateIamRoleAssociationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateS3BucketName = defaults.certificateS3BucketName;
    	      this.certificateS3ObjectKey = defaults.certificateS3ObjectKey;
    	      this.encryptionKmsKeyId = defaults.encryptionKmsKeyId;
        }

        public Builder certificateS3BucketName(@Nullable String certificateS3BucketName) {
            this.certificateS3BucketName = certificateS3BucketName;
            return this;
        }
        public Builder certificateS3ObjectKey(@Nullable String certificateS3ObjectKey) {
            this.certificateS3ObjectKey = certificateS3ObjectKey;
            return this;
        }
        public Builder encryptionKmsKeyId(@Nullable String encryptionKmsKeyId) {
            this.encryptionKmsKeyId = encryptionKmsKeyId;
            return this;
        }        public GetEnclaveCertificateIamRoleAssociationResult build() {
            return new GetEnclaveCertificateIamRoleAssociationResult(certificateS3BucketName, certificateS3ObjectKey, encryptionKmsKeyId);
        }
    }
}
