// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.quantum.inputs;

import io.pulumi.azurenative.quantum.enums.ResourceIdentityType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class QuantumWorkspaceIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final QuantumWorkspaceIdentityArgs Empty = new QuantumWorkspaceIdentityArgs();

    @InputImport(name="type")
    private final @Nullable Input<Either<String,ResourceIdentityType>> type;

    public Input<Either<String,ResourceIdentityType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public QuantumWorkspaceIdentityArgs(@Nullable Input<Either<String,ResourceIdentityType>> type) {
        this.type = type;
    }

    private QuantumWorkspaceIdentityArgs() {
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(QuantumWorkspaceIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,ResourceIdentityType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(QuantumWorkspaceIdentityArgs defaults) {
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

        public QuantumWorkspaceIdentityArgs build() {
            return new QuantumWorkspaceIdentityArgs(type);
        }
    }
}
