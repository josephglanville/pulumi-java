// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.azurenative.datafactory.outputs.AzureKeyVaultSecretReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.IntegrationRuntimeReferenceResponse;
import io.pulumi.azurenative.datafactory.outputs.ParameterSpecificationResponse;
import io.pulumi.azurenative.datafactory.outputs.SecureStringResponse;
import io.pulumi.core.Either;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class AzureDataLakeAnalyticsLinkedServiceResponse {
    private final Object accountName;
    private final @Nullable List<Object> annotations;
    private final @Nullable IntegrationRuntimeReferenceResponse connectVia;
    private final @Nullable Object dataLakeAnalyticsUri;
    private final @Nullable String description;
    private final @Nullable Object encryptedCredential;
    private final @Nullable Map<String,ParameterSpecificationResponse> parameters;
    private final @Nullable Object resourceGroupName;
    private final @Nullable Object servicePrincipalId;
    private final @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
    private final @Nullable Object subscriptionId;
    private final Object tenant;
    private final String type;

    @OutputCustomType.Constructor({"accountName","annotations","connectVia","dataLakeAnalyticsUri","description","encryptedCredential","parameters","resourceGroupName","servicePrincipalId","servicePrincipalKey","subscriptionId","tenant","type"})
    private AzureDataLakeAnalyticsLinkedServiceResponse(
        Object accountName,
        @Nullable List<Object> annotations,
        @Nullable IntegrationRuntimeReferenceResponse connectVia,
        @Nullable Object dataLakeAnalyticsUri,
        @Nullable String description,
        @Nullable Object encryptedCredential,
        @Nullable Map<String,ParameterSpecificationResponse> parameters,
        @Nullable Object resourceGroupName,
        @Nullable Object servicePrincipalId,
        @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey,
        @Nullable Object subscriptionId,
        Object tenant,
        String type) {
        this.accountName = Objects.requireNonNull(accountName);
        this.annotations = annotations;
        this.connectVia = connectVia;
        this.dataLakeAnalyticsUri = dataLakeAnalyticsUri;
        this.description = description;
        this.encryptedCredential = encryptedCredential;
        this.parameters = parameters;
        this.resourceGroupName = resourceGroupName;
        this.servicePrincipalId = servicePrincipalId;
        this.servicePrincipalKey = servicePrincipalKey;
        this.subscriptionId = subscriptionId;
        this.tenant = Objects.requireNonNull(tenant);
        this.type = Objects.requireNonNull(type);
    }

    public Object getAccountName() {
        return this.accountName;
    }
    public List<Object> getAnnotations() {
        return this.annotations == null ? List.of() : this.annotations;
    }
    public Optional<IntegrationRuntimeReferenceResponse> getConnectVia() {
        return Optional.ofNullable(this.connectVia);
    }
    public Optional<Object> getDataLakeAnalyticsUri() {
        return Optional.ofNullable(this.dataLakeAnalyticsUri);
    }
    public Optional<String> getDescription() {
        return Optional.ofNullable(this.description);
    }
    public Optional<Object> getEncryptedCredential() {
        return Optional.ofNullable(this.encryptedCredential);
    }
    public Map<String,ParameterSpecificationResponse> getParameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    public Optional<Object> getResourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }
    public Optional<Object> getServicePrincipalId() {
        return Optional.ofNullable(this.servicePrincipalId);
    }
    public Optional<Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse>> getServicePrincipalKey() {
        return Optional.ofNullable(this.servicePrincipalKey);
    }
    public Optional<Object> getSubscriptionId() {
        return Optional.ofNullable(this.subscriptionId);
    }
    public Object getTenant() {
        return this.tenant;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AzureDataLakeAnalyticsLinkedServiceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Object accountName;
        private @Nullable List<Object> annotations;
        private @Nullable IntegrationRuntimeReferenceResponse connectVia;
        private @Nullable Object dataLakeAnalyticsUri;
        private @Nullable String description;
        private @Nullable Object encryptedCredential;
        private @Nullable Map<String,ParameterSpecificationResponse> parameters;
        private @Nullable Object resourceGroupName;
        private @Nullable Object servicePrincipalId;
        private @Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey;
        private @Nullable Object subscriptionId;
        private Object tenant;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(AzureDataLakeAnalyticsLinkedServiceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountName = defaults.accountName;
    	      this.annotations = defaults.annotations;
    	      this.connectVia = defaults.connectVia;
    	      this.dataLakeAnalyticsUri = defaults.dataLakeAnalyticsUri;
    	      this.description = defaults.description;
    	      this.encryptedCredential = defaults.encryptedCredential;
    	      this.parameters = defaults.parameters;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.servicePrincipalId = defaults.servicePrincipalId;
    	      this.servicePrincipalKey = defaults.servicePrincipalKey;
    	      this.subscriptionId = defaults.subscriptionId;
    	      this.tenant = defaults.tenant;
    	      this.type = defaults.type;
        }

        public Builder setAccountName(Object accountName) {
            this.accountName = Objects.requireNonNull(accountName);
            return this;
        }

        public Builder setAnnotations(@Nullable List<Object> annotations) {
            this.annotations = annotations;
            return this;
        }

        public Builder setConnectVia(@Nullable IntegrationRuntimeReferenceResponse connectVia) {
            this.connectVia = connectVia;
            return this;
        }

        public Builder setDataLakeAnalyticsUri(@Nullable Object dataLakeAnalyticsUri) {
            this.dataLakeAnalyticsUri = dataLakeAnalyticsUri;
            return this;
        }

        public Builder setDescription(@Nullable String description) {
            this.description = description;
            return this;
        }

        public Builder setEncryptedCredential(@Nullable Object encryptedCredential) {
            this.encryptedCredential = encryptedCredential;
            return this;
        }

        public Builder setParameters(@Nullable Map<String,ParameterSpecificationResponse> parameters) {
            this.parameters = parameters;
            return this;
        }

        public Builder setResourceGroupName(@Nullable Object resourceGroupName) {
            this.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder setServicePrincipalId(@Nullable Object servicePrincipalId) {
            this.servicePrincipalId = servicePrincipalId;
            return this;
        }

        public Builder setServicePrincipalKey(@Nullable Either<AzureKeyVaultSecretReferenceResponse,SecureStringResponse> servicePrincipalKey) {
            this.servicePrincipalKey = servicePrincipalKey;
            return this;
        }

        public Builder setSubscriptionId(@Nullable Object subscriptionId) {
            this.subscriptionId = subscriptionId;
            return this;
        }

        public Builder setTenant(Object tenant) {
            this.tenant = Objects.requireNonNull(tenant);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public AzureDataLakeAnalyticsLinkedServiceResponse build() {
            return new AzureDataLakeAnalyticsLinkedServiceResponse(accountName, annotations, connectVia, dataLakeAnalyticsUri, description, encryptedCredential, parameters, resourceGroupName, servicePrincipalId, servicePrincipalKey, subscriptionId, tenant, type);
        }
    }
}
