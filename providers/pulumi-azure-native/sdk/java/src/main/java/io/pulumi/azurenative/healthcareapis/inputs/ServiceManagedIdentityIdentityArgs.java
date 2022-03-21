// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.inputs;

import io.pulumi.azurenative.healthcareapis.enums.ManagedServiceIdentityType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Setting indicating whether the service has a managed identity associated with it.
 * 
 */
public final class ServiceManagedIdentityIdentityArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServiceManagedIdentityIdentityArgs Empty = new ServiceManagedIdentityIdentityArgs();

    /**
     * Type of identity being specified, currently SystemAssigned and None are allowed.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,ManagedServiceIdentityType>> type;

    public Output<Either<String,ManagedServiceIdentityType>> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public ServiceManagedIdentityIdentityArgs(@Nullable Output<Either<String,ManagedServiceIdentityType>> type) {
        this.type = type;
    }

    private ServiceManagedIdentityIdentityArgs() {
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceManagedIdentityIdentityArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Either<String,ManagedServiceIdentityType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ServiceManagedIdentityIdentityArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        public Builder type(@Nullable Output<Either<String,ManagedServiceIdentityType>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,ManagedServiceIdentityType> type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public ServiceManagedIdentityIdentityArgs build() {
            return new ServiceManagedIdentityIdentityArgs(type);
        }
    }
}
