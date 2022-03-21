// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.fsx.outputs;

import io.pulumi.aws.fsx.outputs.OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration;
import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OntapStorageVirtualMachineActiveDirectoryConfiguration {
    /**
     * The NetBIOS name of the Active Directory computer object that will be created for your SVM. This is often the same as the SVM name but can be different. It is limited to 15 characters because of standard NetBIOS naming limits.
     * 
     */
    private final @Nullable String netbiosName;
    private final @Nullable OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration selfManagedActiveDirectoryConfiguration;

    @CustomType.Constructor
    private OntapStorageVirtualMachineActiveDirectoryConfiguration(
        @CustomType.Parameter("netbiosName") @Nullable String netbiosName,
        @CustomType.Parameter("selfManagedActiveDirectoryConfiguration") @Nullable OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration selfManagedActiveDirectoryConfiguration) {
        this.netbiosName = netbiosName;
        this.selfManagedActiveDirectoryConfiguration = selfManagedActiveDirectoryConfiguration;
    }

    /**
     * The NetBIOS name of the Active Directory computer object that will be created for your SVM. This is often the same as the SVM name but can be different. It is limited to 15 characters because of standard NetBIOS naming limits.
     * 
    */
    public Optional<String> getNetbiosName() {
        return Optional.ofNullable(this.netbiosName);
    }
    public Optional<OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration> getSelfManagedActiveDirectoryConfiguration() {
        return Optional.ofNullable(this.selfManagedActiveDirectoryConfiguration);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OntapStorageVirtualMachineActiveDirectoryConfiguration defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String netbiosName;
        private @Nullable OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration selfManagedActiveDirectoryConfiguration;

        public Builder() {
    	      // Empty
        }

        public Builder(OntapStorageVirtualMachineActiveDirectoryConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.netbiosName = defaults.netbiosName;
    	      this.selfManagedActiveDirectoryConfiguration = defaults.selfManagedActiveDirectoryConfiguration;
        }

        public Builder netbiosName(@Nullable String netbiosName) {
            this.netbiosName = netbiosName;
            return this;
        }
        public Builder selfManagedActiveDirectoryConfiguration(@Nullable OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfiguration selfManagedActiveDirectoryConfiguration) {
            this.selfManagedActiveDirectoryConfiguration = selfManagedActiveDirectoryConfiguration;
            return this;
        }        public OntapStorageVirtualMachineActiveDirectoryConfiguration build() {
            return new OntapStorageVirtualMachineActiveDirectoryConfiguration(netbiosName, selfManagedActiveDirectoryConfiguration);
        }
    }
}
