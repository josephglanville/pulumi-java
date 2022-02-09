// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class ManagedVirtualNetworkReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedVirtualNetworkReferenceArgs Empty = new ManagedVirtualNetworkReferenceArgs();

    @InputImport(name="referenceName", required=true)
    private final Input<String> referenceName;

    public Input<String> getReferenceName() {
        return this.referenceName;
    }

    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public ManagedVirtualNetworkReferenceArgs(
        Input<String> referenceName,
        Input<String> type) {
        this.referenceName = Objects.requireNonNull(referenceName, "expected parameter 'referenceName' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private ManagedVirtualNetworkReferenceArgs() {
        this.referenceName = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedVirtualNetworkReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> referenceName;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedVirtualNetworkReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.referenceName = defaults.referenceName;
    	      this.type = defaults.type;
        }

        public Builder setReferenceName(Input<String> referenceName) {
            this.referenceName = Objects.requireNonNull(referenceName);
            return this;
        }

        public Builder setReferenceName(String referenceName) {
            this.referenceName = Input.of(Objects.requireNonNull(referenceName));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public ManagedVirtualNetworkReferenceArgs build() {
            return new ManagedVirtualNetworkReferenceArgs(referenceName, type);
        }
    }
}
