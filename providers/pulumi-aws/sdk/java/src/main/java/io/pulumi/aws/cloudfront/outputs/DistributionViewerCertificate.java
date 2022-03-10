// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudfront.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DistributionViewerCertificate {
    /**
     * The ARN of the [AWS Certificate Manager](https://aws.amazon.com/certificate-manager/)
     * certificate that you wish to use with this distribution. Specify this,
     * `cloudfront_default_certificate`, or `iam_certificate_id`.  The ACM
     * certificate must be in  US-EAST-1.
     * 
     */
    private final @Nullable String acmCertificateArn;
    /**
     * `true` if you want viewers to use HTTPS
     * to request your objects and you're using the CloudFront domain name for your
     * distribution. Specify this, `acm_certificate_arn`, or `iam_certificate_id`.
     * 
     */
    private final @Nullable Boolean cloudfrontDefaultCertificate;
    /**
     * The IAM certificate identifier of the custom viewer
     * certificate for this distribution if you are using a custom domain. Specify
     * this, `acm_certificate_arn`, or `cloudfront_default_certificate`.
     * 
     */
    private final @Nullable String iamCertificateId;
    /**
     * The minimum version of the SSL protocol that
     * you want CloudFront to use for HTTPS connections. Can only be set if
     * `cloudfront_default_certificate = false`. See all possible values in
     * [this](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html)
     * table under "Security policy." Some examples include: `TLSv1.2_2019` and
     * `TLSv1.2_2021`. Default: `TLSv1`. **NOTE**:
     * If you are using a custom certificate (specified with `acm_certificate_arn`
     * or `iam_certificate_id`), and have specified `sni-only` in
     * `ssl_support_method`, `TLSv1` or later must be specified. If you have
     * specified `vip` in `ssl_support_method`, only `SSLv3` or `TLSv1` can be
     * specified. If you have specified `cloudfront_default_certificate`, `TLSv1`
     * must be specified.
     * 
     */
    private final @Nullable String minimumProtocolVersion;
    private final @Nullable String sslSupportMethod;

    @OutputCustomType.Constructor
    private DistributionViewerCertificate(
        @OutputCustomType.Parameter("acmCertificateArn") @Nullable String acmCertificateArn,
        @OutputCustomType.Parameter("cloudfrontDefaultCertificate") @Nullable Boolean cloudfrontDefaultCertificate,
        @OutputCustomType.Parameter("iamCertificateId") @Nullable String iamCertificateId,
        @OutputCustomType.Parameter("minimumProtocolVersion") @Nullable String minimumProtocolVersion,
        @OutputCustomType.Parameter("sslSupportMethod") @Nullable String sslSupportMethod) {
        this.acmCertificateArn = acmCertificateArn;
        this.cloudfrontDefaultCertificate = cloudfrontDefaultCertificate;
        this.iamCertificateId = iamCertificateId;
        this.minimumProtocolVersion = minimumProtocolVersion;
        this.sslSupportMethod = sslSupportMethod;
    }

    /**
     * The ARN of the [AWS Certificate Manager](https://aws.amazon.com/certificate-manager/)
     * certificate that you wish to use with this distribution. Specify this,
     * `cloudfront_default_certificate`, or `iam_certificate_id`.  The ACM
     * certificate must be in  US-EAST-1.
     * 
    */
    public Optional<String> getAcmCertificateArn() {
        return Optional.ofNullable(this.acmCertificateArn);
    }
    /**
     * `true` if you want viewers to use HTTPS
     * to request your objects and you're using the CloudFront domain name for your
     * distribution. Specify this, `acm_certificate_arn`, or `iam_certificate_id`.
     * 
    */
    public Optional<Boolean> getCloudfrontDefaultCertificate() {
        return Optional.ofNullable(this.cloudfrontDefaultCertificate);
    }
    /**
     * The IAM certificate identifier of the custom viewer
     * certificate for this distribution if you are using a custom domain. Specify
     * this, `acm_certificate_arn`, or `cloudfront_default_certificate`.
     * 
    */
    public Optional<String> getIamCertificateId() {
        return Optional.ofNullable(this.iamCertificateId);
    }
    /**
     * The minimum version of the SSL protocol that
     * you want CloudFront to use for HTTPS connections. Can only be set if
     * `cloudfront_default_certificate = false`. See all possible values in
     * [this](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/secure-connections-supported-viewer-protocols-ciphers.html)
     * table under "Security policy." Some examples include: `TLSv1.2_2019` and
     * `TLSv1.2_2021`. Default: `TLSv1`. **NOTE**:
     * If you are using a custom certificate (specified with `acm_certificate_arn`
     * or `iam_certificate_id`), and have specified `sni-only` in
     * `ssl_support_method`, `TLSv1` or later must be specified. If you have
     * specified `vip` in `ssl_support_method`, only `SSLv3` or `TLSv1` can be
     * specified. If you have specified `cloudfront_default_certificate`, `TLSv1`
     * must be specified.
     * 
    */
    public Optional<String> getMinimumProtocolVersion() {
        return Optional.ofNullable(this.minimumProtocolVersion);
    }
    public Optional<String> getSslSupportMethod() {
        return Optional.ofNullable(this.sslSupportMethod);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionViewerCertificate defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String acmCertificateArn;
        private @Nullable Boolean cloudfrontDefaultCertificate;
        private @Nullable String iamCertificateId;
        private @Nullable String minimumProtocolVersion;
        private @Nullable String sslSupportMethod;

        public Builder() {
    	      // Empty
        }

        public Builder(DistributionViewerCertificate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acmCertificateArn = defaults.acmCertificateArn;
    	      this.cloudfrontDefaultCertificate = defaults.cloudfrontDefaultCertificate;
    	      this.iamCertificateId = defaults.iamCertificateId;
    	      this.minimumProtocolVersion = defaults.minimumProtocolVersion;
    	      this.sslSupportMethod = defaults.sslSupportMethod;
        }

        public Builder setAcmCertificateArn(@Nullable String acmCertificateArn) {
            this.acmCertificateArn = acmCertificateArn;
            return this;
        }

        public Builder setCloudfrontDefaultCertificate(@Nullable Boolean cloudfrontDefaultCertificate) {
            this.cloudfrontDefaultCertificate = cloudfrontDefaultCertificate;
            return this;
        }

        public Builder setIamCertificateId(@Nullable String iamCertificateId) {
            this.iamCertificateId = iamCertificateId;
            return this;
        }

        public Builder setMinimumProtocolVersion(@Nullable String minimumProtocolVersion) {
            this.minimumProtocolVersion = minimumProtocolVersion;
            return this;
        }

        public Builder setSslSupportMethod(@Nullable String sslSupportMethod) {
            this.sslSupportMethod = sslSupportMethod;
            return this;
        }
        public DistributionViewerCertificate build() {
            return new DistributionViewerCertificate(acmCertificateArn, cloudfrontDefaultCertificate, iamCertificateId, minimumProtocolVersion, sslSupportMethod);
        }
    }
}
