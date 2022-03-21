// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.appengine_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SslSettingsResponse {
    /**
     * ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will remove SSL support.By default, a managed certificate is automatically created for every domain mapping. To omit SSL support or to configure SSL manually, specify SslManagementType.MANUAL on a CREATE or UPDATE request. You must be authorized to administer the AuthorizedCertificate resource to manually map it to a DomainMapping resource. Example: 12345.
     * 
     */
    private final String certificateId;
    /**
     * ID of the managed AuthorizedCertificate resource currently being provisioned, if applicable. Until the new managed certificate has been successfully provisioned, the previous SSL state will be preserved. Once the provisioning process completes, the certificate_id field will reflect the new managed certificate and this field will be left empty. To remove SSL support while there is still a pending managed certificate, clear the certificate_id field with an UpdateDomainMappingRequest.
     * 
     */
    private final String pendingManagedCertificateId;
    /**
     * SSL management type for this domain. If AUTOMATIC, a managed certificate is automatically provisioned. If MANUAL, certificate_id must be manually specified in order to configure SSL for this domain.
     * 
     */
    private final String sslManagementType;

    @CustomType.Constructor
    private SslSettingsResponse(
        @CustomType.Parameter("certificateId") String certificateId,
        @CustomType.Parameter("pendingManagedCertificateId") String pendingManagedCertificateId,
        @CustomType.Parameter("sslManagementType") String sslManagementType) {
        this.certificateId = certificateId;
        this.pendingManagedCertificateId = pendingManagedCertificateId;
        this.sslManagementType = sslManagementType;
    }

    /**
     * ID of the AuthorizedCertificate resource configuring SSL for the application. Clearing this field will remove SSL support.By default, a managed certificate is automatically created for every domain mapping. To omit SSL support or to configure SSL manually, specify SslManagementType.MANUAL on a CREATE or UPDATE request. You must be authorized to administer the AuthorizedCertificate resource to manually map it to a DomainMapping resource. Example: 12345.
     * 
    */
    public String getCertificateId() {
        return this.certificateId;
    }
    /**
     * ID of the managed AuthorizedCertificate resource currently being provisioned, if applicable. Until the new managed certificate has been successfully provisioned, the previous SSL state will be preserved. Once the provisioning process completes, the certificate_id field will reflect the new managed certificate and this field will be left empty. To remove SSL support while there is still a pending managed certificate, clear the certificate_id field with an UpdateDomainMappingRequest.
     * 
    */
    public String getPendingManagedCertificateId() {
        return this.pendingManagedCertificateId;
    }
    /**
     * SSL management type for this domain. If AUTOMATIC, a managed certificate is automatically provisioned. If MANUAL, certificate_id must be manually specified in order to configure SSL for this domain.
     * 
    */
    public String getSslManagementType() {
        return this.sslManagementType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SslSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String certificateId;
        private String pendingManagedCertificateId;
        private String sslManagementType;

        public Builder() {
    	      // Empty
        }

        public Builder(SslSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateId = defaults.certificateId;
    	      this.pendingManagedCertificateId = defaults.pendingManagedCertificateId;
    	      this.sslManagementType = defaults.sslManagementType;
        }

        public Builder certificateId(String certificateId) {
            this.certificateId = Objects.requireNonNull(certificateId);
            return this;
        }
        public Builder pendingManagedCertificateId(String pendingManagedCertificateId) {
            this.pendingManagedCertificateId = Objects.requireNonNull(pendingManagedCertificateId);
            return this;
        }
        public Builder sslManagementType(String sslManagementType) {
            this.sslManagementType = Objects.requireNonNull(sslManagementType);
            return this;
        }        public SslSettingsResponse build() {
            return new SslSettingsResponse(certificateId, pendingManagedCertificateId, sslManagementType);
        }
    }
}
