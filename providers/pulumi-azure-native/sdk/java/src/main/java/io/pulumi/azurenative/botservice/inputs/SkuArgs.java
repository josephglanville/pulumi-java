// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.botservice.inputs;

import io.pulumi.azurenative.botservice.enums.SkuName;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * The SKU of the cognitive services account.
 * 
 */
public final class SkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * The sku name
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<Either<String,SkuName>> name;

    public Input<Either<String,SkuName>> getName() {
        return this.name;
    }

    public SkuArgs(Input<Either<String,SkuName>> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private SkuArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,SkuName>> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(Input<Either<String,SkuName>> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(Either<String,SkuName> name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }
        public SkuArgs build() {
            return new SkuArgs(name);
        }
    }
}
