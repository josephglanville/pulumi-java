// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.peering.inputs;

import io.pulumi.azurenative.peering.inputs.BgpSessionResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The properties that define an exchange connection.
 * 
 */
public final class ExchangeConnectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExchangeConnectionResponse Empty = new ExchangeConnectionResponse();

    /**
     * The BGP session associated with the connection.
     * 
     */
    @InputImport(name="bgpSession")
      private final @Nullable BgpSessionResponse bgpSession;

    public Optional<BgpSessionResponse> getBgpSession() {
        return this.bgpSession == null ? Optional.empty() : Optional.ofNullable(this.bgpSession);
    }

    /**
     * The unique identifier (GUID) for the connection.
     * 
     */
    @InputImport(name="connectionIdentifier")
      private final @Nullable String connectionIdentifier;

    public Optional<String> getConnectionIdentifier() {
        return this.connectionIdentifier == null ? Optional.empty() : Optional.ofNullable(this.connectionIdentifier);
    }

    /**
     * The state of the connection.
     * 
     */
    @InputImport(name="connectionState", required=true)
      private final String connectionState;

    public String getConnectionState() {
        return this.connectionState;
    }

    /**
     * The error message related to the connection state, if any.
     * 
     */
    @InputImport(name="errorMessage", required=true)
      private final String errorMessage;

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * The PeeringDB.com ID of the facility at which the connection has to be set up.
     * 
     */
    @InputImport(name="peeringDBFacilityId")
      private final @Nullable Integer peeringDBFacilityId;

    public Optional<Integer> getPeeringDBFacilityId() {
        return this.peeringDBFacilityId == null ? Optional.empty() : Optional.ofNullable(this.peeringDBFacilityId);
    }

    public ExchangeConnectionResponse(
        @Nullable BgpSessionResponse bgpSession,
        @Nullable String connectionIdentifier,
        String connectionState,
        String errorMessage,
        @Nullable Integer peeringDBFacilityId) {
        this.bgpSession = bgpSession;
        this.connectionIdentifier = connectionIdentifier;
        this.connectionState = Objects.requireNonNull(connectionState, "expected parameter 'connectionState' to be non-null");
        this.errorMessage = Objects.requireNonNull(errorMessage, "expected parameter 'errorMessage' to be non-null");
        this.peeringDBFacilityId = peeringDBFacilityId;
    }

    private ExchangeConnectionResponse() {
        this.bgpSession = null;
        this.connectionIdentifier = null;
        this.connectionState = null;
        this.errorMessage = null;
        this.peeringDBFacilityId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExchangeConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BgpSessionResponse bgpSession;
        private @Nullable String connectionIdentifier;
        private String connectionState;
        private String errorMessage;
        private @Nullable Integer peeringDBFacilityId;

        public Builder() {
    	      // Empty
        }

        public Builder(ExchangeConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bgpSession = defaults.bgpSession;
    	      this.connectionIdentifier = defaults.connectionIdentifier;
    	      this.connectionState = defaults.connectionState;
    	      this.errorMessage = defaults.errorMessage;
    	      this.peeringDBFacilityId = defaults.peeringDBFacilityId;
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

        public Builder setPeeringDBFacilityId(@Nullable Integer peeringDBFacilityId) {
            this.peeringDBFacilityId = peeringDBFacilityId;
            return this;
        }
        public ExchangeConnectionResponse build() {
            return new ExchangeConnectionResponse(bgpSession, connectionIdentifier, connectionState, errorMessage, peeringDBFacilityId);
        }
    }
}
