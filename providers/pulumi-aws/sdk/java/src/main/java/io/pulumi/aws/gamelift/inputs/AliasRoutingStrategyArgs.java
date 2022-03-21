// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.gamelift.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class AliasRoutingStrategyArgs extends io.pulumi.resources.ResourceArgs {

    public static final AliasRoutingStrategyArgs Empty = new AliasRoutingStrategyArgs();

    /**
     * ID of the Gamelift Fleet to point the alias to.
     * 
     */
    @Import(name="fleetId")
      private final @Nullable Output<String> fleetId;

    public Output<String> getFleetId() {
        return this.fleetId == null ? Output.empty() : this.fleetId;
    }

    /**
     * Message text to be used with the `TERMINAL` routing strategy.
     * 
     */
    @Import(name="message")
      private final @Nullable Output<String> message;

    public Output<String> getMessage() {
        return this.message == null ? Output.empty() : this.message;
    }

    /**
     * Type of routing strategyE.g., `SIMPLE` or `TERMINAL`
     * 
     */
    @Import(name="type", required=true)
      private final Output<String> type;

    public Output<String> getType() {
        return this.type;
    }

    public AliasRoutingStrategyArgs(
        @Nullable Output<String> fleetId,
        @Nullable Output<String> message,
        Output<String> type) {
        this.fleetId = fleetId;
        this.message = message;
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private AliasRoutingStrategyArgs() {
        this.fleetId = Output.empty();
        this.message = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AliasRoutingStrategyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> fleetId;
        private @Nullable Output<String> message;
        private Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(AliasRoutingStrategyArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.fleetId = defaults.fleetId;
    	      this.message = defaults.message;
    	      this.type = defaults.type;
        }

        public Builder fleetId(@Nullable Output<String> fleetId) {
            this.fleetId = fleetId;
            return this;
        }
        public Builder fleetId(@Nullable String fleetId) {
            this.fleetId = Output.ofNullable(fleetId);
            return this;
        }
        public Builder message(@Nullable Output<String> message) {
            this.message = message;
            return this;
        }
        public Builder message(@Nullable String message) {
            this.message = Output.ofNullable(message);
            return this;
        }
        public Builder type(Output<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public Builder type(String type) {
            this.type = Output.of(Objects.requireNonNull(type));
            return this;
        }        public AliasRoutingStrategyArgs build() {
            return new AliasRoutingStrategyArgs(fleetId, message, type);
        }
    }
}
