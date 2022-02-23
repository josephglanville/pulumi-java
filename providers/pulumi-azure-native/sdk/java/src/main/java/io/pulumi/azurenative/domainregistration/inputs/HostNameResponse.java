// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.domainregistration.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Details of a hostname derived from a domain.
 * 
 */
public final class HostNameResponse extends io.pulumi.resources.InvokeArgs {

    public static final HostNameResponse Empty = new HostNameResponse();

    /**
     * Name of the Azure resource the hostname is assigned to. If it is assigned to a Traffic Manager then it will be the Traffic Manager name otherwise it will be the app name.
     * 
     */
    @InputImport(name="azureResourceName")
      private final @Nullable String azureResourceName;

    public Optional<String> getAzureResourceName() {
        return this.azureResourceName == null ? Optional.empty() : Optional.ofNullable(this.azureResourceName);
    }

    /**
     * Type of the Azure resource the hostname is assigned to.
     * 
     */
    @InputImport(name="azureResourceType")
      private final @Nullable String azureResourceType;

    public Optional<String> getAzureResourceType() {
        return this.azureResourceType == null ? Optional.empty() : Optional.ofNullable(this.azureResourceType);
    }

    /**
     * Type of the DNS record.
     * 
     */
    @InputImport(name="customHostNameDnsRecordType")
      private final @Nullable String customHostNameDnsRecordType;

    public Optional<String> getCustomHostNameDnsRecordType() {
        return this.customHostNameDnsRecordType == null ? Optional.empty() : Optional.ofNullable(this.customHostNameDnsRecordType);
    }

    /**
     * Type of the hostname.
     * 
     */
    @InputImport(name="hostNameType")
      private final @Nullable String hostNameType;

    public Optional<String> getHostNameType() {
        return this.hostNameType == null ? Optional.empty() : Optional.ofNullable(this.hostNameType);
    }

    /**
     * Name of the hostname.
     * 
     */
    @InputImport(name="name")
      private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * List of apps the hostname is assigned to. This list will have more than one app only if the hostname is pointing to a Traffic Manager.
     * 
     */
    @InputImport(name="siteNames")
      private final @Nullable List<String> siteNames;

    public List<String> getSiteNames() {
        return this.siteNames == null ? List.of() : this.siteNames;
    }

    public HostNameResponse(
        @Nullable String azureResourceName,
        @Nullable String azureResourceType,
        @Nullable String customHostNameDnsRecordType,
        @Nullable String hostNameType,
        @Nullable String name,
        @Nullable List<String> siteNames) {
        this.azureResourceName = azureResourceName;
        this.azureResourceType = azureResourceType;
        this.customHostNameDnsRecordType = customHostNameDnsRecordType;
        this.hostNameType = hostNameType;
        this.name = name;
        this.siteNames = siteNames;
    }

    private HostNameResponse() {
        this.azureResourceName = null;
        this.azureResourceType = null;
        this.customHostNameDnsRecordType = null;
        this.hostNameType = null;
        this.name = null;
        this.siteNames = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HostNameResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String azureResourceName;
        private @Nullable String azureResourceType;
        private @Nullable String customHostNameDnsRecordType;
        private @Nullable String hostNameType;
        private @Nullable String name;
        private @Nullable List<String> siteNames;

        public Builder() {
    	      // Empty
        }

        public Builder(HostNameResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureResourceName = defaults.azureResourceName;
    	      this.azureResourceType = defaults.azureResourceType;
    	      this.customHostNameDnsRecordType = defaults.customHostNameDnsRecordType;
    	      this.hostNameType = defaults.hostNameType;
    	      this.name = defaults.name;
    	      this.siteNames = defaults.siteNames;
        }

        public Builder setAzureResourceName(@Nullable String azureResourceName) {
            this.azureResourceName = azureResourceName;
            return this;
        }

        public Builder setAzureResourceType(@Nullable String azureResourceType) {
            this.azureResourceType = azureResourceType;
            return this;
        }

        public Builder setCustomHostNameDnsRecordType(@Nullable String customHostNameDnsRecordType) {
            this.customHostNameDnsRecordType = customHostNameDnsRecordType;
            return this;
        }

        public Builder setHostNameType(@Nullable String hostNameType) {
            this.hostNameType = hostNameType;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setSiteNames(@Nullable List<String> siteNames) {
            this.siteNames = siteNames;
            return this;
        }
        public HostNameResponse build() {
            return new HostNameResponse(azureResourceName, azureResourceType, customHostNameDnsRecordType, hostNameType, name, siteNames);
        }
    }
}
