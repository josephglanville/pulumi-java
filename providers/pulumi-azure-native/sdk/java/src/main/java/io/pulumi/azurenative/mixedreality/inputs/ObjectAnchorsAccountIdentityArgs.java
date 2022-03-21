// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.mixedreality.inputs;

import io.pulumi.azurenative.mixedreality.enums.ResourceIdentityType;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ObjectAnchorsAccountIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ObjectAnchorsAccountIdentityArgs Empty = new ObjectAnchorsAccountIdentityArgs();

    /**
     * The identity type.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<ResourceIdentityType> type;

    public Output<ResourceIdentityType> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public ObjectAnchorsAccountIdentityArgs(@Nullable Output<ResourceIdentityType> type) {
        this.type = type;
    }

    private ObjectAnchorsAccountIdentityArgs() {
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ObjectAnchorsAccountIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<ResourceIdentityType> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ObjectAnchorsAccountIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable Output<ResourceIdentityType> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable ResourceIdentityType type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public ObjectAnchorsAccountIdentityArgs build() {
            return new ObjectAnchorsAccountIdentityArgs(type);
        }
    }
}
