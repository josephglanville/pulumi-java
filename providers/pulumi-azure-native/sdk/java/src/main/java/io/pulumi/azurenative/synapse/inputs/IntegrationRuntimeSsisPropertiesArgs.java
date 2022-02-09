// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.synapse.inputs;

import io.pulumi.azurenative.synapse.enums.IntegrationRuntimeEdition;
import io.pulumi.azurenative.synapse.enums.IntegrationRuntimeLicenseType;
import io.pulumi.azurenative.synapse.inputs.CmdkeySetupArgs;
import io.pulumi.azurenative.synapse.inputs.ComponentSetupArgs;
import io.pulumi.azurenative.synapse.inputs.EnvironmentVariableSetupArgs;
import io.pulumi.azurenative.synapse.inputs.IntegrationRuntimeCustomSetupScriptPropertiesArgs;
import io.pulumi.azurenative.synapse.inputs.IntegrationRuntimeDataProxyPropertiesArgs;
import io.pulumi.azurenative.synapse.inputs.IntegrationRuntimeSsisCatalogInfoArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class IntegrationRuntimeSsisPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final IntegrationRuntimeSsisPropertiesArgs Empty = new IntegrationRuntimeSsisPropertiesArgs();

    @InputImport(name="catalogInfo")
    private final @Nullable Input<IntegrationRuntimeSsisCatalogInfoArgs> catalogInfo;

    public Input<IntegrationRuntimeSsisCatalogInfoArgs> getCatalogInfo() {
        return this.catalogInfo == null ? Input.empty() : this.catalogInfo;
    }

    @InputImport(name="customSetupScriptProperties")
    private final @Nullable Input<IntegrationRuntimeCustomSetupScriptPropertiesArgs> customSetupScriptProperties;

    public Input<IntegrationRuntimeCustomSetupScriptPropertiesArgs> getCustomSetupScriptProperties() {
        return this.customSetupScriptProperties == null ? Input.empty() : this.customSetupScriptProperties;
    }

    @InputImport(name="dataProxyProperties")
    private final @Nullable Input<IntegrationRuntimeDataProxyPropertiesArgs> dataProxyProperties;

    public Input<IntegrationRuntimeDataProxyPropertiesArgs> getDataProxyProperties() {
        return this.dataProxyProperties == null ? Input.empty() : this.dataProxyProperties;
    }

    @InputImport(name="edition")
    private final @Nullable Input<Either<String,IntegrationRuntimeEdition>> edition;

    public Input<Either<String,IntegrationRuntimeEdition>> getEdition() {
        return this.edition == null ? Input.empty() : this.edition;
    }

    @InputImport(name="expressCustomSetupProperties")
    private final @Nullable Input<List<Object>> expressCustomSetupProperties;

    public Input<List<Object>> getExpressCustomSetupProperties() {
        return this.expressCustomSetupProperties == null ? Input.empty() : this.expressCustomSetupProperties;
    }

    @InputImport(name="licenseType")
    private final @Nullable Input<Either<String,IntegrationRuntimeLicenseType>> licenseType;

    public Input<Either<String,IntegrationRuntimeLicenseType>> getLicenseType() {
        return this.licenseType == null ? Input.empty() : this.licenseType;
    }

    public IntegrationRuntimeSsisPropertiesArgs(
        @Nullable Input<IntegrationRuntimeSsisCatalogInfoArgs> catalogInfo,
        @Nullable Input<IntegrationRuntimeCustomSetupScriptPropertiesArgs> customSetupScriptProperties,
        @Nullable Input<IntegrationRuntimeDataProxyPropertiesArgs> dataProxyProperties,
        @Nullable Input<Either<String,IntegrationRuntimeEdition>> edition,
        @Nullable Input<List<Object>> expressCustomSetupProperties,
        @Nullable Input<Either<String,IntegrationRuntimeLicenseType>> licenseType) {
        this.catalogInfo = catalogInfo;
        this.customSetupScriptProperties = customSetupScriptProperties;
        this.dataProxyProperties = dataProxyProperties;
        this.edition = edition;
        this.expressCustomSetupProperties = expressCustomSetupProperties;
        this.licenseType = licenseType;
    }

    private IntegrationRuntimeSsisPropertiesArgs() {
        this.catalogInfo = Input.empty();
        this.customSetupScriptProperties = Input.empty();
        this.dataProxyProperties = Input.empty();
        this.edition = Input.empty();
        this.expressCustomSetupProperties = Input.empty();
        this.licenseType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IntegrationRuntimeSsisPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<IntegrationRuntimeSsisCatalogInfoArgs> catalogInfo;
        private @Nullable Input<IntegrationRuntimeCustomSetupScriptPropertiesArgs> customSetupScriptProperties;
        private @Nullable Input<IntegrationRuntimeDataProxyPropertiesArgs> dataProxyProperties;
        private @Nullable Input<Either<String,IntegrationRuntimeEdition>> edition;
        private @Nullable Input<List<Object>> expressCustomSetupProperties;
        private @Nullable Input<Either<String,IntegrationRuntimeLicenseType>> licenseType;

        public Builder() {
    	      // Empty
        }

        public Builder(IntegrationRuntimeSsisPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.catalogInfo = defaults.catalogInfo;
    	      this.customSetupScriptProperties = defaults.customSetupScriptProperties;
    	      this.dataProxyProperties = defaults.dataProxyProperties;
    	      this.edition = defaults.edition;
    	      this.expressCustomSetupProperties = defaults.expressCustomSetupProperties;
    	      this.licenseType = defaults.licenseType;
        }

        public Builder setCatalogInfo(@Nullable Input<IntegrationRuntimeSsisCatalogInfoArgs> catalogInfo) {
            this.catalogInfo = catalogInfo;
            return this;
        }

        public Builder setCatalogInfo(@Nullable IntegrationRuntimeSsisCatalogInfoArgs catalogInfo) {
            this.catalogInfo = Input.ofNullable(catalogInfo);
            return this;
        }

        public Builder setCustomSetupScriptProperties(@Nullable Input<IntegrationRuntimeCustomSetupScriptPropertiesArgs> customSetupScriptProperties) {
            this.customSetupScriptProperties = customSetupScriptProperties;
            return this;
        }

        public Builder setCustomSetupScriptProperties(@Nullable IntegrationRuntimeCustomSetupScriptPropertiesArgs customSetupScriptProperties) {
            this.customSetupScriptProperties = Input.ofNullable(customSetupScriptProperties);
            return this;
        }

        public Builder setDataProxyProperties(@Nullable Input<IntegrationRuntimeDataProxyPropertiesArgs> dataProxyProperties) {
            this.dataProxyProperties = dataProxyProperties;
            return this;
        }

        public Builder setDataProxyProperties(@Nullable IntegrationRuntimeDataProxyPropertiesArgs dataProxyProperties) {
            this.dataProxyProperties = Input.ofNullable(dataProxyProperties);
            return this;
        }

        public Builder setEdition(@Nullable Input<Either<String,IntegrationRuntimeEdition>> edition) {
            this.edition = edition;
            return this;
        }

        public Builder setEdition(@Nullable Either<String,IntegrationRuntimeEdition> edition) {
            this.edition = Input.ofNullable(edition);
            return this;
        }

        public Builder setExpressCustomSetupProperties(@Nullable Input<List<Object>> expressCustomSetupProperties) {
            this.expressCustomSetupProperties = expressCustomSetupProperties;
            return this;
        }

        public Builder setExpressCustomSetupProperties(@Nullable List<Object> expressCustomSetupProperties) {
            this.expressCustomSetupProperties = Input.ofNullable(expressCustomSetupProperties);
            return this;
        }

        public Builder setLicenseType(@Nullable Input<Either<String,IntegrationRuntimeLicenseType>> licenseType) {
            this.licenseType = licenseType;
            return this;
        }

        public Builder setLicenseType(@Nullable Either<String,IntegrationRuntimeLicenseType> licenseType) {
            this.licenseType = Input.ofNullable(licenseType);
            return this;
        }

        public IntegrationRuntimeSsisPropertiesArgs build() {
            return new IntegrationRuntimeSsisPropertiesArgs(catalogInfo, customSetupScriptProperties, dataProxyProperties, edition, expressCustomSetupProperties, licenseType);
        }
    }
}
