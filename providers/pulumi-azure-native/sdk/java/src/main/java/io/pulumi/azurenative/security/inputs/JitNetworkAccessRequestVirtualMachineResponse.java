// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.security.inputs;

import io.pulumi.azurenative.security.inputs.JitNetworkAccessRequestPortResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class JitNetworkAccessRequestVirtualMachineResponse extends io.pulumi.resources.InvokeArgs {

    public static final JitNetworkAccessRequestVirtualMachineResponse Empty = new JitNetworkAccessRequestVirtualMachineResponse();

    /**
     * Resource ID of the virtual machine that is linked to this policy
     * 
     */
    @InputImport(name="id", required=true)
      private final String id;

    public String getId() {
        return this.id;
    }

    /**
     * The ports that were opened for the virtual machine
     * 
     */
    @InputImport(name="ports", required=true)
      private final List<JitNetworkAccessRequestPortResponse> ports;

    public List<JitNetworkAccessRequestPortResponse> getPorts() {
        return this.ports;
    }

    public JitNetworkAccessRequestVirtualMachineResponse(
        String id,
        List<JitNetworkAccessRequestPortResponse> ports) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
        this.ports = Objects.requireNonNull(ports, "expected parameter 'ports' to be non-null");
    }

    private JitNetworkAccessRequestVirtualMachineResponse() {
        this.id = null;
        this.ports = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JitNetworkAccessRequestVirtualMachineResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private List<JitNetworkAccessRequestPortResponse> ports;

        public Builder() {
    	      // Empty
        }

        public Builder(JitNetworkAccessRequestVirtualMachineResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.ports = defaults.ports;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setPorts(List<JitNetworkAccessRequestPortResponse> ports) {
            this.ports = Objects.requireNonNull(ports);
            return this;
        }
        public JitNetworkAccessRequestVirtualMachineResponse build() {
            return new JitNetworkAccessRequestVirtualMachineResponse(id, ports);
        }
    }
}
