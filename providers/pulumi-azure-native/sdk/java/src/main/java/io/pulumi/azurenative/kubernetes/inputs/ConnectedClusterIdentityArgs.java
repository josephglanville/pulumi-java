// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetes.inputs;

import io.pulumi.azurenative.kubernetes.enums.ResourceIdentityType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.util.Objects;


/**
 * Identity for the connected cluster.
 * 
 */
public final class ConnectedClusterIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectedClusterIdentityArgs Empty = new ConnectedClusterIdentityArgs();

    /**
     * The type of identity used for the connected cluster. The type 'SystemAssigned, includes a system created identity. The type 'None' means no identity is assigned to the connected cluster.
     * 
     */
    @Import(name="type", required=true)
      private final Output<ResourceIdentityType> type;

    public Output<ResourceIdentityType> getType() {
        return this.type;
    }

    public ConnectedClusterIdentityArgs(Output<ResourceIdentityType> type) {
        this.type = type == null ? Codegen.ofNullable(io.pulumi.azurenative.kubernetes.enums.ResourceIdentityType.SystemAssigned) : Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ConnectedClusterIdentityArgs() {
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectedClusterIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<ResourceIdentityType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectedClusterIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(Output<ResourceIdentityType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(ResourceIdentityType type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public ConnectedClusterIdentityArgs build() {
            return new ConnectedClusterIdentityArgs(type);
        }
    }
}
