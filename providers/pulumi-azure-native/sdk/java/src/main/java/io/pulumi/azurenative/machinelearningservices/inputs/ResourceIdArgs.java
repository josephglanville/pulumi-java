// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearningservices.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a resource ID. For example, for a subnet, it is the resource URL for the subnet.
 * 
 */
public final class ResourceIdArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceIdArgs Empty = new ResourceIdArgs();

    /**
     * The ID of the resource
     * 
     */
    @InputImport(name="id", required=true)
      private final Input<String> id;

    public Input<String> getId() {
        return this.id;
    }

    public ResourceIdArgs(Input<String> id) {
        this.id = Objects.requireNonNull(id, "expected parameter 'id' to be non-null");
    }

    private ResourceIdArgs() {
        this.id = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceIdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> id;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceIdArgs defaults) {
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
        public ResourceIdArgs build() {
            return new ResourceIdArgs(id);
        }
    }
}
