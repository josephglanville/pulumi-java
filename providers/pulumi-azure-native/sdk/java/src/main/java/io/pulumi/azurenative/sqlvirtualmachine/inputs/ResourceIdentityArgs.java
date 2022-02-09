// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.sqlvirtualmachine.inputs;

import io.pulumi.azurenative.sqlvirtualmachine.enums.IdentityType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceIdentityArgs Empty = new ResourceIdentityArgs();

    @InputImport(name="type")
    private final @Nullable Input<Either<String,IdentityType>> type;

    public Input<Either<String,IdentityType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public ResourceIdentityArgs(@Nullable Input<Either<String,IdentityType>> type) {
        this.type = type;
    }

    private ResourceIdentityArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,IdentityType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable Input<Either<String,IdentityType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,IdentityType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public ResourceIdentityArgs build() {
            return new ResourceIdentityArgs(type);
        }
    }
}
