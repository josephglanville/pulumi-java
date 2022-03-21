// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.hdinsight.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class VirtualNetworkProfileResponse {
    /**
     * The ID of the virtual network.
     * 
     */
    private final @Nullable String id;
    /**
     * The name of the subnet.
     * 
     */
    private final @Nullable String subnet;

    @CustomType.Constructor
    private VirtualNetworkProfileResponse(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("subnet") @Nullable String subnet) {
        this.id = id;
        this.subnet = subnet;
    }

    /**
     * The ID of the virtual network.
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    /**
     * The name of the subnet.
     * 
    */
    public Optional<String> getSubnet() {
        return Optional.ofNullable(this.subnet);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkProfileResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkProfileResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.subnet = defaults.subnet;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder subnet(@Nullable String subnet) {
            this.subnet = subnet;
            return this;
        }        public VirtualNetworkProfileResponse build() {
            return new VirtualNetworkProfileResponse(id, subnet);
        }
    }
}
