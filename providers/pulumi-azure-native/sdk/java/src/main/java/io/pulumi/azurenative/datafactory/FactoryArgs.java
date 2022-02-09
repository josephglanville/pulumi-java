// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory;

import io.pulumi.azurenative.datafactory.enums.PublicNetworkAccess;
import io.pulumi.azurenative.datafactory.inputs.EncryptionConfigurationArgs;
import io.pulumi.azurenative.datafactory.inputs.FactoryGitHubConfigurationArgs;
import io.pulumi.azurenative.datafactory.inputs.FactoryIdentityArgs;
import io.pulumi.azurenative.datafactory.inputs.FactoryVSTSConfigurationArgs;
import io.pulumi.azurenative.datafactory.inputs.GlobalParameterSpecificationArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class FactoryArgs extends io.pulumi.resources.ResourceArgs {

    public static final FactoryArgs Empty = new FactoryArgs();

    @InputImport(name="encryption")
    private final @Nullable Input<EncryptionConfigurationArgs> encryption;

    public Input<EncryptionConfigurationArgs> getEncryption() {
        return this.encryption == null ? Input.empty() : this.encryption;
    }

    @InputImport(name="factoryName")
    private final @Nullable Input<String> factoryName;

    public Input<String> getFactoryName() {
        return this.factoryName == null ? Input.empty() : this.factoryName;
    }

    @InputImport(name="globalParameters")
    private final @Nullable Input<Map<String,GlobalParameterSpecificationArgs>> globalParameters;

    public Input<Map<String,GlobalParameterSpecificationArgs>> getGlobalParameters() {
        return this.globalParameters == null ? Input.empty() : this.globalParameters;
    }

    @InputImport(name="identity")
    private final @Nullable Input<FactoryIdentityArgs> identity;

    public Input<FactoryIdentityArgs> getIdentity() {
        return this.identity == null ? Input.empty() : this.identity;
    }

    @InputImport(name="location")
    private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    @InputImport(name="publicNetworkAccess")
    private final @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess;

    public Input<Either<String,PublicNetworkAccess>> getPublicNetworkAccess() {
        return this.publicNetworkAccess == null ? Input.empty() : this.publicNetworkAccess;
    }

    @InputImport(name="repoConfiguration")
    private final @Nullable Input<Either<FactoryGitHubConfigurationArgs,FactoryVSTSConfigurationArgs>> repoConfiguration;

    public Input<Either<FactoryGitHubConfigurationArgs,FactoryVSTSConfigurationArgs>> getRepoConfiguration() {
        return this.repoConfiguration == null ? Input.empty() : this.repoConfiguration;
    }

    @InputImport(name="resourceGroupName", required=true)
    private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    @InputImport(name="tags")
    private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public FactoryArgs(
        @Nullable Input<EncryptionConfigurationArgs> encryption,
        @Nullable Input<String> factoryName,
        @Nullable Input<Map<String,GlobalParameterSpecificationArgs>> globalParameters,
        @Nullable Input<FactoryIdentityArgs> identity,
        @Nullable Input<String> location,
        @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess,
        @Nullable Input<Either<FactoryGitHubConfigurationArgs,FactoryVSTSConfigurationArgs>> repoConfiguration,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.encryption = encryption;
        this.factoryName = factoryName;
        this.globalParameters = globalParameters;
        this.identity = identity;
        this.location = location;
        this.publicNetworkAccess = publicNetworkAccess;
        this.repoConfiguration = repoConfiguration;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private FactoryArgs() {
        this.encryption = Input.empty();
        this.factoryName = Input.empty();
        this.globalParameters = Input.empty();
        this.identity = Input.empty();
        this.location = Input.empty();
        this.publicNetworkAccess = Input.empty();
        this.repoConfiguration = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FactoryArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<EncryptionConfigurationArgs> encryption;
        private @Nullable Input<String> factoryName;
        private @Nullable Input<Map<String,GlobalParameterSpecificationArgs>> globalParameters;
        private @Nullable Input<FactoryIdentityArgs> identity;
        private @Nullable Input<String> location;
        private @Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess;
        private @Nullable Input<Either<FactoryGitHubConfigurationArgs,FactoryVSTSConfigurationArgs>> repoConfiguration;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(FactoryArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryption = defaults.encryption;
    	      this.factoryName = defaults.factoryName;
    	      this.globalParameters = defaults.globalParameters;
    	      this.identity = defaults.identity;
    	      this.location = defaults.location;
    	      this.publicNetworkAccess = defaults.publicNetworkAccess;
    	      this.repoConfiguration = defaults.repoConfiguration;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setEncryption(@Nullable Input<EncryptionConfigurationArgs> encryption) {
            this.encryption = encryption;
            return this;
        }

        public Builder setEncryption(@Nullable EncryptionConfigurationArgs encryption) {
            this.encryption = Input.ofNullable(encryption);
            return this;
        }

        public Builder setFactoryName(@Nullable Input<String> factoryName) {
            this.factoryName = factoryName;
            return this;
        }

        public Builder setFactoryName(@Nullable String factoryName) {
            this.factoryName = Input.ofNullable(factoryName);
            return this;
        }

        public Builder setGlobalParameters(@Nullable Input<Map<String,GlobalParameterSpecificationArgs>> globalParameters) {
            this.globalParameters = globalParameters;
            return this;
        }

        public Builder setGlobalParameters(@Nullable Map<String,GlobalParameterSpecificationArgs> globalParameters) {
            this.globalParameters = Input.ofNullable(globalParameters);
            return this;
        }

        public Builder setIdentity(@Nullable Input<FactoryIdentityArgs> identity) {
            this.identity = identity;
            return this;
        }

        public Builder setIdentity(@Nullable FactoryIdentityArgs identity) {
            this.identity = Input.ofNullable(identity);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Input<Either<String,PublicNetworkAccess>> publicNetworkAccess) {
            this.publicNetworkAccess = publicNetworkAccess;
            return this;
        }

        public Builder setPublicNetworkAccess(@Nullable Either<String,PublicNetworkAccess> publicNetworkAccess) {
            this.publicNetworkAccess = Input.ofNullable(publicNetworkAccess);
            return this;
        }

        public Builder setRepoConfiguration(@Nullable Input<Either<FactoryGitHubConfigurationArgs,FactoryVSTSConfigurationArgs>> repoConfiguration) {
            this.repoConfiguration = repoConfiguration;
            return this;
        }

        public Builder setRepoConfiguration(@Nullable Either<FactoryGitHubConfigurationArgs,FactoryVSTSConfigurationArgs> repoConfiguration) {
            this.repoConfiguration = Input.ofNullable(repoConfiguration);
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

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }

        public FactoryArgs build() {
            return new FactoryArgs(encryption, factoryName, globalParameters, identity, location, publicNetworkAccess, repoConfiguration, resourceGroupName, tags);
        }
    }
}
