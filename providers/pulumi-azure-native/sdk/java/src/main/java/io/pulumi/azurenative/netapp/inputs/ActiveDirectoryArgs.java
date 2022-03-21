// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.netapp.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Active Directory
 * 
 */
public final class ActiveDirectoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final ActiveDirectoryArgs Empty = new ActiveDirectoryArgs();

    /**
     * Id of the Active Directory
     * 
     */
    @Import(name="activeDirectoryId")
      private final @Nullable Output<String> activeDirectoryId;

    public Output<String> getActiveDirectoryId() {
        return this.activeDirectoryId == null ? Output.empty() : this.activeDirectoryId;
    }

    /**
     * Name of the active directory machine. This optional parameter is used only while creating kerberos volume
     * 
     */
    @Import(name="adName")
      private final @Nullable Output<String> adName;

    public Output<String> getAdName() {
        return this.adName == null ? Output.empty() : this.adName;
    }

    /**
     * If enabled, AES encryption will be enabled for SMB communication.
     * 
     */
    @Import(name="aesEncryption")
      private final @Nullable Output<Boolean> aesEncryption;

    public Output<Boolean> getAesEncryption() {
        return this.aesEncryption == null ? Output.empty() : this.aesEncryption;
    }

    /**
     *  If enabled, NFS client local users can also (in addition to LDAP users) access the NFS volumes.
     * 
     */
    @Import(name="allowLocalNfsUsersWithLdap")
      private final @Nullable Output<Boolean> allowLocalNfsUsersWithLdap;

    public Output<Boolean> getAllowLocalNfsUsersWithLdap() {
        return this.allowLocalNfsUsersWithLdap == null ? Output.empty() : this.allowLocalNfsUsersWithLdap;
    }

    /**
     * Users to be added to the Built-in Backup Operator active directory group. A list of unique usernames without domain specifier
     * 
     */
    @Import(name="backupOperators")
      private final @Nullable Output<List<String>> backupOperators;

    public Output<List<String>> getBackupOperators() {
        return this.backupOperators == null ? Output.empty() : this.backupOperators;
    }

    /**
     * Comma separated list of DNS server IP addresses (IPv4 only) for the Active Directory domain
     * 
     */
    @Import(name="dns")
      private final @Nullable Output<String> dns;

    public Output<String> getDns() {
        return this.dns == null ? Output.empty() : this.dns;
    }

    /**
     * Name of the Active Directory domain
     * 
     */
    @Import(name="domain")
      private final @Nullable Output<String> domain;

    public Output<String> getDomain() {
        return this.domain == null ? Output.empty() : this.domain;
    }

    /**
     * kdc server IP addresses for the active directory machine. This optional parameter is used only while creating kerberos volume.
     * 
     */
    @Import(name="kdcIP")
      private final @Nullable Output<String> kdcIP;

    public Output<String> getKdcIP() {
        return this.kdcIP == null ? Output.empty() : this.kdcIP;
    }

    /**
     * Specifies whether or not the LDAP traffic needs to be secured via TLS.
     * 
     */
    @Import(name="ldapOverTLS")
      private final @Nullable Output<Boolean> ldapOverTLS;

    public Output<Boolean> getLdapOverTLS() {
        return this.ldapOverTLS == null ? Output.empty() : this.ldapOverTLS;
    }

    /**
     * Specifies whether or not the LDAP traffic needs to be signed.
     * 
     */
    @Import(name="ldapSigning")
      private final @Nullable Output<Boolean> ldapSigning;

    public Output<Boolean> getLdapSigning() {
        return this.ldapSigning == null ? Output.empty() : this.ldapSigning;
    }

    /**
     * The Organizational Unit (OU) within the Windows Active Directory
     * 
     */
    @Import(name="organizationalUnit")
      private final @Nullable Output<String> organizationalUnit;

    public Output<String> getOrganizationalUnit() {
        return this.organizationalUnit == null ? Output.empty() : this.organizationalUnit;
    }

    /**
     * Plain text password of Active Directory domain administrator, value is masked in the response
     * 
     */
    @Import(name="password")
      private final @Nullable Output<String> password;

    public Output<String> getPassword() {
        return this.password == null ? Output.empty() : this.password;
    }

    /**
     * Domain Users in the Active directory to be given SeSecurityPrivilege privilege (Needed for SMB Continuously available shares for SQL). A list of unique usernames without domain specifier
     * 
     */
    @Import(name="securityOperators")
      private final @Nullable Output<List<String>> securityOperators;

    public Output<List<String>> getSecurityOperators() {
        return this.securityOperators == null ? Output.empty() : this.securityOperators;
    }

    /**
     * When LDAP over SSL/TLS is enabled, the LDAP client is required to have base64 encoded Active Directory Certificate Service's self-signed root CA certificate, this optional parameter is used only for dual protocol with LDAP user-mapping volumes.
     * 
     */
    @Import(name="serverRootCACertificate")
      private final @Nullable Output<String> serverRootCACertificate;

    public Output<String> getServerRootCACertificate() {
        return this.serverRootCACertificate == null ? Output.empty() : this.serverRootCACertificate;
    }

    /**
     * The Active Directory site the service will limit Domain Controller discovery to
     * 
     */
    @Import(name="site")
      private final @Nullable Output<String> site;

    public Output<String> getSite() {
        return this.site == null ? Output.empty() : this.site;
    }

    /**
     * NetBIOS name of the SMB server. This name will be registered as a computer account in the AD and used to mount volumes
     * 
     */
    @Import(name="smbServerName")
      private final @Nullable Output<String> smbServerName;

    public Output<String> getSmbServerName() {
        return this.smbServerName == null ? Output.empty() : this.smbServerName;
    }

    /**
     * Username of Active Directory domain administrator
     * 
     */
    @Import(name="username")
      private final @Nullable Output<String> username;

    public Output<String> getUsername() {
        return this.username == null ? Output.empty() : this.username;
    }

    public ActiveDirectoryArgs(
        @Nullable Output<String> activeDirectoryId,
        @Nullable Output<String> adName,
        @Nullable Output<Boolean> aesEncryption,
        @Nullable Output<Boolean> allowLocalNfsUsersWithLdap,
        @Nullable Output<List<String>> backupOperators,
        @Nullable Output<String> dns,
        @Nullable Output<String> domain,
        @Nullable Output<String> kdcIP,
        @Nullable Output<Boolean> ldapOverTLS,
        @Nullable Output<Boolean> ldapSigning,
        @Nullable Output<String> organizationalUnit,
        @Nullable Output<String> password,
        @Nullable Output<List<String>> securityOperators,
        @Nullable Output<String> serverRootCACertificate,
        @Nullable Output<String> site,
        @Nullable Output<String> smbServerName,
        @Nullable Output<String> username) {
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
        this.organizationalUnit = organizationalUnit == null ? Output.ofNullable("CN=Computers") : organizationalUnit;
        this.password = password;
        this.securityOperators = securityOperators;
        this.serverRootCACertificate = serverRootCACertificate;
        this.site = site;
        this.smbServerName = smbServerName;
        this.username = username;
    }

    private ActiveDirectoryArgs() {
        this.activeDirectoryId = Output.empty();
        this.adName = Output.empty();
        this.aesEncryption = Output.empty();
        this.allowLocalNfsUsersWithLdap = Output.empty();
        this.backupOperators = Output.empty();
        this.dns = Output.empty();
        this.domain = Output.empty();
        this.kdcIP = Output.empty();
        this.ldapOverTLS = Output.empty();
        this.ldapSigning = Output.empty();
        this.organizationalUnit = Output.empty();
        this.password = Output.empty();
        this.securityOperators = Output.empty();
        this.serverRootCACertificate = Output.empty();
        this.site = Output.empty();
        this.smbServerName = Output.empty();
        this.username = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActiveDirectoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> activeDirectoryId;
        private @Nullable Output<String> adName;
        private @Nullable Output<Boolean> aesEncryption;
        private @Nullable Output<Boolean> allowLocalNfsUsersWithLdap;
        private @Nullable Output<List<String>> backupOperators;
        private @Nullable Output<String> dns;
        private @Nullable Output<String> domain;
        private @Nullable Output<String> kdcIP;
        private @Nullable Output<Boolean> ldapOverTLS;
        private @Nullable Output<Boolean> ldapSigning;
        private @Nullable Output<String> organizationalUnit;
        private @Nullable Output<String> password;
        private @Nullable Output<List<String>> securityOperators;
        private @Nullable Output<String> serverRootCACertificate;
        private @Nullable Output<String> site;
        private @Nullable Output<String> smbServerName;
        private @Nullable Output<String> username;

        public Builder() {
    	      // Empty
        }

        public Builder(ActiveDirectoryArgs defaults) {
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
    	      this.username = defaults.username;
        }

        public Builder activeDirectoryId(@Nullable Output<String> activeDirectoryId) {
            this.activeDirectoryId = activeDirectoryId;
            return this;
        }
        public Builder activeDirectoryId(@Nullable String activeDirectoryId) {
            this.activeDirectoryId = Output.ofNullable(activeDirectoryId);
            return this;
        }
        public Builder adName(@Nullable Output<String> adName) {
            this.adName = adName;
            return this;
        }
        public Builder adName(@Nullable String adName) {
            this.adName = Output.ofNullable(adName);
            return this;
        }
        public Builder aesEncryption(@Nullable Output<Boolean> aesEncryption) {
            this.aesEncryption = aesEncryption;
            return this;
        }
        public Builder aesEncryption(@Nullable Boolean aesEncryption) {
            this.aesEncryption = Output.ofNullable(aesEncryption);
            return this;
        }
        public Builder allowLocalNfsUsersWithLdap(@Nullable Output<Boolean> allowLocalNfsUsersWithLdap) {
            this.allowLocalNfsUsersWithLdap = allowLocalNfsUsersWithLdap;
            return this;
        }
        public Builder allowLocalNfsUsersWithLdap(@Nullable Boolean allowLocalNfsUsersWithLdap) {
            this.allowLocalNfsUsersWithLdap = Output.ofNullable(allowLocalNfsUsersWithLdap);
            return this;
        }
        public Builder backupOperators(@Nullable Output<List<String>> backupOperators) {
            this.backupOperators = backupOperators;
            return this;
        }
        public Builder backupOperators(@Nullable List<String> backupOperators) {
            this.backupOperators = Output.ofNullable(backupOperators);
            return this;
        }
        public Builder backupOperators(String... backupOperators) {
            return backupOperators(List.of(backupOperators));
        }
        public Builder dns(@Nullable Output<String> dns) {
            this.dns = dns;
            return this;
        }
        public Builder dns(@Nullable String dns) {
            this.dns = Output.ofNullable(dns);
            return this;
        }
        public Builder domain(@Nullable Output<String> domain) {
            this.domain = domain;
            return this;
        }
        public Builder domain(@Nullable String domain) {
            this.domain = Output.ofNullable(domain);
            return this;
        }
        public Builder kdcIP(@Nullable Output<String> kdcIP) {
            this.kdcIP = kdcIP;
            return this;
        }
        public Builder kdcIP(@Nullable String kdcIP) {
            this.kdcIP = Output.ofNullable(kdcIP);
            return this;
        }
        public Builder ldapOverTLS(@Nullable Output<Boolean> ldapOverTLS) {
            this.ldapOverTLS = ldapOverTLS;
            return this;
        }
        public Builder ldapOverTLS(@Nullable Boolean ldapOverTLS) {
            this.ldapOverTLS = Output.ofNullable(ldapOverTLS);
            return this;
        }
        public Builder ldapSigning(@Nullable Output<Boolean> ldapSigning) {
            this.ldapSigning = ldapSigning;
            return this;
        }
        public Builder ldapSigning(@Nullable Boolean ldapSigning) {
            this.ldapSigning = Output.ofNullable(ldapSigning);
            return this;
        }
        public Builder organizationalUnit(@Nullable Output<String> organizationalUnit) {
            this.organizationalUnit = organizationalUnit;
            return this;
        }
        public Builder organizationalUnit(@Nullable String organizationalUnit) {
            this.organizationalUnit = Output.ofNullable(organizationalUnit);
            return this;
        }
        public Builder password(@Nullable Output<String> password) {
            this.password = password;
            return this;
        }
        public Builder password(@Nullable String password) {
            this.password = Output.ofNullable(password);
            return this;
        }
        public Builder securityOperators(@Nullable Output<List<String>> securityOperators) {
            this.securityOperators = securityOperators;
            return this;
        }
        public Builder securityOperators(@Nullable List<String> securityOperators) {
            this.securityOperators = Output.ofNullable(securityOperators);
            return this;
        }
        public Builder securityOperators(String... securityOperators) {
            return securityOperators(List.of(securityOperators));
        }
        public Builder serverRootCACertificate(@Nullable Output<String> serverRootCACertificate) {
            this.serverRootCACertificate = serverRootCACertificate;
            return this;
        }
        public Builder serverRootCACertificate(@Nullable String serverRootCACertificate) {
            this.serverRootCACertificate = Output.ofNullable(serverRootCACertificate);
            return this;
        }
        public Builder site(@Nullable Output<String> site) {
            this.site = site;
            return this;
        }
        public Builder site(@Nullable String site) {
            this.site = Output.ofNullable(site);
            return this;
        }
        public Builder smbServerName(@Nullable Output<String> smbServerName) {
            this.smbServerName = smbServerName;
            return this;
        }
        public Builder smbServerName(@Nullable String smbServerName) {
            this.smbServerName = Output.ofNullable(smbServerName);
            return this;
        }
        public Builder username(@Nullable Output<String> username) {
            this.username = username;
            return this;
        }
        public Builder username(@Nullable String username) {
            this.username = Output.ofNullable(username);
            return this;
        }        public ActiveDirectoryArgs build() {
            return new ActiveDirectoryArgs(activeDirectoryId, adName, aesEncryption, allowLocalNfsUsersWithLdap, backupOperators, dns, domain, kdcIP, ldapOverTLS, ldapSigning, organizationalUnit, password, securityOperators, serverRootCACertificate, site, smbServerName, username);
        }
    }
}
