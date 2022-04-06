// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.appmesh.inputs;

import io.pulumi.aws.appmesh.inputs.VirtualNodeSpecBackendDefaultsClientPolicyGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualNodeSpecBackendDefaultsGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualNodeSpecBackendDefaultsGetArgs Empty = new VirtualNodeSpecBackendDefaultsGetArgs();

    /**
     * The default client policy for virtual service backends. See above for details.
     * 
     */
    @Import(name="clientPolicy")
      private final @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyGetArgs> clientPolicy;

    public Output<VirtualNodeSpecBackendDefaultsClientPolicyGetArgs> getClientPolicy() {
        return this.clientPolicy == null ? Output.empty() : this.clientPolicy;
    }

    public VirtualNodeSpecBackendDefaultsGetArgs(@Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyGetArgs> clientPolicy) {
        this.clientPolicy = clientPolicy;
    }

    private VirtualNodeSpecBackendDefaultsGetArgs() {
        this.clientPolicy = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNodeSpecBackendDefaultsGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyGetArgs> clientPolicy;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNodeSpecBackendDefaultsGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientPolicy = defaults.clientPolicy;
        }

        public Builder clientPolicy(@Nullable Output<VirtualNodeSpecBackendDefaultsClientPolicyGetArgs> clientPolicy) {
            this.clientPolicy = clientPolicy;
            return this;
        }
        public Builder clientPolicy(@Nullable VirtualNodeSpecBackendDefaultsClientPolicyGetArgs clientPolicy) {
            this.clientPolicy = Output.ofNullable(clientPolicy);
            return this;
        }        public VirtualNodeSpecBackendDefaultsGetArgs build() {
            return new VirtualNodeSpecBackendDefaultsGetArgs(clientPolicy);
        }
    }
}