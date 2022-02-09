// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.enums.IntegrationRuntimeEntityReferenceType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EntityReferenceArgs extends io.pulumi.resources.ResourceArgs {

    public static final EntityReferenceArgs Empty = new EntityReferenceArgs();

    @InputImport(name="referenceName")
    private final @Nullable Input<String> referenceName;

    public Input<String> getReferenceName() {
        return this.referenceName == null ? Input.empty() : this.referenceName;
    }

    @InputImport(name="type")
    private final @Nullable Input<Either<String,IntegrationRuntimeEntityReferenceType>> type;

    public Input<Either<String,IntegrationRuntimeEntityReferenceType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    public EntityReferenceArgs(
        @Nullable Input<String> referenceName,
        @Nullable Input<Either<String,IntegrationRuntimeEntityReferenceType>> type) {
        this.referenceName = referenceName;
        this.type = type;
    }

    private EntityReferenceArgs() {
        this.referenceName = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EntityReferenceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> referenceName;
        private @Nullable Input<Either<String,IntegrationRuntimeEntityReferenceType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(EntityReferenceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.referenceName = defaults.referenceName;
    	      this.type = defaults.type;
        }

        public Builder setReferenceName(@Nullable Input<String> referenceName) {
            this.referenceName = referenceName;
            return this;
        }

        public Builder setReferenceName(@Nullable String referenceName) {
            this.referenceName = Input.ofNullable(referenceName);
            return this;
        }

        public Builder setType(@Nullable Input<Either<String,IntegrationRuntimeEntityReferenceType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,IntegrationRuntimeEntityReferenceType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public EntityReferenceArgs build() {
            return new EntityReferenceArgs(referenceName, type);
        }
    }
}
