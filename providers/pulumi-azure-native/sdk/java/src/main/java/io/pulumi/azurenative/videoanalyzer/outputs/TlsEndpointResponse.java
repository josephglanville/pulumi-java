// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.videoanalyzer.outputs;

import io.pulumi.azurenative.videoanalyzer.outputs.PemCertificateListResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.SecureIotDeviceRemoteTunnelResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.TlsValidationOptionsResponse;
import io.pulumi.azurenative.videoanalyzer.outputs.UsernamePasswordCredentialsResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class TlsEndpointResponse {
    private final UsernamePasswordCredentialsResponse credentials;
    private final @Nullable PemCertificateListResponse trustedCertificates;
    private final @Nullable SecureIotDeviceRemoteTunnelResponse tunnel;
    private final String type;
    private final String url;
    private final @Nullable TlsValidationOptionsResponse validationOptions;

    @OutputCustomType.Constructor({"credentials","trustedCertificates","tunnel","type","url","validationOptions"})
    private TlsEndpointResponse(
        UsernamePasswordCredentialsResponse credentials,
        @Nullable PemCertificateListResponse trustedCertificates,
        @Nullable SecureIotDeviceRemoteTunnelResponse tunnel,
        String type,
        String url,
        @Nullable TlsValidationOptionsResponse validationOptions) {
        this.credentials = Objects.requireNonNull(credentials);
        this.trustedCertificates = trustedCertificates;
        this.tunnel = tunnel;
        this.type = Objects.requireNonNull(type);
        this.url = Objects.requireNonNull(url);
        this.validationOptions = validationOptions;
    }

    public UsernamePasswordCredentialsResponse getCredentials() {
        return this.credentials;
    }
    public Optional<PemCertificateListResponse> getTrustedCertificates() {
        return Optional.ofNullable(this.trustedCertificates);
    }
    public Optional<SecureIotDeviceRemoteTunnelResponse> getTunnel() {
        return Optional.ofNullable(this.tunnel);
    }
    public String getType() {
        return this.type;
    }
    public String getUrl() {
        return this.url;
    }
    public Optional<TlsValidationOptionsResponse> getValidationOptions() {
        return Optional.ofNullable(this.validationOptions);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TlsEndpointResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private UsernamePasswordCredentialsResponse credentials;
        private @Nullable PemCertificateListResponse trustedCertificates;
        private @Nullable SecureIotDeviceRemoteTunnelResponse tunnel;
        private String type;
        private String url;
        private @Nullable TlsValidationOptionsResponse validationOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(TlsEndpointResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.credentials = defaults.credentials;
    	      this.trustedCertificates = defaults.trustedCertificates;
    	      this.tunnel = defaults.tunnel;
    	      this.type = defaults.type;
    	      this.url = defaults.url;
    	      this.validationOptions = defaults.validationOptions;
        }

        public Builder setCredentials(UsernamePasswordCredentialsResponse credentials) {
            this.credentials = Objects.requireNonNull(credentials);
            return this;
        }

        public Builder setTrustedCertificates(@Nullable PemCertificateListResponse trustedCertificates) {
            this.trustedCertificates = trustedCertificates;
            return this;
        }

        public Builder setTunnel(@Nullable SecureIotDeviceRemoteTunnelResponse tunnel) {
            this.tunnel = tunnel;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setUrl(String url) {
            this.url = Objects.requireNonNull(url);
            return this;
        }

        public Builder setValidationOptions(@Nullable TlsValidationOptionsResponse validationOptions) {
            this.validationOptions = validationOptions;
            return this;
        }

        public TlsEndpointResponse build() {
            return new TlsEndpointResponse(credentials, trustedCertificates, tunnel, type, url, validationOptions);
        }
    }
}