// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a virtual machines network configuration's DNS settings.
 * 
 */
public final class VirtualMachinePublicIPAddressDnsSettingsConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualMachinePublicIPAddressDnsSettingsConfigurationResponse Empty = new VirtualMachinePublicIPAddressDnsSettingsConfigurationResponse();

    /**
     * The Domain name label prefix of the PublicIPAddress resources that will be created. The generated name label is the concatenation of the domain name label and vm network profile unique ID.
     * 
     */
    @InputImport(name="domainNameLabel", required=true)
      private final String domainNameLabel;

    public String getDomainNameLabel() {
        return this.domainNameLabel;
    }

    public VirtualMachinePublicIPAddressDnsSettingsConfigurationResponse(String domainNameLabel) {
        this.domainNameLabel = Objects.requireNonNull(domainNameLabel, "expected parameter 'domainNameLabel' to be non-null");
    }

    private VirtualMachinePublicIPAddressDnsSettingsConfigurationResponse() {
        this.domainNameLabel = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachinePublicIPAddressDnsSettingsConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainNameLabel;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachinePublicIPAddressDnsSettingsConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainNameLabel = defaults.domainNameLabel;
        }

        public Builder setDomainNameLabel(String domainNameLabel) {
            this.domainNameLabel = Objects.requireNonNull(domainNameLabel);
            return this;
        }
        public VirtualMachinePublicIPAddressDnsSettingsConfigurationResponse build() {
            return new VirtualMachinePublicIPAddressDnsSettingsConfigurationResponse(domainNameLabel);
        }
    }
}
