// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.myedgeorder.inputs;

import com.pulumi.core.annotations.Import;
import com.pulumi.myedgeorder.inputs.CustomerSubscriptionRegisteredFeatures;
import com.pulumi.resources.InvokeArgs;
import com.pulumi.resources.ResourceArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Holds Customer subscription details. Clients can display available products to unregistered customers by explicitly passing subscription details
 * 
 */
public final class CustomerSubscriptionDetails extends InvokeArgs {

    public static final CustomerSubscriptionDetails Empty = new CustomerSubscriptionDetails();

    /**
     * Location placement Id of a subscription
     * 
     */
    @Import(name="locationPlacementId")
    private @Nullable String locationPlacementId;

    /**
     * @return Location placement Id of a subscription
     * 
     */
    public Optional<String> locationPlacementId() {
        return Optional.ofNullable(this.locationPlacementId);
    }

    /**
     * Quota ID of a subscription
     * 
     */
    @Import(name="quotaId", required=true)
    private String quotaId;

    /**
     * @return Quota ID of a subscription
     * 
     */
    public String quotaId() {
        return this.quotaId;
    }

    /**
     * List of registered feature flags for subscription
     * 
     */
    @Import(name="registeredFeatures")
    private @Nullable List<CustomerSubscriptionRegisteredFeatures> registeredFeatures;

    /**
     * @return List of registered feature flags for subscription
     * 
     */
    public Optional<List<CustomerSubscriptionRegisteredFeatures>> registeredFeatures() {
        return Optional.ofNullable(this.registeredFeatures);
    }

    private CustomerSubscriptionDetails() {}

    private CustomerSubscriptionDetails(CustomerSubscriptionDetails $) {
        this.locationPlacementId = $.locationPlacementId;
        this.quotaId = $.quotaId;
        this.registeredFeatures = $.registeredFeatures;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CustomerSubscriptionDetails defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CustomerSubscriptionDetails $;

        public Builder() {
            $ = new CustomerSubscriptionDetails();
        }

        public Builder(CustomerSubscriptionDetails defaults) {
            $ = new CustomerSubscriptionDetails(Objects.requireNonNull(defaults));
        }

        /**
         * @param locationPlacementId Location placement Id of a subscription
         * 
         * @return builder
         * 
         */
        public Builder locationPlacementId(@Nullable String locationPlacementId) {
            $.locationPlacementId = locationPlacementId;
            return this;
        }

        /**
         * @param quotaId Quota ID of a subscription
         * 
         * @return builder
         * 
         */
        public Builder quotaId(String quotaId) {
            $.quotaId = quotaId;
            return this;
        }

        /**
         * @param registeredFeatures List of registered feature flags for subscription
         * 
         * @return builder
         * 
         */
        public Builder registeredFeatures(@Nullable List<CustomerSubscriptionRegisteredFeatures> registeredFeatures) {
            $.registeredFeatures = registeredFeatures;
            return this;
        }

        /**
         * @param registeredFeatures List of registered feature flags for subscription
         * 
         * @return builder
         * 
         */
        public Builder registeredFeatures(CustomerSubscriptionRegisteredFeatures... registeredFeatures) {
            return registeredFeatures(List.of(registeredFeatures));
        }

        public CustomerSubscriptionDetails build() {
            $.quotaId = Objects.requireNonNull($.quotaId, "expected parameter 'quotaId' to be non-null");
            return $;
        }
    }

}
