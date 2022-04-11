// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.apimanagement.inputs;

import io.pulumi.azurenative.apimanagement.enums.SkuType;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * API Management service resource SKU properties.
 * 
 */
public final class ApiManagementServiceSkuPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApiManagementServiceSkuPropertiesArgs Empty = new ApiManagementServiceSkuPropertiesArgs();

    /**
     * Capacity of the SKU (number of deployed units of the SKU). For Consumption SKU capacity must be specified as 0.
     * 
     */
    @Import(name="capacity", required=true)
      private final Output<Integer> capacity;

    public Output<Integer> getCapacity() {
        return this.capacity;
    }

    /**
     * Name of the Sku.
     * 
     */
    @Import(name="name", required=true)
      private final Output<Either<String,SkuType>> name;

    public Output<Either<String,SkuType>> getName() {
        return this.name;
    }

    public ApiManagementServiceSkuPropertiesArgs(
        Output<Integer> capacity,
        Output<Either<String,SkuType>> name) {
        this.capacity = Objects.requireNonNull(capacity, "expected parameter 'capacity' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ApiManagementServiceSkuPropertiesArgs() {
        this.capacity = Codegen.empty();
        this.name = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApiManagementServiceSkuPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> capacity;
        private Output<Either<String,SkuType>> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ApiManagementServiceSkuPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
        }

        public Builder capacity(Output<Integer> capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }
        public Builder capacity(Integer capacity) {
            this.capacity = Output.of(Objects.requireNonNull(capacity));
            return this;
        }
        public Builder name(Output<Either<String,SkuType>> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(Either<String,SkuType> name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public ApiManagementServiceSkuPropertiesArgs build() {
            return new ApiManagementServiceSkuPropertiesArgs(capacity, name);
        }
    }
}
