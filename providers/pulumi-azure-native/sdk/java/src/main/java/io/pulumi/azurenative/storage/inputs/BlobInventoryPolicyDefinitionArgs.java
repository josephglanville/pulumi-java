// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storage.inputs;

import io.pulumi.azurenative.storage.inputs.BlobInventoryPolicyFilterArgs;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class BlobInventoryPolicyDefinitionArgs extends io.pulumi.resources.ResourceArgs {

    public static final BlobInventoryPolicyDefinitionArgs Empty = new BlobInventoryPolicyDefinitionArgs();

    @InputImport(name="filters", required=true)
    private final Input<BlobInventoryPolicyFilterArgs> filters;

    public Input<BlobInventoryPolicyFilterArgs> getFilters() {
        return this.filters;
    }

    public BlobInventoryPolicyDefinitionArgs(Input<BlobInventoryPolicyFilterArgs> filters) {
        this.filters = Objects.requireNonNull(filters, "expected parameter 'filters' to be non-null");
    }

    private BlobInventoryPolicyDefinitionArgs() {
        this.filters = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BlobInventoryPolicyDefinitionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<BlobInventoryPolicyFilterArgs> filters;

        public Builder() {
    	      // Empty
        }

        public Builder(BlobInventoryPolicyDefinitionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.filters = defaults.filters;
        }

        public Builder setFilters(Input<BlobInventoryPolicyFilterArgs> filters) {
            this.filters = Objects.requireNonNull(filters);
            return this;
        }

        public Builder setFilters(BlobInventoryPolicyFilterArgs filters) {
            this.filters = Input.of(Objects.requireNonNull(filters));
            return this;
        }

        public BlobInventoryPolicyDefinitionArgs build() {
            return new BlobInventoryPolicyDefinitionArgs(filters);
        }
    }
}
