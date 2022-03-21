// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.devices;

import io.pulumi.azurenative.devices.inputs.CertificatePropertiesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


public final class CertificateArgs extends io.pulumi.resources.ResourceArgs {

    public static final CertificateArgs Empty = new CertificateArgs();

    /**
     * The name of the certificate
     * 
     */
    @Import(name="certificateName")
      private final @Nullable Output<String> certificateName;

    public Output<String> getCertificateName() {
        return this.certificateName == null ? Output.empty() : this.certificateName;
    }

    /**
     * The description of an X509 CA Certificate.
     * 
     */
    @Import(name="properties")
      private final @Nullable Output<CertificatePropertiesArgs> properties;

    public Output<CertificatePropertiesArgs> getProperties() {
        return this.properties == null ? Output.empty() : this.properties;
    }

    /**
     * The name of the resource group that contains the IoT hub.
     * 
     */
    @Import(name="resourceGroupName", required=true)
      private final Output<String> resourceGroupName;

    public Output<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * The name of the IoT hub.
     * 
     */
    @Import(name="resourceName", required=true)
      private final Output<String> resourceName;

    public Output<String> getPropResourceName() {
        return this.resourceName;
    }

    public CertificateArgs(
        @Nullable Output<String> certificateName,
        @Nullable Output<CertificatePropertiesArgs> properties,
        Output<String> resourceGroupName,
        Output<String> resourceName) {
        this.certificateName = certificateName;
        this.properties = properties;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.resourceName = Objects.requireNonNull(resourceName, "expected parameter 'resourceName' to be non-null");
    }

    private CertificateArgs() {
        this.certificateName = Output.empty();
        this.properties = Output.empty();
        this.resourceGroupName = Output.empty();
        this.resourceName = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CertificateArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> certificateName;
        private @Nullable Output<CertificatePropertiesArgs> properties;
        private Output<String> resourceGroupName;
        private Output<String> resourceName;

        public Builder() {
    	      // Empty
        }

        public Builder(CertificateArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certificateName = defaults.certificateName;
    	      this.properties = defaults.properties;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.resourceName = defaults.resourceName;
        }

        public Builder certificateName(@Nullable Output<String> certificateName) {
            this.certificateName = certificateName;
            return this;
        }
        public Builder certificateName(@Nullable String certificateName) {
            this.certificateName = Output.ofNullable(certificateName);
            return this;
        }
        public Builder properties(@Nullable Output<CertificatePropertiesArgs> properties) {
            this.properties = properties;
            return this;
        }
        public Builder properties(@Nullable CertificatePropertiesArgs properties) {
            this.properties = Output.ofNullable(properties);
            return this;
        }
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }
        public Builder resourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Output.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }
        public Builder resourceName(Output<String> resourceName) {
            this.resourceName = Objects.requireNonNull(resourceName);
            return this;
        }
        public Builder resourceName(String resourceName) {
            this.resourceName = Output.of(Objects.requireNonNull(resourceName));
            return this;
        }        public CertificateArgs build() {
            return new CertificateArgs(certificateName, properties, resourceGroupName, resourceName);
        }
    }
}
