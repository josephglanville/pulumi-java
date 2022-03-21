// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.iotcentral.inputs;

import io.pulumi.azurenative.iotcentral.enums.AppSku;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Information about the SKU of the IoT Central application.
 * 
 */
public final class AppSkuInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final AppSkuInfoArgs Empty = new AppSkuInfoArgs();

    /**
     * The name of the SKU.
     * 
     */
    @Import(name="name", required=true)
      private final Output<Either<String,AppSku>> name;

    public Output<Either<String,AppSku>> getName() {
        return this.name;
    }

    public AppSkuInfoArgs(Output<Either<String,AppSku>> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private AppSkuInfoArgs() {
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AppSkuInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,AppSku>> name;

        public Builder() {
    	      // Empty
        }

        public Builder(AppSkuInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder name(Output<Either<String,AppSku>> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(Either<String,AppSku> name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public AppSkuInfoArgs build() {
            return new AppSkuInfoArgs(name);
        }
    }
}
