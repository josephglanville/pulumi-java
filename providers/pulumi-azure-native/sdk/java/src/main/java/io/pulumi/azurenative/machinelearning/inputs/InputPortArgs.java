// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.machinelearning.inputs;

import io.pulumi.azurenative.machinelearning.enums.InputPortType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Asset input port
 * 
 */
public final class InputPortArgs extends io.pulumi.resources.ResourceArgs {

    public static final InputPortArgs Empty = new InputPortArgs();

    /**
     * Port data type.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,InputPortType>> type;

    public Output<Either<String,InputPortType>> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public InputPortArgs(@Nullable Output<Either<String,InputPortType>> type) {
        this.type = type == null ? Output.ofLeft("Dataset") : type;
    }

    private InputPortArgs() {
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InputPortArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,InputPortType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(InputPortArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable Output<Either<String,InputPortType>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,InputPortType> type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public InputPortArgs build() {
            return new InputPortArgs(type);
        }
    }
}
