// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.powerplatform.inputs;

import io.pulumi.azurenative.powerplatform.inputs.SubnetPropertiesResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Settings concerning the virtual network.
 * 
 */
public final class VirtualNetworkPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final VirtualNetworkPropertiesResponse Empty = new VirtualNetworkPropertiesResponse();

    /**
     * Uri of the virtual network.
     * 
     */
    @InputImport(name="id")
      private final @Nullable String id;

    public Optional<String> getId() {
        return this.id == null ? Optional.empty() : Optional.ofNullable(this.id);
    }

    /**
     * Properties of a subnet.
     * 
     */
    @InputImport(name="subnet")
      private final @Nullable SubnetPropertiesResponse subnet;

    public Optional<SubnetPropertiesResponse> getSubnet() {
        return this.subnet == null ? Optional.empty() : Optional.ofNullable(this.subnet);
    }

    public VirtualNetworkPropertiesResponse(
        @Nullable String id,
        @Nullable SubnetPropertiesResponse subnet) {
        this.id = id;
        this.subnet = subnet;
    }

    private VirtualNetworkPropertiesResponse() {
        this.id = null;
        this.subnet = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualNetworkPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable SubnetPropertiesResponse subnet;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualNetworkPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.subnet = defaults.subnet;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setSubnet(@Nullable SubnetPropertiesResponse subnet) {
            this.subnet = subnet;
            return this;
        }
        public VirtualNetworkPropertiesResponse build() {
            return new VirtualNetworkPropertiesResponse(id, subnet);
        }
    }
}
