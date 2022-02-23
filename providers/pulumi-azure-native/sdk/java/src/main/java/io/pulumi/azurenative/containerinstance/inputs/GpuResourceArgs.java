// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.enums.GpuSku;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * The GPU resource.
 * 
 */
public final class GpuResourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final GpuResourceArgs Empty = new GpuResourceArgs();

    /**
     * The count of the GPU resource.
     * 
     */
    @InputImport(name="count", required=true)
      private final Input<Integer> count;

    public Input<Integer> getCount() {
        return this.count;
    }

    /**
     * The SKU of the GPU resource.
     * 
     */
    @InputImport(name="sku", required=true)
      private final Input<Either<String,GpuSku>> sku;

    public Input<Either<String,GpuSku>> getSku() {
        return this.sku;
    }

    public GpuResourceArgs(
        Input<Integer> count,
        Input<Either<String,GpuSku>> sku) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
    }

    private GpuResourceArgs() {
        this.count = Input.empty();
        this.sku = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GpuResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Integer> count;
        private Input<Either<String,GpuSku>> sku;

        public Builder() {
    	      // Empty
        }

        public Builder(GpuResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.sku = defaults.sku;
        }

        public Builder setCount(Input<Integer> count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setCount(Integer count) {
            this.count = Input.of(Objects.requireNonNull(count));
            return this;
        }

        public Builder setSku(Input<Either<String,GpuSku>> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }

        public Builder setSku(Either<String,GpuSku> sku) {
            this.sku = Input.of(Objects.requireNonNull(sku));
            return this;
        }
        public GpuResourceArgs build() {
            return new GpuResourceArgs(count, sku);
        }
    }
}
