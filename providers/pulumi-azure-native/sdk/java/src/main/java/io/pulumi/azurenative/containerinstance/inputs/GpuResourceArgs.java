// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.azurenative.containerinstance.enums.GpuSku;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
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
    @Import(name="count", required=true)
      private final Output<Integer> count;

    public Output<Integer> getCount() {
        return this.count;
    }

    /**
     * The SKU of the GPU resource.
     * 
     */
    @Import(name="sku", required=true)
      private final Output<Either<String,GpuSku>> sku;

    public Output<Either<String,GpuSku>> getSku() {
        return this.sku;
    }

    public GpuResourceArgs(
        Output<Integer> count,
        Output<Either<String,GpuSku>> sku) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
    }

    private GpuResourceArgs() {
        this.count = Output.empty();
        this.sku = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GpuResourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Integer> count;
        private Output<Either<String,GpuSku>> sku;

        public Builder() {
    	      // Empty
        }

        public Builder(GpuResourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.sku = defaults.sku;
        }

        public Builder count(Output<Integer> count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }
        public Builder count(Integer count) {
            this.count = Output.of(Objects.requireNonNull(count));
            return this;
        }
        public Builder sku(Output<Either<String,GpuSku>> sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public Builder sku(Either<String,GpuSku> sku) {
            this.sku = Output.of(Objects.requireNonNull(sku));
            return this;
        }        public GpuResourceArgs build() {
            return new GpuResourceArgs(count, sku);
        }
    }
}
