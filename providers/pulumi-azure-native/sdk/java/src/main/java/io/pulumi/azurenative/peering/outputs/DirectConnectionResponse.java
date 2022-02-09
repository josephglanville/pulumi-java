// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.outputs;

import io.pulumi.azurenative.peering.outputs.BgpSessionResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DirectConnectionResponse {
    private final @Nullable Integer bandwidthInMbps;
    private final @Nullable BgpSessionResponse bgpSession;
    private final @Nullable String connectionIdentifier;
    private final String connectionState;
    private final String errorMessage;
    private final String microsoftTrackingId;
    private final @Nullable Integer peeringDBFacilityId;
    private final Integer provisionedBandwidthInMbps;
    private final @Nullable String sessionAddressProvider;
    private final @Nullable Boolean useForPeeringService;

    @OutputCustomType.Constructor({"bandwidthInMbps","bgpSession","connectionIdentifier","connectionState","errorMessage","microsoftTrackingId","peeringDBFacilityId","provisionedBandwidthInMbps","sessionAddressProvider","useForPeeringService"})
    private DirectConnectionResponse(
        @Nullable Integer bandwidthInMbps,
        @Nullable BgpSessionResponse bgpSession,
        @Nullable String connectionIdentifier,
        String connectionState,
        String errorMessage,
        String microsoftTrackingId,
        @Nullable Integer peeringDBFacilityId,
        Integer provisionedBandwidthInMbps,
        @Nullable String sessionAddressProvider,
        @Nullable Boolean useForPeeringService) {
        this.bandwidthInMbps = bandwidthInMbps;
        this.bgpSession = bgpSession;
        this.connectionIdentifier = connectionIdentifier;
        this.connectionState = Objects.requireNonNull(connectionState);
        this.errorMessage = Objects.requireNonNull(errorMessage);
        this.microsoftTrackingId = Objects.requireNonNull(microsoftTrackingId);
        this.peeringDBFacilityId = peeringDBFacilityId;
        this.provisionedBandwidthInMbps = Objects.requireNonNull(provisionedBandwidthInMbps);
        this.sessionAddressProvider = sessionAddressProvider;
        this.useForPeeringService = useForPeeringService;
    }

    public Optional<Integer> getBandwidthInMbps() {
        return Optional.ofNullable(this.bandwidthInMbps);
    }
    public Optional<BgpSessionResponse> getBgpSession() {
        return Optional.ofNullable(this.bgpSession);
    }
    public Optional<String> getConnectionIdentifier() {
        return Optional.ofNullable(this.connectionIdentifier);
    }
    public String getConnectionState() {
        return this.connectionState;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }
    public String getMicrosoftTrackingId() {
        return this.microsoftTrackingId;
    }
    public Optional<Integer> getPeeringDBFacilityId() {
        return Optional.ofNullable(this.peeringDBFacilityId);
    }
    public Integer getProvisionedBandwidthInMbps() {
        return this.provisionedBandwidthInMbps;
    }
    public Optional<String> getSessionAddressProvider() {
        return Optional.ofNullable(this.sessionAddressProvider);
    }
    public Optional<Boolean> getUseForPeeringService() {
        return Optional.ofNullable(this.useForPeeringService);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DirectConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Integer bandwidthInMbps;
        private @Nullable BgpSessionResponse bgpSession;
        private @Nullable String connectionIdentifier;
        private String connectionState;
        private String errorMessage;
        private String microsoftTrackingId;
        private @Nullable Integer peeringDBFacilityId;
        private Integer provisionedBandwidthInMbps;
        private @Nullable String sessionAddressProvider;
        private @Nullable Boolean useForPeeringService;

        public Builder() {
    	      // Empty
        }

        public Builder(DirectConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bandwidthInMbps = defaults.bandwidthInMbps;
    	      this.bgpSession = defaults.bgpSession;
    	      this.connectionIdentifier = defaults.connectionIdentifier;
    	      this.connectionState = defaults.connectionState;
    	      this.errorMessage = defaults.errorMessage;
    	      this.microsoftTrackingId = defaults.microsoftTrackingId;
    	      this.peeringDBFacilityId = defaults.peeringDBFacilityId;
    	      this.provisionedBandwidthInMbps = defaults.provisionedBandwidthInMbps;
    	      this.sessionAddressProvider = defaults.sessionAddressProvider;
    	      this.useForPeeringService = defaults.useForPeeringService;
        }

        public Builder setBandwidthInMbps(@Nullable Integer bandwidthInMbps) {
            this.bandwidthInMbps = bandwidthInMbps;
            return this;
        }

        public Builder setBgpSession(@Nullable BgpSessionResponse bgpSession) {
            this.bgpSession = bgpSession;
            return this;
        }

        public Builder setConnectionIdentifier(@Nullable String connectionIdentifier) {
            this.connectionIdentifier = connectionIdentifier;
            return this;
        }

        public Builder setConnectionState(String connectionState) {
            this.connectionState = Objects.requireNonNull(connectionState);
            return this;
        }

        public Builder setErrorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }

        public Builder setMicrosoftTrackingId(String microsoftTrackingId) {
            this.microsoftTrackingId = Objects.requireNonNull(microsoftTrackingId);
            return this;
        }

        public Builder setPeeringDBFacilityId(@Nullable Integer peeringDBFacilityId) {
            this.peeringDBFacilityId = peeringDBFacilityId;
            return this;
        }

        public Builder setProvisionedBandwidthInMbps(Integer provisionedBandwidthInMbps) {
            this.provisionedBandwidthInMbps = Objects.requireNonNull(provisionedBandwidthInMbps);
            return this;
        }

        public Builder setSessionAddressProvider(@Nullable String sessionAddressProvider) {
            this.sessionAddressProvider = sessionAddressProvider;
            return this;
        }

        public Builder setUseForPeeringService(@Nullable Boolean useForPeeringService) {
            this.useForPeeringService = useForPeeringService;
            return this;
        }

        public DirectConnectionResponse build() {
            return new DirectConnectionResponse(bandwidthInMbps, bgpSession, connectionIdentifier, connectionState, errorMessage, microsoftTrackingId, peeringDBFacilityId, provisionedBandwidthInMbps, sessionAddressProvider, useForPeeringService);
        }
    }
}
