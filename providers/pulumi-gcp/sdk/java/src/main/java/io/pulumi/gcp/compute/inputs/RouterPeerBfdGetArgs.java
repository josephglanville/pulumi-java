// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterPeerBfdGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterPeerBfdGetArgs Empty = new RouterPeerBfdGetArgs();

    /**
     * The minimum interval, in milliseconds, between BFD control packets
     * received from the peer router. The actual value is negotiated
     * between the two routers and is equal to the greater of this value
     * and the transmit interval of the other router. If set, this value
     * must be between 1000 and 30000.
     * 
     */
    @InputImport(name="minReceiveInterval")
      private final @Nullable Input<Integer> minReceiveInterval;

    public Input<Integer> getMinReceiveInterval() {
        return this.minReceiveInterval == null ? Input.empty() : this.minReceiveInterval;
    }

    /**
     * The minimum interval, in milliseconds, between BFD control packets
     * transmitted to the peer router. The actual value is negotiated
     * between the two routers and is equal to the greater of this value
     * and the corresponding receive interval of the other router. If set,
     * this value must be between 1000 and 30000.
     * 
     */
    @InputImport(name="minTransmitInterval")
      private final @Nullable Input<Integer> minTransmitInterval;

    public Input<Integer> getMinTransmitInterval() {
        return this.minTransmitInterval == null ? Input.empty() : this.minTransmitInterval;
    }

    /**
     * The number of consecutive BFD packets that must be missed before
     * BFD declares that a peer is unavailable. If set, the value must
     * be a value between 5 and 16.
     * 
     */
    @InputImport(name="multiplier")
      private final @Nullable Input<Integer> multiplier;

    public Input<Integer> getMultiplier() {
        return this.multiplier == null ? Input.empty() : this.multiplier;
    }

    /**
     * The BFD session initialization mode for this BGP peer.
     * If set to `ACTIVE`, the Cloud Router will initiate the BFD session
     * for this BGP peer. If set to `PASSIVE`, the Cloud Router will wait
     * for the peer router to initiate the BFD session for this BGP peer.
     * If set to `DISABLED`, BFD is disabled for this BGP peer.
     * Possible values are `ACTIVE`, `DISABLED`, and `PASSIVE`.
     * 
     */
    @InputImport(name="sessionInitializationMode", required=true)
      private final Input<String> sessionInitializationMode;

    public Input<String> getSessionInitializationMode() {
        return this.sessionInitializationMode;
    }

    public RouterPeerBfdGetArgs(
        @Nullable Input<Integer> minReceiveInterval,
        @Nullable Input<Integer> minTransmitInterval,
        @Nullable Input<Integer> multiplier,
        Input<String> sessionInitializationMode) {
        this.minReceiveInterval = minReceiveInterval;
        this.minTransmitInterval = minTransmitInterval;
        this.multiplier = multiplier;
        this.sessionInitializationMode = Objects.requireNonNull(sessionInitializationMode, "expected parameter 'sessionInitializationMode' to be non-null");
    }

    private RouterPeerBfdGetArgs() {
        this.minReceiveInterval = Input.empty();
        this.minTransmitInterval = Input.empty();
        this.multiplier = Input.empty();
        this.sessionInitializationMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterPeerBfdGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> minReceiveInterval;
        private @Nullable Input<Integer> minTransmitInterval;
        private @Nullable Input<Integer> multiplier;
        private Input<String> sessionInitializationMode;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterPeerBfdGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReceiveInterval = defaults.minReceiveInterval;
    	      this.minTransmitInterval = defaults.minTransmitInterval;
    	      this.multiplier = defaults.multiplier;
    	      this.sessionInitializationMode = defaults.sessionInitializationMode;
        }

        public Builder setMinReceiveInterval(@Nullable Input<Integer> minReceiveInterval) {
            this.minReceiveInterval = minReceiveInterval;
            return this;
        }

        public Builder setMinReceiveInterval(@Nullable Integer minReceiveInterval) {
            this.minReceiveInterval = Input.ofNullable(minReceiveInterval);
            return this;
        }

        public Builder setMinTransmitInterval(@Nullable Input<Integer> minTransmitInterval) {
            this.minTransmitInterval = minTransmitInterval;
            return this;
        }

        public Builder setMinTransmitInterval(@Nullable Integer minTransmitInterval) {
            this.minTransmitInterval = Input.ofNullable(minTransmitInterval);
            return this;
        }

        public Builder setMultiplier(@Nullable Input<Integer> multiplier) {
            this.multiplier = multiplier;
            return this;
        }

        public Builder setMultiplier(@Nullable Integer multiplier) {
            this.multiplier = Input.ofNullable(multiplier);
            return this;
        }

        public Builder setSessionInitializationMode(Input<String> sessionInitializationMode) {
            this.sessionInitializationMode = Objects.requireNonNull(sessionInitializationMode);
            return this;
        }

        public Builder setSessionInitializationMode(String sessionInitializationMode) {
            this.sessionInitializationMode = Input.of(Objects.requireNonNull(sessionInitializationMode));
            return this;
        }
        public RouterPeerBfdGetArgs build() {
            return new RouterPeerBfdGetArgs(minReceiveInterval, minTransmitInterval, multiplier, sessionInitializationMode);
        }
    }
}
