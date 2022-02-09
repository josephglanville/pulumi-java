// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.compute.inputs;

import io.pulumi.azurenative.compute.enums.DeleteOptions;
import io.pulumi.azurenative.compute.enums.IPVersions;
import io.pulumi.azurenative.compute.enums.PublicIPAllocationMethod;
import io.pulumi.azurenative.compute.inputs.PublicIPAddressSkuArgs;
import io.pulumi.azurenative.compute.inputs.SubResourceArgs;
import io.pulumi.azurenative.compute.inputs.VirtualMachineIpTagArgs;
import io.pulumi.azurenative.compute.inputs.VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class VirtualMachinePublicIPAddressConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final VirtualMachinePublicIPAddressConfigurationArgs Empty = new VirtualMachinePublicIPAddressConfigurationArgs();

    @InputImport(name="deleteOption")
    private final @Nullable Input<Either<String,DeleteOptions>> deleteOption;

    public Input<Either<String,DeleteOptions>> getDeleteOption() {
        return this.deleteOption == null ? Input.empty() : this.deleteOption;
    }

    @InputImport(name="dnsSettings")
    private final @Nullable Input<VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs> dnsSettings;

    public Input<VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs> getDnsSettings() {
        return this.dnsSettings == null ? Input.empty() : this.dnsSettings;
    }

    @InputImport(name="idleTimeoutInMinutes")
    private final @Nullable Input<Integer> idleTimeoutInMinutes;

    public Input<Integer> getIdleTimeoutInMinutes() {
        return this.idleTimeoutInMinutes == null ? Input.empty() : this.idleTimeoutInMinutes;
    }

    @InputImport(name="ipTags")
    private final @Nullable Input<List<VirtualMachineIpTagArgs>> ipTags;

    public Input<List<VirtualMachineIpTagArgs>> getIpTags() {
        return this.ipTags == null ? Input.empty() : this.ipTags;
    }

    @InputImport(name="name", required=true)
    private final Input<String> name;

    public Input<String> getName() {
        return this.name;
    }

    @InputImport(name="publicIPAddressVersion")
    private final @Nullable Input<Either<String,IPVersions>> publicIPAddressVersion;

    public Input<Either<String,IPVersions>> getPublicIPAddressVersion() {
        return this.publicIPAddressVersion == null ? Input.empty() : this.publicIPAddressVersion;
    }

    @InputImport(name="publicIPAllocationMethod")
    private final @Nullable Input<Either<String,PublicIPAllocationMethod>> publicIPAllocationMethod;

    public Input<Either<String,PublicIPAllocationMethod>> getPublicIPAllocationMethod() {
        return this.publicIPAllocationMethod == null ? Input.empty() : this.publicIPAllocationMethod;
    }

    @InputImport(name="publicIPPrefix")
    private final @Nullable Input<SubResourceArgs> publicIPPrefix;

    public Input<SubResourceArgs> getPublicIPPrefix() {
        return this.publicIPPrefix == null ? Input.empty() : this.publicIPPrefix;
    }

    @InputImport(name="sku")
    private final @Nullable Input<PublicIPAddressSkuArgs> sku;

    public Input<PublicIPAddressSkuArgs> getSku() {
        return this.sku == null ? Input.empty() : this.sku;
    }

    public VirtualMachinePublicIPAddressConfigurationArgs(
        @Nullable Input<Either<String,DeleteOptions>> deleteOption,
        @Nullable Input<VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs> dnsSettings,
        @Nullable Input<Integer> idleTimeoutInMinutes,
        @Nullable Input<List<VirtualMachineIpTagArgs>> ipTags,
        Input<String> name,
        @Nullable Input<Either<String,IPVersions>> publicIPAddressVersion,
        @Nullable Input<Either<String,PublicIPAllocationMethod>> publicIPAllocationMethod,
        @Nullable Input<SubResourceArgs> publicIPPrefix,
        @Nullable Input<PublicIPAddressSkuArgs> sku) {
        this.deleteOption = deleteOption;
        this.dnsSettings = dnsSettings;
        this.idleTimeoutInMinutes = idleTimeoutInMinutes;
        this.ipTags = ipTags;
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.publicIPAddressVersion = publicIPAddressVersion;
        this.publicIPAllocationMethod = publicIPAllocationMethod;
        this.publicIPPrefix = publicIPPrefix;
        this.sku = sku;
    }

    private VirtualMachinePublicIPAddressConfigurationArgs() {
        this.deleteOption = Input.empty();
        this.dnsSettings = Input.empty();
        this.idleTimeoutInMinutes = Input.empty();
        this.ipTags = Input.empty();
        this.name = Input.empty();
        this.publicIPAddressVersion = Input.empty();
        this.publicIPAllocationMethod = Input.empty();
        this.publicIPPrefix = Input.empty();
        this.sku = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(VirtualMachinePublicIPAddressConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,DeleteOptions>> deleteOption;
        private @Nullable Input<VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs> dnsSettings;
        private @Nullable Input<Integer> idleTimeoutInMinutes;
        private @Nullable Input<List<VirtualMachineIpTagArgs>> ipTags;
        private Input<String> name;
        private @Nullable Input<Either<String,IPVersions>> publicIPAddressVersion;
        private @Nullable Input<Either<String,PublicIPAllocationMethod>> publicIPAllocationMethod;
        private @Nullable Input<SubResourceArgs> publicIPPrefix;
        private @Nullable Input<PublicIPAddressSkuArgs> sku;

        public Builder() {
    	      // Empty
        }

        public Builder(VirtualMachinePublicIPAddressConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.deleteOption = defaults.deleteOption;
    	      this.dnsSettings = defaults.dnsSettings;
    	      this.idleTimeoutInMinutes = defaults.idleTimeoutInMinutes;
    	      this.ipTags = defaults.ipTags;
    	      this.name = defaults.name;
    	      this.publicIPAddressVersion = defaults.publicIPAddressVersion;
    	      this.publicIPAllocationMethod = defaults.publicIPAllocationMethod;
    	      this.publicIPPrefix = defaults.publicIPPrefix;
    	      this.sku = defaults.sku;
        }

        public Builder setDeleteOption(@Nullable Input<Either<String,DeleteOptions>> deleteOption) {
            this.deleteOption = deleteOption;
            return this;
        }

        public Builder setDeleteOption(@Nullable Either<String,DeleteOptions> deleteOption) {
            this.deleteOption = Input.ofNullable(deleteOption);
            return this;
        }

        public Builder setDnsSettings(@Nullable Input<VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs> dnsSettings) {
            this.dnsSettings = dnsSettings;
            return this;
        }

        public Builder setDnsSettings(@Nullable VirtualMachinePublicIPAddressDnsSettingsConfigurationArgs dnsSettings) {
            this.dnsSettings = Input.ofNullable(dnsSettings);
            return this;
        }

        public Builder setIdleTimeoutInMinutes(@Nullable Input<Integer> idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = idleTimeoutInMinutes;
            return this;
        }

        public Builder setIdleTimeoutInMinutes(@Nullable Integer idleTimeoutInMinutes) {
            this.idleTimeoutInMinutes = Input.ofNullable(idleTimeoutInMinutes);
            return this;
        }

        public Builder setIpTags(@Nullable Input<List<VirtualMachineIpTagArgs>> ipTags) {
            this.ipTags = ipTags;
            return this;
        }

        public Builder setIpTags(@Nullable List<VirtualMachineIpTagArgs> ipTags) {
            this.ipTags = Input.ofNullable(ipTags);
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

        public Builder setPublicIPAddressVersion(@Nullable Input<Either<String,IPVersions>> publicIPAddressVersion) {
            this.publicIPAddressVersion = publicIPAddressVersion;
            return this;
        }

        public Builder setPublicIPAddressVersion(@Nullable Either<String,IPVersions> publicIPAddressVersion) {
            this.publicIPAddressVersion = Input.ofNullable(publicIPAddressVersion);
            return this;
        }

        public Builder setPublicIPAllocationMethod(@Nullable Input<Either<String,PublicIPAllocationMethod>> publicIPAllocationMethod) {
            this.publicIPAllocationMethod = publicIPAllocationMethod;
            return this;
        }

        public Builder setPublicIPAllocationMethod(@Nullable Either<String,PublicIPAllocationMethod> publicIPAllocationMethod) {
            this.publicIPAllocationMethod = Input.ofNullable(publicIPAllocationMethod);
            return this;
        }

        public Builder setPublicIPPrefix(@Nullable Input<SubResourceArgs> publicIPPrefix) {
            this.publicIPPrefix = publicIPPrefix;
            return this;
        }

        public Builder setPublicIPPrefix(@Nullable SubResourceArgs publicIPPrefix) {
            this.publicIPPrefix = Input.ofNullable(publicIPPrefix);
            return this;
        }

        public Builder setSku(@Nullable Input<PublicIPAddressSkuArgs> sku) {
            this.sku = sku;
            return this;
        }

        public Builder setSku(@Nullable PublicIPAddressSkuArgs sku) {
            this.sku = Input.ofNullable(sku);
            return this;
        }

        public VirtualMachinePublicIPAddressConfigurationArgs build() {
            return new VirtualMachinePublicIPAddressConfigurationArgs(deleteOption, dnsSettings, idleTimeoutInMinutes, ipTags, name, publicIPAddressVersion, publicIPAllocationMethod, publicIPPrefix, sku);
        }
    }
}
