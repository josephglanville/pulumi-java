// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.containerservice.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ManagedClusterHTTPProxyConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final ManagedClusterHTTPProxyConfigResponse Empty = new ManagedClusterHTTPProxyConfigResponse();

    @InputImport(name="httpProxy")
    private final @Nullable String httpProxy;

    public Optional<String> getHttpProxy() {
        return this.httpProxy == null ? Optional.empty() : Optional.ofNullable(this.httpProxy);
    }

    @InputImport(name="httpsProxy")
    private final @Nullable String httpsProxy;

    public Optional<String> getHttpsProxy() {
        return this.httpsProxy == null ? Optional.empty() : Optional.ofNullable(this.httpsProxy);
    }

    @InputImport(name="noProxy")
    private final @Nullable List<String> noProxy;

    public List<String> getNoProxy() {
        return this.noProxy == null ? List.of() : this.noProxy;
    }

    @InputImport(name="trustedCa")
    private final @Nullable String trustedCa;

    public Optional<String> getTrustedCa() {
        return this.trustedCa == null ? Optional.empty() : Optional.ofNullable(this.trustedCa);
    }

    public ManagedClusterHTTPProxyConfigResponse(
        @Nullable String httpProxy,
        @Nullable String httpsProxy,
        @Nullable List<String> noProxy,
        @Nullable String trustedCa) {
        this.httpProxy = httpProxy;
        this.httpsProxy = httpsProxy;
        this.noProxy = noProxy;
        this.trustedCa = trustedCa;
    }

    private ManagedClusterHTTPProxyConfigResponse() {
        this.httpProxy = null;
        this.httpsProxy = null;
        this.noProxy = List.of();
        this.trustedCa = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ManagedClusterHTTPProxyConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String httpProxy;
        private @Nullable String httpsProxy;
        private @Nullable List<String> noProxy;
        private @Nullable String trustedCa;

        public Builder() {
    	      // Empty
        }

        public Builder(ManagedClusterHTTPProxyConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.httpProxy = defaults.httpProxy;
    	      this.httpsProxy = defaults.httpsProxy;
    	      this.noProxy = defaults.noProxy;
    	      this.trustedCa = defaults.trustedCa;
        }

        public Builder setHttpProxy(@Nullable String httpProxy) {
            this.httpProxy = httpProxy;
            return this;
        }

        public Builder setHttpsProxy(@Nullable String httpsProxy) {
            this.httpsProxy = httpsProxy;
            return this;
        }

        public Builder setNoProxy(@Nullable List<String> noProxy) {
            this.noProxy = noProxy;
            return this;
        }

        public Builder setTrustedCa(@Nullable String trustedCa) {
            this.trustedCa = trustedCa;
            return this;
        }

        public ManagedClusterHTTPProxyConfigResponse build() {
            return new ManagedClusterHTTPProxyConfigResponse(httpProxy, httpsProxy, noProxy, trustedCa);
        }
    }
}
