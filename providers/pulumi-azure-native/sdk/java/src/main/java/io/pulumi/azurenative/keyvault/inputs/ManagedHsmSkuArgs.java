// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.azurenative.keyvault.enums.ManagedHsmSkuFamily;
import io.pulumi.azurenative.keyvault.enums.ManagedHsmSkuName;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * SKU details
 * 
 */
public final class ManagedHsmSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagedHsmSkuArgs Empty = new ManagedHsmSkuArgs();

    /**
     * SKU Family of the managed HSM Pool
     * 
     */
    @Import(name="family", required=true)
      private final Output<Either<String,ManagedHsmSkuFamily>> family;

    public Output<Either<String,ManagedHsmSkuFamily>> getFamily() {
        return this.family;
    }

    /**
     * SKU of the managed HSM Pool
     * 
     */
    @Import(name="name", required=true)
      private final Output<ManagedHsmSkuName> name;

    public Output<ManagedHsmSkuName> getName() {
        return this.name;
    }

    public ManagedHsmSkuArgs(
        Output<Either<String,ManagedHsmSkuFamily>> family,
        Output<ManagedHsmSkuName> name) {
        this.family = Objects.requireNonNull(family, "expected parameter 'family' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ManagedHsmSkuArgs() {
        this.family = Output.empty();
        this.name = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedHsmSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<Either<String,ManagedHsmSkuFamily>> family;
        private Output<ManagedHsmSkuName> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedHsmSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.family = defaults.family;
    	      this.name = defaults.name;
        }

        public Builder family(Output<Either<String,ManagedHsmSkuFamily>> family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }
        public Builder family(Either<String,ManagedHsmSkuFamily> family) {
            this.family = Output.of(Objects.requireNonNull(family));
            return this;
        }
        public Builder name(Output<ManagedHsmSkuName> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder name(ManagedHsmSkuName name) {
            this.name = Output.of(Objects.requireNonNull(name));
            return this;
        }        public ManagedHsmSkuArgs build() {
            return new ManagedHsmSkuArgs(family, name);
        }
    }
}
