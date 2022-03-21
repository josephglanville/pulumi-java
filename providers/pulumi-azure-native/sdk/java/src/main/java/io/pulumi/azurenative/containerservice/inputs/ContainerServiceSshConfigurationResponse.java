// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.azurenative.containerservice.inputs.ContainerServiceSshPublicKeyResponse;
import io.pulumi.core.annotations.Import;
import java.util.List;
import java.util.Objects;


/**
 * SSH configuration for Linux-based VMs running on Azure.
 * 
 */
public final class ContainerServiceSshConfigurationResponse extends io.pulumi.resources.InvokeArgs {

    public static final ContainerServiceSshConfigurationResponse Empty = new ContainerServiceSshConfigurationResponse();

    /**
     * The list of SSH public keys used to authenticate with Linux-based VMs. Only expect one key specified.
     * 
     */
    @Import(name="publicKeys", required=true)
      private final List<ContainerServiceSshPublicKeyResponse> publicKeys;

    public List<ContainerServiceSshPublicKeyResponse> getPublicKeys() {
        return this.publicKeys;
    }

    public ContainerServiceSshConfigurationResponse(List<ContainerServiceSshPublicKeyResponse> publicKeys) {
        this.publicKeys = Objects.requireNonNull(publicKeys, "expected parameter 'publicKeys' to be non-null");
    }

    private ContainerServiceSshConfigurationResponse() {
        this.publicKeys = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerServiceSshConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<ContainerServiceSshPublicKeyResponse> publicKeys;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerServiceSshConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.publicKeys = defaults.publicKeys;
        }

        public Builder publicKeys(List<ContainerServiceSshPublicKeyResponse> publicKeys) {
            this.publicKeys = Objects.requireNonNull(publicKeys);
            return this;
        }
        public Builder publicKeys(ContainerServiceSshPublicKeyResponse... publicKeys) {
            return publicKeys(List.of(publicKeys));
        }        public ContainerServiceSshConfigurationResponse build() {
            return new ContainerServiceSshConfigurationResponse(publicKeys);
        }
    }
}
