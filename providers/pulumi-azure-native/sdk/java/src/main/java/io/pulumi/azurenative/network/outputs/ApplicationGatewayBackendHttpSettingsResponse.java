// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.outputs;

import io.pulumi.azurenative.network.outputs.ApplicationGatewayConnectionDrainingResponse;
import io.pulumi.azurenative.network.outputs.SubResourceResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class ApplicationGatewayBackendHttpSettingsResponse {
    private final @Nullable String affinityCookieName;
    private final @Nullable List<SubResourceResponse> authenticationCertificates;
    private final @Nullable ApplicationGatewayConnectionDrainingResponse connectionDraining;
    private final @Nullable String cookieBasedAffinity;
    private final String etag;
    private final @Nullable String hostName;
    private final @Nullable String id;
    private final @Nullable String name;
    private final @Nullable String path;
    private final @Nullable Boolean pickHostNameFromBackendAddress;
    private final @Nullable Integer port;
    private final @Nullable SubResourceResponse probe;
    private final @Nullable Boolean probeEnabled;
    private final @Nullable String protocol;
    private final String provisioningState;
    private final @Nullable Integer requestTimeout;
    private final @Nullable List<SubResourceResponse> trustedRootCertificates;
    private final String type;

    @OutputCustomType.Constructor({"affinityCookieName","authenticationCertificates","connectionDraining","cookieBasedAffinity","etag","hostName","id","name","path","pickHostNameFromBackendAddress","port","probe","probeEnabled","protocol","provisioningState","requestTimeout","trustedRootCertificates","type"})
    private ApplicationGatewayBackendHttpSettingsResponse(
        @Nullable String affinityCookieName,
        @Nullable List<SubResourceResponse> authenticationCertificates,
        @Nullable ApplicationGatewayConnectionDrainingResponse connectionDraining,
        @Nullable String cookieBasedAffinity,
        String etag,
        @Nullable String hostName,
        @Nullable String id,
        @Nullable String name,
        @Nullable String path,
        @Nullable Boolean pickHostNameFromBackendAddress,
        @Nullable Integer port,
        @Nullable SubResourceResponse probe,
        @Nullable Boolean probeEnabled,
        @Nullable String protocol,
        String provisioningState,
        @Nullable Integer requestTimeout,
        @Nullable List<SubResourceResponse> trustedRootCertificates,
        String type) {
        this.affinityCookieName = affinityCookieName;
        this.authenticationCertificates = authenticationCertificates;
        this.connectionDraining = connectionDraining;
        this.cookieBasedAffinity = cookieBasedAffinity;
        this.etag = Objects.requireNonNull(etag);
        this.hostName = hostName;
        this.id = id;
        this.name = name;
        this.path = path;
        this.pickHostNameFromBackendAddress = pickHostNameFromBackendAddress;
        this.port = port;
        this.probe = probe;
        this.probeEnabled = probeEnabled;
        this.protocol = protocol;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.requestTimeout = requestTimeout;
        this.trustedRootCertificates = trustedRootCertificates;
        this.type = Objects.requireNonNull(type);
    }

    public Optional<String> getAffinityCookieName() {
        return Optional.ofNullable(this.affinityCookieName);
    }
    public List<SubResourceResponse> getAuthenticationCertificates() {
        return this.authenticationCertificates == null ? List.of() : this.authenticationCertificates;
    }
    public Optional<ApplicationGatewayConnectionDrainingResponse> getConnectionDraining() {
        return Optional.ofNullable(this.connectionDraining);
    }
    public Optional<String> getCookieBasedAffinity() {
        return Optional.ofNullable(this.cookieBasedAffinity);
    }
    public String getEtag() {
        return this.etag;
    }
    public Optional<String> getHostName() {
        return Optional.ofNullable(this.hostName);
    }
    public Optional<String> getId() {
        return Optional.ofNullable(this.id);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getPath() {
        return Optional.ofNullable(this.path);
    }
    public Optional<Boolean> getPickHostNameFromBackendAddress() {
        return Optional.ofNullable(this.pickHostNameFromBackendAddress);
    }
    public Optional<Integer> getPort() {
        return Optional.ofNullable(this.port);
    }
    public Optional<SubResourceResponse> getProbe() {
        return Optional.ofNullable(this.probe);
    }
    public Optional<Boolean> getProbeEnabled() {
        return Optional.ofNullable(this.probeEnabled);
    }
    public Optional<String> getProtocol() {
        return Optional.ofNullable(this.protocol);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public Optional<Integer> getRequestTimeout() {
        return Optional.ofNullable(this.requestTimeout);
    }
    public List<SubResourceResponse> getTrustedRootCertificates() {
        return this.trustedRootCertificates == null ? List.of() : this.trustedRootCertificates;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationGatewayBackendHttpSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String affinityCookieName;
        private @Nullable List<SubResourceResponse> authenticationCertificates;
        private @Nullable ApplicationGatewayConnectionDrainingResponse connectionDraining;
        private @Nullable String cookieBasedAffinity;
        private String etag;
        private @Nullable String hostName;
        private @Nullable String id;
        private @Nullable String name;
        private @Nullable String path;
        private @Nullable Boolean pickHostNameFromBackendAddress;
        private @Nullable Integer port;
        private @Nullable SubResourceResponse probe;
        private @Nullable Boolean probeEnabled;
        private @Nullable String protocol;
        private String provisioningState;
        private @Nullable Integer requestTimeout;
        private @Nullable List<SubResourceResponse> trustedRootCertificates;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationGatewayBackendHttpSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.affinityCookieName = defaults.affinityCookieName;
    	      this.authenticationCertificates = defaults.authenticationCertificates;
    	      this.connectionDraining = defaults.connectionDraining;
    	      this.cookieBasedAffinity = defaults.cookieBasedAffinity;
    	      this.etag = defaults.etag;
    	      this.hostName = defaults.hostName;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.path = defaults.path;
    	      this.pickHostNameFromBackendAddress = defaults.pickHostNameFromBackendAddress;
    	      this.port = defaults.port;
    	      this.probe = defaults.probe;
    	      this.probeEnabled = defaults.probeEnabled;
    	      this.protocol = defaults.protocol;
    	      this.provisioningState = defaults.provisioningState;
    	      this.requestTimeout = defaults.requestTimeout;
    	      this.trustedRootCertificates = defaults.trustedRootCertificates;
    	      this.type = defaults.type;
        }

        public Builder setAffinityCookieName(@Nullable String affinityCookieName) {
            this.affinityCookieName = affinityCookieName;
            return this;
        }

        public Builder setAuthenticationCertificates(@Nullable List<SubResourceResponse> authenticationCertificates) {
            this.authenticationCertificates = authenticationCertificates;
            return this;
        }

        public Builder setConnectionDraining(@Nullable ApplicationGatewayConnectionDrainingResponse connectionDraining) {
            this.connectionDraining = connectionDraining;
            return this;
        }

        public Builder setCookieBasedAffinity(@Nullable String cookieBasedAffinity) {
            this.cookieBasedAffinity = cookieBasedAffinity;
            return this;
        }

        public Builder setEtag(String etag) {
            this.etag = Objects.requireNonNull(etag);
            return this;
        }

        public Builder setHostName(@Nullable String hostName) {
            this.hostName = hostName;
            return this;
        }

        public Builder setId(@Nullable String id) {
            this.id = id;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setPath(@Nullable String path) {
            this.path = path;
            return this;
        }

        public Builder setPickHostNameFromBackendAddress(@Nullable Boolean pickHostNameFromBackendAddress) {
            this.pickHostNameFromBackendAddress = pickHostNameFromBackendAddress;
            return this;
        }

        public Builder setPort(@Nullable Integer port) {
            this.port = port;
            return this;
        }

        public Builder setProbe(@Nullable SubResourceResponse probe) {
            this.probe = probe;
            return this;
        }

        public Builder setProbeEnabled(@Nullable Boolean probeEnabled) {
            this.probeEnabled = probeEnabled;
            return this;
        }

        public Builder setProtocol(@Nullable String protocol) {
            this.protocol = protocol;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRequestTimeout(@Nullable Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }

        public Builder setTrustedRootCertificates(@Nullable List<SubResourceResponse> trustedRootCertificates) {
            this.trustedRootCertificates = trustedRootCertificates;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public ApplicationGatewayBackendHttpSettingsResponse build() {
            return new ApplicationGatewayBackendHttpSettingsResponse(affinityCookieName, authenticationCertificates, connectionDraining, cookieBasedAffinity, etag, hostName, id, name, path, pickHostNameFromBackendAddress, port, probe, probeEnabled, protocol, provisioningState, requestTimeout, trustedRootCertificates, type);
        }
    }
}
