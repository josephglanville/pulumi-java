// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.automation;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    /**
     * The name of the automation account.
     * 
     */
    @InputImport(name="automationAccountName", required=true)
      private final Input<String> automationAccountName;

    public Input<String> getAutomationAccountName() {
        return this.automationAccountName;
    }

    /**
     * Gets or sets the base64 encoded value of the certificate.
     * 
     */
    @InputImport(name="base64Value", required=true)
      private final Input<String> base64Value;

    public Input<String> getBase64Value() {
        return this.base64Value;
    }

    /**
     * The parameters supplied to the create or update certificate operation.
     * 
     */
    @InputImport(name="certificateName")
      private final @Nullable Input<String> certificateName;

    public Input<String> getCertificateName() {
        return this.certificateName == null ? Input.empty() : this.certificateName;
    }

    /**
     * Gets or sets the description of the certificate.
     * 
     */
    @InputImport(name="description")
      private final @Nullable Input<String> description;

    public Input<String> getDescription() {
        return this.description == null ? Input.empty() : this.description;
    }

    /**
     * Gets or sets the is exportable flag of the certificate.
     * 
     */
    @InputImport(name="isExportable")
      private final @Nullable Input<Boolean> isExportable;

    public Input<Boolean> getIsExportable() {
        return this.isExportable == null ? Input.empty() : this.isExportable;
    }

    /**
     * Gets or sets the name of the certificate.
     * 
     */
    @InputImport(name="name", required=true)
      private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    /**
     * Name of an Azure Resource group.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
      private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Gets or sets the thumbprint of the certificate.
     * 
     */
    @InputImport(name="thumbprint")
      private final @Nullable Input<String> thumbprint;

    public Input<String> getThumbprint() {
        return this.thumbprint == null ? Input.empty() : this.thumbprint;
    }

    public CertificateArgs(
        Input<String> automationAccountName,
        Input<String> base64Value,
        @Nullable Input<String> certificateName,
        @Nullable Input<String> description,
        @Nullable Input<Boolean> isExportable,
        Input<String> name,
        Input<String> resourceGroupName,
        @Nullable Input<String> thumbprint) {
        this.automationAccountName = Objects.requireNonNull(automationAccountName, "expected parameter 'automationAccountName' to be non-null");
        this.base64Value = Objects.requireNonNull(base64Value, "expected parameter 'base64Value' to be non-null");
        this.certificateName = certificateName;
        this.description = description;
        this.isExportable = isExportable;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.thumbprint = thumbprint;
    }

    private CertificateArgs() {
        this.automationAccountName = Input.empty();
        this.base64Value = Input.empty();
        this.certificateName = Input.empty();
        this.description = Input.empty();
        this.isExportable = Input.empty();
        this.name = Input.empty();
        this.resourceGroupName = Input.empty();
        this.thumbprint = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> automationAccountName;
        private Input<String> base64Value;
        private @Nullable Input<String> certificateName;
        private @Nullable Input<String> description;
        private @Nullable Input<Boolean> isExportable;
        private Input<String> name;
        private Input<String> resourceGroupName;
        private @Nullable Input<String> thumbprint;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.automationAccountName = defaults.automationAccountName;
    	      this.base64Value = defaults.base64Value;
    	      this.certificateName = defaults.certificateName;
    	      this.description = defaults.description;
    	      this.isExportable = defaults.isExportable;
    	      this.name = defaults.name;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.thumbprint = defaults.thumbprint;
        }

        public Builder setAutomationAccountName(Input<String> automationAccountName) {
            this.automationAccountName = Objects.requireNonNull(automationAccountName);
            return this;
        }

        public Builder setAutomationAccountName(String automationAccountName) {
            this.automationAccountName = Input.of(Objects.requireNonNull(automationAccountName));
            return this;
        }

        public Builder setBase64Value(Input<String> base64Value) {
            this.base64Value = Objects.requireNonNull(base64Value);
            return this;
        }

        public Builder setBase64Value(String base64Value) {
            this.base64Value = Input.of(Objects.requireNonNull(base64Value));
            return this;
        }

        public Builder setCertificateName(@Nullable Input<String> certificateName) {
            this.certificateName = certificateName;
            return this;
        }

        public Builder setCertificateName(@Nullable String certificateName) {
            this.certificateName = Input.ofNullable(certificateName);
            return this;
        }

        public Builder setDescription(@Nullable Input<String> description) {
            this.description = description;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = Input.ofNullable(description);
            return this;
        }

        public Builder setIsExportable(@Nullable Input<Boolean> isExportable) {
            this.isExportable = isExportable;
            return this;
        }

        public Builder setIsExportable(@Nullable Boolean isExportable) {
            this.isExportable = Input.ofNullable(isExportable);
            return this;
        }

        public Builder setName(Input<String> name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setName(String name) {
            this.name = Input.of(Objects.requireNonNull(name));
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setThumbprint(@Nullable Input<String> thumbprint) {
            this.thumbprint = thumbprint;
            return this;
        }

        public Builder setThumbprint(@Nullable String thumbprint) {
            this.thumbprint = Input.ofNullable(thumbprint);
            return this;
        }
        public CertificateArgs build() {
            return new CertificateArgs(automationAccountName, base64Value, certificateName, description, isExportable, name, resourceGroupName, thumbprint);
        }
    }
}
