// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.enums.ProvisioningState;
import io.pulumi.azurenative.providerhub.enums.Regionality;
import io.pulumi.azurenative.providerhub.enums.ResourceDeletionPolicy;
import io.pulumi.azurenative.providerhub.enums.RoutingType;
import io.pulumi.azurenative.providerhub.inputs.AuthorizationActionMappingArgs;
import io.pulumi.azurenative.providerhub.inputs.ExtendedLocationOptionsArgs;
import io.pulumi.azurenative.providerhub.inputs.LinkedAccessCheckArgs;
import io.pulumi.azurenative.providerhub.inputs.LoggingRuleArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceTypeEndpointArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesExtensionOptionsArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesFeaturesRuleArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesIdentityManagementArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesResourceMovePolicyArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs;
import io.pulumi.azurenative.providerhub.inputs.ResourceTypeRegistrationPropertiesTemplateDeploymentOptionsArgs;
import io.pulumi.azurenative.providerhub.inputs.ServiceTreeInfoArgs;
import io.pulumi.azurenative.providerhub.inputs.SubscriptionStateRuleArgs;
import io.pulumi.azurenative.providerhub.inputs.SwaggerSpecificationArgs;
import io.pulumi.azurenative.providerhub.inputs.ThrottlingRuleArgs;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


public final class ResourceTypeRegistrationPropertiesArgs extends io.pulumi.resources.ResourceArgs {

    public static final ResourceTypeRegistrationPropertiesArgs Empty = new ResourceTypeRegistrationPropertiesArgs();

    @InputImport(name="allowedUnauthorizedActions")
      private final @Nullable Input<List<String>> allowedUnauthorizedActions;

    public Input<List<String>> getAllowedUnauthorizedActions() {
        return this.allowedUnauthorizedActions == null ? Input.empty() : this.allowedUnauthorizedActions;
    }

    @InputImport(name="authorizationActionMappings")
      private final @Nullable Input<List<AuthorizationActionMappingArgs>> authorizationActionMappings;

    public Input<List<AuthorizationActionMappingArgs>> getAuthorizationActionMappings() {
        return this.authorizationActionMappings == null ? Input.empty() : this.authorizationActionMappings;
    }

    @InputImport(name="checkNameAvailabilitySpecifications")
      private final @Nullable Input<ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs> checkNameAvailabilitySpecifications;

    public Input<ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs> getCheckNameAvailabilitySpecifications() {
        return this.checkNameAvailabilitySpecifications == null ? Input.empty() : this.checkNameAvailabilitySpecifications;
    }

    @InputImport(name="defaultApiVersion")
      private final @Nullable Input<String> defaultApiVersion;

    public Input<String> getDefaultApiVersion() {
        return this.defaultApiVersion == null ? Input.empty() : this.defaultApiVersion;
    }

    @InputImport(name="disallowedActionVerbs")
      private final @Nullable Input<List<String>> disallowedActionVerbs;

    public Input<List<String>> getDisallowedActionVerbs() {
        return this.disallowedActionVerbs == null ? Input.empty() : this.disallowedActionVerbs;
    }

    @InputImport(name="enableAsyncOperation")
      private final @Nullable Input<Boolean> enableAsyncOperation;

    public Input<Boolean> getEnableAsyncOperation() {
        return this.enableAsyncOperation == null ? Input.empty() : this.enableAsyncOperation;
    }

    @InputImport(name="enableThirdPartyS2S")
      private final @Nullable Input<Boolean> enableThirdPartyS2S;

    public Input<Boolean> getEnableThirdPartyS2S() {
        return this.enableThirdPartyS2S == null ? Input.empty() : this.enableThirdPartyS2S;
    }

    @InputImport(name="endpoints")
      private final @Nullable Input<List<ResourceTypeEndpointArgs>> endpoints;

    public Input<List<ResourceTypeEndpointArgs>> getEndpoints() {
        return this.endpoints == null ? Input.empty() : this.endpoints;
    }

    @InputImport(name="extendedLocations")
      private final @Nullable Input<List<ExtendedLocationOptionsArgs>> extendedLocations;

    public Input<List<ExtendedLocationOptionsArgs>> getExtendedLocations() {
        return this.extendedLocations == null ? Input.empty() : this.extendedLocations;
    }

    @InputImport(name="extensionOptions")
      private final @Nullable Input<ResourceTypeRegistrationPropertiesExtensionOptionsArgs> extensionOptions;

    public Input<ResourceTypeRegistrationPropertiesExtensionOptionsArgs> getExtensionOptions() {
        return this.extensionOptions == null ? Input.empty() : this.extensionOptions;
    }

    @InputImport(name="featuresRule")
      private final @Nullable Input<ResourceTypeRegistrationPropertiesFeaturesRuleArgs> featuresRule;

    public Input<ResourceTypeRegistrationPropertiesFeaturesRuleArgs> getFeaturesRule() {
        return this.featuresRule == null ? Input.empty() : this.featuresRule;
    }

    @InputImport(name="identityManagement")
      private final @Nullable Input<ResourceTypeRegistrationPropertiesIdentityManagementArgs> identityManagement;

    public Input<ResourceTypeRegistrationPropertiesIdentityManagementArgs> getIdentityManagement() {
        return this.identityManagement == null ? Input.empty() : this.identityManagement;
    }

    @InputImport(name="isPureProxy")
      private final @Nullable Input<Boolean> isPureProxy;

    public Input<Boolean> getIsPureProxy() {
        return this.isPureProxy == null ? Input.empty() : this.isPureProxy;
    }

    @InputImport(name="linkedAccessChecks")
      private final @Nullable Input<List<LinkedAccessCheckArgs>> linkedAccessChecks;

    public Input<List<LinkedAccessCheckArgs>> getLinkedAccessChecks() {
        return this.linkedAccessChecks == null ? Input.empty() : this.linkedAccessChecks;
    }

    @InputImport(name="loggingRules")
      private final @Nullable Input<List<LoggingRuleArgs>> loggingRules;

    public Input<List<LoggingRuleArgs>> getLoggingRules() {
        return this.loggingRules == null ? Input.empty() : this.loggingRules;
    }

    @InputImport(name="marketplaceType")
      private final @Nullable Input<String> marketplaceType;

    public Input<String> getMarketplaceType() {
        return this.marketplaceType == null ? Input.empty() : this.marketplaceType;
    }

    @InputImport(name="provisioningState")
      private final @Nullable Input<Either<String,ProvisioningState>> provisioningState;

    public Input<Either<String,ProvisioningState>> getProvisioningState() {
        return this.provisioningState == null ? Input.empty() : this.provisioningState;
    }

    @InputImport(name="regionality")
      private final @Nullable Input<Either<String,Regionality>> regionality;

    public Input<Either<String,Regionality>> getRegionality() {
        return this.regionality == null ? Input.empty() : this.regionality;
    }

    @InputImport(name="requestHeaderOptions")
      private final @Nullable Input<ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs> requestHeaderOptions;

    public Input<ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs> getRequestHeaderOptions() {
        return this.requestHeaderOptions == null ? Input.empty() : this.requestHeaderOptions;
    }

    @InputImport(name="requiredFeatures")
      private final @Nullable Input<List<String>> requiredFeatures;

    public Input<List<String>> getRequiredFeatures() {
        return this.requiredFeatures == null ? Input.empty() : this.requiredFeatures;
    }

    @InputImport(name="resourceDeletionPolicy")
      private final @Nullable Input<Either<String,ResourceDeletionPolicy>> resourceDeletionPolicy;

    public Input<Either<String,ResourceDeletionPolicy>> getResourceDeletionPolicy() {
        return this.resourceDeletionPolicy == null ? Input.empty() : this.resourceDeletionPolicy;
    }

    @InputImport(name="resourceMovePolicy")
      private final @Nullable Input<ResourceTypeRegistrationPropertiesResourceMovePolicyArgs> resourceMovePolicy;

    public Input<ResourceTypeRegistrationPropertiesResourceMovePolicyArgs> getResourceMovePolicy() {
        return this.resourceMovePolicy == null ? Input.empty() : this.resourceMovePolicy;
    }

    @InputImport(name="routingType")
      private final @Nullable Input<Either<String,RoutingType>> routingType;

    public Input<Either<String,RoutingType>> getRoutingType() {
        return this.routingType == null ? Input.empty() : this.routingType;
    }

    @InputImport(name="serviceTreeInfos")
      private final @Nullable Input<List<ServiceTreeInfoArgs>> serviceTreeInfos;

    public Input<List<ServiceTreeInfoArgs>> getServiceTreeInfos() {
        return this.serviceTreeInfos == null ? Input.empty() : this.serviceTreeInfos;
    }

    @InputImport(name="subscriptionLifecycleNotificationSpecifications")
      private final @Nullable Input<ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs> subscriptionLifecycleNotificationSpecifications;

    public Input<ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs> getSubscriptionLifecycleNotificationSpecifications() {
        return this.subscriptionLifecycleNotificationSpecifications == null ? Input.empty() : this.subscriptionLifecycleNotificationSpecifications;
    }

    @InputImport(name="subscriptionStateRules")
      private final @Nullable Input<List<SubscriptionStateRuleArgs>> subscriptionStateRules;

    public Input<List<SubscriptionStateRuleArgs>> getSubscriptionStateRules() {
        return this.subscriptionStateRules == null ? Input.empty() : this.subscriptionStateRules;
    }

    @InputImport(name="swaggerSpecifications")
      private final @Nullable Input<List<SwaggerSpecificationArgs>> swaggerSpecifications;

    public Input<List<SwaggerSpecificationArgs>> getSwaggerSpecifications() {
        return this.swaggerSpecifications == null ? Input.empty() : this.swaggerSpecifications;
    }

    @InputImport(name="templateDeploymentOptions")
      private final @Nullable Input<ResourceTypeRegistrationPropertiesTemplateDeploymentOptionsArgs> templateDeploymentOptions;

    public Input<ResourceTypeRegistrationPropertiesTemplateDeploymentOptionsArgs> getTemplateDeploymentOptions() {
        return this.templateDeploymentOptions == null ? Input.empty() : this.templateDeploymentOptions;
    }

    @InputImport(name="throttlingRules")
      private final @Nullable Input<List<ThrottlingRuleArgs>> throttlingRules;

    public Input<List<ThrottlingRuleArgs>> getThrottlingRules() {
        return this.throttlingRules == null ? Input.empty() : this.throttlingRules;
    }

    public ResourceTypeRegistrationPropertiesArgs(
        @Nullable Input<List<String>> allowedUnauthorizedActions,
        @Nullable Input<List<AuthorizationActionMappingArgs>> authorizationActionMappings,
        @Nullable Input<ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs> checkNameAvailabilitySpecifications,
        @Nullable Input<String> defaultApiVersion,
        @Nullable Input<List<String>> disallowedActionVerbs,
        @Nullable Input<Boolean> enableAsyncOperation,
        @Nullable Input<Boolean> enableThirdPartyS2S,
        @Nullable Input<List<ResourceTypeEndpointArgs>> endpoints,
        @Nullable Input<List<ExtendedLocationOptionsArgs>> extendedLocations,
        @Nullable Input<ResourceTypeRegistrationPropertiesExtensionOptionsArgs> extensionOptions,
        @Nullable Input<ResourceTypeRegistrationPropertiesFeaturesRuleArgs> featuresRule,
        @Nullable Input<ResourceTypeRegistrationPropertiesIdentityManagementArgs> identityManagement,
        @Nullable Input<Boolean> isPureProxy,
        @Nullable Input<List<LinkedAccessCheckArgs>> linkedAccessChecks,
        @Nullable Input<List<LoggingRuleArgs>> loggingRules,
        @Nullable Input<String> marketplaceType,
        @Nullable Input<Either<String,ProvisioningState>> provisioningState,
        @Nullable Input<Either<String,Regionality>> regionality,
        @Nullable Input<ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs> requestHeaderOptions,
        @Nullable Input<List<String>> requiredFeatures,
        @Nullable Input<Either<String,ResourceDeletionPolicy>> resourceDeletionPolicy,
        @Nullable Input<ResourceTypeRegistrationPropertiesResourceMovePolicyArgs> resourceMovePolicy,
        @Nullable Input<Either<String,RoutingType>> routingType,
        @Nullable Input<List<ServiceTreeInfoArgs>> serviceTreeInfos,
        @Nullable Input<ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs> subscriptionLifecycleNotificationSpecifications,
        @Nullable Input<List<SubscriptionStateRuleArgs>> subscriptionStateRules,
        @Nullable Input<List<SwaggerSpecificationArgs>> swaggerSpecifications,
        @Nullable Input<ResourceTypeRegistrationPropertiesTemplateDeploymentOptionsArgs> templateDeploymentOptions,
        @Nullable Input<List<ThrottlingRuleArgs>> throttlingRules) {
        this.allowedUnauthorizedActions = allowedUnauthorizedActions;
        this.authorizationActionMappings = authorizationActionMappings;
        this.checkNameAvailabilitySpecifications = checkNameAvailabilitySpecifications;
        this.defaultApiVersion = defaultApiVersion;
        this.disallowedActionVerbs = disallowedActionVerbs;
        this.enableAsyncOperation = enableAsyncOperation;
        this.enableThirdPartyS2S = enableThirdPartyS2S;
        this.endpoints = endpoints;
        this.extendedLocations = extendedLocations;
        this.extensionOptions = extensionOptions;
        this.featuresRule = featuresRule;
        this.identityManagement = identityManagement;
        this.isPureProxy = isPureProxy;
        this.linkedAccessChecks = linkedAccessChecks;
        this.loggingRules = loggingRules;
        this.marketplaceType = marketplaceType;
        this.provisioningState = provisioningState;
        this.regionality = regionality;
        this.requestHeaderOptions = requestHeaderOptions;
        this.requiredFeatures = requiredFeatures;
        this.resourceDeletionPolicy = resourceDeletionPolicy;
        this.resourceMovePolicy = resourceMovePolicy;
        this.routingType = routingType;
        this.serviceTreeInfos = serviceTreeInfos;
        this.subscriptionLifecycleNotificationSpecifications = subscriptionLifecycleNotificationSpecifications;
        this.subscriptionStateRules = subscriptionStateRules;
        this.swaggerSpecifications = swaggerSpecifications;
        this.templateDeploymentOptions = templateDeploymentOptions;
        this.throttlingRules = throttlingRules;
    }

    private ResourceTypeRegistrationPropertiesArgs() {
        this.allowedUnauthorizedActions = Input.empty();
        this.authorizationActionMappings = Input.empty();
        this.checkNameAvailabilitySpecifications = Input.empty();
        this.defaultApiVersion = Input.empty();
        this.disallowedActionVerbs = Input.empty();
        this.enableAsyncOperation = Input.empty();
        this.enableThirdPartyS2S = Input.empty();
        this.endpoints = Input.empty();
        this.extendedLocations = Input.empty();
        this.extensionOptions = Input.empty();
        this.featuresRule = Input.empty();
        this.identityManagement = Input.empty();
        this.isPureProxy = Input.empty();
        this.linkedAccessChecks = Input.empty();
        this.loggingRules = Input.empty();
        this.marketplaceType = Input.empty();
        this.provisioningState = Input.empty();
        this.regionality = Input.empty();
        this.requestHeaderOptions = Input.empty();
        this.requiredFeatures = Input.empty();
        this.resourceDeletionPolicy = Input.empty();
        this.resourceMovePolicy = Input.empty();
        this.routingType = Input.empty();
        this.serviceTreeInfos = Input.empty();
        this.subscriptionLifecycleNotificationSpecifications = Input.empty();
        this.subscriptionStateRules = Input.empty();
        this.swaggerSpecifications = Input.empty();
        this.templateDeploymentOptions = Input.empty();
        this.throttlingRules = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationPropertiesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<String>> allowedUnauthorizedActions;
        private @Nullable Input<List<AuthorizationActionMappingArgs>> authorizationActionMappings;
        private @Nullable Input<ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs> checkNameAvailabilitySpecifications;
        private @Nullable Input<String> defaultApiVersion;
        private @Nullable Input<List<String>> disallowedActionVerbs;
        private @Nullable Input<Boolean> enableAsyncOperation;
        private @Nullable Input<Boolean> enableThirdPartyS2S;
        private @Nullable Input<List<ResourceTypeEndpointArgs>> endpoints;
        private @Nullable Input<List<ExtendedLocationOptionsArgs>> extendedLocations;
        private @Nullable Input<ResourceTypeRegistrationPropertiesExtensionOptionsArgs> extensionOptions;
        private @Nullable Input<ResourceTypeRegistrationPropertiesFeaturesRuleArgs> featuresRule;
        private @Nullable Input<ResourceTypeRegistrationPropertiesIdentityManagementArgs> identityManagement;
        private @Nullable Input<Boolean> isPureProxy;
        private @Nullable Input<List<LinkedAccessCheckArgs>> linkedAccessChecks;
        private @Nullable Input<List<LoggingRuleArgs>> loggingRules;
        private @Nullable Input<String> marketplaceType;
        private @Nullable Input<Either<String,ProvisioningState>> provisioningState;
        private @Nullable Input<Either<String,Regionality>> regionality;
        private @Nullable Input<ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs> requestHeaderOptions;
        private @Nullable Input<List<String>> requiredFeatures;
        private @Nullable Input<Either<String,ResourceDeletionPolicy>> resourceDeletionPolicy;
        private @Nullable Input<ResourceTypeRegistrationPropertiesResourceMovePolicyArgs> resourceMovePolicy;
        private @Nullable Input<Either<String,RoutingType>> routingType;
        private @Nullable Input<List<ServiceTreeInfoArgs>> serviceTreeInfos;
        private @Nullable Input<ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs> subscriptionLifecycleNotificationSpecifications;
        private @Nullable Input<List<SubscriptionStateRuleArgs>> subscriptionStateRules;
        private @Nullable Input<List<SwaggerSpecificationArgs>> swaggerSpecifications;
        private @Nullable Input<ResourceTypeRegistrationPropertiesTemplateDeploymentOptionsArgs> templateDeploymentOptions;
        private @Nullable Input<List<ThrottlingRuleArgs>> throttlingRules;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationPropertiesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowedUnauthorizedActions = defaults.allowedUnauthorizedActions;
    	      this.authorizationActionMappings = defaults.authorizationActionMappings;
    	      this.checkNameAvailabilitySpecifications = defaults.checkNameAvailabilitySpecifications;
    	      this.defaultApiVersion = defaults.defaultApiVersion;
    	      this.disallowedActionVerbs = defaults.disallowedActionVerbs;
    	      this.enableAsyncOperation = defaults.enableAsyncOperation;
    	      this.enableThirdPartyS2S = defaults.enableThirdPartyS2S;
    	      this.endpoints = defaults.endpoints;
    	      this.extendedLocations = defaults.extendedLocations;
    	      this.extensionOptions = defaults.extensionOptions;
    	      this.featuresRule = defaults.featuresRule;
    	      this.identityManagement = defaults.identityManagement;
    	      this.isPureProxy = defaults.isPureProxy;
    	      this.linkedAccessChecks = defaults.linkedAccessChecks;
    	      this.loggingRules = defaults.loggingRules;
    	      this.marketplaceType = defaults.marketplaceType;
    	      this.provisioningState = defaults.provisioningState;
    	      this.regionality = defaults.regionality;
    	      this.requestHeaderOptions = defaults.requestHeaderOptions;
    	      this.requiredFeatures = defaults.requiredFeatures;
    	      this.resourceDeletionPolicy = defaults.resourceDeletionPolicy;
    	      this.resourceMovePolicy = defaults.resourceMovePolicy;
    	      this.routingType = defaults.routingType;
    	      this.serviceTreeInfos = defaults.serviceTreeInfos;
    	      this.subscriptionLifecycleNotificationSpecifications = defaults.subscriptionLifecycleNotificationSpecifications;
    	      this.subscriptionStateRules = defaults.subscriptionStateRules;
    	      this.swaggerSpecifications = defaults.swaggerSpecifications;
    	      this.templateDeploymentOptions = defaults.templateDeploymentOptions;
    	      this.throttlingRules = defaults.throttlingRules;
        }

        public Builder setAllowedUnauthorizedActions(@Nullable Input<List<String>> allowedUnauthorizedActions) {
            this.allowedUnauthorizedActions = allowedUnauthorizedActions;
            return this;
        }

        public Builder setAllowedUnauthorizedActions(@Nullable List<String> allowedUnauthorizedActions) {
            this.allowedUnauthorizedActions = Input.ofNullable(allowedUnauthorizedActions);
            return this;
        }

        public Builder setAuthorizationActionMappings(@Nullable Input<List<AuthorizationActionMappingArgs>> authorizationActionMappings) {
            this.authorizationActionMappings = authorizationActionMappings;
            return this;
        }

        public Builder setAuthorizationActionMappings(@Nullable List<AuthorizationActionMappingArgs> authorizationActionMappings) {
            this.authorizationActionMappings = Input.ofNullable(authorizationActionMappings);
            return this;
        }

        public Builder setCheckNameAvailabilitySpecifications(@Nullable Input<ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs> checkNameAvailabilitySpecifications) {
            this.checkNameAvailabilitySpecifications = checkNameAvailabilitySpecifications;
            return this;
        }

        public Builder setCheckNameAvailabilitySpecifications(@Nullable ResourceTypeRegistrationPropertiesCheckNameAvailabilitySpecificationsArgs checkNameAvailabilitySpecifications) {
            this.checkNameAvailabilitySpecifications = Input.ofNullable(checkNameAvailabilitySpecifications);
            return this;
        }

        public Builder setDefaultApiVersion(@Nullable Input<String> defaultApiVersion) {
            this.defaultApiVersion = defaultApiVersion;
            return this;
        }

        public Builder setDefaultApiVersion(@Nullable String defaultApiVersion) {
            this.defaultApiVersion = Input.ofNullable(defaultApiVersion);
            return this;
        }

        public Builder setDisallowedActionVerbs(@Nullable Input<List<String>> disallowedActionVerbs) {
            this.disallowedActionVerbs = disallowedActionVerbs;
            return this;
        }

        public Builder setDisallowedActionVerbs(@Nullable List<String> disallowedActionVerbs) {
            this.disallowedActionVerbs = Input.ofNullable(disallowedActionVerbs);
            return this;
        }

        public Builder setEnableAsyncOperation(@Nullable Input<Boolean> enableAsyncOperation) {
            this.enableAsyncOperation = enableAsyncOperation;
            return this;
        }

        public Builder setEnableAsyncOperation(@Nullable Boolean enableAsyncOperation) {
            this.enableAsyncOperation = Input.ofNullable(enableAsyncOperation);
            return this;
        }

        public Builder setEnableThirdPartyS2S(@Nullable Input<Boolean> enableThirdPartyS2S) {
            this.enableThirdPartyS2S = enableThirdPartyS2S;
            return this;
        }

        public Builder setEnableThirdPartyS2S(@Nullable Boolean enableThirdPartyS2S) {
            this.enableThirdPartyS2S = Input.ofNullable(enableThirdPartyS2S);
            return this;
        }

        public Builder setEndpoints(@Nullable Input<List<ResourceTypeEndpointArgs>> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        public Builder setEndpoints(@Nullable List<ResourceTypeEndpointArgs> endpoints) {
            this.endpoints = Input.ofNullable(endpoints);
            return this;
        }

        public Builder setExtendedLocations(@Nullable Input<List<ExtendedLocationOptionsArgs>> extendedLocations) {
            this.extendedLocations = extendedLocations;
            return this;
        }

        public Builder setExtendedLocations(@Nullable List<ExtendedLocationOptionsArgs> extendedLocations) {
            this.extendedLocations = Input.ofNullable(extendedLocations);
            return this;
        }

        public Builder setExtensionOptions(@Nullable Input<ResourceTypeRegistrationPropertiesExtensionOptionsArgs> extensionOptions) {
            this.extensionOptions = extensionOptions;
            return this;
        }

        public Builder setExtensionOptions(@Nullable ResourceTypeRegistrationPropertiesExtensionOptionsArgs extensionOptions) {
            this.extensionOptions = Input.ofNullable(extensionOptions);
            return this;
        }

        public Builder setFeaturesRule(@Nullable Input<ResourceTypeRegistrationPropertiesFeaturesRuleArgs> featuresRule) {
            this.featuresRule = featuresRule;
            return this;
        }

        public Builder setFeaturesRule(@Nullable ResourceTypeRegistrationPropertiesFeaturesRuleArgs featuresRule) {
            this.featuresRule = Input.ofNullable(featuresRule);
            return this;
        }

        public Builder setIdentityManagement(@Nullable Input<ResourceTypeRegistrationPropertiesIdentityManagementArgs> identityManagement) {
            this.identityManagement = identityManagement;
            return this;
        }

        public Builder setIdentityManagement(@Nullable ResourceTypeRegistrationPropertiesIdentityManagementArgs identityManagement) {
            this.identityManagement = Input.ofNullable(identityManagement);
            return this;
        }

        public Builder setIsPureProxy(@Nullable Input<Boolean> isPureProxy) {
            this.isPureProxy = isPureProxy;
            return this;
        }

        public Builder setIsPureProxy(@Nullable Boolean isPureProxy) {
            this.isPureProxy = Input.ofNullable(isPureProxy);
            return this;
        }

        public Builder setLinkedAccessChecks(@Nullable Input<List<LinkedAccessCheckArgs>> linkedAccessChecks) {
            this.linkedAccessChecks = linkedAccessChecks;
            return this;
        }

        public Builder setLinkedAccessChecks(@Nullable List<LinkedAccessCheckArgs> linkedAccessChecks) {
            this.linkedAccessChecks = Input.ofNullable(linkedAccessChecks);
            return this;
        }

        public Builder setLoggingRules(@Nullable Input<List<LoggingRuleArgs>> loggingRules) {
            this.loggingRules = loggingRules;
            return this;
        }

        public Builder setLoggingRules(@Nullable List<LoggingRuleArgs> loggingRules) {
            this.loggingRules = Input.ofNullable(loggingRules);
            return this;
        }

        public Builder setMarketplaceType(@Nullable Input<String> marketplaceType) {
            this.marketplaceType = marketplaceType;
            return this;
        }

        public Builder setMarketplaceType(@Nullable String marketplaceType) {
            this.marketplaceType = Input.ofNullable(marketplaceType);
            return this;
        }

        public Builder setProvisioningState(@Nullable Input<Either<String,ProvisioningState>> provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }

        public Builder setProvisioningState(@Nullable Either<String,ProvisioningState> provisioningState) {
            this.provisioningState = Input.ofNullable(provisioningState);
            return this;
        }

        public Builder setRegionality(@Nullable Input<Either<String,Regionality>> regionality) {
            this.regionality = regionality;
            return this;
        }

        public Builder setRegionality(@Nullable Either<String,Regionality> regionality) {
            this.regionality = Input.ofNullable(regionality);
            return this;
        }

        public Builder setRequestHeaderOptions(@Nullable Input<ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs> requestHeaderOptions) {
            this.requestHeaderOptions = requestHeaderOptions;
            return this;
        }

        public Builder setRequestHeaderOptions(@Nullable ResourceTypeRegistrationPropertiesRequestHeaderOptionsArgs requestHeaderOptions) {
            this.requestHeaderOptions = Input.ofNullable(requestHeaderOptions);
            return this;
        }

        public Builder setRequiredFeatures(@Nullable Input<List<String>> requiredFeatures) {
            this.requiredFeatures = requiredFeatures;
            return this;
        }

        public Builder setRequiredFeatures(@Nullable List<String> requiredFeatures) {
            this.requiredFeatures = Input.ofNullable(requiredFeatures);
            return this;
        }

        public Builder setResourceDeletionPolicy(@Nullable Input<Either<String,ResourceDeletionPolicy>> resourceDeletionPolicy) {
            this.resourceDeletionPolicy = resourceDeletionPolicy;
            return this;
        }

        public Builder setResourceDeletionPolicy(@Nullable Either<String,ResourceDeletionPolicy> resourceDeletionPolicy) {
            this.resourceDeletionPolicy = Input.ofNullable(resourceDeletionPolicy);
            return this;
        }

        public Builder setResourceMovePolicy(@Nullable Input<ResourceTypeRegistrationPropertiesResourceMovePolicyArgs> resourceMovePolicy) {
            this.resourceMovePolicy = resourceMovePolicy;
            return this;
        }

        public Builder setResourceMovePolicy(@Nullable ResourceTypeRegistrationPropertiesResourceMovePolicyArgs resourceMovePolicy) {
            this.resourceMovePolicy = Input.ofNullable(resourceMovePolicy);
            return this;
        }

        public Builder setRoutingType(@Nullable Input<Either<String,RoutingType>> routingType) {
            this.routingType = routingType;
            return this;
        }

        public Builder setRoutingType(@Nullable Either<String,RoutingType> routingType) {
            this.routingType = Input.ofNullable(routingType);
            return this;
        }

        public Builder setServiceTreeInfos(@Nullable Input<List<ServiceTreeInfoArgs>> serviceTreeInfos) {
            this.serviceTreeInfos = serviceTreeInfos;
            return this;
        }

        public Builder setServiceTreeInfos(@Nullable List<ServiceTreeInfoArgs> serviceTreeInfos) {
            this.serviceTreeInfos = Input.ofNullable(serviceTreeInfos);
            return this;
        }

        public Builder setSubscriptionLifecycleNotificationSpecifications(@Nullable Input<ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs> subscriptionLifecycleNotificationSpecifications) {
            this.subscriptionLifecycleNotificationSpecifications = subscriptionLifecycleNotificationSpecifications;
            return this;
        }

        public Builder setSubscriptionLifecycleNotificationSpecifications(@Nullable ResourceTypeRegistrationPropertiesSubscriptionLifecycleNotificationSpecificationsArgs subscriptionLifecycleNotificationSpecifications) {
            this.subscriptionLifecycleNotificationSpecifications = Input.ofNullable(subscriptionLifecycleNotificationSpecifications);
            return this;
        }

        public Builder setSubscriptionStateRules(@Nullable Input<List<SubscriptionStateRuleArgs>> subscriptionStateRules) {
            this.subscriptionStateRules = subscriptionStateRules;
            return this;
        }

        public Builder setSubscriptionStateRules(@Nullable List<SubscriptionStateRuleArgs> subscriptionStateRules) {
            this.subscriptionStateRules = Input.ofNullable(subscriptionStateRules);
            return this;
        }

        public Builder setSwaggerSpecifications(@Nullable Input<List<SwaggerSpecificationArgs>> swaggerSpecifications) {
            this.swaggerSpecifications = swaggerSpecifications;
            return this;
        }

        public Builder setSwaggerSpecifications(@Nullable List<SwaggerSpecificationArgs> swaggerSpecifications) {
            this.swaggerSpecifications = Input.ofNullable(swaggerSpecifications);
            return this;
        }

        public Builder setTemplateDeploymentOptions(@Nullable Input<ResourceTypeRegistrationPropertiesTemplateDeploymentOptionsArgs> templateDeploymentOptions) {
            this.templateDeploymentOptions = templateDeploymentOptions;
            return this;
        }

        public Builder setTemplateDeploymentOptions(@Nullable ResourceTypeRegistrationPropertiesTemplateDeploymentOptionsArgs templateDeploymentOptions) {
            this.templateDeploymentOptions = Input.ofNullable(templateDeploymentOptions);
            return this;
        }

        public Builder setThrottlingRules(@Nullable Input<List<ThrottlingRuleArgs>> throttlingRules) {
            this.throttlingRules = throttlingRules;
            return this;
        }

        public Builder setThrottlingRules(@Nullable List<ThrottlingRuleArgs> throttlingRules) {
            this.throttlingRules = Input.ofNullable(throttlingRules);
            return this;
        }
        public ResourceTypeRegistrationPropertiesArgs build() {
            return new ResourceTypeRegistrationPropertiesArgs(allowedUnauthorizedActions, authorizationActionMappings, checkNameAvailabilitySpecifications, defaultApiVersion, disallowedActionVerbs, enableAsyncOperation, enableThirdPartyS2S, endpoints, extendedLocations, extensionOptions, featuresRule, identityManagement, isPureProxy, linkedAccessChecks, loggingRules, marketplaceType, provisioningState, regionality, requestHeaderOptions, requiredFeatures, resourceDeletionPolicy, resourceMovePolicy, routingType, serviceTreeInfos, subscriptionLifecycleNotificationSpecifications, subscriptionStateRules, swaggerSpecifications, templateDeploymentOptions, throttlingRules);
        }
    }
}
