// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.dataproc.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ClusterClusterConfigSecurityConfigKerberosConfigGetArgs extends io.pulumi.resources.ResourceArgs {

    public static final ClusterClusterConfigSecurityConfigKerberosConfigGetArgs Empty = new ClusterClusterConfigSecurityConfigKerberosConfigGetArgs();

    @InputImport(name="crossRealmTrustAdminServer")
    private final @Nullable Input<String> crossRealmTrustAdminServer;

    public Input<String> getCrossRealmTrustAdminServer() {
        return this.crossRealmTrustAdminServer == null ? Input.empty() : this.crossRealmTrustAdminServer;
    }

    @InputImport(name="crossRealmTrustKdc")
    private final @Nullable Input<String> crossRealmTrustKdc;

    public Input<String> getCrossRealmTrustKdc() {
        return this.crossRealmTrustKdc == null ? Input.empty() : this.crossRealmTrustKdc;
    }

    @InputImport(name="crossRealmTrustRealm")
    private final @Nullable Input<String> crossRealmTrustRealm;

    public Input<String> getCrossRealmTrustRealm() {
        return this.crossRealmTrustRealm == null ? Input.empty() : this.crossRealmTrustRealm;
    }

    @InputImport(name="crossRealmTrustSharedPasswordUri")
    private final @Nullable Input<String> crossRealmTrustSharedPasswordUri;

    public Input<String> getCrossRealmTrustSharedPasswordUri() {
        return this.crossRealmTrustSharedPasswordUri == null ? Input.empty() : this.crossRealmTrustSharedPasswordUri;
    }

    @InputImport(name="enableKerberos")
    private final @Nullable Input<Boolean> enableKerberos;

    public Input<Boolean> getEnableKerberos() {
        return this.enableKerberos == null ? Input.empty() : this.enableKerberos;
    }

    @InputImport(name="kdcDbKeyUri")
    private final @Nullable Input<String> kdcDbKeyUri;

    public Input<String> getKdcDbKeyUri() {
        return this.kdcDbKeyUri == null ? Input.empty() : this.kdcDbKeyUri;
    }

    @InputImport(name="keyPasswordUri")
    private final @Nullable Input<String> keyPasswordUri;

    public Input<String> getKeyPasswordUri() {
        return this.keyPasswordUri == null ? Input.empty() : this.keyPasswordUri;
    }

    @InputImport(name="keystorePasswordUri")
    private final @Nullable Input<String> keystorePasswordUri;

    public Input<String> getKeystorePasswordUri() {
        return this.keystorePasswordUri == null ? Input.empty() : this.keystorePasswordUri;
    }

    @InputImport(name="keystoreUri")
    private final @Nullable Input<String> keystoreUri;

    public Input<String> getKeystoreUri() {
        return this.keystoreUri == null ? Input.empty() : this.keystoreUri;
    }

    @InputImport(name="kmsKeyUri", required=true)
    private final Input<String> kmsKeyUri;

    public Input<String> getKmsKeyUri() {
        return this.kmsKeyUri;
    }

    @InputImport(name="realm")
    private final @Nullable Input<String> realm;

    public Input<String> getRealm() {
        return this.realm == null ? Input.empty() : this.realm;
    }

    @InputImport(name="rootPrincipalPasswordUri", required=true)
    private final Input<String> rootPrincipalPasswordUri;

    public Input<String> getRootPrincipalPasswordUri() {
        return this.rootPrincipalPasswordUri;
    }

    @InputImport(name="tgtLifetimeHours")
    private final @Nullable Input<Integer> tgtLifetimeHours;

    public Input<Integer> getTgtLifetimeHours() {
        return this.tgtLifetimeHours == null ? Input.empty() : this.tgtLifetimeHours;
    }

    @InputImport(name="truststorePasswordUri")
    private final @Nullable Input<String> truststorePasswordUri;

    public Input<String> getTruststorePasswordUri() {
        return this.truststorePasswordUri == null ? Input.empty() : this.truststorePasswordUri;
    }

    @InputImport(name="truststoreUri")
    private final @Nullable Input<String> truststoreUri;

    public Input<String> getTruststoreUri() {
        return this.truststoreUri == null ? Input.empty() : this.truststoreUri;
    }

    public ClusterClusterConfigSecurityConfigKerberosConfigGetArgs(
        @Nullable Input<String> crossRealmTrustAdminServer,
        @Nullable Input<String> crossRealmTrustKdc,
        @Nullable Input<String> crossRealmTrustRealm,
        @Nullable Input<String> crossRealmTrustSharedPasswordUri,
        @Nullable Input<Boolean> enableKerberos,
        @Nullable Input<String> kdcDbKeyUri,
        @Nullable Input<String> keyPasswordUri,
        @Nullable Input<String> keystorePasswordUri,
        @Nullable Input<String> keystoreUri,
        Input<String> kmsKeyUri,
        @Nullable Input<String> realm,
        Input<String> rootPrincipalPasswordUri,
        @Nullable Input<Integer> tgtLifetimeHours,
        @Nullable Input<String> truststorePasswordUri,
        @Nullable Input<String> truststoreUri) {
        this.crossRealmTrustAdminServer = crossRealmTrustAdminServer;
        this.crossRealmTrustKdc = crossRealmTrustKdc;
        this.crossRealmTrustRealm = crossRealmTrustRealm;
        this.crossRealmTrustSharedPasswordUri = crossRealmTrustSharedPasswordUri;
        this.enableKerberos = enableKerberos;
        this.kdcDbKeyUri = kdcDbKeyUri;
        this.keyPasswordUri = keyPasswordUri;
        this.keystorePasswordUri = keystorePasswordUri;
        this.keystoreUri = keystoreUri;
        this.kmsKeyUri = Objects.requireNonNull(kmsKeyUri, "expected parameter 'kmsKeyUri' to be non-null");
        this.realm = realm;
        this.rootPrincipalPasswordUri = Objects.requireNonNull(rootPrincipalPasswordUri, "expected parameter 'rootPrincipalPasswordUri' to be non-null");
        this.tgtLifetimeHours = tgtLifetimeHours;
        this.truststorePasswordUri = truststorePasswordUri;
        this.truststoreUri = truststoreUri;
    }

    private ClusterClusterConfigSecurityConfigKerberosConfigGetArgs() {
        this.crossRealmTrustAdminServer = Input.empty();
        this.crossRealmTrustKdc = Input.empty();
        this.crossRealmTrustRealm = Input.empty();
        this.crossRealmTrustSharedPasswordUri = Input.empty();
        this.enableKerberos = Input.empty();
        this.kdcDbKeyUri = Input.empty();
        this.keyPasswordUri = Input.empty();
        this.keystorePasswordUri = Input.empty();
        this.keystoreUri = Input.empty();
        this.kmsKeyUri = Input.empty();
        this.realm = Input.empty();
        this.rootPrincipalPasswordUri = Input.empty();
        this.tgtLifetimeHours = Input.empty();
        this.truststorePasswordUri = Input.empty();
        this.truststoreUri = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ClusterClusterConfigSecurityConfigKerberosConfigGetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<String> crossRealmTrustAdminServer;
        private @Nullable Input<String> crossRealmTrustKdc;
        private @Nullable Input<String> crossRealmTrustRealm;
        private @Nullable Input<String> crossRealmTrustSharedPasswordUri;
        private @Nullable Input<Boolean> enableKerberos;
        private @Nullable Input<String> kdcDbKeyUri;
        private @Nullable Input<String> keyPasswordUri;
        private @Nullable Input<String> keystorePasswordUri;
        private @Nullable Input<String> keystoreUri;
        private Input<String> kmsKeyUri;
        private @Nullable Input<String> realm;
        private Input<String> rootPrincipalPasswordUri;
        private @Nullable Input<Integer> tgtLifetimeHours;
        private @Nullable Input<String> truststorePasswordUri;
        private @Nullable Input<String> truststoreUri;

        public Builder() {
    	      // Empty
        }

        public Builder(ClusterClusterConfigSecurityConfigKerberosConfigGetArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.crossRealmTrustAdminServer = defaults.crossRealmTrustAdminServer;
    	      this.crossRealmTrustKdc = defaults.crossRealmTrustKdc;
    	      this.crossRealmTrustRealm = defaults.crossRealmTrustRealm;
    	      this.crossRealmTrustSharedPasswordUri = defaults.crossRealmTrustSharedPasswordUri;
    	      this.enableKerberos = defaults.enableKerberos;
    	      this.kdcDbKeyUri = defaults.kdcDbKeyUri;
    	      this.keyPasswordUri = defaults.keyPasswordUri;
    	      this.keystorePasswordUri = defaults.keystorePasswordUri;
    	      this.keystoreUri = defaults.keystoreUri;
    	      this.kmsKeyUri = defaults.kmsKeyUri;
    	      this.realm = defaults.realm;
    	      this.rootPrincipalPasswordUri = defaults.rootPrincipalPasswordUri;
    	      this.tgtLifetimeHours = defaults.tgtLifetimeHours;
    	      this.truststorePasswordUri = defaults.truststorePasswordUri;
    	      this.truststoreUri = defaults.truststoreUri;
        }

        public Builder setCrossRealmTrustAdminServer(@Nullable Input<String> crossRealmTrustAdminServer) {
            this.crossRealmTrustAdminServer = crossRealmTrustAdminServer;
            return this;
        }

        public Builder setCrossRealmTrustAdminServer(@Nullable String crossRealmTrustAdminServer) {
            this.crossRealmTrustAdminServer = Input.ofNullable(crossRealmTrustAdminServer);
            return this;
        }

        public Builder setCrossRealmTrustKdc(@Nullable Input<String> crossRealmTrustKdc) {
            this.crossRealmTrustKdc = crossRealmTrustKdc;
            return this;
        }

        public Builder setCrossRealmTrustKdc(@Nullable String crossRealmTrustKdc) {
            this.crossRealmTrustKdc = Input.ofNullable(crossRealmTrustKdc);
            return this;
        }

        public Builder setCrossRealmTrustRealm(@Nullable Input<String> crossRealmTrustRealm) {
            this.crossRealmTrustRealm = crossRealmTrustRealm;
            return this;
        }

        public Builder setCrossRealmTrustRealm(@Nullable String crossRealmTrustRealm) {
            this.crossRealmTrustRealm = Input.ofNullable(crossRealmTrustRealm);
            return this;
        }

        public Builder setCrossRealmTrustSharedPasswordUri(@Nullable Input<String> crossRealmTrustSharedPasswordUri) {
            this.crossRealmTrustSharedPasswordUri = crossRealmTrustSharedPasswordUri;
            return this;
        }

        public Builder setCrossRealmTrustSharedPasswordUri(@Nullable String crossRealmTrustSharedPasswordUri) {
            this.crossRealmTrustSharedPasswordUri = Input.ofNullable(crossRealmTrustSharedPasswordUri);
            return this;
        }

        public Builder setEnableKerberos(@Nullable Input<Boolean> enableKerberos) {
            this.enableKerberos = enableKerberos;
            return this;
        }

        public Builder setEnableKerberos(@Nullable Boolean enableKerberos) {
            this.enableKerberos = Input.ofNullable(enableKerberos);
            return this;
        }

        public Builder setKdcDbKeyUri(@Nullable Input<String> kdcDbKeyUri) {
            this.kdcDbKeyUri = kdcDbKeyUri;
            return this;
        }

        public Builder setKdcDbKeyUri(@Nullable String kdcDbKeyUri) {
            this.kdcDbKeyUri = Input.ofNullable(kdcDbKeyUri);
            return this;
        }

        public Builder setKeyPasswordUri(@Nullable Input<String> keyPasswordUri) {
            this.keyPasswordUri = keyPasswordUri;
            return this;
        }

        public Builder setKeyPasswordUri(@Nullable String keyPasswordUri) {
            this.keyPasswordUri = Input.ofNullable(keyPasswordUri);
            return this;
        }

        public Builder setKeystorePasswordUri(@Nullable Input<String> keystorePasswordUri) {
            this.keystorePasswordUri = keystorePasswordUri;
            return this;
        }

        public Builder setKeystorePasswordUri(@Nullable String keystorePasswordUri) {
            this.keystorePasswordUri = Input.ofNullable(keystorePasswordUri);
            return this;
        }

        public Builder setKeystoreUri(@Nullable Input<String> keystoreUri) {
            this.keystoreUri = keystoreUri;
            return this;
        }

        public Builder setKeystoreUri(@Nullable String keystoreUri) {
            this.keystoreUri = Input.ofNullable(keystoreUri);
            return this;
        }

        public Builder setKmsKeyUri(Input<String> kmsKeyUri) {
            this.kmsKeyUri = Objects.requireNonNull(kmsKeyUri);
            return this;
        }

        public Builder setKmsKeyUri(String kmsKeyUri) {
            this.kmsKeyUri = Input.of(Objects.requireNonNull(kmsKeyUri));
            return this;
        }

        public Builder setRealm(@Nullable Input<String> realm) {
            this.realm = realm;
            return this;
        }

        public Builder setRealm(@Nullable String realm) {
            this.realm = Input.ofNullable(realm);
            return this;
        }

        public Builder setRootPrincipalPasswordUri(Input<String> rootPrincipalPasswordUri) {
            this.rootPrincipalPasswordUri = Objects.requireNonNull(rootPrincipalPasswordUri);
            return this;
        }

        public Builder setRootPrincipalPasswordUri(String rootPrincipalPasswordUri) {
            this.rootPrincipalPasswordUri = Input.of(Objects.requireNonNull(rootPrincipalPasswordUri));
            return this;
        }

        public Builder setTgtLifetimeHours(@Nullable Input<Integer> tgtLifetimeHours) {
            this.tgtLifetimeHours = tgtLifetimeHours;
            return this;
        }

        public Builder setTgtLifetimeHours(@Nullable Integer tgtLifetimeHours) {
            this.tgtLifetimeHours = Input.ofNullable(tgtLifetimeHours);
            return this;
        }

        public Builder setTruststorePasswordUri(@Nullable Input<String> truststorePasswordUri) {
            this.truststorePasswordUri = truststorePasswordUri;
            return this;
        }

        public Builder setTruststorePasswordUri(@Nullable String truststorePasswordUri) {
            this.truststorePasswordUri = Input.ofNullable(truststorePasswordUri);
            return this;
        }

        public Builder setTruststoreUri(@Nullable Input<String> truststoreUri) {
            this.truststoreUri = truststoreUri;
            return this;
        }

        public Builder setTruststoreUri(@Nullable String truststoreUri) {
            this.truststoreUri = Input.ofNullable(truststoreUri);
            return this;
        }

        public ClusterClusterConfigSecurityConfigKerberosConfigGetArgs build() {
            return new ClusterClusterConfigSecurityConfigKerberosConfigGetArgs(crossRealmTrustAdminServer, crossRealmTrustKdc, crossRealmTrustRealm, crossRealmTrustSharedPasswordUri, enableKerberos, kdcDbKeyUri, keyPasswordUri, keystorePasswordUri, keystoreUri, kmsKeyUri, realm, rootPrincipalPasswordUri, tgtLifetimeHours, truststorePasswordUri, truststoreUri);
        }
    }
}