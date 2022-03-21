// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IotHubLocationDescriptionResponse {
    /**
     * The name of the Azure region
     * 
     */
    private final @Nullable String location;
    /**
     * The role of the region, can be either primary or secondary. The primary region is where the IoT hub is currently provisioned. The secondary region is the Azure disaster recovery (DR) paired region and also the region where the IoT hub can failover to.
     * 
     */
    private final @Nullable String role;

    @CustomType.Constructor
    private IotHubLocationDescriptionResponse(
        @CustomType.Parameter("location") @Nullable String location,
        @CustomType.Parameter("role") @Nullable String role) {
        this.location = location;
        this.role = role;
    }

    /**
     * The name of the Azure region
     * 
    */
    public Optional<String> getLocation() {
        return Optional.ofNullable(this.location);
    }
    /**
     * The role of the region, can be either primary or secondary. The primary region is where the IoT hub is currently provisioned. The secondary region is the Azure disaster recovery (DR) paired region and also the region where the IoT hub can failover to.
     * 
    */
    public Optional<String> getRole() {
        return Optional.ofNullable(this.role);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IotHubLocationDescriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String location;
        private @Nullable String role;

        public Builder() {
    	      // Empty
        }

        public Builder(IotHubLocationDescriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.location = defaults.location;
    	      this.role = defaults.role;
        }

        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        public Builder role(@Nullable String role) {
            this.role = role;
            return this;
        }        public IotHubLocationDescriptionResponse build() {
            return new IotHubLocationDescriptionResponse(location, role);
        }
    }
}
