// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acmpca.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateAuthorityRevocationConfigurationCrlConfigurationGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateAuthorityRevocationConfigurationCrlConfigurationGetArgs Empty = new CertificateAuthorityRevocationConfigurationCrlConfigurationGetArgs();

    /**
     * Name inserted into the certificate CRL Distribution Points extension that enables the use of an alias for the CRL distribution point. Use this value if you don't want the name of your S3 bucket to be public. Must be less than or equal to 253 characters in length.
     * 
     */
    @Import(name="customCname")
      private final @Nullable Output<String> customCname;

    public Output<String> getCustomCname() {
        return this.customCname == null ? Output.empty() : this.customCname;
    }

    /**
     * Boolean value that specifies whether certificate revocation lists (CRLs) are enabled. Defaults to `false`.
     * 
     */
    @Import(name="enabled")
      private final @Nullable Output<Boolean> enabled;

    public Output<Boolean> getEnabled() {
        return this.enabled == null ? Output.empty() : this.enabled;
    }

    /**
     * Number of days until a certificate expires. Must be between 1 and 5000.
     * 
     */
    @Import(name="expirationInDays", required=true)
      private final Output<Integer> expirationInDays;

    public Output<Integer> getExpirationInDays() {
        return this.expirationInDays;
    }

    /**
     * Name of the S3 bucket that contains the CRL. If you do not provide a value for the `custom_cname` argument, the name of your S3 bucket is placed into the CRL Distribution Points extension of the issued certificate. You must specify a bucket policy that allows ACM PCA to write the CRL to your bucket. Must be less than or equal to 255 characters in length.
     * 
     */
    @Import(name="s3BucketName")
      private final @Nullable Output<String> s3BucketName;

    public Output<String> getS3BucketName() {
        return this.s3BucketName == null ? Output.empty() : this.s3BucketName;
    }

    /**
     * Determines whether the CRL will be publicly readable or privately held in the CRL Amazon S3 bucket. Defaults to `PUBLIC_READ`.
     * 
     */
    @Import(name="s3ObjectAcl")
      private final @Nullable Output<String> s3ObjectAcl;

    public Output<String> getS3ObjectAcl() {
        return this.s3ObjectAcl == null ? Output.empty() : this.s3ObjectAcl;
    }

    public CertificateAuthorityRevocationConfigurationCrlConfigurationGetArgs(
        @Nullable Output<String> customCname,
        @Nullable Output<Boolean> enabled,
        Output<Integer> expirationInDays,
        @Nullable Output<String> s3BucketName,
        @Nullable Output<String> s3ObjectAcl) {
        this.customCname = customCname;
        this.enabled = enabled;
        this.expirationInDays = Objects.requireNonNull(expirationInDays, "expected parameter 'expirationInDays' to be non-null");
        this.s3BucketName = s3BucketName;
        this.s3ObjectAcl = s3ObjectAcl;
    }

    private CertificateAuthorityRevocationConfigurationCrlConfigurationGetArgs() {
        this.customCname = Output.empty();
        this.enabled = Output.empty();
        this.expirationInDays = Output.empty();
        this.s3BucketName = Output.empty();
        this.s3ObjectAcl = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateAuthorityRevocationConfigurationCrlConfigurationGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> customCname;
        private @Nullable Output<Boolean> enabled;
        private Output<Integer> expirationInDays;
        private @Nullable Output<String> s3BucketName;
        private @Nullable Output<String> s3ObjectAcl;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateAuthorityRevocationConfigurationCrlConfigurationGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customCname = defaults.customCname;
    	      this.enabled = defaults.enabled;
    	      this.expirationInDays = defaults.expirationInDays;
    	      this.s3BucketName = defaults.s3BucketName;
    	      this.s3ObjectAcl = defaults.s3ObjectAcl;
        }

        public Builder customCname(@Nullable Output<String> customCname) {
            this.customCname = customCname;
            return this;
        }
        public Builder customCname(@Nullable String customCname) {
            this.customCname = Output.ofNullable(customCname);
            return this;
        }
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            this.enabled = enabled;
            return this;
        }
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = Output.ofNullable(enabled);
            return this;
        }
        public Builder expirationInDays(Output<Integer> expirationInDays) {
            this.expirationInDays = Objects.requireNonNull(expirationInDays);
            return this;
        }
        public Builder expirationInDays(Integer expirationInDays) {
            this.expirationInDays = Output.of(Objects.requireNonNull(expirationInDays));
            return this;
        }
        public Builder s3BucketName(@Nullable Output<String> s3BucketName) {
            this.s3BucketName = s3BucketName;
            return this;
        }
        public Builder s3BucketName(@Nullable String s3BucketName) {
            this.s3BucketName = Output.ofNullable(s3BucketName);
            return this;
        }
        public Builder s3ObjectAcl(@Nullable Output<String> s3ObjectAcl) {
            this.s3ObjectAcl = s3ObjectAcl;
            return this;
        }
        public Builder s3ObjectAcl(@Nullable String s3ObjectAcl) {
            this.s3ObjectAcl = Output.ofNullable(s3ObjectAcl);
            return this;
        }        public CertificateAuthorityRevocationConfigurationCrlConfigurationGetArgs build() {
            return new CertificateAuthorityRevocationConfigurationCrlConfigurationGetArgs(customCname, enabled, expirationInDays, s3BucketName, s3ObjectAcl);
        }
    }
}
