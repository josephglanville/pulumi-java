// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.cache.inputs;

import io.pulumi.azurenative.cache.enums.SkuFamily;
import io.pulumi.azurenative.cache.enums.SkuName;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class SkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final SkuArgs Empty = new SkuArgs();

    @InputImport(name="capacity", required=true)
    private final Input<Integer> capacity;

    public Input<Integer> getCapacity() {
        return this.capacity;
    }

    @InputImport(name="family", required=true)
    private final Input<Either<String,SkuFamily>> family;

    public Input<Either<String,SkuFamily>> getFamily() {
        return this.family;
    }

    @InputImport(name="name", required=true)
    private final Input<Either<String,SkuName>> name;

    public Input<Either<String,SkuName>> getName() {
        return this.name;
    }

    public SkuArgs(
        Input<Integer> capacity,
        Input<Either<String,SkuFamily>> family,
        Input<Either<String,SkuName>> name) {
        this.capacity = Objects.requireNonNull(capacity, "expected parameter 'capacity' to be non-null");
        this.family = Objects.requireNonNull(family, "expected parameter 'family' to be non-null");
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private SkuArgs() {
        this.capacity = Input.empty();
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
        private Input<Integer> capacity;
        private Input<Either<String,SkuFamily>> family;
        private Input<Either<String,SkuName>> name;

        public Builder() {
    	      // Empty
        }

        public Builder(SkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capacity = defaults.capacity;
    	      this.family = defaults.family;
    	      this.name = defaults.name;
        }

        public Builder setCapacity(Input<Integer> capacity) {
            this.capacity = Objects.requireNonNull(capacity);
            return this;
        }

        public Builder setCapacity(Integer capacity) {
            this.capacity = Input.of(Objects.requireNonNull(capacity));
            return this;
        }

        public Builder setFamily(Input<Either<String,SkuFamily>> family) {
            this.family = Objects.requireNonNull(family);
            return this;
        }

        public Builder setFamily(Either<String,SkuFamily> family) {
            this.family = Input.of(Objects.requireNonNull(family));
            return this;
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
            return new SkuArgs(capacity, family, name);
        }
    }
}
