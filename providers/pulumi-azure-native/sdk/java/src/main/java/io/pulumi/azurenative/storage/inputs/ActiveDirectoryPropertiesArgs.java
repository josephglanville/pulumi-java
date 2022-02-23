// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Settings properties for Active Directory (AD).
 * 
 */
public final class ActiveDirectoryPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ActiveDirectoryPropertiesArgs Empty = new ActiveDirectoryPropertiesArgs();

    /**
     * Specifies the security identifier (SID) for Azure Storage.
     * 
     */
    @InputImport(name="azureStorageSid", required=true)
      private final Input<String> azureStorageSid;

    public Input<String> getAzureStorageSid() {
        return this.azureStorageSid;
    }

    /**
     * Specifies the domain GUID.
     * 
     */
    @InputImport(name="domainGuid", required=true)
      private final Input<String> domainGuid;

    public Input<String> getDomainGuid() {
        return this.domainGuid;
    }

    /**
     * Specifies the primary domain that the AD DNS server is authoritative for.
     * 
     */
    @InputImport(name="domainName", required=true)
      private final Input<String> domainName;

    public Input<String> getDomainName() {
        return this.domainName;
    }

    /**
     * Specifies the security identifier (SID).
     * 
     */
    @InputImport(name="domainSid", required=true)
      private final Input<String> domainSid;

    public Input<String> getDomainSid() {
        return this.domainSid;
    }

    /**
     * Specifies the Active Directory forest to get.
     * 
     */
    @InputImport(name="forestName", required=true)
      private final Input<String> forestName;

    public Input<String> getForestName() {
        return this.forestName;
    }

    /**
     * Specifies the NetBIOS domain name.
     * 
     */
    @InputImport(name="netBiosDomainName", required=true)
      private final Input<String> netBiosDomainName;

    public Input<String> getNetBiosDomainName() {
        return this.netBiosDomainName;
    }

    public ActiveDirectoryPropertiesArgs(
        Input<String> azureStorageSid,
        Input<String> domainGuid,
        Input<String> domainName,
        Input<String> domainSid,
        Input<String> forestName,
        Input<String> netBiosDomainName) {
        this.azureStorageSid = Objects.requireNonNull(azureStorageSid, "expected parameter 'azureStorageSid' to be non-null");
        this.domainGuid = Objects.requireNonNull(domainGuid, "expected parameter 'domainGuid' to be non-null");
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.domainSid = Objects.requireNonNull(domainSid, "expected parameter 'domainSid' to be non-null");
        this.forestName = Objects.requireNonNull(forestName, "expected parameter 'forestName' to be non-null");
        this.netBiosDomainName = Objects.requireNonNull(netBiosDomainName, "expected parameter 'netBiosDomainName' to be non-null");
    }

    private ActiveDirectoryPropertiesArgs() {
        this.azureStorageSid = Input.empty();
        this.domainGuid = Input.empty();
        this.domainName = Input.empty();
        this.domainSid = Input.empty();
        this.forestName = Input.empty();
        this.netBiosDomainName = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActiveDirectoryPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> azureStorageSid;
        private Input<String> domainGuid;
        private Input<String> domainName;
        private Input<String> domainSid;
        private Input<String> forestName;
        private Input<String> netBiosDomainName;

        public Builder() {
    	      // Empty
        }

        public Builder(ActiveDirectoryPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureStorageSid = defaults.azureStorageSid;
    	      this.domainGuid = defaults.domainGuid;
    	      this.domainName = defaults.domainName;
    	      this.domainSid = defaults.domainSid;
    	      this.forestName = defaults.forestName;
    	      this.netBiosDomainName = defaults.netBiosDomainName;
        }

        public Builder setAzureStorageSid(Input<String> azureStorageSid) {
            this.azureStorageSid = Objects.requireNonNull(azureStorageSid);
            return this;
        }

        public Builder setAzureStorageSid(String azureStorageSid) {
            this.azureStorageSid = Input.of(Objects.requireNonNull(azureStorageSid));
            return this;
        }

        public Builder setDomainGuid(Input<String> domainGuid) {
            this.domainGuid = Objects.requireNonNull(domainGuid);
            return this;
        }

        public Builder setDomainGuid(String domainGuid) {
            this.domainGuid = Input.of(Objects.requireNonNull(domainGuid));
            return this;
        }

        public Builder setDomainName(Input<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Input.of(Objects.requireNonNull(domainName));
            return this;
        }

        public Builder setDomainSid(Input<String> domainSid) {
            this.domainSid = Objects.requireNonNull(domainSid);
            return this;
        }

        public Builder setDomainSid(String domainSid) {
            this.domainSid = Input.of(Objects.requireNonNull(domainSid));
            return this;
        }

        public Builder setForestName(Input<String> forestName) {
            this.forestName = Objects.requireNonNull(forestName);
            return this;
        }

        public Builder setForestName(String forestName) {
            this.forestName = Input.of(Objects.requireNonNull(forestName));
            return this;
        }

        public Builder setNetBiosDomainName(Input<String> netBiosDomainName) {
            this.netBiosDomainName = Objects.requireNonNull(netBiosDomainName);
            return this;
        }

        public Builder setNetBiosDomainName(String netBiosDomainName) {
            this.netBiosDomainName = Input.of(Objects.requireNonNull(netBiosDomainName));
            return this;
        }
        public ActiveDirectoryPropertiesArgs build() {
            return new ActiveDirectoryPropertiesArgs(azureStorageSid, domainGuid, domainName, domainSid, forestName, netBiosDomainName);
        }
    }
}
