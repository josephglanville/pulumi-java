// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.providerhub.inputs;

import io.pulumi.azurenative.providerhub.inputs.ProviderRegistrationPropertiesResponseProviderHubMetadata;
import io.pulumi.azurenative.providerhub.inputs.ProviderRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications;
import io.pulumi.azurenative.providerhub.inputs.ResourceProviderAuthorizationResponse;
import io.pulumi.azurenative.providerhub.inputs.ResourceProviderCapabilitiesResponse;
import io.pulumi.azurenative.providerhub.inputs.ResourceProviderManifestPropertiesResponseFeaturesRule;
import io.pulumi.azurenative.providerhub.inputs.ResourceProviderManifestPropertiesResponseManagement;
import io.pulumi.azurenative.providerhub.inputs.ResourceProviderManifestPropertiesResponseProviderAuthentication;
import io.pulumi.azurenative.providerhub.inputs.ResourceProviderManifestPropertiesResponseRequestHeaderOptions;
import io.pulumi.azurenative.providerhub.inputs.ResourceProviderManifestPropertiesResponseTemplateDeploymentOptions;
import io.pulumi.core.annotations.Import;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ProviderRegistrationResponseProperties extends io.pulumi.resources.InvokeArgs {

    public static final ProviderRegistrationResponseProperties Empty = new ProviderRegistrationResponseProperties();

    @Import(name="capabilities")
      private final @Nullable List<ResourceProviderCapabilitiesResponse> capabilities;

    public List<ResourceProviderCapabilitiesResponse> getCapabilities() {
        return this.capabilities == null ? List.of() : this.capabilities;
    }

    @Import(name="featuresRule")
      private final @Nullable ResourceProviderManifestPropertiesResponseFeaturesRule featuresRule;

    public Optional<ResourceProviderManifestPropertiesResponseFeaturesRule> getFeaturesRule() {
        return this.featuresRule == null ? Optional.empty() : Optional.ofNullable(this.featuresRule);
    }

    @Import(name="management")
      private final @Nullable ResourceProviderManifestPropertiesResponseManagement management;

    public Optional<ResourceProviderManifestPropertiesResponseManagement> getManagement() {
        return this.management == null ? Optional.empty() : Optional.ofNullable(this.management);
    }

    @Import(name="metadata")
      private final @Nullable Object metadata;

    public Optional<Object> getMetadata() {
        return this.metadata == null ? Optional.empty() : Optional.ofNullable(this.metadata);
    }

    @Import(name="namespace")
      private final @Nullable String namespace;

    public Optional<String> getNamespace() {
        return this.namespace == null ? Optional.empty() : Optional.ofNullable(this.namespace);
    }

    @Import(name="providerAuthentication")
      private final @Nullable ResourceProviderManifestPropertiesResponseProviderAuthentication providerAuthentication;

    public Optional<ResourceProviderManifestPropertiesResponseProviderAuthentication> getProviderAuthentication() {
        return this.providerAuthentication == null ? Optional.empty() : Optional.ofNullable(this.providerAuthentication);
    }

    @Import(name="providerAuthorizations")
      private final @Nullable List<ResourceProviderAuthorizationResponse> providerAuthorizations;

    public List<ResourceProviderAuthorizationResponse> getProviderAuthorizations() {
        return this.providerAuthorizations == null ? List.of() : this.providerAuthorizations;
    }

    @Import(name="providerHubMetadata")
      private final @Nullable ProviderRegistrationPropertiesResponseProviderHubMetadata providerHubMetadata;

    public Optional<ProviderRegistrationPropertiesResponseProviderHubMetadata> getProviderHubMetadata() {
        return this.providerHubMetadata == null ? Optional.empty() : Optional.ofNullable(this.providerHubMetadata);
    }

    @Import(name="providerType")
      private final @Nullable String providerType;

    public Optional<String> getProviderType() {
        return this.providerType == null ? Optional.empty() : Optional.ofNullable(this.providerType);
    }

    @Import(name="providerVersion")
      private final @Nullable String providerVersion;

    public Optional<String> getProviderVersion() {
        return this.providerVersion == null ? Optional.empty() : Optional.ofNullable(this.providerVersion);
    }

    @Import(name="provisioningState")
      private final @Nullable String provisioningState;

    public Optional<String> getProvisioningState() {
        return this.provisioningState == null ? Optional.empty() : Optional.ofNullable(this.provisioningState);
    }

    @Import(name="requestHeaderOptions")
      private final @Nullable ResourceProviderManifestPropertiesResponseRequestHeaderOptions requestHeaderOptions;

    public Optional<ResourceProviderManifestPropertiesResponseRequestHeaderOptions> getRequestHeaderOptions() {
        return this.requestHeaderOptions == null ? Optional.empty() : Optional.ofNullable(this.requestHeaderOptions);
    }

    @Import(name="requiredFeatures")
      private final @Nullable List<String> requiredFeatures;

    public List<String> getRequiredFeatures() {
        return this.requiredFeatures == null ? List.of() : this.requiredFeatures;
    }

    @Import(name="subscriptionLifecycleNotificationSpecifications")
      private final @Nullable ProviderRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications subscriptionLifecycleNotificationSpecifications;

    public Optional<ProviderRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications> getSubscriptionLifecycleNotificationSpecifications() {
        return this.subscriptionLifecycleNotificationSpecifications == null ? Optional.empty() : Optional.ofNullable(this.subscriptionLifecycleNotificationSpecifications);
    }

    @Import(name="templateDeploymentOptions")
      private final @Nullable ResourceProviderManifestPropertiesResponseTemplateDeploymentOptions templateDeploymentOptions;

    public Optional<ResourceProviderManifestPropertiesResponseTemplateDeploymentOptions> getTemplateDeploymentOptions() {
        return this.templateDeploymentOptions == null ? Optional.empty() : Optional.ofNullable(this.templateDeploymentOptions);
    }

    public ProviderRegistrationResponseProperties(
        @Nullable List<ResourceProviderCapabilitiesResponse> capabilities,
        @Nullable ResourceProviderManifestPropertiesResponseFeaturesRule featuresRule,
        @Nullable ResourceProviderManifestPropertiesResponseManagement management,
        @Nullable Object metadata,
        @Nullable String namespace,
        @Nullable ResourceProviderManifestPropertiesResponseProviderAuthentication providerAuthentication,
        @Nullable List<ResourceProviderAuthorizationResponse> providerAuthorizations,
        @Nullable ProviderRegistrationPropertiesResponseProviderHubMetadata providerHubMetadata,
        @Nullable String providerType,
        @Nullable String providerVersion,
        @Nullable String provisioningState,
        @Nullable ResourceProviderManifestPropertiesResponseRequestHeaderOptions requestHeaderOptions,
        @Nullable List<String> requiredFeatures,
        @Nullable ProviderRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications subscriptionLifecycleNotificationSpecifications,
        @Nullable ResourceProviderManifestPropertiesResponseTemplateDeploymentOptions templateDeploymentOptions) {
        this.capabilities = capabilities;
        this.featuresRule = featuresRule;
        this.management = management;
        this.metadata = metadata;
        this.namespace = namespace;
        this.providerAuthentication = providerAuthentication;
        this.providerAuthorizations = providerAuthorizations;
        this.providerHubMetadata = providerHubMetadata;
        this.providerType = providerType;
        this.providerVersion = providerVersion;
        this.provisioningState = provisioningState;
        this.requestHeaderOptions = requestHeaderOptions;
        this.requiredFeatures = requiredFeatures;
        this.subscriptionLifecycleNotificationSpecifications = subscriptionLifecycleNotificationSpecifications;
        this.templateDeploymentOptions = templateDeploymentOptions;
    }

    private ProviderRegistrationResponseProperties() {
        this.capabilities = List.of();
        this.featuresRule = null;
        this.management = null;
        this.metadata = null;
        this.namespace = null;
        this.providerAuthentication = null;
        this.providerAuthorizations = List.of();
        this.providerHubMetadata = null;
        this.providerType = null;
        this.providerVersion = null;
        this.provisioningState = null;
        this.requestHeaderOptions = null;
        this.requiredFeatures = List.of();
        this.subscriptionLifecycleNotificationSpecifications = null;
        this.templateDeploymentOptions = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProviderRegistrationResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<ResourceProviderCapabilitiesResponse> capabilities;
        private @Nullable ResourceProviderManifestPropertiesResponseFeaturesRule featuresRule;
        private @Nullable ResourceProviderManifestPropertiesResponseManagement management;
        private @Nullable Object metadata;
        private @Nullable String namespace;
        private @Nullable ResourceProviderManifestPropertiesResponseProviderAuthentication providerAuthentication;
        private @Nullable List<ResourceProviderAuthorizationResponse> providerAuthorizations;
        private @Nullable ProviderRegistrationPropertiesResponseProviderHubMetadata providerHubMetadata;
        private @Nullable String providerType;
        private @Nullable String providerVersion;
        private @Nullable String provisioningState;
        private @Nullable ResourceProviderManifestPropertiesResponseRequestHeaderOptions requestHeaderOptions;
        private @Nullable List<String> requiredFeatures;
        private @Nullable ProviderRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications subscriptionLifecycleNotificationSpecifications;
        private @Nullable ResourceProviderManifestPropertiesResponseTemplateDeploymentOptions templateDeploymentOptions;

        public Builder() {
    	      // Empty
        }

        public Builder(ProviderRegistrationResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.capabilities = defaults.capabilities;
    	      this.featuresRule = defaults.featuresRule;
    	      this.management = defaults.management;
    	      this.metadata = defaults.metadata;
    	      this.namespace = defaults.namespace;
    	      this.providerAuthentication = defaults.providerAuthentication;
    	      this.providerAuthorizations = defaults.providerAuthorizations;
    	      this.providerHubMetadata = defaults.providerHubMetadata;
    	      this.providerType = defaults.providerType;
    	      this.providerVersion = defaults.providerVersion;
    	      this.provisioningState = defaults.provisioningState;
    	      this.requestHeaderOptions = defaults.requestHeaderOptions;
    	      this.requiredFeatures = defaults.requiredFeatures;
    	      this.subscriptionLifecycleNotificationSpecifications = defaults.subscriptionLifecycleNotificationSpecifications;
    	      this.templateDeploymentOptions = defaults.templateDeploymentOptions;
        }

        public Builder capabilities(@Nullable List<ResourceProviderCapabilitiesResponse> capabilities) {
            this.capabilities = capabilities;
            return this;
        }
        public Builder capabilities(ResourceProviderCapabilitiesResponse... capabilities) {
            return capabilities(List.of(capabilities));
        }
        public Builder featuresRule(@Nullable ResourceProviderManifestPropertiesResponseFeaturesRule featuresRule) {
            this.featuresRule = featuresRule;
            return this;
        }
        public Builder management(@Nullable ResourceProviderManifestPropertiesResponseManagement management) {
            this.management = management;
            return this;
        }
        public Builder metadata(@Nullable Object metadata) {
            this.metadata = metadata;
            return this;
        }
        public Builder namespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }
        public Builder providerAuthentication(@Nullable ResourceProviderManifestPropertiesResponseProviderAuthentication providerAuthentication) {
            this.providerAuthentication = providerAuthentication;
            return this;
        }
        public Builder providerAuthorizations(@Nullable List<ResourceProviderAuthorizationResponse> providerAuthorizations) {
            this.providerAuthorizations = providerAuthorizations;
            return this;
        }
        public Builder providerAuthorizations(ResourceProviderAuthorizationResponse... providerAuthorizations) {
            return providerAuthorizations(List.of(providerAuthorizations));
        }
        public Builder providerHubMetadata(@Nullable ProviderRegistrationPropertiesResponseProviderHubMetadata providerHubMetadata) {
            this.providerHubMetadata = providerHubMetadata;
            return this;
        }
        public Builder providerType(@Nullable String providerType) {
            this.providerType = providerType;
            return this;
        }
        public Builder providerVersion(@Nullable String providerVersion) {
            this.providerVersion = providerVersion;
            return this;
        }
        public Builder provisioningState(@Nullable String provisioningState) {
            this.provisioningState = provisioningState;
            return this;
        }
        public Builder requestHeaderOptions(@Nullable ResourceProviderManifestPropertiesResponseRequestHeaderOptions requestHeaderOptions) {
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
        public Builder subscriptionLifecycleNotificationSpecifications(@Nullable ProviderRegistrationPropertiesResponseSubscriptionLifecycleNotificationSpecifications subscriptionLifecycleNotificationSpecifications) {
            this.subscriptionLifecycleNotificationSpecifications = subscriptionLifecycleNotificationSpecifications;
            return this;
        }
        public Builder templateDeploymentOptions(@Nullable ResourceProviderManifestPropertiesResponseTemplateDeploymentOptions templateDeploymentOptions) {
            this.templateDeploymentOptions = templateDeploymentOptions;
            return this;
        }        public ProviderRegistrationResponseProperties build() {
            return new ProviderRegistrationResponseProperties(capabilities, featuresRule, management, metadata, namespace, providerAuthentication, providerAuthorizations, providerHubMetadata, providerType, providerVersion, provisioningState, requestHeaderOptions, requiredFeatures, subscriptionLifecycleNotificationSpecifications, templateDeploymentOptions);
        }
    }
}
