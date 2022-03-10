// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acmpca.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetCertificateResult {
    private final String arn;
    /**
     * The PEM-encoded certificate value.
     * 
     */
    private final String certificate;
    private final String certificateAuthorityArn;
    /**
     * The PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA.
     * 
     */
    private final String certificateChain;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;

    @OutputCustomType.Constructor
    private GetCertificateResult(
        @OutputCustomType.Parameter("arn") String arn,
        @OutputCustomType.Parameter("certificate") String certificate,
        @OutputCustomType.Parameter("certificateAuthorityArn") String certificateAuthorityArn,
        @OutputCustomType.Parameter("certificateChain") String certificateChain,
        @OutputCustomType.Parameter("id") String id) {
        this.arn = arn;
        this.certificate = certificate;
        this.certificateAuthorityArn = certificateAuthorityArn;
        this.certificateChain = certificateChain;
        this.id = id;
    }

    public String getArn() {
        return this.arn;
    }
    /**
     * The PEM-encoded certificate value.
     * 
    */
    public String getCertificate() {
        return this.certificate;
    }
    public String getCertificateAuthorityArn() {
        return this.certificateAuthorityArn;
    }
    /**
     * The PEM-encoded certificate chain that includes any intermediate certificates and chains up to root CA.
     * 
    */
    public String getCertificateChain() {
        return this.certificateChain;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
    */
    public String getId() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCertificateResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;
        private String certificate;
        private String certificateAuthorityArn;
        private String certificateChain;
        private String id;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCertificateResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.certificate = defaults.certificate;
    	      this.certificateAuthorityArn = defaults.certificateAuthorityArn;
    	      this.certificateChain = defaults.certificateChain;
    	      this.id = defaults.id;
        }

        public Builder setArn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }

        public Builder setCertificate(String certificate) {
            this.certificate = Objects.requireNonNull(certificate);
            return this;
        }

        public Builder setCertificateAuthorityArn(String certificateAuthorityArn) {
            this.certificateAuthorityArn = Objects.requireNonNull(certificateAuthorityArn);
            return this;
        }

        public Builder setCertificateChain(String certificateChain) {
            this.certificateChain = Objects.requireNonNull(certificateChain);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetCertificateResult build() {
            return new GetCertificateResult(arn, certificate, certificateAuthorityArn, certificateChain, id);
        }
    }
}
