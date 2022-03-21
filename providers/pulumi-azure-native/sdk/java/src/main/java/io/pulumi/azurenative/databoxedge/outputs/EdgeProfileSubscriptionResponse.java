// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.databoxedge.outputs;

import io.pulumi.azurenative.databoxedge.outputs.SubscriptionRegisteredFeaturesResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class EdgeProfileSubscriptionResponse {
    /**
     * ARM ID of the subscription
     * 
     */
    private final @Nullable String id;
    private final @Nullable String locationPlacementId;
    private final @Nullable String quotaId;
    private final @Nullable List<SubscriptionRegisteredFeaturesResponse> registeredFeatures;
    private final @Nullable String registrationDate;
    /**
     * Edge Subscription Registration ID
     * 
     */
    private final @Nullable String registrationId;
    private final @Nullable String serializedDetails;
    private final @Nullable String state;
    private final @Nullable String subscriptionId;
    private final @Nullable String tenantId;

    @CustomType.Constructor
    private EdgeProfileSubscriptionResponse(
        @CustomType.Parameter("id") @Nullable String id,
        @CustomType.Parameter("locationPlacementId") @Nullable String locationPlacementId,
        @CustomType.Parameter("quotaId") @Nullable String quotaId,
        @CustomType.Parameter("registeredFeatures") @Nullable List<SubscriptionRegisteredFeaturesResponse> registeredFeatures,
        @CustomType.Parameter("registrationDate") @Nullable String registrationDate,
        @CustomType.Parameter("registrationId") @Nullable String registrationId,
        @CustomType.Parameter("serializedDetails") @Nullable String serializedDetails,
        @CustomType.Parameter("state") @Nullable String state,
        @CustomType.Parameter("subscriptionId") @Nullable String subscriptionId,
        @CustomType.Parameter("tenantId") @Nullable String tenantId) {
        this.id = id;
        this.locationPlacementId = locationPlacementId;
        this.quotaId = quotaId;
        this.registeredFeatures = registeredFeatures;
        this.registrationDate = registrationDate;
        this.registrationId = registrationId;
        this.serializedDetails = serializedDetails;
        this.state = state;
        this.subscriptionId = subscriptionId;
        this.tenantId = tenantId;
    }

    /**
     * ARM ID of the subscription
     * 
    */
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getLocationPlacementId() {
        return Optional.ofNullable(this.locationPlacementId);
    }
    public Optional<String> getQuotaId() {
        return Optional.ofNullable(this.quotaId);
    }
    public List<SubscriptionRegisteredFeaturesResponse> getRegisteredFeatures() {
        return this.registeredFeatures == null ? List.of() : this.registeredFeatures;
    }
    public Optional<String> getRegistrationDate() {
        return Optional.ofNullable(this.registrationDate);
    }
    /**
     * Edge Subscription Registration ID
     * 
    */
    public Optional<String> getRegistrationId() {
        return Optional.ofNullable(this.registrationId);
    }
    public Optional<String> getSerializedDetails() {
        return Optional.ofNullable(this.serializedDetails);
    }
    public Optional<String> getState() {
        return Optional.ofNullable(this.state);
    }
    public Optional<String> getSubscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }
    public Optional<String> getTenantId() {
        return Optional.ofNullable(this.tenantId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EdgeProfileSubscriptionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String id;
        private @Nullable String locationPlacementId;
        private @Nullable String quotaId;
        private @Nullable List<SubscriptionRegisteredFeaturesResponse> registeredFeatures;
        private @Nullable String registrationDate;
        private @Nullable String registrationId;
        private @Nullable String serializedDetails;
        private @Nullable String state;
        private @Nullable String subscriptionId;
        private @Nullable String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(EdgeProfileSubscriptionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.locationPlacementId = defaults.locationPlacementId;
    	      this.quotaId = defaults.quotaId;
    	      this.registeredFeatures = defaults.registeredFeatures;
    	      this.registrationDate = defaults.registrationDate;
    	      this.registrationId = defaults.registrationId;
    	      this.serializedDetails = defaults.serializedDetails;
    	      this.state = defaults.state;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        public Builder locationPlacementId(@Nullable String locationPlacementId) {
            this.locationPlacementId = locationPlacementId;
            return this;
        }
        public Builder quotaId(@Nullable String quotaId) {
            this.quotaId = quotaId;
            return this;
        }
        public Builder registeredFeatures(@Nullable List<SubscriptionRegisteredFeaturesResponse> registeredFeatures) {
            this.registeredFeatures = registeredFeatures;
            return this;
        }
        public Builder registeredFeatures(SubscriptionRegisteredFeaturesResponse... registeredFeatures) {
            return registeredFeatures(List.of(registeredFeatures));
        }
        public Builder registrationDate(@Nullable String registrationDate) {
            this.registrationDate = registrationDate;
            return this;
        }
        public Builder registrationId(@Nullable String registrationId) {
            this.registrationId = registrationId;
            return this;
        }
        public Builder serializedDetails(@Nullable String serializedDetails) {
            this.serializedDetails = serializedDetails;
            return this;
        }
        public Builder state(@Nullable String state) {
            this.state = state;
            return this;
        }
        public Builder subscriptionId(@Nullable String subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }
        public Builder tenantId(@Nullable String tenantId) {
            this.tenantId = tenantId;
            return this;
        }        public EdgeProfileSubscriptionResponse build() {
            return new EdgeProfileSubscriptionResponse(id, locationPlacementId, quotaId, registeredFeatures, registrationDate, registrationId, serializedDetails, state, subscriptionId, tenantId);
        }
    }
}
