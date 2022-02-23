// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Describes a virtual machines scale sets network configuration's DNS settings.
 * 
 */
public final class VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsArgs Empty = new VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsArgs();

    /**
     * The Domain name label.The concatenation of the domain name label and vm index will be the domain name labels of the PublicIPAddress resources that will be created
     * 
     */
    @InputImport(name="domainNameLabel", required=true)
      private final Input<String> domainNameLabel;

    public Input<String> getDomainNameLabel() {
        return this.domainNameLabel;
    }

    public VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsArgs(Input<String> domainNameLabel) {
        this.domainNameLabel = Objects.requireNonNull(domainNameLabel, "expected parameter 'domainNameLabel' to be non-null");
    }

    private VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsArgs() {
        this.domainNameLabel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> domainNameLabel;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainNameLabel = defaults.domainNameLabel;
        }

        public Builder setDomainNameLabel(Input<String> domainNameLabel) {
            this.domainNameLabel = Objects.requireNonNull(domainNameLabel);
            return this;
        }

        public Builder setDomainNameLabel(String domainNameLabel) {
            this.domainNameLabel = Input.of(Objects.requireNonNull(domainNameLabel));
            return this;
        }
        public VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsArgs build() {
            return new VirtualMachineScaleSetPublicIPAddressConfigurationDnsSettingsArgs(domainNameLabel);
        }
    }
}
