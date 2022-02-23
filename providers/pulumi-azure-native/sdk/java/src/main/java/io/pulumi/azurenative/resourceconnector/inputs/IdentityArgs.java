// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.resourceconnector.inputs;

import io.pulumi.azurenative.resourceconnector.enums.ResourceIdentityType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Identity for the resource.
 * 
 */
public final class IdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityArgs Empty = new IdentityArgs();

    /**
     * The identity type.
     * 
     */
    @InputImport(name="type")
      private final @Nullable Input<Either<String,ResourceIdentityType>> type;

    public Input<Either<String,ResourceIdentityType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public IdentityArgs(@Nullable Input<Either<String,ResourceIdentityType>> type) {
        this.type = type;
    }

    private IdentityArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ResourceIdentityType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder setType(@Nullable Input<Either<String,ResourceIdentityType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,ResourceIdentityType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }
        public IdentityArgs build() {
            return new IdentityArgs(type);
        }
    }
}
