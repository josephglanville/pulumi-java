// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.compute.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class RouterPeerBfdArgs extends io.pulumi.resources.ResourceArgs {

    public static final RouterPeerBfdArgs Empty = new RouterPeerBfdArgs();

    /**
     * The minimum interval, in milliseconds, between BFD control packets
     * received from the peer router. The actual value is negotiated
     * between the two routers and is equal to the greater of this value
     * and the transmit interval of the other router. If set, this value
     * must be between 1000 and 30000.
     * 
     */
    @Import(name="minReceiveInterval")
      private final @Nullable Output<Integer> minReceiveInterval;

    public Output<Integer> getMinReceiveInterval() {
        return this.minReceiveInterval == null ? Codegen.empty() : this.minReceiveInterval;
    }

    /**
     * The minimum interval, in milliseconds, between BFD control packets
     * transmitted to the peer router. The actual value is negotiated
     * between the two routers and is equal to the greater of this value
     * and the corresponding receive interval of the other router. If set,
     * this value must be between 1000 and 30000.
     * 
     */
    @Import(name="minTransmitInterval")
      private final @Nullable Output<Integer> minTransmitInterval;

    public Output<Integer> getMinTransmitInterval() {
        return this.minTransmitInterval == null ? Codegen.empty() : this.minTransmitInterval;
    }

    /**
     * The number of consecutive BFD packets that must be missed before
     * BFD declares that a peer is unavailable. If set, the value must
     * be a value between 5 and 16.
     * 
     */
    @Import(name="multiplier")
      private final @Nullable Output<Integer> multiplier;

    public Output<Integer> getMultiplier() {
        return this.multiplier == null ? Codegen.empty() : this.multiplier;
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
    @Import(name="sessionInitializationMode", required=true)
      private final Output<String> sessionInitializationMode;

    public Output<String> getSessionInitializationMode() {
        return this.sessionInitializationMode;
    }

    public RouterPeerBfdArgs(
        @Nullable Output<Integer> minReceiveInterval,
        @Nullable Output<Integer> minTransmitInterval,
        @Nullable Output<Integer> multiplier,
        Output<String> sessionInitializationMode) {
        this.minReceiveInterval = minReceiveInterval;
        this.minTransmitInterval = minTransmitInterval;
        this.multiplier = multiplier;
        this.sessionInitializationMode = Objects.requireNonNull(sessionInitializationMode, "expected parameter 'sessionInitializationMode' to be non-null");
    }

    private RouterPeerBfdArgs() {
        this.minReceiveInterval = Codegen.empty();
        this.minTransmitInterval = Codegen.empty();
        this.multiplier = Codegen.empty();
        this.sessionInitializationMode = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(RouterPeerBfdArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<Integer> minReceiveInterval;
        private @Nullable Output<Integer> minTransmitInterval;
        private @Nullable Output<Integer> multiplier;
        private Output<String> sessionInitializationMode;

        public Builder() {
    	      // Empty
        }

        public Builder(RouterPeerBfdArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minReceiveInterval = defaults.minReceiveInterval;
    	      this.minTransmitInterval = defaults.minTransmitInterval;
    	      this.multiplier = defaults.multiplier;
    	      this.sessionInitializationMode = defaults.sessionInitializationMode;
        }

        public Builder minReceiveInterval(@Nullable Output<Integer> minReceiveInterval) {
            this.minReceiveInterval = minReceiveInterval;
            return this;
        }
        public Builder minReceiveInterval(@Nullable Integer minReceiveInterval) {
            this.minReceiveInterval = Codegen.ofNullable(minReceiveInterval);
            return this;
        }
        public Builder minTransmitInterval(@Nullable Output<Integer> minTransmitInterval) {
            this.minTransmitInterval = minTransmitInterval;
            return this;
        }
        public Builder minTransmitInterval(@Nullable Integer minTransmitInterval) {
            this.minTransmitInterval = Codegen.ofNullable(minTransmitInterval);
            return this;
        }
        public Builder multiplier(@Nullable Output<Integer> multiplier) {
            this.multiplier = multiplier;
            return this;
        }
        public Builder multiplier(@Nullable Integer multiplier) {
            this.multiplier = Codegen.ofNullable(multiplier);
            return this;
        }
        public Builder sessionInitializationMode(Output<String> sessionInitializationMode) {
            this.sessionInitializationMode = Objects.requireNonNull(sessionInitializationMode);
            return this;
        }
        public Builder sessionInitializationMode(String sessionInitializationMode) {
            this.sessionInitializationMode = Output.of(Objects.requireNonNull(sessionInitializationMode));
            return this;
        }        public RouterPeerBfdArgs build() {
            return new RouterPeerBfdArgs(minReceiveInterval, minTransmitInterval, multiplier, sessionInitializationMode);
        }
    }
}
