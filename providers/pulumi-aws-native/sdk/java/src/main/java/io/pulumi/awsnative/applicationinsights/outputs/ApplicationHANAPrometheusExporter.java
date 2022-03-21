// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.applicationinsights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ApplicationHANAPrometheusExporter {
    /**
     * A flag which indicates agreeing to install SAP HANA DB client.
     * 
     */
    private final Boolean agreeToInstallHANADBClient;
    /**
     * The HANA DB port.
     * 
     */
    private final String hANAPort;
    /**
     * HANA DB SID.
     * 
     */
    private final String hANASID;
    /**
     * The secret name which manages the HANA DB credentials e.g. {
     *   "username": "<>",
     *   "password": "<>"
     * }.
     * 
     */
    private final String hANASecretName;
    /**
     * Prometheus exporter port.
     * 
     */
    private final @Nullable String prometheusPort;

    @CustomType.Constructor
    private ApplicationHANAPrometheusExporter(
        @CustomType.Parameter("agreeToInstallHANADBClient") Boolean agreeToInstallHANADBClient,
        @CustomType.Parameter("hANAPort") String hANAPort,
        @CustomType.Parameter("hANASID") String hANASID,
        @CustomType.Parameter("hANASecretName") String hANASecretName,
        @CustomType.Parameter("prometheusPort") @Nullable String prometheusPort) {
        this.agreeToInstallHANADBClient = agreeToInstallHANADBClient;
        this.hANAPort = hANAPort;
        this.hANASID = hANASID;
        this.hANASecretName = hANASecretName;
        this.prometheusPort = prometheusPort;
    }

    /**
     * A flag which indicates agreeing to install SAP HANA DB client.
     * 
    */
    public Boolean getAgreeToInstallHANADBClient() {
        return this.agreeToInstallHANADBClient;
    }
    /**
     * The HANA DB port.
     * 
    */
    public String getHANAPort() {
        return this.hANAPort;
    }
    /**
     * HANA DB SID.
     * 
    */
    public String getHANASID() {
        return this.hANASID;
    }
    /**
     * The secret name which manages the HANA DB credentials e.g. {
     *   "username": "<>",
     *   "password": "<>"
     * }.
     * 
    */
    public String getHANASecretName() {
        return this.hANASecretName;
    }
    /**
     * Prometheus exporter port.
     * 
    */
    public Optional<String> getPrometheusPort() {
        return Optional.ofNullable(this.prometheusPort);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ApplicationHANAPrometheusExporter defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean agreeToInstallHANADBClient;
        private String hANAPort;
        private String hANASID;
        private String hANASecretName;
        private @Nullable String prometheusPort;

        public Builder() {
    	      // Empty
        }

        public Builder(ApplicationHANAPrometheusExporter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.agreeToInstallHANADBClient = defaults.agreeToInstallHANADBClient;
    	      this.hANAPort = defaults.hANAPort;
    	      this.hANASID = defaults.hANASID;
    	      this.hANASecretName = defaults.hANASecretName;
    	      this.prometheusPort = defaults.prometheusPort;
        }

        public Builder agreeToInstallHANADBClient(Boolean agreeToInstallHANADBClient) {
            this.agreeToInstallHANADBClient = Objects.requireNonNull(agreeToInstallHANADBClient);
            return this;
        }
        public Builder hANAPort(String hANAPort) {
            this.hANAPort = Objects.requireNonNull(hANAPort);
            return this;
        }
        public Builder hANASID(String hANASID) {
            this.hANASID = Objects.requireNonNull(hANASID);
            return this;
        }
        public Builder hANASecretName(String hANASecretName) {
            this.hANASecretName = Objects.requireNonNull(hANASecretName);
            return this;
        }
        public Builder prometheusPort(@Nullable String prometheusPort) {
            this.prometheusPort = prometheusPort;
            return this;
        }        public ApplicationHANAPrometheusExporter build() {
            return new ApplicationHANAPrometheusExporter(agreeToInstallHANADBClient, hANAPort, hANASID, hANASecretName, prometheusPort);
        }
    }
}
