// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class Ipv6CircuitConnectionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final Ipv6CircuitConnectionConfigArgs Empty = new Ipv6CircuitConnectionConfigArgs();

    @InputImport(name="addressPrefix")
    private final @Nullable Input<String> addressPrefix;

    public Input<String> getAddressPrefix() {
        return this.addressPrefix == null ? Input.empty() : this.addressPrefix;
    }

    public Ipv6CircuitConnectionConfigArgs(@Nullable Input<String> addressPrefix) {
        this.addressPrefix = addressPrefix;
    }

    private Ipv6CircuitConnectionConfigArgs() {
        this.addressPrefix = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Ipv6CircuitConnectionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> addressPrefix;

        public Builder() {
    	      // Empty
        }

        public Builder(Ipv6CircuitConnectionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.addressPrefix = defaults.addressPrefix;
        }

        public Builder setAddressPrefix(@Nullable Input<String> addressPrefix) {
            this.addressPrefix = addressPrefix;
            return this;
        }

        public Builder setAddressPrefix(@Nullable String addressPrefix) {
            this.addressPrefix = Input.ofNullable(addressPrefix);
            return this;
        }

        public Ipv6CircuitConnectionConfigArgs build() {
            return new Ipv6CircuitConnectionConfigArgs(addressPrefix);
        }
    }
}
