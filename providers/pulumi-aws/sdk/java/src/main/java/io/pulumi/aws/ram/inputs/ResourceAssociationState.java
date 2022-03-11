// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.ram.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceAssociationState extends io.pulumi.resources.ResourceArgs {

    public static final ResourceAssociationState Empty = new ResourceAssociationState();

    /**
     * Amazon Resource Name (ARN) of the resource to associate with the RAM Resource Share.
     * 
     */
    @InputImport(name="resourceArn")
      private final @Nullable Output<String> resourceArn;

    public Output<String> getResourceArn() {
        return this.resourceArn == null ? Output.empty() : this.resourceArn;
    }

    /**
     * Amazon Resource Name (ARN) of the RAM Resource Share.
     * 
     */
    @InputImport(name="resourceShareArn")
      private final @Nullable Output<String> resourceShareArn;

    public Output<String> getResourceShareArn() {
        return this.resourceShareArn == null ? Output.empty() : this.resourceShareArn;
    }

    public ResourceAssociationState(
        @Nullable Output<String> resourceArn,
        @Nullable Output<String> resourceShareArn) {
        this.resourceArn = resourceArn;
        this.resourceShareArn = resourceShareArn;
    }

    private ResourceAssociationState() {
        this.resourceArn = Output.empty();
        this.resourceShareArn = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceAssociationState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> resourceArn;
        private @Nullable Output<String> resourceShareArn;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceAssociationState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.resourceArn = defaults.resourceArn;
    	      this.resourceShareArn = defaults.resourceShareArn;
        }

        public Builder resourceArn(@Nullable Output<String> resourceArn) {
            this.resourceArn = resourceArn;
            return this;
        }

        public Builder resourceArn(@Nullable String resourceArn) {
            this.resourceArn = Output.ofNullable(resourceArn);
            return this;
        }

        public Builder resourceShareArn(@Nullable Output<String> resourceShareArn) {
            this.resourceShareArn = resourceShareArn;
            return this;
        }

        public Builder resourceShareArn(@Nullable String resourceShareArn) {
            this.resourceShareArn = Output.ofNullable(resourceShareArn);
            return this;
        }
        public ResourceAssociationState build() {
            return new ResourceAssociationState(resourceArn, resourceShareArn);
        }
    }
}
