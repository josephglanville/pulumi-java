// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.features.inputs;

import io.pulumi.azurenative.features.inputs.AuthorizationProfileResponse;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SubscriptionFeatureRegistrationResponseProperties extends io.pulumi.resources.InvokeArgs {

    public static final SubscriptionFeatureRegistrationResponseProperties Empty = new SubscriptionFeatureRegistrationResponseProperties();

    @InputImport(name="approvalType", required=true)
    private final String approvalType;

    public String getApprovalType() {
        return this.approvalType;
    }

    @InputImport(name="authorizationProfile")
    private final @Nullable AuthorizationProfileResponse authorizationProfile;

    public Optional<AuthorizationProfileResponse> getAuthorizationProfile() {
        return this.authorizationProfile == null ? Optional.empty() : Optional.ofNullable(this.authorizationProfile);
    }

    @InputImport(name="description")
    private final @Nullable String description;

    public Optional<String> getDescription() {
        return this.description == null ? Optional.empty() : Optional.ofNullable(this.description);
    }

    @InputImport(name="displayName", required=true)
    private final String displayName;

    public String getDisplayName() {
        return this.displayName;
    }

    @InputImport(name="documentationLink", required=true)
    private final String documentationLink;

    public String getDocumentationLink() {
        return this.documentationLink;
    }

    @InputImport(name="featureName", required=true)
    private final String featureName;

    public String getFeatureName() {
        return this.featureName;
    }

    @InputImport(name="metadata")
    private final @Nullable Map<String,String> metadata;

    public Map<String,String> getMetadata() {
        return this.metadata == null ? Map.of() : this.metadata;
    }

    @InputImport(name="providerNamespace", required=true)
    private final String providerNamespace;

    public String getProviderNamespace() {
        return this.providerNamespace;
    }

    @InputImport(name="registrationDate", required=true)
    private final String registrationDate;

    public String getRegistrationDate() {
        return this.registrationDate;
    }

    @InputImport(name="releaseDate", required=true)
    private final String releaseDate;

    public String getReleaseDate() {
        return this.releaseDate;
    }

    @InputImport(name="shouldFeatureDisplayInPortal")
    private final @Nullable Boolean shouldFeatureDisplayInPortal;

    public Optional<Boolean> getShouldFeatureDisplayInPortal() {
        return this.shouldFeatureDisplayInPortal == null ? Optional.empty() : Optional.ofNullable(this.shouldFeatureDisplayInPortal);
    }

    @InputImport(name="state")
    private final @Nullable String state;

    public Optional<String> getState() {
        return this.state == null ? Optional.empty() : Optional.ofNullable(this.state);
    }

    @InputImport(name="subscriptionId", required=true)
    private final String subscriptionId;

    public String getSubscriptionId() {
        return this.subscriptionId;
    }

    @InputImport(name="tenantId", required=true)
    private final String tenantId;

    public String getTenantId() {
        return this.tenantId;
    }

    public SubscriptionFeatureRegistrationResponseProperties(
        String approvalType,
        @Nullable AuthorizationProfileResponse authorizationProfile,
        @Nullable String description,
        String displayName,
        String documentationLink,
        String featureName,
        @Nullable Map<String,String> metadata,
        String providerNamespace,
        String registrationDate,
        String releaseDate,
        @Nullable Boolean shouldFeatureDisplayInPortal,
        @Nullable String state,
        String subscriptionId,
        String tenantId) {
        this.approvalType = Objects.requireNonNull(approvalType, "expected parameter 'approvalType' to be non-null");
        this.authorizationProfile = authorizationProfile;
        this.description = description;
        this.displayName = Objects.requireNonNull(displayName, "expected parameter 'displayName' to be non-null");
        this.documentationLink = Objects.requireNonNull(documentationLink, "expected parameter 'documentationLink' to be non-null");
        this.featureName = Objects.requireNonNull(featureName, "expected parameter 'featureName' to be non-null");
        this.metadata = metadata;
        this.providerNamespace = Objects.requireNonNull(providerNamespace, "expected parameter 'providerNamespace' to be non-null");
        this.registrationDate = Objects.requireNonNull(registrationDate, "expected parameter 'registrationDate' to be non-null");
        this.releaseDate = Objects.requireNonNull(releaseDate, "expected parameter 'releaseDate' to be non-null");
        this.shouldFeatureDisplayInPortal = shouldFeatureDisplayInPortal == null ? false : shouldFeatureDisplayInPortal;
        this.state = state;
        this.subscriptionId = Objects.requireNonNull(subscriptionId, "expected parameter 'subscriptionId' to be non-null");
        this.tenantId = Objects.requireNonNull(tenantId, "expected parameter 'tenantId' to be non-null");
    }

    private SubscriptionFeatureRegistrationResponseProperties() {
        this.approvalType = null;
        this.authorizationProfile = null;
        this.description = null;
        this.displayName = null;
        this.documentationLink = null;
        this.featureName = null;
        this.metadata = Map.of();
        this.providerNamespace = null;
        this.registrationDate = null;
        this.releaseDate = null;
        this.shouldFeatureDisplayInPortal = null;
        this.state = null;
        this.subscriptionId = null;
        this.tenantId = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SubscriptionFeatureRegistrationResponseProperties defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String approvalType;
        private @Nullable AuthorizationProfileResponse authorizationProfile;
        private @Nullable String description;
        private String displayName;
        private String documentationLink;
        private String featureName;
        private @Nullable Map<String,String> metadata;
        private String providerNamespace;
        private String registrationDate;
        private String releaseDate;
        private @Nullable Boolean shouldFeatureDisplayInPortal;
        private @Nullable String state;
        private String subscriptionId;
        private String tenantId;

        public Builder() {
    	      // Empty
        }

        public Builder(SubscriptionFeatureRegistrationResponseProperties defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.approvalType = defaults.approvalType;
    	      this.authorizationProfile = defaults.authorizationProfile;
    	      this.description = defaults.description;
    	      this.displayName = defaults.displayName;
    	      this.documentationLink = defaults.documentationLink;
    	      this.featureName = defaults.featureName;
    	      this.metadata = defaults.metadata;
    	      this.providerNamespace = defaults.providerNamespace;
    	      this.registrationDate = defaults.registrationDate;
    	      this.releaseDate = defaults.releaseDate;
    	      this.shouldFeatureDisplayInPortal = defaults.shouldFeatureDisplayInPortal;
    	      this.state = defaults.state;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenantId = defaults.tenantId;
        }

        public Builder setApprovalType(String approvalType) {
            this.approvalType = Objects.requireNonNull(approvalType);
            return this;
        }

        public Builder setAuthorizationProfile(@Nullable AuthorizationProfileResponse authorizationProfile) {
            this.authorizationProfile = authorizationProfile;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setDisplayName(String displayName) {
            this.displayName = Objects.requireNonNull(displayName);
            return this;
        }

        public Builder setDocumentationLink(String documentationLink) {
            this.documentationLink = Objects.requireNonNull(documentationLink);
            return this;
        }

        public Builder setFeatureName(String featureName) {
            this.featureName = Objects.requireNonNull(featureName);
            return this;
        }

        public Builder setMetadata(@Nullable Map<String,String> metadata) {
            this.metadata = metadata;
            return this;
        }

        public Builder setProviderNamespace(String providerNamespace) {
            this.providerNamespace = Objects.requireNonNull(providerNamespace);
            return this;
        }

        public Builder setRegistrationDate(String registrationDate) {
            this.registrationDate = Objects.requireNonNull(registrationDate);
            return this;
        }

        public Builder setReleaseDate(String releaseDate) {
            this.releaseDate = Objects.requireNonNull(releaseDate);
            return this;
        }

        public Builder setShouldFeatureDisplayInPortal(@Nullable Boolean shouldFeatureDisplayInPortal) {
            this.shouldFeatureDisplayInPortal = shouldFeatureDisplayInPortal;
            return this;
        }

        public Builder setState(@Nullable String state) {
            this.state = state;
            return this;
        }

        public Builder setSubscriptionId(String subscriptionId) {
            this.subscriptionId = Objects.requireNonNull(subscriptionId);
            return this;
        }

        public Builder setTenantId(String tenantId) {
            this.tenantId = Objects.requireNonNull(tenantId);
            return this;
        }

        public SubscriptionFeatureRegistrationResponseProperties build() {
            return new SubscriptionFeatureRegistrationResponseProperties(approvalType, authorizationProfile, description, displayName, documentationLink, featureName, metadata, providerNamespace, registrationDate, releaseDate, shouldFeatureDisplayInPortal, state, subscriptionId, tenantId);
        }
    }
}
