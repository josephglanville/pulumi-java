// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.compute_alpha.enums.ServerTlsSettingsTlsMode;
import io.pulumi.googlenative.compute_alpha.inputs.TlsContextArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The TLS settings for the server.
 * 
 */
public final class ServerTlsSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final ServerTlsSettingsArgs Empty = new ServerTlsSettingsArgs();

    /**
     * Configures the mechanism to obtain security certificates and identity information.
     * 
     */
    @InputImport(name="proxyTlsContext")
      private final @Nullable Output<TlsContextArgs> proxyTlsContext;

    public Output<TlsContextArgs> getProxyTlsContext() {
        return this.proxyTlsContext == null ? Output.empty() : this.proxyTlsContext;
    }

    /**
     * A list of alternate names to verify the subject identity in the certificate presented by the client.
     * 
     */
    @InputImport(name="subjectAltNames")
      private final @Nullable Output<List<String>> subjectAltNames;

    public Output<List<String>> getSubjectAltNames() {
        return this.subjectAltNames == null ? Output.empty() : this.subjectAltNames;
    }

    /**
     * Indicates whether connections should be secured using TLS. The value of this field determines how TLS is enforced. This field can be set to one of the following: - SIMPLE Secure connections with standard TLS semantics. - MUTUAL Secure connections to the backends using mutual TLS by presenting client certificates for authentication.
     * 
     */
    @InputImport(name="tlsMode")
      private final @Nullable Output<ServerTlsSettingsTlsMode> tlsMode;

    public Output<ServerTlsSettingsTlsMode> getTlsMode() {
        return this.tlsMode == null ? Output.empty() : this.tlsMode;
    }

    public ServerTlsSettingsArgs(
        @Nullable Output<TlsContextArgs> proxyTlsContext,
        @Nullable Output<List<String>> subjectAltNames,
        @Nullable Output<ServerTlsSettingsTlsMode> tlsMode) {
        this.proxyTlsContext = proxyTlsContext;
        this.subjectAltNames = subjectAltNames;
        this.tlsMode = tlsMode;
    }

    private ServerTlsSettingsArgs() {
        this.proxyTlsContext = Output.empty();
        this.subjectAltNames = Output.empty();
        this.tlsMode = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerTlsSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<TlsContextArgs> proxyTlsContext;
        private @Nullable Output<List<String>> subjectAltNames;
        private @Nullable Output<ServerTlsSettingsTlsMode> tlsMode;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerTlsSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.proxyTlsContext = defaults.proxyTlsContext;
    	      this.subjectAltNames = defaults.subjectAltNames;
    	      this.tlsMode = defaults.tlsMode;
        }

        public Builder proxyTlsContext(@Nullable Output<TlsContextArgs> proxyTlsContext) {
            this.proxyTlsContext = proxyTlsContext;
            return this;
        }

        public Builder proxyTlsContext(@Nullable TlsContextArgs proxyTlsContext) {
            this.proxyTlsContext = Output.ofNullable(proxyTlsContext);
            return this;
        }

        public Builder subjectAltNames(@Nullable Output<List<String>> subjectAltNames) {
            this.subjectAltNames = subjectAltNames;
            return this;
        }

        public Builder subjectAltNames(@Nullable List<String> subjectAltNames) {
            this.subjectAltNames = Output.ofNullable(subjectAltNames);
            return this;
        }

        public Builder tlsMode(@Nullable Output<ServerTlsSettingsTlsMode> tlsMode) {
            this.tlsMode = tlsMode;
            return this;
        }

        public Builder tlsMode(@Nullable ServerTlsSettingsTlsMode tlsMode) {
            this.tlsMode = Output.ofNullable(tlsMode);
            return this;
        }
        public ServerTlsSettingsArgs build() {
            return new ServerTlsSettingsArgs(proxyTlsContext, subjectAltNames, tlsMode);
        }
    }
}
