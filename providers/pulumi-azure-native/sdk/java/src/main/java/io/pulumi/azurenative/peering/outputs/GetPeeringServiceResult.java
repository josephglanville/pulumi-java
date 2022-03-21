// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.outputs;

import io.pulumi.azurenative.peering.outputs.PeeringServiceSkuResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPeeringServiceResult {
    /**
     * The ID of the resource.
     * 
     */
    private final String id;
    /**
     * The location of the resource.
     * 
     */
    private final String location;
    /**
     * The name of the resource.
     * 
     */
    private final String name;
    /**
     * The location (state/province) of the customer.
     * 
     */
    private final @Nullable String peeringServiceLocation;
    /**
     * The name of the service provider.
     * 
     */
    private final @Nullable String peeringServiceProvider;
    /**
     * The backup peering (Microsoft/service provider) location to be used for customer traffic.
     * 
     */
    private final @Nullable String providerBackupPeeringLocation;
    /**
     * The primary peering (Microsoft/service provider) location to be used for customer traffic.
     * 
     */
    private final @Nullable String providerPrimaryPeeringLocation;
    /**
     * The provisioning state of the resource.
     * 
     */
    private final String provisioningState;
    /**
     * The SKU that defines the type of the peering service.
     * 
     */
    private final @Nullable PeeringServiceSkuResponse sku;
    /**
     * The resource tags.
     * 
     */
    private final @Nullable Map<String,String> tags;
    /**
     * The type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetPeeringServiceResult(
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("location") String location,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("peeringServiceLocation") @Nullable String peeringServiceLocation,
        @CustomType.Parameter("peeringServiceProvider") @Nullable String peeringServiceProvider,
        @CustomType.Parameter("providerBackupPeeringLocation") @Nullable String providerBackupPeeringLocation,
        @CustomType.Parameter("providerPrimaryPeeringLocation") @Nullable String providerPrimaryPeeringLocation,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("sku") @Nullable PeeringServiceSkuResponse sku,
        @CustomType.Parameter("tags") @Nullable Map<String,String> tags,
        @CustomType.Parameter("type") String type) {
        this.id = id;
        this.location = location;
        this.name = name;
        this.peeringServiceLocation = peeringServiceLocation;
        this.peeringServiceProvider = peeringServiceProvider;
        this.providerBackupPeeringLocation = providerBackupPeeringLocation;
        this.providerPrimaryPeeringLocation = providerPrimaryPeeringLocation;
        this.provisioningState = provisioningState;
        this.sku = sku;
        this.tags = tags;
        this.type = type;
    }

    /**
     * The ID of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * The location of the resource.
     * 
    */
    public String getLocation() {
        return this.location;
    }
    /**
     * The name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * The location (state/province) of the customer.
     * 
    */
    public Optional<String> getPeeringServiceLocation() {
        return Optional.ofNullable(this.peeringServiceLocation);
    }
    /**
     * The name of the service provider.
     * 
    */
    public Optional<String> getPeeringServiceProvider() {
        return Optional.ofNullable(this.peeringServiceProvider);
    }
    /**
     * The backup peering (Microsoft/service provider) location to be used for customer traffic.
     * 
    */
    public Optional<String> getProviderBackupPeeringLocation() {
        return Optional.ofNullable(this.providerBackupPeeringLocation);
    }
    /**
     * The primary peering (Microsoft/service provider) location to be used for customer traffic.
     * 
    */
    public Optional<String> getProviderPrimaryPeeringLocation() {
        return Optional.ofNullable(this.providerPrimaryPeeringLocation);
    }
    /**
     * The provisioning state of the resource.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * The SKU that defines the type of the peering service.
     * 
    */
    public Optional<PeeringServiceSkuResponse> getSku() {
        return Optional.ofNullable(this.sku);
    }
    /**
     * The resource tags.
     * 
    */
    public Map<String,String> getTags() {
        return this.tags == null ? Map.of() : this.tags;
    }
    /**
     * The type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPeeringServiceResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String id;
        private String location;
        private String name;
        private @Nullable String peeringServiceLocation;
        private @Nullable String peeringServiceProvider;
        private @Nullable String providerBackupPeeringLocation;
        private @Nullable String providerPrimaryPeeringLocation;
        private String provisioningState;
        private @Nullable PeeringServiceSkuResponse sku;
        private @Nullable Map<String,String> tags;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetPeeringServiceResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.peeringServiceLocation = defaults.peeringServiceLocation;
    	      this.peeringServiceProvider = defaults.peeringServiceProvider;
    	      this.providerBackupPeeringLocation = defaults.providerBackupPeeringLocation;
    	      this.providerPrimaryPeeringLocation = defaults.providerPrimaryPeeringLocation;
    	      this.provisioningState = defaults.provisioningState;
    	      this.sku = defaults.sku;
    	      this.tags = defaults.tags;
    	      this.type = defaults.type;
        }

        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder location(String location) {
            this.location = Objects.requireNonNull(location);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder peeringServiceLocation(@Nullable String peeringServiceLocation) {
            this.peeringServiceLocation = peeringServiceLocation;
            return this;
        }
        public Builder peeringServiceProvider(@Nullable String peeringServiceProvider) {
            this.peeringServiceProvider = peeringServiceProvider;
            return this;
        }
        public Builder providerBackupPeeringLocation(@Nullable String providerBackupPeeringLocation) {
            this.providerBackupPeeringLocation = providerBackupPeeringLocation;
            return this;
        }
        public Builder providerPrimaryPeeringLocation(@Nullable String providerPrimaryPeeringLocation) {
            this.providerPrimaryPeeringLocation = providerPrimaryPeeringLocation;
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder sku(@Nullable PeeringServiceSkuResponse sku) {
            this.sku = sku;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = tags;
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetPeeringServiceResult build() {
            return new GetPeeringServiceResult(id, location, name, peeringServiceLocation, peeringServiceProvider, providerBackupPeeringLocation, providerPrimaryPeeringLocation, provisioningState, sku, tags, type);
        }
    }
}
