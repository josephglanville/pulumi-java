// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.SkuName;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The pricing tier of the web application firewall policy.
 * 
 */
public final class SkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    /**
     * Name of the pricing tier.
     * 
     */
    @InputImport(name="name")
      private final @Nullable Input<Either<String,SkuName>> name;

    public Input<Either<String,SkuName>> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    public SkuArgs(@Nullable Input<Either<String,SkuName>> name) {
        this.name = name;
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
        private @Nullable Input<Either<String,SkuName>> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable Input<Either<String,SkuName>> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable Either<String,SkuName> name) {
            this.name = Input.ofNullable(name);
            return this;
        }
        public SkuArgs build() {
            return new SkuArgs(name);
        }
    }
}
