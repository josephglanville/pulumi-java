// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetes.inputs;

import io.pulumi.azurenative.kubernetes.enums.ResourceIdentityType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class ConnectedClusterIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ConnectedClusterIdentityArgs Empty = new ConnectedClusterIdentityArgs();

    @InputImport(name="type", required=true)
    private final Input<ResourceIdentityType> type;

    public Input<ResourceIdentityType> getType() {
        return this.type;
    }

    public ConnectedClusterIdentityArgs(Input<ResourceIdentityType> type) {
        this.type = type == null ? Input.ofNullable(io.pulumi.azurenative.kubernetes.enums.ResourceIdentityType.SystemAssigned) : Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ConnectedClusterIdentityArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ConnectedClusterIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ResourceIdentityType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ConnectedClusterIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(Input<ResourceIdentityType> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(ResourceIdentityType type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public ConnectedClusterIdentityArgs build() {
            return new ConnectedClusterIdentityArgs(type);
        }
    }
}