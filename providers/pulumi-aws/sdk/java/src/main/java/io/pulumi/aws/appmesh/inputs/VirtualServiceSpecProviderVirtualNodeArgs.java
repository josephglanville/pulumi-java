// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class VirtualServiceSpecProviderVirtualNodeArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualServiceSpecProviderVirtualNodeArgs Empty = new VirtualServiceSpecProviderVirtualNodeArgs();

    /**
     * The name of the virtual node that is acting as a service provider. Must be between 1 and 255 characters in length.
     * 
     */
    @Import(name="virtualNodeName", required=true)
      private final Output<String> virtualNodeName;

    public Output<String> getVirtualNodeName() {
        return this.virtualNodeName;
    }

    public VirtualServiceSpecProviderVirtualNodeArgs(Output<String> virtualNodeName) {
        this.virtualNodeName = Objects.requireNonNull(virtualNodeName, "expected parameter 'virtualNodeName' to be non-null");
    }

    private VirtualServiceSpecProviderVirtualNodeArgs() {
        this.virtualNodeName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualServiceSpecProviderVirtualNodeArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> virtualNodeName;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualServiceSpecProviderVirtualNodeArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.virtualNodeName = defaults.virtualNodeName;
        }

        public Builder virtualNodeName(Output<String> virtualNodeName) {
            this.virtualNodeName = Objects.requireNonNull(virtualNodeName);
            return this;
        }
        public Builder virtualNodeName(String virtualNodeName) {
            this.virtualNodeName = Output.of(Objects.requireNonNull(virtualNodeName));
            return this;
        }        public VirtualServiceSpecProviderVirtualNodeArgs build() {
            return new VirtualServiceSpecProviderVirtualNodeArgs(virtualNodeName);
        }
    }
}