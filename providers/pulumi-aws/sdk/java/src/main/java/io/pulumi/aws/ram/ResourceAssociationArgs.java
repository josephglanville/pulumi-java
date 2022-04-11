// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ram;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;


public final class ResourceAssociationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceAssociationArgs Empty = new ResourceAssociationArgs();

    /**
     * Amazon Resource Name (ARN) of the resource to associate with the RAM Resource Share.
     * 
     */
    @Import(name="resourceArn", required=true)
      private final Output<String> resourceArn;

    public Output<String> getResourceArn() {
        return this.resourceArn;
    }

    /**
     * Amazon Resource Name (ARN) of the RAM Resource Share.
     * 
     */
    @Import(name="resourceShareArn", required=true)
      private final Output<String> resourceShareArn;

    public Output<String> getResourceShareArn() {
        return this.resourceShareArn;
    }

    public ResourceAssociationArgs(
        Output<String> resourceArn,
        Output<String> resourceShareArn) {
        this.resourceArn = Objects.requireNonNull(resourceArn, "expected parameter 'resourceArn' to be non-null");
        this.resourceShareArn = Objects.requireNonNull(resourceShareArn, "expected parameter 'resourceShareArn' to be non-null");
    }

    private ResourceAssociationArgs() {
        this.resourceArn = Codegen.empty();
        this.resourceShareArn = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceAssociationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> resourceArn;
        private Output<String> resourceShareArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceAssociationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
    	      this.resourceShareArn = defaults.resourceShareArn;
        }

        public Builder resourceArn(Output<String> resourceArn) {
            this.resourceArn = Objects.requireNonNull(resourceArn);
            return this;
        }
        public Builder resourceArn(String resourceArn) {
            this.resourceArn = Output.of(Objects.requireNonNull(resourceArn));
            return this;
        }
        public Builder resourceShareArn(Output<String> resourceShareArn) {
            this.resourceShareArn = Objects.requireNonNull(resourceShareArn);
            return this;
        }
        public Builder resourceShareArn(String resourceShareArn) {
            this.resourceShareArn = Output.of(Objects.requireNonNull(resourceShareArn));
            return this;
        }        public ResourceAssociationArgs build() {
            return new ResourceAssociationArgs(resourceArn, resourceShareArn);
        }
    }
}
