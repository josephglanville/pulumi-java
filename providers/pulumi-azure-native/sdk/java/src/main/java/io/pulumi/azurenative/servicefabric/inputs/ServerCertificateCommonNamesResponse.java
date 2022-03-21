// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.servicefabric.inputs;

import io.pulumi.azurenative.servicefabric.inputs.ServerCertificateCommonNameResponse;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Describes a list of server certificates referenced by common name that are used to secure the cluster.
 * 
 */
public final class ServerCertificateCommonNamesResponse extends io.pulumi.resources.InvokeArgs {

    public static final ServerCertificateCommonNamesResponse Empty = new ServerCertificateCommonNamesResponse();

    /**
     * The list of server certificates referenced by common name that are used to secure the cluster.
     * 
     */
    @Import(name="commonNames")
      private final @Nullable List<ServerCertificateCommonNameResponse> commonNames;

    public List<ServerCertificateCommonNameResponse> getCommonNames() {
        return this.commonNames == null ? List.of() : this.commonNames;
    }

    /**
     * The local certificate store location.
     * 
     */
    @Import(name="x509StoreName")
      private final @Nullable String x509StoreName;

    public Optional<String> getX509StoreName() {
        return this.x509StoreName == null ? Optional.empty() : Optional.ofNullable(this.x509StoreName);
    }

    public ServerCertificateCommonNamesResponse(
        @Nullable List<ServerCertificateCommonNameResponse> commonNames,
        @Nullable String x509StoreName) {
        this.commonNames = commonNames;
        this.x509StoreName = x509StoreName;
    }

    private ServerCertificateCommonNamesResponse() {
        this.commonNames = List.of();
        this.x509StoreName = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServerCertificateCommonNamesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ServerCertificateCommonNameResponse> commonNames;
        private @Nullable String x509StoreName;

        public Builder() {
    	      // Empty
        }

        public Builder(ServerCertificateCommonNamesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.commonNames = defaults.commonNames;
    	      this.x509StoreName = defaults.x509StoreName;
        }

        public Builder commonNames(@Nullable List<ServerCertificateCommonNameResponse> commonNames) {
            this.commonNames = commonNames;
            return this;
        }
        public Builder commonNames(ServerCertificateCommonNameResponse... commonNames) {
            return commonNames(List.of(commonNames));
        }
        public Builder x509StoreName(@Nullable String x509StoreName) {
            this.x509StoreName = x509StoreName;
            return this;
        }        public ServerCertificateCommonNamesResponse build() {
            return new ServerCertificateCommonNamesResponse(commonNames, x509StoreName);
        }
    }
}
