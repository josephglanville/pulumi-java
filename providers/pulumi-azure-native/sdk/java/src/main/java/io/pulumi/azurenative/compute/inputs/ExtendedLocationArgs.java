// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.ExtendedLocationTypes;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The complex type of the extended location.
 * 
 */
public final class ExtendedLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ExtendedLocationArgs Empty = new ExtendedLocationArgs();

    /**
     * The name of the extended location.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Codegen.empty() : this.name;
    }

    /**
     * The type of the extended location.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,ExtendedLocationTypes>> type;

    public Output<Either<String,ExtendedLocationTypes>> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public ExtendedLocationArgs(
        @Nullable Output<String> name,
        @Nullable Output<Either<String,ExtendedLocationTypes>> type) {
        this.name = name;
        this.type = type;
    }

    private ExtendedLocationArgs() {
        this.name = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtendedLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> name;
        private @Nullable Output<Either<String,ExtendedLocationTypes>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtendedLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.type = defaults.type;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder type(@Nullable Output<Either<String,ExtendedLocationTypes>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,ExtendedLocationTypes> type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public ExtendedLocationArgs build() {
            return new ExtendedLocationArgs(name, type);
        }
    }
}
