// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ContainerGroupNetworkProfileArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContainerGroupNetworkProfileArgs Empty = new ContainerGroupNetworkProfileArgs();

    @InputImport(name="id", required=true)
    private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    public ContainerGroupNetworkProfileArgs(Input<String> id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private ContainerGroupNetworkProfileArgs() {
        this.id = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContainerGroupNetworkProfileArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(ContainerGroupNetworkProfileArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        public Builder setId(Input<String> id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setId(String id) {
            this.id = Input.of(Objects.requireNonNull(id));
            return this;
        }

        public ContainerGroupNetworkProfileArgs build() {
            return new ContainerGroupNetworkProfileArgs(id);
        }
    }
}