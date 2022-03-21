// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.compute_alpha.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The authentication and authorization settings for a BackendService.
 * 
 */
public final class SecuritySettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final SecuritySettingsArgs Empty = new SecuritySettingsArgs();

    /**
     * Optional. A URL referring to a networksecurity.ClientTlsPolicy resource that describes how clients should authenticate with this service's backends. clientTlsPolicy only applies to a global BackendService with the loadBalancingScheme set to INTERNAL_SELF_MANAGED. If left blank, communications are not encrypted. Note: This field currently has no impact.
     * 
     */
    @Import(name="clientTlsPolicy")
      private final @Nullable Output<String> clientTlsPolicy;

    public Output<String> getClientTlsPolicy() {
        return this.clientTlsPolicy == null ? Output.empty() : this.clientTlsPolicy;
    }

    /**
     * Optional. A list of Subject Alternative Names (SANs) that the client verifies during a mutual TLS handshake with an server/endpoint for this BackendService. When the server presents its X.509 certificate to the client, the client inspects the certificate's subjectAltName field. If the field contains one of the specified values, the communication continues. Otherwise, it fails. This additional check enables the client to verify that the server is authorized to run the requested service. Note that the contents of the server certificate's subjectAltName field are configured by the Public Key Infrastructure which provisions server identities. Only applies to a global BackendService with loadBalancingScheme set to INTERNAL_SELF_MANAGED. Only applies when BackendService has an attached clientTlsPolicy with clientCertificate (mTLS mode). Note: This field currently has no impact.
     * 
     */
    @Import(name="subjectAltNames")
      private final @Nullable Output<List<String>> subjectAltNames;

    public Output<List<String>> getSubjectAltNames() {
        return this.subjectAltNames == null ? Output.empty() : this.subjectAltNames;
    }

    public SecuritySettingsArgs(
        @Nullable Output<String> clientTlsPolicy,
        @Nullable Output<List<String>> subjectAltNames) {
        this.clientTlsPolicy = clientTlsPolicy;
        this.subjectAltNames = subjectAltNames;
    }

    private SecuritySettingsArgs() {
        this.clientTlsPolicy = Output.empty();
        this.subjectAltNames = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecuritySettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> clientTlsPolicy;
        private @Nullable Output<List<String>> subjectAltNames;

        public Builder() {
    	      // Empty
        }

        public Builder(SecuritySettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clientTlsPolicy = defaults.clientTlsPolicy;
    	      this.subjectAltNames = defaults.subjectAltNames;
        }

        public Builder clientTlsPolicy(@Nullable Output<String> clientTlsPolicy) {
            this.clientTlsPolicy = clientTlsPolicy;
            return this;
        }
        public Builder clientTlsPolicy(@Nullable String clientTlsPolicy) {
            this.clientTlsPolicy = Output.ofNullable(clientTlsPolicy);
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
        public Builder subjectAltNames(String... subjectAltNames) {
            return subjectAltNames(List.of(subjectAltNames));
        }        public SecuritySettingsArgs build() {
            return new SecuritySettingsArgs(clientTlsPolicy, subjectAltNames);
        }
    }
}
