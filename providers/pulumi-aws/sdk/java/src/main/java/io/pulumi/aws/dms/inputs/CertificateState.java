// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.dms.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateState extends io.pulumi.resources.ResourceArgs {

    public static final CertificateState Empty = new CertificateState();

    /**
     * The Amazon Resource Name (ARN) for the certificate.
     * 
     */
    @Import(name="certificateArn")
      private final @Nullable Output<String> certificateArn;

    public Output<String> getCertificateArn() {
        return this.certificateArn == null ? Output.empty() : this.certificateArn;
    }

    /**
     * The certificate identifier.
     * 
     */
    @Import(name="certificateId")
      private final @Nullable Output<String> certificateId;

    public Output<String> getCertificateId() {
        return this.certificateId == null ? Output.empty() : this.certificateId;
    }

    /**
     * The contents of the .pem X.509 certificate file for the certificate. Either `certificate_pem` or `certificate_wallet` must be set.
     * 
     */
    @Import(name="certificatePem")
      private final @Nullable Output<String> certificatePem;

    public Output<String> getCertificatePem() {
        return this.certificatePem == null ? Output.empty() : this.certificatePem;
    }

    /**
     * The contents of the Oracle Wallet certificate for use with SSL, provided as a base64-encoded String. Either `certificate_pem` or `certificate_wallet` must be set.
     * 
     */
    @Import(name="certificateWallet")
      private final @Nullable Output<String> certificateWallet;

    public Output<String> getCertificateWallet() {
        return this.certificateWallet == null ? Output.empty() : this.certificateWallet;
    }

    /**
     * A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * A map of tags assigned to the resource, including those inherited from the provider .
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    public CertificateState(
        @Nullable Output<String> certificateArn,
        @Nullable Output<String> certificateId,
        @Nullable Output<String> certificatePem,
        @Nullable Output<String> certificateWallet,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll) {
        this.certificateArn = certificateArn;
        this.certificateId = certificateId;
        this.certificatePem = certificatePem;
        this.certificateWallet = certificateWallet;
        this.tags = tags;
        this.tagsAll = tagsAll;
    }

    private CertificateState() {
        this.certificateArn = Output.empty();
        this.certificateId = Output.empty();
        this.certificatePem = Output.empty();
        this.certificateWallet = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificateArn;
        private @Nullable Output<String> certificateId;
        private @Nullable Output<String> certificatePem;
        private @Nullable Output<String> certificateWallet;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateArn = defaults.certificateArn;
    	      this.certificateId = defaults.certificateId;
    	      this.certificatePem = defaults.certificatePem;
    	      this.certificateWallet = defaults.certificateWallet;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
        }

        public Builder certificateArn(@Nullable Output<String> certificateArn) {
            this.certificateArn = certificateArn;
            return this;
        }
        public Builder certificateArn(@Nullable String certificateArn) {
            this.certificateArn = Output.ofNullable(certificateArn);
            return this;
        }
        public Builder certificateId(@Nullable Output<String> certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public Builder certificateId(@Nullable String certificateId) {
            this.certificateId = Output.ofNullable(certificateId);
            return this;
        }
        public Builder certificatePem(@Nullable Output<String> certificatePem) {
            this.certificatePem = certificatePem;
            return this;
        }
        public Builder certificatePem(@Nullable String certificatePem) {
            this.certificatePem = Output.ofNullable(certificatePem);
            return this;
        }
        public Builder certificateWallet(@Nullable Output<String> certificateWallet) {
            this.certificateWallet = certificateWallet;
            return this;
        }
        public Builder certificateWallet(@Nullable String certificateWallet) {
            this.certificateWallet = Output.ofNullable(certificateWallet);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }        public CertificateState build() {
            return new CertificateState(certificateArn, certificateId, certificatePem, certificateWallet, tags, tagsAll);
        }
    }
}