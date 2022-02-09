// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.keyvault.inputs;

import io.pulumi.azurenative.keyvault.enums.SkuFamily;
import io.pulumi.azurenative.keyvault.enums.SkuName;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class SkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    @InputImport(name="family", required=true)
    private final Input<Either<String,SkuFamily>> family;

    public Input<Either<String,SkuFamily>> getFamily() {
        return this.family;
    }

    @InputImport(name="name", required=true)
    private final Input<SkuName> name;

    public Input<SkuName> getName() {
        return this.name;
    }

    public SkuArgs(
        Input<Either<String,SkuFamily>> family,
        Input<SkuName> name) {
        this.family = Objects.requireNonNull(family, "expected parameter 'family' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private SkuArgs() {
        this.family = Input.empty();
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Either<String,SkuFamily>> family;
        private Input<SkuName> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.family = defaults.family;
    	      this.name = defaults.name;
        }

        public Builder setFamily(Input<Either<String,SkuFamily>> family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }

        public Builder setFamily(Either<String,SkuFamily> family) {
            this.family = Input.of(Objects.requireNonNull(family));
            return this;
        }

        public Builder setName(Input<SkuName> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(SkuName name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public SkuArgs build() {
            return new SkuArgs(family, name);
        }
    }
}
