// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.outputs;

import io.pulumi.azurenative.providerhub.outputs.AuthorizationActionMappingResponse;
import io.pulumi.azurenative.providerhub.outputs.ExtendedLocationOptionsResponse;
import io.pulumi.azurenative.providerhub.outputs.LinkedAccessCheckResponse;
import io.pulumi.azurenative.providerhub.outputs.LoggingRuleResponse;
import io.pulumi.azurenative.providerhub.outputs.ResourceTypeEndpointResponse;
import io.pulumi.azurenative.providerhub.outputs.ResourceTypeRegistrationPropertiesResponseCheckNameAvailabilitySpecifications;
import io.pulumi.azurenative.providerhub.outputs.ResourceTypeRegistrationPropertiesResponseExtensionOptions;
import io.pulumi.azurenative.providerhub.outputs.ResourceTypeRegistrationPropertiesResponseFeaturesRule;
import io.pulumi.azurenative.providerhub.outputs.ResourceTypeRegistrationPropertiesResponseIdentityManagement;
import io.pulumi.azurenative.providerhub.outputs.ResourceTypeRegistrationPropertiesResponseRequestHeaderOptions;
import io.pulumi.azurenative.providerhub.outputs.ResourceTypeRegistrationPropertiesResponseResourceMovePolicy;
import io.pulumi.azurenative.providerhub.outputs.ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications;
import io.pulumi.azurenative.providerhub.outputs.ResourceTypeRegistrationPropertiesResponseTemplateDeploymentOptions;
import io.pulumi.azurenative.providerhub.outputs.ServiceTreeInfoResponse;
import io.pulumi.azurenative.providerhub.outputs.SubscriptionStateRuleResponse;
import io.pulumi.azurenative.providerhub.outputs.SwaggerSpecificationResponse;
import io.pulumi.azurenative.providerhub.outputs.ThrottlingRuleResponse;
import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ResourceTypeRegistrationResponseProperties {
    private final @Nullable List<String> allowedUnauthorizedActions;
    private final @Nullable List<AuthorizationActionMappingResponse> authorizationActionMappings;
    private final @Nullable ResourceTypeRegistrationPropertiesResponseCheckNameAvailabilitySpecifications checkNameAvailabilitySpecifications;
    private final @Nullable String defaultApiVersion;
    private final @Nullable List<String> disallowedActionVerbs;
    private final @Nullable Boolean enableAsyncOperation;
    private final @Nullable Boolean enableThirdPartyS2S;
    private final @Nullable List<ResourceTypeEndpointResponse> endpoints;
    private final @Nullable List<ExtendedLocationOptionsResponse> extendedLocations;
    private final @Nullable ResourceTypeRegistrationPropertiesResponseExtensionOptions extensionOptions;
    private final @Nullable ResourceTypeRegistrationPropertiesResponseFeaturesRule featuresRule;
    private final @Nullable ResourceTypeRegistrationPropertiesResponseIdentityManagement identityManagement;
    private final @Nullable Boolean isPureProxy;
    private final @Nullable List<LinkedAccessCheckResponse> linkedAccessChecks;
    private final @Nullable List<LoggingRuleResponse> loggingRules;
    private final @Nullable String marketplaceType;
    private final @Nullable String provisioningState;
    private final @Nullable String regionality;
    private final @Nullable ResourceTypeRegistrationPropertiesResponseRequestHeaderOptions requestHeaderOptions;
    private final @Nullable List<String> requiredFeatures;
    private final @Nullable String resourceDeletionPolicy;
    private final @Nullable ResourceTypeRegistrationPropertiesResponseResourceMovePolicy resourceMovePolicy;
    private final @Nullable String routingType;
    private final @Nullable List<ServiceTreeInfoResponse> serviceTreeInfos;
    private final @Nullable ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications subscriptionLifecycleNotificationSpecifications;
    private final @Nullable List<SubscriptionStateRuleResponse> subscriptionStateRules;
    private final @Nullable List<SwaggerSpecificationResponse> swaggerSpecifications;
    private final @Nullable ResourceTypeRegistrationPropertiesResponseTemplateDeploymentOptions templateDeploymentOptions;
    private final @Nullable List<ThrottlingRuleResponse> throttlingRules;

    @CustomType.Constructor
    private ResourceTypeRegistrationResponseProperties(
        @CustomType.Parameter("allowedUnauthorizedActions") @Nullable List<String> allowedUnauthorizedActions,
        @CustomType.Parameter("authorizationActionMappings") @Nullable List<AuthorizationActionMappingResponse> authorizationActionMappings,
        @CustomType.Parameter("checkNameAvailabilitySpecifications") @Nullable ResourceTypeRegistrationPropertiesResponseCheckNameAvailabilitySpecifications checkNameAvailabilitySpecifications,
        @CustomType.Parameter("defaultApiVersion") @Nullable String defaultApiVersion,
        @CustomType.Parameter("disallowedActionVerbs") @Nullable List<String> disallowedActionVerbs,
        @CustomType.Parameter("enableAsyncOperation") @Nullable Boolean enableAsyncOperation,
        @CustomType.Parameter("enableThirdPartyS2S") @Nullable Boolean enableThirdPartyS2S,
        @CustomType.Parameter("endpoints") @Nullable List<ResourceTypeEndpointResponse> endpoints,
        @CustomType.Parameter("extendedLocations") @Nullable List<ExtendedLocationOptionsResponse> extendedLocations,
        @CustomType.Parameter("extensionOptions") @Nullable ResourceTypeRegistrationPropertiesResponseExtensionOptions extensionOptions,
        @CustomType.Parameter("featuresRule") @Nullable ResourceTypeRegistrationPropertiesResponseFeaturesRule featuresRule,
        @CustomType.Parameter("identityManagement") @Nullable ResourceTypeRegistrationPropertiesResponseIdentityManagement identityManagement,
        @CustomType.Parameter("isPureProxy") @Nullable Boolean isPureProxy,
        @CustomType.Parameter("linkedAccessChecks") @Nullable List<LinkedAccessCheckResponse> linkedAccessChecks,
        @CustomType.Parameter("loggingRules") @Nullable List<LoggingRuleResponse> loggingRules,
        @CustomType.Parameter("marketplaceType") @Nullable String marketplaceType,
        @CustomType.Parameter("provisioningState") @Nullable String provisioningState,
        @CustomType.Parameter("regionality") @Nullable String regionality,
        @CustomType.Parameter("requestHeaderOptions") @Nullable ResourceTypeRegistrationPropertiesResponseRequestHeaderOptions requestHeaderOptions,
        @CustomType.Parameter("requiredFeatures") @Nullable List<String> requiredFeatures,
        @CustomType.Parameter("resourceDeletionPolicy") @Nullable String resourceDeletionPolicy,
        @CustomType.Parameter("resourceMovePolicy") @Nullable ResourceTypeRegistrationPropertiesResponseResourceMovePolicy resourceMovePolicy,
        @CustomType.Parameter("routingType") @Nullable String routingType,
        @CustomType.Parameter("serviceTreeInfos") @Nullable List<ServiceTreeInfoResponse> serviceTreeInfos,
        @CustomType.Parameter("subscriptionLifecycleNotificationSpecifications") @Nullable ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications subscriptionLifecycleNotificationSpecifications,
        @CustomType.Parameter("subscriptionStateRules") @Nullable List<SubscriptionStateRuleResponse> subscriptionStateRules,
        @CustomType.Parameter("swaggerSpecifications") @Nullable List<SwaggerSpecificationResponse> swaggerSpecifications,
        @CustomType.Parameter("templateDeploymentOptions") @Nullable ResourceTypeRegistrationPropertiesResponseTemplateDeploymentOptions templateDeploymentOptions,
        @CustomType.Parameter("throttlingRules") @Nullable List<ThrottlingRuleResponse> throttlingRules) {
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

    public List<String> getAllowedUnauthorizedActions() {
        return this.allowedUnauthorizedActions == null ? List.of() : this.allowedUnauthorizedActions;
    }
    public List<AuthorizationActionMappingResponse> getAuthorizationActionMappings() {
        return this.authorizationActionMappings == null ? List.of() : this.authorizationActionMappings;
    }
    public Optional<ResourceTypeRegistrationPropertiesResponseCheckNameAvailabilitySpecifications> getCheckNameAvailabilitySpecifications() {
        return Optional.ofNullable(this.checkNameAvailabilitySpecifications);
    }
    public Optional<String> getDefaultApiVersion() {
        return Optional.ofNullable(this.defaultApiVersion);
    }
    public List<String> getDisallowedActionVerbs() {
        return this.disallowedActionVerbs == null ? List.of() : this.disallowedActionVerbs;
    }
    public Optional<Boolean> getEnableAsyncOperation() {
        return Optional.ofNullable(this.enableAsyncOperation);
    }
    public Optional<Boolean> getEnableThirdPartyS2S() {
        return Optional.ofNullable(this.enableThirdPartyS2S);
    }
    public List<ResourceTypeEndpointResponse> getEndpoints() {
        return this.endpoints == null ? List.of() : this.endpoints;
    }
    public List<ExtendedLocationOptionsResponse> getExtendedLocations() {
        return this.extendedLocations == null ? List.of() : this.extendedLocations;
    }
    public Optional<ResourceTypeRegistrationPropertiesResponseExtensionOptions> getExtensionOptions() {
        return Optional.ofNullable(this.extensionOptions);
    }
    public Optional<ResourceTypeRegistrationPropertiesResponseFeaturesRule> getFeaturesRule() {
        return Optional.ofNullable(this.featuresRule);
    }
    public Optional<ResourceTypeRegistrationPropertiesResponseIdentityManagement> getIdentityManagement() {
        return Optional.ofNullable(this.identityManagement);
    }
    public Optional<Boolean> getIsPureProxy() {
        return Optional.ofNullable(this.isPureProxy);
    }
    public List<LinkedAccessCheckResponse> getLinkedAccessChecks() {
        return this.linkedAccessChecks == null ? List.of() : this.linkedAccessChecks;
    }
    public List<LoggingRuleResponse> getLoggingRules() {
        return this.loggingRules == null ? List.of() : this.loggingRules;
    }
    public Optional<String> getMarketplaceType() {
        return Optional.ofNullable(this.marketplaceType);
    }
    public Optional<String> getProvisioningState() {
        return Optional.ofNullable(this.provisioningState);
    }
    public Optional<String> getRegionality() {
        return Optional.ofNullable(this.regionality);
    }
    public Optional<ResourceTypeRegistrationPropertiesResponseRequestHeaderOptions> getRequestHeaderOptions() {
        return Optional.ofNullable(this.requestHeaderOptions);
    }
    public List<String> getRequiredFeatures() {
        return this.requiredFeatures == null ? List.of() : this.requiredFeatures;
    }
    public Optional<String> getResourceDeletionPolicy() {
        return Optional.ofNullable(this.resourceDeletionPolicy);
    }
    public Optional<ResourceTypeRegistrationPropertiesResponseResourceMovePolicy> getResourceMovePolicy() {
        return Optional.ofNullable(this.resourceMovePolicy);
    }
    public Optional<String> getRoutingType() {
        return Optional.ofNullable(this.routingType);
    }
    public List<ServiceTreeInfoResponse> getServiceTreeInfos() {
        return this.serviceTreeInfos == null ? List.of() : this.serviceTreeInfos;
    }
    public Optional<ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications> getSubscriptionLifecycleNotificationSpecifications() {
        return Optional.ofNullable(this.subscriptionLifecycleNotificationSpecifications);
    }
    public List<SubscriptionStateRuleResponse> getSubscriptionStateRules() {
        return this.subscriptionStateRules == null ? List.of() : this.subscriptionStateRules;
    }
    public List<SwaggerSpecificationResponse> getSwaggerSpecifications() {
        return this.swaggerSpecifications == null ? List.of() : this.swaggerSpecifications;
    }
    public Optional<ResourceTypeRegistrationPropertiesResponseTemplateDeploymentOptions> getTemplateDeploymentOptions() {
        return Optional.ofNullable(this.templateDeploymentOptions);
    }
    public List<ThrottlingRuleResponse> getThrottlingRules() {
        return this.throttlingRules == null ? List.of() : this.throttlingRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ResourceTypeRegistrationResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> allowedUnauthorizedActions;
        private @Nullable List<AuthorizationActionMappingResponse> authorizationActionMappings;
        private @Nullable ResourceTypeRegistrationPropertiesResponseCheckNameAvailabilitySpecifications checkNameAvailabilitySpecifications;
        private @Nullable String defaultApiVersion;
        private @Nullable List<String> disallowedActionVerbs;
        private @Nullable Boolean enableAsyncOperation;
        private @Nullable Boolean enableThirdPartyS2S;
        private @Nullable List<ResourceTypeEndpointResponse> endpoints;
        private @Nullable List<ExtendedLocationOptionsResponse> extendedLocations;
        private @Nullable ResourceTypeRegistrationPropertiesResponseExtensionOptions extensionOptions;
        private @Nullable ResourceTypeRegistrationPropertiesResponseFeaturesRule featuresRule;
        private @Nullable ResourceTypeRegistrationPropertiesResponseIdentityManagement identityManagement;
        private @Nullable Boolean isPureProxy;
        private @Nullable List<LinkedAccessCheckResponse> linkedAccessChecks;
        private @Nullable List<LoggingRuleResponse> loggingRules;
        private @Nullable String marketplaceType;
        private @Nullable String provisioningState;
        private @Nullable String regionality;
        private @Nullable ResourceTypeRegistrationPropertiesResponseRequestHeaderOptions requestHeaderOptions;
        private @Nullable List<String> requiredFeatures;
        private @Nullable String resourceDeletionPolicy;
        private @Nullable ResourceTypeRegistrationPropertiesResponseResourceMovePolicy resourceMovePolicy;
        private @Nullable String routingType;
        private @Nullable List<ServiceTreeInfoResponse> serviceTreeInfos;
        private @Nullable ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications subscriptionLifecycleNotificationSpecifications;
        private @Nullable List<SubscriptionStateRuleResponse> subscriptionStateRules;
        private @Nullable List<SwaggerSpecificationResponse> swaggerSpecifications;
        private @Nullable ResourceTypeRegistrationPropertiesResponseTemplateDeploymentOptions templateDeploymentOptions;
        private @Nullable List<ThrottlingRuleResponse> throttlingRules;

        public Builder() {
    	      // Empty
        }

        public Builder(ResourceTypeRegistrationResponseProperties defaults) {
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

        public Builder allowedUnauthorizedActions(@Nullable List<String> allowedUnauthorizedActions) {
            this.allowedUnauthorizedActions = allowedUnauthorizedActions;
            return this;
        }
        public Builder allowedUnauthorizedActions(String... allowedUnauthorizedActions) {
            return allowedUnauthorizedActions(List.of(allowedUnauthorizedActions));
        }
        public Builder authorizationActionMappings(@Nullable List<AuthorizationActionMappingResponse> authorizationActionMappings) {
            this.authorizationActionMappings = authorizationActionMappings;
            return this;
        }
        public Builder authorizationActionMappings(AuthorizationActionMappingResponse... authorizationActionMappings) {
            return authorizationActionMappings(List.of(authorizationActionMappings));
        }
        public Builder checkNameAvailabilitySpecifications(@Nullable ResourceTypeRegistrationPropertiesResponseCheckNameAvailabilitySpecifications checkNameAvailabilitySpecifications) {
            this.checkNameAvailabilitySpecifications = checkNameAvailabilitySpecifications;
            return this;
        }
        public Builder defaultApiVersion(@Nullable String defaultApiVersion) {
            this.defaultApiVersion = defaultApiVersion;
            return this;
        }
        public Builder disallowedActionVerbs(@Nullable List<String> disallowedActionVerbs) {
            this.disallowedActionVerbs = disallowedActionVerbs;
            return this;
        }
        public Builder disallowedActionVerbs(String... disallowedActionVerbs) {
            return disallowedActionVerbs(List.of(disallowedActionVerbs));
        }
        public Builder enableAsyncOperation(@Nullable Boolean enableAsyncOperation) {
            this.enableAsyncOperation = enableAsyncOperation;
            return this;
        }
        public Builder enableThirdPartyS2S(@Nullable Boolean enableThirdPartyS2S) {
            this.enableThirdPartyS2S = enableThirdPartyS2S;
            return this;
        }
        public Builder endpoints(@Nullable List<ResourceTypeEndpointResponse> endpoints) {
            this.endpoints = endpoints;
            return this;
        }
        public Builder endpoints(ResourceTypeEndpointResponse... endpoints) {
            return endpoints(List.of(endpoints));
        }
        public Builder extendedLocations(@Nullable List<ExtendedLocationOptionsResponse> extendedLocations) {
            this.extendedLocations = extendedLocations;
            return this;
        }
        public Builder extendedLocations(ExtendedLocationOptionsResponse... extendedLocations) {
            return extendedLocations(List.of(extendedLocations));
        }
        public Builder extensionOptions(@Nullable ResourceTypeRegistrationPropertiesResponseExtensionOptions extensionOptions) {
            this.extensionOptions = extensionOptions;
            return this;
        }
        public Builder featuresRule(@Nullable ResourceTypeRegistrationPropertiesResponseFeaturesRule featuresRule) {
            this.featuresRule = featuresRule;
            return this;
        }
        public Builder identityManagement(@Nullable ResourceTypeRegistrationPropertiesResponseIdentityManagement identityManagement) {
            this.identityManagement = identityManagement;
            return this;
        }
        public Builder isPureProxy(@Nullable Boolean isPureProxy) {
            this.isPureProxy = isPureProxy;
            return this;
        }
        public Builder linkedAccessChecks(@Nullable List<LinkedAccessCheckResponse> linkedAccessChecks) {
            this.linkedAccessChecks = linkedAccessChecks;
            return this;
        }
        public Builder linkedAccessChecks(LinkedAccessCheckResponse... linkedAccessChecks) {
            return linkedAccessChecks(List.of(linkedAccessChecks));
        }
        public Builder loggingRules(@Nullable List<LoggingRuleResponse> loggingRules) {
            this.loggingRules = loggingRules;
            return this;
        }
        public Builder loggingRules(LoggingRuleResponse... loggingRules) {
            return loggingRules(List.of(loggingRules));
        }
        public Builder marketplaceType(@Nullable String marketplaceType) {
            this.marketplaceType = marketplaceType;
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder regionality(@Nullable String regionality) {
            this.regionality = regionality;
            return this;
        }
        public Builder requestHeaderOptions(@Nullable ResourceTypeRegistrationPropertiesResponseRequestHeaderOptions requestHeaderOptions) {
            this.requestHeaderOptions = requestHeaderOptions;
            return this;
        }
        public Builder requiredFeatures(@Nullable List<String> requiredFeatures) {
            this.requiredFeatures = requiredFeatures;
            return this;
        }
        public Builder requiredFeatures(String... requiredFeatures) {
            return requiredFeatures(List.of(requiredFeatures));
        }
        public Builder resourceDeletionPolicy(@Nullable String resourceDeletionPolicy) {
            this.resourceDeletionPolicy = resourceDeletionPolicy;
            return this;
        }
        public Builder resourceMovePolicy(@Nullable ResourceTypeRegistrationPropertiesResponseResourceMovePolicy resourceMovePolicy) {
            this.resourceMovePolicy = resourceMovePolicy;
            return this;
        }
        public Builder routingType(@Nullable String routingType) {
            this.routingType = routingType;
            return this;
        }
        public Builder serviceTreeInfos(@Nullable List<ServiceTreeInfoResponse> serviceTreeInfos) {
            this.serviceTreeInfos = serviceTreeInfos;
            return this;
        }
        public Builder serviceTreeInfos(ServiceTreeInfoResponse... serviceTreeInfos) {
            return serviceTreeInfos(List.of(serviceTreeInfos));
        }
        public Builder subscriptionLifecycleNotificationSpecifications(@Nullable ResourceTypeRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications subscriptionLifecycleNotificationSpecifications) {
            this.subscriptionLifecycleNotificationSpecifications = subscriptionLifecycleNotificationSpecifications;
            return this;
        }
        public Builder subscriptionStateRules(@Nullable List<SubscriptionStateRuleResponse> subscriptionStateRules) {
            this.subscriptionStateRules = subscriptionStateRules;
            return this;
        }
        public Builder subscriptionStateRules(SubscriptionStateRuleResponse... subscriptionStateRules) {
            return subscriptionStateRules(List.of(subscriptionStateRules));
        }
        public Builder swaggerSpecifications(@Nullable List<SwaggerSpecificationResponse> swaggerSpecifications) {
            this.swaggerSpecifications = swaggerSpecifications;
            return this;
        }
        public Builder swaggerSpecifications(SwaggerSpecificationResponse... swaggerSpecifications) {
            return swaggerSpecifications(List.of(swaggerSpecifications));
        }
        public Builder templateDeploymentOptions(@Nullable ResourceTypeRegistrationPropertiesResponseTemplateDeploymentOptions templateDeploymentOptions) {
            this.templateDeploymentOptions = templateDeploymentOptions;
            return this;
        }
        public Builder throttlingRules(@Nullable List<ThrottlingRuleResponse> throttlingRules) {
            this.throttlingRules = throttlingRules;
            return this;
        }
        public Builder throttlingRules(ThrottlingRuleResponse... throttlingRules) {
            return throttlingRules(List.of(throttlingRules));
        }        public ResourceTypeRegistrationResponseProperties build() {
            return new ResourceTypeRegistrationResponseProperties(allowedUnauthorizedActions, authorizationActionMappings, checkNameAvailabilitySpecifications, defaultApiVersion, disallowedActionVerbs, enableAsyncOperation, enableThirdPartyS2S, endpoints, extendedLocations, extensionOptions, featuresRule, identityManagement, isPureProxy, linkedAccessChecks, loggingRules, marketplaceType, provisioningState, regionality, requestHeaderOptions, requiredFeatures, resourceDeletionPolicy, resourceMovePolicy, routingType, serviceTreeInfos, subscriptionLifecycleNotificationSpecifications, subscriptionStateRules, swaggerSpecifications, templateDeploymentOptions, throttlingRules);
        }
    }
}
