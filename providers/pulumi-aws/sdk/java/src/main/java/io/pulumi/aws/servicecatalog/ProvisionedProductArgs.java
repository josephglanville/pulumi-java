// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog;

import io.pulumi.aws.servicecatalog.inputs.ProvisionedProductProvisioningParameterArgs;
import io.pulumi.aws.servicecatalog.inputs.ProvisionedProductStackSetProvisioningPreferencesArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProvisionedProductArgs extends io.pulumi.resources.ResourceArgs {

    public static final ProvisionedProductArgs Empty = new ProvisionedProductArgs();

    /**
     * Language code. Valid values: `en` (English), `jp` (Japanese), `zh` (Chinese). Default value is `en`.
     * 
     */
    @Import(name="acceptLanguage")
      private final @Nullable Output<String> acceptLanguage;

    public Output<String> getAcceptLanguage() {
        return this.acceptLanguage == null ? Output.empty() : this.acceptLanguage;
    }

    /**
     * _Only applies to deleting._ If set to `true`, AWS Service Catalog stops managing the specified provisioned product even if it cannot delete the underlying resources. The default value is `false`.
     * 
     */
    @Import(name="ignoreErrors")
      private final @Nullable Output<Boolean> ignoreErrors;

    public Output<Boolean> getIgnoreErrors() {
        return this.ignoreErrors == null ? Output.empty() : this.ignoreErrors;
    }

    /**
     * User-friendly name of the provisioned product.
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * Passed to CloudFormation. The SNS topic ARNs to which to publish stack-related events.
     * 
     */
    @Import(name="notificationArns")
      private final @Nullable Output<List<String>> notificationArns;

    public Output<List<String>> getNotificationArns() {
        return this.notificationArns == null ? Output.empty() : this.notificationArns;
    }

    /**
     * Path identifier of the product. This value is optional if the product has a default path, and required if the product has more than one path. To list the paths for a product, use `aws.servicecatalog.getLaunchPaths`. When required, you must provide `path_id` or `path_name`, but not both.
     * 
     */
    @Import(name="pathId")
      private final @Nullable Output<String> pathId;

    public Output<String> getPathId() {
        return this.pathId == null ? Output.empty() : this.pathId;
    }

    /**
     * Name of the path. You must provide `path_id` or `path_name`, but not both.
     * 
     */
    @Import(name="pathName")
      private final @Nullable Output<String> pathName;

    public Output<String> getPathName() {
        return this.pathName == null ? Output.empty() : this.pathName;
    }

    /**
     * Product identifier. For example, `prod-abcdzk7xy33qa`. You must provide `product_id` or `product_name`, but not both.
     * 
     */
    @Import(name="productId")
      private final @Nullable Output<String> productId;

    public Output<String> getProductId() {
        return this.productId == null ? Output.empty() : this.productId;
    }

    /**
     * Name of the product. You must provide `product_id` or `product_name`, but not both.
     * 
     */
    @Import(name="productName")
      private final @Nullable Output<String> productName;

    public Output<String> getProductName() {
        return this.productName == null ? Output.empty() : this.productName;
    }

    /**
     * Identifier of the provisioning artifact. For example, `pa-4abcdjnxjj6ne`. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
     * 
     */
    @Import(name="provisioningArtifactId")
      private final @Nullable Output<String> provisioningArtifactId;

    public Output<String> getProvisioningArtifactId() {
        return this.provisioningArtifactId == null ? Output.empty() : this.provisioningArtifactId;
    }

    /**
     * Name of the provisioning artifact. You must provide the `provisioning_artifact_id` or `provisioning_artifact_name`, but not both.
     * 
     */
    @Import(name="provisioningArtifactName")
      private final @Nullable Output<String> provisioningArtifactName;

    public Output<String> getProvisioningArtifactName() {
        return this.provisioningArtifactName == null ? Output.empty() : this.provisioningArtifactName;
    }

    /**
     * Configuration block with parameters specified by the administrator that are required for provisioning the product. See details below.
     * 
     */
    @Import(name="provisioningParameters")
      private final @Nullable Output<List<ProvisionedProductProvisioningParameterArgs>> provisioningParameters;

    public Output<List<ProvisionedProductProvisioningParameterArgs>> getProvisioningParameters() {
        return this.provisioningParameters == null ? Output.empty() : this.provisioningParameters;
    }

    /**
     * _Only applies to deleting._ Whether to delete the Service Catalog provisioned product but leave the CloudFormation stack, stack set, or the underlying resources of the deleted provisioned product. The default value is `false`.
     * 
     */
    @Import(name="retainPhysicalResources")
      private final @Nullable Output<Boolean> retainPhysicalResources;

    public Output<Boolean> getRetainPhysicalResources() {
        return this.retainPhysicalResources == null ? Output.empty() : this.retainPhysicalResources;
    }

    /**
     * Configuration block with information about the provisioning preferences for a stack set. See details below.
     * 
     */
    @Import(name="stackSetProvisioningPreferences")
      private final @Nullable Output<ProvisionedProductStackSetProvisioningPreferencesArgs> stackSetProvisioningPreferences;

    public Output<ProvisionedProductStackSetProvisioningPreferencesArgs> getStackSetProvisioningPreferences() {
        return this.stackSetProvisioningPreferences == null ? Output.empty() : this.stackSetProvisioningPreferences;
    }

    /**
     * Tags to apply to the provisioned product. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Import(name="tags")
      private final @Nullable Output<Map<String,String>> tags;

    public Output<Map<String,String>> getTags() {
        return this.tags == null ? Output.empty() : this.tags;
    }

    public ProvisionedProductArgs(
        @Nullable Output<String> acceptLanguage,
        @Nullable Output<Boolean> ignoreErrors,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> notificationArns,
        @Nullable Output<String> pathId,
        @Nullable Output<String> pathName,
        @Nullable Output<String> productId,
        @Nullable Output<String> productName,
        @Nullable Output<String> provisioningArtifactId,
        @Nullable Output<String> provisioningArtifactName,
        @Nullable Output<List<ProvisionedProductProvisioningParameterArgs>> provisioningParameters,
        @Nullable Output<Boolean> retainPhysicalResources,
        @Nullable Output<ProvisionedProductStackSetProvisioningPreferencesArgs> stackSetProvisioningPreferences,
        @Nullable Output<Map<String,String>> tags) {
        this.acceptLanguage = acceptLanguage;
        this.ignoreErrors = ignoreErrors;
        this.name = name;
        this.notificationArns = notificationArns;
        this.pathId = pathId;
        this.pathName = pathName;
        this.productId = productId;
        this.productName = productName;
        this.provisioningArtifactId = provisioningArtifactId;
        this.provisioningArtifactName = provisioningArtifactName;
        this.provisioningParameters = provisioningParameters;
        this.retainPhysicalResources = retainPhysicalResources;
        this.stackSetProvisioningPreferences = stackSetProvisioningPreferences;
        this.tags = tags;
    }

    private ProvisionedProductArgs() {
        this.acceptLanguage = Output.empty();
        this.ignoreErrors = Output.empty();
        this.name = Output.empty();
        this.notificationArns = Output.empty();
        this.pathId = Output.empty();
        this.pathName = Output.empty();
        this.productId = Output.empty();
        this.productName = Output.empty();
        this.provisioningArtifactId = Output.empty();
        this.provisioningArtifactName = Output.empty();
        this.provisioningParameters = Output.empty();
        this.retainPhysicalResources = Output.empty();
        this.stackSetProvisioningPreferences = Output.empty();
        this.tags = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProvisionedProductArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> acceptLanguage;
        private @Nullable Output<Boolean> ignoreErrors;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> notificationArns;
        private @Nullable Output<String> pathId;
        private @Nullable Output<String> pathName;
        private @Nullable Output<String> productId;
        private @Nullable Output<String> productName;
        private @Nullable Output<String> provisioningArtifactId;
        private @Nullable Output<String> provisioningArtifactName;
        private @Nullable Output<List<ProvisionedProductProvisioningParameterArgs>> provisioningParameters;
        private @Nullable Output<Boolean> retainPhysicalResources;
        private @Nullable Output<ProvisionedProductStackSetProvisioningPreferencesArgs> stackSetProvisioningPreferences;
        private @Nullable Output<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(ProvisionedProductArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.ignoreErrors = defaults.ignoreErrors;
    	      this.name = defaults.name;
    	      this.notificationArns = defaults.notificationArns;
    	      this.pathId = defaults.pathId;
    	      this.pathName = defaults.pathName;
    	      this.productId = defaults.productId;
    	      this.productName = defaults.productName;
    	      this.provisioningArtifactId = defaults.provisioningArtifactId;
    	      this.provisioningArtifactName = defaults.provisioningArtifactName;
    	      this.provisioningParameters = defaults.provisioningParameters;
    	      this.retainPhysicalResources = defaults.retainPhysicalResources;
    	      this.stackSetProvisioningPreferences = defaults.stackSetProvisioningPreferences;
    	      this.tags = defaults.tags;
        }

        public Builder acceptLanguage(@Nullable Output<String> acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }
        public Builder acceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = Output.ofNullable(acceptLanguage);
            return this;
        }
        public Builder ignoreErrors(@Nullable Output<Boolean> ignoreErrors) {
            this.ignoreErrors = ignoreErrors;
            return this;
        }
        public Builder ignoreErrors(@Nullable Boolean ignoreErrors) {
            this.ignoreErrors = Output.ofNullable(ignoreErrors);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }
        public Builder notificationArns(@Nullable Output<List<String>> notificationArns) {
            this.notificationArns = notificationArns;
            return this;
        }
        public Builder notificationArns(@Nullable List<String> notificationArns) {
            this.notificationArns = Output.ofNullable(notificationArns);
            return this;
        }
        public Builder notificationArns(String... notificationArns) {
            return notificationArns(List.of(notificationArns));
        }
        public Builder pathId(@Nullable Output<String> pathId) {
            this.pathId = pathId;
            return this;
        }
        public Builder pathId(@Nullable String pathId) {
            this.pathId = Output.ofNullable(pathId);
            return this;
        }
        public Builder pathName(@Nullable Output<String> pathName) {
            this.pathName = pathName;
            return this;
        }
        public Builder pathName(@Nullable String pathName) {
            this.pathName = Output.ofNullable(pathName);
            return this;
        }
        public Builder productId(@Nullable Output<String> productId) {
            this.productId = productId;
            return this;
        }
        public Builder productId(@Nullable String productId) {
            this.productId = Output.ofNullable(productId);
            return this;
        }
        public Builder productName(@Nullable Output<String> productName) {
            this.productName = productName;
            return this;
        }
        public Builder productName(@Nullable String productName) {
            this.productName = Output.ofNullable(productName);
            return this;
        }
        public Builder provisioningArtifactId(@Nullable Output<String> provisioningArtifactId) {
            this.provisioningArtifactId = provisioningArtifactId;
            return this;
        }
        public Builder provisioningArtifactId(@Nullable String provisioningArtifactId) {
            this.provisioningArtifactId = Output.ofNullable(provisioningArtifactId);
            return this;
        }
        public Builder provisioningArtifactName(@Nullable Output<String> provisioningArtifactName) {
            this.provisioningArtifactName = provisioningArtifactName;
            return this;
        }
        public Builder provisioningArtifactName(@Nullable String provisioningArtifactName) {
            this.provisioningArtifactName = Output.ofNullable(provisioningArtifactName);
            return this;
        }
        public Builder provisioningParameters(@Nullable Output<List<ProvisionedProductProvisioningParameterArgs>> provisioningParameters) {
            this.provisioningParameters = provisioningParameters;
            return this;
        }
        public Builder provisioningParameters(@Nullable List<ProvisionedProductProvisioningParameterArgs> provisioningParameters) {
            this.provisioningParameters = Output.ofNullable(provisioningParameters);
            return this;
        }
        public Builder provisioningParameters(ProvisionedProductProvisioningParameterArgs... provisioningParameters) {
            return provisioningParameters(List.of(provisioningParameters));
        }
        public Builder retainPhysicalResources(@Nullable Output<Boolean> retainPhysicalResources) {
            this.retainPhysicalResources = retainPhysicalResources;
            return this;
        }
        public Builder retainPhysicalResources(@Nullable Boolean retainPhysicalResources) {
            this.retainPhysicalResources = Output.ofNullable(retainPhysicalResources);
            return this;
        }
        public Builder stackSetProvisioningPreferences(@Nullable Output<ProvisionedProductStackSetProvisioningPreferencesArgs> stackSetProvisioningPreferences) {
            this.stackSetProvisioningPreferences = stackSetProvisioningPreferences;
            return this;
        }
        public Builder stackSetProvisioningPreferences(@Nullable ProvisionedProductStackSetProvisioningPreferencesArgs stackSetProvisioningPreferences) {
            this.stackSetProvisioningPreferences = Output.ofNullable(stackSetProvisioningPreferences);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }        public ProvisionedProductArgs build() {
            return new ProvisionedProductArgs(acceptLanguage, ignoreErrors, name, notificationArns, pathId, pathName, productId, productName, provisioningArtifactId, provisioningArtifactName, provisioningParameters, retainPhysicalResources, stackSetProvisioningPreferences, tags);
        }
    }
}