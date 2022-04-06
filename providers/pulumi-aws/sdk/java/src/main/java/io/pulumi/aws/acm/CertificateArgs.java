// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.acm;

import io.pulumi.aws.acm.inputs.CertificateOptionsArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    /**
     * ARN of an ACM PCA
     * 
     */
    @Import(name="certificateAuthorityArn")
      private final @Nullable Output<String> certificateAuthorityArn;

    public Output<String> getCertificateAuthorityArn() {
        return this.certificateAuthorityArn == null ? Output.empty() : this.certificateAuthorityArn;
    }

    /**
     * The certificate's PEM-formatted public key
     * 
     */
    @Import(name="certificateBody")
      private final @Nullable Output<String> certificateBody;

    public Output<String> getCertificateBody() {
        return this.certificateBody == null ? Output.empty() : this.certificateBody;
    }

    /**
     * The certificate's PEM-formatted chain
     * * Creating a private CA issued certificate
     * 
     */
    @Import(name="certificateChain")
      private final @Nullable Output<String> certificateChain;

    public Output<String> getCertificateChain() {
        return this.certificateChain == null ? Output.empty() : this.certificateChain;
    }

    /**
     * A domain name for which the certificate should be issued
     * 
     */
    @Import(name="domainName")
      private final @Nullable Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName == null ? Output.empty() : this.domainName;
    }

    /**
     * Configuration block used to set certificate options. Detailed below.
     * * Importing an existing certificate
     * 
     */
    @Import(name="options")
      private final @Nullable Output<CertificateOptionsArgs> options;

    public Output<CertificateOptionsArgs> getOptions() {
        return this.options == null ? Output.empty() : this.options;
    }

    /**
     * The certificate's PEM-formatted private key
     * 
     */
    @Import(name="privateKey")
      private final @Nullable Output<String> privateKey;

    public Output<String> getPrivateKey() {
        return this.privateKey == null ? Output.empty() : this.privateKey;
    }

    /**
     * Set of domains that should be SANs in the issued certificate. To remove all elements of a previously configured list, set this value equal to an empty list (`[]`).
     * 
     */
    @Import(name="subjectAlternativeNames")
      private final @Nullable Output<List<String>> subjectAlternativeNames;

    public Output<List<String>> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames == null ? Output.empty() : this.subjectAlternativeNames;
    }

    /**
     * A map of tags to assign to the resource..
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    /**
     * Which method to use for validation. `DNS` or `EMAIL` are valid, `NONE` can be used for certificates that were imported into ACM and then into the provider.
     * 
     */
    @Import(name="validationMethod")
      private final @Nullable Output<String> validationMethod;

    public Output<String> getValidationMethod() {
        return this.validationMethod == null ? Output.empty() : this.validationMethod;
    }

    public CertificateArgs(
        @Nullable Output<String> certificateAuthorityArn,
        @Nullable Output<String> certificateBody,
        @Nullable Output<String> certificateChain,
        @Nullable Output<String> domainName,
        @Nullable Output<CertificateOptionsArgs> options,
        @Nullable Output<String> privateKey,
        @Nullable Output<List<String>> subjectAlternativeNames,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<String> validationMethod) {
        this.certificateAuthorityArn = certificateAuthorityArn;
        this.certificateBody = certificateBody;
        this.certificateChain = certificateChain;
        this.domainName = domainName;
        this.options = options;
        this.privateKey = privateKey;
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.tags = tags;
        this.validationMethod = validationMethod;
    }

    private CertificateArgs() {
        this.certificateAuthorityArn = Output.empty();
        this.certificateBody = Output.empty();
        this.certificateChain = Output.empty();
        this.domainName = Output.empty();
        this.options = Output.empty();
        this.privateKey = Output.empty();
        this.subjectAlternativeNames = Output.empty();
        this.tags = Output.empty();
        this.validationMethod = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificateAuthorityArn;
        private @Nullable Output<String> certificateBody;
        private @Nullable Output<String> certificateChain;
        private @Nullable Output<String> domainName;
        private @Nullable Output<CertificateOptionsArgs> options;
        private @Nullable Output<String> privateKey;
        private @Nullable Output<List<String>> subjectAlternativeNames;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<String> validationMethod;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthorityArn = defaults.certificateAuthorityArn;
    	      this.certificateBody = defaults.certificateBody;
    	      this.certificateChain = defaults.certificateChain;
    	      this.domainName = defaults.domainName;
    	      this.options = defaults.options;
    	      this.privateKey = defaults.privateKey;
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.tags = defaults.tags;
    	      this.validationMethod = defaults.validationMethod;
        }

        public Builder certificateAuthorityArn(@Nullable Output<String> certificateAuthorityArn) {
            this.certificateAuthorityArn = certificateAuthorityArn;
            return this;
        }
        public Builder certificateAuthorityArn(@Nullable String certificateAuthorityArn) {
            this.certificateAuthorityArn = Output.ofNullable(certificateAuthorityArn);
            return this;
        }
        public Builder certificateBody(@Nullable Output<String> certificateBody) {
            this.certificateBody = certificateBody;
            return this;
        }
        public Builder certificateBody(@Nullable String certificateBody) {
            this.certificateBody = Output.ofNullable(certificateBody);
            return this;
        }
        public Builder certificateChain(@Nullable Output<String> certificateChain) {
            this.certificateChain = certificateChain;
            return this;
        }
        public Builder certificateChain(@Nullable String certificateChain) {
            this.certificateChain = Output.ofNullable(certificateChain);
            return this;
        }
        public Builder domainName(@Nullable Output<String> domainName) {
            this.domainName = domainName;
            return this;
        }
        public Builder domainName(@Nullable String domainName) {
            this.domainName = Output.ofNullable(domainName);
            return this;
        }
        public Builder options(@Nullable Output<CertificateOptionsArgs> options) {
            this.options = options;
            return this;
        }
        public Builder options(@Nullable CertificateOptionsArgs options) {
            this.options = Output.ofNullable(options);
            return this;
        }
        public Builder privateKey(@Nullable Output<String> privateKey) {
            this.privateKey = privateKey;
            return this;
        }
        public Builder privateKey(@Nullable String privateKey) {
            this.privateKey = Output.ofNullable(privateKey);
            return this;
        }
        public Builder subjectAlternativeNames(@Nullable Output<List<String>> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        public Builder subjectAlternativeNames(@Nullable List<String> subjectAlternativeNames) {
            this.subjectAlternativeNames = Output.ofNullable(subjectAlternativeNames);
            return this;
        }
        public Builder subjectAlternativeNames(String... subjectAlternativeNames) {
            return subjectAlternativeNames(List.of(subjectAlternativeNames));
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder validationMethod(@Nullable Output<String> validationMethod) {
            this.validationMethod = validationMethod;
            return this;
        }
        public Builder validationMethod(@Nullable String validationMethod) {
            this.validationMethod = Output.ofNullable(validationMethod);
            return this;
        }        public CertificateArgs build() {
            return new CertificateArgs(certificateAuthorityArn, certificateBody, certificateChain, domainName, options, privateKey, subjectAlternativeNames, tags, validationMethod);
        }
    }
}