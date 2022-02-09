// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.kubernetesconfiguration.outputs;

import io.pulumi.azurenative.kubernetesconfiguration.outputs.GitRepositoryDefinitionResponse;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.KustomizationDefinitionResponse;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.ObjectStatusDefinitionResponse;
import io.pulumi.azurenative.kubernetesconfiguration.outputs.SystemDataResponse;
import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFluxConfigurationResult {
    private final String complianceState;
    private final @Nullable Map<String,String> configurationProtectedSettings;
    private final String errorMessage;
    private final @Nullable GitRepositoryDefinitionResponse gitRepository;
    private final String id;
    private final @Nullable Map<String,KustomizationDefinitionResponse> kustomizations;
    private final String lastSourceSyncedAt;
    private final String lastSourceSyncedCommitId;
    private final String name;
    private final @Nullable String namespace;
    private final String provisioningState;
    private final String repositoryPublicKey;
    private final @Nullable String scope;
    private final @Nullable String sourceKind;
    private final List<ObjectStatusDefinitionResponse> statuses;
    private final @Nullable Boolean suspend;
    private final SystemDataResponse systemData;
    private final String type;

    @OutputCustomType.Constructor({"complianceState","configurationProtectedSettings","errorMessage","gitRepository","id","kustomizations","lastSourceSyncedAt","lastSourceSyncedCommitId","name","namespace","provisioningState","repositoryPublicKey","scope","sourceKind","statuses","suspend","systemData","type"})
    private GetFluxConfigurationResult(
        String complianceState,
        @Nullable Map<String,String> configurationProtectedSettings,
        String errorMessage,
        @Nullable GitRepositoryDefinitionResponse gitRepository,
        String id,
        @Nullable Map<String,KustomizationDefinitionResponse> kustomizations,
        String lastSourceSyncedAt,
        String lastSourceSyncedCommitId,
        String name,
        @Nullable String namespace,
        String provisioningState,
        String repositoryPublicKey,
        @Nullable String scope,
        @Nullable String sourceKind,
        List<ObjectStatusDefinitionResponse> statuses,
        @Nullable Boolean suspend,
        SystemDataResponse systemData,
        String type) {
        this.complianceState = Objects.requireNonNull(complianceState);
        this.configurationProtectedSettings = configurationProtectedSettings;
        this.errorMessage = Objects.requireNonNull(errorMessage);
        this.gitRepository = gitRepository;
        this.id = Objects.requireNonNull(id);
        this.kustomizations = kustomizations;
        this.lastSourceSyncedAt = Objects.requireNonNull(lastSourceSyncedAt);
        this.lastSourceSyncedCommitId = Objects.requireNonNull(lastSourceSyncedCommitId);
        this.name = Objects.requireNonNull(name);
        this.namespace = namespace;
        this.provisioningState = Objects.requireNonNull(provisioningState);
        this.repositoryPublicKey = Objects.requireNonNull(repositoryPublicKey);
        this.scope = scope;
        this.sourceKind = sourceKind;
        this.statuses = Objects.requireNonNull(statuses);
        this.suspend = suspend;
        this.systemData = Objects.requireNonNull(systemData);
        this.type = Objects.requireNonNull(type);
    }

    public String getComplianceState() {
        return this.complianceState;
    }
    public Map<String,String> getConfigurationProtectedSettings() {
        return this.configurationProtectedSettings == null ? Map.of() : this.configurationProtectedSettings;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }
    public Optional<GitRepositoryDefinitionResponse> getGitRepository() {
        return Optional.ofNullable(this.gitRepository);
    }
    public String getId() {
        return this.id;
    }
    public Map<String,KustomizationDefinitionResponse> getKustomizations() {
        return this.kustomizations == null ? Map.of() : this.kustomizations;
    }
    public String getLastSourceSyncedAt() {
        return this.lastSourceSyncedAt;
    }
    public String getLastSourceSyncedCommitId() {
        return this.lastSourceSyncedCommitId;
    }
    public String getName() {
        return this.name;
    }
    public Optional<String> getNamespace() {
        return Optional.ofNullable(this.namespace);
    }
    public String getProvisioningState() {
        return this.provisioningState;
    }
    public String getRepositoryPublicKey() {
        return this.repositoryPublicKey;
    }
    public Optional<String> getScope() {
        return Optional.ofNullable(this.scope);
    }
    public Optional<String> getSourceKind() {
        return Optional.ofNullable(this.sourceKind);
    }
    public List<ObjectStatusDefinitionResponse> getStatuses() {
        return this.statuses;
    }
    public Optional<Boolean> getSuspend() {
        return Optional.ofNullable(this.suspend);
    }
    public SystemDataResponse getSystemData() {
        return this.systemData;
    }
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFluxConfigurationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String complianceState;
        private @Nullable Map<String,String> configurationProtectedSettings;
        private String errorMessage;
        private @Nullable GitRepositoryDefinitionResponse gitRepository;
        private String id;
        private @Nullable Map<String,KustomizationDefinitionResponse> kustomizations;
        private String lastSourceSyncedAt;
        private String lastSourceSyncedCommitId;
        private String name;
        private @Nullable String namespace;
        private String provisioningState;
        private String repositoryPublicKey;
        private @Nullable String scope;
        private @Nullable String sourceKind;
        private List<ObjectStatusDefinitionResponse> statuses;
        private @Nullable Boolean suspend;
        private SystemDataResponse systemData;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFluxConfigurationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.complianceState = defaults.complianceState;
    	      this.configurationProtectedSettings = defaults.configurationProtectedSettings;
    	      this.errorMessage = defaults.errorMessage;
    	      this.gitRepository = defaults.gitRepository;
    	      this.id = defaults.id;
    	      this.kustomizations = defaults.kustomizations;
    	      this.lastSourceSyncedAt = defaults.lastSourceSyncedAt;
    	      this.lastSourceSyncedCommitId = defaults.lastSourceSyncedCommitId;
    	      this.name = defaults.name;
    	      this.namespace = defaults.namespace;
    	      this.provisioningState = defaults.provisioningState;
    	      this.repositoryPublicKey = defaults.repositoryPublicKey;
    	      this.scope = defaults.scope;
    	      this.sourceKind = defaults.sourceKind;
    	      this.statuses = defaults.statuses;
    	      this.suspend = defaults.suspend;
    	      this.systemData = defaults.systemData;
    	      this.type = defaults.type;
        }

        public Builder setComplianceState(String complianceState) {
            this.complianceState = Objects.requireNonNull(complianceState);
            return this;
        }

        public Builder setConfigurationProtectedSettings(@Nullable Map<String,String> configurationProtectedSettings) {
            this.configurationProtectedSettings = configurationProtectedSettings;
            return this;
        }

        public Builder setErrorMessage(String errorMessage) {
            this.errorMessage = Objects.requireNonNull(errorMessage);
            return this;
        }

        public Builder setGitRepository(@Nullable GitRepositoryDefinitionResponse gitRepository) {
            this.gitRepository = gitRepository;
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setKustomizations(@Nullable Map<String,KustomizationDefinitionResponse> kustomizations) {
            this.kustomizations = kustomizations;
            return this;
        }

        public Builder setLastSourceSyncedAt(String lastSourceSyncedAt) {
            this.lastSourceSyncedAt = Objects.requireNonNull(lastSourceSyncedAt);
            return this;
        }

        public Builder setLastSourceSyncedCommitId(String lastSourceSyncedCommitId) {
            this.lastSourceSyncedCommitId = Objects.requireNonNull(lastSourceSyncedCommitId);
            return this;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setNamespace(@Nullable String namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder setProvisioningState(String provisioningState) {
            this.provisioningState = Objects.requireNonNull(provisioningState);
            return this;
        }

        public Builder setRepositoryPublicKey(String repositoryPublicKey) {
            this.repositoryPublicKey = Objects.requireNonNull(repositoryPublicKey);
            return this;
        }

        public Builder setScope(@Nullable String scope) {
            this.scope = scope;
            return this;
        }

        public Builder setSourceKind(@Nullable String sourceKind) {
            this.sourceKind = sourceKind;
            return this;
        }

        public Builder setStatuses(List<ObjectStatusDefinitionResponse> statuses) {
            this.statuses = Objects.requireNonNull(statuses);
            return this;
        }

        public Builder setSuspend(@Nullable Boolean suspend) {
            this.suspend = suspend;
            return this;
        }

        public Builder setSystemData(SystemDataResponse systemData) {
            this.systemData = Objects.requireNonNull(systemData);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public GetFluxConfigurationResult build() {
            return new GetFluxConfigurationResult(complianceState, configurationProtectedSettings, errorMessage, gitRepository, id, kustomizations, lastSourceSyncedAt, lastSourceSyncedCommitId, name, namespace, provisioningState, repositoryPublicKey, scope, sourceKind, statuses, suspend, systemData, type);
        }
    }
}
