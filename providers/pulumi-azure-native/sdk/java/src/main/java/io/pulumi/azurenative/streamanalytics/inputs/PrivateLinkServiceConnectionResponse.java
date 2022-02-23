// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.inputs;

import io.pulumi.azurenative.streamanalytics.inputs.PrivateLinkConnectionStateResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * A grouping of information about the connection to the remote resource.
 * 
 */
public final class PrivateLinkServiceConnectionResponse extends io.pulumi.resources.InvokeArgs {

    public static final PrivateLinkServiceConnectionResponse Empty = new PrivateLinkServiceConnectionResponse();

    /**
     * The ID(s) of the group(s) obtained from the remote resource that this private endpoint should connect to. Required on PUT (CreateOrUpdate) requests.
     * 
     */
    @InputImport(name="groupIds")
      private final @Nullable List<String> groupIds;

    public List<String> getGroupIds() {
        return this.groupIds == null ? List.of() : this.groupIds;
    }

    /**
     * A collection of read-only information about the state of the connection to the private remote resource.
     * 
     */
    @InputImport(name="privateLinkServiceConnectionState")
      private final @Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState;

    public Optional<PrivateLinkConnectionStateResponse> getPrivateLinkServiceConnectionState() {
        return this.privateLinkServiceConnectionState == null ? Optional.empty() : Optional.ofNullable(this.privateLinkServiceConnectionState);
    }

    /**
     * The resource id of the private link service. Required on PUT (CreateOrUpdate) requests.
     * 
     */
    @InputImport(name="privateLinkServiceId")
      private final @Nullable String privateLinkServiceId;

    public Optional<String> getPrivateLinkServiceId() {
        return this.privateLinkServiceId == null ? Optional.empty() : Optional.ofNullable(this.privateLinkServiceId);
    }

    /**
     * A message passed to the owner of the remote resource with this connection request. Restricted to 140 chars.
     * 
     */
    @InputImport(name="requestMessage")
      private final @Nullable String requestMessage;

    public Optional<String> getRequestMessage() {
        return this.requestMessage == null ? Optional.empty() : Optional.ofNullable(this.requestMessage);
    }

    public PrivateLinkServiceConnectionResponse(
        @Nullable List<String> groupIds,
        @Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState,
        @Nullable String privateLinkServiceId,
        @Nullable String requestMessage) {
        this.groupIds = groupIds;
        this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
        this.privateLinkServiceId = privateLinkServiceId;
        this.requestMessage = requestMessage;
    }

    private PrivateLinkServiceConnectionResponse() {
        this.groupIds = List.of();
        this.privateLinkServiceConnectionState = null;
        this.privateLinkServiceId = null;
        this.requestMessage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PrivateLinkServiceConnectionResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> groupIds;
        private @Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState;
        private @Nullable String privateLinkServiceId;
        private @Nullable String requestMessage;

        public Builder() {
    	      // Empty
        }

        public Builder(PrivateLinkServiceConnectionResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.groupIds = defaults.groupIds;
    	      this.privateLinkServiceConnectionState = defaults.privateLinkServiceConnectionState;
    	      this.privateLinkServiceId = defaults.privateLinkServiceId;
    	      this.requestMessage = defaults.requestMessage;
        }

        public Builder setGroupIds(@Nullable List<String> groupIds) {
            this.groupIds = groupIds;
            return this;
        }

        public Builder setPrivateLinkServiceConnectionState(@Nullable PrivateLinkConnectionStateResponse privateLinkServiceConnectionState) {
            this.privateLinkServiceConnectionState = privateLinkServiceConnectionState;
            return this;
        }

        public Builder setPrivateLinkServiceId(@Nullable String privateLinkServiceId) {
            this.privateLinkServiceId = privateLinkServiceId;
            return this;
        }

        public Builder setRequestMessage(@Nullable String requestMessage) {
            this.requestMessage = requestMessage;
            return this;
        }
        public PrivateLinkServiceConnectionResponse build() {
            return new PrivateLinkServiceConnectionResponse(groupIds, privateLinkServiceConnectionState, privateLinkServiceId, requestMessage);
        }
    }
}
