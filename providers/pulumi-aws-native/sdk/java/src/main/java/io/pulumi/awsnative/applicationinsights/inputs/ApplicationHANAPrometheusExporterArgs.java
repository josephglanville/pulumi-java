// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The HANA DB Prometheus Exporter settings.
 * 
 */
public final class ApplicationHANAPrometheusExporterArgs extends io.pulumi.resources.ResourceArgs {

    public static final ApplicationHANAPrometheusExporterArgs Empty = new ApplicationHANAPrometheusExporterArgs();

    /**
     * A flag which indicates agreeing to install SAP HANA DB client.
     * 
     */
    @InputImport(name="agreeToInstallHANADBClient", required=true)
      private final Input<Boolean> agreeToInstallHANADBClient;

    public Input<Boolean> getAgreeToInstallHANADBClient() {
        return this.agreeToInstallHANADBClient;
    }

    /**
     * The HANA DB port.
     * 
     */
    @InputImport(name="hANAPort", required=true)
      private final Input<String> hANAPort;

    public Input<String> getHANAPort() {
        return this.hANAPort;
    }

    /**
     * HANA DB SID.
     * 
     */
    @InputImport(name="hANASID", required=true)
      private final Input<String> hANASID;

    public Input<String> getHANASID() {
        return this.hANASID;
    }

    /**
     * The secret name which manages the HANA DB credentials e.g. {
     *   "username": "<>",
     *   "password": "<>"
     * }.
     * 
     */
    @InputImport(name="hANASecretName", required=true)
      private final Input<String> hANASecretName;

    public Input<String> getHANASecretName() {
        return this.hANASecretName;
    }

    /**
     * Prometheus exporter port.
     * 
     */
    @InputImport(name="prometheusPort")
      private final @Nullable Input<String> prometheusPort;

    public Input<String> getPrometheusPort() {
        return this.prometheusPort == null ? Input.empty() : this.prometheusPort;
    }

    public ApplicationHANAPrometheusExporterArgs(
        Input<Boolean> agreeToInstallHANADBClient,
        Input<String> hANAPort,
        Input<String> hANASID,
        Input<String> hANASecretName,
        @Nullable Input<String> prometheusPort) {
        this.agreeToInstallHANADBClient = Objects.requireNonNull(agreeToInstallHANADBClient, "expected parameter 'agreeToInstallHANADBClient' to be non-null");
        this.hANAPort = Objects.requireNonNull(hANAPort, "expected parameter 'hANAPort' to be non-null");
        this.hANASID = Objects.requireNonNull(hANASID, "expected parameter 'hANASID' to be non-null");
        this.hANASecretName = Objects.requireNonNull(hANASecretName, "expected parameter 'hANASecretName' to be non-null");
        this.prometheusPort = prometheusPort;
    }

    private ApplicationHANAPrometheusExporterArgs() {
        this.agreeToInstallHANADBClient = Input.empty();
        this.hANAPort = Input.empty();
        this.hANASID = Input.empty();
        this.hANASecretName = Input.empty();
        this.prometheusPort = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationHANAPrometheusExporterArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<Boolean> agreeToInstallHANADBClient;
        private Input<String> hANAPort;
        private Input<String> hANASID;
        private Input<String> hANASecretName;
        private @Nullable Input<String> prometheusPort;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationHANAPrometheusExporterArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agreeToInstallHANADBClient = defaults.agreeToInstallHANADBClient;
    	      this.hANAPort = defaults.hANAPort;
    	      this.hANASID = defaults.hANASID;
    	      this.hANASecretName = defaults.hANASecretName;
    	      this.prometheusPort = defaults.prometheusPort;
        }

        public Builder setAgreeToInstallHANADBClient(Input<Boolean> agreeToInstallHANADBClient) {
            this.agreeToInstallHANADBClient = Objects.requireNonNull(agreeToInstallHANADBClient);
            return this;
        }

        public Builder setAgreeToInstallHANADBClient(Boolean agreeToInstallHANADBClient) {
            this.agreeToInstallHANADBClient = Input.of(Objects.requireNonNull(agreeToInstallHANADBClient));
            return this;
        }

        public Builder setHANAPort(Input<String> hANAPort) {
            this.hANAPort = Objects.requireNonNull(hANAPort);
            return this;
        }

        public Builder setHANAPort(String hANAPort) {
            this.hANAPort = Input.of(Objects.requireNonNull(hANAPort));
            return this;
        }

        public Builder setHANASID(Input<String> hANASID) {
            this.hANASID = Objects.requireNonNull(hANASID);
            return this;
        }

        public Builder setHANASID(String hANASID) {
            this.hANASID = Input.of(Objects.requireNonNull(hANASID));
            return this;
        }

        public Builder setHANASecretName(Input<String> hANASecretName) {
            this.hANASecretName = Objects.requireNonNull(hANASecretName);
            return this;
        }

        public Builder setHANASecretName(String hANASecretName) {
            this.hANASecretName = Input.of(Objects.requireNonNull(hANASecretName));
            return this;
        }

        public Builder setPrometheusPort(@Nullable Input<String> prometheusPort) {
            this.prometheusPort = prometheusPort;
            return this;
        }

        public Builder setPrometheusPort(@Nullable String prometheusPort) {
            this.prometheusPort = Input.ofNullable(prometheusPort);
            return this;
        }
        public ApplicationHANAPrometheusExporterArgs build() {
            return new ApplicationHANAPrometheusExporterArgs(agreeToInstallHANADBClient, hANAPort, hANASID, hANASecretName, prometheusPort);
        }
    }
}
