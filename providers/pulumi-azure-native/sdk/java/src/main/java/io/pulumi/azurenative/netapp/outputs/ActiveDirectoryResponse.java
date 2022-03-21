// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ActiveDirectoryResponse {
    /**
     * Id of the Active Directory
     * 
     */
    private final @Nullable String activeDirectoryId;
    /**
     * Name of the active directory machine. This optional parameter is used only while creating kerberos volume
     * 
     */
    private final @Nullable String adName;
    /**
     * If enabled, AES encryption will be enabled for SMB communication.
     * 
     */
    private final @Nullable Boolean aesEncryption;
    /**
     *  If enabled, NFS client local users can also (in addition to LDAP users) access the NFS volumes.
     * 
     */
    private final @Nullable Boolean allowLocalNfsUsersWithLdap;
    /**
     * Users to be added to the Built-in Backup Operator active directory group. A list of unique usernames without domain specifier
     * 
     */
    private final @Nullable List<String> backupOperators;
    /**
     * Comma separated list of DNS server IP addresses (IPv4 only) for the Active Directory domain
     * 
     */
    private final @Nullable String dns;
    /**
     * Name of the Active Directory domain
     * 
     */
    private final @Nullable String domain;
    /**
     * kdc server IP addresses for the active directory machine. This optional parameter is used only while creating kerberos volume.
     * 
     */
    private final @Nullable String kdcIP;
    /**
     * Specifies whether or not the LDAP traffic needs to be secured via TLS.
     * 
     */
    private final @Nullable Boolean ldapOverTLS;
    /**
     * Specifies whether or not the LDAP traffic needs to be signed.
     * 
     */
    private final @Nullable Boolean ldapSigning;
    /**
     * The Organizational Unit (OU) within the Windows Active Directory
     * 
     */
    private final @Nullable String organizationalUnit;
    /**
     * Plain text password of Active Directory domain administrator, value is masked in the response
     * 
     */
    private final @Nullable String password;
    /**
     * Domain Users in the Active directory to be given SeSecurityPrivilege privilege (Needed for SMB Continuously available shares for SQL). A list of unique usernames without domain specifier
     * 
     */
    private final @Nullable List<String> securityOperators;
    /**
     * When LDAP over SSL/TLS is enabled, the LDAP client is required to have base64 encoded Active Directory Certificate Service's self-signed root CA certificate, this optional parameter is used only for dual protocol with LDAP user-mapping volumes.
     * 
     */
    private final @Nullable String serverRootCACertificate;
    /**
     * The Active Directory site the service will limit Domain Controller discovery to
     * 
     */
    private final @Nullable String site;
    /**
     * NetBIOS name of the SMB server. This name will be registered as a computer account in the AD and used to mount volumes
     * 
     */
    private final @Nullable String smbServerName;
    /**
     * Status of the Active Directory
     * 
     */
    private final String status;
    /**
     * Any details in regards to the Status of the Active Directory
     * 
     */
    private final String statusDetails;
    /**
     * Username of Active Directory domain administrator
     * 
     */
    private final @Nullable String username;

    @CustomType.Constructor
    private ActiveDirectoryResponse(
        @CustomType.Parameter("activeDirectoryId") @Nullable String activeDirectoryId,
        @CustomType.Parameter("adName") @Nullable String adName,
        @CustomType.Parameter("aesEncryption") @Nullable Boolean aesEncryption,
        @CustomType.Parameter("allowLocalNfsUsersWithLdap") @Nullable Boolean allowLocalNfsUsersWithLdap,
        @CustomType.Parameter("backupOperators") @Nullable List<String> backupOperators,
        @CustomType.Parameter("dns") @Nullable String dns,
        @CustomType.Parameter("domain") @Nullable String domain,
        @CustomType.Parameter("kdcIP") @Nullable String kdcIP,
        @CustomType.Parameter("ldapOverTLS") @Nullable Boolean ldapOverTLS,
        @CustomType.Parameter("ldapSigning") @Nullable Boolean ldapSigning,
        @CustomType.Parameter("organizationalUnit") @Nullable String organizationalUnit,
        @CustomType.Parameter("password") @Nullable String password,
        @CustomType.Parameter("securityOperators") @Nullable List<String> securityOperators,
        @CustomType.Parameter("serverRootCACertificate") @Nullable String serverRootCACertificate,
        @CustomType.Parameter("site") @Nullable String site,
        @CustomType.Parameter("smbServerName") @Nullable String smbServerName,
        @CustomType.Parameter("status") String status,
        @CustomType.Parameter("statusDetails") String statusDetails,
        @CustomType.Parameter("username") @Nullable String username) {
        this.activeDirectoryId = activeDirectoryId;
        this.adName = adName;
        this.aesEncryption = aesEncryption;
        this.allowLocalNfsUsersWithLdap = allowLocalNfsUsersWithLdap;
        this.backupOperators = backupOperators;
        this.dns = dns;
        this.domain = domain;
        this.kdcIP = kdcIP;
        this.ldapOverTLS = ldapOverTLS;
        this.ldapSigning = ldapSigning;
        this.organizationalUnit = organizationalUnit;
        this.password = password;
        this.securityOperators = securityOperators;
        this.serverRootCACertificate = serverRootCACertificate;
        this.site = site;
        this.smbServerName = smbServerName;
        this.status = status;
        this.statusDetails = statusDetails;
        this.username = username;
    }

    /**
     * Id of the Active Directory
     * 
    */
    public Optional<String> getActiveDirectoryId() {
        return Optional.ofNullable(this.activeDirectoryId);
    }
    /**
     * Name of the active directory machine. This optional parameter is used only while creating kerberos volume
     * 
    */
    public Optional<String> getAdName() {
        return Optional.ofNullable(this.adName);
    }
    /**
     * If enabled, AES encryption will be enabled for SMB communication.
     * 
    */
    public Optional<Boolean> getAesEncryption() {
        return Optional.ofNullable(this.aesEncryption);
    }
    /**
     *  If enabled, NFS client local users can also (in addition to LDAP users) access the NFS volumes.
     * 
    */
    public Optional<Boolean> getAllowLocalNfsUsersWithLdap() {
        return Optional.ofNullable(this.allowLocalNfsUsersWithLdap);
    }
    /**
     * Users to be added to the Built-in Backup Operator active directory group. A list of unique usernames without domain specifier
     * 
    */
    public List<String> getBackupOperators() {
        return this.backupOperators == null ? List.of() : this.backupOperators;
    }
    /**
     * Comma separated list of DNS server IP addresses (IPv4 only) for the Active Directory domain
     * 
    */
    public Optional<String> getDns() {
        return Optional.ofNullable(this.dns);
    }
    /**
     * Name of the Active Directory domain
     * 
    */
    public Optional<String> getDomain() {
        return Optional.ofNullable(this.domain);
    }
    /**
     * kdc server IP addresses for the active directory machine. This optional parameter is used only while creating kerberos volume.
     * 
    */
    public Optional<String> getKdcIP() {
        return Optional.ofNullable(this.kdcIP);
    }
    /**
     * Specifies whether or not the LDAP traffic needs to be secured via TLS.
     * 
    */
    public Optional<Boolean> getLdapOverTLS() {
        return Optional.ofNullable(this.ldapOverTLS);
    }
    /**
     * Specifies whether or not the LDAP traffic needs to be signed.
     * 
    */
    public Optional<Boolean> getLdapSigning() {
        return Optional.ofNullable(this.ldapSigning);
    }
    /**
     * The Organizational Unit (OU) within the Windows Active Directory
     * 
    */
    public Optional<String> getOrganizationalUnit() {
        return Optional.ofNullable(this.organizationalUnit);
    }
    /**
     * Plain text password of Active Directory domain administrator, value is masked in the response
     * 
    */
    public Optional<String> getPassword() {
        return Optional.ofNullable(this.password);
    }
    /**
     * Domain Users in the Active directory to be given SeSecurityPrivilege privilege (Needed for SMB Continuously available shares for SQL). A list of unique usernames without domain specifier
     * 
    */
    public List<String> getSecurityOperators() {
        return this.securityOperators == null ? List.of() : this.securityOperators;
    }
    /**
     * When LDAP over SSL/TLS is enabled, the LDAP client is required to have base64 encoded Active Directory Certificate Service's self-signed root CA certificate, this optional parameter is used only for dual protocol with LDAP user-mapping volumes.
     * 
    */
    public Optional<String> getServerRootCACertificate() {
        return Optional.ofNullable(this.serverRootCACertificate);
    }
    /**
     * The Active Directory site the service will limit Domain Controller discovery to
     * 
    */
    public Optional<String> getSite() {
        return Optional.ofNullable(this.site);
    }
    /**
     * NetBIOS name of the SMB server. This name will be registered as a computer account in the AD and used to mount volumes
     * 
    */
    public Optional<String> getSmbServerName() {
        return Optional.ofNullable(this.smbServerName);
    }
    /**
     * Status of the Active Directory
     * 
    */
    public String getStatus() {
        return this.status;
    }
    /**
     * Any details in regards to the Status of the Active Directory
     * 
    */
    public String getStatusDetails() {
        return this.statusDetails;
    }
    /**
     * Username of Active Directory domain administrator
     * 
    */
    public Optional<String> getUsername() {
        return Optional.ofNullable(this.username);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActiveDirectoryResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String activeDirectoryId;
        private @Nullable String adName;
        private @Nullable Boolean aesEncryption;
        private @Nullable Boolean allowLocalNfsUsersWithLdap;
        private @Nullable List<String> backupOperators;
        private @Nullable String dns;
        private @Nullable String domain;
        private @Nullable String kdcIP;
        private @Nullable Boolean ldapOverTLS;
        private @Nullable Boolean ldapSigning;
        private @Nullable String organizationalUnit;
        private @Nullable String password;
        private @Nullable List<String> securityOperators;
        private @Nullable String serverRootCACertificate;
        private @Nullable String site;
        private @Nullable String smbServerName;
        private String status;
        private String statusDetails;
        private @Nullable String username;

        public Builder() {
    	      // Empty
        }

        public Builder(ActiveDirectoryResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.activeDirectoryId = defaults.activeDirectoryId;
    	      this.adName = defaults.adName;
    	      this.aesEncryption = defaults.aesEncryption;
    	      this.allowLocalNfsUsersWithLdap = defaults.allowLocalNfsUsersWithLdap;
    	      this.backupOperators = defaults.backupOperators;
    	      this.dns = defaults.dns;
    	      this.domain = defaults.domain;
    	      this.kdcIP = defaults.kdcIP;
    	      this.ldapOverTLS = defaults.ldapOverTLS;
    	      this.ldapSigning = defaults.ldapSigning;
    	      this.organizationalUnit = defaults.organizationalUnit;
    	      this.password = defaults.password;
    	      this.securityOperators = defaults.securityOperators;
    	      this.serverRootCACertificate = defaults.serverRootCACertificate;
    	      this.site = defaults.site;
    	      this.smbServerName = defaults.smbServerName;
    	      this.status = defaults.status;
    	      this.statusDetails = defaults.statusDetails;
    	      this.username = defaults.username;
        }

        public Builder activeDirectoryId(@Nullable String activeDirectoryId) {
            this.activeDirectoryId = activeDirectoryId;
            return this;
        }
        public Builder adName(@Nullable String adName) {
            this.adName = adName;
            return this;
        }
        public Builder aesEncryption(@Nullable Boolean aesEncryption) {
            this.aesEncryption = aesEncryption;
            return this;
        }
        public Builder allowLocalNfsUsersWithLdap(@Nullable Boolean allowLocalNfsUsersWithLdap) {
            this.allowLocalNfsUsersWithLdap = allowLocalNfsUsersWithLdap;
            return this;
        }
        public Builder backupOperators(@Nullable List<String> backupOperators) {
            this.backupOperators = backupOperators;
            return this;
        }
        public Builder backupOperators(String... backupOperators) {
            return backupOperators(List.of(backupOperators));
        }
        public Builder dns(@Nullable String dns) {
            this.dns = dns;
            return this;
        }
        public Builder domain(@Nullable String domain) {
            this.domain = domain;
            return this;
        }
        public Builder kdcIP(@Nullable String kdcIP) {
            this.kdcIP = kdcIP;
            return this;
        }
        public Builder ldapOverTLS(@Nullable Boolean ldapOverTLS) {
            this.ldapOverTLS = ldapOverTLS;
            return this;
        }
        public Builder ldapSigning(@Nullable Boolean ldapSigning) {
            this.ldapSigning = ldapSigning;
            return this;
        }
        public Builder organizationalUnit(@Nullable String organizationalUnit) {
            this.organizationalUnit = organizationalUnit;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = password;
            return this;
        }
        public Builder securityOperators(@Nullable List<String> securityOperators) {
            this.securityOperators = securityOperators;
            return this;
        }
        public Builder securityOperators(String... securityOperators) {
            return securityOperators(List.of(securityOperators));
        }
        public Builder serverRootCACertificate(@Nullable String serverRootCACertificate) {
            this.serverRootCACertificate = serverRootCACertificate;
            return this;
        }
        public Builder site(@Nullable String site) {
            this.site = site;
            return this;
        }
        public Builder smbServerName(@Nullable String smbServerName) {
            this.smbServerName = smbServerName;
            return this;
        }
        public Builder status(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }
        public Builder statusDetails(String statusDetails) {
            this.statusDetails = Objects.requireNonNull(statusDetails);
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = username;
            return this;
        }        public ActiveDirectoryResponse build() {
            return new ActiveDirectoryResponse(activeDirectoryId, adName, aesEncryption, allowLocalNfsUsersWithLdap, backupOperators, dns, domain, kdcIP, ldapOverTLS, ldapSigning, organizationalUnit, password, securityOperators, serverRootCACertificate, site, smbServerName, status, statusDetails, username);
        }
    }
}
