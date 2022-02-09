// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.storsimple.inputs;

import io.pulumi.azurenative.storsimple.enums.ManagerSkuType;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.util.Objects;


public final class ManagerSkuArgs extends io.pulumi.resources.ResourceArgs {

    public static final ManagerSkuArgs Empty = new ManagerSkuArgs();

    @InputImport(name="name", required=true)
    private final Input<ManagerSkuType> name;

    public Input<ManagerSkuType> getName() {
        return this.name;
    }

    public ManagerSkuArgs(Input<ManagerSkuType> name) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
    }

    private ManagerSkuArgs() {
        this.name = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagerSkuArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<ManagerSkuType> name;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagerSkuArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(Input<ManagerSkuType> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(ManagerSkuType name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public ManagerSkuArgs build() {
            return new ManagerSkuArgs(name);
        }
    }
}
