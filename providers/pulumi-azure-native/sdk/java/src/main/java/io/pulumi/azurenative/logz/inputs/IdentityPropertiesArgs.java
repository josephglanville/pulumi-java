// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.logz.inputs;

import io.pulumi.azurenative.logz.enums.ManagedIdentityTypes;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IdentityPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final IdentityPropertiesArgs Empty = new IdentityPropertiesArgs();

    @Import(name="type")
      private final @Nullable Output<Either<String,ManagedIdentityTypes>> type;

    public Output<Either<String,ManagedIdentityTypes>> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public IdentityPropertiesArgs(@Nullable Output<Either<String,ManagedIdentityTypes>> type) {
        this.type = type;
    }

    private IdentityPropertiesArgs() {
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,ManagedIdentityTypes>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(IdentityPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable Output<Either<String,ManagedIdentityTypes>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,ManagedIdentityTypes> type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public IdentityPropertiesArgs build() {
            return new IdentityPropertiesArgs(type);
        }
    }
}
