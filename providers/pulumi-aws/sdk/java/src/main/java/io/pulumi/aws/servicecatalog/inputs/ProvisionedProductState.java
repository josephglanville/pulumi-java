// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.servicecatalog.inputs;

import io.pulumi.aws.servicecatalog.inputs.ProvisionedProductProvisioningParameterGetArgs;
import io.pulumi.aws.servicecatalog.inputs.ProvisionedProductStackSetProvisioningPreferencesGetArgs;
import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ProvisionedProductState extends io.pulumi.resources.ResourceArgs {

    public static final ProvisionedProductState Empty = new ProvisionedProductState();

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
     * ARN of the provisioned product.
     * 
     */
    @Import(name="arn")
      private final @Nullable Output<String> arn;

    public Output<String> getArn() {
        return this.arn == null ? Output.empty() : this.arn;
    }

    /**
     * Set of CloudWatch dashboards that were created when provisioning the product.
     * 
     */
    @Import(name="cloudwatchDashboardNames")
      private final @Nullable Output<List<String>> cloudwatchDashboardNames;

    public Output<List<String>> getCloudwatchDashboardNames() {
        return this.cloudwatchDashboardNames == null ? Output.empty() : this.cloudwatchDashboardNames;
    }

    /**
     * Time when the provisioned product was created.
     * 
     */
    @Import(name="createdTime")
      private final @Nullable Output<String> createdTime;

    public Output<String> getCreatedTime() {
        return this.createdTime == null ? Output.empty() : this.createdTime;
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
     * Record identifier of the last request performed on this provisioned product of the following types: `ProvisionedProduct`, `UpdateProvisionedProduct`, `ExecuteProvisionedProductPlan`, `TerminateProvisionedProduct`.
     * 
     */
    @Import(name="lastProvisioningRecordId")
      private final @Nullable Output<String> lastProvisioningRecordId;

    public Output<String> getLastProvisioningRecordId() {
        return this.lastProvisioningRecordId == null ? Output.empty() : this.lastProvisioningRecordId;
    }

    /**
     * Record identifier of the last request performed on this provisioned product.
     * 
     */
    @Import(name="lastRecordId")
      private final @Nullable Output<String> lastRecordId;

    public Output<String> getLastRecordId() {
        return this.lastRecordId == null ? Output.empty() : this.lastRecordId;
    }

    /**
     * Record identifier of the last successful request performed on this provisioned product of the following types: `ProvisionedProduct`, `UpdateProvisionedProduct`, `ExecuteProvisionedProductPlan`, `TerminateProvisionedProduct`.
     * 
     */
    @Import(name="lastSuccessfulProvisioningRecordId")
      private final @Nullable Output<String> lastSuccessfulProvisioningRecordId;

    public Output<String> getLastSuccessfulProvisioningRecordId() {
        return this.lastSuccessfulProvisioningRecordId == null ? Output.empty() : this.lastSuccessfulProvisioningRecordId;
    }

    /**
     * ARN of the launch role associated with the provisioned product.
     * 
     */
    @Import(name="launchRoleArn")
      private final @Nullable Output<String> launchRoleArn;

    public Output<String> getLaunchRoleArn() {
        return this.launchRoleArn == null ? Output.empty() : this.launchRoleArn;
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
      private final @Nullable Output<List<ProvisionedProductProvisioningParameterGetArgs>> provisioningParameters;

    public Output<List<ProvisionedProductProvisioningParameterGetArgs>> getProvisioningParameters() {
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
      private final @Nullable Output<ProvisionedProductStackSetProvisioningPreferencesGetArgs> stackSetProvisioningPreferences;

    public Output<ProvisionedProductStackSetProvisioningPreferencesGetArgs> getStackSetProvisioningPreferences() {
        return this.stackSetProvisioningPreferences == null ? Output.empty() : this.stackSetProvisioningPreferences;
    }

    /**
     * Current status of the provisioned product. See meanings below.
     * 
     */
    @Import(name="status")
      private final @Nullable Output<String> status;

    public Output<String> getStatus() {
        return this.status == null ? Output.empty() : this.status;
    }

    /**
     * Current status message of the provisioned product.
     * 
     */
    @Import(name="statusMessage")
      private final @Nullable Output<String> statusMessage;

    public Output<String> getStatusMessage() {
        return this.statusMessage == null ? Output.empty() : this.statusMessage;
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

    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Import(name="tagsAll")
      private final @Nullable Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> getTagsAll() {
        return this.tagsAll == null ? Output.empty() : this.tagsAll;
    }

    /**
     * Type of provisioned product. Valid values are `CFN_STACK` and `CFN_STACKSET`.
     * 
     */
    @Import(name="type")
      private final @Nullable Output<String> type;

    public Output<String> getType() {
        return this.type == null ? Output.empty() : this.type;
    }

    public ProvisionedProductState(
        @Nullable Output<String> acceptLanguage,
        @Nullable Output<String> arn,
        @Nullable Output<List<String>> cloudwatchDashboardNames,
        @Nullable Output<String> createdTime,
        @Nullable Output<Boolean> ignoreErrors,
        @Nullable Output<String> lastProvisioningRecordId,
        @Nullable Output<String> lastRecordId,
        @Nullable Output<String> lastSuccessfulProvisioningRecordId,
        @Nullable Output<String> launchRoleArn,
        @Nullable Output<String> name,
        @Nullable Output<List<String>> notificationArns,
        @Nullable Output<String> pathId,
        @Nullable Output<String> pathName,
        @Nullable Output<String> productId,
        @Nullable Output<String> productName,
        @Nullable Output<String> provisioningArtifactId,
        @Nullable Output<String> provisioningArtifactName,
        @Nullable Output<List<ProvisionedProductProvisioningParameterGetArgs>> provisioningParameters,
        @Nullable Output<Boolean> retainPhysicalResources,
        @Nullable Output<ProvisionedProductStackSetProvisioningPreferencesGetArgs> stackSetProvisioningPreferences,
        @Nullable Output<String> status,
        @Nullable Output<String> statusMessage,
        @Nullable Output<Map<String,String>> tags,
        @Nullable Output<Map<String,String>> tagsAll,
        @Nullable Output<String> type) {
        this.acceptLanguage = acceptLanguage;
        this.arn = arn;
        this.cloudwatchDashboardNames = cloudwatchDashboardNames;
        this.createdTime = createdTime;
        this.ignoreErrors = ignoreErrors;
        this.lastProvisioningRecordId = lastProvisioningRecordId;
        this.lastRecordId = lastRecordId;
        this.lastSuccessfulProvisioningRecordId = lastSuccessfulProvisioningRecordId;
        this.launchRoleArn = launchRoleArn;
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
        this.status = status;
        this.statusMessage = statusMessage;
        this.tags = tags;
        this.tagsAll = tagsAll;
        this.type = type;
    }

    private ProvisionedProductState() {
        this.acceptLanguage = Output.empty();
        this.arn = Output.empty();
        this.cloudwatchDashboardNames = Output.empty();
        this.createdTime = Output.empty();
        this.ignoreErrors = Output.empty();
        this.lastProvisioningRecordId = Output.empty();
        this.lastRecordId = Output.empty();
        this.lastSuccessfulProvisioningRecordId = Output.empty();
        this.launchRoleArn = Output.empty();
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
        this.status = Output.empty();
        this.statusMessage = Output.empty();
        this.tags = Output.empty();
        this.tagsAll = Output.empty();
        this.type = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProvisionedProductState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> acceptLanguage;
        private @Nullable Output<String> arn;
        private @Nullable Output<List<String>> cloudwatchDashboardNames;
        private @Nullable Output<String> createdTime;
        private @Nullable Output<Boolean> ignoreErrors;
        private @Nullable Output<String> lastProvisioningRecordId;
        private @Nullable Output<String> lastRecordId;
        private @Nullable Output<String> lastSuccessfulProvisioningRecordId;
        private @Nullable Output<String> launchRoleArn;
        private @Nullable Output<String> name;
        private @Nullable Output<List<String>> notificationArns;
        private @Nullable Output<String> pathId;
        private @Nullable Output<String> pathName;
        private @Nullable Output<String> productId;
        private @Nullable Output<String> productName;
        private @Nullable Output<String> provisioningArtifactId;
        private @Nullable Output<String> provisioningArtifactName;
        private @Nullable Output<List<ProvisionedProductProvisioningParameterGetArgs>> provisioningParameters;
        private @Nullable Output<Boolean> retainPhysicalResources;
        private @Nullable Output<ProvisionedProductStackSetProvisioningPreferencesGetArgs> stackSetProvisioningPreferences;
        private @Nullable Output<String> status;
        private @Nullable Output<String> statusMessage;
        private @Nullable Output<Map<String,String>> tags;
        private @Nullable Output<Map<String,String>> tagsAll;
        private @Nullable Output<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(ProvisionedProductState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.acceptLanguage = defaults.acceptLanguage;
    	      this.arn = defaults.arn;
    	      this.cloudwatchDashboardNames = defaults.cloudwatchDashboardNames;
    	      this.createdTime = defaults.createdTime;
    	      this.ignoreErrors = defaults.ignoreErrors;
    	      this.lastProvisioningRecordId = defaults.lastProvisioningRecordId;
    	      this.lastRecordId = defaults.lastRecordId;
    	      this.lastSuccessfulProvisioningRecordId = defaults.lastSuccessfulProvisioningRecordId;
    	      this.launchRoleArn = defaults.launchRoleArn;
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
    	      this.status = defaults.status;
    	      this.statusMessage = defaults.statusMessage;
    	      this.tags = defaults.tags;
    	      this.tagsAll = defaults.tagsAll;
    	      this.type = defaults.type;
        }

        public Builder acceptLanguage(@Nullable Output<String> acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }
        public Builder acceptLanguage(@Nullable String acceptLanguage) {
            this.acceptLanguage = Output.ofNullable(acceptLanguage);
            return this;
        }
        public Builder arn(@Nullable Output<String> arn) {
            this.arn = arn;
            return this;
        }
        public Builder arn(@Nullable String arn) {
            this.arn = Output.ofNullable(arn);
            return this;
        }
        public Builder cloudwatchDashboardNames(@Nullable Output<List<String>> cloudwatchDashboardNames) {
            this.cloudwatchDashboardNames = cloudwatchDashboardNames;
            return this;
        }
        public Builder cloudwatchDashboardNames(@Nullable List<String> cloudwatchDashboardNames) {
            this.cloudwatchDashboardNames = Output.ofNullable(cloudwatchDashboardNames);
            return this;
        }
        public Builder cloudwatchDashboardNames(String... cloudwatchDashboardNames) {
            return cloudwatchDashboardNames(List.of(cloudwatchDashboardNames));
        }
        public Builder createdTime(@Nullable Output<String> createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Builder createdTime(@Nullable String createdTime) {
            this.createdTime = Output.ofNullable(createdTime);
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
        public Builder lastProvisioningRecordId(@Nullable Output<String> lastProvisioningRecordId) {
            this.lastProvisioningRecordId = lastProvisioningRecordId;
            return this;
        }
        public Builder lastProvisioningRecordId(@Nullable String lastProvisioningRecordId) {
            this.lastProvisioningRecordId = Output.ofNullable(lastProvisioningRecordId);
            return this;
        }
        public Builder lastRecordId(@Nullable Output<String> lastRecordId) {
            this.lastRecordId = lastRecordId;
            return this;
        }
        public Builder lastRecordId(@Nullable String lastRecordId) {
            this.lastRecordId = Output.ofNullable(lastRecordId);
            return this;
        }
        public Builder lastSuccessfulProvisioningRecordId(@Nullable Output<String> lastSuccessfulProvisioningRecordId) {
            this.lastSuccessfulProvisioningRecordId = lastSuccessfulProvisioningRecordId;
            return this;
        }
        public Builder lastSuccessfulProvisioningRecordId(@Nullable String lastSuccessfulProvisioningRecordId) {
            this.lastSuccessfulProvisioningRecordId = Output.ofNullable(lastSuccessfulProvisioningRecordId);
            return this;
        }
        public Builder launchRoleArn(@Nullable Output<String> launchRoleArn) {
            this.launchRoleArn = launchRoleArn;
            return this;
        }
        public Builder launchRoleArn(@Nullable String launchRoleArn) {
            this.launchRoleArn = Output.ofNullable(launchRoleArn);
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
        public Builder provisioningParameters(@Nullable Output<List<ProvisionedProductProvisioningParameterGetArgs>> provisioningParameters) {
            this.provisioningParameters = provisioningParameters;
            return this;
        }
        public Builder provisioningParameters(@Nullable List<ProvisionedProductProvisioningParameterGetArgs> provisioningParameters) {
            this.provisioningParameters = Output.ofNullable(provisioningParameters);
            return this;
        }
        public Builder provisioningParameters(ProvisionedProductProvisioningParameterGetArgs... provisioningParameters) {
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
        public Builder stackSetProvisioningPreferences(@Nullable Output<ProvisionedProductStackSetProvisioningPreferencesGetArgs> stackSetProvisioningPreferences) {
            this.stackSetProvisioningPreferences = stackSetProvisioningPreferences;
            return this;
        }
        public Builder stackSetProvisioningPreferences(@Nullable ProvisionedProductStackSetProvisioningPreferencesGetArgs stackSetProvisioningPreferences) {
            this.stackSetProvisioningPreferences = Output.ofNullable(stackSetProvisioningPreferences);
            return this;
        }
        public Builder status(@Nullable Output<String> status) {
            this.status = status;
            return this;
        }
        public Builder status(@Nullable String status) {
            this.status = Output.ofNullable(status);
            return this;
        }
        public Builder statusMessage(@Nullable Output<String> statusMessage) {
            this.statusMessage = statusMessage;
            return this;
        }
        public Builder statusMessage(@Nullable String statusMessage) {
            this.statusMessage = Output.ofNullable(statusMessage);
            return this;
        }
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }
        public Builder tags(@Nullable Map<String,String> tags) {
            this.tags = Output.ofNullable(tags);
            return this;
        }
        public Builder tagsAll(@Nullable Output<Map<String,String>> tagsAll) {
            this.tagsAll = tagsAll;
            return this;
        }
        public Builder tagsAll(@Nullable Map<String,String> tagsAll) {
            this.tagsAll = Output.ofNullable(tagsAll);
            return this;
        }
        public Builder type(@Nullable Output<String> type) {
            this.type = type;
            return this;
        }
        public Builder type(@Nullable String type) {
            this.type = Output.ofNullable(type);
            return this;
        }        public ProvisionedProductState build() {
            return new ProvisionedProductState(acceptLanguage, arn, cloudwatchDashboardNames, createdTime, ignoreErrors, lastProvisioningRecordId, lastRecordId, lastSuccessfulProvisioningRecordId, launchRoleArn, name, notificationArns, pathId, pathName, productId, productName, provisioningArtifactId, provisioningArtifactName, provisioningParameters, retainPhysicalResources, stackSetProvisioningPreferences, status, statusMessage, tags, tagsAll, type);
        }
    }
}