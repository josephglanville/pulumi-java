// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.eventgrid.outputs;

import io.pulumi.azurenative.eventgrid.outputs.EventChannelDestinationResponse;
import io.pulumi.azurenative.eventgrid.outputs.EventChannelFilterResponse;
import io.pulumi.azurenative.eventgrid.outputs.EventChannelSourceResponse;
import io.pulumi.azurenative.eventgrid.outputs.SystemDataResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetEventChannelResult {
    /**
     * Represents the destination of an event channel.
     * 
     */
    private final @Nullable EventChannelDestinationResponse destination;
    /**
     * Expiration time of the event channel. If this timer expires while the corresponding partner topic is never activated,
     * the event channel and corresponding partner topic are deleted.
     * 
     */
    private final @Nullable String expirationTimeIfNotActivatedUtc;
    /**
     * Information about the filter for the event channel.
     * 
     */
    private final @Nullable EventChannelFilterResponse filter;
    /**
     * Fully qualified identifier of the resource.
     * 
     */
    private final String id;
    /**
     * Name of the resource.
     * 
     */
    private final String name;
    /**
     * Friendly description about the topic. This can be set by the publisher/partner to show custom description for the customer partner topic.
     * This will be helpful to remove any ambiguity of the origin of creation of the partner topic for the customer.
     * 
     */
    private final @Nullable String partnerTopicFriendlyDescription;
    /**
     * The readiness state of the corresponding partner topic.
     * 
     */
    private final String partnerTopicReadinessState;
    /**
     * Provisioning state of the event channel.
     * 
     */
    private final String provisioningState;
    /**
     * Source of the event channel. This represents a unique resource in the partner's resource model.
     * 
     */
    private final @Nullable EventChannelSourceResponse source;
    /**
     * The system metadata relating to Event Channel resource.
     * 
     */
    private final SystemDataResponse systemData;
    /**
     * Type of the resource.
     * 
     */
    private final String type;

    @CustomType.Constructor
    private GetEventChannelResult(
        @CustomType.Parameter("destination") @Nullable EventChannelDestinationResponse destination,
        @CustomType.Parameter("expirationTimeIfNotActivatedUtc") @Nullable String expirationTimeIfNotActivatedUtc,
        @CustomType.Parameter("filter") @Nullable EventChannelFilterResponse filter,
        @CustomType.Parameter("id") String id,
        @CustomType.Parameter("name") String name,
        @CustomType.Parameter("partnerTopicFriendlyDescription") @Nullable String partnerTopicFriendlyDescription,
        @CustomType.Parameter("partnerTopicReadinessState") String partnerTopicReadinessState,
        @CustomType.Parameter("provisioningState") String provisioningState,
        @CustomType.Parameter("source") @Nullable EventChannelSourceResponse source,
        @CustomType.Parameter("systemData") SystemDataResponse systemData,
        @CustomType.Parameter("type") String type) {
        this.destination = destination;
        this.expirationTimeIfNotActivatedUtc = expirationTimeIfNotActivatedUtc;
        this.filter = filter;
        this.id = id;
        this.name = name;
        this.partnerTopicFriendlyDescription = partnerTopicFriendlyDescription;
        this.partnerTopicReadinessState = partnerTopicReadinessState;
        this.provisioningState = provisioningState;
        this.source = source;
        this.systemData = systemData;
        this.type = type;
    }

    /**
     * Represents the destination of an event channel.
     * 
    */
    public Optional<EventChannelDestinationResponse> getDestination() {
        return Optional.ofNullable(this.destination);
    }
    /**
     * Expiration time of the event channel. If this timer expires while the corresponding partner topic is never activated,
     * the event channel and corresponding partner topic are deleted.
     * 
    */
    public Optional<String> getExpirationTimeIfNotActivatedUtc() {
        return Optional.ofNullable(this.expirationTimeIfNotActivatedUtc);
    }
    /**
     * Information about the filter for the event channel.
     * 
    */
    public Optional<EventChannelFilterResponse> getFilter() {
        return Optional.ofNullable(this.filter);
    }
    /**
     * Fully qualified identifier of the resource.
     * 
    */
    public String getId() {
        return this.id;
    }
    /**
     * Name of the resource.
     * 
    */
    public String getName() {
        return this.name;
    }
    /**
     * Friendly description about the topic. This can be set by the publisher/partner to show custom description for the customer partner topic.
     * This will be helpful to remove any ambiguity of the origin of creation of the partner topic for the customer.
     * 
    */
    public Optional<String> getPartnerTopicFriendlyDescription() {
        return Optional.ofNullable(this.partnerTopicFriendlyDescription);
    }
    /**
     * The readiness state of the corresponding partner topic.
     * 
    */
    public String getPartnerTopicReadinessState() {
        return this.partnerTopicReadinessState;
    }
    /**
     * Provisioning state of the event channel.
     * 
    */
    public String getProvisioningState() {
        return this.provisioningState;
    }
    /**
     * Source of the event channel. This represents a unique resource in the partner's resource model.
     * 
    */
    public Optional<EventChannelSourceResponse> getSource() {
        return Optional.ofNullable(this.source);
    }
    /**
     * The system metadata relating to Event Channel resource.
     * 
    */
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    /**
     * Type of the resource.
     * 
    */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventChannelResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable EventChannelDestinationResponse destination;
        private @Nullable String expirationTimeIfNotActivatedUtc;
        private @Nullable EventChannelFilterResponse filter;
        private String id;
        private String name;
        private @Nullable String partnerTopicFriendlyDescription;
        private String partnerTopicReadinessState;
        private String provisioningState;
        private @Nullable EventChannelSourceResponse source;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetEventChannelResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.destination = defaults.destination;
    	      this.expirationTimeIfNotActivatedUtc = defaults.expirationTimeIfNotActivatedUtc;
    	      this.filter = defaults.filter;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.partnerTopicFriendlyDescription = defaults.partnerTopicFriendlyDescription;
    	      this.partnerTopicReadinessState = defaults.partnerTopicReadinessState;
    	      this.provisioningState = defaults.provisioningState;
    	      this.source = defaults.source;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder destination(@Nullable EventChannelDestinationResponse destination) {
            this.destination = destination;
            return this;
        }
        public Builder expirationTimeIfNotActivatedUtc(@Nullable String expirationTimeIfNotActivatedUtc) {
            this.expirationTimeIfNotActivatedUtc = expirationTimeIfNotActivatedUtc;
            return this;
        }
        public Builder filter(@Nullable EventChannelFilterResponse filter) {
            this.filter = filter;
            return this;
        }
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public Builder partnerTopicFriendlyDescription(@Nullable String partnerTopicFriendlyDescription) {
            this.partnerTopicFriendlyDescription = partnerTopicFriendlyDescription;
            return this;
        }
        public Builder partnerTopicReadinessState(String partnerTopicReadinessState) {
            this.partnerTopicReadinessState = Objects.requireNonNull(partnerTopicReadinessState);
            return this;
        }
        public Builder provisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }
        public Builder source(@Nullable EventChannelSourceResponse source) {
            this.source = source;
            return this;
        }
        public Builder systemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public GetEventChannelResult build() {
            return new GetEventChannelResult(destination, expirationTimeIfNotActivatedUtc, filter, id, name, partnerTopicFriendlyDescription, partnerTopicReadinessState, provisioningState, source, systemData, type);
        }
    }
}
