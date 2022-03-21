// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.azurenative.webpubsub.enums.WebPubSubSkuTier;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The billing information of the resource.
 * 
 */
public final class ResourceSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceSkuArgs Empty = new ResourceSkuArgs();

    /**
     * Optional, integer. The unit count of the resource. 1 by default.
     * 
     * If present, following values are allowed:
     *     Free: 1
     *     Standard: 1,2,5,10,20,50,100
     * 
     */
    @Import(name="capacity")
      private final @Nullable Output<Integer> capacity;

    public Output<Integer> getCapacity() {
        return this.capacity == null ? Output.empty() : this.capacity;
    }

    /**
     * The name of the SKU. Required.
     * 
     * Allowed values: Standard_S1, Free_F1
     * 
     */
    @Import(name="name", required=true)
      private final Output<String> name;

    public Output<String> getName() {
        return this.name;
    }

    /**
     * Optional tier of this particular SKU. 'Standard' or 'Free'.
     * 
     * `Basic` is deprecated, use `Standard` instead.
     * 
     */
    @Import(name="tier")
      private final @Nullable Output<Either<String,WebPubSubSkuTier>> tier;

    public Output<Either<String,WebPubSubSkuTier>> getTier() {
        return this.tier == null ? Output.empty() : this.tier;
    }

    public ResourceSkuArgs(
        @Nullable Output<Integer> capacity,
        Output<String> name,
        @Nullable Output<Either<String,WebPubSubSkuTier>> tier) {
        this.capacity = capacity;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.tier = tier;
    }

    private ResourceSkuArgs() {
        this.capacity = Output.empty();
        this.name = Output.empty();
        this.tier = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> capacity;
        private Output<String> name;
        private @Nullable Output<Either<String,WebPubSubSkuTier>> tier;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.name = defaults.name;
    	      this.tier = defaults.tier;
        }

        public Builder capacity(@Nullable Output<Integer> capacity) {
            this.capacity = capacity;
            return this;
        }
        public Builder capacity(@Nullable Integer capacity) {
            this.capacity = Output.ofNullable(capacity);
            return this;
        }
        public Builder name(Output<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(String name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }
        public Builder tier(@Nullable Output<Either<String,WebPubSubSkuTier>> tier) {
            this.tier = tier;
            return this;
        }
        public Builder tier(@Nullable Either<String,WebPubSubSkuTier> tier) {
            this.tier = Output.ofNullable(tier);
            return this;
        }        public ResourceSkuArgs build() {
            return new ResourceSkuArgs(capacity, name, tier);
        }
    }
}
