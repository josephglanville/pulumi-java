// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.inputs;

import io.pulumi.azurenative.peering.enums.SessionAddressProvider;
import io.pulumi.azurenative.peering.inputs.BgpSessionArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The properties that define a direct connection.
 * 
 */
public final class DirectConnectionArgs extends io.pulumi.resources.ResourceArgs {

    public static final DirectConnectionArgs Empty = new DirectConnectionArgs();

    /**
     * The bandwidth of the connection.
     * 
     */
    @InputImport(name="bandwidthInMbps")
      private final @Nullable Input<Integer> bandwidthInMbps;

    public Input<Integer> getBandwidthInMbps() {
        return this.bandwidthInMbps == null ? Input.empty() : this.bandwidthInMbps;
    }

    /**
     * The BGP session associated with the connection.
     * 
     */
    @InputImport(name="bgpSession")
      private final @Nullable Input<BgpSessionArgs> bgpSession;

    public Input<BgpSessionArgs> getBgpSession() {
        return this.bgpSession == null ? Input.empty() : this.bgpSession;
    }

    /**
     * The unique identifier (GUID) for the connection.
     * 
     */
    @InputImport(name="connectionIdentifier")
      private final @Nullable Input<String> connectionIdentifier;

    public Input<String> getConnectionIdentifier() {
        return this.connectionIdentifier == null ? Input.empty() : this.connectionIdentifier;
    }

    /**
     * The PeeringDB.com ID of the facility at which the connection has to be set up.
     * 
     */
    @InputImport(name="peeringDBFacilityId")
      private final @Nullable Input<Integer> peeringDBFacilityId;

    public Input<Integer> getPeeringDBFacilityId() {
        return this.peeringDBFacilityId == null ? Input.empty() : this.peeringDBFacilityId;
    }

    /**
     * The field indicating if Microsoft provides session ip addresses.
     * 
     */
    @InputImport(name="sessionAddressProvider")
      private final @Nullable Input<Either<String,SessionAddressProvider>> sessionAddressProvider;

    public Input<Either<String,SessionAddressProvider>> getSessionAddressProvider() {
        return this.sessionAddressProvider == null ? Input.empty() : this.sessionAddressProvider;
    }

    /**
     * The flag that indicates whether or not the connection is used for peering service.
     * 
     */
    @InputImport(name="useForPeeringService")
      private final @Nullable Input<Boolean> useForPeeringService;

    public Input<Boolean> getUseForPeeringService() {
        return this.useForPeeringService == null ? Input.empty() : this.useForPeeringService;
    }

    public DirectConnectionArgs(
        @Nullable Input<Integer> bandwidthInMbps,
        @Nullable Input<BgpSessionArgs> bgpSession,
        @Nullable Input<String> connectionIdentifier,
        @Nullable Input<Integer> peeringDBFacilityId,
        @Nullable Input<Either<String,SessionAddressProvider>> sessionAddressProvider,
        @Nullable Input<Boolean> useForPeeringService) {
        this.bandwidthInMbps = bandwidthInMbps;
        this.bgpSession = bgpSession;
        this.connectionIdentifier = connectionIdentifier;
        this.peeringDBFacilityId = peeringDBFacilityId;
        this.sessionAddressProvider = sessionAddressProvider;
        this.useForPeeringService = useForPeeringService;
    }

    private DirectConnectionArgs() {
        this.bandwidthInMbps = Input.empty();
        this.bgpSession = Input.empty();
        this.connectionIdentifier = Input.empty();
        this.peeringDBFacilityId = Input.empty();
        this.sessionAddressProvider = Input.empty();
        this.useForPeeringService = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectConnectionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> bandwidthInMbps;
        private @Nullable Input<BgpSessionArgs> bgpSession;
        private @Nullable Input<String> connectionIdentifier;
        private @Nullable Input<Integer> peeringDBFacilityId;
        private @Nullable Input<Either<String,SessionAddressProvider>> sessionAddressProvider;
        private @Nullable Input<Boolean> useForPeeringService;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectConnectionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidthInMbps = defaults.bandwidthInMbps;
    	      this.bgpSession = defaults.bgpSession;
    	      this.connectionIdentifier = defaults.connectionIdentifier;
    	      this.peeringDBFacilityId = defaults.peeringDBFacilityId;
    	      this.sessionAddressProvider = defaults.sessionAddressProvider;
    	      this.useForPeeringService = defaults.useForPeeringService;
        }

        public Builder setBandwidthInMbps(@Nullable Input<Integer> bandwidthInMbps) {
            this.bandwidthInMbps = bandwidthInMbps;
            return this;
        }

        public Builder setBandwidthInMbps(@Nullable Integer bandwidthInMbps) {
            this.bandwidthInMbps = Input.ofNullable(bandwidthInMbps);
            return this;
        }

        public Builder setBgpSession(@Nullable Input<BgpSessionArgs> bgpSession) {
            this.bgpSession = bgpSession;
            return this;
        }

        public Builder setBgpSession(@Nullable BgpSessionArgs bgpSession) {
            this.bgpSession = Input.ofNullable(bgpSession);
            return this;
        }

        public Builder setConnectionIdentifier(@Nullable Input<String> connectionIdentifier) {
            this.connectionIdentifier = connectionIdentifier;
            return this;
        }

        public Builder setConnectionIdentifier(@Nullable String connectionIdentifier) {
            this.connectionIdentifier = Input.ofNullable(connectionIdentifier);
            return this;
        }

        public Builder setPeeringDBFacilityId(@Nullable Input<Integer> peeringDBFacilityId) {
            this.peeringDBFacilityId = peeringDBFacilityId;
            return this;
        }

        public Builder setPeeringDBFacilityId(@Nullable Integer peeringDBFacilityId) {
            this.peeringDBFacilityId = Input.ofNullable(peeringDBFacilityId);
            return this;
        }

        public Builder setSessionAddressProvider(@Nullable Input<Either<String,SessionAddressProvider>> sessionAddressProvider) {
            this.sessionAddressProvider = sessionAddressProvider;
            return this;
        }

        public Builder setSessionAddressProvider(@Nullable Either<String,SessionAddressProvider> sessionAddressProvider) {
            this.sessionAddressProvider = Input.ofNullable(sessionAddressProvider);
            return this;
        }

        public Builder setUseForPeeringService(@Nullable Input<Boolean> useForPeeringService) {
            this.useForPeeringService = useForPeeringService;
            return this;
        }

        public Builder setUseForPeeringService(@Nullable Boolean useForPeeringService) {
            this.useForPeeringService = Input.ofNullable(useForPeeringService);
            return this;
        }
        public DirectConnectionArgs build() {
            return new DirectConnectionArgs(bandwidthInMbps, bgpSession, connectionIdentifier, peeringDBFacilityId, sessionAddressProvider, useForPeeringService);
        }
    }
}
