// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs Empty = new VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs();

    @InputImport(name="domainNameLabel", required=true)
    private final Input<String> domainNameLabel;

    public Input<String> getDomainNameLabel() {
        return this.domainNameLabel;
    }

    public VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs(Input<String> domainNameLabel) {
        this.domainNameLabel = Objects.requireNonNull(domainNameLabel, "expected parameter 'domainNameLabel' to be non-null");
    }

    private VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs() {
        this.domainNameLabel = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> domainNameLabel;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs defaults) {
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

        public VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs build() {
            return new VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs(domainNameLabel);
        }
    }
}
