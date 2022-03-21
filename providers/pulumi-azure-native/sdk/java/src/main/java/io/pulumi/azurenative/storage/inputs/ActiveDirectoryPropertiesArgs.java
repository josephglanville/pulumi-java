// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="azureStorageSid", required=true)
      private final Output<String> azureStorageSid;

    public Output<String> getAzureStorageSid() {
        return this.azureStorageSid;
    }

    /**
     * Specifies the domain GUID.
     * 
     */
    @Import(name="domainGuid", required=true)
      private final Output<String> domainGuid;

    public Output<String> getDomainGuid() {
        return this.domainGuid;
    }

    /**
     * Specifies the primary domain that the AD DNS server is authoritative for.
     * 
     */
    @Import(name="domainName", required=true)
      private final Output<String> domainName;

    public Output<String> getDomainName() {
        return this.domainName;
    }

    /**
     * Specifies the security identifier (SID).
     * 
     */
    @Import(name="domainSid", required=true)
      private final Output<String> domainSid;

    public Output<String> getDomainSid() {
        return this.domainSid;
    }

    /**
     * Specifies the Active Directory forest to get.
     * 
     */
    @Import(name="forestName", required=true)
      private final Output<String> forestName;

    public Output<String> getForestName() {
        return this.forestName;
    }

    /**
     * Specifies the NetBIOS domain name.
     * 
     */
    @Import(name="netBiosDomainName", required=true)
      private final Output<String> netBiosDomainName;

    public Output<String> getNetBiosDomainName() {
        return this.netBiosDomainName;
    }

    public ActiveDirectoryPropertiesArgs(
        Output<String> azureStorageSid,
        Output<String> domainGuid,
        Output<String> domainName,
        Output<String> domainSid,
        Output<String> forestName,
        Output<String> netBiosDomainName) {
        this.azureStorageSid = Objects.requireNonNull(azureStorageSid, "expected parameter 'azureStorageSid' to be non-null");
        this.domainGuid = Objects.requireNonNull(domainGuid, "expected parameter 'domainGuid' to be non-null");
        this.domainName = Objects.requireNonNull(domainName, "expected parameter 'domainName' to be non-null");
        this.domainSid = Objects.requireNonNull(domainSid, "expected parameter 'domainSid' to be non-null");
        this.forestName = Objects.requireNonNull(forestName, "expected parameter 'forestName' to be non-null");
        this.netBiosDomainName = Objects.requireNonNull(netBiosDomainName, "expected parameter 'netBiosDomainName' to be non-null");
    }

    private ActiveDirectoryPropertiesArgs() {
        this.azureStorageSid = Output.empty();
        this.domainGuid = Output.empty();
        this.domainName = Output.empty();
        this.domainSid = Output.empty();
        this.forestName = Output.empty();
        this.netBiosDomainName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ActiveDirectoryPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> azureStorageSid;
        private Output<String> domainGuid;
        private Output<String> domainName;
        private Output<String> domainSid;
        private Output<String> forestName;
        private Output<String> netBiosDomainName;

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

        public Builder azureStorageSid(Output<String> azureStorageSid) {
            this.azureStorageSid = Objects.requireNonNull(azureStorageSid);
            return this;
        }
        public Builder azureStorageSid(String azureStorageSid) {
            this.azureStorageSid = Output.of(Objects.requireNonNull(azureStorageSid));
            return this;
        }
        public Builder domainGuid(Output<String> domainGuid) {
            this.domainGuid = Objects.requireNonNull(domainGuid);
            return this;
        }
        public Builder domainGuid(String domainGuid) {
            this.domainGuid = Output.of(Objects.requireNonNull(domainGuid));
            return this;
        }
        public Builder domainName(Output<String> domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }
        public Builder domainName(String domainName) {
            this.domainName = Output.of(Objects.requireNonNull(domainName));
            return this;
        }
        public Builder domainSid(Output<String> domainSid) {
            this.domainSid = Objects.requireNonNull(domainSid);
            return this;
        }
        public Builder domainSid(String domainSid) {
            this.domainSid = Output.of(Objects.requireNonNull(domainSid));
            return this;
        }
        public Builder forestName(Output<String> forestName) {
            this.forestName = Objects.requireNonNull(forestName);
            return this;
        }
        public Builder forestName(String forestName) {
            this.forestName = Output.of(Objects.requireNonNull(forestName));
            return this;
        }
        public Builder netBiosDomainName(Output<String> netBiosDomainName) {
            this.netBiosDomainName = Objects.requireNonNull(netBiosDomainName);
            return this;
        }
        public Builder netBiosDomainName(String netBiosDomainName) {
            this.netBiosDomainName = Output.of(Objects.requireNonNull(netBiosDomainName));
            return this;
        }        public ActiveDirectoryPropertiesArgs build() {
            return new ActiveDirectoryPropertiesArgs(azureStorageSid, domainGuid, domainName, domainSid, forestName, netBiosDomainName);
        }
    }
}
