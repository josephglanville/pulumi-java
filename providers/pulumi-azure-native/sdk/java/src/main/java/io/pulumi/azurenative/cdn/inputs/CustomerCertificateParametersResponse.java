// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cdn.inputs;

import io.pulumi.azurenative.cdn.inputs.ResourceReferenceResponse;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Customer Certificate used for https
 * 
 */
public final class CustomerCertificateParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final CustomerCertificateParametersResponse Empty = new CustomerCertificateParametersResponse();

    /**
     * Certificate issuing authority.
     * 
     */
    @Import(name="certificateAuthority")
      private final @Nullable String certificateAuthority;

    public Optional<String> getCertificateAuthority() {
        return this.certificateAuthority == null ? Optional.empty() : Optional.ofNullable(this.certificateAuthority);
    }

    /**
     * Resource reference to the KV secret
     * 
     */
    @Import(name="secretSource", required=true)
      private final ResourceReferenceResponse secretSource;

    public ResourceReferenceResponse getSecretSource() {
        return this.secretSource;
    }

    /**
     * Version of the secret to be used
     * 
     */
    @Import(name="secretVersion")
      private final @Nullable String secretVersion;

    public Optional<String> getSecretVersion() {
        return this.secretVersion == null ? Optional.empty() : Optional.ofNullable(this.secretVersion);
    }

    /**
     * The list of SANs.
     * 
     */
    @Import(name="subjectAlternativeNames")
      private final @Nullable List<String> subjectAlternativeNames;

    public List<String> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames == null ? List.of() : this.subjectAlternativeNames;
    }

    /**
     * The type of the Secret to create.
     * Expected value is 'CustomerCertificate'.
     * 
     */
    @Import(name="type", required=true)
      private final String type;

    public String getType() {
        return this.type;
    }

    /**
     * Whether to use the latest version for the certificate
     * 
     */
    @Import(name="useLatestVersion")
      private final @Nullable Boolean useLatestVersion;

    public Optional<Boolean> getUseLatestVersion() {
        return this.useLatestVersion == null ? Optional.empty() : Optional.ofNullable(this.useLatestVersion);
    }

    public CustomerCertificateParametersResponse(
        @Nullable String certificateAuthority,
        ResourceReferenceResponse secretSource,
        @Nullable String secretVersion,
        @Nullable List<String> subjectAlternativeNames,
        String type,
        @Nullable Boolean useLatestVersion) {
        this.certificateAuthority = certificateAuthority;
        this.secretSource = Objects.requireNonNull(secretSource, "expected parameter 'secretSource' to be non-null");
        this.secretVersion = secretVersion;
        this.subjectAlternativeNames = subjectAlternativeNames;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
        this.useLatestVersion = useLatestVersion;
    }

    private CustomerCertificateParametersResponse() {
        this.certificateAuthority = null;
        this.secretSource = null;
        this.secretVersion = null;
        this.subjectAlternativeNames = List.of();
        this.type = null;
        this.useLatestVersion = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomerCertificateParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String certificateAuthority;
        private ResourceReferenceResponse secretSource;
        private @Nullable String secretVersion;
        private @Nullable List<String> subjectAlternativeNames;
        private String type;
        private @Nullable Boolean useLatestVersion;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomerCertificateParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateAuthority = defaults.certificateAuthority;
    	      this.secretSource = defaults.secretSource;
    	      this.secretVersion = defaults.secretVersion;
    	      this.subjectAlternativeNames = defaults.subjectAlternativeNames;
    	      this.type = defaults.type;
    	      this.useLatestVersion = defaults.useLatestVersion;
        }

        public Builder certificateAuthority(@Nullable String certificateAuthority) {
            this.certificateAuthority = certificateAuthority;
            return this;
        }
        public Builder secretSource(ResourceReferenceResponse secretSource) {
            this.secretSource = Objects.requireNonNull(secretSource);
            return this;
        }
        public Builder secretVersion(@Nullable String secretVersion) {
            this.secretVersion = secretVersion;
            return this;
        }
        public Builder subjectAlternativeNames(@Nullable List<String> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        public Builder subjectAlternativeNames(String... subjectAlternativeNames) {
            return subjectAlternativeNames(List.of(subjectAlternativeNames));
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder useLatestVersion(@Nullable Boolean useLatestVersion) {
            this.useLatestVersion = useLatestVersion;
            return this;
        }        public CustomerCertificateParametersResponse build() {
            return new CustomerCertificateParametersResponse(certificateAuthority, secretSource, secretVersion, subjectAlternativeNames, type, useLatestVersion);
        }
    }
}
