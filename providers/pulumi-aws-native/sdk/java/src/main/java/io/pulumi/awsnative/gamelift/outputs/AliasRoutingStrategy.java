// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.gamelift.outputs;

import io.pulumi.awsnative.gamelift.enums.AliasRoutingStrategyType;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AliasRoutingStrategy {
    /**
     * A unique identifier for a fleet that the alias points to. If you specify SIMPLE for the Type property, you must specify this property.
     * 
     */
    private final @Nullable String fleetId;
    /**
     * The message text to be used with a terminal routing strategy. If you specify TERMINAL for the Type property, you must specify this property.
     * 
     */
    private final @Nullable String message;
    /**
     * Simple routing strategy. The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * 
     */
    private final AliasRoutingStrategyType type;

    @CustomType.Constructor
    private AliasRoutingStrategy(
        @CustomType.Parameter("fleetId") @Nullable String fleetId,
        @CustomType.Parameter("message") @Nullable String message,
        @CustomType.Parameter("type") AliasRoutingStrategyType type) {
        this.fleetId = fleetId;
        this.message = message;
        this.type = type;
    }

    /**
     * A unique identifier for a fleet that the alias points to. If you specify SIMPLE for the Type property, you must specify this property.
     * 
    */
    public Optional<String> getFleetId() {
        return Optional.ofNullable(this.fleetId);
    }
    /**
     * The message text to be used with a terminal routing strategy. If you specify TERMINAL for the Type property, you must specify this property.
     * 
    */
    public Optional<String> getMessage() {
        return Optional.ofNullable(this.message);
    }
    /**
     * Simple routing strategy. The alias resolves to one specific fleet. Use this type when routing to active fleets.
     * 
    */
    public AliasRoutingStrategyType getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasRoutingStrategy defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String fleetId;
        private @Nullable String message;
        private AliasRoutingStrategyType type;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasRoutingStrategy defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fleetId = defaults.fleetId;
    	      this.message = defaults.message;
    	      this.type = defaults.type;
        }

        public Builder fleetId(@Nullable String fleetId) {
            this.fleetId = fleetId;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = message;
            return this;
        }
        public Builder type(AliasRoutingStrategyType type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }        public AliasRoutingStrategy build() {
            return new AliasRoutingStrategy(fleetId, message, type);
        }
    }
}
