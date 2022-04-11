// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.inputs;

import io.pulumi.azurenative.datafactory.enums.SsisPackageLocationType;
import io.pulumi.azurenative.datafactory.inputs.AzureKeyVaultSecretReferenceArgs;
import io.pulumi.azurenative.datafactory.inputs.SSISAccessCredentialArgs;
import io.pulumi.azurenative.datafactory.inputs.SSISChildPackageArgs;
import io.pulumi.azurenative.datafactory.inputs.SecureStringArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * SSIS package location.
 * 
 */
public final class SSISPackageLocationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SSISPackageLocationArgs Empty = new SSISPackageLocationArgs();

    /**
     * The package access credential.
     * 
     */
    @Import(name="accessCredential")
      private final @Nullable Output<SSISAccessCredentialArgs> accessCredential;

    public Output<SSISAccessCredentialArgs> getAccessCredential() {
        return this.accessCredential == null ? Codegen.empty() : this.accessCredential;
    }

    /**
     * The embedded child package list.
     * 
     */
    @Import(name="childPackages")
      private final @Nullable Output<List<SSISChildPackageArgs>> childPackages;

    public Output<List<SSISChildPackageArgs>> getChildPackages() {
        return this.childPackages == null ? Codegen.empty() : this.childPackages;
    }

    /**
     * The configuration file access credential.
     * 
     */
    @Import(name="configurationAccessCredential")
      private final @Nullable Output<SSISAccessCredentialArgs> configurationAccessCredential;

    public Output<SSISAccessCredentialArgs> getConfigurationAccessCredential() {
        return this.configurationAccessCredential == null ? Codegen.empty() : this.configurationAccessCredential;
    }

    /**
     * The configuration file of the package execution. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="configurationPath")
      private final @Nullable Output<Object> configurationPath;

    public Output<Object> getConfigurationPath() {
        return this.configurationPath == null ? Codegen.empty() : this.configurationPath;
    }

    /**
     * The embedded package content. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="packageContent")
      private final @Nullable Output<Object> packageContent;

    public Output<Object> getPackageContent() {
        return this.packageContent == null ? Codegen.empty() : this.packageContent;
    }

    /**
     * The embedded package last modified date.
     * 
     */
    @Import(name="packageLastModifiedDate")
      private final @Nullable Output<String> packageLastModifiedDate;

    public Output<String> getPackageLastModifiedDate() {
        return this.packageLastModifiedDate == null ? Codegen.empty() : this.packageLastModifiedDate;
    }

    /**
     * The package name.
     * 
     */
    @Import(name="packageName")
      private final @Nullable Output<String> packageName;

    public Output<String> getPackageName() {
        return this.packageName == null ? Codegen.empty() : this.packageName;
    }

    /**
     * Password of the package.
     * 
     */
    @Import(name="packagePassword")
      private final @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> packagePassword;

    public Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> getPackagePassword() {
        return this.packagePassword == null ? Codegen.empty() : this.packagePassword;
    }

    /**
     * The SSIS package path. Type: string (or Expression with resultType string).
     * 
     */
    @Import(name="packagePath")
      private final @Nullable Output<Object> packagePath;

    public Output<Object> getPackagePath() {
        return this.packagePath == null ? Codegen.empty() : this.packagePath;
    }

    /**
     * The type of SSIS package location.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<Either<String,SsisPackageLocationType>> type;

    public Output<Either<String,SsisPackageLocationType>> getType() {
        return this.type == null ? Codegen.empty() : this.type;
    }

    public SSISPackageLocationArgs(
        @Nullable Output<SSISAccessCredentialArgs> accessCredential,
        @Nullable Output<List<SSISChildPackageArgs>> childPackages,
        @Nullable Output<SSISAccessCredentialArgs> configurationAccessCredential,
        @Nullable Output<Object> configurationPath,
        @Nullable Output<Object> packageContent,
        @Nullable Output<String> packageLastModifiedDate,
        @Nullable Output<String> packageName,
        @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> packagePassword,
        @Nullable Output<Object> packagePath,
        @Nullable Output<Either<String,SsisPackageLocationType>> type) {
        this.accessCredential = accessCredential;
        this.childPackages = childPackages;
        this.configurationAccessCredential = configurationAccessCredential;
        this.configurationPath = configurationPath;
        this.packageContent = packageContent;
        this.packageLastModifiedDate = packageLastModifiedDate;
        this.packageName = packageName;
        this.packagePassword = packagePassword;
        this.packagePath = packagePath;
        this.type = type;
    }

    private SSISPackageLocationArgs() {
        this.accessCredential = Codegen.empty();
        this.childPackages = Codegen.empty();
        this.configurationAccessCredential = Codegen.empty();
        this.configurationPath = Codegen.empty();
        this.packageContent = Codegen.empty();
        this.packageLastModifiedDate = Codegen.empty();
        this.packageName = Codegen.empty();
        this.packagePassword = Codegen.empty();
        this.packagePath = Codegen.empty();
        this.type = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SSISPackageLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<SSISAccessCredentialArgs> accessCredential;
        private @Nullable Output<List<SSISChildPackageArgs>> childPackages;
        private @Nullable Output<SSISAccessCredentialArgs> configurationAccessCredential;
        private @Nullable Output<Object> configurationPath;
        private @Nullable Output<Object> packageContent;
        private @Nullable Output<String> packageLastModifiedDate;
        private @Nullable Output<String> packageName;
        private @Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> packagePassword;
        private @Nullable Output<Object> packagePath;
        private @Nullable Output<Either<String,SsisPackageLocationType>> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SSISPackageLocationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accessCredential = defaults.accessCredential;
    	      this.childPackages = defaults.childPackages;
    	      this.configurationAccessCredential = defaults.configurationAccessCredential;
    	      this.configurationPath = defaults.configurationPath;
    	      this.packageContent = defaults.packageContent;
    	      this.packageLastModifiedDate = defaults.packageLastModifiedDate;
    	      this.packageName = defaults.packageName;
    	      this.packagePassword = defaults.packagePassword;
    	      this.packagePath = defaults.packagePath;
    	      this.type = defaults.type;
        }

        public Builder accessCredential(@Nullable Output<SSISAccessCredentialArgs> accessCredential) {
            this.accessCredential = accessCredential;
            return this;
        }
        public Builder accessCredential(@Nullable SSISAccessCredentialArgs accessCredential) {
            this.accessCredential = Codegen.ofNullable(accessCredential);
            return this;
        }
        public Builder childPackages(@Nullable Output<List<SSISChildPackageArgs>> childPackages) {
            this.childPackages = childPackages;
            return this;
        }
        public Builder childPackages(@Nullable List<SSISChildPackageArgs> childPackages) {
            this.childPackages = Codegen.ofNullable(childPackages);
            return this;
        }
        public Builder childPackages(SSISChildPackageArgs... childPackages) {
            return childPackages(List.of(childPackages));
        }
        public Builder configurationAccessCredential(@Nullable Output<SSISAccessCredentialArgs> configurationAccessCredential) {
            this.configurationAccessCredential = configurationAccessCredential;
            return this;
        }
        public Builder configurationAccessCredential(@Nullable SSISAccessCredentialArgs configurationAccessCredential) {
            this.configurationAccessCredential = Codegen.ofNullable(configurationAccessCredential);
            return this;
        }
        public Builder configurationPath(@Nullable Output<Object> configurationPath) {
            this.configurationPath = configurationPath;
            return this;
        }
        public Builder configurationPath(@Nullable Object configurationPath) {
            this.configurationPath = Codegen.ofNullable(configurationPath);
            return this;
        }
        public Builder packageContent(@Nullable Output<Object> packageContent) {
            this.packageContent = packageContent;
            return this;
        }
        public Builder packageContent(@Nullable Object packageContent) {
            this.packageContent = Codegen.ofNullable(packageContent);
            return this;
        }
        public Builder packageLastModifiedDate(@Nullable Output<String> packageLastModifiedDate) {
            this.packageLastModifiedDate = packageLastModifiedDate;
            return this;
        }
        public Builder packageLastModifiedDate(@Nullable String packageLastModifiedDate) {
            this.packageLastModifiedDate = Codegen.ofNullable(packageLastModifiedDate);
            return this;
        }
        public Builder packageName(@Nullable Output<String> packageName) {
            this.packageName = packageName;
            return this;
        }
        public Builder packageName(@Nullable String packageName) {
            this.packageName = Codegen.ofNullable(packageName);
            return this;
        }
        public Builder packagePassword(@Nullable Output<Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs>> packagePassword) {
            this.packagePassword = packagePassword;
            return this;
        }
        public Builder packagePassword(@Nullable Either<AzureKeyVaultSecretReferenceArgs,SecureStringArgs> packagePassword) {
            this.packagePassword = Codegen.ofNullable(packagePassword);
            return this;
        }
        public Builder packagePath(@Nullable Output<Object> packagePath) {
            this.packagePath = packagePath;
            return this;
        }
        public Builder packagePath(@Nullable Object packagePath) {
            this.packagePath = Codegen.ofNullable(packagePath);
            return this;
        }
        public Builder type(@Nullable Output<Either<String,SsisPackageLocationType>> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable Either<String,SsisPackageLocationType> type) {
            this.type = Codegen.ofNullable(type);
            return this;
        }        public SSISPackageLocationArgs build() {
            return new SSISPackageLocationArgs(accessCredential, childPackages, configurationAccessCredential, configurationPath, packageContent, packageLastModifiedDate, packageName, packagePassword, packagePath, type);
        }
    }
}
