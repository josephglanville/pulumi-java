// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerinstance.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * The GPU resource.
 * 
 */
public final class GpuResourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final GpuResourceResponse Empty = new GpuResourceResponse();

    /**
     * The count of the GPU resource.
     * 
     */
    @InputImport(name="count", required=true)
      private final Integer count;

    public Integer getCount() {
        return this.count;
    }

    /**
     * The SKU of the GPU resource.
     * 
     */
    @InputImport(name="sku", required=true)
      private final String sku;

    public String getSku() {
        return this.sku;
    }

    public GpuResourceResponse(
        Integer count,
        String sku) {
        this.count = Objects.requireNonNull(count, "expected parameter 'count' to be non-null");
        this.sku = Objects.requireNonNull(sku, "expected parameter 'sku' to be non-null");
    }

    private GpuResourceResponse() {
        this.count = null;
        this.sku = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GpuResourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Integer count;
        private String sku;

        public Builder() {
    	      // Empty
        }

        public Builder(GpuResourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.count = defaults.count;
    	      this.sku = defaults.sku;
        }

        public Builder setCount(Integer count) {
            this.count = Objects.requireNonNull(count);
            return this;
        }

        public Builder setSku(String sku) {
            this.sku = Objects.requireNonNull(sku);
            return this;
        }
        public GpuResourceResponse build() {
            return new GpuResourceResponse(count, sku);
        }
    }
}
