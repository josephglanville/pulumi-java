// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.kubernetes.networking.k8s.io_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IngressTLS {
    /**
     * Hosts are a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
     * 
     */
    private final @Nullable List<String> hosts;
    /**
     * SecretName is the name of the secret used to terminate TLS traffic on port 443. Field is left optional to allow TLS routing based on SNI hostname alone. If the SNI host in a listener conflicts with the "Host" header field used by an IngressRule, the SNI host is used for termination and value of the Host header is used for routing.
     * 
     */
    private final @Nullable String secretName;

    @CustomType.Constructor
    private IngressTLS(
        @CustomType.Parameter("hosts") @Nullable List<String> hosts,
        @CustomType.Parameter("secretName") @Nullable String secretName) {
        this.hosts = hosts;
        this.secretName = secretName;
    }

    /**
     * Hosts are a list of hosts included in the TLS certificate. The values in this list must match the name/s used in the tlsSecret. Defaults to the wildcard host setting for the loadbalancer controller fulfilling this Ingress, if left unspecified.
     * 
    */
    public List<String> getHosts() {
        return this.hosts == null ? List.of() : this.hosts;
    }
    /**
     * SecretName is the name of the secret used to terminate TLS traffic on port 443. Field is left optional to allow TLS routing based on SNI hostname alone. If the SNI host in a listener conflicts with the "Host" header field used by an IngressRule, the SNI host is used for termination and value of the Host header is used for routing.
     * 
    */
    public Optional<String> getSecretName() {
        return Optional.ofNullable(this.secretName);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IngressTLS defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> hosts;
        private @Nullable String secretName;

        public Builder() {
    	      // Empty
        }

        public Builder(IngressTLS defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hosts = defaults.hosts;
    	      this.secretName = defaults.secretName;
        }

        public Builder hosts(@Nullable List<String> hosts) {
            this.hosts = hosts;
            return this;
        }
        public Builder hosts(String... hosts) {
            return hosts(List.of(hosts));
        }
        public Builder secretName(@Nullable String secretName) {
            this.secretName = secretName;
            return this;
        }        public IngressTLS build() {
            return new IngressTLS(hosts, secretName);
        }
    }
}
