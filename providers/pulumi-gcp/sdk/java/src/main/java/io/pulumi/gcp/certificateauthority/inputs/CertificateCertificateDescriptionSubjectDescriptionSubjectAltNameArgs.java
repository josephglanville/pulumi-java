// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.certificateauthority.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.certificateauthority.inputs.CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameArgs Empty = new CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameArgs();

    @Import(name="customSans")
      private final @Nullable Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs>> customSans;

    public Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs>> getCustomSans() {
        return this.customSans == null ? Output.empty() : this.customSans;
    }

    /**
     * Contains only valid, fully-qualified host names.
     * 
     */
    @Import(name="dnsNames")
      private final @Nullable Output<List<String>> dnsNames;

    public Output<List<String>> getDnsNames() {
        return this.dnsNames == null ? Output.empty() : this.dnsNames;
    }

    /**
     * Contains only valid RFC 2822 E-mail addresses.
     * 
     */
    @Import(name="emailAddresses")
      private final @Nullable Output<List<String>> emailAddresses;

    public Output<List<String>> getEmailAddresses() {
        return this.emailAddresses == null ? Output.empty() : this.emailAddresses;
    }

    /**
     * Contains only valid 32-bit IPv4 addresses or RFC 4291 IPv6 addresses.
     * 
     */
    @Import(name="ipAddresses")
      private final @Nullable Output<List<String>> ipAddresses;

    public Output<List<String>> getIpAddresses() {
        return this.ipAddresses == null ? Output.empty() : this.ipAddresses;
    }

    /**
     * Contains only valid RFC 3986 URIs.
     * 
     */
    @Import(name="uris")
      private final @Nullable Output<List<String>> uris;

    public Output<List<String>> getUris() {
        return this.uris == null ? Output.empty() : this.uris;
    }

    public CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameArgs(
        @Nullable Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs>> customSans,
        @Nullable Output<List<String>> dnsNames,
        @Nullable Output<List<String>> emailAddresses,
        @Nullable Output<List<String>> ipAddresses,
        @Nullable Output<List<String>> uris) {
        this.customSans = customSans;
        this.dnsNames = dnsNames;
        this.emailAddresses = emailAddresses;
        this.ipAddresses = ipAddresses;
        this.uris = uris;
    }

    private CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameArgs() {
        this.customSans = Output.empty();
        this.dnsNames = Output.empty();
        this.emailAddresses = Output.empty();
        this.ipAddresses = Output.empty();
        this.uris = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs>> customSans;
        private @Nullable Output<List<String>> dnsNames;
        private @Nullable Output<List<String>> emailAddresses;
        private @Nullable Output<List<String>> ipAddresses;
        private @Nullable Output<List<String>> uris;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.customSans = defaults.customSans;
    	      this.dnsNames = defaults.dnsNames;
    	      this.emailAddresses = defaults.emailAddresses;
    	      this.ipAddresses = defaults.ipAddresses;
    	      this.uris = defaults.uris;
        }

        public Builder customSans(@Nullable Output<List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs>> customSans) {
            this.customSans = customSans;
            return this;
        }
        public Builder customSans(@Nullable List<CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs> customSans) {
            this.customSans = Output.ofNullable(customSans);
            return this;
        }
        public Builder customSans(CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameCustomSanArgs... customSans) {
            return customSans(List.of(customSans));
        }
        public Builder dnsNames(@Nullable Output<List<String>> dnsNames) {
            this.dnsNames = dnsNames;
            return this;
        }
        public Builder dnsNames(@Nullable List<String> dnsNames) {
            this.dnsNames = Output.ofNullable(dnsNames);
            return this;
        }
        public Builder dnsNames(String... dnsNames) {
            return dnsNames(List.of(dnsNames));
        }
        public Builder emailAddresses(@Nullable Output<List<String>> emailAddresses) {
            this.emailAddresses = emailAddresses;
            return this;
        }
        public Builder emailAddresses(@Nullable List<String> emailAddresses) {
            this.emailAddresses = Output.ofNullable(emailAddresses);
            return this;
        }
        public Builder emailAddresses(String... emailAddresses) {
            return emailAddresses(List.of(emailAddresses));
        }
        public Builder ipAddresses(@Nullable Output<List<String>> ipAddresses) {
            this.ipAddresses = ipAddresses;
            return this;
        }
        public Builder ipAddresses(@Nullable List<String> ipAddresses) {
            this.ipAddresses = Output.ofNullable(ipAddresses);
            return this;
        }
        public Builder ipAddresses(String... ipAddresses) {
            return ipAddresses(List.of(ipAddresses));
        }
        public Builder uris(@Nullable Output<List<String>> uris) {
            this.uris = uris;
            return this;
        }
        public Builder uris(@Nullable List<String> uris) {
            this.uris = Output.ofNullable(uris);
            return this;
        }
        public Builder uris(String... uris) {
            return uris(List.of(uris));
        }        public CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameArgs build() {
            return new CertificateCertificateDescriptionSubjectDescriptionSubjectAltNameArgs(customSans, dnsNames, emailAddresses, ipAddresses, uris);
        }
    }
}
