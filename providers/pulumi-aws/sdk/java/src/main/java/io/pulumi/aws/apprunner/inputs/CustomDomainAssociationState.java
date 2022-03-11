// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.apprunner.inputs;

import io.pulumi.aws.apprunner.inputs.CustomDomainAssociationCertificateValidationRecordGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CustomDomainAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final CustomDomainAssociationState Empty = new CustomDomainAssociationState();

    /**
     * A set of certificate CNAME records used for this domain name. See Certificate Validation Records below for more details.
     * 
     */
    @InputImport(name="certificateValidationRecords")
      private final @Nullable Output<List<CustomDomainAssociationCertificateValidationRecordGetArgs>> certificateValidationRecords;

    public Output<List<CustomDomainAssociationCertificateValidationRecordGetArgs>> getCertificateValidationRecords() {
        return this.certificateValidationRecords == null ? Output.empty() : this.certificateValidationRecords;
    }

    /**
     * The App Runner subdomain of the App Runner service. The custom domain name is mapped to this target name. Attribute only available if resource created (not imported) with this provider.
     * 
     */
    @InputImport(name="dnsTarget")
      private final @Nullable Output<String> dnsTarget;

    public Output<String> getDnsTarget() {
        return this.dnsTarget == null ? Output.empty() : this.dnsTarget;
    }

    /**
     * The custom domain endpoint to association. Specify a base domain e.g., `example.com` or a subdomain e.g., `subdomain.example.com`.
     * 
     */
    @InputImport(name="domainName")
      private final @Nullable Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName == null ? Output.empty() : this.domainName;
    }

    /**
     * Whether to associate the subdomain with the App Runner service in addition to the base domain. Defaults to `true`.
     * 
     */
    @InputImport(name="enableWwwSubdomain")
      private final @Nullable Output<Boolean> enableWwwSubdomain;

    public Output<Boolean> getEnableWwwSubdomain() {
        return this.enableWwwSubdomain == null ? Output.empty() : this.enableWwwSubdomain;
    }

    /**
     * The ARN of the App Runner service.
     * 
     */
    @InputImport(name="serviceArn")
      private final @Nullable Output<String> serviceArn;

    public Output<String> getServiceArn() {
        return this.serviceArn == null ? Output.empty() : this.serviceArn;
    }

    /**
     * The current state of the certificate CNAME record validation. It should change to `SUCCESS` after App Runner completes validation with your DNS.
     * 
     */
    @InputImport(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    public CustomDomainAssociationState(
        @Nullable Output<List<CustomDomainAssociationCertificateValidationRecordGetArgs>> certificateValidationRecords,
        @Nullable Output<String> dnsTarget,
        @Nullable Output<String> domainName,
        @Nullable Output<Boolean> enableWwwSubdomain,
        @Nullable Output<String> serviceArn,
        @Nullable Output<String> status) {
        this.certificateValidationRecords = certificateValidationRecords;
        this.dnsTarget = dnsTarget;
        this.domainName = domainName;
        this.enableWwwSubdomain = enableWwwSubdomain;
        this.serviceArn = serviceArn;
        this.status = status;
    }

    private CustomDomainAssociationState() {
        this.certificateValidationRecords = Output.empty();
        this.dnsTarget = Output.empty();
        this.domainName = Output.empty();
        this.enableWwwSubdomain = Output.empty();
        this.serviceArn = Output.empty();
        this.status = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CustomDomainAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<List<CustomDomainAssociationCertificateValidationRecordGetArgs>> certificateValidationRecords;
        private @Nullable Output<String> dnsTarget;
        private @Nullable Output<String> domainName;
        private @Nullable Output<Boolean> enableWwwSubdomain;
        private @Nullable Output<String> serviceArn;
        private @Nullable Output<String> status;

        public Builder() {
    	      // Empty
        }

        public Builder(CustomDomainAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateValidationRecords = defaults.certificateValidationRecords;
    	      this.dnsTarget = defaults.dnsTarget;
    	      this.domainName = defaults.domainName;
    	      this.enableWwwSubdomain = defaults.enableWwwSubdomain;
    	      this.serviceArn = defaults.serviceArn;
    	      this.status = defaults.status;
        }

        public Builder certificateValidationRecords(@Nullable Output<List<CustomDomainAssociationCertificateValidationRecordGetArgs>> certificateValidationRecords) {
            this.certificateValidationRecords = certificateValidationRecords;
            return this;
        }

        public Builder certificateValidationRecords(@Nullable List<CustomDomainAssociationCertificateValidationRecordGetArgs> certificateValidationRecords) {
            this.certificateValidationRecords = Output.ofNullable(certificateValidationRecords);
            return this;
        }

        public Builder dnsTarget(@Nullable Output<String> dnsTarget) {
            this.dnsTarget = dnsTarget;
            return this;
        }

        public Builder dnsTarget(@Nullable String dnsTarget) {
            this.dnsTarget = Output.ofNullable(dnsTarget);
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

        public Builder enableWwwSubdomain(@Nullable Output<Boolean> enableWwwSubdomain) {
            this.enableWwwSubdomain = enableWwwSubdomain;
            return this;
        }

        public Builder enableWwwSubdomain(@Nullable Boolean enableWwwSubdomain) {
            this.enableWwwSubdomain = Output.ofNullable(enableWwwSubdomain);
            return this;
        }

        public Builder serviceArn(@Nullable Output<String> serviceArn) {
            this.serviceArn = serviceArn;
            return this;
        }

        public Builder serviceArn(@Nullable String serviceArn) {
            this.serviceArn = Output.ofNullable(serviceArn);
            return this;
        }

        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }

        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public CustomDomainAssociationState build() {
            return new CustomDomainAssociationState(certificateValidationRecords, dnsTarget, domainName, enableWwwSubdomain, serviceArn, status);
        }
    }
}
