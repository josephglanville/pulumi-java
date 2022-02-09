// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BackendResponse extends io.pulumi.resources.InvokeArgs {

    public static final BackendResponse Empty = new BackendResponse();

    @InputImport(name="address")
    private final @Nullable String address;

    public Optional<String> getAddress() {
        return this.address == null ? Optional.empty() : Optional.ofNullable(this.address);
    }

    @InputImport(name="backendHostHeader")
    private final @Nullable String backendHostHeader;

    public Optional<String> getBackendHostHeader() {
        return this.backendHostHeader == null ? Optional.empty() : Optional.ofNullable(this.backendHostHeader);
    }

    @InputImport(name="enabledState")
    private final @Nullable String enabledState;

    public Optional<String> getEnabledState() {
        return this.enabledState == null ? Optional.empty() : Optional.ofNullable(this.enabledState);
    }

    @InputImport(name="httpPort")
    private final @Nullable Integer httpPort;

    public Optional<Integer> getHttpPort() {
        return this.httpPort == null ? Optional.empty() : Optional.ofNullable(this.httpPort);
    }

    @InputImport(name="httpsPort")
    private final @Nullable Integer httpsPort;

    public Optional<Integer> getHttpsPort() {
        return this.httpsPort == null ? Optional.empty() : Optional.ofNullable(this.httpsPort);
    }

    @InputImport(name="priority")
    private final @Nullable Integer priority;

    public Optional<Integer> getPriority() {
        return this.priority == null ? Optional.empty() : Optional.ofNullable(this.priority);
    }

    @InputImport(name="privateEndpointStatus", required=true)
    private final String privateEndpointStatus;

    public String getPrivateEndpointStatus() {
        return this.privateEndpointStatus;
    }

    @InputImport(name="privateLinkAlias")
    private final @Nullable String privateLinkAlias;

    public Optional<String> getPrivateLinkAlias() {
        return this.privateLinkAlias == null ? Optional.empty() : Optional.ofNullable(this.privateLinkAlias);
    }

    @InputImport(name="privateLinkApprovalMessage")
    private final @Nullable String privateLinkApprovalMessage;

    public Optional<String> getPrivateLinkApprovalMessage() {
        return this.privateLinkApprovalMessage == null ? Optional.empty() : Optional.ofNullable(this.privateLinkApprovalMessage);
    }

    @InputImport(name="privateLinkLocation")
    private final @Nullable String privateLinkLocation;

    public Optional<String> getPrivateLinkLocation() {
        return this.privateLinkLocation == null ? Optional.empty() : Optional.ofNullable(this.privateLinkLocation);
    }

    @InputImport(name="privateLinkResourceId")
    private final @Nullable String privateLinkResourceId;

    public Optional<String> getPrivateLinkResourceId() {
        return this.privateLinkResourceId == null ? Optional.empty() : Optional.ofNullable(this.privateLinkResourceId);
    }

    @InputImport(name="weight")
    private final @Nullable Integer weight;

    public Optional<Integer> getWeight() {
        return this.weight == null ? Optional.empty() : Optional.ofNullable(this.weight);
    }

    public BackendResponse(
        @Nullable String address,
        @Nullable String backendHostHeader,
        @Nullable String enabledState,
        @Nullable Integer httpPort,
        @Nullable Integer httpsPort,
        @Nullable Integer priority,
        String privateEndpointStatus,
        @Nullable String privateLinkAlias,
        @Nullable String privateLinkApprovalMessage,
        @Nullable String privateLinkLocation,
        @Nullable String privateLinkResourceId,
        @Nullable Integer weight) {
        this.address = address;
        this.backendHostHeader = backendHostHeader;
        this.enabledState = enabledState;
        this.httpPort = httpPort;
        this.httpsPort = httpsPort;
        this.priority = priority;
        this.privateEndpointStatus = Objects.requireNonNull(privateEndpointStatus, "expected parameter 'privateEndpointStatus' to be non-null");
        this.privateLinkAlias = privateLinkAlias;
        this.privateLinkApprovalMessage = privateLinkApprovalMessage;
        this.privateLinkLocation = privateLinkLocation;
        this.privateLinkResourceId = privateLinkResourceId;
        this.weight = weight;
    }

    private BackendResponse() {
        this.address = null;
        this.backendHostHeader = null;
        this.enabledState = null;
        this.httpPort = null;
        this.httpsPort = null;
        this.priority = null;
        this.privateEndpointStatus = null;
        this.privateLinkAlias = null;
        this.privateLinkApprovalMessage = null;
        this.privateLinkLocation = null;
        this.privateLinkResourceId = null;
        this.weight = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(BackendResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String address;
        private @Nullable String backendHostHeader;
        private @Nullable String enabledState;
        private @Nullable Integer httpPort;
        private @Nullable Integer httpsPort;
        private @Nullable Integer priority;
        private String privateEndpointStatus;
        private @Nullable String privateLinkAlias;
        private @Nullable String privateLinkApprovalMessage;
        private @Nullable String privateLinkLocation;
        private @Nullable String privateLinkResourceId;
        private @Nullable Integer weight;

        public Builder() {
    	      // Empty
        }

        public Builder(BackendResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.address = defaults.address;
    	      this.backendHostHeader = defaults.backendHostHeader;
    	      this.enabledState = defaults.enabledState;
    	      this.httpPort = defaults.httpPort;
    	      this.httpsPort = defaults.httpsPort;
    	      this.priority = defaults.priority;
    	      this.privateEndpointStatus = defaults.privateEndpointStatus;
    	      this.privateLinkAlias = defaults.privateLinkAlias;
    	      this.privateLinkApprovalMessage = defaults.privateLinkApprovalMessage;
    	      this.privateLinkLocation = defaults.privateLinkLocation;
    	      this.privateLinkResourceId = defaults.privateLinkResourceId;
    	      this.weight = defaults.weight;
        }

        public Builder setAddress(@Nullable String address) {
            this.address = address;
            return this;
        }

        public Builder setBackendHostHeader(@Nullable String backendHostHeader) {
            this.backendHostHeader = backendHostHeader;
            return this;
        }

        public Builder setEnabledState(@Nullable String enabledState) {
            this.enabledState = enabledState;
            return this;
        }

        public Builder setHttpPort(@Nullable Integer httpPort) {
            this.httpPort = httpPort;
            return this;
        }

        public Builder setHttpsPort(@Nullable Integer httpsPort) {
            this.httpsPort = httpsPort;
            return this;
        }

        public Builder setPriority(@Nullable Integer priority) {
            this.priority = priority;
            return this;
        }

        public Builder setPrivateEndpointStatus(String privateEndpointStatus) {
            this.privateEndpointStatus = Objects.requireNonNull(privateEndpointStatus);
            return this;
        }

        public Builder setPrivateLinkAlias(@Nullable String privateLinkAlias) {
            this.privateLinkAlias = privateLinkAlias;
            return this;
        }

        public Builder setPrivateLinkApprovalMessage(@Nullable String privateLinkApprovalMessage) {
            this.privateLinkApprovalMessage = privateLinkApprovalMessage;
            return this;
        }

        public Builder setPrivateLinkLocation(@Nullable String privateLinkLocation) {
            this.privateLinkLocation = privateLinkLocation;
            return this;
        }

        public Builder setPrivateLinkResourceId(@Nullable String privateLinkResourceId) {
            this.privateLinkResourceId = privateLinkResourceId;
            return this;
        }

        public Builder setWeight(@Nullable Integer weight) {
            this.weight = weight;
            return this;
        }

        public BackendResponse build() {
            return new BackendResponse(address, backendHostHeader, enabledState, httpPort, httpsPort, priority, privateEndpointStatus, privateLinkAlias, privateLinkApprovalMessage, privateLinkLocation, privateLinkResourceId, weight);
        }
    }
}
