// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.web;

import io.pulumi.azurenative.web.enums.AzureResourceType;
import io.pulumi.azurenative.web.enums.CustomHostNameDnsRecordType;
import io.pulumi.azurenative.web.enums.HostNameType;
import io.pulumi.azurenative.web.enums.SslState;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class WebAppHostNameBindingSlotArgs extends io.pulumi.resources.ResourceArgs {

    public static final WebAppHostNameBindingSlotArgs Empty = new WebAppHostNameBindingSlotArgs();

    /**
     * Azure resource name.
     * 
     */
    @Import(name="azureResourceName")
      private final @Nullable Output<String> azureResourceName;

    public Output<String> getAzureResourceName() {
        return this.azureResourceName == null ? Codegen.empty() : this.azureResourceName;
    }

    /**
     * Azure resource type.
     * 
     */
    @Import(name="azureResourceType")
      private final @Nullable Output<AzureResourceType> azureResourceType;

    public Output<AzureResourceType> getAzureResourceType() {
        return this.azureResourceType == null ? Codegen.empty() : this.azureResourceType;
    }

    /**
     * Custom DNS record type.
     * 
     */
    @Import(name="customHostNameDnsRecordType")
      private final @Nullable Output<CustomHostNameDnsRecordType> customHostNameDnsRecordType;

    public Output<CustomHostNameDnsRecordType> getCustomHostNameDnsRecordType() {
        return this.customHostNameDnsRecordType == null ? Codegen.empty() : this.customHostNameDnsRecordType;
    }

    /**
     * Fully qualified ARM domain resource URI.
     * 
     */
    @Import(name="domainId")
      private final @Nullable Output<String> domainId;

    public Output<String> getDomainId() {
        return this.domainId == null ? Codegen.empty() : this.domainId;
    }

    /**
     * Hostname in the hostname binding.
     * 
     */
    @Import(name="hostName")
      private final @Nullable Output<String> hostName;

    public Output<String> getHostName() {
        return this.hostName == null ? Codegen.empty() : this.hostName;
    }

    /**
     * Hostname type.
     * 
     */
    @Import(name="hostNameType")
      private final @Nullable Output<HostNameType> hostNameType;

    public Output<HostNameType> getHostNameType() {
        return this.hostNameType == null ? Codegen.empty() : this.hostNameType;
    }

    /**
     * Kind of resource.
     * 
     */
    @Import(name="kind")
      private final @Nullable Output<String> kind;

    public Output<String> getKind() {
        return this.kind == null ? Codegen.empty() : this.kind;
    }

    /**
     * Name of the app.
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Name of the resource group to which the resource belongs.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * App Service app name.
     * 
     */
    @Import(name="siteName")
      private final @Nullable Output<String> siteName;

    public Output<String> getSiteName() {
        return this.siteName == null ? Codegen.empty() : this.siteName;
    }

    /**
     * Name of the deployment slot. If a slot is not specified, the API will create a binding for the production slot.
     * 
     */
    @Import(name="slot", required=true)
      private final Output<String> slot;

    public Output<String> getSlot() {
        return this.slot;
    }

    /**
     * SSL type
     * 
     */
    @Import(name="sslState")
      private final @Nullable Output<SslState> sslState;

    public Output<SslState> getSslState() {
        return this.sslState == null ? Codegen.empty() : this.sslState;
    }

    /**
     * SSL certificate thumbprint
     * 
     */
    @Import(name="thumbprint")
      private final @Nullable Output<String> thumbprint;

    public Output<String> getThumbprint() {
        return this.thumbprint == null ? Codegen.empty() : this.thumbprint;
    }

    public WebAppHostNameBindingSlotArgs(
        @Nullable Output<String> azureResourceName,
        @Nullable Output<AzureResourceType> azureResourceType,
        @Nullable Output<CustomHostNameDnsRecordType> customHostNameDnsRecordType,
        @Nullable Output<String> domainId,
        @Nullable Output<String> hostName,
        @Nullable Output<HostNameType> hostNameType,
        @Nullable Output<String> kind,
        Output<String> name,
        Output<String> resourceGroupName,
        @Nullable Output<String> siteName,
        Output<String> slot,
        @Nullable Output<SslState> sslState,
        @Nullable Output<String> thumbprint) {
        this.azureResourceName = azureResourceName;
        this.azureResourceType = azureResourceType;
        this.customHostNameDnsRecordType = customHostNameDnsRecordType;
        this.domainId = domainId;
        this.hostName = hostName;
        this.hostNameType = hostNameType;
        this.kind = kind;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.siteName = siteName;
        this.slot = Objects.requireNonNull(slot, "expected parameter 'slot' to be non-null");
        this.sslState = sslState;
        this.thumbprint = thumbprint;
    }

    private WebAppHostNameBindingSlotArgs() {
        this.azureResourceName = Codegen.empty();
        this.azureResourceType = Codegen.empty();
        this.customHostNameDnsRecordType = Codegen.empty();
        this.domainId = Codegen.empty();
        this.hostName = Codegen.empty();
        this.hostNameType = Codegen.empty();
        this.kind = Codegen.empty();
        this.name = Codegen.empty();
        this.resourceGroupName = Codegen.empty();
        this.siteName = Codegen.empty();
        this.slot = Codegen.empty();
        this.sslState = Codegen.empty();
        this.thumbprint = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WebAppHostNameBindingSlotArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> azureResourceName;
        private @Nullable Output<AzureResourceType> azureResourceType;
        private @Nullable Output<CustomHostNameDnsRecordType> customHostNameDnsRecordType;
        private @Nullable Output<String> domainId;
        private @Nullable Output<String> hostName;
        private @Nullable Output<HostNameType> hostNameType;
        private @Nullable Output<String> kind;
        private Output<String> name;
        private Output<String> resourceGroupName;
        private @Nullable Output<String> siteName;
        private Output<String> slot;
        private @Nullable Output<SslState> sslState;
        private @Nullable Output<String> thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(WebAppHostNameBindingSlotArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.azureResourceName = defaults.azureResourceName;
    	      this.azureResourceType = defaults.azureResourceType;
    	      this.customHostNameDnsRecordType = defaults.customHostNameDnsRecordType;
    	      this.domainId = defaults.domainId;
    	      this.hostName = defaults.hostName;
    	      this.hostNameType = defaults.hostNameType;
    	      this.kind = defaults.kind;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.siteName = defaults.siteName;
    	      this.slot = defaults.slot;
    	      this.sslState = defaults.sslState;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder azureResourceName(@Nullable Output<String> azureResourceName) {
            this.azureResourceName = azureResourceName;
            return this;
        }
        public Builder azureResourceName(@Nullable String azureResourceName) {
            this.azureResourceName = Codegen.ofNullable(azureResourceName);
            return this;
        }
        public Builder azureResourceType(@Nullable Output<AzureResourceType> azureResourceType) {
            this.azureResourceType = azureResourceType;
            return this;
        }
        public Builder azureResourceType(@Nullable AzureResourceType azureResourceType) {
            this.azureResourceType = Codegen.ofNullable(azureResourceType);
            return this;
        }
        public Builder customHostNameDnsRecordType(@Nullable Output<CustomHostNameDnsRecordType> customHostNameDnsRecordType) {
            this.customHostNameDnsRecordType = customHostNameDnsRecordType;
            return this;
        }
        public Builder customHostNameDnsRecordType(@Nullable CustomHostNameDnsRecordType customHostNameDnsRecordType) {
            this.customHostNameDnsRecordType = Codegen.ofNullable(customHostNameDnsRecordType);
            return this;
        }
        public Builder domainId(@Nullable Output<String> domainId) {
            this.domainId = domainId;
            return this;
        }
        public Builder domainId(@Nullable String domainId) {
            this.domainId = Codegen.ofNullable(domainId);
            return this;
        }
        public Builder hostName(@Nullable Output<String> hostName) {
            this.hostName = hostName;
            return this;
        }
        public Builder hostName(@Nullable String hostName) {
            this.hostName = Codegen.ofNullable(hostName);
            return this;
        }
        public Builder hostNameType(@Nullable Output<HostNameType> hostNameType) {
            this.hostNameType = hostNameType;
            return this;
        }
        public Builder hostNameType(@Nullable HostNameType hostNameType) {
            this.hostNameType = Codegen.ofNullable(hostNameType);
            return this;
        }
        public Builder kind(@Nullable Output<String> kind) {
            this.kind = kind;
            return this;
        }
        public Builder kind(@Nullable String kind) {
            this.kind = Codegen.ofNullable(kind);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder siteName(@Nullable Output<String> siteName) {
            this.siteName = siteName;
            return this;
        }
        public Builder siteName(@Nullable String siteName) {
            this.siteName = Codegen.ofNullable(siteName);
            return this;
        }
        public Builder slot(Output<String> slot) {
            this.slot = Objects.requireNonNull(slot);
            return this;
        }
        public Builder slot(String slot) {
            this.slot = Output.of(Objects.requireNonNull(slot));
            return this;
        }
        public Builder sslState(@Nullable Output<SslState> sslState) {
            this.sslState = sslState;
            return this;
        }
        public Builder sslState(@Nullable SslState sslState) {
            this.sslState = Codegen.ofNullable(sslState);
            return this;
        }
        public Builder thumbprint(@Nullable Output<String> thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }
        public Builder thumbprint(@Nullable String thumbprint) {
            this.thumbprint = Codegen.ofNullable(thumbprint);
            return this;
        }        public WebAppHostNameBindingSlotArgs build() {
            return new WebAppHostNameBindingSlotArgs(azureResourceName, azureResourceType, customHostNameDnsRecordType, domainId, hostName, hostNameType, kind, name, resourceGroupName, siteName, slot, sslState, thumbprint);
        }
    }
}
