// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.azurearcdata.inputs;

import io.pulumi.azurenative.azurearcdata.inputs.BasicLoginInformationResponse;
import io.pulumi.azurenative.azurearcdata.inputs.LogAnalyticsWorkspaceConfigResponse;
import io.pulumi.azurenative.azurearcdata.inputs.OnPremisePropertyResponse;
import io.pulumi.azurenative.azurearcdata.inputs.UploadServicePrincipalResponse;
import io.pulumi.azurenative.azurearcdata.inputs.UploadWatermarkResponse;
import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * The data controller properties.
 * 
 */
public final class DataControllerPropertiesResponse extends io.pulumi.resources.InvokeArgs {

    public static final DataControllerPropertiesResponse Empty = new DataControllerPropertiesResponse();

    /**
     * Username and password for basic login authentication.
     * 
     */
    @InputImport(name="basicLoginInformation")
      private final @Nullable BasicLoginInformationResponse basicLoginInformation;

    public Optional<BasicLoginInformationResponse> getBasicLoginInformation() {
        return this.basicLoginInformation == null ? Optional.empty() : Optional.ofNullable(this.basicLoginInformation);
    }

    /**
     * The raw kubernetes information
     * 
     */
    @InputImport(name="k8sRaw")
      private final @Nullable Object k8sRaw;

    public Optional<Object> getK8sRaw() {
        return this.k8sRaw == null ? Optional.empty() : Optional.ofNullable(this.k8sRaw);
    }

    /**
     * Last uploaded date from Kubernetes cluster. Defaults to current date time
     * 
     */
    @InputImport(name="lastUploadedDate")
      private final @Nullable String lastUploadedDate;

    public Optional<String> getLastUploadedDate() {
        return this.lastUploadedDate == null ? Optional.empty() : Optional.ofNullable(this.lastUploadedDate);
    }

    /**
     * Log analytics workspace id and primary key
     * 
     */
    @InputImport(name="logAnalyticsWorkspaceConfig")
      private final @Nullable LogAnalyticsWorkspaceConfigResponse logAnalyticsWorkspaceConfig;

    public Optional<LogAnalyticsWorkspaceConfigResponse> getLogAnalyticsWorkspaceConfig() {
        return this.logAnalyticsWorkspaceConfig == null ? Optional.empty() : Optional.ofNullable(this.logAnalyticsWorkspaceConfig);
    }

    /**
     * Properties from the Kubernetes data controller
     * 
     */
    @InputImport(name="onPremiseProperty")
      private final @Nullable OnPremisePropertyResponse onPremiseProperty;

    public Optional<OnPremisePropertyResponse> getOnPremiseProperty() {
        return this.onPremiseProperty == null ? Optional.empty() : Optional.ofNullable(this.onPremiseProperty);
    }

    @InputImport(name="provisioningState", required=true)
      private final String provisioningState;

    public String getProvisioningState() {
        return this.provisioningState;
    }

    /**
     * Service principal for uploading billing, metrics and logs.
     * 
     */
    @InputImport(name="uploadServicePrincipal")
      private final @Nullable UploadServicePrincipalResponse uploadServicePrincipal;

    public Optional<UploadServicePrincipalResponse> getUploadServicePrincipal() {
        return this.uploadServicePrincipal == null ? Optional.empty() : Optional.ofNullable(this.uploadServicePrincipal);
    }

    /**
     * Properties on upload watermark.  Mostly timestamp for each upload data type
     * 
     */
    @InputImport(name="uploadWatermark")
      private final @Nullable UploadWatermarkResponse uploadWatermark;

    public Optional<UploadWatermarkResponse> getUploadWatermark() {
        return this.uploadWatermark == null ? Optional.empty() : Optional.ofNullable(this.uploadWatermark);
    }

    public DataControllerPropertiesResponse(
        @Nullable BasicLoginInformationResponse basicLoginInformation,
        @Nullable Object k8sRaw,
        @Nullable String lastUploadedDate,
        @Nullable LogAnalyticsWorkspaceConfigResponse logAnalyticsWorkspaceConfig,
        @Nullable OnPremisePropertyResponse onPremiseProperty,
        String provisioningState,
        @Nullable UploadServicePrincipalResponse uploadServicePrincipal,
        @Nullable UploadWatermarkResponse uploadWatermark) {
        this.basicLoginInformation = basicLoginInformation;
        this.k8sRaw = k8sRaw;
        this.lastUploadedDate = lastUploadedDate;
        this.logAnalyticsWorkspaceConfig = logAnalyticsWorkspaceConfig;
        this.onPremiseProperty = onPremiseProperty;
        this.provisioningState = Objects.requireNonNull(provisioningState, "expected parameter 'provisioningState' to be non-null");
        this.uploadServicePrincipal = uploadServicePrincipal;
        this.uploadWatermark = uploadWatermark;
    }

    private DataControllerPropertiesResponse() {
        this.basicLoginInformation = null;
        this.k8sRaw = null;
        this.lastUploadedDate = null;
        this.logAnalyticsWorkspaceConfig = null;
        this.onPremiseProperty = null;
        this.provisioningState = null;
        this.uploadServicePrincipal = null;
        this.uploadWatermark = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataControllerPropertiesResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable BasicLoginInformationResponse basicLoginInformation;
        private @Nullable Object k8sRaw;
        private @Nullable String lastUploadedDate;
        private @Nullable LogAnalyticsWorkspaceConfigResponse logAnalyticsWorkspaceConfig;
        private @Nullable OnPremisePropertyResponse onPremiseProperty;
        private String provisioningState;
        private @Nullable UploadServicePrincipalResponse uploadServicePrincipal;
        private @Nullable UploadWatermarkResponse uploadWatermark;

        public Builder() {
    	      // Empty
        }

        public Builder(DataControllerPropertiesResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.basicLoginInformation = defaults.basicLoginInformation;
    	      this.k8sRaw = defaults.k8sRaw;
    	      this.lastUploadedDate = defaults.lastUploadedDate;
    	      this.logAnalyticsWorkspaceConfig = defaults.logAnalyticsWorkspaceConfig;
    	      this.onPremiseProperty = defaults.onPremiseProperty;
    	      this.provisioningState = defaults.provisioningState;
    	      this.uploadServicePrincipal = defaults.uploadServicePrincipal;
    	      this.uploadWatermark = defaults.uploadWatermark;
        }

        public Builder setBasicLoginInformation(@Nullable BasicLoginInformationResponse basicLoginInformation) {
            this.basicLoginInformation = basicLoginInformation;
            return this;
        }

        public Builder setK8sRaw(@Nullable Object k8sRaw) {
            this.k8sRaw = k8sRaw;
            return this;
        }

        public Builder setLastUploadedDate(@Nullable String lastUploadedDate) {
            this.lastUploadedDate = lastUploadedDate;
            return this;
        }

        public Builder setLogAnalyticsWorkspaceConfig(@Nullable LogAnalyticsWorkspaceConfigResponse logAnalyticsWorkspaceConfig) {
            this.logAnalyticsWorkspaceConfig = logAnalyticsWorkspaceConfig;
            return this;
        }

        public Builder setOnPremiseProperty(@Nullable OnPremisePropertyResponse onPremiseProperty) {
            this.onPremiseProperty = onPremiseProperty;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setUploadServicePrincipal(@Nullable UploadServicePrincipalResponse uploadServicePrincipal) {
            this.uploadServicePrincipal = uploadServicePrincipal;
            return this;
        }

        public Builder setUploadWatermark(@Nullable UploadWatermarkResponse uploadWatermark) {
            this.uploadWatermark = uploadWatermark;
            return this;
        }
        public DataControllerPropertiesResponse build() {
            return new DataControllerPropertiesResponse(basicLoginInformation, k8sRaw, lastUploadedDate, logAnalyticsWorkspaceConfig, onPremiseProperty, provisioningState, uploadServicePrincipal, uploadWatermark);
        }
    }
}
